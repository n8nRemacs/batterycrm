package com.avito.android.rating_form.step.validations;

import com.avito.android.R;
import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.rating_form.api.remote.model.RatingFormField;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ExperienceValidationCoroutineInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating_form/step/validations/p;", "Lcom/avito/android/rating_form/step/validations/o;", "<init>", "()V", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class p implements o {

    /* compiled from: ExperienceValidationCoroutineInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/rating_form/step/validations/p$a;", "", "<init>", "()V", "", "EXPERIENCE_MODEL_SLUG", "Ljava/lang/String;", "EXPERIENCE_SLUG", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public p() {
    }

    @Override // com.avito.android.rating_form.step.validations.o
    @Y61.l
    public final FieldIdentifier a(@Y61.k FieldIdentifier fieldIdentifier, @Y61.k List<RatingFormField> list) {
        RatingFormField ratingFormField;
        Object next;
        Object next2;
        Object next3;
        if (fieldIdentifier.d()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it.next();
                if (L.f(((RatingFormField) next3).getSlug(), fieldIdentifier.f247886c)) {
                    break;
                }
            }
            ratingFormField = (RatingFormField) next3;
        } else if (fieldIdentifier.c()) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((RatingFormField) next).getId() == fieldIdentifier.f247885b) {
                    break;
                }
            }
            ratingFormField = (RatingFormField) next;
        } else {
            ratingFormField = null;
        }
        if (!L.f(ratingFormField != null ? ratingFormField.getSlug() : null, "experience")) {
            return null;
        }
        Iterator<T> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
            if (L.f(((RatingFormField) next2).getSlug(), "experienceModel")) {
                break;
            }
        }
        RatingFormField ratingFormField2 = (RatingFormField) next2;
        if (ratingFormField2 != null) {
            return new FieldIdentifier(ratingFormField2.getId(), "experienceModel");
        }
        return null;
    }

    @Override // com.avito.android.rating_form.step.validations.o
    @Y61.l
    public final LinkedHashMap b(@Y61.k List list) {
        Object next;
        Object next2;
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((RatingFormField) next).getSlug(), "experience")) {
                break;
            }
        }
        RatingFormField ratingFormField = (RatingFormField) next;
        if (ratingFormField != null) {
            RatingFormField.ValueType value = ratingFormField.getValue();
            RatingFormField.ValueType.LongValue longValue = value instanceof RatingFormField.ValueType.LongValue ? (RatingFormField.ValueType.LongValue) value : null;
            if (longValue != null) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (L.f(((RatingFormField) next2).getSlug(), "experienceModel")) {
                        break;
                    }
                }
                RatingFormField ratingFormField2 = (RatingFormField) next2;
                if (ratingFormField2 == null) {
                    return new LinkedHashMap();
                }
                RatingFormField.ValueType value2 = ratingFormField2.getValue();
                RatingFormField.ValueType.LongValue longValue2 = value2 instanceof RatingFormField.ValueType.LongValue ? (RatingFormField.ValueType.LongValue) value2 : null;
                if (longValue2 == null) {
                    return new LinkedHashMap();
                }
                long j12 = longValue2.f248001b;
                long j13 = longValue.f248001b;
                return (!(j12 == 1 || j12 == 2) ? !(j12 != 3 ? j12 != 4 ? j12 != 5 ? j12 != 6 || j13 >= 10 : j13 >= 5 : j13 >= 3 : j13 >= 1) : j13 < 0) ? new LinkedHashMap() : P0.j(new Q(new FieldIdentifier(ratingFormField2.getId(), ratingFormField2.getSlug()), com.avito.android.printable_text.b.c(R.string.experience_validation_message, new Serializable[0])));
            }
        }
        return new LinkedHashMap();
    }
}
