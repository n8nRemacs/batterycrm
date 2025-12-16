package com.avito.android.ai_assistant.adapter.message_actions;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.ai_assistant.adapter.i;
import com.avito.android.ai_assistant.model.ReactionState;
import com.avito.conveyor_item.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MessageActionsItem.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/message_actions/a;", "Lcom/avito/android/ai_assistant/adapter/a;", "Lcom/avito/android/ai_assistant/adapter/i;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class a implements com.avito.android.ai_assistant.adapter.a, i {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f88812b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f88813c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<Tb.f> f88814d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ReactionState f88815e;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k String str, @k String str2, @k List<? extends Tb.f> list, @k ReactionState reactionState) {
        this.f88812b = str;
        this.f88813c = str2;
        this.f88814d = list;
        this.f88815e = reactionState;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f88812b, aVar.f88812b) && L.f(this.f88813c, aVar.f88813c) && L.f(this.f88814d, aVar.f88814d) && this.f88815e == aVar.f88815e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83624b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF88812b() {
        return this.f88812b;
    }

    public final int hashCode() {
        return this.f88815e.hashCode() + H.e(H.d(this.f88812b.hashCode() * 31, 31, this.f88813c), 31, this.f88814d);
    }

    @k
    public final String toString() {
        return "MessageActionsItem(stringId=" + this.f88812b + ", ownerId=" + this.f88813c + ", items=" + this.f88814d + ", state=" + this.f88815e + ')';
    }
}
