package com.avito.android.rating_form.step;

import com.avito.android.rating_form.StepIdentifier;
import com.avito.android.rating_form.api.remote.model.RatingFormField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: RatingFormStepScreenName.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/u;", "Lcom/avito/android/rating_form/step/t;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class u implements t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_form.y f249736a;

    /* compiled from: RatingFormStepScreenName.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f249737a;

        static {
            int[] iArr = new int[RatingFormField.ViewType.values().length];
            try {
                iArr[RatingFormField.ViewType.INPUT_NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RatingFormField.ViewType.INPUT_TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RatingFormField.ViewType.TEXTAREA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RatingFormField.ViewType.SCORE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RatingFormField.ViewType.SELECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RatingFormField.ViewType.ADDRESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[RatingFormField.ViewType.DEVELOPMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[RatingFormField.ViewType.CHECKBOX.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[RatingFormField.ViewType.RADIO_BUTTON.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[RatingFormField.ViewType.IMAGES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[RatingFormField.ViewType.ITEMS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[RatingFormField.ViewType.FILES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[RatingFormField.ViewType.CHIPS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f249737a = iArr;
        }
    }

    @Inject
    public u(@Y61.k com.avito.android.rating_form.y yVar) {
        this.f249736a = yVar;
    }

    @Override // com.avito.android.rating_form.step.t
    @Y61.k
    public final String a(int i12, @Y61.l StepIdentifier stepIdentifier) {
        com.avito.android.rating_form.m mVarB = this.f249736a.b(i12);
        HashMap map = new HashMap();
        ArrayList<RatingFormField> arrayListY = mVarB.y(stepIdentifier);
        if (arrayListY != null) {
            for (RatingFormField ratingFormField : arrayListY) {
                RatingFormField.ViewType viewType = ratingFormField.getViewType();
                Integer num = (Integer) map.get(ratingFormField.getViewType());
                int iIntValue = 1;
                if (num != null) {
                    iIntValue = 1 + num.intValue();
                }
                map.put(viewType, Integer.valueOf(iIntValue));
            }
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            StringBuilder sb2 = new StringBuilder();
            int iIntValue2 = ((Number) entry.getValue()).intValue();
            if (iIntValue2 < 0 || iIntValue2 >= 2) {
                sb2.append("Many");
            } else {
                sb2.append("One");
            }
            switch (a.f249737a[((RatingFormField.ViewType) entry.getKey()).ordinal()]) {
                case 1:
                    sb2.append("InputNumber");
                    break;
                case 2:
                    sb2.append("InputText");
                    break;
                case 3:
                    sb2.append("TextArea");
                    break;
                case 4:
                    sb2.append("Score");
                    break;
                case 5:
                    sb2.append("Select");
                    break;
                case 6:
                    sb2.append("SelectAddress");
                    break;
                case 7:
                    sb2.append("SelectDevelopment");
                    break;
                case 8:
                    sb2.append("CheckBox");
                    break;
                case 9:
                    sb2.append("RadioButton");
                    break;
                case 10:
                    sb2.append("Images");
                    break;
                case 11:
                    sb2.append("Items");
                    break;
                case 12:
                    sb2.append("Files");
                    break;
                case 13:
                    sb2.append("Chips");
                    break;
            }
            arrayList.add(sb2.toString());
        }
        return C42745f0.O(C42745f0.A0(arrayList), "", null, null, null, 62);
    }
}
