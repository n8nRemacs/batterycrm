package okhttp3.tls.internal.der;

import Y41.a;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Adapters.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class Adapters$sequence$codec$1$encode$1 extends N implements a<G0> {
    final /* synthetic */ List<?> $list;
    final /* synthetic */ DerAdapter<?>[] $members;
    final /* synthetic */ DerWriter $writer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Adapters$sequence$codec$1$encode$1(List<?> list, DerAdapter<?>[] derAdapterArr, DerWriter derWriter) {
        super(0);
        this.$list = list;
        this.$members = derAdapterArr;
        this.$writer = derWriter;
    }

    @Override // Y41.a
    public /* bridge */ /* synthetic */ G0 invoke() {
        invoke2();
        return G0.f406611a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        int size = this.$list.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.$members[i12].toDer(this.$writer, this.$list.get(i12));
        }
    }
}
