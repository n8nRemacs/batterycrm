package androidx.window.core;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SpecificationComputer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/window/core/n;", "", "T", "<init>", "()V", "a", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class n<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f55195a = new a(null);

    /* compiled from: SpecificationComputer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/window/core/n$a;", "", "<init>", "()V", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static n a(a aVar, Object obj, String str, VerificationMode verificationMode) {
            b bVar = b.f55177a;
            aVar.getClass();
            return new o(obj, str, verificationMode, bVar);
        }

        public a() {
        }
    }

    @Y61.l
    public abstract T a();

    @Y61.k
    public abstract n<T> b(@Y61.k String str, @Y61.k Y41.l<? super T, Boolean> lVar);
}
