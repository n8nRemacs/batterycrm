package com.avito.android.beduin.common.component.input.single_line;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.beduin.common.component.input.InputIcon;
import com.avito.android.beduin.common.component.input.InputLayoutMode;
import com.avito.android.beduin.common.component.input.k;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.ErrorMessageTransform;
import com.avito.android.beduin.common.form.transforms.IsEnabledTransform;
import com.avito.android.beduin.common.form.transforms.LocalErrorMessageTransform;
import com.avito.android.beduin.common.form.transforms.LocalTextTransform;
import com.avito.android.beduin.common.form.transforms.ShowErrorMessageTransform;
import com.avito.android.beduin.common.form.transforms.ShowRightIconTransform;
import com.avito.android.beduin.network.model.Constraint;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.beduin_shared.common.form.transforms.TextTransform;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: SingleLineInputModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\b\u0087\b\u0018\u0000 \u0083\u00012\u00020\u0001:\u0002\u0084\u0001B¡\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010 \u001a\u0004\u0018\u00010\n\u0012\b\u0010!\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020*H\u0016¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u00100J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u00100J\u0012\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b9\u00100J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u00100J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u00100J\u0018\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0018\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b>\u0010=J\u0012\u0010?\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b?\u00100J\u0012\u0010@\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b@\u00108J\u0012\u0010A\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0018\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bE\u0010=J\u0018\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bF\u0010=J\u0012\u0010G\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0012\u0010I\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bI\u00108J\u0012\u0010J\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bJ\u0010DJ\u0012\u0010K\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bK\u00108J\u0012\u0010L\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bL\u00108J\u0018\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bM\u0010=J\u0012\u0010N\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\bN\u0010OJÖ\u0002\u0010P\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bR\u00100J\u0010\u0010S\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\bS\u0010TJ\u001a\u0010W\u001a\u00020\n2\b\u0010V\u001a\u0004\u0018\u00010UHÖ\u0003¢\u0006\u0004\bW\u0010XJ\u0010\u0010Y\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\bY\u0010TJ \u0010^\u001a\u00020]2\u0006\u0010[\u001a\u00020Z2\u0006\u0010\\\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b^\u0010_J\u0012\u0010`\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b`\u00100R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010a\u001a\u0004\bb\u00100R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010a\u001a\u0004\bc\u00100R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010a\u001a\u0004\bd\u00100R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010e\u001a\u0004\bf\u00104R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010g\u001a\u0004\bh\u00106R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010i\u001a\u0004\b\u000b\u00108R\u001a\u0010\f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010a\u001a\u0004\bj\u00100R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010a\u001a\u0004\bk\u00100R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010a\u001a\u0004\bl\u00100R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010m\u001a\u0004\bn\u0010=R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010m\u001a\u0004\bo\u0010=R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010a\u001a\u0004\bp\u00100R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010i\u001a\u0004\bq\u00108R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010r\u001a\u0004\bs\u0010BR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010t\u001a\u0004\bu\u0010DR\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010m\u001a\u0004\bv\u0010=R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010m\u001a\u0004\bw\u0010=R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010x\u001a\u0004\by\u0010HR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010i\u001a\u0004\bz\u00108R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010t\u001a\u0004\b{\u0010DR\u0019\u0010 \u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b \u0010i\u001a\u0004\b|\u00108R\u0019\u0010!\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b!\u0010i\u001a\u0004\b}\u00108R\u001f\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\"\u0010m\u001a\u0004\b~\u0010=R\u001a\u0010$\u001a\u0004\u0018\u00010#8\u0006¢\u0006\r\n\u0004\b$\u0010\u007f\u001a\u0005\b\u0080\u0001\u0010OR\u0016\u0010%\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010aR\u0017\u0010\u0081\u0001\u001a\u00020\n8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001¨\u0006\u0085\u0001"}, d2 = {"Lcom/avito/android/beduin/common/component/input/single_line/SingleLineInputModel;", "Lcom/avito/android/beduin/common/component/input/BeduinInputModel;", "", "id", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/beduin/common/component/input/single_line/BeduinFormatterType;", "formatter", "Lcom/avito/android/beduin/common/component/input/single_line/KeyboardType;", "keyboard", "", "isEnabled", "text", "details", ChannelContext.Item.PLACEHOLDER, "", "Lcom/avito/android/beduin/network/model/Constraint;", "constraints", "Lcom/avito/android/beduin_models/BeduinAction;", "onEndEditingActions", "errorMessage", "showErrorMessage", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "textVersion", "onFocusedActions", "onTextChangeActions", "Lcom/avito/android/beduin/common/component/input/InputIcon;", "rightIcon", "showRightIcon", "maxLength", "allCaps", "onlyLettersAndNumbers", "onEditorActions", "Lcom/avito/android/beduin/common/component/input/InputLayoutMode;", "layoutMode", "deformattedText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/common/component/input/single_line/BeduinFormatterType;Lcom/avito/android/beduin/common/component/input/single_line/KeyboardType;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin/common/component/input/InputIcon;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lcom/avito/android/beduin/common/component/input/InputLayoutMode;Ljava/lang/String;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "validateModelByConstraints", "()Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/beduin/common/component/input/single_line/BeduinFormatterType;", "component5", "()Lcom/avito/android/beduin/common/component/input/single_line/KeyboardType;", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "component9", "component10", "()Ljava/util/List;", "component11", "component12", "component13", "component14", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component15", "()Ljava/lang/Integer;", "component16", "component17", "component18", "()Lcom/avito/android/beduin/common/component/input/InputIcon;", "component19", "component20", "component21", "component22", "component23", "component24", "()Lcom/avito/android/beduin/common/component/input/InputLayoutMode;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/common/component/input/single_line/BeduinFormatterType;Lcom/avito/android/beduin/common/component/input/single_line/KeyboardType;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin/common/component/input/InputIcon;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lcom/avito/android/beduin/common/component/input/InputLayoutMode;Ljava/lang/String;)Lcom/avito/android/beduin/common/component/input/single_line/SingleLineInputModel;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component25", "Ljava/lang/String;", "getId", "getTheme", "getStyle", "Lcom/avito/android/beduin/common/component/input/single_line/BeduinFormatterType;", "getFormatter", "Lcom/avito/android/beduin/common/component/input/single_line/KeyboardType;", "getKeyboard", "Ljava/lang/Boolean;", "getText", "getDetails", "getPlaceholder", "Ljava/util/List;", "getConstraints", "getOnEndEditingActions", "getErrorMessage", "getShowErrorMessage", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Ljava/lang/Integer;", "getTextVersion", "getOnFocusedActions", "getOnTextChangeActions", "Lcom/avito/android/beduin/common/component/input/InputIcon;", "getRightIcon", "getShowRightIcon", "getMaxLength", "getAllCaps", "getOnlyLettersAndNumbers", "getOnEditorActions", "Lcom/avito/android/beduin/common/component/input/InputLayoutMode;", "getLayoutMode", "isValid", "()Z", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SingleLineInputModel extends BeduinInputModel {

    @k
    public static final String STYLE_SEARCH = "search";

    @l
    private final Boolean allCaps;

    @l
    private final List<Constraint> constraints;

    @l
    private final String deformattedText;

    @l
    private final String details;

    @l
    private final DisplayingPredicate displayingPredicate;

    @l
    private final String errorMessage;

    @l
    private final BeduinFormatterType formatter;

    @k
    private final String id;

    @l
    private final Boolean isEnabled;

    @l
    private final KeyboardType keyboard;

    @l
    private final InputLayoutMode layoutMode;

    @l
    private final Integer maxLength;

    @l
    private final List<BeduinAction> onEditorActions;

    @l
    private final List<BeduinAction> onEndEditingActions;

    @l
    private final List<BeduinAction> onFocusedActions;

    @l
    private final List<BeduinAction> onTextChangeActions;

    @l
    private final Boolean onlyLettersAndNumbers;

    @l
    private final String placeholder;

    @l
    private final InputIcon rightIcon;

    @l
    private final Boolean showErrorMessage;

    @l
    private final Boolean showRightIcon;

    @l
    private final String style;

    @k
    private final String text;

    @l
    private final Integer textVersion;

    @l
    private final String theme;

    @k
    public static final Parcelable.Creator<SingleLineInputModel> CREATOR = new b();

    /* compiled from: SingleLineInputModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<SingleLineInputModel> {
        @Override // android.os.Parcelable.Creator
        public final SingleLineInputModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean boolValueOf2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            ArrayList arrayList5;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            BeduinFormatterType beduinFormatterTypeValueOf = parcel.readInt() == 0 ? null : BeduinFormatterType.valueOf(parcel.readString());
            KeyboardType keyboardTypeValueOf = parcel.readInt() == 0 ? null : KeyboardType.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(SingleLineInputModel.class, parcel, arrayList, iL2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i13);
                int iL3 = 0;
                while (iL3 != i13) {
                    iL3 = com.avito.android.actions_sheet.a.l(SingleLineInputModel.class, parcel, arrayList6, iL3, 1);
                }
                arrayList2 = arrayList6;
            }
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(SingleLineInputModel.class.getClassLoader());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i14);
                int iL4 = 0;
                while (iL4 != i14) {
                    iL4 = com.avito.android.actions_sheet.a.l(SingleLineInputModel.class, parcel, arrayList7, iL4, 1);
                    i14 = i14;
                }
                arrayList3 = arrayList7;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i15);
                int iL5 = 0;
                while (iL5 != i15) {
                    iL5 = com.avito.android.actions_sheet.a.l(SingleLineInputModel.class, parcel, arrayList8, iL5, 1);
                    i15 = i15;
                }
                arrayList4 = arrayList8;
            }
            InputIcon inputIconCreateFromParcel = parcel.readInt() == 0 ? null : InputIcon.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
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
                arrayList5 = null;
            } else {
                int i16 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(i16);
                int iL6 = 0;
                while (iL6 != i16) {
                    iL6 = com.avito.android.actions_sheet.a.l(SingleLineInputModel.class, parcel, arrayList9, iL6, 1);
                    i16 = i16;
                }
                arrayList5 = arrayList9;
            }
            return new SingleLineInputModel(string, string2, string3, beduinFormatterTypeValueOf, keyboardTypeValueOf, boolValueOf, string4, string5, string6, arrayList, arrayList2, string7, boolValueOf2, displayingPredicate, numValueOf, arrayList3, arrayList4, inputIconCreateFromParcel, boolValueOf3, numValueOf2, boolValueOf4, boolValueOf5, arrayList5, parcel.readInt() == 0 ? null : InputLayoutMode.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SingleLineInputModel[] newArray(int i12) {
            return new SingleLineInputModel[i12];
        }
    }

    public /* synthetic */ SingleLineInputModel(String str, String str2, String str3, BeduinFormatterType beduinFormatterType, KeyboardType keyboardType, Boolean bool, String str4, String str5, String str6, List list, List list2, String str7, Boolean bool2, DisplayingPredicate displayingPredicate, Integer num, List list3, List list4, InputIcon inputIcon, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, List list5, InputLayoutMode inputLayoutMode, String str8, int i12, C42822w c42822w) {
        this(str, str2, str3, beduinFormatterType, keyboardType, bool, str4, str5, str6, list, list2, str7, bool2, displayingPredicate, num, list3, list4, inputIcon, (i12 & 262144) != 0 ? null : bool3, num2, bool4, bool5, list5, (i12 & 8388608) != 0 ? null : inputLayoutMode, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : str8);
    }

    /* renamed from: component25, reason: from getter */
    private final String getDeformattedText() {
        return this.deformattedText;
    }

    public static /* synthetic */ SingleLineInputModel copy$default(SingleLineInputModel singleLineInputModel, String str, String str2, String str3, BeduinFormatterType beduinFormatterType, KeyboardType keyboardType, Boolean bool, String str4, String str5, String str6, List list, List list2, String str7, Boolean bool2, DisplayingPredicate displayingPredicate, Integer num, List list3, List list4, InputIcon inputIcon, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, List list5, InputLayoutMode inputLayoutMode, String str8, int i12, Object obj) {
        return singleLineInputModel.copy((i12 & 1) != 0 ? singleLineInputModel.id : str, (i12 & 2) != 0 ? singleLineInputModel.theme : str2, (i12 & 4) != 0 ? singleLineInputModel.style : str3, (i12 & 8) != 0 ? singleLineInputModel.formatter : beduinFormatterType, (i12 & 16) != 0 ? singleLineInputModel.keyboard : keyboardType, (i12 & 32) != 0 ? singleLineInputModel.isEnabled : bool, (i12 & 64) != 0 ? singleLineInputModel.text : str4, (i12 & 128) != 0 ? singleLineInputModel.details : str5, (i12 & 256) != 0 ? singleLineInputModel.placeholder : str6, (i12 & 512) != 0 ? singleLineInputModel.constraints : list, (i12 & 1024) != 0 ? singleLineInputModel.onEndEditingActions : list2, (i12 & 2048) != 0 ? singleLineInputModel.errorMessage : str7, (i12 & 4096) != 0 ? singleLineInputModel.showErrorMessage : bool2, (i12 & 8192) != 0 ? singleLineInputModel.displayingPredicate : displayingPredicate, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? singleLineInputModel.textVersion : num, (i12 & 32768) != 0 ? singleLineInputModel.onFocusedActions : list3, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? singleLineInputModel.onTextChangeActions : list4, (i12 & 131072) != 0 ? singleLineInputModel.rightIcon : inputIcon, (i12 & 262144) != 0 ? singleLineInputModel.showRightIcon : bool3, (i12 & 524288) != 0 ? singleLineInputModel.maxLength : num2, (i12 & 1048576) != 0 ? singleLineInputModel.allCaps : bool4, (i12 & 2097152) != 0 ? singleLineInputModel.onlyLettersAndNumbers : bool5, (i12 & 4194304) != 0 ? singleLineInputModel.onEditorActions : list5, (i12 & 8388608) != 0 ? singleLineInputModel.layoutMode : inputLayoutMode, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? singleLineInputModel.deformattedText : str8);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        if (transform instanceof DisplayPredicateTransform) {
            return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, null, null, null, null, null, null, null, null, 33546239, null);
        }
        if (transform instanceof TextTransform) {
            return copy$default(this, null, null, null, null, null, null, ((TextTransform) transform).getText(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554367, null);
        }
        if (!(transform instanceof LocalTextTransform)) {
            return transform instanceof ErrorMessageTransform ? copy$default(this, null, null, null, null, null, null, null, null, null, null, null, ((ErrorMessageTransform) transform).getErrorMessage(), Boolean.TRUE, null, null, null, null, null, null, null, null, null, null, null, null, 33548287, null) : transform instanceof LocalErrorMessageTransform ? copy$default(this, null, null, null, null, null, null, null, null, null, null, null, ((LocalErrorMessageTransform) transform).f103386b, null, null, null, null, null, null, null, null, null, null, null, null, null, 33552383, null) : transform instanceof ShowErrorMessageTransform ? copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(((ShowErrorMessageTransform) transform).getShowErrorMessage()), null, null, null, null, null, null, null, null, null, null, null, null, 33550335, null) : transform instanceof IsEnabledTransform ? copy$default(this, null, null, null, null, null, Boolean.valueOf(((IsEnabledTransform) transform).isEnabled()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554399, null) : transform instanceof ShowRightIconTransform ? copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(((ShowRightIconTransform) transform).f103408b), null, null, null, null, null, null, 33292287, null) : this;
        }
        LocalTextTransform localTextTransform = (LocalTextTransform) transform;
        return copy$default(this, null, null, null, null, null, null, localTextTransform.f103387b, null, null, null, null, null, null, null, Integer.valueOf(localTextTransform.f103388c), null, null, null, null, null, null, null, null, null, localTextTransform.f103389d, 16760767, null);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    public final List<Constraint> component10() {
        return this.constraints;
    }

    @l
    public final List<BeduinAction> component11() {
        return this.onEndEditingActions;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final Boolean getShowErrorMessage() {
        return this.showErrorMessage;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @l
    /* renamed from: component15, reason: from getter */
    public final Integer getTextVersion() {
        return this.textVersion;
    }

    @l
    public final List<BeduinAction> component16() {
        return this.onFocusedActions;
    }

    @l
    public final List<BeduinAction> component17() {
        return this.onTextChangeActions;
    }

    @l
    /* renamed from: component18, reason: from getter */
    public final InputIcon getRightIcon() {
        return this.rightIcon;
    }

    @l
    /* renamed from: component19, reason: from getter */
    public final Boolean getShowRightIcon() {
        return this.showRightIcon;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    @l
    /* renamed from: component20, reason: from getter */
    public final Integer getMaxLength() {
        return this.maxLength;
    }

    @l
    /* renamed from: component21, reason: from getter */
    public final Boolean getAllCaps() {
        return this.allCaps;
    }

    @l
    /* renamed from: component22, reason: from getter */
    public final Boolean getOnlyLettersAndNumbers() {
        return this.onlyLettersAndNumbers;
    }

    @l
    public final List<BeduinAction> component23() {
        return this.onEditorActions;
    }

    @l
    /* renamed from: component24, reason: from getter */
    public final InputLayoutMode getLayoutMode() {
        return this.layoutMode;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final BeduinFormatterType getFormatter() {
        return this.formatter;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final KeyboardType getKeyboard() {
        return this.keyboard;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    @k
    /* renamed from: component7, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final String getDetails() {
        return this.details;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @k
    public final SingleLineInputModel copy(@k String id2, @l String theme, @l String style, @l BeduinFormatterType formatter, @l KeyboardType keyboard, @l Boolean isEnabled, @k String text, @l String details, @l String placeholder, @l List<? extends Constraint> constraints, @l List<? extends BeduinAction> onEndEditingActions, @l String errorMessage, @l Boolean showErrorMessage, @l DisplayingPredicate displayingPredicate, @l Integer textVersion, @l List<? extends BeduinAction> onFocusedActions, @l List<? extends BeduinAction> onTextChangeActions, @l InputIcon rightIcon, @l Boolean showRightIcon, @l Integer maxLength, @l Boolean allCaps, @l Boolean onlyLettersAndNumbers, @l List<? extends BeduinAction> onEditorActions, @l InputLayoutMode layoutMode, @l String deformattedText) {
        return new SingleLineInputModel(id2, theme, style, formatter, keyboard, isEnabled, text, details, placeholder, constraints, onEndEditingActions, errorMessage, showErrorMessage, displayingPredicate, textVersion, onFocusedActions, onTextChangeActions, rightIcon, showRightIcon, maxLength, allCaps, onlyLettersAndNumbers, onEditorActions, layoutMode, deformattedText);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleLineInputModel)) {
            return false;
        }
        SingleLineInputModel singleLineInputModel = (SingleLineInputModel) other;
        return L.f(this.id, singleLineInputModel.id) && L.f(this.theme, singleLineInputModel.theme) && L.f(this.style, singleLineInputModel.style) && this.formatter == singleLineInputModel.formatter && this.keyboard == singleLineInputModel.keyboard && L.f(this.isEnabled, singleLineInputModel.isEnabled) && L.f(this.text, singleLineInputModel.text) && L.f(this.details, singleLineInputModel.details) && L.f(this.placeholder, singleLineInputModel.placeholder) && L.f(this.constraints, singleLineInputModel.constraints) && L.f(this.onEndEditingActions, singleLineInputModel.onEndEditingActions) && L.f(this.errorMessage, singleLineInputModel.errorMessage) && L.f(this.showErrorMessage, singleLineInputModel.showErrorMessage) && L.f(this.displayingPredicate, singleLineInputModel.displayingPredicate) && L.f(this.textVersion, singleLineInputModel.textVersion) && L.f(this.onFocusedActions, singleLineInputModel.onFocusedActions) && L.f(this.onTextChangeActions, singleLineInputModel.onTextChangeActions) && L.f(this.rightIcon, singleLineInputModel.rightIcon) && L.f(this.showRightIcon, singleLineInputModel.showRightIcon) && L.f(this.maxLength, singleLineInputModel.maxLength) && L.f(this.allCaps, singleLineInputModel.allCaps) && L.f(this.onlyLettersAndNumbers, singleLineInputModel.onlyLettersAndNumbers) && L.f(this.onEditorActions, singleLineInputModel.onEditorActions) && this.layoutMode == singleLineInputModel.layoutMode && L.f(this.deformattedText, singleLineInputModel.deformattedText);
    }

    @l
    public final Boolean getAllCaps() {
        return this.allCaps;
    }

    @Override // com.avito.android.beduin.common.component.input.BeduinInputModel
    @l
    public List<Constraint> getConstraints() {
        return this.constraints;
    }

    @Override // com.avito.android.beduin.common.component.input.BeduinInputModel
    @l
    public String getDetails() {
        return this.details;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF102945c() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin.common.component.input.BeduinInputModel
    @l
    public String getErrorMessage() {
        return this.errorMessage;
    }

    @l
    public final BeduinFormatterType getFormatter() {
        return this.formatter;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId */
    public String getF102944b() {
        return this.id;
    }

    @l
    public final KeyboardType getKeyboard() {
        return this.keyboard;
    }

    @l
    public final InputLayoutMode getLayoutMode() {
        return this.layoutMode;
    }

    @Override // com.avito.android.beduin.common.component.input.BeduinInputModel
    @l
    public Integer getMaxLength() {
        return this.maxLength;
    }

    @l
    public final List<BeduinAction> getOnEditorActions() {
        return this.onEditorActions;
    }

    @Override // com.avito.android.beduin.common.component.input.BeduinInputModel
    @l
    public List<BeduinAction> getOnEndEditingActions() {
        return this.onEndEditingActions;
    }

    @Override // com.avito.android.beduin.common.component.input.BeduinInputModel
    @l
    public List<BeduinAction> getOnFocusedActions() {
        return this.onFocusedActions;
    }

    @Override // com.avito.android.beduin.common.component.input.BeduinInputModel
    @l
    public List<BeduinAction> getOnTextChangeActions() {
        return this.onTextChangeActions;
    }

    @l
    public final Boolean getOnlyLettersAndNumbers() {
        return this.onlyLettersAndNumbers;
    }

    @Override // com.avito.android.beduin.common.component.input.BeduinInputModel
    @l
    public String getPlaceholder() {
        return this.placeholder;
    }

    @Override // com.avito.android.beduin.common.component.input.BeduinInputModel
    @l
    public InputIcon getRightIcon() {
        return this.rightIcon;
    }

    @Override // com.avito.android.beduin.common.component.input.BeduinInputModel
    @l
    public Boolean getShowErrorMessage() {
        return this.showErrorMessage;
    }

    @Override // com.avito.android.beduin.common.component.input.BeduinInputModel
    @l
    public Boolean getShowRightIcon() {
        return this.showRightIcon;
    }

    @l
    public final String getStyle() {
        return this.style;
    }

    @Override // com.avito.android.beduin.common.component.input.BeduinInputModel
    @k
    public String getText() {
        return this.text;
    }

    @Override // com.avito.android.beduin.common.component.input.BeduinInputModel
    @l
    public Integer getTextVersion() {
        return this.textVersion;
    }

    @l
    public final String getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.theme;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.style;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BeduinFormatterType beduinFormatterType = this.formatter;
        int iHashCode4 = (iHashCode3 + (beduinFormatterType == null ? 0 : beduinFormatterType.hashCode())) * 31;
        KeyboardType keyboardType = this.keyboard;
        int iHashCode5 = (iHashCode4 + (keyboardType == null ? 0 : keyboardType.hashCode())) * 31;
        Boolean bool = this.isEnabled;
        int iD2 = H.d((iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.text);
        String str3 = this.details;
        int iHashCode6 = (iD2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.placeholder;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<Constraint> list = this.constraints;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<BeduinAction> list2 = this.onEndEditingActions;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.errorMessage;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.showErrorMessage;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode12 = (iHashCode11 + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        Integer num = this.textVersion;
        int iHashCode13 = (iHashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        List<BeduinAction> list3 = this.onFocusedActions;
        int iHashCode14 = (iHashCode13 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<BeduinAction> list4 = this.onTextChangeActions;
        int iHashCode15 = (iHashCode14 + (list4 == null ? 0 : list4.hashCode())) * 31;
        InputIcon inputIcon = this.rightIcon;
        int iHashCode16 = (iHashCode15 + (inputIcon == null ? 0 : inputIcon.hashCode())) * 31;
        Boolean bool3 = this.showRightIcon;
        int iHashCode17 = (iHashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.maxLength;
        int iHashCode18 = (iHashCode17 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.allCaps;
        int iHashCode19 = (iHashCode18 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.onlyLettersAndNumbers;
        int iHashCode20 = (iHashCode19 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        List<BeduinAction> list5 = this.onEditorActions;
        int iHashCode21 = (iHashCode20 + (list5 == null ? 0 : list5.hashCode())) * 31;
        InputLayoutMode inputLayoutMode = this.layoutMode;
        int iHashCode22 = (iHashCode21 + (inputLayoutMode == null ? 0 : inputLayoutMode.hashCode())) * 31;
        String str6 = this.deformattedText;
        return iHashCode22 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // com.avito.android.beduin.common.component.input.BeduinInputModel
    @l
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    @Override // com.avito.android.beduin.common.component.input.BeduinInputModel, com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    public boolean isValid() {
        String errorMessage;
        return L.f(com.avito.android.beduin.common.component.input.j.b(getText(), this.deformattedText, getConstraints()), k.b.f101561a) && ((errorMessage = getErrorMessage()) == null || errorMessage.length() == 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SingleLineInputModel(id=");
        sb2.append(this.id);
        sb2.append(", theme=");
        sb2.append(this.theme);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", formatter=");
        sb2.append(this.formatter);
        sb2.append(", keyboard=");
        sb2.append(this.keyboard);
        sb2.append(", isEnabled=");
        sb2.append(this.isEnabled);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", details=");
        sb2.append(this.details);
        sb2.append(", placeholder=");
        sb2.append(this.placeholder);
        sb2.append(", constraints=");
        sb2.append(this.constraints);
        sb2.append(", onEndEditingActions=");
        sb2.append(this.onEndEditingActions);
        sb2.append(", errorMessage=");
        sb2.append(this.errorMessage);
        sb2.append(", showErrorMessage=");
        sb2.append(this.showErrorMessage);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", textVersion=");
        sb2.append(this.textVersion);
        sb2.append(", onFocusedActions=");
        sb2.append(this.onFocusedActions);
        sb2.append(", onTextChangeActions=");
        sb2.append(this.onTextChangeActions);
        sb2.append(", rightIcon=");
        sb2.append(this.rightIcon);
        sb2.append(", showRightIcon=");
        sb2.append(this.showRightIcon);
        sb2.append(", maxLength=");
        sb2.append(this.maxLength);
        sb2.append(", allCaps=");
        sb2.append(this.allCaps);
        sb2.append(", onlyLettersAndNumbers=");
        sb2.append(this.onlyLettersAndNumbers);
        sb2.append(", onEditorActions=");
        sb2.append(this.onEditorActions);
        sb2.append(", layoutMode=");
        sb2.append(this.layoutMode);
        sb2.append(", deformattedText=");
        return C22026a.c(sb2, this.deformattedText, ')');
    }

    @Override // com.avito.android.beduin.common.component.q
    @Y61.k
    public BeduinModel validateModelByConstraints() {
        com.avito.android.beduin.common.component.input.k kVarB = com.avito.android.beduin.common.component.input.j.b(getText(), this.deformattedText, getConstraints());
        String errorMessage = getErrorMessage();
        if (errorMessage == null) {
            errorMessage = com.avito.android.beduin.common.component.input.j.a(kVarB);
        }
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, errorMessage, Boolean.valueOf(kVarB instanceof k.a), null, null, null, null, null, null, null, null, null, null, null, null, 33548287, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.theme);
        parcel.writeString(this.style);
        BeduinFormatterType beduinFormatterType = this.formatter;
        if (beduinFormatterType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(beduinFormatterType.name());
        }
        KeyboardType keyboardType = this.keyboard;
        if (keyboardType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(keyboardType.name());
        }
        Boolean bool = this.isEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.text);
        parcel.writeString(this.details);
        parcel.writeString(this.placeholder);
        List<Constraint> list = this.constraints;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<BeduinAction> list2 = this.onEndEditingActions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
        parcel.writeString(this.errorMessage);
        Boolean bool2 = this.showErrorMessage;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        parcel.writeParcelable(this.displayingPredicate, flags);
        Integer num = this.textVersion;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        List<BeduinAction> list3 = this.onFocusedActions;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                parcel.writeParcelable((Parcelable) itA3.next(), flags);
            }
        }
        List<BeduinAction> list4 = this.onTextChangeActions;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA4 = com.avito.android.actions_sheet.a.A(list4, parcel, 1);
            while (itA4.hasNext()) {
                parcel.writeParcelable((Parcelable) itA4.next(), flags);
            }
        }
        InputIcon inputIcon = this.rightIcon;
        if (inputIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputIcon.writeToParcel(parcel, flags);
        }
        Boolean bool3 = this.showRightIcon;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        Integer num2 = this.maxLength;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Boolean bool4 = this.allCaps;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool4);
        }
        Boolean bool5 = this.onlyLettersAndNumbers;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool5);
        }
        List<BeduinAction> list5 = this.onEditorActions;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA5 = com.avito.android.actions_sheet.a.A(list5, parcel, 1);
            while (itA5.hasNext()) {
                parcel.writeParcelable((Parcelable) itA5.next(), flags);
            }
        }
        InputLayoutMode inputLayoutMode = this.layoutMode;
        if (inputLayoutMode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(inputLayoutMode.name());
        }
        parcel.writeString(this.deformattedText);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SingleLineInputModel(@Y61.k String str, @l String str2, @l String str3, @l BeduinFormatterType beduinFormatterType, @l KeyboardType keyboardType, @l Boolean bool, @Y61.k String str4, @l String str5, @l String str6, @l List<? extends Constraint> list, @l List<? extends BeduinAction> list2, @l String str7, @l Boolean bool2, @l DisplayingPredicate displayingPredicate, @l Integer num, @l List<? extends BeduinAction> list3, @l List<? extends BeduinAction> list4, @l InputIcon inputIcon, @l Boolean bool3, @l Integer num2, @l Boolean bool4, @l Boolean bool5, @l List<? extends BeduinAction> list5, @l InputLayoutMode inputLayoutMode, @l String str8) {
        this.id = str;
        this.theme = str2;
        this.style = str3;
        this.formatter = beduinFormatterType;
        this.keyboard = keyboardType;
        this.isEnabled = bool;
        this.text = str4;
        this.details = str5;
        this.placeholder = str6;
        this.constraints = list;
        this.onEndEditingActions = list2;
        this.errorMessage = str7;
        this.showErrorMessage = bool2;
        this.displayingPredicate = displayingPredicate;
        this.textVersion = num;
        this.onFocusedActions = list3;
        this.onTextChangeActions = list4;
        this.rightIcon = inputIcon;
        this.showRightIcon = bool3;
        this.maxLength = num2;
        this.allCaps = bool4;
        this.onlyLettersAndNumbers = bool5;
        this.onEditorActions = list5;
        this.layoutMode = inputLayoutMode;
        this.deformattedText = str8;
    }
}
