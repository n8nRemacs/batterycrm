package kotlinx.datetime.internal.format.parser;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.datetime.internal.format.parser.g;

/* compiled from: NumberConsumer.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/internal/format/parser/F;", "Receiver", "Lkotlinx/datetime/internal/format/parser/e;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class F<Receiver> extends AbstractC43379e<Receiver> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f412546c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f412547d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43375a<Receiver, Integer> f412548e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f412549f;

    public /* synthetic */ F(Integer num, Integer num2, InterfaceC43375a interfaceC43375a, String str, boolean z12, int i12, C42822w c42822w) {
        this(num, num2, interfaceC43375a, str, (i12 & 16) != 0 ? false : z12);
    }

    @Override // kotlinx.datetime.internal.format.parser.AbstractC43379e
    @Y61.l
    public final g a(InterfaceC43377c interfaceC43377c, @Y61.k CharSequence charSequence, int i12, int i13) {
        Integer numValueOf;
        Integer num = this.f412547d;
        if (num != null && i13 - i12 > num.intValue()) {
            return new g.d(num.intValue());
        }
        Integer num2 = this.f412546c;
        if (num2 != null && i13 - i12 < num2.intValue()) {
            return new g.c(num2.intValue());
        }
        int iCharAt = 0;
        while (true) {
            if (i12 >= i13) {
                numValueOf = Integer.valueOf(iCharAt);
                break;
            }
            iCharAt = (iCharAt * 10) + (charSequence.charAt(i12) - '0');
            if (iCharAt < 0) {
                numValueOf = null;
                break;
            }
            i12++;
        }
        if (numValueOf == null) {
            return g.b.f412557a;
        }
        boolean z12 = this.f412549f;
        int iIntValue = numValueOf.intValue();
        if (z12) {
            iIntValue = -iIntValue;
        }
        Integer numC = this.f412548e.c(interfaceC43377c, Integer.valueOf(iIntValue));
        if (numC == null) {
            return null;
        }
        return new g.a(numC);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public F(@Y61.l Integer num, @Y61.l Integer num2, @Y61.k InterfaceC43375a<? super Receiver, Integer> interfaceC43375a, @Y61.k String str, boolean z12) {
        super(L.f(num, num2) ? num : null, str, null);
        this.f412546c = num;
        this.f412547d = num2;
        this.f412548e = interfaceC43375a;
        this.f412549f = z12;
        if (this.f412554a == null || new kotlin.ranges.l(1, 9, 1).h(this.f412554a.intValue())) {
            return;
        }
        throw new IllegalArgumentException(("Invalid length for field " + this.f412555b + ": " + this.f412554a).toString());
    }
}
