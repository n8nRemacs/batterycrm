package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.Z;
import kotlin.text.C43066x;

/* compiled from: ArrayPools.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.serialization.json.internal.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43457h {

    /* renamed from: a, reason: collision with root package name */
    public static final int f413088a;

    static {
        Object bVar;
        try {
            int i12 = kotlin.Z.f406624c;
            bVar = C43066x.y0(System.getProperty("kotlinx.serialization.json.pool.size"));
        } catch (Throwable th2) {
            int i13 = kotlin.Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (bVar instanceof Z.b) {
            bVar = null;
        }
        Integer num = (Integer) bVar;
        f413088a = num != null ? num.intValue() : 2097152;
    }
}
