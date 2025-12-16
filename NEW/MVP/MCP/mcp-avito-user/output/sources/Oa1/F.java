package Oa1;

import java.util.Arrays;

/* loaded from: classes9.dex */
public final class F extends kotlin.jvm.internal.N implements Y41.l<Byte, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public static final F f12331l = new F();

    public F() {
        super(1);
    }

    @Override // Y41.l
    public final CharSequence invoke(Byte b12) {
        return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b12.byteValue())}, 1));
    }
}
