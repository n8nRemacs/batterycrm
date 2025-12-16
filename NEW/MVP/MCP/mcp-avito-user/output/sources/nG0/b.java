package nG0;

import Y61.k;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bj.AbstractC25658a;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.bxcontent.mvi.entity.f;
import dj.InterfaceC39736a;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalMapBeduinFormView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LnG0/b;", "LnG0/a;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements InterfaceC44251a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f414967a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC25659b f414968b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC39736a f414969c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AbstractC25658a<? extends RecyclerView.C> f414970d;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k View view, @k InterfaceC25659b interfaceC25659b, @k InterfaceC39736a interfaceC39736a) {
        this.f414967a = view;
        this.f414968b = interfaceC25659b;
        this.f414969c = interfaceC39736a;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.universal_map_beduin_form_top_list);
        com.avito.android.beduin.common.component.adapter.a aVarI = f.i(24, interfaceC25659b);
        this.f414970d = aVarI;
        for (Q q12 : Collections.singletonList(new Q(recyclerView, aVarI))) {
            RecyclerView recyclerView2 = (RecyclerView) q12.f406619b;
            AbstractC25658a abstractC25658a = (AbstractC25658a) q12.f406620c;
            abstractC25658a.o(this.f414969c);
            this.f414967a.getContext();
            recyclerView2.setLayoutManager(new LinearLayoutManager());
            recyclerView2.setAdapter(abstractC25658a);
        }
    }
}
