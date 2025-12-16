package com.avito.android.beduin.common.component.image;

import Y61.k;
import Y61.l;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.Metadata;

/* compiled from: BeduinDraweeView.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/beduin/common/component/image/h;", "", "a", "c", "d", "Lcom/avito/android/beduin/common/component/image/h$a;", "Lcom/avito/android/beduin/common/component/image/h$c;", "Lcom/avito/android/beduin/common/component/image/h$d;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
interface h {

    /* compiled from: BeduinDraweeView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    /* compiled from: BeduinDraweeView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/image/h$c;", "Lcom/avito/android/beduin/common/component/image/h;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements h {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Paint f101464a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Path f101465b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public float[] f101466c = new float[8];

        /* renamed from: d, reason: collision with root package name */
        public float f101467d = -1.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f101468e = -1.0f;

        /* renamed from: f, reason: collision with root package name */
        public int f101469f;

        public c(@k Path path, @k Paint paint) {
            this.f101464a = paint;
            this.f101465b = path;
        }

        @Override // com.avito.android.beduin.common.component.image.h
        public final void a(@l Canvas canvas, float f12, float f13) {
            Path path = this.f101465b;
            if (path.isEmpty() || this.f101467d != f12 || this.f101468e != f13) {
                path.reset();
                float[] fArr = this.f101466c;
                float f14 = 2;
                float fMin = Math.min(f12 / f14, f13 / f14);
                float[] fArr2 = new float[8];
                for (int i12 = 0; i12 < 8; i12++) {
                    fArr2[i12] = Math.min(fMin, fArr[i12]);
                }
                path.moveTo(0.0f, fArr2[1]);
                path.lineTo(0.0f, 0.0f);
                path.lineTo(fArr2[0], 0.0f);
                path.arcTo(0.0f, 0.0f, fArr2[0] * f14, fArr2[1] * f14, -90.0f, -90.0f, false);
                path.moveTo(f12 - fArr2[2], 0.0f);
                path.lineTo(f12, 0.0f);
                path.lineTo(f12, fArr2[3]);
                path.arcTo(f12 - (fArr2[2] * f14), 0.0f, f12, fArr2[3] * f14, 0.0f, -90.0f, false);
                path.moveTo(f12, f13 - fArr2[5]);
                path.lineTo(f12, f13);
                path.lineTo(f12 - fArr2[4], f13);
                path.arcTo(f12 - (fArr2[4] * f14), f13 - (fArr2[5] * f14), f12, f13, 90.0f, -90.0f, false);
                path.moveTo(fArr2[6], f13);
                path.lineTo(0.0f, f13);
                path.lineTo(0.0f, f13 - fArr2[7]);
                path.arcTo(0.0f, f13 - (fArr2[7] * f14), fArr2[6] * f14, f13, 180.0f, -90.0f, false);
                this.f101467d = f12;
                this.f101468e = f13;
            }
            this.f101469f = canvas.saveLayer(new RectF(0.0f, 0.0f, f12, f13), null);
        }

        @Override // com.avito.android.beduin.common.component.image.h
        public final void b(@l Canvas canvas) {
            canvas.drawPath(this.f101465b, this.f101464a);
            canvas.restoreToCount(this.f101469f);
        }
    }

    void a(@l Canvas canvas, float f12, float f13);

    void b(@l Canvas canvas);

    /* compiled from: BeduinDraweeView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/image/h$a;", "Lcom/avito/android/beduin/common/component/image/h;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements h {
        @Override // com.avito.android.beduin.common.component.image.h
        public final void a(@l Canvas canvas, float f12, float f13) {
            throw null;
        }

        @Override // com.avito.android.beduin.common.component.image.h
        public final void b(@l Canvas canvas) {
        }
    }

    /* compiled from: BeduinDraweeView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/image/h$d;", "Lcom/avito/android/beduin/common/component/image/h;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements h {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f101470a = new d();

        @Override // com.avito.android.beduin.common.component.image.h
        public final void b(@l Canvas canvas) {
        }

        @Override // com.avito.android.beduin.common.component.image.h
        public final void a(@l Canvas canvas, float f12, float f13) {
        }
    }
}
