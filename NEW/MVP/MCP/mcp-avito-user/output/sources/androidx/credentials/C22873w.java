package androidx.credentials;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CredentialManagerImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/w;", "Landroidx/credentials/k;", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ObsoleteSdkInt"})
/* renamed from: androidx.credentials.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22873w implements InterfaceC22858k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Context f45330b;

    /* compiled from: CredentialManagerImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/credentials/w$a;", "", "<init>", "()V", "", "INTENT_ACTION_FOR_CREDENTIAL_PROVIDER_SETTINGS", "Ljava/lang/String;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.w$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public C22873w(@Y61.k Context context) {
        this.f45330b = context;
    }

    @Override // androidx.credentials.InterfaceC22858k
    public final void b(@Y61.k Context context, @Y61.k K k12, @Y61.l CancellationSignal cancellationSignal, @Y61.k androidx.arch.core.executor.a aVar, @Y61.k C22868q c22868q) {
        y yVarA = z.a(new z(context));
        if (yVarA == null) {
            c22868q.a(new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            yVarA.onGetCredential(context, k12, cancellationSignal, aVar, c22868q);
        }
    }

    @Override // androidx.credentials.InterfaceC22858k
    public final void d(@Y61.k Context context, @Y61.k C22853f c22853f, @Y61.l CancellationSignal cancellationSignal, @Y61.k androidx.arch.core.executor.a aVar, @Y61.k C22862o c22862o) {
        y yVarA = z.a(new z(this.f45330b));
        if (yVarA == null) {
            c22862o.a(new CreateCredentialProviderConfigurationException("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            yVarA.onCreateCredential(context, c22853f, cancellationSignal, aVar, c22862o);
        }
    }
}
