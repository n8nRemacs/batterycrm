package ru.cyberity.cbr.presentation.screen;

import K51.d;
import Y41.p;
import Y41.q;
import Y41.s;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.view.C23060r0;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;
import okhttp3.internal.ws.WebSocketProtocol;
import ru.cyberity.cbr.core.CBRMobileSDK;
import ru.cyberity.cbr.core.analytics.SdkEvent;
import ru.cyberity.cbr.core.common.a0;
import ru.cyberity.cbr.core.common.j0;
import ru.cyberity.cbr.core.data.listener.CBRCompleteHandler;
import ru.cyberity.cbr.core.data.listener.CBREvent;
import ru.cyberity.cbr.core.data.listener.CBREventHandler;
import ru.cyberity.cbr.core.data.model.CBRCompletionResult;
import ru.cyberity.cbr.core.data.model.CBRMessage;
import ru.cyberity.cbr.core.data.model.CBRTrackEvents;
import ru.cyberity.cbr.core.data.model.Document;
import ru.cyberity.cbr.core.data.model.DocumentType;
import ru.cyberity.cbr.core.data.model.FlowType;
import ru.cyberity.cbr.core.data.model.ReviewStatusType;
import ru.cyberity.cbr.core.data.model.VideoRequiredType;
import ru.cyberity.cbr.core.data.model.g;
import ru.cyberity.cbr.core.data.model.p;
import ru.cyberity.cbr.core.data.model.t;
import ru.cyberity.cbr.core.data.source.dynamic.c;
import ru.cyberity.cbr.core.domain.model.a;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.core.presentation.intro.CBRStepInfo;
import ru.cyberity.cbr.core.presentation.intro.IntroScene;
import ru.cyberity.cbr.domain.e;
import ru.cyberity.cbr.domain.f;
import ru.cyberity.cbr.prooface.CBRProoface;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBRAppViewModel.kt */
@Metadata(d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 ¾\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\b¾\u0001¿\u0001À\u0001Á\u0001B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b%\u0010$J\u001f\u0010)\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020\u0019¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00132\u0006\u0010,\u001a\u00020+H\u0014¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u0019¢\u0006\u0004\b0\u0010\u001cJ\u0017\u00103\u001a\u00020\u00132\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\u00020\u00132\u0006\u00105\u001a\u00020\u0019¢\u0006\u0004\b6\u0010\u001cJ\u001f\u0010;\u001a\u00020\u00132\u0006\u00108\u001a\u0002072\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u0013¢\u0006\u0004\b=\u0010\u0017J\u0015\u0010@\u001a\u00020\u00132\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ\u001d\u0010F\u001a\u00020\u00132\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0013H\u0002¢\u0006\u0004\bH\u0010\u0017J\u000f\u0010I\u001a\u00020\u0013H\u0002¢\u0006\u0004\bI\u0010\u0017J\u000f\u0010J\u001a\u00020\u0013H\u0002¢\u0006\u0004\bJ\u0010\u0017J\u000f\u0010K\u001a\u00020\u0013H\u0002¢\u0006\u0004\bK\u0010\u0017J\u000f\u0010L\u001a\u00020\u0013H\u0002¢\u0006\u0004\bL\u0010\u0017J\u0019\u0010O\u001a\u00020\u00132\b\u0010N\u001a\u0004\u0018\u00010MH\u0002¢\u0006\u0004\bO\u0010PJ\u001f\u0010S\u001a\u00020\u00132\u0006\u0010R\u001a\u00020Q2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\bS\u0010TJ'\u0010W\u001a\u00020\u00192\u0006\u0010R\u001a\u00020Q2\u000e\u0010V\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010UH\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020>2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\bY\u0010ZJ+\u0010^\u001a\u00020\u00132\u0006\u0010[\u001a\u00020\u00192\u0006\u0010R\u001a\u00020Q2\u0006\u0010]\u001a\u00020\\H\u0082@ø\u0001\u0000¢\u0006\u0004\b^\u0010_J#\u0010`\u001a\u00020\u00132\u0006\u0010R\u001a\u00020Q2\u0006\u0010]\u001a\u00020\\H\u0082@ø\u0001\u0000¢\u0006\u0004\b`\u0010aJ\u001d\u0010b\u001a\u00020\u00132\b\u0010]\u001a\u0004\u0018\u00010\\H\u0082@ø\u0001\u0000¢\u0006\u0004\bb\u0010cJ\u0017\u0010f\u001a\u00020\u00132\u0006\u0010e\u001a\u00020dH\u0002¢\u0006\u0004\bf\u0010gJ1\u0010\u001b\u001a\u00020\u00132\u0006\u0010R\u001a\u00020Q2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020!0U2\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010iJ\u001d\u0010j\u001a\u00020\u00132\f\u0010h\u001a\b\u0012\u0004\u0012\u00020!0UH\u0002¢\u0006\u0004\bj\u0010kJ\u001b\u0010l\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0019H\u0082@ø\u0001\u0000¢\u0006\u0004\bl\u0010mJ\u0017\u0010n\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\bn\u0010$J\u0017\u0010o\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0019H\u0002¢\u0006\u0004\bo\u0010\u001cJ\u0017\u0010q\u001a\u00020\u00132\u0006\u0010,\u001a\u00020pH\u0002¢\u0006\u0004\bq\u0010rJ\u001b\u0010s\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0019H\u0082@ø\u0001\u0000¢\u0006\u0004\bs\u0010mJ'\u0010t\u001a\u00020\u00132\u0006\u0010R\u001a\u00020Q2\u0006\u0010]\u001a\u00020\\2\u0006\u0010\u001d\u001a\u00020\u0019H\u0002¢\u0006\u0004\bt\u0010uJ-\u0010v\u001a\u00020\u00192\u0006\u0010R\u001a\u00020Q2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020!0U2\u0006\u0010\u001d\u001a\u00020\u0019H\u0002¢\u0006\u0004\bv\u0010wJ/\u0010s\u001a\u00020\u00132\u0006\u0010R\u001a\u00020Q2\u0006\u0010]\u001a\u00020\\2\u0006\u0010x\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019H\u0002¢\u0006\u0004\bs\u0010yJ\u0017\u0010{\u001a\u00020\u00132\u0006\u0010z\u001a\u00020\u0019H\u0002¢\u0006\u0004\b{\u0010\u001cJ\u0017\u0010|\u001a\u00020\u0019*\u00020QH\u0082@ø\u0001\u0000¢\u0006\u0004\b|\u0010}JN\u0010\u0086\u0001\u001a\u00020\u001327\u0010\u0085\u0001\u001a2\b\u0001\u0012\u0016\u0012\u00140\u007f¢\u0006\u000f\b\u0080\u0001\u0012\n\b\u0081\u0001\u0012\u0005\b\b(\u0082\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00130\u0083\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u0084\u00010~H\u0002ø\u0001\u0000¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010\u0088\u0001R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010\u0089\u0001R\u0015\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010\u008a\u0001R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010\u008b\u0001R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010\u008c\u0001R\u0015\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000e\u0010\u008d\u0001R\u0019\u0010\u008e\u0001\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001c\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R6\u0010\u0099\u0001\u001a\u0004\u0018\u00010>2\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010>8B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0005\b\u0098\u0001\u0010AR2\u0010\u009b\u0001\u001a\u00020\u00192\u0007\u0010\u0093\u0001\u001a\u00020\u00198B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\b\u009a\u0001\u0010\u0095\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0005\b\u009d\u0001\u0010\u001cR\u001c\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u0092\u0001R2\u0010¢\u0001\u001a\u00020\u00192\u0007\u0010\u0093\u0001\u001a\u00020\u00198B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\b\u009f\u0001\u0010\u0095\u0001\u001a\u0006\b \u0001\u0010\u009c\u0001\"\u0005\b¡\u0001\u0010\u001cR-\u0010¤\u0001\u001a\u0004\u0018\u00010!2\t\u0010£\u0001\u001a\u0004\u0018\u00010!8\u0002@BX\u0082\u000e¢\u0006\u000f\n\u0006\b¤\u0001\u0010¥\u0001\"\u0005\b¦\u0001\u0010$R\u0019\u0010§\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u001e\u0010ª\u0001\u001a\t\u0012\u0004\u0012\u00020\u00190©\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u001f\u0010\u00ad\u0001\u001a\n\u0012\u0005\u0012\u00030¬\u00010©\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010«\u0001R9\u0010´\u0001\u001a\u0005\u0018\u00010®\u00012\n\u0010\u0093\u0001\u001a\u0005\u0018\u00010®\u00018B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\b¯\u0001\u0010\u0095\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R\u001e\u0010¶\u0001\u001a\t\u0012\u0004\u0012\u00020>0µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R(\u00106\u001a\t\u0012\u0004\u0012\u00020\u00190¸\u00018\u0006¢\u0006\u0016\n\u0005\b6\u0010¹\u0001\u0012\u0005\b¼\u0001\u0010\u0017\u001a\u0006\bº\u0001\u0010»\u0001R\u0017\u0010½\u0001\u001a\u00020\u00198BX\u0082\u0004¢\u0006\b\u001a\u0006\b½\u0001\u0010\u009c\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Â\u0001"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$ViewState;", "Landroidx/lifecycle/r0;", "savedStateHandle", "Lru/cyberity/cbr/domain/f;", "prepareSDKUseCase", "Lru/cyberity/cbr/domain/e;", "getApplicantDataAndUpdateStatusUseCase", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/settings/b;", "settingsRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "<init>", "(Landroidx/lifecycle/r0;Lru/cyberity/cbr/domain/f;Lru/cyberity/cbr/domain/e;Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/settings/b;Lru/cyberity/cbr/core/data/source/dynamic/c;)V", "getDefaultState", "()Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$ViewState;", "Lkotlin/G0;", "onPrepare", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCleared", "()V", "onLoad", "", "startVI", "moveToNextDocument", "(Z)V", "isCancelled", "reload", "onMoveToApplicantStatusScreen", "(ZZ)V", "Lru/cyberity/cbr/core/data/model/Document;", "document", "onDocumentUploaded", "(Lru/cyberity/cbr/core/data/model/Document;)V", "onDocumentClicked", "Lru/cyberity/cbr/core/data/model/CBRCompletionResult;", "result", "isClosedByHost", "onCancel", "(Lru/cyberity/cbr/core/data/model/CBRCompletionResult;Z)V", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "event", "fireEvent", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;)V", "success", "executeAfterInstructionsAction", "Lru/cyberity/cbr/core/data/model/p;", "error", "onHandleError", "(Lru/cyberity/cbr/core/data/model/p;)V", "show", "onProgress", "Lru/cyberity/cbr/core/domain/model/c;", "introParams", "Landroid/os/Parcelable;", "payload", "resolveInstructions", "(Lru/cyberity/cbr/core/domain/model/c;Landroid/os/Parcelable;)V", "clearShownInstructions", "", "networkType", "setNetworkState", "(Ljava/lang/String;)V", "Lru/cyberity/cbr/core/common/a0;", "reason", "", "delayMs", "delayedFinish", "(Lru/cyberity/cbr/core/common/a0;J)V", "scheduleSlowConnectionTimer", "cancelSlowConnectionJob", "cancelWaitForLevelChange", "setDefaultSDKState", "observeData", "Lru/cyberity/cbr/core/data/source/dynamic/c$a;", "aData", "handleDataUpdated", "(Lru/cyberity/cbr/core/data/source/dynamic/c$a;)V", "Lru/cyberity/cbr/core/data/model/g;", "applicant", "showPreview", "(Lru/cyberity/cbr/core/data/model/g;Lru/cyberity/cbr/core/data/model/Document;)V", "", "docs", "hasRejectedVIDocs", "(Lru/cyberity/cbr/core/data/model/g;Ljava/util/List;)Z", "prepareInstructionsKey", "(Lru/cyberity/cbr/core/domain/model/c;)Ljava/lang/String;", "isRestoring", "Lru/cyberity/cbr/core/data/model/e;", Navigation.CONFIG, "onSdkPreparedSuccess", "(ZLru/cyberity/cbr/core/data/model/g;Lru/cyberity/cbr/core/data/model/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleFlowType", "(Lru/cyberity/cbr/core/data/model/g;Lru/cyberity/cbr/core/data/model/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleAction", "(Lru/cyberity/cbr/core/data/model/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "exception", "onSdkPreparedFailure", "(Ljava/lang/Throwable;)V", "documents", "(Lru/cyberity/cbr/core/data/model/g;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startVideoIdentification", "(Ljava/util/List;)V", "onStepComplete", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fireOnStartStep", "fireOnStepCompleted", "Lru/cyberity/cbr/core/data/listener/CBREvent;", "fireCBREvent", "(Lru/cyberity/cbr/core/data/listener/CBREvent;)V", "resolveApplicantStatus", "resolveApplicantStatusWithLevelChangeWaiting", "(Lru/cyberity/cbr/core/data/model/g;Lru/cyberity/cbr/core/data/model/e;Z)V", "resolveApplicantStatusWithVideoIdent", "(Lru/cyberity/cbr/core/data/model/g;Ljava/util/List;Z)Z", "hasDocumentsToSubmit", "(Lru/cyberity/cbr/core/data/model/g;Lru/cyberity/cbr/core/data/model/e;ZZ)V", "isLoading", "onLoadingInternalData", "needSelectAgreement", "(Lru/cyberity/cbr/core/data/model/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlinx/coroutines/T;", "Lkotlin/S;", "name", "scope", "Lkotlin/coroutines/Continuation;", "", "block", "launchWithProgress", "(LY41/p;)V", "Landroidx/lifecycle/r0;", "Lru/cyberity/cbr/domain/f;", "Lru/cyberity/cbr/domain/e;", "Lru/cyberity/cbr/core/data/source/common/a;", "Lru/cyberity/cbr/core/data/source/settings/b;", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "levelChangeTimeout", "J", "Lkotlinx/coroutines/N0;", "waitForLevelChangeJob", "Lkotlinx/coroutines/N0;", "<set-?>", "currentLevelName$delegate", "Lru/cyberity/cbr/core/presentation/screen/base/a;", "getCurrentLevelName", "()Ljava/lang/String;", "setCurrentLevelName", "currentLevelName", "isSDKPrepared$delegate", "isSDKPrepared", "()Z", "setSDKPrepared", "slowConnectionJob", "verificationStarted$delegate", "getVerificationStarted", "setVerificationStarted", "verificationStarted", "value", "documentStarted", "Lru/cyberity/cbr/core/data/model/Document;", "setDocumentStarted", "isInitialStatusShown", "Z", "Lkotlinx/coroutines/flow/Z1;", "progressState", "Lkotlinx/coroutines/flow/Z1;", "", "internalProgressState", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$PendingInstructionsData;", "pendingInstructionsData$delegate", "getPendingInstructionsData", "()Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$PendingInstructionsData;", "setPendingInstructionsData", "(Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$PendingInstructionsData;)V", "pendingInstructionsData", "", "shownInstructions", "Ljava/util/Set;", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/i;", "getOnProgress", "()Lkotlinx/coroutines/flow/i;", "getOnProgress$annotations", "isWaitingForLevelChange", "Companion", "Event", "PendingInstructionsData", "ViewState", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class CBRAppViewModel extends CBRViewModel<ViewState> {
    static final /* synthetic */ n<Object>[] $$delegatedProperties;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE;

    @k
    private final ru.cyberity.cbr.core.data.source.common.a commonRepository;

    /* renamed from: currentLevelName$delegate, reason: from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.presentation.screen.base.a currentLevelName;

    @k
    private final c dataRepository;

    @l
    private Document documentStarted;

    @k
    private final e getApplicantDataAndUpdateStatusUseCase;

    @k
    private final Z1<Integer> internalProgressState;
    private boolean isInitialStatusShown;

    /* renamed from: isSDKPrepared$delegate, reason: from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.presentation.screen.base.a isSDKPrepared;
    private long levelChangeTimeout;

    @k
    private final InterfaceC43160i<Boolean> onProgress;

    /* renamed from: pendingInstructionsData$delegate, reason: from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.presentation.screen.base.a pendingInstructionsData;

    @k
    private final f prepareSDKUseCase;

    @k
    private final Z1<Boolean> progressState;

    @k
    private final C23060r0 savedStateHandle;

    @k
    private final ru.cyberity.cbr.core.data.source.settings.b settingsRepository;

    @k
    private final Set<String> shownInstructions;

    @l
    private N0 slowConnectionJob;

    /* renamed from: verificationStarted$delegate, reason: from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.presentation.screen.base.a verificationStarted;

    @l
    private N0 waitForLevelChangeJob;

    /* compiled from: CBRAppViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "showProgress", "Lkotlin/G0;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.CBRAppViewModel$1", f = "CBRAppViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.presentation.screen.CBRAppViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<Boolean, Continuation<? super G0>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        /* compiled from: CBRAppViewModel.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$ViewState;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.CBRAppViewModel$1$1", f = "CBRAppViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: ru.cyberity.cbr.presentation.screen.CBRAppViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C125051 extends SuspendLambda implements p<ViewState, Continuation<? super ViewState>, Object> {
            final /* synthetic */ boolean $showProgress;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C125051(boolean z12, Continuation<? super C125051> continuation) {
                super(2, continuation);
                this.$showProgress = z12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                C125051 c125051 = new C125051(this.$showProgress, continuation);
                c125051.L$0 = obj;
                return c125051;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return ViewState.copy$default((ViewState) this.L$0, false, Boxing.boxBoolean(this.$showProgress), false, null, null, 29, null);
            }

            @Override // Y41.p
            @l
            public final Object invoke(@k ViewState viewState, @l Continuation<? super ViewState> continuation) {
                return ((C125051) create(viewState, continuation)).invokeSuspend(G0.f406611a);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = CBRAppViewModel.this.new AnonymousClass1(continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // Y41.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super G0> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            boolean z12 = this.Z$0;
            Logger.v$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(CBRAppViewModel.this), com.avito.android.bxcontent.mvi.entity.f.l("Show progress = ", z12), null, 4, null);
            CBRAppViewModel.this.updateState(true, new C125051(z12, null));
            if (z12) {
                CBRAppViewModel.this.scheduleSlowConnectionTimer();
            } else {
                CBRAppViewModel.this.cancelSlowConnectionJob();
            }
            return G0.f406611a;
        }

        @l
        public final Object invoke(boolean z12, @l Continuation<? super G0> continuation) {
            return ((AnonymousClass1) create(Boolean.valueOf(z12), continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: CBRAppViewModel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Companion;", "", "()V", "LEVEL_CHANGE_TIMEOUT", "", "LOG_TAG", "", "PROGRESS_HIDE_DELAY", "SLOW_CONNECTION_TIMEOUT", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: CBRAppViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0010\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0005¢\u0006\u0002\u0010\u0002¨\u0006\t"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "()V", "AfterInstructionsEvent", "Cancel", "HandleError", "Navigate", "ShowInstructions", "WaitingForLevelChange", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static class Event implements CBRViewModel.CBRViewModelEvent {

        /* compiled from: CBRAppViewModel.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$AfterInstructionsEvent;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event;", "", "success", "Landroid/os/Parcelable;", "payload", "<init>", "(ZLandroid/os/Parcelable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Z", "getSuccess", "()Z", "Landroid/os/Parcelable;", "getPayload", "()Landroid/os/Parcelable;", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final /* data */ class AfterInstructionsEvent extends Event {

            @k
            private final Parcelable payload;
            private final boolean success;

            public AfterInstructionsEvent(boolean z12, @k Parcelable parcelable) {
                this.success = z12;
                this.payload = parcelable;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AfterInstructionsEvent)) {
                    return false;
                }
                AfterInstructionsEvent afterInstructionsEvent = (AfterInstructionsEvent) other;
                return this.success == afterInstructionsEvent.success && L.f(this.payload, afterInstructionsEvent.payload);
            }

            @k
            public final Parcelable getPayload() {
                return this.payload;
            }

            public final boolean getSuccess() {
                return this.success;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [int] */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v4 */
            public int hashCode() {
                boolean z12 = this.success;
                ?? r02 = z12;
                if (z12) {
                    r02 = 1;
                }
                return this.payload.hashCode() + (r02 * 31);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("AfterInstructionsEvent(success=");
                sb2.append(this.success);
                sb2.append(", payload=");
                return com.avito.android.advert.item.delivery_suggests.l.o(sb2, this.payload, ')');
            }
        }

        /* compiled from: CBRAppViewModel.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Cancel;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event;", "Lru/cyberity/cbr/core/data/model/CBRCompletionResult;", "result", "<init>", "(Lru/cyberity/cbr/core/data/model/CBRCompletionResult;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lru/cyberity/cbr/core/data/model/CBRCompletionResult;", "getResult", "()Lru/cyberity/cbr/core/data/model/CBRCompletionResult;", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final /* data */ class Cancel extends Event {

            @k
            private final CBRCompletionResult result;

            public Cancel(@k CBRCompletionResult cBRCompletionResult) {
                this.result = cBRCompletionResult;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Cancel) && L.f(this.result, ((Cancel) other).result);
            }

            public int hashCode() {
                return this.result.hashCode();
            }

            @k
            public String toString() {
                return "Cancel(result=" + this.result + ')';
            }
        }

        /* compiled from: CBRAppViewModel.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$HandleError;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event;", "Lru/cyberity/cbr/core/data/model/p;", "error", "<init>", "(Lru/cyberity/cbr/core/data/model/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lru/cyberity/cbr/core/data/model/p;", "getError", "()Lru/cyberity/cbr/core/data/model/p;", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1})
        public static final /* data */ class HandleError extends Event {

            @k
            private final ru.cyberity.cbr.core.data.model.p error;

            public HandleError(@k ru.cyberity.cbr.core.data.model.p pVar) {
                this.error = pVar;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof HandleError) && L.f(this.error, ((HandleError) other).error);
            }

            @k
            public final ru.cyberity.cbr.core.data.model.p getError() {
                return this.error;
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            @k
            public String toString() {
                return "HandleError(error=" + this.error + ')';
            }
        }

        /* compiled from: CBRAppViewModel.kt */
        @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0010\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001aB\u0015\b\u0004\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\tR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u0082\u0001\u0010\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*¨\u0006+"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event;", "Landroid/os/Parcelable;", "Lru/cyberity/cbr/core/domain/model/c;", "introParams", "Lru/cyberity/cbr/core/domain/model/c;", "getIntroParams", "()Lru/cyberity/cbr/core/domain/model/c;", "setIntroParams", "(Lru/cyberity/cbr/core/domain/model/c;)V", "<init>", "Action", "AgreementSelector", "ApplicantData", "ApplicantStatus", "ConfirmEmail", "ConfirmPhone", "Ekyc", "Geolocation", "Liveness", "PreviewIdentity", "PreviewPhotoSelfie", "PreviewSelfieWithDocument", "PreviewVideoSelfie", "ProofOfAddress", "Questionnaire", "VideoIdent", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$Action;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$AgreementSelector;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$ApplicantData;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$ApplicantStatus;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$ConfirmEmail;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$ConfirmPhone;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$Ekyc;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$Geolocation;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$Liveness;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$PreviewIdentity;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$PreviewPhotoSelfie;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$PreviewSelfieWithDocument;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$PreviewVideoSelfie;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$ProofOfAddress;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$Questionnaire;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$VideoIdent;", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1})
        public static abstract class Navigate extends Event implements Parcelable {

            @l
            private ru.cyberity.cbr.core.domain.model.c introParams;

            /* compiled from: CBRAppViewModel.kt */
            @d
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\t¨\u0006\u001d"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$Action;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate;", "", "idDocSetType", "actionId", "actionType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getIdDocSetType", "getActionId", "getActionType", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final /* data */ class Action extends Navigate {

                @k
                public static final Parcelable.Creator<Action> CREATOR = new Creator();

                @l
                private final String actionId;

                @k
                private final String actionType;

                @k
                private final String idDocSetType;

                /* compiled from: CBRAppViewModel.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Action> {
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Action createFromParcel(@k Parcel parcel) {
                        return new Action(parcel.readString(), parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Action[] newArray(int i12) {
                        return new Action[i12];
                    }
                }

                public Action(@k String str, @l String str2, @k String str3) {
                    super(new ru.cyberity.cbr.core.domain.model.c(str, IntroScene.FACESCAN.getSceneName(), null, true, 4, null), null);
                    this.idDocSetType = str;
                    this.actionId = str2;
                    this.actionType = str3;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Action)) {
                        return false;
                    }
                    Action action = (Action) other;
                    return L.f(this.idDocSetType, action.idDocSetType) && L.f(this.actionId, action.actionId) && L.f(this.actionType, action.actionType);
                }

                @l
                public final String getActionId() {
                    return this.actionId;
                }

                @k
                public final String getActionType() {
                    return this.actionType;
                }

                @k
                public final String getIdDocSetType() {
                    return this.idDocSetType;
                }

                public int hashCode() {
                    int iHashCode = this.idDocSetType.hashCode() * 31;
                    String str = this.actionId;
                    return this.actionType.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Action(idDocSetType=");
                    sb2.append(this.idDocSetType);
                    sb2.append(", actionId=");
                    sb2.append(this.actionId);
                    sb2.append(", actionType=");
                    return C22026a.c(sb2, this.actionType, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.idDocSetType);
                    parcel.writeString(this.actionId);
                    parcel.writeString(this.actionType);
                }
            }

            /* compiled from: CBRAppViewModel.kt */
            @d
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$AgreementSelector;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final class AgreementSelector extends Navigate {

                @k
                public static final AgreementSelector INSTANCE = new AgreementSelector();

                @k
                public static final Parcelable.Creator<AgreementSelector> CREATOR = new Creator();

                /* compiled from: CBRAppViewModel.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                public static final class Creator implements Parcelable.Creator<AgreementSelector> {
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final AgreementSelector createFromParcel(@k Parcel parcel) {
                        parcel.readInt();
                        return AgreementSelector.INSTANCE;
                    }

                    @Override // android.os.Parcelable.Creator
                    @k
                    public final AgreementSelector[] newArray(int i12) {
                        return new AgreementSelector[i12];
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                private AgreementSelector() {
                    super(null, 1, 0 == true ? 1 : 0);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeInt(1);
                }
            }

            /* compiled from: CBRAppViewModel.kt */
            @d
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$ApplicantData;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate;", "Lru/cyberity/cbr/core/data/model/Document;", "doc", "<init>", "(Lru/cyberity/cbr/core/data/model/Document;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lru/cyberity/cbr/core/data/model/Document;", "getDoc", "()Lru/cyberity/cbr/core/data/model/Document;", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final /* data */ class ApplicantData extends Navigate {

                @k
                public static final Parcelable.Creator<ApplicantData> CREATOR = new Creator();

                @k
                private final Document doc;

                /* compiled from: CBRAppViewModel.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                public static final class Creator implements Parcelable.Creator<ApplicantData> {
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ApplicantData createFromParcel(@k Parcel parcel) {
                        return new ApplicantData((Document) parcel.readParcelable(ApplicantData.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ApplicantData[] newArray(int i12) {
                        return new ApplicantData[i12];
                    }
                }

                public ApplicantData(@k Document document) {
                    super(new ru.cyberity.cbr.core.domain.model.c(document.getType().getValue(), IntroScene.DATA.getSceneName(), null, false, 12, null), null);
                    this.doc = document;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ApplicantData) && L.f(this.doc, ((ApplicantData) other).doc);
                }

                @k
                public final Document getDoc() {
                    return this.doc;
                }

                public int hashCode() {
                    return this.doc.hashCode();
                }

                @k
                public String toString() {
                    return "ApplicantData(doc=" + this.doc + ')';
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeParcelable(this.doc, flags);
                }
            }

            /* compiled from: CBRAppViewModel.kt */
            @d
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$ApplicantStatus;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final class ApplicantStatus extends Navigate {

                @k
                public static final ApplicantStatus INSTANCE = new ApplicantStatus();

                @k
                public static final Parcelable.Creator<ApplicantStatus> CREATOR = new Creator();

                /* compiled from: CBRAppViewModel.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                public static final class Creator implements Parcelable.Creator<ApplicantStatus> {
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ApplicantStatus createFromParcel(@k Parcel parcel) {
                        parcel.readInt();
                        return ApplicantStatus.INSTANCE;
                    }

                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ApplicantStatus[] newArray(int i12) {
                        return new ApplicantStatus[i12];
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                private ApplicantStatus() {
                    super(null, 1, 0 == true ? 1 : 0);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeInt(1);
                }
            }

            /* compiled from: CBRAppViewModel.kt */
            @d
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$ConfirmEmail;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate;", "Lru/cyberity/cbr/core/data/model/Document;", "doc", "<init>", "(Lru/cyberity/cbr/core/data/model/Document;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lru/cyberity/cbr/core/data/model/Document;", "getDoc", "()Lru/cyberity/cbr/core/data/model/Document;", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final /* data */ class ConfirmEmail extends Navigate {

                @k
                public static final Parcelable.Creator<ConfirmEmail> CREATOR = new Creator();

                @k
                private final Document doc;

                /* compiled from: CBRAppViewModel.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                public static final class Creator implements Parcelable.Creator<ConfirmEmail> {
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ConfirmEmail createFromParcel(@k Parcel parcel) {
                        return new ConfirmEmail((Document) parcel.readParcelable(ConfirmEmail.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ConfirmEmail[] newArray(int i12) {
                        return new ConfirmEmail[i12];
                    }
                }

                public ConfirmEmail(@k Document document) {
                    super(new ru.cyberity.cbr.core.domain.model.c(document.getType().getValue(), IntroScene.CONFIRMATION.getSceneName(), null, false, 12, null), null);
                    this.doc = document;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ConfirmEmail) && L.f(this.doc, ((ConfirmEmail) other).doc);
                }

                public int hashCode() {
                    return this.doc.hashCode();
                }

                @k
                public String toString() {
                    return "ConfirmEmail(doc=" + this.doc + ')';
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeParcelable(this.doc, flags);
                }
            }

            /* compiled from: CBRAppViewModel.kt */
            @d
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$ConfirmPhone;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate;", "Lru/cyberity/cbr/core/data/model/Document;", "doc", "<init>", "(Lru/cyberity/cbr/core/data/model/Document;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lru/cyberity/cbr/core/data/model/Document;", "getDoc", "()Lru/cyberity/cbr/core/data/model/Document;", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final /* data */ class ConfirmPhone extends Navigate {

                @k
                public static final Parcelable.Creator<ConfirmPhone> CREATOR = new Creator();

                @k
                private final Document doc;

                /* compiled from: CBRAppViewModel.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                public static final class Creator implements Parcelable.Creator<ConfirmPhone> {
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ConfirmPhone createFromParcel(@k Parcel parcel) {
                        return new ConfirmPhone((Document) parcel.readParcelable(ConfirmPhone.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ConfirmPhone[] newArray(int i12) {
                        return new ConfirmPhone[i12];
                    }
                }

                public ConfirmPhone(@k Document document) {
                    super(new ru.cyberity.cbr.core.domain.model.c(document.getType().getValue(), IntroScene.CONFIRMATION.getSceneName(), null, false, 12, null), null);
                    this.doc = document;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ConfirmPhone) && L.f(this.doc, ((ConfirmPhone) other).doc);
                }

                public int hashCode() {
                    return this.doc.hashCode();
                }

                @k
                public String toString() {
                    return "ConfirmPhone(doc=" + this.doc + ')';
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeParcelable(this.doc, flags);
                }
            }

            /* compiled from: CBRAppViewModel.kt */
            @d
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$Ekyc;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate;", "Lru/cyberity/cbr/core/data/model/Document;", "doc", "<init>", "(Lru/cyberity/cbr/core/data/model/Document;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lru/cyberity/cbr/core/data/model/Document;", "getDoc", "()Lru/cyberity/cbr/core/data/model/Document;", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final /* data */ class Ekyc extends Navigate {

                @k
                public static final Parcelable.Creator<Ekyc> CREATOR = new Creator();

                @k
                private final Document doc;

                /* compiled from: CBRAppViewModel.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Ekyc> {
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Ekyc createFromParcel(@k Parcel parcel) {
                        return new Ekyc((Document) parcel.readParcelable(Ekyc.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Ekyc[] newArray(int i12) {
                        return new Ekyc[i12];
                    }
                }

                public Ekyc(@k Document document) {
                    super(new ru.cyberity.cbr.core.domain.model.c(document.getType().getValue(), IntroScene.EKYC.getSceneName(), null, false, 12, null), null);
                    this.doc = document;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Ekyc) && L.f(this.doc, ((Ekyc) other).doc);
                }

                @k
                public final Document getDoc() {
                    return this.doc;
                }

                public int hashCode() {
                    return this.doc.hashCode();
                }

                @k
                public String toString() {
                    return "Ekyc(doc=" + this.doc + ')';
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeParcelable(this.doc, flags);
                }
            }

            /* compiled from: CBRAppViewModel.kt */
            @d
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$Geolocation;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate;", "Lru/cyberity/cbr/core/data/model/Document;", "doc", "<init>", "(Lru/cyberity/cbr/core/data/model/Document;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lru/cyberity/cbr/core/data/model/Document;", "getDoc", "()Lru/cyberity/cbr/core/data/model/Document;", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final /* data */ class Geolocation extends Navigate {

                @k
                public static final Parcelable.Creator<Geolocation> CREATOR = new Creator();

                @k
                private final Document doc;

                /* compiled from: CBRAppViewModel.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Geolocation> {
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Geolocation createFromParcel(@k Parcel parcel) {
                        return new Geolocation((Document) parcel.readParcelable(Geolocation.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Geolocation[] newArray(int i12) {
                        return new Geolocation[i12];
                    }
                }

                public Geolocation(@k Document document) {
                    super(new ru.cyberity.cbr.core.domain.model.c(document.getType().getValue(), IntroScene.GEO.getSceneName(), null, false, 12, null), null);
                    this.doc = document;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Geolocation) && L.f(this.doc, ((Geolocation) other).doc);
                }

                @k
                public final Document getDoc() {
                    return this.doc;
                }

                public int hashCode() {
                    return this.doc.hashCode();
                }

                @k
                public String toString() {
                    return "Geolocation(doc=" + this.doc + ')';
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeParcelable(this.doc, flags);
                }
            }

            /* compiled from: CBRAppViewModel.kt */
            @d
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$Liveness;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate;", "Lru/cyberity/cbr/core/data/model/Document;", "doc", "<init>", "(Lru/cyberity/cbr/core/data/model/Document;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lru/cyberity/cbr/core/data/model/Document;", "getDoc", "()Lru/cyberity/cbr/core/data/model/Document;", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final /* data */ class Liveness extends Navigate {

                @k
                public static final Parcelable.Creator<Liveness> CREATOR = new Creator();

                @k
                private final Document doc;

                /* compiled from: CBRAppViewModel.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Liveness> {
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Liveness createFromParcel(@k Parcel parcel) {
                        return new Liveness((Document) parcel.readParcelable(Liveness.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Liveness[] newArray(int i12) {
                        return new Liveness[i12];
                    }
                }

                public Liveness(@k Document document) {
                    super(new ru.cyberity.cbr.core.domain.model.c(document.getType().getValue(), IntroScene.FACESCAN.getSceneName(), null, false, 12, null), null);
                    this.doc = document;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Liveness) && L.f(this.doc, ((Liveness) other).doc);
                }

                @k
                public final Document getDoc() {
                    return this.doc;
                }

                public int hashCode() {
                    return this.doc.hashCode();
                }

                @k
                public String toString() {
                    return "Liveness(doc=" + this.doc + ')';
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeParcelable(this.doc, flags);
                }
            }

            /* compiled from: CBRAppViewModel.kt */
            @d
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$PreviewIdentity;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate;", "Lru/cyberity/cbr/core/data/model/Document;", "doc", "<init>", "(Lru/cyberity/cbr/core/data/model/Document;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lru/cyberity/cbr/core/data/model/Document;", "getDoc", "()Lru/cyberity/cbr/core/data/model/Document;", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final /* data */ class PreviewIdentity extends Navigate {

                @k
                public static final Parcelable.Creator<PreviewIdentity> CREATOR = new Creator();

                @k
                private final Document doc;

                /* compiled from: CBRAppViewModel.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                public static final class Creator implements Parcelable.Creator<PreviewIdentity> {
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final PreviewIdentity createFromParcel(@k Parcel parcel) {
                        return new PreviewIdentity((Document) parcel.readParcelable(PreviewIdentity.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    @k
                    public final PreviewIdentity[] newArray(int i12) {
                        return new PreviewIdentity[i12];
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public PreviewIdentity(@k Document document) {
                    super(null, 1, 0 == true ? 1 : 0);
                    this.doc = document;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof PreviewIdentity) && L.f(this.doc, ((PreviewIdentity) other).doc);
                }

                @k
                public final Document getDoc() {
                    return this.doc;
                }

                public int hashCode() {
                    return this.doc.hashCode();
                }

                @k
                public String toString() {
                    return "PreviewIdentity(doc=" + this.doc + ')';
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeParcelable(this.doc, flags);
                }
            }

            /* compiled from: CBRAppViewModel.kt */
            @d
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$PreviewPhotoSelfie;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate;", "Lru/cyberity/cbr/core/data/model/Document;", "doc", "<init>", "(Lru/cyberity/cbr/core/data/model/Document;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lru/cyberity/cbr/core/data/model/Document;", "getDoc", "()Lru/cyberity/cbr/core/data/model/Document;", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final /* data */ class PreviewPhotoSelfie extends Navigate {

                @k
                public static final Parcelable.Creator<PreviewPhotoSelfie> CREATOR = new Creator();

                @k
                private final Document doc;

                /* compiled from: CBRAppViewModel.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                public static final class Creator implements Parcelable.Creator<PreviewPhotoSelfie> {
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final PreviewPhotoSelfie createFromParcel(@k Parcel parcel) {
                        return new PreviewPhotoSelfie((Document) parcel.readParcelable(PreviewPhotoSelfie.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    @k
                    public final PreviewPhotoSelfie[] newArray(int i12) {
                        return new PreviewPhotoSelfie[i12];
                    }
                }

                public PreviewPhotoSelfie(@k Document document) {
                    super(new ru.cyberity.cbr.core.domain.model.c(document.getType().getValue(), IntroScene.PORTRAIT_SELFIE.getSceneName(), null, false, 12, null), null);
                    this.doc = document;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof PreviewPhotoSelfie) && L.f(this.doc, ((PreviewPhotoSelfie) other).doc);
                }

                @k
                public final Document getDoc() {
                    return this.doc;
                }

                public int hashCode() {
                    return this.doc.hashCode();
                }

                @k
                public String toString() {
                    return "PreviewPhotoSelfie(doc=" + this.doc + ')';
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeParcelable(this.doc, flags);
                }
            }

            /* compiled from: CBRAppViewModel.kt */
            @d
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$PreviewSelfieWithDocument;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate;", "Lru/cyberity/cbr/core/data/model/Document;", "doc", "<init>", "(Lru/cyberity/cbr/core/data/model/Document;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lru/cyberity/cbr/core/data/model/Document;", "getDoc", "()Lru/cyberity/cbr/core/data/model/Document;", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final /* data */ class PreviewSelfieWithDocument extends Navigate {

                @k
                public static final Parcelable.Creator<PreviewSelfieWithDocument> CREATOR = new Creator();

                @k
                private final Document doc;

                /* compiled from: CBRAppViewModel.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                public static final class Creator implements Parcelable.Creator<PreviewSelfieWithDocument> {
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final PreviewSelfieWithDocument createFromParcel(@k Parcel parcel) {
                        return new PreviewSelfieWithDocument((Document) parcel.readParcelable(PreviewSelfieWithDocument.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    @k
                    public final PreviewSelfieWithDocument[] newArray(int i12) {
                        return new PreviewSelfieWithDocument[i12];
                    }
                }

                public PreviewSelfieWithDocument(@k Document document) {
                    super(new ru.cyberity.cbr.core.domain.model.c(document.getType().getValue(), IntroScene.PHOTOSELFIE.getSceneName(), null, false, 12, null), null);
                    this.doc = document;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof PreviewSelfieWithDocument) && L.f(this.doc, ((PreviewSelfieWithDocument) other).doc);
                }

                @k
                public final Document getDoc() {
                    return this.doc;
                }

                public int hashCode() {
                    return this.doc.hashCode();
                }

                @k
                public String toString() {
                    return "PreviewSelfieWithDocument(doc=" + this.doc + ')';
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeParcelable(this.doc, flags);
                }
            }

            /* compiled from: CBRAppViewModel.kt */
            @d
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$PreviewVideoSelfie;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate;", "Lru/cyberity/cbr/core/data/model/Document;", "doc", "<init>", "(Lru/cyberity/cbr/core/data/model/Document;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lru/cyberity/cbr/core/data/model/Document;", "getDoc", "()Lru/cyberity/cbr/core/data/model/Document;", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final /* data */ class PreviewVideoSelfie extends Navigate {

                @k
                public static final Parcelable.Creator<PreviewVideoSelfie> CREATOR = new Creator();

                @k
                private final Document doc;

                /* compiled from: CBRAppViewModel.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                public static final class Creator implements Parcelable.Creator<PreviewVideoSelfie> {
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final PreviewVideoSelfie createFromParcel(@k Parcel parcel) {
                        return new PreviewVideoSelfie((Document) parcel.readParcelable(PreviewVideoSelfie.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    @k
                    public final PreviewVideoSelfie[] newArray(int i12) {
                        return new PreviewVideoSelfie[i12];
                    }
                }

                public PreviewVideoSelfie(@k Document document) {
                    super(new ru.cyberity.cbr.core.domain.model.c(document.getType().getValue(), IntroScene.VIDEOSELFIE.getSceneName(), null, false, 12, null), null);
                    this.doc = document;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof PreviewVideoSelfie) && L.f(this.doc, ((PreviewVideoSelfie) other).doc);
                }

                @k
                public final Document getDoc() {
                    return this.doc;
                }

                public int hashCode() {
                    return this.doc.hashCode();
                }

                @k
                public String toString() {
                    return "PreviewVideoSelfie(doc=" + this.doc + ')';
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeParcelable(this.doc, flags);
                }
            }

            /* compiled from: CBRAppViewModel.kt */
            @d
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$ProofOfAddress;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate;", "Lru/cyberity/cbr/core/data/model/Document;", "doc", "<init>", "(Lru/cyberity/cbr/core/data/model/Document;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lru/cyberity/cbr/core/data/model/Document;", "getDoc", "()Lru/cyberity/cbr/core/data/model/Document;", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final /* data */ class ProofOfAddress extends Navigate {

                @k
                public static final Parcelable.Creator<ProofOfAddress> CREATOR = new Creator();

                @k
                private final Document doc;

                /* compiled from: CBRAppViewModel.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                public static final class Creator implements Parcelable.Creator<ProofOfAddress> {
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ProofOfAddress createFromParcel(@k Parcel parcel) {
                        return new ProofOfAddress((Document) parcel.readParcelable(ProofOfAddress.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ProofOfAddress[] newArray(int i12) {
                        return new ProofOfAddress[i12];
                    }
                }

                public ProofOfAddress(@k Document document) {
                    super(new ru.cyberity.cbr.core.domain.model.c(document.getType().getValue(), IntroScene.SCAN_FRONTSIDE.getSceneName(), null, false, 12, null), null);
                    this.doc = document;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ProofOfAddress) && L.f(this.doc, ((ProofOfAddress) other).doc);
                }

                @k
                public final Document getDoc() {
                    return this.doc;
                }

                public int hashCode() {
                    return this.doc.hashCode();
                }

                @k
                public String toString() {
                    return "ProofOfAddress(doc=" + this.doc + ')';
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeParcelable(this.doc, flags);
                }
            }

            /* compiled from: CBRAppViewModel.kt */
            @d
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$Questionnaire;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate;", "Lru/cyberity/cbr/core/data/model/Document;", "doc", "<init>", "(Lru/cyberity/cbr/core/data/model/Document;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lru/cyberity/cbr/core/data/model/Document;", "getDoc", "()Lru/cyberity/cbr/core/data/model/Document;", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final /* data */ class Questionnaire extends Navigate {

                @k
                public static final Parcelable.Creator<Questionnaire> CREATOR = new Creator();

                @k
                private final Document doc;

                /* compiled from: CBRAppViewModel.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Questionnaire> {
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Questionnaire createFromParcel(@k Parcel parcel) {
                        return new Questionnaire((Document) parcel.readParcelable(Questionnaire.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Questionnaire[] newArray(int i12) {
                        return new Questionnaire[i12];
                    }
                }

                public Questionnaire(@k Document document) {
                    super(new ru.cyberity.cbr.core.domain.model.c(document.getType().getValue(), IntroScene.QUESTIONNAIRE.getSceneName(), null, false, 12, null), null);
                    this.doc = document;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Questionnaire) && L.f(this.doc, ((Questionnaire) other).doc);
                }

                @k
                public final Document getDoc() {
                    return this.doc;
                }

                public int hashCode() {
                    return this.doc.hashCode();
                }

                @k
                public String toString() {
                    return "Questionnaire(doc=" + this.doc + ')';
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeParcelable(this.doc, flags);
                }
            }

            /* compiled from: CBRAppViewModel.kt */
            @d
            @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate$VideoIdent;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate;", "", "Lru/cyberity/cbr/core/data/model/Document;", "docs", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getDocs", "()Ljava/util/List;", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final /* data */ class VideoIdent extends Navigate {

                @k
                public static final Parcelable.Creator<VideoIdent> CREATOR = new Creator();

                @k
                private final List<Document> docs;

                /* compiled from: CBRAppViewModel.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                public static final class Creator implements Parcelable.Creator<VideoIdent> {
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final VideoIdent createFromParcel(@k Parcel parcel) {
                        int i12 = parcel.readInt();
                        ArrayList arrayList = new ArrayList(i12);
                        int iL2 = 0;
                        while (iL2 != i12) {
                            iL2 = com.avito.android.actions_sheet.a.l(VideoIdent.class, parcel, arrayList, iL2, 1);
                        }
                        return new VideoIdent(arrayList);
                    }

                    @Override // android.os.Parcelable.Creator
                    @k
                    public final VideoIdent[] newArray(int i12) {
                        return new VideoIdent[i12];
                    }
                }

                public VideoIdent(@k List<Document> list) {
                    super(new ru.cyberity.cbr.core.domain.model.c("VIDEO_IDENT", IntroScene.VIDEO_IDENT.getSceneName(), null, false, 12, null), null);
                    this.docs = list;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof VideoIdent) && L.f(this.docs, ((VideoIdent) other).docs);
                }

                public int hashCode() {
                    return this.docs.hashCode();
                }

                @k
                public String toString() {
                    return H.p(new StringBuilder("VideoIdent(docs="), this.docs, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    Iterator itJ = C0.j(this.docs, parcel);
                    while (itJ.hasNext()) {
                        parcel.writeParcelable((Parcelable) itJ.next(), flags);
                    }
                }
            }

            public /* synthetic */ Navigate(ru.cyberity.cbr.core.domain.model.c cVar, C42822w c42822w) {
                this(cVar);
            }

            @l
            public final ru.cyberity.cbr.core.domain.model.c getIntroParams() {
                return this.introParams;
            }

            public final void setIntroParams(@l ru.cyberity.cbr.core.domain.model.c cVar) {
                this.introParams = cVar;
            }

            private Navigate(ru.cyberity.cbr.core.domain.model.c cVar) {
                this.introParams = cVar;
            }

            public /* synthetic */ Navigate(ru.cyberity.cbr.core.domain.model.c cVar, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : cVar, null);
            }
        }

        /* compiled from: CBRAppViewModel.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$ShowInstructions;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event;", "Lru/cyberity/cbr/core/presentation/intro/CBRStepInfo;", "stepInfo", "", "cancelOnBackPressed", "", "countryCode", "<init>", "(Lru/cyberity/cbr/core/presentation/intro/CBRStepInfo;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Lru/cyberity/cbr/core/presentation/intro/CBRStepInfo;", "getStepInfo", "()Lru/cyberity/cbr/core/presentation/intro/CBRStepInfo;", "Z", "getCancelOnBackPressed", "()Z", "Ljava/lang/String;", "getCountryCode", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final /* data */ class ShowInstructions extends Event {
            private final boolean cancelOnBackPressed;

            @l
            private final String countryCode;

            @k
            private final CBRStepInfo stepInfo;

            public ShowInstructions(@k CBRStepInfo cBRStepInfo, boolean z12, @l String str) {
                this.stepInfo = cBRStepInfo;
                this.cancelOnBackPressed = z12;
                this.countryCode = str;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowInstructions)) {
                    return false;
                }
                ShowInstructions showInstructions = (ShowInstructions) other;
                return L.f(this.stepInfo, showInstructions.stepInfo) && this.cancelOnBackPressed == showInstructions.cancelOnBackPressed && L.f(this.countryCode, showInstructions.countryCode);
            }

            public final boolean getCancelOnBackPressed() {
                return this.cancelOnBackPressed;
            }

            @l
            public final String getCountryCode() {
                return this.countryCode;
            }

            @k
            public final CBRStepInfo getStepInfo() {
                return this.stepInfo;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int iHashCode = this.stepInfo.hashCode() * 31;
                boolean z12 = this.cancelOnBackPressed;
                int i12 = z12;
                if (z12 != 0) {
                    i12 = 1;
                }
                int i13 = (iHashCode + i12) * 31;
                String str = this.countryCode;
                return i13 + (str == null ? 0 : str.hashCode());
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("ShowInstructions(stepInfo=");
                sb2.append(this.stepInfo);
                sb2.append(", cancelOnBackPressed=");
                sb2.append(this.cancelOnBackPressed);
                sb2.append(", countryCode=");
                return C22026a.c(sb2, this.countryCode, ')');
            }
        }

        /* compiled from: CBRAppViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$WaitingForLevelChange;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event;", "()V", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class WaitingForLevelChange extends Event {

            @k
            public static final WaitingForLevelChange INSTANCE = new WaitingForLevelChange();

            private WaitingForLevelChange() {
            }
        }
    }

    /* compiled from: CBRAppViewModel.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$PendingInstructionsData;", "Landroid/os/Parcelable;", "Lru/cyberity/cbr/core/domain/model/c;", "introParams", "payload", "<init>", "(Lru/cyberity/cbr/core/domain/model/c;Landroid/os/Parcelable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lru/cyberity/cbr/core/domain/model/c;", "getIntroParams", "()Lru/cyberity/cbr/core/domain/model/c;", "Landroid/os/Parcelable;", "getPayload", "()Landroid/os/Parcelable;", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class PendingInstructionsData implements Parcelable {

        @k
        public static final Parcelable.Creator<PendingInstructionsData> CREATOR = new Creator();

        @k
        private final ru.cyberity.cbr.core.domain.model.c introParams;

        @k
        private final Parcelable payload;

        /* compiled from: CBRAppViewModel.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PendingInstructionsData> {
            @Override // android.os.Parcelable.Creator
            @k
            public final PendingInstructionsData createFromParcel(@k Parcel parcel) {
                return new PendingInstructionsData((ru.cyberity.cbr.core.domain.model.c) parcel.readParcelable(PendingInstructionsData.class.getClassLoader()), parcel.readParcelable(PendingInstructionsData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            @k
            public final PendingInstructionsData[] newArray(int i12) {
                return new PendingInstructionsData[i12];
            }
        }

        public PendingInstructionsData(@k ru.cyberity.cbr.core.domain.model.c cVar, @k Parcelable parcelable) {
            this.introParams = cVar;
            this.payload = parcelable;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PendingInstructionsData)) {
                return false;
            }
            PendingInstructionsData pendingInstructionsData = (PendingInstructionsData) other;
            return L.f(this.introParams, pendingInstructionsData.introParams) && L.f(this.payload, pendingInstructionsData.payload);
        }

        @k
        public final ru.cyberity.cbr.core.domain.model.c getIntroParams() {
            return this.introParams;
        }

        @k
        public final Parcelable getPayload() {
            return this.payload;
        }

        public int hashCode() {
            return this.payload.hashCode() + (this.introParams.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("PendingInstructionsData(introParams=");
            sb2.append(this.introParams);
            sb2.append(", payload=");
            return com.avito.android.advert.item.delivery_suggests.l.o(sb2, this.payload, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.introParams, flags);
            parcel.writeParcelable(this.payload, flags);
        }
    }

    /* compiled from: CBRAppViewModel.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJH\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0003\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u0004\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001b\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001f\u0010\u001e¨\u0006 "}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$ViewState;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "", "isSdkPrepared", "isLoading", "loadingIsTooLong", "", "preparedText", "loadingTooLongText", "<init>", "(ZLjava/lang/Boolean;ZLjava/lang/CharSequence;Ljava/lang/CharSequence;)V", "copy", "(ZLjava/lang/Boolean;ZLjava/lang/CharSequence;Ljava/lang/CharSequence;)Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$ViewState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getLoadingIsTooLong", "Ljava/lang/CharSequence;", "getPreparedText", "()Ljava/lang/CharSequence;", "getLoadingTooLongText", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class ViewState implements CBRViewModel.CBRViewModelState {

        @l
        private final Boolean isLoading;
        private final boolean isSdkPrepared;
        private final boolean loadingIsTooLong;

        @l
        private final CharSequence loadingTooLongText;

        @l
        private final CharSequence preparedText;

        public ViewState() {
            this(false, null, false, null, null, 31, null);
        }

        public static /* synthetic */ ViewState copy$default(ViewState viewState, boolean z12, Boolean bool, boolean z13, CharSequence charSequence, CharSequence charSequence2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                z12 = viewState.isSdkPrepared;
            }
            if ((i12 & 2) != 0) {
                bool = viewState.isLoading;
            }
            Boolean bool2 = bool;
            if ((i12 & 4) != 0) {
                z13 = viewState.loadingIsTooLong;
            }
            boolean z14 = z13;
            if ((i12 & 8) != 0) {
                charSequence = viewState.preparedText;
            }
            CharSequence charSequence3 = charSequence;
            if ((i12 & 16) != 0) {
                charSequence2 = viewState.loadingTooLongText;
            }
            return viewState.copy(z12, bool2, z14, charSequence3, charSequence2);
        }

        @k
        public final ViewState copy(boolean isSdkPrepared, @l Boolean isLoading, boolean loadingIsTooLong, @l CharSequence preparedText, @l CharSequence loadingTooLongText) {
            return new ViewState(isSdkPrepared, isLoading, loadingIsTooLong, preparedText, loadingTooLongText);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return this.isSdkPrepared == viewState.isSdkPrepared && L.f(this.isLoading, viewState.isLoading) && this.loadingIsTooLong == viewState.loadingIsTooLong && L.f(this.preparedText, viewState.preparedText) && L.f(this.loadingTooLongText, viewState.loadingTooLongText);
        }

        public final boolean getLoadingIsTooLong() {
            return this.loadingIsTooLong;
        }

        @l
        public final CharSequence getLoadingTooLongText() {
            return this.loadingTooLongText;
        }

        @l
        public final CharSequence getPreparedText() {
            return this.preparedText;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v11 */
        public int hashCode() {
            boolean z12 = this.isSdkPrepared;
            ?? r02 = z12;
            if (z12) {
                r02 = 1;
            }
            int i12 = r02 * 31;
            Boolean bool = this.isLoading;
            int iHashCode = (i12 + (bool == null ? 0 : bool.hashCode())) * 31;
            boolean z13 = this.loadingIsTooLong;
            int i13 = (iHashCode + (z13 ? 1 : z13 ? 1 : 0)) * 31;
            CharSequence charSequence = this.preparedText;
            int iHashCode2 = (i13 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
            CharSequence charSequence2 = this.loadingTooLongText;
            return iHashCode2 + (charSequence2 != null ? charSequence2.hashCode() : 0);
        }

        @l
        /* renamed from: isLoading, reason: from getter */
        public final Boolean getIsLoading() {
            return this.isLoading;
        }

        /* renamed from: isSdkPrepared, reason: from getter */
        public final boolean getIsSdkPrepared() {
            return this.isSdkPrepared;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ViewState(isSdkPrepared=");
            sb2.append(this.isSdkPrepared);
            sb2.append(", isLoading=");
            sb2.append(this.isLoading);
            sb2.append(", loadingIsTooLong=");
            sb2.append(this.loadingIsTooLong);
            sb2.append(", preparedText=");
            sb2.append((Object) this.preparedText);
            sb2.append(", loadingTooLongText=");
            return AK.c.r(sb2, this.loadingTooLongText, ')');
        }

        public ViewState(boolean z12, @l Boolean bool, boolean z13, @l CharSequence charSequence, @l CharSequence charSequence2) {
            this.isSdkPrepared = z12;
            this.isLoading = bool;
            this.loadingIsTooLong = z13;
            this.preparedText = charSequence;
            this.loadingTooLongText = charSequence2;
        }

        public /* synthetic */ ViewState(boolean z12, Boolean bool, boolean z13, CharSequence charSequence, CharSequence charSequence2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? null : bool, (i12 & 4) == 0 ? z13 : false, (i12 & 8) != 0 ? null : charSequence, (i12 & 16) != 0 ? null : charSequence2);
        }
    }

    /* compiled from: CBRAppViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlowType.values().length];
            iArr[FlowType.Standalone.ordinal()] = 1;
            iArr[FlowType.Module.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CBRAppViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$ViewState;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.CBRAppViewModel$cancelSlowConnectionJob$1", f = "CBRAppViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.presentation.screen.CBRAppViewModel$cancelSlowConnectionJob$1, reason: invalid class name and case insensitive filesystem */
    public static final class C478621 extends SuspendLambda implements p<ViewState, Continuation<? super ViewState>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C478621(Continuation<? super C478621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C478621 c478621 = new C478621(continuation);
            c478621.L$0 = obj;
            return c478621;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return ViewState.copy$default((ViewState) this.L$0, false, null, false, null, null, 27, null);
        }

        @Override // Y41.p
        @l
        public final Object invoke(@k ViewState viewState, @l Continuation<? super ViewState> continuation) {
            return ((C478621) create(viewState, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: CBRAppViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.CBRAppViewModel", f = "CBRAppViewModel.kt", i = {0, 0, 0}, l = {588}, m = "handleAction", n = {"this", Navigation.CONFIG, "action"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: ru.cyberity.cbr.presentation.screen.CBRAppViewModel$handleAction$1, reason: invalid class name and case insensitive filesystem */
    public static final class C478631 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C478631(Continuation<? super C478631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.result = obj;
            this.label |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRAppViewModel.this.handleAction(null, this);
        }
    }

    /* compiled from: CBRAppViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.CBRAppViewModel", f = "CBRAppViewModel.kt", i = {1, 1}, l = {565, 569, 575}, m = "handleFlowType", n = {"this", Navigation.CONFIG}, s = {"L$0", "L$1"})
    /* renamed from: ru.cyberity.cbr.presentation.screen.CBRAppViewModel$handleFlowType$1, reason: invalid class name and case insensitive filesystem */
    public static final class C478641 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C478641(Continuation<? super C478641> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.result = obj;
            this.label |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRAppViewModel.this.handleFlowType(null, null, this);
        }
    }

    /* compiled from: CBRAppViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.CBRAppViewModel$launchWithProgress$1", f = "CBRAppViewModel.kt", i = {0}, l = {917}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    /* renamed from: ru.cyberity.cbr.presentation.screen.CBRAppViewModel$launchWithProgress$1, reason: invalid class name and case insensitive filesystem */
    public static final class C478651 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        final /* synthetic */ p<T, Continuation<? super G0>, Object> $block;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CBRAppViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C478651(p<? super T, ? super Continuation<? super G0>, ? extends Object> pVar, CBRAppViewModel cBRAppViewModel, Continuation<? super C478651> continuation) {
            super(2, continuation);
            this.$block = pVar;
            this.this$0 = cBRAppViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C478651 c478651 = new C478651(this.$block, this.this$0, continuation);
            c478651.L$0 = obj;
            return c478651;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            T t12;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.label;
            try {
                try {
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        T t13 = (T) this.L$0;
                        try {
                            p<T, Continuation<? super G0>, Object> pVar = this.$block;
                            this.L$0 = t13;
                            this.label = 1;
                            if (pVar.invoke(t13, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (CancellationException unused) {
                            t12 = t13;
                            Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(t12), "CancellationException happened", null, 4, null);
                            return G0.f406611a;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t12 = (T) this.L$0;
                        try {
                            C42729a0.b(obj);
                        } catch (CancellationException unused2) {
                            Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(t12), "CancellationException happened", null, 4, null);
                            return G0.f406611a;
                        }
                    }
                } finally {
                    this.this$0.onLoadingInternalData(false);
                }
            } catch (Exception e12) {
                CBRViewModel.throwError$default(this.this$0, e12, "TYPE_UNKNOWN", null, 4, null);
            }
            return G0.f406611a;
        }

        @Override // Y41.p
        @l
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((C478651) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: CBRAppViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.CBRAppViewModel$moveToNextDocument$1", f = "CBRAppViewModel.kt", i = {2, 2}, l = {265, 272, 276, 285, 298, 313, 315}, m = "invokeSuspend", n = {"documents", "applicant"}, s = {"L$0", "L$1"})
    /* renamed from: ru.cyberity.cbr.presentation.screen.CBRAppViewModel$moveToNextDocument$1, reason: invalid class name and case insensitive filesystem */
    public static final class C478661 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        final /* synthetic */ boolean $startVI;
        Object L$0;
        Object L$1;
        int label;

        /* compiled from: CBRAppViewModel.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/cyberity/cbr/core/data/model/Document;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: ru.cyberity.cbr.presentation.screen.CBRAppViewModel$moveToNextDocument$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C125061 extends N implements Y41.l<Document, CharSequence> {
            public static final C125061 INSTANCE = new C125061();

            public C125061() {
                super(1);
            }

            @Override // Y41.l
            @k
            public final CharSequence invoke(@k Document document) {
                return document.getType().getValue();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C478661(boolean z12, Continuation<? super C478661> continuation) {
            super(2, continuation);
            this.$startVI = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return CBRAppViewModel.this.new C478661(this.$startVI, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:102:0x0220  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x01f1  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01f3  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01ff  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x021c A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 586
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.CBRAppViewModel.C478661.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // Y41.p
        @l
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((C478661) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: CBRAppViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.CBRAppViewModel", f = "CBRAppViewModel.kt", i = {}, l = {908}, m = "needSelectAgreement", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.presentation.screen.CBRAppViewModel$needSelectAgreement$1, reason: invalid class name and case insensitive filesystem */
    public static final class C478671 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C478671(Continuation<? super C478671> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.result = obj;
            this.label |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRAppViewModel.this.needSelectAgreement(null, this);
        }
    }

    /* compiled from: CBRAppViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.CBRAppViewModel$observeData$1", f = "CBRAppViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.presentation.screen.CBRAppViewModel$observeData$1, reason: invalid class name and case insensitive filesystem */
    public static final class C478681 extends SuspendLambda implements q<InterfaceC43172j<? super CBRMessage.ServerMessage>, Throwable, Continuation<? super G0>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C478681(Continuation<? super C478681> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            Logger.e$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(CBRAppViewModel.this), String.valueOf(((Throwable) this.L$0).getMessage()), null, 4, null);
            return G0.f406611a;
        }

        @Override // Y41.q
        @l
        public final Object invoke(@k InterfaceC43172j<? super CBRMessage.ServerMessage> interfaceC43172j, @k Throwable th2, @l Continuation<? super G0> continuation) {
            C478681 c478681 = CBRAppViewModel.this.new C478681(continuation);
            c478681.L$0 = th2;
            return c478681.invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: CBRAppViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/source/dynamic/c$a;", "data", "Lkotlin/G0;", "<anonymous>", "(Lru/cyberity/cbr/core/data/source/dynamic/c$a;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.CBRAppViewModel$observeData$2", f = "CBRAppViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.presentation.screen.CBRAppViewModel$observeData$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements p<c.a, Continuation<? super G0>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = CBRAppViewModel.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            CBRAppViewModel.this.handleDataUpdated((c.a) this.L$0);
            return G0.f406611a;
        }

        @Override // Y41.p
        @l
        public final Object invoke(@l c.a aVar, @l Continuation<? super G0> continuation) {
            return ((AnonymousClass2) create(aVar, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: CBRAppViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.CBRAppViewModel$onDocumentClicked$1", f = "CBRAppViewModel.kt", i = {1}, l = {338, 339, 351}, m = "invokeSuspend", n = {"applicant"}, s = {"L$0"})
    /* renamed from: ru.cyberity.cbr.presentation.screen.CBRAppViewModel$onDocumentClicked$1, reason: invalid class name and case insensitive filesystem */
    public static final class C478691 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        final /* synthetic */ Document $document;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C478691(Document document, Continuation<? super C478691> continuation) {
            super(2, continuation);
            this.$document = document;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return CBRAppViewModel.this.new C478691(this.$document, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00d8 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r13.label
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 0
                r6 = 1
                if (r1 == 0) goto L2c
                if (r1 == r6) goto L28
                if (r1 == r4) goto L20
                if (r1 != r3) goto L18
                kotlin.C42729a0.b(r14)
                goto Ld9
            L18:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L20:
                java.lang.Object r1 = r13.L$0
                ru.cyberity.cbr.core.data.model.g r1 = (ru.cyberity.cbr.core.data.model.g) r1
                kotlin.C42729a0.b(r14)
                goto L82
            L28:
                kotlin.C42729a0.b(r14)
                goto L68
            L2c:
                kotlin.C42729a0.b(r14)
                ru.cyberity.log.a r7 = ru.cyberity.log.a.f436064a
                ru.cyberity.cbr.presentation.screen.CBRAppViewModel r14 = ru.cyberity.cbr.presentation.screen.CBRAppViewModel.this
                java.lang.String r8 = ru.cyberity.log.c.a(r14)
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                java.lang.String r1 = "A user has clicked on document: "
                r14.<init>(r1)
                ru.cyberity.cbr.core.data.model.Document r1 = r13.$document
                ru.cyberity.cbr.core.data.model.DocumentType r1 = r1.getType()
                java.lang.String r1 = r1.getValue()
                r14.append(r1)
                java.lang.String r9 = r14.toString()
                r11 = 4
                r12 = 0
                r10 = 0
                ru.cyberity.log.logger.Logger.d$default(r7, r8, r9, r10, r11, r12)
                ru.cyberity.cbr.presentation.screen.CBRAppViewModel r14 = ru.cyberity.cbr.presentation.screen.CBRAppViewModel.this
                ru.cyberity.cbr.core.data.source.dynamic.c r7 = ru.cyberity.cbr.presentation.screen.CBRAppViewModel.access$getDataRepository$p(r14)
                r13.label = r6
                r11 = 3
                r8 = 0
                r9 = 0
                r10 = r13
                java.lang.Object r14 = ru.cyberity.cbr.core.data.source.dynamic.c.c(r7, r8, r9, r10, r11, r12)
                if (r14 != r0) goto L68
                return r0
            L68:
                ru.cyberity.cbr.core.data.source.dynamic.a r14 = (ru.cyberity.cbr.core.data.source.dynamic.a) r14
                java.lang.Object r14 = r14.e()
                r1 = r14
                ru.cyberity.cbr.core.data.model.g r1 = (ru.cyberity.cbr.core.data.model.g) r1
                ru.cyberity.cbr.presentation.screen.CBRAppViewModel r14 = ru.cyberity.cbr.presentation.screen.CBRAppViewModel.this
                ru.cyberity.cbr.core.data.source.dynamic.c r14 = ru.cyberity.cbr.presentation.screen.CBRAppViewModel.access$getDataRepository$p(r14)
                r13.L$0 = r1
                r13.label = r4
                java.lang.Object r14 = ru.cyberity.cbr.core.data.source.dynamic.c.d(r14, r5, r13, r6, r2)
                if (r14 != r0) goto L82
                return r0
            L82:
                ru.cyberity.cbr.core.data.source.dynamic.a r14 = (ru.cyberity.cbr.core.data.source.dynamic.a) r14
                java.lang.Object r14 = r14.e()
                ru.cyberity.cbr.core.data.model.t r14 = (ru.cyberity.cbr.core.data.model.t) r14
                java.util.List r14 = r14.d()
                ru.cyberity.cbr.core.data.model.g$c r4 = r1.getRequiredIdDocs()
                boolean r4 = r4.getVideoIdent()
                if (r4 == 0) goto Lb4
                ru.cyberity.cbr.core.data.model.g$c r4 = r1.getRequiredIdDocs()
                java.util.List r4 = r4.j()
                if (r4 == 0) goto Lb1
                ru.cyberity.cbr.core.data.model.Document r7 = r13.$document
                ru.cyberity.cbr.core.data.model.DocumentType r7 = r7.getType()
                java.lang.String r7 = r7.getValue()
                boolean r4 = r4.contains(r7)
                goto Lb2
            Lb1:
                r4 = r5
            Lb2:
                if (r4 == 0) goto Lb5
            Lb4:
                r5 = r6
            Lb5:
                if (r5 == 0) goto Lbe
                ru.cyberity.cbr.core.data.model.Document r14 = r13.$document
                java.util.List r14 = java.util.Collections.singletonList(r14)
                goto Lc2
            Lbe:
                java.util.List r14 = ru.cyberity.cbr.core.common.s.a(r14, r1)
            Lc2:
                ru.cyberity.cbr.presentation.screen.CBRAppViewModel r4 = ru.cyberity.cbr.presentation.screen.CBRAppViewModel.this
                ru.cyberity.cbr.core.data.model.Document r5 = r13.$document
                ru.cyberity.cbr.core.data.model.DocumentType r5 = r5.getType()
                boolean r5 = r5.m()
                r13.L$0 = r2
                r13.label = r3
                java.lang.Object r14 = ru.cyberity.cbr.presentation.screen.CBRAppViewModel.access$moveToNextDocument(r4, r1, r14, r5, r13)
                if (r14 != r0) goto Ld9
                return r0
            Ld9:
                kotlin.G0 r14 = kotlin.G0.f406611a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.CBRAppViewModel.C478691.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // Y41.p
        @l
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((C478691) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: CBRAppViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.CBRAppViewModel$onLoad$1", f = "CBRAppViewModel.kt", i = {}, l = {192, 201}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.presentation.screen.CBRAppViewModel$onLoad$1, reason: invalid class name and case insensitive filesystem */
    public static final class C478701 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        int label;

        /* compiled from: CBRAppViewModel.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRTrackEvents;", "event", "Lkotlin/G0;", "invoke", "(Lru/cyberity/cbr/core/data/model/CBRTrackEvents;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.presentation.screen.CBRAppViewModel$onLoad$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C125071 extends N implements Y41.l<CBRTrackEvents, G0> {
            final /* synthetic */ CBRAppViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C125071(CBRAppViewModel cBRAppViewModel) {
                super(1);
                this.this$0 = cBRAppViewModel;
            }

            @Override // Y41.l
            public /* bridge */ /* synthetic */ G0 invoke(CBRTrackEvents cBRTrackEvents) {
                invoke2(cBRTrackEvents);
                return G0.f406611a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@k CBRTrackEvents cBRTrackEvents) {
                this.this$0.fireCBREvent(new CBREvent.CBREventAnalytics(cBRTrackEvents));
            }
        }

        public C478701(Continuation<? super C478701> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return CBRAppViewModel.this.new C478701(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.label;
            if (i12 == 0) {
                C42729a0.b(obj);
                Logger.i$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(CBRAppViewModel.this), "onLoad", null, 4, null);
                ru.cyberity.cbr.core.analytics.b.f432519a.a(new C125071(CBRAppViewModel.this));
                f fVar = CBRAppViewModel.this.prepareSDKUseCase;
                f.a aVar = new f.a();
                this.label = 1;
                obj = fVar.a(aVar, (Continuation<? super ru.cyberity.cbr.core.domain.model.a<? extends Exception, f.b>>) this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    CBRAppViewModel.this.observeData();
                    return G0.f406611a;
                }
                C42729a0.b(obj);
            }
            ru.cyberity.cbr.core.domain.model.a aVar2 = (ru.cyberity.cbr.core.domain.model.a) obj;
            if (aVar2.a()) {
                CBRAppViewModel.this.onSdkPreparedFailure((Throwable) ((a.C12482a) aVar2).d());
                return G0.f406611a;
            }
            f.b bVar = (f.b) ((a.b) aVar2).d();
            CBRAppViewModel.this.fireCBREvent(new CBREvent.CBREventApplicantLoaded(CBRAppViewModel.this.settingsRepository.a()));
            CBRAppViewModel cBRAppViewModel = CBRAppViewModel.this;
            boolean zIsSDKPrepared = cBRAppViewModel.isSDKPrepared();
            g gVarD = bVar.getApplicant();
            ru.cyberity.cbr.core.data.model.e eVarE = bVar.getConfig();
            this.label = 2;
            if (cBRAppViewModel.onSdkPreparedSuccess(zIsSDKPrepared, gVarD, eVarE, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            CBRAppViewModel.this.observeData();
            return G0.f406611a;
        }

        @Override // Y41.p
        @l
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((C478701) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: CBRAppViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.CBRAppViewModel", f = "CBRAppViewModel.kt", i = {0}, l = {145}, m = "onPrepare", n = {"this"}, s = {"L$0"})
    /* renamed from: ru.cyberity.cbr.presentation.screen.CBRAppViewModel$onPrepare$1, reason: invalid class name and case insensitive filesystem */
    public static final class C478711 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C478711(Continuation<? super C478711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.result = obj;
            this.label |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRAppViewModel.this.onPrepare(this);
        }
    }

    /* compiled from: CBRAppViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$ViewState;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.CBRAppViewModel$onPrepare$2", f = "CBRAppViewModel.kt", i = {}, l = {148, 149}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.presentation.screen.CBRAppViewModel$onPrepare$2, reason: invalid class name and case insensitive filesystem */
    public static final class C478722 extends SuspendLambda implements p<ViewState, Continuation<? super ViewState>, Object> {
        int I$0;
        int I$1;
        /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public C478722(Continuation<? super C478722> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C478722 c478722 = CBRAppViewModel.this.new C478722(continuation);
            c478722.L$0 = obj;
            return c478722;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r13.label
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L34
                if (r1 == r4) goto L28
                if (r1 != r2) goto L20
                int r0 = r13.I$1
                int r1 = r13.I$0
                java.lang.Object r2 = r13.L$1
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                java.lang.Object r5 = r13.L$0
                ru.cyberity.cbr.presentation.screen.CBRAppViewModel$ViewState r5 = (ru.cyberity.cbr.presentation.screen.CBRAppViewModel.ViewState) r5
                kotlin.C42729a0.b(r14)
                r9 = r2
                goto L6e
            L20:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L28:
                int r1 = r13.I$1
                int r5 = r13.I$0
                java.lang.Object r6 = r13.L$0
                ru.cyberity.cbr.presentation.screen.CBRAppViewModel$ViewState r6 = (ru.cyberity.cbr.presentation.screen.CBRAppViewModel.ViewState) r6
                kotlin.C42729a0.b(r14)
                goto L52
            L34:
                kotlin.C42729a0.b(r14)
                java.lang.Object r14 = r13.L$0
                ru.cyberity.cbr.presentation.screen.CBRAppViewModel$ViewState r14 = (ru.cyberity.cbr.presentation.screen.CBRAppViewModel.ViewState) r14
                ru.cyberity.cbr.presentation.screen.CBRAppViewModel r1 = ru.cyberity.cbr.presentation.screen.CBRAppViewModel.this
                r13.L$0 = r14
                r13.I$0 = r3
                r13.I$1 = r3
                r13.label = r4
                java.lang.String r5 = "sns_general_progress_text"
                java.lang.Object r1 = ru.cyberity.cbr.presentation.screen.CBRAppViewModel.access$getString(r1, r5, r13)
                if (r1 != r0) goto L4e
                return r0
            L4e:
                r6 = r14
                r14 = r1
                r1 = r3
                r5 = r1
            L52:
                java.lang.CharSequence r14 = (java.lang.CharSequence) r14
                ru.cyberity.cbr.presentation.screen.CBRAppViewModel r7 = ru.cyberity.cbr.presentation.screen.CBRAppViewModel.this
                r13.L$0 = r6
                r13.L$1 = r14
                r13.I$0 = r5
                r13.I$1 = r1
                r13.label = r2
                java.lang.String r2 = "sns_general_loadingTakesTooLong"
                java.lang.Object r2 = ru.cyberity.cbr.presentation.screen.CBRAppViewModel.access$getString(r7, r2, r13)
                if (r2 != r0) goto L69
                return r0
            L69:
                r9 = r14
                r0 = r1
                r14 = r2
                r1 = r5
                r5 = r6
            L6e:
                if (r1 == 0) goto L72
                r6 = r4
                goto L73
            L72:
                r6 = r3
            L73:
                if (r0 == 0) goto L77
                r8 = r4
                goto L78
            L77:
                r8 = r3
            L78:
                r10 = r14
                java.lang.CharSequence r10 = (java.lang.CharSequence) r10
                r11 = 7
                r12 = 0
                r7 = 0
                ru.cyberity.cbr.presentation.screen.CBRAppViewModel$ViewState r14 = ru.cyberity.cbr.presentation.screen.CBRAppViewModel.ViewState.copy$default(r5, r6, r7, r8, r9, r10, r11, r12)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.CBRAppViewModel.C478722.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // Y41.p
        @l
        public final Object invoke(@k ViewState viewState, @l Continuation<? super ViewState> continuation) {
            return ((C478722) create(viewState, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: CBRAppViewModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u008a@¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlin/Q;", "", "", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelInternalState;", VoiceInfo.STATE, "progress", "", "internalProgress", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelInternalState;ZI)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.CBRAppViewModel$onProgress$1", f = "CBRAppViewModel.kt", i = {}, l = {WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.presentation.screen.CBRAppViewModel$onProgress$1, reason: invalid class name and case insensitive filesystem */
    public static final class C478731 extends SuspendLambda implements s<InterfaceC43172j<? super Q<? extends Boolean, ? extends Long>>, CBRViewModel.CBRViewModelInternalState, Boolean, Integer, Continuation<? super G0>, Object> {
        /* synthetic */ int I$0;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ boolean Z$0;
        int label;

        public C478731(Continuation<? super C478731> continuation) {
            super(5, continuation);
        }

        @Override // Y41.s
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC43172j<? super Q<? extends Boolean, ? extends Long>> interfaceC43172j, CBRViewModel.CBRViewModelInternalState cBRViewModelInternalState, Boolean bool, Integer num, Continuation<? super G0> continuation) {
            return invoke((InterfaceC43172j<? super Q<Boolean, Long>>) interfaceC43172j, cBRViewModelInternalState, bool.booleanValue(), num.intValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.label;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.L$0;
                CBRViewModel.CBRViewModelInternalState cBRViewModelInternalState = (CBRViewModel.CBRViewModelInternalState) this.L$1;
                boolean z12 = this.Z$0;
                int i13 = this.I$0;
                Logger.v$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(CBRAppViewModel.this), "onProgress: progress=" + z12 + ", internalProgress=" + i13 + ", internalState=" + CBRAppViewModel.this.getViewModelInternalState().getValue(), null, 4, null);
                Q q12 = new Q(Boxing.boxBoolean(!cBRViewModelInternalState.getAreStringsReady() || !cBRViewModelInternalState.getIsViewModelPrepared() || z12 || i13 > 0), Boxing.boxLong((z12 || i13 > 0 || !cBRViewModelInternalState.getAreStringsReady() || !cBRViewModelInternalState.getIsViewModelPrepared()) ? 0L : 300L));
                this.L$0 = null;
                this.label = 1;
                if (interfaceC43172j.emit(q12, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }

        @l
        public final Object invoke(@k InterfaceC43172j<? super Q<Boolean, Long>> interfaceC43172j, @k CBRViewModel.CBRViewModelInternalState cBRViewModelInternalState, boolean z12, int i12, @l Continuation<? super G0> continuation) {
            C478731 c478731 = CBRAppViewModel.this.new C478731(continuation);
            c478731.L$0 = interfaceC43172j;
            c478731.L$1 = cBRViewModelInternalState;
            c478731.Z$0 = z12;
            c478731.I$0 = i12;
            return c478731.invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: CBRAppViewModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Q;", "", "", "it", "invoke", "(Lkotlin/Q;)Ljava/lang/Long;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.presentation.screen.CBRAppViewModel$onProgress$2, reason: invalid class name and case insensitive filesystem */
    public static final class C478742 extends N implements Y41.l<Q<? extends Boolean, ? extends Long>, Long> {
        public static final C478742 INSTANCE = new C478742();

        public C478742() {
            super(1);
        }

        @k
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Long invoke2(@k Q<Boolean, Long> q12) {
            return q12.f406620c;
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ Long invoke(Q<? extends Boolean, ? extends Long> q12) {
            return invoke2((Q<Boolean, Long>) q12);
        }
    }

    /* compiled from: CBRAppViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$ViewState;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.CBRAppViewModel$onSdkPreparedSuccess$2", f = "CBRAppViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.presentation.screen.CBRAppViewModel$onSdkPreparedSuccess$2, reason: invalid class name and case insensitive filesystem */
    public static final class C478752 extends SuspendLambda implements p<ViewState, Continuation<? super ViewState>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C478752(Continuation<? super C478752> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C478752 c478752 = new C478752(continuation);
            c478752.L$0 = obj;
            return c478752;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return ViewState.copy$default((ViewState) this.L$0, true, null, false, null, null, 30, null);
        }

        @Override // Y41.p
        @l
        public final Object invoke(@k ViewState viewState, @l Continuation<? super ViewState> continuation) {
            return ((C478752) create(viewState, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: CBRAppViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.CBRAppViewModel", f = "CBRAppViewModel.kt", i = {0, 0}, l = {664, 675}, m = "onStepComplete", n = {"this", "isCancelled"}, s = {"L$0", "Z$0"})
    /* renamed from: ru.cyberity.cbr.presentation.screen.CBRAppViewModel$onStepComplete$1, reason: invalid class name and case insensitive filesystem */
    public static final class C478761 extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C478761(Continuation<? super C478761> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.result = obj;
            this.label |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRAppViewModel.this.onStepComplete(false, this);
        }
    }

    /* compiled from: CBRAppViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.CBRAppViewModel", f = "CBRAppViewModel.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3}, l = {716, 717, 739, 757}, m = "resolveApplicantStatus", n = {"this", "isCancelled", "this", Navigation.CONFIG, "isCancelled", "this", Navigation.CONFIG, "applicant", "documents", "isCancelled", "this", Navigation.CONFIG, "applicant", "isCancelled", "hasDocumentsToSubmit"}, s = {"L$0", "Z$0", "L$0", "L$1", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "Z$0", "I$0"})
    /* renamed from: ru.cyberity.cbr.presentation.screen.CBRAppViewModel$resolveApplicantStatus$1, reason: invalid class name and case insensitive filesystem */
    public static final class C478771 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C478771(Continuation<? super C478771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.result = obj;
            this.label |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRAppViewModel.this.resolveApplicantStatus(false, this);
        }
    }

    /* compiled from: CBRAppViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.CBRAppViewModel$resolveApplicantStatusWithLevelChangeWaiting$1", f = "CBRAppViewModel.kt", i = {}, l = {790}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.presentation.screen.CBRAppViewModel$resolveApplicantStatusWithLevelChangeWaiting$1, reason: invalid class name and case insensitive filesystem */
    public static final class C478781 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        final /* synthetic */ g $applicant;
        final /* synthetic */ ru.cyberity.cbr.core.data.model.e $config;
        final /* synthetic */ boolean $isCancelled;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C478781(g gVar, ru.cyberity.cbr.core.data.model.e eVar, boolean z12, Continuation<? super C478781> continuation) {
            super(2, continuation);
            this.$applicant = gVar;
            this.$config = eVar;
            this.$isCancelled = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return CBRAppViewModel.this.new C478781(this.$applicant, this.$config, this.$isCancelled, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.label;
            if (i12 == 0) {
                C42729a0.b(obj);
                long j12 = CBRAppViewModel.this.levelChangeTimeout;
                this.label = 1;
                if (C43131e0.b(j12, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            Logger.i$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(CBRAppViewModel.this), "level change did not happen", null, 4, null);
            CBRAppViewModel.this.cancelWaitForLevelChange();
            CBRAppViewModel.this.resolveApplicantStatus(this.$applicant, this.$config, false, this.$isCancelled);
            return G0.f406611a;
        }

        @Override // Y41.p
        @l
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((C478781) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: CBRAppViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.CBRAppViewModel$resolveInstructions$1", f = "CBRAppViewModel.kt", i = {1, 2, 2, 2, 2, 2}, l = {488, 493, 515}, m = "invokeSuspend", n = {"applicant", Navigation.CONFIG, "countryCode", "stepInfo", "showInstructions", "alreadyShown"}, s = {"L$0", "L$0", "L$1", "L$2", "I$0", "Z$0"})
    /* renamed from: ru.cyberity.cbr.presentation.screen.CBRAppViewModel$resolveInstructions$1, reason: invalid class name and case insensitive filesystem */
    public static final class C478791 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        final /* synthetic */ ru.cyberity.cbr.core.domain.model.c $introParams;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C478791(ru.cyberity.cbr.core.domain.model.c cVar, Continuation<? super C478791> continuation) {
            super(2, continuation);
            this.$introParams = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return CBRAppViewModel.this.new C478791(this.$introParams, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x018d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 423
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.CBRAppViewModel.C478791.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // Y41.p
        @l
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((C478791) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: CBRAppViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.CBRAppViewModel$scheduleSlowConnectionTimer$1", f = "CBRAppViewModel.kt", i = {0}, l = {157}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    /* renamed from: ru.cyberity.cbr.presentation.screen.CBRAppViewModel$scheduleSlowConnectionTimer$1, reason: invalid class name and case insensitive filesystem */
    public static final class C478801 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: CBRAppViewModel.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$ViewState;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.CBRAppViewModel$scheduleSlowConnectionTimer$1$1", f = "CBRAppViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: ru.cyberity.cbr.presentation.screen.CBRAppViewModel$scheduleSlowConnectionTimer$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C125081 extends SuspendLambda implements p<ViewState, Continuation<? super ViewState>, Object> {
            /* synthetic */ Object L$0;
            int label;

            public C125081(Continuation<? super C125081> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                C125081 c125081 = new C125081(continuation);
                c125081.L$0 = obj;
                return c125081;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return ViewState.copy$default((ViewState) this.L$0, false, null, true, null, null, 27, null);
            }

            @Override // Y41.p
            @l
            public final Object invoke(@k ViewState viewState, @l Continuation<? super ViewState> continuation) {
                return ((C125081) create(viewState, continuation)).invokeSuspend(G0.f406611a);
            }
        }

        public C478801(Continuation<? super C478801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C478801 c478801 = CBRAppViewModel.this.new C478801(continuation);
            c478801.L$0 = obj;
            return c478801;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            T t12;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.label;
            if (i12 == 0) {
                C42729a0.b(obj);
                T t13 = (T) this.L$0;
                this.L$0 = t13;
                this.label = 1;
                if (C43131e0.b(7000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                t12 = t13;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t12 = (T) this.L$0;
                C42729a0.b(obj);
            }
            if (U.e(t12)) {
                CBRViewModel.updateState$default(CBRAppViewModel.this, false, new C125081(null), 1, null);
            }
            return G0.f406611a;
        }

        @Override // Y41.p
        @l
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((C478801) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    static {
        Y y12 = new Y(CBRAppViewModel.class, "currentLevelName", "getCurrentLevelName()Ljava/lang/String;", 0);
        n0 n0Var = m0.f406844a;
        $$delegatedProperties = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(CBRAppViewModel.class, "isSDKPrepared", "isSDKPrepared()Z", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CBRAppViewModel.class, "verificationStarted", "getVerificationStarted()Z", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CBRAppViewModel.class, "pendingInstructionsData", "getPendingInstructionsData()Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$PendingInstructionsData;", 0, n0Var)};
        INSTANCE = new Companion(null);
    }

    public CBRAppViewModel(@k C23060r0 c23060r0, @k f fVar, @k e eVar, @k ru.cyberity.cbr.core.data.source.common.a aVar, @k ru.cyberity.cbr.core.data.source.settings.b bVar, @k c cVar) {
        super(aVar, cVar);
        this.savedStateHandle = c23060r0;
        this.prepareSDKUseCase = fVar;
        this.getApplicantDataAndUpdateStatusUseCase = eVar;
        this.commonRepository = aVar;
        this.settingsRepository = bVar;
        this.dataRepository = cVar;
        this.levelChangeTimeout = 5000L;
        this.currentLevelName = new ru.cyberity.cbr.core.presentation.screen.base.a(c23060r0, "KEY_CURRENT_LEVEL", null);
        Boolean bool = Boolean.FALSE;
        this.isSDKPrepared = new ru.cyberity.cbr.core.presentation.screen.base.a(c23060r0, "KEY_SDK_PREPARED", bool);
        this.verificationStarted = new ru.cyberity.cbr.core.presentation.screen.base.a(c23060r0, "VERIFICATION_STARTED", bool);
        Z1<Boolean> z1A = p2.a(bool);
        this.progressState = z1A;
        Z1<Integer> z1A2 = p2.a(0);
        this.internalProgressState = z1A2;
        this.pendingInstructionsData = new ru.cyberity.cbr.core.presentation.screen.base.a(c23060r0, "KEY_AFTER_INSTRUCTIONS_DATA", null);
        this.shownInstructions = new LinkedHashSet();
        final kotlinx.coroutines.flow.internal.s sVarO = C43175k.o(C43175k.l(getViewModelInternalState(), z1A, z1A2, new C478731(null)), C478742.INSTANCE);
        InterfaceC43160i<Boolean> interfaceC43160iR = C43175k.r(new InterfaceC43160i<Boolean>() { // from class: ru.cyberity.cbr.presentation.screen.CBRAppViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.presentation.screen.CBRAppViewModel$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC43172j {
                final /* synthetic */ InterfaceC43172j $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.CBRAppViewModel$special$$inlined$map$1$2", f = "CBRAppViewModel.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
                /* renamed from: ru.cyberity.cbr.presentation.screen.CBRAppViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @l
                    public final Object invokeSuspend(@k Object obj) {
                        this.result = obj;
                        this.label |= BeduinInputModel.MIN_TEXT_VERSION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC43172j interfaceC43172j) {
                    this.$this_unsafeFlow = interfaceC43172j;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                @Y61.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof ru.cyberity.cbr.presentation.screen.CBRAppViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        ru.cyberity.cbr.presentation.screen.CBRAppViewModel$special$$inlined$map$1$2$1 r0 = (ru.cyberity.cbr.presentation.screen.CBRAppViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        ru.cyberity.cbr.presentation.screen.CBRAppViewModel$special$$inlined$map$1$2$1 r0 = new ru.cyberity.cbr.presentation.screen.CBRAppViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C42729a0.b(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C42729a0.b(r6)
                        kotlinx.coroutines.flow.j r6 = r4.$this_unsafeFlow
                        kotlin.Q r5 = (kotlin.Q) r5
                        A r5 = r5.f406619b
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.CBRAppViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @l
            public Object collect(@k InterfaceC43172j<? super Boolean> interfaceC43172j, @k Continuation continuation) {
                Object objCollect = sVarO.collect(new AnonymousClass2(interfaceC43172j), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        });
        this.onProgress = interfaceC43160iR;
        j0.a(interfaceC43160iR, androidx.view.N0.a(this), new AnonymousClass1(null));
        onLoad();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelSlowConnectionJob() {
        N0 n02 = this.slowConnectionJob;
        if (n02 != null) {
            n02.c(null);
        }
        this.slowConnectionJob = null;
        CBRViewModel.updateState$default(this, false, new C478621(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelWaitForLevelChange() {
        onLoadingInternalData(false);
        if (this.waitForLevelChangeJob != null) {
            Logger.i$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "cancelWaitForLevelChange", null, 4, null);
        }
        N0 n02 = this.waitForLevelChangeJob;
        if (n02 != null) {
            n02.c(null);
        }
        this.waitForLevelChangeJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireCBREvent(CBREvent event) {
        try {
            CBREventHandler eventHandler = CBRMobileSDK.INSTANCE.getEventHandler();
            if (eventHandler != null) {
                eventHandler.onEvent(event);
            }
        } catch (Throwable th2) {
            ru.cyberity.log.a.f436064a.e(ru.cyberity.log.c.a(this), "Can't fire cbr event " + event, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireOnStartStep(Document document) {
        setDocumentStarted(document);
        fireCBREvent(new CBREvent.CBREventStepInitiated(this.settingsRepository.a(), document.getType().getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireOnStepCompleted(boolean isCancelled) {
        Document document = this.documentStarted;
        if (document != null) {
            setDocumentStarted(null);
            fireCBREvent(new CBREvent.CBREventStepCompleted(this.settingsRepository.a(), document.getType().getValue(), isCancelled));
        }
    }

    private final String getCurrentLevelName() {
        return (String) this.currentLevelName.a(this, $$delegatedProperties[0]);
    }

    private final PendingInstructionsData getPendingInstructionsData() {
        return (PendingInstructionsData) this.pendingInstructionsData.a(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getVerificationStarted() {
        return ((Boolean) this.verificationStarted.a(this, $$delegatedProperties[2])).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleAction(ru.cyberity.cbr.core.data.model.e r12, kotlin.coroutines.Continuation<? super kotlin.G0> r13) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.CBRAppViewModel.handleAction(ru.cyberity.cbr.core.data.model.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleDataUpdated(c.a aData) {
        ru.cyberity.cbr.core.data.model.remote.response.c cVar;
        ru.cyberity.cbr.core.data.model.remote.response.c cVar2;
        if (aData == null) {
            return;
        }
        if (getCurrentLevelName() == null) {
            t tVarD = aData.j().d();
            setCurrentLevelName((tVarD == null || (cVar2 = tVarD.getCom.avito.android.remote.model.AvatarStatus.REVIEW java.lang.String()) == null) ? null : cVar2.b());
        }
        t tVarD2 = aData.j().d();
        String strB = (tVarD2 == null || (cVar = tVarD2.getCom.avito.android.remote.model.AvatarStatus.REVIEW java.lang.String()) == null) ? null : cVar.b();
        boolean z12 = (L.f(getCurrentLevelName(), strB) || strB == null) ? false : true;
        setCurrentLevelName(strB);
        ru.cyberity.log.a aVar = ru.cyberity.log.a.f436064a;
        Logger.v$default(aVar, ru.cyberity.log.c.a(this), "Data updated: levelChanged=" + z12 + ", level=" + getCurrentLevelName() + ", isWaitingForLevelChange=" + isWaitingForLevelChange(), null, 4, null);
        if (isWaitingForLevelChange() && z12) {
            cancelWaitForLevelChange();
            g gVarD = aData.g().d();
            if (gVarD == null || !gVarD.A()) {
                Logger.i$default(aVar, ru.cyberity.log.c.a(this), "Data updated: moving to next document", null, 4, null);
                moveToNextDocument$default(this, false, 1, null);
            } else {
                Logger.i$default(aVar, ru.cyberity.log.c.a(this), "Data updated: Applicant has VI only, moving to status screen", null, 4, null);
                onMoveToApplicantStatusScreen$default(this, false, false, 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleFlowType(ru.cyberity.cbr.core.data.model.g r8, ru.cyberity.cbr.core.data.model.e r9, kotlin.coroutines.Continuation<? super kotlin.G0> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof ru.cyberity.cbr.presentation.screen.CBRAppViewModel.C478641
            if (r0 == 0) goto L13
            r0 = r10
            ru.cyberity.cbr.presentation.screen.CBRAppViewModel$handleFlowType$1 r0 = (ru.cyberity.cbr.presentation.screen.CBRAppViewModel.C478641) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ru.cyberity.cbr.presentation.screen.CBRAppViewModel$handleFlowType$1 r0 = new ru.cyberity.cbr.presentation.screen.CBRAppViewModel$handleFlowType$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4a
            if (r2 == r6) goto L46
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            kotlin.C42729a0.b(r10)
            goto Lb3
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.lang.Object r8 = r0.L$1
            r9 = r8
            ru.cyberity.cbr.core.data.model.e r9 = (ru.cyberity.cbr.core.data.model.e) r9
            java.lang.Object r8 = r0.L$0
            ru.cyberity.cbr.presentation.screen.CBRAppViewModel r8 = (ru.cyberity.cbr.presentation.screen.CBRAppViewModel) r8
            kotlin.C42729a0.b(r10)
            goto L87
        L46:
            kotlin.C42729a0.b(r10)
            goto L64
        L4a:
            kotlin.C42729a0.b(r10)
            ru.cyberity.cbr.core.data.model.FlowType r10 = r9.getFlowType()
            int[] r2 = ru.cyberity.cbr.presentation.screen.CBRAppViewModel.WhenMappings.$EnumSwitchMapping$0
            int r10 = r10.ordinal()
            r10 = r2[r10]
            if (r10 != r6) goto L67
            r0.label = r6
            java.lang.Object r8 = r7.resolveApplicantStatus(r3, r0)
            if (r8 != r1) goto L64
            return r1
        L64:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        L67:
            ru.cyberity.cbr.core.data.model.b r8 = r8.getAgreement()
            if (r8 != 0) goto L9c
            ru.cyberity.ff.a r8 = ru.cyberity.ff.a.f435638a
            ru.cyberity.ff.core.a r8 = r8.r()
            boolean r8 = r8.g()
            if (r8 != 0) goto L9c
            r0.L$0 = r7
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r10 = r7.getStrings(r0)
            if (r10 != r1) goto L86
            return r1
        L86:
            r8 = r7
        L87:
            ru.cyberity.cbr.core.data.source.dynamic.c$c r10 = (ru.cyberity.cbr.core.data.source.dynamic.c.C12476c) r10
            java.util.List r10 = r10.c()
            if (r10 == 0) goto L9d
            boolean r10 = r10.isEmpty()
            r10 = r10 ^ r6
            if (r10 != r6) goto L9d
            ru.cyberity.cbr.presentation.screen.CBRAppViewModel$Event$Navigate$AgreementSelector r9 = ru.cyberity.cbr.presentation.screen.CBRAppViewModel.Event.Navigate.AgreementSelector.INSTANCE
            r8.fireEvent(r9)
            goto Lbd
        L9c:
            r8 = r7
        L9d:
            ru.cyberity.cbr.core.data.model.FlowType r10 = r9.getFlowType()
            ru.cyberity.cbr.core.data.model.FlowType r2 = ru.cyberity.cbr.core.data.model.FlowType.Actions
            r5 = 0
            if (r10 != r2) goto Lb6
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r4
            java.lang.Object r8 = r8.handleAction(r9, r0)
            if (r8 != r1) goto Lb3
            return r1
        Lb3:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        Lb6:
            ru.cyberity.cbr.core.data.model.FlowType r9 = ru.cyberity.cbr.core.data.model.FlowType.Module
            if (r10 != r9) goto Lbd
            moveToNextDocument$default(r8, r3, r6, r5)
        Lbd:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.CBRAppViewModel.handleFlowType(ru.cyberity.cbr.core.data.model.g, ru.cyberity.cbr.core.data.model.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final boolean hasRejectedVIDocs(g applicant, List<Document> docs) {
        List<String> listJ;
        if (docs == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : docs) {
            Document document = (Document) obj;
            if (applicant.getRequiredIdDocs().getVideoIdent() && ((listJ = applicant.getRequiredIdDocs().j()) == null || !listJ.contains(document.getType().getValue()))) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Document) it.next()).isRejected()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSDKPrepared() {
        return ((Boolean) this.isSDKPrepared.a(this, $$delegatedProperties[1])).booleanValue();
    }

    private final boolean isWaitingForLevelChange() {
        return this.waitForLevelChangeJob != null;
    }

    private final void launchWithProgress(p<? super T, ? super Continuation<? super G0>, ? extends Object> block) {
        onLoadingInternalData(true);
        C43259k.d(androidx.view.N0.a(this), null, null, new C478651(block, this, null), 3);
    }

    public static /* synthetic */ void moveToNextDocument$default(CBRAppViewModel cBRAppViewModel, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z12 = false;
        }
        cBRAppViewModel.moveToNextDocument(z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object needSelectAgreement(ru.cyberity.cbr.core.data.model.g r6, kotlin.coroutines.Continuation<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ru.cyberity.cbr.presentation.screen.CBRAppViewModel.C478671
            if (r0 == 0) goto L13
            r0 = r7
            ru.cyberity.cbr.presentation.screen.CBRAppViewModel$needSelectAgreement$1 r0 = (ru.cyberity.cbr.presentation.screen.CBRAppViewModel.C478671) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ru.cyberity.cbr.presentation.screen.CBRAppViewModel$needSelectAgreement$1 r0 = new ru.cyberity.cbr.presentation.screen.CBRAppViewModel$needSelectAgreement$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            kotlin.C42729a0.b(r7)
            goto L44
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.C42729a0.b(r7)
            ru.cyberity.cbr.core.data.model.b r6 = r6.getAgreement()
            if (r6 != 0) goto L61
            r0.label = r4
            java.lang.Object r7 = r5.getStrings(r0)
            if (r7 != r1) goto L44
            return r1
        L44:
            ru.cyberity.cbr.core.data.source.dynamic.c$c r7 = (ru.cyberity.cbr.core.data.source.dynamic.c.C12476c) r7
            java.util.List r6 = r7.c()
            if (r6 == 0) goto L51
            int r6 = r6.size()
            goto L52
        L51:
            r6 = r3
        L52:
            if (r6 <= r4) goto L61
            ru.cyberity.ff.a r6 = ru.cyberity.ff.a.f435638a
            ru.cyberity.ff.core.a r6 = r6.r()
            boolean r6 = r6.g()
            if (r6 != 0) goto L61
            r3 = r4
        L61:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.CBRAppViewModel.needSelectAgreement(ru.cyberity.cbr.core.data.model.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeData() {
        j0.a(new C43152f0(this.dataRepository.a(), new C478681(null)), androidx.view.N0.a(this), null, 2, null);
        j0.a(this.dataRepository.b(), androidx.view.N0.a(this), new AnonymousClass2(null));
    }

    public static /* synthetic */ void onCancel$default(CBRAppViewModel cBRAppViewModel, CBRCompletionResult cBRCompletionResult, boolean z12, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z12 = false;
        }
        cBRAppViewModel.onCancel(cBRCompletionResult, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLoadingInternalData(boolean isLoading) {
        Z1<Integer> z12 = this.internalProgressState;
        z12.setValue(Integer.valueOf(z12.getValue().intValue() + (isLoading ? 1 : -1)));
    }

    public static /* synthetic */ void onMoveToApplicantStatusScreen$default(CBRAppViewModel cBRAppViewModel, boolean z12, boolean z13, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z13 = true;
        }
        cBRAppViewModel.onMoveToApplicantStatusScreen(z12, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSdkPreparedFailure(Throwable exception) {
        if (exception instanceof CancellationException) {
            return;
        }
        throwError(new p.a(exception, null, 2, null), "TYPE_UNKNOWN");
        onProgress(false);
        ru.cyberity.log.a.f436064a.e(ru.cyberity.log.c.a(this), "An error while preparing the sdk...", exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onSdkPreparedSuccess(boolean z12, g gVar, ru.cyberity.cbr.core.data.model.e eVar, Continuation<? super G0> continuation) {
        Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "SDK is prepared. Applicant - " + eVar.getApplicantId(), null, 4, null);
        CBRViewModel.updateState$default(this, false, new C478752(null), 1, null);
        setSDKPrepared(true);
        fireCBREvent(new CBREvent.VerificationStarted(eVar.getApplicantId()));
        if (z12) {
            setDefaultSDKState();
            return G0.f406611a;
        }
        Object objHandleFlowType = handleFlowType(gVar, eVar, continuation);
        return objHandleFlowType == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objHandleFlowType : G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onStepComplete(boolean r14, kotlin.coroutines.Continuation<? super kotlin.G0> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof ru.cyberity.cbr.presentation.screen.CBRAppViewModel.C478761
            if (r0 == 0) goto L13
            r0 = r15
            ru.cyberity.cbr.presentation.screen.CBRAppViewModel$onStepComplete$1 r0 = (ru.cyberity.cbr.presentation.screen.CBRAppViewModel.C478761) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ru.cyberity.cbr.presentation.screen.CBRAppViewModel$onStepComplete$1 r0 = new ru.cyberity.cbr.presentation.screen.CBRAppViewModel$onStepComplete$1
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L41
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            kotlin.C42729a0.b(r15)
            goto La6
        L2f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L37:
            boolean r14 = r0.Z$0
            java.lang.Object r2 = r0.L$0
            ru.cyberity.cbr.presentation.screen.CBRAppViewModel r2 = (ru.cyberity.cbr.presentation.screen.CBRAppViewModel) r2
            kotlin.C42729a0.b(r15)
            goto L66
        L41:
            kotlin.C42729a0.b(r15)
            ru.cyberity.log.a r7 = ru.cyberity.log.a.f436064a
            java.lang.String r8 = ru.cyberity.log.c.a(r13)
            java.lang.String r15 = "onStepComplete, isCancelled="
            java.lang.String r9 = com.avito.android.bxcontent.mvi.entity.f.l(r15, r14)
            r11 = 4
            r12 = 0
            r10 = 0
            ru.cyberity.log.logger.Logger.v$default(r7, r8, r9, r10, r11, r12)
            ru.cyberity.cbr.core.data.source.dynamic.c r15 = r13.dataRepository
            r0.L$0 = r13
            r0.Z$0 = r14
            r0.label = r5
            java.lang.Object r15 = ru.cyberity.cbr.core.data.source.dynamic.c.a(r15, r3, r0, r5, r6)
            if (r15 != r1) goto L65
            return r1
        L65:
            r2 = r13
        L66:
            ru.cyberity.cbr.core.data.source.dynamic.a r15 = (ru.cyberity.cbr.core.data.source.dynamic.a) r15
            java.lang.Throwable r7 = r15.a()
            if (r7 == 0) goto L74
            r2.onSdkPreparedFailure(r7)
            kotlin.G0 r14 = kotlin.G0.f406611a
            return r14
        L74:
            java.lang.Object r15 = r15.d()
            ru.cyberity.cbr.core.data.model.e r15 = (ru.cyberity.cbr.core.data.model.e) r15
            if (r15 == 0) goto L81
            ru.cyberity.cbr.core.data.model.FlowType r15 = r15.getFlowType()
            goto L82
        L81:
            r15 = r6
        L82:
            if (r15 != 0) goto L86
            r15 = -1
            goto L8e
        L86:
            int[] r7 = ru.cyberity.cbr.presentation.screen.CBRAppViewModel.WhenMappings.$EnumSwitchMapping$0
            int r15 = r15.ordinal()
            r15 = r7[r15]
        L8e:
            if (r15 != r4) goto L9b
            ru.cyberity.cbr.core.data.model.CBRCompletionResult$SuccessTermination r14 = new ru.cyberity.cbr.core.data.model.CBRCompletionResult$SuccessTermination
            r14.<init>(r6, r5, r6)
            onCancel$default(r2, r14, r3, r4, r6)
            kotlin.G0 r14 = kotlin.G0.f406611a
            return r14
        L9b:
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r14 = r2.resolveApplicantStatus(r14, r0)
            if (r14 != r1) goto La6
            return r1
        La6:
            kotlin.G0 r14 = kotlin.G0.f406611a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.CBRAppViewModel.onStepComplete(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String prepareInstructionsKey(ru.cyberity.cbr.core.domain.model.c introParams) {
        return introParams.getStep() + '|' + introParams.getScene() + '|' + introParams.getIdDocType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolveApplicantStatus(boolean r21, kotlin.coroutines.Continuation<? super kotlin.G0> r22) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.CBRAppViewModel.resolveApplicantStatus(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void resolveApplicantStatusWithLevelChangeWaiting(g applicant, ru.cyberity.cbr.core.data.model.e config, boolean isCancelled) {
        onLoadingInternalData(true);
        Logger.i$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "waiting for possible level change ...", null, 4, null);
        fireEvent(Event.WaitingForLevelChange.INSTANCE);
        this.waitForLevelChangeJob = C43259k.d(androidx.view.N0.a(this), null, null, new C478781(applicant, config, isCancelled, null), 3);
    }

    private final boolean resolveApplicantStatusWithVideoIdent(g applicant, List<Document> documents, boolean isCancelled) {
        List<Document> listFilterVideoIdentUnSubmittedAndRejectedDocuments = CBRAppViewModelUtilsKt.filterVideoIdentUnSubmittedAndRejectedDocuments(documents, applicant);
        if (listFilterVideoIdentUnSubmittedAndRejectedDocuments != null) {
            Logger.v$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "resolveApplicantStatusWithVideoIdent: applicantStatus=" + applicant.getCom.avito.android.remote.model.AvatarStatus.REVIEW java.lang.String().getStatus() + ", unsubmitted docs=" + listFilterVideoIdentUnSubmittedAndRejectedDocuments.size(), null, 4, null);
            if (applicant.getCom.avito.android.remote.model.AvatarStatus.REVIEW java.lang.String().getStatus() == ReviewStatusType.Pending || applicant.getCom.avito.android.remote.model.AvatarStatus.REVIEW java.lang.String().getStatus() == ReviewStatusType.Queued) {
                if (isCancelled && !applicant.A()) {
                    onCancel$default(this, new CBRCompletionResult.SuccessTermination(null, 1, null), false, 2, null);
                    return true;
                }
                if (applicant.A() || hasRejectedVIDocs(applicant, documents)) {
                    fireEvent(Event.Navigate.ApplicantStatus.INSTANCE);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleSlowConnectionTimer() {
        cancelSlowConnectionJob();
        this.slowConnectionJob = C43259k.d(androidx.view.N0.a(this), null, null, new C478801(null), 3);
    }

    private final void setCurrentLevelName(String str) {
        this.currentLevelName.a(this, $$delegatedProperties[0], str);
    }

    private final void setDefaultSDKState() {
        C43259k.d(androidx.view.N0.a(this), null, null, new CBRAppViewModel$setDefaultSDKState$$inlined$launchOnViewModelScope$1(this, "TYPE_UNKNOWN", null, this), 3);
    }

    private final void setDocumentStarted(Document document) {
        this.documentStarted = document;
        setVerificationStarted(true);
    }

    private final void setPendingInstructionsData(PendingInstructionsData pendingInstructionsData) {
        this.pendingInstructionsData.a(this, $$delegatedProperties[3], pendingInstructionsData);
    }

    private final void setSDKPrepared(boolean z12) {
        this.isSDKPrepared.a(this, $$delegatedProperties[1], Boolean.valueOf(z12));
    }

    private final void setVerificationStarted(boolean z12) {
        this.verificationStarted.a(this, $$delegatedProperties[2], Boolean.valueOf(z12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPreview(g applicant, Document document) {
        Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "Show preview for document: " + document.getType().getValue(), null, 4, null);
        DocumentType type = document.getType();
        onProgress(false);
        if (type.g()) {
            fireEvent(new Event.Navigate.PreviewIdentity(document));
            return;
        }
        if (type.f()) {
            fireEvent(new Event.Navigate.ConfirmEmail(document));
            return;
        }
        if (type.i()) {
            fireEvent(new Event.Navigate.ConfirmPhone(document));
            return;
        }
        if (type.j()) {
            fireEvent(new Event.Navigate.Questionnaire(document));
            return;
        }
        if (!type.k()) {
            if (type.d()) {
                fireEvent(new Event.Navigate.ApplicantData(document));
                return;
            }
            if (!type.h()) {
                if (type.e()) {
                    fireEvent(new Event.Navigate.Ekyc(document));
                    return;
                } else {
                    fireEvent(new Event.Navigate.PreviewPhotoSelfie(document));
                    return;
                }
            }
            g.c.a aVarA = applicant.a(type);
            if (aVarA == null || !aVarA.t()) {
                fireEvent(new Event.Navigate.ProofOfAddress(document));
                return;
            } else {
                fireEvent(new Event.Navigate.Geolocation(document));
                return;
            }
        }
        g.c.a aVarA2 = applicant.a(type);
        if (aVarA2 != null && aVarA2.v()) {
            fireEvent(new Event.Navigate.PreviewSelfieWithDocument(document));
            return;
        }
        if (aVarA2 != null && aVarA2.u()) {
            fireEvent(new Event.Navigate.PreviewPhotoSelfie(document));
            return;
        }
        if (L.f(aVarA2 != null ? aVarA2.getVideoRequired() : null, VideoRequiredType.Enabled.getValue())) {
            fireEvent(new Event.Navigate.PreviewVideoSelfie(document));
            return;
        }
        try {
            CBRProoface.Companion companion = CBRProoface.INSTANCE;
            fireEvent(new Event.Navigate.Liveness(document));
        } catch (Exception e12) {
            Logger.e$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "Prooface is not available: " + e12, null, 4, null);
            onProgress(false);
            CBRViewModel.throwError$default(this, e12, type.getValue(), null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startVideoIdentification(List<Document> documents) {
        Logger.v$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "startVideoIdentification: docs " + documents.size(), null, 4, null);
        if (ru.cyberity.cbr.core.common.q.a()) {
            fireEvent(new Event.Navigate.VideoIdent(documents));
        } else {
            onProgress(false);
            CBRViewModel.throwError$default(this, new Exception("VideoIdent not available"), "VIDEO_IDENT", null, 4, null);
        }
    }

    public final void clearShownInstructions() {
        this.shownInstructions.clear();
    }

    public final void delayedFinish(@k a0 reason, long delayMs) {
        C43259k.d(androidx.view.N0.a(this), null, null, new CBRAppViewModel$delayedFinish$$inlined$launchOnViewModelScope$1(this, "TYPE_UNKNOWN", null, this, delayMs, reason), 3);
    }

    public final void executeAfterInstructionsAction(boolean success) {
        PendingInstructionsData pendingInstructionsData = getPendingInstructionsData();
        if (pendingInstructionsData == null) {
            return;
        }
        setPendingInstructionsData(null);
        if (!success) {
            fireEvent(new Event.AfterInstructionsEvent(false, pendingInstructionsData.getPayload()));
            return;
        }
        if (pendingInstructionsData.getPayload() instanceof Event.Navigate) {
            ((Event.Navigate) pendingInstructionsData.getPayload()).setIntroParams(null);
        }
        this.shownInstructions.add(prepareInstructionsKey(pendingInstructionsData.getIntroParams()));
        if (pendingInstructionsData.getPayload() instanceof Event) {
            fireEvent((CBRViewModel.CBRViewModelEvent) pendingInstructionsData.getPayload());
        } else {
            fireEvent(new Event.AfterInstructionsEvent(true, pendingInstructionsData.getPayload()));
        }
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    public void fireEvent(@k CBRViewModel.CBRViewModelEvent event) {
        if (event instanceof Event.Navigate) {
            Event.Navigate navigate = (Event.Navigate) event;
            if (navigate.getIntroParams() != null) {
                ru.cyberity.cbr.core.domain.model.c introParams = navigate.getIntroParams();
                if (introParams != null) {
                    resolveInstructions(new ru.cyberity.cbr.core.domain.model.c(introParams.getStep(), introParams.getScene(), introParams.getIdDocType(), introParams.getIsAction()), (Parcelable) event);
                    return;
                }
                return;
            }
        }
        super.fireEvent(event);
    }

    public final void moveToNextDocument(boolean startVI) {
        launchWithProgress(new C478661(startVI, null));
    }

    public final void onCancel(@k CBRCompletionResult result, boolean isClosedByHost) {
        Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "Cancel verification with reason - " + result, null, 4, null);
        ru.cyberity.cbr.core.analytics.f.a(0L, 1, null).a(SdkEvent.Dismiss).a(new Q("isDismissMethodCalled", Boolean.valueOf(isClosedByHost))).a(true);
        fireEvent(new Event.Cancel(result));
        try {
            CBRMobileSDK cBRMobileSDK = CBRMobileSDK.INSTANCE;
            CBRCompleteHandler completeHandler = cBRMobileSDK.getCompleteHandler();
            if (completeHandler != null) {
                completeHandler.onComplete(result, cBRMobileSDK.getState());
            }
        } catch (Exception e12) {
            ru.cyberity.log.a aVar = ru.cyberity.log.a.f436064a;
            String strA = ru.cyberity.log.c.a(this);
            String message = e12.getMessage();
            if (message == null) {
                message = "";
            }
            aVar.e(strA, message, e12);
        }
        CBRMobileSDK.INSTANCE.shutdown();
        cancelWaitForLevelChange();
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel, androidx.view.M0
    public void onCleared() {
        ru.cyberity.cbr.core.analytics.b.f432519a.a((Y41.l<? super CBRTrackEvents, G0>) null);
        cancelWaitForLevelChange();
        super.onCleared();
    }

    public final void onDocumentClicked(@k Document document) {
        launchWithProgress(new C478691(document, null));
    }

    public final void onDocumentUploaded(@k Document document) {
        Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "A user has uploaded document: " + document.getType().getValue(), null, 4, null);
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    public void onHandleError(@k ru.cyberity.cbr.core.data.model.p error) {
        Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "On handle error - " + error, null, 4, null);
        if (error instanceof p.a) {
            onCancel$default(this, new CBRCompletionResult.AbnormalTermination(error.getException()), false, 2, null);
        } else {
            fireEvent(new Event.HandleError(error));
        }
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    public void onLoad() {
        launchWithProgress(new C478701(null));
    }

    public final void onMoveToApplicantStatusScreen(boolean isCancelled, boolean reload) {
        C43259k.d(androidx.view.N0.a(this), null, null, new CBRAppViewModel$onMoveToApplicantStatusScreen$$inlined$launchOnViewModelScope$1(this, "TYPE_UNKNOWN", null, this, isCancelled, reload), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onPrepare(@Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ru.cyberity.cbr.presentation.screen.CBRAppViewModel.C478711
            if (r0 == 0) goto L13
            r0 = r5
            ru.cyberity.cbr.presentation.screen.CBRAppViewModel$onPrepare$1 r0 = (ru.cyberity.cbr.presentation.screen.CBRAppViewModel.C478711) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ru.cyberity.cbr.presentation.screen.CBRAppViewModel$onPrepare$1 r0 = new ru.cyberity.cbr.presentation.screen.CBRAppViewModel$onPrepare$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            ru.cyberity.cbr.presentation.screen.CBRAppViewModel r0 = (ru.cyberity.cbr.presentation.screen.CBRAppViewModel) r0
            kotlin.C42729a0.b(r5)
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.C42729a0.b(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = super.onPrepare(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            ru.cyberity.cbr.presentation.screen.CBRAppViewModel$onPrepare$2 r5 = new ru.cyberity.cbr.presentation.screen.CBRAppViewModel$onPrepare$2
            r1 = 0
            r5.<init>(r1)
            r2 = 0
            ru.cyberity.cbr.core.presentation.base.CBRViewModel.updateState$default(r0, r2, r5, r3, r1)
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.CBRAppViewModel.onPrepare(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void onProgress(boolean show) {
        this.progressState.setValue(Boolean.valueOf(show));
    }

    public final void resolveInstructions(@k ru.cyberity.cbr.core.domain.model.c introParams, @l Parcelable payload) {
        Logger.v$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "resolveInstructions, introParams=" + introParams + ", payload=" + payload, null, 4, null);
        if (payload != null) {
            setPendingInstructionsData(new PendingInstructionsData(introParams, payload));
        }
        C43259k.d(androidx.view.N0.a(this), null, null, new C478791(introParams, null), 3);
    }

    public final void setNetworkState(@k String networkType) {
        C43259k.d(androidx.view.N0.a(this), null, null, new CBRAppViewModel$setNetworkState$$inlined$launchOnViewModelScope$1(this, "TYPE_UNKNOWN", null, this, networkType), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object moveToNextDocument(g gVar, List<Document> list, boolean z12, Continuation<? super G0> continuation) {
        Document documentNextDocument = CBRAppViewModelUtilsKt.nextDocument(list, gVar);
        if (documentNextDocument != null && !L.f(this.documentStarted, documentNextDocument)) {
            fireOnStepCompleted(false);
            showPreview(gVar, documentNextDocument);
            fireOnStartStep(documentNextDocument);
            return G0.f406611a;
        }
        fireOnStepCompleted(false);
        if (CBRAppViewModelUtilsKt.filterVideoIdentUnSubmittedAndRejectedDocuments(list, gVar) == null) {
            Object objOnStepComplete = onStepComplete(false, continuation);
            return objOnStepComplete == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOnStepComplete : G0.f406611a;
        }
        Logger.v$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "moveToNextStep: applicantStatus=" + gVar.getCom.avito.android.remote.model.AvatarStatus.REVIEW java.lang.String().getStatus(), null, 4, null);
        if (z12) {
            startVideoIdentification(ru.cyberity.cbr.core.common.s.a(list, gVar));
        }
        return G0.f406611a;
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @k
    public ViewState getDefaultState() {
        return new ViewState(false, null, false, null, null, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resolveApplicantStatus(g applicant, ru.cyberity.cbr.core.data.model.e config, boolean hasDocumentsToSubmit, boolean isCancelled) {
        Logger.v$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "resolveNextScreenByApplicantStatus: status=" + applicant.K() + ", isCancelled=" + isCancelled, null, 4, null);
        this.isInitialStatusShown = true;
        ReviewStatusType reviewStatusTypeK = applicant.K();
        ReviewStatusType reviewStatusType = ReviewStatusType.Init;
        if (reviewStatusTypeK == reviewStatusType && ru.cyberity.cbr.core.data.model.f.f(config) && hasDocumentsToSubmit && !applicant.A()) {
            if (isCancelled) {
                onCancel$default(this, new CBRCompletionResult.SuccessTermination(null, 1, null), false, 2, null);
                return;
            } else {
                moveToNextDocument$default(this, false, 1, null);
                return;
            }
        }
        if (applicant.K() == reviewStatusType && ru.cyberity.cbr.core.data.model.f.d(config) && !hasDocumentsToSubmit) {
            onCancel$default(this, new CBRCompletionResult.SuccessTermination(null, 1, null), false, 2, null);
            return;
        }
        if (applicant.K() == ReviewStatusType.Pending && ru.cyberity.cbr.core.data.model.f.d(config)) {
            onCancel$default(this, new CBRCompletionResult.SuccessTermination(null, 1, null), false, 2, null);
            return;
        }
        if (applicant.K() == ReviewStatusType.Prechecked && ru.cyberity.cbr.core.data.model.f.d(config)) {
            onCancel$default(this, new CBRCompletionResult.SuccessTermination(null, 1, null), false, 2, null);
            return;
        }
        if (applicant.N() && ru.cyberity.cbr.core.data.model.f.b(config)) {
            onCancel$default(this, new CBRCompletionResult.SuccessTermination(null, 1, null), false, 2, null);
            return;
        }
        if (!applicant.O() || !ru.cyberity.cbr.core.data.model.f.h(config)) {
            fireEvent(Event.Navigate.ApplicantStatus.INSTANCE);
        } else if (hasDocumentsToSubmit && !isCancelled) {
            moveToNextDocument$default(this, false, 1, null);
        } else {
            onCancel$default(this, new CBRCompletionResult.SuccessTermination(null, 1, null), false, 2, null);
        }
    }
}
