package ru.cyberity.cbr.core.common;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import ru.cyberity.cbr.core.CBRModule;
import ru.cyberity.cbr.core.MobileSdk;
import ru.cyberity.cbr.core.data.listener.CBRActionResultHandler;
import ru.cyberity.cbr.core.data.listener.CBRCountryPicker;
import ru.cyberity.cbr.core.data.listener.CBRErrorHandler;
import ru.cyberity.cbr.core.data.listener.CBREventHandler;
import ru.cyberity.cbr.core.data.listener.CBRIconHandler;
import ru.cyberity.cbr.core.data.listener.CBRInstructionsViewHandler;
import ru.cyberity.cbr.core.data.listener.CBRStateChangedHandler;
import ru.cyberity.cbr.core.data.listener.CBRUrlHandler;
import ru.cyberity.cbr.core.data.listener.TokenExpirationHandler;
import ru.cyberity.cbr.core.data.model.CBRDocumentDefinition;
import ru.cyberity.cbr.core.data.model.CBRInitConfig;
import ru.cyberity.cbr.core.data.model.CBRSDKState;
import ru.cyberity.cbr.core.data.model.CBRSupportItem;
import ru.cyberity.cbr.core.theme.CBRJsonCustomization;
import ru.cyberity.log.logger.Logger;

