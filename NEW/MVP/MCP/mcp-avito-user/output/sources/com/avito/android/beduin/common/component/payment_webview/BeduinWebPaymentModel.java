package com.avito.android.beduin.common.component.payment_webview;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.model.BeduinLayoutParams;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.IsEnabledTransform;
import com.avito.android.beduin.common.form.transforms.IsLoadingTransform;
import com.avito.android.beduin.common.form.transforms.LayoutParamsTransform;
import com.avito.android.beduin.common.form.transforms.UrlTransform;
import com.avito.android.beduin.common.form.transforms.WebPaymentErrorPlaceholderTransform;
import com.avito.android.beduin.common.form.transforms.WebPaymentPostMessageTransform;
import com.avito.android.beduin.common.form.transforms.WebPaymentShowErrorPlaceholderTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.v0;
import okhttp3.internal.http2.Http2;

/* compiled from: BeduinWebPaymentModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001iBó\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u001b\b\u0002\u0010\u0018\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\f¢\u0006\u0002\b\u0017\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u001d\b\u0002\u0010\u001c\u001a\u0017\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\f¢\u0006\u0002\b\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J=\u0010(\u001a\u00020'2.\u0010&\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00160%0$\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00160%¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010+J\u0012\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010+J$\u00104\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b8\u00102J\u0012\u00109\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b9\u00102J\u0018\u0010:\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b:\u0010;J\u0018\u0010<\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b<\u0010;J#\u0010=\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\f¢\u0006\u0002\b\u0017HÆ\u0003¢\u0006\u0004\b=\u00105J\u0018\u0010>\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b>\u0010;J\u0012\u0010?\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b?\u0010@J%\u0010A\u001a\u0017\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\f¢\u0006\u0002\b\u0017HÆ\u0003¢\u0006\u0004\bA\u00105J\u0094\u0002\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u001b\b\u0002\u0010\u0018\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\f¢\u0006\u0002\b\u00172\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u001d\b\u0002\u0010\u001c\u001a\u0017\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\f¢\u0006\u0002\b\u0017HÆ\u0001¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bD\u0010+J\u0010\u0010F\u001a\u00020EHÖ\u0001¢\u0006\u0004\bF\u0010GJ\u001a\u0010I\u001a\u00020\t2\b\u0010H\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u00020EHÖ\u0001¢\u0006\u0004\bK\u0010GJ \u0010O\u001a\u00020'2\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020EHÖ\u0001¢\u0006\u0004\bO\u0010PR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010Q\u001a\u0004\bR\u0010+R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010S\u001a\u0004\bT\u0010-R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010U\u001a\u0004\bV\u0010/R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010Q\u001a\u0004\bW\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010X\u001a\u0004\b\n\u00102R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010Q\u001a\u0004\bY\u0010+R+\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010Z\u001a\u0004\b[\u00105R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\\\u001a\u0004\b]\u00107R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010X\u001a\u0004\b^\u00102R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010X\u001a\u0004\b\u0013\u00102R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0014\u0010_\u001a\u0004\b`\u0010;R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0015\u0010_\u001a\u0004\ba\u0010;R*\u0010\u0018\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\f¢\u0006\u0002\b\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010Z\u001a\u0004\bb\u00105R\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0019\u0010_\u001a\u0004\bc\u0010;R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010d\u001a\u0004\be\u0010@R7\u0010\u001c\u001a\u0017\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\f¢\u0006\u0002\b\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010Z\u001a\u0004\bf\u00105\"\u0004\bg\u0010h¨\u0006j"}, d2 = {"Lcom/avito/android/beduin/common/component/payment_webview/BeduinWebPaymentModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "Lcom/avito/android/beduin/common/component/model/BeduinLayoutParams;", "layoutParams", ContextActionHandler.Link.URL, "", "isEnabled", "messageTypeKey", "", "", "Lcom/avito/android/beduin_models/BeduinAction;", "messageTypeToActionsMap", "Lcom/avito/android/beduin/common/component/payment_webview/BeduinWebPaymentModel$ErrorPlaceholder;", "errorPlaceholder", "showErrorPlaceholder", "isLoading", "onErrorActions", "onSuccessActions", "", "LK51/e;", "postMessageParams", "onStartRedirectActions", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "extractionParamsMap", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/model/BeduinLayoutParams;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;Lcom/avito/android/beduin/common/component/payment_webview/BeduinWebPaymentModel$ErrorPlaceholder;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Ljava/util/Map;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "", "Lkotlin/Q;", "params", "Lkotlin/G0;", "putExtractionParams", "([Lkotlin/Q;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Lcom/avito/android/beduin/common/component/model/BeduinLayoutParams;", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "()Ljava/util/Map;", "component8", "()Lcom/avito/android/beduin/common/component/payment_webview/BeduinWebPaymentModel$ErrorPlaceholder;", "component9", "component10", "component11", "()Ljava/util/List;", "component12", "component13", "component14", "component15", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "component16", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/model/BeduinLayoutParams;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;Lcom/avito/android/beduin/common/component/payment_webview/BeduinWebPaymentModel$ErrorPlaceholder;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Ljava/util/Map;)Lcom/avito/android/beduin/common/component/payment_webview/BeduinWebPaymentModel;", "toString", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Lcom/avito/android/beduin/common/component/model/BeduinLayoutParams;", "getLayoutParams", "getUrl", "Ljava/lang/Boolean;", "getMessageTypeKey", "Ljava/util/Map;", "getMessageTypeToActionsMap", "Lcom/avito/android/beduin/common/component/payment_webview/BeduinWebPaymentModel$ErrorPlaceholder;", "getErrorPlaceholder", "getShowErrorPlaceholder", "Ljava/util/List;", "getOnErrorActions", "getOnSuccessActions", "getPostMessageParams", "getOnStartRedirectActions", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "getTheme", "getExtractionParamsMap", "setExtractionParamsMap", "(Ljava/util/Map;)V", "ErrorPlaceholder", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinWebPaymentModel extends LeafBeduinModel {

    @Y61.k
    public static final Parcelable.Creator<BeduinWebPaymentModel> CREATOR = new a();

    @Y61.l
    private final DisplayingPredicate displayingPredicate;

    @Y61.l
    private final ErrorPlaceholder errorPlaceholder;

    @Y61.l
    private Map<String, ? extends Object> extractionParamsMap;

    @Y61.k
    private final String id;

    @Y61.l
    private final Boolean isEnabled;

    @Y61.l
    private final Boolean isLoading;

    @Y61.l
    private final BeduinLayoutParams layoutParams;

    @Y61.l
    private final String messageTypeKey;

    @Y61.l
    private final Map<String, List<BeduinAction>> messageTypeToActionsMap;

    @Y61.l
    private final List<BeduinAction> onErrorActions;

    @Y61.l
    private final List<BeduinAction> onStartRedirectActions;

    @Y61.l
    private final List<BeduinAction> onSuccessActions;

    @Y61.l
    private final Map<String, Object> postMessageParams;

    @Y61.l
    private final Boolean showErrorPlaceholder;

    @Y61.l
    private final BeduinComponentTheme theme;

    @Y61.k
    private final String url;

    /* compiled from: BeduinWebPaymentModel.kt */
    @Keep
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JF\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u000fR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0013¨\u0006+"}, d2 = {"Lcom/avito/android/beduin/common/component/payment_webview/BeduinWebPaymentModel$ErrorPlaceholder;", "Landroid/os/Parcelable;", "", "title", "subtitle", "buttonTitle", "", "Lcom/avito/android/beduin_models/BeduinAction;", "buttonActions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "isEmpty", "()Z", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/beduin/common/component/payment_webview/BeduinWebPaymentModel$ErrorPlaceholder;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "getButtonTitle", "Ljava/util/List;", "getButtonActions", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class ErrorPlaceholder implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<ErrorPlaceholder> CREATOR = new a();

        @Y61.l
        private final List<BeduinAction> buttonActions;

        @Y61.l
        private final String buttonTitle;

        @Y61.l
        private final String subtitle;

        @Y61.l
        private final String title;

        /* compiled from: BeduinWebPaymentModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ErrorPlaceholder> {
            @Override // android.os.Parcelable.Creator
            public final ErrorPlaceholder createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(ErrorPlaceholder.class, parcel, arrayList2, iL2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new ErrorPlaceholder(string, string2, string3, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final ErrorPlaceholder[] newArray(int i12) {
                return new ErrorPlaceholder[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ErrorPlaceholder(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l List<? extends BeduinAction> list) {
            this.title = str;
            this.subtitle = str2;
            this.buttonTitle = str3;
            this.buttonActions = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ErrorPlaceholder copy$default(ErrorPlaceholder errorPlaceholder, String str, String str2, String str3, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = errorPlaceholder.title;
            }
            if ((i12 & 2) != 0) {
                str2 = errorPlaceholder.subtitle;
            }
            if ((i12 & 4) != 0) {
                str3 = errorPlaceholder.buttonTitle;
            }
            if ((i12 & 8) != 0) {
                list = errorPlaceholder.buttonActions;
            }
            return errorPlaceholder.copy(str, str2, str3, list);
        }

        @Y61.l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Y61.l
        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @Y61.l
        /* renamed from: component3, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @Y61.l
        public final List<BeduinAction> component4() {
            return this.buttonActions;
        }

        @Y61.k
        public final ErrorPlaceholder copy(@Y61.l String title, @Y61.l String subtitle, @Y61.l String buttonTitle, @Y61.l List<? extends BeduinAction> buttonActions) {
            return new ErrorPlaceholder(title, subtitle, buttonTitle, buttonActions);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorPlaceholder)) {
                return false;
            }
            ErrorPlaceholder errorPlaceholder = (ErrorPlaceholder) other;
            return L.f(this.title, errorPlaceholder.title) && L.f(this.subtitle, errorPlaceholder.subtitle) && L.f(this.buttonTitle, errorPlaceholder.buttonTitle) && L.f(this.buttonActions, errorPlaceholder.buttonActions);
        }

        @Y61.l
        public final List<BeduinAction> getButtonActions() {
            return this.buttonActions;
        }

        @Y61.l
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @Y61.l
        public final String getSubtitle() {
            return this.subtitle;
        }

        @Y61.l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.subtitle;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.buttonTitle;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<BeduinAction> list = this.buttonActions;
            return iHashCode3 + (list != null ? list.hashCode() : 0);
        }

        public final boolean isEmpty() {
            String str;
            String str2 = this.title;
            return (str2 == null || str2.length() == 0) && ((str = this.subtitle) == null || str.length() == 0);
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ErrorPlaceholder(title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", buttonTitle=");
            sb2.append(this.buttonTitle);
            sb2.append(", buttonActions=");
            return H.p(sb2, this.buttonActions, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeString(this.buttonTitle);
            List<BeduinAction> list = this.buttonActions;
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

    /* compiled from: BeduinWebPaymentModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinWebPaymentModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinWebPaymentModel createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            ArrayList arrayList;
            ArrayList arrayList2;
            LinkedHashMap linkedHashMap2;
            ArrayList arrayList3;
            LinkedHashMap linkedHashMap3;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinWebPaymentModel.class.getClassLoader());
            BeduinLayoutParams beduinLayoutParamsCreateFromParcel = parcel.readInt() == 0 ? null : BeduinLayoutParams.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    String string4 = parcel.readString();
                    int i14 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(i14);
                    int iL2 = 0;
                    while (iL2 != i14) {
                        iL2 = com.avito.android.actions_sheet.a.l(BeduinWebPaymentModel.class, parcel, arrayList4, iL2, 1);
                    }
                    linkedHashMap4.put(string4, arrayList4);
                }
                linkedHashMap = linkedHashMap4;
            }
            ErrorPlaceholder errorPlaceholderCreateFromParcel = parcel.readInt() == 0 ? null : ErrorPlaceholder.CREATOR.createFromParcel(parcel);
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i15);
                int iL3 = 0;
                while (iL3 != i15) {
                    iL3 = com.avito.android.actions_sheet.a.l(BeduinWebPaymentModel.class, parcel, arrayList5, iL3, 1);
                }
                arrayList = arrayList5;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i16 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i16);
                int iL4 = 0;
                while (iL4 != i16) {
                    iL4 = com.avito.android.actions_sheet.a.l(BeduinWebPaymentModel.class, parcel, arrayList6, iL4, 1);
                }
                arrayList2 = arrayList6;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int i17 = parcel.readInt();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(i17);
                int iC2 = 0;
                while (iC2 != i17) {
                    iC2 = org.webrtc.h.c(BeduinWebPaymentModel.class, parcel, linkedHashMap5, parcel.readString(), iC2, 1);
                    linkedHashMap5 = linkedHashMap5;
                    i17 = i17;
                }
                linkedHashMap2 = linkedHashMap5;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i18 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i18);
                int iL5 = 0;
                while (iL5 != i18) {
                    iL5 = com.avito.android.actions_sheet.a.l(BeduinWebPaymentModel.class, parcel, arrayList7, iL5, 1);
                }
                arrayList3 = arrayList7;
            }
            BeduinComponentTheme beduinComponentThemeCreateFromParcel = parcel.readInt() == 0 ? null : BeduinComponentTheme.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap3 = null;
            } else {
                int i19 = parcel.readInt();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap(i19);
                int iC3 = 0;
                while (iC3 != i19) {
                    iC3 = org.webrtc.h.c(BeduinWebPaymentModel.class, parcel, linkedHashMap6, parcel.readString(), iC3, 1);
                    linkedHashMap6 = linkedHashMap6;
                    i19 = i19;
                }
                linkedHashMap3 = linkedHashMap6;
            }
            return new BeduinWebPaymentModel(string, displayingPredicate, beduinLayoutParamsCreateFromParcel, string2, boolValueOf, string3, linkedHashMap, errorPlaceholderCreateFromParcel, boolValueOf2, boolValueOf3, arrayList, arrayList2, linkedHashMap2, arrayList3, beduinComponentThemeCreateFromParcel, linkedHashMap3);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinWebPaymentModel[] newArray(int i12) {
            return new BeduinWebPaymentModel[i12];
        }
    }

    public /* synthetic */ BeduinWebPaymentModel(String str, DisplayingPredicate displayingPredicate, BeduinLayoutParams beduinLayoutParams, String str2, Boolean bool, String str3, Map map, ErrorPlaceholder errorPlaceholder, Boolean bool2, Boolean bool3, List list, List list2, Map map2, List list3, BeduinComponentTheme beduinComponentTheme, Map map3, int i12, C42822w c42822w) {
        this(str, displayingPredicate, beduinLayoutParams, str2, bool, str3, map, errorPlaceholder, bool2, bool3, list, list2, (i12 & 4096) != 0 ? null : map2, (i12 & 8192) != 0 ? null : list3, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : beduinComponentTheme, (i12 & 32768) != 0 ? null : map3);
    }

    public static /* synthetic */ BeduinWebPaymentModel copy$default(BeduinWebPaymentModel beduinWebPaymentModel, String str, DisplayingPredicate displayingPredicate, BeduinLayoutParams beduinLayoutParams, String str2, Boolean bool, String str3, Map map, ErrorPlaceholder errorPlaceholder, Boolean bool2, Boolean bool3, List list, List list2, Map map2, List list3, BeduinComponentTheme beduinComponentTheme, Map map3, int i12, Object obj) {
        return beduinWebPaymentModel.copy((i12 & 1) != 0 ? beduinWebPaymentModel.id : str, (i12 & 2) != 0 ? beduinWebPaymentModel.displayingPredicate : displayingPredicate, (i12 & 4) != 0 ? beduinWebPaymentModel.layoutParams : beduinLayoutParams, (i12 & 8) != 0 ? beduinWebPaymentModel.url : str2, (i12 & 16) != 0 ? beduinWebPaymentModel.isEnabled : bool, (i12 & 32) != 0 ? beduinWebPaymentModel.messageTypeKey : str3, (i12 & 64) != 0 ? beduinWebPaymentModel.messageTypeToActionsMap : map, (i12 & 128) != 0 ? beduinWebPaymentModel.errorPlaceholder : errorPlaceholder, (i12 & 256) != 0 ? beduinWebPaymentModel.showErrorPlaceholder : bool2, (i12 & 512) != 0 ? beduinWebPaymentModel.isLoading : bool3, (i12 & 1024) != 0 ? beduinWebPaymentModel.onErrorActions : list, (i12 & 2048) != 0 ? beduinWebPaymentModel.onSuccessActions : list2, (i12 & 4096) != 0 ? beduinWebPaymentModel.postMessageParams : map2, (i12 & 8192) != 0 ? beduinWebPaymentModel.onStartRedirectActions : list3, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? beduinWebPaymentModel.theme : beduinComponentTheme, (i12 & 32768) != 0 ? beduinWebPaymentModel.extractionParamsMap : map3);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @Y61.k
    public BeduinModel apply(@Y61.k BeduinModelTransform transform) {
        if (transform instanceof DisplayPredicateTransform) {
            return copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65533, null);
        }
        if (transform instanceof LayoutParamsTransform) {
            return copy$default(this, null, null, ((LayoutParamsTransform) transform).getLayoutParams(), null, null, null, null, null, null, null, null, null, null, null, null, null, 65531, null);
        }
        if (transform instanceof IsEnabledTransform) {
            return copy$default(this, null, null, null, null, Boolean.valueOf(((IsEnabledTransform) transform).isEnabled()), null, null, null, null, null, null, null, null, null, null, null, 65519, null);
        }
        if (transform instanceof IsLoadingTransform) {
            return copy$default(this, null, null, null, null, null, null, null, null, null, Boolean.valueOf(((IsLoadingTransform) transform).isLoading()), null, null, null, null, null, null, 65023, null);
        }
        if (transform instanceof UrlTransform) {
            return copy$default(this, null, null, null, ((UrlTransform) transform).getUrl(), null, null, null, null, null, null, null, null, null, null, null, null, 65527, null);
        }
        if (transform instanceof WebPaymentErrorPlaceholderTransform) {
            return copy$default(this, null, null, null, null, null, null, null, ((WebPaymentErrorPlaceholderTransform) transform).getErrorPlaceholder(), null, null, null, null, null, null, null, null, 65407, null);
        }
        if (transform instanceof WebPaymentShowErrorPlaceholderTransform) {
            return copy$default(this, null, null, null, null, null, null, null, null, Boolean.valueOf(((WebPaymentShowErrorPlaceholderTransform) transform).getShowErrorPlaceholder()), null, null, null, null, null, null, null, 65279, null);
        }
        if (!(transform instanceof WebPaymentPostMessageTransform)) {
            return this;
        }
        WebPaymentPostMessageTransform webPaymentPostMessageTransform = (WebPaymentPostMessageTransform) transform;
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, webPaymentPostMessageTransform.getPostMessageParams(), webPaymentPostMessageTransform.getOnStartRedirectActions(), null, null, 53247, null);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: component10, reason: from getter */
    public final Boolean getIsLoading() {
        return this.isLoading;
    }

    @Y61.l
    public final List<BeduinAction> component11() {
        return this.onErrorActions;
    }

    @Y61.l
    public final List<BeduinAction> component12() {
        return this.onSuccessActions;
    }

    @Y61.l
    public final Map<String, Object> component13() {
        return this.postMessageParams;
    }

    @Y61.l
    public final List<BeduinAction> component14() {
        return this.onStartRedirectActions;
    }

    @Y61.l
    /* renamed from: component15, reason: from getter */
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    @Y61.l
    public final Map<String, Object> component16() {
        return this.extractionParamsMap;
    }

    @Y61.l
    /* renamed from: component2, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @Y61.l
    /* renamed from: component3, reason: from getter */
    public final BeduinLayoutParams getLayoutParams() {
        return this.layoutParams;
    }

    @Y61.k
    /* renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Y61.l
    /* renamed from: component5, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    @Y61.l
    /* renamed from: component6, reason: from getter */
    public final String getMessageTypeKey() {
        return this.messageTypeKey;
    }

    @Y61.l
    public final Map<String, List<BeduinAction>> component7() {
        return this.messageTypeToActionsMap;
    }

    @Y61.l
    /* renamed from: component8, reason: from getter */
    public final ErrorPlaceholder getErrorPlaceholder() {
        return this.errorPlaceholder;
    }

    @Y61.l
    /* renamed from: component9, reason: from getter */
    public final Boolean getShowErrorPlaceholder() {
        return this.showErrorPlaceholder;
    }

    @Y61.k
    public final BeduinWebPaymentModel copy(@Y61.k String id2, @Y61.l DisplayingPredicate displayingPredicate, @Y61.l BeduinLayoutParams layoutParams, @Y61.k String url, @Y61.l Boolean isEnabled, @Y61.l String messageTypeKey, @Y61.l Map<String, ? extends List<? extends BeduinAction>> messageTypeToActionsMap, @Y61.l ErrorPlaceholder errorPlaceholder, @Y61.l Boolean showErrorPlaceholder, @Y61.l Boolean isLoading, @Y61.l List<? extends BeduinAction> onErrorActions, @Y61.l List<? extends BeduinAction> onSuccessActions, @Y61.l Map<String, ? extends Object> postMessageParams, @Y61.l List<? extends BeduinAction> onStartRedirectActions, @Y61.l BeduinComponentTheme theme, @Y61.l Map<String, ? extends Object> extractionParamsMap) {
        return new BeduinWebPaymentModel(id2, displayingPredicate, layoutParams, url, isEnabled, messageTypeKey, messageTypeToActionsMap, errorPlaceholder, showErrorPlaceholder, isLoading, onErrorActions, onSuccessActions, postMessageParams, onStartRedirectActions, theme, extractionParamsMap);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinWebPaymentModel)) {
            return false;
        }
        BeduinWebPaymentModel beduinWebPaymentModel = (BeduinWebPaymentModel) other;
        return L.f(this.id, beduinWebPaymentModel.id) && L.f(this.displayingPredicate, beduinWebPaymentModel.displayingPredicate) && L.f(this.layoutParams, beduinWebPaymentModel.layoutParams) && L.f(this.url, beduinWebPaymentModel.url) && L.f(this.isEnabled, beduinWebPaymentModel.isEnabled) && L.f(this.messageTypeKey, beduinWebPaymentModel.messageTypeKey) && L.f(this.messageTypeToActionsMap, beduinWebPaymentModel.messageTypeToActionsMap) && L.f(this.errorPlaceholder, beduinWebPaymentModel.errorPlaceholder) && L.f(this.showErrorPlaceholder, beduinWebPaymentModel.showErrorPlaceholder) && L.f(this.isLoading, beduinWebPaymentModel.isLoading) && L.f(this.onErrorActions, beduinWebPaymentModel.onErrorActions) && L.f(this.onSuccessActions, beduinWebPaymentModel.onSuccessActions) && L.f(this.postMessageParams, beduinWebPaymentModel.postMessageParams) && L.f(this.onStartRedirectActions, beduinWebPaymentModel.onStartRedirectActions) && this.theme == beduinWebPaymentModel.theme && L.f(this.extractionParamsMap, beduinWebPaymentModel.extractionParamsMap);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF100854c() {
        return this.displayingPredicate;
    }

    @Y61.l
    public final ErrorPlaceholder getErrorPlaceholder() {
        return this.errorPlaceholder;
    }

    @Y61.l
    public final Map<String, Object> getExtractionParamsMap() {
        return this.extractionParamsMap;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    /* renamed from: getId */
    public String getF100853b() {
        return this.id;
    }

    @Y61.l
    public final BeduinLayoutParams getLayoutParams() {
        return this.layoutParams;
    }

    @Y61.l
    public final String getMessageTypeKey() {
        return this.messageTypeKey;
    }

    @Y61.l
    public final Map<String, List<BeduinAction>> getMessageTypeToActionsMap() {
        return this.messageTypeToActionsMap;
    }

    @Y61.l
    public final List<BeduinAction> getOnErrorActions() {
        return this.onErrorActions;
    }

    @Y61.l
    public final List<BeduinAction> getOnStartRedirectActions() {
        return this.onStartRedirectActions;
    }

    @Y61.l
    public final List<BeduinAction> getOnSuccessActions() {
        return this.onSuccessActions;
    }

    @Y61.l
    public final Map<String, Object> getPostMessageParams() {
        return this.postMessageParams;
    }

    @Y61.l
    public final Boolean getShowErrorPlaceholder() {
        return this.showErrorPlaceholder;
    }

    @Y61.l
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    @Y61.k
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        BeduinLayoutParams beduinLayoutParams = this.layoutParams;
        int iD2 = H.d((iHashCode2 + (beduinLayoutParams == null ? 0 : beduinLayoutParams.hashCode())) * 31, 31, this.url);
        Boolean bool = this.isEnabled;
        int iHashCode3 = (iD2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.messageTypeKey;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, List<BeduinAction>> map = this.messageTypeToActionsMap;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        ErrorPlaceholder errorPlaceholder = this.errorPlaceholder;
        int iHashCode6 = (iHashCode5 + (errorPlaceholder == null ? 0 : errorPlaceholder.hashCode())) * 31;
        Boolean bool2 = this.showErrorPlaceholder;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isLoading;
        int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<BeduinAction> list = this.onErrorActions;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        List<BeduinAction> list2 = this.onSuccessActions;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map<String, Object> map2 = this.postMessageParams;
        int iHashCode11 = (iHashCode10 + (map2 == null ? 0 : map2.hashCode())) * 31;
        List<BeduinAction> list3 = this.onStartRedirectActions;
        int iHashCode12 = (iHashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        BeduinComponentTheme beduinComponentTheme = this.theme;
        int iHashCode13 = (iHashCode12 + (beduinComponentTheme == null ? 0 : beduinComponentTheme.hashCode())) * 31;
        Map<String, ? extends Object> map3 = this.extractionParamsMap;
        return iHashCode13 + (map3 != null ? map3.hashCode() : 0);
    }

    @Y61.l
    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    @Y61.l
    public final Boolean isLoading() {
        return this.isLoading;
    }

    public final void putExtractionParams(@Y61.k Q<String, ? extends Object>... params) {
        if (this.extractionParamsMap == null) {
            this.extractionParamsMap = new LinkedHashMap();
        }
        P0.n(v0.c(this.extractionParamsMap), params);
    }

    public final void setExtractionParamsMap(@Y61.l Map<String, ? extends Object> map) {
        this.extractionParamsMap = map;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinWebPaymentModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", layoutParams=");
        sb2.append(this.layoutParams);
        sb2.append(", url=");
        sb2.append(this.url);
        sb2.append(", isEnabled=");
        sb2.append(this.isEnabled);
        sb2.append(", messageTypeKey=");
        sb2.append(this.messageTypeKey);
        sb2.append(", messageTypeToActionsMap=");
        sb2.append(this.messageTypeToActionsMap);
        sb2.append(", errorPlaceholder=");
        sb2.append(this.errorPlaceholder);
        sb2.append(", showErrorPlaceholder=");
        sb2.append(this.showErrorPlaceholder);
        sb2.append(", isLoading=");
        sb2.append(this.isLoading);
        sb2.append(", onErrorActions=");
        sb2.append(this.onErrorActions);
        sb2.append(", onSuccessActions=");
        sb2.append(this.onSuccessActions);
        sb2.append(", postMessageParams=");
        sb2.append(this.postMessageParams);
        sb2.append(", onStartRedirectActions=");
        sb2.append(this.onStartRedirectActions);
        sb2.append(", theme=");
        sb2.append(this.theme);
        sb2.append(", extractionParamsMap=");
        return androidx.appcompat.app.r.w(sb2, this.extractionParamsMap, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        BeduinLayoutParams beduinLayoutParams = this.layoutParams;
        if (beduinLayoutParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinLayoutParams.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.url);
        Boolean bool = this.isEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.messageTypeKey);
        Map<String, List<BeduinAction>> map = this.messageTypeToActionsMap;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                Iterator itJ = C0.j((List) entry.getValue(), parcel);
                while (itJ.hasNext()) {
                    parcel.writeParcelable((Parcelable) itJ.next(), flags);
                }
            }
        }
        ErrorPlaceholder errorPlaceholder = this.errorPlaceholder;
        if (errorPlaceholder == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            errorPlaceholder.writeToParcel(parcel, flags);
        }
        Boolean bool2 = this.showErrorPlaceholder;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        Boolean bool3 = this.isLoading;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        List<BeduinAction> list = this.onErrorActions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<BeduinAction> list2 = this.onSuccessActions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
        Map<String, Object> map2 = this.postMessageParams;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH2 = C0.h(parcel, 1, map2);
            while (itH2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itH2.next();
                org.webrtc.h.h(parcel, (String) entry2.getKey(), entry2);
            }
        }
        List<BeduinAction> list3 = this.onStartRedirectActions;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                parcel.writeParcelable((Parcelable) itA3.next(), flags);
            }
        }
        BeduinComponentTheme beduinComponentTheme = this.theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, flags);
        }
        Map<String, ? extends Object> map3 = this.extractionParamsMap;
        if (map3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH3 = C0.h(parcel, 1, map3);
        while (itH3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) itH3.next();
            org.webrtc.h.h(parcel, (String) entry3.getKey(), entry3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinWebPaymentModel(@Y61.k String str, @Y61.l DisplayingPredicate displayingPredicate, @Y61.l BeduinLayoutParams beduinLayoutParams, @Y61.k String str2, @Y61.l Boolean bool, @Y61.l String str3, @Y61.l Map<String, ? extends List<? extends BeduinAction>> map, @Y61.l ErrorPlaceholder errorPlaceholder, @Y61.l Boolean bool2, @Y61.l Boolean bool3, @Y61.l List<? extends BeduinAction> list, @Y61.l List<? extends BeduinAction> list2, @Y61.l Map<String, ? extends Object> map2, @Y61.l List<? extends BeduinAction> list3, @Y61.l BeduinComponentTheme beduinComponentTheme, @Y61.l Map<String, ? extends Object> map3) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.layoutParams = beduinLayoutParams;
        this.url = str2;
        this.isEnabled = bool;
        this.messageTypeKey = str3;
        this.messageTypeToActionsMap = map;
        this.errorPlaceholder = errorPlaceholder;
        this.showErrorPlaceholder = bool2;
        this.isLoading = bool3;
        this.onErrorActions = list;
        this.onSuccessActions = list2;
        this.postMessageParams = map2;
        this.onStartRedirectActions = list3;
        this.theme = beduinComponentTheme;
        this.extractionParamsMap = map3;
    }
}
