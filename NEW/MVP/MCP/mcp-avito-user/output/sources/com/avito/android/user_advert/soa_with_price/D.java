package com.avito.android.user_advert.soa_with_price;

import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.remote.model.my_advert.CloseReason;
import com.avito.android.user_advert.soa_with_price.j;
import com.avito.android.util.InterfaceC35745a5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SoaWithPriceViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/soa_with_price/D;", "Landroidx/lifecycle/M0;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class D extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final List<CloseReason> f311823E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f311824J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final k f311825K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final C23038g0<C35550d> f311826L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final C23038g0<j> f311827M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final C23038g0<UV0.a<C35547a>> f311828N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f311829O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f311830P;

    /* renamed from: Q, reason: collision with root package name */
    public CloseReason f311831Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.l
    public String f311832R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f311833S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f311834T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f311835U;

    public D(@Y61.k List<CloseReason> list, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k k kVar) {
        this.f311823E = list;
        this.f311824J = interfaceC35745a5;
        this.f311825K = kVar;
        C23038g0<C35550d> c23038g0 = new C23038g0<>();
        this.f311826L = c23038g0;
        C23038g0<j> c23038g02 = new C23038g0<>();
        this.f311827M = c23038g02;
        C23038g0<UV0.a<C35547a>> c23038g03 = new C23038g0<>();
        this.f311828N = c23038g03;
        this.f311829O = new io.reactivex.rxjava3.disposables.c();
        this.f311830P = new io.reactivex.rxjava3.disposables.c();
        this.f311833S = c23038g02;
        this.f311834T = c23038g0;
        this.f311835U = c23038g03;
        List<CloseReason> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (CloseReason closeReason : list2) {
            arrayList.add(new C35547a(closeReason.getId(), closeReason.getTitle(), false));
        }
        c23038g03.setValue(new UV0.c(arrayList));
        this.f311827M.setValue(new j.b(this.f311825K.getF311935a()));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ke(com.avito.android.user_advert.soa_with_price.D r4) {
        /*
            androidx.lifecycle.g0<com.avito.android.user_advert.soa_with_price.j> r0 = r4.f311827M
            java.lang.String r1 = r4.f311832R
            r2 = 0
            if (r1 == 0) goto L27
            com.avito.android.remote.model.my_advert.CloseReason r1 = r4.f311831Q
            if (r1 != 0) goto Lc
            r1 = r2
        Lc:
            java.lang.String r1 = r1.getCurrentPrice()
            java.lang.String r3 = r4.f311832R
            boolean r1 = kotlin.jvm.internal.L.f(r1, r3)
            if (r1 == 0) goto L19
            goto L27
        L19:
            com.avito.android.user_advert.soa_with_price.j$d r1 = new com.avito.android.user_advert.soa_with_price.j$d
            com.avito.android.remote.model.my_advert.CloseReason r3 = r4.f311831Q
            if (r3 != 0) goto L20
            goto L21
        L20:
            r2 = r3
        L21:
            java.lang.String r4 = r4.f311832R
            r1.<init>(r2, r4)
            goto L32
        L27:
            com.avito.android.user_advert.soa_with_price.j$d r1 = new com.avito.android.user_advert.soa_with_price.j$d
            com.avito.android.remote.model.my_advert.CloseReason r4 = r4.f311831Q
            if (r4 != 0) goto L2e
            r4 = r2
        L2e:
            r3 = 2
            r1.<init>(r4, r2, r3, r2)
        L32:
            r0.setValue(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_advert.soa_with_price.D.ke(com.avito.android.user_advert.soa_with_price.D):void");
    }

    public final void O6() {
        C23038g0<j> c23038g0 = this.f311827M;
        if (!(c23038g0.getValue() instanceof j.b)) {
            c23038g0.setValue(new j.b(this.f311825K.getF311935a()));
            C23038g0<UV0.a<C35547a>> c23038g02 = this.f311828N;
            List<CloseReason> list = this.f311823E;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (CloseReason closeReason : list) {
                String id2 = closeReason.getId();
                String title = closeReason.getTitle();
                CloseReason closeReason2 = this.f311831Q;
                arrayList.add(new C35547a(id2, title, closeReason2 != null ? L.f(closeReason2.getId(), closeReason.getId()) : false));
            }
            c23038g02.setValue(new UV0.c(arrayList));
        }
        this.f311830P.e();
    }

    public final void le() {
        this.f311827M.setValue(j.a.f311928a);
        this.f311829O.e();
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        this.f311829O.dispose();
        this.f311830P.dispose();
    }
}
