package com.avito.android.success.konveyor.service;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuccessServiceItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/success/konveyor/service/c;", "Lcom/avito/conveyor_item/a;", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f291650b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f291651c;

    public c(@k String str, @k AttributedText attributedText) {
        this.f291650b = str;
        this.f291651c = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f291650b, cVar.f291650b) && L.f(this.f291651c, cVar.f291651c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78563b() {
        return getF246539b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF246539b() {
        return this.f291650b;
    }

    public final int hashCode() {
        return this.f291651c.hashCode() + (this.f291650b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuccessServiceItem(stringId=");
        sb2.append(this.f291650b);
        sb2.append(", text=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f291651c, ')');
    }
}
