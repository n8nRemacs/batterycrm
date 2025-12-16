package com.avito.android.publish.imv;

import com.avito.android.remote.model.category_parameters.slot.imv.InstantMarketValueResponse;
import kotlin.Metadata;
import l41.o;

/* compiled from: ServicesInstantMarketValueInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/imv/InstantMarketValueResponse;", "it", "Lcom/avito/android/publish/imv/a;", "apply", "(Lcom/avito/android/remote/model/category_parameters/slot/imv/InstantMarketValueResponse;)Lcom/avito/android/publish/imv/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class i<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public static final i<T, R> f236076b = new i<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        return new a(((InstantMarketValueResponse) obj).getItems());
    }
}
