package shark;

import kotlin.Metadata;
import shark.M1;

/* compiled from: HeapObject.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshark/M1$c;", "it", "", "invoke", "(Lshark/M1$c;)Z", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
final class O1 extends kotlin.jvm.internal.N implements Y41.l<M1.c, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ M1.b f438170l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O1(M1.b bVar) {
        super(1);
        this.f438170l = bVar;
    }

    @Override // Y41.l
    public final Boolean invoke(M1.c cVar) {
        return Boolean.valueOf(cVar.f438150d.f438474b == this.f438170l.f438147e);
    }
}
