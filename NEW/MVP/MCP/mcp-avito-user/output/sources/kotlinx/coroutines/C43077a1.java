package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.a1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43077a1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.coroutines.internal.a0 f410749a = new kotlinx.coroutines.internal.a0("COMPLETING_ALREADY");

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final kotlinx.coroutines.internal.a0 f410750b = new kotlinx.coroutines.internal.a0("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.coroutines.internal.a0 f410751c = new kotlinx.coroutines.internal.a0("COMPLETING_RETRY");

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.coroutines.internal.a0 f410752d = new kotlinx.coroutines.internal.a0("TOO_LATE_TO_CANCEL");

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.coroutines.internal.a0 f410753e = new kotlinx.coroutines.internal.a0("SEALED");

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final C43273r0 f410754f = new C43273r0(false);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final C43273r0 f410755g = new C43273r0(true);

    @Y61.l
    public static final Object a(@Y61.l Object obj) {
        F0 f02;
        G0 g02 = obj instanceof G0 ? (G0) obj : null;
        return (g02 == null || (f02 = g02.f410697a) == null) ? obj : f02;
    }
}
