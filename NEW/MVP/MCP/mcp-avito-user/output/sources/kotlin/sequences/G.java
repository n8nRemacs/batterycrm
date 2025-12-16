package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Iterables.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u001c\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlin/collections/j0", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class G implements Iterable<Object>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43030m f410479b;

    public G(InterfaceC43030m interfaceC43030m) {
        this.f410479b = interfaceC43030m;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return this.f410479b.iterator();
    }
}
