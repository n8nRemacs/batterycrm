package com.avito.android.job.cv_info_actualization.generated.api.v_1__job_cv_actualization;

import QP.a;
import QP.b;
import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: V1JobCvActualizationResponse.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001:\u0001$BY\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b\"\u0010!R\u001a\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b#\u0010!¨\u0006%"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/generated/api/v_1__job_cv_actualization/CvActualizationBlock;", "", "LQP/a;", "action", "Lcom/avito/android/job/cv_info_actualization/generated/api/v_1__job_cv_actualization/CvActualizationBlock$Attribute;", "attribute", "", "LQP/b;", "options", "", "selected", "Lcom/avito/android/job/cv_info_actualization/generated/api/v_1__job_cv_actualization/CvActualizationBlockSettings;", "settings", "subtitle", "tipText", "title", "<init>", "(LQP/a;Lcom/avito/android/job/cv_info_actualization/generated/api/v_1__job_cv_actualization/CvActualizationBlock$Attribute;Ljava/util/List;Ljava/util/List;Lcom/avito/android/job/cv_info_actualization/generated/api/v_1__job_cv_actualization/CvActualizationBlockSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "LQP/a;", "a", "()LQP/a;", "Lcom/avito/android/job/cv_info_actualization/generated/api/v_1__job_cv_actualization/CvActualizationBlock$Attribute;", "b", "()Lcom/avito/android/job/cv_info_actualization/generated/api/v_1__job_cv_actualization/CvActualizationBlock$Attribute;", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "Lcom/avito/android/job/cv_info_actualization/generated/api/v_1__job_cv_actualization/CvActualizationBlockSettings;", "e", "()Lcom/avito/android/job/cv_info_actualization/generated/api/v_1__job_cv_actualization/CvActualizationBlockSettings;", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "g", "h", "Attribute", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CvActualizationBlock {

    @c("action")
    @l
    private final a action;

    @c("attribute")
    @k
    private final Attribute attribute;

    @c("options")
    @k
    private final List<b> options;

    @c("selected")
    @k
    private final List<String> selected;

    @c("settings")
    @k
    private final CvActualizationBlockSettings settings;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("tipText")
    @l
    private final String tipText;

    @c("title")
    @k
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: V1JobCvActualizationResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/generated/api/v_1__job_cv_actualization/CvActualizationBlock$Attribute;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Phone", "SearchStatus", "CanStartWorkTomorrow", "TypeOfJob", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
        public static final /* synthetic */ Attribute[] f174079b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f174080c;

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
            f174079b = attributeArr;
            f174080c = kotlin.enums.c.a(attributeArr);
        }

        private Attribute(String str, int i12, String str2) {
        }

        public static Attribute valueOf(String str) {
            return (Attribute) Enum.valueOf(Attribute.class, str);
        }

        public static Attribute[] values() {
            return (Attribute[]) f174079b.clone();
        }
    }

    public CvActualizationBlock(@l a aVar, @k Attribute attribute, @k List<b> list, @k List<String> list2, @k CvActualizationBlockSettings cvActualizationBlockSettings, @l String str, @l String str2, @k String str3) {
        this.action = aVar;
        this.attribute = attribute;
        this.options = list;
        this.selected = list2;
        this.settings = cvActualizationBlockSettings;
        this.subtitle = str;
        this.tipText = str2;
        this.title = str3;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final a getAction() {
        return this.action;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final Attribute getAttribute() {
        return this.attribute;
    }

    @k
    public final List<b> c() {
        return this.options;
    }

    @k
    public final List<String> d() {
        return this.selected;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final CvActualizationBlockSettings getSettings() {
        return this.settings;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getTipText() {
        return this.tipText;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
