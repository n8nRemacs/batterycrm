package coil.util;

import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: Time.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcoil/util/z;", "", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final z f58808a = new z();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.a<Long> f58809b = a.f58810b;

    /* compiled from: Time.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.a<Long> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f58810b = new a();

        public a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // Y41.a
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    public static long a() {
        return ((Number) ((a) f58809b).invoke()).longValue();
    }
}
