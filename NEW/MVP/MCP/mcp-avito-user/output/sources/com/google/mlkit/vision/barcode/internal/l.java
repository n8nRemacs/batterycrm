package com.google.mlkit.vision.barcode.internal;

import android.graphics.Point;
import android.graphics.Rect;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.android.gms.internal.mlkit_vision_barcode.zzon;
import j.P;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public final class l implements RZ0.a {

    /* renamed from: a, reason: collision with root package name */
    public final zzon f362428a;

    public l(zzon zzonVar) {
        this.f362428a = zzonVar;
    }

    @Override // RZ0.a
    public final int A() {
        return this.f362428a.zzb();
    }

    @Override // RZ0.a
    public final int w() {
        return this.f362428a.zza();
    }

    @Override // RZ0.a
    @P
    public final String x() {
        return this.f362428a.zzl();
    }

    @Override // RZ0.a
    @P
    public final Rect y() {
        Point[] pointArrZzo = this.f362428a.zzo();
        if (pointArrZzo == null) {
            return null;
        }
        int iMax = BeduinInputModel.MIN_TEXT_VERSION;
        int iMin = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        for (Point point : pointArrZzo) {
            iMin2 = Math.min(iMin2, point.x);
            iMax = Math.max(iMax, point.x);
            iMin = Math.min(iMin, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        return new Rect(iMin2, iMin, iMax, iMax2);
    }

    @Override // RZ0.a
    @P
    public final Point[] z() {
        return this.f362428a.zzo();
    }
}
