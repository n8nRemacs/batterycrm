package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C42866j;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C42873q;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.H;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.U;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.types.C42993s;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: suspendFunctionTypes.kt */
@s0
/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final H f407401a;

    static {
        kotlin.reflect.jvm.internal.impl.types.error.h.f410195a.getClass();
        C42873q c42873q = new C42873q(kotlin.reflect.jvm.internal.impl.types.error.h.f410196b, n.f407333f);
        ClassKind classKind = ClassKind.f407413b;
        kotlin.reflect.jvm.internal.impl.name.f fVarF = n.f407334g.f();
        b0 b0Var = b0.f407539a;
        kotlin.reflect.jvm.internal.impl.storage.p pVar = kotlin.reflect.jvm.internal.impl.storage.f.f409976e;
        H h12 = new H(c42873q, fVarF, b0Var, pVar);
        h12.f407562j = Modality.f407442f;
        AbstractC42900s abstractC42900s = r.f407789e;
        if (abstractC42900s == null) {
            H.U(9);
            throw null;
        }
        h12.f407563k = abstractC42900s;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
        List listSingletonList = Collections.singletonList(U.I0(h12, g.a.f407524b, Variance.f410070e, kotlin.reflect.jvm.internal.impl.name.f.e("T"), 0, (kotlin.reflect.jvm.internal.impl.storage.f) pVar));
        if (h12.f407565m != null) {
            throw new IllegalStateException("Type parameters are already set for " + h12.getName());
        }
        ArrayList arrayList = new ArrayList(listSingletonList);
        h12.f407565m = arrayList;
        h12.f407564l = new C42993s(h12, arrayList, h12.f407566n, h12.f407567o);
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            H.U(13);
            throw null;
        }
        Iterator it = setEmptySet.iterator();
        while (it.hasNext()) {
            ((C42866j) ((InterfaceC42905x) it.next())).N0(h12.q());
        }
        f407401a = h12;
    }
}
