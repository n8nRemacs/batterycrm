package Y51;

import f61.C40239a;
import io.ktor.client.request.d0;
import io.ktor.http.C41519f0;
import io.ktor.http.U;
import java.util.UUID;
import kotlin.text.C43066x;
import okhttp3.Request;
import org.koin.java.c;
import sberid.sdk.global.network.models.MimeType;

/* loaded from: classes8.dex */
public abstract class a {
    public static final void a(d0 d0Var) {
        C40239a c40239a = (C40239a) c.a(C40239a.class);
        String strA0 = C43066x.a0(UUID.randomUUID().toString(), "-", "", false);
        U u12 = d0Var.f399709c;
        u12.d("RqUID", strA0);
        String str = c40239a.f395679a;
        u12.d("LogUid", str);
        u12.d("Process-ID", str);
    }

    public static final void b(Request.Builder builder) {
        C40239a c40239a = (C40239a) c.a(C40239a.class);
        builder.addHeader("RqUID", C43066x.a0(UUID.randomUUID().toString(), "-", "", false));
        String str = c40239a.f395679a;
        builder.addHeader("LogUid", str);
        builder.addHeader("Process-ID", str);
        C41519f0.f400005a.getClass();
        String str2 = C41519f0.f400006b;
        MimeType[] mimeTypeArr = MimeType.f437768b;
        builder.addHeader(str2, "application/json");
        builder.addHeader(C41519f0.f400014j, "application/json");
    }
}
