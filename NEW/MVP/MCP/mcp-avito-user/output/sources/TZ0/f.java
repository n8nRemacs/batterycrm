package TZ0;

import android.graphics.PointF;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;
import j.N;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f15728a;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f15729b;

    /* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
    @Retention(RetentionPolicy.CLASS)
    public @interface a {
    }

    public f(@a int i12, @N PointF pointF) {
        this.f15728a = i12;
        this.f15729b = pointF;
    }

    @N
    public final String toString() {
        zzv zzvVarZza = zzw.zza("FaceLandmark");
        zzvVarZza.zzb("type", this.f15728a);
        zzvVarZza.zzc("position", this.f15729b);
        return zzvVarZza.toString();
    }
}
