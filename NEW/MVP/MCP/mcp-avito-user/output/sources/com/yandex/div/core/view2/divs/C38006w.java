package com.yandex.div.core.view2.divs;

import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.C38037t;
import com.yandex.div.core.view2.divs.C38004v0;
import com.yandex.div.core.view2.divs.C38004v0.a;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.K5;
import com.yandex.div2.y8;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import u21.C48774a;

/* compiled from: DivBaseBinder.kt */
@com.yandex.div.core.dagger.z
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/w;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.view2.divs.w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38006w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C37989q f368851a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.tooltip.g f368852b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C48774a f368853c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C38004v0 f368854d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C38037t f368855e;

    /* compiled from: DivBaseBinder.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.divs.w$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[DivVisibility.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
        }
    }

    @Inject
    public C38006w(@Y61.k C37989q c37989q, @Y61.k com.yandex.div.core.tooltip.g gVar, @Y61.k C48774a c48774a, @Y61.k C38004v0 c38004v0, @Y61.k C38037t c38037t) {
        this.f368851a = c37989q;
        this.f368852b = gVar;
        this.f368853c = c48774a;
        this.f368854d = c38004v0;
        this.f368855e = c38037t;
    }

    public static y8.c e(K5 k52) {
        y8 y8Var;
        K5.e eVar = k52 instanceof K5.e ? (K5.e) k52 : null;
        if (eVar == null || (y8Var = eVar.f372717c) == null) {
            return null;
        }
        return y8Var.f377208b;
    }

    public static y8.c f(K5 k52) {
        y8 y8Var;
        K5.e eVar = k52 instanceof K5.e ? (K5.e) k52 : null;
        if (eVar == null || (y8Var = eVar.f372717c) == null) {
            return null;
        }
        return y8Var.f377209c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r5, com.yandex.div.core.view2.C38029k r6, com.yandex.div2.K r7, com.yandex.div2.K r8, com.yandex.div.json.expressions.e r9) throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            com.yandex.div.core.view2.divs.v0 r0 = r4.f368854d
            if (r8 != 0) goto L5
            goto L17
        L5:
            r0.getClass()
            boolean r1 = com.yandex.div.core.view2.divs.C37931a.y(r8)
            if (r1 == 0) goto Lf
            goto L17
        Lf:
            boolean r1 = r5.isFocused()
            if (r1 == 0) goto L17
            r1 = r8
            goto L18
        L17:
            r1 = r7
        L18:
            r0.getClass()
            com.yandex.div.core.view2.divs.C38004v0.a(r5, r1, r9)
            android.view.View$OnFocusChangeListener r1 = r5.getOnFocusChangeListener()
            boolean r2 = r1 instanceof com.yandex.div.core.view2.divs.C38004v0.a
            r3 = 0
            if (r2 == 0) goto L2a
            com.yandex.div.core.view2.divs.v0$a r1 = (com.yandex.div.core.view2.divs.C38004v0.a) r1
            goto L2b
        L2a:
            r1 = r3
        L2b:
            if (r1 != 0) goto L34
            boolean r2 = com.yandex.div.core.view2.divs.C37931a.y(r8)
            if (r2 == 0) goto L34
            goto L61
        L34:
            if (r1 != 0) goto L37
            goto L4a
        L37:
            java.util.List<? extends com.yandex.div2.DivAction> r2 = r1.f368840f
            if (r2 != 0) goto L4a
            java.util.List<? extends com.yandex.div2.DivAction> r2 = r1.f368841g
            if (r2 != 0) goto L4a
            boolean r2 = com.yandex.div.core.view2.divs.C37931a.y(r8)
            if (r2 != 0) goto L46
            goto L4a
        L46:
            r5.setOnFocusChangeListener(r3)
            goto L61
        L4a:
            com.yandex.div.core.view2.divs.v0$a r2 = new com.yandex.div.core.view2.divs.v0$a
            r2.<init>(r6, r9)
            r2.f368838d = r8
            r2.f368839e = r7
            if (r1 != 0) goto L56
            goto L5e
        L56:
            java.util.List<? extends com.yandex.div2.DivAction> r6 = r1.f368840f
            java.util.List<? extends com.yandex.div2.DivAction> r7 = r1.f368841g
            r2.f368840f = r6
            r2.f368841g = r7
        L5e:
            r5.setOnFocusChangeListener(r2)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.C38006w.a(android.view.View, com.yandex.div.core.view2.k, com.yandex.div2.K, com.yandex.div2.K, com.yandex.div.json.expressions.e):void");
    }

    public final void b(View view, C38029k c38029k, com.yandex.div.json.expressions.e eVar, List<? extends DivAction> list, List<? extends DivAction> list2) {
        C38004v0 c38004v0 = this.f368854d;
        c38004v0.getClass();
        View.OnFocusChangeListener onFocusChangeListener = view.getOnFocusChangeListener();
        C38004v0.a aVar = onFocusChangeListener instanceof C38004v0.a ? (C38004v0.a) onFocusChangeListener : null;
        if (aVar == null && com.yandex.div.internal.util.c.a(list, list2)) {
            return;
        }
        if (aVar != null && aVar.f368838d == null && com.yandex.div.internal.util.c.a(list, list2)) {
            view.setOnFocusChangeListener(null);
            return;
        }
        C38004v0.a aVar2 = c38004v0.new a(c38029k, eVar);
        if (aVar != null) {
            com.yandex.div2.K k12 = aVar.f368838d;
            com.yandex.div2.K k13 = aVar.f368839e;
            aVar2.f368838d = k12;
            aVar2.f368839e = k13;
        }
        aVar2.f368840f = list;
        aVar2.f368841g = list2;
        view.setOnFocusChangeListener(aVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x026b A[PHI: r12
  0x026b: PHI (r12v21 com.yandex.div2.DivAlignmentHorizontal) = (r12v14 com.yandex.div2.DivAlignmentHorizontal), (r12v24 com.yandex.div2.DivAlignmentHorizontal) binds: [B:171:0x02ba, B:157:0x0269] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x026d A[PHI: r12
  0x026d: PHI (r12v17 com.yandex.div2.DivAlignmentHorizontal) = (r12v14 com.yandex.div2.DivAlignmentHorizontal), (r12v24 com.yandex.div2.DivAlignmentHorizontal) binds: [B:171:0x02ba, B:157:0x0269] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(@Y61.k android.view.View r10, @Y61.k com.yandex.div2.H r11, @Y61.l com.yandex.div2.H r12, @Y61.k com.yandex.div.json.expressions.e r13) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.C38006w.c(android.view.View, com.yandex.div2.H, com.yandex.div2.H, com.yandex.div.json.expressions.e):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02e2 A[PHI: r3
  0x02e2: PHI (r3v26 com.yandex.div2.K) = (r3v8 com.yandex.div2.K), (r3v27 com.yandex.div2.K) binds: [B:185:0x0333, B:173:0x02e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02e5 A[PHI: r0 r3
  0x02e5: PHI (r0v27 com.yandex.div2.u1) = (r0v25 com.yandex.div2.u1), (r0v72 com.yandex.div2.u1) binds: [B:185:0x0333, B:173:0x02e0] A[DONT_GENERATE, DONT_INLINE]
  0x02e5: PHI (r3v9 com.yandex.div2.K) = (r3v8 com.yandex.div2.K), (r3v27 com.yandex.div2.K) binds: [B:185:0x0333, B:173:0x02e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:302:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(@Y61.k android.view.View r26, @Y61.k com.yandex.div2.H r27, @Y61.l com.yandex.div2.H r28, @Y61.k com.yandex.div.core.view2.C38029k r29) {
        /*
            Method dump skipped, instructions count: 1307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.C38006w.d(android.view.View, com.yandex.div2.H, com.yandex.div2.H, com.yandex.div.core.view2.k):void");
    }

    public final void g(View view, C38029k c38029k, List<? extends com.yandex.div2.F> list, List<? extends com.yandex.div2.F> list2, com.yandex.div.json.expressions.e eVar, F21.b bVar, Drawable drawable) {
        C37989q c37989q = this.f368851a;
        c37989q.getClass();
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        if (list2 == null) {
            C37997t c37997t = new C37997t(list, view, drawable, c37989q, c38029k, eVar, displayMetrics);
            c37997t.invoke(kotlin.G0.f406611a);
            C37989q.d(list, eVar, bVar, c37997t);
        } else {
            C38000u c38000u = new C38000u(list, list2, view, drawable, c37989q, c38029k, eVar, displayMetrics);
            c38000u.invoke(kotlin.G0.f406611a);
            C37989q.d(list2, eVar, bVar, c38000u);
            C37989q.d(list, eVar, bVar, c38000u);
        }
    }

    public final void h(@Y61.k C38029k c38029k, @Y61.k View view, @Y61.k com.yandex.div2.H h12) {
        this.f368853c.c(c38029k, view, h12);
    }
}
