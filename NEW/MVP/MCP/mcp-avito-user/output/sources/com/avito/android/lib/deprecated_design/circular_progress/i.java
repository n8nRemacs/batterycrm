package com.avito.android.lib.deprecated_design.circular_progress;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;
import com.avito.android.util.D1;
import kotlin.Metadata;

/* compiled from: DefaultCircularProgressDrawableDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/circular_progress/i;", "Lcom/avito/android/lib/deprecated_design/circular_progress/c;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f177903a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final int[] f177904b;

    /* renamed from: c, reason: collision with root package name */
    public final float f177905c;

    /* renamed from: d, reason: collision with root package name */
    public final float f177906d;

    /* renamed from: e, reason: collision with root package name */
    public int f177907e;

    /* renamed from: f, reason: collision with root package name */
    public int f177908f;

    /* renamed from: g, reason: collision with root package name */
    public float f177909g;

    /* renamed from: h, reason: collision with root package name */
    public float f177910h;

    /* renamed from: i, reason: collision with root package name */
    public float f177911i;

    /* renamed from: j, reason: collision with root package name */
    public float f177912j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f177913k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f177914l;

    /* renamed from: m, reason: collision with root package name */
    public final ValueAnimator f177915m;

    /* renamed from: n, reason: collision with root package name */
    public final ValueAnimator f177916n;

    /* renamed from: o, reason: collision with root package name */
    public final ValueAnimator f177917o;

    /* renamed from: p, reason: collision with root package name */
    public final ValueAnimator f177918p;

    public i(@Y61.k a aVar, @Y61.k n nVar) {
        final int i12 = 1;
        final int i13 = 0;
        final int i14 = 2;
        this.f177903a = aVar;
        LinearInterpolator linearInterpolator = nVar.f177924a;
        k kVar = nVar.f177925b;
        int[] iArr = nVar.f177927d;
        this.f177904b = iArr;
        float f12 = nVar.f177930g;
        this.f177905c = f12;
        float f13 = nVar.f177931h;
        this.f177906d = f13;
        this.f177907e = iArr[0];
        this.f177912j = 1.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.f177917o = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(linearInterpolator);
        ValueAnimator valueAnimator = this.f177917o;
        (valueAnimator == null ? null : valueAnimator).setDuration((long) (2000 / nVar.f177929f));
        ValueAnimator valueAnimator2 = this.f177917o;
        (valueAnimator2 == null ? null : valueAnimator2).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.avito.android.lib.deprecated_design.circular_progress.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f177900b;

            {
                this.f177900b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                float fC2;
                switch (i13) {
                    case 0:
                        float fB2 = r.b(valueAnimator3, true) * 360.0f;
                        i iVar = this.f177900b;
                        iVar.f177911i = fB2;
                        iVar.f177903a.b();
                        break;
                    case 1:
                        float fB3 = r.b(valueAnimator3, false);
                        i iVar2 = this.f177900b;
                        boolean z12 = iVar2.f177913k;
                        float f14 = iVar2.f177906d;
                        if (z12) {
                            fC2 = fB3 * f14;
                        } else {
                            float f15 = iVar2.f177905c;
                            fC2 = androidx.appcompat.app.r.c(f14, f15, fB3, f15);
                        }
                        iVar2.f177909g = fC2;
                        iVar2.f177903a.b();
                        break;
                    case 2:
                        float fB4 = r.b(valueAnimator3, false);
                        i iVar3 = this.f177900b;
                        float f16 = iVar3.f177905c;
                        float f17 = iVar3.f177906d;
                        iVar3.f177909g = f17 - ((f17 - f16) * fB4);
                        a aVar2 = iVar3.f177903a;
                        aVar2.b();
                        float currentPlayTime = valueAnimator3.getCurrentPlayTime() / valueAnimator3.getDuration();
                        int[] iArr2 = iVar3.f177904b;
                        if (iArr2.length > 1 && currentPlayTime > 0.7f) {
                            aVar2.f177883e.setColor(((Integer) j.f177919a.evaluate((currentPlayTime - 0.7f) / 0.3f, Integer.valueOf(iVar3.f177907e), Integer.valueOf(iArr2[(iVar3.f177908f + 1) % iArr2.length]))).intValue());
                            break;
                        }
                        break;
                    default:
                        float fB5 = 1.0f - r.b(valueAnimator3, false);
                        i iVar4 = this.f177900b;
                        iVar4.f177912j = fB5;
                        iVar4.f177903a.b();
                        break;
                }
            }
        });
        ValueAnimator valueAnimator3 = this.f177917o;
        D1.a(valueAnimator3 == null ? null : valueAnimator3, -1);
        ValueAnimator valueAnimator4 = this.f177917o;
        (valueAnimator4 == null ? null : valueAnimator4).setRepeatMode(1);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f12, f13);
        this.f177915m = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.setInterpolator(kVar);
        ValueAnimator valueAnimator5 = this.f177915m;
        valueAnimator5 = valueAnimator5 == null ? null : valueAnimator5;
        long j12 = (long) (600 / nVar.f177928e);
        valueAnimator5.setDuration(j12);
        ValueAnimator valueAnimator6 = this.f177915m;
        (valueAnimator6 == null ? null : valueAnimator6).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.avito.android.lib.deprecated_design.circular_progress.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f177900b;

            {
                this.f177900b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                float fC2;
                switch (i12) {
                    case 0:
                        float fB2 = r.b(valueAnimator32, true) * 360.0f;
                        i iVar = this.f177900b;
                        iVar.f177911i = fB2;
                        iVar.f177903a.b();
                        break;
                    case 1:
                        float fB3 = r.b(valueAnimator32, false);
                        i iVar2 = this.f177900b;
                        boolean z12 = iVar2.f177913k;
                        float f14 = iVar2.f177906d;
                        if (z12) {
                            fC2 = fB3 * f14;
                        } else {
                            float f15 = iVar2.f177905c;
                            fC2 = androidx.appcompat.app.r.c(f14, f15, fB3, f15);
                        }
                        iVar2.f177909g = fC2;
                        iVar2.f177903a.b();
                        break;
                    case 2:
                        float fB4 = r.b(valueAnimator32, false);
                        i iVar3 = this.f177900b;
                        float f16 = iVar3.f177905c;
                        float f17 = iVar3.f177906d;
                        iVar3.f177909g = f17 - ((f17 - f16) * fB4);
                        a aVar2 = iVar3.f177903a;
                        aVar2.b();
                        float currentPlayTime = valueAnimator32.getCurrentPlayTime() / valueAnimator32.getDuration();
                        int[] iArr2 = iVar3.f177904b;
                        if (iArr2.length > 1 && currentPlayTime > 0.7f) {
                            aVar2.f177883e.setColor(((Integer) j.f177919a.evaluate((currentPlayTime - 0.7f) / 0.3f, Integer.valueOf(iVar3.f177907e), Integer.valueOf(iArr2[(iVar3.f177908f + 1) % iArr2.length]))).intValue());
                            break;
                        }
                        break;
                    default:
                        float fB5 = 1.0f - r.b(valueAnimator32, false);
                        i iVar4 = this.f177900b;
                        iVar4.f177912j = fB5;
                        iVar4.f177903a.b();
                        break;
                }
            }
        });
        ValueAnimator valueAnimator7 = this.f177915m;
        (valueAnimator7 == null ? null : valueAnimator7).addListener(new g(this));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(f13, f12);
        this.f177916n = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setInterpolator(kVar);
        ValueAnimator valueAnimator8 = this.f177916n;
        (valueAnimator8 == null ? null : valueAnimator8).setDuration(j12);
        ValueAnimator valueAnimator9 = this.f177916n;
        (valueAnimator9 == null ? null : valueAnimator9).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.avito.android.lib.deprecated_design.circular_progress.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f177900b;

            {
                this.f177900b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                float fC2;
                switch (i14) {
                    case 0:
                        float fB2 = r.b(valueAnimator32, true) * 360.0f;
                        i iVar = this.f177900b;
                        iVar.f177911i = fB2;
                        iVar.f177903a.b();
                        break;
                    case 1:
                        float fB3 = r.b(valueAnimator32, false);
                        i iVar2 = this.f177900b;
                        boolean z12 = iVar2.f177913k;
                        float f14 = iVar2.f177906d;
                        if (z12) {
                            fC2 = fB3 * f14;
                        } else {
                            float f15 = iVar2.f177905c;
                            fC2 = androidx.appcompat.app.r.c(f14, f15, fB3, f15);
                        }
                        iVar2.f177909g = fC2;
                        iVar2.f177903a.b();
                        break;
                    case 2:
                        float fB4 = r.b(valueAnimator32, false);
                        i iVar3 = this.f177900b;
                        float f16 = iVar3.f177905c;
                        float f17 = iVar3.f177906d;
                        iVar3.f177909g = f17 - ((f17 - f16) * fB4);
                        a aVar2 = iVar3.f177903a;
                        aVar2.b();
                        float currentPlayTime = valueAnimator32.getCurrentPlayTime() / valueAnimator32.getDuration();
                        int[] iArr2 = iVar3.f177904b;
                        if (iArr2.length > 1 && currentPlayTime > 0.7f) {
                            aVar2.f177883e.setColor(((Integer) j.f177919a.evaluate((currentPlayTime - 0.7f) / 0.3f, Integer.valueOf(iVar3.f177907e), Integer.valueOf(iArr2[(iVar3.f177908f + 1) % iArr2.length]))).intValue());
                            break;
                        }
                        break;
                    default:
                        float fB5 = 1.0f - r.b(valueAnimator32, false);
                        i iVar4 = this.f177900b;
                        iVar4.f177912j = fB5;
                        iVar4.f177903a.b();
                        break;
                }
            }
        });
        ValueAnimator valueAnimator10 = this.f177916n;
        (valueAnimator10 == null ? null : valueAnimator10).addListener(new h(this));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f177918p = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setInterpolator(j.f177920b);
        ValueAnimator valueAnimator11 = this.f177918p;
        (valueAnimator11 == null ? null : valueAnimator11).setDuration(200L);
        ValueAnimator valueAnimator12 = this.f177918p;
        final int i15 = 3;
        (valueAnimator12 != null ? valueAnimator12 : null).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.avito.android.lib.deprecated_design.circular_progress.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f177900b;

            {
                this.f177900b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                float fC2;
                switch (i15) {
                    case 0:
                        float fB2 = r.b(valueAnimator32, true) * 360.0f;
                        i iVar = this.f177900b;
                        iVar.f177911i = fB2;
                        iVar.f177903a.b();
                        break;
                    case 1:
                        float fB3 = r.b(valueAnimator32, false);
                        i iVar2 = this.f177900b;
                        boolean z12 = iVar2.f177913k;
                        float f14 = iVar2.f177906d;
                        if (z12) {
                            fC2 = fB3 * f14;
                        } else {
                            float f15 = iVar2.f177905c;
                            fC2 = androidx.appcompat.app.r.c(f14, f15, fB3, f15);
                        }
                        iVar2.f177909g = fC2;
                        iVar2.f177903a.b();
                        break;
                    case 2:
                        float fB4 = r.b(valueAnimator32, false);
                        i iVar3 = this.f177900b;
                        float f16 = iVar3.f177905c;
                        float f17 = iVar3.f177906d;
                        iVar3.f177909g = f17 - ((f17 - f16) * fB4);
                        a aVar2 = iVar3.f177903a;
                        aVar2.b();
                        float currentPlayTime = valueAnimator32.getCurrentPlayTime() / valueAnimator32.getDuration();
                        int[] iArr2 = iVar3.f177904b;
                        if (iArr2.length > 1 && currentPlayTime > 0.7f) {
                            aVar2.f177883e.setColor(((Integer) j.f177919a.evaluate((currentPlayTime - 0.7f) / 0.3f, Integer.valueOf(iVar3.f177907e), Integer.valueOf(iArr2[(iVar3.f177908f + 1) % iArr2.length]))).intValue());
                            break;
                        }
                        break;
                    default:
                        float fB5 = 1.0f - r.b(valueAnimator32, false);
                        i iVar4 = this.f177900b;
                        iVar4.f177912j = fB5;
                        iVar4.f177903a.b();
                        break;
                }
            }
        });
    }

    @Override // com.avito.android.lib.deprecated_design.circular_progress.c
    public final void a(@Y61.k Canvas canvas, @Y61.k Paint paint) {
        float f12;
        float f13;
        float f14 = this.f177911i - this.f177910h;
        float f15 = this.f177909g;
        if (!this.f177914l) {
            f14 += 360 - f15;
        }
        float f16 = f14 % 360.0f;
        float f17 = this.f177912j;
        if (f17 < 1.0f) {
            float f18 = f17 * f15;
            f12 = ((f15 - f18) + f16) % 360;
            f13 = f18;
        } else {
            f12 = f16;
            f13 = f15;
        }
        canvas.drawArc(this.f177903a.f177882d, f12, f13, false, paint);
    }

    @Override // com.avito.android.lib.deprecated_design.circular_progress.c
    public final void start() {
        ValueAnimator valueAnimator = this.f177918p;
        if (valueAnimator == null) {
            valueAnimator = null;
        }
        valueAnimator.cancel();
        this.f177913k = true;
        this.f177912j = 1.0f;
        this.f177903a.f177883e.setColor(this.f177907e);
        ValueAnimator valueAnimator2 = this.f177917o;
        if (valueAnimator2 == null) {
            valueAnimator2 = null;
        }
        valueAnimator2.start();
        ValueAnimator valueAnimator3 = this.f177915m;
        (valueAnimator3 != null ? valueAnimator3 : null).start();
    }

    @Override // com.avito.android.lib.deprecated_design.circular_progress.c
    public final void stop() {
        ValueAnimator valueAnimator = this.f177917o;
        if (valueAnimator == null) {
            valueAnimator = null;
        }
        valueAnimator.cancel();
        ValueAnimator valueAnimator2 = this.f177915m;
        if (valueAnimator2 == null) {
            valueAnimator2 = null;
        }
        valueAnimator2.cancel();
        ValueAnimator valueAnimator3 = this.f177916n;
        if (valueAnimator3 == null) {
            valueAnimator3 = null;
        }
        valueAnimator3.cancel();
        ValueAnimator valueAnimator4 = this.f177918p;
        (valueAnimator4 != null ? valueAnimator4 : null).cancel();
    }
}
