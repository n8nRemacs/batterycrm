package kotlinx.datetime.internal.format;

import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.H;

/* compiled from: FieldFormatDirective.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/internal/format/z;", "Target", "Lkotlinx/datetime/internal/format/l;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class z<Target> implements l<Target> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final q f412613a;

    /* renamed from: b, reason: collision with root package name */
    public final int f412614b;

    /* compiled from: FieldFormatDirective.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<Target, Integer> {
        @Override // Y41.l
        public final Integer invoke(Object obj) {
            return (Integer) ((InterfaceC43370b) this.receiver).b(obj);
        }
    }

    public z(@Y61.k q qVar, int i12) {
        this.f412613a = qVar;
        this.f412614b = i12;
    }

    @Override // kotlinx.datetime.internal.format.l
    @Y61.k
    public final n<Target, Integer> a() {
        return this.f412613a;
    }

    @Override // kotlinx.datetime.internal.format.l
    @Y61.k
    public final J51.e<Target> b() {
        return new J51.f(new a(1, this.f412613a.f412597a, InterfaceC43370b.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0));
    }

    @Override // kotlinx.datetime.internal.format.l
    @Y61.k
    public final kotlinx.datetime.internal.format.parser.v<Target> c() {
        q qVar = this.f412613a;
        InterfaceC43370b<Target, Type> interfaceC43370b = qVar.f412597a;
        C42784z0 c42784z0 = C42784z0.f406748b;
        int i12 = this.f412614b;
        String str = qVar.f412598b;
        return new kotlinx.datetime.internal.format.parser.v<>(c42784z0, C42745f0.U(new kotlinx.datetime.internal.format.parser.v(Collections.singletonList(new kotlinx.datetime.internal.format.parser.k(Collections.singletonList(new kotlinx.datetime.internal.format.parser.z(interfaceC43370b, str, i12)))), c42784z0), new kotlinx.datetime.internal.format.parser.v(C42745f0.U(new kotlinx.datetime.internal.format.parser.y("+"), new kotlinx.datetime.internal.format.parser.k(Collections.singletonList(new kotlinx.datetime.internal.format.parser.F(null, null, interfaceC43370b, str, false)))), c42784z0), new kotlinx.datetime.internal.format.parser.v(C42745f0.U(new kotlinx.datetime.internal.format.parser.y("-"), new kotlinx.datetime.internal.format.parser.k(Collections.singletonList(new kotlinx.datetime.internal.format.parser.F(null, null, interfaceC43370b, str, true)))), c42784z0)));
    }
}
