package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import androidx.collection.C20199a;
import androidx.collection.C20212g0;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzfc;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.x2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37001x2 extends C20212g0<String, zzb> {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C36959r2 f355478j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37001x2(C36959r2 c36959r2) {
        super(20);
        this.f355478j = c36959r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.C20212g0
    public final zzb a(String str) {
        String str2 = str;
        C36729v.f(str2);
        C36959r2 c36959r2 = this.f355478j;
        c36959r2.i();
        C36729v.f(str2);
        if (!TextUtils.isEmpty(str2)) {
            C20199a c20199a = c36959r2.f355344h;
            zzfc.zzd zzdVar = (zzfc.zzd) c20199a.get(str2);
            if (zzdVar != null && zzdVar.zza() != 0) {
                if (!c20199a.containsKey(str2) || c20199a.get(str2) == 0) {
                    c36959r2.O(str2);
                } else {
                    c36959r2.r(str2, (zzfc.zzd) c20199a.get(str2));
                }
                return c36959r2.f355346j.snapshot().get(str2);
            }
        }
        return null;
    }
}
