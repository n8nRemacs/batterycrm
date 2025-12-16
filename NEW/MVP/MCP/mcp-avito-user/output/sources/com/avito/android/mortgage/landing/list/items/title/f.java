package com.avito.android.mortgage.landing.list.items.title;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TitleView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/title/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/landing/list/items/title/e;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f200026b;

    public f(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.text_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f200026b = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.mortgage.landing.list.items.title.e
    public final void U0(int i12) {
        this.f200026b.setText(i12);
    }

    @Override // com.avito.android.mortgage.landing.list.items.title.e
    public final void setAppearance(int i12) {
        TextView textView = this.f200026b;
        textView.setTextAppearance(C35835l0.j(i12, textView.getContext()));
    }
}
