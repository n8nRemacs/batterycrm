package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzs;
import com.google.android.gms.internal.measurement.zzv;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.w2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C36994w2 implements zzv {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C36959r2 f355420a;

    public C36994w2(C36959r2 c36959r2) {
        this.f355420a = c36959r2;
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public final void zza(zzs zzsVar, String str, List<String> list, boolean z12, boolean z13) {
        int i12 = C37008y2.f355487a[zzsVar.ordinal()];
        C36959r2 c36959r2 = this.f355420a;
        U1 u12 = i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? c36959r2.zzj().f354895l : c36959r2.zzj().f354897n : z12 ? c36959r2.zzj().f354893j : !z13 ? c36959r2.zzj().f354894k : c36959r2.zzj().f354892i : z12 ? c36959r2.zzj().f354890g : !z13 ? c36959r2.zzj().f354891h : c36959r2.zzj().f354889f : c36959r2.zzj().f354896m;
        int size = list.size();
        if (size == 1) {
            u12.c(str, list.get(0));
            return;
        }
        if (size == 2) {
            u12.a(list.get(0), str, list.get(1));
        } else if (size != 3) {
            u12.b(str);
        } else {
            u12.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
