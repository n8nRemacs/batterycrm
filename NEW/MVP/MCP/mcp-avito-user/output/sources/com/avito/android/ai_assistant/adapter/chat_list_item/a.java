package com.avito.android.ai_assistant.adapter.chat_list_item;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ChatListItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/chat_list_item/a;", "Lcom/avito/conveyor_item/a;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f88787b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f88788c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f88789d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f88790e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f88791f;

    public a(@k String str, @k String str2, boolean z12, @k String str3, boolean z13) {
        this.f88787b = str;
        this.f88788c = str2;
        this.f88789d = str3;
        this.f88790e = z12;
        this.f88791f = z13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f88787b, aVar.f88787b) && L.f(this.f88788c, aVar.f88788c) && L.f(this.f88789d, aVar.f88789d) && this.f88790e == aVar.f88790e && this.f88791f == aVar.f88791f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85702c() {
        return getF88913b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF88913b() {
        return this.f88787b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f88791f) + r.i(H.d(H.d(this.f88787b.hashCode() * 31, 31, this.f88788c), 31, this.f88789d), 31, this.f88790e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChatListItem(stringId=");
        sb2.append(this.f88787b);
        sb2.append(", text=");
        sb2.append(this.f88788c);
        sb2.append(", time=");
        sb2.append(this.f88789d);
        sb2.append(", selected=");
        sb2.append(this.f88790e);
        sb2.append(", unread=");
        return r.x(sb2, this.f88791f, ')');
    }
}
