package okhttp3.tls.internal.der;

import Y41.a;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.SearchParamsConverterKt;
import java.math.BigInteger;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import okio.AbstractC44815z;
import okio.C44802l;
import okio.C44805o;
import okio.InterfaceC44804n;
import okio.Y;
import okio.e0;

/* compiled from: DerReader.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0014\b\u0000\u0018\u0000 F2\u00020\u0001:\u0002FGB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ7\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u0014H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u000bJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0006¢\u0006\u0004\b \u0010\bJ\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0012¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0012¢\u0006\u0004\b)\u0010(J\r\u0010*\u001a\u00020\u0012¢\u0006\u0004\b*\u0010(J\r\u0010+\u001a\u00020$¢\u0006\u0004\b+\u0010&J\u000f\u0010,\u001a\u00020\u0012H\u0016¢\u0006\u0004\b,\u0010(R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0016\u00102\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u0012048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0016\u00108\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010:\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\bR\u0014\u0010?\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\bR(\u0010E\u001a\u0004\u0018\u00010\u00012\b\u0010@\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006H"}, d2 = {"Lokhttp3/tls/internal/der/DerReader;", "", "Lokio/e0;", SearchParamsConverterKt.SOURCE, "<init>", "(Lokio/e0;)V", "", "readVariableLengthLong", "()J", "", "hasNext", "()Z", "Lokhttp3/tls/internal/der/DerHeader;", "peekHeader", "()Lokhttp3/tls/internal/der/DerHeader;", "readHeader$okhttp_tls", "readHeader", "T", "", "name", "Lkotlin/Function1;", "block", "read$okhttp_tls", "(Ljava/lang/String;LY41/l;)Ljava/lang/Object;", "read", "Lkotlin/Function0;", "withTypeHint", "(LY41/a;)Ljava/lang/Object;", "readBoolean", "Ljava/math/BigInteger;", "readBigInteger", "()Ljava/math/BigInteger;", "readLong", "Lokhttp3/tls/internal/der/BitString;", "readBitString", "()Lokhttp3/tls/internal/der/BitString;", "Lokio/o;", "readOctetString", "()Lokio/o;", "readUtf8String", "()Ljava/lang/String;", "readObjectIdentifier", "readRelativeObjectIdentifier", "readUnknown", "toString", "Lokhttp3/tls/internal/der/DerReader$CountingSource;", "countingSource", "Lokhttp3/tls/internal/der/DerReader$CountingSource;", "Lokio/n;", "Lokio/n;", "limit", "J", "", "typeHintStack", "Ljava/util/List;", "path", "constructed", "Z", "peekedHeader", "Lokhttp3/tls/internal/der/DerHeader;", "getByteCount", "byteCount", "getBytesLeft", "bytesLeft", "value", "getTypeHint", "()Ljava/lang/Object;", "setTypeHint", "(Ljava/lang/Object;)V", "typeHint", "Companion", "CountingSource", "okhttp-tls"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DerReader {

    @k
    private static final DerHeader END_OF_DATA = new DerHeader(0, 0, false, -1);
    private boolean constructed;

    @k
    private final CountingSource countingSource;
    private long limit;

    @k
    private final List<String> path;

    @l
    private DerHeader peekedHeader;

    @k
    private final InterfaceC44804n source;

    @k
    private final List<Object> typeHintStack;

    /* compiled from: DerReader.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lokhttp3/tls/internal/der/DerReader$CountingSource;", "Lokio/z;", "Lokio/e0;", SearchParamsConverterKt.SOURCE, "<init>", "(Lokio/e0;)V", "Lokio/l;", "sink", "", "byteCount", "read", "(Lokio/l;J)J", "bytesRead", "J", "getBytesRead", "()J", "setBytesRead", "(J)V", "okhttp-tls"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CountingSource extends AbstractC44815z {
        private long bytesRead;

        public CountingSource(@k e0 e0Var) {
            super(e0Var);
        }

        public final long getBytesRead() {
            return this.bytesRead;
        }

        @Override // okio.AbstractC44815z, okio.e0
        public long read(@k C44802l sink, long byteCount) {
            long j12 = delegate().read(sink, byteCount);
            if (j12 == -1) {
                return -1L;
            }
            this.bytesRead += j12;
            return j12;
        }

        public final void setBytesRead(long j12) {
            this.bytesRead = j12;
        }
    }

    public DerReader(@k e0 e0Var) {
        CountingSource countingSource = new CountingSource(e0Var);
        this.countingSource = countingSource;
        this.source = new Y(countingSource);
        this.limit = -1L;
        this.typeHintStack = new ArrayList();
        this.path = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getByteCount() {
        return this.countingSource.getBytesRead() - this.source.getF420047c().f420125c;
    }

    private final long getBytesLeft() {
        long j12 = this.limit;
        if (j12 == -1) {
            return -1L;
        }
        return j12 - getByteCount();
    }

    private final long readVariableLengthLong() {
        long j12 = 0;
        while (true) {
            long j13 = this.source.readByte();
            long j14 = 255 & j13;
            if ((j13 & 128) != 128) {
                return j12 + j14;
            }
            j12 = (j12 + (j13 & 127)) << 7;
        }
    }

    @l
    public final Object getTypeHint() {
        return C42745f0.S(this.typeHintStack);
    }

    public final boolean hasNext() {
        return peekHeader() != null;
    }

    @l
    public final DerHeader peekHeader() throws ProtocolException {
        DerHeader header$okhttp_tls = this.peekedHeader;
        if (header$okhttp_tls == null) {
            header$okhttp_tls = readHeader$okhttp_tls();
            this.peekedHeader = header$okhttp_tls;
        }
        if (header$okhttp_tls.isEndOfData()) {
            return null;
        }
        return header$okhttp_tls;
    }

    public final <T> T read$okhttp_tls(@l String name, @k Y41.l<? super DerHeader, ? extends T> block) throws ProtocolException {
        long length;
        if (!hasNext()) {
            throw new ProtocolException("expected a value");
        }
        DerHeader derHeader = this.peekedHeader;
        this.peekedHeader = null;
        long j12 = this.limit;
        boolean z12 = this.constructed;
        if (derHeader.getLength() != -1) {
            length = derHeader.getLength() + getByteCount();
        } else {
            length = -1;
        }
        if (j12 != -1 && length > j12) {
            throw new ProtocolException("enclosed object too large");
        }
        this.limit = length;
        this.constructed = derHeader.getConstructed();
        if (name != null) {
            this.path.add(name);
        }
        try {
            T tInvoke = block.invoke(derHeader);
            if (length != -1 && getByteCount() > length) {
                throw new ProtocolException("unexpected byte count at " + this);
            }
            return tInvoke;
        } finally {
            this.peekedHeader = null;
            this.limit = j12;
            this.constructed = z12;
            if (name != null) {
                this.path.remove(this.path.size() - 1);
            }
        }
    }

    @k
    public final BigInteger readBigInteger() throws ProtocolException {
        if (getBytesLeft() != 0) {
            return new BigInteger(this.source.p5(getBytesLeft()));
        }
        throw new ProtocolException("unexpected length: " + getBytesLeft() + " at " + this);
    }

    @k
    public final BitString readBitString() throws ProtocolException {
        if (getBytesLeft() == -1 || this.constructed) {
            throw new ProtocolException("constructed bit strings not supported for DER");
        }
        if (getBytesLeft() < 1) {
            throw new ProtocolException("malformed bit string");
        }
        return new BitString(this.source.W0(getBytesLeft()), this.source.readByte() & 255);
    }

    public final boolean readBoolean() throws ProtocolException {
        if (getBytesLeft() == 1) {
            return this.source.readByte() != 0;
        }
        throw new ProtocolException("unexpected length: " + getBytesLeft() + " at " + this);
    }

    @k
    public final DerHeader readHeader$okhttp_tls() throws ProtocolException {
        long j12;
        if (this.peekedHeader != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long byteCount = getByteCount();
        long j13 = this.limit;
        if (byteCount == j13) {
            return END_OF_DATA;
        }
        if (j13 == -1 && this.source.W2()) {
            return END_OF_DATA;
        }
        byte b12 = this.source.readByte();
        int i12 = b12 & 192;
        boolean z12 = (b12 & 32) == 32;
        int i13 = b12 & 31;
        long variableLengthLong = i13 == 31 ? readVariableLengthLong() : i13;
        byte b13 = this.source.readByte();
        if ((b13 & 255) == 128) {
            throw new ProtocolException("indefinite length not permitted for DER");
        }
        if ((b13 & 128) == 128) {
            int i14 = b13 & 127;
            if (i14 > 8) {
                throw new ProtocolException("length encoded with more than 8 bytes is not supported");
            }
            long j14 = this.source.readByte();
            j12 = 255 & j14;
            if (j12 == 0 || (i14 == 1 && (j14 & 128) == 0)) {
                throw new ProtocolException("invalid encoding for length");
            }
            for (int i15 = 1; i15 < i14; i15++) {
                j12 = (this.source.readByte() & 255) + (j12 << 8);
            }
            if (j12 < 0) {
                throw new ProtocolException("length > Long.MAX_VALUE");
            }
        } else {
            j12 = b13 & 127;
        }
        return new DerHeader(i12, variableLengthLong, z12, j12);
    }

    public final long readLong() throws ProtocolException {
        long bytesLeft = getBytesLeft();
        if (1 <= bytesLeft && bytesLeft < 9) {
            long j12 = this.source.readByte();
            while (getByteCount() < this.limit) {
                j12 = (j12 << 8) + (this.source.readByte() & 255);
            }
            return j12;
        }
        throw new ProtocolException("unexpected length: " + getBytesLeft() + " at " + this);
    }

    @k
    public final String readObjectIdentifier() {
        C44802l c44802l = new C44802l();
        long variableLengthLong = readVariableLengthLong();
        if (0 <= variableLengthLong && variableLengthLong < 40) {
            c44802l.F(0L);
            c44802l.D(46);
            c44802l.F(variableLengthLong);
        } else if (40 > variableLengthLong || variableLengthLong >= 80) {
            c44802l.F(2L);
            c44802l.D(46);
            c44802l.F(variableLengthLong - 80);
        } else {
            c44802l.F(1L);
            c44802l.D(46);
            c44802l.F(variableLengthLong - 40);
        }
        while (getByteCount() < this.limit) {
            c44802l.D(46);
            c44802l.F(readVariableLengthLong());
        }
        return c44802l.u();
    }

    @k
    public final C44805o readOctetString() throws ProtocolException {
        if (getBytesLeft() == -1 || this.constructed) {
            throw new ProtocolException("constructed octet strings not supported for DER");
        }
        return this.source.W0(getBytesLeft());
    }

    @k
    public final String readRelativeObjectIdentifier() {
        C44802l c44802l = new C44802l();
        while (getByteCount() < this.limit) {
            if (c44802l.f420125c > 0) {
                c44802l.D(46);
            }
            c44802l.F(readVariableLengthLong());
        }
        return c44802l.u();
    }

    @k
    public final C44805o readUnknown() {
        return this.source.W0(getBytesLeft());
    }

    @k
    public final String readUtf8String() throws ProtocolException {
        if (getBytesLeft() == -1 || this.constructed) {
            throw new ProtocolException("constructed strings not supported for DER");
        }
        return this.source.d4(getBytesLeft());
    }

    public final void setTypeHint(@l Object obj) {
        this.typeHintStack.set(r0.size() - 1, obj);
    }

    @k
    public String toString() {
        return C42745f0.O(this.path, " / ", null, null, null, 62);
    }

    public final <T> T withTypeHint(@k a<? extends T> block) {
        this.typeHintStack.add(null);
        try {
            T tInvoke = block.invoke();
            this.typeHintStack.remove(r0.size() - 1);
            return tInvoke;
        } catch (Throwable th2) {
            this.typeHintStack.remove(this.typeHintStack.size() - 1);
            throw th2;
        }
    }
}
