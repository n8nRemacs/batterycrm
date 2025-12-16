package com.google.android.gms.internal.mlkit_common;

import AK.c;
import androidx.appcompat.app.r;
import com.google.mlkit.common.sdkinternal.ModelType;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
final class zzsi extends zzsu {

    /* renamed from: a, reason: collision with root package name */
    public final zznf f351718a;

    /* renamed from: b, reason: collision with root package name */
    public final String f351719b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f351720c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f351721d;

    /* renamed from: e, reason: collision with root package name */
    public final ModelType f351722e;

    /* renamed from: f, reason: collision with root package name */
    public final zznl f351723f;

    /* renamed from: g, reason: collision with root package name */
    public final int f351724g;

    public /* synthetic */ zzsi(zznf zznfVar, String str, boolean z12, boolean z13, ModelType modelType, zznl zznlVar, int i12, zzsh zzshVar) {
        this.f351718a = zznfVar;
        this.f351719b = str;
        this.f351720c = z12;
        this.f351721d = z13;
        this.f351722e = modelType;
        this.f351723f = zznlVar;
        this.f351724g = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzsu) {
            zzsu zzsuVar = (zzsu) obj;
            if (this.f351718a.equals(zzsuVar.zzc()) && this.f351719b.equals(zzsuVar.zze()) && this.f351720c == zzsuVar.zzg() && this.f351721d == zzsuVar.zzf() && this.f351722e.equals(zzsuVar.zzb()) && this.f351723f.equals(zzsuVar.zzd()) && this.f351724g == zzsuVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.f351718a.hashCode() ^ 1000003) * 1000003) ^ this.f351719b.hashCode()) * 1000003) ^ (true != this.f351720c ? 1237 : 1231)) * 1000003) ^ (true != this.f351721d ? 1237 : 1231)) * 1000003) ^ this.f351722e.hashCode()) * 1000003) ^ this.f351723f.hashCode()) * 1000003) ^ this.f351724g;
    }

    public final String toString() {
        String string = this.f351718a.toString();
        String string2 = this.f351722e.toString();
        String string3 = this.f351723f.toString();
        StringBuilder sbA = r.A("RemoteModelLoggingOptions{errorCode=", string, ", tfliteSchemaVersion=");
        sbA.append(this.f351719b);
        sbA.append(", shouldLogRoughDownloadTime=");
        sbA.append(this.f351720c);
        sbA.append(", shouldLogExactDownloadTime=");
        sbA.append(this.f351721d);
        sbA.append(", modelType=");
        sbA.append(string2);
        sbA.append(", downloadStatus=");
        sbA.append(string3);
        sbA.append(", failureStatusCode=");
        return c.i(this.f351724g, "}", sbA);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsu
    public final int zza() {
        return this.f351724g;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsu
    public final ModelType zzb() {
        return this.f351722e;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsu
    public final zznf zzc() {
        return this.f351718a;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsu
    public final zznl zzd() {
        return this.f351723f;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsu
    public final String zze() {
        return this.f351719b;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsu
    public final boolean zzf() {
        return this.f351721d;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsu
    public final boolean zzg() {
        return this.f351720c;
    }
}
