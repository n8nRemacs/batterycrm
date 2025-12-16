package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.hotel.model.HotelBookingParameter;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42821v;
import kotlin.jvm.internal.L;

/* compiled from: HotelBookingSelectItem.kt */
@d
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\"BW\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/avito/android/hotel/model/HotelBookingSelectItem;", "Lcom/avito/android/hotel/model/HotelBookingFormItem;", "Lcom/avito/android/hotel/model/EnableableItem;", "Lcom/avito/android/hotel/model/HotelBookingParameter;", "Lcom/avito/android/hotel/model/HotelBookingSelectItem$Value;", "", "id", "value", "", "_updateForm", "_isEnabled", "errorMessage", "hint", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/hotel/model/HotelBookingSelectItem$Value;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/hotel/model/HotelBookingSelectItem$Value;", "e", "()Lcom/avito/android/hotel/model/HotelBookingSelectItem$Value;", "Ljava/lang/Boolean;", "O2", "()Ljava/lang/Boolean;", "f", "c", "d", "getText", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Value", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelBookingSelectItem implements HotelBookingFormItem, EnableableItem, HotelBookingParameter<Value> {

    @k
    public static final Parcelable.Creator<HotelBookingSelectItem> CREATOR = new a();

    @c("isEnabled")
    @l
    private final Boolean _isEnabled;

    @c("updateForm")
    @l
    private final Boolean _updateForm;

    @c(ContextActionHandler.Link.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @c("errorMessage")
    @l
    private final String errorMessage;

    @c("hint")
    @l
    private final String hint;

    @c("id")
    @l
    private final String id;

    @c("text")
    @l
    private final String text;

    @c("value")
    @l
    private final Value value;

    /* compiled from: HotelBookingSelectItem.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/hotel/model/HotelBookingSelectItem$Value;", "", "", "", "Landroid/os/Parcelable;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Value implements List<Map<String, ? extends String>>, Parcelable, Z41.a {

        @k
        public static final Parcelable.Creator<Value> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<Map<String, String>> f162629b;

        /* compiled from: HotelBookingSelectItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Value> {
            @Override // android.os.Parcelable.Creator
            public final Value createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    int i14 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
                    int iA2 = 0;
                    while (iA2 != i14) {
                        iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                    }
                    arrayList.add(linkedHashMap);
                }
                return new Value(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Value[] newArray(int i12) {
                return new Value[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Value(@k List<? extends Map<String, String>> list) {
            this.f162629b = list;
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ void add(int i12, Map<String, ? extends String> map) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final boolean addAll(int i12, Collection<? extends Map<String, ? extends String>> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ void addLast(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map)) {
                return false;
            }
            return this.f162629b.contains((Map) obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(@k Collection<? extends Object> collection) {
            return this.f162629b.containsAll(collection);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Value) && L.f(this.f162629b, ((Value) obj).f162629b);
        }

        @Override // java.util.List
        public final Map<String, ? extends String> get(int i12) {
            return this.f162629b.get(i12);
        }

        @Override // java.util.List, java.util.Collection
        public final int hashCode() {
            return this.f162629b.hashCode();
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof Map)) {
                return -1;
            }
            return this.f162629b.indexOf((Map) obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f162629b.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @k
        public final Iterator<Map<String, String>> iterator() {
            return this.f162629b.iterator();
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof Map)) {
                return -1;
            }
            return this.f162629b.lastIndexOf((Map) obj);
        }

        @Override // java.util.List
        @k
        public final ListIterator<Map<String, ? extends String>> listIterator() {
            return this.f162629b.listIterator();
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ Map<String, ? extends String> remove(int i12) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ Object removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ Object removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final void replaceAll(UnaryOperator<Map<String, ? extends String>> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ Map<String, ? extends String> set(int i12, Map<String, ? extends String> map) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f162629b.size();
        }

        @Override // java.util.List
        public final void sort(Comparator<? super Map<String, ? extends String>> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        @k
        public final List<Map<String, ? extends String>> subList(int i12, int i13) {
            return this.f162629b.subList(i12, i13);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return C42821v.a(this);
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("Value(list="), this.f162629b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            Iterator itJ = C0.j(this.f162629b, parcel);
            while (itJ.hasNext()) {
                Iterator itI = C0.i(parcel, (Map) itJ.next());
                while (itI.hasNext()) {
                    Map.Entry entry = (Map.Entry) itI.next();
                    parcel.writeString((String) entry.getKey());
                    parcel.writeString((String) entry.getValue());
                }
            }
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends Map<String, ? extends String>> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        @k
        public final ListIterator<Map<String, ? extends String>> listIterator(int i12) {
            return this.f162629b.listIterator(i12);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) C42821v.b(this, tArr);
        }
    }

    /* compiled from: HotelBookingSelectItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelBookingSelectItem> {
        @Override // android.os.Parcelable.Creator
        public final HotelBookingSelectItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String string = parcel.readString();
            Value valueCreateFromParcel = parcel.readInt() == 0 ? null : Value.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new HotelBookingSelectItem(string, valueCreateFromParcel, boolValueOf, boolValueOf2, parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(HotelBookingSelectItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final HotelBookingSelectItem[] newArray(int i12) {
            return new HotelBookingSelectItem[i12];
        }
    }

    public HotelBookingSelectItem(@l String str, @l Value value, @l Boolean bool, @l Boolean bool2, @l String str2, @l String str3, @l String str4, @l DeepLink deepLink) {
        this.id = str;
        this.value = value;
        this._updateForm = bool;
        this._isEnabled = bool2;
        this.errorMessage = str2;
        this.hint = str3;
        this.text = str4;
        this.deeplink = deepLink;
    }

    public static HotelBookingSelectItem a(HotelBookingSelectItem hotelBookingSelectItem, Value value, String str, int i12) {
        String str2 = hotelBookingSelectItem.id;
        if ((i12 & 2) != 0) {
            value = hotelBookingSelectItem.value;
        }
        Value value2 = value;
        Boolean bool = hotelBookingSelectItem._updateForm;
        Boolean bool2 = hotelBookingSelectItem._isEnabled;
        if ((i12 & 16) != 0) {
            str = hotelBookingSelectItem.errorMessage;
        }
        String str3 = hotelBookingSelectItem.hint;
        String str4 = hotelBookingSelectItem.text;
        DeepLink deepLink = hotelBookingSelectItem.deeplink;
        hotelBookingSelectItem.getClass();
        return new HotelBookingSelectItem(str2, value2, bool, bool2, str, str3, str4, deepLink);
    }

    @Override // com.avito.android.hotel.model.HotelBookingParameter
    public final boolean C5() {
        return HotelBookingParameter.a.a(this);
    }

    @Override // com.avito.android.hotel.model.HotelBookingParameter
    @l
    /* renamed from: O2, reason: from getter */
    public final Boolean get_updateForm() {
        return this._updateForm;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Value getValue() {
        return this.value;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelBookingSelectItem)) {
            return false;
        }
        HotelBookingSelectItem hotelBookingSelectItem = (HotelBookingSelectItem) obj;
        return L.f(this.id, hotelBookingSelectItem.id) && L.f(this.value, hotelBookingSelectItem.value) && L.f(this._updateForm, hotelBookingSelectItem._updateForm) && L.f(this._isEnabled, hotelBookingSelectItem._isEnabled) && L.f(this.errorMessage, hotelBookingSelectItem.errorMessage) && L.f(this.hint, hotelBookingSelectItem.hint) && L.f(this.text, hotelBookingSelectItem.text) && L.f(this.deeplink, hotelBookingSelectItem.deeplink);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Boolean get_isEnabled() {
        return this._isEnabled;
    }

    @l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @Override // com.avito.android.hotel.model.HotelBookingParameter
    @l
    public final String getId() {
        return this.id;
    }

    @l
    public final String getText() {
        return this.text;
    }

    @Override // com.avito.android.hotel.model.HotelBookingParameter
    public final Value getValue() {
        return this.value;
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Value value = this.value;
        int iHashCode2 = (iHashCode + (value == null ? 0 : value.f162629b.hashCode())) * 31;
        Boolean bool = this._updateForm;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this._isEnabled;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.errorMessage;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.hint;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.text;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        DeepLink deepLink = this.deeplink;
        return iHashCode7 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelBookingSelectItem(id=");
        sb2.append(this.id);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", _updateForm=");
        sb2.append(this._updateForm);
        sb2.append(", _isEnabled=");
        sb2.append(this._isEnabled);
        sb2.append(", errorMessage=");
        sb2.append(this.errorMessage);
        sb2.append(", hint=");
        sb2.append(this.hint);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.deeplink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        Value value = this.value;
        if (value == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            value.writeToParcel(parcel, i12);
        }
        Boolean bool = this._updateForm;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this._isEnabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        parcel.writeString(this.errorMessage);
        parcel.writeString(this.hint);
        parcel.writeString(this.text);
        parcel.writeParcelable(this.deeplink, i12);
    }
}
