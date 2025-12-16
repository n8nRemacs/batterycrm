package ru.avito.messenger;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ReconnectPolicy.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/avito/messenger/v0;", "", "<init>", "()V", "a", "b", "Lru/avito/messenger/v0$a;", "Lru/avito/messenger/v0$b;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class v0 {

    /* compiled from: ReconnectPolicy.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/v0$a;", "Lru/avito/messenger/v0;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends v0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final long[] f431867a;

        /* renamed from: b, reason: collision with root package name */
        public final double f431868b;

        public a() {
            this(null, 0.0d, 3, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long[] jArr, double d12, int i12, C42822w c42822w) {
            super(null);
            jArr = (i12 & 1) != 0 ? w0.f431870a : jArr;
            d12 = (i12 & 2) != 0 ? 0.2d : d12;
            this.f431867a = jArr;
            this.f431868b = d12;
        }
    }

    /* compiled from: ReconnectPolicy.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/v0$b;", "Lru/avito/messenger/v0;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends v0 {

        /* renamed from: a, reason: collision with root package name */
        public final long f431869a;

        public b() {
            super(null);
            this.f431869a = 5L;
        }
    }

    public /* synthetic */ v0(C42822w c42822w) {
        this();
    }

    public v0() {
    }
}
