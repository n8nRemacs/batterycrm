package shark;

import kotlin.Metadata;
import okio.InterfaceC44803m;
import shark.AbstractC48345t2;
import shark.C48353v2;

/* compiled from: HprofWriter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lokio/m;", "Lkotlin/G0;", "invoke", "(Lokio/m;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* renamed from: shark.y2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C48365y2 extends kotlin.jvm.internal.N implements Y41.l<InterfaceC44803m, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C48353v2 f438808l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC48345t2 f438809m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48365y2(C48353v2 c48353v2, AbstractC48345t2 abstractC48345t2) {
        super(1);
        this.f438808l = c48353v2;
        this.f438809m = abstractC48345t2;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(InterfaceC44803m interfaceC44803m) {
        InterfaceC44803m interfaceC44803m2 = interfaceC44803m;
        AbstractC48345t2.e eVar = (AbstractC48345t2.e) this.f438809m;
        interfaceC44803m2.writeInt(eVar.f438761a);
        interfaceC44803m2.writeInt(eVar.f438762b);
        long[] jArr = eVar.f438763c;
        interfaceC44803m2.writeInt(jArr.length);
        C48353v2.a aVar = C48353v2.f438790e;
        C48353v2 c48353v2 = this.f438808l;
        c48353v2.getClass();
        for (long j12 : jArr) {
            c48353v2.b(interfaceC44803m2, j12);
        }
        return kotlin.G0.f406611a;
    }
}
