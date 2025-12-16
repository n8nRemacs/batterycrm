package com.avito.android.onboarding.dialog.view.carousel;

import android.view.Gravity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.avito.android.R;
import com.avito.android.lib.design.page_indicator_re23.PageIndicatorRe23;
import com.avito.android.onboarding.dialog.mvi.entity.item.OnboardingResultItem;
import com.avito.android.util.D6;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;

/* compiled from: OnboardingCarouselPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/dialog/view/carousel/g;", "Lcom/avito/android/onboarding/dialog/view/carousel/f;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final A40.a f208994a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f208995b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public o f208996c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f208997d;

    /* compiled from: OnboardingCarouselPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.p<String, Integer, G0> {
        @Override // Y41.p
        public final G0 invoke(String str, Integer num) {
            A40.a aVar = (A40.a) this.receiver;
            aVar.c(num, str);
            return G0.f406611a;
        }
    }

    @Inject
    public g(@Y61.k A40.a aVar, @com.avito.android.onboarding.dialog.di.i @Y61.l String str) {
        this.f208994a = aVar;
        this.f208995b = str;
        this.f208997d = new ArrayList();
    }

    @Override // D40.d
    public final void a() {
        io.reactivex.rxjava3.internal.observers.m mVar;
        o oVar = this.f208996c;
        if (oVar != null && (mVar = oVar.f209019l) != null) {
            DisposableHelper.a(mVar);
        }
        this.f208996c = null;
    }

    @Override // com.avito.android.onboarding.dialog.view.carousel.f
    public final void b() {
        o oVar = this.f208996c;
        if (oVar != null) {
            LinearLayoutManager linearLayoutManager = oVar.f209021n;
            int iK1 = linearLayoutManager.K1() + 1;
            if (iK1 <= linearLayoutManager.o0()) {
                oVar.f209013f.F0(iK1);
            }
        }
    }

    @Override // com.avito.android.onboarding.dialog.view.carousel.f
    public final void c(@Y61.k OnboardingResultItem.OnboardingResultCarouselItem onboardingResultCarouselItem) {
        ArrayList arrayList = this.f208997d;
        arrayList.clear();
        ArrayList arrayList2 = onboardingResultCarouselItem.f208914b;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add((OnboardingCarouselItem) it.next());
            }
        }
    }

    @Override // com.avito.android.onboarding.dialog.view.carousel.f
    public final void e(@Y61.k o oVar) {
        this.f208996c = oVar;
    }

    @Override // D40.d
    public final void fa() {
        A40.a aVar = this.f208994a;
        aVar.a(this.f208995b);
        final o oVar = this.f208996c;
        if (oVar != null) {
            oVar.f209022o = new a(2, aVar, A40.a.class, "sendShowOnboardingPage", "sendShowOnboardingPage(Ljava/lang/String;Ljava/lang/Integer;)V", 0);
            final ArrayList arrayList = this.f208997d;
            oVar.f209009b.l(arrayList, new Runnable() { // from class: com.avito.android.onboarding.dialog.view.carousel.k
                @Override // java.lang.Runnable
                public final void run() {
                    ArrayList arrayList2 = arrayList;
                    boolean z12 = arrayList2.size() > 1;
                    o oVar2 = oVar;
                    PageIndicatorRe23 pageIndicatorRe23 = oVar2.f209014g;
                    if (z12) {
                        com.avito.android.lib.design.page_indicator_re23.b.a(pageIndicatorRe23, oVar2.f209013f);
                    }
                    D6.G(pageIndicatorRe23, z12);
                    if (arrayList2.size() == 1) {
                        ((CoordinatorLayout.g) oVar2.f209015h.getLayoutParams()).f44449c = Gravity.getAbsoluteGravity(80, 0);
                    }
                    n nVar = null;
                    oVar2.f209019l = (io.reactivex.rxjava3.internal.observers.m) com.avito.android.lib.util.recycler_wrap_height_calculator.c.a(oVar2.f209018k, oVar2.f209013f, null, null, (oVar2.f209010c || oVar2.f209020m) ? Integer.valueOf((int) com.avito.android.authorization.auto_recovery.phone_confirm.b.b(oVar2.f209008a, R.dimen.design_bottom_sheet_modal_max_width)) : null, 14).x(new l(oVar2), m.f209005b);
                    if (!arrayList2.isEmpty()) {
                        nVar = new n(oVar2, arrayList2);
                        nVar.invoke(Integer.valueOf(oVar2.f209021n.K1()));
                    }
                    oVar2.f209017j = nVar;
                }
            });
        }
    }

    public /* synthetic */ g(A40.a aVar, String str, int i12, C42822w c42822w) {
        this(aVar, (i12 & 2) != 0 ? null : str);
    }
}
