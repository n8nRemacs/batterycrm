package kotlinx.datetime.internal.format;

import androidx.camera.camera2.internal.G;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: FieldFormatDirective.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/internal/format/F;", "Target", "Lkotlinx/datetime/internal/format/l;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class F<Target> implements l<Target> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final E<Target> f412512a;

    /* renamed from: b, reason: collision with root package name */
    public final int f412513b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f412514c;

    /* renamed from: d, reason: collision with root package name */
    public final int f412515d;

    /* compiled from: FieldFormatDirective.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<Target, Integer> {
        @Override // Y41.l
        public final Integer invoke(Object obj) {
            return (Integer) ((InterfaceC43370b) this.receiver).b(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public F(@Y61.k E<? super Target> e12, int i12, @Y61.l Integer num) {
        this.f412512a = e12;
        this.f412513b = i12;
        this.f412514c = num;
        int i13 = e12.f412511g;
        this.f412515d = i13;
        if (i12 < 0) {
            throw new IllegalArgumentException(G.e(i12, "The minimum number of digits (", ") is negative").toString());
        }
        if (i13 < i12) {
            throw new IllegalArgumentException(("The maximum number of digits (" + i13 + ") is less than the minimum number of digits (" + i12 + ')').toString());
        }
        if (num == null || num.intValue() > i12) {
            return;
        }
        throw new IllegalArgumentException(("The space padding (" + num + ") should be more than the minimum number of digits (" + i12 + ')').toString());
    }

    @Override // kotlinx.datetime.internal.format.l
    public final /* bridge */ /* synthetic */ n a() {
        return this.f412512a;
    }

    @Override // kotlinx.datetime.internal.format.l
    @Y61.k
    public final J51.e<Target> b() {
        J51.k kVar = new J51.k(this.f412513b, new a(1, this.f412512a.f412505a, InterfaceC43370b.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0));
        return this.f412514c != null ? new J51.i(kVar) : kVar;
    }

    @Override // kotlinx.datetime.internal.format.l
    @Y61.k
    public final kotlinx.datetime.internal.format.parser.v<Target> c() {
        Integer numValueOf = Integer.valueOf(this.f412513b);
        Integer numValueOf2 = Integer.valueOf(this.f412515d);
        E<Target> e12 = this.f412512a;
        return kotlinx.datetime.internal.format.parser.u.a(numValueOf, numValueOf2, this.f412514c, e12.f412505a, e12.f412508d, false);
    }
}
