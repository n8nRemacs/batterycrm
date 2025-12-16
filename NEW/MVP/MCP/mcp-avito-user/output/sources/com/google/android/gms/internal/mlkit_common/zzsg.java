package com.google.android.gms.internal.mlkit_common;

import com.google.mlkit.common.sdkinternal.ModelType;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
final class zzsg extends zzst {

    /* renamed from: a, reason: collision with root package name */
    public zznf f351710a;

    /* renamed from: b, reason: collision with root package name */
    public String f351711b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f351712c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f351713d;

    /* renamed from: e, reason: collision with root package name */
    public ModelType f351714e;

    /* renamed from: f, reason: collision with root package name */
    public zznl f351715f;

    /* renamed from: g, reason: collision with root package name */
    public int f351716g;

    /* renamed from: h, reason: collision with root package name */
    public byte f351717h;

    @Override // com.google.android.gms.internal.mlkit_common.zzst
    public final zzst zza(zznl zznlVar) {
        if (zznlVar == null) {
            throw new NullPointerException("Null downloadStatus");
        }
        this.f351715f = zznlVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzst
    public final zzst zzb(zznf zznfVar) {
        if (zznfVar == null) {
            throw new NullPointerException("Null errorCode");
        }
        this.f351710a = zznfVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzst
    public final zzst zzc(int i12) {
        this.f351716g = i12;
        this.f351717h = (byte) (this.f351717h | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzst
    public final zzst zzd(ModelType modelType) {
        if (modelType == null) {
            throw new NullPointerException("Null modelType");
        }
        this.f351714e = modelType;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzst
    public final zzst zze(boolean z12) {
        this.f351713d = z12;
        this.f351717h = (byte) (this.f351717h | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzst
    public final zzst zzf(boolean z12) {
        this.f351712c = z12;
        this.f351717h = (byte) (this.f351717h | 1);
        return this;
    }

    public final zzst zzg(String str) {
        this.f351711b = "NA";
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzst
    public final zzsu zzh() {
        zznf zznfVar;
        String str;
        ModelType modelType;
        zznl zznlVar;
        if (this.f351717h == 7 && (zznfVar = this.f351710a) != null && (str = this.f351711b) != null && (modelType = this.f351714e) != null && (zznlVar = this.f351715f) != null) {
            return new zzsi(zznfVar, str, this.f351712c, this.f351713d, modelType, zznlVar, this.f351716g, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f351710a == null) {
            sb2.append(" errorCode");
        }
        if (this.f351711b == null) {
            sb2.append(" tfliteSchemaVersion");
        }
        if ((this.f351717h & 1) == 0) {
            sb2.append(" shouldLogRoughDownloadTime");
        }
        if ((this.f351717h & 2) == 0) {
            sb2.append(" shouldLogExactDownloadTime");
        }
        if (this.f351714e == null) {
            sb2.append(" modelType");
        }
        if (this.f351715f == null) {
            sb2.append(" downloadStatus");
        }
        if ((this.f351717h & 4) == 0) {
            sb2.append(" failureStatusCode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
