package com.avito.android.select.new_metro;

import com.avito.android.select.new_metro.item.MetroLineItem;
import com.avito.conveyor_item.ParcelableItem;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.N;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: MetroLinesListPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/select/new_metro/item/MetroLineItem;", "it", "Lkotlin/sequences/m;", "Lcom/avito/conveyor_item/ParcelableItem;", "invoke", "(Lcom/avito/android/select/new_metro/item/MetroLineItem;)Lkotlin/sequences/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class c extends N implements Y41.l<MetroLineItem, InterfaceC43030m<? extends ParcelableItem>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f265949l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(1);
        this.f265949l = dVar;
    }

    @Override // Y41.l
    public final InterfaceC43030m<? extends ParcelableItem> invoke(MetroLineItem metroLineItem) {
        MetroLineItem metroLineItem2 = metroLineItem;
        return metroLineItem2.f266186g ? C43033p.z(C42756l.f(new MetroLineItem[]{metroLineItem2}), this.f265949l.a(metroLineItem2)) : C42756l.f(new MetroLineItem[]{metroLineItem2});
    }
}
