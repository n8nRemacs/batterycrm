package Ur0;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.S2;
import com.avito.android.lib.util.groupable_item.e;
import com.avito.android.serp.adapter.C34735h;
import com.avito.android.serp.adapter.C34741k;
import com.avito.android.serp.adapter.C34820s;
import com.avito.android.serp.adapter.advert_xl.C34684d;
import com.avito.android.serp.adapter.l1;
import com.avito.android.serp.adapter.rich_snippets.regular.C34778a;
import com.avito.android.serp.adapter.rich_snippets.regular.C34780c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SerpSafeDecorator.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"LUr0/c;", "Landroidx/recyclerview/widget/RecyclerView$l;", "LUr0/b;", "LUr0/a;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class c extends RecyclerView.l implements b, InterfaceC15562a {

    /* renamed from: b, reason: collision with root package name */
    public final int f16694b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16695c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16696d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f16697e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16698f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16699g;

    /* renamed from: h, reason: collision with root package name */
    public final int f16700h;

    /* renamed from: i, reason: collision with root package name */
    public final int f16701i;

    /* renamed from: j, reason: collision with root package name */
    public final int f16702j;

    /* renamed from: k, reason: collision with root package name */
    public final int f16703k;

    /* renamed from: l, reason: collision with root package name */
    public final int f16704l;

    /* renamed from: m, reason: collision with root package name */
    public final int f16705m;

    /* renamed from: n, reason: collision with root package name */
    public final int f16706n;

    /* renamed from: o, reason: collision with root package name */
    public final int f16707o;

    /* renamed from: p, reason: collision with root package name */
    public int f16708p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16709q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public ArrayList f16710r;

    /* compiled from: SerpSafeDecorator.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LUr0/c$a;", "", "<init>", "()V", "a", "b", "LUr0/c$a$a;", "LUr0/c$a$b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: SerpSafeDecorator.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUr0/c$a$a;", "LUr0/c$a;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ur0.c$a$a, reason: collision with other inner class name */
        public static final /* data */ class C1153a extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C1153a f16711a = new C1153a();

            public C1153a() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C1153a);
            }

            public final int hashCode() {
                return 1823550882;
            }

            @k
            public final String toString() {
                return "BIG";
            }
        }

        /* compiled from: SerpSafeDecorator.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUr0/c$a$b;", "LUr0/c$a;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends a {
            static {
                new b();
            }

            public b() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1840816669;
            }

            @k
            public final String toString() {
                return "DEFAULT";
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k Resources resources, @k com.avito.konveyor.a aVar) throws Resources.NotFoundException {
        Integer numValueOf;
        this.f16694b = aVar.Y(com.avito.android.serp.adapter.snippet.a.class);
        this.f16695c = aVar.Y(C34741k.class);
        this.f16696d = aVar.Y(C34735h.class);
        try {
            numValueOf = Integer.valueOf(aVar.Y(C34684d.class));
        } catch (Exception unused) {
            numValueOf = null;
        }
        this.f16697e = numValueOf;
        this.f16698f = aVar.Y(C34780c.class);
        this.f16699g = aVar.Y(C34778a.class);
        this.f16700h = aVar.Y(C34820s.class);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.vertical_before_snippet_bottom_margin_default);
        this.f16701i = dimensionPixelSize;
        this.f16702j = resources.getDimensionPixelSize(R.dimen.vertical_before_snippet_bottom_margin_big);
        this.f16703k = resources.getDimensionPixelSize(R.dimen.vertical_groupable_top_margin);
        this.f16704l = resources.getDimensionPixelSize(R.dimen.vertical_groupable_bottom_margin);
        this.f16705m = resources.getDimensionPixelSize(R.dimen.vertical_before_rich_snippet_bottom_margin);
        this.f16706n = resources.getDimensionPixelSize(R.dimen.vertical_before_grid_snippet_bottom_margin);
        this.f16707o = resources.getDimensionPixelSize(R.dimen.vertical_before_list_snippet_bottom_margin);
        this.f16708p = dimensionPixelSize;
    }

    public abstract void c(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar);

    public final void e(@k a.C1153a c1153a) {
        if (c1153a == null) {
            throw new NoWhenBranchMatchedException();
        }
        this.f16708p = this.f16702j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int i12;
        Integer num;
        RecyclerView.Adapter adapter;
        int i13;
        Object next;
        Object next2;
        super.getItemOffsets(rect, view, recyclerView, zVar);
        c(rect, view, recyclerView, zVar);
        if (this.f16709q) {
            RecyclerView.C cW2 = recyclerView.W(view);
            int bindingAdapterPosition = cW2.getBindingAdapterPosition();
            Object obj = null;
            if ((cW2 instanceof e) && (adapter = recyclerView.getAdapter()) != null && (i13 = bindingAdapterPosition + 1) < adapter.getItemCount() && bindingAdapterPosition >= 0) {
                long itemId = adapter.getItemId(i13);
                ArrayList arrayList = this.f16710r;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        l1 l1Var = (l1) next2;
                        if (l1Var.getF79989b() == itemId && (l1Var instanceof com.avito.android.lib.util.groupable_item.a)) {
                            break;
                        }
                    }
                    if (next2 != null) {
                        rect.bottom = this.f16704l;
                    }
                }
                if (bindingAdapterPosition != 0) {
                    long itemId2 = adapter.getItemId(bindingAdapterPosition - 1);
                    ArrayList arrayList2 = this.f16710r;
                    if (arrayList2 != null) {
                        Iterator it2 = arrayList2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                            l1 l1Var2 = (l1) next;
                            if (l1Var2.getF79989b() == itemId2 && (l1Var2 instanceof com.avito.android.lib.util.groupable_item.a)) {
                                break;
                            }
                        }
                        if (next != null) {
                            rect.top = this.f16703k;
                        }
                    }
                }
            }
            int bindingAdapterPosition2 = recyclerView.W(view).getBindingAdapterPosition();
            RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
            if (adapter2 == null || (i12 = bindingAdapterPosition2 + 1) >= adapter2.getItemCount() || bindingAdapterPosition2 <= 0) {
                return;
            }
            int itemViewType = adapter2.getItemViewType(i12);
            long itemId3 = adapter2.getItemId(bindingAdapterPosition2);
            int i14 = this.f16694b;
            int i15 = this.f16700h;
            int i16 = this.f16699g;
            int i17 = this.f16698f;
            int i18 = this.f16695c;
            if (itemViewType == i14 || itemViewType == i18 || itemViewType == this.f16696d || (((num = this.f16697e) != null && itemViewType == num.intValue()) || itemViewType == i17 || itemViewType == i16 || itemViewType == i15)) {
                ArrayList arrayList3 = this.f16710r;
                if (arrayList3 != null) {
                    Iterator it3 = arrayList3.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next3 = it3.next();
                        l1 l1Var3 = (l1) next3;
                        if (l1Var3.getF79989b() == itemId3 && (l1Var3 instanceof S2)) {
                            obj = next3;
                            break;
                        }
                    }
                    obj = (l1) obj;
                }
                if (obj != null) {
                    if (itemViewType == i17 || itemViewType == i16) {
                        rect.bottom = this.f16705m;
                        return;
                    }
                    if (itemViewType == i18) {
                        rect.bottom = this.f16706n;
                    } else if (itemViewType == i15) {
                        rect.bottom = this.f16707o;
                    } else {
                        rect.bottom = this.f16708p;
                    }
                }
            }
        }
    }
}
