package TZ0;

import TZ0.f;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.android.gms.internal.mlkit_vision_face.zzd;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzn;
import com.google.android.gms.internal.mlkit_vision_face.zzos;
import com.google.android.gms.internal.mlkit_vision_face.zzow;
import com.google.android.gms.internal.mlkit_vision_face.zzpc;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;
import j.N;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
@J41.b
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f15704a;

    /* renamed from: b, reason: collision with root package name */
    public int f15705b;

    /* renamed from: c, reason: collision with root package name */
    public final float f15706c;

    /* renamed from: d, reason: collision with root package name */
    public final float f15707d;

    /* renamed from: e, reason: collision with root package name */
    public final float f15708e;

    /* renamed from: f, reason: collision with root package name */
    public final float f15709f;

    /* renamed from: g, reason: collision with root package name */
    public final float f15710g;

    /* renamed from: h, reason: collision with root package name */
    public final float f15711h;

    /* renamed from: i, reason: collision with root package name */
    public final SparseArray f15712i = new SparseArray();

    /* renamed from: j, reason: collision with root package name */
    public final SparseArray f15713j = new SparseArray();

    public a(@N zzf zzfVar) {
        float f12 = zzfVar.zzc;
        float f13 = zzfVar.zze / 2.0f;
        float f14 = zzfVar.zzd;
        float f15 = zzfVar.zzf / 2.0f;
        this.f15704a = new Rect((int) (f12 - f13), (int) (f14 - f15), (int) (f12 + f13), (int) (f14 + f15));
        this.f15705b = zzfVar.zzb;
        for (zzn zznVar : zzfVar.zzj) {
            if (a(zznVar.zzd)) {
                PointF pointF = new PointF(zznVar.zzb, zznVar.zzc);
                SparseArray sparseArray = this.f15712i;
                int i12 = zznVar.zzd;
                sparseArray.put(i12, new f(i12, pointF));
            }
        }
        for (zzd zzdVar : zzfVar.zzn) {
            int i13 = zzdVar.zzb;
            if (i13 <= 15 && i13 > 0) {
                PointF[] pointFArr = zzdVar.zza;
                pointFArr.getClass();
                long length = pointFArr.length + 5 + (r5 / 10);
                ArrayList arrayList = new ArrayList(length > 2147483647L ? Integer.MAX_VALUE : (int) length);
                Collections.addAll(arrayList, pointFArr);
                this.f15713j.put(i13, new b(i13, arrayList));
            }
        }
        this.f15709f = zzfVar.zzi;
        this.f15710g = zzfVar.zzg;
        this.f15711h = zzfVar.zzh;
        this.f15708e = zzfVar.zzm;
        this.f15707d = zzfVar.zzk;
        this.f15706c = zzfVar.zzl;
    }

    public static boolean a(@f.a int i12) {
        return i12 == 0 || i12 == 1 || i12 == 7 || i12 == 3 || i12 == 9 || i12 == 4 || i12 == 10 || i12 == 5 || i12 == 11 || i12 == 6;
    }

    @N
    public final String toString() {
        zzv zzvVarZza = zzw.zza("Face");
        zzvVarZza.zzc("boundingBox", this.f15704a);
        zzvVarZza.zzb("trackingId", this.f15705b);
        zzvVarZza.zza("rightEyeOpenProbability", this.f15706c);
        zzvVarZza.zza("leftEyeOpenProbability", this.f15707d);
        zzvVarZza.zza("smileProbability", this.f15708e);
        zzvVarZza.zza("eulerX", this.f15709f);
        zzvVarZza.zza("eulerY", this.f15710g);
        zzvVarZza.zza("eulerZ", this.f15711h);
        zzv zzvVarZza2 = zzw.zza("Landmarks");
        for (int i12 = 0; i12 <= 11; i12++) {
            if (a(i12)) {
                zzvVarZza2.zzc(AK.c.g(i12, "landmark_"), (f) this.f15712i.get(i12));
            }
        }
        zzvVarZza.zzc("landmarks", zzvVarZza2.toString());
        zzv zzvVarZza3 = zzw.zza("Contours");
        for (int i13 = 1; i13 <= 15; i13++) {
            zzvVarZza3.zzc(AK.c.g(i13, "Contour_"), (b) this.f15713j.get(i13));
        }
        zzvVarZza.zzc("contours", zzvVarZza3.toString());
        return zzvVarZza.toString();
    }

    public a(@N zzow zzowVar) {
        this.f15704a = zzowVar.zzh();
        this.f15705b = zzowVar.zzg();
        for (zzpc zzpcVar : zzowVar.zzj()) {
            if (a(zzpcVar.zza())) {
                this.f15712i.put(zzpcVar.zza(), new f(zzpcVar.zza(), zzpcVar.zzb()));
            }
        }
        for (zzos zzosVar : zzowVar.zzi()) {
            int iZza = zzosVar.zza();
            if (iZza <= 15 && iZza > 0) {
                List listZzb = zzosVar.zzb();
                listZzb.getClass();
                this.f15713j.put(iZza, new b(iZza, new ArrayList(listZzb)));
            }
        }
        this.f15709f = zzowVar.zzf();
        this.f15710g = zzowVar.zzb();
        this.f15711h = -zzowVar.zzd();
        this.f15708e = zzowVar.zze();
        this.f15707d = zzowVar.zza();
        this.f15706c = zzowVar.zzc();
    }
}
