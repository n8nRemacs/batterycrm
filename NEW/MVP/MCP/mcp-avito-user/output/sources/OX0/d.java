package OX0;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.tasks.Task;
import j.N;
import j.P;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
public interface d extends com.google.android.gms.common.api.j<t> {
    @N
    @Deprecated
    Task<BeginSignInResult> beginSignIn(@N BeginSignInRequest beginSignInRequest);

    @N
    @Deprecated
    SignInCredential getSignInCredentialFromIntent(@P Intent intent);

    @N
    @Deprecated
    Task<PendingIntent> getSignInIntent(@N GetSignInIntentRequest getSignInIntentRequest);

    @N
    @Deprecated
    Task<Void> signOut();
}
