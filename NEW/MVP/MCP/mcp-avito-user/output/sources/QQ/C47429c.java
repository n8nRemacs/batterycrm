package qq;

import Y61.k;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import com.avito.konveyor.adapter.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SubmittingSelectView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqq/c;", "Lqq/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qq.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C47429c implements InterfaceC47427a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f429373a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y41.a<G0> f429374b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<G0> f429375c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f429376d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final j f429377e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f429378f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Button f429379g;

    public C47429c(@k View view, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2, @k com.avito.konveyor.adapter.a aVar3, @k j jVar) {
        this.f429373a = view;
        this.f429374b = aVar;
        this.f429375c = aVar2;
        this.f429376d = aVar3;
        this.f429377e = jVar;
        view.getContext();
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById;
        this.f429378f = (TextView) view.findViewById(R.id.title);
        View viewFindViewById2 = view.findViewById(R.id.recycler);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        this.f429379g = (Button) view.findViewById(R.id.proceed_button);
        toolbar.setNavigationIcon(C35835l0.h(R.attr.ic_arrowBack24, toolbar.getContext()));
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setTintList(C35835l0.e(R.attr.black, toolbar.getContext()));
        }
        toolbar.setNavigationOnClickListener(new ViewOnClickListenerC47428b(this, 0));
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(jVar);
    }
}
