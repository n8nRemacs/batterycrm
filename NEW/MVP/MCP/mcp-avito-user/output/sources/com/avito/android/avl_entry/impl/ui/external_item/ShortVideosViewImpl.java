package com.avito.android.avl_entry.impl.ui.external_item;

import Lg.InterfaceC14390a;
import android.content.ComponentCallbacks2;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.C23434z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.avl_entry.impl.di.k;
import com.avito.android.avl_entry.impl.ui.internal_item.ShortVideosWidgetCarouselItem;
import com.avito.android.avl_entry.impl.util.a;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.y6;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.O;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.o;

/* compiled from: ShortVideosView.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/avl_entry/impl/ui/external_item/ShortVideosViewImpl;", "Lcom/avito/android/avl_entry/impl/ui/external_item/j;", "Lcom/avito/android/serp/c;", "Landroidx/lifecycle/q;", "a", "SavedState", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ShortVideosViewImpl extends com.avito.android.serp.c implements j, InterfaceC23057q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f98499b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Ig.f f98500c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f98501d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.avl_analytics.a f98502e;

    /* renamed from: f, reason: collision with root package name */
    public com.avito.konveyor.adapter.h f98503f;

    /* renamed from: g, reason: collision with root package name */
    public com.avito.konveyor.adapter.j f98504g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f98505h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f98506i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public com.avito.android.avl_entry.impl.util.a f98507j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f98508k;

    /* renamed from: l, reason: collision with root package name */
    public final RecyclerView f98509l;

    /* renamed from: m, reason: collision with root package name */
    public final Badge f98510m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f98511n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f98512o;

    /* compiled from: ShortVideosView.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/avl_entry/impl/ui/external_item/ShortVideosViewImpl$SavedState;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Parcelable f98513b;

        /* renamed from: c, reason: collision with root package name */
        public final int f98514c;

        /* compiled from: ShortVideosView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }
        }

        public SavedState(@Y61.l Parcelable parcelable, int i12) {
            super(parcelable);
            this.f98513b = parcelable;
            this.f98514c = i12;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f98513b, i12);
            parcel.writeInt(this.f98514c);
        }
    }

    /* compiled from: ShortVideosView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avl_entry/impl/ui/external_item/ShortVideosViewImpl$a;", "Landroidx/recyclerview/widget/z;", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends C23434z {
        @Override // androidx.recyclerview.widget.C23434z
        public final int g(int i12, int i13, int i14, int i15, int i16) {
            return i14 - i12;
        }

        @Override // androidx.recyclerview.widget.C23434z
        public final float j(@Y61.l DisplayMetrics displayMetrics) {
            return super.j(displayMetrics) * 2.0f;
        }
    }

    /* compiled from: ShortVideosView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/avl_entry/impl/ui/external_item/ShortVideosViewImpl$b", "Landroid/view/View$OnAttachStateChangeListener;", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f98515b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f98516c;

        public b(Y41.a<G0> aVar, Y41.a<G0> aVar2) {
            this.f98515b = aVar;
            this.f98516c = aVar2;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@Y61.k View view) {
            this.f98515b.invoke();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@Y61.k View view) {
            this.f98516c.invoke();
        }
    }

    public ShortVideosViewImpl(@Y61.k View view, @Y61.k Ig.f fVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.avl_analytics.a aVar) {
        Lifecycle lifecycle;
        super(view);
        this.f98499b = view;
        this.f98500c = fVar;
        this.f98501d = interfaceC35745a5;
        this.f98502e = aVar;
        this.f98508k = (TextView) view.findViewById(R.id.title_text_view);
        this.f98509l = (RecyclerView) view.findViewById(R.id.short_videos_recycler_view);
        this.f98510m = (Badge) view.findViewById(R.id.notification_badge);
        this.f98511n = new io.reactivex.rxjava3.disposables.c();
        ComponentCallbacks2 componentCallbacks2A = C35835l0.a(view.getContext());
        InterfaceC22983P interfaceC22983P = componentCallbacks2A instanceof InterfaceC22983P ? (InterfaceC22983P) componentCallbacks2A : null;
        if (interfaceC22983P == null || (lifecycle = interfaceC22983P.getLifecycle()) == null) {
            return;
        }
        lifecycle.a(this);
    }

    @Override // com.avito.android.avl_entry.impl.ui.external_item.j
    public final void D1(@Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2) {
        this.f98499b.addOnAttachStateChangeListener(new b(aVar, aVar2));
    }

    @Override // com.avito.android.avl_entry.impl.ui.external_item.j
    public final void GV(int i12) {
        RecyclerView recyclerView = this.f98509l;
        a aVar = new a(recyclerView.getContext());
        aVar.f53878a = i12;
        recyclerView.post(new J11.c(29, this, aVar));
    }

    @Override // com.avito.android.avl_entry.impl.ui.external_item.j
    public final void Jq(boolean z12) {
        Badge badge = this.f98510m;
        if (z12) {
            D6.H(badge);
        } else {
            D6.w(badge);
        }
    }

    @Override // com.avito.android.avl_entry.impl.ui.external_item.j
    public final void Ug(@Y61.k ArrayList arrayList, @Y61.k com.avito.android.avl_entry.impl.util.d dVar, @Y61.k List list) {
        io.reactivex.rxjava3.disposables.c cVar = this.f98511n;
        cVar.e();
        this.f98499b.getContext();
        dVar.d(arrayList);
        com.jakewharton.rxrelay3.c cVarI = dVar.i();
        InterfaceC35745a5 interfaceC35745a5 = this.f98501d;
        cVar.b(A1.h(cVarI.j0(interfaceC35745a5.e()).x0(interfaceC35745a5.e()), null, new l(this, dVar, list), 3));
        Ig.f fVar = this.f98500c;
        O position = fVar.getPosition();
        o<Object, Object> oVar = io.reactivex.rxjava3.internal.functions.a.f401991a;
        cVar.b(A1.h(z.k(position.D(oVar), fVar.a().D(oVar), new k()).x0(interfaceC35745a5.e()).j0(interfaceC35745a5.e()), null, new m(this, dVar), 3));
    }

    @Override // com.avito.android.avl_entry.impl.ui.external_item.j
    public final void d(@Y61.l Y41.a<G0> aVar) {
        this.f98505h = aVar;
    }

    @Override // com.avito.android.avl_entry.impl.ui.external_item.j
    public final void e3(@Y61.l Parcelable parcelable) {
        if (parcelable != null) {
            RecyclerView.m layoutManager = this.f98509l.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                linearLayoutManager.X0(parcelable);
            }
        }
    }

    @Override // com.avito.android.avl_entry.impl.ui.external_item.j
    public final void iU(@Y61.l Y41.a<G0> aVar) {
        this.f98506i = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f98511n.e();
        this.f98507j = null;
        this.f98509l.s();
        Y41.a<G0> aVar = this.f98505h;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.avl_entry.impl.ui.external_item.j
    @Y61.k
    public final Parcelable l1() {
        RecyclerView.m layoutManager = this.f98509l.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        return new SavedState(linearLayoutManager != null ? linearLayoutManager.Y0() : null, linearLayoutManager != null ? linearLayoutManager.K1() : 0);
    }

    @Override // com.avito.android.avl_entry.impl.ui.external_item.j
    public final void oR(@Y61.k com.avito.android.avl_entry.impl.util.d dVar) {
        k.a aVarA = com.avito.android.avl_entry.impl.di.b.a();
        View view = this.f98499b;
        com.avito.android.avl_entry.impl.di.k kVarA = aVarA.a((com.avito.android.avl_entry.impl.di.l) C29972i.a(C29972i.b(view), com.avito.android.avl_entry.impl.di.l.class), (InterfaceC14390a) C29972i.a(C29972i.b(view), InterfaceC14390a.class), view.getResources(), dVar);
        this.f98503f = kVarA.b();
        com.avito.konveyor.adapter.j jVarA = kVarA.a();
        this.f98504g = jVarA;
        if (jVarA == null) {
            jVarA = null;
        }
        RecyclerView recyclerView = this.f98509l;
        recyclerView.setAdapter(jVarA);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager() { // from class: com.avito.android.avl_entry.impl.ui.external_item.ShortVideosViewImpl$prepareRecyclerView$1
            {
                super(0, false);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.m
            public final boolean K(@Y61.k RecyclerView.n nVar) {
                int i12 = (int) (C35835l0.i(this.f98517G.f98509l.getContext()).widthPixels * 0.27d);
                ((ViewGroup.MarginLayoutParams) nVar).width = i12;
                ((ViewGroup.MarginLayoutParams) nVar).height = (int) (i12 * 1.76d);
                return true;
            }
        });
        recyclerView.setOverScrollMode(2);
        recyclerView.setItemAnimator(null);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.l(new com.avito.android.ui.h(0, 0, 0, y6.b(6), 6, null), -1);
        }
        recyclerView.setOnFlingListener(null);
        new com.avito.android.avl_entry.impl.util.c().b(recyclerView);
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onPause(@Y61.k InterfaceC22983P interfaceC22983P) {
        this.f98512o = false;
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onResume(@Y61.k InterfaceC22983P interfaceC22983P) {
        this.f98512o = true;
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onStop(@Y61.k InterfaceC22983P interfaceC22983P) {
        Lifecycle lifecycle;
        Y41.a<G0> aVar = this.f98506i;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f98511n.e();
        ComponentCallbacks2 componentCallbacks2A = C35835l0.a(this.f98499b.getContext());
        InterfaceC22983P interfaceC22983P2 = componentCallbacks2A instanceof InterfaceC22983P ? (InterfaceC22983P) componentCallbacks2A : null;
        if (interfaceC22983P2 == null || (lifecycle = interfaceC22983P2.getLifecycle()) == null) {
            return;
        }
        lifecycle.c(this);
    }

    @Override // com.avito.android.avl_entry.impl.ui.external_item.j
    public final boolean r80() {
        com.avito.android.avl_entry.impl.util.a aVar = this.f98507j;
        if (aVar != null) {
            return aVar.f98613c;
        }
        return false;
    }

    @Override // com.avito.android.avl_entry.impl.ui.external_item.j
    public final void s4(int i12) {
        RecyclerView.m layoutManager = this.f98509l.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.l1(i12);
        }
    }

    @Override // com.avito.android.avl_entry.impl.ui.external_item.j
    public final void setTitle(@Y61.k String str) {
        this.f98508k.setText(str);
    }

    @Override // com.avito.android.avl_entry.impl.ui.external_item.j
    @Y61.k
    public final z<a.InterfaceC2959a> v40() {
        com.avito.android.avl_entry.impl.util.a aVar = this.f98507j;
        RecyclerView recyclerView = this.f98509l;
        if (aVar != null) {
            recyclerView.v0(aVar);
        }
        com.avito.android.avl_entry.impl.util.a aVar2 = new com.avito.android.avl_entry.impl.util.a();
        this.f98507j = aVar2;
        recyclerView.o(aVar2);
        return aVar2.f98612b;
    }

    @Override // com.avito.android.avl_entry.impl.ui.external_item.j
    public final void wX(@Y61.k List<? extends ShortVideosWidgetCarouselItem> list) {
        boolean zIsEmpty = list.isEmpty();
        RecyclerView recyclerView = this.f98509l;
        if (zIsEmpty) {
            D6.w(recyclerView);
            return;
        }
        D6.H(recyclerView);
        com.avito.konveyor.adapter.h hVar = this.f98503f;
        if (hVar == null) {
            hVar = null;
        }
        hVar.f338510e = new UV0.c(list);
        com.avito.konveyor.adapter.j jVar = this.f98504g;
        (jVar != null ? jVar : null).notifyDataSetChanged();
    }
}
