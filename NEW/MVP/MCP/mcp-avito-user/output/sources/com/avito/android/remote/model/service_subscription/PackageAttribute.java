package com.avito.android.remote.model.service_subscription;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PackageAttribute.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/service_subscription/PackageAttribute;", "Landroid/os/Parcelable;", "()V", "Monster", "Regular", "Lcom/avito/android/remote/model/service_subscription/PackageAttribute$Monster;", "Lcom/avito/android/remote/model/service_subscription/PackageAttribute$Regular;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class PackageAttribute implements Parcelable {

    /* compiled from: PackageAttribute.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/service_subscription/PackageAttribute$Monster;", "Lcom/avito/android/remote/model/service_subscription/PackageAttribute;", "", "title", "count", "", "locations", "Lcom/avito/android/remote/model/service_subscription/PackageAttribute$Monster$Subcategory;", "subcategories", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getCount", "Ljava/util/List;", "getLocations", "()Ljava/util/List;", "getSubcategories", "Subcategory", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Monster extends PackageAttribute {

        @k
        public static final Parcelable.Creator<Monster> CREATOR = new Creator();

        @c("count")
        @l
        private final String count;

        @c("locations")
        @k
        private final List<String> locations;

        @c("subcategories")
        @k
        private final List<Subcategory> subcategories;

        @c("title")
        @k
        private final String title;

        /* compiled from: PackageAttribute.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Monster> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Monster createFromParcel(@k Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(Subcategory.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new Monster(string, string2, arrayListCreateStringArrayList, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Monster[] newArray(int i12) {
                return new Monster[i12];
            }
        }

        /* compiled from: PackageAttribute.kt */
        @d
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/service_subscription/PackageAttribute$Monster$Subcategory;", "Landroid/os/Parcelable;", "", "title", "", "microcategories", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "getMicrocategories", "()Ljava/util/List;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Subcategory implements Parcelable {

            @k
            public static final Parcelable.Creator<Subcategory> CREATOR = new Creator();

            @c("microcategories")
            @l
            private final List<String> microcategories;

            @c("title")
            @k
            private final String title;

            /* compiled from: PackageAttribute.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Subcategory> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Subcategory createFromParcel(@k Parcel parcel) {
                    return new Subcategory(parcel.readString(), parcel.createStringArrayList());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Subcategory[] newArray(int i12) {
                    return new Subcategory[i12];
                }
            }

            public Subcategory(@k String str, @l List<String> list) {
                this.title = str;
                this.microcategories = list;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @l
            public final List<String> getMicrocategories() {
                return this.microcategories;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeStringList(this.microcategories);
            }
        }

        public Monster(@k String str, @l String str2, @k List<String> list, @k List<Subcategory> list2) {
            super(null);
            this.title = str;
            this.count = str2;
            this.locations = list;
            this.subcategories = list2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final String getCount() {
            return this.count;
        }

        @k
        public final List<String> getLocations() {
            return this.locations;
        }

        @k
        public final List<Subcategory> getSubcategories() {
            return this.subcategories;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.count);
            parcel.writeStringList(this.locations);
            Iterator itJ = C0.j(this.subcategories, parcel);
            while (itJ.hasNext()) {
                ((Subcategory) itJ.next()).writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: PackageAttribute.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/model/service_subscription/PackageAttribute$Regular;", "Lcom/avito/android/remote/model/service_subscription/PackageAttribute;", "", "title", "subtitle", "description", "count", "expiration", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDescription", "getCount", "getExpiration", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Regular extends PackageAttribute {

        @k
        public static final Parcelable.Creator<Regular> CREATOR = new Creator();

        @c("count")
        @l
        private final String count;

        @c("description")
        @l
        private final String description;

        @c("expiration")
        @l
        private final String expiration;

        @c("subtitle")
        @l
        private final String subtitle;

        @c("title")
        @l
        private final String title;

        /* compiled from: PackageAttribute.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Regular> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Regular createFromParcel(@k Parcel parcel) {
                return new Regular(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Regular[] newArray(int i12) {
                return new Regular[i12];
            }
        }

        public Regular(@l String str, @l String str2, @l String str3, @l String str4, @l String str5) {
            super(null);
            this.title = str;
            this.subtitle = str2;
            this.description = str3;
            this.count = str4;
            this.expiration = str5;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final String getCount() {
            return this.count;
        }

        @l
        public final String getDescription() {
            return this.description;
        }

        @l
        public final String getExpiration() {
            return this.expiration;
        }

        @l
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeString(this.description);
            parcel.writeString(this.count);
            parcel.writeString(this.expiration);
        }
    }

    public /* synthetic */ PackageAttribute(C42822w c42822w) {
        this();
    }

    private PackageAttribute() {
    }
}
