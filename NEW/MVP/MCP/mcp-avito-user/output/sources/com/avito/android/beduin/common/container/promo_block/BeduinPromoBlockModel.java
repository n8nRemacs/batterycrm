package com.avito.android.beduin.common.container.promo_block;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.BeduinContainerBackground;
import com.avito.android.beduin.common.container.BeduinContainerModel;
import com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.lib.util.groupable_item.immutable.Edges;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import ei.InterfaceC40107a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinPromoBlockModel.kt */
@d
@Keep
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 Y2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001ZB\u0089\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\r¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001b\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b+\u0010*J\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b.\u0010$J\u0012\u0010/\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b/\u0010$J\u0012\u00100\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b0\u0010$J\u0010\u00101\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b1\u0010\u001eJ\u0012\u00102\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b2\u00103J\u0018\u00104\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b4\u0010-J¨\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b7\u0010$J\u0010\u00109\u001a\u000208HÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020\u00132\b\u0010<\u001a\u0004\u0018\u00010;HÖ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u000208HÖ\u0001¢\u0006\u0004\b?\u0010:J \u0010D\u001a\u00020C2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u000208HÖ\u0001¢\u0006\u0004\bD\u0010ER\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bG\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010H\u001a\u0004\bI\u0010&R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010J\u001a\u0004\bK\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010L\u001a\u0004\bM\u0010*R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010L\u001a\u0004\bN\u0010*R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010O\u001a\u0004\bP\u0010-R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010F\u001a\u0004\bQ\u0010$R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010F\u001a\u0004\bR\u0010$R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010F\u001a\u0004\bS\u0010$R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010T\u001a\u0004\bU\u0010\u001eR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010V\u001a\u0004\bW\u00103R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010O\u001a\u0004\bX\u0010-¨\u0006["}, d2 = {"Lcom/avito/android/beduin/common/container/promo_block/BeduinPromoBlockModel;", "Lcom/avito/android/beduin/common/container/BeduinSingleChildOwnerModel;", "Lcom/avito/android/beduin/common/container/BeduinContainerModel;", "Lei/a;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN, "", "Lcom/avito/android/beduin_models/BeduinModel;", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, BeduinPromoBlockModel.SERIALIZED_NAME_THEME, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "title", "", BeduinPromoBlockModel.SERIALIZED_NAME_CLOSEABLE, "Lcom/avito/android/beduin/common/container/promo_block/RoundEdges;", BeduinPromoBlockModel.SERIALIZED_NAME_ROUND_EDGES, "Lcom/avito/android/beduin_models/BeduinAction;", BeduinPromoBlockModel.SERIALIZED_NAME_ON_CLOSE_ACTIONS, "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/container/BeduinContainerBackground;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/avito/android/beduin/common/container/promo_block/RoundEdges;Ljava/util/List;)V", "create", "(Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;)Lcom/avito/android/beduin_models/BeduinModel;", "needToGroup", "()Z", "Lcom/avito/android/lib/util/groupable_item/immutable/Edges;", "edges", "applyRoundEdges", "(Lcom/avito/android/lib/util/groupable_item/immutable/Edges;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "component4", "()Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "component9", "component10", "component11", "()Lcom/avito/android/beduin/common/container/promo_block/RoundEdges;", "component12", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/container/BeduinContainerBackground;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/avito/android/beduin/common/container/promo_block/RoundEdges;Ljava/util/List;)Lcom/avito/android/beduin/common/container/promo_block/BeduinPromoBlockModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "getBackground", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "getPadding", "getMargin", "Ljava/util/List;", "getChildren", "getTheme", "getStyle", "getTitle", "Z", "getCloseable", "Lcom/avito/android/beduin/common/container/promo_block/RoundEdges;", "getRoundEdges", "getOnCloseActions", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinPromoBlockModel extends BeduinSingleChildOwnerModel implements BeduinContainerModel, InterfaceC40107a {

    @k
    public static final String SERIALIZED_NAME_BACKGROUND = "background";

    @k
    public static final String SERIALIZED_NAME_CHILDREN = "children";

    @k
    public static final String SERIALIZED_NAME_CLOSEABLE = "closeable";

    @k
    public static final String SERIALIZED_NAME_DISPLAYING_PREDICATE = "displayingPredicate";

    @k
    public static final String SERIALIZED_NAME_ID = "id";

    @k
    public static final String SERIALIZED_NAME_MARGIN = "margin";

    @k
    public static final String SERIALIZED_NAME_ON_CLOSE_ACTIONS = "onCloseActions";

    @k
    public static final String SERIALIZED_NAME_PADDING = "padding";

    @k
    public static final String SERIALIZED_NAME_ROUND_EDGES = "roundEdges";

    @k
    public static final String SERIALIZED_NAME_STYLE = "style";

    @k
    public static final String SERIALIZED_NAME_THEME = "theme";

    @k
    public static final String SERIALIZED_NAME_TITLE = "title";

    @c(SERIALIZED_NAME_BACKGROUND)
    @l
    private final BeduinContainerBackground background;

    @c(SERIALIZED_NAME_CHILDREN)
    @l
    private final List<BeduinModel> children;

    @c(SERIALIZED_NAME_CLOSEABLE)
    private final boolean closeable;

    @c(SERIALIZED_NAME_DISPLAYING_PREDICATE)
    @l
    private final DisplayingPredicate displayingPredicate;

    @c("id")
    @k
    private final String id;

    @c(SERIALIZED_NAME_MARGIN)
    @l
    private final BeduinContainerIndent margin;

    @c(SERIALIZED_NAME_ON_CLOSE_ACTIONS)
    @l
    private final List<BeduinAction> onCloseActions;

    @c(SERIALIZED_NAME_PADDING)
    @l
    private final BeduinContainerIndent padding;

    @c(SERIALIZED_NAME_ROUND_EDGES)
    @l
    private final RoundEdges roundEdges;

    @c(SERIALIZED_NAME_STYLE)
    @l
    private final String style;

    @c(SERIALIZED_NAME_THEME)
    @l
    private final String theme;

    @c("title")
    @l
    private final String title;

    @k
    public static final Parcelable.Creator<BeduinPromoBlockModel> CREATOR = new b();

    /* compiled from: BeduinPromoBlockModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinPromoBlockModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinPromoBlockModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinPromoBlockModel.class.getClassLoader());
            BeduinContainerBackground beduinContainerBackgroundCreateFromParcel = parcel.readInt() == 0 ? null : BeduinContainerBackground.CREATOR.createFromParcel(parcel);
            BeduinContainerIndent beduinContainerIndentCreateFromParcel = parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel);
            BeduinContainerIndent beduinContainerIndentCreateFromParcel2 = parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel);
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = a.l(BeduinPromoBlockModel.class, parcel, arrayList, iL3, 1);
                }
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            RoundEdges roundEdgesValueOf = parcel.readInt() == 0 ? null : RoundEdges.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = a.l(BeduinPromoBlockModel.class, parcel, arrayList2, iL2, 1);
                    i13 = i13;
                }
            }
            return new BeduinPromoBlockModel(string, displayingPredicate, beduinContainerBackgroundCreateFromParcel, beduinContainerIndentCreateFromParcel, beduinContainerIndentCreateFromParcel2, arrayList, string2, string3, string4, z12, roundEdgesValueOf, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinPromoBlockModel[] newArray(int i12) {
            return new BeduinPromoBlockModel[i12];
        }
    }

    public /* synthetic */ BeduinPromoBlockModel(String str, DisplayingPredicate displayingPredicate, BeduinContainerBackground beduinContainerBackground, BeduinContainerIndent beduinContainerIndent, BeduinContainerIndent beduinContainerIndent2, List list, String str2, String str3, String str4, boolean z12, RoundEdges roundEdges, List list2, int i12, C42822w c42822w) {
        this(str, displayingPredicate, beduinContainerBackground, beduinContainerIndent, beduinContainerIndent2, list, str2, str3, str4, (i12 & 512) != 0 ? false : z12, roundEdges, list2);
    }

    public static /* synthetic */ BeduinPromoBlockModel copy$default(BeduinPromoBlockModel beduinPromoBlockModel, String str, DisplayingPredicate displayingPredicate, BeduinContainerBackground beduinContainerBackground, BeduinContainerIndent beduinContainerIndent, BeduinContainerIndent beduinContainerIndent2, List list, String str2, String str3, String str4, boolean z12, RoundEdges roundEdges, List list2, int i12, Object obj) {
        return beduinPromoBlockModel.copy((i12 & 1) != 0 ? beduinPromoBlockModel.id : str, (i12 & 2) != 0 ? beduinPromoBlockModel.displayingPredicate : displayingPredicate, (i12 & 4) != 0 ? beduinPromoBlockModel.background : beduinContainerBackground, (i12 & 8) != 0 ? beduinPromoBlockModel.padding : beduinContainerIndent, (i12 & 16) != 0 ? beduinPromoBlockModel.margin : beduinContainerIndent2, (i12 & 32) != 0 ? beduinPromoBlockModel.children : list, (i12 & 64) != 0 ? beduinPromoBlockModel.theme : str2, (i12 & 128) != 0 ? beduinPromoBlockModel.style : str3, (i12 & 256) != 0 ? beduinPromoBlockModel.title : str4, (i12 & 512) != 0 ? beduinPromoBlockModel.closeable : z12, (i12 & 1024) != 0 ? beduinPromoBlockModel.roundEdges : roundEdges, (i12 & 2048) != 0 ? beduinPromoBlockModel.onCloseActions : list2);
    }

    @Override // ei.InterfaceC40107a
    @k
    public BeduinModel applyRoundEdges(@k Edges edges) {
        RoundEdges roundEdges;
        RoundEdges.f103173b.getClass();
        int iOrdinal = edges.ordinal();
        if (iOrdinal == 0) {
            roundEdges = RoundEdges.TOP;
        } else if (iOrdinal == 1) {
            roundEdges = RoundEdges.BOTTOM;
        } else if (iOrdinal == 2) {
            roundEdges = RoundEdges.ALL;
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            roundEdges = RoundEdges.NONE;
        }
        return copy$default(this, null, null, null, null, null, null, null, null, null, false, roundEdges, null, 3071, null);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getCloseable() {
        return this.closeable;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final RoundEdges getRoundEdges() {
        return this.roundEdges;
    }

    @l
    public final List<BeduinAction> component12() {
        return this.onCloseActions;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final BeduinContainerBackground getBackground() {
        return this.background;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final BeduinContainerIndent getMargin() {
        return this.margin;
    }

    @l
    public final List<BeduinModel> component6() {
        return this.children;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    public final BeduinPromoBlockModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @l BeduinContainerBackground background, @l BeduinContainerIndent padding, @l BeduinContainerIndent margin, @l List<? extends BeduinModel> children, @l String theme, @l String style, @l String title, boolean closeable, @l RoundEdges roundEdges, @l List<? extends BeduinAction> onCloseActions) {
        return new BeduinPromoBlockModel(id2, displayingPredicate, background, padding, margin, children, theme, style, title, closeable, roundEdges, onCloseActions);
    }

    @Override // com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel
    @k
    public BeduinModel create(@l List<? extends BeduinModel> children, @l DisplayingPredicate displayingPredicate) {
        return copy$default(this, null, displayingPredicate, null, null, null, children, null, null, null, false, null, null, 4061, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinPromoBlockModel)) {
            return false;
        }
        BeduinPromoBlockModel beduinPromoBlockModel = (BeduinPromoBlockModel) other;
        return L.f(this.id, beduinPromoBlockModel.id) && L.f(this.displayingPredicate, beduinPromoBlockModel.displayingPredicate) && L.f(this.background, beduinPromoBlockModel.background) && L.f(this.padding, beduinPromoBlockModel.padding) && L.f(this.margin, beduinPromoBlockModel.margin) && L.f(this.children, beduinPromoBlockModel.children) && L.f(this.theme, beduinPromoBlockModel.theme) && L.f(this.style, beduinPromoBlockModel.style) && L.f(this.title, beduinPromoBlockModel.title) && this.closeable == beduinPromoBlockModel.closeable && this.roundEdges == beduinPromoBlockModel.roundEdges && L.f(this.onCloseActions, beduinPromoBlockModel.onCloseActions);
    }

    @l
    public BeduinContainerBackground getBackground() {
        return this.background;
    }

    @Override // com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel
    @l
    public List<BeduinModel> getChildren() {
        return this.children;
    }

    public final boolean getCloseable() {
        return this.closeable;
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

    @l
    public BeduinContainerIndent getMargin() {
        return this.margin;
    }

    @l
    public final List<BeduinAction> getOnCloseActions() {
        return this.onCloseActions;
    }

    @l
    public BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @l
    public final RoundEdges getRoundEdges() {
        return this.roundEdges;
    }

    @l
    public final String getStyle() {
        return this.style;
    }

    @l
    public final String getTheme() {
        return this.theme;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        BeduinContainerBackground beduinContainerBackground = this.background;
        int iHashCode3 = (iHashCode2 + (beduinContainerBackground == null ? 0 : beduinContainerBackground.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent = this.padding;
        int iHashCode4 = (iHashCode3 + (beduinContainerIndent == null ? 0 : beduinContainerIndent.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent2 = this.margin;
        int iHashCode5 = (iHashCode4 + (beduinContainerIndent2 == null ? 0 : beduinContainerIndent2.hashCode())) * 31;
        List<BeduinModel> list = this.children;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.theme;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.style;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int i12 = r.i((iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.closeable);
        RoundEdges roundEdges = this.roundEdges;
        int iHashCode9 = (i12 + (roundEdges == null ? 0 : roundEdges.hashCode())) * 31;
        List<BeduinAction> list2 = this.onCloseActions;
        return iHashCode9 + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // ei.InterfaceC40107a
    public boolean needToGroup() {
        return !this.closeable;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinPromoBlockModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", background=");
        sb2.append(this.background);
        sb2.append(", padding=");
        sb2.append(this.padding);
        sb2.append(", margin=");
        sb2.append(this.margin);
        sb2.append(", children=");
        sb2.append(this.children);
        sb2.append(", theme=");
        sb2.append(this.theme);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", closeable=");
        sb2.append(this.closeable);
        sb2.append(", roundEdges=");
        sb2.append(this.roundEdges);
        sb2.append(", onCloseActions=");
        return H.p(sb2, this.onCloseActions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        BeduinContainerBackground beduinContainerBackground = this.background;
        if (beduinContainerBackground == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerBackground.writeToParcel(parcel, flags);
        }
        BeduinContainerIndent beduinContainerIndent = this.padding;
        if (beduinContainerIndent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent.writeToParcel(parcel, flags);
        }
        BeduinContainerIndent beduinContainerIndent2 = this.margin;
        if (beduinContainerIndent2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent2.writeToParcel(parcel, flags);
        }
        List<BeduinModel> list = this.children;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeString(this.theme);
        parcel.writeString(this.style);
        parcel.writeString(this.title);
        parcel.writeInt(this.closeable ? 1 : 0);
        RoundEdges roundEdges = this.roundEdges;
        if (roundEdges == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(roundEdges.name());
        }
        List<BeduinAction> list2 = this.onCloseActions;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            parcel.writeParcelable((Parcelable) itA2.next(), flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinPromoBlockModel(@k String str, @l DisplayingPredicate displayingPredicate, @l BeduinContainerBackground beduinContainerBackground, @l BeduinContainerIndent beduinContainerIndent, @l BeduinContainerIndent beduinContainerIndent2, @l List<? extends BeduinModel> list, @l String str2, @l String str3, @l String str4, boolean z12, @l RoundEdges roundEdges, @l List<? extends BeduinAction> list2) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.background = beduinContainerBackground;
        this.padding = beduinContainerIndent;
        this.margin = beduinContainerIndent2;
        this.children = list;
        this.theme = str2;
        this.style = str3;
        this.title = str4;
        this.closeable = z12;
        this.roundEdges = roundEdges;
        this.onCloseActions = list2;
    }
}
