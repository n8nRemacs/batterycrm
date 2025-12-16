package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C42938a;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C42939b;
import kotlin.reflect.jvm.internal.impl.resolve.constants.x;

/* compiled from: annotationUtil.kt */
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.f f407517a = kotlin.reflect.jvm.internal.impl.name.f.e("message");

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.f f407518b = kotlin.reflect.jvm.internal.impl.name.f.e("replaceWith");

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.f f407519c = kotlin.reflect.jvm.internal.impl.name.f.e("level");

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.f f407520d = kotlin.reflect.jvm.internal.impl.name.f.e("expression");

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.f f407521e = kotlin.reflect.jvm.internal.impl.name.f.e("imports");

    @Y61.k
    public static final k a(@Y61.k kotlin.reflect.jvm.internal.impl.builtins.k kVar, @Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        k kVar2 = new k(kVar, n.a.f407390p, P0.g(new Q(f407520d, new x(str2)), new Q(f407521e, new C42939b(new e(kVar), C42784z0.f406748b))), false, 8, null);
        return new k(kVar, n.a.f407388n, P0.g(new Q(f407517a, new x(str)), new Q(f407518b, new C42938a(kVar2)), new Q(f407519c, new kotlin.reflect.jvm.internal.impl.resolve.constants.k(kotlin.reflect.jvm.internal.impl.name.b.j(n.a.f407389o), kotlin.reflect.jvm.internal.impl.name.f.e(str3)))));
    }
}
