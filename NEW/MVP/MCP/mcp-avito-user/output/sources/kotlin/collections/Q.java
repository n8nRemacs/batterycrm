package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42809i;

/* compiled from: _Arrays.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class Q extends kotlin.jvm.internal.N implements Y41.a<Iterator<Object>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object[] f406649l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(Object[] objArr) {
        super(0);
        this.f406649l = objArr;
    }

    @Override // Y41.a
    public final Iterator<Object> invoke() {
        return C42809i.a(this.f406649l);
    }
}
