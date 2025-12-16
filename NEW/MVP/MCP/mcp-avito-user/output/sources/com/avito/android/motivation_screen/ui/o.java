package com.avito.android.motivation_screen.ui;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import okhttp3.internal.http2.Http2;

/* compiled from: MotivationErrorScreen.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_gig_motivation-screen_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class o {

    /* compiled from: MotivationErrorScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f206439l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f206440m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ N f206441n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f206442o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f206443p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a aVar, Y41.a aVar2, String str, String str2, String str3) {
            super(2);
            this.f206439l = (N) aVar;
            this.f206440m = str;
            this.f206441n = (N) aVar2;
            this.f206442o = str2;
            this.f206443p = str3;
        }

        /* JADX WARN: Type inference failed for: r13v5, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r13v7, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                v.a aVar = androidx.compose.ui.v.f42878y1;
                FillElement fillElement = C20588k2.f28682c;
                aVar.getClass();
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.component.scaffold.g.a(C22501m2.a(androidx.compose.foundation.A.b(fillElement, com.akita.compose.theme.re23.b.f63984b.f63851H1.c(a13), Y0.f39346a), "MotivationScreenError"), androidx.compose.runtime.internal.r.c(172855266, new l(this.f206439l), a13), androidx.compose.runtime.internal.r.c(1322687553, new m(this.f206440m, this.f206441n), a13), null, null, null, null, androidx.compose.runtime.internal.r.c(1695695481, new n(this.f206442o, this.f206443p), a13), a13, 12583344, 120);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MotivationErrorScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f206444l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f206445m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f206446n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ N f206447o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ N f206448p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f206449q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, String str2, String str3, Y41.a<G0> aVar, Y41.a<G0> aVar2, int i12) {
            super(2);
            this.f206444l = str;
            this.f206445m = str2;
            this.f206446n = str3;
            this.f206447o = (N) aVar;
            this.f206448p = (N) aVar2;
            this.f206449q = i12;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r4v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f206449q | 1);
            ?? r32 = this.f206447o;
            ?? r42 = this.f206448p;
            String str = this.f206445m;
            String str2 = this.f206446n;
            o.a(this.f206444l, str, str2, r32, r42, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(344303713);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(str2) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(str3) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.u(aVar) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i13 |= bE2.u(aVar2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i13 & 46811) == 9362 && bE2.c()) {
            bE2.f();
        } else {
            com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(-382061786, new a(aVar2, aVar, str3, str, str2), bE2), bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(str, str2, str3, aVar, aVar2, i12);
        }
    }
}
