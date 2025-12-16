package com.yandex.metrica.impl.ob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.ln, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38962ln extends AbstractC38863hn {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38937kn f380989b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C38937kn f380990c;

    /* renamed from: d, reason: collision with root package name */
    private Comparator<Map.Entry<String, String>> f380991d;

    /* renamed from: com.yandex.metrica.impl.ob.ln$a */
    public class a implements Comparator<Map.Entry<String, String>> {
        public a(C38962ln c38962ln) {
        }

        @Override // java.util.Comparator
        public int compare(Map.Entry<String, String> entry, Map.Entry<String, String> entry2) {
            String value = entry.getValue();
            String value2 = entry2.getValue();
            int length = C38689b.b(value).length;
            int length2 = C38689b.b(value2).length;
            if (length < length2) {
                return -1;
            }
            return length == length2 ? 0 : 1;
        }
    }

    public C38962ln(int i12, int i13, int i14) {
        this(i12, new C38937kn(i13), new C38937kn(i14));
    }

    public C38962ln(int i12, @j.N C38937kn c38937kn, @j.N C38937kn c38937kn2) {
        super(i12);
        this.f380991d = new a(this);
        this.f380989b = c38937kn;
        this.f380990c = c38937kn2;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC38863hn
    @j.N
    public C38838gn<Map<String, String>, Xm> a(@j.P Map<String, String> map) {
        HashMap map2;
        int iA2;
        int i12 = 0;
        if (map != null) {
            map2 = new HashMap();
            Set<Map.Entry<String, String>> setEntrySet = map.entrySet();
            Map.Entry[] entryArr = (Map.Entry[]) setEntrySet.toArray(new Map.Entry[setEntrySet.size()]);
            Arrays.sort(entryArr, this.f380991d);
            int length = entryArr.length;
            iA2 = 0;
            int i13 = 0;
            boolean z12 = false;
            int i14 = 0;
            while (i12 < length) {
                Map.Entry entry = entryArr[i12];
                C38838gn<String, Vm> c38838gnA = this.f380989b.a((String) entry.getKey());
                C38838gn<String, Vm> c38838gnA2 = this.f380990c.a((String) entry.getValue());
                int length2 = C38689b.b((String) entry.getKey()).length + C38689b.b((String) entry.getValue()).length;
                int length3 = C38689b.b(c38838gnA.f380668a).length + C38689b.b(c38838gnA2.f380668a).length;
                if (z12 || length3 + i14 > a()) {
                    i13++;
                    iA2 += length2;
                    z12 = true;
                } else {
                    iA2 = c38838gnA2.f380669b.a() + c38838gnA.f380669b.a() + iA2;
                    int length4 = C38689b.b(c38838gnA.f380668a).length + C38689b.b(c38838gnA2.f380668a).length + i14;
                    map2.put(c38838gnA.f380668a, c38838gnA2.f380668a);
                    i14 = length4;
                }
                i12++;
            }
            i12 = i13;
        } else {
            map2 = null;
            iA2 = 0;
        }
        return new C38838gn<>(map2, new Xm(i12, iA2));
    }
}
