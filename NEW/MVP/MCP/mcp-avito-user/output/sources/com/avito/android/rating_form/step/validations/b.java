package com.avito.android.rating_form.step.validations;

import com.avito.android.rating_form.api.remote.model.RatingFormField;
import com.avito.android.rating_form.api.remote.model.a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ClientValidationCoroutineInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/step/validations/b;", "Lcom/avito/android/rating_form/step/validations/a;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.rating_form.step.validations.a {

    /* compiled from: ClientValidationCoroutineInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f249742a;

        static {
            int[] iArr = new int[RatingFormField.Validation.Rule.values().length];
            try {
                iArr[RatingFormField.Validation.Rule.REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RatingFormField.Validation.Rule.RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RatingFormField.Validation.Rule.LENGTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f249742a = iArr;
        }
    }

    @Inject
    public b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.avito.android.rating_form.step.validations.u b(com.avito.android.rating_form.step.validations.b r14, kotlin.Q r15) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.step.validations.b.b(com.avito.android.rating_form.step.validations.b, kotlin.Q):com.avito.android.rating_form.step.validations.u");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public static List c(a.e eVar, RatingFormField ratingFormField) {
        List<Integer> listC;
        a.e.AbstractC7454a data = eVar != null ? eVar.getData() : null;
        a.e.AbstractC7454a.C7455a c7455a = data instanceof a.e.AbstractC7454a.C7455a ? (a.e.AbstractC7454a.C7455a) data : null;
        if (c7455a != null && (listC = c7455a.c()) != null) {
            return listC;
        }
        RatingFormField.ValueType value = ratingFormField.getValue();
        RatingFormField.ValueType.IntArrayValue intArrayValue = value instanceof RatingFormField.ValueType.IntArrayValue ? (RatingFormField.ValueType.IntArrayValue) value : null;
        if (intArrayValue != null) {
            return intArrayValue.f247999b;
        }
        return null;
    }

    public static List d(a.e eVar, RatingFormField ratingFormField) {
        List<Long> listC;
        a.e.AbstractC7454a data = eVar != null ? eVar.getData() : null;
        a.e.AbstractC7454a.b bVar = data instanceof a.e.AbstractC7454a.b ? (a.e.AbstractC7454a.b) data : null;
        if (bVar != null && (listC = bVar.c()) != null) {
            return listC;
        }
        RatingFormField.ValueType value = ratingFormField.getValue();
        RatingFormField.ValueType.LongArrayValue longArrayValue = value instanceof RatingFormField.ValueType.LongArrayValue ? (RatingFormField.ValueType.LongArrayValue) value : null;
        if (longArrayValue != null) {
            return longArrayValue.f248000b;
        }
        return null;
    }

    public static Long e(a.e eVar, RatingFormField ratingFormField) {
        a.e.AbstractC7454a data = eVar != null ? eVar.getData() : null;
        a.e.AbstractC7454a.c cVar = data instanceof a.e.AbstractC7454a.c ? (a.e.AbstractC7454a.c) data : null;
        if (cVar != null) {
            return Long.valueOf(cVar.getValue());
        }
        RatingFormField.ValueType value = ratingFormField.getValue();
        RatingFormField.ValueType.LongValue longValue = value instanceof RatingFormField.ValueType.LongValue ? (RatingFormField.ValueType.LongValue) value : null;
        if (longValue != null) {
            return Long.valueOf(longValue.f248001b);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public static List f(a.e eVar, RatingFormField ratingFormField) {
        List<String> listC;
        a.e.AbstractC7454a data = eVar != null ? eVar.getData() : null;
        a.e.AbstractC7454a.d dVar = data instanceof a.e.AbstractC7454a.d ? (a.e.AbstractC7454a.d) data : null;
        if (dVar != null && (listC = dVar.c()) != null) {
            return listC;
        }
        RatingFormField.ValueType value = ratingFormField.getValue();
        RatingFormField.ValueType.StringArrayValue stringArrayValue = value instanceof RatingFormField.ValueType.StringArrayValue ? (RatingFormField.ValueType.StringArrayValue) value : null;
        if (stringArrayValue != null) {
            return stringArrayValue.f248002b;
        }
        return null;
    }

    public static String g(a.e eVar, RatingFormField ratingFormField) {
        String value;
        a.e.AbstractC7454a data = eVar != null ? eVar.getData() : null;
        a.e.AbstractC7454a.C7456e c7456e = data instanceof a.e.AbstractC7454a.C7456e ? (a.e.AbstractC7454a.C7456e) data : null;
        if (c7456e != null && (value = c7456e.getValue()) != null) {
            return value;
        }
        RatingFormField.ValueType value2 = ratingFormField.getValue();
        RatingFormField.ValueType.StringValue stringValue = value2 instanceof RatingFormField.ValueType.StringValue ? (RatingFormField.ValueType.StringValue) value2 : null;
        if (stringValue != null) {
            return stringValue.f248003b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012e  */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    @Override // com.avito.android.rating_form.step.validations.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.LinkedHashMap a(@Y61.k java.util.List r23, @Y61.k java.util.List r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.step.validations.b.a(java.util.List, java.util.List, boolean):java.util.LinkedHashMap");
    }
}
