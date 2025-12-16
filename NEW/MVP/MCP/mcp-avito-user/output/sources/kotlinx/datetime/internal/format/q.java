package kotlinx.datetime.internal.format;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FieldSpec.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/internal/format/q;", "Target", "Type", "Lkotlinx/datetime/internal/format/a;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class q<Target, Type> extends AbstractC43369a<Target, Type> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43370b<Target, Type> f412597a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f412598b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Type f412599c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final m<Target> f412600d;

    public q() {
        throw null;
    }

    public q(InterfaceC43370b interfaceC43370b, String str, Object obj, m mVar, int i12, C42822w c42822w) {
        str = (i12 & 2) != 0 ? interfaceC43370b.getName() : str;
        obj = (i12 & 4) != 0 ? (Type) null : obj;
        mVar = (i12 & 8) != 0 ? null : mVar;
        this.f412597a = interfaceC43370b;
        this.f412598b = str;
        this.f412599c = (Type) obj;
        this.f412600d = mVar;
    }

    @Override // kotlinx.datetime.internal.format.n
    @Y61.k
    public final InterfaceC43370b<Target, Type> a() {
        return this.f412597a;
    }

    @Override // kotlinx.datetime.internal.format.n
    @Y61.l
    public final m<Target> b() {
        return this.f412600d;
    }

    @Override // kotlinx.datetime.internal.format.n
    @Y61.l
    public final Type getDefaultValue() {
        return this.f412599c;
    }

    @Override // kotlinx.datetime.internal.format.n
    @Y61.k
    /* renamed from: getName, reason: from getter */
    public final String getF412598b() {
        return this.f412598b;
    }
}
