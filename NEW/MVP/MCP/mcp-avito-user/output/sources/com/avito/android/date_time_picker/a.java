package com.avito.android.date_time_picker;

import Y41.l;
import android.content.Context;
import android.view.View;
import com.avito.android.R;
import com.avito.android.date_time_picker.DateTimeWheel;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.printable_text.PrintableText;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.EnumMap;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import lu.InterfaceC43831a;
import mu.C44135b;
import mu.C44137d;
import mu.InterfaceC44134a;

/* compiled from: DateTimePicker.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/date_time_picker/a;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "c", "_avito_date-time-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f132653J = 0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final c f132654E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final N f132655F;

    /* renamed from: G, reason: collision with root package name */
    public final Calendar f132656G;

    /* renamed from: H, reason: collision with root package name */
    public EnumMap f132657H;

    /* renamed from: I, reason: collision with root package name */
    public Button f132658I;

    /* compiled from: DateTimePicker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.date_time_picker.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C3969a extends H implements l<View, G0> {
        public final void f(@Y61.k View view) {
            ArrayList arrayList;
            Object eVar;
            a aVar = (a) this.receiver;
            int i12 = a.f132653J;
            aVar.getClass();
            Picker picker = (Picker) view.findViewById(R.id.date_picker);
            c cVar = aVar.f132654E;
            List<DateTimeWheel> listU = cVar.f132660b;
            if (listU == null) {
                listU = C42745f0.U(new DateTimeWheel(DateTimeWheel.Type.f132593b, null, null, 0, 14, null), new DateTimeWheel(DateTimeWheel.Type.f132594c, null, null, 0, 14, null), new DateTimeWheel(DateTimeWheel.Type.f132595d, null, null, 0, 14, null));
            }
            DateTimeWheel.Type[] typeArrValues = DateTimeWheel.Type.values();
            int iF2 = P0.f(typeArrValues.length);
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
            for (DateTimeWheel.Type type : typeArrValues) {
                int iOrdinal = type.ordinal();
                if (iOrdinal == 0) {
                    final lu.d dVar = lu.d.f414228a;
                    eVar = new InterfaceC44134a() { // from class: lu.b
                        @Override // mu.InterfaceC44134a
                        public final InterfaceC43831a a(DateTimeWheel dateTimeWheel) {
                            return dVar;
                        }
                    };
                } else if (iOrdinal == 1) {
                    final lu.j jVar = lu.j.f414233a;
                    eVar = new InterfaceC44134a() { // from class: lu.b
                        @Override // mu.InterfaceC44134a
                        public final InterfaceC43831a a(DateTimeWheel dateTimeWheel) {
                            return jVar;
                        }
                    };
                } else if (iOrdinal == 2) {
                    eVar = new mu.e(cVar);
                } else if (iOrdinal == 3) {
                    eVar = C44135b.f414793a;
                } else if (iOrdinal == 4) {
                    eVar = C44137d.f414794a;
                } else {
                    if (iOrdinal != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    final lu.f fVar = lu.f.f414230a;
                    eVar = new InterfaceC44134a() { // from class: lu.b
                        @Override // mu.InterfaceC44134a
                        public final InterfaceC43831a a(DateTimeWheel dateTimeWheel) {
                            return fVar;
                        }
                    };
                }
                linkedHashMap.put(type, eVar);
            }
            com.avito.android.date_time_picker.d dVar2 = new com.avito.android.date_time_picker.d(linkedHashMap);
            EnumMap enumMap = new EnumMap(DateTimeWheel.Type.class);
            for (DateTimeWheel dateTimeWheel : listU) {
                DateTimeWheel.Type type2 = dateTimeWheel.f132589a;
                enumMap.put((EnumMap) type2, (DateTimeWheel.Type) ((InterfaceC44134a) P0.d(dVar2.f132669a, type2)).a(dateTimeWheel));
            }
            aVar.f132657H = enumMap;
            Iterator it = enumMap.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                arrayList = picker.f179978b;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                DateTimeWheel.Type type3 = (DateTimeWheel.Type) entry.getKey();
                InterfaceC43831a interfaceC43831a = (InterfaceC43831a) entry.getValue();
                Picker.d(picker, interfaceC43831a.getData(), interfaceC43831a.getStyle(), 12);
                if (type3 == DateTimeWheel.Type.f132596e) {
                    EnumMap enumMap2 = aVar.f132657H;
                    if (enumMap2 == null) {
                        enumMap2 = null;
                    }
                    if (enumMap2.containsKey(DateTimeWheel.Type.f132597f)) {
                        picker.a(aVar.getContext().getString(R.string.time_hour_separator));
                    }
                }
                com.avito.android.date_time_picker.b bVar = new com.avito.android.date_time_picker.b(aVar, type3, picker);
                EnumMap enumMap3 = aVar.f132657H;
                com.avito.android.lib.design.picker.i iVar = (com.avito.android.lib.design.picker.i) C42745f0.K(C42745f0.L((enumMap3 != null ? enumMap3 : null).keySet(), type3), arrayList);
                if (iVar != null) {
                    iVar.f180031p.add(bVar);
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getDefault());
            Long l12 = cVar.f132661c;
            if (l12 != null) {
                gregorianCalendar.setTimeInMillis(l12.longValue());
            }
            EnumMap enumMap4 = aVar.f132657H;
            if (enumMap4 == null) {
                enumMap4 = null;
            }
            for (Map.Entry entry2 : enumMap4.entrySet()) {
                DateTimeWheel.Type type4 = (DateTimeWheel.Type) entry2.getKey();
                com.avito.android.lib.design.picker.k<?> kVarA = ((InterfaceC43831a) entry2.getValue()).a(gregorianCalendar);
                EnumMap enumMap5 = aVar.f132657H;
                if (enumMap5 == null) {
                    enumMap5 = null;
                }
                com.avito.android.lib.design.picker.i iVar2 = (com.avito.android.lib.design.picker.i) C42745f0.K(C42745f0.L(enumMap5.keySet(), type4), arrayList);
                if (iVar2 != null) {
                    iVar2.setSelectedResult(kVarA);
                }
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(View view) {
            f(view);
            return G0.f406611a;
        }
    }

    /* compiled from: DateTimePicker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            a aVar = (a) this.receiver;
            int i12 = a.f132653J;
            aVar.getClass();
            Button button = (Button) view.findViewById(R.id.main_button);
            aVar.f132658I = button;
            button.setText(aVar.f132654E.f132665g.k0(button.getContext()));
            button.setOnClickListener(new com.avito.android.comfortable_deal.deal.item.agent.h(aVar, 22));
            return G0.f406611a;
        }
    }

    /* compiled from: DateTimePicker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d {
        static {
            int[] iArr = new int[PickerHeaderType.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PickerHeaderType pickerHeaderType = PickerHeaderType.f132601b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[DateTimeWheel.Type.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                DateTimeWheel.Type type = DateTimeWheel.Type.f132593b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                DateTimeWheel.Type type2 = DateTimeWheel.Type.f132593b;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                DateTimeWheel.Type type3 = DateTimeWheel.Type.f132593b;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                DateTimeWheel.Type type4 = DateTimeWheel.Type.f132593b;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                DateTimeWheel.Type type5 = DateTimeWheel.Type.f132593b;
                iArr2[5] = 6;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@Y61.k Context context, @Y61.k c cVar, @Y61.k l<? super Long, G0> lVar) {
        super(context, 0, 2, null);
        this.f132654E = cVar;
        this.f132655F = (N) lVar;
        Calendar calendar = Calendar.getInstance(new Locale("ru", "RU"));
        calendar.setTime(new Date(0L));
        this.f132656G = calendar;
        B(R.layout.date_time_picker_layout, R.layout.date_time_picker_footer_layout, new C3969a(1, this, a.class, "onContentInflated", "onContentInflated(Landroid/view/View;)V", 0), new b(1, this, a.class, "onFooterInflated", "onFooterInflated(Landroid/view/View;)V", 0), false);
        int iOrdinal = cVar.f132664f.ordinal();
        if (iOrdinal == 0) {
            com.avito.android.lib.design.bottom_sheet.j.c(this, cVar.f132659a, true, 0, 0, 0, 120);
        } else if (iOrdinal == 1) {
            com.avito.android.lib.design.bottom_sheet.d.M(this, cVar.f132659a, true, true, 2);
        }
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        setCancelable(true);
        T();
        setCanceledOnTouchOutside(true);
    }

    public final com.avito.android.lib.design.picker.k<?> V(Picker picker, DateTimeWheel.Type type) {
        EnumMap enumMap = this.f132657H;
        if (enumMap == null) {
            enumMap = null;
        }
        int iL2 = C42745f0.L(enumMap.keySet(), type);
        Integer numValueOf = Integer.valueOf(iL2);
        if (iL2 == -1) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        return ((com.avito.android.lib.design.picker.i) picker.f179978b.get(numValueOf.intValue())).getSelectedResult();
    }

    /* compiled from: DateTimePicker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/date_time_picker/a$c;", "", "_avito_date-time-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f132659a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final List<DateTimeWheel> f132660b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Long f132661c;

        /* renamed from: d, reason: collision with root package name */
        public final long f132662d;

        /* renamed from: e, reason: collision with root package name */
        public final long f132663e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final PickerHeaderType f132664f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final PrintableText f132665g;

        public c(@Y61.k String str, @Y61.l List<DateTimeWheel> list, @Y61.l Long l12, long j12, long j13, @Y61.k PickerHeaderType pickerHeaderType, @Y61.k PrintableText printableText) {
            this.f132659a = str;
            this.f132660b = list;
            this.f132661c = l12;
            this.f132662d = j12;
            this.f132663e = j13;
            this.f132664f = pickerHeaderType;
            this.f132665g = printableText;
        }

        public /* synthetic */ c(String str, List list, Long l12, long j12, long j13, PickerHeaderType pickerHeaderType, PrintableText printableText, int i12, C42822w c42822w) {
            this(str, list, l12, j12, j13, (i12 & 32) != 0 ? PickerHeaderType.f132601b : pickerHeaderType, (i12 & 64) != 0 ? com.avito.android.printable_text.b.c(R.string.dtp_button_ready, new Serializable[0]) : printableText);
        }
    }
}
