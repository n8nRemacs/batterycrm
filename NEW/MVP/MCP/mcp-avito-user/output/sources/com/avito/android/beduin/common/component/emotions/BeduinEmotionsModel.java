package com.avito.android.beduin.common.component.emotions;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.model.icon.LocalIcon;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.container.spread.Alignment;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.IsEnabledTransform;
import com.avito.android.beduin.common.form.transforms.SelectedIdTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinEmotionsModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0001GBk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0084\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001bJ\u0010\u0010,\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b2\u0010-J \u00107\u001a\u0002062\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b7\u00108R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b\u0007\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b>\u0010\u001bR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010\"R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\bA\u0010\"R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bC\u0010%R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\bE\u0010'R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010D\u001a\u0004\bF\u0010'¨\u0006H"}, d2 = {"Lcom/avito/android/beduin/common/component/emotions/BeduinEmotionsModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "isEnabled", "selectedId", "", "Lcom/avito/android/beduin/common/component/emotions/BeduinEmotionsModel$Option;", "options", "Lcom/avito/android/beduin_models/BeduinAction;", "onChangeSelectedActions", "Lcom/avito/android/beduin/common/container/spread/Alignment;", "alignment", "", "size", "interItemSpacing", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin/common/container/spread/Alignment;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "()Lcom/avito/android/beduin/common/container/spread/Alignment;", "component8", "()Ljava/lang/Integer;", "component9", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin/common/container/spread/Alignment;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/avito/android/beduin/common/component/emotions/BeduinEmotionsModel;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Ljava/lang/Boolean;", "getSelectedId", "Ljava/util/List;", "getOptions", "getOnChangeSelectedActions", "Lcom/avito/android/beduin/common/container/spread/Alignment;", "getAlignment", "Ljava/lang/Integer;", "getSize", "getInterItemSpacing", "Option", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinEmotionsModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinEmotionsModel> CREATOR = new a();

    @l
    private final Alignment alignment;

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @l
    private final Integer interItemSpacing;

    @l
    private final Boolean isEnabled;

    @l
    private final List<BeduinAction> onChangeSelectedActions;

    @k
    private final List<Option> options;

    @l
    private final String selectedId;

    @l
    private final Integer size;

    /* compiled from: BeduinEmotionsModel.kt */
    @Keep
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/beduin/common/component/emotions/BeduinEmotionsModel$Option;", "Landroid/os/Parcelable;", "", "id", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "selectedIcon", "deselectedIcon", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "component3", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;)Lcom/avito/android/beduin/common/component/emotions/BeduinEmotionsModel$Option;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "getSelectedIcon", "getDeselectedIcon", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Option implements Parcelable {

        @k
        public static final Parcelable.Creator<Option> CREATOR = new a();

        @k
        private final LocalIcon deselectedIcon;

        @k
        private final String id;

        @k
        private final LocalIcon selectedIcon;

        /* compiled from: BeduinEmotionsModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Option> {
            @Override // android.os.Parcelable.Creator
            public final Option createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                Parcelable.Creator<LocalIcon> creator = LocalIcon.CREATOR;
                return new Option(string, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Option[] newArray(int i12) {
                return new Option[i12];
            }
        }

        public Option(@k String str, @k LocalIcon localIcon, @k LocalIcon localIcon2) {
            this.id = str;
            this.selectedIcon = localIcon;
            this.deselectedIcon = localIcon2;
        }

        public static /* synthetic */ Option copy$default(Option option, String str, LocalIcon localIcon, LocalIcon localIcon2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = option.id;
            }
            if ((i12 & 2) != 0) {
                localIcon = option.selectedIcon;
            }
            if ((i12 & 4) != 0) {
                localIcon2 = option.deselectedIcon;
            }
            return option.copy(str, localIcon, localIcon2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final LocalIcon getSelectedIcon() {
            return this.selectedIcon;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final LocalIcon getDeselectedIcon() {
            return this.deselectedIcon;
        }

        @k
        public final Option copy(@k String id2, @k LocalIcon selectedIcon, @k LocalIcon deselectedIcon) {
            return new Option(id2, selectedIcon, deselectedIcon);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Option)) {
                return false;
            }
            Option option = (Option) other;
            return L.f(this.id, option.id) && L.f(this.selectedIcon, option.selectedIcon) && L.f(this.deselectedIcon, option.deselectedIcon);
        }

        @k
        public final LocalIcon getDeselectedIcon() {
            return this.deselectedIcon;
        }

        @k
        public final String getId() {
            return this.id;
        }

        @k
        public final LocalIcon getSelectedIcon() {
            return this.selectedIcon;
        }

        public int hashCode() {
            return this.deselectedIcon.hashCode() + ((this.selectedIcon.hashCode() + (this.id.hashCode() * 31)) * 31);
        }

        @k
        public String toString() {
            return "Option(id=" + this.id + ", selectedIcon=" + this.selectedIcon + ", deselectedIcon=" + this.deselectedIcon + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            this.selectedIcon.writeToParcel(parcel, flags);
            this.deselectedIcon.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: BeduinEmotionsModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinEmotionsModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinEmotionsModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinEmotionsModel.class.getClassLoader());
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Option.CREATOR, parcel, arrayList2, iC2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinEmotionsModel.class, parcel, arrayList, iL2, 1);
                }
            }
            return new BeduinEmotionsModel(string, displayingPredicate, boolValueOf, string2, arrayList2, arrayList, parcel.readInt() == 0 ? null : Alignment.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinEmotionsModel[] newArray(int i12) {
            return new BeduinEmotionsModel[i12];
        }
    }

    public /* synthetic */ BeduinEmotionsModel(String str, DisplayingPredicate displayingPredicate, Boolean bool, String str2, List list, List list2, Alignment alignment, Integer num, Integer num2, int i12, C42822w c42822w) {
        this(str, displayingPredicate, bool, str2, list, list2, (i12 & 64) != 0 ? Alignment.SPREAD : alignment, num, num2);
    }

    public static /* synthetic */ BeduinEmotionsModel copy$default(BeduinEmotionsModel beduinEmotionsModel, String str, DisplayingPredicate displayingPredicate, Boolean bool, String str2, List list, List list2, Alignment alignment, Integer num, Integer num2, int i12, Object obj) {
        return beduinEmotionsModel.copy((i12 & 1) != 0 ? beduinEmotionsModel.id : str, (i12 & 2) != 0 ? beduinEmotionsModel.displayingPredicate : displayingPredicate, (i12 & 4) != 0 ? beduinEmotionsModel.isEnabled : bool, (i12 & 8) != 0 ? beduinEmotionsModel.selectedId : str2, (i12 & 16) != 0 ? beduinEmotionsModel.options : list, (i12 & 32) != 0 ? beduinEmotionsModel.onChangeSelectedActions : list2, (i12 & 64) != 0 ? beduinEmotionsModel.alignment : alignment, (i12 & 128) != 0 ? beduinEmotionsModel.size : num, (i12 & 256) != 0 ? beduinEmotionsModel.interItemSpacing : num2);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof SelectedIdTransform ? copy$default(this, null, null, null, ((SelectedIdTransform) transform).getSelectedId(), null, null, null, null, null, 503, null) : transform instanceof IsEnabledTransform ? copy$default(this, null, null, Boolean.valueOf(((IsEnabledTransform) transform).isEnabled()), null, null, null, null, null, null, 507, null) : transform instanceof DisplayPredicateTransform ? copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, null, null, null, null, 509, null) : this;
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
    /* renamed from: component3, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getSelectedId() {
        return this.selectedId;
    }

    @k
    public final List<Option> component5() {
        return this.options;
    }

    @l
    public final List<BeduinAction> component6() {
        return this.onChangeSelectedActions;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Alignment getAlignment() {
        return this.alignment;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Integer getSize() {
        return this.size;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final Integer getInterItemSpacing() {
        return this.interItemSpacing;
    }

    @k
    public final BeduinEmotionsModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @l Boolean isEnabled, @l String selectedId, @k List<Option> options, @l List<? extends BeduinAction> onChangeSelectedActions, @l Alignment alignment, @l Integer size, @l Integer interItemSpacing) {
        return new BeduinEmotionsModel(id2, displayingPredicate, isEnabled, selectedId, options, onChangeSelectedActions, alignment, size, interItemSpacing);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinEmotionsModel)) {
            return false;
        }
        BeduinEmotionsModel beduinEmotionsModel = (BeduinEmotionsModel) other;
        return L.f(this.id, beduinEmotionsModel.id) && L.f(this.displayingPredicate, beduinEmotionsModel.displayingPredicate) && L.f(this.isEnabled, beduinEmotionsModel.isEnabled) && L.f(this.selectedId, beduinEmotionsModel.selectedId) && L.f(this.options, beduinEmotionsModel.options) && L.f(this.onChangeSelectedActions, beduinEmotionsModel.onChangeSelectedActions) && this.alignment == beduinEmotionsModel.alignment && L.f(this.size, beduinEmotionsModel.size) && L.f(this.interItemSpacing, beduinEmotionsModel.interItemSpacing);
    }

    @l
    public final Alignment getAlignment() {
        return this.alignment;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    public DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public String getId() {
        return this.id;
    }

    @l
    public final Integer getInterItemSpacing() {
        return this.interItemSpacing;
    }

    @l
    public final List<BeduinAction> getOnChangeSelectedActions() {
        return this.onChangeSelectedActions;
    }

    @k
    public final List<Option> getOptions() {
        return this.options;
    }

    @l
    public final String getSelectedId() {
        return this.selectedId;
    }

    @l
    public final Integer getSize() {
        return this.size;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        Boolean bool = this.isEnabled;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.selectedId;
        int iE2 = H.e((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.options);
        List<BeduinAction> list = this.onChangeSelectedActions;
        int iHashCode4 = (iE2 + (list == null ? 0 : list.hashCode())) * 31;
        Alignment alignment = this.alignment;
        int iHashCode5 = (iHashCode4 + (alignment == null ? 0 : alignment.hashCode())) * 31;
        Integer num = this.size;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.interItemSpacing;
        return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    @l
    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinEmotionsModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", isEnabled=");
        sb2.append(this.isEnabled);
        sb2.append(", selectedId=");
        sb2.append(this.selectedId);
        sb2.append(", options=");
        sb2.append(this.options);
        sb2.append(", onChangeSelectedActions=");
        sb2.append(this.onChangeSelectedActions);
        sb2.append(", alignment=");
        sb2.append(this.alignment);
        sb2.append(", size=");
        sb2.append(this.size);
        sb2.append(", interItemSpacing=");
        return s.j(sb2, this.interItemSpacing, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        Boolean bool = this.isEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.selectedId);
        Iterator itJ = C0.j(this.options, parcel);
        while (itJ.hasNext()) {
            ((Option) itJ.next()).writeToParcel(parcel, flags);
        }
        List<BeduinAction> list = this.onChangeSelectedActions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        Alignment alignment = this.alignment;
        if (alignment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(alignment.name());
        }
        Integer num = this.size;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.interItemSpacing;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinEmotionsModel(@k String str, @l DisplayingPredicate displayingPredicate, @l Boolean bool, @l String str2, @k List<Option> list, @l List<? extends BeduinAction> list2, @l Alignment alignment, @l Integer num, @l Integer num2) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.isEnabled = bool;
        this.selectedId = str2;
        this.options = list;
        this.onChangeSelectedActions = list2;
        this.alignment = alignment;
        this.size = num;
        this.interItemSpacing = num2;
    }
}
