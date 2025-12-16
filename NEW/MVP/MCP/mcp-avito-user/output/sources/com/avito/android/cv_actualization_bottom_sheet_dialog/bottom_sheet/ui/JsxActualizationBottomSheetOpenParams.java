package com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.ui;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: JsxActualizationBottomSheetOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_actualization_bottom_sheet_dialog/bottom_sheet/ui/JsxActualizationBottomSheetOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_job_cv-actualization-bottom-sheet-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class JsxActualizationBottomSheetOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<JsxActualizationBottomSheetOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f131547b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f131548c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f131549d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f131550e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f131551f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f131552g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f131553h;

    /* compiled from: JsxActualizationBottomSheetOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JsxActualizationBottomSheetOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final JsxActualizationBottomSheetOpenParams createFromParcel(Parcel parcel) {
            return new JsxActualizationBottomSheetOpenParams(parcel.readString(), (DeepLink) parcel.readParcelable(JsxActualizationBottomSheetOpenParams.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final JsxActualizationBottomSheetOpenParams[] newArray(int i12) {
            return new JsxActualizationBottomSheetOpenParams[i12];
        }
    }

    public JsxActualizationBottomSheetOpenParams(@l String str, @l DeepLink deepLink, @l String str2, @l String str3, @l String str4, @l String str5, boolean z12) {
        this.f131547b = str;
        this.f131548c = deepLink;
        this.f131549d = str2;
        this.f131550e = str3;
        this.f131551f = str4;
        this.f131552g = str5;
        this.f131553h = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f131547b);
        parcel.writeParcelable(this.f131548c, i12);
        parcel.writeString(this.f131549d);
        parcel.writeString(this.f131550e);
        parcel.writeString(this.f131551f);
        parcel.writeString(this.f131552g);
        parcel.writeInt(this.f131553h ? 1 : 0);
    }

    public /* synthetic */ JsxActualizationBottomSheetOpenParams(String str, DeepLink deepLink, String str2, String str3, String str4, String str5, boolean z12, int i12, C42822w c42822w) {
        this(str, deepLink, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : str5, z12);
    }
}
