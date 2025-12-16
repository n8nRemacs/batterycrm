package androidx.credentials;

import android.os.OutcomeReceiver;
import kotlin.Metadata;

/* compiled from: CredentialProviderFrameworkImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Landroidx/credentials/H;", "Landroid/os/OutcomeReceiver;", "Landroid/credentials/PrepareGetCredentialResponse;", "Landroid/credentials/GetCredentialException;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class H implements OutcomeReceiver {
    public final void onError(Throwable th2) {
        A.D(th2);
        throw null;
    }

    public final void onResult(Object obj) {
        A.C(obj);
        throw null;
    }
}
