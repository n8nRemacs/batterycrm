package com.avito.android.user_adverts.tab_screens.adverts.dataProvider;

import Y41.l;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.user_adverts.tab_screens.UserAdvertsListParams;
import com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UserAdvertsListBannerContextInfoProvider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/user_adverts/tab_screens/UserAdvertsListParams;", VoiceInfo.STATE, "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class e extends N implements l<UserAdvertsListState, UserAdvertsListParams> {

    /* renamed from: l, reason: collision with root package name */
    public static final e f314944l = new e();

    public e() {
        super(1);
    }

    @Override // Y41.l
    public final UserAdvertsListParams invoke(UserAdvertsListState userAdvertsListState) {
        return userAdvertsListState.f315399q;
    }
}
