package com.avito.android.remote.model.onboarding;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnboardingQuiz.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/onboarding/AnswersType;", "", "(Ljava/lang/String;I)V", "Select", "Multiselect", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AnswersType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AnswersType[] $VALUES;

    @c("select")
    public static final AnswersType Select = new AnswersType("Select", 0);

    @c("multiselect")
    public static final AnswersType Multiselect = new AnswersType("Multiselect", 1);

    private static final /* synthetic */ AnswersType[] $values() {
        return new AnswersType[]{Select, Multiselect};
    }

    static {
        AnswersType[] answersTypeArr$values = $values();
        $VALUES = answersTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(answersTypeArr$values);
    }

    private AnswersType(String str, int i12) {
    }

    @k
    public static a<AnswersType> getEntries() {
        return $ENTRIES;
    }

    public static AnswersType valueOf(String str) {
        return (AnswersType) Enum.valueOf(AnswersType.class, str);
    }

    public static AnswersType[] values() {
        return (AnswersType[]) $VALUES.clone();
    }
}
