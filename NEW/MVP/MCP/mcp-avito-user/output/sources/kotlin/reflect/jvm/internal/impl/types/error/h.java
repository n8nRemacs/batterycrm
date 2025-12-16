package kotlin.reflect.jvm.internal.impl.types.error;

import X41.n;
import Y61.k;
import Y61.l;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.collections.C42784z0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.U;
import kotlin.reflect.jvm.internal.impl.types.q0;

/* compiled from: ErrorUtils.kt */
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final h f410195a = new h();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final c f410196b = c.f410178b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f410197c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final f f410198d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final f f410199e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final Set<U> f410200f;

    static {
        ErrorEntity[] errorEntityArr = ErrorEntity.f410134b;
        f410197c = new a(kotlin.reflect.jvm.internal.impl.name.f.h(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1))));
        f410198d = b(ErrorTypeKind.f410157i, new String[0]);
        f410199e = b(ErrorTypeKind.f410170v, new String[0]);
        f410200f = Collections.singleton(new d());
    }

    @n
    @k
    public static final e a(@k ErrorScopeKind errorScopeKind, boolean z12, @k String... strArr) {
        if (!z12) {
            return new e(errorScopeKind, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        return new i(errorScopeKind, (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    @n
    @k
    public static final f b(@k ErrorTypeKind errorTypeKind, @k String... strArr) {
        C42784z0 c42784z0 = C42784z0.f406748b;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        f410195a.getClass();
        return d(errorTypeKind, c42784z0, c(errorTypeKind, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    @k
    public static g c(@k ErrorTypeKind errorTypeKind, @k String... strArr) {
        return new g(errorTypeKind, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @k
    public static f d(@k ErrorTypeKind errorTypeKind, @k List list, @k q0 q0Var, @k String... strArr) {
        return new f(q0Var, a(ErrorScopeKind.f410139f, false, (String[]) Arrays.copyOf(new String[]{q0Var.toString()}, 1)), errorTypeKind, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @n
    public static final boolean e(@l InterfaceC42882k interfaceC42882k) {
        if (interfaceC42882k != null) {
            f410195a.getClass();
            if ((interfaceC42882k instanceof a) || (interfaceC42882k.f() instanceof a) || interfaceC42882k == f410196b) {
                return true;
            }
        }
        return false;
    }
}
