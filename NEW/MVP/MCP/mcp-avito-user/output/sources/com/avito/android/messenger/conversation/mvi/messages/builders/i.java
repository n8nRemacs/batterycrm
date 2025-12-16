package com.avito.android.messenger.conversation.mvi.messages.builders;

import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.U0;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.messenger.conversation.ChannelItemContentType;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.adapter.C;
import com.avito.android.messenger.conversation.adapter.C31915a;
import com.avito.android.messenger.di.A0;
import com.avito.android.messenger.di.InterfaceC32513x0;
import com.avito.android.messenger.di.InterfaceC32516y0;
import com.avito.android.messenger.di.InterfaceC32519z0;
import com.avito.android.messenger.di.z2;
import com.avito.android.remote.model.messenger.geo.GeoMarker;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.util.V2;
import java.util.Arrays;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.u0;

/* compiled from: LocationMessageDataBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/builders/i;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C31915a f192142a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C f192143b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final U0 f192144c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f192145d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f192146e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f192147f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final GeoMarker f192148g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f192149h;

    @Inject
    public i(@Y61.k C31915a c31915a, @Y61.k C c12, @Y61.k U0 u02, @Y61.k @z2 String str, @InterfaceC32519z0 @Y61.k String str2, @Y61.k @A0 String str3, @Y61.k @InterfaceC32513x0 GeoMarker geoMarker, @InterfaceC32516y0 @Y61.k String str4) {
        this.f192142a = c31915a;
        this.f192143b = c12;
        this.f192144c = u02;
        this.f192145d = str;
        this.f192146e = str2;
        this.f192147f = str3;
        this.f192148g = geoMarker;
        this.f192149h = str4;
    }

    @Y61.l
    public final com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.location_message.g a(@Y61.k T1.d dVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        C31915a c31915a;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        Uri uriBuild;
        MessageBody.Location location;
        Uri uriBuild2;
        if (!ChannelItemContentType.f189032d.a(dVar) && !ChannelItemContentType.f189035g.a(dVar) && !ChannelItemContentType.f189037i.a(dVar)) {
            return null;
        }
        T1.d.b bVar = dVar.f189168c;
        boolean z12 = bVar.getF189194a() instanceof MessageBody.Location;
        C31915a c31915a2 = this.f192142a;
        String str15 = this.f192147f;
        String str16 = this.f192146e;
        String str17 = "l";
        String str18 = this.f192145d;
        U0 u02 = this.f192144c;
        String str19 = "size";
        if (z12) {
            MessageBody.Location location2 = (MessageBody.Location) bVar.getF189194a();
            if (u02.v().invoke().booleanValue()) {
                double latitude = location2.getLatitude();
                double longitude = location2.getLongitude();
                u0 u0Var = u0.f406856a;
                location = location2;
                uriBuild2 = new Uri.Builder().scheme(Constants.SCHEME).authority("static-maps.yandex.ru").appendPath("1.x").appendPath("").appendQueryParameter("size", "450,450").appendQueryParameter("pt", String.format(Locale.UK, "%.6f,%.6f,%s", Arrays.copyOf(new Object[]{Double.valueOf(longitude), Double.valueOf(latitude), "pm2lbl"}, 3))).appendQueryParameter("lang", str18).appendQueryParameter("l", "map").appendQueryParameter("z", "14").build();
            } else {
                location = location2;
                double latitude2 = location.getLatitude();
                double longitude2 = location.getLongitude();
                u0 u0Var2 = u0.f406856a;
                uriBuild2 = new Uri.Builder().scheme(Constants.SCHEME).authority("maps.googleapis.com").appendPath("maps").appendPath("api").appendPath("staticmap").appendQueryParameter("size", "512x512").appendQueryParameter("markers", "color:0x00AAFF|".concat(String.format("%.6f,%.6f", Arrays.copyOf(new Object[]{Double.valueOf(latitude2), Double.valueOf(longitude2)}, 2)))).appendQueryParameter("language", str16).appendQueryParameter("region", str15).appendQueryParameter("key", c31915a2.f189256a).appendQueryParameter("zoom", "14").build();
            }
            return new com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.location_message.g(uriBuild2, location.getTitle());
        }
        if (!(bVar.getF189195a() instanceof MessageBody.SystemMessageBody.Platform.Bubble.GeoLocation)) {
            V2.f318762a.f(new NonFatalErrorEvent("LocationMessageDataBuilder: Unsupported bodyOrBubble: " + bVar, null, null, null, 14, null));
            return new com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.location_message.g(Uri.EMPTY, "");
        }
        MessageBody.SystemMessageBody.Platform.Bubble.GeoLocation geoLocation = (MessageBody.SystemMessageBody.Platform.Bubble.GeoLocation) bVar.getF189195a();
        GeoMarker[] markers = geoLocation.getMarkers();
        String str20 = "%.6f,%.6f";
        C c12 = this.f192143b;
        if (markers != null) {
            if (markers.length == 0) {
                markers = null;
            }
            if (markers != null) {
                if (u02.v().invoke().booleanValue()) {
                    StringBuilder sb2 = new StringBuilder((markers.length * 2) + 1);
                    int length = markers.length;
                    int i12 = 0;
                    int i13 = 0;
                    while (i13 < length) {
                        GeoMarker geoMarker = markers[i13];
                        int i14 = i12 + 1;
                        u0 u0Var3 = u0.f406856a;
                        int i15 = length;
                        String str21 = str19;
                        String str22 = str17;
                        sb2.append(String.format(Locale.UK, "%.6f,%.6f,%s", Arrays.copyOf(new Object[]{Double.valueOf(geoMarker.getLongitude()), Double.valueOf(geoMarker.getLatitude()), "pm2lbl"}, 3)));
                        if (i12 < markers.length - 1) {
                            sb2.append('~');
                        }
                        i13++;
                        i12 = i14;
                        length = i15;
                        str19 = str21;
                        str17 = str22;
                    }
                    Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(Constants.SCHEME).authority("enterprise.static-maps.yandex.ru").appendPath("1.x").appendPath("").appendQueryParameter("key", c12.f189255a).appendQueryParameter(str17, "map").appendQueryParameter(str19, "512,384").appendQueryParameter("lang", str18).appendQueryParameter("pt", String.valueOf(sb2));
                    if (markers.length <= 1) {
                        builderAppendQueryParameter = builderAppendQueryParameter.appendQueryParameter("z", "14");
                    }
                    uriBuild = builderAppendQueryParameter.build();
                } else {
                    StringBuilder sb3 = new StringBuilder((markers.length * 2) + 1);
                    int length2 = markers.length;
                    int i16 = 0;
                    int i17 = 0;
                    while (i16 < length2) {
                        GeoMarker geoMarker2 = markers[i16];
                        int i18 = i17 + 1;
                        u0 u0Var4 = u0.f406856a;
                        String str23 = str20;
                        sb3.append(String.format(str23, Arrays.copyOf(new Object[]{Double.valueOf(geoMarker2.getLatitude()), Double.valueOf(geoMarker2.getLongitude())}, 2)));
                        if (i17 < markers.length - 1) {
                            sb3.append('|');
                        }
                        i16++;
                        i17 = i18;
                        str20 = str23;
                    }
                    Uri.Builder builderAppendQueryParameter2 = new Uri.Builder().scheme(Constants.SCHEME).authority("maps.googleapis.com").appendPath("maps").appendPath("api").appendPath("staticmap").appendQueryParameter("size", "512x384").appendQueryParameter("markers", "color:0x00AAFF|" + ((Object) sb3)).appendQueryParameter("language", str16).appendQueryParameter("region", str15).appendQueryParameter("key", c31915a2.f189256a);
                    if (markers.length <= 1) {
                        builderAppendQueryParameter2 = builderAppendQueryParameter2.appendQueryParameter("zoom", "14");
                    }
                    uriBuild = builderAppendQueryParameter2.build();
                }
                return new com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.location_message.g(uriBuild, geoLocation.getTitle());
            }
            str12 = "512,384";
            str13 = "l";
            str14 = "size";
            str2 = "enterprise.static-maps.yandex.ru";
            str3 = str18;
            str4 = "512x384";
            str5 = "z";
            str = "lang";
            str6 = "maps";
            str7 = "maps.googleapis.com";
            c31915a = c31915a2;
            str8 = str15;
            str9 = "region";
            str10 = str16;
            str11 = "language";
        } else {
            str = "lang";
            str2 = "enterprise.static-maps.yandex.ru";
            str3 = str18;
            str4 = "512x384";
            str5 = "z";
            str6 = "maps";
            str7 = "maps.googleapis.com";
            c31915a = c31915a2;
            str8 = str15;
            str9 = "region";
            str10 = str16;
            str11 = "language";
            str12 = "512,384";
            str13 = "l";
            str14 = "size";
        }
        boolean zBooleanValue = u02.v().invoke().booleanValue();
        String str24 = str5;
        String str25 = str6;
        String str26 = str7;
        String str27 = str2;
        String str28 = this.f192149h;
        GeoMarker geoMarker3 = this.f192148g;
        if (zBooleanValue) {
            Uri.Builder builderAppendQueryParameter3 = new Uri.Builder().scheme(Constants.SCHEME).authority(str27).appendPath("1.x").appendPath("").appendQueryParameter(str13, "map").appendQueryParameter("key", c12.f189255a).appendQueryParameter(str, str3).appendQueryParameter(str14, str12);
            u0 u0Var5 = u0.f406856a;
            uriBuild = builderAppendQueryParameter3.appendQueryParameter("ll", String.format(Locale.UK, str20, Arrays.copyOf(new Object[]{Double.valueOf(geoMarker3.getLatitude()), Double.valueOf(geoMarker3.getLongitude())}, 2))).appendQueryParameter(str24, str28).build();
        } else {
            Uri.Builder builderAppendQueryParameter4 = new Uri.Builder().scheme(Constants.SCHEME).authority(str26).appendPath(str25).appendPath("api").appendPath("staticmap").appendQueryParameter(str14, str4);
            u0 u0Var6 = u0.f406856a;
            uriBuild = builderAppendQueryParameter4.appendQueryParameter("center", String.format(Locale.UK, str20, Arrays.copyOf(new Object[]{Double.valueOf(geoMarker3.getLatitude()), Double.valueOf(geoMarker3.getLongitude())}, 2))).appendQueryParameter("zoom", str28).appendQueryParameter(str11, str10).appendQueryParameter(str9, str8).appendQueryParameter("key", c31915a.f189256a).build();
        }
        return new com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.location_message.g(uriBuild, geoLocation.getTitle());
    }
}
