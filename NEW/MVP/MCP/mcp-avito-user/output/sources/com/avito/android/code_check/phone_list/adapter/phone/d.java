package com.avito.android.code_check.phone_list.adapter.phone;

import Ro.InterfaceC15066a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PhoneItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f118954l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PhoneItem f118955m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, PhoneItem phoneItem) {
        super(0);
        this.f118954l = eVar;
        this.f118955m = phoneItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f118954l.f118956b.invoke(new InterfaceC15066a.c(this.f118955m.f118943c, null));
        return G0.f406611a;
    }
}