/* compiled from: MobileSdkInternal.kt */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\b\u0004\n\u0002\b4*\u0002ko\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0011\u0010\u0016J\u0097\u0002\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00172\u001a\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001a0\u00172\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00172\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00172\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00172\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00172\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00172\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00172\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00172\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060*2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00172\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00172\u001a\u00101\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u000200\u0018\u00010\u001a0\u00172\u000e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00172\u000e\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u0017¢\u0006\u0004\b\u0011\u00105JC\u0010\u0011\u001a\u00020\u00102\u0016\u00108\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u000207\u0018\u000106\u0018\u00010\u00172\u001c\u00109\u001a\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u000207\u0018\u000106\u0012\u0004\u0012\u00020\u0010\u0018\u00010*¢\u0006\u0004\b\u0011\u0010:J\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010;\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u000bR$\u0010\r\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u00048\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000e8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR$\u0010\f\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u00048\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bE\u0010>\u001a\u0004\bF\u0010@R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010<\u001a\u00020\u00148\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR$\u0010\u0013\u001a\u00020\t2\u0006\u0010<\u001a\u00020\t8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\b\u0013\u0010MR*\u0010T\u001a\u00020N2\u0006\u0010<\u001a\u00020N8\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\b\u0011\u0010SR\u001a\u0010W\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\bU\u0010>\u001a\u0004\bV\u0010@R \u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR,\u0010\u001b\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001a\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010YR \u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010YR \u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010YR \u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010YR \u0010#\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\"\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010YR \u0010%\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010$\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010YR \u0010'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010YR \u0010)\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010(\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010YR&\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010YR\u001e\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010YR&\u00108\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u000207\u0018\u000106\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010YR,\u00109\u001a\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u000207\u0018\u000106\u0012\u0004\u0012\u00020\u0010\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010cR,\u00101\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u000200\u0018\u00010\u001a\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010YR \u00102\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010YR \u00104\u001a\f\u0012\u0006\u0012\u0004\u0018\u000103\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010YR\u0014\u0010n\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010r\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010u\u001a\u0004\u0018\u00010\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\"\u0010x\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0016\u0010{\u001a\u0004\u0018\u00010\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0016\u0010~\u001a\u0004\u0018\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0018\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u001e8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0017\u0010\u0084\u0001\u001a\u00020,8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0019\u0010\u0087\u0001\u001a\u0004\u0018\u00010\"8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u008a\u0001\u001a\u0004\u0018\u00010$8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0019\u0010\u008d\u0001\u001a\u0004\u0018\u00010&8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u0010\u0090\u0001\u001a\u0004\u0018\u00010(8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0017\u0010\u0093\u0001\u001a\u00020.8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R:\u0010\u0099\u0001\u001a\n\u0012\u0004\u0012\u000207\u0018\u0001062\u000f\u0010\u0094\u0001\u001a\n\u0012\u0004\u0012\u000207\u0018\u0001068V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R$\u0010\u009b\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u000200\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010wR\u0019\u0010\u009e\u0001\u001a\u0004\u0018\u0001038VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0019\u0010¡\u0001\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010 \u0001¨\u0006¢\u0001"}, d2 = {"Lru/cyberity/cbr/core/common/n0;", "Lru/cyberity/cbr/core/MobileSdk;", "<init>", "()V", "", "className", "Lru/cyberity/cbr/core/CBRModule;", "getPluggedModule", "(Ljava/lang/String;)Lru/cyberity/cbr/core/CBRModule;", "", "isModuleAvailable", "(Ljava/lang/String;)Z", "packageName", "versionName", "", "versionCode", "Lkotlin/G0;", "a", "(Ljava/lang/String;Ljava/lang/String;I)V", "isDebug", "Ljava/util/Locale;", "locale", "(ZLjava/util/Locale;)V", "Lkotlin/Function0;", "Lru/cyberity/cbr/core/data/model/CBRInitConfig;", "confProvider", "", "settingsProvider", "Lru/cyberity/cbr/core/data/listener/TokenExpirationHandler;", "tokenExpirationHandlerProvider", "Lru/cyberity/cbr/core/data/listener/CBRStateChangedHandler;", "stateChangedHandlerProvider", "Lru/cyberity/cbr/core/data/listener/CBRErrorHandler;", "errorHandlerProvider", "Lru/cyberity/cbr/core/data/listener/CBREventHandler;", "eventHandlerProvider", "Lru/cyberity/cbr/core/theme/CBRJsonCustomization;", "jsonCustomizationProvider", "Lru/cyberity/cbr/core/data/listener/CBRInstructionsViewHandler;", "instructionsViewHandlerProvider", "Lru/cyberity/cbr/core/data/listener/CBRActionResultHandler;", "actionResultHandlerProvider", "Lkotlin/Function1;", "moduleProvider", "Lru/cyberity/cbr/core/data/listener/CBRIconHandler;", "iconHandlerProvider", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker;", "countryPickerProvider", "Lru/cyberity/cbr/core/data/model/CBRDocumentDefinition;", "preferredDocumentsDefinitionProvider", "autoCloseOnApproveTimeoutProvider", "Lru/cyberity/cbr/core/data/listener/CBRUrlHandler;", "urlHandlerProvider", "(LY41/a;LY41/a;LY41/a;LY41/a;LY41/a;LY41/a;LY41/a;LY41/a;LY41/a;LY41/l;LY41/a;LY41/a;LY41/a;LY41/a;LY41/a;)V", "", "Lru/cyberity/cbr/core/data/model/CBRSupportItem;", "supportItemsGetter", "supportItemsSetter", "(LY41/a;LY41/l;)V", "name", "<set-?>", "c", "Ljava/lang/String;", "getVersionName", "()Ljava/lang/String;", "d", "I", "getVersionCode", "()I", "e", "getPackageName", "f", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "g", "Z", "()Z", "Lru/cyberity/cbr/core/data/model/CBRSDKState;", "h", "Lru/cyberity/cbr/core/data/model/CBRSDKState;", "getState", "()Lru/cyberity/cbr/core/data/model/CBRSDKState;", "(Lru/cyberity/cbr/core/data/model/CBRSDKState;)V", VoiceInfo.STATE, "i", "getVersion", "version", "j", "LY41/a;", "k", "l", "m", "n", "o", "p", "q", "r", "s", "LY41/l;", "t", "u", "v", "w", "x", "y", "z", "ru/cyberity/cbr/core/common/n0$b", "A", "Lru/cyberity/cbr/core/common/n0$b;", "stubIconHandler", "ru/cyberity/cbr/core/common/n0$a", "B", "Lru/cyberity/cbr/core/common/n0$a;", "stubCountryPicker", "getConf", "()Lru/cyberity/cbr/core/data/model/CBRInitConfig;", "conf", "getSettings", "()Ljava/util/Map;", "settings", "getTokenExpirationHandler", "()Lru/cyberity/cbr/core/data/listener/TokenExpirationHandler;", "tokenExpirationHandler", "getErrorHandler", "()Lru/cyberity/cbr/core/data/listener/CBRErrorHandler;", "errorHandler", "getStateChangedHandler", "()Lru/cyberity/cbr/core/data/listener/CBRStateChangedHandler;", "stateChangedHandler", "getIconHandler", "()Lru/cyberity/cbr/core/data/listener/CBRIconHandler;", "iconHandler", "getEventHandler", "()Lru/cyberity/cbr/core/data/listener/CBREventHandler;", "eventHandler", "getCustomization", "()Lru/cyberity/cbr/core/theme/CBRJsonCustomization;", "customization", "getInstructionsViewHandler", "()Lru/cyberity/cbr/core/data/listener/CBRInstructionsViewHandler;", "instructionsViewHandler", "getActionResultHandler", "()Lru/cyberity/cbr/core/data/listener/CBRActionResultHandler;", "actionResultHandler", "getCountryPicker", "()Lru/cyberity/cbr/core/data/listener/CBRCountryPicker;", "countryPicker", "value", "getSupportItems", "()Ljava/util/List;", "setSupportItems", "(Ljava/util/List;)V", "supportItems", "getPreferredDocumentsDefinitions", "preferredDocumentsDefinitions", "getUrlHandler", "()Lru/cyberity/cbr/core/data/listener/CBRUrlHandler;", "urlHandler", "getAutoCloseOnApproveTimeout", "()Ljava/lang/Integer;", "autoCloseOnApproveTimeout", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class n0 implements MobileSdk {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static boolean isDebug;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private static Y41.a<CBRInitConfig> confProvider;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private static Y41.a<? extends Map<String, String>> settingsProvider;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private static Y41.a<? extends TokenExpirationHandler> tokenExpirationHandlerProvider;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private static Y41.a<? extends CBRStateChangedHandler> stateChangedHandlerProvider;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private static Y41.a<? extends CBRErrorHandler> errorHandlerProvider;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private static Y41.a<? extends CBREventHandler> eventHandlerProvider;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private static Y41.a<? extends CBRJsonCustomization> jsonCustomizationProvider;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private static Y41.a<? extends CBRInstructionsViewHandler> instructionsViewHandlerProvider;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private static Y41.a<? extends CBRActionResultHandler> actionResultHandlerProvider;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private static Y41.l<? super String, ? extends CBRModule> moduleProvider;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private static Y41.a<? extends CBRIconHandler> iconHandlerProvider;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private static Y41.a<? extends CBRCountryPicker> countryPickerProvider;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private static Y41.a<? extends List<CBRSupportItem>> supportItemsGetter;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private static Y41.l<? super List<CBRSupportItem>, G0> supportItemsSetter;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private static Y41.a<? extends Map<String, CBRDocumentDefinition>> preferredDocumentsDefinitionProvider;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private static Y41.a<Integer> autoCloseOnApproveTimeoutProvider;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private static Y41.a<? extends CBRUrlHandler> urlHandlerProvider;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final n0 f432787a = new n0();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private static String versionName = "";

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static int versionCode = -1;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private static String packageName = "";

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private static Locale locale = s.a();

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private static CBRSDKState state = CBRSDKState.Initial.INSTANCE;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private static final String version = "1.30.4";

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private static final b stubIconHandler = new b();

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private static final a stubCountryPicker = new a();

    /* compiled from: MobileSdkInternal.kt */
    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JC\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"ru/cyberity/cbr/core/common/n0$a", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker;", "Landroid/content/Context;", "context", "", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "items", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CBRCountryPickerCallBack;", "callback", "", "requestKey", "resultKey", "Lkotlin/G0;", "pickCountry", "(Landroid/content/Context;Ljava/util/List;Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CBRCountryPickerCallBack;Ljava/lang/String;Ljava/lang/String;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements CBRCountryPicker {
        @Override // ru.cyberity.cbr.core.data.listener.CBRCountryPicker
        public void pickCountry(@Y61.k Context context, @Y61.k List<CBRCountryPicker.CountryItem> items, @Y61.l CBRCountryPicker.CBRCountryPickerCallBack callback, @Y61.l String requestKey, @Y61.l String resultKey) {
            Logger.d$default(ru.cyberity.log.a.f436064a, "MobileSdkInternal", "Attempt to call uninitialized MobileSdkInternal", null, 4, null);
        }
    }

    /* compiled from: MobileSdkInternal.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"ru/cyberity/cbr/core/common/n0$b", "Lru/cyberity/cbr/core/data/listener/CBRIconHandler;", "Landroid/content/Context;", "context", "", "key", "Landroid/graphics/drawable/Drawable;", "onResolveIcon", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements CBRIconHandler {
        @Override // ru.cyberity.cbr.core.data.listener.CBRIconHandler
        @Y61.l
        public Drawable onResolveIcon(@Y61.k Context context, @Y61.k String key) {
            Logger.d$default(ru.cyberity.log.a.f436064a, "MobileSdkInternal", "Attempt to call uninitialized MobileSdkInternal", null, 4, null);
            return null;
        }
    }

    private n0() {
    }

    public void a(@Y61.k CBRSDKState cBRSDKState) {
        state = cBRSDKState;
    }

    @Y61.l
    public CBRActionResultHandler getActionResultHandler() {
        Y41.a<? extends CBRActionResultHandler> aVar = actionResultHandlerProvider;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    @Y61.l
    public Integer getAutoCloseOnApproveTimeout() {
        Y41.a<Integer> aVar = autoCloseOnApproveTimeoutProvider;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    @Y61.l
    public CBRInitConfig getConf() {
        Y41.a<CBRInitConfig> aVar = confProvider;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    @Y61.k
    public CBRCountryPicker getCountryPicker() {
        CBRCountryPicker cBRCountryPickerInvoke;
        Y41.a<? extends CBRCountryPicker> aVar = countryPickerProvider;
        return (aVar == null || (cBRCountryPickerInvoke = aVar.invoke()) == null) ? stubCountryPicker : cBRCountryPickerInvoke;
    }

    @Y61.l
    public CBRJsonCustomization getCustomization() {
        Y41.a<? extends CBRJsonCustomization> aVar = jsonCustomizationProvider;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    @Y61.l
    public CBRErrorHandler getErrorHandler() {
        Y41.a<? extends CBRErrorHandler> aVar = errorHandlerProvider;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    @Y61.l
    public CBREventHandler getEventHandler() {
        Y41.a<? extends CBREventHandler> aVar = eventHandlerProvider;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    @Y61.k
    public CBRIconHandler getIconHandler() {
        CBRIconHandler cBRIconHandlerInvoke;
        Y41.a<? extends CBRIconHandler> aVar = iconHandlerProvider;
        return (aVar == null || (cBRIconHandlerInvoke = aVar.invoke()) == null) ? stubIconHandler : cBRIconHandlerInvoke;
    }

    @Y61.l
    public CBRInstructionsViewHandler getInstructionsViewHandler() {
        Y41.a<? extends CBRInstructionsViewHandler> aVar = instructionsViewHandlerProvider;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    @Y61.k
    public Locale getLocale() {
        return locale;
    }

    @Y61.k
    public String getPackageName() {
        return packageName;
    }

    @Y61.l
    public CBRModule getPluggedModule(@Y61.k String className) {
        Y41.l<? super String, ? extends CBRModule> lVar = moduleProvider;
        if (lVar != null) {
            return lVar.invoke(className);
        }
        return null;
    }

    @Y61.l
    public Map<String, CBRDocumentDefinition> getPreferredDocumentsDefinitions() {
        Y41.a<? extends Map<String, CBRDocumentDefinition>> aVar = preferredDocumentsDefinitionProvider;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    @Y61.l
    public Map<String, String> getSettings() {
        Y41.a<? extends Map<String, String>> aVar = settingsProvider;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    @Y61.k
    public CBRSDKState getState() {
        return state;
    }

    @Y61.l
    public CBRStateChangedHandler getStateChangedHandler() {
        Y41.a<? extends CBRStateChangedHandler> aVar = stateChangedHandlerProvider;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    @Y61.l
    public List<CBRSupportItem> getSupportItems() {
        Y41.a<? extends List<CBRSupportItem>> aVar = supportItemsGetter;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    @Y61.l
    public TokenExpirationHandler getTokenExpirationHandler() {
        Y41.a<? extends TokenExpirationHandler> aVar = tokenExpirationHandlerProvider;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    @Y61.l
    public CBRUrlHandler getUrlHandler() {
        Y41.a<? extends CBRUrlHandler> aVar = urlHandlerProvider;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    public int getVersionCode() {
        return versionCode;
    }

    @Y61.k
    public String getVersionName() {
        return versionName;
    }

    public boolean isDebug() {
        return isDebug;
    }

    public boolean isModuleAvailable(@Y61.k String className) {
        return a(className);
    }

    public void setSupportItems(@Y61.l List<CBRSupportItem> list) {
        Y41.l<? super List<CBRSupportItem>, G0> lVar = supportItemsSetter;
        if (lVar != null) {
            lVar.invoke(list);
        }
    }

    private final boolean a(String name) throws ClassNotFoundException {
        try {
            Class.forName(name);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void a(@Y61.k String packageName2, @Y61.k String versionName2, int versionCode2) {
        packageName = packageName2;
        versionName = versionName2;
        versionCode = versionCode2;
    }

    public final void a(boolean isDebug2, @Y61.k Locale locale2) {
        isDebug = isDebug2;
        locale = locale2;
    }

    public final void a(@Y61.k Y41.a<CBRInitConfig> confProvider2, @Y61.k Y41.a<? extends Map<String, String>> settingsProvider2, @Y61.k Y41.a<? extends TokenExpirationHandler> tokenExpirationHandlerProvider2, @Y61.k Y41.a<? extends CBRStateChangedHandler> stateChangedHandlerProvider2, @Y61.k Y41.a<? extends CBRErrorHandler> errorHandlerProvider2, @Y61.k Y41.a<? extends CBREventHandler> eventHandlerProvider2, @Y61.k Y41.a<? extends CBRJsonCustomization> jsonCustomizationProvider2, @Y61.k Y41.a<? extends CBRInstructionsViewHandler> instructionsViewHandlerProvider2, @Y61.k Y41.a<? extends CBRActionResultHandler> actionResultHandlerProvider2, @Y61.k Y41.l<? super String, ? extends CBRModule> moduleProvider2, @Y61.k Y41.a<? extends CBRIconHandler> iconHandlerProvider2, @Y61.k Y41.a<? extends CBRCountryPicker> countryPickerProvider2, @Y61.k Y41.a<? extends Map<String, CBRDocumentDefinition>> preferredDocumentsDefinitionProvider2, @Y61.k Y41.a<Integer> autoCloseOnApproveTimeoutProvider2, @Y61.k Y41.a<? extends CBRUrlHandler> urlHandlerProvider2) {
        confProvider = confProvider2;
        settingsProvider = settingsProvider2;
        tokenExpirationHandlerProvider = tokenExpirationHandlerProvider2;
        stateChangedHandlerProvider = stateChangedHandlerProvider2;
        errorHandlerProvider = errorHandlerProvider2;
        eventHandlerProvider = eventHandlerProvider2;
        jsonCustomizationProvider = jsonCustomizationProvider2;
        instructionsViewHandlerProvider = instructionsViewHandlerProvider2;
        actionResultHandlerProvider = actionResultHandlerProvider2;
        moduleProvider = moduleProvider2;
        iconHandlerProvider = iconHandlerProvider2;
        countryPickerProvider = countryPickerProvider2;
        preferredDocumentsDefinitionProvider = preferredDocumentsDefinitionProvider2;
        autoCloseOnApproveTimeoutProvider = autoCloseOnApproveTimeoutProvider2;
        urlHandlerProvider = urlHandlerProvider2;
    }

    public final void a(@Y61.l Y41.a<? extends List<CBRSupportItem>> supportItemsGetter2, @Y61.l Y41.l<? super List<CBRSupportItem>, G0> supportItemsSetter2) {
        supportItemsGetter = supportItemsGetter2;
        supportItemsSetter = supportItemsSetter2;
    }
}
