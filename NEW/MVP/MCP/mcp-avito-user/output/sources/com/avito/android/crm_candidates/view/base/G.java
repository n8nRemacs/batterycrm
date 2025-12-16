package com.avito.android.crm_candidates.view.base;

import Rs.InterfaceC15076a;
import Vs.InterfaceC15712a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: JobCrmFullFiltersFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class G extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ JobCrmFullFiltersFragment f129763l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f129764m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(JobCrmFullFiltersFragment jobCrmFullFiltersFragment, String str) {
        super(0);
        this.f129763l = jobCrmFullFiltersFragment;
        this.f129764m = str;
    }

    @Override // Y41.a
    public final G0 invoke() {
        JobCrmFullFiltersFragment jobCrmFullFiltersFragment = this.f129763l;
        ((com.avito.android.crm_candidates.features.list_filter.logics.l) jobCrmFullFiltersFragment.f129853w0.getValue()).accept(InterfaceC15712a.b.f17450a);
        jobCrmFullFiltersFragment.r5().accept(new InterfaceC15076a.e(this.f129764m));
        return G0.f406611a;
    }
}
