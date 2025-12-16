package Vb;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AiAssistantChatPrivateState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVb/d;", "", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l f17234a;

    public d(@Y61.k l lVar) {
        this.f17234a = lVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && L.f(this.f17234a, ((d) obj).f17234a);
    }

    public final int hashCode() {
        return this.f17234a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "AiAssistantChatPrivateState(timestamps=" + this.f17234a + ')';
    }
}
