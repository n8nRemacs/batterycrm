package com.avito.android.category.element;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.category.CategoryItemLink;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CategoryWidgetElement.kt */
@K51.d
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/avito/android/category/element/CategoryWidgetElement;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/category/CategoryItemLink;", "titleAction", "", "shouldHideTitle", "isAutoHeight", "Lcom/avito/android/category/element/ActionedImage;", "actionedImage", "", "Lcom/avito/android/category/element/CategoryItemAction;", "actions", "Lcom/avito/android/category/element/ItemDisplayParams;", "displayParams", "<init>", "(Ljava/lang/String;Lcom/avito/android/category/CategoryItemLink;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/category/element/ActionedImage;Ljava/util/List;Lcom/avito/android/category/element/ItemDisplayParams;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/category/CategoryItemLink;", "f", "()Lcom/avito/android/category/CategoryItemLink;", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "g", "Lcom/avito/android/category/element/ActionedImage;", "c", "()Lcom/avito/android/category/element/ActionedImage;", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "Lcom/avito/android/category/element/ItemDisplayParams;", "d", "()Lcom/avito/android/category/element/ItemDisplayParams;", "_avito_bx-content_widget_category_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CategoryWidgetElement implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CategoryWidgetElement> CREATOR = new a();

    @com.google.gson.annotations.c("actionedImage")
    @Y61.l
    private final ActionedImage actionedImage;

    @com.google.gson.annotations.c("actions")
    @Y61.l
    private final List<CategoryItemAction> actions;

    @com.google.gson.annotations.c("displayParams")
    @Y61.l
    private final ItemDisplayParams displayParams;

    @com.google.gson.annotations.c("isAutoHeight")
    @Y61.l
    private final Boolean isAutoHeight;

    @com.google.gson.annotations.c("hideTitle")
    @Y61.l
    private final Boolean shouldHideTitle;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    @com.google.gson.annotations.c("titleAction")
    @Y61.l
    private final CategoryItemLink titleAction;

    /* compiled from: CategoryWidgetElement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CategoryWidgetElement> {
        @Override // android.os.Parcelable.Creator
        public final CategoryWidgetElement createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            ArrayList arrayList;
            String string = parcel.readString();
            CategoryItemLink categoryItemLinkCreateFromParcel = parcel.readInt() == 0 ? null : CategoryItemLink.CREATOR.createFromParcel(parcel);
            int iC2 = 0;
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
            ActionedImage actionedImageCreateFromParcel = parcel.readInt() == 0 ? null : ActionedImage.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(CategoryItemAction.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new CategoryWidgetElement(string, categoryItemLinkCreateFromParcel, boolValueOf, boolValueOf2, actionedImageCreateFromParcel, arrayList, parcel.readInt() != 0 ? ItemDisplayParams.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CategoryWidgetElement[] newArray(int i12) {
            return new CategoryWidgetElement[i12];
        }
    }

    public CategoryWidgetElement(@Y61.l String str, @Y61.l CategoryItemLink categoryItemLink, @Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.l ActionedImage actionedImage, @Y61.l List<CategoryItemAction> list, @Y61.l ItemDisplayParams itemDisplayParams) {
        this.title = str;
        this.titleAction = categoryItemLink;
        this.shouldHideTitle = bool;
        this.isAutoHeight = bool2;
        this.actionedImage = actionedImage;
        this.actions = list;
        this.displayParams = itemDisplayParams;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final ActionedImage getActionedImage() {
        return this.actionedImage;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final ItemDisplayParams getDisplayParams() {
        return this.displayParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final Boolean getShouldHideTitle() {
        return this.shouldHideTitle;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final CategoryItemLink getTitleAction() {
        return this.titleAction;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final Boolean getIsAutoHeight() {
        return this.isAutoHeight;
    }

    @Y61.l
    public final List<CategoryItemAction> getActions() {
        return this.actions;
    }

    @Y61.l
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        CategoryItemLink categoryItemLink = this.titleAction;
        if (categoryItemLink == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            categoryItemLink.writeToParcel(parcel, i12);
        }
        Boolean bool = this.shouldHideTitle;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.isAutoHeight;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        ActionedImage actionedImage = this.actionedImage;
        if (actionedImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionedImage.writeToParcel(parcel, i12);
        }
        List<CategoryItemAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((CategoryItemAction) itA.next()).writeToParcel(parcel, i12);
            }
        }
        ItemDisplayParams itemDisplayParams = this.displayParams;
        if (itemDisplayParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            itemDisplayParams.writeToParcel(parcel, i12);
        }
    }
}
