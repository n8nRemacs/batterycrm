package com.avito.android.cv_bottom_sheet_dialog.deeplink;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: JobCvBottomSheetLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_bottom_sheet_dialog/deeplink/JobCvBottomSheetLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_job_cv-bottom-sheet-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class JobCvBottomSheetLink extends DeepLink {

    @k
    public static final Parcelable.Creator<JobCvBottomSheetLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f131581b;

    /* compiled from: JobCvBottomSheetLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JobCvBottomSheetLink> {
        @Override // android.os.Parcelable.Creator
        public final JobCvBottomSheetLink createFromParcel(Parcel parcel) {
            return new JobCvBottomSheetLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final JobCvBottomSheetLink[] newArray(int i12) {
            return new JobCvBottomSheetLink[i12];
        }
    }

    /* compiled from: JobCvBottomSheetLink.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cv_bottom_sheet_dialog/deeplink/JobCvBottomSheetLink$b;", "LJu/c$b;", "<init>", "()V", "a", "Lcom/avito/android/cv_bottom_sheet_dialog/deeplink/JobCvBottomSheetLink$b$a;", "_avito_job_cv-bottom-sheet-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: JobCvBottomSheetLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_bottom_sheet_dialog/deeplink/JobCvBottomSheetLink$b$a;", "Lcom/avito/android/cv_bottom_sheet_dialog/deeplink/JobCvBottomSheetLink$b;", "_avito_job_cv-bottom-sheet-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f131582b;

            public a(@k String str) {
                super(null);
                this.f131582b = str;
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public JobCvBottomSheetLink(@k String str) {
        this.f131581b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f131581b);
    }
}
