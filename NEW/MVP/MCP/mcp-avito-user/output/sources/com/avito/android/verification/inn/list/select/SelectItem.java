package com.avito.android.verification.inn.list.select;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.verification.inn.list.Hidable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;

/* compiled from: SelectItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/verification/inn/list/select/SelectItem;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/android/verification/inn/list/Hidable;", "LGM0/a;", "Option", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SelectItem implements com.avito.conveyor_item.a, Hidable, GM0.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f324058b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Hidable.Hidden f324059c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Map<String, Boolean> f324060d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public AttributedText f324061e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f324062f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f324063g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final AttributedText f324064h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final List<Option> f324065i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final ParcelableEntity<String> f324066j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final List<com.avito.android.verification.inn.validation.a> f324067k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final String f324068l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final String f324069m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final String f324070n;

    /* renamed from: o, reason: collision with root package name */
    public final int f324071o;

    /* renamed from: p, reason: collision with root package name */
    public final int f324072p;

    /* compiled from: SelectItem.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/inn/list/select/SelectItem$Option;", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Option implements ParcelableEntity<String> {

        @Y61.k
        public static final Parcelable.Creator<Option> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f324073b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f324074c;

        /* compiled from: SelectItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Option> {
            @Override // android.os.Parcelable.Creator
            public final Option createFromParcel(Parcel parcel) {
                return new Option(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Option[] newArray(int i12) {
                return new Option[i12];
            }
        }

        public Option(@Y61.k String str, @Y61.k String str2) {
            this.f324073b = str;
            this.f324074c = str2;
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
            return L.f(this.f324073b, option.f324073b) && L.f(this.f324074c, option.f324074c);
        }

        @Override // com.avito.android.remote.model.Entity
        public final Object getId() {
            return this.f324073b;
        }

        @Override // com.avito.android.remote.model.Entity
        @Y61.k
        /* renamed from: getName, reason: from getter */
        public final String getF324074c() {
            return this.f324074c;
        }

        public final int hashCode() {
            return this.f324074c.hashCode() + (this.f324073b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Option(id=");
            sb2.append(this.f324073b);
            sb2.append(", name=");
            return C22026a.c(sb2, this.f324074c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f324073b);
            parcel.writeString(this.f324074c);
        }
    }

    public SelectItem(@Y61.k String str, @Y61.k Hidable.Hidden hidden, @Y61.k Map<String, Boolean> map, @l AttributedText attributedText, boolean z12, @Y61.k String str2, @l AttributedText attributedText2, @Y61.k List<Option> list, @l ParcelableEntity<String> parcelableEntity, @Y61.k List<com.avito.android.verification.inn.validation.a> list2, @Y61.k String str3, @l String str4, @l String str5, int i12, int i13) {
        this.f324058b = str;
        this.f324059c = hidden;
        this.f324060d = map;
        this.f324061e = attributedText;
        this.f324062f = z12;
        this.f324063g = str2;
        this.f324064h = attributedText2;
        this.f324065i = list;
        this.f324066j = parcelableEntity;
        this.f324067k = list2;
        this.f324068l = str3;
        this.f324069m = str4;
        this.f324070n = str5;
        this.f324071o = i12;
        this.f324072p = i13;
    }

    public static SelectItem L(SelectItem selectItem, Hidable.Hidden hidden, AttributedText attributedText, ParcelableEntity parcelableEntity, int i12) {
        String str = selectItem.f324058b;
        Hidable.Hidden hidden2 = (i12 & 2) != 0 ? selectItem.f324059c : hidden;
        Map<String, Boolean> map = selectItem.f324060d;
        AttributedText attributedText2 = (i12 & 8) != 0 ? selectItem.f324061e : attributedText;
        boolean z12 = selectItem.f324062f;
        String str2 = selectItem.f324063g;
        AttributedText attributedText3 = selectItem.f324064h;
        List<Option> list = selectItem.f324065i;
        ParcelableEntity parcelableEntity2 = (i12 & 256) != 0 ? selectItem.f324066j : parcelableEntity;
        List<com.avito.android.verification.inn.validation.a> list2 = selectItem.f324067k;
        String str3 = selectItem.f324068l;
        String str4 = selectItem.f324069m;
        String str5 = selectItem.f324070n;
        int i13 = selectItem.f324071o;
        int i14 = selectItem.f324072p;
        selectItem.getClass();
        return new SelectItem(str, hidden2, map, attributedText2, z12, str2, attributedText3, list, parcelableEntity2, list2, str3, str4, str5, i13, i14);
    }

    @Override // GM0.a
    public final com.avito.conveyor_item.a S0(AttributedText attributedText) {
        return L(this, null, attributedText, null, 32759);
    }

    @Override // com.avito.android.verification.inn.list.Hidable
    public final com.avito.conveyor_item.a a(Hidable.Hidden hidden) {
        return L(this, hidden, null, null, 32765);
    }

    @Override // com.avito.android.verification.inn.list.Hidable
    @Y61.k
    public final Map<String, Boolean> b() {
        return this.f324060d;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectItem)) {
            return false;
        }
        SelectItem selectItem = (SelectItem) obj;
        return L.f(this.f324058b, selectItem.f324058b) && this.f324059c == selectItem.f324059c && L.f(this.f324060d, selectItem.f324060d) && L.f(this.f324061e, selectItem.f324061e) && this.f324062f == selectItem.f324062f && L.f(this.f324063g, selectItem.f324063g) && L.f(this.f324064h, selectItem.f324064h) && L.f(this.f324065i, selectItem.f324065i) && L.f(this.f324066j, selectItem.f324066j) && L.f(this.f324067k, selectItem.f324067k) && L.f(this.f324068l, selectItem.f324068l) && L.f(this.f324069m, selectItem.f324069m) && L.f(this.f324070n, selectItem.f324070n) && this.f324071o == selectItem.f324071o && this.f324072p == selectItem.f324072p;
    }

    @Override // com.avito.android.verification.inn.list.Hidable
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final Hidable.Hidden getF324059c() {
        return this.f324059c;
    }

    @Override // GM0.a
    @l
    /* renamed from: getError, reason: from getter */
    public final AttributedText getF324061e() {
        return this.f324061e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return getF324812b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF324812b() {
        return this.f324058b;
    }

    public final int hashCode() {
        int iC2 = AK.c.c((this.f324059c.hashCode() + (this.f324058b.hashCode() * 31)) * 31, 31, this.f324060d);
        AttributedText attributedText = this.f324061e;
        int iD2 = H.d(r.i((iC2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f324062f), 31, this.f324063g);
        AttributedText attributedText2 = this.f324064h;
        int iE2 = H.e((iD2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31, 31, this.f324065i);
        ParcelableEntity<String> parcelableEntity = this.f324066j;
        int iD3 = H.d(H.e((iE2 + (parcelableEntity == null ? 0 : parcelableEntity.hashCode())) * 31, 31, this.f324067k), 31, this.f324068l);
        String str = this.f324069m;
        int iHashCode = (iD3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f324070n;
        return Integer.hashCode(this.f324072p) + r.e(this.f324071o, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectItem(stringId=");
        sb2.append(this.f324058b);
        sb2.append(", hidden=");
        sb2.append(this.f324059c);
        sb2.append(", hiddenIf=");
        sb2.append(this.f324060d);
        sb2.append(", error=");
        sb2.append(this.f324061e);
        sb2.append(", isDisabled=");
        sb2.append(this.f324062f);
        sb2.append(", title=");
        sb2.append(this.f324063g);
        sb2.append(", hint=");
        sb2.append(this.f324064h);
        sb2.append(", options=");
        sb2.append(this.f324065i);
        sb2.append(", selectedOption=");
        sb2.append(this.f324066j);
        sb2.append(", validations=");
        sb2.append(this.f324067k);
        sb2.append(", placeholder=");
        sb2.append(this.f324068l);
        sb2.append(", tooltipTitle=");
        sb2.append(this.f324069m);
        sb2.append(", tooltipBody=");
        sb2.append(this.f324070n);
        sb2.append(", marginTop=");
        sb2.append(this.f324071o);
        sb2.append(", marginBottom=");
        return r.t(sb2, this.f324072p, ')');
    }

    public /* synthetic */ SelectItem(String str, Hidable.Hidden hidden, Map map, AttributedText attributedText, boolean z12, String str2, AttributedText attributedText2, List list, ParcelableEntity parcelableEntity, List list2, String str3, String str4, String str5, int i12, int i13, int i14, C42822w c42822w) {
        this(str, (i14 & 2) != 0 ? Hidable.Hidden.f323896b : hidden, map, attributedText, z12, str2, attributedText2, list, parcelableEntity, list2, str3, str4, str5, (i14 & 8192) != 0 ? 0 : i12, (i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? 0 : i13);
    }
}
