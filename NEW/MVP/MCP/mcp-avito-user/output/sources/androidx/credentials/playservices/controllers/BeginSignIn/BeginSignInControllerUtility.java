package androidx.credentials.playservices.controllers.BeginSignIn;

import Y61.k;
import android.content.Context;
import android.os.Parcelable;
import androidx.credentials.AbstractC22874x;
import androidx.credentials.K;
import androidx.credentials.N;
import androidx.credentials.O;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.internal.C36729v;
import kY0.C42646a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONException;

/* compiled from: BeginSignInControllerUtility.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/credentials/playservices/controllers/BeginSignIn/BeginSignInControllerUtility;", "", "()V", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BeginSignInControllerUtility {
    private static final long AUTH_MIN_VERSION_JSON_PARSING = 231815000;
    private static final long AUTH_MIN_VERSION_PREFER_IMME_CRED = 241217000;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private static final String TAG = "BeginSignInUtility";

    /* compiled from: BeginSignInControllerUtility.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/credentials/playservices/controllers/BeginSignIn/BeginSignInControllerUtility$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "determineDeviceGMSVersionCode", "(Landroid/content/Context;)J", "curAuthVersion", "", "needsBackwardsCompatibleRequest", "(J)Z", "LkY0/a;", "option", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$GoogleIdTokenRequestOptions;", "convertToGoogleIdTokenOption", "(LkY0/a;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$GoogleIdTokenRequestOptions;", "Landroidx/credentials/K;", "request", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "constructBeginSignInRequest$credentials_play_services_auth_release", "(Landroidx/credentials/K;Landroid/content/Context;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "constructBeginSignInRequest", "AUTH_MIN_VERSION_JSON_PARSING", "J", "AUTH_MIN_VERSION_PREFER_IMME_CRED", "", "TAG", "Ljava/lang/String;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        private final BeginSignInRequest.GoogleIdTokenRequestOptions convertToGoogleIdTokenOption(C42646a option) {
            Parcelable.Creator<BeginSignInRequest.GoogleIdTokenRequestOptions> creator = BeginSignInRequest.GoogleIdTokenRequestOptions.CREATOR;
            BeginSignInRequest.GoogleIdTokenRequestOptions.a aVar = new BeginSignInRequest.GoogleIdTokenRequestOptions.a();
            option.getClass();
            aVar.f348639b = false;
            C36729v.f(null);
            aVar.f348638a = true;
            return new BeginSignInRequest.GoogleIdTokenRequestOptions(aVar.f348638a, null, null, aVar.f348639b, null, null, false);
        }

        private final long determineDeviceGMSVersionCode(Context context) {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        }

        private final boolean needsBackwardsCompatibleRequest(long curAuthVersion) {
            return curAuthVersion < BeginSignInControllerUtility.AUTH_MIN_VERSION_JSON_PARSING;
        }

        @k
        public final BeginSignInRequest constructBeginSignInRequest$credentials_play_services_auth_release(@k K request, @k Context context) throws JSONException {
            BeginSignInRequest.a aVar = new BeginSignInRequest.a();
            long jDetermineDeviceGMSVersionCode = determineDeviceGMSVersionCode(context);
            boolean z12 = false;
            boolean z13 = false;
            for (AbstractC22874x abstractC22874x : request.f45176a) {
                if (abstractC22874x instanceof N) {
                    BeginSignInRequest.PasswordRequestOptions.a aVar2 = new BeginSignInRequest.PasswordRequestOptions.a();
                    aVar2.f348651a = true;
                    aVar.f348652a = new BeginSignInRequest.PasswordRequestOptions(aVar2.f348651a);
                    z12 = z12 || abstractC22874x.f45336e;
                } else if ((abstractC22874x instanceof O) && !z13) {
                    if (needsBackwardsCompatibleRequest(jDetermineDeviceGMSVersionCode)) {
                        BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptionsConvertToPlayAuthPasskeyRequest = PublicKeyCredentialControllerUtility.INSTANCE.convertToPlayAuthPasskeyRequest((O) abstractC22874x);
                        C36729v.j(passkeysRequestOptionsConvertToPlayAuthPasskeyRequest);
                        aVar.f348654c = passkeysRequestOptionsConvertToPlayAuthPasskeyRequest;
                    } else {
                        BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptionsConvertToPlayAuthPasskeyJsonRequest = PublicKeyCredentialControllerUtility.INSTANCE.convertToPlayAuthPasskeyJsonRequest((O) abstractC22874x);
                        C36729v.j(passkeyJsonRequestOptionsConvertToPlayAuthPasskeyJsonRequest);
                        aVar.f348655d = passkeyJsonRequestOptionsConvertToPlayAuthPasskeyJsonRequest;
                    }
                    z13 = true;
                } else if (abstractC22874x instanceof C42646a) {
                    C42646a c42646a = (C42646a) abstractC22874x;
                    BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptionsConvertToGoogleIdTokenOption = convertToGoogleIdTokenOption(c42646a);
                    C36729v.j(googleIdTokenRequestOptionsConvertToGoogleIdTokenOption);
                    aVar.f348653b = googleIdTokenRequestOptionsConvertToGoogleIdTokenOption;
                    if (!z12) {
                        c42646a.getClass();
                    }
                }
            }
            if (jDetermineDeviceGMSVersionCode > BeginSignInControllerUtility.AUTH_MIN_VERSION_PREFER_IMME_CRED) {
                aVar.f348659h = request.f45180e;
            }
            aVar.f348657f = z12;
            return new BeginSignInRequest(aVar.f348652a, aVar.f348653b, aVar.f348656e, aVar.f348657f, aVar.f348658g, aVar.f348654c, aVar.f348655d, aVar.f348659h);
        }

        private Companion() {
        }
    }
}
