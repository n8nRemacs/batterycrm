package com.google.android.gms.internal.mlkit_vision_face_bundled;

import I41.h;
import android.content.Context;
import androidx.camera.core.Q;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zze extends zzi {

    /* renamed from: a, reason: collision with root package name */
    public final Context f353547a;

    /* renamed from: b, reason: collision with root package name */
    @h
    public final zzax f353548b;

    public zze(Context context, @h zzax zzaxVar) {
        this.f353547a = context;
        this.f353548b = zzaxVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzi
    public final Context a() {
        return this.f353547a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzi
    @h
    public final zzax b() {
        return this.f353548b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzi) {
            zzi zziVar = (zzi) obj;
            if (this.f353547a.equals(zziVar.a()) && this.f353548b.equals(zziVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f353547a.hashCode() ^ 1000003) * 1000003) ^ this.f353548b.hashCode();
    }

    public final String toString() {
        return Q.a("FlagsContext{context=", this.f353547a.toString(), ", hermeticFileOverrides=", this.f353548b.toString(), "}");
    }
}
