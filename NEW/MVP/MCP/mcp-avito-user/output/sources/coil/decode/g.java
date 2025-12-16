package coil.decode;

import coil.view.Scale;
import j.U;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DecodeUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcoil/decode/g;", "", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f58292a = 0;

    /* compiled from: DecodeUtils.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Scale.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Scale scale = Scale.f58755b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        new g();
    }

    @X41.n
    public static final double a(@U int i12, @U int i13, @U int i14, @U int i15, @Y61.k Scale scale) {
        double d12 = i14 / i12;
        double d13 = i15 / i13;
        int iOrdinal = scale.ordinal();
        if (iOrdinal == 0) {
            return Math.max(d12, d13);
        }
        if (iOrdinal == 1) {
            return Math.min(d12, d13);
        }
        throw new NoWhenBranchMatchedException();
    }
}
