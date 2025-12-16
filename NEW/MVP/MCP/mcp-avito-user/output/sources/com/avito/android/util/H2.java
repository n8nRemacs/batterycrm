package com.avito.android.util;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;

/* compiled from: Keyboards.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/H2;", "Lcom/avito/android/util/F2;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class H2 implements F2 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f318618b;

    /* renamed from: c, reason: collision with root package name */
    public int f318619c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318620d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318621e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Rect f318622f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final float f318623g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ViewTreeObserver f318624h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final G2 f318625i;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, com.avito.android.util.G2] */
    public H2(@Y61.k final Y41.l lVar, @Y61.k View view, final boolean z12) {
        this.f318618b = view;
        this.f318620d = z12;
        this.f318623g = view.getResources().getDisplayMetrics().density * 128;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        this.f318624h = viewTreeObserver;
        ?? r02 = new ViewTreeObserver.OnGlobalLayoutListener(z12, lVar) { // from class: com.avito.android.util.G2

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f318614c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.N f318615d;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f318615d = (kotlin.jvm.internal.N) lVar;
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [Y41.l, kotlin.jvm.internal.N] */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                H2 h22 = this.f318613b;
                int i12 = h22.f318619c;
                View view2 = h22.f318618b;
                if (i12 == 0) {
                    h22.f318619c = view2.getRootView().getHeight();
                }
                Rect rect = h22.f318622f;
                view2.getWindowVisibleDisplayFrame(rect);
                int iHeight = h22.f318619c - rect.height();
                boolean z13 = this.f318614c;
                boolean z14 = false;
                float f12 = h22.f318623g;
                if (!z13 ? iHeight > f12 : iHeight <= f12) {
                    z14 = true;
                }
                if (z14 != h22.f318620d) {
                    this.f318615d.invoke(Boolean.valueOf(z14));
                }
                h22.f318620d = z14;
            }
        };
        this.f318625i = r02;
        lVar.invoke(Boolean.valueOf(this.f318620d));
        viewTreeObserver.addOnGlobalLayoutListener(r02);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        if (this.f318621e) {
            return;
        }
        this.f318621e = true;
        ViewTreeObserver viewTreeObserver = this.f318624h;
        G2 g22 = this.f318625i;
        A6.b(viewTreeObserver, g22);
        A6.b(this.f318618b.getViewTreeObserver(), g22);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i, reason: from getter */
    public final boolean getF318621e() {
        return this.f318621e;
    }
}
