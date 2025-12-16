package com.avito.android.publish.select;

import com.avito.android.publish.select.SelectViewModel;
import kotlin.Metadata;

/* compiled from: SelectViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/component/toolbar/d;", "it", "Lkotlin/G0;", "accept", "(Lru/avito/component/toolbar/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class o<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectViewModel f242707b;

    public o(SelectViewModel selectViewModel) {
        this.f242707b = selectViewModel;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        SelectViewModel selectViewModel = this.f242707b;
        selectViewModel.f242642Q.setValue(new SelectViewModel.a.b((ru.avito.component.toolbar.d) obj));
    }
}
