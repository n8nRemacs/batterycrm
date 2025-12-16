package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.measurement.internal.B2;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* loaded from: classes6.dex */
final class zzdi extends zzdf.zza {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f350630f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f350631g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Context f350632h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Bundle f350633i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ zzdf f350634j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdi(zzdf zzdfVar, String str, String str2, Context context, Bundle bundle) {
        super(true);
        this.f350630f = str;
        this.f350631g = str2;
        this.f350632h = context;
        this.f350633i = bundle;
        this.f350634j = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() throws ClassNotFoundException {
        boolean z12;
        String str;
        String str2;
        String str3;
        try {
            zzdf zzdfVar = this.f350634j;
            String str4 = this.f350630f;
            String str5 = this.f350631g;
            zzdfVar.getClass();
            if (str5 == null || str4 == null) {
                z12 = false;
            } else {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, zzdfVar.getClass().getClassLoader());
                    z12 = false;
                } catch (ClassNotFoundException unused) {
                    z12 = true;
                }
            }
            zzcu zzcuVarAsInterface = null;
            if (z12) {
                str3 = this.f350631g;
                str2 = this.f350630f;
                str = this.f350634j.f350612a;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            Context context = this.f350632h;
            zzdf zzdfVar2 = this.f350634j;
            zzdfVar2.getClass();
            try {
                zzcuVarAsInterface = zzct.asInterface(DynamiteModule.c(context, DynamiteModule.f349663d, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            } catch (DynamiteModule.LoadingException e12) {
                zzdfVar2.b(e12, true, false);
            }
            zzdfVar2.f350620i = zzcuVarAsInterface;
            if (this.f350634j.f350620i == null) {
                String str6 = this.f350634j.f350612a;
                return;
            }
            int iA2 = DynamiteModule.a(this.f350632h, ModuleDescriptor.MODULE_ID);
            zzdd zzddVar = new zzdd(84002L, Math.max(iA2, r0), DynamiteModule.d(this.f350632h, ModuleDescriptor.MODULE_ID, false) < iA2, str, str2, str3, this.f350633i, B2.a(this.f350632h));
            zzcu zzcuVar = this.f350634j.f350620i;
            C36729v.j(zzcuVar);
            zzcuVar.initialize(new f(this.f350632h), zzddVar, this.f350621b);
        } catch (Exception e13) {
            this.f350634j.b(e13, true, false);
        }
    }
}
