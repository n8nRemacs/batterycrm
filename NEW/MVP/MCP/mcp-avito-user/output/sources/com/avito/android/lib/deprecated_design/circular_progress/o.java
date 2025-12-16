package com.avito.android.lib.deprecated_design.circular_progress;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import kotlin.Metadata;

/* compiled from: PowerSaveModeCicularProgressDrawableDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/circular_progress/o;", "Lcom/avito/android/lib/deprecated_design/circular_progress/c;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class o implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.deprecated_design.circular_progress.a f177933a;

    /* renamed from: b, reason: collision with root package name */
    public int f177934b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f177935c = new a();

    /* compiled from: PowerSaveModeCicularProgressDrawableDelegate.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/lib/deprecated_design/circular_progress/o$a", "Ljava/lang/Runnable;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o oVar = o.this;
            oVar.f177934b = (oVar.f177934b + 50) % 360;
            com.avito.android.lib.deprecated_design.circular_progress.a aVar = oVar.f177933a;
            if (aVar.f177885g) {
                aVar.scheduleSelf(this, SystemClock.uptimeMillis() + 1000);
            }
            aVar.b();
        }
    }

    public o(@Y61.k com.avito.android.lib.deprecated_design.circular_progress.a aVar) {
        this.f177933a = aVar;
    }

    @Override // com.avito.android.lib.deprecated_design.circular_progress.c
    public final void a(@Y61.k Canvas canvas, @Y61.k Paint paint) {
        canvas.drawArc(this.f177933a.f177882d, this.f177934b, 300.0f, false, paint);
    }

    @Override // com.avito.android.lib.deprecated_design.circular_progress.c
    public final void start() {
        com.avito.android.lib.deprecated_design.circular_progress.a aVar = this.f177933a;
        aVar.b();
        aVar.scheduleSelf(this.f177935c, SystemClock.uptimeMillis() + 1000);
    }

    @Override // com.avito.android.lib.deprecated_design.circular_progress.c
    public final void stop() {
        this.f177933a.unscheduleSelf(this.f177935c);
    }
}
