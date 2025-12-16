package com.avito.android.short_term_rent.soft_booking.mvi.state;

import Y61.k;
import com.avito.android.remote.model.BadgeItemSize;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.EmailParameter;
import com.avito.android.remote.model.category_parameters.PhoneParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.short_term_rent.soft_booking.entity.StrSoftBookingContactFieldType;
import com.avito.android.short_term_rent.utils.m;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import pw0.C47158b;
import rw0.AbstractC47929d;

/* compiled from: StrSoftBookingViewStateBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/state/c;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/state/b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final m f282810a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.short_term_rent.utils.a f282811b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.short_term_rent.utils.d f282812c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Object f282813d = P0.g(new Q("name", StrSoftBookingContactFieldType.f282654b), new Q("phone", StrSoftBookingContactFieldType.f282655c), new Q("email", StrSoftBookingContactFieldType.f282656d));

    /* compiled from: StrSoftBookingViewStateBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f282814a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f282815b;

        static {
            int[] iArr = new int[StrSoftBookingContactFieldType.values().length];
            try {
                StrSoftBookingContactFieldType strSoftBookingContactFieldType = StrSoftBookingContactFieldType.f282654b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                StrSoftBookingContactFieldType strSoftBookingContactFieldType2 = StrSoftBookingContactFieldType.f282654b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                StrSoftBookingContactFieldType strSoftBookingContactFieldType3 = StrSoftBookingContactFieldType.f282654b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f282814a = iArr;
            int[] iArr2 = new int[BadgeItemSize.values().length];
            try {
                iArr2[BadgeItemSize.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BadgeItemSize.LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f282815b = iArr2;
        }
    }

    @Inject
    public c(@k m mVar, @k com.avito.android.short_term_rent.utils.a aVar, @k com.avito.android.short_term_rent.utils.d dVar) {
        this.f282810a = mVar;
        this.f282811b = aVar;
        this.f282812c = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03e3  */
    /* JADX WARN: Type inference failed for: r22v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v7, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList] */
    @Override // com.avito.android.short_term_rent.soft_booking.mvi.state.b
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.short_term_rent.soft_booking.mvi.state.a a(@Y61.k com.avito.android.short_term_rent.soft_booking.mvi.state.a r43) {
        /*
            Method dump skipped, instructions count: 1196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.short_term_rent.soft_booking.mvi.state.c.a(com.avito.android.short_term_rent.soft_booking.mvi.state.a):com.avito.android.short_term_rent.soft_booking.mvi.state.a");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17, types: [com.avito.android.remote.model.category_parameters.PhoneParameter] */
    /* JADX WARN: Type inference failed for: r1v24, types: [com.avito.android.remote.model.category_parameters.EmailParameter] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.Map] */
    public final AbstractC47929d b(List<? extends ParameterSlot> list, C47158b c47158b) {
        Object next;
        CharParameter charParameter;
        String value;
        Object next2;
        Object next3;
        StrSoftBookingContactFieldType strSoftBookingContactFieldType = c47158b != null ? c47158b.f428857c : null;
        int i12 = strSoftBookingContactFieldType == null ? -1 : a.f282814a[strSoftBookingContactFieldType.ordinal()];
        if (i12 == 1) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next instanceof CharParameter) {
                    break;
                }
            }
            if (!(next instanceof CharParameter)) {
                next = null;
            }
            charParameter = (CharParameter) next;
        } else if (i12 == 2) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (next2 instanceof PhoneParameter) {
                    break;
                }
            }
            if (!(next2 instanceof PhoneParameter)) {
                next2 = null;
            }
            charParameter = (PhoneParameter) next2;
        } else if (i12 != 3) {
            charParameter = null;
        } else {
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
                if (next3 instanceof EmailParameter) {
                    break;
                }
            }
            if (!(next3 instanceof EmailParameter)) {
                next3 = null;
            }
            charParameter = (EmailParameter) next3;
        }
        if (charParameter == null) {
            return AbstractC47929d.a.f437179a;
        }
        StrSoftBookingContactFieldType strSoftBookingContactFieldType2 = (StrSoftBookingContactFieldType) this.f282813d.get(charParameter.getId());
        if (strSoftBookingContactFieldType2 == null) {
            return AbstractC47929d.a.f437179a;
        }
        if (c47158b == null || (value = c47158b.f428856b) == null) {
            value = charParameter.getValue();
        }
        String str = value;
        return (c47158b != null ? c47158b.f428858d : null) == null ? new AbstractC47929d.b.C12601b(str, charParameter.getPlaceholder(), strSoftBookingContactFieldType2, charParameter.getId()) : new AbstractC47929d.b.a(str, c47158b.f428858d, charParameter.getPlaceholder(), strSoftBookingContactFieldType2, charParameter.getId());
    }
}
