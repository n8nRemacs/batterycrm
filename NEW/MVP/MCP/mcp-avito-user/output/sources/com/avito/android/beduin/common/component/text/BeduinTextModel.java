package com.avito.android.beduin.common.component.text;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.AttributedTextTransform;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.beduin_shared.common.form.transforms.TextTransform;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinTextModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0018\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0098\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u0010\u001eJ\u0010\u00103\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b:\u00104J \u0010?\u001a\u00020>2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b?\u0010@R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010A\u001a\u0004\bC\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010D\u001a\u0004\bE\u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010F\u001a\u0004\bG\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bH\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010I\u001a\u0004\bJ\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010K\u001a\u0004\bL\u0010(R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010K\u001a\u0004\bM\u0010(R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010N\u001a\u0004\bO\u0010+R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010P\u001a\u0004\bQ\u0010-R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010R\u001a\u0004\bS\u0010/¨\u0006T"}, d2 = {"Lcom/avito/android/beduin/common/component/text/BeduinTextModel;", "Lcom/avito/android/beduin/common/component/text/BeduinAbstractTextModel;", "", "id", "text", "", "numberOfLines", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedText", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "Lcom/avito/android/remote/model/UniversalColor;", "textColor", "linkColor", "Lcom/avito/android/beduin/common/component/text/Alignment;", "alignment", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/beduin/common/component/text/Alignment;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "()Lcom/avito/android/remote/model/text/AttributedText;", "component5", "component6", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "component7", "()Lcom/avito/android/remote/model/UniversalColor;", "component8", "component9", "()Lcom/avito/android/beduin/common/component/text/Alignment;", "component10", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component11", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/beduin/common/component/text/Alignment;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;)Lcom/avito/android/beduin/common/component/text/BeduinTextModel;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getText", "Ljava/lang/Integer;", "getNumberOfLines", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttributedText", "getStyle", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "getTheme", "Lcom/avito/android/remote/model/UniversalColor;", "getTextColor", "getLinkColor", "Lcom/avito/android/beduin/common/component/text/Alignment;", "getAlignment", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Ljava/util/List;", "getActions", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinTextModel extends BeduinAbstractTextModel {

    @k
    public static final Parcelable.Creator<BeduinTextModel> CREATOR = new a();

    @l
    private final List<BeduinAction> actions;

    @l
    private final Alignment alignment;

    @l
    private final AttributedText attributedText;

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @l
    private final UniversalColor linkColor;

    @l
    private final Integer numberOfLines;

    @l
    private final String style;

    @l
    private final String text;

    @l
    private final UniversalColor textColor;

    @l
    private final BeduinComponentTheme theme;

    /* compiled from: BeduinTextModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinTextModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinTextModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            AttributedText attributedText = (AttributedText) parcel.readParcelable(BeduinTextModel.class.getClassLoader());
            String string3 = parcel.readString();
            BeduinComponentTheme beduinComponentThemeCreateFromParcel = parcel.readInt() == 0 ? null : BeduinComponentTheme.CREATOR.createFromParcel(parcel);
            UniversalColor universalColor = (UniversalColor) parcel.readParcelable(BeduinTextModel.class.getClassLoader());
            UniversalColor universalColor2 = (UniversalColor) parcel.readParcelable(BeduinTextModel.class.getClassLoader());
            Alignment alignmentValueOf = parcel.readInt() == 0 ? null : Alignment.valueOf(parcel.readString());
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinTextModel.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinTextModel.class, parcel, arrayList, iL2, 1);
                }
            }
            return new BeduinTextModel(string, string2, numValueOf, attributedText, string3, beduinComponentThemeCreateFromParcel, universalColor, universalColor2, alignmentValueOf, displayingPredicate, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinTextModel[] newArray(int i12) {
            return new BeduinTextModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinTextModel(@k String str, @l String str2, @l Integer num, @l AttributedText attributedText, @l String str3, @l BeduinComponentTheme beduinComponentTheme, @l UniversalColor universalColor, @l UniversalColor universalColor2, @l Alignment alignment, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinAction> list) {
        this.id = str;
        this.text = str2;
        this.numberOfLines = num;
        this.attributedText = attributedText;
        this.style = str3;
        this.theme = beduinComponentTheme;
        this.textColor = universalColor;
        this.linkColor = universalColor2;
        this.alignment = alignment;
        this.displayingPredicate = displayingPredicate;
        this.actions = list;
    }

    public static /* synthetic */ BeduinTextModel copy$default(BeduinTextModel beduinTextModel, String str, String str2, Integer num, AttributedText attributedText, String str3, BeduinComponentTheme beduinComponentTheme, UniversalColor universalColor, UniversalColor universalColor2, Alignment alignment, DisplayingPredicate displayingPredicate, List list, int i12, Object obj) {
        return beduinTextModel.copy((i12 & 1) != 0 ? beduinTextModel.id : str, (i12 & 2) != 0 ? beduinTextModel.text : str2, (i12 & 4) != 0 ? beduinTextModel.numberOfLines : num, (i12 & 8) != 0 ? beduinTextModel.attributedText : attributedText, (i12 & 16) != 0 ? beduinTextModel.style : str3, (i12 & 32) != 0 ? beduinTextModel.theme : beduinComponentTheme, (i12 & 64) != 0 ? beduinTextModel.textColor : universalColor, (i12 & 128) != 0 ? beduinTextModel.linkColor : universalColor2, (i12 & 256) != 0 ? beduinTextModel.alignment : alignment, (i12 & 512) != 0 ? beduinTextModel.displayingPredicate : displayingPredicate, (i12 & 1024) != 0 ? beduinTextModel.actions : list);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, null, null, null, null, null, null, null, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, 1535, null) : transform instanceof TextTransform ? copy$default(this, null, ((TextTransform) transform).getText(), null, null, null, null, null, null, null, null, null, 2045, null) : transform instanceof AttributedTextTransform ? copy$default(this, null, null, null, ((AttributedTextTransform) transform).getAttributedText(), null, null, null, null, null, null, null, 2039, null) : this;
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
    public final List<BeduinAction> component11() {
        return this.actions;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Integer getNumberOfLines() {
        return this.numberOfLines;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final AttributedText getAttributedText() {
        return this.attributedText;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final UniversalColor getTextColor() {
        return this.textColor;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final UniversalColor getLinkColor() {
        return this.linkColor;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final Alignment getAlignment() {
        return this.alignment;
    }

    @k
    public final BeduinTextModel copy(@k String id2, @l String text, @l Integer numberOfLines, @l AttributedText attributedText, @l String style, @l BeduinComponentTheme theme, @l UniversalColor textColor, @l UniversalColor linkColor, @l Alignment alignment, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinAction> actions) {
        return new BeduinTextModel(id2, text, numberOfLines, attributedText, style, theme, textColor, linkColor, alignment, displayingPredicate, actions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinTextModel)) {
            return false;
        }
        BeduinTextModel beduinTextModel = (BeduinTextModel) other;
        return L.f(this.id, beduinTextModel.id) && L.f(this.text, beduinTextModel.text) && L.f(this.numberOfLines, beduinTextModel.numberOfLines) && L.f(this.attributedText, beduinTextModel.attributedText) && L.f(this.style, beduinTextModel.style) && this.theme == beduinTextModel.theme && L.f(this.textColor, beduinTextModel.textColor) && L.f(this.linkColor, beduinTextModel.linkColor) && this.alignment == beduinTextModel.alignment && L.f(this.displayingPredicate, beduinTextModel.displayingPredicate) && L.f(this.actions, beduinTextModel.actions);
    }

    @l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @Override // com.avito.android.beduin.common.component.text.BeduinAbstractTextModel
    @l
    public Alignment getAlignment() {
        return this.alignment;
    }

    @Override // com.avito.android.beduin.common.component.text.BeduinAbstractTextModel
    @l
    public AttributedText getAttributedText() {
        return this.attributedText;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF100854c() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId */
    public String getF100853b() {
        return this.id;
    }

    @Override // com.avito.android.beduin.common.component.text.BeduinAbstractTextModel
    @l
    public UniversalColor getLinkColor() {
        return this.linkColor;
    }

    @Override // com.avito.android.beduin.common.component.text.BeduinAbstractTextModel
    @l
    public Integer getNumberOfLines() {
        return this.numberOfLines;
    }

    @Override // com.avito.android.beduin.common.component.text.BeduinAbstractTextModel
    @l
    public String getStyle() {
        return this.style;
    }

    @Override // com.avito.android.beduin.common.component.text.BeduinAbstractTextModel
    @l
    public String getText() {
        return this.text;
    }

    @Override // com.avito.android.beduin.common.component.text.BeduinAbstractTextModel
    @l
    public UniversalColor getTextColor() {
        return this.textColor;
    }

    @Override // com.avito.android.beduin.common.component.text.BeduinAbstractTextModel
    @l
    public BeduinComponentTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.text;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.numberOfLines;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        AttributedText attributedText = this.attributedText;
        int iHashCode4 = (iHashCode3 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str2 = this.style;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BeduinComponentTheme beduinComponentTheme = this.theme;
        int iHashCode6 = (iHashCode5 + (beduinComponentTheme == null ? 0 : beduinComponentTheme.hashCode())) * 31;
        UniversalColor universalColor = this.textColor;
        int iHashCode7 = (iHashCode6 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        UniversalColor universalColor2 = this.linkColor;
        int iHashCode8 = (iHashCode7 + (universalColor2 == null ? 0 : universalColor2.hashCode())) * 31;
        Alignment alignment = this.alignment;
        int iHashCode9 = (iHashCode8 + (alignment == null ? 0 : alignment.hashCode())) * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode10 = (iHashCode9 + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        List<BeduinAction> list = this.actions;
        return iHashCode10 + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinTextModel(id=");
        sb2.append(this.id);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", numberOfLines=");
        sb2.append(this.numberOfLines);
        sb2.append(", attributedText=");
        sb2.append(this.attributedText);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", theme=");
        sb2.append(this.theme);
        sb2.append(", textColor=");
        sb2.append(this.textColor);
        sb2.append(", linkColor=");
        sb2.append(this.linkColor);
        sb2.append(", alignment=");
        sb2.append(this.alignment);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", actions=");
        return H.p(sb2, this.actions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.text);
        Integer num = this.numberOfLines;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.attributedText, flags);
        parcel.writeString(this.style);
        BeduinComponentTheme beduinComponentTheme = this.theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.textColor, flags);
        parcel.writeParcelable(this.linkColor, flags);
        Alignment alignment = this.alignment;
        if (alignment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(alignment.name());
        }
        parcel.writeParcelable(this.displayingPredicate, flags);
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
