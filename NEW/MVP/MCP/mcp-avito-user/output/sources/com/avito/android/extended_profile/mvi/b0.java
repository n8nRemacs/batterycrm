package com.avito.android.extended_profile.mvi;

import com.avito.android.extended_profile_widgets.adapter.search.ExtendedProfileSearchTab;
import com.avito.android.extended_profile_widgets.adapter.search.ExtendedProfileSearchTabType;
import com.avito.android.remote.model.notification.NotificationOpenAtTab;
import kotlin.Metadata;

/* compiled from: ExtendedProfileReducer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", NotificationOpenAtTab.TAB, "Lcom/avito/android/extended_profile_widgets/adapter/search/ExtendedProfileSearchTab;", "invoke", "(Lcom/avito/android/extended_profile_widgets/adapter/search/ExtendedProfileSearchTab;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class b0 extends kotlin.jvm.internal.N implements Y41.l<ExtendedProfileSearchTab, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final b0 f150138l = new b0();

    public b0() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(ExtendedProfileSearchTab extendedProfileSearchTab) {
        return Boolean.valueOf(extendedProfileSearchTab.f154618d == ExtendedProfileSearchTabType.f154620c);
    }
}
