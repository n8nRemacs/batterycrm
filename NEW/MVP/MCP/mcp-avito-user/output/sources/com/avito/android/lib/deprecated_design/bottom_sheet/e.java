package com.avito.android.lib.deprecated_design.bottom_sheet;

import Y61.k;
import Y61.l;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet;
import com.avito.android.util.D6;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import hw.InterfaceC41179d;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;

/* compiled from: BottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/bottom_sheet/e;", "Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
/* loaded from: classes14.dex */
final class e implements BottomSheet {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final FrameLayout f177843b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f177844c;

    /* renamed from: d, reason: collision with root package name */
    public final Resources f177845d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f177846e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final View f177847f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final View f177848g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final CoordinatorLayout f177849h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final BottomSheetBehavior<FrameLayout> f177850i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.bottom_sheet.b f177851j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f177852k;

    /* renamed from: l, reason: collision with root package name */
    public final int f177853l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public com.avito.android.lib.deprecated_design.bottom_sheet.a f177854m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public View f177855n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.b<BottomSheet.d> f177856o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f177857p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f177858q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public BottomSheet.NotchVisibility f177859r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f177860s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public BottomSheet.c f177861t;

    /* renamed from: u, reason: collision with root package name */
    @l
    public Integer f177862u;

    /* renamed from: v, reason: collision with root package name */
    @l
    public Float f177863v;

    /* renamed from: w, reason: collision with root package name */
    @l
    public Boolean f177864w;

