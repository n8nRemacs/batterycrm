package com.avito.android.mortgage.person_form.list.items.action_banner;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.messenger.channels.mvi.view.ViewOnClickListenerC31873b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ActionBannerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/action_banner/g;", "LC00/a;", "Lcom/avito/android/mortgage/person_form/list/items/action_banner/f;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends C00.a implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f200577b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f200578c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f200579d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Y41.a<G0> f200580e;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f200577b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f200578c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.action);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById3;
        this.f200579d = button;
        button.setOnClickListener(new ViewOnClickListenerC31873b(this, 17));
    }

    @Override // com.avito.android.mortgage.person_form.list.items.action_banner.f
    public final void U(@k Y41.a<G0> aVar) {
        this.f200580e = aVar;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.action_banner.f
    public final void h(@k String str) {
        this.f200578c.setText(str);
    }

    @Override // com.avito.android.mortgage.person_form.list.items.action_banner.f
    public final void oa(@l String str) {
        com.avito.android.lib.design.button.b.a(this.f200579d, str, false);
    }

    @Override // com.avito.android.mortgage.person_form.list.items.action_banner.f
    public final void setTitle(@k String str) {
        this.f200577b.setText(str);
    }
}
