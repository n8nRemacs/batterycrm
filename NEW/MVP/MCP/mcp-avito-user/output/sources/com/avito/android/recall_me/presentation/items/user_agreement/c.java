package com.avito.android.recall_me.presentation.items.user_agreement;

import Y61.k;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: RecallMeAgreementFormatter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recall_me/presentation/items/user_agreement/c;", "Landroid/text/style/ClickableSpan;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c extends ClickableSpan {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f251995b;

    public c(Y41.a<G0> aVar) {
        this.f251995b = aVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(@k View view) {
        this.f251995b.invoke();
    }
}
