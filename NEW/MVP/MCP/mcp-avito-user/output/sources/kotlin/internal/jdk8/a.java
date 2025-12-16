package kotlin.internal.jdk8;

import X41.f;
import Y61.k;
import Y61.l;
import d51.C39509a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.random.b;

/* compiled from: JDK8PlatformImplementations.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkotlin/internal/jdk8/a;", "Lkotlin/internal/jdk7/a;", "<init>", "()V", "a", "kotlin-stdlib-jdk8"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class a extends kotlin.internal.jdk7.a {

    /* compiled from: JDK8PlatformImplementations.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/internal/jdk8/a$a;", "", "<init>", "()V", "kotlin-stdlib-jdk8"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.internal.jdk8.a$a, reason: collision with other inner class name */
    public static final class C11635a {

        /* renamed from: a, reason: collision with root package name */
        @f
        @l
        public static final Integer f406761a;

        static {
            Object obj;
            new C11635a();
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            f406761a = num;
        }
    }

    @k
    public final kotlin.random.f b() {
        Integer num = C11635a.f406761a;
        return (num == null || num.intValue() >= 34) ? new C39509a() : new b();
    }
}
