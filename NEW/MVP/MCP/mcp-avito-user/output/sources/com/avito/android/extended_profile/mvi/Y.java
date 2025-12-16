package com.avito.android.extended_profile.mvi;

import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import com.avito.android.public_profile.ui.tab.TabItem;
import kotlin.Metadata;

/* compiled from: ExtendedProfileReducer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/public_profile/ui/tab/TabItem;", "invoke", "(Lcom/avito/android/public_profile/ui/tab/TabItem;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class Y extends kotlin.jvm.internal.N implements Y41.l<TabItem, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ExtendedProfileInternalAction f150062l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(ExtendedProfileInternalAction extendedProfileInternalAction) {
        super(1);
        this.f150062l = extendedProfileInternalAction;
    }

    @Override // Y41.l
    public final Boolean invoke(TabItem tabItem) {
        return Boolean.valueOf(kotlin.jvm.internal.L.f(tabItem.f231826g, ((ExtendedProfileInternalAction.OnProfileAdvertsUpdates) this.f150062l).f150183b.f150957a));
    }
}
