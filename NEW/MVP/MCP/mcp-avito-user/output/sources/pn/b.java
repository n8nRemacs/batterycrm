package PN;

import Au.ViewOnClickListenerC13080b;
import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.search.MapEntryAction;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MapBottomEntryPointView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPN/b;", "LPN/a;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f13055a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f13056b;

    public b(@k View view) {
        View viewFindViewById = view.findViewById(R.id.map_bottom_entry_point_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f13055a = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.map_bottom_entry_point_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f13056b = (Button) viewFindViewById2;
    }

    @Override // PN.a
    public final void a(@l MapEntryAction mapEntryAction, @k Y41.l<? super DeepLink, G0> lVar) {
        String iconName;
        Integer numA;
        boolean z12 = mapEntryAction == null;
        this.f13055a.setVisibility(!z12 ? 0 : 8);
        Button button = this.f13056b;
        if (z12) {
            button.setOnClickListener(null);
            return;
        }
        Drawable drawableH = (mapEntryAction == null || (iconName = mapEntryAction.getIconName()) == null || (numA = q.a(iconName)) == null) ? null : C35835l0.h(numA.intValue(), button.getContext());
        button.setOnClickListener(new ViewOnClickListenerC13080b(15, mapEntryAction, lVar));
        com.avito.android.lib.design.button.b.a(button, mapEntryAction != null ? mapEntryAction.getText() : null, false);
        Button.g(this.f13056b, drawableH, null, false, null, 14);
    }
}
