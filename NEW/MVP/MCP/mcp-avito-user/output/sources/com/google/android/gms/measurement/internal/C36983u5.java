package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.util.InterfaceC36753g;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzqa;
import java.util.HashMap;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.u5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36983u5 extends C36969s5 {
    @Override // com.google.android.gms.measurement.internal.C36891h3
    @Pure
    public final /* bridge */ /* synthetic */ C36876f2 b() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3
    @Pure
    public final /* bridge */ /* synthetic */ N5 c() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3
    public final /* bridge */ /* synthetic */ void e() {
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

    public final Uri.Builder i(String str) {
        String strB = super.h().B(str);
        Uri.Builder builder = new Uri.Builder();
        I2 i22 = this.f355183a;
        builder.scheme(i22.f354715g.m(str, E.f354604X));
        boolean zIsEmpty = TextUtils.isEmpty(strB);
        C36880g c36880g = i22.f354715g;
        if (zIsEmpty) {
            builder.authority(c36880g.m(str, E.f354605Y));
        } else {
            builder.authority(strB + "." + c36880g.m(str, E.f354605Y));
        }
        builder.path(c36880g.m(str, E.f354606Z));
        return builder;
    }

    public final C37004x5 j(String str) {
        if (zzqa.zza()) {
            C37004x5 c37004x5 = null;
            if (this.f355183a.f354715g.o(null, E.f354644s0)) {
                super.zzj().f354897n.b("sgtm feature flag enabled.");
                C36862d2 c36862d2S = super.g().S(str);
                if (c36862d2S == null) {
                    return new C37004x5(k(str));
                }
                if (c36862d2S.i()) {
                    super.zzj().f354897n.b("sgtm upload enabled in manifest.");
                    zzfc.zzd zzdVarW = super.h().w(c36862d2S.N());
                    if (zzdVarW != null && zzdVarW.zzr()) {
                        String strZzd = zzdVarW.zzh().zzd();
                        if (!TextUtils.isEmpty(strZzd)) {
                            String strZzc = zzdVarW.zzh().zzc();
                            super.zzj().f354897n.a(strZzd, "sgtm configured with upload_url, server_info", TextUtils.isEmpty(strZzc) ? "Y" : "N");
                            if (TextUtils.isEmpty(strZzc)) {
                                c37004x5 = new C37004x5(strZzd);
                            } else {
                                HashMap mapG = org.webrtc.h.g("x-google-sgtm-server-info", strZzc);
                                c37004x5 = new C37004x5();
                                c37004x5.f355480a = strZzd;
                                c37004x5.f355481b = mapG;
                            }
                        }
                    }
                }
                if (c37004x5 != null) {
                    return c37004x5;
                }
            }
        }
        return new C37004x5(k(str));
    }

    public final String k(String str) {
        String strB = super.h().B(str);
        if (TextUtils.isEmpty(strB)) {
            return E.f354643s.a(null);
        }
        Uri uri = Uri.parse(E.f354643s.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.authority(strB + "." + uri.getAuthority());
        return builderBuildUpon.build().toString();
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
