package kotlinx.datetime.internal.format.parser;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.datetime.internal.format.parser.InterfaceC43377c;

/* compiled from: Parser.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081@\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003:\u0001\u0004\u0088\u0001\u0005\u0092\u0001\b\u0012\u0004\u0012\u00028\u00000\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/datetime/internal/format/parser/n;", "Lkotlinx/datetime/internal/format/parser/c;", "Output", "", "a", "commands", "Lkotlinx/datetime/internal/format/parser/v;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X41.g
/* loaded from: classes8.dex */
public final class n<Output extends InterfaceC43377c<Output>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final v<Output> f412575a;

    /* compiled from: Parser.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/internal/format/parser/n$a;", "Output", "", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<Output> {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC43377c f412576a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final v<Output> f412577b;

        /* renamed from: c, reason: collision with root package name */
        public final int f412578c;

        public a(InterfaceC43377c interfaceC43377c, @Y61.k v vVar, int i12) {
            this.f412576a = interfaceC43377c;
            this.f412577b = vVar;
            this.f412578c = i12;
        }
    }

    /* JADX WARN: Type inference failed for: r9v13, types: [Y41.a, kotlin.jvm.internal.N] */
    public static InterfaceC43377c a(v vVar, CharSequence charSequence, InterfaceC43377c interfaceC43377c) throws ParseException {
        String string;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListE0 = C42745f0.e0(new a(interfaceC43377c, vVar, 0));
        while (true) {
            a aVar = (a) C42745f0.o0(arrayListE0);
            if (aVar == null) {
                if (arrayList.size() > 1) {
                    C42745f0.z0(arrayList, new o());
                }
                if (arrayList.size() == 1) {
                    string = "Position " + ((l) arrayList.get(0)).f412571a + ": " + ((String) ((l) arrayList.get(0)).f412572b.invoke());
                } else {
                    StringBuilder sb2 = new StringBuilder(arrayList.size() * 33);
                    C42745f0.N(arrayList, sb2, ", ", "Errors: ", null, q.f412580l, 56);
                    string = sb2.toString();
                }
                throw new ParseException(string);
            }
            InterfaceC43377c interfaceC43377c2 = (InterfaceC43377c) aVar.f412576a.a();
            v<Output> vVar2 = aVar.f412577b;
            int size = vVar2.f412584a.size();
            int iIntValue = aVar.f412578c;
            int i12 = 0;
            while (true) {
                if (i12 < size) {
                    Object objA = ((s) vVar2.f412584a.get(i12)).a(interfaceC43377c2, charSequence, iIntValue);
                    if (objA instanceof Integer) {
                        iIntValue = ((Number) objA).intValue();
                        i12++;
                    } else {
                        if (!(objA instanceof l)) {
                            throw new IllegalStateException(("Unexpected parse result: " + objA).toString());
                        }
                        arrayList.add((l) objA);
                    }
                } else {
                    List<v<Output>> list = vVar2.f412585b;
                    if (!list.isEmpty()) {
                        int size2 = list.size() - 1;
                        if (size2 >= 0) {
                            while (true) {
                                int i13 = size2 - 1;
                                arrayListE0.add(new a(interfaceC43377c2, (v) list.get(size2), iIntValue));
                                if (i13 < 0) {
                                    break;
                                }
                                size2 = i13;
                            }
                        }
                    } else {
                        if (iIntValue == charSequence.length()) {
                            return interfaceC43377c2;
                        }
                        arrayList.add(new l(iIntValue, p.f412579l));
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return L.f(this.f412575a, ((n) obj).f412575a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f412575a.hashCode();
    }

    public final String toString() {
        return "Parser(commands=" + this.f412575a + ')';
    }
}
