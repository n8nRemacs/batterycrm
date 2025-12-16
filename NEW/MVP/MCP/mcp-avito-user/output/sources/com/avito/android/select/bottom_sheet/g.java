package com.avito.android.select.bottom_sheet;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.select.mvi.entity.ClearActionState;
import com.avito.android.util.D6;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SelectBottomSheetMviView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/bottom_sheet/g;", "Lcom/avito/android/select/bottom_sheet/e;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f265289a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f265290b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f265291c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Object, G0> f265292d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f265293e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f265294f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f265295g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f265296h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C42670a f265297i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public m f265298j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public Input f265299k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public Button f265300l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final TextView f265301m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final View f265302n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Button f265303o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final String f265304p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public PV.b f265305q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final LinearLayoutManager f265306r;

    /* compiled from: SelectBottomSheetMviView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/select/bottom_sheet/g$a", "Landroidx/recyclerview/widget/RecyclerView$g;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.g {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void d(int i12, int i13) {
            g gVar = g.this;
            if (gVar.f265306r.K1() == i12) {
                gVar.f265296h.post(new com.avito.android.publish.screen.objects.view.actions.h(gVar, 12));
            }
        }
    }

    /* compiled from: SelectBottomSheetMviView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[ClearActionState.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ClearActionState clearActionState = ClearActionState.f265575b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: SelectBottomSheetMviView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<View> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            View viewFindViewById = g.this.f265289a.findViewById(R.id.variant_list);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
    }

    public g(@Y61.k ViewGroup viewGroup, @Y61.k com.avito.konveyor.adapter.d dVar, @Y61.k View view, @Y61.k Y41.l<Object, G0> lVar, boolean z12) {
        this.f265289a = viewGroup;
        this.f265290b = dVar;
        this.f265291c = view;
        this.f265292d = lVar;
        this.f265293e = z12;
        View viewFindViewById = viewGroup.findViewById(R.id.select_sheet_content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f265294f = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.select_sheet_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f265295g = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.variant_list);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        this.f265296h = recyclerView;
        View viewFindViewById4 = viewGroup.findViewById(R.id.variant_list_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        C42670a c42670a = new C42670a((ViewGroup) viewFindViewById4, new c(), 0, 4, null);
        this.f265297i = c42670a;
        View viewFindViewById5 = viewGroup.findViewById(R.id.bottom_sheet_action_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f265301m = (TextView) viewFindViewById5;
        View viewFindViewById6 = viewGroup.findViewById(android.R.id.empty);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f265302n = viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.main_button);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f265303o = (Button) viewFindViewById7;
        this.f265304p = viewGroup.getContext().getString(R.string.pagination_error_action);
        viewGroup.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.f265306r = linearLayoutManager;
        recyclerView.l(new com.avito.android.select.bottom_sheet.a(viewGroup.getResources()), -1);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(dVar);
        D6.w(viewFindViewById6);
        c42670a.a(new f(this, 2));
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new a());
        }
    }
}
