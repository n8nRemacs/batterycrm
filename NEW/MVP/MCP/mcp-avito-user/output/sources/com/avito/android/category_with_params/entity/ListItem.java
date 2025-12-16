package com.avito.android.category_with_params.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.UniversalImage;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CategoryParams.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/category_with_params/entity/ListItem;", "Landroid/os/Parcelable;", "Divider", "Option", "Lcom/avito/android/category_with_params/entity/ListItem$Divider;", "Lcom/avito/android/category_with_params/entity/ListItem$Option;", "_avito_category-with-params_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ListItem extends Parcelable {

    /* compiled from: CategoryParams.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_with_params/entity/ListItem$Divider;", "Lcom/avito/android/category_with_params/entity/ListItem;", "_avito_category-with-params_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Divider implements ListItem {

        @k
        public static final Parcelable.Creator<Divider> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f117675b;

        /* compiled from: CategoryParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Divider> {
            @Override // android.os.Parcelable.Creator
            public final Divider createFromParcel(Parcel parcel) {
                return new Divider(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Divider[] newArray(int i12) {
                return new Divider[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Divider() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.category_with_params.entity.ListItem
        @k
        /* renamed from: K4, reason: from getter */
        public final String getF117680f() {
            return this.f117675b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Divider) && L.f(this.f117675b, ((Divider) obj).f117675b);
        }

        public final int hashCode() {
            return this.f117675b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Divider(uniqueKey="), this.f117675b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f117675b);
        }

        public Divider(@k String str) {
            this.f117675b = str;
        }

        public /* synthetic */ Divider(String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? UUID.randomUUID().toString() : str);
        }
    }

    @k
    /* renamed from: K4 */
    String getF117680f();

    /* compiled from: CategoryParams.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_with_params/entity/ListItem$Option;", "Lcom/avito/android/category_with_params/entity/ListItem;", "_avito_category-with-params_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Option implements ListItem {

        @k
        public static final Parcelable.Creator<Option> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f117676b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f117677c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f117678d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final UniversalImage f117679e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f117680f;

        /* compiled from: CategoryParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Option> {
            @Override // android.os.Parcelable.Creator
            public final Option createFromParcel(Parcel parcel) {
                return new Option(parcel.readString(), parcel.readString(), parcel.readInt() != 0, (UniversalImage) parcel.readParcelable(Option.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Option[] newArray(int i12) {
                return new Option[i12];
            }
        }

        public /* synthetic */ Option(String str, String str2, boolean z12, UniversalImage universalImage, String str3, int i12, C42822w c42822w) {
            this(str, str2, z12, (i12 & 8) != 0 ? null : universalImage, (i12 & 16) != 0 ? r.q(str2, str) : str3);
        }

        public static Option a(Option option, boolean z12) {
            String str = option.f117676b;
            String str2 = option.f117677c;
            UniversalImage universalImage = option.f117679e;
            String str3 = option.f117680f;
            option.getClass();
            return new Option(str, str2, z12, universalImage, str3);
        }

        @Override // com.avito.android.category_with_params.entity.ListItem
        @k
        /* renamed from: K4, reason: from getter */
        public final String getF117680f() {
            return this.f117680f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Option)) {
                return false;
            }
            Option option = (Option) obj;
            return L.f(this.f117676b, option.f117676b) && L.f(this.f117677c, option.f117677c) && this.f117678d == option.f117678d && L.f(this.f117679e, option.f117679e) && L.f(this.f117680f, option.f117680f);
        }

        public final int hashCode() {
            int i12 = r.i(H.d(this.f117676b.hashCode() * 31, 31, this.f117677c), 31, this.f117678d);
            UniversalImage universalImage = this.f117679e;
            return this.f117680f.hashCode() + ((i12 + (universalImage == null ? 0 : universalImage.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Option(id=");
            sb2.append(this.f117676b);
            sb2.append(", title=");
            sb2.append(this.f117677c);
            sb2.append(", selected=");
            sb2.append(this.f117678d);
            sb2.append(", universalImage=");
            sb2.append(this.f117679e);
            sb2.append(", uniqueKey=");
            return C22026a.c(sb2, this.f117680f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f117676b);
            parcel.writeString(this.f117677c);
            parcel.writeInt(this.f117678d ? 1 : 0);
            parcel.writeParcelable(this.f117679e, i12);
            parcel.writeString(this.f117680f);
        }

        public Option(@k String str, @k String str2, boolean z12, @l UniversalImage universalImage, @k String str3) {
            this.f117676b = str;
            this.f117677c = str2;
            this.f117678d = z12;
            this.f117679e = universalImage;
            this.f117680f = str3;
        }
    }
}
