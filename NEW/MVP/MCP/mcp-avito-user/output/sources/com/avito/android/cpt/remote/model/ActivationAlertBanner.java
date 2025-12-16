package com.avito.android.cpt.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ActivationAlertBanner.kt */
@d
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/avito/android/cpt/remote/model/ActivationAlertBanner;", "Landroid/os/Parcelable;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/cpt/remote/model/ActivationAlertBanner$Icon;", "icon", "", "Lcom/avito/android/remote/model/ButtonAction;", "actions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/cpt/remote/model/ActivationAlertBanner$Icon;Ljava/util/List;)V", "Ljava/lang/String;", "getStyle", "()Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/cpt/remote/model/ActivationAlertBanner$Icon;", "c", "()Lcom/avito/android/cpt/remote/model/ActivationAlertBanner$Icon;", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "Icon", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ActivationAlertBanner implements Parcelable {

    @k
    public static final Parcelable.Creator<ActivationAlertBanner> CREATOR = new a();

    @c("actions")
    @l
    private final List<ButtonAction> actions;

    @c("description")
    @k
    private final AttributedText description;

    @c("icon")
    @l
    private final Icon icon;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @k
    private final String style;

    @c("title")
    @k
    private final String title;

    /* compiled from: ActivationAlertBanner.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/cpt/remote/model/ActivationAlertBanner$Icon;", "Landroid/os/Parcelable;", "", "name", "color", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "c", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Icon implements Parcelable {

        @k
        public static final Parcelable.Creator<Icon> CREATOR = new a();

        @c("color")
        @k
        private final String color;

        @c("name")
        @k
        private final String name;

        /* compiled from: ActivationAlertBanner.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Icon> {
            @Override // android.os.Parcelable.Creator
            public final Icon createFromParcel(Parcel parcel) {
                return new Icon(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Icon[] newArray(int i12) {
                return new Icon[i12];
            }
        }

        public Icon(@k String str, @k String str2) {
            this.name = str;
            this.color = str2;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) obj;
            return L.f(this.name, icon.name) && L.f(this.color, icon.color);
        }

        @k
        public final String getName() {
            return this.name;
        }

        public final int hashCode() {
            return this.color.hashCode() + (this.name.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Icon(name=");
            sb2.append(this.name);
            sb2.append(", color=");
            return C22026a.c(sb2, this.color, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.name);
            parcel.writeString(this.color);
        }
    }

    /* compiled from: ActivationAlertBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ActivationAlertBanner> {
        @Override // android.os.Parcelable.Creator
        public final ActivationAlertBanner createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(ActivationAlertBanner.class.getClassLoader());
            ArrayList arrayList = null;
            Icon iconCreateFromParcel = parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(ActivationAlertBanner.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new ActivationAlertBanner(string, string2, attributedText, iconCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ActivationAlertBanner[] newArray(int i12) {
            return new ActivationAlertBanner[i12];
        }
    }

    public ActivationAlertBanner(@k String str, @k String str2, @k AttributedText attributedText, @l Icon icon, @l List<ButtonAction> list) {
        this.style = str;
        this.title = str2;
        this.description = attributedText;
        this.icon = icon;
        this.actions = list;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    public final List<ButtonAction> getActions() {
        return this.actions;
    }

    @k
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    public final String getStyle() {
        return this.style;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.style);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.description, i12);
        Icon icon = this.icon;
        if (icon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            icon.writeToParcel(parcel, i12);
        }
        List<ButtonAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), i12);
        }
    }
}
