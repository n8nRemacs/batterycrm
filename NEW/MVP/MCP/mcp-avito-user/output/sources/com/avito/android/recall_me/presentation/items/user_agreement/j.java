package com.avito.android.recall_me.presentation.items.user_agreement;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: RecallMeAgreementView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/recall_me/presentation/items/user_agreement/j;", "Lcom/avito/android/recall_me/presentation/items/user_agreement/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f252005b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f252006c;

    public j(@k View view) {
        super(view);
        this.f252005b = view;
        this.f252006c = (TextView) view;
    }

    @Override // com.avito.android.recall_me.presentation.items.user_agreement.i
    @k
    public final Context getContext() {
        return this.f252005b.getContext();
    }

    @Override // com.avito.android.recall_me.presentation.items.user_agreement.i
    public final void m6(@l CharSequence charSequence) {
        TextView textView = this.f252006c;
        I5.a(textView, charSequence, false);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
