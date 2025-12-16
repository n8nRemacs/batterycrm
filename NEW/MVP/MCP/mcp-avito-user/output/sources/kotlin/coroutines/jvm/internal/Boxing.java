package kotlin.coroutines.jvm.internal;

import X41.i;
import Y61.k;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;
import kotlin.X;

/* compiled from: boxing.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0006H\u0001\u001a\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\tH\u0001\u001a\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\fH\u0001\u001a\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000fH\u0001\u001a\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0012H\u0001\u001a\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0015H\u0001\u001a\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0018H\u0001¨\u0006\u0019"}, d2 = {"boxBoolean", "Ljava/lang/Boolean;", "primitive", "", "boxByte", "Ljava/lang/Byte;", "", "boxChar", "Ljava/lang/Character;", "", "boxDouble", "Ljava/lang/Double;", "", "boxFloat", "Ljava/lang/Float;", "", "boxInt", "Ljava/lang/Integer;", "", "boxLong", "Ljava/lang/Long;", "", "boxShort", "Ljava/lang/Short;", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@i
/* loaded from: classes8.dex */
public final class Boxing {
    @X
    @InterfaceC42733c0
    @k
    public static final Boolean boxBoolean(boolean z12) {
        return Boolean.valueOf(z12);
    }

    @X
    @InterfaceC42733c0
    @k
    public static final Byte boxByte(byte b12) {
        return Byte.valueOf(b12);
    }

    @X
    @InterfaceC42733c0
    @k
    public static final Character boxChar(char c12) {
        return new Character(c12);
    }

    @X
    @InterfaceC42733c0
    @k
    public static final Double boxDouble(double d12) {
        return new Double(d12);
    }

    @X
    @InterfaceC42733c0
    @k
    public static final Float boxFloat(float f12) {
        return new Float(f12);
    }

    @X
    @InterfaceC42733c0
    @k
    public static final Integer boxInt(int i12) {
        return new Integer(i12);
    }

    @X
    @InterfaceC42733c0
    @k
    public static final Long boxLong(long j12) {
        return new Long(j12);
    }

    @X
    @InterfaceC42733c0
    @k
    public static final Short boxShort(short s5) {
        return new Short(s5);
    }
}
