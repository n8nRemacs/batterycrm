package com.avito.android.serp.adapter.suggest_address;

import Ju.InterfaceC14249c;
import com.avito.android.deep_linking.links.UserAddressLink;
import com.avito.android.deep_linking.links.auth.AuthenticateLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kv.C43501a;

/* compiled from: AddAddressItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class j<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f272404b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f272405c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f272406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AddAddressSuggestItem f272407e;

    public j(i iVar, String str, q qVar, AddAddressSuggestItem addAddressSuggestItem) {
        this.f272404b = iVar;
        this.f272405c = str;
        this.f272406d = qVar;
        this.f272407e = addAddressSuggestItem;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C43501a c43501a = (C43501a) obj;
        InterfaceC14249c interfaceC14249c = c43501a.f413261b;
        boolean z12 = interfaceC14249c instanceof AuthenticateLink.b.C4024b;
        i iVar = this.f272404b;
        q qVar = this.f272406d;
        if (!z12) {
            if (interfaceC14249c instanceof UserAddressLink.Result.Success.Added) {
                i.O(iVar);
                qVar.EA(((UserAddressLink.Result.Success.Added) interfaceC14249c).f133811e);
                return;
            }
            return;
        }
        if (L.f(c43501a.f413260a.f134521b, "add_address_auth_request")) {
            String str = this.f272405c;
            if (str == null) {
                str = "";
            }
            i.k(iVar, str, qVar, this.f272407e);
        }
    }
}
