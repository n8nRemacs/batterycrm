package shark.internal;

import kotlin.Metadata;
import shark.X1;

/* compiled from: AndroidReferenceReaders.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshark/X1;", "reference", "Lshark/internal/C0;", "invoke", "(Lshark/X1;)Lshark/internal/C0;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* renamed from: shark.internal.i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C48281i extends kotlin.jvm.internal.N implements Y41.l<X1, C0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f438560l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48281i(long j12) {
        super(1);
        this.f438560l = j12;
    }

    @Override // Y41.l
    public final C0 invoke(X1 x12) {
        Long lD2 = x12.d();
        if (lD2 != null) {
            return new C0(lD2.longValue(), false, new C48279h(this));
        }
        kotlin.jvm.internal.L.k();
        throw null;
    }
}
