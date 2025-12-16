package com.avito.android.beduin.common.component.icon_button;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.component.model.icon.IconBase64;
import com.avito.android.beduin.common.component.model.icon.LocalIcon;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.IsEnabledTransform;
import com.avito.android.beduin.common.form.transforms.IsLoadingTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinIconButtonModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0002RSBo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b.\u0010/J\u008c\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u0010\u001eJ\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00108\u001a\u00020\f2\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u000203HÖ\u0001¢\u0006\u0004\b:\u00105J \u0010?\u001a\u00020>2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u000203HÖ\u0001¢\u0006\u0004\b?\u0010@R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010C\u001a\u0004\bD\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010E\u001a\u0004\bF\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010G\u001a\u0004\bH\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010I\u001a\u0004\bJ\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010K\u001a\u0004\b\r\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010K\u001a\u0004\b\u000e\u0010(R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010L\u001a\u0004\bM\u0010+R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010N\u001a\u0004\bO\u0010-R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010P\u001a\u0004\bQ\u0010/¨\u0006T"}, d2 = {"Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "localIcon", "Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "base64Icon", "Lcom/avito/android/beduin/common/component/icon_button/LayoutMode;", "layoutMode", "Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Size;", "size", "", "isEnabled", "isLoading", "Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/common/component/model/icon/IconBase64;Lcom/avito/android/beduin/common/component/icon_button/LayoutMode;Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Size;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style;Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "component3", "()Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "component4", "()Lcom/avito/android/beduin/common/component/icon_button/LayoutMode;", "component5", "()Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Size;", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "()Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style;", "component9", "()Ljava/util/List;", "component10", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/common/component/model/icon/IconBase64;Lcom/avito/android/beduin/common/component/icon_button/LayoutMode;Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Size;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style;Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;)Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "getLocalIcon", "Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "getBase64Icon", "Lcom/avito/android/beduin/common/component/icon_button/LayoutMode;", "getLayoutMode", "Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Size;", "getSize", "Ljava/lang/Boolean;", "Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style;", "getStyle", "Ljava/util/List;", "getActions", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Size", "Style", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinIconButtonModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinIconButtonModel> CREATOR = new a();

    @l
    private final List<BeduinAction> actions;

    @l
    private final IconBase64 base64Icon;

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @l
    private final Boolean isEnabled;

    @l
    private final Boolean isLoading;

    @l
    private final LayoutMode layoutMode;

    @l
    private final LocalIcon localIcon;

    @l
    private final Size size;

    @l
    private final Style style;

    /* compiled from: BeduinIconButtonModel.kt */
    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\b¨\u0006 "}, d2 = {"Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Size;", "Landroid/os/Parcelable;", "", "width", "height", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Size;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getWidth", "getHeight", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Size implements Parcelable {

        @k
        public static final Parcelable.Creator<Size> CREATOR = new a();

        @l
        private final Integer height;

        @l
        private final Integer width;

        /* compiled from: BeduinIconButtonModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Size> {
            @Override // android.os.Parcelable.Creator
            public final Size createFromParcel(Parcel parcel) {
                return new Size(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Size[] newArray(int i12) {
                return new Size[i12];
            }
        }

        public Size(@l Integer num, @l Integer num2) {
            this.width = num;
            this.height = num2;
        }

        public static /* synthetic */ Size copy$default(Size size, Integer num, Integer num2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                num = size.width;
            }
            if ((i12 & 2) != 0) {
                num2 = size.height;
            }
            return size.copy(num, num2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Integer getWidth() {
            return this.width;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Integer getHeight() {
            return this.height;
        }

        @k
        public final Size copy(@l Integer width, @l Integer height) {
            return new Size(width, height);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Size)) {
                return false;
            }
            Size size = (Size) other;
            return L.f(this.width, size.width) && L.f(this.height, size.height);
        }

        @l
        public final Integer getHeight() {
            return this.height;
        }

        @l
        public final Integer getWidth() {
            return this.width;
        }

        public int hashCode() {
            Integer num = this.width;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.height;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Size(width=");
            sb2.append(this.width);
            sb2.append(", height=");
            return s.j(sb2, this.height, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Integer num = this.width;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            Integer num2 = this.height;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num2);
            }
        }
    }

    /* compiled from: BeduinIconButtonModel.kt */
    @Keep
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u000289BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JX\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010 J \u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b1\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b7\u0010\u0019¨\u0006:"}, d2 = {"Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style;", "Landroid/os/Parcelable;", "", "cornerRadius", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "highlightedColor", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "contentInsets", "Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style$Shadows;", "shadows", "Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style$Spinner;", "spinner", "<init>", "(Ljava/lang/Integer;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style$Shadows;Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style$Spinner;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "component3", "component4", "()Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "component5", "()Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style$Shadows;", "component6", "()Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style$Spinner;", "copy", "(Ljava/lang/Integer;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style$Shadows;Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style$Spinner;)Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getCornerRadius", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "getHighlightedColor", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "getContentInsets", "Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style$Shadows;", "getShadows", "Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style$Spinner;", "getSpinner", "Shadows", "Spinner", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Style implements Parcelable {

        @k
        public static final Parcelable.Creator<Style> CREATOR = new a();

        @l
        private final UniversalColor backgroundColor;

        @l
        private final BeduinContainerIndent contentInsets;

        @l
        private final Integer cornerRadius;

        @l
        private final UniversalColor highlightedColor;

        @l
        private final Shadows shadows;

        @l
        private final Spinner spinner;

        /* compiled from: BeduinIconButtonModel.kt */
        @Keep
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b%\u0010\f¨\u0006'"}, d2 = {"Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style$Shadows;", "Landroid/os/Parcelable;", "", "cornerRadius", "Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style$Shadows$Shadow;", "upperShadow", "bottomShadow", "<init>", "(Ljava/lang/Integer;Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style$Shadows$Shadow;Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style$Shadows$Shadow;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style$Shadows$Shadow;", "component3", "copy", "(Ljava/lang/Integer;Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style$Shadows$Shadow;Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style$Shadows$Shadow;)Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style$Shadows;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getCornerRadius", "Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style$Shadows$Shadow;", "getUpperShadow", "getBottomShadow", "Shadow", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Shadows implements Parcelable {

            @k
            public static final Parcelable.Creator<Shadows> CREATOR = new a();

            @l
            private final Shadow bottomShadow;

            @l
            private final Integer cornerRadius;

            @l
            private final Shadow upperShadow;

            /* compiled from: BeduinIconButtonModel.kt */
            @Keep
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u000f¨\u0006)"}, d2 = {"Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style$Shadows$Shadow;", "Landroid/os/Parcelable;", "", "offsetX", "offsetY", "blurRadius", "Lcom/avito/android/remote/model/UniversalColor;", "color", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/UniversalColor;", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style$Shadows$Shadow;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getOffsetX", "getOffsetY", "getBlurRadius", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @K51.d
            public static final /* data */ class Shadow implements Parcelable {

                @k
                public static final Parcelable.Creator<Shadow> CREATOR = new a();

                @l
                private final Integer blurRadius;

                @l
                private final UniversalColor color;

                @l
                private final Integer offsetX;

                @l
                private final Integer offsetY;

                /* compiled from: BeduinIconButtonModel.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Shadow> {
                    @Override // android.os.Parcelable.Creator
                    public final Shadow createFromParcel(Parcel parcel) {
                        return new Shadow(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (UniversalColor) parcel.readParcelable(Shadow.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Shadow[] newArray(int i12) {
                        return new Shadow[i12];
                    }
                }

                public Shadow(@l Integer num, @l Integer num2, @l Integer num3, @l UniversalColor universalColor) {
                    this.offsetX = num;
                    this.offsetY = num2;
                    this.blurRadius = num3;
                    this.color = universalColor;
                }

                public static /* synthetic */ Shadow copy$default(Shadow shadow, Integer num, Integer num2, Integer num3, UniversalColor universalColor, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        num = shadow.offsetX;
                    }
                    if ((i12 & 2) != 0) {
                        num2 = shadow.offsetY;
                    }
                    if ((i12 & 4) != 0) {
                        num3 = shadow.blurRadius;
                    }
                    if ((i12 & 8) != 0) {
                        universalColor = shadow.color;
                    }
                    return shadow.copy(num, num2, num3, universalColor);
                }

                @l
                /* renamed from: component1, reason: from getter */
                public final Integer getOffsetX() {
                    return this.offsetX;
                }

                @l
                /* renamed from: component2, reason: from getter */
                public final Integer getOffsetY() {
                    return this.offsetY;
                }

                @l
                /* renamed from: component3, reason: from getter */
                public final Integer getBlurRadius() {
                    return this.blurRadius;
                }

                @l
                /* renamed from: component4, reason: from getter */
                public final UniversalColor getColor() {
                    return this.color;
                }

                @k
                public final Shadow copy(@l Integer offsetX, @l Integer offsetY, @l Integer blurRadius, @l UniversalColor color) {
                    return new Shadow(offsetX, offsetY, blurRadius, color);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Shadow)) {
                        return false;
                    }
                    Shadow shadow = (Shadow) other;
                    return L.f(this.offsetX, shadow.offsetX) && L.f(this.offsetY, shadow.offsetY) && L.f(this.blurRadius, shadow.blurRadius) && L.f(this.color, shadow.color);
                }

                @l
                public final Integer getBlurRadius() {
                    return this.blurRadius;
                }

                @l
                public final UniversalColor getColor() {
                    return this.color;
                }

                @l
                public final Integer getOffsetX() {
                    return this.offsetX;
                }

                @l
                public final Integer getOffsetY() {
                    return this.offsetY;
                }

                public int hashCode() {
                    Integer num = this.offsetX;
                    int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                    Integer num2 = this.offsetY;
                    int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                    Integer num3 = this.blurRadius;
                    int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
                    UniversalColor universalColor = this.color;
                    return iHashCode3 + (universalColor != null ? universalColor.hashCode() : 0);
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Shadow(offsetX=");
                    sb2.append(this.offsetX);
                    sb2.append(", offsetY=");
                    sb2.append(this.offsetY);
                    sb2.append(", blurRadius=");
                    sb2.append(this.blurRadius);
                    sb2.append(", color=");
                    return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.color, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    Integer num = this.offsetX;
                    if (num == null) {
                        parcel.writeInt(0);
                    } else {
                        com.avito.android.actions_sheet.a.C(parcel, 1, num);
                    }
                    Integer num2 = this.offsetY;
                    if (num2 == null) {
                        parcel.writeInt(0);
                    } else {
                        com.avito.android.actions_sheet.a.C(parcel, 1, num2);
                    }
                    Integer num3 = this.blurRadius;
                    if (num3 == null) {
                        parcel.writeInt(0);
                    } else {
                        com.avito.android.actions_sheet.a.C(parcel, 1, num3);
                    }
                    parcel.writeParcelable(this.color, flags);
                }
            }

            /* compiled from: BeduinIconButtonModel.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Shadows> {
                @Override // android.os.Parcelable.Creator
                public final Shadows createFromParcel(Parcel parcel) {
                    return new Shadows(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Shadow.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Shadow.CREATOR.createFromParcel(parcel) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final Shadows[] newArray(int i12) {
                    return new Shadows[i12];
                }
            }

            public Shadows(@l Integer num, @l Shadow shadow, @l Shadow shadow2) {
                this.cornerRadius = num;
                this.upperShadow = shadow;
                this.bottomShadow = shadow2;
            }

            public static /* synthetic */ Shadows copy$default(Shadows shadows, Integer num, Shadow shadow, Shadow shadow2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    num = shadows.cornerRadius;
                }
                if ((i12 & 2) != 0) {
                    shadow = shadows.upperShadow;
                }
                if ((i12 & 4) != 0) {
                    shadow2 = shadows.bottomShadow;
                }
                return shadows.copy(num, shadow, shadow2);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final Integer getCornerRadius() {
                return this.cornerRadius;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final Shadow getUpperShadow() {
                return this.upperShadow;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final Shadow getBottomShadow() {
                return this.bottomShadow;
            }

            @k
            public final Shadows copy(@l Integer cornerRadius, @l Shadow upperShadow, @l Shadow bottomShadow) {
                return new Shadows(cornerRadius, upperShadow, bottomShadow);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Shadows)) {
                    return false;
                }
                Shadows shadows = (Shadows) other;
                return L.f(this.cornerRadius, shadows.cornerRadius) && L.f(this.upperShadow, shadows.upperShadow) && L.f(this.bottomShadow, shadows.bottomShadow);
            }

            @l
            public final Shadow getBottomShadow() {
                return this.bottomShadow;
            }

            @l
            public final Integer getCornerRadius() {
                return this.cornerRadius;
            }

            @l
            public final Shadow getUpperShadow() {
                return this.upperShadow;
            }

            public int hashCode() {
                Integer num = this.cornerRadius;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                Shadow shadow = this.upperShadow;
                int iHashCode2 = (iHashCode + (shadow == null ? 0 : shadow.hashCode())) * 31;
                Shadow shadow2 = this.bottomShadow;
                return iHashCode2 + (shadow2 != null ? shadow2.hashCode() : 0);
            }

            @k
            public String toString() {
                return "Shadows(cornerRadius=" + this.cornerRadius + ", upperShadow=" + this.upperShadow + ", bottomShadow=" + this.bottomShadow + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                Integer num = this.cornerRadius;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num);
                }
                Shadow shadow = this.upperShadow;
                if (shadow == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    shadow.writeToParcel(parcel, flags);
                }
                Shadow shadow2 = this.bottomShadow;
                if (shadow2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    shadow2.writeToParcel(parcel, flags);
                }
            }
        }

        /* compiled from: BeduinIconButtonModel.kt */
        @Keep
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000b¨\u0006#"}, d2 = {"Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style$Spinner;", "Landroid/os/Parcelable;", "", "size", "Lcom/avito/android/remote/model/UniversalColor;", "color", "<init>", "(Ljava/lang/Integer;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "copy", "(Ljava/lang/Integer;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style$Spinner;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getSize", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Spinner implements Parcelable {

            @k
            public static final Parcelable.Creator<Spinner> CREATOR = new a();

            @l
            private final UniversalColor color;

            @l
            private final Integer size;

            /* compiled from: BeduinIconButtonModel.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Spinner> {
                @Override // android.os.Parcelable.Creator
                public final Spinner createFromParcel(Parcel parcel) {
                    return new Spinner(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UniversalColor) parcel.readParcelable(Spinner.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Spinner[] newArray(int i12) {
                    return new Spinner[i12];
                }
            }

            public Spinner(@l Integer num, @l UniversalColor universalColor) {
                this.size = num;
                this.color = universalColor;
            }

            public static /* synthetic */ Spinner copy$default(Spinner spinner, Integer num, UniversalColor universalColor, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    num = spinner.size;
                }
                if ((i12 & 2) != 0) {
                    universalColor = spinner.color;
                }
                return spinner.copy(num, universalColor);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final Integer getSize() {
                return this.size;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final UniversalColor getColor() {
                return this.color;
            }

            @k
            public final Spinner copy(@l Integer size, @l UniversalColor color) {
                return new Spinner(size, color);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Spinner)) {
                    return false;
                }
                Spinner spinner = (Spinner) other;
                return L.f(this.size, spinner.size) && L.f(this.color, spinner.color);
            }

            @l
            public final UniversalColor getColor() {
                return this.color;
            }

            @l
            public final Integer getSize() {
                return this.size;
            }

            public int hashCode() {
                Integer num = this.size;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                UniversalColor universalColor = this.color;
                return iHashCode + (universalColor != null ? universalColor.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Spinner(size=");
                sb2.append(this.size);
                sb2.append(", color=");
                return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.color, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                Integer num = this.size;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num);
                }
                parcel.writeParcelable(this.color, flags);
            }
        }

        /* compiled from: BeduinIconButtonModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Style> {
            @Override // android.os.Parcelable.Creator
            public final Style createFromParcel(Parcel parcel) {
                return new Style(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UniversalColor) parcel.readParcelable(Style.class.getClassLoader()), (UniversalColor) parcel.readParcelable(Style.class.getClassLoader()), parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Shadows.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Spinner.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Style[] newArray(int i12) {
                return new Style[i12];
            }
        }

        public Style(@l Integer num, @l UniversalColor universalColor, @l UniversalColor universalColor2, @l BeduinContainerIndent beduinContainerIndent, @l Shadows shadows, @l Spinner spinner) {
            this.cornerRadius = num;
            this.backgroundColor = universalColor;
            this.highlightedColor = universalColor2;
            this.contentInsets = beduinContainerIndent;
            this.shadows = shadows;
            this.spinner = spinner;
        }

        public static /* synthetic */ Style copy$default(Style style, Integer num, UniversalColor universalColor, UniversalColor universalColor2, BeduinContainerIndent beduinContainerIndent, Shadows shadows, Spinner spinner, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                num = style.cornerRadius;
            }
            if ((i12 & 2) != 0) {
                universalColor = style.backgroundColor;
            }
            UniversalColor universalColor3 = universalColor;
            if ((i12 & 4) != 0) {
                universalColor2 = style.highlightedColor;
            }
            UniversalColor universalColor4 = universalColor2;
            if ((i12 & 8) != 0) {
                beduinContainerIndent = style.contentInsets;
            }
            BeduinContainerIndent beduinContainerIndent2 = beduinContainerIndent;
            if ((i12 & 16) != 0) {
                shadows = style.shadows;
            }
            Shadows shadows2 = shadows;
            if ((i12 & 32) != 0) {
                spinner = style.spinner;
            }
            return style.copy(num, universalColor3, universalColor4, beduinContainerIndent2, shadows2, spinner);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Integer getCornerRadius() {
            return this.cornerRadius;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final UniversalColor getHighlightedColor() {
            return this.highlightedColor;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final BeduinContainerIndent getContentInsets() {
            return this.contentInsets;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final Shadows getShadows() {
            return this.shadows;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final Spinner getSpinner() {
            return this.spinner;
        }

        @k
        public final Style copy(@l Integer cornerRadius, @l UniversalColor backgroundColor, @l UniversalColor highlightedColor, @l BeduinContainerIndent contentInsets, @l Shadows shadows, @l Spinner spinner) {
            return new Style(cornerRadius, backgroundColor, highlightedColor, contentInsets, shadows, spinner);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Style)) {
                return false;
            }
            Style style = (Style) other;
            return L.f(this.cornerRadius, style.cornerRadius) && L.f(this.backgroundColor, style.backgroundColor) && L.f(this.highlightedColor, style.highlightedColor) && L.f(this.contentInsets, style.contentInsets) && L.f(this.shadows, style.shadows) && L.f(this.spinner, style.spinner);
        }

        @l
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @l
        public final BeduinContainerIndent getContentInsets() {
            return this.contentInsets;
        }

        @l
        public final Integer getCornerRadius() {
            return this.cornerRadius;
        }

        @l
        public final UniversalColor getHighlightedColor() {
            return this.highlightedColor;
        }

        @l
        public final Shadows getShadows() {
            return this.shadows;
        }

        @l
        public final Spinner getSpinner() {
            return this.spinner;
        }

        public int hashCode() {
            Integer num = this.cornerRadius;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            UniversalColor universalColor = this.backgroundColor;
            int iHashCode2 = (iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
            UniversalColor universalColor2 = this.highlightedColor;
            int iHashCode3 = (iHashCode2 + (universalColor2 == null ? 0 : universalColor2.hashCode())) * 31;
            BeduinContainerIndent beduinContainerIndent = this.contentInsets;
            int iHashCode4 = (iHashCode3 + (beduinContainerIndent == null ? 0 : beduinContainerIndent.hashCode())) * 31;
            Shadows shadows = this.shadows;
            int iHashCode5 = (iHashCode4 + (shadows == null ? 0 : shadows.hashCode())) * 31;
            Spinner spinner = this.spinner;
            return iHashCode5 + (spinner != null ? spinner.hashCode() : 0);
        }

        @k
        public String toString() {
            return "Style(cornerRadius=" + this.cornerRadius + ", backgroundColor=" + this.backgroundColor + ", highlightedColor=" + this.highlightedColor + ", contentInsets=" + this.contentInsets + ", shadows=" + this.shadows + ", spinner=" + this.spinner + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Integer num = this.cornerRadius;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            parcel.writeParcelable(this.backgroundColor, flags);
            parcel.writeParcelable(this.highlightedColor, flags);
            BeduinContainerIndent beduinContainerIndent = this.contentInsets;
            if (beduinContainerIndent == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                beduinContainerIndent.writeToParcel(parcel, flags);
            }
            Shadows shadows = this.shadows;
            if (shadows == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                shadows.writeToParcel(parcel, flags);
            }
            Spinner spinner = this.spinner;
            if (spinner == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                spinner.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: BeduinIconButtonModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinIconButtonModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinIconButtonModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String string = parcel.readString();
            ArrayList arrayList = null;
            LocalIcon localIconCreateFromParcel = parcel.readInt() == 0 ? null : LocalIcon.CREATOR.createFromParcel(parcel);
            IconBase64 iconBase64CreateFromParcel = parcel.readInt() == 0 ? null : IconBase64.CREATOR.createFromParcel(parcel);
            LayoutMode layoutModeValueOf = parcel.readInt() == 0 ? null : LayoutMode.valueOf(parcel.readString());
            Size sizeCreateFromParcel = parcel.readInt() == 0 ? null : Size.CREATOR.createFromParcel(parcel);
            int iL2 = 0;
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
            Style styleCreateFromParcel = parcel.readInt() == 0 ? null : Style.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinIconButtonModel.class, parcel, arrayList, iL2, 1);
                }
            }
            return new BeduinIconButtonModel(string, localIconCreateFromParcel, iconBase64CreateFromParcel, layoutModeValueOf, sizeCreateFromParcel, boolValueOf, boolValueOf2, styleCreateFromParcel, arrayList, (DisplayingPredicate) parcel.readParcelable(BeduinIconButtonModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinIconButtonModel[] newArray(int i12) {
            return new BeduinIconButtonModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinIconButtonModel(@k String str, @l LocalIcon localIcon, @l IconBase64 iconBase64, @l LayoutMode layoutMode, @l Size size, @l Boolean bool, @l Boolean bool2, @l Style style, @l List<? extends BeduinAction> list, @l DisplayingPredicate displayingPredicate) {
        this.id = str;
        this.localIcon = localIcon;
        this.base64Icon = iconBase64;
        this.layoutMode = layoutMode;
        this.size = size;
        this.isEnabled = bool;
        this.isLoading = bool2;
        this.style = style;
        this.actions = list;
        this.displayingPredicate = displayingPredicate;
    }

    public static /* synthetic */ BeduinIconButtonModel copy$default(BeduinIconButtonModel beduinIconButtonModel, String str, LocalIcon localIcon, IconBase64 iconBase64, LayoutMode layoutMode, Size size, Boolean bool, Boolean bool2, Style style, List list, DisplayingPredicate displayingPredicate, int i12, Object obj) {
        return beduinIconButtonModel.copy((i12 & 1) != 0 ? beduinIconButtonModel.id : str, (i12 & 2) != 0 ? beduinIconButtonModel.localIcon : localIcon, (i12 & 4) != 0 ? beduinIconButtonModel.base64Icon : iconBase64, (i12 & 8) != 0 ? beduinIconButtonModel.layoutMode : layoutMode, (i12 & 16) != 0 ? beduinIconButtonModel.size : size, (i12 & 32) != 0 ? beduinIconButtonModel.isEnabled : bool, (i12 & 64) != 0 ? beduinIconButtonModel.isLoading : bool2, (i12 & 128) != 0 ? beduinIconButtonModel.style : style, (i12 & 256) != 0 ? beduinIconButtonModel.actions : list, (i12 & 512) != 0 ? beduinIconButtonModel.displayingPredicate : displayingPredicate);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, null, null, null, null, null, null, null, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), 511, null) : transform instanceof IsEnabledTransform ? copy$default(this, null, null, null, null, null, Boolean.valueOf(((IsEnabledTransform) transform).isEnabled()), null, null, null, null, 991, null) : transform instanceof IsLoadingTransform ? copy$default(this, null, null, null, null, null, null, Boolean.valueOf(((IsLoadingTransform) transform).isLoading()), null, null, null, 959, null) : this;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final LocalIcon getLocalIcon() {
        return this.localIcon;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final IconBase64 getBase64Icon() {
        return this.base64Icon;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final LayoutMode getLayoutMode() {
        return this.layoutMode;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Boolean getIsLoading() {
        return this.isLoading;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    @l
    public final List<BeduinAction> component9() {
        return this.actions;
    }

    @k
    public final BeduinIconButtonModel copy(@k String id2, @l LocalIcon localIcon, @l IconBase64 base64Icon, @l LayoutMode layoutMode, @l Size size, @l Boolean isEnabled, @l Boolean isLoading, @l Style style, @l List<? extends BeduinAction> actions, @l DisplayingPredicate displayingPredicate) {
        return new BeduinIconButtonModel(id2, localIcon, base64Icon, layoutMode, size, isEnabled, isLoading, style, actions, displayingPredicate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinIconButtonModel)) {
            return false;
        }
        BeduinIconButtonModel beduinIconButtonModel = (BeduinIconButtonModel) other;
        return L.f(this.id, beduinIconButtonModel.id) && L.f(this.localIcon, beduinIconButtonModel.localIcon) && L.f(this.base64Icon, beduinIconButtonModel.base64Icon) && this.layoutMode == beduinIconButtonModel.layoutMode && L.f(this.size, beduinIconButtonModel.size) && L.f(this.isEnabled, beduinIconButtonModel.isEnabled) && L.f(this.isLoading, beduinIconButtonModel.isLoading) && L.f(this.style, beduinIconButtonModel.style) && L.f(this.actions, beduinIconButtonModel.actions) && L.f(this.displayingPredicate, beduinIconButtonModel.displayingPredicate);
    }

    @l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @l
    public final IconBase64 getBase64Icon() {
        return this.base64Icon;
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
    public final LayoutMode getLayoutMode() {
        return this.layoutMode;
    }

    @l
    public final LocalIcon getLocalIcon() {
        return this.localIcon;
    }

    @l
    public final Size getSize() {
        return this.size;
    }

    @l
    public final Style getStyle() {
        return this.style;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        LocalIcon localIcon = this.localIcon;
        int iHashCode2 = (iHashCode + (localIcon == null ? 0 : localIcon.hashCode())) * 31;
        IconBase64 iconBase64 = this.base64Icon;
        int iHashCode3 = (iHashCode2 + (iconBase64 == null ? 0 : iconBase64.hashCode())) * 31;
        LayoutMode layoutMode = this.layoutMode;
        int iHashCode4 = (iHashCode3 + (layoutMode == null ? 0 : layoutMode.hashCode())) * 31;
        Size size = this.size;
        int iHashCode5 = (iHashCode4 + (size == null ? 0 : size.hashCode())) * 31;
        Boolean bool = this.isEnabled;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isLoading;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Style style = this.style;
        int iHashCode8 = (iHashCode7 + (style == null ? 0 : style.hashCode())) * 31;
        List<BeduinAction> list = this.actions;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        return iHashCode9 + (displayingPredicate != null ? displayingPredicate.hashCode() : 0);
    }

    @l
    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    @l
    public final Boolean isLoading() {
        return this.isLoading;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinIconButtonModel(id=");
        sb2.append(this.id);
        sb2.append(", localIcon=");
        sb2.append(this.localIcon);
        sb2.append(", base64Icon=");
        sb2.append(this.base64Icon);
        sb2.append(", layoutMode=");
        sb2.append(this.layoutMode);
        sb2.append(", size=");
        sb2.append(this.size);
        sb2.append(", isEnabled=");
        sb2.append(this.isEnabled);
        sb2.append(", isLoading=");
        sb2.append(this.isLoading);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", actions=");
        sb2.append(this.actions);
        sb2.append(", displayingPredicate=");
        return AK.c.l(sb2, this.displayingPredicate, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
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
        LayoutMode layoutMode = this.layoutMode;
        if (layoutMode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(layoutMode.name());
        }
        Size size = this.size;
        if (size == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            size.writeToParcel(parcel, flags);
        }
        Boolean bool = this.isEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.isLoading;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        Style style = this.style;
        if (style == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            style.writeToParcel(parcel, flags);
        }
        List<BeduinAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeParcelable(this.displayingPredicate, flags);
    }
}
