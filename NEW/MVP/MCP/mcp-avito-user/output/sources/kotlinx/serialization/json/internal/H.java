package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.AbstractC43443a;

/* compiled from: JsonIterator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/json/internal/H;", "T", "", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class H<T> implements Iterator<T>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AbstractC43443a f413007b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final f0 f413008c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final KSerializer f413009d;

    public H(@Y61.k AbstractC43443a abstractC43443a, @Y61.k f0 f0Var, @Y61.k KSerializer kSerializer) {
        this.f413007b = abstractC43443a;
        this.f413008c = f0Var;
        this.f413009d = kSerializer;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f413008c.v() != 10;
    }

    @Override // java.util.Iterator
    public final T next() {
        WriteMode writeMode = WriteMode.f413034d;
        KSerializer kSerializer = this.f413009d;
        SerialDescriptor f412706c = kSerializer.getF412706c();
        return (T) new i0(this.f413007b, writeMode, this.f413008c, f412706c, null).m(kSerializer);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
