package T0;

import android.util.Base64;
import androidx.annotation.RestrictTo;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43047d;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AuthenticatorAssertionResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT0/a;", "LT0/c;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes.dex */
public final class a implements c {
    public a(j jVar, byte[] bArr, String str, boolean z12, boolean z13, boolean z14, boolean z15, byte[] bArr2, String str2, byte[] bArr3, int i12, C42822w c42822w) throws JSONException, NoSuchAlgorithmException {
        str2 = (i12 & 256) != 0 ? null : str2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "webauthn.get");
        m.f15272a.getClass();
        jSONObject.put("challenge", Base64.encodeToString(null, 11));
        jSONObject.put("origin", str);
        if (str2 != null) {
            jSONObject.put("androidPackageName", str2);
        }
        MessageDigest.getInstance("SHA-256");
        C43047d c43047d = C43047d.f410588a;
        throw null;
    }
}
