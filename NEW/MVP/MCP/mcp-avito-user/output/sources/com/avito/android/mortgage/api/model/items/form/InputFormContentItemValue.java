package com.avito.android.mortgage.api.model.items.form;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.mortgage.api.model.items.form.d;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.AttributedText;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import shark.AndroidResourceIdNames;

/* compiled from: InputFormContentItemValue.kt */
@P
@s0
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BË\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b\u0007\u0010$R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b%\u0010!R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b\u000b\u0010$R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b*\u0010$R\u001a\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b+\u0010$R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b,\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b-\u0010!R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b1\u0010!R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u00102R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b3\u0010!¨\u00064"}, d2 = {"Lcom/avito/android/mortgage/api/model/items/form/InputFormContentItemValue;", "Lcom/avito/android/mortgage/api/model/items/form/d;", "Landroid/os/Parcelable;", "", "id", "name", "", "isHidden", "context", "reloadAfterUpdateMeta", "errorMeta", "isRequired", "", "shows", "isMasked", "isCompact", ChannelContext.Item.PLACEHOLDER, "subtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedSubtitle", "title", "Lcom/avito/android/mortgage/api/model/items/form/InputFormContentType;", "contentTypeMeta", "value", "isUpdated", "isUpdatedByUser", "Lcom/avito/android/printable_text/PrintableText;", "localError", "processId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/util/List;ZZLjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/mortgage/api/model/items/form/InputFormContentType;Ljava/lang/String;ZZLcom/avito/android/printable_text/PrintableText;Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getName", "Z", "()Z", "getContext", "Ljava/lang/Boolean;", "Ljava/util/List;", "getShows", "()Ljava/util/List;", "e", "Q0", "getPlaceholder", "getSubtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "Lcom/avito/android/mortgage/api/model/items/form/InputFormContentType;", "getValue", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes15.dex */
public final /* data */ class InputFormContentItemValue implements d, Parcelable {

    @k
    public static final Parcelable.Creator<InputFormContentItemValue> CREATOR = new a();

    @com.google.gson.annotations.c("attributedSubtitle")
    @l
    private final AttributedText attributedSubtitle;

    /* renamed from: b, reason: collision with root package name */
    public final transient boolean f198227b;

    /* renamed from: c, reason: collision with root package name */
    public final transient boolean f198228c;

    @com.google.gson.annotations.c("contentType")
    @l
    private final InputFormContentType contentTypeMeta;

    @com.google.gson.annotations.c("context")
    @l
    private final String context;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final transient PrintableText f198229d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final transient String f198230e;

    @com.google.gson.annotations.c("error")
    @l
    private final String errorMeta;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("isCompact")
    private final boolean isCompact;

    @com.google.gson.annotations.c("isHidden")
    private final boolean isHidden;

    @com.google.gson.annotations.c("isMasked")
    private final boolean isMasked;

    @com.google.gson.annotations.c("isRequired")
    private final boolean isRequired;

    @com.google.gson.annotations.c("name")
    @k
    private final String name;

    @com.google.gson.annotations.c(ChannelContext.Item.PLACEHOLDER)
    @l
    private final String placeholder;

    @com.google.gson.annotations.c("reloadAfterUpdate")
    @l
    private final Boolean reloadAfterUpdateMeta;

    @com.google.gson.annotations.c("shows")
    @l
    private final List<String> shows;

    @com.google.gson.annotations.c("subtitle")
    @l
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("value")
    @l
    private final String value;

    /* compiled from: InputFormContentItemValue.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InputFormContentItemValue> {
        @Override // android.os.Parcelable.Creator
        public final InputFormContentItemValue createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new InputFormContentItemValue(string, string2, z12, string3, boolValueOf, parcel.readString(), parcel.readInt() != 0, parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(InputFormContentItemValue.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : InputFormContentType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (PrintableText) parcel.readParcelable(InputFormContentItemValue.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final InputFormContentItemValue[] newArray(int i12) {
            return new InputFormContentItemValue[i12];
        }
    }

    public InputFormContentItemValue(@k String str, @k String str2, boolean z12, @l String str3, @l Boolean bool, @l String str4, boolean z13, @l List<String> list, boolean z14, boolean z15, @l String str5, @l String str6, @l AttributedText attributedText, @k String str7, @l InputFormContentType inputFormContentType, @l String str8, boolean z16, boolean z17, @l PrintableText printableText, @l String str9) {
        this.id = str;
        this.name = str2;
        this.isHidden = z12;
        this.context = str3;
        this.reloadAfterUpdateMeta = bool;
        this.errorMeta = str4;
        this.isRequired = z13;
        this.shows = list;
        this.isMasked = z14;
        this.isCompact = z15;
        this.placeholder = str5;
        this.subtitle = str6;
        this.attributedSubtitle = attributedText;
        this.title = str7;
        this.contentTypeMeta = inputFormContentType;
        this.value = str8;
        this.f198227b = z16;
        this.f198228c = z17;
        this.f198229d = printableText;
        this.f198230e = str9;
    }

    public static InputFormContentItemValue a(InputFormContentItemValue inputFormContentItemValue, boolean z12, boolean z13, String str, boolean z14, boolean z15, PrintableText printableText, String str2, int i12) {
        InputFormContentType inputFormContentType;
        String str3;
        String str4 = inputFormContentItemValue.id;
        String str5 = inputFormContentItemValue.name;
        boolean z16 = (i12 & 4) != 0 ? inputFormContentItemValue.isHidden : z12;
        String str6 = inputFormContentItemValue.context;
        Boolean bool = inputFormContentItemValue.reloadAfterUpdateMeta;
        String str7 = (i12 & 32) != 0 ? inputFormContentItemValue.errorMeta : null;
        boolean z17 = (i12 & 64) != 0 ? inputFormContentItemValue.isRequired : z13;
        List<String> list = inputFormContentItemValue.shows;
        boolean z18 = (i12 & 256) != 0 ? inputFormContentItemValue.isMasked : false;
        boolean z19 = inputFormContentItemValue.isCompact;
        String str8 = inputFormContentItemValue.placeholder;
        String str9 = inputFormContentItemValue.subtitle;
        AttributedText attributedText = inputFormContentItemValue.attributedSubtitle;
        String str10 = inputFormContentItemValue.title;
        InputFormContentType inputFormContentType2 = inputFormContentItemValue.contentTypeMeta;
        if ((i12 & 32768) != 0) {
            inputFormContentType = inputFormContentType2;
            str3 = inputFormContentItemValue.value;
        } else {
            inputFormContentType = inputFormContentType2;
            str3 = str;
        }
        boolean z22 = (65536 & i12) != 0 ? inputFormContentItemValue.f198227b : z14;
        boolean z23 = (131072 & i12) != 0 ? inputFormContentItemValue.f198228c : z15;
        PrintableText printableText2 = (262144 & i12) != 0 ? inputFormContentItemValue.f198229d : printableText;
        String str11 = (i12 & 524288) != 0 ? inputFormContentItemValue.f198230e : str2;
        inputFormContentItemValue.getClass();
        return new InputFormContentItemValue(str4, str5, z16, str6, bool, str7, z17, list, z18, z19, str8, str9, attributedText, str10, inputFormContentType, str3, z22, z23, printableText2, str11);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final d G2(@l PrintableText printableText) {
        return a(this, false, false, null, false, false, printableText, null, 786431);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final d H2(boolean z12) {
        return a(this, z12, false, null, false, false, null, null, 1048571);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final List<String> I2() {
        List<String> list;
        if (this.isHidden) {
            return C42784z0.f406748b;
        }
        String str = this.value;
        return ((str == null || str.length() == 0) || (list = this.shows) == null) ? C42784z0.f406748b : list;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    /* renamed from: J2, reason: from getter */
    public final boolean getF198244b() {
        return this.f198227b;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final List<List<String>> L2() {
        List<String> list;
        if (!this.isHidden) {
            String str = this.value;
            return ((str == null || str.length() == 0) && (list = this.shows) != null) ? Collections.singletonList(list) : C42784z0.f406748b;
        }
        Object obj = this.shows;
        if (obj == null) {
            obj = C42784z0.f406748b;
        }
        return Collections.singletonList(obj);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final d M2(boolean z12) {
        return a(this, false, false, null, z12, false, null, z12 ? this.f198230e : null, 458751);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @l
    /* renamed from: N2, reason: from getter */
    public final String getF198247e() {
        return this.f198230e;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    public final int P2() {
        return d.a.a(this);
    }

    /* renamed from: Q0, reason: from getter */
    public final boolean getIsCompact() {
        return this.isCompact;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final d Q2(@l String str) {
        return a(this, false, false, null, false, false, null, str, 524287);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    /* renamed from: S2, reason: from getter */
    public final boolean getF198245c() {
        return this.f198228c;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    public final boolean U2() {
        Boolean bool = this.reloadAfterUpdateMeta;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final AttributedText getAttributedSubtitle() {
        return this.attributedSubtitle;
    }

    @k
    public final InputFormContentType d() {
        InputFormContentType inputFormContentType = this.contentTypeMeta;
        return inputFormContentType == null ? InputFormContentType.PLAIN : inputFormContentType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsMasked() {
        return this.isMasked;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputFormContentItemValue)) {
            return false;
        }
        InputFormContentItemValue inputFormContentItemValue = (InputFormContentItemValue) obj;
        return L.f(this.id, inputFormContentItemValue.id) && L.f(this.name, inputFormContentItemValue.name) && this.isHidden == inputFormContentItemValue.isHidden && L.f(this.context, inputFormContentItemValue.context) && L.f(this.reloadAfterUpdateMeta, inputFormContentItemValue.reloadAfterUpdateMeta) && L.f(this.errorMeta, inputFormContentItemValue.errorMeta) && this.isRequired == inputFormContentItemValue.isRequired && L.f(this.shows, inputFormContentItemValue.shows) && this.isMasked == inputFormContentItemValue.isMasked && this.isCompact == inputFormContentItemValue.isCompact && L.f(this.placeholder, inputFormContentItemValue.placeholder) && L.f(this.subtitle, inputFormContentItemValue.subtitle) && L.f(this.attributedSubtitle, inputFormContentItemValue.attributedSubtitle) && L.f(this.title, inputFormContentItemValue.title) && this.contentTypeMeta == inputFormContentItemValue.contentTypeMeta && L.f(this.value, inputFormContentItemValue.value) && this.f198227b == inputFormContentItemValue.f198227b && this.f198228c == inputFormContentItemValue.f198228c && L.f(this.f198229d, inputFormContentItemValue.f198229d) && L.f(this.f198230e, inputFormContentItemValue.f198230e);
    }

    @k
    public final InputFormContentItemValue f(@k String str, boolean z12) {
        return str.equals(this.value) ? this : a(this, false, false, str, true, z12, null, null, 556767);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @l
    public final String getContext() {
        return this.context;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @l
    public final PrintableText getError() {
        PrintableText printableText = this.f198229d;
        if (printableText != null) {
            return printableText;
        }
        String str = this.errorMeta;
        if (str == null || str.length() == 0) {
            return null;
        }
        return com.avito.android.printable_text.b.f(this.errorMeta);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final String getId() {
        return this.id;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final String getName() {
        return this.name;
    }

    @l
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        int i12 = r.i(H.d(this.id.hashCode() * 31, 31, this.name), 31, this.isHidden);
        String str = this.context;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.reloadAfterUpdateMeta;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.errorMeta;
        int i13 = r.i((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isRequired);
        List<String> list = this.shows;
        int i14 = r.i(r.i((i13 + (list == null ? 0 : list.hashCode())) * 31, 31, this.isMasked), 31, this.isCompact);
        String str3 = this.placeholder;
        int iHashCode3 = (i14 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subtitle;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AttributedText attributedText = this.attributedSubtitle;
        int iD2 = H.d((iHashCode4 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.title);
        InputFormContentType inputFormContentType = this.contentTypeMeta;
        int iHashCode5 = (iD2 + (inputFormContentType == null ? 0 : inputFormContentType.hashCode())) * 31;
        String str5 = this.value;
        int i15 = r.i(r.i((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f198227b), 31, this.f198228c);
        PrintableText printableText = this.f198229d;
        int iHashCode6 = (i15 + (printableText == null ? 0 : printableText.hashCode())) * 31;
        String str6 = this.f198230e;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    public final boolean isEmpty() {
        String str = this.value;
        return str == null || str.length() == 0;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    /* renamed from: isHidden, reason: from getter */
    public final boolean getIsHidden() {
        return this.isHidden;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    public final boolean isValid() {
        return (this.isRequired && !this.isHidden && isEmpty()) ? false : true;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InputFormContentItemValue(id=");
        sb2.append(this.id);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", isHidden=");
        sb2.append(this.isHidden);
        sb2.append(", context=");
        sb2.append(this.context);
        sb2.append(", reloadAfterUpdateMeta=");
        sb2.append(this.reloadAfterUpdateMeta);
        sb2.append(", errorMeta=");
        sb2.append(this.errorMeta);
        sb2.append(", isRequired=");
        sb2.append(this.isRequired);
        sb2.append(", shows=");
        sb2.append(this.shows);
        sb2.append(", isMasked=");
        sb2.append(this.isMasked);
        sb2.append(", isCompact=");
        sb2.append(this.isCompact);
        sb2.append(", placeholder=");
        sb2.append(this.placeholder);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", attributedSubtitle=");
        sb2.append(this.attributedSubtitle);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", contentTypeMeta=");
        sb2.append(this.contentTypeMeta);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", isUpdated=");
        sb2.append(this.f198227b);
        sb2.append(", isUpdatedByUser=");
        sb2.append(this.f198228c);
        sb2.append(", localError=");
        sb2.append(this.f198229d);
        sb2.append(", processId=");
        return C22026a.c(sb2, this.f198230e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeInt(this.isHidden ? 1 : 0);
        parcel.writeString(this.context);
        Boolean bool = this.reloadAfterUpdateMeta;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.errorMeta);
        parcel.writeInt(this.isRequired ? 1 : 0);
        parcel.writeStringList(this.shows);
        parcel.writeInt(this.isMasked ? 1 : 0);
        parcel.writeInt(this.isCompact ? 1 : 0);
        parcel.writeString(this.placeholder);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.attributedSubtitle, i12);
        parcel.writeString(this.title);
        InputFormContentType inputFormContentType = this.contentTypeMeta;
        if (inputFormContentType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(inputFormContentType.name());
        }
        parcel.writeString(this.value);
        parcel.writeInt(this.f198227b ? 1 : 0);
        parcel.writeInt(this.f198228c ? 1 : 0);
        parcel.writeParcelable(this.f198229d, i12);
        parcel.writeString(this.f198230e);
    }

    public /* synthetic */ InputFormContentItemValue(String str, String str2, boolean z12, String str3, Boolean bool, String str4, boolean z13, List list, boolean z14, boolean z15, String str5, String str6, AttributedText attributedText, String str7, InputFormContentType inputFormContentType, String str8, boolean z16, boolean z17, PrintableText printableText, String str9, int i12, C42822w c42822w) {
        this(str, str2, z12, str3, bool, str4, z13, list, z14, z15, str5, str6, attributedText, str7, inputFormContentType, str8, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? false : z16, (i12 & 131072) != 0 ? false : z17, (i12 & 262144) != 0 ? null : printableText, (i12 & 524288) != 0 ? null : str9);
    }
}
