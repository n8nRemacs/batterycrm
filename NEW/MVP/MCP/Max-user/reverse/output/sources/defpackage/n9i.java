package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class n9i {
    public static final Pattern e = Pattern.compile("^a=(?:rtcp-fb|fmtp):(\\d+) (apt=(\\d+))?.*$");
    public static final Pattern f = Pattern.compile("^a=rtpmap:(\\d+) ([a-zA-Z0-9-]+)(/\\d+)+[\r]?$");
    public final HashSet a;
    public final String b;
    public final int c;
    public final LinkedHashMap d;

    public n9i(String str, int i, LinkedHashMap linkedHashMap) {
        this.b = str;
        this.c = i;
        this.d = linkedHashMap;
        this.a = new HashSet(linkedHashMap.size() * 7);
    }

    public static n9i a(int i, String str) {
        List listAsList = Arrays.asList(str.split(" "));
        if (listAsList.size() <= 3) {
            return null;
        }
        int i2 = 0;
        listAsList.subList(0, 3);
        ArrayList arrayList = new ArrayList(listAsList.subList(3, listAsList.size()));
        LinkedHashMap linkedHashMap = new LinkedHashMap(arrayList.size(), 2.0f);
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String str2 = (String) obj;
            linkedHashMap.put(str2, new k9i(str2));
        }
        return new n9i(str, i, linkedHashMap);
    }

    public final ArrayList b(String str) {
        ArrayList arrayList = new ArrayList();
        for (k9i k9iVar : this.d.values()) {
            if (Objects.equals(str, k9iVar.b)) {
                arrayList.add(k9iVar);
            }
        }
        return arrayList;
    }

    public final void c(StringBuilder sb, List list, boolean z) {
        n9i n9iVar = this;
        boolean zD = n9iVar.d(list);
        LinkedHashMap linkedHashMap = n9iVar.d;
        if (!zD && !z) {
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = ((k9i) it.next()).c;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    sb.append((String) obj);
                    sb.append("\r\n");
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ArrayList arrayListB = n9iVar.b((String) it2.next());
            int size2 = arrayListB.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayListB.get(i2);
                i2++;
                k9i k9iVar = (k9i) obj2;
                ArrayList arrayList3 = k9iVar.c;
                int size3 = arrayList3.size();
                int i3 = 0;
                while (i3 < size3) {
                    Object obj3 = arrayList3.get(i3);
                    i3++;
                    sb.append((String) obj3);
                    sb.append("\r\n");
                }
                ArrayList arrayList4 = k9iVar.d;
                int size4 = arrayList4.size();
                int i4 = 0;
                while (i4 < size4) {
                    Object obj4 = arrayList4.get(i4);
                    i4++;
                    String str = (String) obj4;
                    k9i k9iVar2 = (k9i) linkedHashMap.get(str);
                    if (k9iVar2 != null) {
                        ArrayList arrayList5 = k9iVar2.c;
                        int size5 = arrayList5.size();
                        for (int i5 = 0; i5 < size5; i5++) {
                            Object obj5 = arrayList5.get(i5);
                            sb.append((String) obj5);
                            sb.append("\r\n");
                        }
                        arrayList2.add(str);
                    }
                }
            }
            n9iVar = this;
        }
        if (z) {
            return;
        }
        for (k9i k9iVar3 : linkedHashMap.values()) {
            if (!list.contains(k9iVar3.b) && !arrayList2.contains(k9iVar3.a)) {
                ArrayList arrayList6 = k9iVar3.c;
                int size6 = arrayList6.size();
                int i6 = 0;
                while (i6 < size6) {
                    Object obj6 = arrayList6.get(i6);
                    i6++;
                    sb.append((String) obj6);
                    sb.append("\r\n");
                }
            }
        }
    }

    public final boolean d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!b((String) it.next()).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void e(int i, String str) {
        k9i k9iVar;
        k9i k9iVar2;
        k9i k9iVar3;
        if (str.startsWith("a=")) {
            Matcher matcher = e.matcher(str);
            boolean zMatches = matcher.matches();
            HashSet hashSet = this.a;
            LinkedHashMap linkedHashMap = this.d;
            if (zMatches) {
                String strGroup = matcher.group(1);
                String strGroup2 = matcher.group(3);
                if (strGroup2 != null && (k9iVar3 = (k9i) linkedHashMap.get(strGroup2)) != null) {
                    k9iVar3.d.add(strGroup);
                }
                if (strGroup == null || (k9iVar2 = (k9i) linkedHashMap.get(strGroup)) == null) {
                    return;
                }
                k9iVar2.c.add(str);
                hashSet.add(Integer.valueOf(i));
                return;
            }
            Matcher matcher2 = f.matcher(str);
            if (matcher2.matches()) {
                String strGroup3 = matcher2.group(1);
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null || strGroup3 == null || (k9iVar = (k9i) linkedHashMap.get(strGroup3)) == null) {
                    return;
                }
                k9iVar.b = strGroup4;
                k9i k9iVar4 = (k9i) linkedHashMap.get(strGroup3);
                if (k9iVar4 == null) {
                    return;
                }
                k9iVar4.c.add(str);
                hashSet.add(Integer.valueOf(i));
            }
        }
    }

    public final void f(StringBuilder sb, List list, boolean z) {
        boolean zD = d(list);
        String str = this.b;
        if (!zD && !z) {
            sb.append(str);
            sb.append("\r\n");
            return;
        }
        List listSubList = Arrays.asList(str.split(" ")).subList(0, 3);
        ArrayList arrayList = new ArrayList();
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(' ');
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ArrayList arrayListB = b((String) it2.next());
            int size = arrayListB.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListB.get(i);
                i++;
                k9i k9iVar = (k9i) obj;
                sb.append(k9iVar.a);
                sb.append(' ');
                ArrayList arrayList2 = k9iVar.d;
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    String str2 = (String) obj2;
                    sb.append(str2);
                    sb.append(' ');
                    arrayList.add(str2);
                }
            }
        }
        if (!z) {
            for (k9i k9iVar2 : this.d.values()) {
                String str3 = k9iVar2.b;
                String str4 = k9iVar2.a;
                if (!list.contains(str3) && !arrayList.contains(str4)) {
                    sb.append(str4);
                    sb.append(' ');
                }
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("\r\n");
    }
}
