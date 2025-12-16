package com.avito.android.cv_validation_need_draft.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: CvNeedDraftLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_validation_need_draft/deeplink/CvNeedDraftLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_job_cv-validation-need-draft_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class CvNeedDraftLink extends DeepLink {

    @k
    public static final Parcelable.Creator<CvNeedDraftLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f131956b;

    /* compiled from: CvNeedDraftLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CvNeedDraftLink> {
        @Override // android.os.Parcelable.Creator
        public final CvNeedDraftLink createFromParcel(Parcel parcel) {
            return new CvNeedDraftLink(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CvNeedDraftLink[] newArray(int i12) {
            return new CvNeedDraftLink[i12];
        }
    }

    /* compiled from: CvNeedDraftLink.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cv_validation_need_draft/deeplink/CvNeedDraftLink$b;", "LJu/c$b;", "<init>", "()V", "a", "Lcom/avito/android/cv_validation_need_draft/deeplink/CvNeedDraftLink$b$a;", "_avito_job_cv-validation-need-draft_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: CvNeedDraftLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_validation_need_draft/deeplink/CvNeedDraftLink$b$a;", "Lcom/avito/android/cv_validation_need_draft/deeplink/CvNeedDraftLink$b;", "LJu/c$b;", "_avito_job_cv-validation-need-draft_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f131957b;

            public a() {
                super(null);
                this.f131957b = "Не удалось получить параметры вакансии";
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f131957b, ((a) obj).f131957b);
            }

            public final int hashCode() {
                return this.f131957b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Error(message="), this.f131957b, ')');
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public CvNeedDraftLink() {
        this(false, 1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f131956b ? 1 : 0);
    }

    public /* synthetic */ CvNeedDraftLink(boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12);
    }

    public CvNeedDraftLink(boolean z12) {
        this.f131956b = z12;
    }
}
