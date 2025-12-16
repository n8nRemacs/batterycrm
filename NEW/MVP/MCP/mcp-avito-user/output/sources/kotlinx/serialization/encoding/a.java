package kotlinx.serialization.encoding;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.serialization.InterfaceC43386e;
import kotlinx.serialization.InterfaceC43387f;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.I0;

/* compiled from: AbstractDecoder.kt */
@InterfaceC43387f
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/encoding/a;", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/encoding/c;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class a implements Decoder, c {
    @Override // kotlinx.serialization.encoding.Decoder
    public float B() {
        b();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean C() {
        b();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.c
    public final boolean D(@k SerialDescriptor serialDescriptor, int i12) {
        return C();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean E() {
        return true;
    }

    @Override // kotlinx.serialization.encoding.c
    public final short F(@k SerialDescriptor serialDescriptor, int i12) {
        return t();
    }

    @k
    public final void b() {
        throw new SerializationException(m0.f406844a.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // kotlinx.serialization.encoding.c
    @l
    public final <T> T f(@k SerialDescriptor serialDescriptor, int i12, @k InterfaceC43386e<? extends T> interfaceC43386e, @l T t12) {
        if (interfaceC43386e.getF412706c().b() || E()) {
            return (T) m(interfaceC43386e);
        }
        return null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public double g() {
        b();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int h(@k SerialDescriptor serialDescriptor) {
        b();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.c
    public final float k(@k SerialDescriptor serialDescriptor, int i12) {
        return B();
    }

    @Override // kotlinx.serialization.encoding.c
    public final double l(@k SerialDescriptor serialDescriptor, int i12) {
        return g();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public <T> T m(@k InterfaceC43386e<? extends T> interfaceC43386e) {
        return interfaceC43386e.deserialize(this);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public byte n() {
        b();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.c
    public final char o(@k I0 i02, int i12) {
        return u();
    }

    @Override // kotlinx.serialization.encoding.c
    public final long p(@k SerialDescriptor serialDescriptor, int i12) {
        return r();
    }

    @Override // kotlinx.serialization.encoding.c
    public final int q(@k SerialDescriptor serialDescriptor, int i12) {
        return z();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public long r() {
        b();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.c
    @k
    public final String s(@k SerialDescriptor serialDescriptor, int i12) {
        return w();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public short t() {
        b();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char u() {
        b();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.c
    public <T> T v(@k SerialDescriptor serialDescriptor, int i12, @k InterfaceC43386e<? extends T> interfaceC43386e, @l T t12) {
        return (T) m(interfaceC43386e);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    @k
    public String w() {
        b();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.c
    @k
    public final Decoder x(@k I0 i02, int i12) {
        return A(i02.h(i12));
    }

    @Override // kotlinx.serialization.encoding.c
    public final byte y(@k I0 i02, int i12) {
        return n();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int z() {
        b();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    @k
    public Decoder A(@k SerialDescriptor serialDescriptor) {
        return this;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    @k
    public c c(@k SerialDescriptor serialDescriptor) {
        return this;
    }

    @Override // kotlinx.serialization.encoding.c
    public void d(@k SerialDescriptor serialDescriptor) {
    }
}
