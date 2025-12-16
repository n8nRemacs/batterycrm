package com.avito.android.messenger;

import android.app.Application;
import android.content.Intent;
import com.avito.android.C30277e1;
import com.avito.android.I1;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.messenger.blacklist.mvi.BlacklistActivity;
import com.avito.android.messenger.blacklist_reasons.BlacklistReasonsActivity;
import com.avito.android.messenger.channels.ChannelsFragmentArguments;
import com.avito.android.messenger.channels.ChannelsFragmentData;
import com.avito.android.messenger.conversation.C31921c;
import com.avito.android.messenger.conversation.ChannelActivityArguments;
import com.avito.android.messenger.conversation.ChannelActivityFragmentData;
import com.avito.android.messenger.deeplink.ChannelBottomSheetInputLink;
import com.avito.android.messenger.deeplink.bottom_sheet.BottomSheetInputActivity;
import com.avito.android.messenger.map.search.GeoSearchActivity;
import com.avito.android.messenger.map.sharing.SharingMapActivity;
import com.avito.android.messenger.map.viewing.PlatformMapActivity;
import com.avito.android.messenger.search.ChannelsSearchActivity;
import com.avito.android.messenger.support.SupportChatFormActivity;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.remote.model.messenger.geo.GeoMarker;
import com.avito.android.remote.model.messenger.geo.GeoPoint;
import com.avito.android.remote.model.messenger.geo.MarkersRequest;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MessengerIntentFactoryImpl.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/G;", "Lcom/avito/android/messenger/F;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class G implements F {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f186147a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.L f186148b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.navigation.a f186149c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final PhotoPickerIntentFactory f186150d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final I1 f186151e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f186152f;

    @Inject
    public G(@Y61.k Application application, @Y61.k com.avito.android.L l12, @Y61.k com.avito.android.navigation.a aVar, @Y61.k PhotoPickerIntentFactory photoPickerIntentFactory, @Y61.k I1 i12, @Y61.k C30277e1 c30277e1) {
        this.f186147a = application;
        this.f186148b = l12;
        this.f186149c = aVar;
        this.f186150d = photoPickerIntentFactory;
        this.f186151e = i12;
        this.f186152f = c30277e1;
    }

    @Override // com.avito.android.messenger.F
    @Y61.k
    public final Intent a() {
        return new Intent(this.f186147a, (Class<?>) BlacklistActivity.class);
    }

    @Override // com.avito.android.messenger.F
    @Y61.k
    public final Intent b(@Y61.k String str) {
        return PhotoPickerIntentFactory.a.a(this.f186150d, this.f186147a, str, NotificationsSettings.Section.SECTION_MESSENGER, 1, 10, null, null, new PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd(null, 1, null), false, 352);
    }

    @Override // com.avito.android.messenger.F
    @Y61.k
    public final Intent c(@Y61.l Integer num, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, boolean z12) {
        C30277e1 c30277e1 = this.f186152f;
        c30277e1.getClass();
        kotlin.reflect.n<Object>[] nVarArr = C30277e1.f144946d1;
        kotlin.reflect.n<Object> nVar = nVarArr[89];
        ChannelActivityArguments.Open open = new ChannelActivityArguments.Open(str, num, str2, str3, z12, false, null, ((Boolean) c30277e1.f144966J0.a().invoke()).booleanValue() ? str4 : null, null, 352, null);
        NavigationTabSetItem navigationTabSetItemA = this.f186149c.a();
        if (!this.f186151e.v().invoke().booleanValue() || navigationTabSetItemA == null) {
            return C31921c.a(this.f186147a, open);
        }
        kotlin.reflect.n<Object> nVar2 = nVarArr[73];
        if (!((Boolean) c30277e1.f145040t0.a().invoke()).booleanValue()) {
            navigationTabSetItemA = NavigationTab.f106973i;
        }
        return this.f186148b.d(new ChannelActivityFragmentData(open, navigationTabSetItemA));
    }

    @Override // com.avito.android.messenger.F
    @Y61.k
    public final Intent d(@Y61.l Long l12, @Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        ChannelActivityArguments.Create.WithAvito withAvito = new ChannelActivityArguments.Create.WithAvito(str, str2, str3, l12);
        NavigationTabSetItem navigationTabSetItemA = this.f186149c.a();
        if (!this.f186151e.v().invoke().booleanValue() || navigationTabSetItemA == null) {
            return C31921c.a(this.f186147a, withAvito);
        }
        C30277e1 c30277e1 = this.f186152f;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[73];
        if (!((Boolean) c30277e1.f145040t0.a().invoke()).booleanValue()) {
            navigationTabSetItemA = NavigationTab.f106973i;
        }
        return this.f186148b.d(new ChannelActivityFragmentData(withAvito, navigationTabSetItemA));
    }

    @Override // com.avito.android.messenger.F
    @Y61.k
    public final Intent e() {
        return new Intent(this.f186147a, (Class<?>) ChannelsSearchActivity.class);
    }

    @Override // com.avito.android.messenger.F
    @Y61.k
    public final Intent f(@Y61.l Boolean bool, @Y61.l String str) {
        return this.f186148b.d(new ChannelsFragmentData(new ChannelsFragmentArguments(str, bool)));
    }

    @Override // com.avito.android.messenger.F
    @Y61.k
    public final Intent g(@Y61.k String str, @Y61.k GeoMarker[] geoMarkerArr, @Y61.l MarkersRequest markersRequest, boolean z12) {
        PlatformMapActivity.f196792m.getClass();
        return PlatformMapActivity.a.a(this.f186147a, str, geoMarkerArr, markersRequest, z12);
    }

    @Override // com.avito.android.messenger.F
    @Y61.k
    public final Intent h(@Y61.k String str, @Y61.k String str2, @Y61.l String str3) {
        return new Intent(this.f186147a, (Class<?>) BlacklistReasonsActivity.class).putExtra("user_id", str).putExtra("channel_id", str2).putExtra("item_id", str3);
    }

    @Override // com.avito.android.messenger.F
    @Y61.k
    public final Intent i(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, boolean z12, @Y61.l String str4, @Y61.l String str5, @Y61.l Long l12) {
        ChannelActivityArguments.Create.ByItem byItem = new ChannelActivityArguments.Create.ByItem(str, str2, str3, z12, str4, str5, l12);
        NavigationTabSetItem navigationTabSetItemA = this.f186149c.a();
        if (!this.f186151e.v().invoke().booleanValue() || navigationTabSetItemA == null) {
            return C31921c.a(this.f186147a, byItem);
        }
        C30277e1 c30277e1 = this.f186152f;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[73];
        if (!((Boolean) c30277e1.f145040t0.a().invoke()).booleanValue()) {
            navigationTabSetItemA = NavigationTab.f106973i;
        }
        return this.f186148b.d(new ChannelActivityFragmentData(byItem, navigationTabSetItemA));
    }

    @Override // com.avito.android.messenger.F
    @Y61.k
    public final Intent j(int i12) {
        SupportChatFormActivity.f197347m.getClass();
        return new Intent(this.f186147a, (Class<?>) SupportChatFormActivity.class).putExtra("problemId", i12);
    }

    @Override // com.avito.android.messenger.F
    @Y61.k
    public final Intent k(@Y61.k String str, @Y61.l MessageBody.Location location) {
        SharingMapActivity.f196686m.getClass();
        Intent intent = new Intent(this.f186147a, (Class<?>) SharingMapActivity.class);
        intent.putExtra("channel_id", str);
        intent.putExtra("initial_position", location);
        return intent;
    }

    @Override // com.avito.android.messenger.F
    @Y61.k
    public final Intent l(@Y61.k String str, @Y61.k String str2, @Y61.l GeoPoint geoPoint, @Y61.l GeoPoint geoPoint2) {
        GeoSearchActivity.f196483m.getClass();
        Intent intent = new Intent(this.f186147a, (Class<?>) GeoSearchActivity.class);
        intent.putExtra("channel_id", str);
        intent.putExtra("initial_query", str2);
        if (geoPoint != null) {
            intent.putExtra("center_point", geoPoint);
        }
        if (geoPoint2 != null) {
            intent.putExtra("item_location", geoPoint2);
        }
        return intent;
    }

    @Override // com.avito.android.messenger.F
    @Y61.k
    public final Intent m(@Y61.l Long l12, @Y61.k String str, @Y61.l String str2) {
        ChannelActivityArguments.Create.ByOpponentUser byOpponentUser = new ChannelActivityArguments.Create.ByOpponentUser(str, str2, l12);
        NavigationTabSetItem navigationTabSetItemA = this.f186149c.a();
        if (!this.f186151e.v().invoke().booleanValue() || navigationTabSetItemA == null) {
            return C31921c.a(this.f186147a, byOpponentUser);
        }
        C30277e1 c30277e1 = this.f186152f;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[73];
        if (!((Boolean) c30277e1.f145040t0.a().invoke()).booleanValue()) {
            navigationTabSetItemA = NavigationTab.f106973i;
        }
        return this.f186148b.d(new ChannelActivityFragmentData(byOpponentUser, navigationTabSetItemA));
    }

    @Override // com.avito.android.messenger.F
    @Y61.k
    public final Intent n(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l Map map) {
        return new Intent(this.f186147a, (Class<?>) BottomSheetInputActivity.class).putExtra("deeplink_key", new ChannelBottomSheetInputLink(str, str2, str3, str4, str5, str6, str7, map));
    }
}
