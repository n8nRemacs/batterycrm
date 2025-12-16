package TZ0;

import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;
import j.N;
import j.P;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    @d
    public final int f15716a;

    /* renamed from: b, reason: collision with root package name */
    @c
    public final int f15717b;

    /* renamed from: c, reason: collision with root package name */
    @b
    public final int f15718c;

    /* renamed from: d, reason: collision with root package name */
    @InterfaceC1076e
    public final int f15719d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15720e;

    /* renamed from: f, reason: collision with root package name */
    public final float f15721f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public final Executor f15722g;

    /* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @d
        public int f15723a = 1;

        /* renamed from: b, reason: collision with root package name */
        @c
        public int f15724b = 1;

        /* renamed from: c, reason: collision with root package name */
        @b
        public int f15725c = 1;

        /* renamed from: d, reason: collision with root package name */
        @InterfaceC1076e
        public int f15726d = 1;

        /* renamed from: e, reason: collision with root package name */
        public float f15727e = 0.1f;

        @N
        public final e a() {
            return new e(this.f15723a, this.f15724b, this.f15725c, this.f15726d, false, this.f15727e, null, null);
        }
    }

    /* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
    @Retention(RetentionPolicy.CLASS)
    public @interface b {
    }

    /* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
    @Retention(RetentionPolicy.CLASS)
    public @interface c {
    }

    /* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
    @Retention(RetentionPolicy.CLASS)
    public @interface d {
    }

    /* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: TZ0.e$e, reason: collision with other inner class name */
    public @interface InterfaceC1076e {
    }

    public /* synthetic */ e(int i12, int i13, int i14, int i15, boolean z12, float f12, Executor executor, h hVar) {
        this.f15716a = i12;
        this.f15717b = i13;
        this.f15718c = i14;
        this.f15719d = i15;
        this.f15720e = z12;
        this.f15721f = f12;
        this.f15722g = executor;
    }

    public final boolean equals(@P Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.floatToIntBits(this.f15721f) == Float.floatToIntBits(eVar.f15721f) && C36727t.a(Integer.valueOf(this.f15716a), Integer.valueOf(eVar.f15716a)) && C36727t.a(Integer.valueOf(this.f15717b), Integer.valueOf(eVar.f15717b)) && C36727t.a(Integer.valueOf(this.f15719d), Integer.valueOf(eVar.f15719d)) && C36727t.a(Boolean.valueOf(this.f15720e), Boolean.valueOf(eVar.f15720e)) && C36727t.a(Integer.valueOf(this.f15718c), Integer.valueOf(eVar.f15718c)) && C36727t.a(this.f15722g, eVar.f15722g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Float.floatToIntBits(this.f15721f)), Integer.valueOf(this.f15716a), Integer.valueOf(this.f15717b), Integer.valueOf(this.f15719d), Boolean.valueOf(this.f15720e), Integer.valueOf(this.f15718c), this.f15722g});
    }

    @N
    public final String toString() {
        zzv zzvVarZza = zzw.zza("FaceDetectorOptions");
        zzvVarZza.zzb("landmarkMode", this.f15716a);
        zzvVarZza.zzb("contourMode", this.f15717b);
        zzvVarZza.zzb("classificationMode", this.f15718c);
        zzvVarZza.zzb("performanceMode", this.f15719d);
        zzvVarZza.zzd("trackingEnabled", this.f15720e);
        zzvVarZza.zza("minFaceSize", this.f15721f);
        return zzvVarZza.toString();
    }
}
