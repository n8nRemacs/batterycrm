package kotlinx.datetime.internal.format;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FormatStructure.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/internal/format/e;", "T", "Lkotlinx/datetime/internal/format/t;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.datetime.internal.format.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43373e<T> implements t<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l<T> f412519a;

    /* JADX WARN: Multi-variable type inference failed */
    public C43373e(@Y61.k l<? super T> lVar) {
        this.f412519a = lVar;
    }

    @Override // kotlinx.datetime.internal.format.o
    @Y61.k
    public final J51.e<T> b() {
        return this.f412519a.b();
    }

    @Override // kotlinx.datetime.internal.format.o
    @Y61.k
    public final kotlinx.datetime.internal.format.parser.v<T> c() {
        return this.f412519a.c();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof C43373e) {
            if (L.f(this.f412519a, ((C43373e) obj).f412519a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f412519a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "BasicFormatStructure(" + this.f412519a + ')';
    }
}
