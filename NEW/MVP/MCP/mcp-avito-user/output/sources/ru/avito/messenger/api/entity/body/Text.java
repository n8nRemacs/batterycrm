package ru.avito.messenger.api.entity.body;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Text.kt */
@d
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0016B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/avito/messenger/api/entity/body/Text;", "Lru/avito/messenger/api/entity/body/MessageBody;", "LV81/a;", "", "text", com.avito.android.remote.model.messenger.message.MessageBody.RANDOM_ID, "", "urlsAreTrusted", "Lcom/avito/android/remote/model/text/AttributedText;", "attrText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "getRandomId", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "a", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class Text implements MessageBody, V81.a {

    @k
    public static final Parcelable.Creator<Text> CREATOR;

    @c("attributedText")
    @l
    private final AttributedText attrText;

    @c(com.avito.android.remote.model.messenger.message.MessageBody.RANDOM_ID)
    @l
    private final String randomId;

    @c("text")
    @k
    private final String text;

    @c("urlsAreTrusted")
    @l
    private final Boolean urlsAreTrusted;

    /* compiled from: Text.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/avito/messenger/api/entity/body/Text$a;", "", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Text.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<Text> {
        @Override // android.os.Parcelable.Creator
        public final Text createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Text(string, string2, boolValueOf, (AttributedText) parcel.readParcelable(Text.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Text[] newArray(int i12) {
            return new Text[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public Text(@k String str, @l String str2, @l Boolean bool, @l AttributedText attributedText) {
        this.text = str;
        this.randomId = str2;
        this.urlsAreTrusted = bool;
        this.attrText = attributedText;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final AttributedText getAttrText() {
        return this.attrText;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Boolean getUrlsAreTrusted() {
        return this.urlsAreTrusted;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Text)) {
            return false;
        }
        Text text = (Text) obj;
        return L.f(this.text, text.text) && L.f(this.randomId, text.randomId) && L.f(this.urlsAreTrusted, text.urlsAreTrusted) && L.f(this.attrText, text.attrText);
    }

    @Override // V81.a
    @l
    public final String getRandomId() {
        return this.randomId;
    }

    @k
    public final String getText() {
        return this.text;
    }

    public final int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        String str = this.randomId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.urlsAreTrusted;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        AttributedText attributedText = this.attrText;
        return iHashCode3 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Text(text=");
        sb2.append(this.text);
        sb2.append(", randomId=");
        sb2.append(this.randomId);
        sb2.append(", urlsAreTrusted=");
        sb2.append(this.urlsAreTrusted);
        sb2.append(", attrText=");
        return com.avito.android.actions_sheet.a.w(sb2, this.attrText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.text);
        parcel.writeString(this.randomId);
        Boolean bool = this.urlsAreTrusted;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.attrText, i12);
    }
}
