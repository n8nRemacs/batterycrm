package androidx.credentials;

import android.os.OutcomeReceiver;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import kotlin.Metadata;

/* compiled from: CredentialProviderFrameworkImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Landroidx/credentials/D;", "Landroid/os/OutcomeReceiver;", "Ljava/lang/Void;", "Landroid/credentials/ClearCredentialStateException;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class D implements OutcomeReceiver {
    public final void onError(Throwable th2) {
        A.A(th2);
        new ClearCredentialUnknownException(null, 1, null);
        throw null;
    }

    public final void onResult(Object obj) {
        throw null;
    }
}
