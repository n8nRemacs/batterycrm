package com.avito.android.beduin.common.component.attributed_text_pair;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.component.model.icon.IconBase64;
import com.avito.android.beduin.common.component.model.icon.LocalIcon;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.AttributedTextPairTransform;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;

/* compiled from: BeduinAttributedTextPairModel.kt */
@s0
@Keep
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\n\b\u0087\b\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0005MNOPQBQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b&\u0010'Jj\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b*\u0010\u001aJ\u0010\u0010+\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b2\u0010,J \u00107\u001a\u0002062\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b7\u00108R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b:\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\b>\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\b?\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010#R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010%R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010F\u001a\u0004\bG\u0010'R\u0011\u0010K\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006R"}, d2 = {"Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "Lcom/avito/android/beduin/network/parse/a;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$AttributedTextPairPart;", "leftPart", "rightPart", "", "leftPartWidthPercent", "Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$ConnectingLine;", "connectingLine", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$AttributedTextPairPart;Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$AttributedTextPairPart;Ljava/lang/Integer;Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$ConnectingLine;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$AttributedTextPairPart;", "component4", "component5", "()Ljava/lang/Integer;", "component6", "()Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$ConnectingLine;", "component7", "()Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "component8", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$AttributedTextPairPart;Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$AttributedTextPairPart;Ljava/lang/Integer;Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$ConnectingLine;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;)Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$AttributedTextPairPart;", "getLeftPart", "getRightPart", "Ljava/lang/Integer;", "getLeftPartWidthPercent", "Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$ConnectingLine;", "getConnectingLine", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "getPadding", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "getTheme", "", "getLeftTextWidthProportion", "()F", "leftTextWidthProportion", "Companion", "AttributedTextPairIcon", "AttributedTextPairPart", "a", "ConnectingLine", "LineStyle", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes11.dex */
public final /* data */ class BeduinAttributedTextPairModel extends LeafBeduinModel implements com.avito.android.beduin.network.parse.a {
    private static final float DEFAULT_LEFT_TEXT_WIDTH_PERCENT = 50.0f;

    @l
    private final ConnectingLine connectingLine;

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @k
    private final AttributedTextPairPart leftPart;

    @l
    private final Integer leftPartWidthPercent;

    @l
    private final BeduinContainerIndent padding;

    @k
    private final AttributedTextPairPart rightPart;

    @l
    private final BeduinComponentTheme theme;

    @k
    public static final Parcelable.Creator<BeduinAttributedTextPairModel> CREATOR = new b();

    /* compiled from: BeduinAttributedTextPairModel.kt */
    @Keep
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u000eR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0010¨\u0006+"}, d2 = {"Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$AttributedTextPairIcon;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "localIcon", "Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "base64Icon", "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "<init>", "(Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/common/component/model/icon/IconBase64;Ljava/util/List;)V", "component1", "()Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "component2", "()Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "component3", "()Ljava/util/List;", "copy", "(Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/common/component/model/icon/IconBase64;Ljava/util/List;)Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$AttributedTextPairIcon;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "getLocalIcon", "Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "getBase64Icon", "Ljava/util/List;", "getActions", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class AttributedTextPairIcon implements Parcelable {

        @k
        public static final Parcelable.Creator<AttributedTextPairIcon> CREATOR = new a();

        @l
        private final List<BeduinAction> actions;

        @l
        private final IconBase64 base64Icon;

        @l
        private final LocalIcon localIcon;

        /* compiled from: BeduinAttributedTextPairModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AttributedTextPairIcon> {
            @Override // android.os.Parcelable.Creator
            public final AttributedTextPairIcon createFromParcel(Parcel parcel) {
                ArrayList arrayList = null;
                LocalIcon localIconCreateFromParcel = parcel.readInt() == 0 ? null : LocalIcon.CREATOR.createFromParcel(parcel);
                IconBase64 iconBase64CreateFromParcel = parcel.readInt() == 0 ? null : IconBase64.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(AttributedTextPairIcon.class, parcel, arrayList2, iL2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new AttributedTextPairIcon(localIconCreateFromParcel, iconBase64CreateFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final AttributedTextPairIcon[] newArray(int i12) {
                return new AttributedTextPairIcon[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AttributedTextPairIcon(@l LocalIcon localIcon, @l IconBase64 iconBase64, @l List<? extends BeduinAction> list) {
            this.localIcon = localIcon;
            this.base64Icon = iconBase64;
            this.actions = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AttributedTextPairIcon copy$default(AttributedTextPairIcon attributedTextPairIcon, LocalIcon localIcon, IconBase64 iconBase64, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                localIcon = attributedTextPairIcon.localIcon;
            }
            if ((i12 & 2) != 0) {
                iconBase64 = attributedTextPairIcon.base64Icon;
            }
            if ((i12 & 4) != 0) {
                list = attributedTextPairIcon.actions;
            }
            return attributedTextPairIcon.copy(localIcon, iconBase64, list);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final LocalIcon getLocalIcon() {
            return this.localIcon;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final IconBase64 getBase64Icon() {
            return this.base64Icon;
        }

        @l
        public final List<BeduinAction> component3() {
            return this.actions;
        }

        @k
        public final AttributedTextPairIcon copy(@l LocalIcon localIcon, @l IconBase64 base64Icon, @l List<? extends BeduinAction> actions) {
            return new AttributedTextPairIcon(localIcon, base64Icon, actions);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AttributedTextPairIcon)) {
                return false;
            }
            AttributedTextPairIcon attributedTextPairIcon = (AttributedTextPairIcon) other;
            return L.f(this.localIcon, attributedTextPairIcon.localIcon) && L.f(this.base64Icon, attributedTextPairIcon.base64Icon) && L.f(this.actions, attributedTextPairIcon.actions);
        }

        @l
        public final List<BeduinAction> getActions() {
            return this.actions;
        }

        @l
        public final IconBase64 getBase64Icon() {
            return this.base64Icon;
        }

        @l
        public final LocalIcon getLocalIcon() {
            return this.localIcon;
        }

        public int hashCode() {
            LocalIcon localIcon = this.localIcon;
            int iHashCode = (localIcon == null ? 0 : localIcon.hashCode()) * 31;
            IconBase64 iconBase64 = this.base64Icon;
            int iHashCode2 = (iHashCode + (iconBase64 == null ? 0 : iconBase64.hashCode())) * 31;
            List<BeduinAction> list = this.actions;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("AttributedTextPairIcon(localIcon=");
            sb2.append(this.localIcon);
            sb2.append(", base64Icon=");
            sb2.append(this.base64Icon);
            sb2.append(", actions=");
            return H.p(sb2, this.actions, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            LocalIcon localIcon = this.localIcon;
            if (localIcon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                localIcon.writeToParcel(parcel, flags);
            }
            IconBase64 iconBase64 = this.base64Icon;
            if (iconBase64 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                iconBase64.writeToParcel(parcel, flags);
            }
            List<BeduinAction> list = this.actions;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
    }

    /* compiled from: BeduinAttributedTextPairModel.kt */
    @Keep
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$ConnectingLine;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$LineStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/UniversalColor;", "color", "<init>", "(Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$LineStyle;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$LineStyle;", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "copy", "(Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$LineStyle;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$ConnectingLine;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$LineStyle;", "getStyle", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ConnectingLine implements Parcelable {

        @k
        public static final Parcelable.Creator<ConnectingLine> CREATOR = new a();

        @l
        private final UniversalColor color;

        @l
        private final LineStyle style;

        /* compiled from: BeduinAttributedTextPairModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ConnectingLine> {
            @Override // android.os.Parcelable.Creator
            public final ConnectingLine createFromParcel(Parcel parcel) {
                return new ConnectingLine(parcel.readInt() == 0 ? null : LineStyle.valueOf(parcel.readString()), (UniversalColor) parcel.readParcelable(ConnectingLine.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ConnectingLine[] newArray(int i12) {
                return new ConnectingLine[i12];
            }
        }

        public ConnectingLine(@l LineStyle lineStyle, @l UniversalColor universalColor) {
            this.style = lineStyle;
            this.color = universalColor;
        }

        public static /* synthetic */ ConnectingLine copy$default(ConnectingLine connectingLine, LineStyle lineStyle, UniversalColor universalColor, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                lineStyle = connectingLine.style;
            }
            if ((i12 & 2) != 0) {
                universalColor = connectingLine.color;
            }
            return connectingLine.copy(lineStyle, universalColor);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final LineStyle getStyle() {
            return this.style;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final UniversalColor getColor() {
            return this.color;
        }

        @k
        public final ConnectingLine copy(@l LineStyle style, @l UniversalColor color) {
            return new ConnectingLine(style, color);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConnectingLine)) {
                return false;
            }
            ConnectingLine connectingLine = (ConnectingLine) other;
            return this.style == connectingLine.style && L.f(this.color, connectingLine.color);
        }

        @l
        public final UniversalColor getColor() {
            return this.color;
        }

        @l
        public final LineStyle getStyle() {
            return this.style;
        }

        public int hashCode() {
            LineStyle lineStyle = this.style;
            int iHashCode = (lineStyle == null ? 0 : lineStyle.hashCode()) * 31;
            UniversalColor universalColor = this.color;
            return iHashCode + (universalColor != null ? universalColor.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ConnectingLine(style=");
            sb2.append(this.style);
            sb2.append(", color=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.color, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            LineStyle lineStyle = this.style;
            if (lineStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(lineStyle.name());
            }
            parcel.writeParcelable(this.color, flags);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinAttributedTextPairModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$LineStyle;", "", "(Ljava/lang/String;I)V", "DOTTED", "NONE", "SOLID", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LineStyle {

        @c("dotted")
        public static final LineStyle DOTTED;

        @c("none")
        public static final LineStyle NONE;

        @c("solid")
        public static final LineStyle SOLID;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ LineStyle[] f100663b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f100664c;

        static {
            LineStyle lineStyle = new LineStyle("DOTTED", 0);
            DOTTED = lineStyle;
            LineStyle lineStyle2 = new LineStyle("NONE", 1);
            NONE = lineStyle2;
            LineStyle lineStyle3 = new LineStyle("SOLID", 2);
            SOLID = lineStyle3;
            LineStyle[] lineStyleArr = {lineStyle, lineStyle2, lineStyle3};
            f100663b = lineStyleArr;
            f100664c = kotlin.enums.c.a(lineStyleArr);
        }

        private LineStyle(String str, int i12) {
        }

        public static LineStyle valueOf(String str) {
            return (LineStyle) Enum.valueOf(LineStyle.class, str);
        }

        public static LineStyle[] values() {
            return (LineStyle[]) f100663b.clone();
        }
    }

    /* compiled from: BeduinAttributedTextPairModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinAttributedTextPairModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinAttributedTextPairModel createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinAttributedTextPairModel.class.getClassLoader());
            Parcelable.Creator<AttributedTextPairPart> creator = AttributedTextPairPart.CREATOR;
            return new BeduinAttributedTextPairModel(string, displayingPredicate, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : ConnectingLine.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BeduinComponentTheme.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinAttributedTextPairModel[] newArray(int i12) {
            return new BeduinAttributedTextPairModel[i12];
        }
    }

    public BeduinAttributedTextPairModel(@k String str, @l DisplayingPredicate displayingPredicate, @k AttributedTextPairPart attributedTextPairPart, @k AttributedTextPairPart attributedTextPairPart2, @l Integer num, @l ConnectingLine connectingLine, @l BeduinContainerIndent beduinContainerIndent, @l BeduinComponentTheme beduinComponentTheme) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.leftPart = attributedTextPairPart;
        this.rightPart = attributedTextPairPart2;
        this.leftPartWidthPercent = num;
        this.connectingLine = connectingLine;
        this.padding = beduinContainerIndent;
        this.theme = beduinComponentTheme;
    }

    public static /* synthetic */ BeduinAttributedTextPairModel copy$default(BeduinAttributedTextPairModel beduinAttributedTextPairModel, String str, DisplayingPredicate displayingPredicate, AttributedTextPairPart attributedTextPairPart, AttributedTextPairPart attributedTextPairPart2, Integer num, ConnectingLine connectingLine, BeduinContainerIndent beduinContainerIndent, BeduinComponentTheme beduinComponentTheme, int i12, Object obj) {
        return beduinAttributedTextPairModel.copy((i12 & 1) != 0 ? beduinAttributedTextPairModel.id : str, (i12 & 2) != 0 ? beduinAttributedTextPairModel.displayingPredicate : displayingPredicate, (i12 & 4) != 0 ? beduinAttributedTextPairModel.leftPart : attributedTextPairPart, (i12 & 8) != 0 ? beduinAttributedTextPairModel.rightPart : attributedTextPairPart2, (i12 & 16) != 0 ? beduinAttributedTextPairModel.leftPartWidthPercent : num, (i12 & 32) != 0 ? beduinAttributedTextPairModel.connectingLine : connectingLine, (i12 & 64) != 0 ? beduinAttributedTextPairModel.padding : beduinContainerIndent, (i12 & 128) != 0 ? beduinAttributedTextPairModel.theme : beduinComponentTheme);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        AttributedTextPairPart attributedTextPairPart;
        AttributedTextPairPart attributedTextPairPart2;
        if (transform instanceof DisplayPredicateTransform) {
            return copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, null, null, null, 253, null);
        }
        if (!(transform instanceof AttributedTextPairTransform)) {
            return this;
        }
        AttributedTextPairTransform attributedTextPairTransform = (AttributedTextPairTransform) transform;
        AttributedText leftText = attributedTextPairTransform.getLeftText();
        if (leftText != null) {
            attributedTextPairPart = new AttributedTextPairPart(leftText, null, null, null, null, 30, null);
        } else {
            attributedTextPairPart = this.leftPart;
        }
        AttributedText rightText = attributedTextPairTransform.getRightText();
        if (rightText != null) {
            attributedTextPairPart2 = new AttributedTextPairPart(rightText, null, null, null, null, 30, null);
        } else {
            attributedTextPairPart2 = this.rightPart;
        }
        AttributedTextPairPart attributedTextPairPart3 = attributedTextPairPart2;
        ConnectingLine line = attributedTextPairTransform.getLine();
        if (line == null) {
            line = this.connectingLine;
        }
        return copy$default(this, null, null, attributedTextPairPart, attributedTextPairPart3, null, line, null, null, 211, null);
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

    @k
    /* renamed from: component3, reason: from getter */
    public final AttributedTextPairPart getLeftPart() {
        return this.leftPart;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final AttributedTextPairPart getRightPart() {
        return this.rightPart;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Integer getLeftPartWidthPercent() {
        return this.leftPartWidthPercent;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final ConnectingLine getConnectingLine() {
        return this.connectingLine;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    @k
    public final BeduinAttributedTextPairModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @k AttributedTextPairPart leftPart, @k AttributedTextPairPart rightPart, @l Integer leftPartWidthPercent, @l ConnectingLine connectingLine, @l BeduinContainerIndent padding, @l BeduinComponentTheme theme) {
        return new BeduinAttributedTextPairModel(id2, displayingPredicate, leftPart, rightPart, leftPartWidthPercent, connectingLine, padding, theme);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinAttributedTextPairModel)) {
            return false;
        }
        BeduinAttributedTextPairModel beduinAttributedTextPairModel = (BeduinAttributedTextPairModel) other;
        return L.f(this.id, beduinAttributedTextPairModel.id) && L.f(this.displayingPredicate, beduinAttributedTextPairModel.displayingPredicate) && L.f(this.leftPart, beduinAttributedTextPairModel.leftPart) && L.f(this.rightPart, beduinAttributedTextPairModel.rightPart) && L.f(this.leftPartWidthPercent, beduinAttributedTextPairModel.leftPartWidthPercent) && L.f(this.connectingLine, beduinAttributedTextPairModel.connectingLine) && L.f(this.padding, beduinAttributedTextPairModel.padding) && this.theme == beduinAttributedTextPairModel.theme;
    }

    @l
    public final ConnectingLine getConnectingLine() {
        return this.connectingLine;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF102397d() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId */
    public String getF102944b() {
        return this.id;
    }

    @k
    public final AttributedTextPairPart getLeftPart() {
        return this.leftPart;
    }

    @l
    public final Integer getLeftPartWidthPercent() {
        return this.leftPartWidthPercent;
    }

    public final float getLeftTextWidthProportion() {
        return s.f(this.leftPartWidthPercent != null ? r0.intValue() : DEFAULT_LEFT_TEXT_WIDTH_PERCENT, 0.0f, 100.0f) / 100.0f;
    }

    @l
    public final BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @k
    public final AttributedTextPairPart getRightPart() {
        return this.rightPart;
    }

    @l
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (this.rightPart.hashCode() + ((this.leftPart.hashCode() + ((iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31)) * 31)) * 31;
        Integer num = this.leftPartWidthPercent;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        ConnectingLine connectingLine = this.connectingLine;
        int iHashCode4 = (iHashCode3 + (connectingLine == null ? 0 : connectingLine.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent = this.padding;
        int iHashCode5 = (iHashCode4 + (beduinContainerIndent == null ? 0 : beduinContainerIndent.hashCode())) * 31;
        BeduinComponentTheme beduinComponentTheme = this.theme;
        return iHashCode5 + (beduinComponentTheme != null ? beduinComponentTheme.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BeduinAttributedTextPairModel(id=" + this.id + ", displayingPredicate=" + this.displayingPredicate + ", leftPart=" + this.leftPart + ", rightPart=" + this.rightPart + ", leftPartWidthPercent=" + this.leftPartWidthPercent + ", connectingLine=" + this.connectingLine + ", padding=" + this.padding + ", theme=" + this.theme + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        this.leftPart.writeToParcel(parcel, flags);
        this.rightPart.writeToParcel(parcel, flags);
        Integer num = this.leftPartWidthPercent;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        ConnectingLine connectingLine = this.connectingLine;
        if (connectingLine == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            connectingLine.writeToParcel(parcel, flags);
        }
        BeduinContainerIndent beduinContainerIndent = this.padding;
        if (beduinContainerIndent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent.writeToParcel(parcel, flags);
        }
        BeduinComponentTheme beduinComponentTheme = this.theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: BeduinAttributedTextPairModel.kt */
    @Keep
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JP\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u0014R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u0010\u0016¨\u00063"}, d2 = {"Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$AttributedTextPairPart;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$AttributedTextPairIcon;", "leftIcon", "rightIcon", "", "numberOfLines", "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$AttributedTextPairIcon;Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$AttributedTextPairIcon;Ljava/lang/Integer;Ljava/util/List;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "()Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$AttributedTextPairIcon;", "component3", "component4", "()Ljava/lang/Integer;", "component5", "()Ljava/util/List;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$AttributedTextPairIcon;Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$AttributedTextPairIcon;Ljava/lang/Integer;Ljava/util/List;)Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$AttributedTextPairPart;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getText", "Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$AttributedTextPairIcon;", "getLeftIcon", "getRightIcon", "Ljava/lang/Integer;", "getNumberOfLines", "Ljava/util/List;", "getActions", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class AttributedTextPairPart implements Parcelable {

        @k
        public static final Parcelable.Creator<AttributedTextPairPart> CREATOR = new a();

        @l
        private final List<BeduinAction> actions;

        @l
        private final AttributedTextPairIcon leftIcon;

        @l
        private final Integer numberOfLines;

        @l
        private final AttributedTextPairIcon rightIcon;

        @k
        private final AttributedText text;

        /* compiled from: BeduinAttributedTextPairModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AttributedTextPairPart> {
            @Override // android.os.Parcelable.Creator
            public final AttributedTextPairPart createFromParcel(Parcel parcel) {
                AttributedText attributedText = (AttributedText) parcel.readParcelable(AttributedTextPairPart.class.getClassLoader());
                ArrayList arrayList = null;
                AttributedTextPairIcon attributedTextPairIconCreateFromParcel = parcel.readInt() == 0 ? null : AttributedTextPairIcon.CREATOR.createFromParcel(parcel);
                AttributedTextPairIcon attributedTextPairIconCreateFromParcel2 = parcel.readInt() == 0 ? null : AttributedTextPairIcon.CREATOR.createFromParcel(parcel);
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() != 0) {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(AttributedTextPairPart.class, parcel, arrayList, iL2, 1);
                    }
                }
                return new AttributedTextPairPart(attributedText, attributedTextPairIconCreateFromParcel, attributedTextPairIconCreateFromParcel2, numValueOf, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final AttributedTextPairPart[] newArray(int i12) {
                return new AttributedTextPairPart[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AttributedTextPairPart(@k AttributedText attributedText, @l AttributedTextPairIcon attributedTextPairIcon, @l AttributedTextPairIcon attributedTextPairIcon2, @l Integer num, @l List<? extends BeduinAction> list) {
            this.text = attributedText;
            this.leftIcon = attributedTextPairIcon;
            this.rightIcon = attributedTextPairIcon2;
            this.numberOfLines = num;
            this.actions = list;
        }

        public static /* synthetic */ AttributedTextPairPart copy$default(AttributedTextPairPart attributedTextPairPart, AttributedText attributedText, AttributedTextPairIcon attributedTextPairIcon, AttributedTextPairIcon attributedTextPairIcon2, Integer num, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                attributedText = attributedTextPairPart.text;
            }
            if ((i12 & 2) != 0) {
                attributedTextPairIcon = attributedTextPairPart.leftIcon;
            }
            AttributedTextPairIcon attributedTextPairIcon3 = attributedTextPairIcon;
            if ((i12 & 4) != 0) {
                attributedTextPairIcon2 = attributedTextPairPart.rightIcon;
            }
            AttributedTextPairIcon attributedTextPairIcon4 = attributedTextPairIcon2;
            if ((i12 & 8) != 0) {
                num = attributedTextPairPart.numberOfLines;
            }
            Integer num2 = num;
            if ((i12 & 16) != 0) {
                list = attributedTextPairPart.actions;
            }
            return attributedTextPairPart.copy(attributedText, attributedTextPairIcon3, attributedTextPairIcon4, num2, list);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final AttributedText getText() {
            return this.text;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final AttributedTextPairIcon getLeftIcon() {
            return this.leftIcon;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final AttributedTextPairIcon getRightIcon() {
            return this.rightIcon;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Integer getNumberOfLines() {
            return this.numberOfLines;
        }

        @l
        public final List<BeduinAction> component5() {
            return this.actions;
        }

        @k
        public final AttributedTextPairPart copy(@k AttributedText text, @l AttributedTextPairIcon leftIcon, @l AttributedTextPairIcon rightIcon, @l Integer numberOfLines, @l List<? extends BeduinAction> actions) {
            return new AttributedTextPairPart(text, leftIcon, rightIcon, numberOfLines, actions);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AttributedTextPairPart)) {
                return false;
            }
            AttributedTextPairPart attributedTextPairPart = (AttributedTextPairPart) other;
            return L.f(this.text, attributedTextPairPart.text) && L.f(this.leftIcon, attributedTextPairPart.leftIcon) && L.f(this.rightIcon, attributedTextPairPart.rightIcon) && L.f(this.numberOfLines, attributedTextPairPart.numberOfLines) && L.f(this.actions, attributedTextPairPart.actions);
        }

        @l
        public final List<BeduinAction> getActions() {
            return this.actions;
        }

        @l
        public final AttributedTextPairIcon getLeftIcon() {
            return this.leftIcon;
        }

        @l
        public final Integer getNumberOfLines() {
            return this.numberOfLines;
        }

        @l
        public final AttributedTextPairIcon getRightIcon() {
            return this.rightIcon;
        }

        @k
        public final AttributedText getText() {
            return this.text;
        }

        public int hashCode() {
            int iHashCode = this.text.hashCode() * 31;
            AttributedTextPairIcon attributedTextPairIcon = this.leftIcon;
            int iHashCode2 = (iHashCode + (attributedTextPairIcon == null ? 0 : attributedTextPairIcon.hashCode())) * 31;
            AttributedTextPairIcon attributedTextPairIcon2 = this.rightIcon;
            int iHashCode3 = (iHashCode2 + (attributedTextPairIcon2 == null ? 0 : attributedTextPairIcon2.hashCode())) * 31;
            Integer num = this.numberOfLines;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            List<BeduinAction> list = this.actions;
            return iHashCode4 + (list != null ? list.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("AttributedTextPairPart(text=");
            sb2.append(this.text);
            sb2.append(", leftIcon=");
            sb2.append(this.leftIcon);
            sb2.append(", rightIcon=");
            sb2.append(this.rightIcon);
            sb2.append(", numberOfLines=");
            sb2.append(this.numberOfLines);
            sb2.append(", actions=");
            return H.p(sb2, this.actions, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.text, flags);
            AttributedTextPairIcon attributedTextPairIcon = this.leftIcon;
            if (attributedTextPairIcon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributedTextPairIcon.writeToParcel(parcel, flags);
            }
            AttributedTextPairIcon attributedTextPairIcon2 = this.rightIcon;
            if (attributedTextPairIcon2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributedTextPairIcon2.writeToParcel(parcel, flags);
            }
            Integer num = this.numberOfLines;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            List<BeduinAction> list = this.actions;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }

        public /* synthetic */ AttributedTextPairPart(AttributedText attributedText, AttributedTextPairIcon attributedTextPairIcon, AttributedTextPairIcon attributedTextPairIcon2, Integer num, List list, int i12, C42822w c42822w) {
            this(attributedText, (i12 & 2) != 0 ? null : attributedTextPairIcon, (i12 & 4) != 0 ? null : attributedTextPairIcon2, (i12 & 8) != 0 ? null : num, (i12 & 16) != 0 ? null : list);
        }
    }
}
