package com.avito.android.suggest_locations.deeplink;

import Ju.InterfaceC14249c;
import K51.d;
import Ku.AbstractC14350a;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.Gson;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import q50.InterfaceC47204b;

/* compiled from: SuggestLocationsAddressLink.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/avito/android/suggest_locations/deeplink/SuggestLocationsAddressLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "", "query", "title", "Lcom/avito/android/suggest_locations/deeplink/SuggestPresentationType;", "presentationStyle", "Lcom/avito/android/suggest_locations/deeplink/SuggestFlowType;", "flowType", "", "withRedesignTheme", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/suggest_locations/deeplink/SuggestPresentationType;Lcom/avito/android/suggest_locations/deeplink/SuggestFlowType;Z)V", "Ljava/lang/String;", "getQuery", "()Ljava/lang/String;", "getTitle", "Lcom/avito/android/suggest_locations/deeplink/SuggestPresentationType;", "g", "()Lcom/avito/android/suggest_locations/deeplink/SuggestPresentationType;", "Lcom/avito/android/suggest_locations/deeplink/SuggestFlowType;", "f", "()Lcom/avito/android/suggest_locations/deeplink/SuggestFlowType;", "Z", "h", "()Z", "b", "c", "_avito_suggest-locations_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class SuggestLocationsAddressLink extends DeepLink {

    @k
    public static final Parcelable.Creator<SuggestLocationsAddressLink> CREATOR = new a();

    @com.google.gson.annotations.c(MessageBody.SystemMessageBody.Platform.FLOW)
    @l
    private final SuggestFlowType flowType;

    @com.google.gson.annotations.c("presentationStyle")
    @l
    private final SuggestPresentationType presentationStyle;

    @com.google.gson.annotations.c("query")
    @l
    private final String query;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    @com.google.gson.annotations.c("isRedesigned")
    private final boolean withRedesignTheme;

    /* compiled from: SuggestLocationsAddressLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SuggestLocationsAddressLink> {
        @Override // android.os.Parcelable.Creator
        public final SuggestLocationsAddressLink createFromParcel(Parcel parcel) {
            return new SuggestLocationsAddressLink(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SuggestPresentationType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : SuggestFlowType.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SuggestLocationsAddressLink[] newArray(int i12) {
            return new SuggestLocationsAddressLink[i12];
        }
    }

    /* compiled from: SuggestLocationsAddressLink.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/suggest_locations/deeplink/SuggestLocationsAddressLink$b;", "LKu/a;", "Lcom/avito/android/suggest_locations/deeplink/SuggestLocationsAddressLink;", "<init>", "()V", "_avito_suggest-locations_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends AbstractC14350a<SuggestLocationsAddressLink> {
        @Override // Ku.AbstractC14350a
        public final DeepLink r(Uri uri, Gson gson, x xVar) {
            String queryParameter = uri.getQueryParameter("query");
            String queryParameter2 = uri.getQueryParameter("title");
            String queryParameter3 = uri.getQueryParameter("presentationStyle");
            String queryParameter4 = uri.getQueryParameter(MessageBody.SystemMessageBody.Platform.FLOW);
            return new SuggestLocationsAddressLink(queryParameter, queryParameter2, queryParameter3 != null ? SuggestPresentationType.valueOf(queryParameter3.toUpperCase(Locale.ROOT)) : null, queryParameter4 != null ? SuggestFlowType.valueOf(queryParameter4.toUpperCase(Locale.ROOT)) : null, Boolean.parseBoolean(uri.getQueryParameter("isRedesigned")));
        }
    }

    /* compiled from: SuggestLocationsAddressLink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/suggest_locations/deeplink/SuggestLocationsAddressLink$c;", "", "a", "b", "c", "Lcom/avito/android/suggest_locations/deeplink/SuggestLocationsAddressLink$c$a;", "Lcom/avito/android/suggest_locations/deeplink/SuggestLocationsAddressLink$c$b;", "Lcom/avito/android/suggest_locations/deeplink/SuggestLocationsAddressLink$c$c;", "_avito_suggest-locations_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {

        /* compiled from: SuggestLocationsAddressLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/suggest_locations/deeplink/SuggestLocationsAddressLink$c$a;", "LJu/c$b;", "Lcom/avito/android/suggest_locations/deeplink/SuggestLocationsAddressLink$c;", "<init>", "()V", "_avito_suggest-locations_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.b, c {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f292273b = new a();
        }

        /* compiled from: SuggestLocationsAddressLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/suggest_locations/deeplink/SuggestLocationsAddressLink$c$b;", "LJu/c$b;", "Lcom/avito/android/suggest_locations/deeplink/SuggestLocationsAddressLink$c;", "<init>", "()V", "_avito_suggest-locations_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements InterfaceC14249c.b, c {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final b f292274b = new b();
        }

        /* compiled from: SuggestLocationsAddressLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/suggest_locations/deeplink/SuggestLocationsAddressLink$c$c;", "LJu/c$b;", "Lcom/avito/android/suggest_locations/deeplink/SuggestLocationsAddressLink$c;", "_avito_suggest-locations_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.suggest_locations.deeplink.SuggestLocationsAddressLink$c$c, reason: collision with other inner class name */
        public static final /* data */ class C8861c implements InterfaceC14249c.b, c {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f292275b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f292276c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final String f292277d;

            public C8861c(@l String str, @l String str2, @l String str3) {
                this.f292275b = str;
                this.f292276c = str2;
                this.f292277d = str3;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C8861c)) {
                    return false;
                }
                C8861c c8861c = (C8861c) obj;
                return L.f(this.f292275b, c8861c.f292275b) && L.f(this.f292276c, c8861c.f292276c) && L.f(this.f292277d, c8861c.f292277d);
            }

            public final int hashCode() {
                String str = this.f292275b;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f292276c;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f292277d;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Success(address=");
                sb2.append(this.f292275b);
                sb2.append(", lat=");
                sb2.append(this.f292276c);
                sb2.append(", lng=");
                return C22026a.c(sb2, this.f292277d, ')');
            }
        }
    }

    public /* synthetic */ SuggestLocationsAddressLink(String str, String str2, SuggestPresentationType suggestPresentationType, SuggestFlowType suggestFlowType, boolean z12, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? SuggestPresentationType.BOTTOMSHEET : suggestPresentationType, (i12 & 8) != 0 ? SuggestFlowType.NOMAP : suggestFlowType, (i12 & 16) != 0 ? false : z12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final SuggestFlowType getFlowType() {
        return this.flowType;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final SuggestPresentationType getPresentationStyle() {
        return this.presentationStyle;
    }

    @l
    public final String getQuery() {
        return this.query;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getWithRedesignTheme() {
        return this.withRedesignTheme;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.query);
        parcel.writeString(this.title);
        SuggestPresentationType suggestPresentationType = this.presentationStyle;
        if (suggestPresentationType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(suggestPresentationType.name());
        }
        SuggestFlowType suggestFlowType = this.flowType;
        if (suggestFlowType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(suggestFlowType.name());
        }
        parcel.writeInt(this.withRedesignTheme ? 1 : 0);
    }

    public SuggestLocationsAddressLink(@l String str, @l String str2, @l SuggestPresentationType suggestPresentationType, @l SuggestFlowType suggestFlowType, boolean z12) {
        this.query = str;
        this.title = str2;
        this.presentationStyle = suggestPresentationType;
        this.flowType = suggestFlowType;
        this.withRedesignTheme = z12;
    }
}
