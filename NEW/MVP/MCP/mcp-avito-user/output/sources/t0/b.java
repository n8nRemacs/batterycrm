package T0;

import android.util.Base64;
import androidx.annotation.RestrictTo;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AuthenticatorAttestationResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT0/b;", "LT0/c;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes.dex */
public final class b implements c {
    public b(g gVar, byte[] bArr, byte[] bArr2, String str, boolean z12, boolean z13, boolean z14, boolean z15, String str2, byte[] bArr3, int i12, C42822w c42822w) throws JSONException, NoSuchAlgorithmException {
        str2 = (i12 & 256) != 0 ? null : str2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "webauthn.create");
        m.f15272a.getClass();
        jSONObject.put("challenge", Base64.encodeToString(null, 11));
        jSONObject.put("origin", str);
        if (str2 != null) {
            jSONObject.put("androidPackageName", str2);
        }
        AK.c.w("fmt", "none").put("attStmt", P0.c());
        MessageDigest.getInstance("SHA-256");
        throw null;
    }
}
