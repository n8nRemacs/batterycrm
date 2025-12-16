package com.avito.android.publish.slots.market_price;

import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.TextParameter;
import kotlin.Metadata;
import l41.r;

/* compiled from: MarketPriceSlotWrapper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class d<T> implements r {

    /* renamed from: b, reason: collision with root package name */
    public static final d<T> f244533b = new d<>();

    @Override // l41.r
    public final boolean test(Object obj) {
        return !(((EditableParameter) obj) instanceof TextParameter);
    }
}
