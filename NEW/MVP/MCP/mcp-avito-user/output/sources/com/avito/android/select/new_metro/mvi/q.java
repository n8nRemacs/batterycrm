package com.avito.android.select.new_metro.mvi;

import com.avito.android.select.new_metro.item.MetroFilterItem;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectMetroReducer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/select/new_metro/item/MetroFilterItem;", "invoke", "(Lcom/avito/android/select/new_metro/item/MetroFilterItem;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class q extends N implements Y41.l<MetroFilterItem, Integer> {

    /* renamed from: l, reason: collision with root package name */
    public static final q f266302l = new q();

    public q() {
        super(1);
    }

    @Override // Y41.l
    public final Integer invoke(MetroFilterItem metroFilterItem) {
        return Integer.valueOf(metroFilterItem.f266179e);
    }
}
