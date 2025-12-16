package com.avito.android.select.new_metro.mvi;

import com.avito.android.select.new_metro.item.MetroFilterItem;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectMetroReducer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/select/new_metro/item/MetroFilterItem;", "invoke", "(Lcom/avito/android/select/new_metro/item/MetroFilterItem;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class p extends N implements Y41.l<MetroFilterItem, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f266300l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Set<Integer> f266301m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(o oVar, Set<Integer> set) {
        super(1);
        this.f266300l = oVar;
        this.f266301m = set;
    }

    @Override // Y41.l
    public final Boolean invoke(MetroFilterItem metroFilterItem) {
        this.f266300l.getClass();
        return Boolean.valueOf(this.f266301m.containsAll(metroFilterItem.f266177c));
    }
}
