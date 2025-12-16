package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: ElementMarker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/H;", "", "a", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C
/* loaded from: classes8.dex */
public final class H {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final long[] f412774e;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SerialDescriptor f412775a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.p<SerialDescriptor, Integer, Boolean> f412776b;

    /* renamed from: c, reason: collision with root package name */
    public long f412777c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final long[] f412778d;

    /* compiled from: ElementMarker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/serialization/internal/H$a;", "", "<init>", "()V", "", "EMPTY_HIGH_MARKS", "[J", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f412774e = new long[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public H(@Y61.k SerialDescriptor serialDescriptor, @Y61.k Y41.p<? super SerialDescriptor, ? super Integer, Boolean> pVar) {
        this.f412775a = serialDescriptor;
        this.f412776b = pVar;
        int iC2 = serialDescriptor.c();
        if (iC2 <= 64) {
            this.f412777c = iC2 != 64 ? (-1) << iC2 : 0L;
            this.f412778d = f412774e;
            return;
        }
        this.f412777c = 0L;
        int i12 = (iC2 - 1) >>> 6;
        long[] jArr = new long[i12];
        if ((iC2 & 63) != 0) {
            jArr[i12 - 1] = (-1) << iC2;
        }
        this.f412778d = jArr;
    }
}
