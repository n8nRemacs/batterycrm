package androidx.core.provider;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.RestrictTo;

/* compiled from: SelfDestructiveThread.java */
@RestrictTo
@Deprecated
/* loaded from: classes.dex */
public class p {

    /* compiled from: SelfDestructiveThread.java */
    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i12 = message.what;
            if (i12 == 0) {
                throw null;
            }
            if (i12 != 1) {
                return true;
            }
            throw null;
        }
    }

    /* compiled from: SelfDestructiveThread.java */
    public interface b<T> {
    }
}
