package com.avito.android.remote.model;

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

/* compiled from: SearchProperties.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/avito/android/remote/model/SearchProperties;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/SearchProperties$BooleanRule;", "byDirection", "byPrice", "byMetro", "byDistrict", "byGeo", "<init>", "(Lcom/avito/android/remote/model/SearchProperties$BooleanRule;Lcom/avito/android/remote/model/SearchProperties$BooleanRule;Lcom/avito/android/remote/model/SearchProperties$BooleanRule;Lcom/avito/android/remote/model/SearchProperties$BooleanRule;Lcom/avito/android/remote/model/SearchProperties$BooleanRule;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/SearchProperties$BooleanRule;", "getByDirection", "()Lcom/avito/android/remote/model/SearchProperties$BooleanRule;", "getByPrice", "getByMetro", "getByDistrict", "getByGeo", "BooleanRule", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SearchProperties implements Parcelable {

    @k
    public static final Parcelable.Creator<SearchProperties> CREATOR = new Creator();

    @c("searchByDirection")
    @k
    private final BooleanRule byDirection;

    @c("searchByDistrict")
    @k
    private final BooleanRule byDistrict;

    @c("searchByGeo")
    @k
    private final BooleanRule byGeo;

    @c("searchByMetro")
    @k
    private final BooleanRule byMetro;

    @c("searchByPrice")
    @k
    private final BooleanRule byPrice;

    /* compiled from: SearchProperties.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/SearchProperties$BooleanRule;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/SearchProperties$BooleanRule$Value;", "values", "<init>", "(Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getValues", "()Ljava/util/List;", "Value", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class BooleanRule implements Parcelable {

        @k
        public static final Parcelable.Creator<BooleanRule> CREATOR = new Creator();

        @k
        private final List<Value> values;

        /* compiled from: SearchProperties.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BooleanRule> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BooleanRule createFromParcel(@k Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(Value.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new BooleanRule(arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BooleanRule[] newArray(int i12) {
                return new BooleanRule[i12];
            }
        }

        /* compiled from: SearchProperties.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B#\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/model/SearchProperties$BooleanRule$Value;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Rule;", "", "", "paramId", "valueId", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getParamId", "()Ljava/lang/String;", "getValueId", "Z", "getValue", "()Ljava/lang/Boolean;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final class Value implements Parcelable, Rule<Boolean> {

            @k
            public static final Parcelable.Creator<Value> CREATOR = new Creator();

            @c("paramId")
            @l
            private final String paramId;

            @c("value")
            private final boolean value;

            @c("valueId")
            @l
            private final String valueId;

            /* compiled from: SearchProperties.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Value> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Value createFromParcel(@k Parcel parcel) {
                    return new Value(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Value[] newArray(int i12) {
                    return new Value[i12];
                }
            }

            public Value(@l String str, @l String str2, boolean z12) {
                this.paramId = str;
                this.valueId = str2;
                this.value = z12;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.avito.android.remote.model.Rule
            @l
            public String getParamId() {
                return this.paramId;
            }

            @Override // com.avito.android.remote.model.Rule
            @l
            public String getValueId() {
                return this.valueId;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.paramId);
                parcel.writeString(this.valueId);
                parcel.writeInt(this.value ? 1 : 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.avito.android.remote.model.Rule
            @k
            public Boolean getValue() {
                return Boolean.valueOf(this.value);
            }
        }

        public BooleanRule(@k List<Value> list) {
            this.values = list;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final List<Value> getValues() {
            return this.values;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Iterator itJ = C0.j(this.values, parcel);
            while (itJ.hasNext()) {
                ((Value) itJ.next()).writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: SearchProperties.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SearchProperties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SearchProperties createFromParcel(@k Parcel parcel) {
            Parcelable.Creator<BooleanRule> creator = BooleanRule.CREATOR;
            return new SearchProperties(creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SearchProperties[] newArray(int i12) {
            return new SearchProperties[i12];
        }
    }

    public SearchProperties(@k BooleanRule booleanRule, @k BooleanRule booleanRule2, @k BooleanRule booleanRule3, @k BooleanRule booleanRule4, @k BooleanRule booleanRule5) {
        this.byDirection = booleanRule;
        this.byPrice = booleanRule2;
        this.byMetro = booleanRule3;
        this.byDistrict = booleanRule4;
        this.byGeo = booleanRule5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final BooleanRule getByDirection() {
        return this.byDirection;
    }

    @k
    public final BooleanRule getByDistrict() {
        return this.byDistrict;
    }

    @k
    public final BooleanRule getByGeo() {
        return this.byGeo;
    }

    @k
    public final BooleanRule getByMetro() {
        return this.byMetro;
    }

    @k
    public final BooleanRule getByPrice() {
        return this.byPrice;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.byDirection.writeToParcel(parcel, flags);
        this.byPrice.writeToParcel(parcel, flags);
        this.byMetro.writeToParcel(parcel, flags);
        this.byDistrict.writeToParcel(parcel, flags);
        this.byGeo.writeToParcel(parcel, flags);
    }
}
