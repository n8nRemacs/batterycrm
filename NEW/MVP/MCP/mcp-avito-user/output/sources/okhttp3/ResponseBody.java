package okhttp3;

import X41.i;
import X41.n;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.text.selection.C21030p;
import com.avito.android.remote.model.AdvertStatus;
import com.avito.android.remote.model.SearchParamsConverterKt;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.io.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43047d;
import okhttp3.internal.Util;
import okio.C44802l;
import okio.C44805o;
import okio.InterfaceC44804n;

/* compiled from: ResponseBody.kt */
@s0
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0006H\u0082\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H&¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010\u0003R\u0018\u0010)\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "<init>", "()V", "", "T", "Lkotlin/Function1;", "Lokio/n;", "consumer", "", "sizeMapper", "consumeSource", "(LY41/l;LY41/l;)Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "charset", "()Ljava/nio/charset/Charset;", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Ljava/io/InputStream;", "byteStream", "()Ljava/io/InputStream;", SearchParamsConverterKt.SOURCE, "()Lokio/n;", "", "bytes", "()[B", "Lokio/o;", "byteString", "()Lokio/o;", "Ljava/io/Reader;", "charStream", "()Ljava/io/Reader;", "", "string", "()Ljava/lang/String;", "Lkotlin/G0;", "close", "reader", "Ljava/io/Reader;", "Companion", "BomAwareReader", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ResponseBody implements Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @l
    private Reader reader;

    /* compiled from: ResponseBody.kt */
    @s0
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lokhttp3/ResponseBody$BomAwareReader;", "Ljava/io/Reader;", "Lokio/n;", SearchParamsConverterKt.SOURCE, "Ljava/nio/charset/Charset;", "charset", "<init>", "(Lokio/n;Ljava/nio/charset/Charset;)V", "", "cbuf", "", "off", "len", "read", "([CII)I", "Lkotlin/G0;", "close", "()V", "Lokio/n;", "Ljava/nio/charset/Charset;", "", AdvertStatus.CLOSED, "Z", "delegate", "Ljava/io/Reader;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BomAwareReader extends Reader {

        @k
        private final Charset charset;
        private boolean closed;

        @l
        private Reader delegate;

        @k
        private final InterfaceC44804n source;

        public BomAwareReader(@k InterfaceC44804n interfaceC44804n, @k Charset charset) {
            this.source = interfaceC44804n;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            G0 g02;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
                g02 = G0.f406611a;
            } else {
                g02 = null;
            }
            if (g02 == null) {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(@k char[] cbuf, int off, int len) throws IOException {
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.delegate;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.source.s6(), Util.readBomAsCharset(this.source, this.charset));
                this.delegate = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, off, len);
        }
    }

    /* compiled from: ResponseBody.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u0007*\u00020\u000b2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\fJ\u001f\u0010\n\u001a\u00020\u0007*\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\u000eJ)\u0010\u0013\u001a\u00020\u0007*\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\b\u0010\u0012J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0015J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\b\u0010\u0016J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\rH\u0007¢\u0006\u0004\b\b\u0010\u0017J)\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\b\u0010\u0018¨\u0006\u0019"}, d2 = {"Lokhttp3/ResponseBody$Companion;", "", "<init>", "()V", "", "Lokhttp3/MediaType;", "contentType", "Lokhttp3/ResponseBody;", "create", "(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "toResponseBody", "", "([BLokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lokio/o;", "(Lokio/o;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lokio/n;", "", "contentLength", "(Lokio/n;Lokhttp3/MediaType;J)Lokhttp3/ResponseBody;", "asResponseBody", "content", "(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;[B)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;Lokio/o;)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;JLokio/n;)Lokhttp3/ResponseBody;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        @n
        @i
        @k
        public final ResponseBody create(@k String str, @l MediaType mediaType) {
            Charset charset = C43047d.f410589b;
            if (mediaType != null) {
                Charset charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charsetCharset$default == null) {
                    mediaType = MediaType.INSTANCE.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charsetCharset$default;
                }
            }
            C44802l c44802l = new C44802l();
            c44802l.M(str, 0, str.length(), charset);
            return create(c44802l, mediaType, c44802l.f420125c);
        }

        private Companion() {
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, C44805o c44805o, MediaType mediaType, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(c44805o, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, InterfaceC44804n interfaceC44804n, MediaType mediaType, long j12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                mediaType = null;
            }
            if ((i12 & 2) != 0) {
                j12 = -1;
            }
            return companion.create(interfaceC44804n, mediaType, j12);
        }

        @n
        @i
        @k
        public final ResponseBody create(@k byte[] bArr, @l MediaType mediaType) {
            C44802l c44802l = new C44802l();
            c44802l.write(bArr, 0, bArr.length);
            return create(c44802l, mediaType, bArr.length);
        }

        @n
        @i
        @k
        public final ResponseBody create(@k C44805o c44805o, @l MediaType mediaType) {
            C44802l c44802l = new C44802l();
            c44802l.B(c44805o);
            return create(c44802l, mediaType, c44805o.d());
        }

        @n
        @i
        @k
        public final ResponseBody create(@k final InterfaceC44804n interfaceC44804n, @l final MediaType mediaType, final long j12) {
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                /* renamed from: contentLength, reason: from getter */
                public long get$contentLength() {
                    return j12;
                }

                @Override // okhttp3.ResponseBody
                @l
                /* renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return mediaType;
                }

                @Override // okhttp3.ResponseBody
                @k
                /* renamed from: source, reason: from getter */
                public InterfaceC44804n get$this_asResponseBody() {
                    return interfaceC44804n;
                }
            };
        }

        @n
        @k
        @InterfaceC42830m
        public final ResponseBody create(@l MediaType contentType, @k String content) {
            return create(content, contentType);
        }

        @n
        @k
        @InterfaceC42830m
        public final ResponseBody create(@l MediaType contentType, @k byte[] content) {
            return create(content, contentType);
        }

        @n
        @k
        @InterfaceC42830m
        public final ResponseBody create(@l MediaType contentType, @k C44805o content) {
            return create(content, contentType);
        }

        @n
        @k
        @InterfaceC42830m
        public final ResponseBody create(@l MediaType contentType, long contentLength, @k InterfaceC44804n content) {
            return create(content, contentType, contentLength);
        }
    }

    private final Charset charset() {
        Charset charset;
        MediaType mediaTypeContentType = get$contentType();
        return (mediaTypeContentType == null || (charset = mediaTypeContentType.charset(C43047d.f410589b)) == null) ? C43047d.f410589b : charset;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.Object] */
    private final <T> T consumeSource(Y41.l<? super InterfaceC44804n, ? extends T> consumer, Y41.l<? super T, Integer> sizeMapper) throws IOException {
        long jContentLength = get$contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(C21030p.a(jContentLength, "Cannot buffer entire body for content length: "));
        }
        InterfaceC44804n interfaceC44804nSource = get$this_asResponseBody();
        try {
            T tInvoke = consumer.invoke(interfaceC44804nSource);
            c.a(interfaceC44804nSource, null);
            int iIntValue = sizeMapper.invoke(tInvoke).intValue();
            if (jContentLength == -1 || jContentLength == iIntValue) {
                return tInvoke;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iIntValue + ") disagree");
        } finally {
        }
    }

    @n
    @i
    @k
    public static final ResponseBody create(@k String str, @l MediaType mediaType) {
        return INSTANCE.create(str, mediaType);
    }

    @k
    public final InputStream byteStream() {
        return get$this_asResponseBody().s6();
    }

    @k
    public final C44805o byteString() throws IOException {
        long jContentLength = get$contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(C21030p.a(jContentLength, "Cannot buffer entire body for content length: "));
        }
        InterfaceC44804n interfaceC44804nSource = get$this_asResponseBody();
        try {
            C44805o c44805oQ1 = interfaceC44804nSource.q1();
            c.a(interfaceC44804nSource, null);
            int iD2 = c44805oQ1.d();
            if (jContentLength == -1 || jContentLength == iD2) {
                return c44805oQ1;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iD2 + ") disagree");
        } finally {
        }
    }

    @k
    public final byte[] bytes() throws IOException {
        long jContentLength = get$contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(C21030p.a(jContentLength, "Cannot buffer entire body for content length: "));
        }
        InterfaceC44804n interfaceC44804nSource = get$this_asResponseBody();
        try {
            byte[] bArrJ4 = interfaceC44804nSource.j4();
            c.a(interfaceC44804nSource, null);
            int length = bArrJ4.length;
            if (jContentLength == -1 || jContentLength == length) {
                return bArrJ4;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    @k
    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(get$this_asResponseBody(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Util.closeQuietly(get$this_asResponseBody());
    }

    /* renamed from: contentLength */
    public abstract long get$contentLength();

    @l
    /* renamed from: contentType */
    public abstract MediaType get$contentType();

    @k
    /* renamed from: source */
    public abstract InterfaceC44804n get$this_asResponseBody();

    @k
    public final String string() {
        InterfaceC44804n interfaceC44804nSource = get$this_asResponseBody();
        try {
            String strW4 = interfaceC44804nSource.w4(Util.readBomAsCharset(interfaceC44804nSource, charset()));
            c.a(interfaceC44804nSource, null);
            return strW4;
        } finally {
        }
    }

    @n
    @k
    @InterfaceC42830m
    public static final ResponseBody create(@l MediaType mediaType, long j12, @k InterfaceC44804n interfaceC44804n) {
        return INSTANCE.create(mediaType, j12, interfaceC44804n);
    }

    @n
    @k
    @InterfaceC42830m
    public static final ResponseBody create(@l MediaType mediaType, @k String str) {
        return INSTANCE.create(mediaType, str);
    }

    @n
    @k
    @InterfaceC42830m
    public static final ResponseBody create(@l MediaType mediaType, @k C44805o c44805o) {
        return INSTANCE.create(mediaType, c44805o);
    }

    @n
    @k
    @InterfaceC42830m
    public static final ResponseBody create(@l MediaType mediaType, @k byte[] bArr) {
        return INSTANCE.create(mediaType, bArr);
    }

    @n
    @i
    @k
    public static final ResponseBody create(@k InterfaceC44804n interfaceC44804n, @l MediaType mediaType, long j12) {
        return INSTANCE.create(interfaceC44804n, mediaType, j12);
    }

    @n
    @i
    @k
    public static final ResponseBody create(@k C44805o c44805o, @l MediaType mediaType) {
        return INSTANCE.create(c44805o, mediaType);
    }

    @n
    @i
    @k
    public static final ResponseBody create(@k byte[] bArr, @l MediaType mediaType) {
        return INSTANCE.create(bArr, mediaType);
    }
}
