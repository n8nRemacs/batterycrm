package com.avito.android.advert_stats;

import Ju.InterfaceC14249c;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kv.C43501a;

/* compiled from: AdvertStatsViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class u<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f86881b;

    public u(r rVar) {
        this.f86881b = rVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
        boolean z12 = interfaceC14249c instanceof PaidServicesLink.a.b;
        r rVar = this.f86881b;
        if (z12) {
            rVar.me();
            return;
        }
        if (interfaceC14249c instanceof MyAdvertLink.Edit.Result.Success ? true : L.f(interfaceC14249c, MyAdvertLink.Edit.Result.a.f133498b)) {
            rVar.me();
        } else {
            if (interfaceC14249c instanceof InterfaceC14249c.a) {
                return;
            }
            boolean z13 = interfaceC14249c instanceof InterfaceC14249c.b;
        }
    }
}
