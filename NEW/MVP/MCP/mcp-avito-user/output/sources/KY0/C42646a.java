package kY0;

import androidx.credentials.M;
import j.N;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: com.google.android.libraries.identity.googleid:googleid@@1.1.0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LkY0/a;", "Landroidx/credentials/M;", "a", "b", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: kY0.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42646a extends M {

    /* compiled from: com.google.android.libraries.identity.googleid:googleid@@1.1.0 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0016\u0010\u0010\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"LkY0/a$a;", "", "<init>", "()V", "", "autoSelectEnabled", "Z", "filterByAuthorizedAccounts", "", "", "idTokenDepositionScopes", "Ljava/util/List;", "linkedServiceId", "Ljava/lang/String;", "nonce", "requestVerifiedPhoneNumber", "serverClientId", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: kY0.a$a, reason: collision with other inner class name */
    public static final class C11622a {
    }

    /* compiled from: com.google.android.libraries.identity.googleid:googleid@@1.1.0 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JS\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00048\u0000X\u0081T¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0014\u0010\u0003R\u001a\u0010\u0015\u001a\u00020\u00048\u0000X\u0081T¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u0012\u0004\b\u0016\u0010\u0003R\u001a\u0010\u0017\u001a\u00020\u00048\u0000X\u0081T¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u0012\u0004\b\u0018\u0010\u0003R\u001a\u0010\u0019\u001a\u00020\u00048\u0000X\u0081T¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u0012\u0004\b\u001a\u0010\u0003R\u001a\u0010\u001b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u0012\u0004\b\u001c\u0010\u0003R\u001a\u0010\u001d\u001a\u00020\u00048\u0000X\u0081T¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u0012\u0004\b\u001e\u0010\u0003R\u001a\u0010\u001f\u001a\u00020\u00048\u0000X\u0081T¢\u0006\f\n\u0004\b\u001f\u0010\u0013\u0012\u0004\b \u0010\u0003¨\u0006!"}, d2 = {"LkY0/a$b;", "", "<init>", "()V", "", "serverClientId", "nonce", "", "filterByAuthorizedAccounts", "linkedServiceId", "", "idTokenDepositionScopes", "requestVerifiedPhoneNumber", "autoSelectEnabled", "Landroid/os/Bundle;", "toBundle$java_com_google_android_libraries_identity_googleid_granule_granule", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;ZZ)Landroid/os/Bundle;", "toBundle", "BUNDLE_KEY_AUTO_SELECT_ENABLED", "Ljava/lang/String;", "getBUNDLE_KEY_AUTO_SELECT_ENABLED$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_FILTER_BY_AUTHORIZED_ACCOUNTS", "getBUNDLE_KEY_FILTER_BY_AUTHORIZED_ACCOUNTS$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_ID_TOKEN_DEPOSITION_SCOPES", "getBUNDLE_KEY_ID_TOKEN_DEPOSITION_SCOPES$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_LINKED_SERVICE_ID", "getBUNDLE_KEY_LINKED_SERVICE_ID$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_NONCE", "getBUNDLE_KEY_NONCE$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_REQUEST_VERIFIED_PHONE_NUMBER", "getBUNDLE_KEY_REQUEST_VERIFIED_PHONE_NUMBER$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_SERVER_CLIENT_ID", "getBUNDLE_KEY_SERVER_CLIENT_ID$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: kY0.a$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(@N C42822w c42822w) {
        }
    }

    static {
        new b(null);
    }
}
