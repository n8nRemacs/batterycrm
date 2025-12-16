package com.avito.android.beduin.common.component.text_with_icon;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.model.icon.IconBase64;
import com.avito.android.beduin.common.component.model.icon.IconPosition;
import com.avito.android.beduin.common.component.model.icon.LocalIcon;
import com.avito.android.beduin.common.component.text.Alignment;
import com.avito.android.beduin.common.component.text.BeduinAbstractTextModel;
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
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: BeduinTextWithIconModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010(J\u0012\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b3\u00102J\u0012\u00104\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b6\u00107J\u0018\u00108\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b@\u0010+J\u0012\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bA\u0010+J\u0012\u0010B\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bB\u0010CJà\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÆ\u0001¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bF\u0010(J\u0010\u0010G\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\bG\u0010HJ\u001a\u0010L\u001a\u00020K2\b\u0010J\u001a\u0004\u0018\u00010IHÖ\u0003¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\bN\u0010HJ \u0010S\u001a\u00020R2\u0006\u0010P\u001a\u00020O2\u0006\u0010Q\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\bS\u0010TR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010U\u001a\u0004\bV\u0010(R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010U\u001a\u0004\bW\u0010(R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010X\u001a\u0004\bY\u0010+R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010Z\u001a\u0004\b[\u0010-R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010U\u001a\u0004\b\\\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010]\u001a\u0004\b^\u00100R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010_\u001a\u0004\b`\u00102R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010_\u001a\u0004\ba\u00102R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010b\u001a\u0004\bc\u00105R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010d\u001a\u0004\be\u00107R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010f\u001a\u0004\bg\u00109R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010h\u001a\u0004\bi\u0010;R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010j\u001a\u0004\bk\u0010=R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010l\u001a\u0004\bm\u0010?R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010X\u001a\u0004\bn\u0010+R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010X\u001a\u0004\bo\u0010+R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010p\u001a\u0004\bq\u0010C¨\u0006r"}, d2 = {"Lcom/avito/android/beduin/common/component/text_with_icon/BeduinTextWithIconModel;", "Lcom/avito/android/beduin/common/component/text/BeduinAbstractTextModel;", "", "id", "text", "", "numberOfLines", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedText", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "Lcom/avito/android/remote/model/UniversalColor;", "textColor", "linkColor", "Lcom/avito/android/beduin/common/component/text/Alignment;", "alignment", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "base64Icon", "Lcom/avito/android/beduin/common/component/model/icon/IconPosition;", "iconPosition", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "localIcon", "iconSpacing", "iconHeight", "Lcom/avito/android/beduin/common/component/text_with_icon/IconAlignment;", "iconAlignment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/beduin/common/component/text/Alignment;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Lcom/avito/android/beduin/common/component/model/icon/IconBase64;Lcom/avito/android/beduin/common/component/model/icon/IconPosition;Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/beduin/common/component/text_with_icon/IconAlignment;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "()Lcom/avito/android/remote/model/text/AttributedText;", "component5", "component6", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "component7", "()Lcom/avito/android/remote/model/UniversalColor;", "component8", "component9", "()Lcom/avito/android/beduin/common/component/text/Alignment;", "component10", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component11", "()Ljava/util/List;", "component12", "()Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "component13", "()Lcom/avito/android/beduin/common/component/model/icon/IconPosition;", "component14", "()Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "component15", "component16", "component17", "()Lcom/avito/android/beduin/common/component/text_with_icon/IconAlignment;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/beduin/common/component/text/Alignment;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Lcom/avito/android/beduin/common/component/model/icon/IconBase64;Lcom/avito/android/beduin/common/component/model/icon/IconPosition;Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/beduin/common/component/text_with_icon/IconAlignment;)Lcom/avito/android/beduin/common/component/text_with_icon/BeduinTextWithIconModel;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getText", "Ljava/lang/Integer;", "getNumberOfLines", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttributedText", "getStyle", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "getTheme", "Lcom/avito/android/remote/model/UniversalColor;", "getTextColor", "getLinkColor", "Lcom/avito/android/beduin/common/component/text/Alignment;", "getAlignment", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Ljava/util/List;", "getActions", "Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "getBase64Icon", "Lcom/avito/android/beduin/common/component/model/icon/IconPosition;", "getIconPosition", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "getLocalIcon", "getIconSpacing", "getIconHeight", "Lcom/avito/android/beduin/common/component/text_with_icon/IconAlignment;", "getIconAlignment", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinTextWithIconModel extends BeduinAbstractTextModel {

    @k
    public static final Parcelable.Creator<BeduinTextWithIconModel> CREATOR = new a();

    @l
    private final List<BeduinAction> actions;

    @l
    private final Alignment alignment;

    @l
    private final AttributedText attributedText;

    @l
    private final IconBase64 base64Icon;

    @l
    private final DisplayingPredicate displayingPredicate;

    @l
    private final IconAlignment iconAlignment;

    @l
    private final Integer iconHeight;

    @l
    private final IconPosition iconPosition;

    @l
    private final Integer iconSpacing;

    @k
    private final String id;

    @l
    private final UniversalColor linkColor;

    @l
    private final LocalIcon localIcon;

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

    /* compiled from: BeduinTextWithIconModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinTextWithIconModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinTextWithIconModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            AttributedText attributedText = (AttributedText) parcel.readParcelable(BeduinTextWithIconModel.class.getClassLoader());
            String string3 = parcel.readString();
            BeduinComponentTheme beduinComponentThemeCreateFromParcel = parcel.readInt() == 0 ? null : BeduinComponentTheme.CREATOR.createFromParcel(parcel);
            UniversalColor universalColor = (UniversalColor) parcel.readParcelable(BeduinTextWithIconModel.class.getClassLoader());
            UniversalColor universalColor2 = (UniversalColor) parcel.readParcelable(BeduinTextWithIconModel.class.getClassLoader());
            Alignment alignmentValueOf = parcel.readInt() == 0 ? null : Alignment.valueOf(parcel.readString());
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinTextWithIconModel.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinTextWithIconModel.class, parcel, arrayList, iL2, 1);
                }
            }
            return new BeduinTextWithIconModel(string, string2, numValueOf, attributedText, string3, beduinComponentThemeCreateFromParcel, universalColor, universalColor2, alignmentValueOf, displayingPredicate, arrayList, parcel.readInt() == 0 ? null : IconBase64.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : IconPosition.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : LocalIcon.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : IconAlignment.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinTextWithIconModel[] newArray(int i12) {
            return new BeduinTextWithIconModel[i12];
        }
    }

    public /* synthetic */ BeduinTextWithIconModel(String str, String str2, Integer num, AttributedText attributedText, String str3, BeduinComponentTheme beduinComponentTheme, UniversalColor universalColor, UniversalColor universalColor2, Alignment alignment, DisplayingPredicate displayingPredicate, List list, IconBase64 iconBase64, IconPosition iconPosition, LocalIcon localIcon, Integer num2, Integer num3, IconAlignment iconAlignment, int i12, C42822w c42822w) {
        this(str, str2, num, attributedText, str3, beduinComponentTheme, universalColor, universalColor2, alignment, displayingPredicate, list, iconBase64, iconPosition, localIcon, num2, num3, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : iconAlignment);
    }

    public static /* synthetic */ BeduinTextWithIconModel copy$default(BeduinTextWithIconModel beduinTextWithIconModel, String str, String str2, Integer num, AttributedText attributedText, String str3, BeduinComponentTheme beduinComponentTheme, UniversalColor universalColor, UniversalColor universalColor2, Alignment alignment, DisplayingPredicate displayingPredicate, List list, IconBase64 iconBase64, IconPosition iconPosition, LocalIcon localIcon, Integer num2, Integer num3, IconAlignment iconAlignment, int i12, Object obj) {
        return beduinTextWithIconModel.copy((i12 & 1) != 0 ? beduinTextWithIconModel.id : str, (i12 & 2) != 0 ? beduinTextWithIconModel.text : str2, (i12 & 4) != 0 ? beduinTextWithIconModel.numberOfLines : num, (i12 & 8) != 0 ? beduinTextWithIconModel.attributedText : attributedText, (i12 & 16) != 0 ? beduinTextWithIconModel.style : str3, (i12 & 32) != 0 ? beduinTextWithIconModel.theme : beduinComponentTheme, (i12 & 64) != 0 ? beduinTextWithIconModel.textColor : universalColor, (i12 & 128) != 0 ? beduinTextWithIconModel.linkColor : universalColor2, (i12 & 256) != 0 ? beduinTextWithIconModel.alignment : alignment, (i12 & 512) != 0 ? beduinTextWithIconModel.displayingPredicate : displayingPredicate, (i12 & 1024) != 0 ? beduinTextWithIconModel.actions : list, (i12 & 2048) != 0 ? beduinTextWithIconModel.base64Icon : iconBase64, (i12 & 4096) != 0 ? beduinTextWithIconModel.iconPosition : iconPosition, (i12 & 8192) != 0 ? beduinTextWithIconModel.localIcon : localIcon, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? beduinTextWithIconModel.iconSpacing : num2, (i12 & 32768) != 0 ? beduinTextWithIconModel.iconHeight : num3, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? beduinTextWithIconModel.iconAlignment : iconAlignment);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, null, null, null, null, null, null, null, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, null, null, null, null, 130559, null) : transform instanceof TextTransform ? copy$default(this, null, ((TextTransform) transform).getText(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131069, null) : transform instanceof AttributedTextTransform ? copy$default(this, null, null, null, ((AttributedTextTransform) transform).getAttributedText(), null, null, null, null, null, null, null, null, null, null, null, null, null, 131063, null) : this;
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
    /* renamed from: component12, reason: from getter */
    public final IconBase64 getBase64Icon() {
        return this.base64Icon;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final IconPosition getIconPosition() {
        return this.iconPosition;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final LocalIcon getLocalIcon() {
        return this.localIcon;
    }

    @l
    /* renamed from: component15, reason: from getter */
    public final Integer getIconSpacing() {
        return this.iconSpacing;
    }

    @l
    /* renamed from: component16, reason: from getter */
    public final Integer getIconHeight() {
        return this.iconHeight;
    }

    @l
    /* renamed from: component17, reason: from getter */
    public final IconAlignment getIconAlignment() {
        return this.iconAlignment;
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
    public final BeduinTextWithIconModel copy(@k String id2, @l String text, @l Integer numberOfLines, @l AttributedText attributedText, @l String style, @l BeduinComponentTheme theme, @l UniversalColor textColor, @l UniversalColor linkColor, @l Alignment alignment, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinAction> actions, @l IconBase64 base64Icon, @l IconPosition iconPosition, @l LocalIcon localIcon, @l Integer iconSpacing, @l Integer iconHeight, @l IconAlignment iconAlignment) {
        return new BeduinTextWithIconModel(id2, text, numberOfLines, attributedText, style, theme, textColor, linkColor, alignment, displayingPredicate, actions, base64Icon, iconPosition, localIcon, iconSpacing, iconHeight, iconAlignment);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinTextWithIconModel)) {
            return false;
        }
        BeduinTextWithIconModel beduinTextWithIconModel = (BeduinTextWithIconModel) other;
        return L.f(this.id, beduinTextWithIconModel.id) && L.f(this.text, beduinTextWithIconModel.text) && L.f(this.numberOfLines, beduinTextWithIconModel.numberOfLines) && L.f(this.attributedText, beduinTextWithIconModel.attributedText) && L.f(this.style, beduinTextWithIconModel.style) && this.theme == beduinTextWithIconModel.theme && L.f(this.textColor, beduinTextWithIconModel.textColor) && L.f(this.linkColor, beduinTextWithIconModel.linkColor) && this.alignment == beduinTextWithIconModel.alignment && L.f(this.displayingPredicate, beduinTextWithIconModel.displayingPredicate) && L.f(this.actions, beduinTextWithIconModel.actions) && L.f(this.base64Icon, beduinTextWithIconModel.base64Icon) && this.iconPosition == beduinTextWithIconModel.iconPosition && L.f(this.localIcon, beduinTextWithIconModel.localIcon) && L.f(this.iconSpacing, beduinTextWithIconModel.iconSpacing) && L.f(this.iconHeight, beduinTextWithIconModel.iconHeight) && this.iconAlignment == beduinTextWithIconModel.iconAlignment;
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

    @l
    public final IconBase64 getBase64Icon() {
        return this.base64Icon;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF100854c() {
        return this.displayingPredicate;
    }

    @l
    public final IconAlignment getIconAlignment() {
        return this.iconAlignment;
    }

    @l
    public final Integer getIconHeight() {
        return this.iconHeight;
    }

    @l
    public final IconPosition getIconPosition() {
        return this.iconPosition;
    }

    @l
    public final Integer getIconSpacing() {
        return this.iconSpacing;
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

    @l
    public final LocalIcon getLocalIcon() {
        return this.localIcon;
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
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        IconBase64 iconBase64 = this.base64Icon;
        int iHashCode12 = (iHashCode11 + (iconBase64 == null ? 0 : iconBase64.hashCode())) * 31;
        IconPosition iconPosition = this.iconPosition;
        int iHashCode13 = (iHashCode12 + (iconPosition == null ? 0 : iconPosition.hashCode())) * 31;
        LocalIcon localIcon = this.localIcon;
        int iHashCode14 = (iHashCode13 + (localIcon == null ? 0 : localIcon.hashCode())) * 31;
        Integer num2 = this.iconSpacing;
        int iHashCode15 = (iHashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.iconHeight;
        int iHashCode16 = (iHashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        IconAlignment iconAlignment = this.iconAlignment;
        return iHashCode16 + (iconAlignment != null ? iconAlignment.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BeduinTextWithIconModel(id=" + this.id + ", text=" + this.text + ", numberOfLines=" + this.numberOfLines + ", attributedText=" + this.attributedText + ", style=" + this.style + ", theme=" + this.theme + ", textColor=" + this.textColor + ", linkColor=" + this.linkColor + ", alignment=" + this.alignment + ", displayingPredicate=" + this.displayingPredicate + ", actions=" + this.actions + ", base64Icon=" + this.base64Icon + ", iconPosition=" + this.iconPosition + ", localIcon=" + this.localIcon + ", iconSpacing=" + this.iconSpacing + ", iconHeight=" + this.iconHeight + ", iconAlignment=" + this.iconAlignment + ')';
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
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        IconBase64 iconBase64 = this.base64Icon;
        if (iconBase64 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iconBase64.writeToParcel(parcel, flags);
        }
        IconPosition iconPosition = this.iconPosition;
        if (iconPosition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(iconPosition.name());
        }
        LocalIcon localIcon = this.localIcon;
        if (localIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localIcon.writeToParcel(parcel, flags);
        }
        Integer num2 = this.iconSpacing;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Integer num3 = this.iconHeight;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
        IconAlignment iconAlignment = this.iconAlignment;
        if (iconAlignment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(iconAlignment.name());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinTextWithIconModel(@k String str, @l String str2, @l Integer num, @l AttributedText attributedText, @l String str3, @l BeduinComponentTheme beduinComponentTheme, @l UniversalColor universalColor, @l UniversalColor universalColor2, @l Alignment alignment, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinAction> list, @l IconBase64 iconBase64, @l IconPosition iconPosition, @l LocalIcon localIcon, @l Integer num2, @l Integer num3, @l IconAlignment iconAlignment) {
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
        this.base64Icon = iconBase64;
        this.iconPosition = iconPosition;
        this.localIcon = localIcon;
        this.iconSpacing = num2;
        this.iconHeight = num3;
        this.iconAlignment = iconAlignment;
    }
}
