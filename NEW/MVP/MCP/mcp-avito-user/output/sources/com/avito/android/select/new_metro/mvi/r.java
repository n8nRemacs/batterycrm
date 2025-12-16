package com.avito.android.select.new_metro.mvi;

import com.avito.android.select.new_metro.item.MetroStationItem;
import com.avito.android.select.new_metro.mvi.entity.SelectMetroInternalAction;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: Comparisons.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class r<T> implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectMetroInternalAction f266303b;

    public r(SelectMetroInternalAction selectMetroInternalAction) {
        this.f266303b = selectMetroInternalAction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t12, T t13) {
        String str = ((MetroStationItem) t12).f266203f;
        SelectMetroInternalAction.SearchTextChanged searchTextChanged = (SelectMetroInternalAction.SearchTextChanged) this.f266303b;
        return kotlin.comparisons.a.b(Integer.valueOf(C43066x.I(str, searchTextChanged.f266243b, 0, true, 2)), Integer.valueOf(C43066x.I(((MetroStationItem) t13).f266203f, searchTextChanged.f266243b, 0, true, 2)));
    }
}
