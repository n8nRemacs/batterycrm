package com.yandex.div.core.util;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.C38404j6;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;

/* compiled from: DivUtil.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"div_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class c {

    /* compiled from: DivUtil.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[DivAnimationInterpolator.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            iArr[3] = 4;
            iArr[4] = 5;
            iArr[5] = 6;
        }
    }

    public static final boolean a(@Y61.k AbstractC38330g abstractC38330g) {
        H hA2 = abstractC38330g.a();
        if (hA2.getF374446D() != null || hA2.getF374445C() != null || hA2.getF374447E() != null) {
            return true;
        }
        if (abstractC38330g instanceof AbstractC38330g.c) {
            List<AbstractC38330g> list = ((AbstractC38330g.c) abstractC38330g).f375015c.f371377t;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Boolean.valueOf(a((AbstractC38330g) it.next())));
            }
            return arrayList.contains(Boolean.TRUE);
        }
        if (abstractC38330g instanceof AbstractC38330g.C10942g) {
            List<AbstractC38330g> list2 = ((AbstractC38330g.C10942g) abstractC38330g).f375019c.f374833t;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Boolean.valueOf(a((AbstractC38330g) it2.next())));
            }
            return arrayList2.contains(Boolean.TRUE);
        }
        if ((abstractC38330g instanceof AbstractC38330g.q) || (abstractC38330g instanceof AbstractC38330g.h) || (abstractC38330g instanceof AbstractC38330g.f) || (abstractC38330g instanceof AbstractC38330g.m) || (abstractC38330g instanceof AbstractC38330g.i) || (abstractC38330g instanceof AbstractC38330g.o) || (abstractC38330g instanceof AbstractC38330g.e) || (abstractC38330g instanceof AbstractC38330g.k) || (abstractC38330g instanceof AbstractC38330g.p) || (abstractC38330g instanceof AbstractC38330g.d) || (abstractC38330g instanceof AbstractC38330g.l) || (abstractC38330g instanceof AbstractC38330g.n) || (abstractC38330g instanceof AbstractC38330g.r) || (abstractC38330g instanceof AbstractC38330g.j)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Y61.k
    public static final Interpolator b(@Y61.k DivAnimationInterpolator divAnimationInterpolator) {
        int iOrdinal = divAnimationInterpolator.ordinal();
        if (iOrdinal == 0) {
            return new LinearInterpolator();
        }
        if (iOrdinal == 1) {
            return new com.yandex.div.core.animation.c();
        }
        if (iOrdinal == 2) {
            return new com.yandex.div.core.animation.a();
        }
        if (iOrdinal == 3) {
            return new com.yandex.div.core.animation.d();
        }
        if (iOrdinal == 4) {
            return new com.yandex.div.core.animation.b();
        }
        if (iOrdinal == 5) {
            return new com.yandex.div.core.animation.h();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public static final C38404j6.g c(@Y61.k C38404j6 c38404j6, @Y61.k com.yandex.div.json.expressions.e eVar) {
        C38404j6.g gVar = null;
        List<C38404j6.g> list = c38404j6.f375613s;
        com.yandex.div.json.expressions.b<String> bVar = c38404j6.f375602h;
        if (bVar != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (L.f(((C38404j6.g) next).f375632d, bVar.a(eVar))) {
                    gVar = next;
                    break;
                }
            }
            gVar = gVar;
        }
        return gVar == null ? list.get(0) : gVar;
    }

    @Y61.k
    public static final String d(@Y61.k AbstractC38330g abstractC38330g) {
        if (abstractC38330g instanceof AbstractC38330g.q) {
            return "text";
        }
        if (abstractC38330g instanceof AbstractC38330g.h) {
            return "image";
        }
        if (abstractC38330g instanceof AbstractC38330g.f) {
            return "gif";
        }
        if (abstractC38330g instanceof AbstractC38330g.m) {
            return "separator";
        }
        if (abstractC38330g instanceof AbstractC38330g.i) {
            return "indicator";
        }
        if (abstractC38330g instanceof AbstractC38330g.n) {
            return "slider";
        }
        if (abstractC38330g instanceof AbstractC38330g.j) {
            return "input";
        }
        if (abstractC38330g instanceof AbstractC38330g.r) {
            return "video";
        }
        if (abstractC38330g instanceof AbstractC38330g.c) {
            return "container";
        }
        if (abstractC38330g instanceof AbstractC38330g.C10942g) {
            return "grid";
        }
        if (abstractC38330g instanceof AbstractC38330g.o) {
            return VoiceInfo.STATE;
        }
        if (abstractC38330g instanceof AbstractC38330g.e) {
            return AdvertDetailsBlockIdKt.GALLERY_BLOCK;
        }
        if (abstractC38330g instanceof AbstractC38330g.k) {
            return "pager";
        }
        if (abstractC38330g instanceof AbstractC38330g.p) {
            return "tabs";
        }
        if (abstractC38330g instanceof AbstractC38330g.d) {
            return "custom";
        }
        if (abstractC38330g instanceof AbstractC38330g.l) {
            return "select";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean e(@Y61.k AbstractC38330g abstractC38330g) {
        boolean z12 = false;
        if (!(abstractC38330g instanceof AbstractC38330g.q) && !(abstractC38330g instanceof AbstractC38330g.h) && !(abstractC38330g instanceof AbstractC38330g.f) && !(abstractC38330g instanceof AbstractC38330g.m) && !(abstractC38330g instanceof AbstractC38330g.i) && !(abstractC38330g instanceof AbstractC38330g.n) && !(abstractC38330g instanceof AbstractC38330g.j) && !(abstractC38330g instanceof AbstractC38330g.d) && !(abstractC38330g instanceof AbstractC38330g.l) && !(abstractC38330g instanceof AbstractC38330g.r)) {
            z12 = true;
            if (!(abstractC38330g instanceof AbstractC38330g.c) && !(abstractC38330g instanceof AbstractC38330g.C10942g) && !(abstractC38330g instanceof AbstractC38330g.e) && !(abstractC38330g instanceof AbstractC38330g.k) && !(abstractC38330g instanceof AbstractC38330g.p) && !(abstractC38330g instanceof AbstractC38330g.o)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return z12;
    }
}
