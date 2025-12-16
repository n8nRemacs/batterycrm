package com.avito.android.ab_groups;

import Ba1.B;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C23038g0;
import com.avito.android.R;
import com.avito.android.ab_groups.j;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.segmented_control.SegmentedControl;
import com.avito.android.util.C35766c3;
import io.reactivex.rxjava3.core.z;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: AbExperimentsActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/ab_groups/AbExperimentsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_ab-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes10.dex */
public final class AbExperimentsActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f67644v = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public q f67645m;

    /* renamed from: n, reason: collision with root package name */
    public p f67646n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public RecyclerView f67647o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public ProgressBar f67648p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public TextView f67649q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public SegmentedControl f67650r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public Input f67651s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public Toolbar f67652t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.modal.a f67653u;

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.ab_groups.di.e.a().a((com.avito.android.ab_groups.di.d) C29972i.a(C29972i.b(this), com.avito.android.ab_groups.di.d.class), this).a(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ab_groups_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.f67652t = toolbar;
        if (toolbar != null) {
            toolbar.getMenu().clear();
            toolbar.m(R.menu.menu_save_ab_item);
            C35766c3.b(toolbar.getMenu().findItem(R.id.saveItem), this, R.attr.blue);
            com.avito.android.ui.d.b(toolbar, new B(19, toolbar, this));
        }
        SegmentedControl segmentedControl = (SegmentedControl) findViewById(R.id.segmented_control);
        this.f67650r = segmentedControl;
        if (segmentedControl != null) {
            segmentedControl.q(0, C42745f0.U("prod", "staging"));
            segmentedControl.setOnSegmentClickListener(new f(this));
        }
        q qVar = this.f67645m;
        this.f67646n = new p(new g(1, qVar != null ? qVar : null, q.class, "onItemClick", "onItemClick(Lcom/avito/android/ab_groups/data/AbExperimentDto;)V", 0));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        p pVar = this.f67646n;
        if (pVar == null) {
            pVar = null;
        }
        recyclerView.setAdapter(pVar);
        this.f67647o = recyclerView;
        this.f67648p = (ProgressBar) findViewById(R.id.progress);
        this.f67649q = (TextView) findViewById(R.id.error);
        Input input = (Input) findViewById(R.id.search_input);
        this.f67651s = input;
        q qVar2 = this.f67645m;
        q qVar3 = qVar2 != null ? qVar2 : null;
        if (input != null) {
            z<CharSequence> zVarN0 = com.avito.android.lib.design.input.n.e(input).N0();
            qVar3.getClass();
            qVar3.f67682P.b(zVarN0.y(300L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new u(qVar3)));
        }
        C23038g0<Boolean> c23038g0 = qVar3.f67678L;
        p pVar2 = this.f67646n;
        c23038g0.observe(this, new j.a(new a(1, pVar2 == null ? null : pVar2, p.class, "updateIsProd", "updateIsProd(Z)V", 0)));
        qVar3.f67677K.observe(this, new j.a(new b(1, this, AbExperimentsActivity.class, "handleScreenState", "handleScreenState(Lcom/avito/android/ab_groups/AbExperimentsViewModel$ScreenState;)V", 0)));
        qVar3.f67679M.observe(this, new j.a(new c(1, this, AbExperimentsActivity.class, "showAbGroupsDialog", "showAbGroupsDialog(Lcom/avito/android/ab_groups/data/AbExperimentDto;)V", 0)));
        qVar3.f67681O.observe(this, new j.a(new d(this)));
        qVar3.f67680N.observe(this, new j.a(new e(this)));
    }
}
