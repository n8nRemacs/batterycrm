package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19824b;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MyAdvertSafeDeal.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\b¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/MyAdvertSafeDeal;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service;", "services", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/avito/android/remote/model/MyAdvertSafeDeal;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getServices", "Service", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class MyAdvertSafeDeal implements Parcelable {

    @k
    public static final Parcelable.Creator<MyAdvertSafeDeal> CREATOR = new Creator();

    @c("services")
    @k
    private final List<Service> services;

    /* compiled from: MyAdvertSafeDeal.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MyAdvertSafeDeal> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MyAdvertSafeDeal createFromParcel(@k Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(Service.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new MyAdvertSafeDeal(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MyAdvertSafeDeal[] newArray(int i12) {
            return new MyAdvertSafeDeal[i12];
        }
    }

    /* compiled from: MyAdvertSafeDeal.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0003$%&B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Type;", "type", "Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content;", "content", "<init>", "(Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Type;Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content;)V", "component1", "()Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Type;", "component2", "()Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content;", "copy", "(Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Type;Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content;)Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Type;", "getType", "Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content;", "getContent", "Content", "TextWithLinkContent", "Type", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Service implements Parcelable {

        @k
        public static final Parcelable.Creator<Service> CREATOR = new Creator();

        @c("content")
        @k
        private final Content content;

        @c("type")
        @l
        private final Type type;

        /* compiled from: MyAdvertSafeDeal.kt */
        @InterfaceC19824b
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content;", "Landroid/os/Parcelable;", "()V", "ClickableListItem", "Icon", "Link", "ListItem", "Switcher", "Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$ClickableListItem;", "Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$ListItem;", "Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$Switcher;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class Content implements Parcelable {

            /* compiled from: MyAdvertSafeDeal.kt */
            @d
            @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014JR\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b0\u0010\u0014¨\u00061"}, d2 = {"Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$ClickableListItem;", "Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content;", "", "id", "title", "subtitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "onClickDeepLink", "Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$Icon;", "leftIcon", "rightIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$Icon;Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$Icon;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component5", "()Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$Icon;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$Icon;Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$Icon;)Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$ClickableListItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "getSubtitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getOnClickDeepLink", "Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$Icon;", "getLeftIcon", "getRightIcon", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class ClickableListItem extends Content {

                @k
                public static final Parcelable.Creator<ClickableListItem> CREATOR = new Creator();

                @c("id")
                @l
                private final String id;

                @c("leftIcon")
                @l
                private final Icon leftIcon;

                @c("onTap")
                @k
                private final DeepLink onClickDeepLink;

                @c("rightIcon")
                @l
                private final Icon rightIcon;

                @c("subtitle")
                @k
                private final String subtitle;

                @c("title")
                @k
                private final String title;

                /* compiled from: MyAdvertSafeDeal.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<ClickableListItem> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ClickableListItem createFromParcel(@k Parcel parcel) {
                        return new ClickableListItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ClickableListItem.class.getClassLoader()), parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Icon.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ClickableListItem[] newArray(int i12) {
                        return new ClickableListItem[i12];
                    }
                }

                public ClickableListItem(@l String str, @k String str2, @k String str3, @k DeepLink deepLink, @l Icon icon, @l Icon icon2) {
                    super(null);
                    this.id = str;
                    this.title = str2;
                    this.subtitle = str3;
                    this.onClickDeepLink = deepLink;
                    this.leftIcon = icon;
                    this.rightIcon = icon2;
                }

                public static /* synthetic */ ClickableListItem copy$default(ClickableListItem clickableListItem, String str, String str2, String str3, DeepLink deepLink, Icon icon, Icon icon2, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = clickableListItem.id;
                    }
                    if ((i12 & 2) != 0) {
                        str2 = clickableListItem.title;
                    }
                    String str4 = str2;
                    if ((i12 & 4) != 0) {
                        str3 = clickableListItem.subtitle;
                    }
                    String str5 = str3;
                    if ((i12 & 8) != 0) {
                        deepLink = clickableListItem.onClickDeepLink;
                    }
                    DeepLink deepLink2 = deepLink;
                    if ((i12 & 16) != 0) {
                        icon = clickableListItem.leftIcon;
                    }
                    Icon icon3 = icon;
                    if ((i12 & 32) != 0) {
                        icon2 = clickableListItem.rightIcon;
                    }
                    return clickableListItem.copy(str, str4, str5, deepLink2, icon3, icon2);
                }

                @l
                /* renamed from: component1, reason: from getter */
                public final String getId() {
                    return this.id;
                }

                @k
                /* renamed from: component2, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                @k
                /* renamed from: component3, reason: from getter */
                public final String getSubtitle() {
                    return this.subtitle;
                }

                @k
                /* renamed from: component4, reason: from getter */
                public final DeepLink getOnClickDeepLink() {
                    return this.onClickDeepLink;
                }

                @l
                /* renamed from: component5, reason: from getter */
                public final Icon getLeftIcon() {
                    return this.leftIcon;
                }

                @l
                /* renamed from: component6, reason: from getter */
                public final Icon getRightIcon() {
                    return this.rightIcon;
                }

                @k
                public final ClickableListItem copy(@l String id2, @k String title, @k String subtitle, @k DeepLink onClickDeepLink, @l Icon leftIcon, @l Icon rightIcon) {
                    return new ClickableListItem(id2, title, subtitle, onClickDeepLink, leftIcon, rightIcon);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ClickableListItem)) {
                        return false;
                    }
                    ClickableListItem clickableListItem = (ClickableListItem) other;
                    return L.f(this.id, clickableListItem.id) && L.f(this.title, clickableListItem.title) && L.f(this.subtitle, clickableListItem.subtitle) && L.f(this.onClickDeepLink, clickableListItem.onClickDeepLink) && L.f(this.leftIcon, clickableListItem.leftIcon) && L.f(this.rightIcon, clickableListItem.rightIcon);
                }

                @l
                public final String getId() {
                    return this.id;
                }

                @l
                public final Icon getLeftIcon() {
                    return this.leftIcon;
                }

                @k
                public final DeepLink getOnClickDeepLink() {
                    return this.onClickDeepLink;
                }

                @l
                public final Icon getRightIcon() {
                    return this.rightIcon;
                }

                @k
                public final String getSubtitle() {
                    return this.subtitle;
                }

                @k
                public final String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    String str = this.id;
                    int iE2 = a.e(this.onClickDeepLink, H.d(H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.title), 31, this.subtitle), 31);
                    Icon icon = this.leftIcon;
                    int iHashCode = (iE2 + (icon == null ? 0 : icon.hashCode())) * 31;
                    Icon icon2 = this.rightIcon;
                    return iHashCode + (icon2 != null ? icon2.hashCode() : 0);
                }

                @k
                public String toString() {
                    return "ClickableListItem(id=" + this.id + ", title=" + this.title + ", subtitle=" + this.subtitle + ", onClickDeepLink=" + this.onClickDeepLink + ", leftIcon=" + this.leftIcon + ", rightIcon=" + this.rightIcon + ')';
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.id);
                    parcel.writeString(this.title);
                    parcel.writeString(this.subtitle);
                    parcel.writeParcelable(this.onClickDeepLink, flags);
                    Icon icon = this.leftIcon;
                    if (icon == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        icon.writeToParcel(parcel, flags);
                    }
                    Icon icon2 = this.rightIcon;
                    if (icon2 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        icon2.writeToParcel(parcel, flags);
                    }
                }
            }

            /* compiled from: MyAdvertSafeDeal.kt */
            @d
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$Icon;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/PromoBlockIconType;", "iconType", "<init>", "(Lcom/avito/android/remote/model/PromoBlockIconType;)V", "component1", "()Lcom/avito/android/remote/model/PromoBlockIconType;", "copy", "(Lcom/avito/android/remote/model/PromoBlockIconType;)Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$Icon;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/PromoBlockIconType;", "getIconType", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Icon implements Parcelable {

                @k
                public static final Parcelable.Creator<Icon> CREATOR = new Creator();

                @c("name")
                @l
                private final PromoBlockIconType iconType;

                /* compiled from: MyAdvertSafeDeal.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Icon> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Icon createFromParcel(@k Parcel parcel) {
                        return new Icon(parcel.readInt() == 0 ? null : PromoBlockIconType.valueOf(parcel.readString()));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Icon[] newArray(int i12) {
                        return new Icon[i12];
                    }
                }

                public Icon(@l PromoBlockIconType promoBlockIconType) {
                    this.iconType = promoBlockIconType;
                }

                public static /* synthetic */ Icon copy$default(Icon icon, PromoBlockIconType promoBlockIconType, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        promoBlockIconType = icon.iconType;
                    }
                    return icon.copy(promoBlockIconType);
                }

                @l
                /* renamed from: component1, reason: from getter */
                public final PromoBlockIconType getIconType() {
                    return this.iconType;
                }

                @k
                public final Icon copy(@l PromoBlockIconType iconType) {
                    return new Icon(iconType);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Icon) && this.iconType == ((Icon) other).iconType;
                }

                @l
                public final PromoBlockIconType getIconType() {
                    return this.iconType;
                }

                public int hashCode() {
                    PromoBlockIconType promoBlockIconType = this.iconType;
                    if (promoBlockIconType == null) {
                        return 0;
                    }
                    return promoBlockIconType.hashCode();
                }

                @k
                public String toString() {
                    return "Icon(iconType=" + this.iconType + ')';
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    PromoBlockIconType promoBlockIconType = this.iconType;
                    if (promoBlockIconType == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        parcel.writeString(promoBlockIconType.name());
                    }
                }
            }

            /* compiled from: MyAdvertSafeDeal.kt */
            @d
            @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$Link;", "Landroid/os/Parcelable;", "", "text", "Landroid/net/Uri;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Landroid/net/Uri;)V", "component1", "()Ljava/lang/String;", "component2", "()Landroid/net/Uri;", "copy", "(Ljava/lang/String;Landroid/net/Uri;)Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$Link;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Landroid/net/Uri;", "getUri", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Link implements Parcelable {

                @k
                public static final Parcelable.Creator<Link> CREATOR = new Creator();

                @c("text")
                @k
                private final String text;

                @c(ContextActionHandler.Link.URL)
                @k
                private final Uri uri;

                /* compiled from: MyAdvertSafeDeal.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Link> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Link createFromParcel(@k Parcel parcel) {
                        return new Link(parcel.readString(), (Uri) parcel.readParcelable(Link.class.getClassLoader()));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Link[] newArray(int i12) {
                        return new Link[i12];
                    }
                }

                public Link(@k String str, @k Uri uri) {
                    this.text = str;
                    this.uri = uri;
                }

                public static /* synthetic */ Link copy$default(Link link, String str, Uri uri, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = link.text;
                    }
                    if ((i12 & 2) != 0) {
                        uri = link.uri;
                    }
                    return link.copy(str, uri);
                }

                @k
                /* renamed from: component1, reason: from getter */
                public final String getText() {
                    return this.text;
                }

                @k
                /* renamed from: component2, reason: from getter */
                public final Uri getUri() {
                    return this.uri;
                }

                @k
                public final Link copy(@k String text, @k Uri uri) {
                    return new Link(text, uri);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Link)) {
                        return false;
                    }
                    Link link = (Link) other;
                    return L.f(this.text, link.text) && L.f(this.uri, link.uri);
                }

                @k
                public final String getText() {
                    return this.text;
                }

                @k
                public final Uri getUri() {
                    return this.uri;
                }

                public int hashCode() {
                    return this.uri.hashCode() + (this.text.hashCode() * 31);
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Link(text=");
                    sb2.append(this.text);
                    sb2.append(", uri=");
                    return a.t(sb2, this.uri, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.text);
                    parcel.writeParcelable(this.uri, flags);
                }
            }

            /* compiled from: MyAdvertSafeDeal.kt */
            @d
            @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J<\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b'\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0012¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$ListItem;", "Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content;", "Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$TextWithLinkContent;", "", "id", "title", "Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$Link;", "link", "Lcom/avito/android/remote/model/PromoBlockIconType;", "iconType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$Link;Lcom/avito/android/remote/model/PromoBlockIconType;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$Link;", "component4", "()Lcom/avito/android/remote/model/PromoBlockIconType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$Link;Lcom/avito/android/remote/model/PromoBlockIconType;)Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$ListItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$Link;", "getLink", "Lcom/avito/android/remote/model/PromoBlockIconType;", "getIconType", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class ListItem extends Content implements TextWithLinkContent {

                @k
                public static final Parcelable.Creator<ListItem> CREATOR = new Creator();

                @c("icon")
                @l
                private final PromoBlockIconType iconType;

                @c("id")
                @l
                private final String id;

                @c("link")
                @k
                private final Link link;

                @c("title")
                @k
                private final String title;

                /* compiled from: MyAdvertSafeDeal.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<ListItem> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ListItem createFromParcel(@k Parcel parcel) {
                        return new ListItem(parcel.readString(), parcel.readString(), Link.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PromoBlockIconType.valueOf(parcel.readString()));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ListItem[] newArray(int i12) {
                        return new ListItem[i12];
                    }
                }

                public ListItem(@l String str, @k String str2, @k Link link, @l PromoBlockIconType promoBlockIconType) {
                    super(null);
                    this.id = str;
                    this.title = str2;
                    this.link = link;
                    this.iconType = promoBlockIconType;
                }

                public static /* synthetic */ ListItem copy$default(ListItem listItem, String str, String str2, Link link, PromoBlockIconType promoBlockIconType, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = listItem.id;
                    }
                    if ((i12 & 2) != 0) {
                        str2 = listItem.title;
                    }
                    if ((i12 & 4) != 0) {
                        link = listItem.link;
                    }
                    if ((i12 & 8) != 0) {
                        promoBlockIconType = listItem.iconType;
                    }
                    return listItem.copy(str, str2, link, promoBlockIconType);
                }

                @l
                /* renamed from: component1, reason: from getter */
                public final String getId() {
                    return this.id;
                }

                @k
                /* renamed from: component2, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                @k
                /* renamed from: component3, reason: from getter */
                public final Link getLink() {
                    return this.link;
                }

                @l
                /* renamed from: component4, reason: from getter */
                public final PromoBlockIconType getIconType() {
                    return this.iconType;
                }

                @k
                public final ListItem copy(@l String id2, @k String title, @k Link link, @l PromoBlockIconType iconType) {
                    return new ListItem(id2, title, link, iconType);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ListItem)) {
                        return false;
                    }
                    ListItem listItem = (ListItem) other;
                    return L.f(this.id, listItem.id) && L.f(this.title, listItem.title) && L.f(this.link, listItem.link) && this.iconType == listItem.iconType;
                }

                @l
                public final PromoBlockIconType getIconType() {
                    return this.iconType;
                }

                @l
                public final String getId() {
                    return this.id;
                }

                @Override // com.avito.android.remote.model.MyAdvertSafeDeal.Service.TextWithLinkContent
                @k
                public Link getLink() {
                    return this.link;
                }

                @Override // com.avito.android.remote.model.MyAdvertSafeDeal.Service.TextWithLinkContent
                @k
                public String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    String str = this.id;
                    int iHashCode = (this.link.hashCode() + H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.title)) * 31;
                    PromoBlockIconType promoBlockIconType = this.iconType;
                    return iHashCode + (promoBlockIconType != null ? promoBlockIconType.hashCode() : 0);
                }

                @k
                public String toString() {
                    return "ListItem(id=" + this.id + ", title=" + this.title + ", link=" + this.link + ", iconType=" + this.iconType + ')';
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.id);
                    parcel.writeString(this.title);
                    this.link.writeToParcel(parcel, flags);
                    PromoBlockIconType promoBlockIconType = this.iconType;
                    if (promoBlockIconType == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        parcel.writeString(promoBlockIconType.name());
                    }
                }
            }

            /* compiled from: MyAdvertSafeDeal.kt */
            @d
            @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017JT\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b,\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u0015R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u00101\u001a\u0004\b\u000b\u0010\u0017\"\u0004\b2\u00103R$\u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u00101\u001a\u0004\b4\u0010\u0017\"\u0004\b5\u00103¨\u00066"}, d2 = {"Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$Switcher;", "Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content;", "Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$TextWithLinkContent;", "", "id", "title", "Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$Link;", "link", "Lcom/avito/android/remote/model/PromoBlockIconType;", "iconType", "", "isSwitchOn", "shouldReloadInstallments", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$Link;Lcom/avito/android/remote/model/PromoBlockIconType;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$Link;", "component4", "()Lcom/avito/android/remote/model/PromoBlockIconType;", "component5", "()Ljava/lang/Boolean;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$Link;Lcom/avito/android/remote/model/PromoBlockIconType;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$Switcher;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$Link;", "getLink", "Lcom/avito/android/remote/model/PromoBlockIconType;", "getIconType", "Ljava/lang/Boolean;", "setSwitchOn", "(Ljava/lang/Boolean;)V", "getShouldReloadInstallments", "setShouldReloadInstallments", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Switcher extends Content implements TextWithLinkContent {

                @k
                public static final Parcelable.Creator<Switcher> CREATOR = new Creator();

                @c("icon")
                @l
                private final PromoBlockIconType iconType;

                @c("id")
                @l
                private final String id;

                @c("isSwitchOn")
                @l
                private Boolean isSwitchOn;

                @c("link")
                @k
                private final Link link;

                @c("shouldReloadInstallments")
                @l
                private Boolean shouldReloadInstallments;

                @c("title")
                @k
                private final String title;

                /* compiled from: MyAdvertSafeDeal.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Switcher> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Switcher createFromParcel(@k Parcel parcel) {
                        Boolean boolValueOf;
                        Boolean boolValueOf2;
                        String string = parcel.readString();
                        String string2 = parcel.readString();
                        Link linkCreateFromParcel = Link.CREATOR.createFromParcel(parcel);
                        PromoBlockIconType promoBlockIconTypeValueOf = parcel.readInt() == 0 ? null : PromoBlockIconType.valueOf(parcel.readString());
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
                        return new Switcher(string, string2, linkCreateFromParcel, promoBlockIconTypeValueOf, boolValueOf, boolValueOf2);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Switcher[] newArray(int i12) {
                        return new Switcher[i12];
                    }
                }

                public Switcher(@l String str, @k String str2, @k Link link, @l PromoBlockIconType promoBlockIconType, @l Boolean bool, @l Boolean bool2) {
                    super(null);
                    this.id = str;
                    this.title = str2;
                    this.link = link;
                    this.iconType = promoBlockIconType;
                    this.isSwitchOn = bool;
                    this.shouldReloadInstallments = bool2;
                }

                public static /* synthetic */ Switcher copy$default(Switcher switcher, String str, String str2, Link link, PromoBlockIconType promoBlockIconType, Boolean bool, Boolean bool2, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = switcher.id;
                    }
                    if ((i12 & 2) != 0) {
                        str2 = switcher.title;
                    }
                    String str3 = str2;
                    if ((i12 & 4) != 0) {
                        link = switcher.link;
                    }
                    Link link2 = link;
                    if ((i12 & 8) != 0) {
                        promoBlockIconType = switcher.iconType;
                    }
                    PromoBlockIconType promoBlockIconType2 = promoBlockIconType;
                    if ((i12 & 16) != 0) {
                        bool = switcher.isSwitchOn;
                    }
                    Boolean bool3 = bool;
                    if ((i12 & 32) != 0) {
                        bool2 = switcher.shouldReloadInstallments;
                    }
                    return switcher.copy(str, str3, link2, promoBlockIconType2, bool3, bool2);
                }

                @l
                /* renamed from: component1, reason: from getter */
                public final String getId() {
                    return this.id;
                }

                @k
                /* renamed from: component2, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                @k
                /* renamed from: component3, reason: from getter */
                public final Link getLink() {
                    return this.link;
                }

                @l
                /* renamed from: component4, reason: from getter */
                public final PromoBlockIconType getIconType() {
                    return this.iconType;
                }

                @l
                /* renamed from: component5, reason: from getter */
                public final Boolean getIsSwitchOn() {
                    return this.isSwitchOn;
                }

                @l
                /* renamed from: component6, reason: from getter */
                public final Boolean getShouldReloadInstallments() {
                    return this.shouldReloadInstallments;
                }

                @k
                public final Switcher copy(@l String id2, @k String title, @k Link link, @l PromoBlockIconType iconType, @l Boolean isSwitchOn, @l Boolean shouldReloadInstallments) {
                    return new Switcher(id2, title, link, iconType, isSwitchOn, shouldReloadInstallments);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Switcher)) {
                        return false;
                    }
                    Switcher switcher = (Switcher) other;
                    return L.f(this.id, switcher.id) && L.f(this.title, switcher.title) && L.f(this.link, switcher.link) && this.iconType == switcher.iconType && L.f(this.isSwitchOn, switcher.isSwitchOn) && L.f(this.shouldReloadInstallments, switcher.shouldReloadInstallments);
                }

                @l
                public final PromoBlockIconType getIconType() {
                    return this.iconType;
                }

                @l
                public final String getId() {
                    return this.id;
                }

                @Override // com.avito.android.remote.model.MyAdvertSafeDeal.Service.TextWithLinkContent
                @k
                public Link getLink() {
                    return this.link;
                }

                @l
                public final Boolean getShouldReloadInstallments() {
                    return this.shouldReloadInstallments;
                }

                @Override // com.avito.android.remote.model.MyAdvertSafeDeal.Service.TextWithLinkContent
                @k
                public String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    String str = this.id;
                    int iHashCode = (this.link.hashCode() + H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.title)) * 31;
                    PromoBlockIconType promoBlockIconType = this.iconType;
                    int iHashCode2 = (iHashCode + (promoBlockIconType == null ? 0 : promoBlockIconType.hashCode())) * 31;
                    Boolean bool = this.isSwitchOn;
                    int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                    Boolean bool2 = this.shouldReloadInstallments;
                    return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
                }

                @l
                public final Boolean isSwitchOn() {
                    return this.isSwitchOn;
                }

                public final void setShouldReloadInstallments(@l Boolean bool) {
                    this.shouldReloadInstallments = bool;
                }

                public final void setSwitchOn(@l Boolean bool) {
                    this.isSwitchOn = bool;
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Switcher(id=");
                    sb2.append(this.id);
                    sb2.append(", title=");
                    sb2.append(this.title);
                    sb2.append(", link=");
                    sb2.append(this.link);
                    sb2.append(", iconType=");
                    sb2.append(this.iconType);
                    sb2.append(", isSwitchOn=");
                    sb2.append(this.isSwitchOn);
                    sb2.append(", shouldReloadInstallments=");
                    return C0.g(sb2, this.shouldReloadInstallments, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.id);
                    parcel.writeString(this.title);
                    this.link.writeToParcel(parcel, flags);
                    PromoBlockIconType promoBlockIconType = this.iconType;
                    if (promoBlockIconType == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        parcel.writeString(promoBlockIconType.name());
                    }
                    Boolean bool = this.isSwitchOn;
                    if (bool == null) {
                        parcel.writeInt(0);
                    } else {
                        C0.l(parcel, 1, bool);
                    }
                    Boolean bool2 = this.shouldReloadInstallments;
                    if (bool2 == null) {
                        parcel.writeInt(0);
                    } else {
                        C0.l(parcel, 1, bool2);
                    }
                }
            }

            public /* synthetic */ Content(C42822w c42822w) {
                this();
            }

            private Content() {
            }
        }

        /* compiled from: MyAdvertSafeDeal.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Service> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Service createFromParcel(@k Parcel parcel) {
                return new Service(parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString()), (Content) parcel.readParcelable(Service.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Service[] newArray(int i12) {
                return new Service[i12];
            }
        }

        /* compiled from: MyAdvertSafeDeal.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$TextWithLinkContent;", "", "link", "Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$Link;", "getLink", "()Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$Link;", "title", "", "getTitle", "()Ljava/lang/String;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface TextWithLinkContent {
            @k
            Content.Link getLink();

            @k
            String getTitle();
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MyAdvertSafeDeal.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Type;", "", "(Ljava/lang/String;I)V", "LIST_ITEM", "SWITCHER", "TAPABLE_LIST_ITEM", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {
            private static final /* synthetic */ kotlin.enums.a $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;

            @c("listItem")
            public static final Type LIST_ITEM = new Type("LIST_ITEM", 0);

            @c("switcher")
            public static final Type SWITCHER = new Type("SWITCHER", 1);

            @c("tapableListItem")
            public static final Type TAPABLE_LIST_ITEM = new Type("TAPABLE_LIST_ITEM", 2);

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{LIST_ITEM, SWITCHER, TAPABLE_LIST_ITEM};
            }

            static {
                Type[] typeArr$values = $values();
                $VALUES = typeArr$values;
                $ENTRIES = kotlin.enums.c.a(typeArr$values);
            }

            private Type(String str, int i12) {
            }

            @k
            public static kotlin.enums.a<Type> getEntries() {
                return $ENTRIES;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public Service(@l Type type, @k Content content) {
            this.type = type;
            this.content = content;
        }

        public static /* synthetic */ Service copy$default(Service service, Type type, Content content, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                type = service.type;
            }
            if ((i12 & 2) != 0) {
                content = service.content;
            }
            return service.copy(type, content);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final Content getContent() {
            return this.content;
        }

        @k
        public final Service copy(@l Type type, @k Content content) {
            return new Service(type, content);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Service)) {
                return false;
            }
            Service service = (Service) other;
            return this.type == service.type && L.f(this.content, service.content);
        }

        @k
        public final Content getContent() {
            return this.content;
        }

        @l
        public final Type getType() {
            return this.type;
        }

        public int hashCode() {
            Type type = this.type;
            return this.content.hashCode() + ((type == null ? 0 : type.hashCode()) * 31);
        }

        @k
        public String toString() {
            return "Service(type=" + this.type + ", content=" + this.content + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Type type = this.type;
            if (type == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(type.name());
            }
            parcel.writeParcelable(this.content, flags);
        }
    }

    public MyAdvertSafeDeal(@k List<Service> list) {
        this.services = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MyAdvertSafeDeal copy$default(MyAdvertSafeDeal myAdvertSafeDeal, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = myAdvertSafeDeal.services;
        }
        return myAdvertSafeDeal.copy(list);
    }

    @k
    public final List<Service> component1() {
        return this.services;
    }

    @k
    public final MyAdvertSafeDeal copy(@k List<Service> services) {
        return new MyAdvertSafeDeal(services);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MyAdvertSafeDeal) && L.f(this.services, ((MyAdvertSafeDeal) other).services);
    }

    @k
    public final List<Service> getServices() {
        return this.services;
    }

    public int hashCode() {
        return this.services.hashCode();
    }

    @k
    public String toString() {
        return H.p(new StringBuilder("MyAdvertSafeDeal(services="), this.services, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.services, parcel);
        while (itJ.hasNext()) {
            ((Service) itJ.next()).writeToParcel(parcel, flags);
        }
    }
}
