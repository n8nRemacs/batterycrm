package okhttp3.tls.internal.der;

import Y61.k;
import Y61.l;
import java.io.EOFException;
import java.math.BigInteger;
import java.net.ProtocolException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.d;
import okhttp3.tls.internal.der.BasicDerAdapter;
import okhttp3.tls.internal.der.DerAdapter;
import okio.C44805o;

/* compiled from: Adapters.kt */
@s0
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\fJm\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u001a\u0010\u0016\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00150\u0014\"\u0006\u0012\u0002\b\u00030\u00152\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00180\u00172\u0016\u0010\u001a\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0018\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u001c\u0010\u001dJA\u0010 \u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001f0\u00152\u001a\u0010\u001e\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00150\u0014\"\u0006\u0012\u0002\b\u00030\u0015¢\u0006\u0004\b \u0010!J1\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00152\u001a\u0010\"\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00150\u0017¢\u0006\u0004\b#\u0010$Ji\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00152<\b\u0002\u0010\u001e\u001a\u001e\u0012\u001a\b\u0001\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030%\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u001f0\u0014\"\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030%\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u001f2\b\b\u0002\u0010'\u001a\u00020&2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b)\u0010*R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020&0\u001b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b8\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u001d\u00102\u001a\b\u0012\u0004\u0012\u0002010\u001b8\u0006¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b3\u0010.R\u001d\u00105\u001a\b\u0012\u0004\u0012\u0002040\u001b8\u0006¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b6\u0010.R\u001d\u00108\u001a\b\u0012\u0004\u0012\u0002070\u001b8\u0006¢\u0006\f\n\u0004\b8\u0010,\u001a\u0004\b9\u0010.R\u001f\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:0\u001b8\u0006¢\u0006\f\n\u0004\b;\u0010,\u001a\u0004\b<\u0010.R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b8\u0006¢\u0006\f\n\u0004\b=\u0010,\u001a\u0004\b>\u0010.R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b8\u0006¢\u0006\f\n\u0004\b?\u0010,\u001a\u0004\b@\u0010.R\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b8\u0006¢\u0006\f\n\u0004\bA\u0010,\u001a\u0004\bB\u0010.R\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b8\u0006¢\u0006\f\n\u0004\bC\u0010,\u001a\u0004\bD\u0010.R\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b8\u0006¢\u0006\f\n\u0004\bE\u0010,\u001a\u0004\bF\u0010.R\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b8\u0006¢\u0006\f\n\u0004\bG\u0010,\u001a\u0004\bH\u0010.R\u001d\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\u00158\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR8\u0010N\u001a&\u0012\"\u0012 \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010%\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u00150\u001f0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006P"}, d2 = {"Lokhttp3/tls/internal/der/Adapters;", "", "<init>", "()V", "", "string", "", "parseUtcTime$okhttp_tls", "(Ljava/lang/String;)J", "parseUtcTime", "date", "formatUtcTime$okhttp_tls", "(J)Ljava/lang/String;", "formatUtcTime", "parseGeneralizedTime$okhttp_tls", "parseGeneralizedTime", "formatGeneralizedTime$okhttp_tls", "formatGeneralizedTime", "T", "name", "", "Lokhttp3/tls/internal/der/DerAdapter;", "members", "Lkotlin/Function1;", "", "decompose", "construct", "Lokhttp3/tls/internal/der/BasicDerAdapter;", "sequence", "(Ljava/lang/String;[Lokhttp3/tls/internal/der/DerAdapter;LY41/l;LY41/l;)Lokhttp3/tls/internal/der/BasicDerAdapter;", "choices", "Lkotlin/Q;", "choice", "([Lokhttp3/tls/internal/der/DerAdapter;)Lokhttp3/tls/internal/der/DerAdapter;", "chooser", "usingTypeHint", "(LY41/l;)Lokhttp3/tls/internal/der/DerAdapter;", "Lkotlin/reflect/d;", "", "isOptional", "optionalValue", "any", "([Lkotlin/Q;ZLjava/lang/Object;)Lokhttp3/tls/internal/der/DerAdapter;", "BOOLEAN", "Lokhttp3/tls/internal/der/BasicDerAdapter;", "getBOOLEAN", "()Lokhttp3/tls/internal/der/BasicDerAdapter;", "INTEGER_AS_LONG", "getINTEGER_AS_LONG", "Ljava/math/BigInteger;", "INTEGER_AS_BIG_INTEGER", "getINTEGER_AS_BIG_INTEGER", "Lokhttp3/tls/internal/der/BitString;", "BIT_STRING", "getBIT_STRING", "Lokio/o;", "OCTET_STRING", "getOCTET_STRING", "Lkotlin/G0;", "NULL", "getNULL", "OBJECT_IDENTIFIER", "getOBJECT_IDENTIFIER", "UTF8_STRING", "getUTF8_STRING", "PRINTABLE_STRING", "getPRINTABLE_STRING", "IA5_STRING", "getIA5_STRING", "UTC_TIME", "getUTC_TIME", "GENERALIZED_TIME", "getGENERALIZED_TIME", "Lokhttp3/tls/internal/der/AnyValue;", "ANY_VALUE", "Lokhttp3/tls/internal/der/DerAdapter;", "getANY_VALUE", "()Lokhttp3/tls/internal/der/DerAdapter;", "defaultAnyChoices", "Ljava/util/List;", "okhttp-tls"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Adapters {

    @k
    private static final DerAdapter<AnyValue> ANY_VALUE;

    @k
    private static final BasicDerAdapter<BitString> BIT_STRING;

    @k
    private static final BasicDerAdapter<Boolean> BOOLEAN;

    @k
    private static final BasicDerAdapter<Long> GENERALIZED_TIME;

    @k
    private static final BasicDerAdapter<String> IA5_STRING;

    @k
    public static final Adapters INSTANCE = new Adapters();

    @k
    private static final BasicDerAdapter<BigInteger> INTEGER_AS_BIG_INTEGER;

    @k
    private static final BasicDerAdapter<Long> INTEGER_AS_LONG;

    @k
    private static final BasicDerAdapter<G0> NULL;

    @k
    private static final BasicDerAdapter<String> OBJECT_IDENTIFIER;

    @k
    private static final BasicDerAdapter<C44805o> OCTET_STRING;

    @k
    private static final BasicDerAdapter<String> PRINTABLE_STRING;

    @k
    private static final BasicDerAdapter<Long> UTC_TIME;

    @k
    private static final BasicDerAdapter<String> UTF8_STRING;

    @k
    private static final List<Q<d<? extends Object>, DerAdapter<? extends Object>>> defaultAnyChoices;

    static {
        BasicDerAdapter<Boolean> basicDerAdapter = new BasicDerAdapter<>("BOOLEAN", 0, 1L, new BasicDerAdapter.Codec<Boolean>() { // from class: okhttp3.tls.internal.der.Adapters$BOOLEAN$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public /* bridge */ /* synthetic */ void encode(DerWriter derWriter, Boolean bool) {
                encode(derWriter, bool.booleanValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            @k
            public Boolean decode(@k DerReader reader) {
                return Boolean.valueOf(reader.readBoolean());
            }

            public void encode(@k DerWriter writer, boolean value) {
                writer.writeBoolean(value);
            }
        }, false, null, false, 112, null);
        BOOLEAN = basicDerAdapter;
        INTEGER_AS_LONG = new BasicDerAdapter<>("INTEGER", 0, 2L, new BasicDerAdapter.Codec<Long>() { // from class: okhttp3.tls.internal.der.Adapters$INTEGER_AS_LONG$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public /* bridge */ /* synthetic */ void encode(DerWriter derWriter, Long l12) {
                encode(derWriter, l12.longValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            @k
            public Long decode(@k DerReader reader) {
                return Long.valueOf(reader.readLong());
            }

            public void encode(@k DerWriter writer, long value) {
                writer.writeLong(value);
            }
        }, false, null, false, 112, null);
        BasicDerAdapter<BigInteger> basicDerAdapter2 = new BasicDerAdapter<>("INTEGER", 0, 2L, new BasicDerAdapter.Codec<BigInteger>() { // from class: okhttp3.tls.internal.der.Adapters$INTEGER_AS_BIG_INTEGER$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            @k
            public BigInteger decode(@k DerReader reader) {
                return reader.readBigInteger();
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public void encode(@k DerWriter writer, @k BigInteger value) {
                writer.writeBigInteger(value);
            }
        }, false, null, false, 112, null);
        INTEGER_AS_BIG_INTEGER = basicDerAdapter2;
        boolean z12 = false;
        BasicDerAdapter<BitString> basicDerAdapter3 = new BasicDerAdapter<>("BIT STRING", 0, 3L, new BasicDerAdapter.Codec<BitString>() { // from class: okhttp3.tls.internal.der.Adapters$BIT_STRING$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            @k
            public BitString decode(@k DerReader reader) {
                return reader.readBitString();
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public void encode(@k DerWriter writer, @k BitString value) {
                writer.writeBitString(value);
            }
        }, false, null, z12, 112, null);
        BIT_STRING = basicDerAdapter3;
        BasicDerAdapter<C44805o> basicDerAdapter4 = new BasicDerAdapter<>("OCTET STRING", 0, 4L, new BasicDerAdapter.Codec<C44805o>() { // from class: okhttp3.tls.internal.der.Adapters$OCTET_STRING$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            @k
            public C44805o decode(@k DerReader reader) {
                return reader.readOctetString();
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public void encode(@k DerWriter writer, @k C44805o value) {
                writer.writeOctetString(value);
            }
        }, false, null, false, 112, null);
        OCTET_STRING = basicDerAdapter4;
        Object obj = null;
        boolean z13 = false;
        int i12 = 0;
        int i13 = 112;
        C42822w c42822w = null;
        BasicDerAdapter<G0> basicDerAdapter5 = new BasicDerAdapter<>("NULL", i12, 5L, new BasicDerAdapter.Codec<G0>() { // from class: okhttp3.tls.internal.der.Adapters$NULL$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            @l
            public G0 decode(@k DerReader reader) {
                return null;
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public void encode(@k DerWriter writer, @l G0 value) {
            }
        }, z12, obj, z13, i13, c42822w);
        NULL = basicDerAdapter5;
        Object obj2 = null;
        boolean z14 = false;
        int i14 = 0;
        boolean z15 = false;
        int i15 = 112;
        C42822w c42822w2 = null;
        BasicDerAdapter<String> basicDerAdapter6 = new BasicDerAdapter<>("OBJECT IDENTIFIER", i14, 6L, new BasicDerAdapter.Codec<String>() { // from class: okhttp3.tls.internal.der.Adapters$OBJECT_IDENTIFIER$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            @k
            public String decode(@k DerReader reader) {
                return reader.readObjectIdentifier();
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public void encode(@k DerWriter writer, @k String value) throws EOFException {
                writer.writeObjectIdentifier(value);
            }
        }, z15, obj2, z14, i15, c42822w2);
        OBJECT_IDENTIFIER = basicDerAdapter6;
        BasicDerAdapter<String> basicDerAdapter7 = new BasicDerAdapter<>("UTF8", i12, 12L, new BasicDerAdapter.Codec<String>() { // from class: okhttp3.tls.internal.der.Adapters$UTF8_STRING$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            @k
            public String decode(@k DerReader reader) {
                return reader.readUtf8String();
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public void encode(@k DerWriter writer, @k String value) {
                writer.writeUtf8(value);
            }
        }, z12, obj, z13, i13, c42822w);
        UTF8_STRING = basicDerAdapter7;
        BasicDerAdapter<String> basicDerAdapter8 = new BasicDerAdapter<>("PRINTABLE STRING", i14, 19L, new BasicDerAdapter.Codec<String>() { // from class: okhttp3.tls.internal.der.Adapters$PRINTABLE_STRING$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            @k
            public String decode(@k DerReader reader) {
                return reader.readUtf8String();
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public void encode(@k DerWriter writer, @k String value) {
                writer.writeUtf8(value);
            }
        }, z15, obj2, z14, i15, c42822w2);
        PRINTABLE_STRING = basicDerAdapter8;
        BasicDerAdapter<String> basicDerAdapter9 = new BasicDerAdapter<>("IA5 STRING", i12, 22L, new BasicDerAdapter.Codec<String>() { // from class: okhttp3.tls.internal.der.Adapters$IA5_STRING$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            @k
            public String decode(@k DerReader reader) {
                return reader.readUtf8String();
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public void encode(@k DerWriter writer, @k String value) {
                writer.writeUtf8(value);
            }
        }, z12, obj, z13, i13, c42822w);
        IA5_STRING = basicDerAdapter9;
        BasicDerAdapter<Long> basicDerAdapter10 = new BasicDerAdapter<>("UTC TIME", i14, 23L, new BasicDerAdapter.Codec<Long>() { // from class: okhttp3.tls.internal.der.Adapters$UTC_TIME$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public /* bridge */ /* synthetic */ void encode(DerWriter derWriter, Long l12) {
                encode(derWriter, l12.longValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            @k
            public Long decode(@k DerReader reader) throws ProtocolException {
                return Long.valueOf(Adapters.INSTANCE.parseUtcTime$okhttp_tls(reader.readUtf8String()));
            }

            public void encode(@k DerWriter writer, long value) {
                writer.writeUtf8(Adapters.INSTANCE.formatUtcTime$okhttp_tls(value));
            }
        }, z15, obj2, z14, i15, c42822w2);
        UTC_TIME = basicDerAdapter10;
        BasicDerAdapter<Long> basicDerAdapter11 = new BasicDerAdapter<>("GENERALIZED TIME", i12, 24L, new BasicDerAdapter.Codec<Long>() { // from class: okhttp3.tls.internal.der.Adapters$GENERALIZED_TIME$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public /* bridge */ /* synthetic */ void encode(DerWriter derWriter, Long l12) {
                encode(derWriter, l12.longValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            @k
            public Long decode(@k DerReader reader) throws ProtocolException {
                return Long.valueOf(Adapters.INSTANCE.parseGeneralizedTime$okhttp_tls(reader.readUtf8String()));
            }

            public void encode(@k DerWriter writer, long value) {
                writer.writeUtf8(Adapters.INSTANCE.formatGeneralizedTime$okhttp_tls(value));
            }
        }, z12, obj, z13, i13, c42822w);
        GENERALIZED_TIME = basicDerAdapter11;
        DerAdapter<AnyValue> derAdapter = new DerAdapter<AnyValue>() { // from class: okhttp3.tls.internal.der.Adapters$ANY_VALUE$1
            @Override // okhttp3.tls.internal.der.DerAdapter
            @k
            public BasicDerAdapter<List<AnyValue>> asSequenceOf(@k String str, int i16, long j12) {
                return DerAdapter.DefaultImpls.asSequenceOf(this, str, i16, j12);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @k
            public BasicDerAdapter<List<AnyValue>> asSetOf() {
                return DerAdapter.DefaultImpls.asSetOf(this);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public boolean matches(@k DerHeader header) {
                return true;
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @k
            public BasicDerAdapter<AnyValue> withExplicitBox(int i16, long j12, @l Boolean bool) {
                return DerAdapter.DefaultImpls.withExplicitBox(this, i16, j12, bool);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @k
            public C44805o toDer(@k AnyValue anyValue) {
                return DerAdapter.DefaultImpls.toDer(this, anyValue);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @k
            public AnyValue fromDer(@k C44805o c44805o) {
                return (AnyValue) DerAdapter.DefaultImpls.fromDer(this, c44805o);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @k
            public AnyValue fromDer(@k DerReader reader) throws ProtocolException {
                long length;
                if (reader.hasNext()) {
                    DerHeader derHeader = reader.peekedHeader;
                    reader.peekedHeader = null;
                    long j12 = reader.limit;
                    boolean z16 = reader.constructed;
                    if (derHeader.getLength() != -1) {
                        length = derHeader.getLength() + reader.getByteCount();
                    } else {
                        length = -1;
                    }
                    if (j12 == -1 || length <= j12) {
                        reader.limit = length;
                        reader.constructed = derHeader.getConstructed();
                        reader.path.add("ANY");
                        try {
                            return new AnyValue(derHeader.getTagClass(), derHeader.getTag(), derHeader.getConstructed(), derHeader.getLength(), reader.readUnknown());
                        } finally {
                            reader.peekedHeader = null;
                            reader.limit = j12;
                            reader.constructed = z16;
                            reader.path.remove(reader.path.size() - 1);
                        }
                    }
                    throw new ProtocolException("enclosed object too large");
                }
                throw new ProtocolException("expected a value");
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public void toDer(@k DerWriter writer, @k AnyValue value) {
                writer.write("ANY", value.getTagClass(), value.getTag(), new Adapters$ANY_VALUE$1$toDer$1(writer, value));
            }
        };
        ANY_VALUE = derAdapter;
        Class cls = Boolean.TYPE;
        n0 n0Var = m0.f406844a;
        defaultAnyChoices = C42745f0.U(new Q(n0Var.b(cls), basicDerAdapter), new Q(n0Var.b(BigInteger.class), basicDerAdapter2), new Q(n0Var.b(BitString.class), basicDerAdapter3), new Q(n0Var.b(C44805o.class), basicDerAdapter4), new Q(n0Var.b(G0.class), basicDerAdapter5), new Q(n0Var.b(Void.class), basicDerAdapter6), new Q(n0Var.b(Void.class), basicDerAdapter7), new Q(n0Var.b(String.class), basicDerAdapter8), new Q(n0Var.b(Void.class), basicDerAdapter9), new Q(n0Var.b(Void.class), basicDerAdapter10), new Q(n0Var.b(Long.TYPE), basicDerAdapter11), new Q(n0Var.b(AnyValue.class), derAdapter));
    }

    private Adapters() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DerAdapter any$default(Adapters adapters, Q[] qArr, boolean z12, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            qArr = (Q[]) defaultAnyChoices.toArray(new Q[0]);
        }
        if ((i12 & 2) != 0) {
            z12 = false;
        }
        if ((i12 & 4) != 0) {
            obj = null;
        }
        return adapters.any(qArr, z12, obj);
    }

    @k
    public final DerAdapter<Object> any(@k final Q<? extends d<?>, ? extends DerAdapter<?>>[] choices, final boolean isOptional, @l final Object optionalValue) {
        return new DerAdapter<Object>() { // from class: okhttp3.tls.internal.der.Adapters.any.1
            @Override // okhttp3.tls.internal.der.DerAdapter
            @k
            public BasicDerAdapter<List<Object>> asSequenceOf(@k String str, int i12, long j12) {
                return DerAdapter.DefaultImpls.asSequenceOf(this, str, i12, j12);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @k
            public BasicDerAdapter<List<Object>> asSetOf() {
                return DerAdapter.DefaultImpls.asSetOf(this);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @l
            public Object fromDer(@k C44805o c44805o) {
                return DerAdapter.DefaultImpls.fromDer(this, c44805o);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public boolean matches(@k DerHeader header) {
                return true;
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @k
            public C44805o toDer(@l Object obj) {
                return DerAdapter.DefaultImpls.toDer(this, obj);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @k
            public BasicDerAdapter<Object> withExplicitBox(int i12, long j12, @l Boolean bool) {
                return DerAdapter.DefaultImpls.withExplicitBox(this, i12, j12, bool);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @l
            public Object fromDer(@k DerReader reader) throws ProtocolException {
                if (isOptional && !reader.hasNext()) {
                    return optionalValue;
                }
                DerHeader derHeaderPeekHeader = reader.peekHeader();
                if (derHeaderPeekHeader == null) {
                    throw new ProtocolException("expected a value at " + reader);
                }
                for (Q<d<?>, DerAdapter<?>> q12 : choices) {
                    DerAdapter<?> derAdapter = q12.f406620c;
                    if (derAdapter.matches(derHeaderPeekHeader)) {
                        return derAdapter.fromDer(reader);
                    }
                }
                throw new ProtocolException("expected any but was " + derHeaderPeekHeader + " at " + reader);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public void toDer(@k DerWriter writer, @l Object value) {
                if (isOptional && L.f(value, optionalValue)) {
                    return;
                }
                for (Q<d<?>, DerAdapter<?>> q12 : choices) {
                    d<?> dVar = q12.f406619b;
                    DerAdapter<?> derAdapter = q12.f406620c;
                    if (dVar.n0(value) || (value == null && dVar.equals(m0.f406844a.b(G0.class)))) {
                        derAdapter.toDer(writer, value);
                        return;
                    }
                }
            }
        };
    }

    @k
    public final DerAdapter<Q<DerAdapter<?>, Object>> choice(@k final DerAdapter<?>... choices) {
        return new DerAdapter<Q<? extends DerAdapter<?>, ? extends Object>>() { // from class: okhttp3.tls.internal.der.Adapters.choice.1
            @Override // okhttp3.tls.internal.der.DerAdapter
            @k
            public BasicDerAdapter<List<Q<? extends DerAdapter<?>, ? extends Object>>> asSequenceOf(@k String str, int i12, long j12) {
                return DerAdapter.DefaultImpls.asSequenceOf(this, str, i12, j12);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @k
            public BasicDerAdapter<List<Q<? extends DerAdapter<?>, ? extends Object>>> asSetOf() {
                return DerAdapter.DefaultImpls.asSetOf(this);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public boolean matches(@k DerHeader header) {
                return true;
            }

            @k
            public String toString() {
                return C42756l.P(choices, " OR ", null, null, null, 62);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @k
            public BasicDerAdapter<Q<? extends DerAdapter<?>, ? extends Object>> withExplicitBox(int i12, long j12, @l Boolean bool) {
                return DerAdapter.DefaultImpls.withExplicitBox(this, i12, j12, bool);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @k
            public C44805o toDer(@k Q<? extends DerAdapter<?>, ? extends Object> q12) {
                return DerAdapter.DefaultImpls.toDer(this, q12);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @k
            public Q<? extends DerAdapter<?>, ? extends Object> fromDer(@k C44805o c44805o) {
                return (Q) DerAdapter.DefaultImpls.fromDer(this, c44805o);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @k
            public Q<? extends DerAdapter<?>, ? extends Object> fromDer(@k DerReader reader) throws ProtocolException {
                DerAdapter<?> derAdapter;
                DerHeader derHeaderPeekHeader = reader.peekHeader();
                if (derHeaderPeekHeader != null) {
                    DerAdapter<?>[] derAdapterArr = choices;
                    int length = derAdapterArr.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length) {
                            derAdapter = null;
                            break;
                        }
                        derAdapter = derAdapterArr[i12];
                        if (derAdapter.matches(derHeaderPeekHeader)) {
                            break;
                        }
                        i12++;
                    }
                    if (derAdapter != null) {
                        return new Q<>(derAdapter, derAdapter.fromDer(reader));
                    }
                    throw new ProtocolException("expected a matching choice but was " + derHeaderPeekHeader + " at " + reader);
                }
                throw new ProtocolException("expected a value at " + reader);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public void toDer(@k DerWriter writer, @k Q<? extends DerAdapter<?>, ? extends Object> value) {
                ((DerAdapter) value.f406619b).toDer(writer, value.f406620c);
            }
        };
    }

    @k
    public final String formatGeneralizedTime$okhttp_tls(long date) {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat.format(Long.valueOf(date));
    }

    @k
    public final String formatUtcTime$okhttp_tls(long date) {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.set2DigitYearStart(new Date(-631152000000L));
        return simpleDateFormat.format(Long.valueOf(date));
    }

    @k
    public final DerAdapter<AnyValue> getANY_VALUE() {
        return ANY_VALUE;
    }

    @k
    public final BasicDerAdapter<BitString> getBIT_STRING() {
        return BIT_STRING;
    }

    @k
    public final BasicDerAdapter<Boolean> getBOOLEAN() {
        return BOOLEAN;
    }

    @k
    public final BasicDerAdapter<Long> getGENERALIZED_TIME() {
        return GENERALIZED_TIME;
    }

    @k
    public final BasicDerAdapter<String> getIA5_STRING() {
        return IA5_STRING;
    }

    @k
    public final BasicDerAdapter<BigInteger> getINTEGER_AS_BIG_INTEGER() {
        return INTEGER_AS_BIG_INTEGER;
    }

    @k
    public final BasicDerAdapter<Long> getINTEGER_AS_LONG() {
        return INTEGER_AS_LONG;
    }

    @k
    public final BasicDerAdapter<G0> getNULL() {
        return NULL;
    }

    @k
    public final BasicDerAdapter<String> getOBJECT_IDENTIFIER() {
        return OBJECT_IDENTIFIER;
    }

    @k
    public final BasicDerAdapter<C44805o> getOCTET_STRING() {
        return OCTET_STRING;
    }

    @k
    public final BasicDerAdapter<String> getPRINTABLE_STRING() {
        return PRINTABLE_STRING;
    }

    @k
    public final BasicDerAdapter<Long> getUTC_TIME() {
        return UTC_TIME;
    }

    @k
    public final BasicDerAdapter<String> getUTF8_STRING() {
        return UTF8_STRING;
    }

    public final long parseGeneralizedTime$okhttp_tls(@k String string) throws ProtocolException {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        try {
            return simpleDateFormat.parse(string).getTime();
        } catch (ParseException unused) {
            throw new ProtocolException("Failed to parse GeneralizedTime ".concat(string));
        }
    }

    public final long parseUtcTime$okhttp_tls(@k String string) throws ProtocolException {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.set2DigitYearStart(new Date(-631152000000L));
        try {
            return simpleDateFormat.parse(string).getTime();
        } catch (ParseException unused) {
            throw new ProtocolException("Failed to parse UTCTime ".concat(string));
        }
    }

    @k
    public final <T> BasicDerAdapter<T> sequence(@k String name, @k final DerAdapter<?>[] members, @k final Y41.l<? super T, ? extends List<?>> decompose, @k final Y41.l<? super List<?>, ? extends T> construct) {
        return new BasicDerAdapter<>(name, 0, 16L, new BasicDerAdapter.Codec<T>() { // from class: okhttp3.tls.internal.der.Adapters$sequence$codec$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public T decode(@k DerReader reader) {
                return (T) reader.withTypeHint(new Adapters$sequence$codec$1$decode$1(members, reader, construct));
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public void encode(@k DerWriter writer, T value) {
                writer.withTypeHint(new Adapters$sequence$codec$1$encode$1(decompose.invoke(value), members, writer));
            }
        }, false, null, false, 112, null);
    }

    @k
    public final DerAdapter<Object> usingTypeHint(@k final Y41.l<Object, ? extends DerAdapter<?>> chooser) {
        return new DerAdapter<Object>() { // from class: okhttp3.tls.internal.der.Adapters.usingTypeHint.1
            @Override // okhttp3.tls.internal.der.DerAdapter
            @k
            public BasicDerAdapter<List<Object>> asSequenceOf(@k String str, int i12, long j12) {
                return DerAdapter.DefaultImpls.asSequenceOf(this, str, i12, j12);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @k
            public BasicDerAdapter<List<Object>> asSetOf() {
                return DerAdapter.DefaultImpls.asSetOf(this);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @l
            public Object fromDer(@k C44805o c44805o) {
                return DerAdapter.DefaultImpls.fromDer(this, c44805o);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public boolean matches(@k DerHeader header) {
                return true;
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @k
            public C44805o toDer(@l Object obj) {
                return DerAdapter.DefaultImpls.toDer(this, obj);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @k
            public BasicDerAdapter<Object> withExplicitBox(int i12, long j12, @l Boolean bool) {
                return DerAdapter.DefaultImpls.withExplicitBox(this, i12, j12, bool);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @l
            public Object fromDer(@k DerReader reader) {
                DerAdapter<?> derAdapterInvoke = chooser.invoke(reader.getTypeHint());
                return derAdapterInvoke != null ? derAdapterInvoke.fromDer(reader) : reader.readUnknown();
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public void toDer(@k DerWriter writer, @l Object value) {
                DerAdapter<?> derAdapterInvoke = chooser.invoke(writer.getTypeHint());
                if (derAdapterInvoke != null) {
                    derAdapterInvoke.toDer(writer, value);
                } else {
                    writer.writeOctetString((C44805o) value);
                }
            }
        };
    }
}
