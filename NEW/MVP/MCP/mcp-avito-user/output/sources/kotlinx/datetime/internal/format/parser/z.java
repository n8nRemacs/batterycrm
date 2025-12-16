package kotlinx.datetime.internal.format.parser;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.datetime.internal.format.InterfaceC43370b;
import kotlinx.datetime.internal.format.parser.g;

/* compiled from: NumberConsumer.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/internal/format/parser/z;", "Receiver", "Lkotlinx/datetime/internal/format/parser/e;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class z<Receiver> extends AbstractC43379e<Receiver> {

    /* renamed from: c, reason: collision with root package name */
    public final int f412592c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43370b f412593d;

    /* renamed from: e, reason: collision with root package name */
    public final int f412594e;

    /* renamed from: f, reason: collision with root package name */
    public final int f412595f;

    /* renamed from: g, reason: collision with root package name */
    public final int f412596g;

    public z(@Y61.k InterfaceC43370b interfaceC43370b, @Y61.k String str, int i12) {
        super(2, str, null);
        this.f412592c = 2;
        this.f412593d = interfaceC43370b;
        int i13 = I51.f.f7951a[2];
        this.f412594e = i13;
        int i14 = i12 % i13;
        this.f412595f = i14;
        this.f412596g = i12 - i14;
    }

    @Override // kotlinx.datetime.internal.format.parser.AbstractC43379e
    @Y61.l
    public final g a(InterfaceC43377c interfaceC43377c, @Y61.k CharSequence charSequence, int i12, int i13) {
        int iCharAt = 0;
        while (i12 < i13) {
            iCharAt = (iCharAt * 10) + (charSequence.charAt(i12) - '0');
            i12++;
        }
        int i14 = this.f412595f;
        int i15 = this.f412596g;
        if (iCharAt < i14) {
            i15 += this.f412594e;
        }
        Field fieldC = this.f412593d.c(interfaceC43377c, Integer.valueOf(i15 + iCharAt));
        if (fieldC == 0) {
            return null;
        }
        return new g.a(fieldC);
    }

    @Override // kotlinx.datetime.internal.format.parser.AbstractC43379e
    @Y61.k
    /* renamed from: b */
    public final Integer getF412554a() {
        return Integer.valueOf(this.f412592c);
    }
}
