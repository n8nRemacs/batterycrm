package com.akita.compose.component.date_picker.utils;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42784z0;
import kotlin.internal.n;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.ranges.o;
import kotlin.time.DurationUnit;
import kotlin.time.e;

/* compiled from: DatePickerDatesValidator.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/akita/compose/component/date_picker/utils/f;", "", "a", "date-picker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f61416g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public DisableDatesOption f61417a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC22204y1 f61418b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC22204y1 f61419c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC22204y1 f61420d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC22204y1 f61421e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC22204y1 f61422f;

    /* compiled from: DatePickerDatesValidator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/compose/component/date_picker/utils/f$a;", "", "<init>", "()V", "date-picker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DatePickerDatesValidator.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61423a;

        static {
            int[] iArr = new int[DisableDatesOption.values().length];
            try {
                DisableDatesOption disableDatesOption = DisableDatesOption.f61406b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DisableDatesOption disableDatesOption2 = DisableDatesOption.f61406b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                DisableDatesOption disableDatesOption3 = DisableDatesOption.f61406b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                DisableDatesOption disableDatesOption4 = DisableDatesOption.f61406b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f61423a = iArr;
        }
    }

    public f() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final void a(@k ArrayList arrayList, @l DisableDatesOption disableDatesOption) {
        this.f61417a = disableDatesOption;
        HashSet hashSet = new HashSet(arrayList.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            long j12 = oVar.f406915b;
            e.a aVar = kotlin.time.e.f410651c;
            DurationUnit durationUnit = DurationUnit.f410637i;
            long jE2 = j12 - (j12 % kotlin.time.e.e(kotlin.time.g.g(1, durationUnit)));
            o oVar2 = new o(jE2, oVar.f406916c);
            long jE3 = kotlin.time.e.e(kotlin.time.g.g(1, durationUnit));
            if (jE3 <= 0) {
                throw new IllegalArgumentException("Step must be positive, was: " + jE3 + '.');
            }
            long jB2 = n.b(jE2, oVar2.f406916c, jE3);
            if (jE2 <= jB2) {
                while (true) {
                    InterfaceC22204y1 interfaceC22204y1 = this.f61421e;
                    Long l12 = (Long) ((C22082i3) interfaceC22204y1).getF42167b();
                    if (jE2 < (l12 != null ? l12.longValue() : Long.MAX_VALUE)) {
                        ((C22082i3) interfaceC22204y1).setValue(Long.valueOf(jE2));
                    }
                    InterfaceC22204y1 interfaceC22204y12 = this.f61422f;
                    Long l13 = (Long) ((C22082i3) interfaceC22204y12).getF42167b();
                    if (jE2 > (l13 != null ? l13.longValue() : Long.MIN_VALUE)) {
                        ((C22082i3) interfaceC22204y12).setValue(Long.valueOf(jE2));
                    }
                    hashSet.add(Long.valueOf(jE2));
                    if (jE2 != jB2) {
                        jE2 += jE3;
                    }
                }
            }
            arrayList2.add(oVar2);
        }
        ((C22082i3) this.f61419c).setValue(hashSet);
        ((C22082i3) this.f61420d).setValue(arrayList2);
    }

    public final void b(@k ArrayList arrayList) {
        HashSet hashSet = new HashSet(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            long j12 = oVar.f406915b;
            e.a aVar = kotlin.time.e.f410651c;
            DurationUnit durationUnit = DurationUnit.f410637i;
            long jE2 = j12 - (j12 % kotlin.time.e.e(kotlin.time.g.g(1, durationUnit)));
            o oVar2 = new o(jE2, oVar.f406916c);
            long jE3 = kotlin.time.e.e(kotlin.time.g.g(1, durationUnit));
            if (jE3 <= 0) {
                throw new IllegalArgumentException("Step must be positive, was: " + jE3 + '.');
            }
            long jB2 = n.b(jE2, oVar2.f406916c, jE3);
            if (jE2 <= jB2) {
                while (true) {
                    hashSet.add(Long.valueOf(jE2));
                    if (jE2 != jB2) {
                        jE2 += jE3;
                    }
                }
            }
        }
        ((C22082i3) this.f61418b).setValue(hashSet);
    }

    public final boolean c(o oVar) {
        boolean zA2 = i.a(oVar);
        long j12 = oVar.f406915b;
        if (zA2) {
            return ((Set) ((C22082i3) this.f61419c).getF42167b()).contains(Long.valueOf(j12));
        }
        List<o> list = (List) ((C22082i3) this.f61420d).getF42167b();
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (o oVar2 : list) {
            long j13 = oVar2.f406915b;
            long j14 = oVar2.f406916c;
            if (j13 > j12 || j12 > j14) {
                long j15 = oVar.f406916c;
                if (j13 > j15 || j15 > j14) {
                }
            }
            return true;
        }
        return false;
    }

    public f(Set set, Set set2, List list, Long l12, Long l13, DisableDatesOption disableDatesOption, int i12, C42822w c42822w) {
        set = (i12 & 1) != 0 ? B0.f406639b : set;
        set2 = (i12 & 2) != 0 ? B0.f406639b : set2;
        list = (i12 & 4) != 0 ? C42784z0.f406748b : list;
        l12 = (i12 & 8) != 0 ? null : l12;
        l13 = (i12 & 16) != 0 ? null : l13;
        this.f61417a = (i12 & 32) != 0 ? null : disableDatesOption;
        this.f61418b = C22126m3.g(set);
        this.f61419c = C22126m3.g(set2);
        this.f61420d = C22126m3.g(list);
        this.f61421e = C22126m3.g(l12);
        this.f61422f = C22126m3.g(l13);
    }
}
