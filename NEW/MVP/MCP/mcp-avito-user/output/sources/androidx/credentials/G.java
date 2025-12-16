package androidx.credentials;

import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CredentialProviderFrameworkImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class G extends kotlin.jvm.internal.N implements Y41.a<G0> {
    @Override // Y41.a
    public final G0 invoke() {
        new GetCredentialUnsupportedException("Your device doesn't support credential manager");
        throw null;
    }
}
