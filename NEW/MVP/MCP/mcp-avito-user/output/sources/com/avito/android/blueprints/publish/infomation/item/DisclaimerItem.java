package com.avito.android.blueprints.publish.infomation.item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.information.TextStyle;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DisclaimerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/publish/infomation/item/DisclaimerItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DisclaimerItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<DisclaimerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f106316b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f106317c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f106318d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextStyle f106319e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final UniversalImage f106320f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Integer f106321g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Integer f106322h;

    /* compiled from: DisclaimerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DisclaimerItem> {
        @Override // android.os.Parcelable.Creator
        public final DisclaimerItem createFromParcel(Parcel parcel) {
            return new DisclaimerItem(parcel.readString(), (AttributedText) parcel.readParcelable(DisclaimerItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(DisclaimerItem.class.getClassLoader()), TextStyle.valueOf(parcel.readString()), (UniversalImage) parcel.readParcelable(DisclaimerItem.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final DisclaimerItem[] newArray(int i12) {
            return new DisclaimerItem[i12];
        }
    }

    public DisclaimerItem(@k String str, @k AttributedText attributedText, @l AttributedText attributedText2, @k TextStyle textStyle, @l UniversalImage universalImage, @l Integer num, @l Integer num2) {
        this.f106316b = str;
        this.f106317c = attributedText;
        this.f106318d = attributedText2;
        this.f106319e = textStyle;
        this.f106320f = universalImage;
        this.f106321g = num;
        this.f106322h = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85355b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF147986c() {
        return this.f106316b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f106316b);
        parcel.writeParcelable(this.f106317c, i12);
        parcel.writeParcelable(this.f106318d, i12);
        parcel.writeString(this.f106319e.name());
        parcel.writeParcelable(this.f106320f, i12);
        Integer num = this.f106321g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f106322h;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
    }

    public /* synthetic */ DisclaimerItem(String str, AttributedText attributedText, AttributedText attributedText2, TextStyle textStyle, UniversalImage universalImage, Integer num, Integer num2, int i12, C42822w c42822w) {
        this(str, attributedText, (i12 & 4) != 0 ? null : attributedText2, (i12 & 8) != 0 ? TextStyle.DEFAULT : textStyle, (i12 & 16) != 0 ? null : universalImage, (i12 & 32) != 0 ? null : num, (i12 & 64) != 0 ? null : num2);
    }
}
