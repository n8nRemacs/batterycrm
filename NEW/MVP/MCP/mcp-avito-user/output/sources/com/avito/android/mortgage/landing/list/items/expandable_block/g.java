package com.avito.android.mortgage.landing.list.items.expandable_block;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.messenger.channels.mvi.view.ViewOnClickListenerC31873b;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExpandableBlockView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/expandable_block/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/landing/list/items/expandable_block/f;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f199708b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f199709c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageView f199710d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final View f199711e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Y41.a<G0> f199712f;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.expandable_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f199708b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.expandable_section);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f199709c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.expandable_arrow);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f199710d = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.expandable_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.separator);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f199711e = viewFindViewById5;
        linearLayout.setOnClickListener(new ViewOnClickListenerC31873b(this, 14));
    }

    @Override // com.avito.android.mortgage.landing.list.items.expandable_block.f
    public final void YR(boolean z12) {
        this.f199711e.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.mortgage.landing.list.items.expandable_block.f
    public final void b(@k String str) {
        this.f199708b.setText(str);
    }

    @Override // com.avito.android.mortgage.landing.list.items.expandable_block.f
    public final void dy(@k Y41.a<G0> aVar) {
        this.f199712f = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f199712f = null;
    }

    @Override // com.avito.android.mortgage.landing.list.items.expandable_block.f
    public final void pX(boolean z12) {
        this.f199710d.setRotation(z12 ? -90.0f : 90.0f);
        D6.G(this.f199709c, z12);
    }

    @Override // com.avito.android.mortgage.landing.list.items.expandable_block.f
    public final void q(@k AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f199709c, attributedText, null);
    }

    @Override // com.avito.android.mortgage.landing.list.items.expandable_block.f
    public final void zd(boolean z12) {
        this.f199710d.animate().rotation(z12 ? -90.0f : 90.0f).setDuration(150L).withEndAction(new D.b(10, this, z12)).start();
    }
}
