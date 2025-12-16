package com.avito.android.ai_assistant.adapter.assistant_text_message;

import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AssistantTextMessageItem.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/assistant_text_message/b;", "Lcom/avito/android/ai_assistant/adapter/a;", "Lcom/avito/android/ai_assistant/adapter/i;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class b implements com.avito.android.ai_assistant.adapter.a, com.avito.android.ai_assistant.adapter.i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f88746b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f88747c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AttributedText f88748d;

    public b(@Y61.k String str, @Y61.k String str2, @Y61.k AttributedText attributedText) {
        this.f88746b = str;
        this.f88747c = str2;
        this.f88748d = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f88746b, bVar.f88746b) && L.f(this.f88747c, bVar.f88747c) && L.f(this.f88748d, bVar.f88748d);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF88746b() {
        return this.f88746b;
    }

    public final int hashCode() {
        return this.f88748d.hashCode() + H.d(this.f88746b.hashCode() * 31, 31, this.f88747c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AssistantTextMessageItem(stringId=");
        sb2.append(this.f88746b);
        sb2.append(", ownerId=");
        sb2.append(this.f88747c);
        sb2.append(", message=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f88748d, ')');
    }
}
