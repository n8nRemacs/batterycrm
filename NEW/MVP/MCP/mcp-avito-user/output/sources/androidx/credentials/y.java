package androidx.credentials;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: CredentialProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/credentials/y;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface y {
    boolean isAvailableOnDevice();

    void onCreateCredential(@Y61.k Context context, @Y61.k AbstractC22849b abstractC22849b, @Y61.l CancellationSignal cancellationSignal, @Y61.k Executor executor, @Y61.k InterfaceC22872v<AbstractC22850c, CreateCredentialException> interfaceC22872v);

    void onGetCredential(@Y61.k Context context, @Y61.k K k12, @Y61.l CancellationSignal cancellationSignal, @Y61.k Executor executor, @Y61.k InterfaceC22872v<L, GetCredentialException> interfaceC22872v);
}
