package com.avito.android.comfortable_deal.select_agent;

import Y41.l;
import Y61.k;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import com.avito.konveyor.adapter.j;
import dq.InterfaceC39778a;
import dq.d;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectAgentDialogView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/select_agent/d;", "Lcom/avito/android/comfortable_deal/select_agent/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final j f122674a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f122675b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<InterfaceC39778a, G0> f122676c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public View f122677d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public View f122678e;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k j jVar, @k com.avito.konveyor.adapter.a aVar, @k l<? super InterfaceC39778a, G0> lVar) {
        this.f122674a = jVar;
        this.f122675b = aVar;
        this.f122676c = lVar;
    }

    public static void d(d dVar, int i12) {
        boolean z12 = (i12 & 1) == 0;
        boolean z13 = (i12 & 2) == 0;
        boolean z14 = (i12 & 4) == 0;
        boolean z15 = (i12 & 8) == 0;
        View view = dVar.f122677d;
        if (view != null) {
            View viewFindViewById = view.findViewById(R.id.select_agent_content);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            D6.G((ViewGroup) viewFindViewById, z12);
            View viewFindViewById2 = view.findViewById(R.id.select_agent_error);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            D6.G((ViewGroup) viewFindViewById2, z13);
            View viewFindViewById3 = view.findViewById(R.id.select_agent_placeholders);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            D6.G((ViewGroup) viewFindViewById3, z14);
            View viewFindViewById4 = view.findViewById(R.id.select_agent_empty);
            if (viewFindViewById4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            D6.G((ViewGroup) viewFindViewById4, z15);
        }
    }

    public static void e(d dVar, int i12) {
        boolean z12 = (i12 & 1) == 0;
        boolean z13 = (i12 & 2) == 0;
        boolean z14 = (i12 & 4) == 0;
        View view = dVar.f122678e;
        if (view != null) {
            View viewFindViewById = view.findViewById(R.id.remove_agent_button);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            D6.w((Button) viewFindViewById);
            View viewFindViewById2 = view.findViewById(R.id.select_agent_button);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            D6.G((Button) viewFindViewById2, z12);
            View viewFindViewById3 = view.findViewById(R.id.ok_agent_button);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            D6.G((Button) viewFindViewById3, z13);
            View viewFindViewById4 = view.findViewById(R.id.refresh_button);
            if (viewFindViewById4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            D6.G((Button) viewFindViewById4, z14);
        }
    }

    @Override // com.avito.android.comfortable_deal.select_agent.b
    public final void a(@k View view) {
        this.f122677d = view;
        View viewFindViewById = view.findViewById(R.id.agents_recycler);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        j jVar = this.f122674a;
        jVar.setHasStableIds(true);
        recyclerView.setAdapter(jVar);
        recyclerView.setHasFixedSize(true);
    }

    @Override // com.avito.android.comfortable_deal.select_agent.b
    public final void b(@k View view) {
        this.f122678e = view;
        View viewFindViewById = view.findViewById(R.id.remove_agent_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        final int i12 = 0;
        ((Button) viewFindViewById).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.comfortable_deal.select_agent.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f122673c;

            {
                this.f122673c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f122673c.f122676c.invoke(InterfaceC39778a.b.f394074a);
                        break;
                    case 1:
                        this.f122673c.f122676c.invoke(InterfaceC39778a.e.f394077a);
                        break;
                    case 2:
                        this.f122673c.f122676c.invoke(InterfaceC39778a.c.f394075a);
                        break;
                    default:
                        this.f122673c.f122676c.invoke(InterfaceC39778a.d.f394076a);
                        break;
                }
            }
        });
        View viewFindViewById2 = view.findViewById(R.id.select_agent_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        final int i13 = 1;
        ((Button) viewFindViewById2).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.comfortable_deal.select_agent.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f122673c;

            {
                this.f122673c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f122673c.f122676c.invoke(InterfaceC39778a.b.f394074a);
                        break;
                    case 1:
                        this.f122673c.f122676c.invoke(InterfaceC39778a.e.f394077a);
                        break;
                    case 2:
                        this.f122673c.f122676c.invoke(InterfaceC39778a.c.f394075a);
                        break;
                    default:
                        this.f122673c.f122676c.invoke(InterfaceC39778a.d.f394076a);
                        break;
                }
            }
        });
        View viewFindViewById3 = view.findViewById(R.id.ok_agent_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        final int i14 = 2;
        ((Button) viewFindViewById3).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.comfortable_deal.select_agent.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f122673c;

            {
                this.f122673c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        this.f122673c.f122676c.invoke(InterfaceC39778a.b.f394074a);
                        break;
                    case 1:
                        this.f122673c.f122676c.invoke(InterfaceC39778a.e.f394077a);
                        break;
                    case 2:
                        this.f122673c.f122676c.invoke(InterfaceC39778a.c.f394075a);
                        break;
                    default:
                        this.f122673c.f122676c.invoke(InterfaceC39778a.d.f394076a);
                        break;
                }
            }
        });
        View viewFindViewById4 = view.findViewById(R.id.refresh_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        final int i15 = 3;
        ((Button) viewFindViewById4).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.comfortable_deal.select_agent.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f122673c;

            {
                this.f122673c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        this.f122673c.f122676c.invoke(InterfaceC39778a.b.f394074a);
                        break;
                    case 1:
                        this.f122673c.f122676c.invoke(InterfaceC39778a.e.f394077a);
                        break;
                    case 2:
                        this.f122673c.f122676c.invoke(InterfaceC39778a.c.f394075a);
                        break;
                    default:
                        this.f122673c.f122676c.invoke(InterfaceC39778a.d.f394076a);
                        break;
                }
            }
        });
    }

    @Override // com.avito.android.comfortable_deal.select_agent.b
    @SuppressLint({"NotifyDataSetChanged"})
    public final void c(@k dq.d dVar) {
        if (dVar.equals(d.a.f394089a)) {
            e(this, 3);
            d(this, 13);
            return;
        }
        if (!(dVar instanceof d.b)) {
            if (dVar.equals(d.c.f394093a)) {
                e(this, 5);
                d(this, 7);
                return;
            } else {
                if (dVar.equals(d.C11037d.f394094a)) {
                    e(this, 7);
                    d(this, 11);
                    return;
                }
                return;
            }
        }
        e(this, 6);
        d(this, 14);
        d.b bVar = (d.b) dVar;
        this.f122675b.c(new UV0.c(bVar.f394090a));
        this.f122674a.notifyDataSetChanged();
        View view = this.f122678e;
        if (view != null) {
            View viewFindViewById = view.findViewById(R.id.select_agent_button);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            Button button = (Button) viewFindViewById;
            button.setLoading(bVar.f394091b);
            button.setEnabled(bVar.f394092c);
        }
    }
}
