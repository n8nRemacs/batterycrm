package com.avito.android.passport.profile_add.merge.full_screen_error_dialog;

import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FullScreenUserDialogViewModel.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/full_screen_error_dialog/l;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/passport/profile_add/merge/full_screen_error_dialog/k;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l extends M0 implements k {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f213076E;

    @Inject
    public l(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f213076E = aVar;
    }

    @Override // com.avito.android.passport.profile_add.merge.full_screen_error_dialog.k
    public final void C4(@Y61.k DeepLink deepLink) {
        b.a.a(this.f213076E, deepLink, null, null, 6);
    }
}