    /* compiled from: BottomSheet.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/lib/deprecated_design/bottom_sheet/e$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends BottomSheetBehavior.c {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void onSlide(@k View view, float f12) {
            com.avito.android.lib.deprecated_design.bottom_sheet.a aVar = e.this.f177854m;
            if (aVar == null) {
                return;
            }
            if (Float.isInfinite(f12) || Float.isNaN(f12) || f12 <= 0.5f) {
                aVar.setAlpha(0.0f);
                D6.w(aVar);
            } else {
                aVar.setAlpha(s.c((f12 - 0.5f) * 2, 1.0f));
                D6.H(aVar);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void onStateChanged(@k View view, int i12) {
            BottomSheet.d dVar;
            e eVar = e.this;
            com.avito.android.lib.deprecated_design.bottom_sheet.a aVar = eVar.f177854m;
            if (i12 == 3) {
                boolean z12 = view.getHeight() > eVar.f177850i.E();
                if (aVar != null && z12) {
                    aVar.setAlpha(1.0f);
                    D6.H(aVar);
                }
                dVar = BottomSheet.d.c.f177838a;
            } else if (i12 == 4) {
                if (aVar != null) {
                    D6.w(aVar);
                }
                dVar = BottomSheet.d.b.f177837a;
            } else if (i12 == 5) {
                if (aVar != null) {
                    D6.w(aVar);
                }
                dVar = BottomSheet.d.a.f177836a;
            } else if (i12 != 6) {
                return;
            } else {
                dVar = BottomSheet.d.C5241d.f177839a;
            }
            eVar.f177856o.accept(dVar);
        }
    }

    /* compiled from: BottomSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[BottomSheet.NotchVisibility.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BottomSheet.NotchVisibility notchVisibility = BottomSheet.NotchVisibility.f177826b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BottomSheet.NotchVisibility notchVisibility2 = BottomSheet.NotchVisibility.f177826b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.avito.android.lib.deprecated_design.bottom_sheet.b] */
    public e(@k FrameLayout frameLayout) {
        this.f177843b = frameLayout;
        Context context = frameLayout.getContext();
        this.f177844c = context;
        this.f177845d = context.getResources();
        this.f177846e = LayoutInflater.from(context);
        this.f177847f = frameLayout.findViewById(R.id.avito_bottom_sheet_notch);
        View viewFindViewById = frameLayout.findViewById(R.id.bottom_sheet_close_button);
        this.f177848g = viewFindViewById;
        this.f177849h = (CoordinatorLayout) frameLayout.getParent();
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorB = BottomSheetBehavior.B(frameLayout);
        this.f177850i = bottomSheetBehaviorB;
        this.f177851j = new Runnable() { // from class: com.avito.android.lib.deprecated_design.bottom_sheet.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f177840b.a();
            }
        };
        this.f177853l = androidx.core.content.d.getColor(context, R.color.expected_overlay);
        new View.OnLayoutChangeListener() { // from class: com.avito.android.lib.deprecated_design.bottom_sheet.c
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                FrameLayout frameLayout2 = this.f177841b.f177843b;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), frameLayout2.getPaddingTop(), frameLayout2.getPaddingRight(), i15 - i13);
            }
        };
        this.f177856o = com.jakewharton.rxrelay3.b.N0(BottomSheet.d.b.f177837a);
        this.f177859r = BottomSheet.NotchVisibility.f177826b;
        this.f177860s = true;
        this.f177861t = BottomSheet.c.b.f177833a;
        bottomSheetBehaviorB.I(new a());
        a();
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.lib.deprecated_design.bottom_sheet.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e eVar = this.f177842b;
                    eVar.f177850i.M(true);
                    eVar.close();
                }
            });
        }
    }

    public final void a() {
        boolean z12 = false;
        this.f177852k = false;
        boolean z13 = this.f177857p;
        FrameLayout frameLayout = this.f177843b;
        Resources resources = this.f177845d;
        CoordinatorLayout coordinatorLayout = this.f177849h;
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f177850i;
        if (z13) {
            bottomSheetBehavior.N(coordinatorLayout.getMeasuredHeight() > 0 ? coordinatorLayout.getMeasuredHeight() : resources.getDisplayMetrics().heightPixels, false);
        } else {
            BottomSheet.c cVar = this.f177861t;
            if (L.f(cVar, BottomSheet.c.b.f177833a)) {
                frameLayout.addOnLayoutChangeListener(new f(frameLayout, this, 0.5f, (int) (20 * resources.getDisplayMetrics().density)));
            } else if (cVar instanceof BottomSheet.c.C5240c) {
                BottomSheet.c.C5240c c5240c = (BottomSheet.c.C5240c) cVar;
                frameLayout.addOnLayoutChangeListener(new f(frameLayout, this, c5240c.f177834a, c5240c.f177835b));
            } else if (cVar instanceof BottomSheet.c.a) {
                bottomSheetBehavior.N(((BottomSheet.c.a) cVar).f177832a, false);
            }
        }
        Integer num = this.f177862u;
        if (num != null) {
            bottomSheetBehavior.f356006l = num.intValue();
            frameLayout.requestLayout();
        }
        Float f12 = this.f177863v;
        if (f12 != null) {
            bottomSheetBehavior.L(f12.floatValue());
            frameLayout.requestLayout();
        }
        Boolean bool = this.f177864w;
        if (bool != null) {
            bottomSheetBehavior.K(bool.booleanValue());
            frameLayout.requestLayout();
        }
        if (this.f177860s && bottomSheetBehavior.f355975L == 5) {
            k2();
        }
        bottomSheetBehavior.M(this.f177860s);
        int iOrdinal = this.f177859r.ordinal();
        View view = this.f177847f;
        if (iOrdinal == 0) {
            if (this.f177860s || (!this.f177857p && frameLayout.getHeight() > bottomSheetBehavior.E())) {
                z12 = true;
            }
            D6.G(view, z12);
        } else if (iOrdinal == 1) {
            D6.G(view, true);
        } else if (iOrdinal == 2) {
            D6.w(view);
        }
        if (!this.f177858q || this.f177857p) {
            com.avito.android.lib.deprecated_design.bottom_sheet.a aVar = this.f177854m;
            if (aVar != null) {
                coordinatorLayout.removeView(aVar);
                this.f177854m = null;
                return;
            }
            return;
        }
        int iIndexOfChild = coordinatorLayout.indexOfChild(frameLayout);
        if (this.f177854m != null || iIndexOfChild < 0) {
            return;
        }
        Context context = this.f177844c;
        int i12 = this.f177853l;
        com.avito.android.lib.deprecated_design.bottom_sheet.a aVar2 = new com.avito.android.lib.deprecated_design.bottom_sheet.a(context);
        Context context2 = aVar2.getContext();
        Activity activity = context2 instanceof Activity ? (Activity) context2 : null;
        Window window = activity != null ? activity.getWindow() : null;
        if (window != null) {
            window.getStatusBarColor();
        }
        aVar2.setBackground(new ColorDrawable(i12));
        aVar2.setElevation(frameLayout.getElevation());
        aVar2.setOnTouchListener(new g(this));
        aVar2.setAlpha(0.0f);
        aVar2.setVisibility(8);
        coordinatorLayout.addView(aVar2, iIndexOfChild, new CoordinatorLayout.g(-1, -1));
        this.f177854m = aVar2;
    }

    public final void b() {
        if (this.f177852k) {
            return;
        }
        this.f177852k = true;
        this.f177843b.post(this.f177851j);
    }

    @Override // com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet
    public final void close() {
        if (!this.f177860s) {
            throw new IllegalStateException("Bottom sheet is not hideable");
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f177850i;
        if (!bottomSheetBehavior.f355972I) {
            a();
        }
        com.avito.android.lib.util.b.a(bottomSheetBehavior);
    }

    @Override // com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet
    @k
    /* renamed from: getView, reason: from getter */
    public final FrameLayout getF177843b() {
        return this.f177843b;
    }

    @Override // com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet
    @k
    public final BottomSheet.d getVisibility() {
        BottomSheet.d dVar = this.f177856o.f364266b.get();
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Can't be null because create with default");
    }

    @Override // com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet
    public final void j2() {
        this.f177850i.b(3);
    }

    @Override // com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet
    public final void k2() {
        boolean z12 = this.f177857p;
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f177850i;
        if (z12) {
            bottomSheetBehavior.b(3);
        } else {
            bottomSheetBehavior.b(4);
        }
    }

    @Override // com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet
    public final void l2(boolean z12) {
        if (this.f177860s != z12) {
            this.f177860s = z12;
            b();
        }
    }

    @Override // com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet
    @l
    /* renamed from: m2, reason: from getter */
    public final Float getF177863v() {
        return this.f177863v;
    }

    @Override // com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet
    public final void n2(boolean z12) {
        if (this.f177857p != z12) {
            this.f177857p = z12;
            b();
        }
    }

    @Override // com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet
    public final void o2() {
        Boolean bool = Boolean.FALSE;
        if (L.f(this.f177864w, bool)) {
            return;
        }
        this.f177864w = bool;
        b();
    }

    @Override // com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet
    @k
    /* renamed from: p2, reason: from getter */
    public final BottomSheet.c getF177861t() {
        return this.f177861t;
    }

    @Override // com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet
    public final void q2(@l Integer num) {
        if (L.f(this.f177862u, num)) {
            return;
        }
        this.f177862u = num;
        b();
    }

    @Override // com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet
    /* renamed from: r2, reason: from getter */
    public final com.jakewharton.rxrelay3.b getF177856o() {
        return this.f177856o;
    }

    @Override // com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet
    public final void s2(@k BottomSheet.c.a aVar) {
        if (L.f(this.f177861t, aVar)) {
            return;
        }
        this.f177861t = aVar;
        b();
    }

    @Override // com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet
    public final void t2(@k BottomSheet.NotchVisibility notchVisibility) {
        if (this.f177859r != notchVisibility) {
            this.f177859r = notchVisibility;
            b();
        }
    }

    @Override // com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet
    public final void u2() {
        if (!this.f177858q) {
            this.f177858q = true;
            b();
        }
    }

    @Override // com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet
    public final void v2(@l Float f12) {
        if (L.e(this.f177863v, f12)) {
            return;
        }
        this.f177863v = f12;
        b();
    }

    @Override // com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet
    public final void w2() {
        this.f177850i.b(6);
    }

    @Override // com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet
    @k
    public final View x2(int i12) {
        int i13;
        FrameLayout frameLayout = this.f177843b;
        View viewInflate = this.f177846e.inflate(i12, (ViewGroup) frameLayout, false);
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        View view = this.f177855n;
        if (view != null) {
            frameLayout.removeView(view);
        }
        if (layoutParams != null && ((i13 = layoutParams.height) == -2 || i13 == -1)) {
            ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            layoutParams2.height = layoutParams.height;
            frameLayout.setLayoutParams(layoutParams2);
        }
        if (layoutParams != null) {
            frameLayout.addView(viewInflate, 0, layoutParams);
        } else {
            frameLayout.addView(viewInflate, 0);
        }
        this.f177855n = viewInflate;
        return viewInflate;
    }
}
