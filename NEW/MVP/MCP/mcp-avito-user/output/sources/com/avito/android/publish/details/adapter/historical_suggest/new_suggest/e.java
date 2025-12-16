package com.avito.android.publish.details.adapter.historical_suggest.new_suggest;

import Y41.p;
import com.avito.android.historical_suggests.model.AddressType;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HistoricalSuggestsNewPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value;", AddressParameter.TYPE, "Lcom/avito/android/historical_suggests/model/AddressType;", "type", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value;Lcom/avito/android/historical_suggests/model/AddressType;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements p<AddressParameter.Value, AddressType, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f233264l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar) {
        super(2);
        this.f233264l = gVar;
    }

    @Override // Y41.p
    public final G0 invoke(AddressParameter.Value value, AddressType addressType) {
        AddressParameter.Value value2 = value;
        g gVar = this.f233264l;
        g.k(gVar, value2);
        gVar.f233269d.a(value2, addressType);
        return G0.f406611a;
    }
}
