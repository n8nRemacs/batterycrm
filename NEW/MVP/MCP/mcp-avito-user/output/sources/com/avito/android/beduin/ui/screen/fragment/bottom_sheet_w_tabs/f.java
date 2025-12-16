package com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs;

import com.avito.android.beduin_models.BeduinAction;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BottomSheetWithTabsScreenFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class f extends N implements Y41.l<List<? extends BeduinAction>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BottomSheetWithTabsScreenFragment f104239l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BottomSheetWithTabsScreenFragment bottomSheetWithTabsScreenFragment) {
        super(1);
        this.f104239l = bottomSheetWithTabsScreenFragment;
    }

    @Override // Y41.l
    public final G0 invoke(List<? extends BeduinAction> list) {
        this.f104239l.q5().ke(list);
        return G0.f406611a;
    }
}
