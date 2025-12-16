package com.avito.android.comfortable_deal.deal.item.responsibleagent.no_agent;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AddAgentBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/responsibleagent/no_agent/a;", "LTV0/b;", "Lcom/avito/android/comfortable_deal/deal/item/responsibleagent/no_agent/f;", "LAp/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements TV0.b<f, Ap.b> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f121466a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f121467b = new g.a<>(R.layout.deal_item_addagent, C3589a.f121468l);

    /* compiled from: AddAgentBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/comfortable_deal/deal/item/responsibleagent/no_agent/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/comfortable_deal/deal/item/responsibleagent/no_agent/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.comfortable_deal.deal.item.responsibleagent.no_agent.a$a, reason: collision with other inner class name */
    public static final class C3589a extends N implements p<ViewGroup, View, h> {

        /* renamed from: l, reason: collision with root package name */
        public static final C3589a f121468l = new C3589a();

        public C3589a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            final h hVar = new h(view2);
            Button button = (Button) view2.findViewById(R.id.add_button);
            LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.add_agent_container);
            final int i12 = 0;
            button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.comfortable_deal.deal.item.responsibleagent.no_agent.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i12) {
                        case 0:
                            Y41.a<G0> aVar = hVar.f121475b;
                            if (aVar != null) {
                                aVar.invoke();
                                break;
                            }
                            break;
                        default:
                            Y41.a<G0> aVar2 = hVar.f121475b;
                            if (aVar2 != null) {
                                aVar2.invoke();
                                break;
                            }
                            break;
                    }
                }
            });
            final int i13 = 1;
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.comfortable_deal.deal.item.responsibleagent.no_agent.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i13) {
                        case 0:
                            Y41.a<G0> aVar = hVar.f121475b;
                            if (aVar != null) {
                                aVar.invoke();
                                break;
                            }
                            break;
                        default:
                            Y41.a<G0> aVar2 = hVar.f121475b;
                            if (aVar2 != null) {
                                aVar2.invoke();
                                break;
                            }
                            break;
                    }
                }
            });
            return hVar;
        }
    }

    @Inject
    public a(@k d dVar) {
        this.f121466a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f121466a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f121467b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof Ap.b) && ((Ap.b) aVar).f629b == null;
    }
}
