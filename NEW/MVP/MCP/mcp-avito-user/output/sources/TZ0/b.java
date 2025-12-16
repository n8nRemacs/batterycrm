package TZ0;

import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;
import j.N;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f15714a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f15715b;

    /* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
    @Retention(RetentionPolicy.CLASS)
    public @interface a {
    }

    public b(@a int i12, @N ArrayList arrayList) {
        this.f15714a = i12;
        this.f15715b = arrayList;
    }

    @N
    public final String toString() {
        zzv zzvVarZza = zzw.zza("FaceContour");
        zzvVarZza.zzb("type", this.f15714a);
        zzvVarZza.zzc("points", this.f15715b.toArray());
        return zzvVarZza.toString();
    }
}
