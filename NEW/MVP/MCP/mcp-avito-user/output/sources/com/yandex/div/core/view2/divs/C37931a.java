package com.yandex.div.core.view2.divs;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import androidx.appcompat.widget.C19960l0;
import androidx.core.view.C22829k0;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.bottom_navigation.ViewOnLongClickListenerC28892n;
import com.yandex.div.core.InterfaceC37911f;
import com.yandex.div.core.InterfaceC37915j;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.C38042y;
import com.yandex.div.core.view2.divs.C37955g.b;
import com.yandex.div.core.view2.divs.widgets.C38010b;
import com.yandex.div.core.view2.divs.widgets.InterfaceC38013e;
import com.yandex.div.core.widget.InterfaceC38049e;
import com.yandex.div.internal.drawable.a;
import com.yandex.div.internal.drawable.e;
import com.yandex.div.internal.widget.AspectImageView;
import com.yandex.div.internal.widget.indicator.IndicatorParams;
import com.yandex.div.internal.widget.menu.c;
import com.yandex.div.json.expressions.b;
import com.yandex.div2.A4;
import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.AbstractC38579v4;
import com.yandex.div2.C38502q1;
import com.yandex.div2.C38588w4;
import com.yandex.div2.C38656z6;
import com.yandex.div2.DivAccessibility;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivBlendMode;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivContentAlignmentHorizontal;
import com.yandex.div2.DivContentAlignmentVertical;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivImageScale;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.G4;
import com.yandex.div2.G5;
import com.yandex.div2.H5;
import com.yandex.div2.I4;
import com.yandex.div2.K5;
import com.yandex.div2.M4;
import com.yandex.div2.O4;
import com.yandex.div2.U4;
import com.yandex.div2.W0;
import com.yandex.div2.w8;
import com.yandex.div2.y8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.collections.C42784z0;
import kotlin.sequences.C43029l;
import kotlin.sequences.C43033p;

