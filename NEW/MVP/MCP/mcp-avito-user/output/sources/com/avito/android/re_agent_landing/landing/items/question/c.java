package com.avito.android.re_agent_landing.landing.items.question;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: QuestionItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/items/question/c;", "Lcom/avito/conveyor_item/a;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f250782b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f250783c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f250784d;

    public c(String str, String str2, AttributedText attributedText, int i12, C42822w c42822w) {
        this.f250782b = (i12 & 1) != 0 ? "question_item" : str;
        this.f250783c = str2;
        this.f250784d = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f250782b, cVar.f250782b) && L.f(this.f250783c, cVar.f250783c) && L.f(this.f250784d, cVar.f250784d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222258b() {
        return getF250782b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF250782b() {
        return this.f250782b;
    }

    public final int hashCode() {
        return this.f250784d.hashCode() + H.d(this.f250782b.hashCode() * 31, 31, this.f250783c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QuestionItem(stringId=");
        sb2.append(this.f250782b);
        sb2.append(", question=");
        sb2.append(this.f250783c);
        sb2.append(", answer=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f250784d, ')');
    }
}
