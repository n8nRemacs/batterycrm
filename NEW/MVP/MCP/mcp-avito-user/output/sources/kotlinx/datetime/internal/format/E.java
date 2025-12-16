package kotlinx.datetime.internal.format;

import androidx.camera.camera2.internal.G;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FieldSpec.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/internal/format/E;", "Target", "Lkotlinx/datetime/internal/format/a;", "", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class E<Target> extends AbstractC43369a<Target, Integer> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43370b<Target, Integer> f412505a;

    /* renamed from: b, reason: collision with root package name */
    public final int f412506b;

    /* renamed from: c, reason: collision with root package name */
    public final int f412507c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f412508d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Integer f412509e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final m<Target> f412510f;

    /* renamed from: g, reason: collision with root package name */
    public final int f412511g;

    public E() {
        throw null;
    }

    public E(InterfaceC43370b interfaceC43370b, int i12, int i13, String str, Integer num, m mVar, int i14, C42822w c42822w) {
        int i15;
        str = (i14 & 8) != 0 ? interfaceC43370b.getName() : str;
        num = (i14 & 16) != 0 ? null : num;
        mVar = (i14 & 32) != 0 ? null : mVar;
        this.f412505a = interfaceC43370b;
        this.f412506b = i12;
        this.f412507c = i13;
        this.f412508d = str;
        this.f412509e = num;
        this.f412510f = mVar;
        if (i13 < 10) {
            i15 = 1;
        } else if (i13 < 100) {
            i15 = 2;
        } else {
            if (i13 >= 1000) {
                throw new IllegalArgumentException(G.e(i13, "Max value ", " is too large"));
            }
            i15 = 3;
        }
        this.f412511g = i15;
    }

    @Override // kotlinx.datetime.internal.format.n
    @Y61.k
    public final InterfaceC43370b<Target, Integer> a() {
        return this.f412505a;
    }

    @Override // kotlinx.datetime.internal.format.n
    @Y61.l
    public final m<Target> b() {
        return this.f412510f;
    }

    @Override // kotlinx.datetime.internal.format.n
    public final Object getDefaultValue() {
        return this.f412509e;
    }

    @Override // kotlinx.datetime.internal.format.n
    @Y61.k
    /* renamed from: getName, reason: from getter */
    public final String getF412508d() {
        return this.f412508d;
    }
}
