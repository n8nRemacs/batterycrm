package com.avito.android.beduin.common.utils;

import android.text.StaticLayout;
import android.util.LruCache;
import com.avito.android.beduin.common.utils.n;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.comparison.text_measurer.a;
import com.avito.android.remote.model.Size;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42829l0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinTextMeasurer.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/utils/m;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comparison.text_measurer.b f103529a = new com.avito.android.comparison.text_measurer.b();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LruCache<n, a.C3707a> f103530b = new LruCache<>(200);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LruCache<C42829l0<n, String, a.C3707a>, StaticLayout> f103531c = new LruCache<>(600);

    @Y61.k
    public final ArrayList a(@Y61.k BeduinModel beduinModel, @Y61.k String str, @Y61.k List list, @Y61.k com.avito.android.lib.design.text_view.a aVar, int i12) {
        Size size;
        n.f103532a.getClass();
        String id2 = beduinModel.getId();
        n cVar = id2 != null ? new n.c(id2, str) : new n.b(beduinModel, str);
        LruCache<n, a.C3707a> lruCache = this.f103530b;
        a.C3707a c3707aA = lruCache.get(cVar);
        com.avito.android.comparison.text_measurer.b bVar = this.f103529a;
        if (c3707aA == null) {
            c3707aA = bVar.a(aVar, i12);
            lruCache.put(cVar, c3707aA);
        }
        a.C3707a c3707a = c3707aA;
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (String str2 : list2) {
            if (str2 == null) {
                size = new Size(0, 0);
            } else {
                LruCache<C42829l0<n, String, a.C3707a>, StaticLayout> lruCache2 = this.f103531c;
                C42829l0<n, String, a.C3707a> c42829l0 = new C42829l0<>(cVar, str2, c3707a);
                StaticLayout staticLayoutC = lruCache2.get(c42829l0);
                if (staticLayoutC == null) {
                    bVar.getClass();
                    staticLayoutC = com.avito.android.comparison.text_measurer.b.c(str2, c3707a);
                    lruCache2.put(c42829l0, staticLayoutC);
                }
                StaticLayout staticLayout = staticLayoutC;
                bVar.getClass();
                if (str2.length() == 0) {
                    str2 = null;
                }
                size = str2 != null ? new Size(c3707a.f124216e + c3707a.f124214c + staticLayout.getWidth(), c3707a.f124215d + c3707a.f124213b + staticLayout.getHeight()) : Size.INSTANCE.getZERO();
            }
            arrayList.add(size);
        }
        return arrayList;
    }
}
