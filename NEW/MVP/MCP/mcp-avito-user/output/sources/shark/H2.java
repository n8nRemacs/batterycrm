package shark;

import kotlin.Metadata;

/* compiled from: LeakTrace.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "index", "", "<anonymous parameter 1>", "Lshark/LeakTraceReference;", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
final class H2 extends kotlin.jvm.internal.N implements Y41.p<Integer, LeakTraceReference, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ LeakTrace f438048l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H2(LeakTrace leakTrace) {
        super(2);
        this.f438048l = leakTrace;
    }

    @Override // Y41.p
    public final Boolean invoke(Integer num, LeakTraceReference leakTraceReference) {
        return Boolean.valueOf(this.f438048l.d(num.intValue()));
    }
}
