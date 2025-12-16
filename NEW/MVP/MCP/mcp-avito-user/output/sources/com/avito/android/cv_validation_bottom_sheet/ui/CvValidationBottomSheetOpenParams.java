package com.avito.android.cv_validation_bottom_sheet.ui;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.cv_validation_bottom_sheet.deeplink.CvForValidation;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.OpenParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CvValidationBottomSheetOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_validation_bottom_sheet/ui/CvValidationBottomSheetOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_job_cv-validation-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CvValidationBottomSheetOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<CvValidationBottomSheetOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<CvForValidation> f131945b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f131946c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f131947d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f131948e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f131949f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final DeepLink f131950g;

    /* renamed from: h, reason: collision with root package name */
    public final long f131951h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Bundle f131952i;

    /* compiled from: CvValidationBottomSheetOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CvValidationBottomSheetOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final CvValidationBottomSheetOpenParams createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(CvValidationBottomSheetOpenParams.class, parcel, arrayList, iL2, 1);
            }
            return new CvValidationBottomSheetOpenParams(arrayList, parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(CvValidationBottomSheetOpenParams.class.getClassLoader()), parcel.readString(), (DeepLink) parcel.readParcelable(CvValidationBottomSheetOpenParams.class.getClassLoader()), parcel.readLong(), parcel.readBundle(CvValidationBottomSheetOpenParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CvValidationBottomSheetOpenParams[] newArray(int i12) {
            return new CvValidationBottomSheetOpenParams[i12];
        }
    }

    public CvValidationBottomSheetOpenParams(@k List<CvForValidation> list, @k String str, @k String str2, @l AttributedText attributedText, @k String str3, @k DeepLink deepLink, long j12, @l Bundle bundle) {
        this.f131945b = list;
        this.f131946c = str;
        this.f131947d = str2;
        this.f131948e = attributedText;
        this.f131949f = str3;
        this.f131950g = deepLink;
        this.f131951h = j12;
        this.f131952i = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f131945b, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeString(this.f131946c);
        parcel.writeString(this.f131947d);
        parcel.writeParcelable(this.f131948e, i12);
        parcel.writeString(this.f131949f);
        parcel.writeParcelable(this.f131950g, i12);
        parcel.writeLong(this.f131951h);
        parcel.writeBundle(this.f131952i);
    }
}
