package okhttp3.internal.http1;

import Y61.k;
import android.support.v4.media.session.PlaybackStateCompat;
import com.avito.android.remote.model.SearchParamsConverterKt;
import kotlin.Metadata;
import okhttp3.Headers;
import okio.InterfaceC44804n;

/* compiled from: HeadersReader.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/http1/HeadersReader;", "", "Lokio/n;", SearchParamsConverterKt.SOURCE, "<init>", "(Lokio/n;)V", "", "readLine", "()Ljava/lang/String;", "Lokhttp3/Headers;", "readHeaders", "()Lokhttp3/Headers;", "Lokio/n;", "getSource", "()Lokio/n;", "", "headerLimit", "J", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HeadersReader {
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;

    @k
    private final InterfaceC44804n source;

    public HeadersReader(@k InterfaceC44804n interfaceC44804n) {
        this.source = interfaceC44804n;
    }

    @k
    public final InterfaceC44804n getSource() {
        return this.source;
    }

    @k
    public final Headers readHeaders() {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String line = readLine();
            if (line.length() == 0) {
                return builder.build();
            }
            builder.addLenient$okhttp(line);
        }
    }

    @k
    public final String readLine() {
        String strX1 = this.source.X1(this.headerLimit);
        this.headerLimit -= strX1.length();
        return strX1;
    }
}
