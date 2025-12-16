package com.google.mlkit.vision.barcode.internal;

import android.graphics.Point;
import android.graphics.Rect;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;
import j.P;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public final class n implements RZ0.a {

    /* renamed from: a, reason: collision with root package name */
    public final zzq f362437a;

    public n(zzq zzqVar) {
        this.f362437a = zzqVar;
    }

    @Override // RZ0.a
    public final int A() {
        return this.f362437a.zzd;
    }

    @Override // RZ0.a
    public final int w() {
        return this.f362437a.zza;
    }

    @Override // RZ0.a
    @P
    public final String x() {
        return this.f362437a.zzc;
    }

    @Override // RZ0.a
    @P
    public final Rect y() {
        zzq zzqVar = this.f362437a;
        if (zzqVar.zze == null) {
            return null;
        }
        int iMax = BeduinInputModel.MIN_TEXT_VERSION;
        int iMin = Integer.MAX_VALUE;
        int i12 = 0;
        int iMax2 = Integer.MIN_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        while (true) {
            Point[] pointArr = zzqVar.zze;
            if (i12 >= pointArr.length) {
                return new Rect(iMin2, iMin, iMax, iMax2);
            }
            Point point = pointArr[i12];
            iMin2 = Math.min(iMin2, point.x);
            iMax = Math.max(iMax, point.x);
            iMin = Math.min(iMin, point.y);
            iMax2 = Math.max(iMax2, point.y);
            i12++;
        }
    }

    @Override // RZ0.a
    @P
    public final Point[] z() {
        return this.f362437a.zze;
    }
}
