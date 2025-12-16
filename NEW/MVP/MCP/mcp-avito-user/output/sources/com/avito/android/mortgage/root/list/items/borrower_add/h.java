package com.avito.android.mortgage.root.list.items.borrower_add;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BorrowerAddView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/borrower_add/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/root/list/items/borrower_add/g;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f202468e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f202469b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f202470c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f202471d;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f202469b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f202470c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.add);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f202471d = (Button) viewFindViewById3;
    }

    @Override // com.avito.android.mortgage.root.list.items.borrower_add.g
    public final void h(@k String str) {
        this.f202470c.setText(str);
    }

    @Override // com.avito.android.mortgage.root.list.items.borrower_add.g
    public final void h7(@k Y41.a<G0> aVar) {
        this.f202471d.setOnClickListener(new com.avito.android.mortgage.applicant_type.a(27, aVar));
    }

    @Override // com.avito.android.mortgage.root.list.items.borrower_add.g
    public final void setEnabled(boolean z12) {
        this.f202471d.setEnabled(z12);
        TextView textView = this.f202470c;
        TextView textView2 = this.f202469b;
        if (z12) {
            textView2.setAlpha(1.0f);
            textView.setAlpha(1.0f);
        } else {
            textView2.setAlpha(0.4f);
            textView.setAlpha(0.4f);
        }
    }

    @Override // com.avito.android.mortgage.root.list.items.borrower_add.g
    public final void setLoading(boolean z12) {
        this.f202471d.setLoading(z12);
    }

    @Override // com.avito.android.mortgage.root.list.items.borrower_add.g
    public final void setTitle(@k String str) {
        this.f202469b.setText(str);
    }
}
