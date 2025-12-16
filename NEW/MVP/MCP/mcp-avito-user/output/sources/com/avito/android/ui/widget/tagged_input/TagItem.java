package com.avito.android.ui.widget.tagged_input;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TagItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ui/widget/tagged_input/TagItem;", "Landroid/os/Parcelable;", "Type", "Value", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TagItem implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<TagItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f304693b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Value f304694c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Type f304695d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final SuggestAnalyticsEvent f304696e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TagItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/widget/tagged_input/TagItem$Type;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f304697b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f304698c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Type[] f304699d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f304700e;

        static {
            Type type = new Type("REGULAR", 0);
            f304697b = type;
            Type type2 = new Type("ALTERNATIVE", 1);
            f304698c = type2;
            Type[] typeArr = {type, type2};
            f304699d = typeArr;
            f304700e = kotlin.enums.c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f304699d.clone();
        }
    }

    /* compiled from: TagItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TagItem> {
        @Override // android.os.Parcelable.Creator
        public final TagItem createFromParcel(Parcel parcel) {
            return new TagItem(parcel.readString(), Value.CREATOR.createFromParcel(parcel), Type.valueOf(parcel.readString()), (SuggestAnalyticsEvent) parcel.readParcelable(TagItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final TagItem[] newArray(int i12) {
            return new TagItem[i12];
        }
    }

    public TagItem(@Y61.k String str, @Y61.k Value value, @Y61.k Type type, @Y61.l SuggestAnalyticsEvent suggestAnalyticsEvent) {
        this.f304693b = str;
        this.f304694c = value;
        this.f304695d = type;
        this.f304696e = suggestAnalyticsEvent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TagItem)) {
            return false;
        }
        TagItem tagItem = (TagItem) obj;
        return L.f(this.f304693b, tagItem.f304693b) && L.f(this.f304694c, tagItem.f304694c) && this.f304695d == tagItem.f304695d && L.f(this.f304696e, tagItem.f304696e);
    }

    public final int hashCode() {
        int iHashCode = (this.f304695d.hashCode() + ((this.f304694c.hashCode() + (this.f304693b.hashCode() * 31)) * 31)) * 31;
        SuggestAnalyticsEvent suggestAnalyticsEvent = this.f304696e;
        return iHashCode + (suggestAnalyticsEvent == null ? 0 : suggestAnalyticsEvent.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "TagItem(label=" + this.f304693b + ", value=" + this.f304694c + ", type=" + this.f304695d + ", clickEvent=" + this.f304696e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f304693b);
        this.f304694c.writeToParcel(parcel, i12);
        parcel.writeString(this.f304695d.name());
        parcel.writeParcelable(this.f304696e, i12);
    }

    /* compiled from: TagItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/widget/tagged_input/TagItem$Value;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Value implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Value> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f304701b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f304702c;

        /* compiled from: TagItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Value> {
            @Override // android.os.Parcelable.Creator
            public final Value createFromParcel(Parcel parcel) {
                return new Value(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Value[] newArray(int i12) {
                return new Value[i12];
            }
        }

        public Value(@Y61.k String str, boolean z12) {
            this.f304701b = str;
            this.f304702c = z12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Value)) {
                return false;
            }
            Value value = (Value) obj;
            return L.f(this.f304701b, value.f304701b) && this.f304702c == value.f304702c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f304702c) + (this.f304701b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Value(text=");
            sb2.append(this.f304701b);
            sb2.append(", isFullReplace=");
            return r.x(sb2, this.f304702c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f304701b);
            parcel.writeInt(this.f304702c ? 1 : 0);
        }

        public /* synthetic */ Value(String str, boolean z12, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? true : z12);
        }
    }

    public /* synthetic */ TagItem(String str, Value value, Type type, SuggestAnalyticsEvent suggestAnalyticsEvent, int i12, C42822w c42822w) {
        this(str, value, (i12 & 4) != 0 ? Type.f304697b : type, (i12 & 8) != 0 ? null : suggestAnalyticsEvent);
    }
}
