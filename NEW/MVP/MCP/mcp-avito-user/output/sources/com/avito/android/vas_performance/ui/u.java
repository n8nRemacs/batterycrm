package com.avito.android.vas_performance.ui;

import androidx.recyclerview.widget.C23424o;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PerformanceVasViewModelImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/conveyor_item/a;", "it", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class u<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f322068b;

    public u(m mVar) {
        this.f322068b = mVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        List<? extends com.avito.conveyor_item.a> list = (List) obj;
        m mVar = this.f322068b;
        mVar.f321874S.postValue(new com.avito.android.vas_performance.ui.recycler.g(list, C23424o.a(new com.avito.android.vas_performance.ui.recycler.c(mVar.f321879X, list), true)));
        mVar.f321879X = list;
    }
}
