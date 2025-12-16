package com.avito.android.geo_common.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AddressSuggestionV2.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/avito/android/geo_common/model/AddressSuggestionV2;", "Landroid/os/Parcelable;", "", "title", "subtitle", "jsonWebToken", MessageBody.Location.KIND, "Lcom/avito/android/geo_common/model/AddressSuggestionV2$SuggestType;", "suggestType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/geo_common/model/AddressSuggestionV2$SuggestType;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "c", "getKind", "Lcom/avito/android/geo_common/model/AddressSuggestionV2$SuggestType;", "getSuggestType", "()Lcom/avito/android/geo_common/model/AddressSuggestionV2$SuggestType;", "SuggestType", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AddressSuggestionV2 implements Parcelable {

    @k
    public static final Parcelable.Creator<AddressSuggestionV2> CREATOR = new a();

    @c(AddressParameter.Value.JSON_WEB_TOKEN)
    @k
    private final String jsonWebToken;

    @c(MessageBody.Location.KIND)
    @k
    private final String kind;

    @c("subtitle")
    @k
    private final String subtitle;

    @c("suggestType")
    @l
    private final SuggestType suggestType;

    @c("title")
    @k
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AddressSuggestionV2.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/geo_common/model/AddressSuggestionV2$SuggestType;", "", "(Ljava/lang/String;I)V", "HISTORICAL", "DEFAULT", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SuggestType {

        @c("default")
        public static final SuggestType DEFAULT;

        @c("history")
        public static final SuggestType HISTORICAL;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SuggestType[] f159408b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f159409c;

        static {
            SuggestType suggestType = new SuggestType("HISTORICAL", 0);
            HISTORICAL = suggestType;
            SuggestType suggestType2 = new SuggestType("DEFAULT", 1);
            DEFAULT = suggestType2;
            SuggestType[] suggestTypeArr = {suggestType, suggestType2};
            f159408b = suggestTypeArr;
            f159409c = kotlin.enums.c.a(suggestTypeArr);
        }

        private SuggestType(String str, int i12) {
        }

        public static SuggestType valueOf(String str) {
            return (SuggestType) Enum.valueOf(SuggestType.class, str);
        }

        public static SuggestType[] values() {
            return (SuggestType[]) f159408b.clone();
        }
    }

    /* compiled from: AddressSuggestionV2.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AddressSuggestionV2> {
        @Override // android.os.Parcelable.Creator
        public final AddressSuggestionV2 createFromParcel(Parcel parcel) {
            return new AddressSuggestionV2(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SuggestType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AddressSuggestionV2[] newArray(int i12) {
            return new AddressSuggestionV2[i12];
        }
    }

    /* compiled from: AddressSuggestionV2.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f159410a;

        static {
            int[] iArr = new int[SuggestType.values().length];
            try {
                iArr[SuggestType.HISTORICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuggestType.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f159410a = iArr;
        }
    }

    public AddressSuggestionV2(@k String str, @k String str2, @k String str3, @k String str4, @l SuggestType suggestType) {
        this.title = str;
        this.subtitle = str2;
        this.jsonWebToken = str3;
        this.kind = str4;
        this.suggestType = suggestType;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getJsonWebToken() {
        return this.jsonWebToken;
    }

    @k
    public final AddressSuggestion d() {
        AddressSuggestion.SuggestType suggestType;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.jsonWebToken;
        SuggestType suggestType2 = this.suggestType;
        if (suggestType2 != null) {
            int i12 = b.f159410a[suggestType2.ordinal()];
            if (i12 == 1) {
                suggestType = AddressSuggestion.SuggestType.HISTORICAL;
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                suggestType = AddressSuggestion.SuggestType.DEFAULT;
            }
        } else {
            suggestType = null;
        }
        return new AddressSuggestion(str, str2, null, str3, suggestType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressSuggestionV2)) {
            return false;
        }
        AddressSuggestionV2 addressSuggestionV2 = (AddressSuggestionV2) obj;
        return L.f(this.title, addressSuggestionV2.title) && L.f(this.subtitle, addressSuggestionV2.subtitle) && L.f(this.jsonWebToken, addressSuggestionV2.jsonWebToken) && L.f(this.kind, addressSuggestionV2.kind) && this.suggestType == addressSuggestionV2.suggestType;
    }

    @k
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(H.d(this.title.hashCode() * 31, 31, this.subtitle), 31, this.jsonWebToken), 31, this.kind);
        SuggestType suggestType = this.suggestType;
        return iD2 + (suggestType == null ? 0 : suggestType.hashCode());
    }

    @k
    public final String toString() {
        return "AddressSuggestionV2(title=" + this.title + ", subtitle=" + this.subtitle + ", jsonWebToken=" + this.jsonWebToken + ", kind=" + this.kind + ", suggestType=" + this.suggestType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.jsonWebToken);
        parcel.writeString(this.kind);
        SuggestType suggestType = this.suggestType;
        if (suggestType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(suggestType.name());
        }
    }

    public /* synthetic */ AddressSuggestionV2(String str, String str2, String str3, String str4, SuggestType suggestType, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, (i12 & 16) != 0 ? null : suggestType);
    }
}
