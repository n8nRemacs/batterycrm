package com.avito.android.auto_contacts.presentation.ui;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.foundation.lazy.C20650b;
import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.auto_contacts.domain.models.AutoContactsPackage;
import com.avito.android.auto_contacts.domain.models.AutoContactsPackagesState;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ContactPackagesScreen.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_auto-contacts_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class r {

    /* compiled from: ContactPackagesScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<m0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AutoContactsPackagesState f94997l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AutoContactsPackagesState autoContactsPackagesState) {
            super(1);
            this.f94997l = autoContactsPackagesState;
        }

        @Override // Y41.l
        public final G0 invoke(m0 m0Var) {
            m0 m0Var2 = m0Var;
            AutoContactsPackagesState autoContactsPackagesState = this.f94997l;
            m0Var2.c(null, null, new C22096n(-2061590930, new l(autoContactsPackagesState), true));
            if (autoContactsPackagesState.f94881c != null) {
                m0Var2.c(null, null, new C22096n(-174459597, new m(autoContactsPackagesState), true));
            }
            n nVar = n.f94993l;
            List<AutoContactsPackage> list = autoContactsPackagesState.f94882d;
            m0Var2.a(list.size(), null, new p(nVar, list), new C22096n(-632812321, new q(list), true));
            return G0.f406611a;
        }
    }

    /* compiled from: ContactPackagesScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ T1 f94998l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AutoContactsPackagesState f94999m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f95000n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(T1 t12, AutoContactsPackagesState autoContactsPackagesState, int i12) {
            super(2);
            this.f94998l = t12;
            this.f94999m = autoContactsPackagesState;
            this.f95000n = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f95000n | 1);
            r.a(this.f94998l, this.f94999m, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k T1 t12, @Y61.k AutoContactsPackagesState autoContactsPackagesState, @Y61.l A a12, int i12) {
        B bE2 = a12.E(1707517027);
        v.a aVar = v.f42878y1;
        FillElement fillElement = C20588k2.f28682c;
        aVar.getClass();
        C20650b.a(R1.k(u0.f.a(bE2, R.dimen.auto_contacts_package_horizontal_padding), 0.0f, 2, fillElement), null, t12, false, null, null, null, false, null, new a(autoContactsPackagesState), bE2, (i12 << 6) & 896, 506);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(t12, autoContactsPackagesState, i12);
        }
    }
}
