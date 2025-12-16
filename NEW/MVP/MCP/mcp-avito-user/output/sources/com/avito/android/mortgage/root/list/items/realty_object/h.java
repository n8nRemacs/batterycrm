package com.avito.android.mortgage.root.list.items.realty_object;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.messenger.channels.mvi.view.ViewOnClickListenerC31873b;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RealtyObjectView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/realty_object/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/root/list/items/realty_object/g;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f202750b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f202751c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f202752d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Y41.a<G0> f202753e;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f202750b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.cost);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f202751c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.address);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f202752d = (TextView) viewFindViewById3;
        this.itemView.setOnClickListener(new ViewOnClickListenerC31873b(this, 22));
    }

    @Override // com.avito.android.mortgage.root.list.items.realty_object.g
    public final void B0(@l String str) {
        I5.a(this.f202752d, str, false);
    }

    @Override // com.avito.android.mortgage.root.list.items.realty_object.g
    public final void EC(boolean z12) {
        this.itemView.setClickable(z12);
        TextView textView = this.f202751c;
        if (z12) {
            FV.a.f4720a.f(textView, R.attr.textIconChevronRight, y6.b(4));
        } else {
            FV.a.f4720a.getClass();
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
    }

    @Override // com.avito.android.mortgage.root.list.items.realty_object.g
    public final void IY(@k String str) {
        this.f202751c.setText(str);
    }

    @Override // com.avito.android.mortgage.root.list.items.realty_object.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f202753e = aVar;
    }

    @Override // com.avito.android.mortgage.root.list.items.realty_object.g
    public final void setTitle(@k String str) {
        this.f202750b.setText(str);
    }
}
