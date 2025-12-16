package com.avito.android.blueprints.publish.wizard;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Navigation;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: WizardItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/publish/wizard/WizardItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class WizardItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<WizardItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f106496b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f106497c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Navigation f106498d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f106499e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f106500f;

    /* compiled from: WizardItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WizardItem> {
        @Override // android.os.Parcelable.Creator
        public final WizardItem createFromParcel(Parcel parcel) {
            return new WizardItem((PrintableText) parcel.readParcelable(WizardItem.class.getClassLoader()), parcel.readString(), (Navigation) parcel.readParcelable(WizardItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(WizardItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WizardItem[] newArray(int i12) {
            return new WizardItem[i12];
        }
    }

    public WizardItem(@k PrintableText printableText, @l String str, @k Navigation navigation2, @l DeepLink deepLink, @k String str2) {
        this.f106496b = printableText;
        this.f106497c = str;
        this.f106498d = navigation2;
        this.f106499e = deepLink;
        this.f106500f = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WizardItem)) {
            return false;
        }
        WizardItem wizardItem = (WizardItem) obj;
        return L.f(this.f106496b, wizardItem.f106496b) && L.f(this.f106497c, wizardItem.f106497c) && L.f(this.f106498d, wizardItem.f106498d) && L.f(this.f106499e, wizardItem.f106499e) && L.f(this.f106500f, wizardItem.f106500f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF95530b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF101819b() {
        return this.f106500f;
    }

    public final int hashCode() {
        int iHashCode = this.f106496b.hashCode() * 31;
        String str = this.f106497c;
        int iHashCode2 = (this.f106498d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        DeepLink deepLink = this.f106499e;
        return this.f106500f.hashCode() + ((iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WizardItem(title=");
        sb2.append(this.f106496b);
        sb2.append(", subtitle=");
        sb2.append(this.f106497c);
        sb2.append(", navigation=");
        sb2.append(this.f106498d);
        sb2.append(", deepLink=");
        sb2.append(this.f106499e);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f106500f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f106496b, i12);
        parcel.writeString(this.f106497c);
        parcel.writeParcelable(this.f106498d, i12);
        parcel.writeParcelable(this.f106499e, i12);
        parcel.writeString(this.f106500f);
    }

    public /* synthetic */ WizardItem(PrintableText printableText, String str, Navigation navigation2, DeepLink deepLink, String str2, int i12, C42822w c42822w) {
        this(printableText, (i12 & 2) != 0 ? null : str, navigation2, (i12 & 8) != 0 ? null : deepLink, (i12 & 16) != 0 ? navigation2.toString() : str2);
    }
}
