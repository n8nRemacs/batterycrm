package com.yandex.div.core.view2.divs;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.DisplayMetrics;
import android.util.StateSet;
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
/* renamed from: com.yandex.div.core.view2.divs.u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C38000u extends kotlin.jvm.internal.N implements Y41.l<Object, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<com.yandex.div2.F> f368817l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List<com.yandex.div2.F> f368818m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ View f368819n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Drawable f368820o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C37989q f368821p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C38029k f368822q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368823r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ DisplayMetrics f368824s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C38000u(List<? extends com.yandex.div2.F> list, List<? extends com.yandex.div2.F> list2, View view, Drawable drawable, C37989q c37989q, C38029k c38029k, com.yandex.div.json.expressions.e eVar, DisplayMetrics displayMetrics) {
        super(1);
        this.f368817l = list;
        this.f368818m = list2;
        this.f368819n = view;
        this.f368820o = drawable;
        this.f368821p = c37989q;
        this.f368822q = c38029k;
        this.f368823r = eVar;
        this.f368824s = displayMetrics;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r8v4 */
    @Override // Y41.l
    public final kotlin.G0 invoke(Object obj) {
        List arrayList;
        com.yandex.div.json.expressions.e eVar = this.f368823r;
        DisplayMetrics displayMetrics = this.f368824s;
        C37989q c37989q = this.f368821p;
        List<com.yandex.div2.F> list = this.f368817l;
        if (list == null) {
            arrayList = 0;
        } else {
            List<com.yandex.div2.F> list2 = list;
            arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(C37989q.a(c37989q, (com.yandex.div2.F) it.next(), displayMetrics, eVar));
            }
        }
        if (arrayList == 0) {
            arrayList = C42784z0.f406748b;
        }
        List<com.yandex.div2.F> list3 = this.f368818m;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList2.add(C37989q.a(c37989q, (com.yandex.div2.F) it2.next(), displayMetrics, eVar));
        }
        ?? r12 = this.f368819n;
        Object tag = r12.getTag(R.id.div_default_background_list_tag);
        List list4 = tag instanceof List ? (List) tag : null;
        Object tag2 = r12.getTag(R.id.div_focused_background_list_tag);
        List list5 = tag2 instanceof List ? (List) tag2 : null;
        Object tag3 = r12.getTag(R.id.div_additional_background_layer_tag);
        Drawable drawable = tag3 instanceof Drawable ? (Drawable) tag3 : null;
        boolean zF2 = kotlin.jvm.internal.L.f(list4, arrayList);
        Drawable drawable2 = this.f368820o;
        if (!zF2 || !kotlin.jvm.internal.L.f(list5, arrayList2) || !kotlin.jvm.internal.L.f(drawable, drawable2)) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_focused}, C37989q.b(this.f368821p, arrayList2, this.f368819n, this.f368822q, this.f368820o, this.f368823r));
            if (list != null || drawable2 != null) {
                stateListDrawable.addState(StateSet.WILD_CARD, C37989q.b(this.f368821p, arrayList, this.f368819n, this.f368822q, this.f368820o, this.f368823r));
            }
            C37989q.c(c37989q, r12, stateListDrawable);
            r12.setTag(R.id.div_default_background_list_tag, arrayList);
            r12.setTag(R.id.div_focused_background_list_tag, arrayList2);
            r12.setTag(R.id.div_additional_background_layer_tag, drawable2);
        }
        return kotlin.G0.f406611a;
    }
}
