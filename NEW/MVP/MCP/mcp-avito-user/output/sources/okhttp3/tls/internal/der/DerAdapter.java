package okhttp3.tls.internal.der;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import okhttp3.tls.internal.der.BasicDerAdapter;
import okio.C44802l;
import okio.C44805o;

/* compiled from: DerAdapter.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\n\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0000H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0015J3\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ9\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 0\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\"J\u001b\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 0\u001bH\u0016¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lokhttp3/tls/internal/der/DerAdapter;", "T", "", "Lokhttp3/tls/internal/der/DerHeader;", "header", "", "matches", "(Lokhttp3/tls/internal/der/DerHeader;)Z", "Lokhttp3/tls/internal/der/DerReader;", "reader", "fromDer", "(Lokhttp3/tls/internal/der/DerReader;)Ljava/lang/Object;", "Lokio/o;", "byteString", "(Lokio/o;)Ljava/lang/Object;", "Lokhttp3/tls/internal/der/DerWriter;", "writer", "value", "Lkotlin/G0;", "toDer", "(Lokhttp3/tls/internal/der/DerWriter;Ljava/lang/Object;)V", "(Ljava/lang/Object;)Lokio/o;", "", "tagClass", "", "tag", "forceConstructed", "Lokhttp3/tls/internal/der/BasicDerAdapter;", "withExplicitBox", "(IJLjava/lang/Boolean;)Lokhttp3/tls/internal/der/BasicDerAdapter;", "", "name", "", "asSequenceOf", "(Ljava/lang/String;IJ)Lokhttp3/tls/internal/der/BasicDerAdapter;", "asSetOf", "()Lokhttp3/tls/internal/der/BasicDerAdapter;", "okhttp-tls"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DerAdapter<T> {

    /* compiled from: DerAdapter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @k
        public static <T> BasicDerAdapter<List<T>> asSequenceOf(@k final DerAdapter<T> derAdapter, @k String str, int i12, long j12) {
            return new BasicDerAdapter<>(str, i12, j12, new BasicDerAdapter.Codec<List<? extends T>>() { // from class: okhttp3.tls.internal.der.DerAdapter$asSequenceOf$codec$1
                @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
                @k
                public List<T> decode(@k DerReader reader) {
                    ArrayList arrayList = new ArrayList();
                    while (reader.hasNext()) {
                        arrayList.add(derAdapter.fromDer(reader));
                    }
                    return arrayList;
                }

                @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
                public void encode(@k DerWriter writer, @k List<? extends T> value) {
                    Iterator<? extends T> it = value.iterator();
                    while (it.hasNext()) {
                        derAdapter.toDer(writer, it.next());
                    }
                }
            }, false, null, false, 112, null);
        }

        public static /* synthetic */ BasicDerAdapter asSequenceOf$default(DerAdapter derAdapter, String str, int i12, long j12, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asSequenceOf");
            }
            if ((i13 & 1) != 0) {
                str = "SEQUENCE OF";
            }
            if ((i13 & 2) != 0) {
                i12 = 0;
            }
            if ((i13 & 4) != 0) {
                j12 = 16;
            }
            return derAdapter.asSequenceOf(str, i12, j12);
        }

        @k
        public static <T> BasicDerAdapter<List<T>> asSetOf(@k DerAdapter<T> derAdapter) {
            return derAdapter.asSequenceOf("SET OF", 0, 17L);
        }

        public static <T> T fromDer(@k DerAdapter<T> derAdapter, @k C44805o c44805o) {
            C44802l c44802l = new C44802l();
            c44802l.B(c44805o);
            return derAdapter.fromDer(new DerReader(c44802l));
        }

        @k
        public static <T> C44805o toDer(@k DerAdapter<T> derAdapter, T t12) {
            C44802l c44802l = new C44802l();
            derAdapter.toDer(new DerWriter(c44802l), t12);
            return c44802l.W0(c44802l.f420125c);
        }

        @k
        public static <T> BasicDerAdapter<T> withExplicitBox(@k final DerAdapter<T> derAdapter, int i12, long j12, @l final Boolean bool) {
            return new BasicDerAdapter<>("EXPLICIT", i12, j12, new BasicDerAdapter.Codec<T>() { // from class: okhttp3.tls.internal.der.DerAdapter$withExplicitBox$codec$1
                @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
                public T decode(@k DerReader reader) {
                    return derAdapter.fromDer(reader);
                }

                @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
                public void encode(@k DerWriter writer, T value) {
                    derAdapter.toDer(writer, value);
                    Boolean bool2 = bool;
                    if (bool2 != null) {
                        writer.setConstructed(bool2.booleanValue());
                    }
                }
            }, false, null, false, 112, null);
        }

        public static /* synthetic */ BasicDerAdapter withExplicitBox$default(DerAdapter derAdapter, int i12, long j12, Boolean bool, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withExplicitBox");
            }
            if ((i13 & 1) != 0) {
                i12 = 128;
            }
            if ((i13 & 4) != 0) {
                bool = null;
            }
            return derAdapter.withExplicitBox(i12, j12, bool);
        }
    }

    @k
    BasicDerAdapter<List<T>> asSequenceOf(@k String name, int tagClass, long tag);

    @k
    BasicDerAdapter<List<T>> asSetOf();

    T fromDer(@k DerReader reader);

    T fromDer(@k C44805o byteString);

    boolean matches(@k DerHeader header);

    @k
    C44805o toDer(T value);

    void toDer(@k DerWriter writer, T value);

    @k
    BasicDerAdapter<T> withExplicitBox(int tagClass, long tag, @l Boolean forceConstructed);
}
