package com.avito.android.beduin.common.component.countdown_timer;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinCountDownTimerModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0001KBa\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÂ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b'\u0010&Jx\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001cJ\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020+HÖ\u0001¢\u0006\u0004\b3\u0010-J \u00108\u001a\u0002072\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020+HÖ\u0001¢\u0006\u0004\b8\u00109R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b=\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\b?\u0010 R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010@R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bB\u0010\"R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bD\u0010$R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010E\u001a\u0004\bF\u0010&R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010E\u001a\u0004\bG\u0010&R\u0011\u0010I\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bH\u0010\u0015¨\u0006L"}, d2 = {"Lcom/avito/android/beduin/common/component/countdown_timer/BeduinCountDownTimerModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "Lcom/avito/android/beduin/common/component/countdown_timer/BeduinCountDownTimerStyle;", "_style", "Lcom/avito/android/beduin/common/component/countdown_timer/CustomStyle;", "customStyle", "Lcom/avito/android/beduin/common/component/countdown_timer/BeduinCountDown;", "countdown", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onStepActions", "onFinishActions", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Lcom/avito/android/beduin/common/component/countdown_timer/BeduinCountDownTimerStyle;Lcom/avito/android/beduin/common/component/countdown_timer/CustomStyle;Lcom/avito/android/beduin/common/component/countdown_timer/BeduinCountDown;Ljava/util/List;Ljava/util/List;)V", "component4", "()Lcom/avito/android/beduin/common/component/countdown_timer/BeduinCountDownTimerStyle;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "component5", "()Lcom/avito/android/beduin/common/component/countdown_timer/CustomStyle;", "component6", "()Lcom/avito/android/beduin/common/component/countdown_timer/BeduinCountDown;", "component7", "()Ljava/util/List;", "component8", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Lcom/avito/android/beduin/common/component/countdown_timer/BeduinCountDownTimerStyle;Lcom/avito/android/beduin/common/component/countdown_timer/CustomStyle;Lcom/avito/android/beduin/common/component/countdown_timer/BeduinCountDown;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/beduin/common/component/countdown_timer/BeduinCountDownTimerModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "getTheme", "Lcom/avito/android/beduin/common/component/countdown_timer/BeduinCountDownTimerStyle;", "Lcom/avito/android/beduin/common/component/countdown_timer/CustomStyle;", "getCustomStyle", "Lcom/avito/android/beduin/common/component/countdown_timer/BeduinCountDown;", "getCountdown", "Ljava/util/List;", "getOnStepActions", "getOnFinishActions", "getStyle", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinCountDownTimerModel extends LeafBeduinModel {

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final BeduinCountDownTimerStyle _style;

    @com.google.gson.annotations.c("countdown")
    @k
    private final BeduinCountDown countdown;

    @com.google.gson.annotations.c("customStyle")
    @l
    private final CustomStyle customStyle;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE)
    @l
    private final DisplayingPredicate displayingPredicate;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("onFinishActions")
    @l
    private final List<BeduinAction> onFinishActions;

    @com.google.gson.annotations.c("onStepActions")
    @l
    private final List<BeduinAction> onStepActions;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
    @l
    private final BeduinComponentTheme theme;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<BeduinCountDownTimerModel> CREATOR = new b();

    @k
    private static final List<String> types = Collections.singletonList("countdownTimer");

    @k
    private static final Class<BeduinCountDownTimerModel> model = BeduinCountDownTimerModel.class;

    /* compiled from: BeduinCountDownTimerModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/countdown_timer/BeduinCountDownTimerModel$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.countdown_timer.BeduinCountDownTimerModel$a, reason: from kotlin metadata */
    public static final class Companion implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinCountDownTimerModel> S() {
            return BeduinCountDownTimerModel.model;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return BeduinCountDownTimerModel.types;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinCountDownTimerModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinCountDownTimerModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinCountDownTimerModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinCountDownTimerModel.class.getClassLoader());
            BeduinComponentTheme beduinComponentThemeCreateFromParcel = parcel.readInt() == 0 ? null : BeduinComponentTheme.CREATOR.createFromParcel(parcel);
            BeduinCountDownTimerStyle beduinCountDownTimerStyleValueOf = parcel.readInt() == 0 ? null : BeduinCountDownTimerStyle.valueOf(parcel.readString());
            CustomStyle customStyleCreateFromParcel = parcel.readInt() == 0 ? null : CustomStyle.CREATOR.createFromParcel(parcel);
            BeduinCountDown beduinCountDownCreateFromParcel = BeduinCountDown.CREATOR.createFromParcel(parcel);
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(BeduinCountDownTimerModel.class, parcel, arrayList, iL3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinCountDownTimerModel.class, parcel, arrayList2, iL2, 1);
                }
            }
            return new BeduinCountDownTimerModel(string, displayingPredicate, beduinComponentThemeCreateFromParcel, beduinCountDownTimerStyleValueOf, customStyleCreateFromParcel, beduinCountDownCreateFromParcel, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinCountDownTimerModel[] newArray(int i12) {
            return new BeduinCountDownTimerModel[i12];
        }
    }

    public /* synthetic */ BeduinCountDownTimerModel(String str, DisplayingPredicate displayingPredicate, BeduinComponentTheme beduinComponentTheme, BeduinCountDownTimerStyle beduinCountDownTimerStyle, CustomStyle customStyle, BeduinCountDown beduinCountDown, List list, List list2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : displayingPredicate, beduinComponentTheme, beduinCountDownTimerStyle, customStyle, beduinCountDown, list, list2);
    }

    /* renamed from: component4, reason: from getter */
    private final BeduinCountDownTimerStyle get_style() {
        return this._style;
    }

    public static /* synthetic */ BeduinCountDownTimerModel copy$default(BeduinCountDownTimerModel beduinCountDownTimerModel, String str, DisplayingPredicate displayingPredicate, BeduinComponentTheme beduinComponentTheme, BeduinCountDownTimerStyle beduinCountDownTimerStyle, CustomStyle customStyle, BeduinCountDown beduinCountDown, List list, List list2, int i12, Object obj) {
        return beduinCountDownTimerModel.copy((i12 & 1) != 0 ? beduinCountDownTimerModel.id : str, (i12 & 2) != 0 ? beduinCountDownTimerModel.displayingPredicate : displayingPredicate, (i12 & 4) != 0 ? beduinCountDownTimerModel.theme : beduinComponentTheme, (i12 & 8) != 0 ? beduinCountDownTimerModel._style : beduinCountDownTimerStyle, (i12 & 16) != 0 ? beduinCountDownTimerModel.customStyle : customStyle, (i12 & 32) != 0 ? beduinCountDownTimerModel.countdown : beduinCountDown, (i12 & 64) != 0 ? beduinCountDownTimerModel.onStepActions : list, (i12 & 128) != 0 ? beduinCountDownTimerModel.onFinishActions : list2);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, null, null, null, 253, null) : this;
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
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final CustomStyle getCustomStyle() {
        return this.customStyle;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final BeduinCountDown getCountdown() {
        return this.countdown;
    }

    @l
    public final List<BeduinAction> component7() {
        return this.onStepActions;
    }

    @l
    public final List<BeduinAction> component8() {
        return this.onFinishActions;
    }

    @k
    public final BeduinCountDownTimerModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @l BeduinComponentTheme theme, @l BeduinCountDownTimerStyle _style, @l CustomStyle customStyle, @k BeduinCountDown countdown, @l List<? extends BeduinAction> onStepActions, @l List<? extends BeduinAction> onFinishActions) {
        return new BeduinCountDownTimerModel(id2, displayingPredicate, theme, _style, customStyle, countdown, onStepActions, onFinishActions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinCountDownTimerModel)) {
            return false;
        }
        BeduinCountDownTimerModel beduinCountDownTimerModel = (BeduinCountDownTimerModel) other;
        return L.f(this.id, beduinCountDownTimerModel.id) && L.f(this.displayingPredicate, beduinCountDownTimerModel.displayingPredicate) && this.theme == beduinCountDownTimerModel.theme && this._style == beduinCountDownTimerModel._style && L.f(this.customStyle, beduinCountDownTimerModel.customStyle) && L.f(this.countdown, beduinCountDownTimerModel.countdown) && L.f(this.onStepActions, beduinCountDownTimerModel.onStepActions) && L.f(this.onFinishActions, beduinCountDownTimerModel.onFinishActions);
    }

    @k
    public final BeduinCountDown getCountdown() {
        return this.countdown;
    }

    @l
    public final CustomStyle getCustomStyle() {
        return this.customStyle;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF102945c() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId */
    public String getF102944b() {
        return this.id;
    }

    @l
    public final List<BeduinAction> getOnFinishActions() {
        return this.onFinishActions;
    }

    @l
    public final List<BeduinAction> getOnStepActions() {
        return this.onStepActions;
    }

    @k
    public final BeduinCountDownTimerStyle getStyle() {
        BeduinCountDownTimerStyle beduinCountDownTimerStyle = this._style;
        return beduinCountDownTimerStyle == null ? BeduinCountDownTimerStyle.WHITE : beduinCountDownTimerStyle;
    }

    @l
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        BeduinComponentTheme beduinComponentTheme = this.theme;
        int iHashCode3 = (iHashCode2 + (beduinComponentTheme == null ? 0 : beduinComponentTheme.hashCode())) * 31;
        BeduinCountDownTimerStyle beduinCountDownTimerStyle = this._style;
        int iHashCode4 = (iHashCode3 + (beduinCountDownTimerStyle == null ? 0 : beduinCountDownTimerStyle.hashCode())) * 31;
        CustomStyle customStyle = this.customStyle;
        int iHashCode5 = (this.countdown.hashCode() + ((iHashCode4 + (customStyle == null ? 0 : customStyle.hashCode())) * 31)) * 31;
        List<BeduinAction> list = this.onStepActions;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<BeduinAction> list2 = this.onFinishActions;
        return iHashCode6 + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinCountDownTimerModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", theme=");
        sb2.append(this.theme);
        sb2.append(", _style=");
        sb2.append(this._style);
        sb2.append(", customStyle=");
        sb2.append(this.customStyle);
        sb2.append(", countdown=");
        sb2.append(this.countdown);
        sb2.append(", onStepActions=");
        sb2.append(this.onStepActions);
        sb2.append(", onFinishActions=");
        return H.p(sb2, this.onFinishActions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        BeduinComponentTheme beduinComponentTheme = this.theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, flags);
        }
        BeduinCountDownTimerStyle beduinCountDownTimerStyle = this._style;
        if (beduinCountDownTimerStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(beduinCountDownTimerStyle.name());
        }
        CustomStyle customStyle = this.customStyle;
        if (customStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            customStyle.writeToParcel(parcel, flags);
        }
        this.countdown.writeToParcel(parcel, flags);
        List<BeduinAction> list = this.onStepActions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<BeduinAction> list2 = this.onFinishActions;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            parcel.writeParcelable((Parcelable) itA2.next(), flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinCountDownTimerModel(@k String str, @l DisplayingPredicate displayingPredicate, @l BeduinComponentTheme beduinComponentTheme, @l BeduinCountDownTimerStyle beduinCountDownTimerStyle, @l CustomStyle customStyle, @k BeduinCountDown beduinCountDown, @l List<? extends BeduinAction> list, @l List<? extends BeduinAction> list2) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.theme = beduinComponentTheme;
        this._style = beduinCountDownTimerStyle;
        this.customStyle = customStyle;
        this.countdown = beduinCountDown;
        this.onStepActions = list;
        this.onFinishActions = list2;
    }
}
