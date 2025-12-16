package com.avito.android.multigeo_flow.full_list.view;

import Ju.InterfaceC14249c;
import Q20.a;
import com.avito.android.deep_linking.links.UserAddressLink;
import com.avito.android.multigeo_flow.full_list.view.JobMultiGeoFullListFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kv.C43501a;

/* compiled from: JobMultiGeoFullListFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "event", "Lkotlin/G0;", "emit", "(Lkv/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class b<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JobMultiGeoFullListFragment f206949b;

    public b(JobMultiGeoFullListFragment jobMultiGeoFullListFragment) {
        this.f206949b = jobMultiGeoFullListFragment;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
        boolean z12 = interfaceC14249c instanceof UserAddressLink.Result.Success.Added;
        JobMultiGeoFullListFragment jobMultiGeoFullListFragment = this.f206949b;
        if (z12) {
            JobMultiGeoFullListFragment.a aVar = JobMultiGeoFullListFragment.f206922x0;
            jobMultiGeoFullListFragment.r5().accept(new a.C0881a((UserAddressLink.Result.Success.Added) interfaceC14249c));
        } else if (interfaceC14249c instanceof UserAddressLink.Result.Success.Modified) {
            JobMultiGeoFullListFragment.a aVar2 = JobMultiGeoFullListFragment.f206922x0;
            jobMultiGeoFullListFragment.r5().accept(new a.f((UserAddressLink.Result.Success.Modified) interfaceC14249c));
        } else if (interfaceC14249c instanceof UserAddressLink.Result.Failure) {
            JobMultiGeoFullListFragment.a aVar3 = JobMultiGeoFullListFragment.f206922x0;
            jobMultiGeoFullListFragment.r5().accept(a.h.f13430a);
        }
        return G0.f406611a;
    }
}
