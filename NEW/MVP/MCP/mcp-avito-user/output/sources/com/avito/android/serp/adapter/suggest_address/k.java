package com.avito.android.serp.adapter.suggest_address;

import Lr0.C14433a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.AuthenticateLink;
import com.avito.android.deeplink_handler.handler.b;
import js0.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: AddAddressItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class k extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f272408l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f272409m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AddAddressSuggestItem f272410n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f272411o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ q f272412p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, int i12, AddAddressSuggestItem addAddressSuggestItem, String str, q qVar) {
        super(0);
        this.f272408l = iVar;
        this.f272409m = i12;
        this.f272410n = addAddressSuggestItem;
        this.f272411o = str;
        this.f272412p = qVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        i iVar = this.f272408l;
        Integer numValueOf = Integer.valueOf(this.f272409m);
        AddAddressSuggestItem addAddressSuggestItem = this.f272410n;
        d.a.a(iVar.f272401g, numValueOf, "addressEntryPointWidget", null, null, null, null, null, addAddressSuggestItem.f272380j, 124);
        Integer numValueOf2 = Integer.valueOf(addAddressSuggestItem.f272372b);
        Integer numValueOf3 = Integer.valueOf(addAddressSuggestItem.f272373c);
        Integer numValueOf4 = Integer.valueOf(addAddressSuggestItem.f272374d);
        String str = this.f272411o;
        iVar.f272400f.c(new C14433a(numValueOf2, numValueOf3, numValueOf4, str));
        if (iVar.f272397c.b()) {
            if (str == null) {
                str = "";
            }
            i.k(iVar, str, this.f272412p, addAddressSuggestItem);
        } else {
            b.a.a(iVar.f272398d, new AuthenticateLink(AuthSource.f92717n0, false, (DeepLink) null, 6, (C42822w) null), "add_address_auth_request", null, 4);
        }
        return G0.f406611a;
    }
}