/* compiled from: BaseDivViewExtensions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"div_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.view2.divs.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37931a {

    /* compiled from: BaseDivViewExtensions.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.divs.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C10872a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f368311a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f368312b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f368313c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f368314d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f368315e;

        static {
            int[] iArr = new int[DivSizeUnit.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            f368311a = iArr;
            int[] iArr2 = new int[DivAlignmentHorizontal.values().length];
            iArr2[0] = 1;
            iArr2[1] = 2;
            iArr2[2] = 3;
            f368312b = iArr2;
            int[] iArr3 = new int[DivAlignmentVertical.values().length];
            iArr3[0] = 1;
            iArr3[1] = 2;
            iArr3[2] = 3;
            f368313c = iArr3;
            int[] iArr4 = new int[DivContentAlignmentHorizontal.values().length];
            iArr4[0] = 1;
            iArr4[1] = 2;
            iArr4[2] = 3;
            f368314d = iArr4;
            int[] iArr5 = new int[DivContentAlignmentVertical.values().length];
            iArr5[0] = 1;
            iArr5[1] = 2;
            iArr5[2] = 3;
            iArr5[3] = 4;
            f368315e = iArr5;
            int[] iArr6 = new int[DivImageScale.values().length];
            iArr6[0] = 1;
            iArr6[2] = 2;
            iArr6[3] = 3;
            iArr6[1] = 4;
            int[] iArr7 = new int[DivBlendMode.values().length];
            iArr7[0] = 1;
            iArr7[1] = 2;
            iArr7[2] = 3;
            iArr7[3] = 4;
            iArr7[4] = 5;
            iArr7[5] = 6;
            int[] iArr8 = new int[DivFontWeight.values().length];
            iArr8[0] = 1;
            iArr8[2] = 2;
            iArr8[1] = 3;
            iArr8[3] = 4;
        }
    }

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V", "androidx/core/view/v0"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.core.view2.divs.a$b */
    public static final class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f368316b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f368317c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div2.H f368318d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.json.expressions.e f368319e;

        public b(View view, View view2, com.yandex.div2.H h12, com.yandex.div.json.expressions.e eVar) {
            this.f368316b = view;
            this.f368317c = view2;
            this.f368318d = h12;
            this.f368319e = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view = this.f368317c;
            int width = view.getWidth();
            com.yandex.div2.H h12 = this.f368318d;
            AbstractC38579v4 abstractC38579v4 = h12.getF374444B().f374380a;
            com.yandex.div.json.expressions.e eVar = this.f368319e;
            view.setPivotX(C37931a.w(width, abstractC38579v4, eVar));
            view.setPivotY(C37931a.w(view.getHeight(), h12.getF374444B().f374381b, eVar));
        }
    }

    /* compiled from: BaseDivViewExtensions.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "ratio", "Lkotlin/G0;", "invoke", "(D)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.core.view2.divs.a$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Double, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f368320l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(1);
            this.f368320l = view;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Double d12) {
            ((InterfaceC38049e) this.f368320l).setAspectRatio((float) d12.doubleValue());
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BaseDivViewExtensions.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.core.view2.divs.a$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<Object, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f368321l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div2.W0 f368322m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Y41.l<? super com.yandex.div2.W0, kotlin.G0> lVar, com.yandex.div2.W0 w02) {
            super(1);
            this.f368321l = (kotlin.jvm.internal.N) lVar;
            this.f368322m = w02;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final kotlin.G0 invoke(Object obj) {
            this.f368321l.invoke(this.f368322m);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/u0", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.divs.a$e */
    public static final class e implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f368323b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f368324c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.core.view2.X f368325d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C38029k f368326e;

        public e(ViewGroup viewGroup, List list, com.yandex.div.core.view2.X x12, C38029k c38029k) {
            this.f368323b = viewGroup;
            this.f368324c = list;
            this.f368325d = x12;
            this.f368326e = c38029k;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.k View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            view.removeOnLayoutChangeListener(this);
            C43029l.a aVar = new C43029l.a(C43033p.G(new C22829k0(this.f368323b), new C42770s0(this.f368324c)));
            while (aVar.hasNext()) {
                kotlin.Q q12 = (kotlin.Q) aVar.next();
                View view2 = (View) q12.f406619b;
                AbstractC38330g abstractC38330g = (AbstractC38330g) q12.f406620c;
                this.f368325d.d(this.f368326e, view2, abstractC38330g, C37931a.u(abstractC38330g.a()));
            }
        }
    }

    public static final boolean A(@Y61.k DivContainer divContainer, @Y61.k com.yandex.div.json.expressions.e eVar) {
        com.yandex.div.json.expressions.b<Boolean> bVar;
        com.yandex.div.json.expressions.b<Boolean> bVar2;
        if (divContainer.f371378u.a(eVar) != DivContainer.LayoutMode.WRAP || divContainer.f371382y.a(eVar) == DivContainer.Orientation.OVERLAP) {
            return false;
        }
        if (z(divContainer, eVar)) {
            K5 k52 = divContainer.f371357M;
            if ((k52 instanceof K5.e) && ((bVar2 = ((K5.e) k52).f372717c.f377207a) == null || !bVar2.a(eVar).booleanValue())) {
                return false;
            }
        } else {
            K5 k53 = divContainer.f371375r;
            if (!(!(k53 instanceof K5.e) || ((bVar = ((K5.e) k53).f372717c.f377207a) != null && bVar.a(eVar).booleanValue()))) {
                com.yandex.div2.D d12 = divContainer.f371365h;
                if (d12 == null) {
                    return false;
                }
                return !(((float) d12.f371166a.a(eVar).doubleValue()) == 0.0f);
            }
        }
        return true;
    }

    public static final void B(@Y61.k G4 g42, @Y61.k com.yandex.div.json.expressions.e eVar, @Y61.k F21.b bVar, @Y61.k Y41.l<Object, kotlin.G0> lVar) {
        com.yandex.div.json.b bVar2;
        g42.getClass();
        if (g42 instanceof G4.c) {
            bVar2 = ((G4.c) g42).f372485c;
        } else {
            if (!(g42 instanceof G4.d)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar2 = ((G4.d) g42).f372486c;
        }
        if (bVar2 instanceof I4) {
            I4 i42 = (I4) bVar2;
            bVar.e(i42.f372587a.d(eVar, lVar));
            bVar.e(i42.f372588b.d(eVar, lVar));
        } else if (bVar2 instanceof O4) {
            bVar.e(((O4) bVar2).f373132a.d(eVar, lVar));
        }
    }

    public static final void C(@Y61.k M4 m42, @Y61.k com.yandex.div.json.expressions.e eVar, @Y61.k F21.b bVar, @Y61.k Y41.l<Object, kotlin.G0> lVar) {
        com.yandex.div.json.b bVar2;
        m42.getClass();
        if (m42 instanceof M4.c) {
            bVar2 = ((M4.c) m42).f372802c;
        } else {
            if (!(m42 instanceof M4.d)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar2 = ((M4.d) m42).f372803c;
        }
        if (bVar2 instanceof C38502q1) {
            C38502q1 c38502q1 = (C38502q1) bVar2;
            bVar.e(c38502q1.f376151a.d(eVar, lVar));
            bVar.e(c38502q1.f376152b.d(eVar, lVar));
        } else if (bVar2 instanceof DivRadialGradientRelativeRadius) {
            bVar.e(((DivRadialGradientRelativeRadius) bVar2).f371864a.d(eVar, lVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void D(@Y61.k View view, @Y61.k com.yandex.div.json.expressions.e eVar, @Y61.l com.yandex.div2.D d12) {
        if (view instanceof InterfaceC38049e) {
            if ((d12 == null ? null : d12.f371166a) == null) {
                ((InterfaceC38049e) view).setAspectRatio(0.0f);
                return;
            }
            F21.b bVar = view instanceof F21.b ? (F21.b) view : null;
            if (bVar == null) {
                return;
            }
            bVar.e(d12.f371166a.e(eVar, new c(view)));
        }
    }

    public static final void E(@Y61.k F21.b bVar, @Y61.k com.yandex.div.json.expressions.e eVar, @Y61.k com.yandex.div2.W0 w02, @Y61.k Y41.l<? super com.yandex.div2.W0, kotlin.G0> lVar) {
        lVar.invoke(w02);
        d dVar = new d(lVar, w02);
        if (w02 instanceof W0.c) {
            H5 h52 = ((W0.c) w02).f373778c;
            bVar.e(h52.f372530a.d(eVar, dVar));
            H(bVar, eVar, h52.f372532c, dVar);
            G(bVar, eVar, h52.f372531b, dVar);
        }
    }

    public static final void F(@Y61.k F21.b bVar, @Y61.k com.yandex.div.json.expressions.e eVar, @Y61.k U4 u42, @Y61.k Y41.l<Object, kotlin.G0> lVar) {
        InterfaceC37911f interfaceC37911fD;
        C38502q1 c38502q1 = u42.f373695d;
        bVar.e(c38502q1.f376152b.d(eVar, lVar));
        bVar.e(c38502q1.f376151a.d(eVar, lVar));
        C38502q1 c38502q12 = u42.f373694c;
        bVar.e(c38502q12.f376152b.d(eVar, lVar));
        bVar.e(c38502q12.f376151a.d(eVar, lVar));
        C38502q1 c38502q13 = u42.f373693b;
        bVar.e(c38502q13.f376152b.d(eVar, lVar));
        bVar.e(c38502q13.f376151a.d(eVar, lVar));
        com.yandex.div.json.expressions.b<Integer> bVar2 = u42.f373692a;
        if (bVar2 != null && (interfaceC37911fD = bVar2.d(eVar, lVar)) != null) {
            bVar.e(interfaceC37911fD);
        }
        H(bVar, eVar, u42.f373696e, lVar);
    }

    public static final void G(@Y61.k F21.b bVar, @Y61.k com.yandex.div.json.expressions.e eVar, @Y61.k G5 g52, @Y61.k Y41.l<Object, kotlin.G0> lVar) {
        InterfaceC37911f interfaceC37911fD;
        if (g52 instanceof G5.d) {
            F(bVar, eVar, ((G5.d) g52).f372491c, lVar);
            return;
        }
        if (g52 instanceof G5.a) {
            com.yandex.div2.V v12 = ((G5.a) g52).f372489c;
            bVar.e(v12.f373702b.f376152b.d(eVar, lVar));
            bVar.e(v12.f373702b.f376151a.d(eVar, lVar));
            com.yandex.div.json.expressions.b<Integer> bVar2 = v12.f373701a;
            if (bVar2 != null && (interfaceC37911fD = bVar2.d(eVar, lVar)) != null) {
                bVar.e(interfaceC37911fD);
            }
            H(bVar, eVar, v12.f373703c, lVar);
        }
    }

    public static final void H(F21.b bVar, com.yandex.div.json.expressions.e eVar, C38656z6 c38656z6, Y41.l<Object, kotlin.G0> lVar) {
        if (c38656z6 == null) {
            return;
        }
        bVar.e(c38656z6.f377433a.d(eVar, lVar));
        bVar.e(c38656z6.f377435c.d(eVar, lVar));
        bVar.e(c38656z6.f377434b.d(eVar, lVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void I(@Y61.k android.view.View r2, @Y61.k com.yandex.div.core.view2.C38029k r3, @Y61.l com.yandex.div2.DivAnimation r4, @Y61.l com.yandex.div.core.view2.C38042y r5) {
        /*
            r0 = 0
            if (r4 != 0) goto L5
            r4 = r0
            goto Ld
        L5:
            com.yandex.div.json.expressions.e r1 = r3.getExpressionResolver()
            Y41.p r4 = com.yandex.div.core.view2.animations.j.b(r4, r1, r2)
        Ld:
            if (r5 != 0) goto L11
        Lf:
            r1 = r0
            goto L28
        L11:
            Y41.a<kotlin.G0> r1 = r5.f369222b
            if (r1 != 0) goto L1b
            kotlin.jvm.internal.N r1 = r5.f369223c
            if (r1 != 0) goto L1b
            r1 = r0
            goto L1c
        L1b:
            r1 = r5
        L1c:
            if (r1 != 0) goto L1f
            goto Lf
        L1f:
            androidx.core.view.m r1 = new androidx.core.view.m
            android.content.Context r3 = r3.getContext()
            r1.<init>(r3, r5, r0)
        L28:
            if (r4 != 0) goto L31
            if (r1 == 0) goto L2d
            goto L31
        L2d:
            r2.setOnTouchListener(r0)
            goto L3a
        L31:
            L91.p r3 = new L91.p
            r5 = 4
            r3.<init>(r5, r4, r1)
            r2.setOnTouchListener(r3)
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.C37931a.I(android.view.View, com.yandex.div.core.view2.k, com.yandex.div2.DivAnimation, com.yandex.div.core.view2.y):void");
    }

    public static final int J(@Y61.l Long l12, @Y61.k DisplayMetrics displayMetrics) {
        int i12;
        float f12;
        if (l12 == null) {
            f12 = 0.0f;
        } else {
            long jLongValue = l12.longValue();
            long j12 = jLongValue >> 31;
            if (j12 == 0 || j12 == -1) {
                i12 = (int) jLongValue;
            } else {
                int i13 = com.yandex.div.internal.n.f370123a;
                i12 = jLongValue > 0 ? Integer.MAX_VALUE : BeduinInputModel.MIN_TEXT_VERSION;
            }
            f12 = i12;
        }
        return kotlin.math.b.b(TypedValue.applyDimension(2, f12, displayMetrics));
    }

    @Y61.l
    public static final Drawable K(@Y61.k com.yandex.div2.W0 w02, @Y61.k DisplayMetrics displayMetrics, @Y61.k com.yandex.div.json.expressions.e eVar) {
        Drawable aVar;
        com.yandex.div.json.expressions.b<Integer> bVar;
        com.yandex.div.json.expressions.b<Long> bVar2;
        Long lA2;
        com.yandex.div.json.expressions.b<Integer> bVar3;
        com.yandex.div.json.expressions.b<Long> bVar4;
        Long lA3;
        if (!(w02 instanceof W0.c)) {
            throw new NoWhenBranchMatchedException();
        }
        H5 h52 = ((W0.c) w02).f373778c;
        G5 g52 = h52.f372531b;
        boolean z12 = g52 instanceof G5.d;
        Float fValueOf = null;
        com.yandex.div.json.expressions.b<Integer> bVar5 = h52.f372530a;
        C38656z6 c38656z6 = h52.f372532c;
        if (z12) {
            G5.d dVar = (G5.d) g52;
            float fR2 = R(dVar.f372491c.f373695d, displayMetrics, eVar);
            U4 u42 = dVar.f372491c;
            float fR3 = R(u42.f373694c, displayMetrics, eVar);
            com.yandex.div.json.expressions.b<Integer> bVar6 = u42.f373692a;
            if (bVar6 != null) {
                bVar5 = bVar6;
            }
            int iIntValue = bVar5.a(eVar).intValue();
            float fR4 = R(u42.f373693b, displayMetrics, eVar);
            C38656z6 c38656z62 = u42.f373696e;
            C38656z6 c38656z63 = c38656z62 == null ? c38656z6 : c38656z62;
            Integer numA = (c38656z63 == null || (bVar3 = c38656z63.f377433a) == null) ? null : bVar3.a(eVar);
            if (c38656z62 != null) {
                c38656z6 = c38656z62;
            }
            if (c38656z6 != null && (bVar4 = c38656z6.f377435c) != null && (lA3 = bVar4.a(eVar)) != null) {
                fValueOf = Float.valueOf(lA3.longValue());
            }
            aVar = new com.yandex.div.internal.drawable.e(new e.a(fR2, fR3, iIntValue, fR4, numA, fValueOf));
        } else {
            if (!(g52 instanceof G5.a)) {
                return null;
            }
            G5.a aVar2 = (G5.a) g52;
            float fR5 = R(aVar2.f372489c.f373702b, displayMetrics, eVar);
            com.yandex.div2.V v12 = aVar2.f372489c;
            com.yandex.div.json.expressions.b<Integer> bVar7 = v12.f373701a;
            if (bVar7 != null) {
                bVar5 = bVar7;
            }
            int iIntValue2 = bVar5.a(eVar).intValue();
            C38656z6 c38656z64 = v12.f373703c;
            C38656z6 c38656z65 = c38656z64 == null ? c38656z6 : c38656z64;
            Integer numA2 = (c38656z65 == null || (bVar = c38656z65.f377433a) == null) ? null : bVar.a(eVar);
            if (c38656z64 != null) {
                c38656z6 = c38656z64;
            }
            if (c38656z6 != null && (bVar2 = c38656z6.f377435c) != null && (lA2 = bVar2.a(eVar)) != null) {
                fValueOf = Float.valueOf(lA2.longValue());
            }
            aVar = new com.yandex.div.internal.drawable.a(new a.C10926a(fR5, iIntValue2, numA2, fValueOf));
        }
        return aVar;
    }

    @Y61.k
    public static final AspectImageView.Scale L(@Y61.k DivImageScale divImageScale) {
        int iOrdinal = divImageScale.ordinal();
        if (iOrdinal == 0) {
            return AspectImageView.Scale.f370234d;
        }
        if (iOrdinal == 1) {
            return AspectImageView.Scale.f370232b;
        }
        if (iOrdinal == 2) {
            return AspectImageView.Scale.f370233c;
        }
        if (iOrdinal == 3) {
            return AspectImageView.Scale.f370235e;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int M(@Y61.l K5 k52, @Y61.k DisplayMetrics displayMetrics, @Y61.k com.yandex.div.json.expressions.e eVar, @Y61.l ViewGroup.LayoutParams layoutParams) {
        if (k52 == null) {
            return -2;
        }
        if (!(k52 instanceof K5.d)) {
            if (k52 instanceof K5.c) {
                return P(((K5.c) k52).f372715c, displayMetrics, eVar);
            }
            if (!(k52 instanceof K5.e)) {
                throw new NoWhenBranchMatchedException();
            }
            com.yandex.div.json.expressions.b<Boolean> bVar = ((K5.e) k52).f372717c.f377207a;
            if (bVar == null || !bVar.a(eVar).booleanValue()) {
                return -2;
            }
            if (layoutParams instanceof com.yandex.div.internal.widget.c) {
                return -3;
            }
        }
        return -1;
    }

    @Y61.k
    public static final PorterDuff.Mode N(@Y61.k DivBlendMode divBlendMode) {
        int iOrdinal = divBlendMode.ordinal();
        if (iOrdinal == 0) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (iOrdinal == 1) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (iOrdinal == 2) {
            return PorterDuff.Mode.DARKEN;
        }
        if (iOrdinal == 3) {
            return PorterDuff.Mode.LIGHTEN;
        }
        if (iOrdinal == 4) {
            return PorterDuff.Mode.MULTIPLY;
        }
        if (iOrdinal == 5) {
            return PorterDuff.Mode.SCREEN;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int O(@Y61.k com.yandex.div2.O0 o02, @Y61.k DisplayMetrics displayMetrics, @Y61.k com.yandex.div.json.expressions.e eVar) {
        int iOrdinal = o02.f373043a.a(eVar).ordinal();
        com.yandex.div.json.expressions.b<Double> bVar = o02.f373044b;
        if (iOrdinal == 0) {
            Double dA2 = bVar.a(eVar);
            return kotlin.math.b.b(TypedValue.applyDimension(1, dA2 != null ? (float) dA2.doubleValue() : 0.0f, displayMetrics));
        }
        if (iOrdinal == 1) {
            Double dA3 = bVar.a(eVar);
            return kotlin.math.b.b(TypedValue.applyDimension(1, dA3 != null ? (float) dA3.doubleValue() : 0.0f, displayMetrics));
        }
        if (iOrdinal == 2) {
            return (int) bVar.a(eVar).doubleValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int P(@Y61.k C38502q1 c38502q1, @Y61.k DisplayMetrics displayMetrics, @Y61.k com.yandex.div.json.expressions.e eVar) {
        int iOrdinal = c38502q1.f376151a.a(eVar).ordinal();
        com.yandex.div.json.expressions.b<Long> bVar = c38502q1.f376152b;
        if (iOrdinal == 0) {
            return o(bVar.a(eVar), displayMetrics);
        }
        if (iOrdinal == 1) {
            return J(bVar.a(eVar), displayMetrics);
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        long jLongValue = bVar.a(eVar).longValue();
        long j12 = jLongValue >> 31;
        if (j12 == 0 || j12 == -1) {
            return (int) jLongValue;
        }
        int i12 = com.yandex.div.internal.n.f370123a;
        if (jLongValue > 0) {
            return Integer.MAX_VALUE;
        }
        return BeduinInputModel.MIN_TEXT_VERSION;
    }

    public static final int Q(@Y61.k y8.c cVar, @Y61.k DisplayMetrics displayMetrics, @Y61.k com.yandex.div.json.expressions.e eVar) {
        int iOrdinal = cVar.f377216a.a(eVar).ordinal();
        com.yandex.div.json.expressions.b<Long> bVar = cVar.f377217b;
        if (iOrdinal == 0) {
            return o(bVar.a(eVar), displayMetrics);
        }
        if (iOrdinal == 1) {
            return J(bVar.a(eVar), displayMetrics);
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        long jLongValue = bVar.a(eVar).longValue();
        long j12 = jLongValue >> 31;
        if (j12 == 0 || j12 == -1) {
            return (int) jLongValue;
        }
        int i12 = com.yandex.div.internal.n.f370123a;
        if (jLongValue > 0) {
            return Integer.MAX_VALUE;
        }
        return BeduinInputModel.MIN_TEXT_VERSION;
    }

    public static final float R(@Y61.k C38502q1 c38502q1, @Y61.k DisplayMetrics displayMetrics, @Y61.k com.yandex.div.json.expressions.e eVar) {
        return t(c38502q1.f376152b.a(eVar).longValue(), c38502q1.f376151a.a(eVar), displayMetrics);
    }

    @j.K
    public static final void S(@Y61.k ViewGroup viewGroup, @Y61.k List<? extends AbstractC38330g> list, @Y61.l List<? extends AbstractC38330g> list2, @Y61.k C38029k c38029k) {
        com.yandex.div.core.view2.X xT2 = c38029k.getDiv2Component().t();
        List<? extends AbstractC38330g> list3 = list2;
        if (list3 != null && !list3.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                C42745f0.h(u(((AbstractC38330g) it.next()).a()), arrayList);
            }
            HashSet hashSet = new HashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                hashSet.add(((w8) it2.next()).f376951a);
            }
            for (AbstractC38330g abstractC38330g : list2) {
                List<w8> listU = u(abstractC38330g.a());
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listU) {
                    if (!hashSet.contains(((w8) obj).f376951a)) {
                        arrayList2.add(obj);
                    }
                }
                xT2.d(c38029k, null, abstractC38330g, arrayList2);
            }
        }
        if (list.isEmpty()) {
            return;
        }
        viewGroup.addOnLayoutChangeListener(new e(viewGroup, list, xT2, c38029k));
    }

    public static final int T(@Y61.l Long l12, @Y61.k DisplayMetrics displayMetrics, @Y61.k DivSizeUnit divSizeUnit) {
        int i12;
        float f12;
        int iOrdinal = divSizeUnit.ordinal();
        int i13 = 1;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i13 = 2;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i13 = 0;
            }
        }
        if (l12 == null) {
            f12 = 0.0f;
        } else {
            long jLongValue = l12.longValue();
            long j12 = jLongValue >> 31;
            if (j12 == 0 || j12 == -1) {
                i12 = (int) jLongValue;
            } else {
                int i14 = com.yandex.div.internal.n.f370123a;
                i12 = jLongValue > 0 ? Integer.MAX_VALUE : BeduinInputModel.MIN_TEXT_VERSION;
            }
            f12 = i12;
        }
        return kotlin.math.b.b(TypedValue.applyDimension(i13, f12, displayMetrics));
    }

    @Y61.l
    public static final <T extends View & InterfaceC38013e> C38010b U(@Y61.k T t12, @Y61.l com.yandex.div2.K k12, @Y61.k com.yandex.div.json.expressions.e eVar) {
        C38010b f369006c = t12.getF368960g();
        if (kotlin.jvm.internal.L.f(k12, f369006c == null ? null : f369006c.f368881e)) {
            return f369006c;
        }
        if (k12 != null) {
            if (f369006c != null) {
                f369006c.g();
                f369006c.f368880d = eVar;
                f369006c.f368881e = k12;
                f369006c.l(eVar, k12);
            } else if (y(k12)) {
                t12.setElevation(0.0f);
                t12.setClipToOutline(true);
                t12.setOutlineProvider(ViewOutlineProvider.BOUNDS);
            } else {
                f369006c = new C38010b(t12.getResources().getDisplayMetrics(), t12, eVar, k12);
            }
            t12.invalidate();
            return f369006c;
        }
        if (f369006c != null) {
            f369006c.g();
        }
        t12.setElevation(0.0f);
        t12.setClipToOutline(false);
        t12.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        f369006c = null;
        t12.invalidate();
        return f369006c;
    }

    public static final void a(@Y61.k View view, @Y61.l DivAlignmentHorizontal divAlignmentHorizontal, @Y61.l DivAlignmentVertical divAlignmentVertical) {
        int iR2 = r(divAlignmentHorizontal, divAlignmentVertical);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof com.yandex.div.internal.widget.c) {
            com.yandex.div.internal.widget.c cVar = (com.yandex.div.internal.widget.c) layoutParams;
            if (cVar.f370243a != iR2) {
                cVar.f370243a = iR2;
                view.requestLayout();
            }
        } else {
            Objects.toString(view.getTag());
            Objects.toString(layoutParams);
        }
        boolean z12 = divAlignmentVertical == DivAlignmentVertical.BASELINE;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        com.yandex.div.internal.widget.c cVar2 = layoutParams2 instanceof com.yandex.div.internal.widget.c ? (com.yandex.div.internal.widget.c) layoutParams2 : null;
        if (cVar2 == null || cVar2.f370244b == z12) {
            return;
        }
        cVar2.f370244b = z12;
        view.requestLayout();
    }

    public static final void b(@Y61.k View view, @Y61.l String str, @Y61.l String str2) {
        if (str == null) {
            str = str2;
        } else if (str2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) str);
            sb2.append('\n');
            sb2.append((Object) str2);
            str = sb2.toString();
        }
        view.setContentDescription(str);
    }

    public static final void c(@Y61.k final View view, @Y61.k final C38029k c38029k, @Y61.l DivAction divAction, @Y61.l List<? extends DivAction> list, @Y61.l final List<? extends DivAction> list2, @Y61.l List<? extends DivAction> list3, @Y61.k DivAnimation divAnimation) {
        boolean z12;
        C38042y c38042y;
        boolean z13;
        boolean z14;
        C38042y c38042y2;
        DivAnimation divAnimation2;
        char c12;
        Object obj;
        Object next;
        Object next2;
        int i12;
        final C37955g c37955gM = c38029k.getDiv2Component().m();
        List<? extends DivAction> list4 = list;
        final List<? extends DivAction> listSingletonList = (list4 == null || list4.isEmpty()) ? divAction == null ? null : Collections.singletonList(divAction) : list;
        boolean zIsClickable = view.isClickable();
        boolean zIsLongClickable = view.isLongClickable();
        C38042y c38042y3 = new C38042y();
        List<? extends DivAction> list5 = listSingletonList;
        boolean z15 = list5 == null || list5.isEmpty();
        List<? extends DivAction> list6 = list2;
        boolean z16 = c37955gM.f368385e;
        boolean z17 = c37955gM.f368384d;
        if (list6 == null || list6.isEmpty()) {
            z12 = z16;
            c38042y = c38042y3;
            z13 = zIsLongClickable;
            z14 = zIsClickable;
            if (!z17 || z15) {
                view.setOnLongClickListener(null);
                view.setLongClickable(false);
            } else if (C37983o.a(view)) {
                view.setOnLongClickListener(new ViewOnLongClickListenerC28892n(c37955gM.f368387g, 5));
                view.setTag(R.id.div_penetrating_longtap_tag, Boolean.TRUE);
            } else {
                view.setOnLongClickListener(null);
                view.setLongClickable(false);
                view.setTag(R.id.div_penetrating_longtap_tag, null);
            }
        } else {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                List<DivAction.d> list7 = ((DivAction) next2).f371217b;
                if (list7 != null && !list7.isEmpty() && !z16) {
                    break;
                }
            }
            final DivAction divAction2 = (DivAction) next2;
            if (divAction2 != null) {
                List<DivAction.d> list8 = divAction2.f371217b;
                if (list8 == null) {
                    int i13 = com.yandex.div.internal.n.f370123a;
                    z12 = z16;
                    c38042y = c38042y3;
                    z13 = zIsLongClickable;
                    z14 = zIsClickable;
                    i12 = R.id.div_penetrating_longtap_tag;
                } else {
                    view.getContext();
                    final com.yandex.div.internal.widget.menu.c cVar = new com.yandex.div.internal.widget.menu.c(view);
                    cVar.f370322b = c37955gM.new b(c38029k, list8);
                    c38029k.n();
                    c38029k.w(new C37980n());
                    i12 = R.id.div_penetrating_longtap_tag;
                    z12 = z16;
                    c38042y = c38042y3;
                    z13 = zIsLongClickable;
                    z14 = zIsClickable;
                    view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.yandex.div.core.view2.divs.d
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view2) {
                            UUID.randomUUID().toString();
                            C37955g c37955g = c37955gM;
                            com.yandex.div.json.expressions.e expressionResolver = c38029k.getExpressionResolver();
                            c37955g.f368383c.a(divAction2, expressionResolver);
                            com.yandex.div.internal.widget.menu.c cVar2 = cVar;
                            View view3 = view;
                            C19960l0 c19960l0 = new C19960l0(view3.getContext(), view3);
                            c.a aVar = cVar2.f370322b;
                            if (aVar != null) {
                                aVar.a(c19960l0);
                            }
                            androidx.appcompat.view.menu.n nVar = c19960l0.f22566c;
                            if (!nVar.b()) {
                                if (nVar.f21903e == null) {
                                    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                                }
                                nVar.e(0, 0, false, false);
                            }
                            for (DivAction divAction3 : list2) {
                                c37955g.f368382b.getClass();
                                InterfaceC37915j interfaceC37915j = InterfaceC37915j.f367563a;
                            }
                            return true;
                        }
                    });
                }
            } else {
                z12 = z16;
                c38042y = c38042y3;
                z13 = zIsLongClickable;
                z14 = zIsClickable;
                i12 = R.id.div_penetrating_longtap_tag;
                view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.yandex.div.core.view2.divs.e
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view2) {
                        C37955g c37955g = c37955gM;
                        List list9 = list2;
                        C38029k c38029k2 = c38029k;
                        c38029k2.m(new C37977m(list9, "long_click", c37955g, c38029k2, view));
                        return true;
                    }
                });
            }
            if (z17) {
                view.setTag(i12, Boolean.TRUE);
            }
        }
        List<? extends DivAction> list9 = list3;
        if (list9 == null || list9.isEmpty()) {
            c38042y2 = c38042y;
            c38042y2.f369223c = null;
        } else {
            Iterator<T> it2 = list3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                List<DivAction.d> list10 = ((DivAction) next).f371217b;
                if (list10 != null && !list10.isEmpty() && !z12) {
                    break;
                }
            }
            DivAction divAction3 = (DivAction) next;
            if (divAction3 != null) {
                List<DivAction.d> list11 = divAction3.f371217b;
                if (list11 == null) {
                    int i14 = com.yandex.div.internal.n.f370123a;
                    c38042y2 = c38042y;
                } else {
                    view.getContext();
                    com.yandex.div.internal.widget.menu.c cVar2 = new com.yandex.div.internal.widget.menu.c(view);
                    cVar2.f370322b = c37955gM.new b(c38029k, list11);
                    c38029k.n();
                    c38029k.w(new C37980n());
                    c38042y2 = c38042y;
                    c38042y2.f369223c = new C37967j(c37955gM, c38029k, view, divAction3, cVar2);
                }
            } else {
                c38042y2 = c38042y;
                c38042y2.f369223c = new C37971k(c37955gM, c38029k, view, list3);
            }
        }
        if (list5 == null || list5.isEmpty()) {
            divAnimation2 = null;
            c38042y2.f369222b = null;
            view.setOnClickListener(null);
            c12 = 0;
            view.setClickable(false);
        } else {
            Iterator<T> it3 = listSingletonList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                Object next3 = it3.next();
                List<DivAction.d> list12 = ((DivAction) next3).f371217b;
                if (list12 != null && !list12.isEmpty() && !z12) {
                    obj = next3;
                    break;
                }
            }
            DivAction divAction4 = (DivAction) obj;
            if (divAction4 != null) {
                List<DivAction.d> list13 = divAction4.f371217b;
                if (list13 == null) {
                    int i15 = com.yandex.div.internal.n.f370123a;
                } else {
                    view.getContext();
                    com.yandex.div.internal.widget.menu.c cVar3 = new com.yandex.div.internal.widget.menu.c(view);
                    cVar3.f370322b = c37955gM.new b(c38029k, list13);
                    c38029k.n();
                    c38029k.w(new C37980n());
                    com.avito.android.advert.item.beduin.v2.favorite.a aVar = new com.avito.android.advert.item.beduin.v2.favorite.a(c37955gM, c38029k, view, divAction4, cVar3, 5);
                    if (c38042y2.f369223c != null) {
                        c38042y2.f369222b = new C37974l(aVar, view);
                    } else {
                        view.setOnClickListener(aVar);
                    }
                }
            } else {
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.yandex.div.core.view2.divs.f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C37955g c37955g = c37955gM;
                        List list14 = listSingletonList;
                        C38029k c38029k2 = c38029k;
                        c38029k2.m(new C37977m(list14, "click", c37955g, c38029k2, view));
                    }
                };
                if (c38042y2.f369223c != null) {
                    c38042y2.f369222b = new C37974l(onClickListener, view);
                } else {
                    view.setOnClickListener(onClickListener);
                }
            }
            divAnimation2 = null;
            c12 = 0;
        }
        List[] listArr = new List[3];
        listArr[c12] = listSingletonList;
        listArr[1] = list2;
        listArr[2] = list3;
        I(view, c38029k, !com.yandex.div.internal.util.c.a(listArr) ? divAnimation : divAnimation2, c38042y2);
        if (c37955gM.f368386f) {
            DivAccessibility.Mode mode = DivAccessibility.Mode.MERGE;
            WeakHashMap<View, DivAccessibility.Mode> weakHashMap = c38029k.f369150w;
            if (mode == weakHashMap.get(view)) {
                Object parent = view.getParent();
                Object obj2 = parent instanceof View ? (View) parent : divAnimation2;
                if (obj2 != null && weakHashMap.get(obj2) == weakHashMap.get(view)) {
                    view.setClickable(z14);
                    view.setLongClickable(z13);
                }
            }
        }
    }

    public static final void d(@Y61.k View view, @Y61.k com.yandex.div.json.expressions.e eVar, @Y61.k com.yandex.div2.H h12) {
        int iM2 = M(h12.getF374468o(), view.getResources().getDisplayMetrics(), eVar, view.getLayoutParams());
        if (view.getLayoutParams().height != iM2) {
            view.getLayoutParams().height = iM2;
            view.requestLayout();
        }
        l(view, eVar, h12);
    }

    public static final void e(@Y61.k TextView textView, @Y61.l Long l12, @Y61.k DivSizeUnit divSizeUnit) {
        textView.setLineSpacing(l12 == null ? 0 : T(Long.valueOf(l12.longValue()), textView.getResources().getDisplayMetrics(), divSizeUnit) - textView.getPaint().getFontMetricsInt(null), 1.0f);
    }

    public static final void f(@Y61.k View view, @Y61.l com.yandex.div2.Y0 y02, @Y61.k com.yandex.div.json.expressions.e eVar) {
        int iT2;
        int iT3;
        int iT4;
        int iT5;
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        if (y02 != null) {
            DivSizeUnit divSizeUnitA = y02.f374040e.a(eVar);
            iT2 = T(y02.f374037b.a(eVar), displayMetrics, divSizeUnitA);
            iT4 = T(y02.f374039d.a(eVar), displayMetrics, divSizeUnitA);
            iT5 = T(y02.f374038c.a(eVar), displayMetrics, divSizeUnitA);
            iT3 = T(y02.f374036a.a(eVar), displayMetrics, divSizeUnitA);
        } else {
            iT2 = 0;
            iT3 = 0;
            iT4 = 0;
            iT5 = 0;
        }
        if (marginLayoutParams.leftMargin == iT2 && marginLayoutParams.topMargin == iT4 && marginLayoutParams.rightMargin == iT5 && marginLayoutParams.bottomMargin == iT3) {
            return;
        }
        marginLayoutParams.leftMargin = iT2;
        marginLayoutParams.topMargin = iT4;
        marginLayoutParams.rightMargin = iT5;
        marginLayoutParams.bottomMargin = iT3;
        view.requestLayout();
    }

    public static final void g(@Y61.k View view, @Y61.l y8.c cVar, @Y61.k com.yandex.div.json.expressions.e eVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        com.yandex.div.internal.widget.c cVar2 = layoutParams instanceof com.yandex.div.internal.widget.c ? (com.yandex.div.internal.widget.c) layoutParams : null;
        if (cVar2 == null) {
            return;
        }
        int iQ2 = cVar == null ? Integer.MAX_VALUE : Q(cVar, view.getResources().getDisplayMetrics(), eVar);
        if (cVar2.f370249g != iQ2) {
            cVar2.f370249g = iQ2;
            view.requestLayout();
        }
    }

    public static final void h(@Y61.k View view, @Y61.l y8.c cVar, @Y61.k com.yandex.div.json.expressions.e eVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        com.yandex.div.internal.widget.c cVar2 = layoutParams instanceof com.yandex.div.internal.widget.c ? (com.yandex.div.internal.widget.c) layoutParams : null;
        if (cVar2 == null) {
            return;
        }
        int iQ2 = cVar == null ? Integer.MAX_VALUE : Q(cVar, view.getResources().getDisplayMetrics(), eVar);
        if (cVar2.f370250h != iQ2) {
            cVar2.f370250h = iQ2;
            view.requestLayout();
        }
    }

    public static final void i(@Y61.k View view, @Y61.l y8.c cVar, @Y61.k com.yandex.div.json.expressions.e eVar) {
        int iQ2 = cVar == null ? 0 : Q(cVar, view.getResources().getDisplayMetrics(), eVar);
        if (view.getMinimumHeight() != iQ2) {
            view.setMinimumHeight(iQ2);
            view.requestLayout();
        }
    }

    public static final void j(@Y61.k View view, @Y61.l y8.c cVar, @Y61.k com.yandex.div.json.expressions.e eVar) {
        int iQ2 = cVar == null ? 0 : Q(cVar, view.getResources().getDisplayMetrics(), eVar);
        if (view.getMinimumWidth() != iQ2) {
            view.setMinimumWidth(iQ2);
            view.requestLayout();
        }
    }

    public static final void k(@Y61.k View view, @Y61.l com.yandex.div2.Y0 y02, @Y61.k com.yandex.div.json.expressions.e eVar) {
        int i12;
        int i13;
        int i14;
        com.yandex.div.json.expressions.b<DivSizeUnit> bVar;
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        DivSizeUnit divSizeUnitA = null;
        if (y02 != null && (bVar = y02.f374040e) != null) {
            divSizeUnitA = bVar.a(eVar);
        }
        int i15 = divSizeUnitA == null ? -1 : C10872a.f368311a[divSizeUnitA.ordinal()];
        if (i15 == 1) {
            view.setPadding(o(y02.f374037b.a(eVar), displayMetrics), o(y02.f374039d.a(eVar), displayMetrics), o(y02.f374038c.a(eVar), displayMetrics), o(y02.f374036a.a(eVar), displayMetrics));
            return;
        }
        if (i15 == 2) {
            view.setPadding(J(y02.f374037b.a(eVar), displayMetrics), J(y02.f374039d.a(eVar), displayMetrics), J(y02.f374038c.a(eVar), displayMetrics), J(y02.f374036a.a(eVar), displayMetrics));
            return;
        }
        if (i15 != 3) {
            return;
        }
        long jLongValue = y02.f374037b.a(eVar).longValue();
        long j12 = jLongValue >> 31;
        int i16 = BeduinInputModel.MIN_TEXT_VERSION;
        if (j12 == 0 || j12 == -1) {
            i12 = (int) jLongValue;
        } else {
            int i17 = com.yandex.div.internal.n.f370123a;
            i12 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long jLongValue2 = y02.f374039d.a(eVar).longValue();
        long j13 = jLongValue2 >> 31;
        if (j13 == 0 || j13 == -1) {
            i13 = (int) jLongValue2;
        } else {
            int i18 = com.yandex.div.internal.n.f370123a;
            i13 = jLongValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long jLongValue3 = y02.f374038c.a(eVar).longValue();
        long j14 = jLongValue3 >> 31;
        if (j14 == 0 || j14 == -1) {
            i14 = (int) jLongValue3;
        } else {
            int i19 = com.yandex.div.internal.n.f370123a;
            i14 = jLongValue3 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long jLongValue4 = y02.f374036a.a(eVar).longValue();
        long j15 = jLongValue4 >> 31;
        if (j15 == 0 || j15 == -1) {
            i16 = (int) jLongValue4;
        } else {
            int i22 = com.yandex.div.internal.n.f370123a;
            if (jLongValue4 > 0) {
                i16 = Integer.MAX_VALUE;
            }
        }
        view.setPadding(i12, i13, i14, i16);
    }

    public static final void l(@Y61.k View view, @Y61.k com.yandex.div.json.expressions.e eVar, @Y61.k com.yandex.div2.H h12) {
        Double dA2;
        com.yandex.div.json.expressions.b<Double> bVar = h12.getF374444B().f374382c;
        float fDoubleValue = 0.0f;
        if (bVar != null && (dA2 = bVar.a(eVar)) != null) {
            fDoubleValue = (float) dA2.doubleValue();
        }
        view.setRotation(fDoubleValue);
        if (view.getWidth() == 0 && view.getHeight() == 0) {
            androidx.core.view.P.b(view, new b(view, view, h12, eVar));
        } else {
            view.setPivotX(w(view.getWidth(), h12.getF374444B().f374380a, eVar));
            view.setPivotY(w(view.getHeight(), h12.getF374444B().f374381b, eVar));
        }
    }

    public static final void m(@Y61.k View view, @Y61.k com.yandex.div.json.expressions.e eVar, @Y61.k com.yandex.div2.H h12) {
        int iM2 = M(h12.getF374453K(), view.getResources().getDisplayMetrics(), eVar, view.getLayoutParams());
        if (view.getLayoutParams().width != iM2) {
            view.getLayoutParams().width = iM2;
            view.requestLayout();
        }
        l(view, eVar, h12);
    }

    @Y61.k
    public static final IndicatorParams.c.b n(int i12, float f12, float f13, float f14, float f15, @Y61.l Float f16, @Y61.l Integer num) {
        return new IndicatorParams.c.b(i12, new IndicatorParams.b.C10931b(f12 * f15, f13 * f15, f14 * f15), f16 == null ? 0.0f : f16.floatValue(), num == null ? 0 : num.intValue());
    }

    public static final int o(@Y61.l Long l12, @Y61.k DisplayMetrics displayMetrics) {
        int i12;
        float f12;
        if (l12 == null) {
            f12 = 0.0f;
        } else {
            long jLongValue = l12.longValue();
            long j12 = jLongValue >> 31;
            if (j12 == 0 || j12 == -1) {
                i12 = (int) jLongValue;
            } else {
                int i13 = com.yandex.div.internal.n.f370123a;
                i12 = jLongValue > 0 ? Integer.MAX_VALUE : BeduinInputModel.MIN_TEXT_VERSION;
            }
            f12 = i12;
        }
        return kotlin.math.b.b(TypedValue.applyDimension(1, f12, displayMetrics));
    }

    public static final float p(@Y61.l Long l12, @Y61.k DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, l12 == null ? 0.0f : l12.longValue(), displayMetrics);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void q(@Y61.k ViewGroup viewGroup, @Y61.k Canvas canvas) {
        C38010b f369006c;
        int iD2 = C43033p.d(new C22829k0(viewGroup));
        int i12 = 0;
        while (i12 < iD2) {
            int i13 = i12 + 1;
            View view = (View) C43033p.g(new C22829k0(viewGroup), i12);
            float x12 = view.getX();
            float y12 = view.getY();
            int iSave = canvas.save();
            canvas.translate(x12, y12);
            try {
                InterfaceC38013e interfaceC38013e = view instanceof InterfaceC38013e ? (InterfaceC38013e) view : null;
                if (interfaceC38013e != null && (f369006c = interfaceC38013e.getF368960g()) != null) {
                    f369006c.f(canvas);
                }
                canvas.restoreToCount(iSave);
                i12 = i13;
            } catch (Throwable th2) {
                canvas.restoreToCount(iSave);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int r(@Y61.l com.yandex.div2.DivAlignmentHorizontal r4, @Y61.l com.yandex.div2.DivAlignmentVertical r5) {
        /*
            r0 = -1
            if (r4 != 0) goto L5
            r4 = r0
            goto Ld
        L5:
            int[] r1 = com.yandex.div.core.view2.divs.C37931a.C10872a.f368312b
            int r4 = r4.ordinal()
            r4 = r1[r4]
        Ld:
            r1 = 2
            r2 = 1
            r3 = 3
            if (r4 == r2) goto L16
            if (r4 == r1) goto L1a
            if (r4 == r3) goto L18
        L16:
            r4 = r3
            goto L1b
        L18:
            r4 = 5
            goto L1b
        L1a:
            r4 = r2
        L1b:
            if (r5 != 0) goto L1e
            goto L26
        L1e:
            int[] r0 = com.yandex.div.core.view2.divs.C37931a.C10872a.f368313c
            int r5 = r5.ordinal()
            r0 = r0[r5]
        L26:
            r5 = 48
            if (r0 == r2) goto L34
            if (r0 == r1) goto L32
            if (r0 == r3) goto L2f
            goto L34
        L2f:
            r5 = 80
            goto L34
        L32:
            r5 = 16
        L34:
            r4 = r4 | r5
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.C37931a.r(com.yandex.div2.DivAlignmentHorizontal, com.yandex.div2.DivAlignmentVertical):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int s(@Y61.l com.yandex.div2.DivContentAlignmentHorizontal r4, @Y61.l com.yandex.div2.DivContentAlignmentVertical r5) {
        /*
            r0 = -1
            if (r4 != 0) goto L5
            r4 = r0
            goto Ld
        L5:
            int[] r1 = com.yandex.div.core.view2.divs.C37931a.C10872a.f368314d
            int r4 = r4.ordinal()
            r4 = r1[r4]
        Ld:
            r1 = 2
            r2 = 1
            r3 = 3
            if (r4 == r2) goto L16
            if (r4 == r1) goto L1a
            if (r4 == r3) goto L18
        L16:
            r4 = r3
            goto L1b
        L18:
            r4 = 5
            goto L1b
        L1a:
            r4 = r2
        L1b:
            if (r5 != 0) goto L1e
            goto L26
        L1e:
            int[] r0 = com.yandex.div.core.view2.divs.C37931a.C10872a.f368315e
            int r5 = r5.ordinal()
            r0 = r0[r5]
        L26:
            r5 = 48
            if (r0 == r2) goto L34
            if (r0 == r1) goto L32
            if (r0 == r3) goto L2f
            goto L34
        L2f:
            r5 = 80
            goto L34
        L32:
            r5 = 16
        L34:
            r4 = r4 | r5
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.C37931a.s(com.yandex.div2.DivContentAlignmentHorizontal, com.yandex.div2.DivContentAlignmentVertical):int");
    }

    public static final float t(long j12, DivSizeUnit divSizeUnit, DisplayMetrics displayMetrics) {
        int iOrdinal = divSizeUnit.ordinal();
        if (iOrdinal == 0) {
            return p(Long.valueOf(j12), displayMetrics);
        }
        if (iOrdinal == 1) {
            return TypedValue.applyDimension(2, j12, displayMetrics);
        }
        if (iOrdinal == 2) {
            return j12;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Y61.k
    public static final List<w8> u(@Y61.k com.yandex.div2.H h12) {
        List<w8> listS = h12.s();
        if (listS != null) {
            return listS;
        }
        w8 f374811g = h12.getF374451I();
        List<w8> listSingletonList = f374811g == null ? null : Collections.singletonList(f374811g);
        return listSingletonList == null ? C42784z0.f406748b : listSingletonList;
    }

    public static final boolean v(@Y61.k com.yandex.div2.H h12) {
        List<w8> listS;
        return (h12.getF374451I() == null && ((listS = h12.s()) == null || listS.isEmpty())) ? false : true;
    }

    public static final float w(int i12, AbstractC38579v4 abstractC38579v4, com.yandex.div.json.expressions.e eVar) {
        com.yandex.div.json.b bVar;
        float f12;
        Long lA2;
        abstractC38579v4.getClass();
        if (abstractC38579v4 instanceof AbstractC38579v4.c) {
            bVar = ((AbstractC38579v4.c) abstractC38579v4).f376773c;
        } else {
            if (!(abstractC38579v4 instanceof AbstractC38579v4.d)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = ((AbstractC38579v4.d) abstractC38579v4).f376774c;
        }
        if (!(bVar instanceof C38588w4)) {
            return bVar instanceof A4 ? i12 * (((float) ((A4) bVar).f370596a.a(eVar).doubleValue()) / 100.0f) : i12 / 2.0f;
        }
        C38588w4 c38588w4 = (C38588w4) bVar;
        com.yandex.div.json.expressions.b<Long> bVar2 = c38588w4.f376935b;
        Float fValueOf = null;
        if (bVar2 != null && (lA2 = bVar2.a(eVar)) != null) {
            fValueOf = Float.valueOf(lA2.longValue());
        }
        if (fValueOf == null) {
            return i12 / 2.0f;
        }
        float fFloatValue = fValueOf.floatValue();
        int iOrdinal = c38588w4.f376934a.a(eVar).ordinal();
        if (iOrdinal == 0) {
            f12 = com.yandex.div.internal.util.p.f370185a.density;
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return fFloatValue;
                }
                throw new NoWhenBranchMatchedException();
            }
            f12 = com.yandex.div.internal.util.p.f370185a.scaledDensity;
        }
        return fFloatValue * f12;
    }

    @Y61.k
    public static final Typeface x(@Y61.k DivFontWeight divFontWeight, @Y61.k com.yandex.div.core.font.a aVar) {
        int iOrdinal = divFontWeight.ordinal();
        if (iOrdinal == 0) {
            Typeface light = aVar.getLight();
            return light == null ? Typeface.DEFAULT : light;
        }
        if (iOrdinal == 1) {
            Typeface medium = aVar.getMedium();
            return medium == null ? Typeface.DEFAULT : medium;
        }
        if (iOrdinal == 2) {
            Typeface regular = aVar.getRegular();
            return regular == null ? Typeface.DEFAULT : regular;
        }
        if (iOrdinal != 3) {
            Typeface regular2 = aVar.getRegular();
            return regular2 == null ? Typeface.DEFAULT : regular2;
        }
        Typeface bold = aVar.getBold();
        return bold == null ? Typeface.DEFAULT_BOLD : bold;
    }

    public static final boolean y(@Y61.l com.yandex.div2.K k12) {
        if (k12 == null) {
            return true;
        }
        if (k12.f372639a != null || k12.f372640b != null) {
            return false;
        }
        b.a aVar = com.yandex.div.json.expressions.b.f370552a;
        Boolean bool = Boolean.FALSE;
        aVar.getClass();
        return kotlin.jvm.internal.L.f(k12.f372641c, b.a.a(bool)) && k12.f372642d == null && k12.f372643e == null;
    }

    public static final boolean z(@Y61.k DivContainer divContainer, @Y61.k com.yandex.div.json.expressions.e eVar) {
        return divContainer.f371382y.a(eVar) == DivContainer.Orientation.HORIZONTAL;
    }
}
