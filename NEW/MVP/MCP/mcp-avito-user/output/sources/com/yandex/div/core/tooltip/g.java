package com.yandex.div.core.tooltip;

import Y41.q;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C22816e;
import androidx.core.view.C22833m0;
import com.avito.android.R;
import com.yandex.div.core.dagger.z;
import com.yandex.div.core.h0;
import com.yandex.div.core.l0;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.X;
import com.yandex.div.core.view2.divs.C37931a;
import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.DivTooltip;
import j.k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DivTooltipController.kt */
@z
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0011\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/tooltip/g;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f367763a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l0 f367764b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final X f367765c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h0 f367766d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final q<View, Integer, Integer, com.yandex.div.core.util.h> f367767e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f367768f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Handler f367769g;

    @k0
    public g() {
        throw null;
    }

    @Inject
    public g(@Y61.k dagger.internal.f fVar, @Y61.k l0 l0Var, @Y61.k X x12, @Y61.k h0 h0Var) {
        c cVar = c.f367749l;
        this.f367763a = fVar;
        this.f367764b = l0Var;
        this.f367765c = x12;
        this.f367766d = h0Var;
        this.f367767e = cVar;
        this.f367768f = new LinkedHashMap();
        this.f367769g = new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final com.yandex.div.core.tooltip.g r20, final android.view.View r21, final com.yandex.div2.DivTooltip r22, final com.yandex.div.core.view2.C38029k r23) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.tooltip.g.a(com.yandex.div.core.tooltip.g, android.view.View, com.yandex.div2.DivTooltip, com.yandex.div.core.view2.k):void");
    }

    public final void b(View view, C38029k c38029k) {
        Object tag = view.getTag(R.id.div_tooltips_tag);
        List<DivTooltip> list = tag instanceof List ? (List) tag : null;
        if (list != null) {
            for (DivTooltip divTooltip : list) {
                ArrayList arrayList = new ArrayList();
                LinkedHashMap linkedHashMap = this.f367768f;
                l lVar = (l) linkedHashMap.get(divTooltip.f372140e);
                if (lVar != null) {
                    lVar.f367777c = true;
                    com.yandex.div.core.util.h hVar = lVar.f367775a;
                    if (hVar.isShowing()) {
                        hVar.setEnterTransition(null);
                        hVar.setExitTransition(null);
                        hVar.dismiss();
                    } else {
                        arrayList.add(divTooltip.f372140e);
                        X x12 = this.f367765c;
                        AbstractC38330g abstractC38330g = divTooltip.f372138c;
                        x12.d(c38029k, null, abstractC38330g, C37931a.u(abstractC38330g.a()));
                    }
                    h0.f fVar = lVar.f367776b;
                    if (fVar != null) {
                        fVar.cancel();
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashMap.remove((String) it.next());
                }
            }
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        Iterator itA = C22816e.a((ViewGroup) view);
        while (true) {
            C22833m0 c22833m0 = (C22833m0) itA;
            if (!c22833m0.hasNext()) {
                return;
            } else {
                b((View) c22833m0.next(), c38029k);
            }
        }
    }

    public final void c(@Y61.k String str) {
        com.yandex.div.core.util.h hVar;
        l lVar = (l) this.f367768f.get(str);
        if (lVar == null || (hVar = lVar.f367775a) == null) {
            return;
        }
        hVar.dismiss();
    }
}
