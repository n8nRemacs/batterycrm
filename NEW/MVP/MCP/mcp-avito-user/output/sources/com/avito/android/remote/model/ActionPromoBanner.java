package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ActionPromoBanner.kt */
@d
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\t\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001ABu\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b%\u0010$R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b,\u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b0\u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b4\u0010/R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b6\u00107R(\u00109\u001a\u0002088\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b9\u0010:\u0012\u0004\b?\u0010@\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006B"}, d2 = {"Lcom/avito/android/remote/model/ActionPromoBanner;", "Lcom/avito/android/remote/model/SerpElement;", "", "id", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "text", "Lcom/avito/android/remote/model/ButtonAction;", "button", "Lcom/avito/android/remote/model/ActionPromoBanner$BackgroundCustomGradient;", "backgroundCustomGradient", "backgroundGradient", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundUniversalColor", "backgroundColor", "Lcom/avito/android/remote/model/UniversalImage;", "backgroundImage", "closeIconColor", "", "closable", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/ButtonAction;Lcom/avito/android/remote/model/ActionPromoBanner$BackgroundCustomGradient;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/Boolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getText", "Lcom/avito/android/remote/model/ButtonAction;", "getButton", "()Lcom/avito/android/remote/model/ButtonAction;", "Lcom/avito/android/remote/model/ActionPromoBanner$BackgroundCustomGradient;", "getBackgroundCustomGradient", "()Lcom/avito/android/remote/model/ActionPromoBanner$BackgroundCustomGradient;", "getBackgroundGradient", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundUniversalColor", "()Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "Lcom/avito/android/remote/model/UniversalImage;", "getBackgroundImage", "()Lcom/avito/android/remote/model/UniversalImage;", "getCloseIconColor", "Ljava/lang/Boolean;", "getClosable", "()Ljava/lang/Boolean;", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "BackgroundCustomGradient", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ActionPromoBanner implements SerpElement {

    @k
    public static final Parcelable.Creator<ActionPromoBanner> CREATOR = new Creator();

    @c("backgroundColor")
    @l
    private final String backgroundColor;

    @c("backgroundCustomGradient")
    @l
    private final BackgroundCustomGradient backgroundCustomGradient;

    @c("backgroundGradient")
    @l
    private final String backgroundGradient;

    @c("backgroundImage")
    @l
    private final UniversalImage backgroundImage;

    @c("backgroundUniversalColor")
    @l
    private final UniversalColor backgroundUniversalColor;

    @c("button")
    @l
    private final ButtonAction button;

    @c("closable")
    @l
    private final Boolean closable;

    @c("closeIconColor")
    @l
    private final UniversalColor closeIconColor;

    @c("id")
    @l
    private final String id;

    @c("attributedText")
    @l
    private final AttributedText text;

    @c("attributedTitle")
    @l
    private final AttributedText title;
    private long uniqueId;

    /* compiled from: ActionPromoBanner.kt */
    @d
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/ActionPromoBanner$BackgroundCustomGradient;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/UniversalColor;", "colors", "<init>", "(Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getColors", "()Ljava/util/List;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BackgroundCustomGradient implements Parcelable {

        @k
        public static final Parcelable.Creator<BackgroundCustomGradient> CREATOR = new Creator();

        @c("colors")
        @l
        private final List<UniversalColor> colors;

        /* compiled from: ActionPromoBanner.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BackgroundCustomGradient> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BackgroundCustomGradient createFromParcel(@k Parcel parcel) {
                ArrayList arrayList;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = a.l(BackgroundCustomGradient.class, parcel, arrayList2, iL2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new BackgroundCustomGradient(arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BackgroundCustomGradient[] newArray(int i12) {
                return new BackgroundCustomGradient[i12];
            }
        }

        public BackgroundCustomGradient(@l List<UniversalColor> list) {
            this.colors = list;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final List<UniversalColor> getColors() {
            return this.colors;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            List<UniversalColor> list = this.colors;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
    }

    /* compiled from: ActionPromoBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ActionPromoBanner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ActionPromoBanner createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(ActionPromoBanner.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(ActionPromoBanner.class.getClassLoader());
            ButtonAction buttonActionCreateFromParcel = parcel.readInt() == 0 ? null : ButtonAction.CREATOR.createFromParcel(parcel);
            BackgroundCustomGradient backgroundCustomGradientCreateFromParcel = parcel.readInt() == 0 ? null : BackgroundCustomGradient.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            UniversalColor universalColor = (UniversalColor) parcel.readParcelable(ActionPromoBanner.class.getClassLoader());
            String string3 = parcel.readString();
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(ActionPromoBanner.class.getClassLoader());
            UniversalColor universalColor2 = (UniversalColor) parcel.readParcelable(ActionPromoBanner.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ActionPromoBanner(string, attributedText, attributedText2, buttonActionCreateFromParcel, backgroundCustomGradientCreateFromParcel, string2, universalColor, string3, universalImage, universalColor2, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ActionPromoBanner[] newArray(int i12) {
            return new ActionPromoBanner[i12];
        }
    }

    public ActionPromoBanner(@l String str, @l AttributedText attributedText, @l AttributedText attributedText2, @l ButtonAction buttonAction, @l BackgroundCustomGradient backgroundCustomGradient, @l String str2, @l UniversalColor universalColor, @l String str3, @l UniversalImage universalImage, @l UniversalColor universalColor2, @l Boolean bool) {
        this.id = str;
        this.title = attributedText;
        this.text = attributedText2;
        this.button = buttonAction;
        this.backgroundCustomGradient = backgroundCustomGradient;
        this.backgroundGradient = str2;
        this.backgroundUniversalColor = universalColor;
        this.backgroundColor = str3;
        this.backgroundImage = universalImage;
        this.closeIconColor = universalColor2;
        this.closable = bool;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    public final BackgroundCustomGradient getBackgroundCustomGradient() {
        return this.backgroundCustomGradient;
    }

    @l
    public final String getBackgroundGradient() {
        return this.backgroundGradient;
    }

    @l
    public final UniversalImage getBackgroundImage() {
        return this.backgroundImage;
    }

    @l
    public final UniversalColor getBackgroundUniversalColor() {
        return this.backgroundUniversalColor;
    }

    @l
    public final ButtonAction getButton() {
        return this.button;
    }

    @l
    public final Boolean getClosable() {
        return this.closable;
    }

    @l
    public final UniversalColor getCloseIconColor() {
        return this.closeIconColor;
    }

    @l
    public final String getId() {
        return this.id;
    }

    @l
    public final AttributedText getText() {
        return this.text;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.SerpElement
    /* renamed from: getUniqueId, reason: from getter */
    public long getF231756b() {
        return this.uniqueId;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public void setUniqueId(long j12) {
        this.uniqueId = j12;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.text, flags);
        ButtonAction buttonAction = this.button;
        if (buttonAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonAction.writeToParcel(parcel, flags);
        }
        BackgroundCustomGradient backgroundCustomGradient = this.backgroundCustomGradient;
        if (backgroundCustomGradient == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            backgroundCustomGradient.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.backgroundGradient);
        parcel.writeParcelable(this.backgroundUniversalColor, flags);
        parcel.writeString(this.backgroundColor);
        parcel.writeParcelable(this.backgroundImage, flags);
        parcel.writeParcelable(this.closeIconColor, flags);
        Boolean bool = this.closable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public static /* synthetic */ void getUniqueId$annotations() {
    }
}
