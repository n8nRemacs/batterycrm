package com.avito.android.mortgage.root.list.items.borrower_title;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BorrowerTitleView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/borrower_title/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/root/list/items/borrower_title/g;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f202487f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f202488b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f202489c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageView f202490d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public com.avito.android.cpt.pre_activation.ui.c f202491e;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f202488b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById2;
        this.f202489c = textView;
        View viewFindViewById3 = view.findViewById(R.id.edit);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f202490d = (ImageView) viewFindViewById3;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.mortgage.root.list.items.borrower_title.g
    public final void Dv(@k com.avito.android.cpt.pre_activation.ui.c cVar) {
        this.f202491e = cVar;
    }

    @Override // com.avito.android.mortgage.root.list.items.borrower_title.g
    public final void O0(@k String str, @l String str2) {
        TextView textView = this.f202488b;
        textView.setText(str);
        Context context = textView.getContext();
        if (str2 == null) {
            str2 = "h40";
        }
        textView.setTextAppearance(com.avito.android.lib.util.f.r(context, str2));
    }

    @Override // com.avito.android.mortgage.root.list.items.borrower_title.g
    public final void R(@l AttributedText attributedText) {
        j.a(this.f202489c, attributedText, null);
        if (attributedText == null) {
            return;
        }
        attributedText.setOnDeepLinkClickListener(this.f202491e);
    }

    @Override // com.avito.android.mortgage.root.list.items.borrower_title.g
    public final void o50(boolean z12) {
        this.f202490d.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.mortgage.root.list.items.borrower_title.g
    public final void setEnabled(boolean z12) {
        if (z12) {
            this.itemView.setEnabled(true);
            this.itemView.setAlpha(1.0f);
        } else {
            this.itemView.setAlpha(0.4f);
            this.itemView.setEnabled(false);
        }
    }

    @Override // com.avito.android.mortgage.root.list.items.borrower_title.g
    public final void vB(@k Y41.a<G0> aVar) {
        this.f202490d.setOnClickListener(new com.avito.android.mortgage.applicant_type.a(28, aVar));
    }
}
