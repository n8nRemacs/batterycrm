package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.avito.android.R;
import com.yandex.div.core.InterfaceC37911f;
import com.yandex.div.core.view2.d0;
import com.yandex.div.core.view2.divs.C37931a;
import com.yandex.div2.C38501q0;
import com.yandex.div2.C38656z6;
import com.yandex.div2.D4;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.E5;
import com.yandex.div2.K;
import com.yandex.div2.O0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: DivBorderDrawer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/b;", "LF21/b;", "a", "b", "c", "d", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.view2.divs.widgets.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38010b implements F21.b {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f368877p = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DisplayMetrics f368878b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f368879c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public com.yandex.div.json.expressions.e f368880d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public K f368881e;

    /* renamed from: i, reason: collision with root package name */
    public float f368885i;

    /* renamed from: j, reason: collision with root package name */
    public float[] f368886j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f368887k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f368888l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f368889m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f368890n;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C10886b f368882f = new C10886b();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f368883g = C42727D.c(new e());

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f368884h = C42727D.c(new g());

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final ArrayList f368891o = new ArrayList();

    /* compiled from: DivBorderDrawer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/b$a;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.divs.widgets.b$a */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Paint f368892a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Path f368893b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final RectF f368894c;

        public a() {
            Paint paint = new Paint();
            this.f368892a = paint;
            this.f368893b = new Path();
            this.f368894c = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
        }
    }

    /* compiled from: DivBorderDrawer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/b$b;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.divs.widgets.b$b, reason: collision with other inner class name */
    public final class C10886b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Path f368896a = new Path();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final RectF f368897b = new RectF();

        public C10886b() {
        }

        public final void a(@Y61.k float[] fArr) {
            RectF rectF = this.f368897b;
            C38010b c38010b = C38010b.this;
            rectF.set(0.0f, 0.0f, c38010b.f368879c.getWidth(), c38010b.f368879c.getHeight());
            Path path = this.f368896a;
            path.reset();
            path.addRoundRect(rectF, (float[]) fArr.clone(), Path.Direction.CW);
            path.close();
        }
    }

    /* compiled from: DivBorderDrawer.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/b$c;", "", "<init>", "()V", "", "DEFAULT_DX", "F", "DEFAULT_DY", "DEFAULT_SHADOW_ALPHA", "", "DEFAULT_SHADOW_COLOR", "I", "NO_ELEVATION", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.divs.widgets.b$c */
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: DivBorderDrawer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/b$d;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.divs.widgets.b$d */
    public final class d {

        /* renamed from: a, reason: collision with root package name */
        public final float f368899a;

        /* renamed from: b, reason: collision with root package name */
        public float f368900b;

        /* renamed from: c, reason: collision with root package name */
        public int f368901c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Paint f368902d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final Rect f368903e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public NinePatch f368904f;

        /* renamed from: g, reason: collision with root package name */
        public float f368905g;

        /* renamed from: h, reason: collision with root package name */
        public float f368906h;

        public d() {
            float fB2 = com.avito.android.authorization.auto_recovery.phone_confirm.b.b(C38010b.this.f368879c, R.dimen.div_shadow_elevation);
            this.f368899a = fB2;
            this.f368900b = fB2;
            this.f368901c = -16777216;
            this.f368902d = new Paint();
            this.f368903e = new Rect();
            this.f368906h = 0.5f;
        }
    }

    /* compiled from: DivBorderDrawer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00060\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/b$a;", "Lcom/yandex/div/core/view2/divs/widgets/b;", "invoke", "()Lcom/yandex/div/core/view2/divs/widgets/b$a;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.core.view2.divs.widgets.b$e */
    public static final class e extends N implements Y41.a<a> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final a invoke() {
            return C38010b.this.new a();
        }
    }

    /* compiled from: DivBorderDrawer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.core.view2.divs.widgets.b$f */
    public static final class f extends N implements Y41.l<Object, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ K f368910m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.json.expressions.e f368911n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(K k12, com.yandex.div.json.expressions.e eVar) {
            super(1);
            this.f368910m = k12;
            this.f368911n = eVar;
        }

        @Override // Y41.l
        public final G0 invoke(Object obj) {
            int i12 = C38010b.f368877p;
            K k12 = this.f368910m;
            com.yandex.div.json.expressions.e eVar = this.f368911n;
            C38010b c38010b = C38010b.this;
            c38010b.a(eVar, k12);
            c38010b.f368879c.invalidate();
            return G0.f406611a;
        }
    }

    /* compiled from: DivBorderDrawer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00060\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/b$d;", "Lcom/yandex/div/core/view2/divs/widgets/b;", "invoke", "()Lcom/yandex/div/core/view2/divs/widgets/b$d;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.core.view2.divs.widgets.b$g */
    public static final class g extends N implements Y41.a<d> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final d invoke() {
            return C38010b.this.new d();
        }
    }

    static {
        new c(null);
    }

    public C38010b(@Y61.k DisplayMetrics displayMetrics, @Y61.k View view, @Y61.k com.yandex.div.json.expressions.e eVar, @Y61.k K k12) {
        this.f368878b = displayMetrics;
        this.f368879c = view;
        this.f368880d = eVar;
        this.f368881e = k12;
        l(this.f368880d, this.f368881e);
    }

    public static float b(float f12, float f13, float f14) {
        if (f14 <= 0.0f || f13 <= 0.0f) {
            return 0.0f;
        }
        float fMin = Math.min(f14, f13) / 2;
        if (f12 > fMin) {
            int i12 = com.yandex.div.internal.p.f370124a;
        }
        return Math.min(f12, fMin);
    }

    public final void a(com.yandex.div.json.expressions.e eVar, K k12) {
        boolean z12;
        com.yandex.div.json.expressions.b<Integer> bVar;
        Integer numA;
        C38656z6 c38656z6 = k12.f372643e;
        DisplayMetrics displayMetrics = this.f368878b;
        float fA2 = C38012d.a(c38656z6, eVar, displayMetrics);
        this.f368885i = fA2;
        float fB2 = 0.0f;
        boolean z13 = fA2 > 0.0f;
        this.f368888l = z13;
        if (z13) {
            C38656z6 c38656z62 = k12.f372643e;
            int iIntValue = (c38656z62 == null || (bVar = c38656z62.f377433a) == null || (numA = bVar.a(eVar)) == null) ? 0 : numA.intValue();
            a aVar = (a) this.f368883g.getValue();
            float f12 = this.f368885i;
            Paint paint = aVar.f368892a;
            paint.setStrokeWidth(f12);
            paint.setColor(iIntValue);
        }
        C38501q0 c38501q0 = k12.f372640b;
        com.yandex.div.json.expressions.b<Long> bVar2 = c38501q0 == null ? null : c38501q0.f376143c;
        com.yandex.div.json.expressions.b<Long> bVar3 = k12.f372639a;
        if (bVar2 == null) {
            bVar2 = bVar3;
        }
        float fO2 = C37931a.o(bVar2 == null ? null : bVar2.a(eVar), displayMetrics);
        com.yandex.div.json.expressions.b<Long> bVar4 = c38501q0 == null ? null : c38501q0.f376144d;
        if (bVar4 == null) {
            bVar4 = bVar3;
        }
        float fO3 = C37931a.o(bVar4 == null ? null : bVar4.a(eVar), displayMetrics);
        com.yandex.div.json.expressions.b<Long> bVar5 = c38501q0 == null ? null : c38501q0.f376141a;
        if (bVar5 == null) {
            bVar5 = bVar3;
        }
        float fO4 = C37931a.o(bVar5 == null ? null : bVar5.a(eVar), displayMetrics);
        com.yandex.div.json.expressions.b<Long> bVar6 = c38501q0 == null ? null : c38501q0.f376142b;
        if (bVar6 != null) {
            bVar3 = bVar6;
        }
        float fO5 = C37931a.o(bVar3 == null ? null : bVar3.a(eVar), displayMetrics);
        float[] fArr = {fO2, fO2, fO3, fO3, fO5, fO5, fO4, fO4};
        this.f368886j = fArr;
        float f13 = fArr[0];
        int i12 = 0;
        while (true) {
            if (i12 >= 8) {
                z12 = true;
                break;
            }
            float f14 = fArr[i12];
            i12++;
            if (!Float.valueOf(f14).equals(Float.valueOf(f13))) {
                z12 = false;
                break;
            }
        }
        this.f368887k = !z12;
        boolean z14 = this.f368889m;
        boolean zBooleanValue = k12.f372641c.a(eVar).booleanValue();
        this.f368890n = zBooleanValue;
        boolean z15 = k12.f372642d != null && zBooleanValue;
        this.f368889m = z15;
        View view = this.f368879c;
        if (zBooleanValue && !z15) {
            fB2 = com.avito.android.authorization.auto_recovery.phone_confirm.b.b(view, R.dimen.div_shadow_elevation);
        }
        view.setElevation(fB2);
        j();
        i();
        if (this.f368889m || z14) {
            Object parent = view.getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 == null) {
                return;
            }
            view2.invalidate();
        }
    }

    public final void c(@Y61.k Canvas canvas) {
        if (k()) {
            canvas.clipPath(this.f368882f.f368896a);
        }
    }

    public final void d(@Y61.k Canvas canvas) {
        if (this.f368888l) {
            InterfaceC42726C interfaceC42726C = this.f368883g;
            canvas.drawPath(((a) interfaceC42726C.getValue()).f368893b, ((a) interfaceC42726C.getValue()).f368892a);
        }
    }

    public final void f(@Y61.k Canvas canvas) {
        if (this.f368889m) {
            float f12 = h().f368905g;
            float f13 = h().f368906h;
            int iSave = canvas.save();
            canvas.translate(f12, f13);
            try {
                NinePatch ninePatch = h().f368904f;
                if (ninePatch != null) {
                    ninePatch.draw(canvas, h().f368903e, h().f368902d);
                }
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // F21.b
    @Y61.k
    public final List<InterfaceC37911f> getSubscriptions() {
        return this.f368891o;
    }

    public final d h() {
        return (d) this.f368884h.getValue();
    }

    public final void i() {
        boolean zK2 = k();
        View view = this.f368879c;
        if (zK2) {
            view.setClipToOutline(false);
            view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        } else {
            view.setOutlineProvider(new C38011c(this));
            view.setClipToOutline(true);
        }
    }

    public final void j() {
        com.yandex.div.json.expressions.b<Long> bVar;
        Long lA2;
        D4 d42;
        O0 o02;
        D4 d43;
        O0 o03;
        com.yandex.div.json.expressions.b<Double> bVar2;
        Double dA2;
        com.yandex.div.json.expressions.b<Integer> bVar3;
        Integer numA;
        float[] fArr = this.f368886j;
        if (fArr == null) {
            fArr = null;
        }
        float[] fArr2 = (float[]) fArr.clone();
        int length = fArr2.length;
        for (int i12 = 0; i12 < length; i12++) {
            float f12 = fArr2[i12];
            View view = this.f368879c;
            fArr2[i12] = b(f12, view.getWidth(), view.getHeight());
        }
        this.f368882f.a(fArr2);
        float f13 = this.f368885i / 2.0f;
        int length2 = fArr2.length;
        for (int i13 = 0; i13 < length2; i13++) {
            fArr2[i13] = Math.max(0.0f, fArr2[i13] - f13);
        }
        if (this.f368888l) {
            a aVar = (a) this.f368883g.getValue();
            C38010b c38010b = C38010b.this;
            float f14 = c38010b.f368885i / 2.0f;
            RectF rectF = aVar.f368894c;
            View view2 = c38010b.f368879c;
            rectF.set(f14, f14, view2.getWidth() - f14, view2.getHeight() - f14);
            Path path = aVar.f368893b;
            path.reset();
            path.addRoundRect(rectF, fArr2, Path.Direction.CW);
            path.close();
        }
        if (this.f368889m) {
            d dVarH = h();
            C38010b c38010b2 = C38010b.this;
            float f15 = 2;
            int width = (int) ((dVarH.f368900b * f15) + c38010b2.f368879c.getWidth());
            View view3 = c38010b2.f368879c;
            dVarH.f368903e.set(0, 0, width, (int) ((dVarH.f368900b * f15) + view3.getHeight()));
            E5 e52 = c38010b2.f368881e.f372642d;
            DisplayMetrics displayMetrics = c38010b2.f368878b;
            Float fValueOf = (e52 == null || (bVar = e52.f372248b) == null || (lA2 = bVar.a(c38010b2.f368880d)) == null) ? null : Float.valueOf(C37931a.p(lA2, displayMetrics));
            dVarH.f368900b = fValueOf == null ? dVarH.f368899a : fValueOf.floatValue();
            int iIntValue = -16777216;
            if (e52 != null && (bVar3 = e52.f372249c) != null && (numA = bVar3.a(c38010b2.f368880d)) != null) {
                iIntValue = numA.intValue();
            }
            dVarH.f368901c = iIntValue;
            float fDoubleValue = 0.23f;
            if (e52 != null && (bVar2 = e52.f372247a) != null && (dA2 = bVar2.a(c38010b2.f368880d)) != null) {
                fDoubleValue = (float) dA2.doubleValue();
            }
            Number numberValueOf = (e52 == null || (d42 = e52.f372250d) == null || (o02 = d42.f371170a) == null) ? null : Integer.valueOf(C37931a.O(o02, displayMetrics, c38010b2.f368880d));
            if (numberValueOf == null) {
                numberValueOf = Float.valueOf(com.yandex.div.internal.util.p.f370185a.density * 0.0f);
            }
            dVarH.f368905g = numberValueOf.floatValue() - dVarH.f368900b;
            Number numberValueOf2 = (e52 == null || (d43 = e52.f372250d) == null || (o03 = d43.f371171b) == null) ? null : Integer.valueOf(C37931a.O(o03, displayMetrics, c38010b2.f368880d));
            if (numberValueOf2 == null) {
                numberValueOf2 = Float.valueOf(0.5f * com.yandex.div.internal.util.p.f370185a.density);
            }
            dVarH.f368906h = numberValueOf2.floatValue() - dVarH.f368900b;
            Paint paint = dVarH.f368902d;
            paint.setColor(dVarH.f368901c);
            paint.setAlpha((int) (fDoubleValue * 255));
            d0 d0Var = d0.f367997a;
            Context context = view3.getContext();
            float f16 = dVarH.f368900b;
            d0Var.getClass();
            LinkedHashMap linkedHashMap = d0.f367999c;
            d0.a aVar2 = new d0.a(fArr2, f16);
            Object ninePatch = linkedHashMap.get(aVar2);
            if (ninePatch == null) {
                float fMax = Math.max(fArr2[1] + fArr2[2], fArr2[5] + fArr2[6]) + f16;
                float fMax2 = Math.max(fArr2[0] + fArr2[7], fArr2[3] + fArr2[4]) + f16;
                float f17 = kotlin.ranges.s.f(f16, 1.0f, 25.0f);
                float f18 = f16 <= 25.0f ? 1.0f : 25.0f / f16;
                float f19 = f16 * f15;
                int i14 = (int) ((fMax + f19) * f18);
                int i15 = (int) ((f19 + fMax2) * f18);
                Bitmap.Config config = Bitmap.Config.ALPHA_8;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i14, i15, config);
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i14, i15, config);
                RoundRectShape roundRectShape = new RoundRectShape(fArr2, null, null);
                roundRectShape.resize(fMax, fMax2);
                Canvas canvas = new Canvas();
                canvas.setBitmap(bitmapCreateBitmap);
                int iSave = canvas.save();
                canvas.translate(f17, f17);
                try {
                    iSave = canvas.save();
                    canvas.scale(f18, f18, 0.0f, 0.0f);
                    try {
                        roundRectShape.draw(canvas, d0.f367998b);
                        canvas.restoreToCount(iSave);
                        RenderScript renderScriptCreate = RenderScript.create(context);
                        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.A_8(renderScriptCreate));
                        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                        Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap2);
                        scriptIntrinsicBlurCreate.setRadius(f17);
                        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                        scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                        allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap2);
                        bitmapCreateBitmap.recycle();
                        if (f18 < 1.0f) {
                            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap2, (int) (bitmapCreateBitmap2.getWidth() / f18), (int) (bitmapCreateBitmap2.getHeight() / f18), true);
                            bitmapCreateBitmap2.recycle();
                            bitmapCreateBitmap2 = bitmapCreateScaledBitmap;
                        }
                        int width2 = bitmapCreateBitmap2.getWidth();
                        int height = bitmapCreateBitmap2.getHeight() / 2;
                        int i16 = width2 / 2;
                        ByteBuffer byteBufferOrder = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
                        byteBufferOrder.put((byte) 1);
                        byteBufferOrder.put((byte) 2);
                        byteBufferOrder.put((byte) 2);
                        byteBufferOrder.put((byte) 9);
                        int i17 = 0;
                        byteBufferOrder.putInt(0);
                        byteBufferOrder.putInt(0);
                        byteBufferOrder.putInt(0);
                        byteBufferOrder.putInt(0);
                        byteBufferOrder.putInt(0);
                        byteBufferOrder.putInt(0);
                        byteBufferOrder.putInt(0);
                        byteBufferOrder.putInt(i16 - 1);
                        byteBufferOrder.putInt(i16 + 1);
                        byteBufferOrder.putInt(height - 1);
                        byteBufferOrder.putInt(height + 1);
                        while (i17 < 9) {
                            i17++;
                            byteBufferOrder.putInt(1);
                        }
                        ninePatch = new NinePatch(bitmapCreateBitmap2, byteBufferOrder.array());
                        linkedHashMap.put(aVar2, ninePatch);
                    } finally {
                        canvas.restoreToCount(iSave);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            dVarH.f368904f = (NinePatch) ninePatch;
        }
    }

    public final boolean k() {
        return this.f368889m || (!this.f368890n && (this.f368887k || this.f368888l || com.yandex.div.internal.widget.t.a(this.f368879c)));
    }

    public final void l(com.yandex.div.json.expressions.e eVar, K k12) {
        com.yandex.div.json.expressions.b<Long> bVar;
        com.yandex.div.json.expressions.b<Long> bVar2;
        com.yandex.div.json.expressions.b<Long> bVar3;
        com.yandex.div.json.expressions.b<Long> bVar4;
        com.yandex.div.json.expressions.b<Integer> bVar5;
        com.yandex.div.json.expressions.b<Long> bVar6;
        com.yandex.div.json.expressions.b<DivSizeUnit> bVar7;
        com.yandex.div.json.expressions.b<Double> bVar8;
        com.yandex.div.json.expressions.b<Long> bVar9;
        com.yandex.div.json.expressions.b<Integer> bVar10;
        D4 d42;
        O0 o02;
        com.yandex.div.json.expressions.b<DivSizeUnit> bVar11;
        D4 d43;
        O0 o03;
        com.yandex.div.json.expressions.b<Double> bVar12;
        D4 d44;
        O0 o04;
        com.yandex.div.json.expressions.b<DivSizeUnit> bVar13;
        D4 d45;
        O0 o05;
        com.yandex.div.json.expressions.b<Double> bVar14;
        a(eVar, k12);
        f fVar = new f(k12, eVar);
        InterfaceC37911f interfaceC37911fD = null;
        com.yandex.div.json.expressions.b<Long> bVar15 = k12.f372639a;
        InterfaceC37911f interfaceC37911fD2 = bVar15 == null ? null : bVar15.d(eVar, fVar);
        if (interfaceC37911fD2 == null) {
            interfaceC37911fD2 = InterfaceC37911f.f367528l2;
        }
        e(interfaceC37911fD2);
        C38501q0 c38501q0 = k12.f372640b;
        InterfaceC37911f interfaceC37911fD3 = (c38501q0 == null || (bVar = c38501q0.f376143c) == null) ? null : bVar.d(eVar, fVar);
        if (interfaceC37911fD3 == null) {
            interfaceC37911fD3 = InterfaceC37911f.f367528l2;
        }
        e(interfaceC37911fD3);
        InterfaceC37911f interfaceC37911fD4 = (c38501q0 == null || (bVar2 = c38501q0.f376144d) == null) ? null : bVar2.d(eVar, fVar);
        if (interfaceC37911fD4 == null) {
            interfaceC37911fD4 = InterfaceC37911f.f367528l2;
        }
        e(interfaceC37911fD4);
        InterfaceC37911f interfaceC37911fD5 = (c38501q0 == null || (bVar3 = c38501q0.f376142b) == null) ? null : bVar3.d(eVar, fVar);
        if (interfaceC37911fD5 == null) {
            interfaceC37911fD5 = InterfaceC37911f.f367528l2;
        }
        e(interfaceC37911fD5);
        InterfaceC37911f interfaceC37911fD6 = (c38501q0 == null || (bVar4 = c38501q0.f376141a) == null) ? null : bVar4.d(eVar, fVar);
        if (interfaceC37911fD6 == null) {
            interfaceC37911fD6 = InterfaceC37911f.f367528l2;
        }
        e(interfaceC37911fD6);
        e(k12.f372641c.d(eVar, fVar));
        C38656z6 c38656z6 = k12.f372643e;
        InterfaceC37911f interfaceC37911fD7 = (c38656z6 == null || (bVar5 = c38656z6.f377433a) == null) ? null : bVar5.d(eVar, fVar);
        if (interfaceC37911fD7 == null) {
            interfaceC37911fD7 = InterfaceC37911f.f367528l2;
        }
        e(interfaceC37911fD7);
        InterfaceC37911f interfaceC37911fD8 = (c38656z6 == null || (bVar6 = c38656z6.f377435c) == null) ? null : bVar6.d(eVar, fVar);
        if (interfaceC37911fD8 == null) {
            interfaceC37911fD8 = InterfaceC37911f.f367528l2;
        }
        e(interfaceC37911fD8);
        InterfaceC37911f interfaceC37911fD9 = (c38656z6 == null || (bVar7 = c38656z6.f377434b) == null) ? null : bVar7.d(eVar, fVar);
        if (interfaceC37911fD9 == null) {
            interfaceC37911fD9 = InterfaceC37911f.f367528l2;
        }
        e(interfaceC37911fD9);
        E5 e52 = k12.f372642d;
        InterfaceC37911f interfaceC37911fD10 = (e52 == null || (bVar8 = e52.f372247a) == null) ? null : bVar8.d(eVar, fVar);
        if (interfaceC37911fD10 == null) {
            interfaceC37911fD10 = InterfaceC37911f.f367528l2;
        }
        e(interfaceC37911fD10);
        InterfaceC37911f interfaceC37911fD11 = (e52 == null || (bVar9 = e52.f372248b) == null) ? null : bVar9.d(eVar, fVar);
        if (interfaceC37911fD11 == null) {
            interfaceC37911fD11 = InterfaceC37911f.f367528l2;
        }
        e(interfaceC37911fD11);
        InterfaceC37911f interfaceC37911fD12 = (e52 == null || (bVar10 = e52.f372249c) == null) ? null : bVar10.d(eVar, fVar);
        if (interfaceC37911fD12 == null) {
            interfaceC37911fD12 = InterfaceC37911f.f367528l2;
        }
        e(interfaceC37911fD12);
        InterfaceC37911f interfaceC37911fD13 = (e52 == null || (d42 = e52.f372250d) == null || (o02 = d42.f371170a) == null || (bVar11 = o02.f373043a) == null) ? null : bVar11.d(eVar, fVar);
        if (interfaceC37911fD13 == null) {
            interfaceC37911fD13 = InterfaceC37911f.f367528l2;
        }
        e(interfaceC37911fD13);
        InterfaceC37911f interfaceC37911fD14 = (e52 == null || (d43 = e52.f372250d) == null || (o03 = d43.f371170a) == null || (bVar12 = o03.f373044b) == null) ? null : bVar12.d(eVar, fVar);
        if (interfaceC37911fD14 == null) {
            interfaceC37911fD14 = InterfaceC37911f.f367528l2;
        }
        e(interfaceC37911fD14);
        InterfaceC37911f interfaceC37911fD15 = (e52 == null || (d44 = e52.f372250d) == null || (o04 = d44.f371171b) == null || (bVar13 = o04.f373043a) == null) ? null : bVar13.d(eVar, fVar);
        if (interfaceC37911fD15 == null) {
            interfaceC37911fD15 = InterfaceC37911f.f367528l2;
        }
        e(interfaceC37911fD15);
        if (e52 != null && (d45 = e52.f372250d) != null && (o05 = d45.f371171b) != null && (bVar14 = o05.f373044b) != null) {
            interfaceC37911fD = bVar14.d(eVar, fVar);
        }
        if (interfaceC37911fD == null) {
            interfaceC37911fD = InterfaceC37911f.f367528l2;
        }
        e(interfaceC37911fD);
    }

    public final void m() {
        j();
        i();
    }
}
