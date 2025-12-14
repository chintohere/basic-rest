package chintoju.play.basic_rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("/add")
    public Result add(@RequestParam("numbers") List<Integer> numbers) {
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        return new Result(sum);
    }

}

record Result(int result) {
}
