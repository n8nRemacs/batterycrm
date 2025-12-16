package androidx.credentials.provider;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: BeginCreatePublicKeyCredentialRequest.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/provider/g;", "Landroidx/credentials/provider/c;", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g extends AbstractC22866c {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f45254d = new a(null);

    /* compiled from: BeginCreatePublicKeyCredentialRequest.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/g$a;", "", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ g(String str, n nVar, Bundle bundle, byte[] bArr, int i12, C42822w c42822w) {
        this(bundle, nVar, str);
    }

    @X41.j
    public g(@Y61.k Bundle bundle, @Y61.l n nVar, @Y61.k String str) {
        super(bundle, nVar, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL");
        androidx.credentials.provider.utils.i.f45317a.getClass();
        if (str.length() != 0) {
            try {
                new JSONObject(str);
                bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
                return;
            } catch (Exception unused) {
            }
        }
        throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
    }
}
