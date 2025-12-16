package com.avito.android.evidence_request.mvi.evidence_details;

import Y61.k;
import a90.ViewOnLayoutChangeListenerC19701a;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22977J;
import androidx.view.C23069w;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import ru.avito.component.toolbar.CollapsingTitleAppBarLayout;

/* compiled from: EvidenceDetailsView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/g;", "Lcom/avito/android/evidence_request/mvi/evidence_details/c;", "a", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements c {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f148989n = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f148990a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final i f148991b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.recycler.data_aware.c f148992c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f148993d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final CollapsingTitleAppBarLayout f148994e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Button f148995f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final RecyclerView f148996g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f148997h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final LinearLayout f148998i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final View f148999j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f149000k;

    /* renamed from: l, reason: collision with root package name */
    public final ViewOnLayoutChangeListenerC19701a f149001l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final InterfaceC43160i<Boolean> f149002m;

    /* compiled from: EvidenceDetailsView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/g$a;", "", "<init>", "()V", "", "AGREEMENT_TAG", "Ljava/lang/String;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public g(@k View view, @k Lifecycle lifecycle, @k C22977J c22977j, @k i iVar, @k com.avito.konveyor.adapter.j jVar, @k com.avito.android.recycler.data_aware.c cVar) {
        this.f148990a = view;
        this.f148991b = iVar;
        this.f148992c = cVar;
        this.f148993d = view.getContext();
        CollapsingTitleAppBarLayout collapsingTitleAppBarLayout = (CollapsingTitleAppBarLayout) view.findViewById(R.id.app_bar);
        this.f148994e = collapsingTitleAppBarLayout;
        Button button = (Button) view.findViewById(R.id.main_button);
        this.f148995f = button;
        View viewFindViewById = view.findViewById(R.id.recycler_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f148996g = recyclerView;
        View viewFindViewById2 = view.findViewById(R.id.disclaimer_text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f148997h = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.bottom_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById3;
        this.f148998i = linearLayout;
        this.f148999j = view.findViewById(R.id.content_holder);
        InterfaceC43160i<Boolean> interfaceC43160iA = C23069w.a(C43175k.d(new h(this, null)), lifecycle, Lifecycle.State.f46682e);
        this.f149002m = interfaceC43160iA;
        recyclerView.setAdapter(jVar);
        ViewOnLayoutChangeListenerC19701a viewOnLayoutChangeListenerC19701a = new ViewOnLayoutChangeListenerC19701a(this, 9);
        linearLayout.addOnLayoutChangeListener(viewOnLayoutChangeListenerC19701a);
        this.f149001l = viewOnLayoutChangeListenerC19701a;
        collapsingTitleAppBarLayout.setClickListener(new e(this));
        button.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.k(this, 6));
        C43175k.K(new C43197r1(new f(this, null), interfaceC43160iA), c22977j);
    }
}
