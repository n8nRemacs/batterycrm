package com.avito.android.publish.slots.link.item;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.link.LinkSlotAlert;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LinkSlotItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/link/item/c;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f244490b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f244491c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final LinkSlotAlert f244492d;

    public c(@k String str, @k AttributedText attributedText, @l LinkSlotAlert linkSlotAlert) {
        this.f244490b = str;
        this.f244491c = attributedText;
        this.f244492d = linkSlotAlert;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f244490b, cVar.f244490b) && L.f(this.f244491c, cVar.f244491c) && L.f(this.f244492d, cVar.f244492d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80596b() {
        return getF243399b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF243399b() {
        return this.f244490b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(this.f244490b.hashCode() * 31, 31, this.f244491c);
        LinkSlotAlert linkSlotAlert = this.f244492d;
        return iB2 + (linkSlotAlert == null ? 0 : linkSlotAlert.hashCode());
    }

    @k
    public final String toString() {
        return "LinkSlotItem(stringId=" + this.f244490b + ", text=" + this.f244491c + ", alert=" + this.f244492d + ')';
    }
}
