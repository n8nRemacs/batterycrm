package com.avito.android.beduin.common.component.snippet_list_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.model.icon.IconBase64;
import com.avito.android.beduin.common.component.model.icon.IconPosition;
import com.avito.android.beduin.common.component.model.icon.LocalIcon;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinSnippetListItemModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0002@AB]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0015Jv\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0015J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\u000f2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020%HÖ\u0001¢\u0006\u0004\b,\u0010'J \u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020%HÖ\u0001¢\u0006\u0004\b1\u00102R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\u0017R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010\u0019R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b9\u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010\u001cR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\b=\u0010\u001eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\b\u0010\u0010 R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b?\u0010\u0015¨\u0006B"}, d2 = {"Lcom/avito/android/beduin/common/component/snippet_list_item/BeduinSnippetListItemModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "Lcom/avito/android/beduin/common/component/snippet_list_item/BeduinSnippetListItemModel$AttributedTextMaxLines;", "descriptions", "Lcom/avito/android/remote/model/Image;", "image", "Lcom/avito/android/beduin/common/component/snippet_list_item/BeduinSnippetListItemModel$FavoriteIcon;", "favoriteIcon", "", "isFavorite", "context", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/Image;Lcom/avito/android/beduin/common/component/snippet_list_item/BeduinSnippetListItemModel$FavoriteIcon;ZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Ljava/util/List;", "component4", "component5", "()Lcom/avito/android/remote/model/Image;", "component6", "()Lcom/avito/android/beduin/common/component/snippet_list_item/BeduinSnippetListItemModel$FavoriteIcon;", "component7", "()Z", "component8", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/Image;Lcom/avito/android/beduin/common/component/snippet_list_item/BeduinSnippetListItemModel$FavoriteIcon;ZLjava/lang/String;)Lcom/avito/android/beduin/common/component/snippet_list_item/BeduinSnippetListItemModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Ljava/util/List;", "getActions", "getDescriptions", "Lcom/avito/android/remote/model/Image;", "getImage", "Lcom/avito/android/beduin/common/component/snippet_list_item/BeduinSnippetListItemModel$FavoriteIcon;", "getFavoriteIcon", "Z", "getContext", "AttributedTextMaxLines", "FavoriteIcon", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinSnippetListItemModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinSnippetListItemModel> CREATOR = new a();

    @l
    private final List<BeduinAction> actions;

    @l
    private final String context;

    @k
    private final List<AttributedTextMaxLines> descriptions;

    @l
    private final DisplayingPredicate displayingPredicate;

    @l
    private final FavoriteIcon favoriteIcon;

    @k
    private final String id;

    @l
    private final Image image;
    private final boolean isFavorite;

    /* compiled from: BeduinSnippetListItemModel.kt */
    @Keep
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JH\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010\u0017J \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u0017¨\u00064"}, d2 = {"Lcom/avito/android/beduin/common/component/snippet_list_item/BeduinSnippetListItemModel$AttributedTextMaxLines;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedText", "Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "base64Icon", "Lcom/avito/android/beduin/common/component/model/icon/IconPosition;", "iconPosition", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "localIcon", "", "maxLines", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/beduin/common/component/model/icon/IconBase64;Lcom/avito/android/beduin/common/component/model/icon/IconPosition;Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;I)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "()Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "component3", "()Lcom/avito/android/beduin/common/component/model/icon/IconPosition;", "component4", "()Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "component5", "()I", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/beduin/common/component/model/icon/IconBase64;Lcom/avito/android/beduin/common/component/model/icon/IconPosition;Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;I)Lcom/avito/android/beduin/common/component/snippet_list_item/BeduinSnippetListItemModel$AttributedTextMaxLines;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttributedText", "Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "getBase64Icon", "Lcom/avito/android/beduin/common/component/model/icon/IconPosition;", "getIconPosition", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "getLocalIcon", "I", "getMaxLines", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class AttributedTextMaxLines implements Parcelable {

        @k
        public static final Parcelable.Creator<AttributedTextMaxLines> CREATOR = new a();

        @k
        private final AttributedText attributedText;

        @l
        private final IconBase64 base64Icon;

        @l
        private final IconPosition iconPosition;

        @l
        private final LocalIcon localIcon;
        private final int maxLines;

        /* compiled from: BeduinSnippetListItemModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AttributedTextMaxLines> {
            @Override // android.os.Parcelable.Creator
            public final AttributedTextMaxLines createFromParcel(Parcel parcel) {
                return new AttributedTextMaxLines((AttributedText) parcel.readParcelable(AttributedTextMaxLines.class.getClassLoader()), parcel.readInt() == 0 ? null : IconBase64.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : IconPosition.valueOf(parcel.readString()), parcel.readInt() != 0 ? LocalIcon.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final AttributedTextMaxLines[] newArray(int i12) {
                return new AttributedTextMaxLines[i12];
            }
        }

        public AttributedTextMaxLines(@k AttributedText attributedText, @l IconBase64 iconBase64, @l IconPosition iconPosition, @l LocalIcon localIcon, int i12) {
            this.attributedText = attributedText;
            this.base64Icon = iconBase64;
            this.iconPosition = iconPosition;
            this.localIcon = localIcon;
            this.maxLines = i12;
        }

        public static /* synthetic */ AttributedTextMaxLines copy$default(AttributedTextMaxLines attributedTextMaxLines, AttributedText attributedText, IconBase64 iconBase64, IconPosition iconPosition, LocalIcon localIcon, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                attributedText = attributedTextMaxLines.attributedText;
            }
            if ((i13 & 2) != 0) {
                iconBase64 = attributedTextMaxLines.base64Icon;
            }
            IconBase64 iconBase642 = iconBase64;
            if ((i13 & 4) != 0) {
                iconPosition = attributedTextMaxLines.iconPosition;
            }
            IconPosition iconPosition2 = iconPosition;
            if ((i13 & 8) != 0) {
                localIcon = attributedTextMaxLines.localIcon;
            }
            LocalIcon localIcon2 = localIcon;
            if ((i13 & 16) != 0) {
                i12 = attributedTextMaxLines.maxLines;
            }
            return attributedTextMaxLines.copy(attributedText, iconBase642, iconPosition2, localIcon2, i12);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final AttributedText getAttributedText() {
            return this.attributedText;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final IconBase64 getBase64Icon() {
            return this.base64Icon;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final IconPosition getIconPosition() {
            return this.iconPosition;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final LocalIcon getLocalIcon() {
            return this.localIcon;
        }

        /* renamed from: component5, reason: from getter */
        public final int getMaxLines() {
            return this.maxLines;
        }

        @k
        public final AttributedTextMaxLines copy(@k AttributedText attributedText, @l IconBase64 base64Icon, @l IconPosition iconPosition, @l LocalIcon localIcon, int maxLines) {
            return new AttributedTextMaxLines(attributedText, base64Icon, iconPosition, localIcon, maxLines);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AttributedTextMaxLines)) {
                return false;
            }
            AttributedTextMaxLines attributedTextMaxLines = (AttributedTextMaxLines) other;
            return L.f(this.attributedText, attributedTextMaxLines.attributedText) && L.f(this.base64Icon, attributedTextMaxLines.base64Icon) && this.iconPosition == attributedTextMaxLines.iconPosition && L.f(this.localIcon, attributedTextMaxLines.localIcon) && this.maxLines == attributedTextMaxLines.maxLines;
        }

        @k
        public final AttributedText getAttributedText() {
            return this.attributedText;
        }

        @l
        public final IconBase64 getBase64Icon() {
            return this.base64Icon;
        }

        @l
        public final IconPosition getIconPosition() {
            return this.iconPosition;
        }

        @l
        public final LocalIcon getLocalIcon() {
            return this.localIcon;
        }

        public final int getMaxLines() {
            return this.maxLines;
        }

        public int hashCode() {
            int iHashCode = this.attributedText.hashCode() * 31;
            IconBase64 iconBase64 = this.base64Icon;
            int iHashCode2 = (iHashCode + (iconBase64 == null ? 0 : iconBase64.hashCode())) * 31;
            IconPosition iconPosition = this.iconPosition;
            int iHashCode3 = (iHashCode2 + (iconPosition == null ? 0 : iconPosition.hashCode())) * 31;
            LocalIcon localIcon = this.localIcon;
            return Integer.hashCode(this.maxLines) + ((iHashCode3 + (localIcon != null ? localIcon.hashCode() : 0)) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("AttributedTextMaxLines(attributedText=");
            sb2.append(this.attributedText);
            sb2.append(", base64Icon=");
            sb2.append(this.base64Icon);
            sb2.append(", iconPosition=");
            sb2.append(this.iconPosition);
            sb2.append(", localIcon=");
            sb2.append(this.localIcon);
            sb2.append(", maxLines=");
            return r.t(sb2, this.maxLines, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.attributedText, flags);
            IconBase64 iconBase64 = this.base64Icon;
            if (iconBase64 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                iconBase64.writeToParcel(parcel, flags);
            }
            IconPosition iconPosition = this.iconPosition;
            if (iconPosition == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(iconPosition.name());
            }
            LocalIcon localIcon = this.localIcon;
            if (localIcon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                localIcon.writeToParcel(parcel, flags);
            }
            parcel.writeInt(this.maxLines);
        }
    }

    /* compiled from: BeduinSnippetListItemModel.kt */
    @Keep
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b)\u0010\u000e¨\u0006*"}, d2 = {"Lcom/avito/android/beduin/common/component/snippet_list_item/BeduinSnippetListItemModel$FavoriteIcon;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "activeLocalIcon", "inactiveLocalIcon", "Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "activeBase64Icon", "inactiveBase64Icon", "<init>", "(Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/common/component/model/icon/IconBase64;Lcom/avito/android/beduin/common/component/model/icon/IconBase64;)V", "component1", "()Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "component2", "component3", "()Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "component4", "copy", "(Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/common/component/model/icon/IconBase64;Lcom/avito/android/beduin/common/component/model/icon/IconBase64;)Lcom/avito/android/beduin/common/component/snippet_list_item/BeduinSnippetListItemModel$FavoriteIcon;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "getActiveLocalIcon", "getInactiveLocalIcon", "Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "getActiveBase64Icon", "getInactiveBase64Icon", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class FavoriteIcon implements Parcelable {

        @k
        public static final Parcelable.Creator<FavoriteIcon> CREATOR = new a();

        @l
        private final IconBase64 activeBase64Icon;

        @l
        private final LocalIcon activeLocalIcon;

        @l
        private final IconBase64 inactiveBase64Icon;

        @l
        private final LocalIcon inactiveLocalIcon;

        /* compiled from: BeduinSnippetListItemModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FavoriteIcon> {
            @Override // android.os.Parcelable.Creator
            public final FavoriteIcon createFromParcel(Parcel parcel) {
                return new FavoriteIcon(parcel.readInt() == 0 ? null : LocalIcon.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LocalIcon.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : IconBase64.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? IconBase64.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final FavoriteIcon[] newArray(int i12) {
                return new FavoriteIcon[i12];
            }
        }

        public FavoriteIcon(@l LocalIcon localIcon, @l LocalIcon localIcon2, @l IconBase64 iconBase64, @l IconBase64 iconBase642) {
            this.activeLocalIcon = localIcon;
            this.inactiveLocalIcon = localIcon2;
            this.activeBase64Icon = iconBase64;
            this.inactiveBase64Icon = iconBase642;
        }

        public static /* synthetic */ FavoriteIcon copy$default(FavoriteIcon favoriteIcon, LocalIcon localIcon, LocalIcon localIcon2, IconBase64 iconBase64, IconBase64 iconBase642, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                localIcon = favoriteIcon.activeLocalIcon;
            }
            if ((i12 & 2) != 0) {
                localIcon2 = favoriteIcon.inactiveLocalIcon;
            }
            if ((i12 & 4) != 0) {
                iconBase64 = favoriteIcon.activeBase64Icon;
            }
            if ((i12 & 8) != 0) {
                iconBase642 = favoriteIcon.inactiveBase64Icon;
            }
            return favoriteIcon.copy(localIcon, localIcon2, iconBase64, iconBase642);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final LocalIcon getActiveLocalIcon() {
            return this.activeLocalIcon;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final LocalIcon getInactiveLocalIcon() {
            return this.inactiveLocalIcon;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final IconBase64 getActiveBase64Icon() {
            return this.activeBase64Icon;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final IconBase64 getInactiveBase64Icon() {
            return this.inactiveBase64Icon;
        }

        @k
        public final FavoriteIcon copy(@l LocalIcon activeLocalIcon, @l LocalIcon inactiveLocalIcon, @l IconBase64 activeBase64Icon, @l IconBase64 inactiveBase64Icon) {
            return new FavoriteIcon(activeLocalIcon, inactiveLocalIcon, activeBase64Icon, inactiveBase64Icon);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FavoriteIcon)) {
                return false;
            }
            FavoriteIcon favoriteIcon = (FavoriteIcon) other;
            return L.f(this.activeLocalIcon, favoriteIcon.activeLocalIcon) && L.f(this.inactiveLocalIcon, favoriteIcon.inactiveLocalIcon) && L.f(this.activeBase64Icon, favoriteIcon.activeBase64Icon) && L.f(this.inactiveBase64Icon, favoriteIcon.inactiveBase64Icon);
        }

        @l
        public final IconBase64 getActiveBase64Icon() {
            return this.activeBase64Icon;
        }

        @l
        public final LocalIcon getActiveLocalIcon() {
            return this.activeLocalIcon;
        }

        @l
        public final IconBase64 getInactiveBase64Icon() {
            return this.inactiveBase64Icon;
        }

        @l
        public final LocalIcon getInactiveLocalIcon() {
            return this.inactiveLocalIcon;
        }

        public int hashCode() {
            LocalIcon localIcon = this.activeLocalIcon;
            int iHashCode = (localIcon == null ? 0 : localIcon.hashCode()) * 31;
            LocalIcon localIcon2 = this.inactiveLocalIcon;
            int iHashCode2 = (iHashCode + (localIcon2 == null ? 0 : localIcon2.hashCode())) * 31;
            IconBase64 iconBase64 = this.activeBase64Icon;
            int iHashCode3 = (iHashCode2 + (iconBase64 == null ? 0 : iconBase64.hashCode())) * 31;
            IconBase64 iconBase642 = this.inactiveBase64Icon;
            return iHashCode3 + (iconBase642 != null ? iconBase642.hashCode() : 0);
        }

        @k
        public String toString() {
            return "FavoriteIcon(activeLocalIcon=" + this.activeLocalIcon + ", inactiveLocalIcon=" + this.inactiveLocalIcon + ", activeBase64Icon=" + this.activeBase64Icon + ", inactiveBase64Icon=" + this.inactiveBase64Icon + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            LocalIcon localIcon = this.activeLocalIcon;
            if (localIcon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                localIcon.writeToParcel(parcel, flags);
            }
            LocalIcon localIcon2 = this.inactiveLocalIcon;
            if (localIcon2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                localIcon2.writeToParcel(parcel, flags);
            }
            IconBase64 iconBase64 = this.activeBase64Icon;
            if (iconBase64 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                iconBase64.writeToParcel(parcel, flags);
            }
            IconBase64 iconBase642 = this.inactiveBase64Icon;
            if (iconBase642 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                iconBase642.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: BeduinSnippetListItemModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinSnippetListItemModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinSnippetListItemModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinSnippetListItemModel.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinSnippetListItemModel.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            int i13 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i13);
            int iC2 = 0;
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(AttributedTextMaxLines.CREATOR, parcel, arrayList3, iC2, 1);
            }
            return new BeduinSnippetListItemModel(string, displayingPredicate, arrayList, arrayList3, (Image) parcel.readParcelable(BeduinSnippetListItemModel.class.getClassLoader()), parcel.readInt() != 0 ? FavoriteIcon.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinSnippetListItemModel[] newArray(int i12) {
            return new BeduinSnippetListItemModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinSnippetListItemModel(@k String str, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinAction> list, @k List<AttributedTextMaxLines> list2, @l Image image, @l FavoriteIcon favoriteIcon, boolean z12, @l String str2) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.actions = list;
        this.descriptions = list2;
        this.image = image;
        this.favoriteIcon = favoriteIcon;
        this.isFavorite = z12;
        this.context = str2;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @l
    public final List<BeduinAction> component3() {
        return this.actions;
    }

    @k
    public final List<AttributedTextMaxLines> component4() {
        return this.descriptions;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final FavoriteIcon getFavoriteIcon() {
        return this.favoriteIcon;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    @k
    public final BeduinSnippetListItemModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinAction> actions, @k List<AttributedTextMaxLines> descriptions, @l Image image, @l FavoriteIcon favoriteIcon, boolean isFavorite, @l String context) {
        return new BeduinSnippetListItemModel(id2, displayingPredicate, actions, descriptions, image, favoriteIcon, isFavorite, context);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinSnippetListItemModel)) {
            return false;
        }
        BeduinSnippetListItemModel beduinSnippetListItemModel = (BeduinSnippetListItemModel) other;
        return L.f(this.id, beduinSnippetListItemModel.id) && L.f(this.displayingPredicate, beduinSnippetListItemModel.displayingPredicate) && L.f(this.actions, beduinSnippetListItemModel.actions) && L.f(this.descriptions, beduinSnippetListItemModel.descriptions) && L.f(this.image, beduinSnippetListItemModel.image) && L.f(this.favoriteIcon, beduinSnippetListItemModel.favoriteIcon) && this.isFavorite == beduinSnippetListItemModel.isFavorite && L.f(this.context, beduinSnippetListItemModel.context);
    }

    @l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @l
    public final String getContext() {
        return this.context;
    }

    @k
    public final List<AttributedTextMaxLines> getDescriptions() {
        return this.descriptions;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF100854c() {
        return this.displayingPredicate;
    }

    @l
    public final FavoriteIcon getFavoriteIcon() {
        return this.favoriteIcon;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId */
    public String getF100853b() {
        return this.id;
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        List<BeduinAction> list = this.actions;
        int iE2 = H.e((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.descriptions);
        Image image = this.image;
        int iHashCode3 = (iE2 + (image == null ? 0 : image.hashCode())) * 31;
        FavoriteIcon favoriteIcon = this.favoriteIcon;
        int i12 = r.i((iHashCode3 + (favoriteIcon == null ? 0 : favoriteIcon.hashCode())) * 31, 31, this.isFavorite);
        String str = this.context;
        return i12 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinSnippetListItemModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", actions=");
        sb2.append(this.actions);
        sb2.append(", descriptions=");
        sb2.append(this.descriptions);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", favoriteIcon=");
        sb2.append(this.favoriteIcon);
        sb2.append(", isFavorite=");
        sb2.append(this.isFavorite);
        sb2.append(", context=");
        return C22026a.c(sb2, this.context, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        List<BeduinAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        Iterator itJ = C0.j(this.descriptions, parcel);
        while (itJ.hasNext()) {
            ((AttributedTextMaxLines) itJ.next()).writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.image, flags);
        FavoriteIcon favoriteIcon = this.favoriteIcon;
        if (favoriteIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            favoriteIcon.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.isFavorite ? 1 : 0);
        parcel.writeString(this.context);
    }
}
