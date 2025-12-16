package okhttp3;

import X41.i;
import X41.j;
import X41.n;
import Y61.k;
import Y61.l;
import java.io.File;
import java.nio.charset.Charset;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.io.c;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43047d;
import okhttp3.internal.Util;
import okio.C44805o;
import okio.InterfaceC44803m;
import okio.M;
import okio.e0;

/* compiled from: RequestBody.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0014"}, d2 = {"Lokhttp3/RequestBody;", "", "<init>", "()V", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Lokio/m;", "sink", "Lkotlin/G0;", "writeTo", "(Lokio/m;)V", "", "isDuplex", "()Z", "isOneShot", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class RequestBody {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: RequestBody.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u0007*\u00020\u000b2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\fJ3\u0010\n\u001a\u00020\u0007*\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\b\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u0007*\u00020\u00122\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\u0013J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0016J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\b\u0010\u0017J5\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\b\u0010\u0018J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0019\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\b\u0010\u001a¨\u0006\u001b"}, d2 = {"Lokhttp3/RequestBody$Companion;", "", "<init>", "()V", "", "Lokhttp3/MediaType;", "contentType", "Lokhttp3/RequestBody;", "create", "(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "toRequestBody", "Lokio/o;", "(Lokio/o;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "", "", "offset", "byteCount", "([BLokhttp3/MediaType;II)Lokhttp3/RequestBody;", "Ljava/io/File;", "(Ljava/io/File;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "asRequestBody", "content", "(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;", "(Lokhttp3/MediaType;Lokio/o;)Lokhttp3/RequestBody;", "(Lokhttp3/MediaType;[BII)Lokhttp3/RequestBody;", "file", "(Lokhttp3/MediaType;Ljava/io/File;)Lokhttp3/RequestBody;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, String str, MediaType mediaType, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        @j
        @InterfaceC42830m
        @n
        @k
        public final RequestBody create(@l MediaType mediaType, @k byte[] bArr) {
            return create$default(this, mediaType, bArr, 0, 0, 12, (Object) null);
        }

        private Companion() {
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, C44805o c44805o, MediaType mediaType, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(c44805o, mediaType);
        }

        @j
        @InterfaceC42830m
        @n
        @k
        public final RequestBody create(@l MediaType mediaType, @k byte[] bArr, int i12) {
            return create$default(this, mediaType, bArr, i12, 0, 8, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i12, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                mediaType = null;
            }
            if ((i14 & 2) != 0) {
                i12 = 0;
            }
            if ((i14 & 4) != 0) {
                i13 = bArr.length;
            }
            return companion.create(bArr, mediaType, i12, i13);
        }

        @j
        @n
        @i
        @k
        public final RequestBody create(@k byte[] bArr) {
            return create$default(this, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        }

        @j
        @n
        @i
        @k
        public final RequestBody create(@k byte[] bArr, @l MediaType mediaType) {
            return create$default(this, bArr, mediaType, 0, 0, 6, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, File file, MediaType mediaType, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(file, mediaType);
        }

        @j
        @n
        @i
        @k
        public final RequestBody create(@k byte[] bArr, @l MediaType mediaType, int i12) {
            return create$default(this, bArr, mediaType, i12, 0, 4, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, MediaType mediaType, byte[] bArr, int i12, int i13, int i14, Object obj) {
            if ((i14 & 4) != 0) {
                i12 = 0;
            }
            if ((i14 & 8) != 0) {
                i13 = bArr.length;
            }
            return companion.create(mediaType, bArr, i12, i13);
        }

        @n
        @i
        @k
        public final RequestBody create(@k String str, @l MediaType mediaType) {
            Charset charset = C43047d.f410589b;
            if (mediaType != null) {
                Charset charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charsetCharset$default == null) {
                    mediaType = MediaType.INSTANCE.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charsetCharset$default;
                }
            }
            byte[] bytes = str.getBytes(charset);
            return create(bytes, mediaType, 0, bytes.length);
        }

        @n
        @i
        @k
        public final RequestBody create(@k final C44805o c44805o, @l final MediaType mediaType) {
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return c44805o.d();
                }

                @Override // okhttp3.RequestBody
                @l
                /* renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(@k InterfaceC44803m sink) {
                    sink.B1(c44805o);
                }
            };
        }

        @j
        @n
        @i
        @k
        public final RequestBody create(@k final byte[] bArr, @l final MediaType mediaType, final int i12, final int i13) {
            Util.checkOffsetAndCount(bArr.length, i12, i13);
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return i13;
                }

                @Override // okhttp3.RequestBody
                @l
                /* renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(@k InterfaceC44803m sink) {
                    sink.k6(i12, i13, bArr);
                }
            };
        }

        @n
        @i
        @k
        public final RequestBody create(@k final File file, @l final MediaType mediaType) {
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$asRequestBody$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return file.length();
                }

                @Override // okhttp3.RequestBody
                @l
                /* renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(@k InterfaceC44803m sink) {
                    e0 e0VarF = M.f(file);
                    try {
                        sink.h2(e0VarF);
                        c.a(e0VarF, null);
                    } finally {
                    }
                }
            };
        }

        @n
        @k
        @InterfaceC42830m
        public final RequestBody create(@l MediaType contentType, @k String content) {
            return create(content, contentType);
        }

        @n
        @k
        @InterfaceC42830m
        public final RequestBody create(@l MediaType contentType, @k C44805o content) {
            return create(content, contentType);
        }

        @j
        @InterfaceC42830m
        @n
        @k
        public final RequestBody create(@l MediaType contentType, @k byte[] content, int offset, int byteCount) {
            return create(content, contentType, offset, byteCount);
        }

        @n
        @k
        @InterfaceC42830m
        public final RequestBody create(@l MediaType contentType, @k File file) {
            return create(file, contentType);
        }
    }

    @n
    @i
    @k
    public static final RequestBody create(@k File file, @l MediaType mediaType) {
        return INSTANCE.create(file, mediaType);
    }

    public long contentLength() {
        return -1L;
    }

    @l
    /* renamed from: contentType */
    public abstract MediaType get$contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(@k InterfaceC44803m sink);

    @n
    @i
    @k
    public static final RequestBody create(@k String str, @l MediaType mediaType) {
        return INSTANCE.create(str, mediaType);
    }

    @n
    @k
    @InterfaceC42830m
    public static final RequestBody create(@l MediaType mediaType, @k File file) {
        return INSTANCE.create(mediaType, file);
    }

    @n
    @k
    @InterfaceC42830m
    public static final RequestBody create(@l MediaType mediaType, @k String str) {
        return INSTANCE.create(mediaType, str);
    }

    @n
    @k
    @InterfaceC42830m
    public static final RequestBody create(@l MediaType mediaType, @k C44805o c44805o) {
        return INSTANCE.create(mediaType, c44805o);
    }

    @j
    @InterfaceC42830m
    @n
    @k
    public static final RequestBody create(@l MediaType mediaType, @k byte[] bArr) {
        return INSTANCE.create(mediaType, bArr);
    }

    @j
    @InterfaceC42830m
    @n
    @k
    public static final RequestBody create(@l MediaType mediaType, @k byte[] bArr, int i12) {
        return INSTANCE.create(mediaType, bArr, i12);
    }

    @j
    @InterfaceC42830m
    @n
    @k
    public static final RequestBody create(@l MediaType mediaType, @k byte[] bArr, int i12, int i13) {
        return INSTANCE.create(mediaType, bArr, i12, i13);
    }

    @n
    @i
    @k
    public static final RequestBody create(@k C44805o c44805o, @l MediaType mediaType) {
        return INSTANCE.create(c44805o, mediaType);
    }

    @j
    @n
    @i
    @k
    public static final RequestBody create(@k byte[] bArr) {
        return INSTANCE.create(bArr);
    }

    @j
    @n
    @i
    @k
    public static final RequestBody create(@k byte[] bArr, @l MediaType mediaType) {
        return INSTANCE.create(bArr, mediaType);
    }

    @j
    @n
    @i
    @k
    public static final RequestBody create(@k byte[] bArr, @l MediaType mediaType, int i12) {
        return INSTANCE.create(bArr, mediaType, i12);
    }

    @j
    @n
    @i
    @k
    public static final RequestBody create(@k byte[] bArr, @l MediaType mediaType, int i12, int i13) {
        return INSTANCE.create(bArr, mediaType, i12, i13);
    }
}
