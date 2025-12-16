package com.avito.android.inline_filters.dialog.addresses;

import Y41.l;
import com.avito.android.remote.model.SuggestAddress;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SuggestAddressesFilterView.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/android/remote/model/SuggestAddress;", "kotlin.jvm.PlatformType", "selectedAddresses", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class g extends N implements l<List<? extends SuggestAddress>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f171164l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar) {
        super(1);
        this.f171164l = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(List<? extends SuggestAddress> list) {
        List<? extends SuggestAddress> list2 = list;
        l<? super List<SuggestAddress>, G0> lVar = this.f171164l.f171162b;
        if (lVar != null) {
            lVar.invoke(list2);
        }
        return G0.f406611a;
    }
}
