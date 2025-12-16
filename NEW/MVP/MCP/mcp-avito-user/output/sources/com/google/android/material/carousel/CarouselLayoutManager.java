package com.google.android.material.carousel;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.app.r;
import androidx.core.graphics.C22767g;
import androidx.core.util.z;
import androidx.media3.exoplayer.analytics.m;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.android.material.R;
import com.google.android.material.carousel.d;
import com.google.android.material.carousel.h;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lY0.C43707b;

/* loaded from: classes6.dex */
public class CarouselLayoutManager extends RecyclerView.m implements com.google.android.material.carousel.a {

    /* renamed from: r, reason: collision with root package name */
    public int f356135r;

    /* renamed from: s, reason: collision with root package name */
    public int f356136s;

    /* renamed from: t, reason: collision with root package name */
    public int f356137t;

    /* renamed from: x, reason: collision with root package name */
    @P
    public d f356141x;

    /* renamed from: u, reason: collision with root package name */
    public final b f356138u = new b();

    /* renamed from: y, reason: collision with root package name */
    public int f356142y = 0;

    /* renamed from: v, reason: collision with root package name */
    @N
    public final h f356139v = new h();

    /* renamed from: w, reason: collision with root package name */
    @P
    public e f356140w = null;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public View f356143a;

        /* renamed from: b, reason: collision with root package name */
        public float f356144b;

