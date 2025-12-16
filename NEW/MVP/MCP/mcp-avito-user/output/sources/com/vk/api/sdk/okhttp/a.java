package com.vk.api.sdk.okhttp;

import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.InterfaceC44803m;

/* compiled from: FileFullRequestBody.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/api/sdk/okhttp/a;", "Lokhttp3/RequestBody;", "a", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class a extends RequestBody {

    /* compiled from: FileFullRequestBody.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/vk/api/sdk/okhttp/a$a;", "", "<init>", "()V", "", "CHUNK", "I", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.vk.api.sdk.okhttp.a$a, reason: collision with other inner class name */
    public static final class C10818a {
        public /* synthetic */ C10818a(C42822w c42822w) {
            this();
        }

        public C10818a() {
        }
    }

    static {
        new C10818a(null);
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        throw null;
    }

    @Override // okhttp3.RequestBody
    @Y61.l
    /* renamed from: contentType */
    public final MediaType get$contentType() {
        String strGuessContentTypeFromName;
        try {
            strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(null);
        } catch (Exception unused) {
            strGuessContentTypeFromName = null;
        }
        if (strGuessContentTypeFromName == null) {
            try {
                throw null;
            } catch (Throwable unused2) {
            }
        }
        MediaType mediaType = strGuessContentTypeFromName != null ? MediaType.INSTANCE.parse(strGuessContentTypeFromName) : null;
        return mediaType == null ? MediaType.INSTANCE.get("application/octet-stream") : mediaType;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(@Y61.k InterfaceC44803m interfaceC44803m) {
        interfaceC44803m.q6();
        throw null;
    }
}
