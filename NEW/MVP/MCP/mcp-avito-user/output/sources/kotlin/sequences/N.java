package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: _Sequences.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class N extends kotlin.jvm.internal.H implements Y41.l<Iterable<Object>, Iterator<Object>> {

    /* renamed from: b, reason: collision with root package name */
    public static final N f410485b = new N();

    public N() {
        super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // Y41.l
    public final Iterator<Object> invoke(Iterable<Object> iterable) {
        return iterable.iterator();
    }
}
