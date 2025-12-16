package com.avito.android.inline_filters.dialog.select;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.select.adapter.C31029a;
import com.avito.android.inline_filters.dialog.select.adapter.C31030b;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SelectFilterView.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/inline_filters/dialog/select/SelectFilterView;", "Lcom/avito/android/inline_filters/dialog/B;", "Lcom/avito/android/inline_filters/dialog/E;", "Lcom/avito/android/inline_filters/dialog/select/a;", "State", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class SelectFilterView implements com.avito.android.inline_filters.dialog.B, com.avito.android.inline_filters.dialog.E, InterfaceC31028a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.candy.e f172032a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final InterfaceC35745a5 f172033b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.inline_filters.dialog.D f172034c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f172035d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Input f172036e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f172037f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final View f172038g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public List<com.avito.android.inline_filters.dialog.select.adapter.i> f172039h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public List<com.avito.android.inline_filters.dialog.select.adapter.i> f172040i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.inline_filters.dialog.select.adapter.i> f172041j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f172042k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f172043l;

    /* compiled from: SelectFilterView.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/select/SelectFilterView$State;", "Landroid/os/Parcelable;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<State> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f172044b;

        /* compiled from: SelectFilterView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                return new State(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i12) {
                return new State[i12];
            }
        }

        public State(@Y61.l String str) {
            this.f172044b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f172044b);
        }
    }

    public SelectFilterView(@Y61.k View view, boolean z12, @Y61.l com.avito.android.candy.e eVar, @Y61.l InterfaceC35745a5 interfaceC35745a5) throws BlueprintCollisionException {
        this.f172032a = eVar;
        this.f172033b = interfaceC35745a5;
        this.f172034c = new com.avito.android.inline_filters.dialog.D(view);
        View viewFindViewById = view.findViewById(R.id.filter_options_recycler_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f172035d = recyclerView;
        View viewFindViewById2 = view.findViewById(R.id.search_edit_text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById2;
        this.f172036e = input;
        View viewFindViewById3 = view.findViewById(R.id.empty_view_hint);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f172037f = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.apply_button_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f172038g = viewFindViewById4;
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f172039h = c42784z0;
        this.f172040i = c42784z0;
        this.f172041j = new com.jakewharton.rxrelay3.c<>();
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(true);
        com.avito.android.inline_filters.dialog.select.adapter.q qVar = null;
        com.avito.android.inline_filters.dialog.select.adapter.j jVar = new com.avito.android.inline_filters.dialog.select.adapter.j(new L(this), null, 2, null);
        com.avito.android.inline_filters.dialog.select.adapter.x xVar = new com.avito.android.inline_filters.dialog.select.adapter.x(jVar);
        com.avito.android.inline_filters.dialog.select.adapter.d dVar = new com.avito.android.inline_filters.dialog.select.adapter.d(jVar);
        com.avito.android.inline_filters.dialog.select.adapter.p pVar = new com.avito.android.inline_filters.dialog.select.adapter.p(jVar);
        com.avito.android.inline_filters.dialog.select.adapter.u uVar = new com.avito.android.inline_filters.dialog.select.adapter.u(jVar);
        com.avito.android.inline_filters.dialog.select.adapter.w wVar = new com.avito.android.inline_filters.dialog.select.adapter.w(jVar);
        com.avito.android.inline_filters.dialog.select.adapter.B b12 = new com.avito.android.inline_filters.dialog.select.adapter.B(jVar);
        com.avito.android.inline_filters.dialog.select.adapter.f fVar = new com.avito.android.inline_filters.dialog.select.adapter.f(jVar);
        com.avito.android.inline_filters.dialog.select.adapter.z zVar = new com.avito.android.inline_filters.dialog.select.adapter.z(jVar);
        com.avito.android.inline_filters.dialog.select.adapter.o oVar = new com.avito.android.inline_filters.dialog.select.adapter.o(jVar);
        C31030b c31030b = new C31030b(jVar);
        if (eVar != null && interfaceC35745a5 != null) {
            qVar = new com.avito.android.inline_filters.dialog.select.adapter.q(jVar, eVar, interfaceC35745a5);
        }
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(xVar);
        c10493a.b(dVar);
        c10493a.b(pVar);
        c10493a.b(uVar);
        c10493a.b(wVar);
        c10493a.b(b12);
        c10493a.b(fVar);
        c10493a.b(zVar);
        c10493a.b(oVar);
        c10493a.b(c31030b);
        if (qVar != null) {
            c10493a.b(qVar);
        }
        com.avito.konveyor.a aVarA = c10493a.a();
        this.f172042k = aVarA;
        this.f172043l = new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null);
        if (z12) {
            input.b(new com.avito.android.lib.design.input.s(null, new N(1, this, SelectFilterView.class, "handleTextChanges", "handleTextChanges(Ljava/lang/CharSequence;)V", 0)));
        }
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Qd(@Y61.k Y41.a<G0> aVar) {
        this.f172034c.Qd(aVar);
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Rd(boolean z12) {
        this.f172034c.Rd(z12);
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Sd(@Y61.k Y41.a<G0> aVar) {
        this.f172034c.Sd(aVar);
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Td(@Y61.k String str) {
        this.f172034c.Td(str);
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Ud(boolean z12) {
        this.f172034c.Ud(z12);
    }

    @Override // com.avito.android.inline_filters.dialog.E
    @Y61.l
    /* renamed from: getState */
    public final Parcelable getF171936c() {
        return new State(this.f172036e.getDeformattedText());
    }

    public void k(@Y61.k List<com.avito.android.inline_filters.dialog.select.adapter.i> list, @Y61.l List<com.avito.android.inline_filters.dialog.select.adapter.i> list2) {
        this.f172039h = list;
        this.f172040i = list;
        z((ArrayList) list2, list);
    }

    public final void l(int i12) {
        this.f172036e.setVisibility(i12);
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void setTitle(@Y61.k String str) {
        this.f172034c.setTitle(str);
    }

    @Y61.k
    public final B0 w() {
        return com.avito.android.lib.design.input.n.a(this.f172036e, 3).d0(new M(this));
    }

    public final void x(boolean z12) {
        TextView textView = this.f172037f;
        D6.G(textView, z12);
        D6.G(this.f172035d, !z12);
        if (z12) {
            String deformattedText = this.f172036e.getDeformattedText();
            Context context = textView.getContext();
            textView.setText(deformattedText.length() == 0 ? context.getString(R.string.search_request_empty_hint) : context.getString(R.string.search_request_not_found_hint, deformattedText));
        }
    }

    public final void y(@Y61.l Parcelable parcelable) {
        if (parcelable instanceof State) {
            Input.t(this.f172036e, ((State) parcelable).f172044b, false, 6);
        }
    }

    public final void z(ArrayList arrayList, List list) {
        UV0.c cVar = new UV0.c(list);
        com.avito.konveyor.adapter.h hVar = this.f172043l;
        hVar.f338510e = cVar;
        RecyclerView recyclerView = this.f172035d;
        if (recyclerView.getAdapter() == null) {
            recyclerView.setAdapter(new com.avito.konveyor.adapter.j(hVar, this.f172042k));
            return;
        }
        if (arrayList == null) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                return;
            }
            return;
        }
        C23424o.e eVarA = C23424o.a(new C31029a(arrayList, this.f172039h), true);
        RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
        if (adapter2 != null) {
            eVarA.b(adapter2);
        }
    }

    public /* synthetic */ SelectFilterView(View view, boolean z12, com.avito.android.candy.e eVar, InterfaceC35745a5 interfaceC35745a5, int i12, C42822w c42822w) {
        this(view, (i12 & 2) != 0 ? true : z12, (i12 & 4) != 0 ? null : eVar, (i12 & 8) != 0 ? null : interfaceC35745a5);
    }
}
