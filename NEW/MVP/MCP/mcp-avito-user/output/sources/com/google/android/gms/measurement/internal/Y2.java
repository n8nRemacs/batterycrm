package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.measurement.zzns;
import com.google.android.gms.measurement.internal.zzif;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
final class Y2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzo f354992b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M2 f354993c;

    public Y2(M2 m22, zzo zzoVar) {
        this.f354992b = zzoVar;
        this.f354993c = m22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        M2 m22 = this.f354993c;
        m22.f354801a.Q();
        C36997w5 c36997w5 = m22.f354801a;
        c36997w5.zzl().e();
        c36997w5.R();
        zzo zzoVar = this.f354992b;
        C36729v.f(zzoVar.f355567b);
        zzif zzifVarB = zzif.b((zzns.zza() && c36997w5.K().o(null, E.f354581K0)) ? zzoVar.f355562B : 100, zzoVar.f355588w);
        String str = zzoVar.f355567b;
        zzif zzifVarA = c36997w5.A(str);
        c36997w5.zzj().f354897n.a(str, "Setting consent, package, consent", zzifVarB);
        c36997w5.r(str, zzifVarB);
        if (zzifVarB.h(zzifVarA, (zzif.zza[]) zzifVarB.f355543a.keySet().toArray(new zzif.zza[0]))) {
            c36997w5.J(zzoVar);
        }
        if (zzns.zza()) {
            C36880g c36880gK = c36997w5.K();
            J1<Boolean> j12 = E.f354581K0;
            if (c36880gK.o(null, j12)) {
                C36977u c36977uB = C36977u.b(zzoVar.f355563C);
                if (C36977u.f355389f.equals(c36977uB)) {
                    return;
                }
                c36997w5.zzj().f354897n.a(str, "Setting DMA consent. package, consent", c36977uB);
                c36997w5.zzl().e();
                c36997w5.R();
                if (zzns.zza()) {
                    c36997w5.f355433C.put(str, c36977uB);
                    C36908k c36908k = c36997w5.f355440c;
                    C36997w5.n(c36908k);
                    if (zzns.zza() && c36908k.f355183a.f354715g.o(null, j12)) {
                        C36729v.j(c36977uB);
                        c36908k.e();
                        c36908k.i();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
                        contentValues.put("dma_consent_settings", c36977uB.f355391b);
                        c36908k.x(contentValues);
                    }
                }
            }
        }
    }
}
