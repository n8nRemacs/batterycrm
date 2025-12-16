package com.akita.compose.theme.re23.preview;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22061e3;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.theme.re23.preview.AbstractC27462u0;
import java.util.Collections;
import kotlin.Metadata;

/* compiled from: TimeLinePreview.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"re23_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class I3 {

    /* compiled from: TimeLinePreview.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.time_line.j> f65357l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AbstractC27462u0.c f65358m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.time_line.g f65359n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.Q q12, AbstractC27462u0.c cVar, com.akita.compose.component.time_line.g gVar) {
            super(3);
            this.f65357l = q12;
            this.f65358m = cVar;
            this.f65359n = gVar;
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.J j12, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.component.time_line.g gVarA = com.akita.compose.component.time_line.i.a(0, 1, a13);
                kotlin.Q<String, com.akita.compose.component.time_line.j> q12 = this.f65357l;
                com.akita.compose.component.time_line.j jVar = q12.f406620c;
                v.a aVar = androidx.compose.ui.v.f42878y1;
                androidx.compose.ui.v vVarD = C20588k2.d(aVar, 1.0f);
                E3 e32 = E3.f65317l;
                int i12 = com.akita.compose.component.time_line.g.f63120g | 24624;
                com.akita.compose.component.time_line.b.a(gVarA, vVarD, jVar, e32, a13, i12);
                float f12 = 16;
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.foundation.ui.g.a(f12, null, a13, 6);
                com.akita.compose.component.time_line.g gVarA2 = com.akita.compose.component.time_line.i.a(6, 0, a13);
                com.akita.compose.component.time_line.j jVar2 = q12.f406620c;
                com.akita.compose.component.time_line.b.a(gVarA2, C20588k2.d(aVar, 1.0f), jVar2, F3.f65331l, a13, i12);
                com.akita.compose.foundation.ui.g.a(f12, null, a13, 6);
                AbstractC27462u0.c cVar = this.f65358m;
                Integer numValueOf = Integer.valueOf(((C22061e3) cVar.f65868e).e());
                com.akita.compose.component.time_line.g gVar = this.f65359n;
                C22187u0.d(new G3(gVar, cVar, null), a13, numValueOf);
                androidx.compose.ui.v vVarD2 = C20588k2.d(aVar, 1.0f);
                a13.C(1347542658);
                Object objT = a13.t();
                androidx.compose.runtime.A.f37866a.getClass();
                if (objT == A.a.f37868b) {
                    objT = new H3(1);
                    a13.H(objT);
                }
                a13.h();
                com.akita.compose.component.time_line.b.a(gVar, vVarD2, jVar2, (Y41.l) objT, a13, i12);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TimeLinePreview.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.time_line.j> f65360l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f65361m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12, kotlin.Q q12) {
            super(2);
            this.f65360l = q12;
            this.f65361m = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f65361m | 1);
            I3.a(this.f65360l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k kotlin.Q<String, com.akita.compose.component.time_line.j> q12, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(1421868092);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(q12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            com.akita.compose.component.time_line.g gVarA = com.akita.compose.component.time_line.i.a(0, 1, bE2);
            int iE2 = ((C22061e3) gVarA.f63123b).e();
            androidx.compose.runtime.J3 j32 = C27452s0.f65829a;
            bE2.C(-1395991300);
            bE2.C(46006076);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = new AbstractC27462u0.c("currentItemIndex", iE2, 1, 0, 9);
                bE2.H(objT);
            }
            AbstractC27462u0.c cVar = (AbstractC27462u0.c) objT;
            bE2.X(false);
            bE2.X(false);
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            C27452s0.a(q12.f406619b, null, null, 0, Collections.singleton(cVar), androidx.compose.runtime.internal.r.c(340816422, new a(q12, cVar, gVarA), bE2), bE2, 199680, 6);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(i12, q12);
        }
    }
}
