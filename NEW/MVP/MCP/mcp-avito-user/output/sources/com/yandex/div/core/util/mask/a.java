package com.yandex.div.core.util.mask;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.yandex.div.core.util.mask.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.PatternSyntaxException;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.text.C43059p;
import kotlin.text.C43066x;

/* compiled from: BaseInputMask.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/core/util/mask/a;", "", "a", "b", "c", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public b f367800a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinkedHashMap f367801b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f367802c;

    /* renamed from: d, reason: collision with root package name */
    public int f367803d;

    /* compiled from: BaseInputMask.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/div/core/util/mask/a$a;", "", "<init>", "()V", "a", "b", "Lcom/yandex/div/core/util/mask/a$a$b;", "Lcom/yandex/div/core/util/mask/a$a$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.util.mask.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC10863a {

        /* compiled from: BaseInputMask.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/util/mask/a$a$a;", "Lcom/yandex/div/core/util/mask/a$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.yandex.div.core.util.mask.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C10864a extends AbstractC10863a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public Character f367804a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final C43059p f367805b;

            /* renamed from: c, reason: collision with root package name */
            public final char f367806c;

            public C10864a(@l C43059p c43059p, char c12) {
                super(null);
                this.f367804a = null;
                this.f367805b = c43059p;
                this.f367806c = c12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10864a)) {
                    return false;
                }
                C10864a c10864a = (C10864a) obj;
                return L.f(this.f367804a, c10864a.f367804a) && L.f(this.f367805b, c10864a.f367805b) && this.f367806c == c10864a.f367806c;
            }

            public final int hashCode() {
                Character ch2 = this.f367804a;
                int iHashCode = (ch2 == null ? 0 : ch2.hashCode()) * 31;
                C43059p c43059p = this.f367805b;
                return Character.hashCode(this.f367806c) + ((iHashCode + (c43059p != null ? c43059p.hashCode() : 0)) * 31);
            }

            @k
            public final String toString() {
                return "Dynamic(char=" + this.f367804a + ", filter=" + this.f367805b + ", placeholder=" + this.f367806c + ')';
            }
        }

        /* compiled from: BaseInputMask.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/util/mask/a$a$b;", "Lcom/yandex/div/core/util/mask/a$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.yandex.div.core.util.mask.a$a$b */
        public static final /* data */ class b extends AbstractC10863a {

            /* renamed from: a, reason: collision with root package name */
            public final char f367807a;

            public b(char c12) {
                super(null);
                this.f367807a = c12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f367807a == ((b) obj).f367807a;
            }

            public final int hashCode() {
                return Character.hashCode(this.f367807a);
            }

            @k
            public final String toString() {
                return "Static(char=" + this.f367807a + ')';
            }
        }

        public /* synthetic */ AbstractC10863a(C42822w c42822w) {
            this();
        }

        public AbstractC10863a() {
        }
    }

    /* compiled from: BaseInputMask.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/util/mask/a$b;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f367808a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<c> f367809b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f367810c;

        public b(@k String str, @k List<c> list, boolean z12) {
            this.f367808a = str;
            this.f367809b = list;
            this.f367810c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f367808a, bVar.f367808a) && L.f(this.f367809b, bVar.f367809b) && this.f367810c == bVar.f367810c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int iE2 = H.e(this.f367808a.hashCode() * 31, 31, this.f367809b);
            boolean z12 = this.f367810c;
            int i12 = z12;
            if (z12 != 0) {
                i12 = 1;
            }
            return iE2 + i12;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MaskData(pattern=");
            sb2.append(this.f367808a);
            sb2.append(", decoding=");
            sb2.append(this.f367809b);
            sb2.append(", alwaysVisible=");
            return r.x(sb2, this.f367810c, ')');
        }
    }

    /* compiled from: BaseInputMask.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/util/mask/a$c;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final char f367811a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f367812b;

        /* renamed from: c, reason: collision with root package name */
        public final char f367813c;

        public c(char c12, @l String str, char c13) {
            this.f367811a = c12;
            this.f367812b = str;
            this.f367813c = c13;
        }
    }

    /* compiled from: BaseInputMask.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/text/p;", "invoke", "()Lkotlin/text/p;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends N implements Y41.a<C43059p> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.f f367814l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f367815m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(l0.f fVar, a aVar) {
            super(0);
            this.f367814l = fVar;
            this.f367815m = aVar;
        }

        @Override // Y41.a
        public final C43059p invoke() {
            l0.f fVar;
            a aVar;
            while (true) {
                fVar = this.f367814l;
                int i12 = fVar.f406840b;
                aVar = this.f367815m;
                ArrayList arrayList = aVar.f367802c;
                if (arrayList == null) {
                    arrayList = null;
                }
                if (i12 < arrayList.size()) {
                    ArrayList arrayList2 = aVar.f367802c;
                    if (arrayList2 == null) {
                        arrayList2 = null;
                    }
                    if (arrayList2.get(fVar.f406840b) instanceof AbstractC10863a.C10864a) {
                        break;
                    }
                    fVar.f406840b++;
                } else {
                    break;
                }
            }
            ArrayList arrayList3 = aVar.f367802c;
            if (arrayList3 == null) {
                arrayList3 = null;
            }
            Object objK = C42745f0.K(fVar.f406840b, arrayList3);
            AbstractC10863a.C10864a c10864a = objK instanceof AbstractC10863a.C10864a ? (AbstractC10863a.C10864a) objK : null;
            if (c10864a == null) {
                return null;
            }
            return c10864a.f367805b;
        }
    }

    public a(@k b bVar) {
        this.f367800a = bVar;
        l(bVar, true);
    }

    public void a(@l Integer num, @k String str) {
        int length;
        d.a aVar = com.yandex.div.core.util.mask.d.f367821d;
        String strH = h();
        aVar.getClass();
        com.yandex.div.core.util.mask.d dVarA = d.a.a(strH, str);
        int iIntValue = num.intValue();
        int i12 = dVarA.f367823b;
        int i13 = iIntValue - i12;
        if (i13 < 0) {
            i13 = 0;
        }
        int i14 = dVarA.f367824c;
        com.yandex.div.core.util.mask.d dVar = new com.yandex.div.core.util.mask.d(i13, i12, i14);
        String strSubstring = str.substring(i13, i12 + i13);
        int i15 = i14 + i13;
        ArrayList arrayList = this.f367802c;
        if (arrayList == null) {
            arrayList = null;
        }
        String strE = e(i15, arrayList.size() - 1);
        c(dVar);
        int iF2 = f();
        if (this.f367801b.size() <= 1) {
            int i16 = iF2;
            int i17 = 0;
            while (true) {
                ArrayList arrayList2 = this.f367802c;
                if (arrayList2 == null) {
                    arrayList2 = null;
                }
                if (i16 >= arrayList2.size()) {
                    break;
                }
                ArrayList arrayList3 = this.f367802c;
                if (arrayList3 == null) {
                    arrayList3 = null;
                }
                if (arrayList3.get(i16) instanceof AbstractC10863a.C10864a) {
                    i17++;
                }
                i16++;
            }
            length = i17 - strE.length();
        } else {
            String strB = b(iF2, strE);
            int i18 = 0;
            while (true) {
                ArrayList arrayList4 = this.f367802c;
                if (arrayList4 == null) {
                    arrayList4 = null;
                }
                if (i18 >= arrayList4.size() || !strB.equals(b(iF2 + i18, strE))) {
                    break;
                } else {
                    i18++;
                }
            }
            length = i18 - 1;
        }
        k(iF2, Integer.valueOf(length >= 0 ? length : 0), strSubstring);
        int iF3 = f();
        k(iF3, null, strE);
        int iF4 = f();
        if (i13 < iF4) {
            while (true) {
                ArrayList arrayList5 = this.f367802c;
                if (arrayList5 == null) {
                    arrayList5 = null;
                }
                if (iF3 >= arrayList5.size()) {
                    break;
                }
                ArrayList arrayList6 = this.f367802c;
                if (arrayList6 == null) {
                    arrayList6 = null;
                }
                if (((AbstractC10863a) arrayList6.get(iF3)) instanceof AbstractC10863a.C10864a) {
                    break;
                } else {
                    iF3++;
                }
            }
            iF4 = Math.min(iF3, h().length());
        }
        this.f367803d = iF4;
    }

    @k
    public final String b(int i12, @k String str) {
        StringBuilder sb2 = new StringBuilder();
        l0.f fVar = new l0.f();
        fVar.f406840b = i12;
        d dVar = new d(fVar, this);
        int i13 = 0;
        while (i13 < str.length()) {
            char cCharAt = str.charAt(i13);
            i13++;
            C43059p c43059p = (C43059p) dVar.invoke();
            if (c43059p != null && c43059p.e(String.valueOf(cCharAt))) {
                sb2.append(cCharAt);
                fVar.f406840b++;
            }
        }
        return sb2.toString();
    }

    public final void c(@k com.yandex.div.core.util.mask.d dVar) {
        int i12 = dVar.f367823b;
        int i13 = dVar.f367822a;
        if (i12 == 0 && dVar.f367824c == 1) {
            int i14 = i13;
            while (true) {
                if (i14 < 0) {
                    break;
                }
                ArrayList arrayList = this.f367802c;
                if (arrayList == null) {
                    arrayList = null;
                }
                AbstractC10863a abstractC10863a = (AbstractC10863a) arrayList.get(i14);
                if (abstractC10863a instanceof AbstractC10863a.C10864a) {
                    AbstractC10863a.C10864a c10864a = (AbstractC10863a.C10864a) abstractC10863a;
                    if (c10864a.f367804a != null) {
                        c10864a.f367804a = null;
                        break;
                    }
                }
                i14--;
            }
        }
        ArrayList arrayList2 = this.f367802c;
        d(i13, (arrayList2 != null ? arrayList2 : null).size());
    }

    public final void d(int i12, int i13) {
        while (i12 < i13) {
            ArrayList arrayList = this.f367802c;
            if (arrayList == null) {
                arrayList = null;
            }
            if (i12 >= arrayList.size()) {
                return;
            }
            ArrayList arrayList2 = this.f367802c;
            if (arrayList2 == null) {
                arrayList2 = null;
            }
            AbstractC10863a abstractC10863a = (AbstractC10863a) arrayList2.get(i12);
            if (abstractC10863a instanceof AbstractC10863a.C10864a) {
                ((AbstractC10863a.C10864a) abstractC10863a).f367804a = null;
            }
            i12++;
        }
    }

    @k
    public final String e(int i12, int i13) {
        Character ch2;
        StringBuilder sb2 = new StringBuilder();
        while (i12 <= i13) {
            ArrayList arrayList = this.f367802c;
            if (arrayList == null) {
                arrayList = null;
            }
            AbstractC10863a abstractC10863a = (AbstractC10863a) arrayList.get(i12);
            if ((abstractC10863a instanceof AbstractC10863a.C10864a) && (ch2 = ((AbstractC10863a.C10864a) abstractC10863a).f367804a) != null) {
                sb2.append(ch2);
            }
            i12++;
        }
        return sb2.toString();
    }

    public final int f() {
        ArrayList arrayList = this.f367802c;
        if (arrayList == null) {
            arrayList = null;
        }
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            AbstractC10863a abstractC10863a = (AbstractC10863a) it.next();
            if ((abstractC10863a instanceof AbstractC10863a.C10864a) && ((AbstractC10863a.C10864a) abstractC10863a).f367804a == null) {
                break;
            }
            i12++;
        }
        if (i12 != -1) {
            return i12;
        }
        ArrayList arrayList2 = this.f367802c;
        return (arrayList2 != null ? arrayList2 : null).size();
    }

    @k
    public final String g() {
        ArrayList arrayList = this.f367802c;
        if (arrayList == null) {
            arrayList = null;
        }
        return e(0, arrayList.size() - 1);
    }

    @k
    public final String h() {
        Character ch2;
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = this.f367802c;
        if (arrayList == null) {
            arrayList = null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            AbstractC10863a abstractC10863a = (AbstractC10863a) obj;
            if (abstractC10863a instanceof AbstractC10863a.b) {
                sb2.append(((AbstractC10863a.b) abstractC10863a).f367807a);
            } else if ((abstractC10863a instanceof AbstractC10863a.C10864a) && (ch2 = ((AbstractC10863a.C10864a) abstractC10863a).f367804a) != null) {
                sb2.append(ch2);
            } else {
                if (!this.f367800a.f367810c) {
                    break;
                }
                sb2.append(((AbstractC10863a.C10864a) abstractC10863a).f367806c);
            }
            arrayList2.add(obj);
        }
        return sb2.toString();
    }

    public abstract void i(@k PatternSyntaxException patternSyntaxException);

    public void j(@k String str) {
        ArrayList arrayList = this.f367802c;
        if (arrayList == null) {
            arrayList = null;
        }
        d(0, arrayList.size());
        k(0, null, str);
        this.f367803d = Math.min(this.f367803d, h().length());
    }

    public final void k(int i12, @l Integer num, @k String str) {
        String strB = b(i12, str);
        if (num != null) {
            strB = C43066x.t0(num.intValue(), strB);
        }
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f367802c;
            if (arrayList == null) {
                arrayList = null;
            }
            if (i12 >= arrayList.size() || i13 >= strB.length()) {
                return;
            }
            ArrayList arrayList2 = this.f367802c;
            AbstractC10863a abstractC10863a = (AbstractC10863a) (arrayList2 != null ? arrayList2 : null).get(i12);
            char cCharAt = strB.charAt(i13);
            if (abstractC10863a instanceof AbstractC10863a.C10864a) {
                ((AbstractC10863a.C10864a) abstractC10863a).f367804a = Character.valueOf(cCharAt);
                i13++;
            }
            i12++;
        }
    }

    public final void l(@k b bVar, boolean z12) {
        Object next;
        String strG = (this.f367800a.equals(bVar) || !z12) ? null : g();
        this.f367800a = bVar;
        LinkedHashMap linkedHashMap = this.f367801b;
        linkedHashMap.clear();
        for (c cVar : this.f367800a.f367809b) {
            try {
                String str = cVar.f367812b;
                if (str != null) {
                    linkedHashMap.put(Character.valueOf(cVar.f367811a), new C43059p(str));
                }
            } catch (PatternSyntaxException e12) {
                i(e12);
            }
        }
        String str2 = this.f367800a.f367808a;
        ArrayList arrayList = new ArrayList(str2.length());
        int i12 = 0;
        while (i12 < str2.length()) {
            char cCharAt = str2.charAt(i12);
            i12++;
            Iterator<T> it = this.f367800a.f367809b.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((c) next).f367811a == cCharAt) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            c cVar2 = (c) next;
            arrayList.add(cVar2 != null ? new AbstractC10863a.C10864a((C43059p) linkedHashMap.get(Character.valueOf(cVar2.f367811a)), cVar2.f367813c) : new AbstractC10863a.b(cCharAt));
        }
        this.f367802c = arrayList;
        if (strG != null) {
            j(strG);
        }
    }
}
