package com.avito.android.auto_contacts.presentation.ui;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesUiState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ze.InterfaceC50551a;

/* compiled from: AutoContactsPackagesStateScreen.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_auto-contacts_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h {

    /* compiled from: AutoContactsPackagesStateScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC50551a, G0> f94982l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AutoContactsPackagesUiState f94983m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super InterfaceC50551a, G0> lVar, AutoContactsPackagesUiState autoContactsPackagesUiState) {
            super(2);
            this.f94982l = lVar;
            this.f94983m = autoContactsPackagesUiState;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                Y41.l<InterfaceC50551a, G0> lVar = this.f94982l;
                C22096n c22096nC = androidx.compose.runtime.internal.r.c(-1385325208, new com.avito.android.auto_contacts.presentation.ui.b(lVar), a13);
                AutoContactsPackagesUiState autoContactsPackagesUiState = this.f94983m;
                com.akita.compose.component.scaffold.g.a(null, c22096nC, null, null, null, null, androidx.compose.runtime.internal.r.c(-1080931901, new d(lVar, autoContactsPackagesUiState), a13), androidx.compose.runtime.internal.r.c(1061097599, new g(lVar, autoContactsPackagesUiState), a13), a13, 14155824, 61);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AutoContactsPackagesStateScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AutoContactsPackagesUiState f94984l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC50551a, G0> f94985m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(AutoContactsPackagesUiState autoContactsPackagesUiState, Y41.l<? super InterfaceC50551a, G0> lVar, int i12) {
            super(2);
            this.f94984l = autoContactsPackagesUiState;
            this.f94985m = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            Y41.l<InterfaceC50551a, G0> lVar = this.f94985m;
            h.a(this.f94984l, lVar, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k AutoContactsPackagesUiState autoContactsPackagesUiState, @Y61.k Y41.l<? super InterfaceC50551a, G0> lVar, @Y61.l A a12, int i12) {
        B bE2 = a12.E(2008785511);
        if ((((bE2.B(autoContactsPackagesUiState) ? 4 : 2) | i12 | (bE2.u(lVar) ? 32 : 16)) & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(-1701253460, new a(lVar, autoContactsPackagesUiState), bE2), bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(autoContactsPackagesUiState, lVar, i12);
        }
    }
}
