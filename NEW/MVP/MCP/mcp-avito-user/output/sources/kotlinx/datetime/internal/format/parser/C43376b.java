package kotlinx.datetime.internal.format.parser;

import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlinx.datetime.internal.format.parser.g;

/* compiled from: NumberConsumer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/internal/format/parser/b;", "Receiver", "Lkotlinx/datetime/internal/format/parser/e;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.datetime.internal.format.parser.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43376b<Receiver> extends AbstractC43379e<Receiver> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f412550c;

    public C43376b(@Y61.k String str) {
        super(Integer.valueOf(str.length()), "the predefined string ".concat(str), null);
        this.f412550c = str;
    }

    @Override // kotlinx.datetime.internal.format.parser.AbstractC43379e
    @Y61.l
    public final g a(InterfaceC43377c interfaceC43377c, @Y61.k CharSequence charSequence, int i12, int i13) {
        String string = charSequence.subSequence(i12, i13).toString();
        String str = this.f412550c;
        if (L.f(string, str)) {
            return null;
        }
        return new g.e(str);
    }
}
