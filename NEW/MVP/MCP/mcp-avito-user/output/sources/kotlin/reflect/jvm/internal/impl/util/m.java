package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.util.f;

/* compiled from: modifierChecks.kt */
@s0
/* loaded from: classes8.dex */
final class m implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final m f410296a = new m();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f410297b = "should not have varargs or parameters with default values";

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    public final boolean a(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar) {
        List<k0> listG = eVar.g();
        if ((listG instanceof Collection) && listG.isEmpty()) {
            return true;
        }
        for (k0 k0Var : listG) {
            if (kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.a(k0Var) || k0Var.S() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @Y61.l
    public final String b(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar) {
        return f.a.a(this, eVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @Y61.k
    public final String getDescription() {
        return f410297b;
    }
}
