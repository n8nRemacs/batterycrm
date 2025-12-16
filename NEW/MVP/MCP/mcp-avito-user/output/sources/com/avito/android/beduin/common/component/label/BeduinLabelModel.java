package com.avito.android.beduin.common.component.label;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.LabelExpandTransform;
import com.avito.android.beduin.common.form.transforms.LabelTransform;
import com.avito.android.beduin.network.model.ExpandToken;
import com.avito.android.beduin.network.model.LabelTextAttributes;
import com.avito.android.beduin.network.model.LabelToken;
import com.avito.android.beduin.network.model.TextTruncation;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.Alignment;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinLabelModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010 J\u0012\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b2\u00103J\u0096\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b6\u0010 J\u0010\u00107\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010;\u001a\u00020\u00142\b\u0010:\u001a\u0004\u0018\u000109HÖ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b=\u00108J \u0010B\u001a\u00020A2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020\nHÖ\u0001¢\u0006\u0004\bB\u0010CR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010D\u001a\u0004\bE\u0010 R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bG\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010H\u001a\u0004\bI\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010J\u001a\u0004\bK\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010L\u001a\u0004\bM\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010D\u001a\u0004\bN\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010O\u001a\u0004\bP\u0010+R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010Q\u001a\u0004\bR\u0010-R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010S\u001a\u0004\bT\u0010/R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010U\u001a\u0004\bV\u00101R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010W\u001a\u0004\bX\u00103¨\u0006Y"}, d2 = {"Lcom/avito/android/beduin/common/component/label/BeduinLabelModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "Lcom/avito/android/remote/model/Alignment;", "alignment", "Lcom/avito/android/beduin/network/model/TextTruncation;", "truncation", "", "numberOfLines", "separator", "Lcom/avito/android/beduin/network/model/LabelTextAttributes;", Navigation.ATTRIBUTES, "", "Lcom/avito/android/beduin/network/model/LabelToken;", "tokens", "Lcom/avito/android/beduin/network/model/ExpandToken;", "expandToken", "", SearchParamsConverterKt.EXPANDED, "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/remote/model/Alignment;Lcom/avito/android/beduin/network/model/TextTruncation;Ljava/lang/Integer;Ljava/lang/String;Lcom/avito/android/beduin/network/model/LabelTextAttributes;Ljava/util/List;Lcom/avito/android/beduin/network/model/ExpandToken;Ljava/lang/Boolean;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Lcom/avito/android/remote/model/Alignment;", "component4", "()Lcom/avito/android/beduin/network/model/TextTruncation;", "component5", "()Ljava/lang/Integer;", "component6", "component7", "()Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "component8", "()Ljava/util/List;", "component9", "()Lcom/avito/android/beduin/network/model/ExpandToken;", "component10", "()Ljava/lang/Boolean;", "component11", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/remote/model/Alignment;Lcom/avito/android/beduin/network/model/TextTruncation;Ljava/lang/Integer;Ljava/lang/String;Lcom/avito/android/beduin/network/model/LabelTextAttributes;Ljava/util/List;Lcom/avito/android/beduin/network/model/ExpandToken;Ljava/lang/Boolean;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;)Lcom/avito/android/beduin/common/component/label/BeduinLabelModel;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Lcom/avito/android/remote/model/Alignment;", "getAlignment", "Lcom/avito/android/beduin/network/model/TextTruncation;", "getTruncation", "Ljava/lang/Integer;", "getNumberOfLines", "getSeparator", "Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "getAttributes", "Ljava/util/List;", "getTokens", "Lcom/avito/android/beduin/network/model/ExpandToken;", "getExpandToken", "Ljava/lang/Boolean;", "getExpanded", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "getTheme", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinLabelModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinLabelModel> CREATOR = new a();

    @l
    private final Alignment alignment;

    @l
    private final LabelTextAttributes attributes;

    @l
    private final DisplayingPredicate displayingPredicate;

    @l
    private final ExpandToken expandToken;

    @l
    private final Boolean expanded;

    @k
    private final String id;

    @l
    private final Integer numberOfLines;

    @l
    private final String separator;

    @l
    private final BeduinComponentTheme theme;

    @k
    private final List<LabelToken> tokens;

    @l
    private final TextTruncation truncation;

    /* compiled from: BeduinLabelModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinLabelModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinLabelModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinLabelModel.class.getClassLoader());
            Alignment alignmentValueOf = parcel.readInt() == 0 ? null : Alignment.valueOf(parcel.readString());
            TextTruncation textTruncationValueOf = parcel.readInt() == 0 ? null : TextTruncation.valueOf(parcel.readString());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            LabelTextAttributes labelTextAttributesCreateFromParcel = parcel.readInt() == 0 ? null : LabelTextAttributes.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(BeduinLabelModel.class, parcel, arrayList, iL2, 1);
            }
            ExpandToken expandTokenCreateFromParcel = parcel.readInt() == 0 ? null : ExpandToken.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BeduinLabelModel(string, displayingPredicate, alignmentValueOf, textTruncationValueOf, numValueOf, string2, labelTextAttributesCreateFromParcel, arrayList, expandTokenCreateFromParcel, boolValueOf, parcel.readInt() != 0 ? BeduinComponentTheme.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinLabelModel[] newArray(int i12) {
            return new BeduinLabelModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinLabelModel(@k String str, @l DisplayingPredicate displayingPredicate, @l Alignment alignment, @l TextTruncation textTruncation, @l Integer num, @l String str2, @l LabelTextAttributes labelTextAttributes, @k List<? extends LabelToken> list, @l ExpandToken expandToken, @l Boolean bool, @l BeduinComponentTheme beduinComponentTheme) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.alignment = alignment;
        this.truncation = textTruncation;
        this.numberOfLines = num;
        this.separator = str2;
        this.attributes = labelTextAttributes;
        this.tokens = list;
        this.expandToken = expandToken;
        this.expanded = bool;
        this.theme = beduinComponentTheme;
    }

    public static /* synthetic */ BeduinLabelModel copy$default(BeduinLabelModel beduinLabelModel, String str, DisplayingPredicate displayingPredicate, Alignment alignment, TextTruncation textTruncation, Integer num, String str2, LabelTextAttributes labelTextAttributes, List list, ExpandToken expandToken, Boolean bool, BeduinComponentTheme beduinComponentTheme, int i12, Object obj) {
        return beduinLabelModel.copy((i12 & 1) != 0 ? beduinLabelModel.id : str, (i12 & 2) != 0 ? beduinLabelModel.displayingPredicate : displayingPredicate, (i12 & 4) != 0 ? beduinLabelModel.alignment : alignment, (i12 & 8) != 0 ? beduinLabelModel.truncation : textTruncation, (i12 & 16) != 0 ? beduinLabelModel.numberOfLines : num, (i12 & 32) != 0 ? beduinLabelModel.separator : str2, (i12 & 64) != 0 ? beduinLabelModel.attributes : labelTextAttributes, (i12 & 128) != 0 ? beduinLabelModel.tokens : list, (i12 & 256) != 0 ? beduinLabelModel.expandToken : expandToken, (i12 & 512) != 0 ? beduinLabelModel.expanded : bool, (i12 & 1024) != 0 ? beduinLabelModel.theme : beduinComponentTheme);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, null, null, null, null, null, null, 2045, null) : transform instanceof LabelTransform ? copy$default(this, null, null, null, null, null, null, null, ((LabelTransform) transform).getTokens(), null, null, null, 1919, null) : transform instanceof LabelExpandTransform ? copy$default(this, null, null, null, null, null, null, null, null, null, Boolean.valueOf(((LabelExpandTransform) transform).f103385b), null, 1535, null) : this;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final Boolean getExpanded() {
        return this.expanded;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Alignment getAlignment() {
        return this.alignment;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final TextTruncation getTruncation() {
        return this.truncation;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Integer getNumberOfLines() {
        return this.numberOfLines;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getSeparator() {
        return this.separator;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final LabelTextAttributes getAttributes() {
        return this.attributes;
    }

    @k
    public final List<LabelToken> component8() {
        return this.tokens;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final ExpandToken getExpandToken() {
        return this.expandToken;
    }

    @k
    public final BeduinLabelModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @l Alignment alignment, @l TextTruncation truncation, @l Integer numberOfLines, @l String separator, @l LabelTextAttributes attributes, @k List<? extends LabelToken> tokens, @l ExpandToken expandToken, @l Boolean expanded, @l BeduinComponentTheme theme) {
        return new BeduinLabelModel(id2, displayingPredicate, alignment, truncation, numberOfLines, separator, attributes, tokens, expandToken, expanded, theme);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinLabelModel)) {
            return false;
        }
        BeduinLabelModel beduinLabelModel = (BeduinLabelModel) other;
        return L.f(this.id, beduinLabelModel.id) && L.f(this.displayingPredicate, beduinLabelModel.displayingPredicate) && this.alignment == beduinLabelModel.alignment && this.truncation == beduinLabelModel.truncation && L.f(this.numberOfLines, beduinLabelModel.numberOfLines) && L.f(this.separator, beduinLabelModel.separator) && L.f(this.attributes, beduinLabelModel.attributes) && L.f(this.tokens, beduinLabelModel.tokens) && L.f(this.expandToken, beduinLabelModel.expandToken) && L.f(this.expanded, beduinLabelModel.expanded) && this.theme == beduinLabelModel.theme;
    }

    @l
    public final Alignment getAlignment() {
        return this.alignment;
    }

    @l
    public final LabelTextAttributes getAttributes() {
        return this.attributes;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    public DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @l
    public final ExpandToken getExpandToken() {
        return this.expandToken;
    }

    @l
    public final Boolean getExpanded() {
        return this.expanded;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public String getId() {
        return this.id;
    }

    @l
    public final Integer getNumberOfLines() {
        return this.numberOfLines;
    }

    @l
    public final String getSeparator() {
        return this.separator;
    }

    @l
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    @k
    public final List<LabelToken> getTokens() {
        return this.tokens;
    }

    @l
    public final TextTruncation getTruncation() {
        return this.truncation;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        Alignment alignment = this.alignment;
        int iHashCode3 = (iHashCode2 + (alignment == null ? 0 : alignment.hashCode())) * 31;
        TextTruncation textTruncation = this.truncation;
        int iHashCode4 = (iHashCode3 + (textTruncation == null ? 0 : textTruncation.hashCode())) * 31;
        Integer num = this.numberOfLines;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.separator;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        LabelTextAttributes labelTextAttributes = this.attributes;
        int iE2 = H.e((iHashCode6 + (labelTextAttributes == null ? 0 : labelTextAttributes.hashCode())) * 31, 31, this.tokens);
        ExpandToken expandToken = this.expandToken;
        int iHashCode7 = (iE2 + (expandToken == null ? 0 : expandToken.hashCode())) * 31;
        Boolean bool = this.expanded;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        BeduinComponentTheme beduinComponentTheme = this.theme;
        return iHashCode8 + (beduinComponentTheme != null ? beduinComponentTheme.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BeduinLabelModel(id=" + this.id + ", displayingPredicate=" + this.displayingPredicate + ", alignment=" + this.alignment + ", truncation=" + this.truncation + ", numberOfLines=" + this.numberOfLines + ", separator=" + this.separator + ", attributes=" + this.attributes + ", tokens=" + this.tokens + ", expandToken=" + this.expandToken + ", expanded=" + this.expanded + ", theme=" + this.theme + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        Alignment alignment = this.alignment;
        if (alignment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(alignment.name());
        }
        TextTruncation textTruncation = this.truncation;
        if (textTruncation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(textTruncation.name());
        }
        Integer num = this.numberOfLines;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.separator);
        LabelTextAttributes labelTextAttributes = this.attributes;
        if (labelTextAttributes == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            labelTextAttributes.writeToParcel(parcel, flags);
        }
        Iterator itJ = C0.j(this.tokens, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        ExpandToken expandToken = this.expandToken;
        if (expandToken == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            expandToken.writeToParcel(parcel, flags);
        }
        Boolean bool = this.expanded;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        BeduinComponentTheme beduinComponentTheme = this.theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, flags);
        }
    }
}
