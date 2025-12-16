package com.avito.android.code_check.phone_list.adapter.phone;

import Ro.InterfaceC15066a;
import Y41.l;
import Y61.k;
import com.avito.android.code_check_public.screen.PhoneList;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PhoneItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check/phone_list/adapter/phone/e;", "Lcom/avito/android/code_check/phone_list/adapter/phone/c;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC15066a, G0> f118956b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f118957c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC15066a, G0> lVar, boolean z12) {
        this.f118956b = lVar;
        this.f118957c = z12;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        int i13;
        g gVar = (g) eVar;
        PhoneItem phoneItem = (PhoneItem) aVar;
        PhoneList.ItemIcon itemIcon = phoneItem.f118946f;
        boolean z12 = this.f118957c;
        gVar.FS(itemIcon, z12);
        if (z12) {
            gVar.a(new d(this, phoneItem));
        }
        String str = phoneItem.f118942b;
        int i14 = phoneItem.f118944d;
        if (i14 == -1 || (i13 = phoneItem.f118945e) == -1) {
            gVar.E7(str);
        } else {
            gVar.m30(i14, i13, str);
        }
    }
}
