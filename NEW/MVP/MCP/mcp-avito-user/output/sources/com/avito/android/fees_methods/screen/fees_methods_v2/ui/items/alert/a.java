package com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.alert;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import j.InterfaceC42150f;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FeesMethodsV2AlertItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/ui/items/alert/a;", "Lcom/avito/conveyor_item/a;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f158308b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f158309c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f158310d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ArrayList f158311e;

    public a(@InterfaceC42150f int i12, @k String str, @k AttributedText attributedText, @l ArrayList arrayList) {
        this.f158308b = i12;
        this.f158309c = str;
        this.f158310d = attributedText;
        this.f158311e = arrayList;
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
        return this.f158308b == aVar.f158308b && L.f(this.f158309c, aVar.f158309c) && L.f(this.f158310d, aVar.f158310d) && L.f(this.f158311e, aVar.f158311e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85355b() {
        return -1524365288;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF156645b() {
        return "fees_methods_v2_alert";
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(H.d(r.e(this.f158308b, -10683672, 31), 31, this.f158309c), 31, this.f158310d);
        ArrayList arrayList = this.f158311e;
        return iB2 + (arrayList == null ? 0 : arrayList.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeesMethodsV2AlertItem(stringId=fees_methods_v2_alert, styleAttr=");
        sb2.append(this.f158308b);
        sb2.append(", title=");
        sb2.append(this.f158309c);
        sb2.append(", description=");
        sb2.append(this.f158310d);
        sb2.append(", actions=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f158311e, ')');
    }
}
