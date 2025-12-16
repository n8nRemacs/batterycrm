package okhttp3.tls.internal.der;

import Y41.a;
import Y61.k;
import Y61.l;
import androidx.media3.exoplayer.analytics.m;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.internal.n;
import okio.C44802l;
import okio.C44805o;
import okio.InterfaceC44803m;

/* compiled from: DerWriter.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00152\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\u000bJ\u0015\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020\f¢\u0006\u0004\b-\u0010+J\u0015\u0010.\u001a\u00020\t2\u0006\u0010,\u001a\u00020\f¢\u0006\u0004\b.\u0010+J\u000f\u0010/\u001a\u00020\fH\u0016¢\u0006\u0004\b/\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\f018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103R\"\u00106\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010\u001cR(\u0010?\u001a\u0004\u0018\u00010\u00012\b\u0010\u001e\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lokhttp3/tls/internal/der/DerWriter;", "", "Lokio/m;", "sink", "<init>", "(Lokio/m;)V", "()Lokio/m;", "", "v", "Lkotlin/G0;", "writeVariableLengthLong", "(J)V", "", "name", "", "tagClass", "tag", "Lkotlin/Function1;", "block", "write", "(Ljava/lang/String;IJLY41/l;)V", "T", "Lkotlin/Function0;", "withTypeHint", "(LY41/a;)Ljava/lang/Object;", "", "b", "writeBoolean", "(Z)V", "Ljava/math/BigInteger;", "value", "writeBigInteger", "(Ljava/math/BigInteger;)V", "writeLong", "Lokhttp3/tls/internal/der/BitString;", "bitString", "writeBitString", "(Lokhttp3/tls/internal/der/BitString;)V", "Lokio/o;", "byteString", "writeOctetString", "(Lokio/o;)V", "writeUtf8", "(Ljava/lang/String;)V", "s", "writeObjectIdentifier", "writeRelativeObjectIdentifier", "toString", "()Ljava/lang/String;", "", "stack", "Ljava/util/List;", "typeHintStack", "path", "constructed", "Z", "getConstructed", "()Z", "setConstructed", "getTypeHint", "()Ljava/lang/Object;", "setTypeHint", "(Ljava/lang/Object;)V", "typeHint", "okhttp-tls"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DerWriter {
    private boolean constructed;

    @k
    private final List<InterfaceC44803m> stack;

    @k
    private final List<Object> typeHintStack = new ArrayList();

    @k
    private final List<String> path = new ArrayList();

    public DerWriter(@k InterfaceC44803m interfaceC44803m) {
        this.stack = C42745f0.e0(interfaceC44803m);
    }

    private final InterfaceC44803m sink() {
        return (InterfaceC44803m) m.h(1, this.stack);
    }

    private final void writeVariableLengthLong(long v12) {
        InterfaceC44803m interfaceC44803mSink = sink();
        int iNumberOfLeadingZeros = (((70 - Long.numberOfLeadingZeros(v12)) / 7) - 1) * 7;
        int iA2 = n.a(iNumberOfLeadingZeros, 0, -7);
        if (iA2 > iNumberOfLeadingZeros) {
            return;
        }
        while (true) {
            interfaceC44803mSink.writeByte((iNumberOfLeadingZeros == 0 ? 0 : 128) | ((int) ((v12 >> iNumberOfLeadingZeros) & 127)));
            if (iNumberOfLeadingZeros == iA2) {
                return;
            } else {
                iNumberOfLeadingZeros -= 7;
            }
        }
    }

    public final boolean getConstructed() {
        return this.constructed;
    }

    @l
    public final Object getTypeHint() {
        return C42745f0.S(this.typeHintStack);
    }

    public final void setConstructed(boolean z12) {
        this.constructed = z12;
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

    public final void write(@k String name, int tagClass, long tag, @k Y41.l<? super InterfaceC44803m, G0> block) {
        C44802l c44802l = new C44802l();
        this.stack.add(c44802l);
        this.constructed = false;
        this.path.add(name);
        try {
            block.invoke(c44802l);
            int i12 = this.constructed ? 32 : 0;
            this.constructed = true;
            List<InterfaceC44803m> list = this.stack;
            list.remove(list.size() - 1);
            List<String> list2 = this.path;
            list2.remove(list2.size() - 1);
            InterfaceC44803m interfaceC44803mSink = sink();
            if (tag < 31) {
                interfaceC44803mSink.writeByte(tagClass | i12 | ((int) tag));
            } else {
                interfaceC44803mSink.writeByte(tagClass | i12 | 31);
                writeVariableLengthLong(tag);
            }
            long j12 = c44802l.f420125c;
            if (j12 < 128) {
                interfaceC44803mSink.writeByte((int) j12);
            } else {
                int iNumberOfLeadingZeros = (71 - Long.numberOfLeadingZeros(j12)) / 8;
                interfaceC44803mSink.writeByte(iNumberOfLeadingZeros | 128);
                int i13 = (iNumberOfLeadingZeros - 1) * 8;
                int iA2 = n.a(i13, 0, -8);
                if (iA2 <= i13) {
                    while (true) {
                        interfaceC44803mSink.writeByte((int) (j12 >> i13));
                        if (i13 == iA2) {
                            break;
                        } else {
                            i13 -= 8;
                        }
                    }
                }
            }
            interfaceC44803mSink.h2(c44802l);
        } catch (Throwable th2) {
            List<InterfaceC44803m> list3 = this.stack;
            list3.remove(list3.size() - 1);
            List<String> list4 = this.path;
            list4.remove(list4.size() - 1);
            throw th2;
        }
    }

    public final void writeBigInteger(@k BigInteger value) {
        sink().write(value.toByteArray());
    }

    public final void writeBitString(@k BitString bitString) {
        InterfaceC44803m interfaceC44803mSink = sink();
        interfaceC44803mSink.writeByte(bitString.getUnusedBitsCount());
        interfaceC44803mSink.B1(bitString.getByteString());
    }

    public final void writeBoolean(boolean b12) {
        sink().writeByte(b12 ? -1 : 0);
    }

    public final void writeLong(long v12) {
        InterfaceC44803m interfaceC44803mSink = sink();
        int iNumberOfLeadingZeros = ((((65 - (v12 < 0 ? Long.numberOfLeadingZeros(~v12) : Long.numberOfLeadingZeros(v12))) + 7) / 8) - 1) * 8;
        int iA2 = n.a(iNumberOfLeadingZeros, 0, -8);
        if (iA2 > iNumberOfLeadingZeros) {
            return;
        }
        while (true) {
            interfaceC44803mSink.writeByte((int) (v12 >> iNumberOfLeadingZeros));
            if (iNumberOfLeadingZeros == iA2) {
                return;
            } else {
                iNumberOfLeadingZeros -= 8;
            }
        }
    }

    public final void writeObjectIdentifier(@k String s5) throws EOFException {
        C44802l c44802l = new C44802l();
        c44802l.O(s5);
        long jY2 = c44802l.Y2();
        if (c44802l.readByte() != 46) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        writeVariableLengthLong((jY2 * 40) + c44802l.Y2());
        while (!c44802l.W2()) {
            if (c44802l.readByte() != 46) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            writeVariableLengthLong(c44802l.Y2());
        }
    }

    public final void writeOctetString(@k C44805o byteString) {
        sink().B1(byteString);
    }

    public final void writeRelativeObjectIdentifier(@k String s5) {
        C44802l c44802l = new C44802l();
        c44802l.D(46);
        c44802l.O(s5);
        while (!c44802l.W2()) {
            if (c44802l.readByte() != 46) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            writeVariableLengthLong(c44802l.Y2());
        }
    }

    public final void writeUtf8(@k String value) {
        sink().b2(value);
    }
}
