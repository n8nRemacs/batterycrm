package com.avito.android.crm_candidates.view.base;

import Vs.InterfaceC15712a;
import androidx.view.C22984Q;
import kotlin.G0;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;

/* compiled from: JobCrmFullFiltersFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class K extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ JobCrmFullFiltersFragment f129892l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f129893m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(JobCrmFullFiltersFragment jobCrmFullFiltersFragment, String str) {
        super(0);
        this.f129892l = jobCrmFullFiltersFragment;
        this.f129893m = str;
    }

    @Override // Y41.a
    public final G0 invoke() {
        JobCrmFullFiltersFragment jobCrmFullFiltersFragment = this.f129892l;
        jobCrmFullFiltersFragment.f129850t0 = C43259k.d(C22984Q.a(jobCrmFullFiltersFragment.getViewLifecycleOwner()), null, null, new J(jobCrmFullFiltersFragment, null), 3);
        ((com.avito.android.crm_candidates.features.list_filter.logics.l) jobCrmFullFiltersFragment.f129853w0.getValue()).accept(new InterfaceC15712a.e(this.f129893m));
        return G0.f406611a;
    }
}
