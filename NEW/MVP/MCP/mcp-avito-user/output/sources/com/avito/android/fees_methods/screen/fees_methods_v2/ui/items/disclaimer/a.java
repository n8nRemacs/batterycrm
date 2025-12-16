package com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.disclaimer;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: FeesMethodsV2DisclaimerItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/ui/items/disclaimer/a;", "Lcom/avito/conveyor_item/a;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f158343b;

    public a(@k AttributedText attributedText) {
        this.f158343b = attributedText;
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
        return this.f158343b.equals(aVar.f158343b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269899b() {
        return 1842924639;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF156504b() {
        return "fees_methods_v2_disclaimer";
    }

    public final int hashCode() {
        return this.f158343b.hashCode() + 1296088961;
    }

    @k
    public final String toString() {
        return com.avito.android.actions_sheet.a.w(new StringBuilder("FeesMethodsV2DisclaimerItem(stringId=fees_methods_v2_disclaimer, text="), this.f158343b, ')');
    }
}
