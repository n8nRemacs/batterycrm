package com.avito.android.messenger.blacklist.mvi.adapter.pagination_in_progress;

import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PaginationInProgress.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/messenger/blacklist/mvi/adapter/pagination_in_progress/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/messenger/blacklist/mvi/adapter/pagination_in_progress/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class a extends N implements p<ViewGroup, View, f> {

    /* renamed from: l, reason: collision with root package name */
    public static final a f186410l = new a();

    public a() {
        super(2);
    }

    @Override // Y41.p
    public final f invoke(ViewGroup viewGroup, View view) {
        View view2 = view;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -2;
        return new f(view2);
    }
}
