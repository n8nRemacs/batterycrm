package com.avito.android.mortgage.root.list.items.borrower_action;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.C;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35821j2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: BorrowerActionView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/borrower_action/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/root/list/items/borrower_action/h;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f202451f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ImageView f202452b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ImageView f202453c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f202454d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f202455e;

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.icon);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f202452b = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.icon_badge);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f202453c = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f202454d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.subtitle);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f202455e = (TextView) viewFindViewById4;
    }

    @Override // com.avito.android.mortgage.root.list.items.borrower_action.h
    public final void Z(@k String str) {
        Integer numA = q.a(str);
        ImageView imageView = this.f202452b;
        C35821j2.a(imageView, numA != null ? C35835l0.h(numA.intValue(), imageView.getContext()) : null);
    }

    @Override // com.avito.android.mortgage.root.list.items.borrower_action.h
    public final void a(@k Y41.a<G0> aVar) {
        this.itemView.setOnClickListener(new C(13, aVar));
    }

    @Override // com.avito.android.mortgage.root.list.items.borrower_action.h
    public final void ho(@l String str) {
        C48063a c48063a = C48063a.f437606a;
        ImageView imageView = this.f202453c;
        Context context = imageView.getContext();
        c48063a.getClass();
        Integer numC = C48063a.c(context, str, null, null, false);
        if (numC == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setColorFilter(numC.intValue(), PorterDuff.Mode.ADD);
            imageView.setVisibility(0);
        }
    }

    @Override // com.avito.android.mortgage.root.list.items.borrower_action.h
    public final void k(@l AttributedText attributedText) {
        j.a(this.f202455e, attributedText, null);
    }

    @Override // com.avito.android.mortgage.root.list.items.borrower_action.h
    public final void setEnabled(boolean z12) {
        if (z12) {
            this.itemView.setEnabled(true);
            this.itemView.setAlpha(1.0f);
        } else {
            this.itemView.setAlpha(0.4f);
            this.itemView.setEnabled(false);
        }
    }

    @Override // com.avito.android.mortgage.root.list.items.borrower_action.h
    public final void setTitle(@k String str) {
        this.f202454d.setText(str);
    }
}
