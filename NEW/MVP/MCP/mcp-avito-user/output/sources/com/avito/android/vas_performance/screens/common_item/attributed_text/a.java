package com.avito.android.vas_performance.screens.common_item.attributed_text;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: AttributedTextItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/common_item/attributed_text/a;", "Lcom/avito/conveyor_item/a;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f320390b;

    public a(@k AttributedText attributedText) {
        this.f320390b = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return this.f320390b.equals(aVar.f320390b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF250003b() {
        return -409258500;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF310347b() {
        return "stickers_vas_description";
    }

    public final int hashCode() {
        return this.f320390b.hashCode() + 197888388;
    }

    @k
    public final String toString() {
        return com.avito.android.actions_sheet.a.w(new StringBuilder("AttributedTextItem(stringId=stickers_vas_description, attrText="), this.f320390b, ')');
    }
}
