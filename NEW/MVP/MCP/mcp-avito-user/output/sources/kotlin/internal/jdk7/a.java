package kotlin.internal.jdk7;

import X41.f;
import Y61.k;
import kotlin.Metadata;
import kotlin.internal.l;
import kotlin.jvm.internal.s0;

/* compiled from: JDK7PlatformImplementations.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkotlin/internal/jdk7/a;", "Lkotlin/internal/l;", "<init>", "()V", "a", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class a extends l {

    /* compiled from: JDK7PlatformImplementations.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/internal/jdk7/a$a;", "", "<init>", "()V", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.internal.jdk7.a$a, reason: collision with other inner class name */
    public static final class C11634a {

        /* renamed from: a, reason: collision with root package name */
        @f
        @Y61.l
        public static final Integer f406760a;

        static {
            Object obj;
            new C11634a();
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            f406760a = num;
        }
    }

    @Override // kotlin.internal.l
    public final void a(@k Throwable th2, @k Throwable th3) {
        Integer num = C11634a.f406760a;
        if (num == null || num.intValue() >= 19) {
            th2.addSuppressed(th3);
        } else {
            super.a(th2, th3);
        }
    }
}
