package com.avito.android.publish.date_picker;

import Y61.k;
import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.blueprints.publish.date_interval.c;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.date_time_picker.DateTimeWheel;
import com.avito.android.date_time_picker.PickerHeaderType;
import com.avito.android.date_time_picker.a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.publish.date_picker.e;
import com.avito.android.remote.model.category_parameters.SelectionType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import t3.k0;
import u3.l;

/* compiled from: DatePickerHelper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/date_picker/b;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<SimpleTestGroupWithNone> f232488a;

    /* compiled from: DatePickerHelper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[DateTimeWheel.Type.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DateTimeWheel.Type type = DateTimeWheel.Type.f132593b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                DateTimeWheel.Type type2 = DateTimeWheel.Type.f132593b;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                DateTimeWheel.Type type3 = DateTimeWheel.Type.f132593b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                DateTimeWheel.Type type4 = DateTimeWheel.Type.f132593b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Inject
    public b(@k @k0 l<SimpleTestGroupWithNone> lVar) {
        this.f232488a = lVar;
    }

    public static final DateTimeWheel a(Map<String, ParameterElement.C29378f> map, b bVar, DateTimeWheel.Type type, int i12) {
        ParameterElement.C29378f c29378f;
        Integer num;
        if (map != null) {
            bVar.getClass();
            int iOrdinal = type.ordinal();
            c29378f = map.get(iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : SelectionType.TYPE_MINUTE : SelectionType.TYPE_HOUR : SelectionType.TYPE_YEAR : SelectionType.TYPE_MONTH : SelectionType.TYPE_DAY);
        } else {
            c29378f = null;
        }
        if (c29378f != null && (num = c29378f.f117421a) != null) {
            i12 = num.intValue();
        }
        return new DateTimeWheel(type, c29378f != null ? c29378f.f117422b : null, c29378f != null ? c29378f.f117423c : null, i12);
    }

    public static Q b(c.a aVar, ParameterElement.C29377e c29377e) {
        String str = c29377e.f117181b;
        ParameterElement.C29377e c29377e2 = aVar.f106126a.f117401e;
        boolean zF2 = L.f(str, c29377e2 != null ? c29377e2.f117181b : null);
        long jLongValue = c29377e.f117410g;
        long jLongValue2 = c29377e.f117409f;
        Long l12 = aVar.f106127b;
        if (zF2) {
            if (l12 != null) {
                jLongValue = l12.longValue();
            }
        } else if (l12 != null) {
            jLongValue2 = l12.longValue();
        }
        return new Q(Long.valueOf(jLongValue2), Long.valueOf(jLongValue));
    }

    public static void f(b bVar, Context context, ParameterElement.C29377e c29377e, Y41.l lVar) {
        com.avito.android.lib.design.bottom_sheet.d fVar;
        bVar.getClass();
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, R.style.Theme_DesignSystem_Re23);
        SelectionType selectionType = c29377e.f117414k;
        if (selectionType != null && !selectionType.hasDay() && selectionType.hasMonth() && selectionType.hasYear()) {
            Long lValueOf = Long.valueOf(c29377e.f117409f);
            Long lValueOf2 = Long.valueOf(c29377e.f117410g);
            long jLongValue = lValueOf.longValue();
            long jLongValue2 = lValueOf2.longValue();
            fVar = new e(dVar, new e.c(c29377e.f117407d, com.avito.android.printable_text.b.c(R.string.choose, new Serializable[0])), c29377e.f117408e, Long.valueOf(jLongValue), Long.valueOf(jLongValue2), lVar, true);
        } else {
            fVar = new f(dVar, c29377e, lVar, true);
        }
        com.avito.android.lib.util.g.a(fVar);
        fVar.s();
    }

    public final void c(@k Context context, @k ParameterElement.C29377e c29377e, @k Y41.l<? super Long, G0> lVar) {
        if (this.f232488a.f439745a.f439749b.b()) {
            f(this, context, c29377e, lVar);
            return;
        }
        com.avito.android.lib.util.g.a(new f(context, c29377e, lVar, false, 8, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(@k Context context, @k c.a aVar, @k ParameterElement.C29377e c29377e, @k Y41.l<? super Long, G0> lVar) {
        if (this.f232488a.f439745a.f439749b.b()) {
            f(this, context, c29377e, lVar);
            return;
        }
        Q qB2 = b(aVar, c29377e);
        long jLongValue = ((Number) qB2.f406619b).longValue();
        long jLongValue2 = ((Number) qB2.f406620c).longValue();
        boolean z12 = false;
        int i12 = 64;
        e eVar = new e(context, new e.c(c29377e.f117407d, com.avito.android.printable_text.b.c(R.string.choose, new Serializable[0])), c29377e.f117408e, Long.valueOf(jLongValue), Long.valueOf(jLongValue2), lVar, z12, i12, null);
        com.avito.android.lib.util.g.a(eVar);
        eVar.s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(@k Context context, @k c.a aVar, @k ParameterElement.C29377e c29377e, @k Y41.l<? super Long, G0> lVar) {
        ArrayList arrayListB;
        ParameterElement.C29376d c29376d = aVar.f106126a;
        Long l12 = null;
        Long l13 = aVar.f106127b;
        if (l13 != null) {
            ParameterElement.C29377e c29377e2 = c29376d.f117401e;
            SelectionType selectionType = c29377e2 != null ? c29377e2.f117414k : null;
            ParameterElement.C29377e c29377e3 = c29376d.f117402f;
            if (L.f(selectionType, c29377e3 != null ? c29377e3.f117414k : null)) {
                l12 = l13;
            }
        }
        Q qB2 = b(aVar, c29377e);
        long jLongValue = ((Number) qB2.f406619b).longValue();
        long jLongValue2 = ((Number) qB2.f406620c).longValue();
        PickerHeaderType pickerHeaderType = PickerHeaderType.f132602c;
        PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.choose, new Serializable[0]);
        Map<String, ParameterElement.C29378f> map = c29376d.f117404h;
        SelectionType selectionType2 = c29377e.f117414k;
        if (selectionType2 == null) {
            arrayListB = null;
        } else {
            DateTimeWheel dateTimeWheelA = selectionType2.hasDate() ? a(map, this, DateTimeWheel.Type.f132593b, 1) : null;
            DateTimeWheel dateTimeWheelA2 = selectionType2.hasMonth() ? a(map, this, DateTimeWheel.Type.f132594c, 1) : null;
            DateTimeWheel dateTimeWheelA3 = selectionType2.hasYear() ? a(map, this, DateTimeWheel.Type.f132595d, 1) : null;
            DateTimeWheel dateTimeWheelA4 = selectionType2.hasHour() ? a(map, this, DateTimeWheel.Type.f132596e, 1) : null;
            DateTimeWheel dateTimeWheelA5 = selectionType2.hasMinute() ? a(map, this, DateTimeWheel.Type.f132597f, 10) : null;
            a(map, this, DateTimeWheel.Type.f132598g, 1);
            selectionType2.hasTime();
            arrayListB = C42756l.B(new DateTimeWheel[]{dateTimeWheelA, dateTimeWheelA2, dateTimeWheelA3, dateTimeWheelA4, dateTimeWheelA5, null});
        }
        Long l14 = c29377e.f117408e;
        com.avito.android.lib.util.g.a(new com.avito.android.date_time_picker.a(context, new a.c(c29377e.f117407d, arrayListB, l14 == null ? l12 : l14, jLongValue, jLongValue2, pickerHeaderType, printableTextC), lVar));
    }
}
