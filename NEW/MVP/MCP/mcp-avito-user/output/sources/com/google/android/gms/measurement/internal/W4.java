package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.InterfaceC36753g;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class W4 extends AbstractC36990v5 {

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f354972d;

    /* renamed from: e, reason: collision with root package name */
    public final C36911k2 f354973e;

    /* renamed from: f, reason: collision with root package name */
    public final C36911k2 f354974f;

    /* renamed from: g, reason: collision with root package name */
    public final C36911k2 f354975g;

    /* renamed from: h, reason: collision with root package name */
    public final C36911k2 f354976h;

    /* renamed from: i, reason: collision with root package name */
    public final C36911k2 f354977i;

    public W4(C36997w5 c36997w5) {
        super(c36997w5);
        this.f354972d = new HashMap();
        this.f354973e = new C36911k2(super.b(), "last_delete_stale", 0L);
        this.f354974f = new C36911k2(super.b(), "backoff", 0L);
        this.f354975g = new C36911k2(super.b(), "last_upload", 0L);
        this.f354976h = new C36911k2(super.b(), "last_upload_attempt", 0L);
        this.f354977i = new C36911k2(super.b(), "midnight_offset", 0L);
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3
    @Pure
    public final /* bridge */ /* synthetic */ C36876f2 b() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.C36969s5
    public final /* bridge */ /* synthetic */ G5 f() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.C36969s5
    public final /* bridge */ /* synthetic */ C36908k g() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC36990v5
    public final boolean k() {
        return false;
    }

    @j.l0
    @Deprecated
    public final String l(String str, boolean z12) throws NoSuchAlgorithmException {
        super.e();
        String str2 = z12 ? (String) m(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestT0 = N5.t0();
        if (messageDigestT0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestT0.digest(str2.getBytes())));
    }

    @j.l0
    @Deprecated
    public final Pair<String, Boolean> m(String str) {
        Z4 z42;
        AdvertisingIdClient.Info advertisingIdInfo;
        super.e();
        I2 i22 = this.f355183a;
        i22.f354722n.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f354972d;
        Z4 z43 = (Z4) map.get(str);
        if (z43 != null && jElapsedRealtime < z43.f355013c) {
            return new Pair<>(z43.f355011a, Boolean.valueOf(z43.f355012b));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        C36880g c36880g = i22.f354715g;
        c36880g.getClass();
        long jL2 = c36880g.l(str, E.f354611c) + jElapsedRealtime;
        try {
            long jL3 = c36880g.l(str, E.f354613d);
            Context context = i22.f354709a;
            if (jL3 > 0) {
                try {
                    advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                } catch (PackageManager.NameNotFoundException unused) {
                    if (z43 != null && jElapsedRealtime < z43.f355013c + jL3) {
                        return new Pair<>(z43.f355011a, Boolean.valueOf(z43.f355012b));
                    }
                    advertisingIdInfo = null;
                }
            } else {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            }
        } catch (Exception e12) {
            super.zzj().f354896m.c("Unable to get advertising id", e12);
            z42 = new Z4("", false, jL2);
        }
        if (advertisingIdInfo == null) {
            return new Pair<>("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String id2 = advertisingIdInfo.getId();
        z42 = id2 != null ? new Z4(id2, advertisingIdInfo.isLimitAdTrackingEnabled(), jL2) : new Z4("", advertisingIdInfo.isLimitAdTrackingEnabled(), jL2);
        map.put(str, z42);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(z42.f355011a, Boolean.valueOf(z42.f355012b));
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final Context zza() {
        return this.f355183a.f354709a;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final InterfaceC36753g zzb() {
        return this.f355183a.f354722n;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final C36852c zzd() {
        return this.f355183a.f354714f;
    }
}
