package com.avito.android.cv_validation_bottom_sheet.di;

import Y41.l;
import Y61.k;
import android.content.res.Resources;
import com.avito.android.cv_validation_bottom_sheet.ui.CvValidationBottomSheet;
import com.avito.android.cv_validation_bottom_sheet.ui.CvValidationBottomSheetOpenParams;
import com.avito.android.di.B;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: CvValidationBottomSheetComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_validation_bottom_sheet/di/a;", "", "a", "_avito_job_cv-validation-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: CvValidationBottomSheetComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_validation_bottom_sheet/di/a$a;", "", "_avito_job_cv-validation-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.cv_validation_bottom_sheet.di.a$a, reason: collision with other inner class name */
    public interface InterfaceC3945a {
        @k
        a a(@h31.b @k CvValidationBottomSheetOpenParams cvValidationBottomSheetOpenParams, @h31.b @k Resources resources, @h31.b @k l lVar, @k b bVar, @k InterfaceC39417a interfaceC39417a);
    }

    void a(@k CvValidationBottomSheet cvValidationBottomSheet);
}
