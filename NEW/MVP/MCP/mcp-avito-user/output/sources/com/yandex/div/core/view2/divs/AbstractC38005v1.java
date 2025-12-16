package com.yandex.div.core.view2.divs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.divs.gallery.a;
import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.DivVisibility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: DivPatchableAdapter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/core/view2/divs/v1;", "Landroidx/recyclerview/widget/RecyclerView$C;", "VH", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "LF21/b;", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.view2.divs.v1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38005v1<VH extends RecyclerView.C> extends RecyclerView.Adapter<VH> implements F21.b {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final a f368843h = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C38029k f368844c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f368845d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ArrayList f368846e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C38002u1 f368847f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f368848g;

    /* compiled from: DivPatchableAdapter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/divs/v1$a;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.divs.v1$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DivPatchableAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView$C;", "VH", "Lcom/yandex/div2/DivVisibility;", "it", "Lkotlin/G0;", "invoke", "(Lcom/yandex/div2/DivVisibility;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.core.view2.divs.v1$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<DivVisibility, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ a.C10874a f368849l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ kotlin.collections.H0<AbstractC38330g> f368850m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a.C10874a c10874a, kotlin.collections.H0 h02) {
            super(1);
            this.f368849l = c10874a;
            this.f368850m = h02;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(DivVisibility divVisibility) {
            DivVisibility divVisibility2 = divVisibility;
            a.C10874a c10874a = this.f368849l;
            LinkedHashMap linkedHashMap = c10874a.f368848g;
            kotlin.collections.H0<AbstractC38330g> h02 = this.f368850m;
            AbstractC38330g abstractC38330g = h02.f406644b;
            Boolean bool = (Boolean) linkedHashMap.get(abstractC38330g);
            int i12 = 0;
            boolean zBooleanValue = bool == null ? false : bool.booleanValue();
            AbstractC38005v1.f368843h.getClass();
            boolean z12 = divVisibility2 != DivVisibility.GONE;
            ArrayList arrayList = c10874a.f368846e;
            if (!zBooleanValue && z12) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i12 = -1;
                        break;
                    }
                    if (((kotlin.collections.H0) it.next()).f406643a > h02.f406643a) {
                        break;
                    }
                    i12++;
                }
                Integer numValueOf = Integer.valueOf(i12);
                if (i12 == -1) {
                    numValueOf = null;
                }
                int size = numValueOf == null ? arrayList.size() : numValueOf.intValue();
                arrayList.add(size, h02);
                c10874a.notifyItemInserted(size);
            } else if (zBooleanValue && !z12) {
                int iIndexOf = arrayList.indexOf(h02);
                arrayList.remove(iIndexOf);
                c10874a.notifyItemRemoved(iIndexOf);
            }
            linkedHashMap.put(abstractC38330g, Boolean.valueOf(z12));
            return kotlin.G0.f406611a;
        }
    }

    public AbstractC38005v1(@Y61.k List<? extends AbstractC38330g> list, @Y61.k C38029k c38029k) {
        this.f368844c = c38029k;
        this.f368845d = new ArrayList(list);
        ArrayList arrayList = new ArrayList();
        this.f368846e = arrayList;
        f368843h.getClass();
        this.f368847f = new C38002u1(arrayList);
        this.f368848g = new LinkedHashMap();
        l();
    }

    public final void j(@Y61.k com.yandex.div.core.downloader.k kVar) {
        C38029k c38029k = this.f368844c;
        if (kVar.f367430a.get(c38029k.getDataTag()) == null) {
            return;
        }
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f368845d;
            if (i12 >= arrayList.size()) {
                l();
                return;
            }
            AbstractC38330g abstractC38330g = (AbstractC38330g) arrayList.get(i12);
            if (abstractC38330g.a().getF376752v() != null) {
                kVar.a(c38029k.getDataTag());
            }
            kotlin.jvm.internal.L.f(this.f368848g.get(abstractC38330g), Boolean.TRUE);
            i12++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k() {
        Iterator it = C42745f0.S0(this.f368845d).iterator();
        while (true) {
            kotlin.collections.J0 j02 = (kotlin.collections.J0) it;
            if (!j02.f406646b.hasNext()) {
                return;
            }
            kotlin.collections.H0 h02 = (kotlin.collections.H0) j02.next();
            e(((AbstractC38330g) h02.f406644b).a().getVisibility().d(this.f368844c.getExpressionResolver(), new b((a.C10874a) this, h02)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l() {
        ArrayList arrayList = this.f368846e;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.f368848g;
        linkedHashMap.clear();
        Iterator it = C42745f0.S0(this.f368845d).iterator();
        while (true) {
            kotlin.collections.J0 j02 = (kotlin.collections.J0) it;
            if (!j02.f406646b.hasNext()) {
                return;
            }
            kotlin.collections.H0 h02 = (kotlin.collections.H0) j02.next();
            AbstractC38330g abstractC38330g = (AbstractC38330g) h02.f406644b;
            f368843h.getClass();
            boolean z12 = abstractC38330g.a().getVisibility().a(this.f368844c.getExpressionResolver()) != DivVisibility.GONE;
            linkedHashMap.put(h02.f406644b, Boolean.valueOf(z12));
            if (z12) {
                arrayList.add(h02);
            }
        }
    }
}
