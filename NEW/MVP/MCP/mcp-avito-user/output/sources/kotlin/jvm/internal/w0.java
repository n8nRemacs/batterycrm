package kotlin.jvm.internal;

import java.util.Collections;
import java.util.List;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;
import kotlin.reflect.KVariance;

/* compiled from: TypeParameterReference.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/jvm/internal/w0;", "Lkotlin/reflect/s;", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
/* loaded from: classes8.dex */
public final class w0 implements kotlin.reflect.s {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f406858c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public volatile List<? extends kotlin.reflect.r> f406859b;

    /* compiled from: TypeParameterReference.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/jvm/internal/w0$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: TypeParameterReference.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.jvm.internal.w0$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C11637a {
            static {
                int[] iArr = new int[KVariance.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    KVariance kVariance = KVariance.f406947b;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    KVariance kVariance2 = KVariance.f406947b;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static String a(@Y61.k kotlin.reflect.s sVar) {
            StringBuilder sb2 = new StringBuilder();
            int iOrdinal = sVar.o().ordinal();
            if (iOrdinal == 1) {
                sb2.append("in ");
            } else if (iOrdinal == 2) {
                sb2.append("out ");
            }
            sb2.append(sVar.getName());
            return sb2.toString();
        }

        public a() {
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            w0Var.getClass();
            if (L.f(null, null)) {
                w0Var.getClass();
                if (L.f(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.reflect.s
    @Y61.k
    public final String getName() {
        return null;
    }

    @Override // kotlin.reflect.s
    @Y61.k
    public final List<kotlin.reflect.r> getUpperBounds() {
        List list = this.f406859b;
        if (list != null) {
            return list;
        }
        List<kotlin.reflect.r> listSingletonList = Collections.singletonList(m0.b(Object.class));
        this.f406859b = listSingletonList;
        return listSingletonList;
    }

    public final int hashCode() {
        throw null;
    }

    @Override // kotlin.reflect.s
    @Y61.k
    public final KVariance o() {
        return null;
    }

    @Y61.k
    public final String toString() {
        f406858c.getClass();
        return a.a(this);
    }
}
