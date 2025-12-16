package com.avito.android.map_core.utils;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BottomSheetBehaviourEventsProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/map_core/utils/a;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;", "<init>", "()V", "a", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends BottomSheetBehavior.c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f185685b = new com.jakewharton.rxrelay3.c();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f185686c = new com.jakewharton.rxrelay3.c();

    /* renamed from: d, reason: collision with root package name */
    public int f185687d;

    /* compiled from: BottomSheetBehaviourEventsProvider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/map_core/utils/a$a;", "", "<init>", "()V", "", "MAX_OFFSET", "F", "MID_OFFSET", "MIN_OFFSET", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.map_core.utils.a$a, reason: collision with other inner class name */
    public static final class C5450a {
        public /* synthetic */ C5450a(C42822w c42822w) {
            this();
        }

        public C5450a() {
        }
    }

    static {
        new C5450a(null);
    }

    @Y61.k
    public final B0 a() {
        return this.f185686c.d0(b.f185688b);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void onSlide(@Y61.k View view, float f12) {
        this.f185686c.accept(Float.valueOf(f12));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0023  */
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStateChanged(@Y61.k android.view.View r6, int r7) {
        /*
            r5 = this;
            r6 = 0
            r0 = 1
            if (r7 != r0) goto L7
            r5.f185687d = r0
            goto L2c
        L7:
            int r1 = r5.f185687d
            java.lang.String r2 = "expanded"
            r3 = 3
            r4 = 2
            if (r1 == r0) goto L25
            if (r1 != 0) goto L12
            goto L25
        L12:
            if (r1 != r4) goto L2c
            if (r7 == r3) goto L23
            r0 = 4
            if (r7 == r0) goto L20
            r0 = 5
            if (r7 == r0) goto L1d
            goto L2c
        L1d:
            java.lang.String r6 = "hidden"
            goto L2c
        L20:
            java.lang.String r6 = "collapsed"
            goto L2c
        L23:
            r6 = r2
            goto L2c
        L25:
            if (r7 == r4) goto L2a
            if (r7 == r3) goto L23
            goto L2c
        L2a:
            r5.f185687d = r4
        L2c:
            if (r6 == 0) goto L36
            r7 = 0
            r5.f185687d = r7
            com.jakewharton.rxrelay3.c r7 = r5.f185685b
            r7.accept(r6)
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.map_core.utils.a.onStateChanged(android.view.View, int):void");
    }
}
