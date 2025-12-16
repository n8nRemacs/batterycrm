package com.huawei.hms.push;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class RemoteMessage implements Parcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR;

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap<String, Object> f363598d;

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap<String, Object> f363599e;

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap<String, Object> f363600f;

    /* renamed from: g, reason: collision with root package name */
    public static final HashMap<String, Object> f363601g;

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap<String, Object> f363602h;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f363603b;

    /* renamed from: c, reason: collision with root package name */
    public c f363604c;

    public static class a {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static class c implements Serializable {
        public c(Bundle bundle, d dVar) {
            bundle.getString("notifyTitle");
            bundle.getString("content");
            bundle.getString("title_loc_key");
            bundle.getString("body_loc_key");
            bundle.getStringArray("title_loc_args");
            bundle.getStringArray("body_loc_args");
            bundle.getString("icon");
            bundle.getString("color");
            bundle.getString("sound");
            bundle.getString("tag");
            bundle.getString("channelId");
            bundle.getString("acn");
            bundle.getString("intentUri");
            bundle.getInt("notifyId");
            String string = bundle.getString(ContextActionHandler.Link.URL);
            if (!TextUtils.isEmpty(string)) {
                Uri.parse(string);
            }
            bundle.getString("notifyIcon");
            bundle.getInt("defaultLightSettings");
            bundle.getInt("defaultSound");
            bundle.getInt("defaultVibrateTimings");
            bundle.getIntArray("lightSettings");
            bundle.getString("when");
            bundle.getInt("localOnly");
            bundle.getString("badgeSetNum", null);
            bundle.getInt("autoCancel");
            bundle.getString("priority", null);
            bundle.getString("ticker");
            bundle.getLongArray("vibrateTimings");
            bundle.getString("visibility", null);
        }
    }

    public static class d implements Parcelable.Creator<RemoteMessage> {
        @Override // android.os.Parcelable.Creator
        public final RemoteMessage createFromParcel(Parcel parcel) {
            RemoteMessage remoteMessage = new RemoteMessage();
            remoteMessage.f363603b = parcel.readBundle();
            remoteMessage.f363604c = (c) parcel.readSerializable();
            return remoteMessage;
        }

        @Override // android.os.Parcelable.Creator
        public final RemoteMessage[] newArray(int i12) {
            return new RemoteMessage[i12];
        }
    }

    static {
        String[] strArr = new String[0];
        HashMap<String, Object> map = new HashMap<>(8);
        f363598d = map;
        map.put(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "");
        map.put("collapseKey", "");
        map.put("sendTime", "");
        map.put("ttl", 86400);
        map.put("urgency", 2);
        map.put("oriUrgency", 2);
        map.put("sendMode", 0);
        map.put("receiptMode", 0);
        HashMap<String, Object> map2 = new HashMap<>(8);
        f363599e = map2;
        map2.put("title_loc_key", "");
        map2.put("body_loc_key", "");
        map2.put("notifyIcon", "");
        map2.put("title_loc_args", strArr);
        map2.put("body_loc_args", strArr);
        map2.put("ticker", "");
        map2.put("notifyTitle", "");
        map2.put("content", "");
        HashMap<String, Object> map3 = new HashMap<>(8);
        f363600f = map3;
        map3.put("icon", "");
        map3.put("color", "");
        map3.put("sound", "");
        map3.put("defaultLightSettings", 1);
        map3.put("lightSettings", new int[0]);
        map3.put("defaultSound", 1);
        map3.put("defaultVibrateTimings", 1);
        map3.put("vibrateTimings", new long[0]);
        HashMap<String, Object> map4 = new HashMap<>(8);
        f363601g = map4;
        map4.put("tag", "");
        map4.put("when", "");
        map4.put("localOnly", 1);
        map4.put("badgeSetNum", "");
        map4.put("priority", "");
        map4.put("autoCancel", 1);
        map4.put("visibility", "");
        map4.put("channelId", "");
        HashMap<String, Object> map5 = new HashMap<>(3);
        f363602h = map5;
        map5.put("acn", "");
        map5.put("intentUri", "");
        map5.put(ContextActionHandler.Link.URL, "");
        CREATOR = new d();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeBundle(this.f363603b);
        parcel.writeSerializable(this.f363604c);
    }
}
