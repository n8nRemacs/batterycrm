package androidx.compose.foundation.selection;

import Y41.q;
import androidx.compose.foundation.C20839s1;
import androidx.compose.foundation.InterfaceC20834q1;
import androidx.compose.foundation.InterfaceC21084v1;
import androidx.compose.runtime.A;
import androidx.compose.ui.platform.C22535v1;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Toggleable.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g {

    /* compiled from: Clickable.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/v;", "invoke", "(Landroidx/compose/ui/v;Landroidx/compose/runtime/A;I)Landroidx/compose/ui/v;", "androidx/compose/foundation/y0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements q<v, A, Integer, v> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC20834q1 f30130l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f30131m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f30132n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.semantics.i f30133o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.l f30134p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC20834q1 interfaceC20834q1, boolean z12, boolean z13, androidx.compose.ui.semantics.i iVar, Y41.l lVar) {
            super(3);
            this.f30130l = interfaceC20834q1;
            this.f30131m = z12;
            this.f30132n = z13;
            this.f30133o = iVar;
            this.f30134p = lVar;
        }

        @Override // Y41.q
        public final v invoke(v vVar, A a12, Integer num) {
            A a13 = a12;
            num.intValue();
            a13.C(-1525724089);
            Object objT = a13.t();
            A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = androidx.compose.foundation.interaction.l.a();
                a13.H(objT);
            }
            androidx.compose.foundation.interaction.m mVar = (androidx.compose.foundation.interaction.m) objT;
            v vVarD0 = C20839s1.a(v.f42878y1, mVar, this.f30130l).d0(new ToggleableElement(this.f30131m, mVar, null, this.f30132n, this.f30133o, this.f30134p, null));
            a13.h();
            return vVarD0;
        }
    }

    /* compiled from: Clickable.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/v;", "invoke", "(Landroidx/compose/ui/v;Landroidx/compose/runtime/A;I)Landroidx/compose/ui/v;", "androidx/compose/foundation/y0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements q<v, A, Integer, v> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC20834q1 f30135l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ToggleableState f30136m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f30137n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.semantics.i f30138o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.a f30139p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC20834q1 interfaceC20834q1, ToggleableState toggleableState, boolean z12, androidx.compose.ui.semantics.i iVar, Y41.a aVar) {
            super(3);
            this.f30135l = interfaceC20834q1;
            this.f30136m = toggleableState;
            this.f30137n = z12;
            this.f30138o = iVar;
            this.f30139p = aVar;
        }

        @Override // Y41.q
        public final v invoke(v vVar, A a12, Integer num) {
            A a13 = a12;
            num.intValue();
            a13.C(-1525724089);
            Object objT = a13.t();
            A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = androidx.compose.foundation.interaction.l.a();
                a13.H(objT);
            }
            androidx.compose.foundation.interaction.m mVar = (androidx.compose.foundation.interaction.m) objT;
            v vVarD0 = C20839s1.a(v.f42878y1, mVar, this.f30135l).d0(new TriStateToggleableElement(this.f30136m, mVar, null, this.f30137n, this.f30138o, this.f30139p, null));
            a13.h();
            return vVarD0;
        }
    }

    @Y61.k
    public static final v a(@Y61.k v vVar, boolean z12, @Y61.l androidx.compose.foundation.interaction.m mVar, @Y61.l InterfaceC20834q1 interfaceC20834q1, boolean z13, @Y61.l androidx.compose.ui.semantics.i iVar, @Y61.k Y41.l<? super Boolean, G0> lVar) {
        v vVarA;
        if (interfaceC20834q1 instanceof InterfaceC21084v1) {
            vVarA = new ToggleableElement(z12, mVar, (InterfaceC21084v1) interfaceC20834q1, z13, iVar, lVar, null);
        } else if (interfaceC20834q1 == null) {
            vVarA = new ToggleableElement(z12, mVar, null, z13, iVar, lVar, null);
        } else if (mVar != null) {
            vVarA = C20839s1.a(v.f42878y1, mVar, interfaceC20834q1).d0(new ToggleableElement(z12, mVar, null, z13, iVar, lVar, null));
        } else {
            vVarA = androidx.compose.ui.n.a(v.f42878y1, C22535v1.f41625a, new a(interfaceC20834q1, z12, z13, iVar, lVar));
        }
        return vVar.d0(vVarA);
    }

    public static v b(v.a aVar, boolean z12, boolean z13, Y41.l lVar) {
        return androidx.compose.ui.n.a(aVar, C22535v1.f41625a, new f(z12, z13, lVar));
    }

    @Y61.k
    public static final v c(@Y61.k v vVar, @Y61.k ToggleableState toggleableState, @Y61.l androidx.compose.foundation.interaction.m mVar, @Y61.l InterfaceC20834q1 interfaceC20834q1, boolean z12, @Y61.l androidx.compose.ui.semantics.i iVar, @Y61.k Y41.a<G0> aVar) {
        v vVarA;
        if (interfaceC20834q1 instanceof InterfaceC21084v1) {
            vVarA = new TriStateToggleableElement(toggleableState, mVar, (InterfaceC21084v1) interfaceC20834q1, z12, iVar, aVar, null);
        } else if (interfaceC20834q1 == null) {
            vVarA = new TriStateToggleableElement(toggleableState, mVar, null, z12, iVar, aVar, null);
        } else if (mVar != null) {
            vVarA = C20839s1.a(v.f42878y1, mVar, interfaceC20834q1).d0(new TriStateToggleableElement(toggleableState, mVar, null, z12, iVar, aVar, null));
        } else {
            vVarA = androidx.compose.ui.n.a(v.f42878y1, C22535v1.f41625a, new b(interfaceC20834q1, toggleableState, z12, iVar, aVar));
        }
        return vVar.d0(vVarA);
    }
}
