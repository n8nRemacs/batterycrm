package com.avito.android.publish.date_picker;

import Y41.p;
import Y61.k;
import Y61.l;
import android.view.View;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.lib.design.picker.WheelGravity;
import com.avito.android.lib.design.picker.k;
import com.avito.android.lib.design.picker.m;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.TimeZone;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MonthAndYearPicker.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/date_picker/h;", "Lcom/avito/android/publish/date_picker/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements com.avito.android.publish.date_picker.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final GregorianCalendar f232503a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Date f232504b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Date f232505c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Picker f232506d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ArrayList<com.avito.android.lib.design.picker.k<?>> f232507e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ArrayList<com.avito.android.lib.design.picker.k<?>> f232508f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Y41.a<G0> f232509g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f232510h;

    /* compiled from: MonthAndYearPicker.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/picker/k;", "monthWheelData", "yearWheelData", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/picker/k;Lcom/avito/android/lib/design/picker/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<com.avito.android.lib.design.picker.k<?>, com.avito.android.lib.design.picker.k<?>, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f232512m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f232513n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f232514o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f232515p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, int i13, int i14, int i15) {
            super(2);
            this.f232512m = i12;
            this.f232513n = i13;
            this.f232514o = i14;
            this.f232515p = i15;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.p
        public final G0 invoke(com.avito.android.lib.design.picker.k<?> kVar, com.avito.android.lib.design.picker.k<?> kVar2) {
            com.avito.android.lib.design.picker.k<?> kVar3 = kVar;
            com.avito.android.lib.design.picker.k<?> kVar4 = kVar2;
            if (kVar3 != null && kVar4 != null) {
                h hVar = h.this;
                GregorianCalendar gregorianCalendar = hVar.f232503a;
                T t12 = kVar3.f180046a;
                gregorianCalendar.set(2, ((Integer) t12).intValue());
                GregorianCalendar gregorianCalendar2 = hVar.f232503a;
                T t13 = kVar4.f180046a;
                gregorianCalendar2.set(1, ((Integer) t13).intValue());
                gregorianCalendar2.set(5, gregorianCalendar2.getActualMinimum(5));
                Y41.a<G0> aVar = hVar.f232509g;
                if (aVar != null) {
                    ((i) aVar).invoke();
                }
                hVar.f232509g = null;
                if (!hVar.f232510h && (t12 instanceof Integer)) {
                    if (this.f232512m == ((Number) t12).intValue() && (t13 instanceof Integer)) {
                        if (this.f232513n == ((Number) t13).intValue()) {
                            ArrayList<com.avito.android.lib.design.picker.k<?>> arrayList = hVar.f232507e;
                            com.avito.android.lib.design.picker.k<?> kVar5 = arrayList.get(this.f232514o);
                            ArrayList<com.avito.android.lib.design.picker.k<?>> arrayList2 = hVar.f232508f;
                            com.avito.android.lib.design.picker.k kVar6 = (com.avito.android.lib.design.picker.k) r.j(1, arrayList2);
                            Picker picker = hVar.f232506d;
                            picker.h(kVar5, kVar6);
                            picker.g(arrayList.get(this.f232515p), arrayList2.get(0));
                            hVar.f232510h = true;
                        }
                    }
                }
            }
            return G0.f406611a;
        }
    }

    public h(@k View view, long j12, @l Long l12, @l Long l13) {
        com.avito.android.lib.design.picker.k<?> next;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        this.f232503a = gregorianCalendar;
        this.f232504b = new Date(-631152000000L);
        this.f232505c = new Date(System.currentTimeMillis());
        View viewFindViewById = view.findViewById(R.id.date_picker);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.picker.Picker");
        }
        Picker picker = (Picker) viewFindViewById;
        this.f232506d = picker;
        com.avito.android.lib.design.picker.k.f180042c.getClass();
        ArrayList<com.avito.android.lib.design.picker.k<?>> arrayList = com.avito.android.lib.design.picker.k.f180045f;
        this.f232507e = arrayList;
        if (l12 != null) {
            this.f232504b = new Date(l12.longValue());
        }
        if (l13 != null) {
            this.f232505c = new Date(l13.longValue());
        }
        gregorianCalendar.setTimeInMillis(this.f232504b.getTime());
        Integer numValueOf = Integer.valueOf(gregorianCalendar.get(2));
        Integer numValueOf2 = Integer.valueOf(gregorianCalendar.get(1));
        int iIntValue = numValueOf.intValue();
        int iIntValue2 = numValueOf2.intValue();
        gregorianCalendar.setTimeInMillis(this.f232505c.getTime());
        Integer numValueOf3 = Integer.valueOf(gregorianCalendar.get(2));
        Integer numValueOf4 = Integer.valueOf(gregorianCalendar.get(1));
        int iIntValue3 = numValueOf3.intValue();
        ArrayList<com.avito.android.lib.design.picker.k<?>> arrayListD = k.a.d(iIntValue2, numValueOf4.intValue());
        this.f232508f = arrayListD;
        Picker.d(picker, arrayList, new m(WheelGravity.f179988c, false, 0, 4, null), 12);
        Picker.d(picker, arrayListD, new m(WheelGravity.f179987b, false, 0, 4, null), 12);
        Date date = new Date(j12);
        Date date2 = this.f232505c;
        gregorianCalendar.setTime(date2);
        int i12 = gregorianCalendar.get(2);
        int i13 = gregorianCalendar.get(1);
        gregorianCalendar.setTime(date);
        if (gregorianCalendar.get(1) != i13 ? gregorianCalendar.get(1) <= i13 : gregorianCalendar.get(2) <= i12) {
            Date date3 = this.f232504b;
            gregorianCalendar.setTime(date3);
            int i14 = gregorianCalendar.get(2);
            int i15 = gregorianCalendar.get(1);
            gregorianCalendar.setTime(date);
            if (gregorianCalendar.get(1) != i15 ? gregorianCalendar.get(1) >= i15 : gregorianCalendar.get(2) >= i14) {
                gregorianCalendar.setTime(date);
            } else {
                gregorianCalendar.setTime(date3);
            }
        } else {
            gregorianCalendar.setTime(date2);
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        gregorianCalendar.setTimeInMillis(timeInMillis);
        com.avito.android.lib.design.picker.k<?> kVar = arrayList.get(gregorianCalendar.get(2));
        Iterator<com.avito.android.lib.design.picker.k<?>> it = arrayListD.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (L.f(next.f180046a, Integer.valueOf(gregorianCalendar.get(1)))) {
                    break;
                }
            }
        }
        com.avito.android.lib.design.picker.k<?> kVar2 = next;
        Picker picker2 = this.f232506d;
        if (picker2.getFirstWheelValue() == null || picker2.getSecondWheelValue() == null) {
            this.f232509g = new i(this, kVar2, kVar);
        } else {
            picker2.setSecondWheelValue(kVar2);
            picker2.setFirstWheelValue(kVar);
        }
        gregorianCalendar.setTimeInMillis(timeInMillis);
        Integer numValueOf5 = Integer.valueOf(this.f232503a.get(2));
        Integer numValueOf6 = Integer.valueOf(this.f232503a.get(1));
        this.f232506d.setOnSelection(new a(numValueOf5.intValue(), numValueOf6.intValue(), iIntValue3, iIntValue));
    }
}
