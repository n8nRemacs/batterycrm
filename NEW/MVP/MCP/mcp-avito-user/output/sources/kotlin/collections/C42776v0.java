package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: _Collections.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.collections.v0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C42776v0 extends kotlin.jvm.internal.N implements Y41.a<Iterator<Object>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Iterable<Object> f406745l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42776v0(Iterable<Object> iterable) {
        super(0);
        this.f406745l = iterable;
    }

    @Override // Y41.a
    public final Iterator<Object> invoke() {
        return this.f406745l.iterator();
    }
}
