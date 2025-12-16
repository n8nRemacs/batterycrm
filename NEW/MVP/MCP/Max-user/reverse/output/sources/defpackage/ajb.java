package defpackage;

import java.util.Objects;
import ru.ok.android.externcalls.sdk.api.ConversationParams;

/* loaded from: classes2.dex */
public final class ajb {
    public static final ajb b = new ajb(null);
    public final Object a;

    public ajb(ConversationParams conversationParams) {
        this.a = conversationParams;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ajb)) {
            return false;
        }
        ajb ajbVar = (ajb) obj;
        if (ajbVar != this) {
            return ajbVar != null && Objects.equals(this.a, ajbVar.a);
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        Object obj = this.a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
