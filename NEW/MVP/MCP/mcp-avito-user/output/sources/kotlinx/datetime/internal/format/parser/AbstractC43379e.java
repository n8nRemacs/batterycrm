package kotlinx.datetime.internal.format.parser;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NumberConsumer.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002\u0082\u0001\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/datetime/internal/format/parser/e;", "Receiver", "", "Lkotlinx/datetime/internal/format/parser/b;", "Lkotlinx/datetime/internal/format/parser/d;", "Lkotlinx/datetime/internal/format/parser/z;", "Lkotlinx/datetime/internal/format/parser/F;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.datetime.internal.format.parser.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43379e<Receiver> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Integer f412554a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f412555b;

    public AbstractC43379e(Integer num, String str, C42822w c42822w) {
        this.f412554a = num;
        this.f412555b = str;
    }

    @Y61.l
    public abstract g a(InterfaceC43377c interfaceC43377c, @Y61.k CharSequence charSequence, int i12, int i13);

    @Y61.l
    /* renamed from: b, reason: from getter */
    public Integer getF412554a() {
        return this.f412554a;
    }
}
