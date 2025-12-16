package com.avito.android.mortgage.person_form.list.items.child;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.messenger.channels.mvi.view.ViewOnClickListenerC31873b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChildView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/child/j;", "LC00/a;", "Lcom/avito/android/mortgage/person_form/list/items/child/i;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j extends C00.a implements i {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.mortgage.person_form.list.items.input.h f200631b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.mortgage.person_form.list.items.checkbox.g f200632c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f200633d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Y41.a<G0> f200634e;

    public j(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f200631b = new com.avito.android.mortgage.person_form.list.items.input.h(viewFindViewById);
        View viewFindViewById2 = view.findViewById(R.id.checkbox);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f200632c = new com.avito.android.mortgage.person_form.list.items.checkbox.g(viewFindViewById2);
        View viewFindViewById3 = view.findViewById(R.id.title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f200633d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.delete_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        ((ImageButton) viewFindViewById4).setOnClickListener(new ViewOnClickListenerC31873b(this, 18));
    }

    @Override // com.avito.android.mortgage.person_form.list.items.child.i
    public final void L5(@k Y41.a<G0> aVar) {
        this.f200634e = aVar;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.child.i
    @k
    /* renamed from: Vh, reason: from getter */
    public final com.avito.android.mortgage.person_form.list.items.checkbox.g getF200632c() {
        return this.f200632c;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.child.i
    @k
    /* renamed from: aH, reason: from getter */
    public final com.avito.android.mortgage.person_form.list.items.input.h getF200631b() {
        return this.f200631b;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.child.i
    public final void setTitle(@k String str) {
        this.f200633d.setText(str);
    }
}
