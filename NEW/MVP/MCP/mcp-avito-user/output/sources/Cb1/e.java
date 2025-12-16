package Cb1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import ru.uxfeedback.pub.sdk.UxFbLifecycleRule;

@Target({ElementType.TYPE})
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LCb1/e;", "", "Lru/uxfeedback/pub/sdk/UxFbLifecycleRule;", "lifecycleRule", "<init>", "(Lru/uxfeedback/pub/sdk/UxFbLifecycleRule;)V", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@P41.d
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes9.dex */
public @interface e {
    UxFbLifecycleRule lifecycleRule();
}
