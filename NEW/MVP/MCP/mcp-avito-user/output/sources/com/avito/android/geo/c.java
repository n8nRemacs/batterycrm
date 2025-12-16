package com.avito.android.geo;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.os.Parcelable;
import com.avito.android.location.find.C31504b;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.K;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: GeoBroadcastReceiver.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/geo/c;", "Landroid/content/BroadcastReceiver;", "a", "_avito_geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f159300b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C31504b f159301a;

    /* compiled from: GeoBroadcastReceiver.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/geo/c$a;", "", "<init>", "()V", "", "ACTION", "Ljava/lang/String;", "EVENT_LOCATION_IMPROVED", "EVENT_UPDATE_FINISHED", "EXTRA_EVENT", "EXTRA_LOCATION", "_avito_geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@Y61.k C31504b c31504b) {
        this.f159301a = c31504b;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@Y61.k Context context, @Y61.k Intent intent) {
        K<Location> k12;
        String stringExtra = intent.getStringExtra("event");
        Location location = (Location) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("location", Location.class) : intent.getParcelableExtra("location"));
        String strValueOf = String.valueOf(stringExtra);
        boolean zEquals = strValueOf.equals("location_improved");
        C31504b c31504b = this.f159301a;
        if (zEquals) {
            if (location == null) {
                c31504b.getClass();
                return;
            }
            com.avito.android.location.find.c cVar = c31504b.f181744b;
            WeakReference<Activity> weakReference = cVar.f181747c;
            if ((weakReference != null ? weakReference.get() : null) == null || (k12 = cVar.f181746b) == null) {
                return;
            }
            k12.onSuccess(location);
            return;
        }
        if (strValueOf.equals("update_finished")) {
            if (location == null) {
                c31504b.getClass();
                return;
            }
            com.avito.android.location.find.c cVar2 = c31504b.f181744b;
            WeakReference<Activity> weakReference2 = cVar2.f181747c;
            if ((weakReference2 != null ? weakReference2.get() : null) == null) {
                return;
            }
            cVar2.f181745a.m(location);
            V2.f318762a.b("Get gps coordinates: " + location, null);
            K<Location> k13 = cVar2.f181746b;
            if (k13 != null) {
                k13.onSuccess(location);
            }
        }
    }
}
