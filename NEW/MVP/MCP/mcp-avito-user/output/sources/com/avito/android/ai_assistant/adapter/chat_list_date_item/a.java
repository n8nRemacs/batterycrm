package com.avito.android.ai_assistant.adapter.chat_list_date_item;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChatListDateItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/chat_list_date_item/a;", "Lcom/avito/conveyor_item/a;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f88779b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f88780c;

    public a(String str, String str2, int i12, C42822w c42822w) {
        this.f88779b = (i12 & 1) != 0 ? UUID.randomUUID().toString() : str;
        this.f88780c = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f88779b, aVar.f88779b) && L.f(this.f88780c, aVar.f88780c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84603b() {
        return getF86735b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF86735b() {
        return this.f88779b;
    }

    public final int hashCode() {
        return this.f88780c.hashCode() + (this.f88779b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChatListDateItem(stringId=");
        sb2.append(this.f88779b);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f88780c, ')');
    }
}
