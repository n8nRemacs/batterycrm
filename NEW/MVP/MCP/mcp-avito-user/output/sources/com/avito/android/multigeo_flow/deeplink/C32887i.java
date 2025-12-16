package com.avito.android.multigeo_flow.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import com.avito.android.deep_linking.links.UserAddressLink;
import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kv.C43501a;

/* compiled from: JobMultiGeoEditDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "event", "Lkotlin/G0;", "emit", "(Lkv/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.multigeo_flow.deeplink.i, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32887i<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f206830b;

    public C32887i(o oVar) {
        this.f206830b = oVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
        boolean z12 = interfaceC14249c instanceof UserAddressLink.Result.Success.Modified;
        o oVar = this.f206830b;
        if (z12) {
            UserAddressLink.Result.Success.Modified modified = (UserAddressLink.Result.Success.Modified) interfaceC14249c;
            String str = modified.f133826g;
            oVar.j(str == null ? JobMultiGeoLink.a.d.f206983b : new JobMultiGeoLink.a.c(modified.f133822c, modified.f133823d, str, modified.f133824e));
        } else if (interfaceC14249c instanceof UserAddressLink.Result.Failure) {
            oVar.j(JobMultiGeoLink.a.d.f206983b);
        } else {
            oVar.j(AbstractC14250d.c.f9171c);
        }
        return G0.f406611a;
    }
}
