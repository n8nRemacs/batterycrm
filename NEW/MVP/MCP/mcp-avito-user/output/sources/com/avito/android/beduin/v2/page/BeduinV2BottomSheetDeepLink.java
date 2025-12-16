package com.avito.android.beduin.v2.page;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.remote.model.ProfileTab;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: BeduinV2BottomSheetDeepLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/page/BeduinV2BottomSheetDeepLink;", "Lcom/avito/android/beduin/v2/page/BeduinV2DeepLink;", "a", "ContentPaddings", "_design-modules_beduin-v2-page_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes11.dex */
public final /* data */ class BeduinV2BottomSheetDeepLink extends BeduinV2DeepLink {

    @Y61.k
    public static final Parcelable.Creator<BeduinV2BottomSheetDeepLink> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f104760b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f104761c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f104762d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f104763e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ContentPaddings f104764f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f104765g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f104766h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f104767i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f104768j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinV2BottomSheetDeepLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/v2/page/BeduinV2BottomSheetDeepLink$ContentPaddings;", "", "_design-modules_beduin-v2-page_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ContentPaddings {

        /* renamed from: c, reason: collision with root package name */
        public static final ContentPaddings f104769c;

        /* renamed from: d, reason: collision with root package name */
        public static final ContentPaddings f104770d;

        /* renamed from: e, reason: collision with root package name */
        public static final ContentPaddings f104771e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ ContentPaddings[] f104772f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f104773g;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f104774b;

        static {
            ContentPaddings contentPaddings = new ContentPaddings("VERTICAL", 0, "vertical");
            f104769c = contentPaddings;
            ContentPaddings contentPaddings2 = new ContentPaddings("ALL", 1, ProfileTab.ALL);
            f104770d = contentPaddings2;
            ContentPaddings contentPaddings3 = new ContentPaddings("NONE", 2, "none");
            f104771e = contentPaddings3;
            ContentPaddings[] contentPaddingsArr = {contentPaddings, contentPaddings2, contentPaddings3};
            f104772f = contentPaddingsArr;
            f104773g = kotlin.enums.c.a(contentPaddingsArr);
        }

        public ContentPaddings(String str, int i12, String str2) {
            this.f104774b = str2;
        }

        public static ContentPaddings valueOf(String str) {
            return (ContentPaddings) Enum.valueOf(ContentPaddings.class, str);
        }

        public static ContentPaddings[] values() {
            return (ContentPaddings[]) f104772f.clone();
        }
    }

    /* compiled from: BeduinV2BottomSheetDeepLink.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/beduin/v2/page/BeduinV2BottomSheetDeepLink$a;", "", "<init>", "()V", "", "FIT_CONTENT", "Ljava/lang/String;", "HALF_HEIGHT", "MAX_HEIGHT", "_design-modules_beduin-v2-page_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BeduinV2BottomSheetDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinV2BottomSheetDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final BeduinV2BottomSheetDeepLink createFromParcel(Parcel parcel) {
            return new BeduinV2BottomSheetDeepLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, ContentPaddings.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinV2BottomSheetDeepLink[] newArray(int i12) {
            return new BeduinV2BottomSheetDeepLink[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ BeduinV2BottomSheetDeepLink(String str, String str2, String str3, boolean z12, ContentPaddings contentPaddings, String str4, String str5, String str6, boolean z13, int i12, C42822w c42822w) {
        this(str, str2, str3, z12, (i12 & 16) != 0 ? ContentPaddings.f104769c : contentPaddings, (i12 & 32) != 0 ? null : str4, (i12 & 64) != 0 ? null : str5, (i12 & 128) != 0 ? null : str6, (i12 & 256) != 0 ? false : z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinV2BottomSheetDeepLink)) {
            return false;
        }
        BeduinV2BottomSheetDeepLink beduinV2BottomSheetDeepLink = (BeduinV2BottomSheetDeepLink) obj;
        return L.f(this.f104760b, beduinV2BottomSheetDeepLink.f104760b) && L.f(this.f104761c, beduinV2BottomSheetDeepLink.f104761c) && L.f(this.f104762d, beduinV2BottomSheetDeepLink.f104762d) && this.f104763e == beduinV2BottomSheetDeepLink.f104763e && this.f104764f == beduinV2BottomSheetDeepLink.f104764f && L.f(this.f104765g, beduinV2BottomSheetDeepLink.f104765g) && L.f(this.f104766h, beduinV2BottomSheetDeepLink.f104766h) && L.f(this.f104767i, beduinV2BottomSheetDeepLink.f104767i) && this.f104768j == beduinV2BottomSheetDeepLink.f104768j;
    }

    public final int hashCode() {
        int iHashCode = (this.f104764f.hashCode() + androidx.appcompat.app.r.i(H.d(H.d(this.f104760b.hashCode() * 31, 31, this.f104761c), 31, this.f104762d), 31, this.f104763e)) * 31;
        String str = this.f104765g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f104766h;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f104767i;
        return Boolean.hashCode(this.f104768j) + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinV2BottomSheetDeepLink(pagePath=");
        sb2.append(this.f104760b);
        sb2.append(", screenName=");
        sb2.append(this.f104761c);
        sb2.append(", heightMode=");
        sb2.append(this.f104762d);
        sb2.append(", scrollOnKeyboardShown=");
        sb2.append(this.f104763e);
        sb2.append(", contentPaddings=");
        sb2.append(this.f104764f);
        sb2.append(", theme=");
        sb2.append(this.f104765g);
        sb2.append(", scenarioParentId=");
        sb2.append(this.f104766h);
        sb2.append(", scenarioId=");
        sb2.append(this.f104767i);
        sb2.append(", enableComposeRenderer=");
        return androidx.appcompat.app.r.x(sb2, this.f104768j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f104760b);
        parcel.writeString(this.f104761c);
        parcel.writeString(this.f104762d);
        parcel.writeInt(this.f104763e ? 1 : 0);
        parcel.writeString(this.f104764f.name());
        parcel.writeString(this.f104765g);
        parcel.writeString(this.f104766h);
        parcel.writeString(this.f104767i);
        parcel.writeInt(this.f104768j ? 1 : 0);
    }

    public BeduinV2BottomSheetDeepLink(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, boolean z12, @Y61.k ContentPaddings contentPaddings, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, boolean z13) {
        super(null);
        this.f104760b = str;
        this.f104761c = str2;
        this.f104762d = str3;
        this.f104763e = z12;
        this.f104764f = contentPaddings;
        this.f104765g = str4;
        this.f104766h = str5;
        this.f104767i = str6;
        this.f104768j = z13;
    }
}
