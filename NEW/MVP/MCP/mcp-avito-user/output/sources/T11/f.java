package T11;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: Logger.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT11/f;", "", "sdk-public-push-common_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface f {

    /* compiled from: Logger.kt */
    @Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class a {
    }

    void a(@k String str, @l Throwable th2);

    @k
    f b(@k String str);

    @k
    f c(@k Object obj);

    void d();

    void error(@k String str, @l Throwable th2);

    void info(@k String str);
}
