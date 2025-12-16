package com.avito.android.job.cv_info_actualization.generated.api.v_1__job_cv_actualization;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: V1JobCvActualizationResponse.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\u0010B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/generated/api/v_1__job_cv_actualization/CvActualizationBlockSettings;", "", "", "isMultiple", "isRequired", "Lcom/avito/android/job/cv_info_actualization/generated/api/v_1__job_cv_actualization/CvActualizationBlockSettings$Type;", "type", "<init>", "(ZZLcom/avito/android/job/cv_info_actualization/generated/api/v_1__job_cv_actualization/CvActualizationBlockSettings$Type;)V", "Z", "b", "()Z", "c", "Lcom/avito/android/job/cv_info_actualization/generated/api/v_1__job_cv_actualization/CvActualizationBlockSettings$Type;", "a", "()Lcom/avito/android/job/cv_info_actualization/generated/api/v_1__job_cv_actualization/CvActualizationBlockSettings$Type;", "Type", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CvActualizationBlockSettings {

    @c("isMultiple")
    private final boolean isMultiple;

    @c("isRequired")
    private final boolean isRequired;

    @c("type")
    @k
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: V1JobCvActualizationResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/generated/api/v_1__job_cv_actualization/CvActualizationBlockSettings$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Radio", "Chips", "Checkbox", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("checkbox")
        public static final Type Checkbox;

        @c("chips")
        public static final Type Chips;

        @c("radio")
        public static final Type Radio;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f174082b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f174083c;

        static {
            Type type = new Type("Radio", 0, "radio");
            Radio = type;
            Type type2 = new Type("Chips", 1, "chips");
            Chips = type2;
            Type type3 = new Type("Checkbox", 2, "checkbox");
            Checkbox = type3;
            Type[] typeArr = {type, type2, type3};
            f174082b = typeArr;
            f174083c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f174082b.clone();
        }
    }

    public CvActualizationBlockSettings(boolean z12, boolean z13, @k Type type) {
        this.isMultiple = z12;
        this.isRequired = z13;
        this.type = type;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsMultiple() {
        return this.isMultiple;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }
}
