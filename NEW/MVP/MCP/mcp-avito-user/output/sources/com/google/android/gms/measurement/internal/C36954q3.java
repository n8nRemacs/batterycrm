package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.measurement.zzdd;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
@j.k0
/* renamed from: com.google.android.gms.measurement.internal.q3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36954q3 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f355320a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final String f355321b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public final String f355322c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public final String f355323d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public final Boolean f355324e;

    /* renamed from: f, reason: collision with root package name */
    public final long f355325f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public final zzdd f355326g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f355327h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    public final Long f355328i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    public final String f355329j;

    @j.k0
    public C36954q3(Context context, @j.P zzdd zzddVar, @j.P Long l12) {
        this.f355327h = true;
        C36729v.j(context);
        Context applicationContext = context.getApplicationContext();
        C36729v.j(applicationContext);
        this.f355320a = applicationContext;
        this.f355328i = l12;
        if (zzddVar != null) {
            this.f355326g = zzddVar;
            this.f355321b = zzddVar.zzf;
            this.f355322c = zzddVar.zze;
            this.f355323d = zzddVar.zzd;
            this.f355327h = zzddVar.zzc;
            this.f355325f = zzddVar.zzb;
            this.f355329j = zzddVar.zzh;
            Bundle bundle = zzddVar.zzg;
            if (bundle != null) {
                this.f355324e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
