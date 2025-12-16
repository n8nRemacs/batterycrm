package shark.internal;

import kotlin.Metadata;
import shark.AbstractC48368z1;
import shark.g3;

/* compiled from: JavaLocalReferenceReader.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lshark/z1$d;", "frame", "Lshark/internal/C0;", "invoke", "(Lshark/z1$d;)Lshark/internal/C0;", "shark/internal/JavaLocalReferenceReader$read$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
final class o0 extends kotlin.jvm.internal.N implements Y41.l<AbstractC48368z1.d, C0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f438579l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g3 f438580m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(long j12, g3 g3Var) {
        super(1);
        this.f438579l = j12;
        this.f438580m = g3Var;
    }

    @Override // Y41.l
    public final C0 invoke(AbstractC48368z1.d dVar) {
        return new C0(dVar.f438815a, true, new n0(this));
    }
}
