package androidx.credentials.provider;

import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.service.credentials.BeginCreateCredentialRequest;
import android.service.credentials.BeginGetCredentialRequest;
import android.service.credentials.ClearCredentialStateRequest;
import android.service.credentials.CredentialProviderService;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.provider.utils.c;
import androidx.credentials.provider.utils.e;
import j.X;
import kotlin.Metadata;

/* compiled from: CredentialProviderService.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/t;", "Landroid/service/credentials/CredentialProviderService;", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@X
/* loaded from: classes.dex */
public abstract class t extends CredentialProviderService {

    /* compiled from: CredentialProviderService.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"androidx/credentials/provider/t$a", "Landroid/os/OutcomeReceiver;", "Landroidx/credentials/provider/d;", "Landroidx/credentials/exceptions/CreateCredentialException;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements OutcomeReceiver {
        public final void onError(Throwable th2) {
            CreateCredentialException createCredentialException = (CreateCredentialException) th2;
            s.t();
            ((OutcomeReceiver) null).onError(s.c(createCredentialException.getF45210c(), createCredentialException.getMessage()));
        }

        public final void onResult(Object obj) {
            androidx.credentials.provider.utils.c.f45299a.getClass();
            ((OutcomeReceiver) null).onResult(c.a.a((C22867d) obj));
        }
    }

    /* compiled from: CredentialProviderService.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"androidx/credentials/provider/t$b", "Landroid/os/OutcomeReceiver;", "Landroidx/credentials/provider/j;", "Landroidx/credentials/exceptions/GetCredentialException;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements OutcomeReceiver {
        public final void onError(Throwable th2) {
            GetCredentialException getCredentialException = (GetCredentialException) th2;
            s.z();
            ((OutcomeReceiver) null).onError(s.e(getCredentialException.getF45213c(), getCredentialException.getMessage()));
        }

        public final void onResult(Object obj) {
            androidx.credentials.provider.utils.e.f45305a.getClass();
            ((OutcomeReceiver) null).onResult(e.a.b((j) obj));
        }
    }

    /* compiled from: CredentialProviderService.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"androidx/credentials/provider/t$c", "Landroid/os/OutcomeReceiver;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements OutcomeReceiver {
        public final void onError(Throwable th2) {
            ClearCredentialException clearCredentialException = (ClearCredentialException) th2;
            s.A();
            ((OutcomeReceiver) null).onError(s.b(clearCredentialException.getF45202c(), clearCredentialException.getMessage()));
        }

        public final void onResult(Object obj) {
            ((OutcomeReceiver) null).onResult((Void) obj);
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public final void onBeginCreateCredential(@Y61.k BeginCreateCredentialRequest beginCreateCredentialRequest, @Y61.k CancellationSignal cancellationSignal, @Y61.k OutcomeReceiver outcomeReceiver) throws FrameworkClassParsingException {
        androidx.credentials.provider.utils.c.f45299a.getClass();
        c.a.b(beginCreateCredentialRequest);
        a();
    }

    public final void onBeginGetCredential(@Y61.k BeginGetCredentialRequest beginGetCredentialRequest, @Y61.k CancellationSignal cancellationSignal, @Y61.k OutcomeReceiver outcomeReceiver) throws FrameworkClassParsingException {
        androidx.credentials.provider.utils.e.f45305a.getClass();
        e.a.c(beginGetCredentialRequest);
        b();
    }

    public final void onClearCredentialState(@Y61.k ClearCredentialStateRequest clearCredentialStateRequest, @Y61.k CancellationSignal cancellationSignal, @Y61.k OutcomeReceiver outcomeReceiver) {
        androidx.credentials.provider.utils.g.f45316a.getClass();
        new n(clearCredentialStateRequest.getCallingAppInfo().getPackageName(), clearCredentialStateRequest.getCallingAppInfo().getSigningInfo(), clearCredentialStateRequest.getCallingAppInfo().getOrigin());
        c();
    }
}
