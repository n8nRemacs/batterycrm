package com.avito.android.comparison.items.nested_scrolling_item;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.comparison.q;
import com.avito.android.comparison.s;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import l41.InterfaceC43543a;

/* compiled from: NestedScrollingView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comparison/items/nested_scrolling_item/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/comparison/items/nested_scrolling_item/a;", "Lcom/avito/android/comparison/items/nested_scrolling_item/h;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i extends com.avito.konveyor.adapter.b implements com.avito.android.comparison.items.nested_scrolling_item.a, h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final q f124015b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public y f124016c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public y f124017d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final HorizontalRecyclerView f124018e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final FrameLayout f124019f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final s f124020g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.h f124021h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.comparison.items.nested_scrolling_item.b f124022i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final j f124023j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final e f124024k;

    /* compiled from: NestedScrollingView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "it", "Lkotlin/G0;", "accept", "(Landroid/view/MotionEvent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            i.this.f124018e.onTouchEvent((MotionEvent) obj);
        }
    }

    /* compiled from: NestedScrollingView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f124026b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Error when try consume motion event", (Throwable) obj);
        }
    }

    /* compiled from: NestedScrollingView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            i.this.f124018e.J0();
        }
    }

    /* compiled from: NestedScrollingView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T> f124028b = new d<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Error when try stop recycler scroll", (Throwable) obj);
        }
    }

    /* compiled from: NestedScrollingView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/comparison/items/nested_scrolling_item/i$e", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends RecyclerView.r {
        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @k RecyclerView recyclerView) {
            i.this.f124015b.f124188a = i12;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void k(@k RecyclerView recyclerView, int i12, int i13) {
            if (i12 != 0) {
                i.this.f124015b.f124189b = recyclerView.computeHorizontalScrollOffset();
            }
        }
    }

    public i(@k View view, @k com.avito.konveyor.a aVar, @k z<Integer> zVar, @k com.avito.android.comparison.text_measurer.a aVar2, @k q qVar) {
        super(view);
        this.f124015b = qVar;
        HorizontalRecyclerView horizontalRecyclerView = (HorizontalRecyclerView) view.findViewById(R.id.nested_recycler);
        this.f124018e = horizontalRecyclerView;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.overlay_item_container);
        this.f124019f = frameLayout;
        this.f124020g = new s(frameLayout, horizontalRecyclerView, zVar);
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
        this.f124021h = hVar;
        com.avito.android.comparison.items.nested_scrolling_item.b bVar = new com.avito.android.comparison.items.nested_scrolling_item.b(hVar, aVar);
        this.f124022i = bVar;
        this.f124023j = new j(view.getContext(), aVar2);
        this.f124024k = new e();
        horizontalRecyclerView.setLayoutManager(linearLayoutManager);
        horizontalRecyclerView.setAdapter(bVar);
    }

    @Override // com.avito.android.comparison.items.nested_scrolling_item.h
    public final void Wf(@k ArrayList arrayList) {
        Object next;
        j jVar = this.f124023j;
        jVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof com.avito.android.comparison.items.option_text_value_item.a) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        Integer numValueOf = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = ((com.avito.android.comparison.items.option_text_value_item.a) next).f124057c.length();
                do {
                    Object next2 = it.next();
                    int length2 = ((com.avito.android.comparison.items.option_text_value_item.a) next2).f124057c.length();
                    if (length < length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        com.avito.android.comparison.items.option_text_value_item.a aVar = (com.avito.android.comparison.items.option_text_value_item.a) next;
        String str = aVar != null ? aVar.f124057c : null;
        if (str != null) {
            Context context = jVar.f124030a;
            View viewFindViewById = LayoutInflater.from(context).inflate(R.layout.comparison_option_text_value_item_layout, (ViewGroup) null).findViewById(R.id.text_value);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView = (TextView) viewFindViewById;
            textView.setText(str);
            int dimension = (int) context.getResources().getDimension(R.dimen.comparison_content_width);
            com.avito.android.comparison.text_measurer.a aVar2 = jVar.f124031b;
            numValueOf = Integer.valueOf(aVar2.b(str, aVar2.a(textView, dimension)).getHeight());
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        HorizontalRecyclerView horizontalRecyclerView = this.f124018e;
        if (iIntValue > 0) {
            horizontalRecyclerView.getLayoutParams().height = iIntValue;
            FrameLayout frameLayout = this.f124019f;
            frameLayout.getLayoutParams().height = iIntValue;
            horizontalRecyclerView.requestLayout();
            frameLayout.requestLayout();
        }
        this.f124021h.f338510e = new UV0.c(arrayList);
        this.f124022i.notifyDataSetChanged();
        horizontalRecyclerView.post(new com.avito.android.app.coldstart.d(this, 14));
    }

    @Override // com.avito.android.comparison.items.nested_scrolling_item.a
    public final void pg() {
        this.f124018e.v0(this.f124024k);
        y yVar = this.f124016c;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f124016c = null;
        y yVar2 = this.f124017d;
        if (yVar2 != null) {
            DisposableHelper.a(yVar2);
        }
        this.f124017d = null;
    }

    @Override // com.avito.android.comparison.items.nested_scrolling_item.a
    public final void tR() {
        e eVar = this.f124024k;
        HorizontalRecyclerView horizontalRecyclerView = this.f124018e;
        horizontalRecyclerView.o(eVar);
        q qVar = this.f124015b;
        io.reactivex.rxjava3.subjects.e<MotionEvent> eVar2 = qVar.f124190c;
        eVar2.getClass();
        C41981q0 c41981q0 = new C41981q0(eVar2);
        a aVar = new a();
        l41.g<? super Throwable> gVar = b.f124026b;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        this.f124016c = (y) c41981q0.v0(aVar, gVar, interfaceC43543a);
        io.reactivex.rxjava3.subjects.e<G0> eVar3 = qVar.f124191d;
        eVar3.getClass();
        this.f124017d = (y) new C41981q0(eVar3).v0(new c(), d.f124028b, interfaceC43543a);
        horizontalRecyclerView.post(new com.avito.android.app.coldstart.d(this, 14));
    }
}
