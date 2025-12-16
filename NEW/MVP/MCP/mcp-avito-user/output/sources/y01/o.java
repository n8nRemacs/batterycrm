package y01;

import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.AAIDResult;
import com.huawei.hms.common.ApiException;
import java.util.concurrent.Callable;

/* compiled from: AAIDCallable.java */
/* loaded from: classes7.dex */
public class o implements Callable<AAIDResult> {
    @Override // java.util.concurrent.Callable
    public final AAIDResult call() throws ApiException {
        throw ErrorEnum.ERROR_ARGUMENTS_INVALID.b();
    }
}
