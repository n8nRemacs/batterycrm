package com.yandex.div.core.view2.divs;

import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import com.avito.android.R;
import com.yandex.div.core.view2.C38029k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: DivBackgroundBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: com.yandex.div.core.view2.divs.t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37997t extends kotlin.jvm.internal.N implements Y41.l<Object, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<com.yandex.div2.F> f368713l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ View f368714m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Drawable f368715n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C37989q f368716o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C38029k f368717p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368718q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ DisplayMetrics f368719r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C37997t(List<? extends com.yandex.div2.F> list, View view, Drawable drawable, C37989q c37989q, C38029k c38029k, com.yandex.div.json.expressions.e eVar, DisplayMetrics displayMetrics) {
        super(1);
        this.f368713l = list;
        this.f368714m = view;
        this.f368715n = drawable;
        this.f368716o = c37989q;
        this.f368717p = c38029k;
        this.f368718q = eVar;
        this.f368719r = displayMetrics;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // Y41.l
    public final kotlin.G0 invoke(Object obj) {
        List arrayList;
        List<com.yandex.div2.F> list = this.f368713l;
        if (list == null) {
            arrayList = 0;
        } else {
            List<com.yandex.div2.F> list2 = list;
            arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(C37989q.a(this.f368716o, (com.yandex.div2.F) it.next(), this.f368719r, this.f368718q));
            }
        }
        if (arrayList == 0) {
            arrayList = C42784z0.f406748b;
        }
        ?? r02 = this.f368714m;
        Object tag = r02.getTag(R.id.div_default_background_list_tag);
        List list3 = tag instanceof List ? (List) tag : null;
        Object tag2 = r02.getTag(R.id.div_additional_background_layer_tag);
        Drawable drawable = tag2 instanceof Drawable ? (Drawable) tag2 : null;
        boolean zF2 = kotlin.jvm.internal.L.f(list3, arrayList);
        Drawable drawable2 = this.f368715n;
        if (!zF2 || !kotlin.jvm.internal.L.f(drawable, drawable2)) {
            Drawable drawable3 = this.f368715n;
            com.yandex.div.json.expressions.e eVar = this.f368718q;
            C37989q c37989q = this.f368716o;
            View view = this.f368714m;
            C37989q.c(c37989q, view, C37989q.b(c37989q, arrayList, view, this.f368717p, drawable3, eVar));
            r02.setTag(R.id.div_default_background_list_tag, arrayList);
            r02.setTag(R.id.div_focused_background_list_tag, null);
            r02.setTag(R.id.div_additional_background_layer_tag, drawable2);
        }
        return kotlin.G0.f406611a;
    }
}
