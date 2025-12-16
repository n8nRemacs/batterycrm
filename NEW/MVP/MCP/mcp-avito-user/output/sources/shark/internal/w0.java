package shark.internal;

import kotlin.Metadata;

/* compiled from: ObjectArrayReferenceReader.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "index", "", "elementObjectId", "Lshark/internal/C0;", "invoke", "(IJ)Lshark/internal/C0;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
final class w0 extends kotlin.jvm.internal.N implements Y41.p<Integer, Long, C0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f438627l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(long j12) {
        super(2);
        this.f438627l = j12;
    }

    @Override // Y41.p
    public final C0 invoke(Integer num, Long l12) {
        return new C0(l12.longValue(), false, new v0(this, num.intValue()));
    }
}
