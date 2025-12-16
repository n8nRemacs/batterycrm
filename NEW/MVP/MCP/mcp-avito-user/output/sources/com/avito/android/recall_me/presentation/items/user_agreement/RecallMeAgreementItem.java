package com.avito.android.recall_me.presentation.items.user_agreement;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RecallMeAgreementItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/recall_me/presentation/items/user_agreement/RecallMeAgreementItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RecallMeAgreementItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<RecallMeAgreementItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f251986b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f251987c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f251988d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final DeepLink f251989e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f251990f;

    /* compiled from: RecallMeAgreementItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RecallMeAgreementItem> {
        @Override // android.os.Parcelable.Creator
        public final RecallMeAgreementItem createFromParcel(Parcel parcel) {
            return new RecallMeAgreementItem(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(RecallMeAgreementItem.class.getClassLoader()), parcel.readString(), (AttributedText) parcel.readParcelable(RecallMeAgreementItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RecallMeAgreementItem[] newArray(int i12) {
            return new RecallMeAgreementItem[i12];
        }
    }

    public RecallMeAgreementItem(@k String str, @k String str2, @k DeepLink deepLink, @k String str3, @l AttributedText attributedText) {
        this.f251986b = str;
        this.f251987c = str2;
        this.f251988d = str3;
        this.f251989e = deepLink;
        this.f251990f = attributedText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80596b() {
        return getF200688b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF200688b() {
        return this.f251986b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f251986b);
        parcel.writeString(this.f251987c);
        parcel.writeString(this.f251988d);
        parcel.writeParcelable(this.f251989e, i12);
        parcel.writeParcelable(this.f251990f, i12);
    }

    public /* synthetic */ RecallMeAgreementItem(String str, String str2, String str3, DeepLink deepLink, AttributedText attributedText, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? RecallMeAgreementItem.class.getName() : str, str2, deepLink, str3, attributedText);
    }
}
