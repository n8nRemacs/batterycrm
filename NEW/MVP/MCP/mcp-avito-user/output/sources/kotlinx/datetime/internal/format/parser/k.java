package kotlinx.datetime.internal.format.parser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.datetime.internal.format.parser.m;

/* compiled from: ParserOperation.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/internal/format/parser/k;", "Output", "Lkotlinx/datetime/internal/format/parser/s;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class k<Output> implements s<Output> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<AbstractC43379e<Output>> f412568a;

    /* renamed from: b, reason: collision with root package name */
    public final int f412569b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f412570c;

    /* JADX WARN: Multi-variable type inference failed */
    public k(@Y61.k List<? extends AbstractC43379e<? super Output>> list) {
        boolean z12;
        boolean z13;
        int i12;
        this.f412568a = list;
        Iterator it = list.iterator();
        int i13 = 0;
        while (true) {
            int iIntValue = 1;
            if (!it.hasNext()) {
                break;
            }
            Integer f412554a = ((AbstractC43379e) it.next()).getF412554a();
            if (f412554a != null) {
                iIntValue = f412554a.intValue();
            }
            i13 += iIntValue;
        }
        this.f412569b = i13;
        List<AbstractC43379e<Output>> list2 = this.f412568a;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z12 = false;
        } else {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((AbstractC43379e) it2.next()).getF412554a() == null) {
                    z12 = true;
                    break;
                }
            }
            z12 = false;
        }
        this.f412570c = z12;
        List<AbstractC43379e<Output>> list3 = this.f412568a;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            z13 = true;
        } else {
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                Integer f412554a2 = ((AbstractC43379e) it3.next()).getF412554a();
                if (!((f412554a2 != null ? f412554a2.intValue() : Integer.MAX_VALUE) > 0)) {
                    z13 = false;
                    break;
                }
            }
            z13 = true;
        }
        if (!z13) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        List<AbstractC43379e<Output>> list4 = this.f412568a;
        if ((list4 instanceof Collection) && list4.isEmpty()) {
            i12 = 0;
        } else {
            Iterator<T> it4 = list4.iterator();
            i12 = 0;
            while (it4.hasNext()) {
                if ((((AbstractC43379e) it4.next()).getF412554a() == null) && (i12 = i12 + 1) < 0) {
                    C42745f0.G0();
                    throw null;
                }
            }
        }
        if (i12 <= 1) {
            return;
        }
        List<AbstractC43379e<Output>> list5 = this.f412568a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list5) {
            if (((AbstractC43379e) obj).getF412554a() == null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList2.add(((AbstractC43379e) it5.next()).f412555b);
        }
        throw new IllegalArgumentException(("At most one variable-length numeric field in a row is allowed, but got several: " + arrayList2 + ". Parsing is undefined: for example, with variable-length month number and variable-length day of month, '111' can be parsed as Jan 11th or Nov 1st.").toString());
    }

    @Override // kotlinx.datetime.internal.format.parser.s
    @Y61.k
    public final Object a(InterfaceC43377c interfaceC43377c, @Y61.k CharSequence charSequence, int i12) {
        int i13 = this.f412569b;
        if (i12 + i13 > charSequence.length()) {
            m.a aVar = m.f412573b;
            h hVar = new h(this);
            aVar.getClass();
            return m.a.a(i12, hVar);
        }
        l0.f fVar = new l0.f();
        while (fVar.f406840b + i12 < charSequence.length() && I51.h.a(charSequence.charAt(fVar.f406840b + i12))) {
            fVar.f406840b++;
        }
        if (fVar.f406840b < i13) {
            m.a aVar2 = m.f412573b;
            i iVar = new i(fVar, this);
            aVar2.getClass();
            return m.a.a(i12, iVar);
        }
        List<AbstractC43379e<Output>> list = this.f412568a;
        int size = list.size();
        int i14 = 0;
        while (i14 < size) {
            Integer f412554a = list.get(i14).getF412554a();
            int iIntValue = (f412554a != null ? f412554a.intValue() : (fVar.f406840b - i13) + 1) + i12;
            g gVarA = list.get(i14).a(interfaceC43377c, charSequence, i12, iIntValue);
            if (gVarA != null) {
                String string = charSequence.subSequence(i12, iIntValue).toString();
                m.a aVar3 = m.f412573b;
                j jVar = new j(string, this, i14, gVarA);
                aVar3.getClass();
                return m.a.a(i12, jVar);
            }
            i14++;
            i12 = iIntValue;
        }
        m.f412573b.getClass();
        return Integer.valueOf(i12);
    }

    public final String b() {
        String str;
        List<AbstractC43379e<Output>> list = this.f412568a;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            AbstractC43379e abstractC43379e = (AbstractC43379e) it.next();
            StringBuilder sb2 = new StringBuilder();
            Integer f412554a = abstractC43379e.getF412554a();
            if (f412554a == null) {
                str = "at least one digit";
            } else {
                str = f412554a + " digits";
            }
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(abstractC43379e.f412555b);
            arrayList.add(sb2.toString());
        }
        boolean z12 = this.f412570c;
        int i12 = this.f412569b;
        if (z12) {
            return "a number with at least " + i12 + " digits: " + arrayList;
        }
        return "a number with exactly " + i12 + " digits: " + arrayList;
    }

    @Y61.k
    public final String toString() {
        return b();
    }
}
