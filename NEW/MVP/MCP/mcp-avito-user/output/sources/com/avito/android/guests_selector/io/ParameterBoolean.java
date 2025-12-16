package com.avito.android.guests_selector.io;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ParameterInfo.kt */
@d
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u000f¨\u0006'"}, d2 = {"Lcom/avito/android/guests_selector/io/ParameterBoolean;", "Lcom/avito/android/guests_selector/io/Parameter;", "", "id", "", "value", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/guests_selector/io/ParameterBoolean;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Ljava/lang/Boolean;", "getValue", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "_avito_guests-selector_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ParameterBoolean implements Parameter {

    @k
    public static final Parcelable.Creator<ParameterBoolean> CREATOR = new a();

    @k
    private final String id;

    @k
    private final AttributedText title;

    @l
    private final Boolean value;

    /* compiled from: ParameterInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ParameterBoolean> {
        @Override // android.os.Parcelable.Creator
        public final ParameterBoolean createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ParameterBoolean(string, boolValueOf, (AttributedText) parcel.readParcelable(ParameterBoolean.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ParameterBoolean[] newArray(int i12) {
            return new ParameterBoolean[i12];
        }
    }

    public ParameterBoolean(@k String str, @l Boolean bool, @k AttributedText attributedText) {
        this.id = str;
        this.value = bool;
        this.title = attributedText;
    }

    public static /* synthetic */ ParameterBoolean copy$default(ParameterBoolean parameterBoolean, String str, Boolean bool, AttributedText attributedText, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = parameterBoolean.id;
        }
        if ((i12 & 2) != 0) {
            bool = parameterBoolean.value;
        }
        if ((i12 & 4) != 0) {
            attributedText = parameterBoolean.title;
        }
        return parameterBoolean.copy(str, bool, attributedText);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Boolean getValue() {
        return this.value;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @k
    public final ParameterBoolean copy(@k String id2, @l Boolean value, @k AttributedText title) {
        return new ParameterBoolean(id2, value, title);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParameterBoolean)) {
            return false;
        }
        ParameterBoolean parameterBoolean = (ParameterBoolean) other;
        return L.f(this.id, parameterBoolean.id) && L.f(this.value, parameterBoolean.value) && L.f(this.title, parameterBoolean.title);
    }

    @Override // com.avito.android.guests_selector.io.Parameter
    @k
    public String getId() {
        return this.id;
    }

    @k
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    public final Boolean getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Boolean bool = this.value;
        return this.title.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ParameterBoolean(id=");
        sb2.append(this.id);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", title=");
        return com.avito.android.actions_sheet.a.w(sb2, this.title, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        Boolean bool = this.value;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.title, flags);
    }

    public /* synthetic */ ParameterBoolean(String str, Boolean bool, AttributedText attributedText, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : bool, attributedText);
    }
}
