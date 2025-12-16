package com.avito.android.ai_assistant.adapter.user_message;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserMessageItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/user_message/b;", "Lcom/avito/android/ai_assistant/adapter/a;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class b implements com.avito.android.ai_assistant.adapter.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f88913b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f88914c;

    public b(@k String str, @k AttributedText attributedText) {
        this.f88913b = str;
        this.f88914c = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f88913b, bVar.f88913b) && L.f(this.f88914c, bVar.f88914c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85286b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF85287c() {
        return this.f88913b;
    }

    public final int hashCode() {
        return this.f88914c.hashCode() + (this.f88913b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserMessageItem(stringId=");
        sb2.append(this.f88913b);
        sb2.append(", message=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f88914c, ')');
    }
}
