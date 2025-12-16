package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.externcalls.sdk.Conversation;

/* loaded from: classes.dex */
public final class n64 {
    public final AtomicReference a = new AtomicReference();

    public final Conversation a() {
        return (Conversation) this.a.get();
    }
}
