package com.avito.android.job.cv_info_actualization.data.mapper;

import com.avito.android.job.cv_info_actualization.generated.api.v_1__job_cv_actualization.CvActualizationBlock;
import com.avito.android.job.cv_info_actualization.generated.api.v_1__job_cv_actualization.CvActualizationBlockSettings;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: V1JobCvActualizationResponseMapper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/data/mapper/a;", "", "<init>", "()V", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: V1JobCvActualizationResponseMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.job.cv_info_actualization.data.mapper.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C5125a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f174021a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f174022b;

        static {
            int[] iArr = new int[CvActualizationBlockSettings.Type.values().length];
            try {
                iArr[CvActualizationBlockSettings.Type.Radio.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CvActualizationBlockSettings.Type.Chips.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CvActualizationBlockSettings.Type.Checkbox.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f174021a = iArr;
            int[] iArr2 = new int[CvActualizationBlock.Attribute.values().length];
            try {
                iArr2[CvActualizationBlock.Attribute.Phone.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CvActualizationBlock.Attribute.SearchStatus.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CvActualizationBlock.Attribute.CanStartWorkTomorrow.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CvActualizationBlock.Attribute.TypeOfJob.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f174022b = iArr2;
        }
    }

    @Inject
    public a() {
    }
}
