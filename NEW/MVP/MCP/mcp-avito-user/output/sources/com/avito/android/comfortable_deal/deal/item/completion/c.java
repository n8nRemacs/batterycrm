package com.avito.android.comfortable_deal.deal.item.completion;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CompletionItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/completion/c;", "Lcom/avito/conveyor_item/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Image f121346b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f121347c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f121348d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AttributedText f121349e;

    public c(@k Image image, @k AttributedText attributedText, @k AttributedText attributedText2, @k String str) {
        this.f121346b = image;
        this.f121347c = str;
        this.f121348d = attributedText;
        this.f121349e = attributedText2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return L.f(this.f121346b, cVar.f121346b) && L.f(this.f121347c, cVar.f121347c) && L.f(this.f121348d, cVar.f121348d) && L.f(this.f121349e, cVar.f121349e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF75423l() {
        return 516969411;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF75424m() {
        return "deal_completion_item";
    }

    public final int hashCode() {
        return this.f121349e.hashCode() + com.avito.android.actions_sheet.a.b(H.d(com.avito.android.actions_sheet.a.g(this.f121346b, -1153817443, 31), 31, this.f121347c), 31, this.f121348d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CompletionItem(stringId=deal_completion_item, image=");
        sb2.append(this.f121346b);
        sb2.append(", backgroundGradient=");
        sb2.append(this.f121347c);
        sb2.append(", title=");
        sb2.append(this.f121348d);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f121349e, ')');
    }
}
