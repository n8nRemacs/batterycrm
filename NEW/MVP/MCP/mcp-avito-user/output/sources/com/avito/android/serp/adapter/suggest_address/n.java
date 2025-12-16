package com.avito.android.serp.adapter.suggest_address;

import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.geo_common.model.AddressListResult;
import com.avito.android.remote.model.TypedResult;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AddAddressItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/geo_common/model/AddressListResult;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class n<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f272415b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AddAddressSuggestItem f272416c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f272417d;

    public n(i iVar, AddAddressSuggestItem addAddressSuggestItem, q qVar) {
        this.f272415b = iVar;
        this.f272416c = addAddressSuggestItem;
        this.f272417d = qVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if (!(typedResult instanceof TypedResult.Success)) {
            boolean z12 = typedResult instanceof TypedResult.Error;
            return;
        }
        TypedResult.Success success = (TypedResult.Success) typedResult;
        List<AddressListResult.AddressResult> listC = ((AddressListResult) success.getResult()).c();
        i iVar = this.f272415b;
        if (listC == null || ((AddressListResult) success.getResult()).c().size() < 10) {
            b.a.a(iVar.f272398d, this.f272416c.f272377g.getDeepLink(), null, null, 6);
        } else {
            i.O(iVar);
            this.f272417d.WM();
        }
    }
}
