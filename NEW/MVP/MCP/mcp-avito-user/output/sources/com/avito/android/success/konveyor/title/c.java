package com.avito.android.success.konveyor.title;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuccessTitleItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/success/konveyor/title/c;", "Lcom/avito/conveyor_item/a;", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f291661b;

    public c(@k AttributedText attributedText) {
        this.f291661b = attributedText;
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
        return L.f(this.f291661b, cVar.f291661b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78563b() {
        return -1259340892;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF246539b() {
        return "success_title_item_id";
    }

    public final int hashCode() {
        return this.f291661b.hashCode() - 384861988;
    }

    @k
    public final String toString() {
        return com.avito.android.actions_sheet.a.w(new StringBuilder("SuccessTitleItem(stringId=success_title_item_id, title="), this.f291661b, ')');
    }
}
