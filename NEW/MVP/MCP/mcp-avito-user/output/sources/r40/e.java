package r40;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okio.InterfaceC44804n;
import okio.Y;

/* compiled from: CacheResponseBody.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lr40/e;", "Lokhttp3/ResponseBody;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e extends ResponseBody {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y f429582b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f429583c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f429584d;

    public e(@k Y y12, @l String str, @l String str2) {
        this.f429582b = y12;
        this.f429583c = str;
        this.f429584d = str2;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength */
    public final long getContentLength() {
        String str = this.f429584d;
        if (str != null) {
            return Util.toLongOrDefault(str, -1L);
        }
        return -1L;
    }

    @Override // okhttp3.ResponseBody
    @l
    /* renamed from: contentType */
    public final MediaType get$contentType() {
        String str = this.f429583c;
        if (str != null) {
            return MediaType.INSTANCE.parse(str);
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    @k
    /* renamed from: source */
    public final InterfaceC44804n getSource() {
        return this.f429582b;
    }
}
