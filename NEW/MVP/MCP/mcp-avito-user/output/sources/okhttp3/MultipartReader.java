package okhttp3;

import X41.i;
import Y61.k;
import Y61.l;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.compose.foundation.text.selection.C21030p;
import com.avito.android.remote.model.AdvertStatus;
import com.avito.android.remote.model.SearchParamsConverterKt;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http1.HeadersReader;
import okio.C44802l;
import okio.C44805o;
import okio.InterfaceC44804n;
import okio.P;
import okio.Y;
import okio.Z;
import okio.e0;
import okio.i0;
import okio.internal.a;

/* compiled from: MultipartReader.kt */
@s0
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0003&'(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R\u001c\u0010$\u001a\b\u0018\u00010#R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", "Lokio/n;", SearchParamsConverterKt.SOURCE, "", "boundary", "<init>", "(Lokio/n;Ljava/lang/String;)V", "Lokhttp3/ResponseBody;", "response", "(Lokhttp3/ResponseBody;)V", "", "maxResult", "currentPartBytesRemaining", "(J)J", "Lokhttp3/MultipartReader$Part;", "nextPart", "()Lokhttp3/MultipartReader$Part;", "Lkotlin/G0;", "close", "()V", "Lokio/n;", "Ljava/lang/String;", "()Ljava/lang/String;", "Lokio/o;", "dashDashBoundary", "Lokio/o;", "crlfDashDashBoundary", "", "partCount", "I", "", AdvertStatus.CLOSED, "Z", "noMoreParts", "Lokhttp3/MultipartReader$PartSource;", "currentPart", "Lokhttp3/MultipartReader$PartSource;", "Companion", "Part", "PartSource", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MultipartReader implements Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private static final P afterBoundaryOptions;

    @k
    private final String boundary;
    private boolean closed;

    @k
    private final C44805o crlfDashDashBoundary;

    @l
    private PartSource currentPart;

    @k
    private final C44805o dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;

    @k
    private final InterfaceC44804n source;

    /* compiled from: MultipartReader.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/MultipartReader$Companion;", "", "<init>", "()V", "Lokio/P;", "afterBoundaryOptions", "Lokio/P;", "getAfterBoundaryOptions", "()Lokio/P;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final P getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }

        private Companion() {
        }
    }

    /* compiled from: MultipartReader.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\u0003\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "Lokhttp3/Headers;", "headers", "Lokio/n;", "body", "<init>", "(Lokhttp3/Headers;Lokio/n;)V", "Lkotlin/G0;", "close", "()V", "Lokhttp3/Headers;", "()Lokhttp3/Headers;", "Lokio/n;", "()Lokio/n;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Part implements Closeable {

        @k
        private final InterfaceC44804n body;

        @k
        private final Headers headers;

        public Part(@k Headers headers, @k InterfaceC44804n interfaceC44804n) {
            this.headers = headers;
            this.body = interfaceC44804n;
        }

        @i
        @k
        /* renamed from: body, reason: from getter */
        public final InterfaceC44804n getBody() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.body.close();
        }

        @i
        @k
        /* renamed from: headers, reason: from getter */
        public final Headers getHeaders() {
            return this.headers;
        }
    }

    /* compiled from: MultipartReader.kt */
    @s0
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/MultipartReader$PartSource;", "Lokio/e0;", "<init>", "(Lokhttp3/MultipartReader;)V", "Lkotlin/G0;", "close", "()V", "Lokio/l;", "sink", "", "byteCount", "read", "(Lokio/l;J)J", "Lokio/i0;", "timeout", "()Lokio/i0;", "Lokio/i0;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class PartSource implements e0 {

        @k
        private final i0 timeout = new i0();

        public PartSource() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (L.f(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        @Override // okio.e0
        public long read(@k C44802l sink, long byteCount) {
            long j12;
            if (byteCount < 0) {
                throw new IllegalArgumentException(C21030p.a(byteCount, "byteCount < 0: ").toString());
            }
            if (!L.f(MultipartReader.this.currentPart, this)) {
                throw new IllegalStateException(AdvertStatus.CLOSED);
            }
            i0 timeout = MultipartReader.this.source.getTimeout();
            i0 i0Var = this.timeout;
            MultipartReader multipartReader = MultipartReader.this;
            long timeoutNanos = timeout.getTimeoutNanos();
            i0.Companion companion = i0.INSTANCE;
            long timeoutNanos2 = i0Var.getTimeoutNanos();
            long timeoutNanos3 = timeout.getTimeoutNanos();
            companion.getClass();
            if (timeoutNanos2 == 0 || (timeoutNanos3 != 0 && timeoutNanos2 >= timeoutNanos3)) {
                timeoutNanos2 = timeoutNanos3;
            }
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            timeout.timeout(timeoutNanos2, timeUnit);
            if (!timeout.getHasDeadline()) {
                if (i0Var.getHasDeadline()) {
                    timeout.deadlineNanoTime(i0Var.deadlineNanoTime());
                }
                try {
                    long jCurrentPartBytesRemaining = multipartReader.currentPartBytesRemaining(byteCount);
                    long j13 = jCurrentPartBytesRemaining == 0 ? -1L : multipartReader.source.read(sink, jCurrentPartBytesRemaining);
                    timeout.timeout(timeoutNanos, timeUnit);
                    if (i0Var.getHasDeadline()) {
                        timeout.clearDeadline();
                    }
                    return j13;
                } catch (Throwable th2) {
                    timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                    if (i0Var.getHasDeadline()) {
                        timeout.clearDeadline();
                    }
                    throw th2;
                }
            }
            long jDeadlineNanoTime = timeout.deadlineNanoTime();
            if (i0Var.getHasDeadline()) {
                j12 = jDeadlineNanoTime;
                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), i0Var.deadlineNanoTime()));
            } else {
                j12 = jDeadlineNanoTime;
            }
            try {
                long jCurrentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(byteCount);
                long j14 = jCurrentPartBytesRemaining2 == 0 ? -1L : multipartReader.source.read(sink, jCurrentPartBytesRemaining2);
                timeout.timeout(timeoutNanos, timeUnit);
                if (i0Var.getHasDeadline()) {
                    timeout.deadlineNanoTime(j12);
                }
                return j14;
            } catch (Throwable th3) {
                long j15 = j12;
                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (i0Var.getHasDeadline()) {
                    timeout.deadlineNanoTime(j15);
                }
                throw th3;
            }
        }

        @Override // okio.e0
        @k
        /* renamed from: timeout, reason: from getter */
        public i0 getTimeout() {
            return this.timeout;
        }
    }

    static {
        P.a aVar = P.f420028e;
        C44805o.f420139e.getClass();
        C44805o[] c44805oArr = {C44805o.a.c("\r\n"), C44805o.a.c("--"), C44805o.a.c(" "), C44805o.a.c("\t")};
        aVar.getClass();
        afterBoundaryOptions = P.a.b(c44805oArr);
    }

    public MultipartReader(@k InterfaceC44804n interfaceC44804n, @k String str) {
        this.source = interfaceC44804n;
        this.boundary = str;
        C44802l c44802l = new C44802l();
        c44802l.N(0, 2, "--");
        c44802l.O(str);
        this.dashDashBoundary = c44802l.W0(c44802l.f420125c);
        C44802l c44802l2 = new C44802l();
        c44802l2.N(0, 4, "\r\n--");
        c44802l2.N(0, str.length(), str);
        this.crlfDashDashBoundary = c44802l2.W0(c44802l2.f420125c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long currentPartBytesRemaining(long maxResult) {
        long j12;
        this.source.x5(this.crlfDashDashBoundary.d());
        C44802l f420047c = this.source.getF420047c();
        C44805o c44805o = this.crlfDashDashBoundary;
        f420047c.getClass();
        if (c44805o.d() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j13 = 0;
        if (0 < 0) {
            throw new IllegalArgumentException(C21030p.a(0L, "fromIndex < 0: ").toString());
        }
        Z z12 = f420047c.f420124b;
        if (z12 == null) {
            j12 = -1;
        } else {
            long j14 = f420047c.f420125c;
            if (j14 - 0 < 0) {
                while (j14 > 0) {
                    z12 = z12.f420056g;
                    j14 -= z12.f420052c - z12.f420051b;
                }
                byte[] data = c44805o.getData();
                byte b12 = data[0];
                int iD2 = c44805o.d();
                long j15 = (f420047c.f420125c - iD2) + 1;
                long j16 = 0;
                loop1: while (j14 < j15) {
                    long j17 = j15;
                    int iMin = (int) Math.min(z12.f420052c, (z12.f420051b + j15) - j14);
                    for (int i12 = (int) ((z12.f420051b + j16) - j14); i12 < iMin; i12++) {
                        if (z12.f420050a[i12] == b12 && a.a(z12, i12 + 1, data, iD2)) {
                            j12 = (i12 - z12.f420051b) + j14;
                            break loop1;
                        }
                    }
                    j14 += z12.f420052c - z12.f420051b;
                    z12 = z12.f420055f;
                    j16 = j14;
                    j15 = j17;
                }
                j12 = -1;
            } else {
                while (true) {
                    long j18 = (z12.f420052c - z12.f420051b) + j13;
                    if (j18 > 0) {
                        break;
                    }
                    z12 = z12.f420055f;
                    j13 = j18;
                }
                byte[] data2 = c44805o.getData();
                byte b13 = data2[0];
                int iD3 = c44805o.d();
                long j19 = (f420047c.f420125c - iD3) + 1;
                long j22 = 0;
                loop4: while (j13 < j19) {
                    int iMin2 = (int) Math.min(z12.f420052c, (z12.f420051b + j19) - j13);
                    for (int i13 = (int) ((z12.f420051b + j22) - j13); i13 < iMin2; i13++) {
                        if (z12.f420050a[i13] == b13 && a.a(z12, i13 + 1, data2, iD3)) {
                            j12 = (i13 - z12.f420051b) + j13;
                            break loop4;
                        }
                    }
                    j13 += z12.f420052c - z12.f420051b;
                    z12 = z12.f420055f;
                    j22 = j13;
                }
                j12 = -1;
            }
        }
        return j12 == -1 ? Math.min(maxResult, (this.source.getF420047c().f420125c - this.crlfDashDashBoundary.d()) + 1) : Math.min(maxResult, j12);
    }

    @i
    @k
    /* renamed from: boundary, reason: from getter */
    public final String getBoundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    @l
    public final Part nextPart() throws ProtocolException {
        if (this.closed) {
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }
        if (this.noMoreParts) {
            return null;
        }
        if (this.partCount == 0 && this.source.F0(0L, this.dashDashBoundary)) {
            this.source.skip(this.dashDashBoundary.d());
        } else {
            while (true) {
                long jCurrentPartBytesRemaining = currentPartBytesRemaining(PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                if (jCurrentPartBytesRemaining == 0) {
                    break;
                }
                this.source.skip(jCurrentPartBytesRemaining);
            }
            this.source.skip(this.crlfDashDashBoundary.d());
        }
        boolean z12 = false;
        while (true) {
            int iT6 = this.source.t6(afterBoundaryOptions);
            if (iT6 == -1) {
                throw new ProtocolException("unexpected characters after boundary");
            }
            if (iT6 == 0) {
                this.partCount++;
                Headers headers = new HeadersReader(this.source).readHeaders();
                PartSource partSource = new PartSource();
                this.currentPart = partSource;
                return new Part(headers, new Y(partSource));
            }
            if (iT6 == 1) {
                if (z12) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (this.partCount == 0) {
                    throw new ProtocolException("expected at least 1 part");
                }
                this.noMoreParts = true;
                return null;
            }
            if (iT6 == 2 || iT6 == 3) {
                z12 = true;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MultipartReader(@k ResponseBody responseBody) throws ProtocolException {
        String strParameter;
        InterfaceC44804n bodySource = responseBody.getBodySource();
        MediaType mediaType = responseBody.get$contentType();
        if (mediaType != null && (strParameter = mediaType.parameter("boundary")) != null) {
            this(bodySource, strParameter);
            return;
        }
        throw new ProtocolException("expected the Content-Type to have a boundary parameter");
    }
}
