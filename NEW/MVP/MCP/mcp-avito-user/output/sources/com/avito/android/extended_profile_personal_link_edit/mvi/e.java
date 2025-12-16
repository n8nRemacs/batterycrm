package com.avito.android.extended_profile_personal_link_edit.mvi;

import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.extended_profile_personal_link_edit.mvi.entity.PersonalLinkEditInternalAction;
import com.avito.android.extended_profile_personal_link_edit.mvi.entity.PersonalLinkEditState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PersonalLinkEditFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LDA/a;", "Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditInternalAction;", "Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditState;", "LDA/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class e extends N implements l<q<DA.a, PersonalLinkEditInternalAction, PersonalLinkEditState, DA.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f151520l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f151521m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f151522n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f151523o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f151524p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f151520l = cVar;
        this.f151521m = aVar;
        this.f151522n = screenPerformanceTracker;
        this.f151523o = jVar;
        this.f151524p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<DA.a, PersonalLinkEditInternalAction, PersonalLinkEditState, DA.b> qVar) {
        q<DA.a, PersonalLinkEditInternalAction, PersonalLinkEditState, DA.b> qVar2 = qVar;
        qVar2.f92008d = this.f151520l;
        qVar2.f92009e = this.f151521m;
        qVar2.f92011g = new o(this.f151522n, this.f151523o);
        qVar2.f92010f = this.f151524p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
