package com.avito.android.beduin.common.component.checkbox_group_aggregator;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.checkbox.CheckboxState;
import com.avito.android.beduin.common.component.checkbox_list_item.BeduinCheckboxListItemModel;
import com.avito.android.beduin.common.component.checkbox_list_item.CheckboxTapArea;
import com.avito.android.beduin.common.component.checkbox_list_item.CheckboxVerticalPosition;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.utils.C28809e;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CheckboxGroupAggregatorModel.kt */
@K51.d
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/component/checkbox_group_aggregator/CheckboxGroupAggregatorModel;", "Lcom/avito/android/beduin_models/BeduinModel;", "Lcom/avito/android/beduin/common/component/d;", "Lcom/avito/android/beduin/network/parse/a;", "Body", "a", "Header", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CheckboxGroupAggregatorModel implements BeduinModel, com.avito.android.beduin.common.component.d, com.avito.android.beduin.network.parse.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f100947b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DisplayingPredicate f100948c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Header f100949d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Body f100950e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final BeduinComponentTheme f100951f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final CheckboxTapArea f100952g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final ArrayList f100953h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final ArrayList f100954i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final ArrayList f100955j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final BeduinContainerIndent f100956k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final UniversalColor f100957l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final CheckboxVerticalPosition f100958m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final Object f100959n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final Object f100960o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final Object f100961p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public static final a f100944q = new a(null);

    @k
    public static final Parcelable.Creator<CheckboxGroupAggregatorModel> CREATOR = new b();

    /* renamed from: r, reason: collision with root package name */
    @k
    public static final List<String> f100945r = Collections.singletonList("checkboxGroupAggregator");

    /* renamed from: s, reason: collision with root package name */
    @k
    public static final Class<CheckboxGroupAggregatorModel> f100946s = CheckboxGroupAggregatorModel.class;

    /* compiled from: CheckboxGroupAggregatorModel.kt */
    @Keep
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\f¨\u0006$"}, d2 = {"Lcom/avito/android/beduin/common/component/checkbox_group_aggregator/CheckboxGroupAggregatorModel$Body;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/beduin_models/BeduinModel;", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "", "interItemSpacing", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Integer;", "copy", "(Ljava/util/List;Ljava/lang/Integer;)Lcom/avito/android/beduin/common/component/checkbox_group_aggregator/CheckboxGroupAggregatorModel$Body;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getChildren", "Ljava/lang/Integer;", "getInterItemSpacing", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Body implements Parcelable {

        @k
        public static final Parcelable.Creator<Body> CREATOR = new a();

        @k
        private final List<BeduinModel> children;

        @l
        private final Integer interItemSpacing;

        /* compiled from: CheckboxGroupAggregatorModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Body> {
            @Override // android.os.Parcelable.Creator
            public final Body createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(Body.class, parcel, arrayList, iL2, 1);
                }
                return new Body(arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Body[] newArray(int i12) {
                return new Body[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Body(@k List<? extends BeduinModel> list, @l Integer num) {
            this.children = list;
            this.interItemSpacing = num;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Body copy$default(Body body, List list, Integer num, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = body.children;
            }
            if ((i12 & 2) != 0) {
                num = body.interItemSpacing;
            }
            return body.copy(list, num);
        }

        @k
        public final List<BeduinModel> component1() {
            return this.children;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Integer getInterItemSpacing() {
            return this.interItemSpacing;
        }

        @k
        public final Body copy(@k List<? extends BeduinModel> children, @l Integer interItemSpacing) {
            return new Body(children, interItemSpacing);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Body)) {
                return false;
            }
            Body body = (Body) other;
            return L.f(this.children, body.children) && L.f(this.interItemSpacing, body.interItemSpacing);
        }

        @k
        public final List<BeduinModel> getChildren() {
            return this.children;
        }

        @l
        public final Integer getInterItemSpacing() {
            return this.interItemSpacing;
        }

        public int hashCode() {
            int iHashCode = this.children.hashCode() * 31;
            Integer num = this.interItemSpacing;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Body(children=");
            sb2.append(this.children);
            sb2.append(", interItemSpacing=");
            return s.j(sb2, this.interItemSpacing, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Iterator itJ = C0.j(this.children, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), flags);
            }
            Integer num = this.interItemSpacing;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
        }
    }

    /* compiled from: CheckboxGroupAggregatorModel.kt */
    @Keep
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\f¨\u0006$"}, d2 = {"Lcom/avito/android/beduin/common/component/checkbox_group_aggregator/CheckboxGroupAggregatorModel$Header;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/beduin_models/BeduinModel;", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "", "interItemSpacing", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Integer;", "copy", "(Ljava/util/List;Ljava/lang/Integer;)Lcom/avito/android/beduin/common/component/checkbox_group_aggregator/CheckboxGroupAggregatorModel$Header;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getChildren", "Ljava/lang/Integer;", "getInterItemSpacing", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Header implements Parcelable {

        @k
        public static final Parcelable.Creator<Header> CREATOR = new a();

        @k
        private final List<BeduinModel> children;

        @l
        private final Integer interItemSpacing;

        /* compiled from: CheckboxGroupAggregatorModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Header> {
            @Override // android.os.Parcelable.Creator
            public final Header createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(Header.class, parcel, arrayList, iL2, 1);
                }
                return new Header(arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Header[] newArray(int i12) {
                return new Header[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Header(@k List<? extends BeduinModel> list, @l Integer num) {
            this.children = list;
            this.interItemSpacing = num;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Header copy$default(Header header, List list, Integer num, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = header.children;
            }
            if ((i12 & 2) != 0) {
                num = header.interItemSpacing;
            }
            return header.copy(list, num);
        }

        @k
        public final List<BeduinModel> component1() {
            return this.children;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Integer getInterItemSpacing() {
            return this.interItemSpacing;
        }

        @k
        public final Header copy(@k List<? extends BeduinModel> children, @l Integer interItemSpacing) {
            return new Header(children, interItemSpacing);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return L.f(this.children, header.children) && L.f(this.interItemSpacing, header.interItemSpacing);
        }

        @k
        public final List<BeduinModel> getChildren() {
            return this.children;
        }

        @l
        public final Integer getInterItemSpacing() {
            return this.interItemSpacing;
        }

        public int hashCode() {
            int iHashCode = this.children.hashCode() * 31;
            Integer num = this.interItemSpacing;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Header(children=");
            sb2.append(this.children);
            sb2.append(", interItemSpacing=");
            return s.j(sb2, this.interItemSpacing, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Iterator itJ = C0.j(this.children, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), flags);
            }
            Integer num = this.interItemSpacing;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
        }
    }

    /* compiled from: CheckboxGroupAggregatorModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/checkbox_group_aggregator/CheckboxGroupAggregatorModel$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<CheckboxGroupAggregatorModel> S() {
            return CheckboxGroupAggregatorModel.f100946s;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return CheckboxGroupAggregatorModel.f100945r;
        }

        public a() {
        }
    }

    /* compiled from: CheckboxGroupAggregatorModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<CheckboxGroupAggregatorModel> {
        @Override // android.os.Parcelable.Creator
        public final CheckboxGroupAggregatorModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(CheckboxGroupAggregatorModel.class.getClassLoader());
            Header headerCreateFromParcel = Header.CREATOR.createFromParcel(parcel);
            Body bodyCreateFromParcel = Body.CREATOR.createFromParcel(parcel);
            BeduinComponentTheme beduinComponentThemeCreateFromParcel = parcel.readInt() == 0 ? null : BeduinComponentTheme.CREATOR.createFromParcel(parcel);
            CheckboxTapArea checkboxTapAreaValueOf = parcel.readInt() == 0 ? null : CheckboxTapArea.valueOf(parcel.readString());
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(CheckboxGroupAggregatorModel.class, parcel, arrayList, iL3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                int iL4 = 0;
                while (iL4 != i13) {
                    iL4 = com.avito.android.actions_sheet.a.l(CheckboxGroupAggregatorModel.class, parcel, arrayList4, iL4, 1);
                }
                arrayList2 = arrayList4;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i14);
                while (iL2 != i14) {
                    iL2 = com.avito.android.actions_sheet.a.l(CheckboxGroupAggregatorModel.class, parcel, arrayList5, iL2, 1);
                }
                arrayList3 = arrayList5;
            }
            return new CheckboxGroupAggregatorModel(string, displayingPredicate, headerCreateFromParcel, bodyCreateFromParcel, beduinComponentThemeCreateFromParcel, checkboxTapAreaValueOf, arrayList, arrayList2, arrayList3, parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel), (UniversalColor) parcel.readParcelable(CheckboxGroupAggregatorModel.class.getClassLoader()), parcel.readInt() != 0 ? CheckboxVerticalPosition.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CheckboxGroupAggregatorModel[] newArray(int i12) {
            return new CheckboxGroupAggregatorModel[i12];
        }
    }

    public CheckboxGroupAggregatorModel(@k String str, @l DisplayingPredicate displayingPredicate, @k Header header, @k Body body, @l BeduinComponentTheme beduinComponentTheme, @l CheckboxTapArea checkboxTapArea, @l ArrayList arrayList, @l ArrayList arrayList2, @l ArrayList arrayList3, @l BeduinContainerIndent beduinContainerIndent, @l UniversalColor universalColor, @l CheckboxVerticalPosition checkboxVerticalPosition) {
        this.f100947b = str;
        this.f100948c = displayingPredicate;
        this.f100949d = header;
        this.f100950e = body;
        this.f100951f = beduinComponentTheme;
        this.f100952g = checkboxTapArea;
        this.f100953h = arrayList;
        this.f100954i = arrayList2;
        this.f100955j = arrayList3;
        this.f100956k = beduinContainerIndent;
        this.f100957l = universalColor;
        this.f100958m = checkboxVerticalPosition;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f100959n = C42727D.b(lazyThreadSafetyMode, new d(this));
        this.f100960o = C42727D.b(lazyThreadSafetyMode, new c(this));
        this.f100961p = C42727D.b(lazyThreadSafetyMode, new com.avito.android.beduin.common.component.checkbox_group_aggregator.a(this));
    }

    public static CheckboxGroupAggregatorModel a(CheckboxGroupAggregatorModel checkboxGroupAggregatorModel, DisplayingPredicate displayingPredicate, Header header, Body body, int i12) {
        String str = checkboxGroupAggregatorModel.f100947b;
        DisplayingPredicate displayingPredicate2 = (i12 & 2) != 0 ? checkboxGroupAggregatorModel.f100948c : displayingPredicate;
        Header header2 = (i12 & 4) != 0 ? checkboxGroupAggregatorModel.f100949d : header;
        Body body2 = (i12 & 8) != 0 ? checkboxGroupAggregatorModel.f100950e : body;
        BeduinComponentTheme beduinComponentTheme = checkboxGroupAggregatorModel.f100951f;
        CheckboxTapArea checkboxTapArea = checkboxGroupAggregatorModel.f100952g;
        ArrayList arrayList = checkboxGroupAggregatorModel.f100953h;
        ArrayList arrayList2 = checkboxGroupAggregatorModel.f100954i;
        ArrayList arrayList3 = checkboxGroupAggregatorModel.f100955j;
        BeduinContainerIndent beduinContainerIndent = checkboxGroupAggregatorModel.f100956k;
        UniversalColor universalColor = checkboxGroupAggregatorModel.f100957l;
        CheckboxVerticalPosition checkboxVerticalPosition = checkboxGroupAggregatorModel.f100958m;
        checkboxGroupAggregatorModel.getClass();
        return new CheckboxGroupAggregatorModel(str, displayingPredicate2, header2, body2, beduinComponentTheme, checkboxTapArea, arrayList, arrayList2, arrayList3, beduinContainerIndent, universalColor, checkboxVerticalPosition);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public final BeduinModel apply(@k BeduinModelTransform beduinModelTransform) {
        return beduinModelTransform instanceof DisplayPredicateTransform ? a(this, ((DisplayPredicateTransform) beduinModelTransform).getDisplayingPredicate(), null, null, 4093) : this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckboxGroupAggregatorModel)) {
            return false;
        }
        CheckboxGroupAggregatorModel checkboxGroupAggregatorModel = (CheckboxGroupAggregatorModel) obj;
        return L.f(this.f100947b, checkboxGroupAggregatorModel.f100947b) && L.f(this.f100948c, checkboxGroupAggregatorModel.f100948c) && L.f(this.f100949d, checkboxGroupAggregatorModel.f100949d) && L.f(this.f100950e, checkboxGroupAggregatorModel.f100950e) && this.f100951f == checkboxGroupAggregatorModel.f100951f && this.f100952g == checkboxGroupAggregatorModel.f100952g && L.f(this.f100953h, checkboxGroupAggregatorModel.f100953h) && L.f(this.f100954i, checkboxGroupAggregatorModel.f100954i) && L.f(this.f100955j, checkboxGroupAggregatorModel.f100955j) && L.f(this.f100956k, checkboxGroupAggregatorModel.f100956k) && L.f(this.f100957l, checkboxGroupAggregatorModel.f100957l) && L.f(this.f100958m, checkboxGroupAggregatorModel.f100958m);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public final List<BeduinModel> flatMap(@k Y41.l<? super BeduinModel, ? extends List<? extends BeduinModel>> lVar) {
        ?? r02 = this.f100959n;
        Object objG = C42745f0.G(((BeduinCheckboxListItemModel) r02.getValue()).flatMap(lVar));
        BeduinCheckboxListItemModel beduinCheckboxListItemModel = objG instanceof BeduinCheckboxListItemModel ? (BeduinCheckboxListItemModel) objG : null;
        if (beduinCheckboxListItemModel == null) {
            return C42784z0.f406748b;
        }
        Body body = this.f100950e;
        ArrayList arrayListC = C28809e.c(lVar, body.getChildren());
        List<BeduinModel> children = beduinCheckboxListItemModel.getContent().getChildren();
        Header header = this.f100949d;
        Header headerCopy$default = L.f(children, header.getChildren()) ? header : null;
        if (headerCopy$default == null) {
            headerCopy$default = Header.copy$default(header, children, null, 2, null);
        }
        CheckboxState state = beduinCheckboxListItemModel.getState();
        if (state != ((BeduinCheckboxListItemModel) r02.getValue()).getState()) {
            arrayListC = C28809e.c(new e(state), arrayListC);
        }
        Body bodyCopy$default = arrayListC.equals(body.getChildren()) ? body : null;
        if (bodyCopy$default == null) {
            bodyCopy$default = Body.copy$default(body, arrayListC, null, 2, null);
        }
        CheckboxGroupAggregatorModel checkboxGroupAggregatorModelA = (header.equals(headerCopy$default) && body.equals(bodyCopy$default)) ? this : null;
        if (checkboxGroupAggregatorModelA == null) {
            checkboxGroupAggregatorModelA = a(this, null, headerCopy$default, bodyCopy$default, 4083);
        }
        return (List) lVar.invoke(checkboxGroupAggregatorModelA);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.beduin_models.BeduinModel
    public final void forEach(@k Y41.l<? super BeduinModel, Boolean> lVar) {
        if (lVar.invoke(this).booleanValue()) {
            return;
        }
        ((BeduinCheckboxListItemModel) this.f100959n.getValue()).forEach(lVar);
        C28809e.e(lVar, this.f100950e.getChildren());
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate, reason: from getter */
    public final DisplayingPredicate getF102397d() {
        return this.f100948c;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId, reason: from getter */
    public final String getF102944b() {
        return this.f100947b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.beduin.common.component.d
    @k
    public final List<BeduinModel> getInlinedModels() {
        return C42745f0.h0((List) this.f100961p.getValue(), Collections.singletonList((BeduinCheckboxListItemModel) this.f100959n.getValue()));
    }

    public final int hashCode() {
        int iHashCode = this.f100947b.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.f100948c;
        int iHashCode2 = (this.f100950e.hashCode() + ((this.f100949d.hashCode() + ((iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31)) * 31)) * 31;
        BeduinComponentTheme beduinComponentTheme = this.f100951f;
        int iHashCode3 = (iHashCode2 + (beduinComponentTheme == null ? 0 : beduinComponentTheme.hashCode())) * 31;
        CheckboxTapArea checkboxTapArea = this.f100952g;
        int iHashCode4 = (iHashCode3 + (checkboxTapArea == null ? 0 : checkboxTapArea.hashCode())) * 31;
        ArrayList arrayList = this.f100953h;
        int iHashCode5 = (iHashCode4 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList arrayList2 = this.f100954i;
        int iHashCode6 = (iHashCode5 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        ArrayList arrayList3 = this.f100955j;
        int iHashCode7 = (iHashCode6 + (arrayList3 == null ? 0 : arrayList3.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent = this.f100956k;
        int iHashCode8 = (iHashCode7 + (beduinContainerIndent == null ? 0 : beduinContainerIndent.hashCode())) * 31;
        UniversalColor universalColor = this.f100957l;
        int iHashCode9 = (iHashCode8 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        CheckboxVerticalPosition checkboxVerticalPosition = this.f100958m;
        return iHashCode9 + (checkboxVerticalPosition != null ? checkboxVerticalPosition.hashCode() : 0);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    public final boolean isValid() {
        return C28809e.f(getInlinedModels());
    }

    @k
    public final String toString() {
        return "CheckboxGroupAggregatorModel(id=" + this.f100947b + ", displayingPredicate=" + this.f100948c + ", header=" + this.f100949d + ", body=" + this.f100950e + ", theme=" + this.f100951f + ", checkboxTapArea=" + this.f100952g + ", onCheckboxTapActions=" + this.f100953h + ", onCheckedActions=" + this.f100954i + ", onUncheckedActions=" + this.f100955j + ", padding=" + this.f100956k + ", selectedBackgroundColor=" + this.f100957l + ", checkboxVerticalPosition=" + this.f100958m + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f100947b);
        parcel.writeParcelable(this.f100948c, i12);
        this.f100949d.writeToParcel(parcel, i12);
        this.f100950e.writeToParcel(parcel, i12);
        BeduinComponentTheme beduinComponentTheme = this.f100951f;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, i12);
        }
        CheckboxTapArea checkboxTapArea = this.f100952g;
        if (checkboxTapArea == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(checkboxTapArea.name());
        }
        ArrayList arrayList = this.f100953h;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
            while (itY.hasNext()) {
                parcel.writeParcelable((Parcelable) itY.next(), i12);
            }
        }
        ArrayList arrayList2 = this.f100954i;
        if (arrayList2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itY2 = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList2);
            while (itY2.hasNext()) {
                parcel.writeParcelable((Parcelable) itY2.next(), i12);
            }
        }
        ArrayList arrayList3 = this.f100955j;
        if (arrayList3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itY3 = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList3);
            while (itY3.hasNext()) {
                parcel.writeParcelable((Parcelable) itY3.next(), i12);
            }
        }
        BeduinContainerIndent beduinContainerIndent = this.f100956k;
        if (beduinContainerIndent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f100957l, i12);
        CheckboxVerticalPosition checkboxVerticalPosition = this.f100958m;
        if (checkboxVerticalPosition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            checkboxVerticalPosition.writeToParcel(parcel, i12);
        }
    }
}
