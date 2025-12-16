package com.avito.android.lib.design.picker;

import Ca1.ViewOnTouchListenerC13234a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: Wheel.kt */
@s0
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000bJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR!\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR(\u0010&\u001a\u0004\u0018\u00010\"2\b\u0010\u0003\u001a\u0004\u0018\u00010\"8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b#\u0010$\"\u0004\b\u0005\u0010%R0\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010\u0006¨\u0006+"}, d2 = {"Lcom/avito/android/lib/design/picker/i;", "Landroid/widget/FrameLayout;", "Lcom/avito/android/lib/design/picker/k;", "value", "Lkotlin/G0;", "setCenterView", "(Lcom/avito/android/lib/design/picker/k;)V", "", "getNewScroll", "()I", "Lcom/avito/android/lib/design/picker/m;", "b", "Lcom/avito/android/lib/design/picker/m;", "getWheelStyle", "()Lcom/avito/android/lib/design/picker/m;", "wheelStyle", "", "c", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "items", "Lkotlin/Function0;", "d", "LY41/a;", "getOnScrollFinished", "()LY41/a;", "setOnScrollFinished", "(LY41/a;)V", "onScrollFinished", "e", "getOnScrollStarted", "setOnScrollStarted", "onScrollStarted", "Landroid/view/View;", "f", "Landroid/view/View;", "(Landroid/view/View;)V", "centerView", "getSelectedResult", "()Lcom/avito/android/lib/design/picker/k;", "setSelectedResult", "selectedResult", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility", "ViewConstructor"})
/* loaded from: classes14.dex */
public final class i extends FrameLayout {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f180016t = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final m wheelStyle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final List<k<?>> items;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public Y41.a<G0> onScrollFinished;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public Y41.a<G0> onScrollStarted;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public View centerView;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f180022g;

    /* renamed from: h, reason: collision with root package name */
    public int f180023h;

    /* renamed from: i, reason: collision with root package name */
    public int f180024i;

    /* renamed from: j, reason: collision with root package name */
    public int f180025j;

    /* renamed from: k, reason: collision with root package name */
    public int f180026k;

    /* renamed from: l, reason: collision with root package name */
    public float f180027l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final j f180028m;

    /* renamed from: n, reason: collision with root package name */
    public int f180029n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final HashSet<b> f180030o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final ArrayList<Y41.l<k<?>, G0>> f180031p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public k<?> f180032q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f180033r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public k<?> f180034s;

    /* compiled from: Wheel.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/lib/design/picker/i$a", "Landroidx/recyclerview/widget/RecyclerView$r;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.r {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @Y61.k RecyclerView recyclerView) {
            Y41.a<G0> onScrollStarted;
            i iVar = i.this;
            if (iVar.f180029n == 0 && i12 == 1 && (onScrollStarted = iVar.getOnScrollStarted()) != null) {
                onScrollStarted.invoke();
            }
            iVar.f180029n = i12;
            if (i12 == 0 && !iVar.f180033r) {
                recyclerView.post(new h(iVar, 3));
            }
            if (i12 == 1) {
                iVar.f180032q = null;
                iVar.setCenterView((View) null);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
            int i14 = i.f180016t;
            i.this.i();
        }
    }

    /* compiled from: Wheel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/picker/i$b;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f180036a;

        /* renamed from: b, reason: collision with root package name */
        public final int f180037b;

        public b(int i12, int i13) {
            this.f180036a = i12;
            this.f180037b = i13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f180036a == bVar.f180036a && this.f180037b == bVar.f180037b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f180037b) + (Integer.hashCode(this.f180036a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ScrollPair(absolute=");
            sb2.append(this.f180036a);
            sb2.append(", scroll=");
            return r.t(sb2, this.f180037b, ')');
        }
    }

    /* compiled from: Wheel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[WheelGravity.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                WheelGravity wheelGravity = WheelGravity.f179987b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                WheelGravity wheelGravity2 = WheelGravity.f179987b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@Y61.k Context context, @Y61.k m mVar, @Y61.k List<? extends k<?>> list) {
        super(context);
        this.wheelStyle = mVar;
        this.items = list;
        this.f180027l = 1.0f;
        this.f180030o = new HashSet<>();
        this.f180031p = new ArrayList<>();
        LayoutInflater.from(context).inflate(R.layout.design_picker_wheel, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.recyclerWheel);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f180022g = recyclerView;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) recyclerView.getLayoutParams();
        int iOrdinal = mVar.f180050a.ordinal();
        if (iOrdinal == 0) {
            D6.c(recyclerView, Integer.valueOf(marginLayoutParams.leftMargin * 2), null, null, null, 14);
        } else if (iOrdinal == 1) {
            D6.c(recyclerView, null, null, Integer.valueOf(marginLayoutParams.rightMargin * 2), null, 11);
        }
        j jVar = new j(list, mVar);
        jVar.f180040e = jVar.f180039d.f180051b;
        this.f180028m = jVar;
        recyclerView.setAdapter(jVar);
        recyclerView.l(new com.avito.android.lib.design.picker.a(0, 1, null), -1);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setHasFixedSize(false);
        i();
        recyclerView.o(new a());
        recyclerView.setOnTouchListener(new ViewOnTouchListenerC13234a(this, 8));
        if (mVar.f180051b) {
            int itemCount = jVar.getItemCount() / 2;
            int size = itemCount - (itemCount % list.size());
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.l1(size);
            }
        }
        recyclerView.post(new h(this, 1));
    }

    public static void b(i iVar, k kVar) {
        iVar.setCenterView((k<?>) kVar);
        iVar.f();
        iVar.e(true);
    }

    public static void c(i iVar, k kVar) {
        iVar.setCenterView((k<?>) kVar);
        iVar.f();
        iVar.e(true);
    }

    private final int getNewScroll() {
        int iSignum = (int) Math.signum(this.f180026k);
        for (int i12 = 1; i12 < 6; i12++) {
            int i13 = i12 * iSignum;
            b bVar = new b(this.f180026k, i13);
            HashSet<b> hashSet = this.f180030o;
            if (!hashSet.contains(bVar)) {
                hashSet.add(bVar);
                return i13;
            }
        }
        return iSignum * (-3);
    }

    public static String h(View view) {
        return ((TextView) view.findViewById(R.id.text)).getText().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCenterView(View view) {
        k<?> selectedResult;
        this.centerView = view;
        if (view == null || (selectedResult = getSelectedResult()) == null) {
            return;
        }
        for (Object obj : this.f180031p.toArray(new Y41.l[0])) {
            Y41.l lVar = (Y41.l) obj;
            if (lVar != null) {
                lVar.invoke(selectedResult);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSelectedElement$lambda$8(final i iVar) {
        boolean z12 = iVar.wheelStyle.f180051b;
        List<k<?>> list = iVar.items;
        RecyclerView recyclerView = iVar.f180022g;
        if (z12) {
            final k<?> kVar = iVar.f180032q;
            if (kVar != null) {
                int itemCount = iVar.f180028m.getItemCount() / 2;
                recyclerView.A0(list.indexOf(kVar) + (itemCount - (itemCount % list.size())));
                final int i12 = 0;
                recyclerView.post(new Runnable(iVar) { // from class: com.avito.android.lib.design.picker.g

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ i f180012c;

                    {
                        this.f180012c = iVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                i.c(this.f180012c, kVar);
                                break;
                            default:
                                i.b(this.f180012c, kVar);
                                break;
                        }
                    }
                });
            }
        } else {
            final k<?> kVar2 = iVar.f180032q;
            if (kVar2 != null) {
                recyclerView.A0(list.indexOf(kVar2) + 3);
                final int i13 = 1;
                recyclerView.post(new Runnable(iVar) { // from class: com.avito.android.lib.design.picker.g

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ i f180012c;

                    {
                        this.f180012c = iVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                i.c(this.f180012c, kVar2);
                                break;
                            default:
                                i.b(this.f180012c, kVar2);
                                break;
                        }
                    }
                });
            }
        }
        iVar.f180033r = false;
    }

    public final void e(boolean z12) {
        Object next;
        int iAbs = Math.abs(this.f180026k);
        HashSet<b> hashSet = this.f180030o;
        if (iAbs <= 1) {
            if (this.f180032q != null) {
                j();
                return;
            }
            Iterator<T> it = this.items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String str = ((k) next).f180047b;
                View view = this.centerView;
                if (L.f(str, view != null ? h(view) : null)) {
                    break;
                }
            }
            this.f180034s = (k) next;
            Y41.a<G0> aVar = this.onScrollFinished;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f180032q = null;
            hashSet.clear();
            return;
        }
        if (Math.abs(this.f180025j) % 2 == 1) {
            int i12 = this.f180025j;
            this.f180025j = i12 + (i12 <= 0 ? -1 : 1);
        }
        int i13 = this.f180025j / 2;
        this.f180025j = i13;
        b bVar = new b(this.f180026k, i13);
        if (hashSet.contains(bVar)) {
            if (this.f180032q != null) {
                j();
                return;
            }
            this.f180025j = getNewScroll();
        }
        hashSet.add(bVar);
        RecyclerView recyclerView = this.f180022g;
        if (z12) {
            recyclerView.scrollBy(0, this.f180025j);
        } else {
            recyclerView.C0(0, this.f180025j);
        }
        if (z12) {
            recyclerView.post(new D.b(7, this, z12));
        }
    }

    public final void f() {
        if (this.f180032q == null) {
            g();
        } else {
            View view = this.centerView;
            View view2 = null;
            if (view != null && !L.f(h(view), this.f180032q.f180047b)) {
                setCenterView((View) null);
            }
            if (this.centerView == null && this.f180029n == 0) {
                RecyclerView recyclerView = this.f180022g;
                int iO02 = recyclerView.getLayoutManager().o0();
                for (int i12 = 0; i12 < iO02; i12++) {
                    View childAt = recyclerView.getChildAt(i12);
                    if (childAt != null && L.f(h(childAt), this.f180032q.f180047b)) {
                        view2 = childAt;
                    }
                }
                setCenterView(view2);
            }
        }
        float height = (getHeight() / 2.0f) + y6.b(4);
        if (this.centerView != null) {
            float top = ((r2.getTop() + r2.getBottom()) / 2.0f) - height;
            this.f180025j = kotlin.math.b.b(top / this.f180027l);
            int iB2 = kotlin.math.b.b(top);
            this.f180026k = iB2;
            if (this.f180025j == 0) {
                this.f180025j = (int) Math.signum(iB2);
            }
        }
    }

    public final void g() {
        if (this.centerView == null && this.f180029n == 0) {
            RecyclerView recyclerView = this.f180022g;
            int iO02 = recyclerView.getLayoutManager().o0();
            float height = (getHeight() / 2.0f) + y6.b(4);
            int iMin = Integer.MAX_VALUE;
            View view = null;
            for (int i12 = 0; i12 < iO02; i12++) {
                View childAt = recyclerView.getChildAt(i12);
                if (childAt != null) {
                    int iAbs = (int) Math.abs(height - ((childAt.getTop() + childAt.getBottom()) / 2.0f));
                    iMin = Math.min(iAbs, iMin);
                    if (iMin == iAbs) {
                        view = childAt;
                    }
                }
            }
            setCenterView(view);
        }
    }

    @Y61.k
    public final List<k<?>> getItems() {
        return this.items;
    }

    @Y61.l
    public final Y41.a<G0> getOnScrollFinished() {
        return this.onScrollFinished;
    }

    @Y61.l
    public final Y41.a<G0> getOnScrollStarted() {
        return this.onScrollStarted;
    }

    @Y61.l
    public final k<?> getSelectedResult() {
        Object obj;
        Iterator<T> it = this.items.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String str = ((k) next).f180047b;
            View view = this.centerView;
            if (L.f(str, view != null ? h(view) : null)) {
                obj = next;
                break;
            }
        }
        k<?> kVar = (k) obj;
        return kVar == null ? this.f180034s : kVar;
    }

    @Y61.k
    public final m getWheelStyle() {
        return this.wheelStyle;
    }

    public final void i() {
        float measuredWidth;
        RecyclerView recyclerView = this.f180022g;
        int iO02 = recyclerView.getLayoutManager().o0();
        float height = (getHeight() / 2.0f) + y6.b(4);
        int iB2 = y6.b(26);
        for (int i12 = 0; i12 < iO02; i12++) {
            View childAt = recyclerView.getChildAt(i12);
            if (childAt != null) {
                float top = (childAt.getTop() + childAt.getBottom()) / 2.0f;
                int measuredHeight = this.f180023h;
                if (measuredHeight == 0) {
                    measuredHeight = childAt.getMeasuredHeight();
                }
                this.f180023h = measuredHeight;
                int measuredWidth2 = this.f180024i;
                if (measuredWidth2 == 0) {
                    measuredWidth2 = childAt.getMeasuredWidth();
                }
                this.f180024i = measuredWidth2;
                float fAbs = Math.abs(height - top);
                float f12 = 1;
                float f13 = fAbs / height;
                float f14 = f12 - (0.5f * f13);
                float f15 = f12 - f13;
                int iB3 = kotlin.math.b.b(this.f180023h * f14);
                float f16 = iB2;
                if (fAbs < f16) {
                    iB3 += kotlin.math.b.b((f12 - (fAbs / f16)) * f16);
                }
                childAt.getLayoutParams().height = iB3;
                TextView textView = (TextView) childAt.findViewById(R.id.text);
                int iOrdinal = this.wheelStyle.f180050a.ordinal();
                if (iOrdinal == 0) {
                    measuredWidth = 0.0f;
                } else if (iOrdinal == 1) {
                    measuredWidth = textView.getMeasuredWidth();
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    measuredWidth = textView.getMeasuredWidth() / 2.0f;
                }
                textView.setPivotX(measuredWidth);
                textView.setPivotY(textView.getMeasuredHeight() / 2.0f);
                textView.setScaleX(f14);
                textView.setScaleY(f14);
                textView.setAlpha(f15);
                childAt.requestLayout();
            }
        }
    }

    public final void j() {
        g();
        View view = this.centerView;
        if (view == null || !(this.f180032q == null || L.f(h(view), this.f180032q.f180047b))) {
            this.f180022g.post(new h(this, 2));
        }
    }

    public final void setOnScrollFinished(@Y61.l Y41.a<G0> aVar) {
        this.onScrollFinished = aVar;
    }

    public final void setOnScrollStarted(@Y61.l Y41.a<G0> aVar) {
        this.onScrollStarted = aVar;
    }

    public final void setSelectedResult(@Y61.l k<?> kVar) {
        this.f180032q = kVar;
        if (kVar == null) {
            return;
        }
        this.f180030o.clear();
        this.f180033r = true;
        this.f180022g.J0();
        post(new h(this, 0));
    }

    private final void setCenterView(k<?> value) {
        RecyclerView recyclerView = this.f180022g;
        int iO02 = recyclerView.getLayoutManager().o0();
        for (int i12 = 0; i12 < iO02; i12++) {
            View childAt = recyclerView.getChildAt(i12);
            if (childAt != null && L.f(h(childAt), value.f180047b)) {
                setCenterView(childAt);
            }
        }
    }
}
