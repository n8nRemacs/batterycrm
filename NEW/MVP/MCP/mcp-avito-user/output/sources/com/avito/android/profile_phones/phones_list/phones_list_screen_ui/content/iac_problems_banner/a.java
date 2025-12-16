package com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.iac_problems_banner;

import Y41.p;
import Y61.l;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.v;
import com.akita.compose.component.banner.g;
import com.akita.compose.component.banner.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: IacProblemsBanner.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_profile-phones_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: IacProblemsBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.iac_problems_banner.a$a, reason: collision with other inner class name */
    public static final class C6938a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C6938a f228231l = new C6938a();

        public C6938a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: IacProblemsBanner.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f228232l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a<G0> aVar) {
            super(2);
            this.f228232l = aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x015b  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.runtime.A r44, java.lang.Integer r45) {
            /*
                Method dump skipped, instructions count: 432
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.iac_problems_banner.a.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: IacProblemsBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ v f228233l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f228234m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f228235n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i12, int i13, Y41.a aVar, v vVar) {
            super(2);
            this.f228233l = vVar;
            this.f228234m = aVar;
            this.f228235n = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(7);
            Y41.a<G0> aVar = this.f228234m;
            a.a(iA2, this.f228235n, aVar, a12, this.f228233l);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(int i12, int i13, @l Y41.a aVar, @l A a12, @l v vVar) {
        Y41.a aVar2;
        int i14;
        Y41.a aVar3;
        B bE2 = a12.E(1961293857);
        int i15 = i13 & 2;
        if (i15 != 0) {
            i14 = i12 | 48;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i14 = (bE2.u(aVar2) ? 32 : 16) | i12;
        }
        if ((i14 & 91) == 18 && bE2.c()) {
            bE2.f();
            aVar3 = aVar2;
        } else {
            aVar3 = i15 != 0 ? C6938a.f228231l : aVar2;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            g.c(com.akita.compose.theme.re23.b.b(bE2).getF66896f(), vVar, null, null, null, 0.0f, null, r.c(-2140630815, new b(aVar3), bE2), bE2, h.f60462o | 12582960, 124);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(i12, i13, aVar3, vVar);
        }
    }
}
