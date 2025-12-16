package com.avito.android.lib.design.picker;

import androidx.compose.runtime.C22026a;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: WheelData.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/picker/k;", "T", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class k<T> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f180042c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final ArrayList<k<?>> f180043d = C42745f0.j(new k(0, "Января"), new k(1, "Февраля"), new k(2, "Марта"), new k(3, "Апреля"), new k(4, "Мая"), new k(5, "Июня"), new k(6, "Июля"), new k(7, "Августа"), new k(8, "Сентября"), new k(9, "Октября"), new k(10, "Ноября"), new k(11, "Декабря"));

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final ArrayList<k<?>> f180044e = C42745f0.j(new k(0, "января"), new k(1, "февраля"), new k(2, "марта"), new k(3, "апреля"), new k(4, "мая"), new k(5, "июня"), new k(6, "июля"), new k(7, "августа"), new k(8, "сентября"), new k(9, "октября"), new k(10, "ноября"), new k(11, "декабря"));

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final ArrayList<k<?>> f180045f = C42745f0.j(new k(0, "январь"), new k(1, "февраль"), new k(2, "март"), new k(3, "апрель"), new k(4, "май"), new k(5, "июнь"), new k(6, "июль"), new k(7, "август"), new k(8, "сентябрь"), new k(9, "октябрь"), new k(10, "ноябрь"), new k(11, "декабрь"));

    /* renamed from: a, reason: collision with root package name */
    public final T f180046a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f180047b;

    /* compiled from: WheelData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/picker/k$a;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static boolean a(@Y61.l k kVar, @Y61.l k kVar2, @Y61.l k kVar3) {
            return (kVar == null || kVar2 == null || new GregorianCalendar(((Integer) kVar3.f180046a).intValue(), ((Integer) kVar2.f180046a).intValue(), 1).getActualMaximum(5) < ((Integer) kVar.f180046a).intValue()) ? false : true;
        }

        @Y61.k
        public static ArrayList b() {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 1; i12 < 32; i12++) {
                arrayList.add(new k(Integer.valueOf(i12), String.valueOf(i12)));
            }
            return arrayList;
        }

        @Y61.k
        public static ArrayList c() {
            ArrayList arrayList = new ArrayList();
            int i12 = 0;
            for (int i13 = 0; i13 < 24; i13++) {
                int i14 = i12 + 1;
                arrayList.add(new k(Integer.valueOf(i12), i13 + ":00"));
                i12 += 2;
                arrayList.add(new k(Integer.valueOf(i14), i13 + ":30"));
            }
            return arrayList;
        }

        @Y61.k
        public static ArrayList d(int i12, int i13) {
            ArrayList arrayList = new ArrayList();
            if (i12 <= i13) {
                while (true) {
                    arrayList.add(new k(Integer.valueOf(i12), String.valueOf(i12)));
                    if (i12 == i13) {
                        break;
                    }
                    i12++;
                }
            }
            return arrayList;
        }

        public a() {
        }
    }

    public k(T t12, @Y61.k String str) {
        this.f180046a = t12;
        this.f180047b = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f180046a, kVar.f180046a) && L.f(this.f180047b, kVar.f180047b);
    }

    public final int hashCode() {
        T t12 = this.f180046a;
        return this.f180047b.hashCode() + ((t12 == null ? 0 : t12.hashCode()) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WheelData(key=");
        sb2.append(this.f180046a);
        sb2.append(", name=");
        return C22026a.c(sb2, this.f180047b, ')');
    }
}
