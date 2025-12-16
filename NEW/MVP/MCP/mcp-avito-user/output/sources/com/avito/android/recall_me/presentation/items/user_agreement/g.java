package com.avito.android.recall_me.presentation.items.user_agreement;

import Y61.k;
import android.text.SpannableString;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;
import zi0.InterfaceC50571a;

/* compiled from: RecallMeAgreementPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/recall_me/presentation/items/user_agreement/g;", "LTV0/d;", "Lcom/avito/android/recall_me/presentation/items/user_agreement/i;", "Lcom/avito/android/recall_me/presentation/items/user_agreement/RecallMeAgreementItem;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements TV0.d<i, RecallMeAgreementItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<InterfaceC50571a> f251999b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final d f252000c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f252001d;

    @Inject
    public g(@k com.jakewharton.rxrelay3.c<InterfaceC50571a> cVar, @k d dVar, @k com.avito.android.util.text.a aVar) {
        this.f251999b = cVar;
        this.f252000c = dVar;
        this.f252001d = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        CharSequence charSequenceC;
        i iVar = (i) eVar;
        RecallMeAgreementItem recallMeAgreementItem = (RecallMeAgreementItem) aVar;
        AttributedText attributedText = recallMeAgreementItem.f251990f;
        if (attributedText == null) {
            f fVar = new f(this, recallMeAgreementItem);
            this.f252000c.getClass();
            String str = recallMeAgreementItem.f251987c;
            String str2 = recallMeAgreementItem.f251988d;
            int I12 = C43066x.I(str, str2, 0, false, 6);
            int length = str2.length() + I12;
            c cVar = new c(fVar);
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(cVar, I12, length, 33);
            charSequenceC = spannableString;
        } else {
            charSequenceC = this.f252001d.c(iVar.getContext(), attributedText);
        }
        iVar.m6(charSequenceC);
    }
}
