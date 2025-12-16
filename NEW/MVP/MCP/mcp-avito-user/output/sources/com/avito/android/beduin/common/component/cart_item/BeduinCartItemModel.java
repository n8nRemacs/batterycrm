package com.avito.android.beduin.common.component.cart_item;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import cj.InterfaceC27206d;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.BeduinCheckableModel;
import com.avito.android.beduin.common.component.cart_item.RightIcons;
import com.avito.android.beduin.common.component.checkbox.CheckboxState;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.CheckboxStateTransform;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.IsFavoriteTransform;
import com.avito.android.beduin.common.utils.C28809e;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinCartItemModel.kt */
@s0
@Keep
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 `2\u00020\u00012\u00020\u0002:\u0002abB{\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u00020\u001f2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00160\u001aH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0018\u0010.\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b0\u0010/J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bHÆ\u0003¢\u0006\u0004\b1\u0010/J\u0018\u00102\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b2\u0010/J\u0018\u00103\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b3\u0010/J\u0092\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b6\u0010'J\u0010\u00108\u001a\u000207HÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020\u00162\b\u0010;\u001a\u0004\u0018\u00010:HÖ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u000207HÖ\u0001¢\u0006\u0004\b>\u00109J \u0010B\u001a\u00020\u001f2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u000207HÖ\u0001¢\u0006\u0004\bB\u0010CJ\u0013\u0010E\u001a\u00020\u0007*\u00020DH\u0002¢\u0006\u0004\bE\u0010FJ\u001d\u0010H\u001a\u0004\u0018\u00010G*\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000bH\u0002¢\u0006\u0004\bH\u0010IJ+\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b*\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b2\u0006\u0010J\u001a\u00020\u0016H\u0002¢\u0006\u0004\bK\u0010LR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010M\u001a\u0004\bN\u0010'R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010O\u001a\u0004\bP\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010Q\u001a\u0004\bR\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010S\u001a\u0004\bT\u0010-R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010U\u001a\u0004\bV\u0010/R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010U\u001a\u0004\bW\u0010/R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010U\u001a\u0004\bX\u0010/R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010U\u001a\u0004\bY\u0010/R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010U\u001a\u0004\bZ\u0010/R\u0014\u0010\\\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010'R\u0014\u0010J\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010]R\u0014\u0010^\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010]R\u0014\u0010_\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010]¨\u0006c"}, d2 = {"Lcom/avito/android/beduin/common/component/cart_item/BeduinCartItemModel;", "Lcom/avito/android/beduin/common/component/BeduinCheckableModel;", "Lcj/d;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "Lcom/avito/android/beduin/common/component/cart_item/BeduinCartItemModel$State;", VoiceInfo.STATE, "Lcom/avito/android/remote/model/Image;", "image", "", "Lcom/avito/android/beduin_models/BeduinModel;", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "Lcom/avito/android/beduin_models/BeduinAction;", "onCheckboxTapActions", "onBodyTapActions", "onMoreButtonTapActions", "Lcom/avito/android/beduin/common/component/cart_item/RightIcons;", "rightIcons", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/cart_item/BeduinCartItemModel$State;Lcom/avito/android/remote/model/Image;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", BeduinCartItemModel.CHECKED_STRING, "applyChecked", "(Z)Lcom/avito/android/beduin/common/component/BeduinCheckableModel;", "Lkotlin/Function1;", "mapper", "flatMap", "(LY41/l;)Ljava/util/List;", "action", "Lkotlin/G0;", "forEach", "(LY41/l;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Lcom/avito/android/beduin/common/component/cart_item/BeduinCartItemModel$State;", "component4", "()Lcom/avito/android/remote/model/Image;", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/cart_item/BeduinCartItemModel$State;Lcom/avito/android/remote/model/Image;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/beduin/common/component/cart_item/BeduinCartItemModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/component/checkbox/CheckboxState;", "toCartItemState", "(Lcom/avito/android/beduin/common/component/checkbox/CheckboxState;)Lcom/avito/android/beduin/common/component/cart_item/BeduinCartItemModel$State;", "Lcom/avito/android/beduin/common/component/cart_item/RightIcons$Favorite;", "findFavouriteIcon", "(Ljava/util/List;)Lcom/avito/android/beduin/common/component/cart_item/RightIcons$Favorite;", "isFavorite", "changeFavouriteStatus", "(Ljava/util/List;Z)Ljava/util/List;", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Lcom/avito/android/beduin/common/component/cart_item/BeduinCartItemModel$State;", "getState", "Lcom/avito/android/remote/model/Image;", "getImage", "Ljava/util/List;", "getChildren", "getOnCheckboxTapActions", "getOnBodyTapActions", "getOnMoreButtonTapActions", "getRightIcons", "getAdvertId", "advertId", "()Z", "isChecked", "isValid", "Companion", "a", "State", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes11.dex */
public final /* data */ class BeduinCartItemModel implements BeduinCheckableModel, InterfaceC27206d {

    @Y61.k
    @Deprecated
    public static final String CHECKED_STRING = "checked";

    @Y61.k
    @Deprecated
    public static final String DISABLED_STRING = "disabled";

    @Y61.k
    @Deprecated
    public static final String UNCHECKED_STRING = "unchecked";

    @Y61.l
    private final List<BeduinModel> children;

    @Y61.l
    private final DisplayingPredicate displayingPredicate;

    @Y61.k
    private final String id;

    @Y61.k
    private final Image image;

    @Y61.k
    private final List<BeduinAction> onBodyTapActions;

    @Y61.l
    private final List<BeduinAction> onCheckboxTapActions;

    @Y61.l
    private final List<BeduinAction> onMoreButtonTapActions;

    @Y61.l
    private final List<RightIcons> rightIcons;

    @Y61.k
    private final State state;

    @Y61.k
    private static final a Companion = new a(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinCartItemModel> CREATOR = new b();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinCartItemModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/beduin/common/component/cart_item/BeduinCartItemModel$State;", "", "", "string", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "CHECKED", "UNCHECKED", "DISABLED", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {

        @com.google.gson.annotations.c(BeduinCartItemModel.CHECKED_STRING)
        public static final State CHECKED;

        @com.google.gson.annotations.c(BeduinCartItemModel.DISABLED_STRING)
        public static final State DISABLED;

        @com.google.gson.annotations.c(BeduinCartItemModel.UNCHECKED_STRING)
        public static final State UNCHECKED;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ State[] f100878c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f100879d;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f100880b;

        static {
            State state = new State("CHECKED", 0, BeduinCartItemModel.CHECKED_STRING);
            CHECKED = state;
            State state2 = new State("UNCHECKED", 1, BeduinCartItemModel.UNCHECKED_STRING);
            UNCHECKED = state2;
            State state3 = new State("DISABLED", 2, BeduinCartItemModel.DISABLED_STRING);
            DISABLED = state3;
            State[] stateArr = {state, state2, state3};
            f100878c = stateArr;
            f100879d = kotlin.enums.c.a(stateArr);
        }

        private State(String str, int i12, String str2) {
            this.f100880b = str2;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f100878c.clone();
        }

        @Override // java.lang.Enum
        @Y61.k
        public final String toString() {
            return this.f100880b;
        }
    }

    /* compiled from: BeduinCartItemModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/beduin/common/component/cart_item/BeduinCartItemModel$a;", "", "<init>", "()V", "", "CHECKED_STRING", "Ljava/lang/String;", "DISABLED_STRING", "UNCHECKED_STRING", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BeduinCartItemModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinCartItemModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinCartItemModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinCartItemModel.class.getClassLoader());
            State stateValueOf = State.valueOf(parcel.readString());
            Image image = (Image) parcel.readParcelable(BeduinCartItemModel.class.getClassLoader());
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(BeduinCartItemModel.class, parcel, arrayList5, iL3, 1);
                }
                arrayList = arrayList5;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iL4 = 0;
                while (iL4 != i13) {
                    iL4 = com.avito.android.actions_sheet.a.l(BeduinCartItemModel.class, parcel, arrayList2, iL4, 1);
                }
            }
            int i14 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(i14);
            int iL5 = 0;
            while (iL5 != i14) {
                iL5 = com.avito.android.actions_sheet.a.l(BeduinCartItemModel.class, parcel, arrayList6, iL5, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i15);
                int iL6 = 0;
                while (iL6 != i15) {
                    iL6 = com.avito.android.actions_sheet.a.l(BeduinCartItemModel.class, parcel, arrayList7, iL6, 1);
                }
                arrayList3 = arrayList7;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i16 = parcel.readInt();
                arrayList4 = new ArrayList(i16);
                while (iL2 != i16) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinCartItemModel.class, parcel, arrayList4, iL2, 1);
                }
            }
            return new BeduinCartItemModel(string, displayingPredicate, stateValueOf, image, arrayList, arrayList2, arrayList6, arrayList3, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinCartItemModel[] newArray(int i12) {
            return new BeduinCartItemModel[i12];
        }
    }

    /* compiled from: BeduinCartItemModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100881a;

        static {
            int[] iArr = new int[CheckboxState.values().length];
            try {
                iArr[CheckboxState.CHECKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckboxState.INDETERMINATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckboxState.UNCHECKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f100881a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinCartItemModel(@Y61.k String str, @Y61.l DisplayingPredicate displayingPredicate, @Y61.k State state, @Y61.k Image image, @Y61.l List<? extends BeduinModel> list, @Y61.l List<? extends BeduinAction> list2, @Y61.k List<? extends BeduinAction> list3, @Y61.l List<? extends BeduinAction> list4, @Y61.l List<? extends RightIcons> list5) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.state = state;
        this.image = image;
        this.children = list;
        this.onCheckboxTapActions = list2;
        this.onBodyTapActions = list3;
        this.onMoreButtonTapActions = list4;
        this.rightIcons = list5;
    }

    private final List<RightIcons> changeFavouriteStatus(List<? extends RightIcons> list, boolean z12) {
        if (list == null) {
            return null;
        }
        List<? extends RightIcons> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (Parcelable parcelableA : list2) {
            if (parcelableA instanceof RightIcons.Favorite) {
                parcelableA = RightIcons.Favorite.a((RightIcons.Favorite) parcelableA, z12);
            }
            arrayList.add(parcelableA);
        }
        return arrayList;
    }

    public static /* synthetic */ BeduinCartItemModel copy$default(BeduinCartItemModel beduinCartItemModel, String str, DisplayingPredicate displayingPredicate, State state, Image image, List list, List list2, List list3, List list4, List list5, int i12, Object obj) {
        return beduinCartItemModel.copy((i12 & 1) != 0 ? beduinCartItemModel.id : str, (i12 & 2) != 0 ? beduinCartItemModel.displayingPredicate : displayingPredicate, (i12 & 4) != 0 ? beduinCartItemModel.state : state, (i12 & 8) != 0 ? beduinCartItemModel.image : image, (i12 & 16) != 0 ? beduinCartItemModel.children : list, (i12 & 32) != 0 ? beduinCartItemModel.onCheckboxTapActions : list2, (i12 & 64) != 0 ? beduinCartItemModel.onBodyTapActions : list3, (i12 & 128) != 0 ? beduinCartItemModel.onMoreButtonTapActions : list4, (i12 & 256) != 0 ? beduinCartItemModel.rightIcons : list5);
    }

    private final RightIcons.Favorite findFavouriteIcon(List<? extends RightIcons> list) {
        Object next;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof RightIcons.Favorite) {
                break;
            }
        }
        return (RightIcons.Favorite) (next instanceof RightIcons.Favorite ? next : null);
    }

    private final State toCartItemState(CheckboxState checkboxState) {
        int i12 = c.f100881a[checkboxState.ordinal()];
        if (i12 == 1) {
            return State.CHECKED;
        }
        if (i12 == 2) {
            return this.state;
        }
        if (i12 == 3) {
            return State.UNCHECKED;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    public BeduinModel apply(@Y61.k BeduinModelTransform transform) {
        return transform instanceof CheckboxStateTransform ? copy$default(this, null, null, toCartItemState(((CheckboxStateTransform) transform).getState()), null, null, null, null, null, null, 507, null) : transform instanceof DisplayPredicateTransform ? copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, null, null, null, null, 509, null) : transform instanceof IsFavoriteTransform ? copy$default(this, null, null, null, null, null, null, null, null, changeFavouriteStatus(this.rightIcons, ((IsFavoriteTransform) transform).isFavorite()), 255, null) : this;
    }

    @Override // com.avito.android.beduin.common.component.BeduinCheckableModel
    @Y61.k
    public BeduinCheckableModel applyChecked(boolean checked) {
        return copy$default(this, null, null, checked ? State.CHECKED : State.UNCHECKED, null, null, null, null, null, null, 507, null);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: component2, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @Y61.k
    /* renamed from: component3, reason: from getter */
    public final State getState() {
        return this.state;
    }

    @Y61.k
    /* renamed from: component4, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @Y61.l
    public final List<BeduinModel> component5() {
        return this.children;
    }

    @Y61.l
    public final List<BeduinAction> component6() {
        return this.onCheckboxTapActions;
    }

    @Y61.k
    public final List<BeduinAction> component7() {
        return this.onBodyTapActions;
    }

    @Y61.l
    public final List<BeduinAction> component8() {
        return this.onMoreButtonTapActions;
    }

    @Y61.l
    public final List<RightIcons> component9() {
        return this.rightIcons;
    }

    @Y61.k
    public final BeduinCartItemModel copy(@Y61.k String id2, @Y61.l DisplayingPredicate displayingPredicate, @Y61.k State state, @Y61.k Image image, @Y61.l List<? extends BeduinModel> children, @Y61.l List<? extends BeduinAction> onCheckboxTapActions, @Y61.k List<? extends BeduinAction> onBodyTapActions, @Y61.l List<? extends BeduinAction> onMoreButtonTapActions, @Y61.l List<? extends RightIcons> rightIcons) {
        return new BeduinCartItemModel(id2, displayingPredicate, state, image, children, onCheckboxTapActions, onBodyTapActions, onMoreButtonTapActions, rightIcons);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinCartItemModel)) {
            return false;
        }
        BeduinCartItemModel beduinCartItemModel = (BeduinCartItemModel) other;
        return L.f(this.id, beduinCartItemModel.id) && L.f(this.displayingPredicate, beduinCartItemModel.displayingPredicate) && this.state == beduinCartItemModel.state && L.f(this.image, beduinCartItemModel.image) && L.f(this.children, beduinCartItemModel.children) && L.f(this.onCheckboxTapActions, beduinCartItemModel.onCheckboxTapActions) && L.f(this.onBodyTapActions, beduinCartItemModel.onBodyTapActions) && L.f(this.onMoreButtonTapActions, beduinCartItemModel.onMoreButtonTapActions) && L.f(this.rightIcons, beduinCartItemModel.rightIcons);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    public List<BeduinModel> flatMap(@Y61.k Y41.l<? super BeduinModel, ? extends List<? extends BeduinModel>> mapper) {
        List<BeduinModel> list = this.children;
        ArrayList arrayListC = list != null ? C28809e.c(mapper, list) : null;
        BeduinCartItemModel beduinCartItemModelCopy$default = L.f(arrayListC, this.children) ? this : null;
        if (beduinCartItemModelCopy$default == null) {
            beduinCartItemModelCopy$default = copy$default(this, null, null, null, null, arrayListC, null, null, null, null, 495, null);
        }
        return (List) mapper.invoke(beduinCartItemModelCopy$default);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    public void forEach(@Y61.k Y41.l<? super BeduinModel, Boolean> action) {
        List<BeduinModel> list;
        if (action.invoke(this).booleanValue() || (list = this.children) == null) {
            return;
        }
        C28809e.e(action, list);
    }

    @Override // cj.InterfaceC27206d
    @Y61.k
    public String getAdvertId() {
        return getF102944b();
    }

    @Y61.l
    public final List<BeduinModel> getChildren() {
        return this.children;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF102397d() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    /* renamed from: getId */
    public String getF102944b() {
        return this.id;
    }

    @Y61.k
    public final Image getImage() {
        return this.image;
    }

    @Y61.k
    public final List<BeduinAction> getOnBodyTapActions() {
        return this.onBodyTapActions;
    }

    @Y61.l
    public final List<BeduinAction> getOnCheckboxTapActions() {
        return this.onCheckboxTapActions;
    }

    @Y61.l
    public final List<BeduinAction> getOnMoreButtonTapActions() {
        return this.onMoreButtonTapActions;
    }

    @Y61.l
    public final List<RightIcons> getRightIcons() {
        return this.rightIcons;
    }

    @Y61.k
    public final State getState() {
        return this.state;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iG2 = com.avito.android.actions_sheet.a.g(this.image, (this.state.hashCode() + ((iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31)) * 31, 31);
        List<BeduinModel> list = this.children;
        int iHashCode2 = (iG2 + (list == null ? 0 : list.hashCode())) * 31;
        List<BeduinAction> list2 = this.onCheckboxTapActions;
        int iE2 = H.e((iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.onBodyTapActions);
        List<BeduinAction> list3 = this.onMoreButtonTapActions;
        int iHashCode3 = (iE2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<RightIcons> list4 = this.rightIcons;
        return iHashCode3 + (list4 != null ? list4.hashCode() : 0);
    }

    @Override // com.avito.android.beduin.common.component.BeduinCheckableModel
    public boolean isChecked() {
        return this.state == State.CHECKED;
    }

    @Override // cj.InterfaceC27206d
    /* renamed from: isFavorite */
    public boolean getIsFavorite() {
        RightIcons.Favorite favoriteFindFavouriteIcon = findFavouriteIcon(this.rightIcons);
        if (favoriteFindFavouriteIcon != null) {
            return favoriteFindFavouriteIcon.getIsFavorite();
        }
        return false;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    public boolean isValid() {
        if (this.state != State.CHECKED) {
            return true;
        }
        List<BeduinModel> list = this.children;
        return list != null ? C28809e.f(list) : true;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinCartItemModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", state=");
        sb2.append(this.state);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", children=");
        sb2.append(this.children);
        sb2.append(", onCheckboxTapActions=");
        sb2.append(this.onCheckboxTapActions);
        sb2.append(", onBodyTapActions=");
        sb2.append(this.onBodyTapActions);
        sb2.append(", onMoreButtonTapActions=");
        sb2.append(this.onMoreButtonTapActions);
        sb2.append(", rightIcons=");
        return H.p(sb2, this.rightIcons, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        parcel.writeString(this.state.name());
        parcel.writeParcelable(this.image, flags);
        List<BeduinModel> list = this.children;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<BeduinAction> list2 = this.onCheckboxTapActions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
        Iterator itJ = C0.j(this.onBodyTapActions, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        List<BeduinAction> list3 = this.onMoreButtonTapActions;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                parcel.writeParcelable((Parcelable) itA3.next(), flags);
            }
        }
        List<RightIcons> list4 = this.rightIcons;
        if (list4 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA4 = com.avito.android.actions_sheet.a.A(list4, parcel, 1);
        while (itA4.hasNext()) {
            parcel.writeParcelable((Parcelable) itA4.next(), flags);
        }
    }

    public /* synthetic */ BeduinCartItemModel(String str, DisplayingPredicate displayingPredicate, State state, Image image, List list, List list2, List list3, List list4, List list5, int i12, C42822w c42822w) {
        this(str, displayingPredicate, state, image, list, list2, list3, (i12 & 128) != 0 ? null : list4, (i12 & 256) != 0 ? null : list5);
    }
}
