package com.avito.android.str_insurance.items.title;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.text.AttributedText;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrInsuranceTitleItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_insurance/items/title/e;", "Lcom/avito/conveyor_item/a;", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class e implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f288604b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f288605c;

    /* renamed from: d, reason: collision with root package name */
    public final int f288606d;

    public e(@InterfaceC42150f int i12, @k AttributedText attributedText, @k String str) {
        this.f288604b = str;
        this.f288605c = attributedText;
        this.f288606d = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f288604b, eVar.f288604b) && L.f(this.f288605c, eVar.f288605c) && this.f288606d == eVar.f288606d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79636b() {
        return getF138457b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF138457b() {
        return this.f288604b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f288606d) + com.avito.android.actions_sheet.a.b(this.f288604b.hashCode() * 31, 31, this.f288605c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrInsuranceTitleItem(stringId=");
        sb2.append(this.f288604b);
        sb2.append(", title=");
        sb2.append(this.f288605c);
        sb2.append(", backgroundColor=");
        return r.t(sb2, this.f288606d, ')');
    }
}
