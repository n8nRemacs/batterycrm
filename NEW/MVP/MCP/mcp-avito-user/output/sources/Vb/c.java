package Vb;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AiAssistantChatPrivateAction.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LVb/c;", "LVb/b;", "a", "LVb/c$a;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface c extends b {

    /* compiled from: AiAssistantChatPrivateAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVb/c$a;", "LVb/c;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final d f17233a;

        public a(@Y61.k d dVar) {
            this.f17233a = dVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f17233a, ((a) obj).f17233a);
        }

        public final int hashCode() {
            return this.f17233a.f17234a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UpdatePrivateState(state=" + this.f17233a + ')';
        }
    }
}
