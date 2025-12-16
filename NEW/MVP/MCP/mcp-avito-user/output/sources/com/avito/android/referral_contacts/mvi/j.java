package com.avito.android.referral_contacts.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.referral_contacts.models.ReferralContactsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReferralContactsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LUi0/d;", "Lcom/avito/android/referral_contacts/models/ReferralContactsInternalAction;", "LUi0/f;", "LUi0/e;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class j extends N implements Y41.l<com.avito.android.arch.mvi.q<Ui0.d, ReferralContactsInternalAction, Ui0.f, Ui0.e>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f252548l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f252549m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f252550n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f252551o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ o f252552p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f fVar, m mVar, h hVar, ScreenPerformanceTracker screenPerformanceTracker, o oVar) {
        super(1);
        this.f252548l = fVar;
        this.f252549m = mVar;
        this.f252550n = hVar;
        this.f252551o = screenPerformanceTracker;
        this.f252552p = oVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<Ui0.d, ReferralContactsInternalAction, Ui0.f, Ui0.e> qVar) {
        com.avito.android.arch.mvi.q<Ui0.d, ReferralContactsInternalAction, Ui0.f, Ui0.e> qVar2 = qVar;
        qVar2.f92009e = this.f252548l;
        qVar2.f92010f = this.f252549m;
        qVar2.f92008d = this.f252550n;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f252551o, this.f252552p);
        return G0.f406611a;
    }
}
