package kotlinx.datetime.internal.format;

import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.H;
import kotlinx.datetime.internal.format.parser.C43378d;

/* compiled from: FieldFormatDirective.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/internal/format/k;", "Target", "Lkotlinx/datetime/internal/format/l;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class k<Target> implements l<Target> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final q f412527a;

    /* renamed from: b, reason: collision with root package name */
    public final int f412528b;

    /* renamed from: c, reason: collision with root package name */
    public final int f412529c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<Integer> f412530d;

    /* compiled from: FieldFormatDirective.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<Target, I51.c> {
        @Override // Y41.l
        public final I51.c invoke(Object obj) {
            return (I51.c) ((InterfaceC43370b) this.receiver).b(obj);
        }
    }

    public k(@Y61.k q qVar, int i12, int i13, @Y61.k List list) {
        this.f412527a = qVar;
        this.f412528b = i12;
        this.f412529c = i13;
        this.f412530d = list;
    }

    @Override // kotlinx.datetime.internal.format.l
    @Y61.k
    public final n<Target, I51.c> a() {
        return this.f412527a;
    }

    @Override // kotlinx.datetime.internal.format.l
    @Y61.k
    public final J51.e<Target> b() {
        return new J51.d(new a(1, this.f412527a.f412597a, InterfaceC43370b.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0), this.f412528b, this.f412529c, this.f412530d);
    }

    @Override // kotlinx.datetime.internal.format.l
    @Y61.k
    public final kotlinx.datetime.internal.format.parser.v<Target> c() {
        q qVar = this.f412527a;
        return new kotlinx.datetime.internal.format.parser.v<>(Collections.singletonList(new kotlinx.datetime.internal.format.parser.k(Collections.singletonList(new C43378d(this.f412528b, this.f412529c, qVar.f412597a, qVar.f412598b)))), C42784z0.f406748b);
    }
}
