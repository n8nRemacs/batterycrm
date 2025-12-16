package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlinx.serialization.InterfaceC43386e;
import kotlinx.serialization.InterfaceC43389h;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: Tagged.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/internal/X0;", "Tag", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/encoding/c;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC43389h
/* loaded from: classes8.dex */
public abstract class X0<Tag> implements Decoder, kotlinx.serialization.encoding.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayList<Tag> f412827a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public boolean f412828b;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Tagged.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "", "Tag", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> extends kotlin.jvm.internal.N implements Y41.a<T> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ X0<Tag> f412829l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43386e<T> f412830m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ T f412831n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(X0<Tag> x02, InterfaceC43386e<? extends T> interfaceC43386e, T t12) {
            super(0);
            this.f412829l = x02;
            this.f412830m = interfaceC43386e;
            this.f412831n = t12;
        }

        @Override // Y41.a
        @Y61.l
        public final T invoke() {
            InterfaceC43386e<T> interfaceC43386e = this.f412830m;
            boolean zB2 = interfaceC43386e.getF412706c().b();
            X0<Tag> x02 = this.f412829l;
            if (zB2 || x02.E()) {
                return (T) x02.m(interfaceC43386e);
            }
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Tagged.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "Tag", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b<T> extends kotlin.jvm.internal.N implements Y41.a<T> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ X0<Tag> f412832l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43386e<T> f412833m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ T f412834n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(X0<Tag> x02, InterfaceC43386e<? extends T> interfaceC43386e, T t12) {
            super(0);
            this.f412832l = x02;
            this.f412833m = interfaceC43386e;
            this.f412834n = t12;
        }

        @Override // Y41.a
        public final T invoke() {
            return (T) this.f412832l.m(this.f412833m);
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder
    @Y61.k
    public Decoder A(@Y61.k SerialDescriptor serialDescriptor) {
        return L(T(), serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final float B() {
        return K(T());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean C() {
        return b(T());
    }

    @Override // kotlinx.serialization.encoding.c
    public final boolean D(@Y61.k SerialDescriptor serialDescriptor, int i12) {
        return b(S(serialDescriptor, i12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.Decoder
    public boolean E() {
        Object objS = C42745f0.S(this.f412827a);
        if (objS == null) {
            return false;
        }
        return O(objS);
    }

    @Override // kotlinx.serialization.encoding.c
    public final short F(@Y61.k SerialDescriptor serialDescriptor, int i12) {
        return P(S(serialDescriptor, i12));
    }

    public byte G(Tag tag) {
        R();
        throw null;
    }

    public char H(Tag tag) {
        R();
        throw null;
    }

    public double I(Tag tag) {
        R();
        throw null;
    }

    public int J(Tag tag, @Y61.k SerialDescriptor serialDescriptor) {
        R();
        throw null;
    }

    public float K(Tag tag) {
        R();
        throw null;
    }

    @Y61.k
    public Decoder L(Tag tag, @Y61.k SerialDescriptor serialDescriptor) {
        this.f412827a.add(tag);
        return this;
    }

    public int M(Tag tag) {
        R();
        throw null;
    }

    public long N(Tag tag) {
        R();
        throw null;
    }

    public boolean O(Tag tag) {
        return true;
    }

    public short P(Tag tag) {
        R();
        throw null;
    }

    @Y61.k
    public String Q(Tag tag) {
        R();
        throw null;
    }

    @Y61.k
    public final void R() {
        throw new SerializationException(kotlin.jvm.internal.m0.f406844a.b(getClass()) + " can't retrieve untyped values");
    }

    public abstract String S(@Y61.k SerialDescriptor serialDescriptor, int i12);

    public final Tag T() {
        ArrayList<Tag> arrayList = this.f412827a;
        Tag tagRemove = arrayList.remove(C42745f0.J(arrayList));
        this.f412828b = true;
        return tagRemove;
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.c
    @Y61.k
    /* renamed from: a */
    public kotlinx.serialization.modules.f getF413093d() {
        return kotlinx.serialization.modules.m.f413167a;
    }

    public boolean b(Tag tag) {
        R();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.c
    @Y61.l
    public final <T> T f(@Y61.k SerialDescriptor serialDescriptor, int i12, @Y61.k InterfaceC43386e<? extends T> interfaceC43386e, @Y61.l T t12) {
        String strS = S(serialDescriptor, i12);
        a aVar = new a(this, interfaceC43386e, t12);
        this.f412827a.add(strS);
        T t13 = (T) aVar.invoke();
        if (!this.f412828b) {
            T();
        }
        this.f412828b = false;
        return t13;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final double g() {
        return I(T());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int h(@Y61.k SerialDescriptor serialDescriptor) {
        return J(T(), serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.c
    public final float k(@Y61.k SerialDescriptor serialDescriptor, int i12) {
        return K(S(serialDescriptor, i12));
    }

    @Override // kotlinx.serialization.encoding.c
    public final double l(@Y61.k SerialDescriptor serialDescriptor, int i12) {
        return I(S(serialDescriptor, i12));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public <T> T m(@Y61.k InterfaceC43386e<? extends T> interfaceC43386e) {
        return interfaceC43386e.deserialize(this);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final byte n() {
        return G(T());
    }

    @Override // kotlinx.serialization.encoding.c
    public final char o(@Y61.k I0 i02, int i12) {
        return H(S(i02, i12));
    }

    @Override // kotlinx.serialization.encoding.c
    public final long p(@Y61.k SerialDescriptor serialDescriptor, int i12) {
        return N(S(serialDescriptor, i12));
    }

    @Override // kotlinx.serialization.encoding.c
    public final int q(@Y61.k SerialDescriptor serialDescriptor, int i12) {
        return M(S(serialDescriptor, i12));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final long r() {
        return N(T());
    }

    @Override // kotlinx.serialization.encoding.c
    @Y61.k
    public final String s(@Y61.k SerialDescriptor serialDescriptor, int i12) {
        return Q(S(serialDescriptor, i12));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final short t() {
        return P(T());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final char u() {
        return H(T());
    }

    @Override // kotlinx.serialization.encoding.c
    public final <T> T v(@Y61.k SerialDescriptor serialDescriptor, int i12, @Y61.k InterfaceC43386e<? extends T> interfaceC43386e, @Y61.l T t12) {
        String strS = S(serialDescriptor, i12);
        b bVar = new b(this, interfaceC43386e, t12);
        this.f412827a.add(strS);
        T t13 = (T) bVar.invoke();
        if (!this.f412828b) {
            T();
        }
        this.f412828b = false;
        return t13;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    @Y61.k
    public final String w() {
        return Q(T());
    }

    @Override // kotlinx.serialization.encoding.c
    @Y61.k
    public final Decoder x(@Y61.k I0 i02, int i12) {
        return L(S(i02, i12), i02.h(i12));
    }

    @Override // kotlinx.serialization.encoding.c
    public final byte y(@Y61.k I0 i02, int i12) {
        return G(S(i02, i12));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int z() {
        return M(T());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    @Y61.k
    public kotlinx.serialization.encoding.c c(@Y61.k SerialDescriptor serialDescriptor) {
        return this;
    }

    @Override // kotlinx.serialization.encoding.c
    public void d(@Y61.k SerialDescriptor serialDescriptor) {
    }
}
