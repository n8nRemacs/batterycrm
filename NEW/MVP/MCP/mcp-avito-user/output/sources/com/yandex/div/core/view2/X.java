package com.yandex.div.core.view2;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.core.os.C22783k;
import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.H0;
import com.yandex.div2.w8;
import j.InterfaceC42148d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DivVisibilityActionTracker.kt */
@com.yandex.div.core.dagger.z
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/view2/X;", "", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class X {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g0 f367889a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final U f367890b;

    /* renamed from: f, reason: collision with root package name */
    public boolean f367894f;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Handler f367891c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a0 f367892d = new a0();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final WeakHashMap<View, AbstractC38330g> f367893e = new WeakHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f f367895g = new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f(this, 16);

    /* compiled from: DivVisibilityActionTracker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/view2/X$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DivVisibilityActionTracker.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/yandex/div/core/view2/f;", "Lcom/yandex/div2/w8;", "emptyToken", "Lkotlin/G0;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Map<C38024f, ? extends w8>, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Map<C38024f, ? extends w8> map) {
            X.this.f367891c.removeCallbacksAndMessages(map);
            return G0.f406611a;
        }
    }

    /* compiled from: Views.kt */
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/yandex/div/core/util/ViewsKt$doOnNextHierarchyLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "com/yandex/div/core/util/o", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C38029k f367897b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ H0 f367898c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ X f367899d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ View f367900e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ AbstractC38330g f367901f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ List f367902g;

        public c(C38029k c38029k, H0 h02, X x12, View view, AbstractC38330g abstractC38330g, List list) {
            this.f367897b = c38029k;
            this.f367898c = h02;
            this.f367899d = x12;
            this.f367900e = view;
            this.f367901f = abstractC38330g;
            this.f367902g = list;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.k View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            view.removeOnLayoutChangeListener(this);
            C38029k c38029k = this.f367897b;
            if (kotlin.jvm.internal.L.f(c38029k.getDivData(), this.f367898c)) {
                X.a(this.f367899d, c38029k, this.f367900e, this.f367901f, this.f367902g);
            }
        }
    }

    static {
        new a(null);
    }

    @Inject
    public X(@Y61.k g0 g0Var, @Y61.k U u12) {
        this.f367889a = g0Var;
        this.f367890b = u12;
    }

    public static final void a(X x12, C38029k c38029k, View view, AbstractC38330g abstractC38330g, List list) {
        x12.getClass();
        com.yandex.div.internal.a.a();
        g0 g0Var = x12.f367889a;
        g0Var.getClass();
        int iHeight = 0;
        if (view.isShown()) {
            Rect rect = g0Var.f369112a;
            if (view.getGlobalVisibleRect(rect)) {
                iHeight = ((rect.height() * rect.width()) * 100) / (view.getHeight() * view.getWidth());
            }
        }
        WeakHashMap<View, AbstractC38330g> weakHashMap = x12.f367893e;
        if (iHeight > 0) {
            weakHashMap.put(view, abstractC38330g);
        } else {
            weakHashMap.remove(view);
        }
        boolean z12 = x12.f367894f;
        Handler handler = x12.f367891c;
        if (!z12) {
            x12.f367894f = true;
            handler.post(x12.f367895g);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Long lValueOf = Long.valueOf(((w8) obj).f376956f.a(c38029k.getExpressionResolver()).longValue());
            Object arrayList = linkedHashMap.get(lValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            long jLongValue = ((Number) entry.getKey()).longValue();
            List list2 = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList(list2.size());
            for (Object obj2 : list2) {
                if (x12.c(c38029k, view, (w8) obj2, iHeight)) {
                    arrayList2.add(obj2);
                }
            }
            if (!arrayList2.isEmpty()) {
                HashMap map = new HashMap(arrayList2.size(), 1.0f);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    w8 w8Var = (w8) it.next();
                    C38024f c38024f = new C38024f(c38029k.getLogId(), c38029k.getDataTag().f428995a, w8Var.f376951a);
                    int i12 = com.yandex.div.internal.p.f370124a;
                    map.put(c38024f, w8Var);
                }
                Map mapSynchronizedMap = Collections.synchronizedMap(map);
                com.yandex.div.internal.util.r<Map<C38024f, w8>> rVar = x12.f367892d.f367912a;
                synchronized (rVar.f370186a) {
                    rVar.f370186a.add(mapSynchronizedMap);
                }
                C22783k.b(handler, new Y(x12, c38029k, view, mapSynchronizedMap), mapSynchronizedMap, jLongValue);
            }
        }
    }

    public final void b(C38024f c38024f) {
        Object next;
        int i12 = com.yandex.div.internal.p.f370124a;
        a0 a0Var = this.f367892d;
        b bVar = new b();
        com.yandex.div.internal.util.r<Map<C38024f, w8>> rVar = a0Var.f367912a;
        ArrayList arrayList = new ArrayList();
        synchronized (rVar.f370186a) {
            arrayList.addAll(rVar.f370186a);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Map) next).remove(c38024f) != null) {
                    break;
                }
            }
        }
        Map<C38024f, ? extends w8> map = (Map) next;
        if (map != null && map.isEmpty()) {
            bVar.invoke(map);
            com.yandex.div.internal.util.r<Map<C38024f, w8>> rVar2 = a0Var.f367912a;
            synchronized (rVar2.f370186a) {
                rVar2.f370186a.remove(map);
            }
        }
    }

    public final boolean c(C38029k c38029k, View view, w8 w8Var, int i12) {
        C38024f c38024f;
        Object next;
        Set setKeySet;
        boolean z12 = ((long) i12) >= w8Var.f376957g.a(c38029k.getExpressionResolver()).longValue();
        C38024f c38024f2 = new C38024f(c38029k.getLogId(), c38029k.getDataTag().f428995a, w8Var.f376951a);
        com.yandex.div.internal.util.r<Map<C38024f, w8>> rVar = this.f367892d.f367912a;
        ArrayList arrayList = new ArrayList();
        synchronized (rVar.f370186a) {
            arrayList.addAll(rVar.f370186a);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            c38024f = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Map) next).containsKey(c38024f2)) {
                break;
            }
        }
        Map map = (Map) next;
        if (map != null && (setKeySet = map.keySet()) != null) {
            Object[] array = setKeySet.toArray(new C38024f[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            C38024f[] c38024fArr = (C38024f[]) array;
            int length = c38024fArr.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    break;
                }
                C38024f c38024f3 = c38024fArr[i13];
                i13++;
                if (kotlin.jvm.internal.L.f(c38024f3, c38024f2)) {
                    c38024f = c38024f3;
                    break;
                }
            }
        }
        if (view != null && c38024f == null && z12) {
            return true;
        }
        if ((view == null || c38024f != null || z12) && (view == null || c38024f == null || !z12)) {
            if (view != null && c38024f != null && !z12) {
                b(c38024f);
            } else if (view == null && c38024f != null) {
                b(c38024f);
            }
        }
        return false;
    }

    @InterfaceC42148d
    public final void d(@Y61.k C38029k c38029k, @Y61.l View view, @Y61.k AbstractC38330g abstractC38330g, @Y61.k List<? extends w8> list) {
        if (list.isEmpty()) {
            return;
        }
        H0 divData = c38029k.getDivData();
        if (view == null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                c(c38029k, view, (w8) it.next(), 0);
            }
        } else if (com.yandex.div.core.util.q.a(view) == null && !view.isLayoutRequested()) {
            if (kotlin.jvm.internal.L.f(c38029k.getDivData(), divData)) {
                a(this, c38029k, view, abstractC38330g, list);
            }
        } else {
            View viewA = com.yandex.div.core.util.q.a(view);
            if (viewA == null) {
                return;
            }
            viewA.addOnLayoutChangeListener(new c(c38029k, divData, this, view, abstractC38330g, list));
        }
    }
}
