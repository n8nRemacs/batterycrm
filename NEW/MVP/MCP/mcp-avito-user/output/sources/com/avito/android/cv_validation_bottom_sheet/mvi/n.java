package com.avito.android.cv_validation_bottom_sheet.mvi;

import com.avito.android.cv_validation_bottom_sheet.ui.CvValidationBottomSheetResult;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CvValidationBottomSheetOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/cv_validation_bottom_sheet/mvi/n;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/cv_validation_bottom_sheet/mvi/n$a;", "Lcom/avito/android/cv_validation_bottom_sheet/mvi/n$b;", "_avito_job_cv-validation-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class n {

    /* compiled from: CvValidationBottomSheetOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cv_validation_bottom_sheet/mvi/n$a;", "Lcom/avito/android/cv_validation_bottom_sheet/mvi/n;", "<init>", "()V", "_avito_job_cv-validation-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends n {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f131914a = new a();

        public a() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -484612929;
        }

        @Y61.k
        public final String toString() {
            return "Dismiss";
        }
    }

    /* compiled from: CvValidationBottomSheetOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_validation_bottom_sheet/mvi/n$b;", "Lcom/avito/android/cv_validation_bottom_sheet/mvi/n;", "_avito_job_cv-validation-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends n {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CvValidationBottomSheetResult.OpenMessenger f131915a;

        public b(@Y61.k CvValidationBottomSheetResult.OpenMessenger openMessenger) {
            super(null);
            this.f131915a = openMessenger;
        }
    }

    public /* synthetic */ n(C42822w c42822w) {
        this();
    }

    public n() {
    }
}
