package com.avito.android.authorization.auth;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DetailsSheetButton;
import com.avito.android.deep_linking.links.DetailsSheetLink;
import com.avito.android.deep_linking.links.DetailsSheetLinkBody;
import com.avito.android.deep_linking.links.SettingsNotificationsLink;
import com.avito.android.deep_linking.links.Theme;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: AuthNotificationLinkBuilder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/auth/v;", "Lcom/avito/android/authorization/auth/u;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.authorization.auth.v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28642v implements InterfaceC28641u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f93062a;

    @Inject
    public C28642v(@Y61.k Resources resources) {
        this.f93062a = resources;
    }

    @Override // com.avito.android.authorization.auth.InterfaceC28641u
    @Y61.k
    public final DetailsSheetLink build() throws Resources.NotFoundException {
        Resources resources = this.f93062a;
        String string = resources.getString(R.string.auth_notifications_title);
        AttributedText attributedText = new AttributedText(resources.getString(R.string.auth_notifications_description), C42784z0.f406748b, 0, 4, null);
        DetailsSheetButton detailsSheetButton = new DetailsSheetButton(resources.getString(R.string.auth_notifications_action), "primaryMedium", null, new SettingsNotificationsLink(), new ParametrizedEvent(8670, 0, null), null, 36, null);
        Boolean bool = Boolean.TRUE;
        return new DetailsSheetLink(new DetailsSheetLinkBody(string, "h25", null, null, attributedText, null, detailsSheetButton, null, bool, null, null, null, bool, null, Theme.AVITO_RE_23, null, null, false, null, 503468, null), new ParametrizedEvent(8668, 0, null));
    }
}
