package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlinx.serialization.InterfaceC43387f;
import kotlinx.serialization.InterfaceC43389h;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: Tagged.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/internal/Y0;", "Tag", "Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/encoding/d;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC43389h
/* loaded from: classes8.dex */
public abstract class Y0<Tag> implements Encoder, kotlinx.serialization.encoding.d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayList<Tag> f412837a = new ArrayList<>();

    @Override // kotlinx.serialization.encoding.Encoder
    @Y61.k
    public final kotlinx.serialization.encoding.d A(@Y61.k SerialDescriptor serialDescriptor) {
        return c(serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void B(double d12) {
        K(W(), d12);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void C() {
        Q(W());
    }

    @Override // kotlinx.serialization.encoding.d
    public final void D(int i12, int i13, @Y61.k SerialDescriptor serialDescriptor) {
        O(i13, V(serialDescriptor, i12));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void E() {
        C42745f0.Q(this.f412837a);
    }

    @Override // kotlinx.serialization.encoding.d
    public final <T> void F(@Y61.k SerialDescriptor serialDescriptor, int i12, @Y61.k kotlinx.serialization.x<? super T> xVar, T t12) {
        this.f412837a.add(V(serialDescriptor, i12));
        f(xVar, t12);
    }

    @Override // kotlinx.serialization.encoding.d
    public final void G(@Y61.k SerialDescriptor serialDescriptor, int i12, double d12) {
        K(V(serialDescriptor, i12), d12);
    }

    public void H(Tag tag, boolean z12) {
        T(tag, Boolean.valueOf(z12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void I(byte b12, Object obj) {
        T(obj, Byte.valueOf(b12));
    }

    public void J(Tag tag, char c12) {
        T(tag, Character.valueOf(c12));
    }

    public void K(Tag tag, double d12) {
        T(tag, Double.valueOf(d12));
    }

    public void L(Tag tag, @Y61.k SerialDescriptor serialDescriptor, int i12) {
        T(tag, Integer.valueOf(i12));
    }

    public void M(Tag tag, float f12) {
        T(tag, Float.valueOf(f12));
    }

    @Y61.k
    public Encoder N(Tag tag, @Y61.k SerialDescriptor serialDescriptor) {
        this.f412837a.add(tag);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void O(int i12, Object obj) {
        T(obj, Integer.valueOf(i12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void P(long j12, Object obj) {
        T(obj, Long.valueOf(j12));
    }

    public void Q(Tag tag) {
        throw new SerializationException("null is not supported");
    }

    public void R(Tag tag, short s5) {
        T(tag, Short.valueOf(s5));
    }

    public void S(Tag tag, @Y61.k String str) {
        T(tag, str);
    }

    public void T(Tag tag, @Y61.k Object obj) {
        StringBuilder sb2 = new StringBuilder("Non-serializable ");
        Class<?> cls = obj.getClass();
        kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
        sb2.append(n0Var.b(cls));
        sb2.append(" is not supported by ");
        sb2.append(n0Var.b(getClass()));
        sb2.append(" encoder");
        throw new SerializationException(sb2.toString());
    }

    public abstract String V(@Y61.k SerialDescriptor serialDescriptor, int i12);

    public final Tag W() {
        ArrayList<Tag> arrayList = this.f412837a;
        if (arrayList.isEmpty()) {
            throw new SerializationException("No tag in stack for requested element");
        }
        return arrayList.remove(C42745f0.J(arrayList));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    @Y61.k
    /* renamed from: a */
    public kotlinx.serialization.modules.f getF413104e() {
        return kotlinx.serialization.modules.m.f413167a;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void b(@Y61.k String str) {
        S(W(), str);
    }

    @Override // kotlinx.serialization.encoding.d
    public final void d(@Y61.k SerialDescriptor serialDescriptor) {
        if (!this.f412837a.isEmpty()) {
            W();
        }
        U();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.Encoder
    public <T> void f(@Y61.k kotlinx.serialization.x<? super T> xVar, T t12) {
        xVar.serialize(this, t12);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void g(@Y61.k SerialDescriptor serialDescriptor, int i12) {
        L(W(), serialDescriptor, i12);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    @Y61.k
    public Encoder h(@Y61.k SerialDescriptor serialDescriptor) {
        return N(W(), serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void i(short s5) {
        R(W(), s5);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void j(boolean z12) {
        H(W(), z12);
    }

    @Override // kotlinx.serialization.encoding.d
    public final void k(@Y61.k SerialDescriptor serialDescriptor, int i12, boolean z12) {
        H(V(serialDescriptor, i12), z12);
    }

    @Override // kotlinx.serialization.encoding.d
    public final void l(@Y61.k SerialDescriptor serialDescriptor, int i12, @Y61.k String str) {
        S(V(serialDescriptor, i12), str);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void m(int i12) {
        O(i12, W());
    }

    @Override // kotlinx.serialization.encoding.d
    public final void n(@Y61.k SerialDescriptor serialDescriptor, int i12, short s5) {
        R(V(serialDescriptor, i12), s5);
    }

    @Override // kotlinx.serialization.encoding.d
    public final void o(@Y61.k SerialDescriptor serialDescriptor, int i12, long j12) {
        P(j12, V(serialDescriptor, i12));
    }

    @Override // kotlinx.serialization.encoding.d
    public <T> void p(@Y61.k SerialDescriptor serialDescriptor, int i12, @Y61.k kotlinx.serialization.x<? super T> xVar, @Y61.l T t12) {
        this.f412837a.add(V(serialDescriptor, i12));
        if (xVar.getF412706c().b()) {
            f(xVar, t12);
        } else if (t12 == null) {
            C();
        } else {
            E();
            f(xVar, t12);
        }
    }

    @Override // kotlinx.serialization.encoding.d
    public final void q(@Y61.k I0 i02, int i12, byte b12) {
        I(b12, V(i02, i12));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void r(long j12) {
        P(j12, W());
    }

    @Override // kotlinx.serialization.encoding.d
    public final void s(@Y61.k SerialDescriptor serialDescriptor, int i12, float f12) {
        M(V(serialDescriptor, i12), f12);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void t(char c12) {
        J(W(), c12);
    }

    @Override // kotlinx.serialization.encoding.d
    @InterfaceC43387f
    public boolean u() {
        return true;
    }

    @Override // kotlinx.serialization.encoding.d
    public final void v(@Y61.k I0 i02, int i12, char c12) {
        J(V(i02, i12), c12);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void w(byte b12) {
        I(b12, W());
    }

    @Override // kotlinx.serialization.encoding.d
    @Y61.k
    public final Encoder x(@Y61.k I0 i02, int i12) {
        return N(V(i02, i12), i02.h(i12));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void y(float f12) {
        M(W(), f12);
    }

    public void U() {
    }

    @Override // kotlinx.serialization.encoding.Encoder
    @Y61.k
    public kotlinx.serialization.encoding.d c(@Y61.k SerialDescriptor serialDescriptor) {
        return this;
    }
}
