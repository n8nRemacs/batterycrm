package v2;

import ac1.AbstractC19866a;
import dc1.C39703a;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Z;
import kotlin.coroutines.SafeContinuation;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.m0;
import kotlinx.serialization.json.AbstractC43443a;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.C;
import okio.C44802l;
import okio.InterfaceC44804n;

/* renamed from: v2.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C49148b implements Callback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SafeContinuation f440367b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0.f f440368c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0.h f440369d;

    public C49148b(SafeContinuation safeContinuation, l0.f fVar, l0.h hVar) {
        this.f440367b = safeContinuation;
        this.f440368c = fVar;
        this.f440369d = hVar;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        SafeContinuation safeContinuation = this.f440367b;
        int i12 = this.f440368c.f406840b;
        String message = iOException.getMessage();
        if (message == null) {
            message = "Error message was empty";
        }
        AbstractC19866a.C1499a c1499a = new AbstractC19866a.C1499a(i12, message);
        int i13 = Z.f406624c;
        safeContinuation.resumeWith(c1499a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) throws IOException {
        InterfaceC44804n bodySource;
        Charset charset;
        Object bVar;
        Object bVar2;
        ResponseBody responseBodyBody;
        l0.h hVar = this.f440369d;
        hVar.f406842b = response;
        int iCode = response.code();
        l0.f fVar = this.f440368c;
        fVar.f406840b = iCode;
        boolean zIsSuccessful = response.isSuccessful();
        SafeContinuation safeContinuation = this.f440367b;
        if (!zIsSuccessful) {
            int i12 = Z.f406624c;
            safeContinuation.resumeWith(new AbstractC19866a.C1499a(fVar.f406840b, response.message()));
            return;
        }
        Headers headers = response.headers();
        ResponseBody responseBodyBody2 = response.body();
        if (responseBodyBody2 == null || (bodySource = responseBodyBody2.getBodySource()) == null) {
            return;
        }
        bodySource.request(Long.MAX_VALUE);
        C44802l f420047c = bodySource.getF420047c();
        if ("gzip".equalsIgnoreCase(headers.get("Content-Encoding"))) {
            C c12 = new C(f420047c);
            try {
                f420047c = new C44802l();
                f420047c.h2(c12);
                kotlin.io.c.a(c12, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(c12, th2);
                    throw th3;
                }
            }
        }
        MediaType mediaType = responseBodyBody2.get$contentType();
        if (mediaType == null || (charset = mediaType.charset(StandardCharsets.UTF_8)) == null) {
            charset = StandardCharsets.UTF_8;
        }
        String string = f420047c.z1(f420047c.f420125c, charset).toString();
        try {
            int i13 = Z.f406624c;
            AbstractC43443a.C11757a c11757a = AbstractC43443a.f412954d;
            bVar = c11757a.d(string, L51.a.a(kotlinx.serialization.C.a(c11757a.f412956b, m0.f406844a.b(C39703a.class))));
        } catch (Throwable th4) {
            int i14 = Z.f406624c;
            bVar = new Z.b(th4);
        }
        boolean z12 = bVar instanceof Z.b;
        if (z12) {
            bVar = null;
        }
        if (z12 || bVar == null) {
            C39703a.class.toString();
        }
        if (bVar == null) {
            try {
                bVar2 = Dc1.c.f3297a.d(C39703a.class, string);
            } catch (Throwable th5) {
                int i15 = Z.f406624c;
                bVar2 = new Z.b(th5);
            }
            boolean z13 = bVar2 instanceof Z.b;
            Object obj = z13 ? null : bVar2;
            if (z13 || obj == null) {
                C39703a.class.toString();
            }
            bVar = obj;
        }
        if (bVar == null) {
            safeContinuation.resumeWith(new AbstractC19866a.C1499a(fVar.f406840b, response.message()));
            return;
        }
        Response response2 = (Response) hVar.f406842b;
        if (response2 != null && (responseBodyBody = response2.body()) != null) {
            responseBodyBody.close();
        }
        safeContinuation.resumeWith(new AbstractC19866a.b(fVar.f406840b, bVar));
    }
}
