package com.avito.android.developments_agency_search.screen.deal_room.adapter.note;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;

/* compiled from: NoteItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/note/c;", "Lcom/avito/conveyor_item/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f137406b;

    public c(@k PrintableText printableText) {
        this.f137406b = printableText;
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
        return this.f137406b.equals(cVar.f137406b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123950b() {
        return -1946425075;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF130375g() {
        return "selection-note-item";
    }

    public final int hashCode() {
        return this.f137406b.hashCode() - 209635181;
    }

    @k
    public final String toString() {
        return AK.c.m(new StringBuilder("NoteItem(stringId=selection-note-item, text="), this.f137406b, ')');
    }
}
