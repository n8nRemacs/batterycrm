package com.avito.android.beduin.ui.screen.fragment.bottom_sheet;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: BottomSheetScreenFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView;", "it", "Lkotlin/G0;", "accept", "(Landroidx/recyclerview/widget/RecyclerView;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class f<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomSheetScreenFragment f104186b;

    public f(BottomSheetScreenFragment bottomSheetScreenFragment) {
        this.f104186b = bottomSheetScreenFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        ((RecyclerView) obj).setOnScrollChangeListener(new e(this.f104186b, 0));
    }
}
