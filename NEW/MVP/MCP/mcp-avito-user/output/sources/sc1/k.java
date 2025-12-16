package sc1;

import java.util.Arrays;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class k extends N implements Y41.l {

    /* renamed from: l, reason: collision with root package name */
    public static final k f437930l = new k();

    public k() {
        super(1);
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
    }
}
