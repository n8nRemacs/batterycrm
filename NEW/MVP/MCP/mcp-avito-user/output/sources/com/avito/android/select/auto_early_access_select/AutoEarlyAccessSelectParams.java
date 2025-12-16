package com.avito.android.select.auto_early_access_select;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.OpenParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoEarlyAccessSelectParams.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/auto_early_access_select/AutoEarlyAccessSelectParams;", "Lcom/avito/android/util/OpenParams;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoEarlyAccessSelectParams implements OpenParams {

    @k
    public static final Parcelable.Creator<AutoEarlyAccessSelectParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f264987b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<ParcelableEntity<String>> f264988c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f264989d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final UniversalImage f264990e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f264991f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final AutoEarlyAccessSelectValue f264992g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final AutoEarlyAccessSelectValue f264993h;

    /* compiled from: AutoEarlyAccessSelectParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoEarlyAccessSelectParams> {
        @Override // android.os.Parcelable.Creator
        public final AutoEarlyAccessSelectParams createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(AutoEarlyAccessSelectParams.class, parcel, arrayList, iL2, 1);
            }
            AttributedText attributedText = (AttributedText) parcel.readParcelable(AutoEarlyAccessSelectParams.class.getClassLoader());
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(AutoEarlyAccessSelectParams.class.getClassLoader());
            String string2 = parcel.readString();
            Parcelable.Creator<AutoEarlyAccessSelectValue> creator = AutoEarlyAccessSelectValue.CREATOR;
            return new AutoEarlyAccessSelectParams(string, arrayList, attributedText, universalImage, string2, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AutoEarlyAccessSelectParams[] newArray(int i12) {
            return new AutoEarlyAccessSelectParams[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AutoEarlyAccessSelectParams(@k String str, @k List<? extends ParcelableEntity<String>> list, @l AttributedText attributedText, @l UniversalImage universalImage, @l String str2, @k AutoEarlyAccessSelectValue autoEarlyAccessSelectValue, @k AutoEarlyAccessSelectValue autoEarlyAccessSelectValue2) {
        this.f264987b = str;
        this.f264988c = list;
        this.f264989d = attributedText;
        this.f264990e = universalImage;
        this.f264991f = str2;
        this.f264992g = autoEarlyAccessSelectValue;
        this.f264993h = autoEarlyAccessSelectValue2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoEarlyAccessSelectParams)) {
            return false;
        }
        AutoEarlyAccessSelectParams autoEarlyAccessSelectParams = (AutoEarlyAccessSelectParams) obj;
        return L.f(this.f264987b, autoEarlyAccessSelectParams.f264987b) && L.f(this.f264988c, autoEarlyAccessSelectParams.f264988c) && L.f(this.f264989d, autoEarlyAccessSelectParams.f264989d) && L.f(this.f264990e, autoEarlyAccessSelectParams.f264990e) && L.f(this.f264991f, autoEarlyAccessSelectParams.f264991f) && L.f(this.f264992g, autoEarlyAccessSelectParams.f264992g) && L.f(this.f264993h, autoEarlyAccessSelectParams.f264993h);
    }

    public final int hashCode() {
        int iE2 = H.e(this.f264987b.hashCode() * 31, 31, this.f264988c);
        AttributedText attributedText = this.f264989d;
        int iHashCode = (iE2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        UniversalImage universalImage = this.f264990e;
        int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        String str = this.f264991f;
        return this.f264993h.hashCode() + ((this.f264992g.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "AutoEarlyAccessSelectParams(requestId=" + this.f264987b + ", selected=" + this.f264988c + ", description=" + this.f264989d + ", image=" + this.f264990e + ", title=" + this.f264991f + ", enableEarlyAccess=" + this.f264992g + ", disableEarlyAccess=" + this.f264993h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f264987b);
        Iterator itJ = C0.j(this.f264988c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeParcelable(this.f264989d, i12);
        parcel.writeParcelable(this.f264990e, i12);
        parcel.writeString(this.f264991f);
        this.f264992g.writeToParcel(parcel, i12);
        this.f264993h.writeToParcel(parcel, i12);
    }

    public /* synthetic */ AutoEarlyAccessSelectParams(String str, List list, AttributedText attributedText, UniversalImage universalImage, String str2, AutoEarlyAccessSelectValue autoEarlyAccessSelectValue, AutoEarlyAccessSelectValue autoEarlyAccessSelectValue2, int i12, C42822w c42822w) {
        this(str, list, (i12 & 4) != 0 ? null : attributedText, (i12 & 8) != 0 ? null : universalImage, str2, autoEarlyAccessSelectValue, autoEarlyAccessSelectValue2);
    }
}
