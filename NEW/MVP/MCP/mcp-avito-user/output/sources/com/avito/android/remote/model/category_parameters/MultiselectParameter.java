package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.UniversalCheckedImage;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.base.CanHaveTypeCorrection;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.HasConstraints;
import com.avito.android.remote.model.category_parameters.base.HasPlaceholder;
import com.avito.android.remote.model.category_parameters.base.Phantom;
import com.avito.android.remote.model.category_parameters.base.Visibility;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.util.O2;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: MultiselectParameter.kt */
@s0
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b2\b\u0087\b\u0018\u0000 \u0083\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\n\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001B\u008f\u0002\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0002\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010$\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0003H\u0016¢\u0006\u0004\b)\u0010*J\r\u0010,\u001a\u00020+¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000bH\u0016¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b0\u0010*J\u0010\u00101\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b1\u0010*J\u0010\u00102\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b2\u0010/J\u0010\u00103\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b3\u0010/J\u0012\u00104\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b8\u00107J\u0018\u00109\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00150\u0002HÆ\u0003¢\u0006\u0004\b=\u0010:J\u0018\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u0010:J\u0012\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b?\u0010*J\u0012\u0010@\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bB\u0010AJ\u0012\u0010C\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\bC\u00105J\u0018\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bH\u00107J\u0012\u0010I\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bI\u00107J\u0012\u0010J\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bJ\u00107J\u0010\u0010K\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bK\u0010/J\u0018\u0010L\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bL\u0010:Jª\u0002\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00022\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\bO\u0010PJ\u001a\u0010S\u001a\u00020\u000b2\b\u0010R\u001a\u0004\u0018\u00010QHÖ\u0003¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\bU\u0010PJ \u0010Y\u001a\u00020+2\u0006\u0010W\u001a\u00020V2\u0006\u0010X\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\bY\u0010ZR\u001a\u0010\t\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010[\u001a\u0004\b\\\u0010*R\u001a\u0010\n\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010[\u001a\u0004\b]\u0010*R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010^\u001a\u0004\b_\u0010/R\u001a\u0010\r\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010^\u001a\u0004\b`\u0010/R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010a\u001a\u0004\bb\u00105R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010c\u001a\u0004\bd\u00107R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010c\u001a\u0004\be\u00107R*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010f\u001a\u0004\bg\u0010:\"\u0004\bh\u0010iR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010j\u001a\u0004\bk\u0010<R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010f\u001a\u0004\bl\u0010:R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010f\u001a\u0004\bm\u0010:R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010[\u001a\u0004\bn\u0010*R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010o\u001a\u0004\bp\u0010AR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010o\u001a\u0004\bq\u0010AR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010a\u001a\u0004\br\u00105R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010s\u001a\u0004\bt\u0010ER\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010u\u001a\u0004\bv\u0010GR\u001c\u0010!\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b!\u0010c\u001a\u0004\bw\u00107R\u001c\u0010\"\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\"\u0010c\u001a\u0004\bx\u00107R\u001c\u0010#\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010c\u001a\u0004\by\u00107R\u001a\u0010$\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010^\u001a\u0004\bz\u0010/R\"\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b&\u0010f\u001a\u0004\b{\u0010:R\"\u0010|\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b|\u0010c\u0012\u0004\b~\u0010-\u001a\u0004\b}\u00107R\u0015\u0010\u0080\u0001\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010*R\u0019\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\u00028F¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010:¨\u0006\u0088\u0001"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/MultiselectParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "", "", "Lcom/avito/android/remote/model/category_parameters/base/HasPlaceholder;", "Lcom/avito/android/remote/model/category_parameters/base/CanHaveTypeCorrection;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "Lcom/avito/android/remote/model/category_parameters/base/HasConstraints;", "id", "title", "", "required", "immutable", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "updatesForm", "updatesObjectForm", "_value", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Displaying;", Navigation.DISPLAYING, "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value;", "values", "selectedValues", ChannelContext.Item.PLACEHOLDER, "", "attributeId", "maxSelected", "subtitle", "", "availableOptions", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$FilterHint;", "hint", "visible", "phantom", "hasSuggest", "resetAreaOnChange", "Lcom/avito/android/remote/model/category_parameters/Constraint;", "constraints", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Displaying;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/Set;Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$FilterHint;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/util/List;)V", "toString", "()Ljava/lang/String;", "Lkotlin/G0;", "rollbackToOldValue", "()V", "hasValue", "()Z", "component1", "component2", "component3", "component4", "component5", "()Lcom/avito/android/remote/model/text/AttributedText;", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "()Ljava/util/List;", "component9", "()Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Displaying;", "component10", "component11", "component12", "component13", "()Ljava/lang/Integer;", "component14", "component15", "component16", "()Ljava/util/Set;", "component17", "()Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$FilterHint;", "component18", "component19", "component20", "component21", "component22", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Displaying;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/Set;Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$FilterHint;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/util/List;)Lcom/avito/android/remote/model/category_parameters/MultiselectParameter;", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Z", "getRequired", "getImmutable", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "Ljava/lang/Boolean;", "getUpdatesForm", "getUpdatesObjectForm", "Ljava/util/List;", "get_value", "set_value", "(Ljava/util/List;)V", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Displaying;", "getDisplaying", "getValues", "getSelectedValues", "getPlaceholder", "Ljava/lang/Integer;", "getAttributeId", "getMaxSelected", "getSubtitle", "Ljava/util/Set;", "getAvailableOptions", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$FilterHint;", "getHint", "getVisible", "getPhantom", "getHasSuggest", "getResetAreaOnChange", "getConstraints", "typoCorrectionEnabled", "getTypoCorrectionEnabled", "getTypoCorrectionEnabled$annotations", "getType", "type", "getListToShow", "listToShow", "Companion", "Displaying", "FilterHint", "Type", "Value", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes17.dex */
public final /* data */ class MultiselectParameter extends EditableParameter<List<? extends String>> implements HasPlaceholder, CanHaveTypeCorrection, Visibility, Phantom, HasConstraints {

    @k
    public static final String TYPE = "multiselect";

    @c("value")
    @l
    private List<String> _value;

    @c("attrId")
    @l
    private final Integer attributeId;

    @c("availableOptions")
    @l
    private final Set<String> availableOptions;

    @c("constraints")
    @l
    private final List<Constraint> constraints;

    @c(Navigation.DISPLAYING)
    @l
    private final Displaying displaying;

    @c("hasSuggest")
    @l
    private final Boolean hasSuggest;

    @c("hint")
    @l
    private final FilterHint hint;

    @c("id")
    @k
    private final String id;

    @c("immutable")
    private final boolean immutable;

    @c("maxSelected")
    @l
    private final Integer maxSelected;

    @c("motivation")
    @l
    private final AttributedText motivation;

    @c("phantom")
    @l
    private final Boolean phantom;

    @c(ChannelContext.Item.PLACEHOLDER)
    @l
    private final String placeholder;

    @c("required")
    private final boolean required;

    @c("resetAreaOnChange")
    private final boolean resetAreaOnChange;

    @c("selectedValues")
    @l
    private final List<Value> selectedValues;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("title")
    @k
    private final String title;

    @l
    private final Boolean typoCorrectionEnabled;

    @c("updatesForm")
    @l
    private final Boolean updatesForm;

    @c("updatesObjectForm")
    @l
    private final Boolean updatesObjectForm;

    @c("values")
    @k
    private final List<Value> values;

    @c("visible")
    @l
    private final Boolean visible;

    @k
    public static final Parcelable.Creator<MultiselectParameter> CREATOR = new Creator();

    /* compiled from: MultiselectParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MultiselectParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MultiselectParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            ArrayList arrayList;
            LinkedHashSet linkedHashSet;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            ArrayList arrayList2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(MultiselectParameter.class.getClassLoader());
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
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Displaying displayingCreateFromParcel = parcel.readInt() == 0 ? null : Displaying.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(Value.CREATOR, parcel, arrayList3, iC2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                int iC3 = 0;
                while (iC3 != i13) {
                    iC3 = a.c(Value.CREATOR, parcel, arrayList4, iC3, 1);
                    i13 = i13;
                }
                arrayList = arrayList4;
            }
            String string3 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(MultiselectParameter.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashSet = null;
            } else {
                int i14 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i14);
                int i15 = 0;
                while (i15 != i14) {
                    linkedHashSet2.add(parcel.readString());
                    i15++;
                    i14 = i14;
                }
                linkedHashSet = linkedHashSet2;
            }
            FilterHint filterHintCreateFromParcel = parcel.readInt() == 0 ? null : FilterHint.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            boolean z14 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i16 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i16);
                int iL2 = 0;
                while (iL2 != i16) {
                    iL2 = a.l(MultiselectParameter.class, parcel, arrayList5, iL2, 1);
                    i16 = i16;
                }
                arrayList2 = arrayList5;
            }
            return new MultiselectParameter(string, string2, z12, z13, attributedText, boolValueOf, boolValueOf2, arrayListCreateStringArrayList, displayingCreateFromParcel, arrayList3, arrayList, string3, numValueOf, numValueOf2, attributedText2, linkedHashSet, filterHintCreateFromParcel, boolValueOf3, boolValueOf4, boolValueOf5, z14, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MultiselectParameter[] newArray(int i12) {
            return new MultiselectParameter[i12];
        }
    }

    /* compiled from: MultiselectParameter.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$FilterHint;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$FilterHint;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUrl", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FilterHint implements Parcelable {

        @k
        public static final Parcelable.Creator<FilterHint> CREATOR = new Creator();

        @c("title")
        @l
        private final String title;

        @c(ContextActionHandler.Link.URL)
        @l
        private final DeepLink url;

        /* compiled from: MultiselectParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FilterHint> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FilterHint createFromParcel(@k Parcel parcel) {
                return new FilterHint(parcel.readString(), (DeepLink) parcel.readParcelable(FilterHint.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FilterHint[] newArray(int i12) {
                return new FilterHint[i12];
            }
        }

        public FilterHint(@l String str, @l DeepLink deepLink) {
            this.title = str;
            this.url = deepLink;
        }

        public static /* synthetic */ FilterHint copy$default(FilterHint filterHint, String str, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = filterHint.title;
            }
            if ((i12 & 2) != 0) {
                deepLink = filterHint.url;
            }
            return filterHint.copy(str, deepLink);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final DeepLink getUrl() {
            return this.url;
        }

        @k
        public final FilterHint copy(@l String title, @l DeepLink url) {
            return new FilterHint(title, url);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FilterHint)) {
                return false;
            }
            FilterHint filterHint = (FilterHint) other;
            return L.f(this.title, filterHint.title) && L.f(this.url, filterHint.url);
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @l
        public final DeepLink getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            DeepLink deepLink = this.url;
            return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("FilterHint(title=");
            sb2.append(this.title);
            sb2.append(", url=");
            return a.v(sb2, this.url, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.url, flags);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MultiselectParameter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Type;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "IMAGE_RIGHT", "CANDY", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @l
        private final String type;

        @c("imageRight")
        public static final Type IMAGE_RIGHT = new Type("IMAGE_RIGHT", 0, "imageRight");

        @c("candy")
        public static final Type CANDY = new Type("CANDY", 1, "candy");

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{IMAGE_RIGHT, CANDY};
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = kotlin.enums.c.a(typeArr$values);
        }

        private Type(String str, int i12, String str2) {
            this.type = str2;
        }

        @k
        public static kotlin.enums.a<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        @l
        public final String getType() {
            return this.type;
        }
    }

    /* compiled from: MultiselectParameter.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000234BC\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010JR\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b,\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b\u000b\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b2\u0010\u0010¨\u00065"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value;", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "Lcom/avito/android/remote/model/category_parameters/MultiselectValue;", "id", "name", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Display;", "display", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget;", "widget", "", "isDisabled", "parentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Display;Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget;ZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Display;", "component4", "()Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget;", "component5", "()Z", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Display;Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget;ZLjava/lang/String;)Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getName", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Display;", "getDisplay", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget;", "getWidget", "Z", "getParentId", "Display", "Widget", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Value implements ParcelableEntity<String>, MultiselectValue {

        @k
        public static final Parcelable.Creator<Value> CREATOR = new Creator();

        @c("display")
        @l
        private final Display display;

        @c("id")
        @k
        private final String id;

        @c("isDisabled")
        private final boolean isDisabled;

        @c("title")
        @k
        private final String name;

        @c("parentId")
        @l
        private final String parentId;

        @c("widget")
        @l
        private final Widget widget;

        /* compiled from: MultiselectParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Value> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Value createFromParcel(@k Parcel parcel) {
                return new Value(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Display.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Widget.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Value[] newArray(int i12) {
                return new Value[i12];
            }
        }

        public Value(@k String str, @k String str2, @l Display display, @l Widget widget, boolean z12, @l String str3) {
            this.id = str;
            this.name = str2;
            this.display = display;
            this.widget = widget;
            this.isDisabled = z12;
            this.parentId = str3;
        }

        public static /* synthetic */ Value copy$default(Value value, String str, String str2, Display display, Widget widget, boolean z12, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = value.id;
            }
            if ((i12 & 2) != 0) {
                str2 = value.name;
            }
            String str4 = str2;
            if ((i12 & 4) != 0) {
                display = value.display;
            }
            Display display2 = display;
            if ((i12 & 8) != 0) {
                widget = value.widget;
            }
            Widget widget2 = widget;
            if ((i12 & 16) != 0) {
                z12 = value.isDisabled;
            }
            boolean z13 = z12;
            if ((i12 & 32) != 0) {
                str3 = value.parentId;
            }
            return value.copy(str, str4, display2, widget2, z13, str3);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Display getDisplay() {
            return this.display;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Widget getWidget() {
            return this.widget;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsDisabled() {
            return this.isDisabled;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final String getParentId() {
            return this.parentId;
        }

        @k
        public final Value copy(@k String id2, @k String name, @l Display display, @l Widget widget, boolean isDisabled, @l String parentId) {
            return new Value(id2, name, display, widget, isDisabled, parentId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Value)) {
                return false;
            }
            Value value = (Value) other;
            return L.f(this.id, value.id) && L.f(this.name, value.name) && L.f(this.display, value.display) && L.f(this.widget, value.widget) && this.isDisabled == value.isDisabled && L.f(this.parentId, value.parentId);
        }

        @Override // com.avito.android.remote.model.Entity
        @k
        /* renamed from: getName */
        public String getTitle() {
            return this.name;
        }

        @l
        public final String getParentId() {
            return this.parentId;
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectValue
        @l
        public Widget getWidget() {
            return this.widget;
        }

        public int hashCode() {
            int iD2 = H.d(this.id.hashCode() * 31, 31, this.name);
            Display display = this.display;
            int iHashCode = (iD2 + (display == null ? 0 : display.hashCode())) * 31;
            Widget widget = this.widget;
            int i12 = r.i((iHashCode + (widget == null ? 0 : widget.hashCode())) * 31, 31, this.isDisabled);
            String str = this.parentId;
            return i12 + (str != null ? str.hashCode() : 0);
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectValue
        public boolean isDisabled() {
            return this.isDisabled;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Value(id=");
            sb2.append(this.id);
            sb2.append(", name=");
            sb2.append(this.name);
            sb2.append(", display=");
            sb2.append(this.display);
            sb2.append(", widget=");
            sb2.append(this.widget);
            sb2.append(", isDisabled=");
            sb2.append(this.isDisabled);
            sb2.append(", parentId=");
            return C22026a.c(sb2, this.parentId, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.name);
            Display display = this.display;
            if (display == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                display.writeToParcel(parcel, flags);
            }
            Widget widget = this.widget;
            if (widget == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                widget.writeToParcel(parcel, flags);
            }
            parcel.writeInt(this.isDisabled ? 1 : 0);
            parcel.writeString(this.parentId);
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectValue
        @l
        public Display getDisplay() {
            return this.display;
        }

        @Override // com.avito.android.remote.model.Entity
        @k
        public String getId() {
            return this.id;
        }

        /* compiled from: MultiselectParameter.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget$Config;", Navigation.CONFIG, "<init>", "(Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget$Config;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget$Config;", "getConfig", "()Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget$Config;", "Config", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final class Widget implements Parcelable {

            @k
            public static final Parcelable.Creator<Widget> CREATOR = new Creator();

            @c(Navigation.CONFIG)
            @l
            private final Config config;

            /* compiled from: MultiselectParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Widget> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Widget createFromParcel(@k Parcel parcel) {
                    return new Widget(parcel.readInt() == 0 ? null : Config.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Widget[] newArray(int i12) {
                    return new Widget[i12];
                }
            }

            public Widget(@l Config config) {
                this.config = config;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @l
            public final Config getConfig() {
                return this.config;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                Config config = this.config;
                if (config == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    config.writeToParcel(parcel, flags);
                }
            }

            /* compiled from: MultiselectParameter.kt */
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001:\u0003!\"#B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget$Config;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget$Config$Hint;", "hint", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget$Config$Displaying;", Navigation.DISPLAYING, "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget$Config$SelectorCardValue;", "selectorCardValue", "", "subtitle", "<init>", "(Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget$Config$Hint;Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget$Config$Displaying;Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget$Config$SelectorCardValue;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget$Config$Hint;", "getHint", "()Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget$Config$Hint;", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget$Config$Displaying;", "getDisplaying", "()Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget$Config$Displaying;", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget$Config$SelectorCardValue;", "getSelectorCardValue", "()Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget$Config$SelectorCardValue;", "Ljava/lang/String;", "getSubtitle", "()Ljava/lang/String;", "Displaying", "Hint", "SelectorCardValue", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final class Config implements Parcelable {

                @k
                public static final Parcelable.Creator<Config> CREATOR = new Creator();

                @c(Navigation.DISPLAYING)
                @l
                private final Displaying displaying;

                @c("hint")
                @l
                private final Hint hint;

                @c("selectorCardValue")
                @l
                private final SelectorCardValue selectorCardValue;

                @c("subtitle")
                @l
                private final String subtitle;

                /* compiled from: MultiselectParameter.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Config> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Config createFromParcel(@k Parcel parcel) {
                        return new Config(parcel.readInt() == 0 ? null : Hint.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Displaying.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SelectorCardValue.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Config[] newArray(int i12) {
                        return new Config[i12];
                    }
                }

                /* compiled from: MultiselectParameter.kt */
                @d
                @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget$Config$Displaying;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "multiThemeImage", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalImage;", "getMultiThemeImage", "()Lcom/avito/android/remote/model/UniversalImage;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final class Displaying implements Parcelable {

                    @k
                    public static final Parcelable.Creator<Displaying> CREATOR = new Creator();

                    @c("multiThemeImages")
                    @l
                    private final UniversalImage multiThemeImage;

                    /* compiled from: MultiselectParameter.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<Displaying> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @k
                        public final Displaying createFromParcel(@k Parcel parcel) {
                            return new Displaying((UniversalImage) parcel.readParcelable(Displaying.class.getClassLoader()));
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @k
                        public final Displaying[] newArray(int i12) {
                            return new Displaying[i12];
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public Displaying() {
                        this(null, 1, 0 == true ? 1 : 0);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    @l
                    public final UniversalImage getMultiThemeImage() {
                        return this.multiThemeImage;
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(@k Parcel parcel, int flags) {
                        parcel.writeParcelable(this.multiThemeImage, flags);
                    }

                    public Displaying(@l UniversalImage universalImage) {
                        this.multiThemeImage = universalImage;
                    }

                    public /* synthetic */ Displaying(UniversalImage universalImage, int i12, C42822w c42822w) {
                        this((i12 & 1) != 0 ? null : universalImage);
                    }
                }

                /* compiled from: MultiselectParameter.kt */
                @d
                @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget$Config$Hint;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final class Hint implements Parcelable {

                    @k
                    public static final Parcelable.Creator<Hint> CREATOR = new Creator();

                    @c(Constants.DEEPLINK)
                    @k
                    private final DeepLink deepLink;

                    /* compiled from: MultiselectParameter.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<Hint> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @k
                        public final Hint createFromParcel(@k Parcel parcel) {
                            return new Hint((DeepLink) parcel.readParcelable(Hint.class.getClassLoader()));
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @k
                        public final Hint[] newArray(int i12) {
                            return new Hint[i12];
                        }
                    }

                    public Hint(@k DeepLink deepLink) {
                        this.deepLink = deepLink;
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    @k
                    public final DeepLink getDeepLink() {
                        return this.deepLink;
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(@k Parcel parcel, int flags) {
                        parcel.writeParcelable(this.deepLink, flags);
                    }
                }

                /* compiled from: MultiselectParameter.kt */
                @d
                @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0003\u0010\u0013R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget$Config$SelectorCardValue;", "Landroid/os/Parcelable;", "", "isSingleValue", "", "Lcom/avito/android/beduin_models/BeduinModel;", "beduinForm", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/util/List;", "getBeduinForm", "()Ljava/util/List;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final class SelectorCardValue implements Parcelable {

                    @k
                    public static final Parcelable.Creator<SelectorCardValue> CREATOR = new Creator();

                    @c("beduinForm")
                    @l
                    private final List<BeduinModel> beduinForm;

                    @c("isSingleValue")
                    @l
                    private final Boolean isSingleValue;

                    /* compiled from: MultiselectParameter.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<SelectorCardValue> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @k
                        public final SelectorCardValue createFromParcel(@k Parcel parcel) {
                            Boolean boolValueOf;
                            int iL2 = 0;
                            ArrayList arrayList = null;
                            if (parcel.readInt() == 0) {
                                boolValueOf = null;
                            } else {
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                            }
                            if (parcel.readInt() != 0) {
                                int i12 = parcel.readInt();
                                ArrayList arrayList2 = new ArrayList(i12);
                                while (iL2 != i12) {
                                    iL2 = a.l(SelectorCardValue.class, parcel, arrayList2, iL2, 1);
                                }
                                arrayList = arrayList2;
                            }
                            return new SelectorCardValue(boolValueOf, arrayList);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        @k
                        public final SelectorCardValue[] newArray(int i12) {
                            return new SelectorCardValue[i12];
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public SelectorCardValue() {
                        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    @l
                    public final List<BeduinModel> getBeduinForm() {
                        return this.beduinForm;
                    }

                    @l
                    /* renamed from: isSingleValue, reason: from getter */
                    public final Boolean getIsSingleValue() {
                        return this.isSingleValue;
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(@k Parcel parcel, int flags) {
                        Boolean bool = this.isSingleValue;
                        if (bool == null) {
                            parcel.writeInt(0);
                        } else {
                            C0.l(parcel, 1, bool);
                        }
                        List<BeduinModel> list = this.beduinForm;
                        if (list == null) {
                            parcel.writeInt(0);
                            return;
                        }
                        Iterator itA = a.A(list, parcel, 1);
                        while (itA.hasNext()) {
                            parcel.writeParcelable((Parcelable) itA.next(), flags);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public SelectorCardValue(@l Boolean bool, @l List<? extends BeduinModel> list) {
                        this.isSingleValue = bool;
                        this.beduinForm = list;
                    }

                    public /* synthetic */ SelectorCardValue(Boolean bool, List list, int i12, C42822w c42822w) {
                        this((i12 & 1) != 0 ? null : bool, (i12 & 2) != 0 ? null : list);
                    }
                }

                public Config(@l Hint hint, @l Displaying displaying, @l SelectorCardValue selectorCardValue, @l String str) {
                    this.hint = hint;
                    this.displaying = displaying;
                    this.selectorCardValue = selectorCardValue;
                    this.subtitle = str;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @l
                public final Displaying getDisplaying() {
                    return this.displaying;
                }

                @l
                public final Hint getHint() {
                    return this.hint;
                }

                @l
                public final SelectorCardValue getSelectorCardValue() {
                    return this.selectorCardValue;
                }

                @l
                public final String getSubtitle() {
                    return this.subtitle;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    Hint hint = this.hint;
                    if (hint == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        hint.writeToParcel(parcel, flags);
                    }
                    Displaying displaying = this.displaying;
                    if (displaying == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        displaying.writeToParcel(parcel, flags);
                    }
                    SelectorCardValue selectorCardValue = this.selectorCardValue;
                    if (selectorCardValue == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        selectorCardValue.writeToParcel(parcel, flags);
                    }
                    parcel.writeString(this.subtitle);
                }

                public /* synthetic */ Config(Hint hint, Displaying displaying, SelectorCardValue selectorCardValue, String str, int i12, C42822w c42822w) {
                    this(hint, displaying, (i12 & 4) != 0 ? null : selectorCardValue, (i12 & 8) != 0 ? null : str);
                }
            }
        }

        public /* synthetic */ Value(String str, String str2, Display display, Widget widget, boolean z12, String str3, int i12, C42822w c42822w) {
            this(str, str2, display, (i12 & 8) != 0 ? null : widget, (i12 & 16) != 0 ? false : z12, (i12 & 32) != 0 ? null : str3);
        }

        /* compiled from: MultiselectParameter.kt */
        @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001?B\u009b\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b)\u0010(R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b0\u0010(R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b1\u0010(R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b2\u0010(R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00106\u001a\u0004\b7\u00108R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010<\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Display;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/MultiselectDisplay;", "Lcom/avito/android/remote/model/Color;", "color", "", "title", "subtitle", "Lcom/avito/android/remote/model/Image;", "image", "Lcom/avito/android/remote/model/UniversalImage;", "multiThemeImage", "sortParam", "icon", "leftIcon", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Type;", "type", "Lcom/avito/android/remote/model/UniversalCheckedImage;", "universalCheckedImage", "", "Lcom/avito/android/remote/model/UniversalColor;", "gradientColors", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Display$Link;", "link", "<init>", "(Lcom/avito/android/remote/model/Color;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Type;Lcom/avito/android/remote/model/UniversalCheckedImage;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Display$Link;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Color;", "getColor", "()Lcom/avito/android/remote/model/Color;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "Lcom/avito/android/remote/model/UniversalImage;", "getMultiThemeImage", "()Lcom/avito/android/remote/model/UniversalImage;", "getSortParam", "getIcon", "getLeftIcon", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Type;", "getType", "()Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Type;", "Lcom/avito/android/remote/model/UniversalCheckedImage;", "getUniversalCheckedImage", "()Lcom/avito/android/remote/model/UniversalCheckedImage;", "Ljava/util/List;", "getGradientColors", "()Ljava/util/List;", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Display$Link;", "getLink", "()Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Display$Link;", "Link", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final class Display implements Parcelable, MultiselectDisplay {

            @k
            public static final Parcelable.Creator<Display> CREATOR = new Creator();

            @c("color")
            @l
            private final Color color;

            @c("gradientColors")
            @l
            private final List<UniversalColor> gradientColors;

            @c("icon")
            @l
            private final String icon;

            @c("images")
            @l
            private final Image image;

            @c("leftIcon")
            @l
            private final String leftIcon;

            @c("link")
            @l
            private final Link link;

            @c("multiThemeImages")
            @l
            private final UniversalImage multiThemeImage;

            @c("sortParam")
            @l
            private final String sortParam;

            @c("subtitle")
            @l
            private final String subtitle;

            @c("title")
            @l
            private final String title;

            @c("type")
            @l
            private final Type type;

            @c("image")
            @l
            private final UniversalCheckedImage universalCheckedImage;

            /* compiled from: MultiselectParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Display> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Display createFromParcel(@k Parcel parcel) {
                    ArrayList arrayList;
                    Color color = (Color) parcel.readParcelable(Display.class.getClassLoader());
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    Image image = (Image) parcel.readParcelable(Display.class.getClassLoader());
                    UniversalImage universalImage = (UniversalImage) parcel.readParcelable(Display.class.getClassLoader());
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    Type typeValueOf = parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString());
                    UniversalCheckedImage universalCheckedImage = (UniversalCheckedImage) parcel.readParcelable(Display.class.getClassLoader());
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i12 = parcel.readInt();
                        arrayList = new ArrayList(i12);
                        int iL2 = 0;
                        while (iL2 != i12) {
                            iL2 = a.l(Display.class, parcel, arrayList, iL2, 1);
                        }
                    }
                    return new Display(color, string, string2, image, universalImage, string3, string4, string5, typeValueOf, universalCheckedImage, arrayList, parcel.readInt() == 0 ? null : Link.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Display[] newArray(int i12) {
                    return new Display[i12];
                }
            }

            /* compiled from: MultiselectParameter.kt */
            @d
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Display$Link;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Link implements Parcelable {

                @k
                public static final Parcelable.Creator<Link> CREATOR = new Creator();

                @c(TooltipAttribute.PARAM_DEEP_LINK)
                @l
                private final DeepLink deepLink;

                /* compiled from: MultiselectParameter.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Link> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Link createFromParcel(@k Parcel parcel) {
                        return new Link((DeepLink) parcel.readParcelable(Link.class.getClassLoader()));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Link[] newArray(int i12) {
                        return new Link[i12];
                    }
                }

                public Link(@l DeepLink deepLink) {
                    this.deepLink = deepLink;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @l
                public final DeepLink getDeepLink() {
                    return this.deepLink;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeParcelable(this.deepLink, flags);
                }
            }

            public Display(@l Color color, @l String str, @l String str2, @l Image image, @l UniversalImage universalImage, @l String str3, @l String str4, @l String str5, @l Type type, @l UniversalCheckedImage universalCheckedImage, @l List<UniversalColor> list, @l Link link) {
                this.color = color;
                this.title = str;
                this.subtitle = str2;
                this.image = image;
                this.multiThemeImage = universalImage;
                this.sortParam = str3;
                this.icon = str4;
                this.leftIcon = str5;
                this.type = type;
                this.universalCheckedImage = universalCheckedImage;
                this.gradientColors = list;
                this.link = link;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplay
            @l
            public Color getColor() {
                return this.color;
            }

            @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplay
            @l
            public List<UniversalColor> getGradientColors() {
                return this.gradientColors;
            }

            @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplay
            @l
            public String getIcon() {
                return this.icon;
            }

            @l
            public final Image getImage() {
                return this.image;
            }

            @l
            public final String getLeftIcon() {
                return this.leftIcon;
            }

            @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplay
            @l
            public Link getLink() {
                return this.link;
            }

            @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplay
            @l
            public UniversalImage getMultiThemeImage() {
                return this.multiThemeImage;
            }

            @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplay
            @l
            public String getSortParam() {
                return this.sortParam;
            }

            @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplay
            @l
            public String getSubtitle() {
                return this.subtitle;
            }

            @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplay
            @l
            public String getTitle() {
                return this.title;
            }

            @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplay
            @l
            public Type getType() {
                return this.type;
            }

            @l
            public final UniversalCheckedImage getUniversalCheckedImage() {
                return this.universalCheckedImage;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeParcelable(this.color, flags);
                parcel.writeString(this.title);
                parcel.writeString(this.subtitle);
                parcel.writeParcelable(this.image, flags);
                parcel.writeParcelable(this.multiThemeImage, flags);
                parcel.writeString(this.sortParam);
                parcel.writeString(this.icon);
                parcel.writeString(this.leftIcon);
                Type type = this.type;
                if (type == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(type.name());
                }
                parcel.writeParcelable(this.universalCheckedImage, flags);
                List<UniversalColor> list = this.gradientColors;
                if (list == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itA = a.A(list, parcel, 1);
                    while (itA.hasNext()) {
                        parcel.writeParcelable((Parcelable) itA.next(), flags);
                    }
                }
                Link link = this.link;
                if (link == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    link.writeToParcel(parcel, flags);
                }
            }

            public /* synthetic */ Display(Color color, String str, String str2, Image image, UniversalImage universalImage, String str3, String str4, String str5, Type type, UniversalCheckedImage universalCheckedImage, List list, Link link, int i12, C42822w c42822w) {
                this(color, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : image, (i12 & 16) != 0 ? null : universalImage, (i12 & 32) != 0 ? null : str3, (i12 & 64) != 0 ? null : str4, (i12 & 128) != 0 ? null : str5, (i12 & 256) != 0 ? null : type, (i12 & 512) != 0 ? null : universalCheckedImage, (i12 & 1024) != 0 ? null : list, (i12 & 2048) == 0 ? link : null);
            }
        }
    }

    public /* synthetic */ MultiselectParameter(String str, String str2, boolean z12, boolean z13, AttributedText attributedText, Boolean bool, Boolean bool2, List list, Displaying displaying, List list2, List list3, String str3, Integer num, Integer num2, AttributedText attributedText2, Set set, FilterHint filterHint, Boolean bool3, Boolean bool4, Boolean bool5, boolean z14, List list4, int i12, C42822w c42822w) {
        this(str, str2, z12, z13, attributedText, bool, (i12 & 64) != 0 ? null : bool2, list, displaying, list2, (i12 & 1024) != 0 ? null : list3, (i12 & 2048) != 0 ? null : str3, (i12 & 4096) != 0 ? null : num, (i12 & 8192) != 0 ? null : num2, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : attributedText2, (32768 & i12) != 0 ? null : set, (65536 & i12) != 0 ? null : filterHint, (131072 & i12) != 0 ? Boolean.FALSE : bool3, (262144 & i12) != 0 ? Boolean.FALSE : bool4, (524288 & i12) != 0 ? Boolean.FALSE : bool5, (1048576 & i12) != 0 ? false : z14, (i12 & 2097152) != 0 ? new ArrayList() : list4);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    public final List<Value> component10() {
        return this.values;
    }

    @l
    public final List<Value> component11() {
        return this.selectedValues;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final Integer getAttributeId() {
        return this.attributeId;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final Integer getMaxSelected() {
        return this.maxSelected;
    }

    @l
    /* renamed from: component15, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    public final Set<String> component16() {
        return this.availableOptions;
    }

    @l
    /* renamed from: component17, reason: from getter */
    public final FilterHint getHint() {
        return this.hint;
    }

    @l
    /* renamed from: component18, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    @l
    /* renamed from: component19, reason: from getter */
    public final Boolean getPhantom() {
        return this.phantom;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component20, reason: from getter */
    public final Boolean getHasSuggest() {
        return this.hasSuggest;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getResetAreaOnChange() {
        return this.resetAreaOnChange;
    }

    @l
    public final List<Constraint> component22() {
        return this.constraints;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getImmutable() {
        return this.immutable;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final AttributedText getMotivation() {
        return this.motivation;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Boolean getUpdatesObjectForm() {
        return this.updatesObjectForm;
    }

    @l
    public final List<String> component8() {
        return this._value;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final Displaying getDisplaying() {
        return this.displaying;
    }

    @k
    public final MultiselectParameter copy(@k String id2, @k String title, boolean required, boolean immutable, @l AttributedText motivation, @l Boolean updatesForm, @l Boolean updatesObjectForm, @l List<String> _value, @l Displaying displaying, @k List<Value> values, @l List<Value> selectedValues, @l String placeholder, @l Integer attributeId, @l Integer maxSelected, @l AttributedText subtitle, @l Set<String> availableOptions, @l FilterHint hint, @l Boolean visible, @l Boolean phantom, @l Boolean hasSuggest, boolean resetAreaOnChange, @l List<? extends Constraint> constraints) {
        return new MultiselectParameter(id2, title, required, immutable, motivation, updatesForm, updatesObjectForm, _value, displaying, values, selectedValues, placeholder, attributeId, maxSelected, subtitle, availableOptions, hint, visible, phantom, hasSuggest, resetAreaOnChange, constraints);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiselectParameter)) {
            return false;
        }
        MultiselectParameter multiselectParameter = (MultiselectParameter) other;
        return L.f(this.id, multiselectParameter.id) && L.f(this.title, multiselectParameter.title) && this.required == multiselectParameter.required && this.immutable == multiselectParameter.immutable && L.f(this.motivation, multiselectParameter.motivation) && L.f(this.updatesForm, multiselectParameter.updatesForm) && L.f(this.updatesObjectForm, multiselectParameter.updatesObjectForm) && L.f(this._value, multiselectParameter._value) && L.f(this.displaying, multiselectParameter.displaying) && L.f(this.values, multiselectParameter.values) && L.f(this.selectedValues, multiselectParameter.selectedValues) && L.f(this.placeholder, multiselectParameter.placeholder) && L.f(this.attributeId, multiselectParameter.attributeId) && L.f(this.maxSelected, multiselectParameter.maxSelected) && L.f(this.subtitle, multiselectParameter.subtitle) && L.f(this.availableOptions, multiselectParameter.availableOptions) && L.f(this.hint, multiselectParameter.hint) && L.f(this.visible, multiselectParameter.visible) && L.f(this.phantom, multiselectParameter.phantom) && L.f(this.hasSuggest, multiselectParameter.hasSuggest) && this.resetAreaOnChange == multiselectParameter.resetAreaOnChange && L.f(this.constraints, multiselectParameter.constraints);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CanHaveTypeCorrection
    @l
    public Integer getAttributeId() {
        return this.attributeId;
    }

    @l
    public final Set<String> getAvailableOptions() {
        return this.availableOptions;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasConstraints
    @l
    public List<Constraint> getConstraints() {
        return this.constraints;
    }

    @l
    public final Displaying getDisplaying() {
        return this.displaying;
    }

    @l
    public final Boolean getHasSuggest() {
        return this.hasSuggest;
    }

    @l
    public final FilterHint getHint() {
        return this.hint;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.ParameterSlot
    @k
    public String getId() {
        return this.id;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    public boolean getImmutable() {
        return this.immutable;
    }

    @k
    public final List<Value> getListToShow() {
        if (this.availableOptions == null) {
            return this.values;
        }
        List<Value> list = this.values;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (this.availableOptions.contains(((Value) obj).getId())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @l
    public final Integer getMaxSelected() {
        return this.maxSelected;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @l
    public AttributedText getMotivation() {
        return this.motivation;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Phantom
    @l
    public Boolean getPhantom() {
        return this.phantom;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasPlaceholder
    @l
    public String getPlaceholder() {
        return this.placeholder;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    public boolean getRequired() {
        return this.required;
    }

    public final boolean getResetAreaOnChange() {
        return this.resetAreaOnChange;
    }

    @l
    public final List<Value> getSelectedValues() {
        return this.selectedValues;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getType() {
        return "multiselect";
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CanHaveTypeCorrection
    @l
    public Boolean getTypoCorrectionEnabled() {
        return this.typoCorrectionEnabled;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseEditableParameter
    @l
    public Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @l
    public final Boolean getUpdatesObjectForm() {
        return this.updatesObjectForm;
    }

    @k
    public final List<Value> getValues() {
        return this.values;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Visibility
    @l
    public Boolean getVisible() {
        return this.visible;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public boolean hasValue() {
        return O2.a(this.selectedValues) || O2.a(getValue());
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int i12 = r.i(r.i(H.d(this.id.hashCode() * 31, 31, this.title), 31, this.required), 31, this.immutable);
        AttributedText attributedText = this.motivation;
        int iHashCode = (i12 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Boolean bool = this.updatesForm;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.updatesObjectForm;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<String> list = this._value;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Displaying displaying = this.displaying;
        int iE2 = H.e((iHashCode4 + (displaying == null ? 0 : displaying.hashCode())) * 31, 31, this.values);
        List<Value> list2 = this.selectedValues;
        int iHashCode5 = (iE2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.placeholder;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.attributeId;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxSelected;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        AttributedText attributedText2 = this.subtitle;
        int iHashCode9 = (iHashCode8 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        Set<String> set = this.availableOptions;
        int iHashCode10 = (iHashCode9 + (set == null ? 0 : set.hashCode())) * 31;
        FilterHint filterHint = this.hint;
        int iHashCode11 = (iHashCode10 + (filterHint == null ? 0 : filterHint.hashCode())) * 31;
        Boolean bool3 = this.visible;
        int iHashCode12 = (iHashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.phantom;
        int iHashCode13 = (iHashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.hasSuggest;
        int i13 = r.i((iHashCode13 + (bool5 == null ? 0 : bool5.hashCode())) * 31, 31, this.resetAreaOnChange);
        List<Constraint> list3 = this.constraints;
        return i13 + (list3 != null ? list3.hashCode() : 0);
    }

    public final void rollbackToOldValue() {
        setValue(getOldValue());
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public /* bridge */ /* synthetic */ void set_value(List<? extends String> list) {
        set_value2((List<String>) list);
    }

    @k
    public String toString() {
        return "MultiselectParameter(id:" + getId() + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeInt(this.required ? 1 : 0);
        parcel.writeInt(this.immutable ? 1 : 0);
        parcel.writeParcelable(this.motivation, flags);
        Boolean bool = this.updatesForm;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.updatesObjectForm;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        parcel.writeStringList(this._value);
        Displaying displaying = this.displaying;
        if (displaying == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displaying.writeToParcel(parcel, flags);
        }
        Iterator itJ = C0.j(this.values, parcel);
        while (itJ.hasNext()) {
            ((Value) itJ.next()).writeToParcel(parcel, flags);
        }
        List<Value> list = this.selectedValues;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Value) itA.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.placeholder);
        Integer num = this.attributeId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        Integer num2 = this.maxSelected;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num2);
        }
        parcel.writeParcelable(this.subtitle, flags);
        Set<String> set = this.availableOptions;
        if (set == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(set.size());
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next());
            }
        }
        FilterHint filterHint = this.hint;
        if (filterHint == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            filterHint.writeToParcel(parcel, flags);
        }
        Boolean bool3 = this.visible;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        Boolean bool4 = this.phantom;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool4);
        }
        Boolean bool5 = this.hasSuggest;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool5);
        }
        parcel.writeInt(this.resetAreaOnChange ? 1 : 0);
        List<Constraint> list2 = this.constraints;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            parcel.writeParcelable((Parcelable) itA2.next(), flags);
        }
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    @l
    public List<? extends String> get_value() {
        return this._value;
    }

    /* renamed from: set_value, reason: avoid collision after fix types in other method */
    public void set_value2(@l List<String> list) {
        this._value = list;
    }

    /* compiled from: MultiselectParameter.kt */
    @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u008e\u0001\u008f\u0001BÓ\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010(\u001a\u00020\u0004\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b3\u00100J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010.J\u0012\u00105\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b7\u00100J\u0012\u00108\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010.J\u0012\u0010=\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b=\u00100J\u0012\u0010>\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b>\u00100J\u0018\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u0010.J\u0012\u0010D\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bD\u0010.J\u0012\u0010E\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bE\u00100J\u0012\u0010F\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0018\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bJ\u0010@J\u0012\u0010K\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bK\u00100J\u0012\u0010L\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bP\u0010.J\u0012\u0010Q\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bQ\u0010.J\u0010\u0010R\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0012\u0010T\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0004\bT\u0010UJÞ\u0002\u0010V\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00142\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010(\u001a\u00020\u00042\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)HÆ\u0001¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bX\u0010.J\u0010\u0010Y\u001a\u00020$HÖ\u0001¢\u0006\u0004\bY\u0010ZJ\u001a\u0010]\u001a\u00020\u00042\b\u0010\\\u001a\u0004\u0018\u00010[HÖ\u0003¢\u0006\u0004\b]\u0010^J\u0010\u0010_\u001a\u00020$HÖ\u0001¢\u0006\u0004\b_\u0010ZJ \u0010d\u001a\u00020c2\u0006\u0010a\u001a\u00020`2\u0006\u0010b\u001a\u00020$HÖ\u0001¢\u0006\u0004\bd\u0010eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010f\u001a\u0004\bg\u0010.R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010h\u001a\u0004\bi\u00100R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010j\u001a\u0004\bk\u00102R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010h\u001a\u0004\bl\u00100R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010f\u001a\u0004\bm\u0010.R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010n\u001a\u0004\bo\u00106R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010h\u001a\u0004\bp\u00100R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010q\u001a\u0004\br\u00109R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010s\u001a\u0004\bt\u0010;R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010f\u001a\u0004\bu\u0010.R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010h\u001a\u0004\bv\u00100R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010h\u001a\u0004\bw\u00100R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010x\u001a\u0004\by\u0010@R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010z\u001a\u0004\b{\u0010BR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010f\u001a\u0004\b|\u0010.R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010f\u001a\u0004\b}\u0010.R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010h\u001a\u0004\b~\u00100R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u001d\u0010\u007f\u001a\u0005\b\u0080\u0001\u0010GR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001f\u0010\u0081\u0001\u001a\u0005\b\u0082\u0001\u0010IR#\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0016X\u0097\u0004¢\u0006\r\n\u0004\b \u0010x\u001a\u0005\b\u0083\u0001\u0010@R\u001d\u0010!\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\r\n\u0004\b!\u0010h\u001a\u0005\b\u0084\u0001\u00100R\u001e\u0010#\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b#\u0010\u0085\u0001\u001a\u0005\b\u0086\u0001\u0010MR\u001e\u0010%\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b%\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010OR\u001d\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b&\u0010f\u001a\u0005\b\u0089\u0001\u0010.R\u001d\u0010'\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b'\u0010f\u001a\u0005\b\u008a\u0001\u0010.R\u001b\u0010(\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\r\n\u0005\b(\u0010\u008b\u0001\u001a\u0004\b(\u0010SR\u001e\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b*\u0010\u008c\u0001\u001a\u0005\b\u008d\u0001\u0010U¨\u0006\u0090\u0001"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Displaying;", "Lcom/avito/android/remote/model/category_parameters/MultiselectDisplaying;", "", "type", "", "typoCorrectionEnabled", "Lcom/avito/android/remote/model/category_parameters/CustomPaddings;", "customPaddings", "withImages", "titlePattern", "Lcom/avito/android/remote/model/category_parameters/SortDirection;", "sortDirection", "hideTitle", "Lcom/avito/android/remote/model/category_parameters/TipIconParameters;", "tipIconParameters", "Lcom/avito/android/remote/model/category_parameters/DisplayingImageParams;", "imageParams", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "keepSelectedChip", "areGroupsCollapsible", "", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Displaying$Group;", "groups", "Lcom/avito/android/deep_linking/links/DeepLink;", "titleTipAction", "confirmButtonTitle", ChannelContext.Item.PLACEHOLDER, "hideShowMore", "Lcom/avito/android/remote/model/category_parameters/DialogDisplaying;", "dialogDisplaying", "Lcom/avito/android/remote/model/category_parameters/OptionImageSize;", "optionImageSize", "topValues", "toFillIn", "Lcom/avito/android/remote/model/category_parameters/Badge;", "badge", "", "limit", "limitMessage", "itemsStyle", "isComposeView", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Displaying$SelectorCardGroupDisplaying;", "selectorCardGroupDisplaying", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/CustomPaddings;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/SortDirection;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/TipIconParameters;Lcom/avito/android/remote/model/category_parameters/DisplayingImageParams;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/DialogDisplaying;Lcom/avito/android/remote/model/category_parameters/OptionImageSize;Ljava/util/List;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/Badge;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLcom/avito/android/remote/model/category_parameters/MultiselectParameter$Displaying$SelectorCardGroupDisplaying;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Lcom/avito/android/remote/model/category_parameters/CustomPaddings;", "component4", "component5", "component6", "()Lcom/avito/android/remote/model/category_parameters/SortDirection;", "component7", "component8", "()Lcom/avito/android/remote/model/category_parameters/TipIconParameters;", "component9", "()Lcom/avito/android/remote/model/category_parameters/DisplayingImageParams;", "component10", "component11", "component12", "component13", "()Ljava/util/List;", "component14", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component15", "component16", "component17", "component18", "()Lcom/avito/android/remote/model/category_parameters/DialogDisplaying;", "component19", "()Lcom/avito/android/remote/model/category_parameters/OptionImageSize;", "component20", "component21", "component22", "()Lcom/avito/android/remote/model/category_parameters/Badge;", "component23", "()Ljava/lang/Integer;", "component24", "component25", "component26", "()Z", "component27", "()Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Displaying$SelectorCardGroupDisplaying;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/CustomPaddings;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/SortDirection;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/TipIconParameters;Lcom/avito/android/remote/model/category_parameters/DisplayingImageParams;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/DialogDisplaying;Lcom/avito/android/remote/model/category_parameters/OptionImageSize;Ljava/util/List;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/Badge;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLcom/avito/android/remote/model/category_parameters/MultiselectParameter$Displaying$SelectorCardGroupDisplaying;)Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Displaying;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "Ljava/lang/Boolean;", "getTypoCorrectionEnabled", "Lcom/avito/android/remote/model/category_parameters/CustomPaddings;", "getCustomPaddings", "getWithImages", "getTitlePattern", "Lcom/avito/android/remote/model/category_parameters/SortDirection;", "getSortDirection", "getHideTitle", "Lcom/avito/android/remote/model/category_parameters/TipIconParameters;", "getTipIconParameters", "Lcom/avito/android/remote/model/category_parameters/DisplayingImageParams;", "getImageParams", "getStyle", "getKeepSelectedChip", "getAreGroupsCollapsible", "Ljava/util/List;", "getGroups", "Lcom/avito/android/deep_linking/links/DeepLink;", "getTitleTipAction", "getConfirmButtonTitle", "getPlaceholder", "getHideShowMore", "Lcom/avito/android/remote/model/category_parameters/DialogDisplaying;", "getDialogDisplaying", "Lcom/avito/android/remote/model/category_parameters/OptionImageSize;", "getOptionImageSize", "getTopValues", "getToFillIn", "Lcom/avito/android/remote/model/category_parameters/Badge;", "getBadge", "Ljava/lang/Integer;", "getLimit", "getLimitMessage", "getItemsStyle", "Z", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Displaying$SelectorCardGroupDisplaying;", "getSelectorCardGroupDisplaying", "Group", "SelectorCardGroupDisplaying", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Displaying implements MultiselectDisplaying {

        @k
        public static final Parcelable.Creator<Displaying> CREATOR = new Creator();

        @c("areGroupsCollapsible")
        @l
        private final Boolean areGroupsCollapsible;

        @c("badge")
        @l
        private final Badge badge;

        @c("confirmButtonTitle")
        @l
        private final String confirmButtonTitle;

        @c("customPaddings")
        @l
        private final CustomPaddings customPaddings;

        @c("dialog")
        @l
        private final DialogDisplaying dialogDisplaying;

        @c("groups")
        @l
        private final List<Group> groups;

        @c("hideShowMore")
        @l
        private final Boolean hideShowMore;

        @c("hideTitle")
        @l
        private final Boolean hideTitle;

        @c("imageParams")
        @l
        private final DisplayingImageParams imageParams;

        @c("isComposeView")
        private final boolean isComposeView;

        @c("itemsStyle")
        @l
        private final String itemsStyle;

        @c("keepSelected")
        @l
        private final Boolean keepSelectedChip;

        @c("limit")
        @l
        private final Integer limit;

        @c("limitMessage")
        @l
        private final String limitMessage;

        @c("optionImageSize")
        @l
        private final OptionImageSize optionImageSize;

        @c(ChannelContext.Item.PLACEHOLDER)
        @l
        private final String placeholder;

        @c("selectorCardGroupDisplaying")
        @l
        private final SelectorCardGroupDisplaying selectorCardGroupDisplaying;

        @c("sortDirection")
        @l
        private final SortDirection sortDirection;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final String style;

        @c("tipIconParameters")
        @l
        private final TipIconParameters tipIconParameters;

        @c("titlePattern")
        @l
        private final String titlePattern;

        @c("titleTipAction")
        @l
        private final DeepLink titleTipAction;

        @c("toFillIn")
        @l
        private final Boolean toFillIn;

        @c("topValues")
        @l
        private final List<String> topValues;

        @c("type")
        @l
        private final String type;

        @c("typoCorrectionEnabled")
        @l
        private final Boolean typoCorrectionEnabled;

        @c("withImages")
        @l
        private final Boolean withImages;

        /* compiled from: MultiselectParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Displaying> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Displaying createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                Boolean boolValueOf2;
                Boolean boolValueOf3;
                Boolean boolValueOf4;
                Boolean boolValueOf5;
                Boolean bool;
                ArrayList arrayList;
                Boolean boolValueOf6;
                Boolean boolValueOf7;
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                CustomPaddings customPaddingsCreateFromParcel = parcel.readInt() == 0 ? null : CustomPaddings.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String string2 = parcel.readString();
                SortDirection sortDirectionValueOf = parcel.readInt() == 0 ? null : SortDirection.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    boolValueOf3 = null;
                } else {
                    boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                TipIconParameters tipIconParametersCreateFromParcel = parcel.readInt() == 0 ? null : TipIconParameters.CREATOR.createFromParcel(parcel);
                DisplayingImageParams displayingImageParamsCreateFromParcel = parcel.readInt() == 0 ? null : DisplayingImageParams.CREATOR.createFromParcel(parcel);
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf4 = null;
                } else {
                    boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf5 = null;
                } else {
                    boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    bool = boolValueOf5;
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = a.c(Group.CREATOR, parcel, arrayList2, iC2, 1);
                        i12 = i12;
                        boolValueOf5 = boolValueOf5;
                    }
                    bool = boolValueOf5;
                    arrayList = arrayList2;
                }
                DeepLink deepLink = (DeepLink) parcel.readParcelable(Displaying.class.getClassLoader());
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf6 = null;
                } else {
                    boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0);
                }
                DialogDisplaying dialogDisplayingCreateFromParcel = parcel.readInt() == 0 ? null : DialogDisplaying.CREATOR.createFromParcel(parcel);
                OptionImageSize optionImageSizeCreateFromParcel = parcel.readInt() == 0 ? null : OptionImageSize.CREATOR.createFromParcel(parcel);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                if (parcel.readInt() == 0) {
                    boolValueOf7 = null;
                } else {
                    boolValueOf7 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Displaying(string, boolValueOf, customPaddingsCreateFromParcel, boolValueOf2, string2, sortDirectionValueOf, boolValueOf3, tipIconParametersCreateFromParcel, displayingImageParamsCreateFromParcel, string3, boolValueOf4, bool, arrayList, deepLink, string4, string5, boolValueOf6, dialogDisplayingCreateFromParcel, optionImageSizeCreateFromParcel, arrayListCreateStringArrayList, boolValueOf7, parcel.readInt() == 0 ? null : Badge.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : SelectorCardGroupDisplaying.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Displaying[] newArray(int i12) {
                return new Displaying[i12];
            }
        }

        /* compiled from: MultiselectParameter.kt */
        @d
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Displaying$SelectorCardGroupDisplaying;", "Landroid/os/Parcelable;", "", "horizontalItemSpacing", "cardHeight", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getHorizontalItemSpacing", "()Ljava/lang/Integer;", "getCardHeight", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SelectorCardGroupDisplaying implements Parcelable {

            @k
            public static final Parcelable.Creator<SelectorCardGroupDisplaying> CREATOR = new Creator();

            @c("cardHeight")
            @l
            private final Integer cardHeight;

            @c("itemSpacing")
            @l
            private final Integer horizontalItemSpacing;

            /* compiled from: MultiselectParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SelectorCardGroupDisplaying> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final SelectorCardGroupDisplaying createFromParcel(@k Parcel parcel) {
                    return new SelectorCardGroupDisplaying(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final SelectorCardGroupDisplaying[] newArray(int i12) {
                    return new SelectorCardGroupDisplaying[i12];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public SelectorCardGroupDisplaying() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @l
            public final Integer getCardHeight() {
                return this.cardHeight;
            }

            @l
            public final Integer getHorizontalItemSpacing() {
                return this.horizontalItemSpacing;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                Integer num = this.horizontalItemSpacing;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    a.C(parcel, 1, num);
                }
                Integer num2 = this.cardHeight;
                if (num2 == null) {
                    parcel.writeInt(0);
                } else {
                    a.C(parcel, 1, num2);
                }
            }

            public SelectorCardGroupDisplaying(@l Integer num, @l Integer num2) {
                this.horizontalItemSpacing = num;
                this.cardHeight = num2;
            }

            public /* synthetic */ SelectorCardGroupDisplaying(Integer num, Integer num2, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : num2);
            }
        }

        public Displaying(@l String str, @l Boolean bool, @l CustomPaddings customPaddings, @l Boolean bool2, @l String str2, @l SortDirection sortDirection, @l Boolean bool3, @l TipIconParameters tipIconParameters, @l DisplayingImageParams displayingImageParams, @l String str3, @l Boolean bool4, @l Boolean bool5, @l List<Group> list, @l DeepLink deepLink, @l String str4, @l String str5, @l Boolean bool6, @l DialogDisplaying dialogDisplaying, @l OptionImageSize optionImageSize, @l List<String> list2, @l Boolean bool7, @l Badge badge, @l Integer num, @l String str6, @l String str7, boolean z12, @l SelectorCardGroupDisplaying selectorCardGroupDisplaying) {
            this.type = str;
            this.typoCorrectionEnabled = bool;
            this.customPaddings = customPaddings;
            this.withImages = bool2;
            this.titlePattern = str2;
            this.sortDirection = sortDirection;
            this.hideTitle = bool3;
            this.tipIconParameters = tipIconParameters;
            this.imageParams = displayingImageParams;
            this.style = str3;
            this.keepSelectedChip = bool4;
            this.areGroupsCollapsible = bool5;
            this.groups = list;
            this.titleTipAction = deepLink;
            this.confirmButtonTitle = str4;
            this.placeholder = str5;
            this.hideShowMore = bool6;
            this.dialogDisplaying = dialogDisplaying;
            this.optionImageSize = optionImageSize;
            this.topValues = list2;
            this.toFillIn = bool7;
            this.badge = badge;
            this.limit = num;
            this.limitMessage = str6;
            this.itemsStyle = str7;
            this.isComposeView = z12;
            this.selectorCardGroupDisplaying = selectorCardGroupDisplaying;
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @l
        /* renamed from: component10, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @l
        /* renamed from: component11, reason: from getter */
        public final Boolean getKeepSelectedChip() {
            return this.keepSelectedChip;
        }

        @l
        /* renamed from: component12, reason: from getter */
        public final Boolean getAreGroupsCollapsible() {
            return this.areGroupsCollapsible;
        }

        @l
        public final List<Group> component13() {
            return this.groups;
        }

        @l
        /* renamed from: component14, reason: from getter */
        public final DeepLink getTitleTipAction() {
            return this.titleTipAction;
        }

        @l
        /* renamed from: component15, reason: from getter */
        public final String getConfirmButtonTitle() {
            return this.confirmButtonTitle;
        }

        @l
        /* renamed from: component16, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @l
        /* renamed from: component17, reason: from getter */
        public final Boolean getHideShowMore() {
            return this.hideShowMore;
        }

        @l
        /* renamed from: component18, reason: from getter */
        public final DialogDisplaying getDialogDisplaying() {
            return this.dialogDisplaying;
        }

        @l
        /* renamed from: component19, reason: from getter */
        public final OptionImageSize getOptionImageSize() {
            return this.optionImageSize;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Boolean getTypoCorrectionEnabled() {
            return this.typoCorrectionEnabled;
        }

        @l
        public final List<String> component20() {
            return this.topValues;
        }

        @l
        /* renamed from: component21, reason: from getter */
        public final Boolean getToFillIn() {
            return this.toFillIn;
        }

        @l
        /* renamed from: component22, reason: from getter */
        public final Badge getBadge() {
            return this.badge;
        }

        @l
        /* renamed from: component23, reason: from getter */
        public final Integer getLimit() {
            return this.limit;
        }

        @l
        /* renamed from: component24, reason: from getter */
        public final String getLimitMessage() {
            return this.limitMessage;
        }

        @l
        /* renamed from: component25, reason: from getter */
        public final String getItemsStyle() {
            return this.itemsStyle;
        }

        /* renamed from: component26, reason: from getter */
        public final boolean getIsComposeView() {
            return this.isComposeView;
        }

        @l
        /* renamed from: component27, reason: from getter */
        public final SelectorCardGroupDisplaying getSelectorCardGroupDisplaying() {
            return this.selectorCardGroupDisplaying;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final CustomPaddings getCustomPaddings() {
            return this.customPaddings;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Boolean getWithImages() {
            return this.withImages;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getTitlePattern() {
            return this.titlePattern;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final SortDirection getSortDirection() {
            return this.sortDirection;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final Boolean getHideTitle() {
            return this.hideTitle;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final TipIconParameters getTipIconParameters() {
            return this.tipIconParameters;
        }

        @l
        /* renamed from: component9, reason: from getter */
        public final DisplayingImageParams getImageParams() {
            return this.imageParams;
        }

        @k
        public final Displaying copy(@l String type, @l Boolean typoCorrectionEnabled, @l CustomPaddings customPaddings, @l Boolean withImages, @l String titlePattern, @l SortDirection sortDirection, @l Boolean hideTitle, @l TipIconParameters tipIconParameters, @l DisplayingImageParams imageParams, @l String style, @l Boolean keepSelectedChip, @l Boolean areGroupsCollapsible, @l List<Group> groups, @l DeepLink titleTipAction, @l String confirmButtonTitle, @l String placeholder, @l Boolean hideShowMore, @l DialogDisplaying dialogDisplaying, @l OptionImageSize optionImageSize, @l List<String> topValues, @l Boolean toFillIn, @l Badge badge, @l Integer limit, @l String limitMessage, @l String itemsStyle, boolean isComposeView, @l SelectorCardGroupDisplaying selectorCardGroupDisplaying) {
            return new Displaying(type, typoCorrectionEnabled, customPaddings, withImages, titlePattern, sortDirection, hideTitle, tipIconParameters, imageParams, style, keepSelectedChip, areGroupsCollapsible, groups, titleTipAction, confirmButtonTitle, placeholder, hideShowMore, dialogDisplaying, optionImageSize, topValues, toFillIn, badge, limit, limitMessage, itemsStyle, isComposeView, selectorCardGroupDisplaying);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Displaying)) {
                return false;
            }
            Displaying displaying = (Displaying) other;
            return L.f(this.type, displaying.type) && L.f(this.typoCorrectionEnabled, displaying.typoCorrectionEnabled) && L.f(this.customPaddings, displaying.customPaddings) && L.f(this.withImages, displaying.withImages) && L.f(this.titlePattern, displaying.titlePattern) && this.sortDirection == displaying.sortDirection && L.f(this.hideTitle, displaying.hideTitle) && L.f(this.tipIconParameters, displaying.tipIconParameters) && L.f(this.imageParams, displaying.imageParams) && L.f(this.style, displaying.style) && L.f(this.keepSelectedChip, displaying.keepSelectedChip) && L.f(this.areGroupsCollapsible, displaying.areGroupsCollapsible) && L.f(this.groups, displaying.groups) && L.f(this.titleTipAction, displaying.titleTipAction) && L.f(this.confirmButtonTitle, displaying.confirmButtonTitle) && L.f(this.placeholder, displaying.placeholder) && L.f(this.hideShowMore, displaying.hideShowMore) && L.f(this.dialogDisplaying, displaying.dialogDisplaying) && L.f(this.optionImageSize, displaying.optionImageSize) && L.f(this.topValues, displaying.topValues) && L.f(this.toFillIn, displaying.toFillIn) && L.f(this.badge, displaying.badge) && L.f(this.limit, displaying.limit) && L.f(this.limitMessage, displaying.limitMessage) && L.f(this.itemsStyle, displaying.itemsStyle) && this.isComposeView == displaying.isComposeView && L.f(this.selectorCardGroupDisplaying, displaying.selectorCardGroupDisplaying);
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplaying
        @l
        public Boolean getAreGroupsCollapsible() {
            return this.areGroupsCollapsible;
        }

        @l
        public final Badge getBadge() {
            return this.badge;
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplaying
        @l
        public String getConfirmButtonTitle() {
            return this.confirmButtonTitle;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectDisplayingOptions
        @l
        public CustomPaddings getCustomPaddings() {
            return this.customPaddings;
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplaying
        @l
        public DialogDisplaying getDialogDisplaying() {
            return this.dialogDisplaying;
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplaying
        @l
        public List<Group> getGroups() {
            return this.groups;
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplaying
        @l
        public Boolean getHideShowMore() {
            return this.hideShowMore;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectDisplayingOptions
        @l
        public Boolean getHideTitle() {
            return this.hideTitle;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectDisplayingOptions
        @l
        public DisplayingImageParams getImageParams() {
            return this.imageParams;
        }

        @l
        public final String getItemsStyle() {
            return this.itemsStyle;
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplaying
        @l
        public Boolean getKeepSelectedChip() {
            return this.keepSelectedChip;
        }

        @l
        public final Integer getLimit() {
            return this.limit;
        }

        @l
        public final String getLimitMessage() {
            return this.limitMessage;
        }

        @l
        public final OptionImageSize getOptionImageSize() {
            return this.optionImageSize;
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplaying
        @l
        public String getPlaceholder() {
            return this.placeholder;
        }

        @l
        public final SelectorCardGroupDisplaying getSelectorCardGroupDisplaying() {
            return this.selectorCardGroupDisplaying;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectDisplayingOptions
        @l
        public SortDirection getSortDirection() {
            return this.sortDirection;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectDisplayingOptions
        @l
        public String getStyle() {
            return this.style;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectDisplayingOptions
        @l
        public TipIconParameters getTipIconParameters() {
            return this.tipIconParameters;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectDisplayingOptions
        @l
        public String getTitlePattern() {
            return this.titlePattern;
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplaying
        @l
        public DeepLink getTitleTipAction() {
            return this.titleTipAction;
        }

        @l
        public final Boolean getToFillIn() {
            return this.toFillIn;
        }

        @Override // com.avito.android.remote.model.category_parameters.MultiselectDisplaying
        @l
        public List<String> getTopValues() {
            return this.topValues;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectDisplayingOptions
        @l
        public String getType() {
            return this.type;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectDisplayingOptions
        @l
        public Boolean getTypoCorrectionEnabled() {
            return this.typoCorrectionEnabled;
        }

        @Override // com.avito.android.remote.model.category_parameters.SelectDisplayingOptions
        @l
        public Boolean getWithImages() {
            return this.withImages;
        }

        public int hashCode() {
            String str = this.type;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.typoCorrectionEnabled;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            CustomPaddings customPaddings = this.customPaddings;
            int iHashCode3 = (iHashCode2 + (customPaddings == null ? 0 : customPaddings.hashCode())) * 31;
            Boolean bool2 = this.withImages;
            int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str2 = this.titlePattern;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            SortDirection sortDirection = this.sortDirection;
            int iHashCode6 = (iHashCode5 + (sortDirection == null ? 0 : sortDirection.hashCode())) * 31;
            Boolean bool3 = this.hideTitle;
            int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            TipIconParameters tipIconParameters = this.tipIconParameters;
            int iHashCode8 = (iHashCode7 + (tipIconParameters == null ? 0 : tipIconParameters.hashCode())) * 31;
            DisplayingImageParams displayingImageParams = this.imageParams;
            int iHashCode9 = (iHashCode8 + (displayingImageParams == null ? 0 : displayingImageParams.hashCode())) * 31;
            String str3 = this.style;
            int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool4 = this.keepSelectedChip;
            int iHashCode11 = (iHashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.areGroupsCollapsible;
            int iHashCode12 = (iHashCode11 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            List<Group> list = this.groups;
            int iHashCode13 = (iHashCode12 + (list == null ? 0 : list.hashCode())) * 31;
            DeepLink deepLink = this.titleTipAction;
            int iHashCode14 = (iHashCode13 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            String str4 = this.confirmButtonTitle;
            int iHashCode15 = (iHashCode14 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.placeholder;
            int iHashCode16 = (iHashCode15 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Boolean bool6 = this.hideShowMore;
            int iHashCode17 = (iHashCode16 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            DialogDisplaying dialogDisplaying = this.dialogDisplaying;
            int iHashCode18 = (iHashCode17 + (dialogDisplaying == null ? 0 : dialogDisplaying.hashCode())) * 31;
            OptionImageSize optionImageSize = this.optionImageSize;
            int iHashCode19 = (iHashCode18 + (optionImageSize == null ? 0 : optionImageSize.hashCode())) * 31;
            List<String> list2 = this.topValues;
            int iHashCode20 = (iHashCode19 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Boolean bool7 = this.toFillIn;
            int iHashCode21 = (iHashCode20 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            Badge badge = this.badge;
            int iHashCode22 = (iHashCode21 + (badge == null ? 0 : badge.hashCode())) * 31;
            Integer num = this.limit;
            int iHashCode23 = (iHashCode22 + (num == null ? 0 : num.hashCode())) * 31;
            String str6 = this.limitMessage;
            int iHashCode24 = (iHashCode23 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.itemsStyle;
            int i12 = r.i((iHashCode24 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.isComposeView);
            SelectorCardGroupDisplaying selectorCardGroupDisplaying = this.selectorCardGroupDisplaying;
            return i12 + (selectorCardGroupDisplaying != null ? selectorCardGroupDisplaying.hashCode() : 0);
        }

        public final boolean isComposeView() {
            return this.isComposeView;
        }

        @k
        public String toString() {
            return "Displaying(type=" + this.type + ", typoCorrectionEnabled=" + this.typoCorrectionEnabled + ", customPaddings=" + this.customPaddings + ", withImages=" + this.withImages + ", titlePattern=" + this.titlePattern + ", sortDirection=" + this.sortDirection + ", hideTitle=" + this.hideTitle + ", tipIconParameters=" + this.tipIconParameters + ", imageParams=" + this.imageParams + ", style=" + this.style + ", keepSelectedChip=" + this.keepSelectedChip + ", areGroupsCollapsible=" + this.areGroupsCollapsible + ", groups=" + this.groups + ", titleTipAction=" + this.titleTipAction + ", confirmButtonTitle=" + this.confirmButtonTitle + ", placeholder=" + this.placeholder + ", hideShowMore=" + this.hideShowMore + ", dialogDisplaying=" + this.dialogDisplaying + ", optionImageSize=" + this.optionImageSize + ", topValues=" + this.topValues + ", toFillIn=" + this.toFillIn + ", badge=" + this.badge + ", limit=" + this.limit + ", limitMessage=" + this.limitMessage + ", itemsStyle=" + this.itemsStyle + ", isComposeView=" + this.isComposeView + ", selectorCardGroupDisplaying=" + this.selectorCardGroupDisplaying + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.type);
            Boolean bool = this.typoCorrectionEnabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            CustomPaddings customPaddings = this.customPaddings;
            if (customPaddings == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                customPaddings.writeToParcel(parcel, flags);
            }
            Boolean bool2 = this.withImages;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool2);
            }
            parcel.writeString(this.titlePattern);
            SortDirection sortDirection = this.sortDirection;
            if (sortDirection == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(sortDirection.name());
            }
            Boolean bool3 = this.hideTitle;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool3);
            }
            TipIconParameters tipIconParameters = this.tipIconParameters;
            if (tipIconParameters == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                tipIconParameters.writeToParcel(parcel, flags);
            }
            DisplayingImageParams displayingImageParams = this.imageParams;
            if (displayingImageParams == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                displayingImageParams.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.style);
            Boolean bool4 = this.keepSelectedChip;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool4);
            }
            Boolean bool5 = this.areGroupsCollapsible;
            if (bool5 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool5);
            }
            List<Group> list = this.groups;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    ((Group) itA.next()).writeToParcel(parcel, flags);
                }
            }
            parcel.writeParcelable(this.titleTipAction, flags);
            parcel.writeString(this.confirmButtonTitle);
            parcel.writeString(this.placeholder);
            Boolean bool6 = this.hideShowMore;
            if (bool6 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool6);
            }
            DialogDisplaying dialogDisplaying = this.dialogDisplaying;
            if (dialogDisplaying == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dialogDisplaying.writeToParcel(parcel, flags);
            }
            OptionImageSize optionImageSize = this.optionImageSize;
            if (optionImageSize == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                optionImageSize.writeToParcel(parcel, flags);
            }
            parcel.writeStringList(this.topValues);
            Boolean bool7 = this.toFillIn;
            if (bool7 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool7);
            }
            Badge badge = this.badge;
            if (badge == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                badge.writeToParcel(parcel, flags);
            }
            Integer num = this.limit;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            parcel.writeString(this.limitMessage);
            parcel.writeString(this.itemsStyle);
            parcel.writeInt(this.isComposeView ? 1 : 0);
            SelectorCardGroupDisplaying selectorCardGroupDisplaying = this.selectorCardGroupDisplaying;
            if (selectorCardGroupDisplaying == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                selectorCardGroupDisplaying.writeToParcel(parcel, flags);
            }
        }

        /* compiled from: MultiselectParameter.kt */
        @d
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Displaying$Group;", "Landroid/os/Parcelable;", "", "", "ids", "title", "", "ensureOrder", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getIds", "()Ljava/util/List;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getEnsureOrder", "()Ljava/lang/Boolean;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Group implements Parcelable {

            @k
            public static final Parcelable.Creator<Group> CREATOR = new Creator();

            @c("ensureOrder")
            @l
            private final Boolean ensureOrder;

            @c("groupIds")
            @k
            private final List<String> ids;

            @c("groupTitle")
            @l
            private final String title;

            /* compiled from: MultiselectParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Group> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Group createFromParcel(@k Parcel parcel) {
                    Boolean boolValueOf;
                    ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                    String string = parcel.readString();
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new Group(arrayListCreateStringArrayList, string, boolValueOf);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Group[] newArray(int i12) {
                    return new Group[i12];
                }
            }

            public Group(@k List<String> list, @l String str, @l Boolean bool) {
                this.ids = list;
                this.title = str;
                this.ensureOrder = bool;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @l
            public final Boolean getEnsureOrder() {
                return this.ensureOrder;
            }

            @k
            public final List<String> getIds() {
                return this.ids;
            }

            @l
            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeStringList(this.ids);
                parcel.writeString(this.title);
                Boolean bool = this.ensureOrder;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool);
                }
            }

            public /* synthetic */ Group(List list, String str, Boolean bool, int i12, C42822w c42822w) {
                this(list, str, (i12 & 4) != 0 ? Boolean.FALSE : bool);
            }
        }

        public /* synthetic */ Displaying(String str, Boolean bool, CustomPaddings customPaddings, Boolean bool2, String str2, SortDirection sortDirection, Boolean bool3, TipIconParameters tipIconParameters, DisplayingImageParams displayingImageParams, String str3, Boolean bool4, Boolean bool5, List list, DeepLink deepLink, String str4, String str5, Boolean bool6, DialogDisplaying dialogDisplaying, OptionImageSize optionImageSize, List list2, Boolean bool7, Badge badge, Integer num, String str6, String str7, boolean z12, SelectorCardGroupDisplaying selectorCardGroupDisplaying, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? Boolean.FALSE : bool, (i12 & 4) != 0 ? null : customPaddings, (i12 & 8) != 0 ? Boolean.FALSE : bool2, (i12 & 16) != 0 ? null : str2, (i12 & 32) != 0 ? null : sortDirection, (i12 & 64) != 0 ? Boolean.FALSE : bool3, (i12 & 128) != 0 ? null : tipIconParameters, (i12 & 256) != 0 ? null : displayingImageParams, (i12 & 512) != 0 ? null : str3, (i12 & 1024) != 0 ? null : bool4, (i12 & 2048) != 0 ? Boolean.FALSE : bool5, (i12 & 4096) != 0 ? null : list, (i12 & 8192) != 0 ? null : deepLink, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str4, (i12 & 32768) != 0 ? null : str5, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? Boolean.FALSE : bool6, (i12 & 131072) != 0 ? null : dialogDisplaying, (i12 & 262144) != 0 ? null : optionImageSize, (i12 & 524288) != 0 ? null : list2, (i12 & 1048576) != 0 ? null : bool7, (i12 & 2097152) != 0 ? null : badge, (i12 & 4194304) != 0 ? null : num, (i12 & 8388608) != 0 ? null : str6, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : str7, (i12 & 33554432) != 0 ? false : z12, (i12 & 67108864) == 0 ? selectorCardGroupDisplaying : null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MultiselectParameter(@k String str, @k String str2, boolean z12, boolean z13, @l AttributedText attributedText, @l Boolean bool, @l Boolean bool2, @l List<String> list, @l Displaying displaying, @k List<Value> list2, @l List<Value> list3, @l String str3, @l Integer num, @l Integer num2, @l AttributedText attributedText2, @l Set<String> set, @l FilterHint filterHint, @l Boolean bool3, @l Boolean bool4, @l Boolean bool5, boolean z14, @l List<? extends Constraint> list4) {
        this.id = str;
        this.title = str2;
        this.required = z12;
        this.immutable = z13;
        this.motivation = attributedText;
        this.updatesForm = bool;
        this.updatesObjectForm = bool2;
        this._value = list;
        this.displaying = displaying;
        this.values = list2;
        this.selectedValues = list3;
        this.placeholder = str3;
        this.attributeId = num;
        this.maxSelected = num2;
        this.subtitle = attributedText2;
        this.availableOptions = set;
        this.hint = filterHint;
        this.visible = bool3;
        this.phantom = bool4;
        this.hasSuggest = bool5;
        this.resetAreaOnChange = z14;
        this.constraints = list4;
        this.typoCorrectionEnabled = displaying != null ? displaying.getTypoCorrectionEnabled() : null;
    }

    public static /* synthetic */ void getTypoCorrectionEnabled$annotations() {
    }
}
