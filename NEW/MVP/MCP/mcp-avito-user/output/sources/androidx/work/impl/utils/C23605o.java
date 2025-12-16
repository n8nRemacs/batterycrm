package androidx.work.impl.utils;

import android.net.NetworkRequest;
import androidx.work.impl.utils.r;
import j.X;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: NetworkRequestCompat.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/utils/o;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@X
/* renamed from: androidx.work.impl.utils.o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C23605o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C23605o f56023a = new C23605o();

    @X41.n
    @Y61.k
    public static final NetworkRequest a(@Y61.k int[] iArr, @Y61.k int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i12 : iArr) {
            try {
                builder.addCapability(i12);
            } catch (IllegalArgumentException unused) {
                androidx.work.G gA2 = androidx.work.G.a();
                r.f56026b.getClass();
                r.a aVar = r.f56026b;
                gA2.getClass();
            }
        }
        for (int i13 : iArr2) {
            builder.addTransportType(i13);
        }
        return builder.build();
    }
}
