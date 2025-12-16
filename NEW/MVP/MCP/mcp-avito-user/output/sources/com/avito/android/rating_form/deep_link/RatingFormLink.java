package com.avito.android.rating_form.deep_link;

import AK.c;
import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: RatingFormLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/deep_link/RatingFormLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_rating-form_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes16.dex */
public final /* data */ class RatingFormLink extends DeepLink {

    @k
    public static final Parcelable.Creator<RatingFormLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f248033b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Map<String, Serializable> f248034c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f248035d;

    /* compiled from: RatingFormLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RatingFormLink> {
        @Override // android.os.Parcelable.Creator
        public final RatingFormLink createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                linkedHashMap.put(parcel.readString(), parcel.readSerializable());
            }
            return new RatingFormLink(string, linkedHashMap, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final RatingFormLink[] newArray(int i12) {
            return new RatingFormLink[i12];
        }
    }

    /* compiled from: RatingFormLink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/rating_form/deep_link/RatingFormLink$b;", "", "a", "b", "c", "d", "Lcom/avito/android/rating_form/deep_link/RatingFormLink$b$a;", "Lcom/avito/android/rating_form/deep_link/RatingFormLink$b$b;", "Lcom/avito/android/rating_form/deep_link/RatingFormLink$b$c;", "_avito_rating-form_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: RatingFormLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating_form/deep_link/RatingFormLink$b$a;", "Lcom/avito/android/rating_form/deep_link/RatingFormLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_rating-form_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f248036b = new a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1691881590;
            }

            @k
            public final String toString() {
                return "Error";
            }
        }

        /* compiled from: RatingFormLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating_form/deep_link/RatingFormLink$b$b;", "Lcom/avito/android/rating_form/deep_link/RatingFormLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_rating-form_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.rating_form.deep_link.RatingFormLink$b$b, reason: collision with other inner class name */
        public static final class C7457b implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C7457b f248037b = new C7457b();
        }

        /* compiled from: RatingFormLink.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating_form/deep_link/RatingFormLink$b$c;", "Lcom/avito/android/rating_form/deep_link/RatingFormLink$b;", "a", "b", "Lcom/avito/android/rating_form/deep_link/RatingFormLink$b$c$a;", "Lcom/avito/android/rating_form/deep_link/RatingFormLink$b$c$b;", "_avito_rating-form_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class c implements b {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f248038b;

            /* compiled from: RatingFormLink.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/deep_link/RatingFormLink$b$c$a;", "Lcom/avito/android/rating_form/deep_link/RatingFormLink$b$c;", "LJu/c$a;", "_avito_rating-form_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class a extends c implements InterfaceC14249c.a {

                /* renamed from: c, reason: collision with root package name */
                @l
                public final String f248039c;

                public a(@l String str) {
                    super(str, null);
                    this.f248039c = str;
                }

                @Override // com.avito.android.rating_form.deep_link.RatingFormLink.b.c
                @l
                /* renamed from: a, reason: from getter */
                public final String getF248038b() {
                    return this.f248039c;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && L.f(this.f248039c, ((a) obj).f248039c);
                }

                public final int hashCode() {
                    String str = this.f248039c;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                @k
                public final String toString() {
                    return C22026a.c(new StringBuilder("PublishResultWithRedirect(publishedRatingUserKey="), this.f248039c, ')');
                }
            }

            /* compiled from: RatingFormLink.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/deep_link/RatingFormLink$b$c$b;", "Lcom/avito/android/rating_form/deep_link/RatingFormLink$b$c;", "LJu/c$b;", "_avito_rating-form_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.rating_form.deep_link.RatingFormLink$b$c$b, reason: collision with other inner class name */
            public static final /* data */ class C7458b extends c implements InterfaceC14249c.b {

                /* renamed from: c, reason: collision with root package name */
                @l
                public final String f248040c;

                public C7458b(@l String str) {
                    super(str, null);
                    this.f248040c = str;
                }

                @Override // com.avito.android.rating_form.deep_link.RatingFormLink.b.c
                @l
                /* renamed from: a, reason: from getter */
                public final String getF248038b() {
                    return this.f248040c;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C7458b) && L.f(this.f248040c, ((C7458b) obj).f248040c);
                }

                public final int hashCode() {
                    String str = this.f248040c;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                @k
                public final String toString() {
                    return C22026a.c(new StringBuilder("PublishResultWithoutRedirect(publishedRatingUserKey="), this.f248040c, ')');
                }
            }

            public c(String str, C42822w c42822w) {
                this.f248038b = str;
            }

            @l
            /* renamed from: a, reason: from getter */
            public String getF248038b() {
                return this.f248038b;
            }
        }

        /* compiled from: RatingFormLink.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/rating_form/deep_link/RatingFormLink$b$d;", "", "a", "b", "c", "Lcom/avito/android/rating_form/deep_link/RatingFormLink$b$d$a;", "Lcom/avito/android/rating_form/deep_link/RatingFormLink$b$d$b;", "Lcom/avito/android/rating_form/deep_link/RatingFormLink$b$d$c;", "_avito_rating-form_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface d {

            /* compiled from: RatingFormLink.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/deep_link/RatingFormLink$b$d$a;", "Lcom/avito/android/rating_form/deep_link/RatingFormLink$b$d;", "LJu/c$b;", "_avito_rating-form_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class a implements d, InterfaceC14249c.b {

                /* renamed from: b, reason: collision with root package name */
                @l
                public final Bundle f248041b;

                public a(@l Bundle bundle) {
                    this.f248041b = bundle;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && L.f(this.f248041b, ((a) obj).f248041b);
                }

                public final int hashCode() {
                    Bundle bundle = this.f248041b;
                    if (bundle == null) {
                        return 0;
                    }
                    return bundle.hashCode();
                }

                @k
                public final String toString() {
                    return H.m(new StringBuilder("RemoveReview(dataToUpdate="), this.f248041b, ')');
                }
            }

            /* compiled from: RatingFormLink.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/deep_link/RatingFormLink$b$d$b;", "Lcom/avito/android/rating_form/deep_link/RatingFormLink$b$d;", "LJu/c$a;", "_avito_rating-form_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.rating_form.deep_link.RatingFormLink$b$d$b, reason: collision with other inner class name */
            public static final /* data */ class C7459b implements d, InterfaceC14249c.a {

                /* renamed from: b, reason: collision with root package name */
                @l
                public final Bundle f248042b;

                public C7459b(@l Bundle bundle) {
                    this.f248042b = bundle;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C7459b) && L.f(this.f248042b, ((C7459b) obj).f248042b);
                }

                public final int hashCode() {
                    Bundle bundle = this.f248042b;
                    if (bundle == null) {
                        return 0;
                    }
                    return bundle.hashCode();
                }

                @k
                public final String toString() {
                    return H.m(new StringBuilder("RemoveReviewWithRedirect(dataToUpdate="), this.f248042b, ')');
                }
            }

            /* compiled from: RatingFormLink.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating_form/deep_link/RatingFormLink$b$d$c;", "Lcom/avito/android/rating_form/deep_link/RatingFormLink$b$d;", "LJu/c$b;", "<init>", "()V", "_avito_rating-form_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class c implements d, InterfaceC14249c.b {

                /* renamed from: b, reason: collision with root package name */
                @k
                public static final c f248043b = new c();

                public final boolean equals(@l Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public final int hashCode() {
                    return 1680019645;
                }

                @k
                public final String toString() {
                    return "UpdateList";
                }
            }
        }
    }

    public /* synthetic */ RatingFormLink(String str, Map map, boolean z12, int i12, C42822w c42822w) {
        this(str, map, (i12 & 4) != 0 ? false : z12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingFormLink)) {
            return false;
        }
        RatingFormLink ratingFormLink = (RatingFormLink) obj;
        return L.f(this.f248033b, ratingFormLink.f248033b) && L.f(this.f248034c, ratingFormLink.f248034c) && this.f248035d == ratingFormLink.f248035d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f248035d) + c.c(this.f248033b.hashCode() * 31, 31, this.f248034c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingFormLink(fid=");
        sb2.append(this.f248033b);
        sb2.append(", queryMap=");
        sb2.append(this.f248034c);
        sb2.append(", anonymous=");
        return r.x(sb2, this.f248035d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f248033b);
        Iterator itI = C0.i(parcel, this.f248034c);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeSerializable((Serializable) entry.getValue());
        }
        parcel.writeInt(this.f248035d ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RatingFormLink(@k String str, @k Map<String, ? extends Serializable> map, boolean z12) {
        this.f248033b = str;
        this.f248034c = map;
        this.f248035d = z12;
    }
}
