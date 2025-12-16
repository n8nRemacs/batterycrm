package androidx.credentials.provider;

import android.credentials.CredentialOption;
import android.os.Bundle;
import androidx.credentials.AbstractC22874x;
import androidx.credentials.M;
import androidx.credentials.O;
import androidx.credentials.internal.FrameworkClassParsingException;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: PendingIntentHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0001*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/credentials/CredentialOption;", "kotlin.jvm.PlatformType", "option", "Landroidx/credentials/x;", "invoke", "(Landroid/credentials/CredentialOption;)Landroidx/credentials/x;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class x extends N implements Y41.l<CredentialOption, AbstractC22874x> {
    static {
        new x();
    }

    public x() {
        super(1);
    }

    @Override // Y41.l
    public final AbstractC22874x invoke(CredentialOption credentialOption) throws FrameworkClassParsingException {
        Set setP0;
        CredentialOption credentialOptionD = s.d(credentialOption);
        AbstractC22874x.a aVar = AbstractC22874x.f45331g;
        String type = credentialOptionD.getType();
        Bundle credentialRetrievalData = credentialOptionD.getCredentialRetrievalData();
        Bundle candidateQueryData = credentialOptionD.getCandidateQueryData();
        boolean zIsSystemProviderRequired = credentialOptionD.isSystemProviderRequired();
        Set allowedProviders = credentialOptionD.getAllowedProviders();
        aVar.getClass();
        try {
            if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                androidx.credentials.N.f45182i.getClass();
                ArrayList<String> stringArrayList = credentialRetrievalData.getStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS");
                if (stringArrayList == null || (setP0 = C42745f0.P0(stringArrayList)) == null) {
                    setP0 = B0.f406639b;
                }
                return new androidx.credentials.N(setP0, credentialRetrievalData.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), allowedProviders, credentialRetrievalData, candidateQueryData, credentialRetrievalData.getInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 1000), null);
            }
            if (!type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                throw new FrameworkClassParsingException();
            }
            String string = credentialRetrievalData.getString("androidx.credentials.BUNDLE_KEY_SUBTYPE");
            if (string == null || string.hashCode() != -613058807 || !string.equals("androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION")) {
                throw new FrameworkClassParsingException();
            }
            O.f45184i.getClass();
            try {
                return new O(credentialRetrievalData.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON"), credentialRetrievalData.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH"), allowedProviders, credentialRetrievalData, candidateQueryData, credentialRetrievalData.getInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 100), null);
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        } catch (FrameworkClassParsingException unused2) {
            return new M(credentialRetrievalData.getInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 2000), credentialRetrievalData, candidateQueryData, type, allowedProviders, zIsSystemProviderRequired, credentialRetrievalData.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false));
        }
    }
}
