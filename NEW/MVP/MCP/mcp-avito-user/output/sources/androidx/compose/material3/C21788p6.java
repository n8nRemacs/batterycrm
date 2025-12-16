package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: DateRangePicker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "dateInMillis", "Lkotlin/G0;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.p6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21788p6 extends kotlin.jvm.internal.N implements Y41.l<Long, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Long f37019l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Long f37020m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<Long, Long, kotlin.G0> f37021n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21788p6(Long l12, Long l13, Y41.p<? super Long, ? super Long, kotlin.G0> pVar) {
        super(1);
        this.f37019l = l12;
        this.f37020m = l13;
        this.f37021n = pVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Long l12) {
        long jLongValue = l12.longValue();
        androidx.compose.foundation.layout.V1 v12 = C21811q6.f37145a;
        Long l13 = this.f37019l;
        Long l14 = this.f37020m;
        Y41.p<Long, Long, kotlin.G0> pVar = this.f37021n;
        if (!(l13 == null && l14 == null) && ((l13 == null || l14 == null) && l13 != null && jLongValue >= l13.longValue())) {
            pVar.invoke(l13, Long.valueOf(jLongValue));
        } else {
            pVar.invoke(Long.valueOf(jLongValue), null);
        }
        return kotlin.G0.f406611a;
    }
}
