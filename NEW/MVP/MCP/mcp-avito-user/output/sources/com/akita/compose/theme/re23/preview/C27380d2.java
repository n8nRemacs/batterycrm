package com.akita.compose.theme.re23.preview;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20620t;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;

/* compiled from: GradientRadialPreviewImpl.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"re23_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.akita.compose.theme.re23.preview.d2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27380d2 {

    /* compiled from: GradientRadialPreviewImpl.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.akita.compose.theme.re23.preview.d2$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.gradient.radial.c> f65642l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.Q<String, com.akita.compose.component.gradient.radial.c> q12) {
            super(3);
            this.f65642l = q12;
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.J j12, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                androidx.compose.ui.v vVarA = C20620t.a(C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f), 2.0f, false);
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                C20632w.a(com.akita.compose.component.gradient.radial.b.a(androidx.compose.ui.draw.k.a(vVarA, androidx.compose.foundation.shape.o.a(16)), this.f65642l.f406620c, a13, 0), a13, 0);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: GradientRadialPreviewImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.akita.compose.theme.re23.preview.d2$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.gradient.radial.c> f65643l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f65644m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12, kotlin.Q q12) {
            super(2);
            this.f65643l = q12;
            this.f65644m = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f65644m | 1);
            C27380d2.a(this.f65643l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k kotlin.Q<String, com.akita.compose.component.gradient.radial.c> q12, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(1543758232);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(q12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            C27452s0.a(q12.f406619b, null, null, 0.0f, null, androidx.compose.runtime.internal.r.c(1498366850, new a(q12), bE2), bE2, 196608, 30);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(i12, q12);
        }
    }
}
