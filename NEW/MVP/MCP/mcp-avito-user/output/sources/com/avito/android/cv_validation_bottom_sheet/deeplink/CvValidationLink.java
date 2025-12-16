package com.avito.android.cv_validation_bottom_sheet.deeplink;

import Ju.InterfaceC14249c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: CvValidationLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_validation_bottom_sheet/deeplink/CvValidationLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_job_cv-validation-bottom-sheet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class CvValidationLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<CvValidationLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<CvForValidation> f131793b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CvValidationButton f131794c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final CvValidationTexts f131795d;

    /* renamed from: e, reason: collision with root package name */
    public final long f131796e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Bundle f131797f;

    /* compiled from: CvValidationLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CvValidationLink> {
        @Override // android.os.Parcelable.Creator
        public final CvValidationLink createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(CvForValidation.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new CvValidationLink(arrayList, CvValidationButton.CREATOR.createFromParcel(parcel), CvValidationTexts.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readBundle(CvValidationLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CvValidationLink[] newArray(int i12) {
            return new CvValidationLink[i12];
        }
    }

    /* compiled from: CvValidationLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/cv_validation_bottom_sheet/deeplink/CvValidationLink$b;", "LJu/c$b;", "<init>", "()V", "a", "b", "Lcom/avito/android/cv_validation_bottom_sheet/deeplink/CvValidationLink$b$a;", "Lcom/avito/android/cv_validation_bottom_sheet/deeplink/CvValidationLink$b$b;", "_avito_job_cv-validation-bottom-sheet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: CvValidationLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cv_validation_bottom_sheet/deeplink/CvValidationLink$b$a;", "Lcom/avito/android/cv_validation_bottom_sheet/deeplink/CvValidationLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_job_cv-validation-bottom-sheet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f131798b = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: CvValidationLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_validation_bottom_sheet/deeplink/CvValidationLink$b$b;", "Lcom/avito/android/cv_validation_bottom_sheet/deeplink/CvValidationLink$b;", "LJu/c$b;", "_avito_job_cv-validation-bottom-sheet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.cv_validation_bottom_sheet.deeplink.CvValidationLink$b$b, reason: collision with other inner class name */
        public static final class C3943b extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f131799b;

            public C3943b(@Y61.k String str) {
                super(null);
                this.f131799b = str;
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public CvValidationLink(@Y61.k List<CvForValidation> list, @Y61.k CvValidationButton cvValidationButton, @Y61.k CvValidationTexts cvValidationTexts, long j12, @Y61.l Bundle bundle) {
        this.f131793b = list;
        this.f131794c = cvValidationButton;
        this.f131795d = cvValidationTexts;
        this.f131796e = j12;
        this.f131797f = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f131793b, parcel);
        while (itJ.hasNext()) {
            ((CvForValidation) itJ.next()).writeToParcel(parcel, i12);
        }
        this.f131794c.writeToParcel(parcel, i12);
        this.f131795d.writeToParcel(parcel, i12);
        parcel.writeLong(this.f131796e);
        parcel.writeBundle(this.f131797f);
    }
}
