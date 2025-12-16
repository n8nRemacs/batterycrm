package com.avito.android.oauth.presentation.ui;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import l40.InterfaceC43542a;
import l40.c;

/* compiled from: OAuthScreen.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_oauth_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class s {

    /* compiled from: OAuthScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l40.c f208443l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC43542a, G0> f208444m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l40.c cVar, Y41.l<? super InterfaceC43542a, G0> lVar) {
            super(2);
            this.f208443l = cVar;
            this.f208444m = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                l40.c cVar = this.f208443l;
                boolean z12 = cVar instanceof c.g;
                Y41.l<InterfaceC43542a, G0> lVar = this.f208444m;
                if (z12) {
                    a13.C(-1212714412);
                    t.b((c.g) cVar, lVar, a13, 8);
                    a13.h();
                } else if (cVar instanceof c.d) {
                    a13.C(-1212712262);
                    q.a((c.d) cVar, lVar, a13, 0);
                    a13.h();
                } else if (cVar instanceof c.b) {
                    a13.C(-1212710025);
                    f.a((c.b) cVar, lVar, a13, 8);
                    a13.h();
                } else if (L.f(cVar, c.e.f413497d)) {
                    a13.C(-1212708149);
                    r.a(a13, 0);
                    a13.h();
                } else {
                    a13.C(1060779304);
                    a13.h();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: OAuthScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l40.c f208445l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC43542a, G0> f208446m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(l40.c cVar, Y41.l<? super InterfaceC43542a, G0> lVar, int i12) {
            super(2);
            this.f208445l = cVar;
            this.f208446m = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            Y41.l<InterfaceC43542a, G0> lVar = this.f208446m;
            s.a(this.f208445l, lVar, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k l40.c cVar, @Y61.k Y41.l<? super InterfaceC43542a, G0> lVar, @Y61.l A a12, int i12) {
        B bE2 = a12.E(-161709249);
        if ((((bE2.B(cVar) ? 4 : 2) | i12 | (bE2.u(lVar) ? 32 : 16)) & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(838365786, new a(cVar, lVar), bE2), bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(cVar, lVar, i12);
        }
    }
}
