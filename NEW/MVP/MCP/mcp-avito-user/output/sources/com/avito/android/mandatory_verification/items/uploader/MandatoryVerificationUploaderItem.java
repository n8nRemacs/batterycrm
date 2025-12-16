package com.avito.android.mandatory_verification.items.uploader;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.component.accordion.s;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MandatoryVerificationUploaderItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mandatory_verification/items/uploader/MandatoryVerificationUploaderItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "Button", "FileItem", "_avito_mandatory-verification-items_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class MandatoryVerificationUploaderItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<MandatoryVerificationUploaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f184668b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f184669c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AttributedText f184670d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f184671e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f184672f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Button f184673g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f184674h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final FileItem f184675i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f184676j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final List<String> f184677k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Integer f184678l;

    /* compiled from: MandatoryVerificationUploaderItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/items/uploader/MandatoryVerificationUploaderItem$Button;", "Landroid/os/Parcelable;", "_avito_mandatory-verification-items_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Button> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f184679b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f184680c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f184681d;

        /* compiled from: MandatoryVerificationUploaderItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Button> {
            @Override // android.os.Parcelable.Creator
            public final Button createFromParcel(Parcel parcel) {
                return new Button(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public Button(@Y61.k String str, @Y61.k String str2, @Y61.l String str3) {
            this.f184679b = str;
            this.f184680c = str2;
            this.f184681d = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return L.f(this.f184679b, button.f184679b) && L.f(this.f184680c, button.f184680c) && L.f(this.f184681d, button.f184681d);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f184679b.hashCode() * 31, 31, this.f184680c);
            String str = this.f184681d;
            return iD2 + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(title=");
            sb2.append(this.f184679b);
            sb2.append(", style=");
            sb2.append(this.f184680c);
            sb2.append(", startDrawable=");
            return C22026a.c(sb2, this.f184681d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f184679b);
            parcel.writeString(this.f184680c);
            parcel.writeString(this.f184681d);
        }
    }

    /* compiled from: MandatoryVerificationUploaderItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/items/uploader/MandatoryVerificationUploaderItem$FileItem;", "Landroid/os/Parcelable;", "_avito_mandatory-verification-items_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FileItem implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<FileItem> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f184682b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f184683c;

        /* renamed from: d, reason: collision with root package name */
        public final long f184684d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f184685e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f184686f;

        /* compiled from: MandatoryVerificationUploaderItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FileItem> {
            @Override // android.os.Parcelable.Creator
            public final FileItem createFromParcel(Parcel parcel) {
                return new FileItem(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final FileItem[] newArray(int i12) {
                return new FileItem[i12];
            }
        }

        public FileItem(@Y61.k String str, @Y61.k String str2, long j12, boolean z12, @Y61.l String str3) {
            this.f184682b = str;
            this.f184683c = str2;
            this.f184684d = j12;
            this.f184685e = z12;
            this.f184686f = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FileItem)) {
                return false;
            }
            FileItem fileItem = (FileItem) obj;
            return L.f(this.f184682b, fileItem.f184682b) && L.f(this.f184683c, fileItem.f184683c) && this.f184684d == fileItem.f184684d && this.f184685e == fileItem.f184685e && L.f(this.f184686f, fileItem.f184686f);
        }

        public final int hashCode() {
            int i12 = r.i(r.g(H.d(this.f184682b.hashCode() * 31, 31, this.f184683c), 31, this.f184684d), 31, this.f184685e);
            String str = this.f184686f;
            return i12 + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FileItem(id=");
            sb2.append(this.f184682b);
            sb2.append(", name=");
            sb2.append(this.f184683c);
            sb2.append(", size=");
            sb2.append(this.f184684d);
            sb2.append(", isUploaded=");
            sb2.append(this.f184685e);
            sb2.append(", errorMessage=");
            return C22026a.c(sb2, this.f184686f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f184682b);
            parcel.writeString(this.f184683c);
            parcel.writeLong(this.f184684d);
            parcel.writeInt(this.f184685e ? 1 : 0);
            parcel.writeString(this.f184686f);
        }
    }

    /* compiled from: MandatoryVerificationUploaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MandatoryVerificationUploaderItem> {
        @Override // android.os.Parcelable.Creator
        public final MandatoryVerificationUploaderItem createFromParcel(Parcel parcel) {
            return new MandatoryVerificationUploaderItem(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(MandatoryVerificationUploaderItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() == 0 ? null : FileItem.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final MandatoryVerificationUploaderItem[] newArray(int i12) {
            return new MandatoryVerificationUploaderItem[i12];
        }
    }

    public MandatoryVerificationUploaderItem(@Y61.k String str, @Y61.k String str2, @Y61.k AttributedText attributedText, @Y61.l String str3, @Y61.l String str4, @Y61.l Button button, boolean z12, @Y61.l FileItem fileItem, @Y61.l String str5, @Y61.k List<String> list, @Y61.l Integer num) {
        this.f184668b = str;
        this.f184669c = str2;
        this.f184670d = attributedText;
        this.f184671e = str3;
        this.f184672f = str4;
        this.f184673g = button;
        this.f184674h = z12;
        this.f184675i = fileItem;
        this.f184676j = str5;
        this.f184677k = list;
        this.f184678l = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MandatoryVerificationUploaderItem)) {
            return false;
        }
        MandatoryVerificationUploaderItem mandatoryVerificationUploaderItem = (MandatoryVerificationUploaderItem) obj;
        return L.f(this.f184668b, mandatoryVerificationUploaderItem.f184668b) && L.f(this.f184669c, mandatoryVerificationUploaderItem.f184669c) && L.f(this.f184670d, mandatoryVerificationUploaderItem.f184670d) && L.f(this.f184671e, mandatoryVerificationUploaderItem.f184671e) && L.f(this.f184672f, mandatoryVerificationUploaderItem.f184672f) && L.f(this.f184673g, mandatoryVerificationUploaderItem.f184673g) && this.f184674h == mandatoryVerificationUploaderItem.f184674h && L.f(this.f184675i, mandatoryVerificationUploaderItem.f184675i) && L.f(this.f184676j, mandatoryVerificationUploaderItem.f184676j) && L.f(this.f184677k, mandatoryVerificationUploaderItem.f184677k) && L.f(this.f184678l, mandatoryVerificationUploaderItem.f184678l);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF162211b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF175399b() {
        return this.f184668b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(H.d(this.f184668b.hashCode() * 31, 31, this.f184669c), 31, this.f184670d);
        String str = this.f184671e;
        int iHashCode = (iB2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f184672f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Button button = this.f184673g;
        int i12 = r.i((iHashCode2 + (button == null ? 0 : button.hashCode())) * 31, 31, this.f184674h);
        FileItem fileItem = this.f184675i;
        int iHashCode3 = (i12 + (fileItem == null ? 0 : fileItem.hashCode())) * 31;
        String str3 = this.f184676j;
        int iE2 = H.e((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f184677k);
        Integer num = this.f184678l;
        return iE2 + (num != null ? num.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MandatoryVerificationUploaderItem(stringId=");
        sb2.append(this.f184668b);
        sb2.append(", title=");
        sb2.append(this.f184669c);
        sb2.append(", description=");
        sb2.append(this.f184670d);
        sb2.append(", actionTitle=");
        sb2.append(this.f184671e);
        sb2.append(", actionDescription=");
        sb2.append(this.f184672f);
        sb2.append(", button=");
        sb2.append(this.f184673g);
        sb2.append(", showCheckmark=");
        sb2.append(this.f184674h);
        sb2.append(", fileItem=");
        sb2.append(this.f184675i);
        sb2.append(", errorMessage=");
        sb2.append(this.f184676j);
        sb2.append(", mimeTypes=");
        sb2.append(this.f184677k);
        sb2.append(", bottomMargin=");
        return s.j(sb2, this.f184678l, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f184668b);
        parcel.writeString(this.f184669c);
        parcel.writeParcelable(this.f184670d, i12);
        parcel.writeString(this.f184671e);
        parcel.writeString(this.f184672f);
        Button button = this.f184673g;
        if (button == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            button.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f184674h ? 1 : 0);
        FileItem fileItem = this.f184675i;
        if (fileItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fileItem.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f184676j);
        parcel.writeStringList(this.f184677k);
        Integer num = this.f184678l;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }

    public /* synthetic */ MandatoryVerificationUploaderItem(String str, String str2, AttributedText attributedText, String str3, String str4, Button button, boolean z12, FileItem fileItem, String str5, List list, Integer num, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? MandatoryVerificationUploaderItem.class.getName() : str, str2, attributedText, str3, str4, button, z12, fileItem, str5, list, (i12 & 1024) != 0 ? null : num);
    }
}
