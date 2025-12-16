package okhttp3.tls.internal.der;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.net.ProtocolException;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.tls.internal.der.DerAdapter;
import okio.C44805o;
import okio.InterfaceC44803m;

/* compiled from: BasicDerAdapter.kt */
@s0
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001CBM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0005H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b)\u0010&J\u0010\u0010*\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b.\u0010/Jd\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u00020\u000b2\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b6\u0010(J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\tHÂ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u000bHÂ\u0003¢\u0006\u0004\b9\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010:R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\b>\u0010+R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010?R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\b\f\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bB\u0010/R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010@¨\u0006D"}, d2 = {"Lokhttp3/tls/internal/der/BasicDerAdapter;", "T", "Lokhttp3/tls/internal/der/DerAdapter;", "", "name", "", "tagClass", "", "tag", "Lokhttp3/tls/internal/der/BasicDerAdapter$Codec;", "codec", "", "isOptional", "defaultValue", "typeHint", "<init>", "(Ljava/lang/String;IJLokhttp3/tls/internal/der/BasicDerAdapter$Codec;ZLjava/lang/Object;Z)V", "Lokhttp3/tls/internal/der/DerHeader;", "header", "matches", "(Lokhttp3/tls/internal/der/DerHeader;)Z", "Lokhttp3/tls/internal/der/DerReader;", "reader", "fromDer", "(Lokhttp3/tls/internal/der/DerReader;)Ljava/lang/Object;", "Lokhttp3/tls/internal/der/DerWriter;", "writer", "value", "Lkotlin/G0;", "toDer", "(Lokhttp3/tls/internal/der/DerWriter;Ljava/lang/Object;)V", "withTag", "(IJ)Lokhttp3/tls/internal/der/BasicDerAdapter;", "optional", "(Ljava/lang/Object;)Lokhttp3/tls/internal/der/BasicDerAdapter;", "asTypeHint", "()Lokhttp3/tls/internal/der/BasicDerAdapter;", "hashCode", "()I", "toString", "()Ljava/lang/String;", "component2", "component3", "()J", "component5", "()Z", "component6", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;IJLokhttp3/tls/internal/der/BasicDerAdapter$Codec;ZLjava/lang/Object;Z)Lokhttp3/tls/internal/der/BasicDerAdapter;", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "component1", "component4", "()Lokhttp3/tls/internal/der/BasicDerAdapter$Codec;", "component7", "Ljava/lang/String;", "I", "getTagClass", "J", "getTag", "Lokhttp3/tls/internal/der/BasicDerAdapter$Codec;", "Z", "Ljava/lang/Object;", "getDefaultValue", "Codec", "okhttp-tls"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BasicDerAdapter<T> implements DerAdapter<T> {

    @k
    private final Codec<T> codec;

    @l
    private final T defaultValue;
    private final boolean isOptional;

    @k
    private final String name;
    private final long tag;
    private final int tagClass;
    private final boolean typeHint;

    /* compiled from: BasicDerAdapter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0001H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lokhttp3/tls/internal/der/BasicDerAdapter$Codec;", "T", "", "Lokhttp3/tls/internal/der/DerReader;", "reader", "decode", "(Lokhttp3/tls/internal/der/DerReader;)Ljava/lang/Object;", "Lokhttp3/tls/internal/der/DerWriter;", "writer", "value", "Lkotlin/G0;", "encode", "(Lokhttp3/tls/internal/der/DerWriter;Ljava/lang/Object;)V", "okhttp-tls"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Codec<T> {
        T decode(@k DerReader reader);

        void encode(@k DerWriter writer, T value);
    }

    /* compiled from: BasicDerAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lokio/m;", "it", "Lkotlin/G0;", "invoke", "(Lokio/m;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: okhttp3.tls.internal.der.BasicDerAdapter$toDer$1, reason: invalid class name */
    public static final class AnonymousClass1 extends N implements Y41.l<InterfaceC44803m, G0> {
        final /* synthetic */ T $value;
        final /* synthetic */ DerWriter $writer;
        final /* synthetic */ BasicDerAdapter<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BasicDerAdapter<T> basicDerAdapter, DerWriter derWriter, T t12) {
            super(1);
            this.this$0 = basicDerAdapter;
            this.$writer = derWriter;
            this.$value = t12;
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ G0 invoke(InterfaceC44803m interfaceC44803m) {
            invoke2(interfaceC44803m);
            return G0.f406611a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@k InterfaceC44803m interfaceC44803m) {
            ((BasicDerAdapter) this.this$0).codec.encode(this.$writer, this.$value);
        }
    }

    public BasicDerAdapter(@k String str, int i12, long j12, @k Codec<T> codec, boolean z12, @l T t12, boolean z13) {
        this.name = str;
        this.tagClass = i12;
        this.tag = j12;
        this.codec = codec;
        this.isOptional = z12;
        this.defaultValue = t12;
        this.typeHint = z13;
        if (i12 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (j12 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    /* renamed from: component1, reason: from getter */
    private final String getName() {
        return this.name;
    }

    private final Codec<T> component4() {
        return this.codec;
    }

    /* renamed from: component7, reason: from getter */
    private final boolean getTypeHint() {
        return this.typeHint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BasicDerAdapter copy$default(BasicDerAdapter basicDerAdapter, String str, int i12, long j12, Codec codec, boolean z12, Object obj, boolean z13, int i13, Object obj2) {
        return basicDerAdapter.copy((i13 & 1) != 0 ? basicDerAdapter.name : str, (i13 & 2) != 0 ? basicDerAdapter.tagClass : i12, (i13 & 4) != 0 ? basicDerAdapter.tag : j12, (i13 & 8) != 0 ? basicDerAdapter.codec : codec, (i13 & 16) != 0 ? basicDerAdapter.isOptional : z12, (i13 & 32) != 0 ? basicDerAdapter.defaultValue : obj, (i13 & 64) != 0 ? basicDerAdapter.typeHint : z13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BasicDerAdapter optional$default(BasicDerAdapter basicDerAdapter, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            obj = null;
        }
        return basicDerAdapter.optional(obj);
    }

    public static /* synthetic */ BasicDerAdapter withTag$default(BasicDerAdapter basicDerAdapter, int i12, long j12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i12 = 128;
        }
        return basicDerAdapter.withTag(i12, j12);
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    @k
    public BasicDerAdapter<List<T>> asSequenceOf(@k String str, int i12, long j12) {
        return DerAdapter.DefaultImpls.asSequenceOf(this, str, i12, j12);
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    @k
    public BasicDerAdapter<List<T>> asSetOf() {
        return DerAdapter.DefaultImpls.asSetOf(this);
    }

    @k
    public final BasicDerAdapter<T> asTypeHint() {
        return copy$default(this, null, 0, 0L, null, false, null, true, 63, null);
    }

    /* renamed from: component2, reason: from getter */
    public final int getTagClass() {
        return this.tagClass;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTag() {
        return this.tag;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsOptional() {
        return this.isOptional;
    }

    @l
    public final T component6() {
        return this.defaultValue;
    }

    @k
    public final BasicDerAdapter<T> copy(@k String name, int tagClass, long tag, @k Codec<T> codec, boolean isOptional, @l T defaultValue, boolean typeHint) {
        return new BasicDerAdapter<>(name, tagClass, tag, codec, isOptional, defaultValue, typeHint);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasicDerAdapter)) {
            return false;
        }
        BasicDerAdapter basicDerAdapter = (BasicDerAdapter) other;
        return L.f(this.name, basicDerAdapter.name) && this.tagClass == basicDerAdapter.tagClass && this.tag == basicDerAdapter.tag && L.f(this.codec, basicDerAdapter.codec) && this.isOptional == basicDerAdapter.isOptional && L.f(this.defaultValue, basicDerAdapter.defaultValue) && this.typeHint == basicDerAdapter.typeHint;
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    public T fromDer(@k C44805o c44805o) {
        return (T) DerAdapter.DefaultImpls.fromDer(this, c44805o);
    }

    @l
    public final T getDefaultValue() {
        return this.defaultValue;
    }

    public final long getTag() {
        return this.tag;
    }

    public final int getTagClass() {
        return this.tagClass;
    }

    public int hashCode() {
        int iHashCode = (((this.codec.hashCode() + (((((this.name.hashCode() * 31) + this.tagClass) * 31) + ((int) this.tag)) * 31)) * 31) + (this.isOptional ? 1 : 0)) * 31;
        T t12 = this.defaultValue;
        return ((iHashCode + (t12 != null ? t12.hashCode() : 0)) * 31) + (this.typeHint ? 1 : 0);
    }

    public final boolean isOptional() {
        return this.isOptional;
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    public boolean matches(@k DerHeader header) {
        return header.getTagClass() == this.tagClass && header.getTag() == this.tag;
    }

    @k
    public final BasicDerAdapter<T> optional(@l T defaultValue) {
        return copy$default(this, null, 0, 0L, null, true, defaultValue, false, 79, null);
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    @k
    public C44805o toDer(T t12) {
        return DerAdapter.DefaultImpls.toDer(this, t12);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.name);
        sb2.append(" [");
        sb2.append(this.tagClass);
        sb2.append('/');
        return r.u(sb2, this.tag, ']');
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    @k
    public BasicDerAdapter<T> withExplicitBox(int i12, long j12, @l Boolean bool) {
        return DerAdapter.DefaultImpls.withExplicitBox(this, i12, j12, bool);
    }

    @k
    public final BasicDerAdapter<T> withTag(int tagClass, long tag) {
        return copy$default(this, null, tagClass, tag, null, false, null, false, 121, null);
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    public T fromDer(@k DerReader reader) throws ProtocolException {
        long length;
        DerHeader derHeaderPeekHeader = reader.peekHeader();
        if (derHeaderPeekHeader == null || derHeaderPeekHeader.getTagClass() != this.tagClass || derHeaderPeekHeader.getTag() != this.tag) {
            if (this.isOptional) {
                return this.defaultValue;
            }
            throw new ProtocolException("expected " + this + " but was " + derHeaderPeekHeader + " at " + reader);
        }
        String str = this.name;
        if (!reader.hasNext()) {
            throw new ProtocolException("expected a value");
        }
        DerHeader derHeader = reader.peekedHeader;
        reader.peekedHeader = null;
        long j12 = reader.limit;
        boolean z12 = reader.constructed;
        if (derHeader.getLength() != -1) {
            length = derHeader.getLength() + reader.getByteCount();
        } else {
            length = -1;
        }
        if (j12 != -1 && length > j12) {
            throw new ProtocolException("enclosed object too large");
        }
        reader.limit = length;
        reader.constructed = derHeader.getConstructed();
        if (str != null) {
            reader.path.add(str);
        }
        try {
            T tDecode = this.codec.decode(reader);
            if (length != -1 && reader.getByteCount() > length) {
                throw new ProtocolException("unexpected byte count at " + reader);
            }
            if (this.typeHint) {
                reader.setTypeHint(tDecode);
            }
            return tDecode;
        } finally {
            reader.peekedHeader = null;
            reader.limit = j12;
            reader.constructed = z12;
            if (str != null) {
                reader.path.remove(reader.path.size() - 1);
            }
        }
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    public void toDer(@k DerWriter writer, T value) {
        if (this.typeHint) {
            writer.setTypeHint(value);
        }
        if (this.isOptional && L.f(value, this.defaultValue)) {
            return;
        }
        writer.write(this.name, this.tagClass, this.tag, new AnonymousClass1(this, writer, value));
    }

    public /* synthetic */ BasicDerAdapter(String str, int i12, long j12, Codec codec, boolean z12, Object obj, boolean z13, int i13, C42822w c42822w) {
        this(str, i12, j12, codec, (i13 & 16) != 0 ? false : z12, (i13 & 32) != 0 ? null : obj, (i13 & 64) != 0 ? false : z13);
    }
}
