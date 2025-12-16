package kotlinx.serialization.encoding;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlinx.serialization.InterfaceC43387f;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.I0;
import kotlinx.serialization.x;

/* compiled from: AbstractEncoder.kt */
@InterfaceC43387f
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/encoding/b;", "Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/encoding/d;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class b implements Encoder, d {
    @Override // kotlinx.serialization.encoding.Encoder
    @k
    public final d A(@k SerialDescriptor serialDescriptor) {
        return c(serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void B(double d12) {
        I(Double.valueOf(d12));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void C() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // kotlinx.serialization.encoding.d
    public final void D(int i12, int i13, @k SerialDescriptor serialDescriptor) {
        H(serialDescriptor, i12);
        m(i13);
    }

    @Override // kotlinx.serialization.encoding.d
    public final <T> void F(@k SerialDescriptor serialDescriptor, int i12, @k x<? super T> xVar, T t12) {
        H(serialDescriptor, i12);
        f(xVar, t12);
    }

    @Override // kotlinx.serialization.encoding.d
    public final void G(@k SerialDescriptor serialDescriptor, int i12, double d12) {
        H(serialDescriptor, i12);
        B(d12);
    }

    public void I(@k Object obj) {
        StringBuilder sb2 = new StringBuilder("Non-serializable ");
        Class<?> cls = obj.getClass();
        n0 n0Var = m0.f406844a;
        sb2.append(n0Var.b(cls));
        sb2.append(" is not supported by ");
        sb2.append(n0Var.b(getClass()));
        sb2.append(" encoder");
        throw new SerializationException(sb2.toString());
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void b(@k String str) {
        I(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.Encoder
    public <T> void f(@k x<? super T> xVar, T t12) {
        xVar.serialize(this, t12);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void g(@k SerialDescriptor serialDescriptor, int i12) {
        I(Integer.valueOf(i12));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void i(short s5) {
        I(Short.valueOf(s5));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void j(boolean z12) {
        I(Boolean.valueOf(z12));
    }

    @Override // kotlinx.serialization.encoding.d
    public final void k(@k SerialDescriptor serialDescriptor, int i12, boolean z12) {
        H(serialDescriptor, i12);
        j(z12);
    }

    @Override // kotlinx.serialization.encoding.d
    public final void l(@k SerialDescriptor serialDescriptor, int i12, @k String str) {
        H(serialDescriptor, i12);
        b(str);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void m(int i12) {
        I(Integer.valueOf(i12));
    }

    @Override // kotlinx.serialization.encoding.d
    public final void n(@k SerialDescriptor serialDescriptor, int i12, short s5) {
        H(serialDescriptor, i12);
        i(s5);
    }

    @Override // kotlinx.serialization.encoding.d
    public final void o(@k SerialDescriptor serialDescriptor, int i12, long j12) {
        H(serialDescriptor, i12);
        r(j12);
    }

    @Override // kotlinx.serialization.encoding.d
    public <T> void p(@k SerialDescriptor serialDescriptor, int i12, @k x<? super T> xVar, @l T t12) {
        H(serialDescriptor, i12);
        if (xVar.getF412706c().b()) {
            f(xVar, t12);
        } else if (t12 == null) {
            C();
        } else {
            f(xVar, t12);
        }
    }

    @Override // kotlinx.serialization.encoding.d
    public final void q(@k I0 i02, int i12, byte b12) {
        H(i02, i12);
        w(b12);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void r(long j12) {
        I(Long.valueOf(j12));
    }

    @Override // kotlinx.serialization.encoding.d
    public final void s(@k SerialDescriptor serialDescriptor, int i12, float f12) {
        H(serialDescriptor, i12);
        y(f12);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void t(char c12) {
        I(Character.valueOf(c12));
    }

    @Override // kotlinx.serialization.encoding.d
    @InterfaceC43387f
    public boolean u() {
        return true;
    }

    @Override // kotlinx.serialization.encoding.d
    public final void v(@k I0 i02, int i12, char c12) {
        H(i02, i12);
        t(c12);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void w(byte b12) {
        I(Byte.valueOf(b12));
    }

    @Override // kotlinx.serialization.encoding.d
    @k
    public final Encoder x(@k I0 i02, int i12) {
        H(i02, i12);
        return h(i02.h(i12));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void y(float f12) {
        I(Float.valueOf(f12));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    @InterfaceC43387f
    public final void E() {
    }

    @Override // kotlinx.serialization.encoding.Encoder
    @k
    public d c(@k SerialDescriptor serialDescriptor) {
        return this;
    }

    @Override // kotlinx.serialization.encoding.d
    public void d(@k SerialDescriptor serialDescriptor) {
    }

    @Override // kotlinx.serialization.encoding.Encoder
    @k
    public Encoder h(@k SerialDescriptor serialDescriptor) {
        return this;
    }

    public void H(@k SerialDescriptor serialDescriptor, int i12) {
    }
}
