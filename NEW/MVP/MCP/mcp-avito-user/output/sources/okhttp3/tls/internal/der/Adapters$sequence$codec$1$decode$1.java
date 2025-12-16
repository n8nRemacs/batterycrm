package okhttp3.tls.internal.der;

import Y41.a;
import Y41.l;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Adapters.kt */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Adapters$sequence$codec$1$decode$1<T> extends N implements a<T> {
    final /* synthetic */ l<List<?>, T> $construct;
    final /* synthetic */ DerAdapter<?>[] $members;
    final /* synthetic */ DerReader $reader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Adapters$sequence$codec$1$decode$1(DerAdapter<?>[] derAdapterArr, DerReader derReader, l<? super List<?>, ? extends T> lVar) {
        super(0);
        this.$members = derAdapterArr;
        this.$reader = derReader;
        this.$construct = lVar;
    }

    @Override // Y41.a
    public final T invoke() throws ProtocolException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            int size = arrayList.size();
            DerAdapter<?>[] derAdapterArr = this.$members;
            if (size >= derAdapterArr.length) {
                break;
            }
            arrayList.add(derAdapterArr[arrayList.size()].fromDer(this.$reader));
        }
        if (!this.$reader.hasNext()) {
            return this.$construct.invoke(arrayList);
        }
        throw new ProtocolException("unexpected " + this.$reader.peekHeader() + " at " + this.$reader);
    }
}
