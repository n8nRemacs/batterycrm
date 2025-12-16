package com.avito.android.tariff.cpa.info.ui.items.level_info;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LevelInfoItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/info/ui/items/level_info/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f294909b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f294910c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f294911d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ButtonAction f294912e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f294913f;

    public a(@k String str, @k String str2, @l AttributedText attributedText, @l ButtonAction buttonAction, boolean z12) {
        this.f294909b = str;
        this.f294910c = str2;
        this.f294911d = attributedText;
        this.f294912e = buttonAction;
        this.f294913f = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f294909b, aVar.f294909b) && L.f(this.f294910c, aVar.f294910c) && L.f(this.f294911d, aVar.f294911d) && L.f(this.f294912e, aVar.f294912e) && this.f294913f == aVar.f294913f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80616b() {
        return getF290818b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF290818b() {
        return this.f294909b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f294909b.hashCode() * 31, 31, this.f294910c);
        AttributedText attributedText = this.f294911d;
        int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        ButtonAction buttonAction = this.f294912e;
        return Boolean.hashCode(this.f294913f) + ((iHashCode + (buttonAction != null ? buttonAction.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LevelInfoItem(stringId=");
        sb2.append(this.f294909b);
        sb2.append(", title=");
        sb2.append(this.f294910c);
        sb2.append(", description=");
        sb2.append(this.f294911d);
        sb2.append(", button=");
        sb2.append(this.f294912e);
        sb2.append(", isProgress=");
        return r.x(sb2, this.f294913f, ')');
    }
}
