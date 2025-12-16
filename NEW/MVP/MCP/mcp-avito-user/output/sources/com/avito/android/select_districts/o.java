package com.avito.android.select_districts;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.O;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.recycler.layout_manager.UnpredictiveLinearLayoutManager;
import com.avito.android.util.C35835l0;
import i31.InterfaceC41220a;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectDistrictsViewRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select_districts/o;", "", "a", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f267100a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<String, G0> f267101b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f267102c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f267103d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f267104e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f267105f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recycler.data_aware.c f267106g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final View f267107h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f267108i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Input f267109j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final TextView f267110k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f267111l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Button f267112m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final C42670a f267113n;

    /* compiled from: SelectDistrictsViewRenderer.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select_districts/o$a;", "", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        o a(@Y61.k View view, @InterfaceC41220a @Y61.k Y41.l<? super String, G0> lVar, @InterfaceC41220a @Y61.k Y41.a<G0> aVar, @InterfaceC41220a @Y61.k Y41.a<G0> aVar2, @InterfaceC41220a @Y61.k Y41.a<G0> aVar3, @InterfaceC41220a @Y61.k Y41.a<G0> aVar4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i31.c
    public o(@InterfaceC41220a @Y61.k View view, @InterfaceC41220a @Y61.k Y41.l<? super String, G0> lVar, @InterfaceC41220a @Y61.k Y41.a<G0> aVar, @InterfaceC41220a @Y61.k Y41.a<G0> aVar2, @InterfaceC41220a @Y61.k Y41.a<G0> aVar3, @InterfaceC41220a @Y61.k Y41.a<G0> aVar4, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k com.avito.android.recycler.data_aware.c cVar) {
        this.f267100a = view;
        this.f267101b = lVar;
        this.f267102c = aVar;
        this.f267103d = aVar2;
        this.f267104e = aVar3;
        this.f267105f = aVar4;
        this.f267106g = cVar;
        View viewFindViewById = view.findViewById(R.id.header_back);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f267107h = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.header_clear);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById2;
        this.f267108i = textView;
        View viewFindViewById3 = view.findViewById(R.id.select_districts_input);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById3;
        this.f267109j = input;
        View viewFindViewById4 = view.findViewById(R.id.select_districts_empty_search_stub_text);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f267110k = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.select_districts_recycler);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById5;
        this.f267111l = recyclerView;
        View viewFindViewById6 = view.findViewById(R.id.select_districts_main_button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById6;
        this.f267112m = button;
        View viewFindViewById7 = view.findViewById(R.id.select_districts_progress_overlay);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        C42670a c42670a = new C42670a((ViewGroup) viewFindViewById7, new p(this), 0, 4, null);
        this.f267113n = c42670a;
        final int i12 = 1;
        c42670a.a(new View.OnClickListener(this) { // from class: com.avito.android.select_districts.n

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f267099c;

            {
                this.f267099c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f267099c.f267102c.invoke();
                        break;
                    case 1:
                        this.f267099c.f267104e.invoke();
                        break;
                    case 2:
                        this.f267099c.f267105f.invoke();
                        break;
                    default:
                        this.f267099c.f267103d.invoke();
                        break;
                }
            }
        });
        final int i13 = 2;
        viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.select_districts.n

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f267099c;

            {
                this.f267099c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f267099c.f267102c.invoke();
                        break;
                    case 1:
                        this.f267099c.f267104e.invoke();
                        break;
                    case 2:
                        this.f267099c.f267105f.invoke();
                        break;
                    default:
                        this.f267099c.f267103d.invoke();
                        break;
                }
            }
        });
        final int i14 = 3;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.select_districts.n

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f267099c;

            {
                this.f267099c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        this.f267099c.f267102c.invoke();
                        break;
                    case 1:
                        this.f267099c.f267104e.invoke();
                        break;
                    case 2:
                        this.f267099c.f267105f.invoke();
                        break;
                    default:
                        this.f267099c.f267103d.invoke();
                        break;
                }
            }
        });
        textView.setEnabled(false);
        com.avito.android.lib.design.input.n.c(input, lVar);
        input.setFocusByClearButton(false);
        view.getContext();
        recyclerView.setLayoutManager(new UnpredictiveLinearLayoutManager());
        ((O) recyclerView.getItemAnimator()).f53727g = false;
        recyclerView.setAdapter(jVar);
        final int i15 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.select_districts.n

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f267099c;

            {
                this.f267099c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        this.f267099c.f267102c.invoke();
                        break;
                    case 1:
                        this.f267099c.f267104e.invoke();
                        break;
                    case 2:
                        this.f267099c.f267105f.invoke();
                        break;
                    default:
                        this.f267099c.f267103d.invoke();
                        break;
                }
            }
        });
    }

    public final void a(boolean z12) {
        int i12 = z12 ? R.attr.blue700 : R.attr.gray20;
        TextView textView = this.f267108i;
        textView.setEnabled(z12);
        textView.setTextColor(C35835l0.d(i12, this.f267100a.getContext()));
    }
}
