package shark.internal;

import kotlin.Metadata;
import shark.C48240c2;

/* compiled from: ObjectArrayReferenceReader.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "objectId", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
final class u0 extends kotlin.jvm.internal.N implements Y41.l<Long, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C48240c2 f438608l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(C48240c2 c48240c2) {
        super(1);
        this.f438608l = c48240c2;
    }

    @Override // Y41.l
    public final Boolean invoke(Long l12) {
        long jLongValue = l12.longValue();
        return Boolean.valueOf(jLongValue != 0 && this.f438608l.k(jLongValue));
    }
}
