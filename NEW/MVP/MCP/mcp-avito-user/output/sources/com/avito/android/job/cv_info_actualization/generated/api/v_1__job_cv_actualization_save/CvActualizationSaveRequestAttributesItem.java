package com.avito.android.job.cv_info_actualization.generated.api.v_1__job_cv_actualization_save;

import Y61.k;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: V1JobCvActualizationSaveRequest.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000fB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/generated/api/v_1__job_cv_actualization_save/CvActualizationSaveRequestAttributesItem;", "", "Lcom/avito/android/job/cv_info_actualization/generated/api/v_1__job_cv_actualization_save/CvActualizationSaveRequestAttributesItem$Attribute;", "attribute", "", "", "selected", "<init>", "(Lcom/avito/android/job/cv_info_actualization/generated/api/v_1__job_cv_actualization_save/CvActualizationSaveRequestAttributesItem$Attribute;Ljava/util/List;)V", "Lcom/avito/android/job/cv_info_actualization/generated/api/v_1__job_cv_actualization_save/CvActualizationSaveRequestAttributesItem$Attribute;", "getAttribute", "()Lcom/avito/android/job/cv_info_actualization/generated/api/v_1__job_cv_actualization_save/CvActualizationSaveRequestAttributesItem$Attribute;", "Ljava/util/List;", "getSelected", "()Ljava/util/List;", "Attribute", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CvActualizationSaveRequestAttributesItem {

    @c("attribute")
    @k
    private final Attribute attribute;

    @c("selected")
    @k
    private final List<String> selected;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: V1JobCvActualizationSaveRequest.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/generated/api/v_1__job_cv_actualization_save/CvActualizationSaveRequestAttributesItem$Attribute;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Phone", "SearchStatus", "CanStartWorkTomorrow", "TypeOfJob", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Attribute {

        @c("canStartWorkTomorrow")
        public static final Attribute CanStartWorkTomorrow;

        @c("phone")
        public static final Attribute Phone;

        @c("searchStatus")
        public static final Attribute SearchStatus;

        @c("typeOfJob")
        public static final Attribute TypeOfJob;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Attribute[] f174085b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f174086c;

        static {
            Attribute attribute = new Attribute("Phone", 0, "phone");
            Phone = attribute;
            Attribute attribute2 = new Attribute("SearchStatus", 1, "searchStatus");
            SearchStatus = attribute2;
            Attribute attribute3 = new Attribute("CanStartWorkTomorrow", 2, "canStartWorkTomorrow");
            CanStartWorkTomorrow = attribute3;
            Attribute attribute4 = new Attribute("TypeOfJob", 3, "typeOfJob");
            TypeOfJob = attribute4;
            Attribute[] attributeArr = {attribute, attribute2, attribute3, attribute4};
            f174085b = attributeArr;
            f174086c = kotlin.enums.c.a(attributeArr);
        }

        private Attribute(String str, int i12, String str2) {
        }

        public static Attribute valueOf(String str) {
            return (Attribute) Enum.valueOf(Attribute.class, str);
        }

        public static Attribute[] values() {
            return (Attribute[]) f174085b.clone();
        }
    }

    public CvActualizationSaveRequestAttributesItem(@k Attribute attribute, @k List<String> list) {
        this.attribute = attribute;
        this.selected = list;
    }
}
