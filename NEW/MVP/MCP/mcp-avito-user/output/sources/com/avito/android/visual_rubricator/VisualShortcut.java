package com.avito.android.visual_rubricator;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ShortcutsWidget.kt */
@K51.d
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/avito/android/visual_rubricator/VisualShortcut;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/remote/model/UniversalImage;", "image", "layout", "backgroundColor", "textColor", "titleWithTransfer", "", "isAllCategoriesItem", "", "rowLine", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "d", "c", "e", "getTitleWithTransfer", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getRowLine", "()Ljava/lang/Integer;", "_avito_bx-content_widget_visual-rubricator_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VisualShortcut implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<VisualShortcut> CREATOR = new a();

    @com.google.gson.annotations.c("backgroundColor")
    @Y61.l
    private final String backgroundColor;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @Y61.k
    private final DeepLink deepLink;

    @com.google.gson.annotations.c("image")
    @Y61.l
    private final UniversalImage image;

    @com.google.gson.annotations.c("isAllCategoriesItem")
    @Y61.l
    private final Boolean isAllCategoriesItem;

    @com.google.gson.annotations.c("layout")
    @Y61.k
    private final String layout;

    @com.google.gson.annotations.c("rowLine")
    @Y61.l
    private final Integer rowLine;

    @com.google.gson.annotations.c("textColor")
    @Y61.l
    private final String textColor;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("titleWithTransfer")
    @Y61.l
    private final String titleWithTransfer;

    /* compiled from: ShortcutsWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VisualShortcut> {
        @Override // android.os.Parcelable.Creator
        public final VisualShortcut createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(VisualShortcut.class.getClassLoader());
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(VisualShortcut.class.getClassLoader());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VisualShortcut(string, deepLink, universalImage, string2, string3, string4, string5, boolValueOf, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final VisualShortcut[] newArray(int i12) {
            return new VisualShortcut[i12];
        }
    }

    public VisualShortcut(@Y61.k String str, @Y61.k DeepLink deepLink, @Y61.l UniversalImage universalImage, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l Boolean bool, @Y61.l Integer num) {
        this.title = str;
        this.deepLink = deepLink;
        this.image = universalImage;
        this.layout = str2;
        this.backgroundColor = str3;
        this.textColor = str4;
        this.titleWithTransfer = str5;
        this.isAllCategoriesItem = bool;
        this.rowLine = num;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getLayout() {
        return this.layout;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final Boolean getIsAllCategoriesItem() {
        return this.isAllCategoriesItem;
    }

    @Y61.k
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @Y61.l
    public final UniversalImage getImage() {
        return this.image;
    }

    @Y61.l
    public final Integer getRowLine() {
        return this.rowLine;
    }

    @Y61.k
    public final String getTitle() {
        return this.title;
    }

    @Y61.l
    public final String getTitleWithTransfer() {
        return this.titleWithTransfer;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.deepLink, i12);
        parcel.writeParcelable(this.image, i12);
        parcel.writeString(this.layout);
        parcel.writeString(this.backgroundColor);
        parcel.writeString(this.textColor);
        parcel.writeString(this.titleWithTransfer);
        Boolean bool = this.isAllCategoriesItem;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Integer num = this.rowLine;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }

    public /* synthetic */ VisualShortcut(String str, DeepLink deepLink, UniversalImage universalImage, String str2, String str3, String str4, String str5, Boolean bool, Integer num, int i12, C42822w c42822w) {
        this(str, deepLink, universalImage, str2, str3, (i12 & 32) != 0 ? null : str4, str5, bool, (i12 & 256) != 0 ? null : num);
    }
}
