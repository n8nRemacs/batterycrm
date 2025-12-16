package ec1;

import E31.d;
import Y61.k;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import org.koin.java.c;
import sc1.o;

@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lec1/a;", "", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ec1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C40088a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final Object f395252a;

    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ec1.a$a, reason: collision with other inner class name */
    public static final class C11092a extends N implements Y41.a<d> {

        /* renamed from: l, reason: collision with root package name */
        public static final C11092a f395253l = new C11092a();

        public C11092a() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [E31.d, java.lang.Object] */
        @Override // Y41.a
        @k
        public final d invoke() {
            if (o.a()) {
                throw new IllegalStateException("Используйте SID.Initializer.initialize(application: Application, clientId: String) для инициализации библиотеки, прежде чем использовать методы.");
            }
            return c.a(d.class);
        }
    }

    static {
        new C40088a();
        f395252a = C42727D.b(LazyThreadSafetyMode.f406614b, C11092a.f395253l);
    }
}
