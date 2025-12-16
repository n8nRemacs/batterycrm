package com.avito.android.beduin.common.component.grid_snippet_skeleton;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.container.BeduinContainerBackground;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinGridSnippetSkeletonModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0098\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0016J\u0010\u0010)\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b0\u0010*J \u00105\u001a\u0002042\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b5\u00106R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b<\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\b>\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b?\u0010\u001aR\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bA\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\bB\u0010\u001cR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\bC\u0010\u001cR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\bD\u0010\u001cR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010E\u001a\u0004\bF\u0010$R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bG\u0010$¨\u0006H"}, d2 = {"Lcom/avito/android/beduin/common/component/grid_snippet_skeleton/BeduinGridSnippetSkeletonModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "imageRatio", "", "titleHeight", "titleWidth", "", "lineWidths", "imageSpacing", "lineSpacing", "lineHeight", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "imageBackground", "linesBackground", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/beduin/common/container/BeduinContainerBackground;Lcom/avito/android/beduin/common/container/BeduinContainerBackground;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Ljava/lang/Float;", "component4", "()Ljava/lang/Integer;", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "component9", "component10", "()Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "component11", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/beduin/common/container/BeduinContainerBackground;Lcom/avito/android/beduin/common/container/BeduinContainerBackground;)Lcom/avito/android/beduin/common/component/grid_snippet_skeleton/BeduinGridSnippetSkeletonModel;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Ljava/lang/Float;", "getImageRatio", "Ljava/lang/Integer;", "getTitleHeight", "getTitleWidth", "Ljava/util/List;", "getLineWidths", "getImageSpacing", "getLineSpacing", "getLineHeight", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "getImageBackground", "getLinesBackground", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinGridSnippetSkeletonModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinGridSnippetSkeletonModel> CREATOR = new a();

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @l
    private final BeduinContainerBackground imageBackground;

    @l
    private final Float imageRatio;

    @l
    private final Integer imageSpacing;

    @l
    private final Integer lineHeight;

    @l
    private final Integer lineSpacing;

    @l
    private final List<Float> lineWidths;

    @l
    private final BeduinContainerBackground linesBackground;

    @l
    private final Integer titleHeight;

    @l
    private final Float titleWidth;

    /* compiled from: BeduinGridSnippetSkeletonModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinGridSnippetSkeletonModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinGridSnippetSkeletonModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinGridSnippetSkeletonModel.class.getClassLoader());
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Float fValueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(Float.valueOf(parcel.readFloat()));
                }
            }
            return new BeduinGridSnippetSkeletonModel(string, displayingPredicate, fValueOf, numValueOf, fValueOf2, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : BeduinContainerBackground.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BeduinContainerBackground.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinGridSnippetSkeletonModel[] newArray(int i12) {
            return new BeduinGridSnippetSkeletonModel[i12];
        }
    }

    public BeduinGridSnippetSkeletonModel(@k String str, @l DisplayingPredicate displayingPredicate, @l Float f12, @l Integer num, @l Float f13, @l List<Float> list, @l Integer num2, @l Integer num3, @l Integer num4, @l BeduinContainerBackground beduinContainerBackground, @l BeduinContainerBackground beduinContainerBackground2) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.imageRatio = f12;
        this.titleHeight = num;
        this.titleWidth = f13;
        this.lineWidths = list;
        this.imageSpacing = num2;
        this.lineSpacing = num3;
        this.lineHeight = num4;
        this.imageBackground = beduinContainerBackground;
        this.linesBackground = beduinContainerBackground2;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final BeduinContainerBackground getImageBackground() {
        return this.imageBackground;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final BeduinContainerBackground getLinesBackground() {
        return this.linesBackground;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Float getImageRatio() {
        return this.imageRatio;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Integer getTitleHeight() {
        return this.titleHeight;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Float getTitleWidth() {
        return this.titleWidth;
    }

    @l
    public final List<Float> component6() {
        return this.lineWidths;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Integer getImageSpacing() {
        return this.imageSpacing;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Integer getLineSpacing() {
        return this.lineSpacing;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final Integer getLineHeight() {
        return this.lineHeight;
    }

    @k
    public final BeduinGridSnippetSkeletonModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @l Float imageRatio, @l Integer titleHeight, @l Float titleWidth, @l List<Float> lineWidths, @l Integer imageSpacing, @l Integer lineSpacing, @l Integer lineHeight, @l BeduinContainerBackground imageBackground, @l BeduinContainerBackground linesBackground) {
        return new BeduinGridSnippetSkeletonModel(id2, displayingPredicate, imageRatio, titleHeight, titleWidth, lineWidths, imageSpacing, lineSpacing, lineHeight, imageBackground, linesBackground);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinGridSnippetSkeletonModel)) {
            return false;
        }
        BeduinGridSnippetSkeletonModel beduinGridSnippetSkeletonModel = (BeduinGridSnippetSkeletonModel) other;
        return L.f(this.id, beduinGridSnippetSkeletonModel.id) && L.f(this.displayingPredicate, beduinGridSnippetSkeletonModel.displayingPredicate) && L.f(this.imageRatio, beduinGridSnippetSkeletonModel.imageRatio) && L.f(this.titleHeight, beduinGridSnippetSkeletonModel.titleHeight) && L.f(this.titleWidth, beduinGridSnippetSkeletonModel.titleWidth) && L.f(this.lineWidths, beduinGridSnippetSkeletonModel.lineWidths) && L.f(this.imageSpacing, beduinGridSnippetSkeletonModel.imageSpacing) && L.f(this.lineSpacing, beduinGridSnippetSkeletonModel.lineSpacing) && L.f(this.lineHeight, beduinGridSnippetSkeletonModel.lineHeight) && L.f(this.imageBackground, beduinGridSnippetSkeletonModel.imageBackground) && L.f(this.linesBackground, beduinGridSnippetSkeletonModel.linesBackground);
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
    public final BeduinContainerBackground getImageBackground() {
        return this.imageBackground;
    }

    @l
    public final Float getImageRatio() {
        return this.imageRatio;
    }

    @l
    public final Integer getImageSpacing() {
        return this.imageSpacing;
    }

    @l
    public final Integer getLineHeight() {
        return this.lineHeight;
    }

    @l
    public final Integer getLineSpacing() {
        return this.lineSpacing;
    }

    @l
    public final List<Float> getLineWidths() {
        return this.lineWidths;
    }

    @l
    public final BeduinContainerBackground getLinesBackground() {
        return this.linesBackground;
    }

    @l
    public final Integer getTitleHeight() {
        return this.titleHeight;
    }

    @l
    public final Float getTitleWidth() {
        return this.titleWidth;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        Float f12 = this.imageRatio;
        int iHashCode3 = (iHashCode2 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Integer num = this.titleHeight;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Float f13 = this.titleWidth;
        int iHashCode5 = (iHashCode4 + (f13 == null ? 0 : f13.hashCode())) * 31;
        List<Float> list = this.lineWidths;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.imageSpacing;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.lineSpacing;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.lineHeight;
        int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        BeduinContainerBackground beduinContainerBackground = this.imageBackground;
        int iHashCode10 = (iHashCode9 + (beduinContainerBackground == null ? 0 : beduinContainerBackground.hashCode())) * 31;
        BeduinContainerBackground beduinContainerBackground2 = this.linesBackground;
        return iHashCode10 + (beduinContainerBackground2 != null ? beduinContainerBackground2.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BeduinGridSnippetSkeletonModel(id=" + this.id + ", displayingPredicate=" + this.displayingPredicate + ", imageRatio=" + this.imageRatio + ", titleHeight=" + this.titleHeight + ", titleWidth=" + this.titleWidth + ", lineWidths=" + this.lineWidths + ", imageSpacing=" + this.imageSpacing + ", lineSpacing=" + this.lineSpacing + ", lineHeight=" + this.lineHeight + ", imageBackground=" + this.imageBackground + ", linesBackground=" + this.linesBackground + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        Float f12 = this.imageRatio;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
        Integer num = this.titleHeight;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Float f13 = this.titleWidth;
        if (f13 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f13);
        }
        List<Float> list = this.lineWidths;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeFloat(((Number) itA.next()).floatValue());
            }
        }
        Integer num2 = this.imageSpacing;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Integer num3 = this.lineSpacing;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
        Integer num4 = this.lineHeight;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num4);
        }
        BeduinContainerBackground beduinContainerBackground = this.imageBackground;
        if (beduinContainerBackground == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerBackground.writeToParcel(parcel, flags);
        }
        BeduinContainerBackground beduinContainerBackground2 = this.linesBackground;
        if (beduinContainerBackground2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerBackground2.writeToParcel(parcel, flags);
        }
    }
}
