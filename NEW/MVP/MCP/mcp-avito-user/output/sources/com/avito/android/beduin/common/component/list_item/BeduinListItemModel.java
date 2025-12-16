package com.avito.android.beduin.common.component.list_item;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.model.icon.IconBase64;
import com.avito.android.beduin.common.component.model.icon.LocalIcon;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DetailsTransform;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.SubtitleTransform;
import com.avito.android.beduin.common.form.transforms.UpdateRightIconTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinListItemModel.kt */
@d
@Keep
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001:\u0003[\\]B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010 J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010 J\u0012\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010 J\u0012\u0010.\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b2\u00103J¤\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b6\u0010 J\u0010\u00108\u001a\u000207HÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010=\u001a\u00020<2\b\u0010;\u001a\u0004\u0018\u00010:HÖ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u000207HÖ\u0001¢\u0006\u0004\b?\u00109J \u0010D\u001a\u00020C2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u000207HÖ\u0001¢\u0006\u0004\bD\u0010ER\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010F\u001a\u0004\bG\u0010 R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010H\u001a\u0004\bI\u0010\"R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010J\u001a\u0004\bK\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010L\u001a\u0004\bM\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010N\u001a\u0004\bO\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010F\u001a\u0004\bP\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010F\u001a\u0004\bQ\u0010 R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010R\u001a\u0004\bS\u0010,R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010F\u001a\u0004\bT\u0010 R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010U\u001a\u0004\bV\u0010/R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010W\u001a\u0004\bX\u00101R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010Y\u001a\u0004\bZ\u00103¨\u0006^"}, d2 = {"Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "title", "subtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedSubtitle", "details", "Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Link;", "link", "Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$Left;", "leftIcon", "Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$Right;", "rightIcon", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Style;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Link;Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$Left;Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$Right;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Ljava/util/List;", "component4", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "component5", "()Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Style;", "component6", "component7", "component8", "()Lcom/avito/android/remote/model/text/AttributedText;", "component9", "component10", "()Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Link;", "component11", "()Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$Left;", "component12", "()Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$Right;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Style;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Link;Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$Left;Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$Right;)Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Ljava/util/List;", "getActions", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "getTheme", "Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Style;", "getStyle", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttributedSubtitle", "getDetails", "Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Link;", "getLink", "Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$Left;", "getLeftIcon", "Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$Right;", "getRightIcon", "Icon", "Link", "Style", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinListItemModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinListItemModel> CREATOR = new a();

    @l
    private final List<BeduinAction> actions;

    @l
    private final AttributedText attributedSubtitle;

    @l
    private final String details;

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @l
    private final Icon.Left leftIcon;

    @l
    private final Link link;

    @l
    private final Icon.Right rightIcon;

    @l
    private final Style style;

    @l
    private final String subtitle;

    @l
    private final BeduinComponentTheme theme;

    @l
    private final String title;

    /* compiled from: BeduinListItemModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon;", "Landroid/os/Parcelable;", "Alignment", "Left", "RemoteIcon", "Right", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Icon extends Parcelable {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: BeduinListItemModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$Alignment;", "", "(Ljava/lang/String;I)V", "CENTER", "FIRST_LINE_CENTER", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Alignment {

            @c("center")
            public static final Alignment CENTER;

            @c("firstLineCenter")
            public static final Alignment FIRST_LINE_CENTER;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Alignment[] f101692b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f101693c;

            static {
                Alignment alignment = new Alignment("CENTER", 0);
                CENTER = alignment;
                Alignment alignment2 = new Alignment("FIRST_LINE_CENTER", 1);
                FIRST_LINE_CENTER = alignment2;
                Alignment[] alignmentArr = {alignment, alignment2};
                f101692b = alignmentArr;
                f101693c = kotlin.enums.c.a(alignmentArr);
            }

            private Alignment(String str, int i12) {
            }

            public static Alignment valueOf(String str) {
                return (Alignment) Enum.valueOf(Alignment.class, str);
            }

            public static Alignment[] values() {
                return (Alignment[]) f101692b.clone();
            }
        }

        /* compiled from: BeduinListItemModel.kt */
        @Keep
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0013¨\u00060"}, d2 = {"Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$Left;", "Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon;", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "localIcon", "Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "base64Icon", "Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$RemoteIcon;", "remoteIcon", "Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$Alignment;", "alignment", "<init>", "(Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/common/component/model/icon/IconBase64;Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$RemoteIcon;Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$Alignment;)V", "component1", "()Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "component2", "()Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "component3", "()Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$RemoteIcon;", "component4", "()Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$Alignment;", "copy", "(Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/common/component/model/icon/IconBase64;Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$RemoteIcon;Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$Alignment;)Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$Left;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "getLocalIcon", "Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "getBase64Icon", "Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$RemoteIcon;", "getRemoteIcon", "Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$Alignment;", "getAlignment", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class Left implements Icon {

            @k
            public static final Parcelable.Creator<Left> CREATOR = new a();

            @l
            private final Alignment alignment;

            @l
            private final IconBase64 base64Icon;

            @l
            private final LocalIcon localIcon;

            @l
            private final RemoteIcon remoteIcon;

            /* compiled from: BeduinListItemModel.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Left> {
                @Override // android.os.Parcelable.Creator
                public final Left createFromParcel(Parcel parcel) {
                    return new Left(parcel.readInt() == 0 ? null : LocalIcon.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : IconBase64.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RemoteIcon.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Alignment.valueOf(parcel.readString()) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final Left[] newArray(int i12) {
                    return new Left[i12];
                }
            }

            public Left(@l LocalIcon localIcon, @l IconBase64 iconBase64, @l RemoteIcon remoteIcon, @l Alignment alignment) {
                this.localIcon = localIcon;
                this.base64Icon = iconBase64;
                this.remoteIcon = remoteIcon;
                this.alignment = alignment;
            }

            public static /* synthetic */ Left copy$default(Left left, LocalIcon localIcon, IconBase64 iconBase64, RemoteIcon remoteIcon, Alignment alignment, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    localIcon = left.localIcon;
                }
                if ((i12 & 2) != 0) {
                    iconBase64 = left.base64Icon;
                }
                if ((i12 & 4) != 0) {
                    remoteIcon = left.remoteIcon;
                }
                if ((i12 & 8) != 0) {
                    alignment = left.alignment;
                }
                return left.copy(localIcon, iconBase64, remoteIcon, alignment);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final LocalIcon getLocalIcon() {
                return this.localIcon;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final IconBase64 getBase64Icon() {
                return this.base64Icon;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final RemoteIcon getRemoteIcon() {
                return this.remoteIcon;
            }

            @l
            /* renamed from: component4, reason: from getter */
            public final Alignment getAlignment() {
                return this.alignment;
            }

            @k
            public final Left copy(@l LocalIcon localIcon, @l IconBase64 base64Icon, @l RemoteIcon remoteIcon, @l Alignment alignment) {
                return new Left(localIcon, base64Icon, remoteIcon, alignment);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Left)) {
                    return false;
                }
                Left left = (Left) other;
                return L.f(this.localIcon, left.localIcon) && L.f(this.base64Icon, left.base64Icon) && L.f(this.remoteIcon, left.remoteIcon) && this.alignment == left.alignment;
            }

            @l
            public final Alignment getAlignment() {
                return this.alignment;
            }

            @l
            public IconBase64 getBase64Icon() {
                return this.base64Icon;
            }

            @l
            public LocalIcon getLocalIcon() {
                return this.localIcon;
            }

            @l
            public RemoteIcon getRemoteIcon() {
                return this.remoteIcon;
            }

            public int hashCode() {
                LocalIcon localIcon = this.localIcon;
                int iHashCode = (localIcon == null ? 0 : localIcon.hashCode()) * 31;
                IconBase64 iconBase64 = this.base64Icon;
                int iHashCode2 = (iHashCode + (iconBase64 == null ? 0 : iconBase64.hashCode())) * 31;
                RemoteIcon remoteIcon = this.remoteIcon;
                int iHashCode3 = (iHashCode2 + (remoteIcon == null ? 0 : remoteIcon.hashCode())) * 31;
                Alignment alignment = this.alignment;
                return iHashCode3 + (alignment != null ? alignment.hashCode() : 0);
            }

            @k
            public String toString() {
                return "Left(localIcon=" + this.localIcon + ", base64Icon=" + this.base64Icon + ", remoteIcon=" + this.remoteIcon + ", alignment=" + this.alignment + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
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
                RemoteIcon remoteIcon = this.remoteIcon;
                if (remoteIcon == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    remoteIcon.writeToParcel(parcel, flags);
                }
                Alignment alignment = this.alignment;
                if (alignment == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(alignment.name());
                }
            }
        }

        /* compiled from: BeduinListItemModel.kt */
        @Keep
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$RemoteIcon;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Image;", "image", "Lcom/avito/android/remote/model/Size;", "size", "<init>", "(Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Size;)V", "component1", "()Lcom/avito/android/remote/model/Image;", "component2", "()Lcom/avito/android/remote/model/Size;", "copy", "(Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Size;)Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$RemoteIcon;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Image;", "getImage", "Lcom/avito/android/remote/model/Size;", "getSize", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class RemoteIcon implements Parcelable {

            @k
            public static final Parcelable.Creator<RemoteIcon> CREATOR = new a();

            @k
            private final Image image;

            @k
            private final Size size;

            /* compiled from: BeduinListItemModel.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<RemoteIcon> {
                @Override // android.os.Parcelable.Creator
                public final RemoteIcon createFromParcel(Parcel parcel) {
                    return new RemoteIcon((Image) parcel.readParcelable(RemoteIcon.class.getClassLoader()), (Size) parcel.readParcelable(RemoteIcon.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final RemoteIcon[] newArray(int i12) {
                    return new RemoteIcon[i12];
                }
            }

            public RemoteIcon(@k Image image, @k Size size) {
                this.image = image;
                this.size = size;
            }

            public static /* synthetic */ RemoteIcon copy$default(RemoteIcon remoteIcon, Image image, Size size, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    image = remoteIcon.image;
                }
                if ((i12 & 2) != 0) {
                    size = remoteIcon.size;
                }
                return remoteIcon.copy(image, size);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final Image getImage() {
                return this.image;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final Size getSize() {
                return this.size;
            }

            @k
            public final RemoteIcon copy(@k Image image, @k Size size) {
                return new RemoteIcon(image, size);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RemoteIcon)) {
                    return false;
                }
                RemoteIcon remoteIcon = (RemoteIcon) other;
                return L.f(this.image, remoteIcon.image) && L.f(this.size, remoteIcon.size);
            }

            @k
            public final Image getImage() {
                return this.image;
            }

            @k
            public final Size getSize() {
                return this.size;
            }

            public int hashCode() {
                return this.size.hashCode() + (this.image.hashCode() * 31);
            }

            @k
            public String toString() {
                return "RemoteIcon(image=" + this.image + ", size=" + this.size + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeParcelable(this.image, flags);
                parcel.writeParcelable(this.size, flags);
            }
        }

        /* compiled from: BeduinListItemModel.kt */
        @Keep
        @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JR\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b&\u0010 J \u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b+\u0010,R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\u0016R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u0010\u0018¨\u00067"}, d2 = {"Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$Right;", "Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon;", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "localIcon", "Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "base64Icon", "Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$RemoteIcon;", "remoteIcon", "Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$Alignment;", "alignment", "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "<init>", "(Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/common/component/model/icon/IconBase64;Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$RemoteIcon;Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$Alignment;Ljava/util/List;)V", "component1", "()Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "component2", "()Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "component3", "()Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$RemoteIcon;", "component4", "()Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$Alignment;", "component5", "()Ljava/util/List;", "copy", "(Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/common/component/model/icon/IconBase64;Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$RemoteIcon;Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$Alignment;Ljava/util/List;)Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$Right;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "getLocalIcon", "Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "getBase64Icon", "Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$RemoteIcon;", "getRemoteIcon", "Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Icon$Alignment;", "getAlignment", "Ljava/util/List;", "getActions", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class Right implements Icon {

            @k
            public static final Parcelable.Creator<Right> CREATOR = new a();

            @l
            private final List<BeduinAction> actions;

            @l
            private final Alignment alignment;

            @l
            private final IconBase64 base64Icon;

            @l
            private final LocalIcon localIcon;

            @l
            private final RemoteIcon remoteIcon;

            /* compiled from: BeduinListItemModel.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Right> {
                @Override // android.os.Parcelable.Creator
                public final Right createFromParcel(Parcel parcel) {
                    ArrayList arrayList = null;
                    LocalIcon localIconCreateFromParcel = parcel.readInt() == 0 ? null : LocalIcon.CREATOR.createFromParcel(parcel);
                    IconBase64 iconBase64CreateFromParcel = parcel.readInt() == 0 ? null : IconBase64.CREATOR.createFromParcel(parcel);
                    RemoteIcon remoteIconCreateFromParcel = parcel.readInt() == 0 ? null : RemoteIcon.CREATOR.createFromParcel(parcel);
                    Alignment alignmentValueOf = parcel.readInt() == 0 ? null : Alignment.valueOf(parcel.readString());
                    if (parcel.readInt() != 0) {
                        int i12 = parcel.readInt();
                        arrayList = new ArrayList(i12);
                        int iL2 = 0;
                        while (iL2 != i12) {
                            iL2 = com.avito.android.actions_sheet.a.l(Right.class, parcel, arrayList, iL2, 1);
                        }
                    }
                    return new Right(localIconCreateFromParcel, iconBase64CreateFromParcel, remoteIconCreateFromParcel, alignmentValueOf, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Right[] newArray(int i12) {
                    return new Right[i12];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Right(@l LocalIcon localIcon, @l IconBase64 iconBase64, @l RemoteIcon remoteIcon, @l Alignment alignment, @l List<? extends BeduinAction> list) {
                this.localIcon = localIcon;
                this.base64Icon = iconBase64;
                this.remoteIcon = remoteIcon;
                this.alignment = alignment;
                this.actions = list;
            }

            public static /* synthetic */ Right copy$default(Right right, LocalIcon localIcon, IconBase64 iconBase64, RemoteIcon remoteIcon, Alignment alignment, List list, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    localIcon = right.localIcon;
                }
                if ((i12 & 2) != 0) {
                    iconBase64 = right.base64Icon;
                }
                IconBase64 iconBase642 = iconBase64;
                if ((i12 & 4) != 0) {
                    remoteIcon = right.remoteIcon;
                }
                RemoteIcon remoteIcon2 = remoteIcon;
                if ((i12 & 8) != 0) {
                    alignment = right.alignment;
                }
                Alignment alignment2 = alignment;
                if ((i12 & 16) != 0) {
                    list = right.actions;
                }
                return right.copy(localIcon, iconBase642, remoteIcon2, alignment2, list);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final LocalIcon getLocalIcon() {
                return this.localIcon;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final IconBase64 getBase64Icon() {
                return this.base64Icon;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final RemoteIcon getRemoteIcon() {
                return this.remoteIcon;
            }

            @l
            /* renamed from: component4, reason: from getter */
            public final Alignment getAlignment() {
                return this.alignment;
            }

            @l
            public final List<BeduinAction> component5() {
                return this.actions;
            }

            @k
            public final Right copy(@l LocalIcon localIcon, @l IconBase64 base64Icon, @l RemoteIcon remoteIcon, @l Alignment alignment, @l List<? extends BeduinAction> actions) {
                return new Right(localIcon, base64Icon, remoteIcon, alignment, actions);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Right)) {
                    return false;
                }
                Right right = (Right) other;
                return L.f(this.localIcon, right.localIcon) && L.f(this.base64Icon, right.base64Icon) && L.f(this.remoteIcon, right.remoteIcon) && this.alignment == right.alignment && L.f(this.actions, right.actions);
            }

            @l
            public final List<BeduinAction> getActions() {
                return this.actions;
            }

            @l
            public final Alignment getAlignment() {
                return this.alignment;
            }

            @l
            public IconBase64 getBase64Icon() {
                return this.base64Icon;
            }

            @l
            public LocalIcon getLocalIcon() {
                return this.localIcon;
            }

            @l
            public RemoteIcon getRemoteIcon() {
                return this.remoteIcon;
            }

            public int hashCode() {
                LocalIcon localIcon = this.localIcon;
                int iHashCode = (localIcon == null ? 0 : localIcon.hashCode()) * 31;
                IconBase64 iconBase64 = this.base64Icon;
                int iHashCode2 = (iHashCode + (iconBase64 == null ? 0 : iconBase64.hashCode())) * 31;
                RemoteIcon remoteIcon = this.remoteIcon;
                int iHashCode3 = (iHashCode2 + (remoteIcon == null ? 0 : remoteIcon.hashCode())) * 31;
                Alignment alignment = this.alignment;
                int iHashCode4 = (iHashCode3 + (alignment == null ? 0 : alignment.hashCode())) * 31;
                List<BeduinAction> list = this.actions;
                return iHashCode4 + (list != null ? list.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Right(localIcon=");
                sb2.append(this.localIcon);
                sb2.append(", base64Icon=");
                sb2.append(this.base64Icon);
                sb2.append(", remoteIcon=");
                sb2.append(this.remoteIcon);
                sb2.append(", alignment=");
                sb2.append(this.alignment);
                sb2.append(", actions=");
                return H.p(sb2, this.actions, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
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
                RemoteIcon remoteIcon = this.remoteIcon;
                if (remoteIcon == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    remoteIcon.writeToParcel(parcel, flags);
                }
                Alignment alignment = this.alignment;
                if (alignment == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(alignment.name());
                }
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
    }

    /* compiled from: BeduinListItemModel.kt */
    @Keep
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\f¨\u0006#"}, d2 = {"Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Link;", "Landroid/os/Parcelable;", "", "text", "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Link;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Ljava/util/List;", "getActions", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Link implements Parcelable {

        @k
        public static final Parcelable.Creator<Link> CREATOR = new a();

        @k
        private final List<BeduinAction> actions;

        @l
        private final String text;

        /* compiled from: BeduinListItemModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Link> {
            @Override // android.os.Parcelable.Creator
            public final Link createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(Link.class, parcel, arrayList, iL2, 1);
                }
                return new Link(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Link[] newArray(int i12) {
                return new Link[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Link(@l String str, @k List<? extends BeduinAction> list) {
            this.text = str;
            this.actions = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Link copy$default(Link link, String str, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = link.text;
            }
            if ((i12 & 2) != 0) {
                list = link.actions;
            }
            return link.copy(str, list);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        public final List<BeduinAction> component2() {
            return this.actions;
        }

        @k
        public final Link copy(@l String text, @k List<? extends BeduinAction> actions) {
            return new Link(text, actions);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Link)) {
                return false;
            }
            Link link = (Link) other;
            return L.f(this.text, link.text) && L.f(this.actions, link.actions);
        }

        @k
        public final List<BeduinAction> getActions() {
            return this.actions;
        }

        @l
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            String str = this.text;
            return this.actions.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Link(text=");
            sb2.append(this.text);
            sb2.append(", actions=");
            return H.p(sb2, this.actions, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.text);
            Iterator itJ = C0.j(this.actions, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), flags);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinListItemModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/list_item/BeduinListItemModel$Style;", "", "(Ljava/lang/String;I)V", "STANDARD", "GRAY_SUBTITLE", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {

        @c("graySubtitle")
        public static final Style GRAY_SUBTITLE;

        @c("standard")
        public static final Style STANDARD;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Style[] f101694b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f101695c;

        static {
            Style style = new Style("STANDARD", 0);
            STANDARD = style;
            Style style2 = new Style("GRAY_SUBTITLE", 1);
            GRAY_SUBTITLE = style2;
            Style[] styleArr = {style, style2};
            f101694b = styleArr;
            f101695c = kotlin.enums.c.a(styleArr);
        }

        private Style(String str, int i12) {
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) f101694b.clone();
        }
    }

    /* compiled from: BeduinListItemModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinListItemModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinListItemModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinListItemModel.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinListItemModel.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new BeduinListItemModel(string, displayingPredicate, arrayList, parcel.readInt() == 0 ? null : BeduinComponentTheme.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Style.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(BeduinListItemModel.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Link.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Icon.Left.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Icon.Right.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinListItemModel[] newArray(int i12) {
            return new BeduinListItemModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinListItemModel(@k String str, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinAction> list, @l BeduinComponentTheme beduinComponentTheme, @l Style style, @l String str2, @l String str3, @l AttributedText attributedText, @l String str4, @l Link link, @l Icon.Left left, @l Icon.Right right) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.actions = list;
        this.theme = beduinComponentTheme;
        this.style = style;
        this.title = str2;
        this.subtitle = str3;
        this.attributedSubtitle = attributedText;
        this.details = str4;
        this.link = link;
        this.leftIcon = left;
        this.rightIcon = right;
    }

    public static /* synthetic */ BeduinListItemModel copy$default(BeduinListItemModel beduinListItemModel, String str, DisplayingPredicate displayingPredicate, List list, BeduinComponentTheme beduinComponentTheme, Style style, String str2, String str3, AttributedText attributedText, String str4, Link link, Icon.Left left, Icon.Right right, int i12, Object obj) {
        return beduinListItemModel.copy((i12 & 1) != 0 ? beduinListItemModel.id : str, (i12 & 2) != 0 ? beduinListItemModel.displayingPredicate : displayingPredicate, (i12 & 4) != 0 ? beduinListItemModel.actions : list, (i12 & 8) != 0 ? beduinListItemModel.theme : beduinComponentTheme, (i12 & 16) != 0 ? beduinListItemModel.style : style, (i12 & 32) != 0 ? beduinListItemModel.title : str2, (i12 & 64) != 0 ? beduinListItemModel.subtitle : str3, (i12 & 128) != 0 ? beduinListItemModel.attributedSubtitle : attributedText, (i12 & 256) != 0 ? beduinListItemModel.details : str4, (i12 & 512) != 0 ? beduinListItemModel.link : link, (i12 & 1024) != 0 ? beduinListItemModel.leftIcon : left, (i12 & 2048) != 0 ? beduinListItemModel.rightIcon : right);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        if (transform instanceof DisplayPredicateTransform) {
            return copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, null, null, null, null, null, null, null, 4093, null);
        }
        if (!(transform instanceof UpdateRightIconTransform)) {
            return transform instanceof DetailsTransform ? copy$default(this, null, null, null, null, null, null, null, null, ((DetailsTransform) transform).getDetails(), null, null, null, 3839, null) : transform instanceof SubtitleTransform ? copy$default(this, null, null, null, null, null, null, ((SubtitleTransform) transform).getSubtitle(), null, null, null, null, null, 4031, null) : this;
        }
        Parcelable parcelable = ((UpdateRightIconTransform) transform).f103415b;
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, parcelable instanceof Icon.Right ? (Icon.Right) parcelable : null, 2047, null);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final Link getLink() {
        return this.link;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final Icon.Left getLeftIcon() {
        return this.leftIcon;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final Icon.Right getRightIcon() {
        return this.rightIcon;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @l
    public final List<BeduinAction> component3() {
        return this.actions;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final AttributedText getAttributedSubtitle() {
        return this.attributedSubtitle;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final String getDetails() {
        return this.details;
    }

    @k
    public final BeduinListItemModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinAction> actions, @l BeduinComponentTheme theme, @l Style style, @l String title, @l String subtitle, @l AttributedText attributedSubtitle, @l String details, @l Link link, @l Icon.Left leftIcon, @l Icon.Right rightIcon) {
        return new BeduinListItemModel(id2, displayingPredicate, actions, theme, style, title, subtitle, attributedSubtitle, details, link, leftIcon, rightIcon);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinListItemModel)) {
            return false;
        }
        BeduinListItemModel beduinListItemModel = (BeduinListItemModel) other;
        return L.f(this.id, beduinListItemModel.id) && L.f(this.displayingPredicate, beduinListItemModel.displayingPredicate) && L.f(this.actions, beduinListItemModel.actions) && this.theme == beduinListItemModel.theme && this.style == beduinListItemModel.style && L.f(this.title, beduinListItemModel.title) && L.f(this.subtitle, beduinListItemModel.subtitle) && L.f(this.attributedSubtitle, beduinListItemModel.attributedSubtitle) && L.f(this.details, beduinListItemModel.details) && L.f(this.link, beduinListItemModel.link) && L.f(this.leftIcon, beduinListItemModel.leftIcon) && L.f(this.rightIcon, beduinListItemModel.rightIcon);
    }

    @l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @l
    public final AttributedText getAttributedSubtitle() {
        return this.attributedSubtitle;
    }

    @l
    public final String getDetails() {
        return this.details;
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

    @l
    public final Icon.Left getLeftIcon() {
        return this.leftIcon;
    }

    @l
    public final Link getLink() {
        return this.link;
    }

    @l
    public final Icon.Right getRightIcon() {
        return this.rightIcon;
    }

    @l
    public final Style getStyle() {
        return this.style;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final BeduinComponentTheme getTheme() {
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
        List<BeduinAction> list = this.actions;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        BeduinComponentTheme beduinComponentTheme = this.theme;
        int iHashCode4 = (iHashCode3 + (beduinComponentTheme == null ? 0 : beduinComponentTheme.hashCode())) * 31;
        Style style = this.style;
        int iHashCode5 = (iHashCode4 + (style == null ? 0 : style.hashCode())) * 31;
        String str = this.title;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AttributedText attributedText = this.attributedSubtitle;
        int iHashCode8 = (iHashCode7 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str3 = this.details;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Link link = this.link;
        int iHashCode10 = (iHashCode9 + (link == null ? 0 : link.hashCode())) * 31;
        Icon.Left left = this.leftIcon;
        int iHashCode11 = (iHashCode10 + (left == null ? 0 : left.hashCode())) * 31;
        Icon.Right right = this.rightIcon;
        return iHashCode11 + (right != null ? right.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BeduinListItemModel(id=" + this.id + ", displayingPredicate=" + this.displayingPredicate + ", actions=" + this.actions + ", theme=" + this.theme + ", style=" + this.style + ", title=" + this.title + ", subtitle=" + this.subtitle + ", attributedSubtitle=" + this.attributedSubtitle + ", details=" + this.details + ", link=" + this.link + ", leftIcon=" + this.leftIcon + ", rightIcon=" + this.rightIcon + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
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
        BeduinComponentTheme beduinComponentTheme = this.theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, flags);
        }
        Style style = this.style;
        if (style == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(style.name());
        }
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.attributedSubtitle, flags);
        parcel.writeString(this.details);
        Link link = this.link;
        if (link == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            link.writeToParcel(parcel, flags);
        }
        Icon.Left left = this.leftIcon;
        if (left == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            left.writeToParcel(parcel, flags);
        }
        Icon.Right right = this.rightIcon;
        if (right == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            right.writeToParcel(parcel, flags);
        }
    }
}
