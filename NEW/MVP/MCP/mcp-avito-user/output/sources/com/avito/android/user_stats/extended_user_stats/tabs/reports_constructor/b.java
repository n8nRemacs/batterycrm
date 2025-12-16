package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor;

import RJ0.a;
import Y41.l;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.ConstructorTabFragment;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.split.SplitListDialogItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ConstructorTabFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/split/SplitListDialogItem;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/split/SplitListDialogItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class b extends N implements l<SplitListDialogItem, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ConstructorTabFragment f317895l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ConstructorTabFragment constructorTabFragment) {
        super(1);
        this.f317895l = constructorTabFragment;
    }

    @Override // Y41.l
    public final G0 invoke(SplitListDialogItem splitListDialogItem) {
        ConstructorTabFragment.a aVar = ConstructorTabFragment.f317866y0;
        this.f317895l.q5().accept(new a.m(splitListDialogItem));
        return G0.f406611a;
    }
}
