package com.avito.android.select.new_metro;

import com.avito.android.select.new_metro.item.MetroLineItem;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MetroLinesListPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/select/new_metro/item/MetroLineItem;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class b extends N implements Y41.l<Integer, MetroLineItem> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f265948l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar) {
        super(1);
        this.f265948l = dVar;
    }

    @Override // Y41.l
    public final MetroLineItem invoke(Integer num) {
        return this.f265948l.f266143a.F2().get(Integer.valueOf(num.intValue()));
    }
}
