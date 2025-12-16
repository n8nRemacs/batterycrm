package com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.dialog_items.subtitle;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SubtitleItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/dialog_items/subtitle/a;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f245010b;

    public a(@k String str) {
        this.f245010b = str;
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
        return L.f(this.f245010b, aVar.f245010b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222267b() {
        return 1054914266;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF173901b() {
        return "subtitle_item";
    }

    public final int hashCode() {
        return this.f245010b.hashCode() - 1657396122;
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("SubtitleItem(stringId=subtitle_item, text="), this.f245010b, ')');
    }
}
