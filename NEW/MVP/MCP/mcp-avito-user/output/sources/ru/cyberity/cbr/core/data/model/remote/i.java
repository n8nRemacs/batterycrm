package ru.cyberity.cbr.core.data.model.remote;

import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlinx.serialization.C43385d;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C43400e0;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.v;
import kotlinx.serialization.w;
import okhttp3.internal.http2.Http2;
import ru.cyberity.cbr.core.data.model.FlowActionType;
import ru.cyberity.cbr.core.data.model.FlowType;
import ru.cyberity.cbr.core.data.model.FlowType$$serializer;
import ru.cyberity.cbr.core.data.model.remote.a;
import ru.cyberity.cbr.core.data.model.remote.c;
import ru.cyberity.cbr.core.data.serializer.FlowActionTypeSerializer;
import shark.AndroidResourceIdNames;

/* compiled from: RemoteConfig.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\b\u0087\b\u0018\u0000 n2\u00020\u0001:\u0002!.B²\u0002\u0012\u001b\b\u0002\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u001e\u0010\u0010\u001a\u001a\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0018\u00010\u0002\u0012\u001b\b\u0002\u0010\u0011\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0002\u0012\u001b\b\u0002\u0010\u0014\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001a\u0010\u001bBÈ\u0002\b\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u001b\b\u0001\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012 \b\u0001\u0010\u0010\u001a\u001a\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0018\u00010\u0002\u0012\u001b\b\u0001\u0010\u0011\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0002\u0012\u001b\b\u0001\u0010\u0014\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001a\u0010 J#\u0010!\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b(\u0010$J\u0012\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b)\u0010$J\u0012\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b,\u0010$J\u0012\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b-\u0010$J(\u0010.\u001a\u001a\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\"J#\u0010/\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\"J\u001e\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\"J#\u00101\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010\"J\u001e\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010\"J\u0012\u00103\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b5\u0010$J\u0012\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b6\u0010$J½\u0002\u0010!\u001a\u00020\u00002\u001b\b\u0002\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032 \b\u0002\u0010\u0010\u001a\u001a\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0018\u00010\u00022\u001b\b\u0002\u0010\u0011\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00022\u001b\b\u0002\u0010\u0014\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b!\u00107J\u0010\u00108\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b8\u0010$J\u0010\u00109\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020<2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b=\u0010>J(\u0010!\u001a\u00020D2\u0006\u0010?\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020BHÇ\u0001¢\u0006\u0004\b!\u0010ER3\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010F\u0012\u0004\bH\u0010I\u001a\u0004\bG\u0010\"R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010J\u0012\u0004\bL\u0010I\u001a\u0004\bK\u0010$R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010J\u0012\u0004\bN\u0010I\u001a\u0004\bM\u0010$R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010O\u0012\u0004\bQ\u0010I\u001a\u0004\bP\u0010'R\"\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010J\u0012\u0004\bS\u0010I\u001a\u0004\bR\u0010$R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010J\u0012\u0004\bU\u0010I\u001a\u0004\bT\u0010$R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010V\u0012\u0004\bX\u0010I\u001a\u0004\bW\u0010+R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010J\u0012\u0004\bZ\u0010I\u001a\u0004\bY\u0010$R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u0010J\u0012\u0004\b\\\u0010I\u001a\u0004\b[\u0010$R8\u0010\u0010\u001a\u001a\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010F\u0012\u0004\b^\u0010I\u001a\u0004\b]\u0010\"R3\u0010\u0011\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010F\u0012\u0004\b`\u0010I\u001a\u0004\b_\u0010\"R.\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010F\u0012\u0004\bb\u0010I\u001a\u0004\ba\u0010\"R3\u0010\u0014\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010F\u0012\u0004\bd\u0010I\u001a\u0004\bc\u0010\"R.\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010F\u0012\u0004\bf\u0010I\u001a\u0004\be\u0010\"R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010g\u0012\u0004\bi\u0010I\u001a\u0004\bh\u00104R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010J\u0012\u0004\bk\u0010I\u001a\u0004\bj\u0010$R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010J\u0012\u0004\bm\u0010I\u001a\u0004\bl\u0010$¨\u0006o"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/i;", "", "", "", "Lkotlinx/serialization/b;", "uiConf", "applicantId", "flowName", "Lru/cyberity/cbr/core/data/model/FlowType;", "flowType", "idDocSetType", "actionId", "Lru/cyberity/cbr/core/data/model/FlowActionType;", "actionType", "faceLivenessLic", "facemapPublicKey", "sdkDict", "documentsByCountries", "Lru/cyberity/cbr/core/data/model/remote/c;", "phoneCountryCodeWithMasks", "tinCountryInfo", "initMetadata", "Lru/cyberity/cbr/core/data/model/remote/a;", "eKycConfig", "verificationUrl", "accessToken", "<init>", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/FlowType;Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/FlowActionType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lru/cyberity/cbr/core/data/model/remote/a;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/util/Map;Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/FlowType;Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/FlowActionType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lru/cyberity/cbr/core/data/model/remote/a;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "a", "()Ljava/util/Map;", "j", "()Ljava/lang/String;", "k", "l", "()Lru/cyberity/cbr/core/data/model/FlowType;", "m", "n", "o", "()Lru/cyberity/cbr/core/data/model/FlowActionType;", "p", "q", "b", "c", "d", "e", "f", "g", "()Lru/cyberity/cbr/core/data/model/remote/a;", "h", "i", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/FlowType;Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/FlowActionType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lru/cyberity/cbr/core/data/model/remote/a;Ljava/lang/String;Ljava/lang/String;)Lru/cyberity/cbr/core/data/model/remote/i;", "toString", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "(Lru/cyberity/cbr/core/data/model/remote/i;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/Map;", "V", "getUiConf$annotations", "()V", "Ljava/lang/String;", "x", "getApplicantId$annotations", "H", "getFlowName$annotations", "Lru/cyberity/cbr/core/data/model/FlowType;", "J", "getFlowType$annotations", "L", "getIdDocSetType$annotations", "t", "getActionId$annotations", "Lru/cyberity/cbr/core/data/model/FlowActionType;", "v", "getActionType$annotations", "D", "getFaceLivenessLic$annotations", "F", "getFacemapPublicKey$annotations", "R", "getSdkDict$annotations", "z", "getDocumentsByCountries$annotations", "P", "getPhoneCountryCodeWithMasks$annotations", "T", "getTinCountryInfo$annotations", "N", "getInitMetadata$annotations", "Lru/cyberity/cbr/core/data/model/remote/a;", "B", "getEKycConfig$annotations", "X", "getVerificationUrl$annotations", "r", "getAccessToken$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@w
/* loaded from: classes9.dex */
public final /* data */ class i {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Map<String, Object> uiConf;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String applicantId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String flowName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final FlowType flowType;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String idDocSetType;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String actionId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final FlowActionType actionType;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String faceLivenessLic;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String facemapPublicKey;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Map<Object, Object> sdkDict;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Map<String, Object> documentsByCountries;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Map<String, c> phoneCountryCodeWithMasks;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Map<String, Object> tinCountryInfo;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Map<String, String> initMetadata;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final ru.cyberity.cbr.core.data.model.remote.a eKycConfig;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String verificationUrl;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String accessToken;

    /* compiled from: RemoteConfig.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/i$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/remote/i;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.model.remote.i$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final KSerializer<i> serializer() {
            return a.f433262a;
        }

        private Companion() {
        }
    }

    @InterfaceC42830m
    public /* synthetic */ i(int i12, @v Map map, @v String str, @v String str2, @v FlowType flowType, @v String str3, @v String str4, @v FlowActionType flowActionType, @v String str5, @v String str6, @v Map map2, @v Map map3, @v Map map4, @v Map map5, @v Map map6, @v ru.cyberity.cbr.core.data.model.remote.a aVar, @v String str7, @v String str8, P0 p02) {
        if (512 != (i12 & 512)) {
            E0.b(i12, 512, a.f433262a.getF332717a());
            throw null;
        }
        if ((i12 & 1) == 0) {
            this.uiConf = null;
        } else {
            this.uiConf = map;
        }
        if ((i12 & 2) == 0) {
            this.applicantId = null;
        } else {
            this.applicantId = str;
        }
        if ((i12 & 4) == 0) {
            this.flowName = null;
        } else {
            this.flowName = str2;
        }
        if ((i12 & 8) == 0) {
            this.flowType = null;
        } else {
            this.flowType = flowType;
        }
        if ((i12 & 16) == 0) {
            this.idDocSetType = null;
        } else {
            this.idDocSetType = str3;
        }
        if ((i12 & 32) == 0) {
            this.actionId = null;
        } else {
            this.actionId = str4;
        }
        if ((i12 & 64) == 0) {
            this.actionType = null;
        } else {
            this.actionType = flowActionType;
        }
        if ((i12 & 128) == 0) {
            this.faceLivenessLic = null;
        } else {
            this.faceLivenessLic = str5;
        }
        if ((i12 & 256) == 0) {
            this.facemapPublicKey = null;
        } else {
            this.facemapPublicKey = str6;
        }
        this.sdkDict = map2;
        if ((i12 & 1024) == 0) {
            this.documentsByCountries = null;
        } else {
            this.documentsByCountries = map3;
        }
        if ((i12 & 2048) == 0) {
            this.phoneCountryCodeWithMasks = null;
        } else {
            this.phoneCountryCodeWithMasks = map4;
        }
        if ((i12 & 4096) == 0) {
            this.tinCountryInfo = null;
        } else {
            this.tinCountryInfo = map5;
        }
        if ((i12 & 8192) == 0) {
            this.initMetadata = null;
        } else {
            this.initMetadata = map6;
        }
        if ((i12 & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
            this.eKycConfig = null;
        } else {
            this.eKycConfig = aVar;
        }
        if ((32768 & i12) == 0) {
            this.verificationUrl = null;
        } else {
            this.verificationUrl = str7;
        }
        if ((i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) == 0) {
            this.accessToken = null;
        } else {
            this.accessToken = str8;
        }
    }

    @Y61.l
    /* renamed from: B, reason: from getter */
    public final ru.cyberity.cbr.core.data.model.remote.a getEKycConfig() {
        return this.eKycConfig;
    }

    @Y61.l
    /* renamed from: D, reason: from getter */
    public final String getFaceLivenessLic() {
        return this.faceLivenessLic;
    }

    @Y61.l
    /* renamed from: F, reason: from getter */
    public final String getFacemapPublicKey() {
        return this.facemapPublicKey;
    }

    @Y61.l
    /* renamed from: H, reason: from getter */
    public final String getFlowName() {
        return this.flowName;
    }

    @Y61.l
    /* renamed from: J, reason: from getter */
    public final FlowType getFlowType() {
        return this.flowType;
    }

    @Y61.l
    /* renamed from: L, reason: from getter */
    public final String getIdDocSetType() {
        return this.idDocSetType;
    }

    @Y61.l
    public final Map<String, String> N() {
        return this.initMetadata;
    }

    @Y61.l
    public final Map<String, c> P() {
        return this.phoneCountryCodeWithMasks;
    }

    @Y61.l
    public final Map<Object, Object> R() {
        return this.sdkDict;
    }

    @Y61.l
    public final Map<String, Object> T() {
        return this.tinCountryInfo;
    }

    @Y61.l
    public final Map<String, Object> V() {
        return this.uiConf;
    }

    @Y61.l
    /* renamed from: X, reason: from getter */
    public final String getVerificationUrl() {
        return this.verificationUrl;
    }

    @Y61.l
    public final Map<String, Object> a() {
        return this.uiConf;
    }

    @Y61.l
    public final Map<Object, Object> b() {
        return this.sdkDict;
    }

    @Y61.l
    public final Map<String, Object> c() {
        return this.documentsByCountries;
    }

    @Y61.l
    public final Map<String, c> d() {
        return this.phoneCountryCodeWithMasks;
    }

    @Y61.l
    public final Map<String, Object> e() {
        return this.tinCountryInfo;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof i)) {
            return false;
        }
        i iVar = (i) other;
        return L.f(this.uiConf, iVar.uiConf) && L.f(this.applicantId, iVar.applicantId) && L.f(this.flowName, iVar.flowName) && this.flowType == iVar.flowType && L.f(this.idDocSetType, iVar.idDocSetType) && L.f(this.actionId, iVar.actionId) && L.f(this.actionType, iVar.actionType) && L.f(this.faceLivenessLic, iVar.faceLivenessLic) && L.f(this.facemapPublicKey, iVar.facemapPublicKey) && L.f(this.sdkDict, iVar.sdkDict) && L.f(this.documentsByCountries, iVar.documentsByCountries) && L.f(this.phoneCountryCodeWithMasks, iVar.phoneCountryCodeWithMasks) && L.f(this.tinCountryInfo, iVar.tinCountryInfo) && L.f(this.initMetadata, iVar.initMetadata) && L.f(this.eKycConfig, iVar.eKycConfig) && L.f(this.verificationUrl, iVar.verificationUrl) && L.f(this.accessToken, iVar.accessToken);
    }

    @Y61.l
    public final Map<String, String> f() {
        return this.initMetadata;
    }

    @Y61.l
    public final ru.cyberity.cbr.core.data.model.remote.a g() {
        return this.eKycConfig;
    }

    @Y61.l
    public final String h() {
        return this.verificationUrl;
    }

    public int hashCode() {
        Map<String, Object> map = this.uiConf;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.applicantId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.flowName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        FlowType flowType = this.flowType;
        int iHashCode4 = (iHashCode3 + (flowType == null ? 0 : flowType.hashCode())) * 31;
        String str3 = this.idDocSetType;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.actionId;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        FlowActionType flowActionType = this.actionType;
        int iHashCode7 = (iHashCode6 + (flowActionType == null ? 0 : flowActionType.hashCode())) * 31;
        String str5 = this.faceLivenessLic;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.facemapPublicKey;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Map<Object, Object> map2 = this.sdkDict;
        int iHashCode10 = (iHashCode9 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, Object> map3 = this.documentsByCountries;
        int iHashCode11 = (iHashCode10 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<String, c> map4 = this.phoneCountryCodeWithMasks;
        int iHashCode12 = (iHashCode11 + (map4 == null ? 0 : map4.hashCode())) * 31;
        Map<String, Object> map5 = this.tinCountryInfo;
        int iHashCode13 = (iHashCode12 + (map5 == null ? 0 : map5.hashCode())) * 31;
        Map<String, String> map6 = this.initMetadata;
        int iHashCode14 = (iHashCode13 + (map6 == null ? 0 : map6.hashCode())) * 31;
        ru.cyberity.cbr.core.data.model.remote.a aVar = this.eKycConfig;
        int iHashCode15 = (iHashCode14 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str7 = this.verificationUrl;
        int iHashCode16 = (iHashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.accessToken;
        return iHashCode16 + (str8 != null ? str8.hashCode() : 0);
    }

    @Y61.l
    /* renamed from: i, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    @Y61.l
    /* renamed from: j, reason: from getter */
    public final String getApplicantId() {
        return this.applicantId;
    }

    @Y61.l
    public final String k() {
        return this.flowName;
    }

    @Y61.l
    public final FlowType l() {
        return this.flowType;
    }

    @Y61.l
    public final String m() {
        return this.idDocSetType;
    }

    @Y61.l
    /* renamed from: n, reason: from getter */
    public final String getActionId() {
        return this.actionId;
    }

    @Y61.l
    /* renamed from: o, reason: from getter */
    public final FlowActionType getActionType() {
        return this.actionType;
    }

    @Y61.l
    public final String p() {
        return this.faceLivenessLic;
    }

    @Y61.l
    public final String q() {
        return this.facemapPublicKey;
    }

    @Y61.l
    public final String r() {
        return this.accessToken;
    }

    @Y61.l
    public final String t() {
        return this.actionId;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RemoteConfig(uiConf=");
        sb2.append(this.uiConf);
        sb2.append(", applicantId=");
        sb2.append(this.applicantId);
        sb2.append(", flowName=");
        sb2.append(this.flowName);
        sb2.append(", flowType=");
        sb2.append(this.flowType);
        sb2.append(", idDocSetType=");
        sb2.append(this.idDocSetType);
        sb2.append(", actionId=");
        sb2.append(this.actionId);
        sb2.append(", actionType=");
        sb2.append(this.actionType);
        sb2.append(", faceLivenessLic=");
        sb2.append(this.faceLivenessLic);
        sb2.append(", facemapPublicKey=");
        sb2.append(this.facemapPublicKey);
        sb2.append(", sdkDict=");
        sb2.append(this.sdkDict);
        sb2.append(", documentsByCountries=");
        sb2.append(this.documentsByCountries);
        sb2.append(", phoneCountryCodeWithMasks=");
        sb2.append(this.phoneCountryCodeWithMasks);
        sb2.append(", tinCountryInfo=");
        sb2.append(this.tinCountryInfo);
        sb2.append(", initMetadata=");
        sb2.append(this.initMetadata);
        sb2.append(", eKycConfig=");
        sb2.append(this.eKycConfig);
        sb2.append(", verificationUrl=");
        sb2.append(this.verificationUrl);
        sb2.append(", accessToken=");
        return C22026a.c(sb2, this.accessToken, ')');
    }

    @Y61.l
    public final FlowActionType v() {
        return this.actionType;
    }

    @Y61.l
    public final String x() {
        return this.applicantId;
    }

    @Y61.l
    public final Map<String, Object> z() {
        return this.documentsByCountries;
    }

    public i(@Y61.l Map<String, ? extends Object> map, @Y61.l String str, @Y61.l String str2, @Y61.l FlowType flowType, @Y61.l String str3, @Y61.l String str4, @Y61.l FlowActionType flowActionType, @Y61.l String str5, @Y61.l String str6, @Y61.l Map<Object, ? extends Object> map2, @Y61.l Map<String, ? extends Object> map3, @Y61.l Map<String, c> map4, @Y61.l Map<String, ? extends Object> map5, @Y61.l Map<String, String> map6, @Y61.l ru.cyberity.cbr.core.data.model.remote.a aVar, @Y61.l String str7, @Y61.l String str8) {
        this.uiConf = map;
        this.applicantId = str;
        this.flowName = str2;
        this.flowType = flowType;
        this.idDocSetType = str3;
        this.actionId = str4;
        this.actionType = flowActionType;
        this.faceLivenessLic = str5;
        this.facemapPublicKey = str6;
        this.sdkDict = map2;
        this.documentsByCountries = map3;
        this.phoneCountryCodeWithMasks = map4;
        this.tinCountryInfo = map5;
        this.initMetadata = map6;
        this.eKycConfig = aVar;
        this.verificationUrl = str7;
        this.accessToken = str8;
    }

    @Y61.k
    public final i a(@Y61.l Map<String, ? extends Object> uiConf, @Y61.l String applicantId, @Y61.l String flowName, @Y61.l FlowType flowType, @Y61.l String idDocSetType, @Y61.l String actionId, @Y61.l FlowActionType actionType, @Y61.l String faceLivenessLic, @Y61.l String facemapPublicKey, @Y61.l Map<Object, ? extends Object> sdkDict, @Y61.l Map<String, ? extends Object> documentsByCountries, @Y61.l Map<String, c> phoneCountryCodeWithMasks, @Y61.l Map<String, ? extends Object> tinCountryInfo, @Y61.l Map<String, String> initMetadata, @Y61.l ru.cyberity.cbr.core.data.model.remote.a eKycConfig, @Y61.l String verificationUrl, @Y61.l String accessToken) {
        return new i(uiConf, applicantId, flowName, flowType, idDocSetType, actionId, actionType, faceLivenessLic, facemapPublicKey, sdkDict, documentsByCountries, phoneCountryCodeWithMasks, tinCountryInfo, initMetadata, eKycConfig, verificationUrl, accessToken);
    }

    @X41.n
    public static final void a(@Y61.k i self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
        if (output.u() || self.uiConf != null) {
            output.p(serialDesc, 0, new C43400e0(V0.f412822a, new C43385d(m0.f406844a.b(Object.class), new KSerializer[0])), self.uiConf);
        }
        if (output.u() || self.applicantId != null) {
            output.p(serialDesc, 1, V0.f412822a, self.applicantId);
        }
        if (output.u() || self.flowName != null) {
            output.p(serialDesc, 2, V0.f412822a, self.flowName);
        }
        if (output.u() || self.flowType != null) {
            output.p(serialDesc, 3, FlowType$$serializer.INSTANCE, self.flowType);
        }
        if (output.u() || self.idDocSetType != null) {
            output.p(serialDesc, 4, V0.f412822a, self.idDocSetType);
        }
        if (output.u() || self.actionId != null) {
            output.p(serialDesc, 5, V0.f412822a, self.actionId);
        }
        if (output.u() || self.actionType != null) {
            output.p(serialDesc, 6, FlowActionTypeSerializer.INSTANCE, self.actionType);
        }
        if (output.u() || self.faceLivenessLic != null) {
            output.p(serialDesc, 7, V0.f412822a, self.faceLivenessLic);
        }
        if (output.u() || self.facemapPublicKey != null) {
            output.p(serialDesc, 8, V0.f412822a, self.facemapPublicKey);
        }
        n0 n0Var = m0.f406844a;
        output.p(serialDesc, 9, new C43400e0(new C43385d(n0Var.b(Object.class), new KSerializer[0]), new C43385d(n0Var.b(Object.class), new KSerializer[0])), self.sdkDict);
        if (output.u() || self.documentsByCountries != null) {
            output.p(serialDesc, 10, new C43400e0(V0.f412822a, new C43385d(n0Var.b(Object.class), new KSerializer[0])), self.documentsByCountries);
        }
        if (output.u() || self.phoneCountryCodeWithMasks != null) {
            output.p(serialDesc, 11, new C43400e0(V0.f412822a, c.a.f433203a), self.phoneCountryCodeWithMasks);
        }
        if (output.u() || self.tinCountryInfo != null) {
            output.p(serialDesc, 12, new C43400e0(V0.f412822a, new C43385d(n0Var.b(Object.class), new KSerializer[0])), self.tinCountryInfo);
        }
        if (output.u() || self.initMetadata != null) {
            V0 v02 = V0.f412822a;
            output.p(serialDesc, 13, new C43400e0(v02, v02), self.initMetadata);
        }
        if (output.u() || self.eKycConfig != null) {
            output.p(serialDesc, 14, a.C12453a.f433193a, self.eKycConfig);
        }
        if (output.u() || self.verificationUrl != null) {
            output.p(serialDesc, 15, V0.f412822a, self.verificationUrl);
        }
        if (!output.u() && self.accessToken == null) {
            return;
        }
        output.p(serialDesc, 16, V0.f412822a, self.accessToken);
    }

    /* compiled from: RemoteConfig.kt */
    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/remote/RemoteConfig.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/remote/i;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/remote/i;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/remote/i;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class a implements N<i> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f433262a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SerialDescriptor f433263b;

        static {
            a aVar = new a();
            f433262a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.remote.RemoteConfig", aVar, 17);
            pluginGeneratedSerialDescriptor.j("uiConf", true);
            pluginGeneratedSerialDescriptor.j("applicantId", true);
            pluginGeneratedSerialDescriptor.j("flowName", true);
            pluginGeneratedSerialDescriptor.j("flowType", true);
            pluginGeneratedSerialDescriptor.j("idDocSetType", true);
            pluginGeneratedSerialDescriptor.j("actionId", true);
            pluginGeneratedSerialDescriptor.j("actionType", true);
            pluginGeneratedSerialDescriptor.j("faceLivenessLic", true);
            pluginGeneratedSerialDescriptor.j("facemapPublicKey", true);
            pluginGeneratedSerialDescriptor.j("sdkDict", false);
            pluginGeneratedSerialDescriptor.j("documentsByCountries", true);
            pluginGeneratedSerialDescriptor.j("phoneCountryCodeWithMasks", true);
            pluginGeneratedSerialDescriptor.j("tinCountryInfo", true);
            pluginGeneratedSerialDescriptor.j("initMetadata", true);
            pluginGeneratedSerialDescriptor.j("eKycConfig", true);
            pluginGeneratedSerialDescriptor.j("verificationUrl", true);
            pluginGeneratedSerialDescriptor.j("accessToken", true);
            f433263b = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v18, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v0 */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v18 */
        /* JADX WARN: Type inference failed for: r9v22 */
        /* JADX WARN: Type inference failed for: r9v25 */
        /* JADX WARN: Type inference failed for: r9v26 */
        /* JADX WARN: Type inference failed for: r9v30 */
        /* JADX WARN: Type inference failed for: r9v31 */
        /* JADX WARN: Type inference failed for: r9v32 */
        /* JADX WARN: Type inference failed for: r9v7 */
        /* JADX WARN: Type inference failed for: r9v9 */
        @Override // kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i deserialize(@Y61.k Decoder decoder) {
            int i12;
            Object obj;
            Object obj2;
            Object obj3;
            String str;
            Object obj4;
            Object obj5;
            Object obj6;
            Object obj7;
            Object obj8;
            String str2;
            Object obj9;
            Object obj10;
            String str3;
            Object obj11;
            Object obj12;
            Object obj13;
            Object obj14;
            Object obj15;
            String strF;
            Object obj16;
            String str4;
            SerialDescriptor f332717a = getF332717a();
            kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
            Object objF = null;
            Object objF2 = null;
            Object objF3 = null;
            Object objF4 = null;
            Object objF5 = null;
            String str5 = null;
            String strF2 = 0;
            Object objF6 = null;
            Object objF7 = null;
            Object objF8 = null;
            Object objF9 = null;
            Object objF10 = null;
            Object objF11 = null;
            Object objF12 = null;
            Object objF13 = null;
            Object objF14 = null;
            Object objF15 = null;
            int i13 = 0;
            boolean z12 = true;
            while (z12) {
                String str6 = str5;
                int iJ2 = cVarC.j(f332717a);
                Object obj17 = strF2;
                switch (iJ2) {
                    case -1:
                        obj = objF5;
                        z12 = false;
                        objF10 = objF10;
                        str5 = str6;
                        strF2 = obj17;
                        objF15 = objF15;
                        objF5 = obj;
                    case 0:
                        obj2 = objF4;
                        obj3 = objF5;
                        str = str6;
                        objF12 = cVarC.f(f332717a, 0, new C43400e0(V0.f412822a, new C43385d(m0.f406844a.b(Object.class), new KSerializer[0])), objF12);
                        i13 |= 1;
                        obj4 = obj17;
                        objF9 = objF9;
                        objF11 = objF11;
                        objF10 = objF10;
                        objF2 = objF2;
                        objF3 = objF3;
                        objF = objF;
                        objF15 = objF15;
                        objF14 = objF14;
                        objF5 = obj3;
                        str5 = str;
                        strF2 = obj4;
                        objF4 = obj2;
                    case 1:
                        obj2 = objF4;
                        obj3 = objF5;
                        str = str6;
                        objF13 = cVarC.f(f332717a, 1, V0.f412822a, objF13);
                        i13 |= 2;
                        obj4 = obj17;
                        objF2 = objF2;
                        objF3 = objF3;
                        objF = objF;
                        objF5 = obj3;
                        str5 = str;
                        strF2 = obj4;
                        objF4 = obj2;
                    case 2:
                        obj5 = objF2;
                        obj6 = objF3;
                        obj7 = objF;
                        obj8 = objF4;
                        obj = objF5;
                        str2 = str6;
                        obj9 = obj17;
                        objF14 = cVarC.f(f332717a, 2, V0.f412822a, objF14);
                        i13 |= 4;
                        obj10 = obj9;
                        str3 = str2;
                        objF2 = obj5;
                        str4 = str3;
                        obj16 = obj10;
                        objF3 = obj6;
                        objF = obj7;
                        objF4 = obj8;
                        str5 = str4;
                        strF2 = obj16;
                        objF5 = obj;
                    case 3:
                        obj5 = objF2;
                        obj6 = objF3;
                        obj7 = objF;
                        obj8 = objF4;
                        obj = objF5;
                        str2 = str6;
                        obj9 = obj17;
                        objF15 = cVarC.f(f332717a, 3, FlowType$$serializer.INSTANCE, objF15);
                        i13 |= 8;
                        obj10 = obj9;
                        str3 = str2;
                        objF2 = obj5;
                        str4 = str3;
                        obj16 = obj10;
                        objF3 = obj6;
                        objF = obj7;
                        objF4 = obj8;
                        str5 = str4;
                        strF2 = obj16;
                        objF5 = obj;
                    case 4:
                        obj11 = objF3;
                        obj12 = objF;
                        obj2 = objF4;
                        i13 |= 16;
                        obj13 = obj17;
                        objF2 = objF2;
                        strF = cVarC.f(f332717a, 4, V0.f412822a, str6);
                        objF3 = obj11;
                        objF = obj12;
                        str5 = strF;
                        strF2 = obj13;
                        objF4 = obj2;
                    case 5:
                        strF2 = cVarC.f(f332717a, 5, V0.f412822a, obj17);
                        i13 |= 32;
                        str5 = str6;
                        objF2 = objF2;
                        objF3 = objF3;
                        objF = objF;
                    case 6:
                        obj14 = objF2;
                        obj15 = objF3;
                        objF6 = cVarC.f(f332717a, 6, FlowActionTypeSerializer.INSTANCE, objF6);
                        i13 |= 64;
                        str5 = str6;
                        strF2 = obj17;
                        objF2 = obj14;
                        objF3 = obj15;
                    case 7:
                        obj14 = objF2;
                        obj15 = objF3;
                        objF7 = cVarC.f(f332717a, 7, V0.f412822a, objF7);
                        i13 |= 128;
                        str5 = str6;
                        strF2 = obj17;
                        objF2 = obj14;
                        objF3 = obj15;
                    case 8:
                        obj14 = objF2;
                        obj15 = objF3;
                        objF8 = cVarC.f(f332717a, 8, V0.f412822a, objF8);
                        i13 |= 256;
                        str5 = str6;
                        strF2 = obj17;
                        objF2 = obj14;
                        objF3 = obj15;
                    case 9:
                        obj6 = objF3;
                        obj7 = objF;
                        obj8 = objF4;
                        obj = objF5;
                        n0 n0Var = m0.f406844a;
                        obj5 = objF2;
                        objF9 = cVarC.f(f332717a, 9, new C43400e0(new C43385d(n0Var.b(Object.class), new KSerializer[0]), new C43385d(n0Var.b(Object.class), new KSerializer[0])), objF9);
                        i13 |= 512;
                        str3 = str6;
                        obj10 = obj17;
                        objF2 = obj5;
                        str4 = str3;
                        obj16 = obj10;
                        objF3 = obj6;
                        objF = obj7;
                        objF4 = obj8;
                        str5 = str4;
                        strF2 = obj16;
                        objF5 = obj;
                    case 10:
                        obj6 = objF3;
                        obj7 = objF;
                        obj8 = objF4;
                        obj = objF5;
                        objF10 = cVarC.f(f332717a, 10, new C43400e0(V0.f412822a, new C43385d(m0.f406844a.b(Object.class), new KSerializer[0])), objF10);
                        i13 |= 1024;
                        str4 = str6;
                        obj16 = obj17;
                        objF3 = obj6;
                        objF = obj7;
                        objF4 = obj8;
                        str5 = str4;
                        strF2 = obj16;
                        objF5 = obj;
                    case 11:
                        obj11 = objF3;
                        obj12 = objF;
                        obj2 = objF4;
                        objF11 = cVarC.f(f332717a, 11, new C43400e0(V0.f412822a, c.a.f433203a), objF11);
                        i13 |= 2048;
                        strF = str6;
                        obj13 = obj17;
                        objF3 = obj11;
                        objF = obj12;
                        str5 = strF;
                        strF2 = obj13;
                        objF4 = obj2;
                    case 12:
                        obj = objF5;
                        obj8 = objF4;
                        obj7 = objF;
                        obj6 = objF3;
                        objF2 = cVarC.f(f332717a, 12, new C43400e0(V0.f412822a, new C43385d(m0.f406844a.b(Object.class), new KSerializer[0])), objF2);
                        i13 |= 4096;
                        str4 = str6;
                        obj16 = obj17;
                        objF3 = obj6;
                        objF = obj7;
                        objF4 = obj8;
                        str5 = str4;
                        strF2 = obj16;
                        objF5 = obj;
                    case 13:
                        V0 v02 = V0.f412822a;
                        objF3 = cVarC.f(f332717a, 13, new C43400e0(v02, v02), objF3);
                        i13 |= 8192;
                        str5 = str6;
                        strF2 = obj17;
                    case 14:
                        objF = cVarC.f(f332717a, 14, a.C12453a.f433193a, objF);
                        i13 |= Http2.INITIAL_MAX_FRAME_SIZE;
                        str5 = str6;
                        strF2 = obj17;
                    case 15:
                        objF4 = cVarC.f(f332717a, 15, V0.f412822a, objF4);
                        i12 = 32768;
                        i13 |= i12;
                        str5 = str6;
                        strF2 = obj17;
                    case 16:
                        objF5 = cVarC.f(f332717a, 16, V0.f412822a, objF5);
                        i12 = AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
                        i13 |= i12;
                        str5 = str6;
                        strF2 = obj17;
                    default:
                        throw new UnknownFieldException(iJ2);
                }
            }
            Object obj18 = objF3;
            Object obj19 = objF;
            Object obj20 = objF4;
            Object obj21 = objF5;
            String str7 = str5;
            Object obj22 = objF14;
            Object obj23 = objF15;
            cVarC.d(f332717a);
            return new i(i13, (Map) objF12, (String) objF13, (String) obj22, (FlowType) obj23, str7, strF2, (FlowActionType) objF6, (String) objF7, (String) objF8, (Map) objF9, (Map) objF10, (Map) objF11, (Map) objF2, (Map) obj18, (ru.cyberity.cbr.core.data.model.remote.a) obj19, (String) obj20, (String) obj21, (P0) null);
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            n0 n0Var = m0.f406844a;
            return new KSerializer[]{L51.a.a(new C43400e0(v02, new C43385d(n0Var.b(Object.class), new KSerializer[0]))), L51.a.a(v02), L51.a.a(v02), L51.a.a(FlowType$$serializer.INSTANCE), L51.a.a(v02), L51.a.a(v02), L51.a.a(FlowActionTypeSerializer.INSTANCE), L51.a.a(v02), L51.a.a(v02), L51.a.a(new C43400e0(new C43385d(n0Var.b(Object.class), new KSerializer[0]), new C43385d(n0Var.b(Object.class), new KSerializer[0]))), L51.a.a(new C43400e0(v02, new C43385d(n0Var.b(Object.class), new KSerializer[0]))), L51.a.a(new C43400e0(v02, c.a.f433203a)), L51.a.a(new C43400e0(v02, new C43385d(n0Var.b(Object.class), new KSerializer[0]))), L51.a.a(new C43400e0(v02, v02)), L51.a.a(a.C12453a.f433193a), L51.a.a(v02), L51.a.a(v02)};
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: getDescriptor */
        public SerialDescriptor getF332717a() {
            return f433263b;
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }

        @Override // kotlinx.serialization.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(@Y61.k Encoder encoder, @Y61.k i value) {
            SerialDescriptor f332717a = getF332717a();
            kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
            i.a(value, dVarC, f332717a);
            dVarC.d(f332717a);
        }
    }

    public /* synthetic */ i(Map map, String str, String str2, FlowType flowType, String str3, String str4, FlowActionType flowActionType, String str5, String str6, Map map2, Map map3, Map map4, Map map5, Map map6, ru.cyberity.cbr.core.data.model.remote.a aVar, String str7, String str8, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : map, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : flowType, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : str4, (i12 & 64) != 0 ? null : flowActionType, (i12 & 128) != 0 ? null : str5, (i12 & 256) != 0 ? null : str6, map2, (i12 & 1024) != 0 ? null : map3, (i12 & 2048) != 0 ? null : map4, (i12 & 4096) != 0 ? null : map5, (i12 & 8192) != 0 ? null : map6, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : aVar, (32768 & i12) != 0 ? null : str7, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : str8);
    }

    @v
    public static /* synthetic */ void A() {
    }

    @v
    public static /* synthetic */ void C() {
    }

    @v
    public static /* synthetic */ void E() {
    }

    @v
    public static /* synthetic */ void G() {
    }

    @v
    public static /* synthetic */ void I() {
    }

    @v
    public static /* synthetic */ void K() {
    }

    @v
    public static /* synthetic */ void M() {
    }

    @v
    public static /* synthetic */ void O() {
    }

    @v
    public static /* synthetic */ void Q() {
    }

    @v
    public static /* synthetic */ void S() {
    }

    @v
    public static /* synthetic */ void U() {
    }

    @v
    public static /* synthetic */ void W() {
    }

    @v
    public static /* synthetic */ void Y() {
    }

    @v
    public static /* synthetic */ void s() {
    }

    @v
    public static /* synthetic */ void u() {
    }

    @v
    public static /* synthetic */ void w() {
    }

    @v
    public static /* synthetic */ void y() {
    }
}
