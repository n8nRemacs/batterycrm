package com.avito.android.publish.slots.address_from_profile.publish_item;

import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AddressListPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f242896l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f242897m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, a aVar) {
        super(1);
        this.f242896l = iVar;
        this.f242897m = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        i iVar = this.f242896l;
        o oVar = iVar.f242912h;
        oVar.f242938c = str;
        oVar.b();
        List<k> listB = iVar.f242912h.b();
        if (listB != null) {
            this.f242897m.V40(listB);
        }
        return G0.f406611a;
    }
}
