package androidx.compose.ui.text.font;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: FontMatcher.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/font/Y;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Y {
    @Y61.k
    public static ArrayList a(@Y61.k List list, @Y61.k e0 e0Var, int i12) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(list.size());
        List list2 = list;
        int size = list2.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            Object obj = list.get(i14);
            D d12 = (D) obj;
            if (kotlin.jvm.internal.L.f(d12.getF42304b(), e0Var) && Z.b(d12.getF42305c(), i12)) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList(list.size());
        int size2 = list2.size();
        for (int i15 = 0; i15 < size2; i15++) {
            Object obj2 = list.get(i15);
            if (Z.b(((D) obj2).getF42305c(), i12)) {
                arrayList3.add(obj2);
            }
        }
        if (!arrayList3.isEmpty()) {
            list = arrayList3;
        }
        List list3 = list;
        e0.f42240c.getClass();
        int iCompareTo = e0Var.compareTo(e0.f42241d);
        e0 e0Var2 = null;
        int i16 = e0Var.f42253b;
        if (iCompareTo < 0) {
            List list4 = list3;
            int size3 = list4.size();
            e0 e0Var3 = null;
            int i17 = 0;
            while (true) {
                if (i17 >= size3) {
                    break;
                }
                e0 f42304b = ((D) list3.get(i17)).getF42304b();
                int iG2 = kotlin.jvm.internal.L.g(f42304b.f42253b, i16);
                int i18 = f42304b.f42253b;
                if (iG2 >= 0) {
                    if (kotlin.jvm.internal.L.g(i18, i16) <= 0) {
                        e0Var2 = f42304b;
                        e0Var3 = e0Var2;
                        break;
                    }
                    if (e0Var3 == null || kotlin.jvm.internal.L.g(i18, e0Var3.f42253b) < 0) {
                        e0Var3 = f42304b;
                    }
                } else if (e0Var2 == null || kotlin.jvm.internal.L.g(i18, e0Var2.f42253b) > 0) {
                    e0Var2 = f42304b;
                }
                i17++;
            }
            if (e0Var2 == null) {
                e0Var2 = e0Var3;
            }
            arrayList = new ArrayList(list3.size());
            int size4 = list4.size();
            while (i13 < size4) {
                Object obj3 = list3.get(i13);
                if (kotlin.jvm.internal.L.f(((D) obj3).getF42304b(), e0Var2)) {
                    arrayList.add(obj3);
                }
                i13++;
            }
        } else {
            e0 e0Var4 = e0.f42242e;
            if (e0Var.compareTo(e0Var4) > 0) {
                List list5 = list3;
                int size5 = list5.size();
                e0 e0Var5 = null;
                int i19 = 0;
                while (true) {
                    if (i19 >= size5) {
                        break;
                    }
                    e0 f42304b2 = ((D) list3.get(i19)).getF42304b();
                    int iG3 = kotlin.jvm.internal.L.g(f42304b2.f42253b, i16);
                    int i22 = f42304b2.f42253b;
                    if (iG3 >= 0) {
                        if (kotlin.jvm.internal.L.g(i22, i16) <= 0) {
                            e0Var2 = f42304b2;
                            e0Var5 = e0Var2;
                            break;
                        }
                        if (e0Var5 == null || kotlin.jvm.internal.L.g(i22, e0Var5.f42253b) < 0) {
                            e0Var5 = f42304b2;
                        }
                    } else if (e0Var2 == null || kotlin.jvm.internal.L.g(i22, e0Var2.f42253b) > 0) {
                        e0Var2 = f42304b2;
                    }
                    i19++;
                }
                if (e0Var5 != null) {
                    e0Var2 = e0Var5;
                }
                arrayList = new ArrayList(list3.size());
                int size6 = list5.size();
                while (i13 < size6) {
                    Object obj4 = list3.get(i13);
                    if (kotlin.jvm.internal.L.f(((D) obj4).getF42304b(), e0Var2)) {
                        arrayList.add(obj4);
                    }
                    i13++;
                }
            } else {
                List list6 = list3;
                int size7 = list6.size();
                e0 e0Var6 = null;
                e0 e0Var7 = null;
                int i23 = 0;
                while (true) {
                    if (i23 >= size7) {
                        break;
                    }
                    e0 f42304b3 = ((D) list3.get(i23)).getF42304b();
                    if (kotlin.jvm.internal.L.g(f42304b3.f42253b, e0Var4.f42253b) <= 0) {
                        int iG4 = kotlin.jvm.internal.L.g(f42304b3.f42253b, i16);
                        int i24 = f42304b3.f42253b;
                        if (iG4 >= 0) {
                            if (kotlin.jvm.internal.L.g(i24, i16) <= 0) {
                                e0Var6 = f42304b3;
                                e0Var7 = e0Var6;
                                break;
                            }
                            if (e0Var7 == null || kotlin.jvm.internal.L.g(i24, e0Var7.f42253b) < 0) {
                                e0Var7 = f42304b3;
                            }
                        } else if (e0Var6 == null || kotlin.jvm.internal.L.g(i24, e0Var6.f42253b) > 0) {
                            e0Var6 = f42304b3;
                        }
                    }
                    i23++;
                }
                if (e0Var7 != null) {
                    e0Var6 = e0Var7;
                }
                arrayList = new ArrayList(list3.size());
                int size8 = list6.size();
                for (int i25 = 0; i25 < size8; i25++) {
                    Object obj5 = list3.get(i25);
                    if (kotlin.jvm.internal.L.f(((D) obj5).getF42304b(), e0Var6)) {
                        arrayList.add(obj5);
                    }
                }
                if (arrayList.isEmpty()) {
                    e0.f42240c.getClass();
                    e0 e0Var8 = e0.f42242e;
                    int size9 = list6.size();
                    e0 e0Var9 = null;
                    int i26 = 0;
                    while (true) {
                        if (i26 >= size9) {
                            break;
                        }
                        e0 f42304b4 = ((D) list3.get(i26)).getF42304b();
                        if (e0Var8 == null || kotlin.jvm.internal.L.g(f42304b4.f42253b, e0Var8.f42253b) >= 0) {
                            int iG5 = kotlin.jvm.internal.L.g(f42304b4.f42253b, i16);
                            int i27 = f42304b4.f42253b;
                            if (iG5 >= 0) {
                                if (kotlin.jvm.internal.L.g(i27, i16) <= 0) {
                                    e0Var2 = f42304b4;
                                    e0Var9 = e0Var2;
                                    break;
                                }
                                if (e0Var9 == null || kotlin.jvm.internal.L.g(i27, e0Var9.f42253b) < 0) {
                                    e0Var9 = f42304b4;
                                }
                            } else if (e0Var2 == null || kotlin.jvm.internal.L.g(i27, e0Var2.f42253b) > 0) {
                                e0Var2 = f42304b4;
                            }
                        }
                        i26++;
                    }
                    if (e0Var9 != null) {
                        e0Var2 = e0Var9;
                    }
                    arrayList = new ArrayList(list3.size());
                    int size10 = list6.size();
                    while (i13 < size10) {
                        Object obj6 = list3.get(i13);
                        if (kotlin.jvm.internal.L.f(((D) obj6).getF42304b(), e0Var2)) {
                            arrayList.add(obj6);
                        }
                        i13++;
                    }
                }
            }
        }
        return arrayList;
    }
}
