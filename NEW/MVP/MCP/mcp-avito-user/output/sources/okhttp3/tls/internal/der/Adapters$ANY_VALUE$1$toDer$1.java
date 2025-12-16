package okhttp3.tls.internal.der;

import Y41.l;
import Y61.k;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import okio.InterfaceC44803m;

/* compiled from: Adapters.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lokio/m;", "it", "Lkotlin/G0;", "invoke", "(Lokio/m;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class Adapters$ANY_VALUE$1$toDer$1 extends N implements l<InterfaceC44803m, G0> {
    final /* synthetic */ AnyValue $value;
    final /* synthetic */ DerWriter $writer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Adapters$ANY_VALUE$1$toDer$1(DerWriter derWriter, AnyValue anyValue) {
        super(1);
        this.$writer = derWriter;
        this.$value = anyValue;
    }

    @Override // Y41.l
    public /* bridge */ /* synthetic */ G0 invoke(InterfaceC44803m interfaceC44803m) {
        invoke2(interfaceC44803m);
        return G0.f406611a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@k InterfaceC44803m interfaceC44803m) {
        this.$writer.writeOctetString(this.$value.getBytes());
        this.$writer.setConstructed(this.$value.getConstructed());
    }
}
