package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.collection.C20199a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.json.JSONException;

@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new A();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final Bundle f361825b;

    /* renamed from: c, reason: collision with root package name */
    public C20199a f361826c;

    public static class b {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public static class d {
        public d(v vVar, a aVar) throws JSONException, NumberFormatException {
            vVar.h("gcm.n.title");
            vVar.f("gcm.n.title");
            Object[] objArrE = vVar.e("gcm.n.title");
            if (objArrE != null) {
                String[] strArr = new String[objArrE.length];
                for (int i12 = 0; i12 < objArrE.length; i12++) {
                    strArr[i12] = String.valueOf(objArrE[i12]);
                }
            }
            vVar.h("gcm.n.body");
            vVar.f("gcm.n.body");
            Object[] objArrE2 = vVar.e("gcm.n.body");
            if (objArrE2 != null) {
                String[] strArr2 = new String[objArrE2.length];
                for (int i13 = 0; i13 < objArrE2.length; i13++) {
                    strArr2[i13] = String.valueOf(objArrE2[i13]);
                }
            }
            vVar.h("gcm.n.icon");
            if (TextUtils.isEmpty(vVar.h("gcm.n.sound2"))) {
                vVar.h("gcm.n.sound");
            }
            vVar.h("gcm.n.tag");
            vVar.h("gcm.n.color");
            vVar.h("gcm.n.click_action");
            vVar.h("gcm.n.android_channel_id");
            String strH = vVar.h("gcm.n.link_android");
            strH = TextUtils.isEmpty(strH) ? vVar.h("gcm.n.link") : strH;
            if (!TextUtils.isEmpty(strH)) {
                Uri.parse(strH);
            }
            vVar.h("gcm.n.image");
            vVar.h("gcm.n.ticker");
            vVar.b("gcm.n.notification_priority");
            vVar.b("gcm.n.visibility");
            vVar.b("gcm.n.notification_count");
            vVar.a("gcm.n.sticky");
            vVar.a("gcm.n.local_only");
            vVar.a("gcm.n.default_sound");
            vVar.a("gcm.n.default_vibrate_timings");
            vVar.a("gcm.n.default_light_settings");
            String strH2 = vVar.h("gcm.n.event_time");
            if (!TextUtils.isEmpty(strH2)) {
                try {
                    Long.parseLong(strH2);
                } catch (NumberFormatException unused) {
                    v.l("gcm.n.event_time");
                }
            }
            vVar.d();
            vVar.i();
        }
    }

    @SafeParcelable.b
    public RemoteMessage(@SafeParcelable.e Bundle bundle) {
        this.f361825b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.a(parcel, 2, this.f361825b, false);
        TX0.a.p(parcel, iO2);
    }
}
