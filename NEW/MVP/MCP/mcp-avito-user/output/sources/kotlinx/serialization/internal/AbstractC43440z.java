package kotlinx.serialization.internal;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: CollectionSerializers.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u0004\b\u0002\u0010\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/internal/z;", "E", "", "C", "B", "Lkotlinx/serialization/internal/y;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* renamed from: kotlinx.serialization.internal.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43440z<E, C extends Collection<? extends E>, B> extends AbstractC43438y<E, C, B> {
    public AbstractC43440z() {
        throw null;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final Iterator c(Object obj) {
        return ((Collection) obj).iterator();
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final int d(Object obj) {
        return ((Collection) obj).size();
    }
}
