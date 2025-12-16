package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Collections;
import java.util.List;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.X;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42858b;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.P;

/* compiled from: CloneableClassScope.kt */
/* loaded from: classes8.dex */
public final class a extends kotlin.reflect.jvm.internal.impl.resolve.scopes.g {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final C11650a f407234e = new C11650a(null);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.f f407235f = kotlin.reflect.jvm.internal.impl.name.f.e("clone");

    /* compiled from: CloneableClassScope.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.a$a, reason: collision with other inner class name */
    public static final class C11650a {
        public /* synthetic */ C11650a(C42822w c42822w) {
            this();
        }

        public C11650a() {
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.g
    @Y61.k
    public final List<InterfaceC42905x> h() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
        g.a.C11652a c11652a = g.a.f407524b;
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.f407408b;
        b0 b0Var = b0.f407539a;
        kotlin.reflect.jvm.internal.impl.name.f fVar = f407235f;
        AbstractC42858b abstractC42858b = this.f409678b;
        P pP02 = P.P0(abstractC42858b, c11652a, fVar, kind, b0Var);
        X xP02 = abstractC42858b.p0();
        C42784z0 c42784z0 = C42784z0.f406748b;
        pP02.I0(null, xP02, c42784z0, c42784z0, c42784z0, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.e(abstractC42858b).e(), Modality.f407441e, kotlin.reflect.jvm.internal.impl.descriptors.r.f407787c);
        return Collections.singletonList(pP02);
    }
}
