package Fc1;

import android.util.Base64;
import androidx.compose.runtime.C22026a;
import feedback.shared.sdk.api.network.entities.PostScreenshotResponse;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class O0<T> extends O1<T> {

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final kotlin.Q<String, String> f5114t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final String f5115u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final String f5116v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final String f5117w;

    public O0(@Y61.k kotlin.Q q12, @Y61.k D1 d12, @Y61.l C13598e1 c13598e1, @Y61.k C13598e1 c13598e12) {
        super(d12.a(), PostScreenshotResponse.class, c13598e1, c13598e12);
        this.f5114t = q12;
        this.f5115u = "--";
        this.f5116v = "\r\n";
        this.f5117w = "apiclient-" + System.currentTimeMillis();
    }

    @Override // com.android.volley.Request
    @Y61.k
    public final byte[] e() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        StringBuilder sb2 = new StringBuilder();
        String str = this.f5115u;
        sb2.append(str);
        String str2 = this.f5117w;
        sb2.append(str2);
        String str3 = this.f5116v;
        sb2.append(str3);
        dataOutputStream.writeBytes(sb2.toString());
        StringBuilder sb3 = new StringBuilder("Content-Disposition: form-data; name=\"screenshot\"; filename=\"");
        kotlin.Q<String, String> q12 = this.f5114t;
        sb3.append(q12.f406619b);
        sb3.append('\"');
        sb3.append(str3);
        dataOutputStream.writeBytes(sb3.toString());
        dataOutputStream.writeBytes("Content-Type: image/webp" + str3);
        dataOutputStream.writeBytes(str3);
        dataOutputStream.write(Base64.decode(q12.f406620c, 11));
        dataOutputStream.writeBytes(str3);
        dataOutputStream.writeBytes(str + str2 + str + str3);
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.android.volley.Request
    @Y61.k
    public final String f() {
        return C22026a.c(new StringBuilder("multipart/form-data;boundary=\""), this.f5117w, '\"');
    }

    @Override // Fc1.O1, com.android.volley.Request
    @Y61.k
    public final Map<String, String> i() {
        return new HashMap();
    }
}