        /* renamed from: c, reason: collision with root package name */
        public c f356145c;
    }

    public static class b extends RecyclerView.l {

        /* renamed from: b, reason: collision with root package name */
        public final Paint f356146b;

        /* renamed from: c, reason: collision with root package name */
        public List<d.c> f356147c;

        public b() {
            Paint paint = new Paint();
            this.f356146b = paint;
            this.f356147c = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public final void onDrawOver(@N Canvas canvas, @N RecyclerView recyclerView, @N RecyclerView.z zVar) {
            super.onDrawOver(canvas, recyclerView, zVar);
            Paint paint = this.f356146b;
            paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
            for (d.c cVar : this.f356147c) {
                paint.setColor(C22767g.c(cVar.f356164c, -65281, -16776961));
                float paddingTop = ((CarouselLayoutManager) recyclerView.getLayoutManager()).getPaddingTop();
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) recyclerView.getLayoutManager();
                float paddingBottom = carouselLayoutManager.f53851q - carouselLayoutManager.getPaddingBottom();
                float f12 = cVar.f356163b;
                canvas.drawLine(f12, paddingTop, f12, paddingBottom, paint);
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final d.c f356148a;

        /* renamed from: b, reason: collision with root package name */
        public final d.c f356149b;

        public c(d.c cVar, d.c cVar2) {
            z.b(cVar.f356162a <= cVar2.f356162a);
            this.f356148a = cVar;
            this.f356149b = cVar2;
        }
    }

    public CarouselLayoutManager() {
        i1();
    }

    public static c G1(List<d.c> list, float f12, boolean z12) {
        float f13 = Float.MAX_VALUE;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        float f14 = -3.4028235E38f;
        float f15 = Float.MAX_VALUE;
        float f16 = Float.MAX_VALUE;
        for (int i16 = 0; i16 < list.size(); i16++) {
            d.c cVar = list.get(i16);
            float f17 = z12 ? cVar.f356163b : cVar.f356162a;
            float fAbs = Math.abs(f17 - f12);
            if (f17 <= f12 && fAbs <= f13) {
                i12 = i16;
                f13 = fAbs;
            }
            if (f17 > f12 && fAbs <= f15) {
                i14 = i16;
                f15 = fAbs;
            }
            if (f17 <= f16) {
                i13 = i16;
                f16 = f17;
            }
            if (f17 > f14) {
                i15 = i16;
                f14 = f17;
            }
        }
        if (i12 == -1) {
            i12 = i13;
        }
        if (i14 == -1) {
            i14 = i15;
        }
        return new c(list.get(i12), list.get(i14));
    }

    public final void A1(int i12, RecyclerView.u uVar, RecyclerView.z zVar) {
        int iD1 = D1(i12);
        while (i12 < zVar.b()) {
            a aVarK1 = K1(uVar, iD1, i12);
            float f12 = aVarK1.f356144b;
            c cVar = aVarK1.f356145c;
            if (I1(f12, cVar)) {
                return;
            }
            iD1 = z1(iD1, (int) this.f356141x.f356151a);
            if (!J1(f12, cVar)) {
                View view = aVarK1.f356143a;
                float f13 = this.f356141x.f356151a / 2.0f;
                E(view, -1, false);
                C0(view, (int) (f12 - f13), getPaddingTop(), (int) (f12 + f13), this.f53851q - getPaddingBottom());
            }
            i12++;
        }
    }

    public final void B1(RecyclerView.u uVar, int i12) {
        int iD1 = D1(i12);
        while (i12 >= 0) {
            a aVarK1 = K1(uVar, iD1, i12);
            float f12 = aVarK1.f356144b;
            c cVar = aVarK1.f356145c;
            if (J1(f12, cVar)) {
                return;
            }
            int i13 = (int) this.f356141x.f356151a;
            iD1 = H1() ? iD1 + i13 : iD1 - i13;
            if (!I1(f12, cVar)) {
                View view = aVarK1.f356143a;
                float f13 = this.f356141x.f356151a / 2.0f;
                E(view, 0, false);
                C0(view, (int) (f12 - f13), getPaddingTop(), (int) (f12 + f13), this.f53851q - getPaddingBottom());
            }
            i12--;
        }
    }

    public final float C1(View view, float f12, c cVar) {
        d.c cVar2 = cVar.f356148a;
        float f13 = cVar2.f356163b;
        d.c cVar3 = cVar.f356149b;
        float f14 = cVar3.f356163b;
        float f15 = cVar2.f356162a;
        float f16 = cVar3.f356162a;
        float fB2 = C43707b.b(f13, f14, f15, f16, f12);
        if (cVar3 != this.f356141x.b() && cVar2 != this.f356141x.d()) {
            return fB2;
        }
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        return fB2 + (((1.0f - cVar3.f356164c) + ((((ViewGroup.MarginLayoutParams) nVar).rightMargin + ((ViewGroup.MarginLayoutParams) nVar).leftMargin) / this.f356141x.f356151a)) * (f12 - f16));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void D0(@N View view) {
        if (!(view instanceof f)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        Rect rect = new Rect();
        H(view, rect);
        int i12 = rect.left + rect.right;
        int i13 = rect.top + rect.bottom;
        e eVar = this.f356140w;
        view.measure(RecyclerView.m.f0(this.f53850p, this.f53848n, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin + i12, (int) (eVar != null ? eVar.f356166a.f356151a : ((ViewGroup.MarginLayoutParams) nVar).width), true), RecyclerView.m.f0(this.f53851q, this.f53849o, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) nVar).height, false));
    }

    public final int D1(int i12) {
        return z1((H1() ? this.f53850p : 0) - this.f356135r, (int) (this.f356141x.f356151a * i12));
    }

    public final void E1(RecyclerView.u uVar, RecyclerView.z zVar) {
        while (e0() > 0) {
            View viewD0 = d0(0);
            Rect rect = new Rect();
            RecyclerView.Y(viewD0, rect);
            float fCenterX = rect.centerX();
            if (!J1(fCenterX, G1(this.f356141x.f356152b, fCenterX, true))) {
                break;
            } else {
                e1(viewD0, uVar);
            }
        }
        while (e0() - 1 >= 0) {
            View viewD02 = d0(e0() - 1);
            Rect rect2 = new Rect();
            RecyclerView.Y(viewD02, rect2);
            float fCenterX2 = rect2.centerX();
            if (!I1(fCenterX2, G1(this.f356141x.f356152b, fCenterX2, true))) {
                break;
            } else {
                e1(viewD02, uVar);
            }
        }
        if (e0() == 0) {
            B1(uVar, this.f356142y - 1);
            A1(this.f356142y, uVar, zVar);
        } else {
            int iT02 = RecyclerView.m.t0(d0(0));
            int iT03 = RecyclerView.m.t0(d0(e0() - 1));
            B1(uVar, iT02 - 1);
            A1(iT03 + 1, uVar, zVar);
        }
    }

    public final int F1(d dVar, int i12) {
        boolean zH1 = H1();
        float f12 = dVar.f356151a;
        if (zH1) {
            return (int) (((this.f53850p - dVar.c().f356162a) - (i12 * f12)) - (f12 / 2.0f));
        }
        return (int) ((f12 / 2.0f) + ((i12 * f12) - dVar.a().f356162a));
    }

    public final boolean H1() {
        return q0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean I() {
        return true;
    }

    public final boolean I1(float f12, c cVar) {
        d.c cVar2 = cVar.f356148a;
        float f13 = cVar2.f356165d;
        d.c cVar3 = cVar.f356149b;
        float fB2 = C43707b.b(f13, cVar3.f356165d, cVar2.f356163b, cVar3.f356163b, f12);
        int i12 = (int) f12;
        int i13 = (int) (fB2 / 2.0f);
        int i14 = H1() ? i12 + i13 : i12 - i13;
        if (H1()) {
            if (i14 >= 0) {
                return false;
            }
        } else if (i14 <= this.f53850p) {
            return false;
        }
        return true;
    }

    public final boolean J1(float f12, c cVar) {
        d.c cVar2 = cVar.f356148a;
        float f13 = cVar2.f356165d;
        d.c cVar3 = cVar.f356149b;
        int iZ1 = z1((int) f12, (int) (C43707b.b(f13, cVar3.f356165d, cVar2.f356163b, cVar3.f356163b, f12) / 2.0f));
        if (H1()) {
            if (iZ1 <= this.f53850p) {
                return false;
            }
        } else if (iZ1 >= 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void K0(@N AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (e0() > 0) {
            accessibilityEvent.setFromIndex(RecyclerView.m.t0(d0(0)));
            accessibilityEvent.setToIndex(RecyclerView.m.t0(d0(e0() - 1)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a K1(RecyclerView.u uVar, float f12, int i12) {
        float f13 = this.f356141x.f356151a / 2.0f;
        View viewD = uVar.d(i12);
        D0(viewD);
        float fZ1 = z1((int) f12, (int) f13);
        c cVarG1 = G1(this.f356141x.f356152b, fZ1, false);
        float fC1 = C1(viewD, fZ1, cVarG1);
        if (viewD instanceof f) {
            d.c cVar = cVarG1.f356148a;
            float f14 = cVar.f356164c;
            d.c cVar2 = cVarG1.f356149b;
            ((f) viewD).setMaskXPercentage(C43707b.b(f14, cVar2.f356164c, cVar.f356162a, cVar2.f356162a, fZ1));
        }
        a aVar = new a();
        aVar.f356143a = viewD;
        aVar.f356144b = fC1;
        aVar.f356145c = cVarG1;
        return aVar;
    }

    public final void L1() {
        int i12 = this.f356137t;
        int i13 = this.f356136s;
        if (i12 <= i13) {
            this.f356141x = H1() ? (d) m.h(1, this.f356140w.f356168c) : (d) m.h(1, this.f356140w.f356167b);
        } else {
            e eVar = this.f356140w;
            float f12 = this.f356135r;
            float f13 = i13;
            float f14 = i12;
            float f15 = eVar.f356171f + f13;
            float f16 = f14 - eVar.f356172g;
            this.f356141x = f12 < f15 ? e.b(eVar.f356167b, C43707b.b(1.0f, 0.0f, f13, f15, f12), eVar.f356169d) : f12 > f16 ? e.b(eVar.f356168c, C43707b.b(0.0f, 1.0f, f16, f14, f12), eVar.f356170e) : eVar.f356166a;
        }
        List<d.c> list = this.f356141x.f356152b;
        b bVar = this.f356138u;
        bVar.getClass();
        bVar.f356147c = Collections.unmodifiableList(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int O(@N RecyclerView.z zVar) {
        return (int) this.f356140w.f356166a.f356151a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int P(@N RecyclerView.z zVar) {
        return this.f356135r;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int Q(@N RecyclerView.z zVar) {
        return this.f356137t - this.f356136s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void U0(RecyclerView.u uVar, RecyclerView.z zVar) {
        CarouselLayoutManager carouselLayoutManager;
        boolean z12;
        boolean z13;
        float f12;
        int i12;
        d dVar;
        int i13;
        float f13;
        List<d.c> list;
        int i14;
        int i15;
        int size;
        int i16 = 0;
        if (zVar.b() <= 0) {
            c1(uVar);
            this.f356142y = 0;
            return;
        }
        boolean zH1 = H1();
        int i17 = 1;
        boolean z14 = this.f356140w == null;
        if (z14) {
            View viewD = uVar.d(0);
            D0(viewD);
            this.f356139v.getClass();
            float f14 = this.f53850p;
            RecyclerView.n nVar = (RecyclerView.n) viewD.getLayoutParams();
            float f15 = ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin;
            float dimension = viewD.getContext().getResources().getDimension(R.dimen.m3_carousel_small_item_size_min) + f15;
            float dimension2 = viewD.getContext().getResources().getDimension(R.dimen.m3_carousel_small_item_size_max) + f15;
            float measuredWidth = viewD.getMeasuredWidth();
            float fMin = Math.min(measuredWidth + f15, f14);
            float fA2 = M0.a.a((measuredWidth / 3.0f) + f15, viewD.getContext().getResources().getDimension(R.dimen.m3_carousel_small_item_size_min) + f15, viewD.getContext().getResources().getDimension(R.dimen.m3_carousel_small_item_size_max) + f15);
            float f16 = (fMin + fA2) / 2.0f;
            int[] iArr = h.f356179a;
            int[] iArr2 = h.f356180b;
            int i18 = BeduinInputModel.MIN_TEXT_VERSION;
            int i19 = 0;
            int i22 = Integer.MIN_VALUE;
            while (true) {
                i13 = 2;
                if (i19 >= 2) {
                    break;
                }
                int i23 = iArr2[i19];
                if (i23 > i22) {
                    i22 = i23;
                }
                i19++;
            }
            float f17 = f14 - (i22 * f16);
            int i24 = iArr[0];
            if (i24 > Integer.MIN_VALUE) {
                i18 = i24;
            }
            int iMax = (int) Math.max(1.0d, Math.floor((f17 - (i18 * dimension2)) / fMin));
            int iCeil = (int) Math.ceil(f14 / fMin);
            int i25 = (iCeil - iMax) + 1;
            int[] iArr3 = new int[i25];
            for (int i26 = 0; i26 < i25; i26++) {
                iArr3[i26] = iCeil - i26;
            }
            h.a aVar = null;
            int i27 = 0;
            int i28 = 1;
            loop2: while (true) {
                if (i27 >= i25) {
                    f13 = f15;
                    break;
                }
                int i29 = iArr3[i27];
                while (i16 < i13) {
                    int i32 = iArr2[i16];
                    int i33 = i28;
                    int i34 = 0;
                    while (i34 < i17) {
                        int i35 = i34;
                        int i36 = i27;
                        int[] iArr4 = iArr3;
                        int i37 = i13;
                        f13 = f15;
                        h.a aVar2 = new h.a(i33, fA2, dimension, dimension2, iArr[i34], f16, i32, fMin, i29, f14);
                        float f18 = aVar2.f356188h;
                        if (aVar == null || f18 < aVar.f356188h) {
                            if (f18 == 0.0f) {
                                aVar = aVar2;
                                break loop2;
                            }
                            aVar = aVar2;
                        }
                        i33++;
                        i34 = i35 + 1;
                        i27 = i36;
                        iArr3 = iArr4;
                        i13 = i37;
                        f15 = f13;
                        i17 = 1;
                    }
                    i16++;
                    i28 = i33;
                    i17 = 1;
                }
                i27++;
                i16 = 0;
                i17 = 1;
            }
            float dimension3 = viewD.getContext().getResources().getDimension(R.dimen.m3_carousel_gone_size) + f13;
            float f19 = dimension3 / 2.0f;
            float f22 = 0.0f - f19;
            float f23 = (aVar.f356186f / 2.0f) + 0.0f;
            int i38 = aVar.f356187g;
            float fMax = Math.max(0, i38 - 1);
            float f24 = aVar.f356186f;
            float f25 = (fMax * f24) + f23;
            float f26 = (f24 / 2.0f) + f25;
            int i39 = aVar.f356184d;
            if (i39 > 0) {
                f25 = (aVar.f356185e / 2.0f) + f26;
            }
            if (i39 > 0) {
                f26 = (aVar.f356185e / 2.0f) + f25;
            }
            int i42 = aVar.f356183c;
            float f27 = i42 > 0 ? (aVar.f356182b / 2.0f) + f26 : f25;
            float f28 = this.f53850p + f19;
            float f29 = f24 - f13;
            f12 = 1.0f;
            float f32 = 1.0f - ((dimension3 - f13) / f29);
            float f33 = 1.0f - ((aVar.f356182b - f13) / f29);
            z13 = z14;
            float f34 = 1.0f - ((aVar.f356185e - f13) / f29);
            d.b bVar = new d.b(f24);
            bVar.a(f22, f32, false, dimension3);
            float f35 = aVar.f356186f;
            if (i38 > 0 && f35 > 0.0f) {
                int i43 = 0;
                while (i43 < i38) {
                    bVar.a((i43 * f35) + f23, 0.0f, true, f35);
                    i43++;
                    i38 = i38;
                    f23 = f23;
                    zH1 = zH1;
                }
            }
            z12 = zH1;
            if (i39 > 0) {
                bVar.a(f25, f34, false, aVar.f356185e);
            }
            if (i42 > 0) {
                float f36 = aVar.f356182b;
                if (i42 > 0 && f36 > 0.0f) {
                    for (int i44 = 0; i44 < i42; i44++) {
                        bVar.a((i44 * f36) + f27, f33, false, f36);
                    }
                }
            }
            bVar.a(f28, f32, false, dimension3);
            d dVarB = bVar.b();
            if (z12) {
                d.b bVar2 = new d.b(dVarB.f356151a);
                float f37 = 2.0f;
                float f38 = dVarB.b().f356163b - (dVarB.b().f356165d / 2.0f);
                List<d.c> list2 = dVarB.f356152b;
                int size2 = list2.size() - 1;
                while (size2 >= 0) {
                    d.c cVar = list2.get(size2);
                    float f39 = cVar.f356165d;
                    bVar2.a((f39 / f37) + f38, cVar.f356164c, size2 >= dVarB.f356153c && size2 <= dVarB.f356154d, f39);
                    f38 += cVar.f356165d;
                    size2--;
                    f37 = 2.0f;
                }
                dVarB = bVar2.b();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(dVarB);
            int i45 = 0;
            while (true) {
                list = dVarB.f356152b;
                if (i45 >= list.size()) {
                    i45 = -1;
                    break;
                } else if (list.get(i45).f356163b >= 0.0f) {
                    break;
                } else {
                    i45++;
                }
            }
            float f42 = dVarB.a().f356163b - (dVarB.a().f356165d / 2.0f);
            int i46 = dVarB.f356154d;
            int i47 = dVarB.f356153c;
            if (f42 > 0.0f && dVarB.a() != dVarB.b() && i45 != -1) {
                int i48 = (i47 - 1) - i45;
                float f43 = dVarB.b().f356163b - (dVarB.b().f356165d / 2.0f);
                for (int i49 = 0; i49 <= i48; i49++) {
                    d dVar2 = (d) r.j(1, arrayList);
                    int size3 = list.size() - 1;
                    int i52 = (i45 + i49) - 1;
                    if (i52 >= 0) {
                        float f44 = list.get(i52).f356164c;
                        int i53 = dVar2.f356154d;
                        while (true) {
                            List<d.c> list3 = dVar2.f356152b;
                            if (i53 >= list3.size()) {
                                i15 = 1;
                                size = list3.size() - 1;
                                break;
                            } else {
                                if (f44 == list3.get(i53).f356164c) {
                                    size = i53;
                                    i15 = 1;
                                    break;
                                }
                                i53++;
                            }
                        }
                        size3 = size - i15;
                    }
                    arrayList.add(e.c(dVar2, i45, size3, f43, (i47 - i49) - 1, (i46 - i49) - 1));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(dVarB);
            int size4 = list.size() - 1;
            while (true) {
                if (size4 < 0) {
                    carouselLayoutManager = this;
                    size4 = -1;
                    break;
                } else {
                    carouselLayoutManager = this;
                    if (list.get(size4).f356163b <= carouselLayoutManager.f53850p) {
                        break;
                    } else {
                        size4--;
                    }
                }
            }
            if ((dVarB.c().f356165d / 2.0f) + dVarB.c().f356163b < carouselLayoutManager.f53850p && dVarB.c() != dVarB.d() && size4 != -1) {
                int i54 = size4 - i46;
                float f45 = dVarB.b().f356163b - (dVarB.b().f356165d / 2.0f);
                for (int i55 = 0; i55 < i54; i55++) {
                    d dVar3 = (d) r.j(1, arrayList2);
                    int i56 = (size4 - i55) + 1;
                    if (i56 < list.size()) {
                        float f46 = list.get(i56).f356164c;
                        int i57 = dVar3.f356153c - 1;
                        while (true) {
                            if (i57 < 0) {
                                i57 = 0;
                                break;
                            } else if (f46 == dVar3.f356152b.get(i57).f356164c) {
                                break;
                            } else {
                                i57--;
                            }
                        }
                        i14 = i57 + 1;
                    } else {
                        i14 = 0;
                    }
                    arrayList2.add(e.c(dVar3, size4, i14, f45, i47 + i55 + 1, i46 + i55 + 1));
                }
            }
            carouselLayoutManager.f356140w = new e(dVarB, arrayList, arrayList2);
        } else {
            carouselLayoutManager = this;
            z12 = zH1;
            z13 = z14;
            f12 = 1.0f;
        }
        e eVar = carouselLayoutManager.f356140w;
        boolean zH12 = H1();
        d dVar4 = zH12 ? (d) m.h(1, eVar.f356168c) : (d) m.h(1, eVar.f356167b);
        d.c cVarC = zH12 ? dVar4.c() : dVar4.a();
        float paddingStart = getPaddingStart() * (zH12 ? 1 : -1);
        int i58 = (int) cVarC.f356162a;
        int i59 = (int) (dVar4.f356151a / 2.0f);
        int i62 = (int) ((paddingStart + (H1() ? carouselLayoutManager.f53850p : 0)) - (H1() ? i58 + i59 : i58 - i59));
        e eVar2 = carouselLayoutManager.f356140w;
        boolean zH13 = H1();
        if (zH13) {
            i12 = 1;
            dVar = (d) m.h(1, eVar2.f356167b);
        } else {
            i12 = 1;
            dVar = (d) m.h(1, eVar2.f356168c);
        }
        d.c cVarA = zH13 ? dVar.a() : dVar.c();
        float fB2 = (((zVar.b() - i12) * dVar.f356151a) + getPaddingEnd()) * (zH13 ? -1.0f : f12);
        float f47 = cVarA.f356162a - (H1() ? carouselLayoutManager.f53850p : 0);
        int i63 = Math.abs(f47) > Math.abs(fB2) ? 0 : (int) ((fB2 - f47) + ((H1() ? 0 : carouselLayoutManager.f53850p) - cVarA.f356162a));
        int i64 = z12 ? i63 : i62;
        carouselLayoutManager.f356136s = i64;
        if (z12) {
            i63 = i62;
        }
        carouselLayoutManager.f356137t = i63;
        if (z13) {
            carouselLayoutManager.f356135r = i62;
        } else {
            int i65 = carouselLayoutManager.f356135r;
            carouselLayoutManager.f356135r = (i65 < i64 ? i64 - i65 : i65 > i63 ? i63 - i65 : 0) + i65;
        }
        carouselLayoutManager.f356142y = M0.a.b(carouselLayoutManager.f356142y, 0, zVar.b());
        L1();
        U(uVar);
        E1(uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void V0(RecyclerView.z zVar) {
        if (e0() == 0) {
            this.f356142y = 0;
        } else {
            this.f356142y = RecyclerView.m.t0(d0(0));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n a0() {
        return new RecyclerView.n(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean h1(@N RecyclerView recyclerView, @N View view, @N Rect rect, boolean z12, boolean z13) {
        e eVar = this.f356140w;
        if (eVar == null) {
            return false;
        }
        int iF1 = F1(eVar.f356166a, RecyclerView.m.t0(view)) - this.f356135r;
        if (z13 || iF1 == 0) {
            return false;
        }
        recyclerView.scrollBy(iF1, 0);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void i0(@N View view, @N Rect rect) {
        RecyclerView.Y(view, rect);
        float fCenterX = rect.centerX();
        c cVarG1 = G1(this.f356141x.f356152b, fCenterX, true);
        d.c cVar = cVarG1.f356148a;
        float f12 = cVar.f356165d;
        d.c cVar2 = cVarG1.f356149b;
        float fWidth = (rect.width() - C43707b.b(f12, cVar2.f356165d, cVar.f356163b, cVar2.f356163b, fCenterX)) / 2.0f;
        rect.set((int) (rect.left + fWidth), rect.top, (int) (rect.right - fWidth), rect.bottom);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int k1(int i12, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (e0() == 0 || i12 == 0) {
            return 0;
        }
        int i13 = this.f356135r;
        int i14 = this.f356136s;
        int i15 = this.f356137t;
        int i16 = i13 + i12;
        if (i16 < i14) {
            i12 = i14 - i13;
        } else if (i16 > i15) {
            i12 = i15 - i13;
        }
        this.f356135r = i13 + i12;
        L1();
        float f12 = this.f356141x.f356151a / 2.0f;
        int iD1 = D1(RecyclerView.m.t0(d0(0)));
        Rect rect = new Rect();
        for (int i17 = 0; i17 < e0(); i17++) {
            View viewD0 = d0(i17);
            float fZ1 = z1(iD1, (int) f12);
            c cVarG1 = G1(this.f356141x.f356152b, fZ1, false);
            float fC1 = C1(viewD0, fZ1, cVarG1);
            if (viewD0 instanceof f) {
                d.c cVar = cVarG1.f356148a;
                float f13 = cVar.f356164c;
                d.c cVar2 = cVarG1.f356149b;
                ((f) viewD0).setMaskXPercentage(C43707b.b(f13, cVar2.f356164c, cVar.f356162a, cVar2.f356162a, fZ1));
            }
            RecyclerView.Y(viewD0, rect);
            viewD0.offsetLeftAndRight((int) (fC1 - (rect.left + f12)));
            iD1 = z1(iD1, (int) this.f356141x.f356151a);
        }
        E1(uVar, zVar);
        return i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void l1(int i12) {
        e eVar = this.f356140w;
        if (eVar == null) {
            return;
        }
        this.f356135r = F1(eVar.f356166a, i12);
        this.f356142y = M0.a.b(i12, 0, Math.max(0, o0() - 1));
        L1();
        i1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void w1(int i12, RecyclerView recyclerView) {
        com.google.android.material.carousel.b bVar = new com.google.android.material.carousel.b(this, recyclerView.getContext());
        bVar.f53878a = i12;
        x1(bVar);
    }

    public final int z1(int i12, int i13) {
        return H1() ? i12 - i13 : i12 + i13;
    }
}
