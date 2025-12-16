package com.avito.android.blueprints.publish.region_route;

import JO.m;
import Y61.k;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.blueprint.date.interval.j;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.items.ItemWithState;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: RegionRouteView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprints/publish/region_route/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/blueprints/publish/region_route/g;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f106456h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f106457b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f106458c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ComponentContainer f106459d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LinearLayout f106460e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Button f106461f;

    /* renamed from: g, reason: collision with root package name */
    public final LayoutInflater f106462g;

    public h(@k View view) {
        super(view);
        this.f106457b = view;
        this.f106458c = (TextView) view.findViewById(R.id.publish_item_region_route_title);
        this.f106459d = (ComponentContainer) view.findViewById(R.id.publish_item_region_route_component_container);
        this.f106460e = (LinearLayout) view.findViewById(R.id.publish_item_region_route_selected_container);
        this.f106461f = (Button) view.findViewById(R.id.publish_item_region_route_button);
        this.f106462g = LayoutInflater.from(view.getContext());
    }

    @Override // com.avito.android.blueprints.publish.region_route.g
    public final void U50(@k ParameterElement.B b12, @k Y41.a<G0> aVar) {
        boolean z12 = false;
        I5.a(this.f106458c, b12.f117194e, false);
        LinearLayout linearLayout = this.f106460e;
        linearLayout.removeAllViews();
        List<m> list = b12.f117196g;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((m) obj).f8964e) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            View viewInflate = this.f106462g.inflate(R.layout.publish_item_region_route_selected_item, linearLayout, z12);
            ((ListItem) viewInflate.findViewById(R.id.region_route_item_text)).setState((kV.b) new kV.f(mVar.f8962c, null, null, null, null, false, false, null, null, 510, null));
            linearLayout.addView(viewInflate);
            z12 = false;
        }
        String string = b12.f117197h;
        View view = this.f106457b;
        if (string == null) {
            string = view.getContext().getString(R.string.placeholder_choose);
        }
        FV.a aVar2 = FV.a.f4720a;
        Context context = view.getContext();
        int iB2 = y6.b(4);
        aVar2.getClass();
        UU.a aVar3 = new UU.a(FV.a.i(string, context, R.attr.textIconEdit, iB2), null, b12.f117198i, false, false, null, null, null, null, false, 1018, null);
        Button button = this.f106461f;
        button.setState(aVar3);
        button.setOnClickListener(new j(17, aVar));
        ItemWithState.State state = b12.f117202m;
        boolean z13 = state instanceof ItemWithState.State.Error.ErrorWithMessage;
        ComponentContainer componentContainer = this.f106459d;
        if (z13) {
            ComponentContainer.n(componentContainer, ((ItemWithState.State.Error.ErrorWithMessage) state).f173897b, 2);
            return;
        }
        if (L.f(state, ItemWithState.State.Error.ErrorWithoutMessage.f173898b)) {
            ComponentContainer.n(componentContainer, null, 3);
        } else if (state instanceof ItemWithState.State.Normal) {
            componentContainer.q(componentContainer.f178848i);
        } else if (state instanceof ItemWithState.State.Warning) {
            ComponentContainer.s(componentContainer, null, 3);
        }
    }
}
