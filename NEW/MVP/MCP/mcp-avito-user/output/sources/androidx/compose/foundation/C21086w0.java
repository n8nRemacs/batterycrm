package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.runtime.A;
import androidx.compose.ui.input.key.b;
import androidx.compose.ui.platform.C22535v1;
import kotlin.Metadata;

/* compiled from: Clickable.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21086w0 {

    /* compiled from: Clickable.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/v;", "invoke", "(Landroidx/compose/ui/v;Landroidx/compose/runtime/A;I)Landroidx/compose/ui/v;", "androidx/compose/foundation/y0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.w0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.ui.v, androidx.compose.runtime.A, Integer, androidx.compose.ui.v> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC20834q1 f32291l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f32292m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f32293n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.semantics.i f32294o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.a f32295p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC20834q1 interfaceC20834q1, boolean z12, String str, androidx.compose.ui.semantics.i iVar, Y41.a aVar) {
            super(3);
            this.f32291l = interfaceC20834q1;
            this.f32292m = z12;
            this.f32293n = str;
            this.f32294o = iVar;
            this.f32295p = aVar;
        }

        @Override // Y41.q
        public final androidx.compose.ui.v invoke(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            num.intValue();
            a13.C(-1525724089);
            Object objT = a13.t();
            androidx.compose.runtime.A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = androidx.compose.foundation.interaction.l.a();
                a13.H(objT);
            }
            androidx.compose.foundation.interaction.m mVar = (androidx.compose.foundation.interaction.m) objT;
            androidx.compose.ui.v vVarD0 = C20839s1.a(androidx.compose.ui.v.f42878y1, mVar, this.f32291l).d0(new ClickableElement(mVar, null, this.f32292m, this.f32293n, this.f32294o, this.f32295p, null));
            a13.h();
            return vVarD0;
        }
    }

    @Y61.k
    public static final androidx.compose.ui.v a(@Y61.k androidx.compose.ui.v vVar, @Y61.l androidx.compose.foundation.interaction.m mVar, @Y61.l InterfaceC20834q1 interfaceC20834q1, boolean z12, @Y61.l String str, @Y61.l androidx.compose.ui.semantics.i iVar, @Y61.k Y41.a<kotlin.G0> aVar) {
        androidx.compose.ui.v vVarA;
        if (interfaceC20834q1 instanceof InterfaceC21084v1) {
            vVarA = new ClickableElement(mVar, (InterfaceC21084v1) interfaceC20834q1, z12, str, iVar, aVar, null);
        } else if (interfaceC20834q1 == null) {
            vVarA = new ClickableElement(mVar, null, z12, str, iVar, aVar, null);
        } else if (mVar != null) {
            vVarA = C20839s1.a(androidx.compose.ui.v.f42878y1, mVar, interfaceC20834q1).d0(new ClickableElement(mVar, null, z12, str, iVar, aVar, null));
        } else {
            vVarA = androidx.compose.ui.n.a(androidx.compose.ui.v.f42878y1, C22535v1.f41625a, new a(interfaceC20834q1, z12, str, iVar, aVar));
        }
        return vVar.d0(vVarA);
    }

    public static /* synthetic */ androidx.compose.ui.v b(androidx.compose.ui.v vVar, androidx.compose.foundation.interaction.m mVar, InterfaceC20834q1 interfaceC20834q1, boolean z12, androidx.compose.ui.semantics.i iVar, Y41.a aVar, int i12) {
        if ((i12 & 4) != 0) {
            z12 = true;
        }
        boolean z13 = z12;
        if ((i12 & 16) != 0) {
            iVar = null;
        }
        return a(vVar, mVar, interfaceC20834q1, z13, null, iVar, aVar);
    }

    public static androidx.compose.ui.v c(androidx.compose.ui.v vVar, boolean z12, String str, androidx.compose.ui.semantics.i iVar, Y41.a aVar, int i12) {
        if ((i12 & 1) != 0) {
            z12 = true;
        }
        if ((i12 & 2) != 0) {
            str = null;
        }
        if ((i12 & 4) != 0) {
            iVar = null;
        }
        return androidx.compose.ui.n.a(vVar, C22535v1.f41625a, new C21083v0(z12, str, iVar, aVar));
    }

    @Y61.k
    public static final androidx.compose.ui.v d(@Y61.k androidx.compose.ui.v vVar, @Y61.l androidx.compose.foundation.interaction.m mVar, @Y61.l InterfaceC20834q1 interfaceC20834q1, boolean z12, @Y61.l Y41.a aVar, @Y61.k Y41.a aVar2) {
        androidx.compose.ui.v vVarA;
        if (interfaceC20834q1 instanceof InterfaceC21084v1) {
            vVarA = new CombinedClickableElement(mVar, (InterfaceC21084v1) interfaceC20834q1, z12, null, null, aVar2, null, aVar, null, true, null);
        } else if (interfaceC20834q1 == null) {
            vVarA = new CombinedClickableElement(mVar, null, z12, null, null, aVar2, null, aVar, null, true, null);
        } else if (mVar != null) {
            vVarA = C20839s1.a(androidx.compose.ui.v.f42878y1, mVar, interfaceC20834q1).d0(new CombinedClickableElement(mVar, null, z12, null, null, aVar2, null, aVar, null, true, null));
        } else {
            vVarA = androidx.compose.ui.n.a(androidx.compose.ui.v.f42878y1, C22535v1.f41625a, new C0(interfaceC20834q1, z12, aVar2, aVar));
        }
        return vVar.d0(vVarA);
    }

    public static /* synthetic */ androidx.compose.ui.v e(androidx.compose.ui.v vVar, androidx.compose.foundation.interaction.m mVar, InterfaceC20834q1 interfaceC20834q1, Y41.a aVar, Y41.a aVar2, int i12) {
        if ((i12 & 64) != 0) {
            aVar = null;
        }
        return d(vVar, mVar, interfaceC20834q1, true, aVar, aVar2);
    }

    public static androidx.compose.ui.v f(androidx.compose.ui.v vVar, Y41.a aVar, Y41.a aVar2) {
        return androidx.compose.ui.n.a(vVar, C22535v1.f41625a, new C21095z0(aVar, aVar2));
    }

    public static final boolean g(KeyEvent keyEvent) {
        boolean zA2;
        boolean zA3;
        long jA2 = androidx.compose.ui.input.key.e.a(keyEvent);
        b.a aVar = androidx.compose.ui.input.key.b.f40052b;
        aVar.getClass();
        if (androidx.compose.ui.input.key.b.a(jA2, androidx.compose.ui.input.key.b.f40058h)) {
            zA2 = true;
        } else {
            aVar.getClass();
            zA2 = androidx.compose.ui.input.key.b.a(jA2, androidx.compose.ui.input.key.b.f40061k);
        }
        if (zA2) {
            zA3 = true;
        } else {
            aVar.getClass();
            zA3 = androidx.compose.ui.input.key.b.a(jA2, androidx.compose.ui.input.key.b.f40066p);
        }
        if (zA3) {
            return true;
        }
        aVar.getClass();
        return androidx.compose.ui.input.key.b.a(jA2, androidx.compose.ui.input.key.b.f40060j);
    }
}
