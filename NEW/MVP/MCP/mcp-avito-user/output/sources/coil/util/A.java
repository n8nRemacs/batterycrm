package coil.util;

import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: Time.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class A extends H implements Y41.a<Long> {
    static {
        new A();
    }

    public A() {
        super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
    }

    @Override // Y41.a
    public final Long invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
