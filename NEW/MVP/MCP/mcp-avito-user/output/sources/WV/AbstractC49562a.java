package wV;

import Y61.k;
import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: DrawingDelegate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LwV/a;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wV.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC49562a {

    /* renamed from: a, reason: collision with root package name */
    public float f441457a;

    /* renamed from: b, reason: collision with root package name */
    public int f441458b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final float[] f441459c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final float[] f441460d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final float[] f441461e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final float[] f441462f;

    public AbstractC49562a() {
        float[] fArr = new float[8];
        for (int i12 = 0; i12 < 8; i12++) {
            fArr[i12] = 0.0f;
        }
        this.f441459c = fArr;
        float[] fArr2 = new float[8];
        for (int i13 = 0; i13 < 8; i13++) {
            fArr2[i13] = 0.0f;
        }
        this.f441460d = fArr2;
        float[] fArr3 = new float[8];
        for (int i14 = 0; i14 < 8; i14++) {
            fArr3[i14] = 0.0f;
        }
        this.f441461e = fArr3;
        float[] fArr4 = new float[8];
        for (int i15 = 0; i15 < 8; i15++) {
            fArr4[i15] = 0.0f;
        }
        this.f441462f = fArr4;
    }

    public abstract void a(@k Canvas canvas);

    public abstract void b(@k RectF rectF);

    public final void c(float f12) {
        float[] fArr = this.f441459c;
        fArr[0] = f12;
        fArr[1] = f12;
        fArr[6] = f12;
        fArr[7] = f12;
        float[] fArr2 = this.f441460d;
        fArr2[2] = f12;
        fArr2[3] = f12;
        fArr2[4] = f12;
        fArr2[5] = f12;
        float[] fArr3 = this.f441461e;
        Arrays.fill(fArr3, 0, fArr3.length, f12);
        this.f441457a = f12;
    }
}
