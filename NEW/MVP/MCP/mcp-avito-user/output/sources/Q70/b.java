package Q70;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bj.AbstractC25658a;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.beduin_shared.model.utils.l;
import com.avito.android.bxcontent.mvi.entity.f;
import dj.InterfaceC39736a;
import gj.InterfaceC40691b;
import io.reactivex.rxjava3.disposables.c;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import lj.InterfaceC43779a;

/* compiled from: BeduinTeaserView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ70/b;", "LQ70/a;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f13529a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC40691b f13530b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC25659b f13531c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC39736a f13532d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC43779a f13533e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final c f13534f = new c();

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC43779a f13535g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC43779a f13536h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC43779a f13537i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final RecyclerView f13538j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final RecyclerView f13539k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final RecyclerView f13540l;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k View view, @k InterfaceC25659b interfaceC25659b, @k InterfaceC39736a interfaceC39736a, @k InterfaceC40691b interfaceC40691b) {
        this.f13529a = view;
        this.f13530b = interfaceC40691b;
        this.f13531c = interfaceC25659b;
        this.f13532d = interfaceC39736a;
        this.f13533e = interfaceC40691b.j();
        this.f13535g = interfaceC40691b.j();
        this.f13536h = interfaceC40691b.j();
        this.f13537i = interfaceC40691b.j();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.beduin_top_components);
        this.f13538j = recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.beduin_main_components);
        this.f13539k = recyclerView2;
        RecyclerView recyclerView3 = (RecyclerView) view.findViewById(R.id.beduin_bottom_components);
        this.f13540l = recyclerView3;
        com.avito.android.beduin.common.component.adapter.a aVarI = f.i(24, interfaceC25659b);
        com.avito.android.beduin.common.component.adapter.a aVarI2 = f.i(24, interfaceC25659b);
        com.avito.android.beduin.common.component.adapter.a aVarI3 = f.i(24, interfaceC25659b);
        for (Q q12 : C42745f0.U(new Q(recyclerView, aVarI), new Q(recyclerView2, aVarI2), new Q(recyclerView3, aVarI3))) {
            RecyclerView recyclerView4 = (RecyclerView) q12.f406619b;
            AbstractC25658a abstractC25658a = (AbstractC25658a) q12.f406620c;
            abstractC25658a.o(this.f13532d);
            this.f13529a.getContext();
            recyclerView4.setLayoutManager(new LinearLayoutManager());
            recyclerView4.setAdapter(abstractC25658a);
        }
        l.b(C42745f0.U(new Q(this.f13535g.getF103348p(), aVarI), new Q(this.f13536h.getF103348p(), aVarI2), new Q(this.f13537i.getF103348p(), aVarI3)), this.f13534f);
    }
}
