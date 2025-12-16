package ru.cyberity.cbr.core.presentation.base;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.media3.exoplayer.analytics.m;
import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.text.TooltipAttribute;
import j.InterfaceC42153i;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43135f1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.N;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.A;
import kotlinx.coroutines.channels.C43108m;
import kotlinx.coroutines.channels.InterfaceC43123w;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.X;
import kotlinx.coroutines.flow.Y1;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.d2;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;
import kotlinx.coroutines.internal.K;
import ru.cyberity.cbr.core.common.a0;
import ru.cyberity.cbr.core.common.j0;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.common.y;
import ru.cyberity.cbr.core.data.model.CBRCompletionResult;
import ru.cyberity.cbr.core.data.model.CBRException;
import ru.cyberity.cbr.core.data.model.CBRSDKState;
import ru.cyberity.cbr.core.data.model.Document;
import ru.cyberity.cbr.core.data.model.e;
import ru.cyberity.cbr.core.data.model.p;
import ru.cyberity.cbr.core.data.source.dynamic.c;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel.CBRViewModelState;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBRViewModel.kt */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b&\u0018\u0000 \u0082\u0001*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u001c\u0083\u0001\u0084\u0001\u0085\u0001\u0082\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\nH\u0094@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001e\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010 J)\u0010\u001f\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00122\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J\u0015\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(JA\u0010.\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00022\b\b\u0002\u0010*\u001a\u00020)2\u001c\u0010-\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010,\u0012\u0006\u0012\u0004\u0018\u00010\"0+H\u0087@ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020%¢\u0006\u0004\b0\u00101J/\u00105\u001a\u00020\n2\b\b\u0002\u00103\u001a\u0002022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u00104\u001a\u0004\u0018\u00010)¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\u00020\n2\u0006\u00107\u001a\u00020\u0012¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00028\u0000¢\u0006\u0004\b:\u0010\u0010J\u0017\u0010=\u001a\u00020\n2\u0006\u0010<\u001a\u00020;H\u0015¢\u0006\u0004\b=\u0010>JO\u0010E\u001a\u00020\n2\b\b\u0002\u0010?\u001a\u00020%21\u0010D\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(C\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,\u0012\u0006\u0012\u0004\u0018\u00010\"0@H\u0004ø\u0001\u0000¢\u0006\u0004\bE\u0010FJ\u001f\u0010H\u001a\u0004\u0018\u00010\u00122\b\u0010G\u001a\u0004\u0018\u00010\u0012H\u0084@ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ\u0013\u0010K\u001a\u00020JH\u0084@ø\u0001\u0000¢\u0006\u0004\bK\u0010\u000eJ\u0013\u0010L\u001a\u00020%H\u0084@ø\u0001\u0000¢\u0006\u0004\bL\u0010\u000eJ\u000f\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010R\u001a\u00020\n2\u0006\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bR\u0010SJ\u0019\u0010U\u001a\u00020\n2\b\u0010T\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\bU\u0010VR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010WR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010XR\u0018\u0010Y\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020;0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u001d\u0010_\u001a\b\u0012\u0004\u0012\u00020;0^8\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bRH\u0010c\u001a3\u0012/\u0012-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(C\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,\u0012\u0006\u0012\u0004\u0018\u00010\"0@0[8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bc\u0010]R\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00028\u00000d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR \u0010h\u001a\b\u0012\u0004\u0012\u00028\u00000g8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020m0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u001d\u0010q\u001a\b\u0012\u0004\u0012\u00020m0p8\u0006¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\u0018\u0010u\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010x\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR(\u0010|\u001a\u0004\u0018\u00010z2\b\u0010{\u001a\u0004\u0018\u00010z8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007fR\u0016\u0010\u0081\u0001\u001a\u00020J8DX\u0084\u0004¢\u0006\u0007\u001a\u0005\bK\u0010\u0080\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0090\u0001"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "T", "Landroidx/lifecycle/M0;", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "<init>", "(Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/dynamic/c;)V", "Lkotlin/G0;", "onCleared", "()V", "onPrepare", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDefaultState", "()Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "onLoad", "", "getDocumentType", "()Ljava/lang/String;", "", "t", "checkThrowableIsCritical", "(Ljava/lang/Throwable;)V", "Lru/cyberity/cbr/core/data/model/p;", "error", "onHandleError", "(Lru/cyberity/cbr/core/data/model/p;)V", "onErrorCancelled", "idDocSetType", "throwError", "(Lru/cyberity/cbr/core/data/model/p;Ljava/lang/String;)V", "e", "", "payload", "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;)V", "", "show", "showProgress", "(Z)V", "", "progressDelayMs", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "action", "runWithProgressIndicator", "(JLY41/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldHideLogo", "()Z", "Lru/cyberity/cbr/core/common/a0;", "reason", "delay", "finish", "(Lru/cyberity/cbr/core/common/a0;Ljava/lang/Object;Ljava/lang/Long;)V", ContextActionHandler.Link.URL, "onLinkClicked", "(Ljava/lang/String;)V", "currentState", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "event", "fireEvent", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;)V", "immediately", "Lkotlin/Function2;", "Lkotlin/S;", "name", "current", "update", "updateState", "(ZLY41/p;)V", "id", "getString", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/dynamic/c$c;", "getStrings", "awaitStringsReady", "Lkotlinx/coroutines/N0;", "prepare", "()Lkotlinx/coroutines/N0;", "Lru/cyberity/cbr/core/data/model/CBRCompletionResult;", "result", "onCancel", "(Lru/cyberity/cbr/core/data/model/CBRCompletionResult;)V", VoiceInfo.STATE, "assertStateNotNull", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;)V", "Lru/cyberity/cbr/core/data/source/common/a;", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "isAttachedToFragment", "Ljava/lang/Boolean;", "Lkotlinx/coroutines/channels/w;", "_events", "Lkotlinx/coroutines/channels/w;", "Lkotlinx/coroutines/flow/i;", "events", "Lkotlinx/coroutines/flow/i;", "getEvents", "()Lkotlinx/coroutines/flow/i;", "updateStateQueue", "Lkotlinx/coroutines/flow/Y1;", "_viewState", "Lkotlinx/coroutines/flow/Y1;", "Lkotlinx/coroutines/flow/d2;", "viewState", "Lkotlinx/coroutines/flow/d2;", "getViewState", "()Lkotlinx/coroutines/flow/d2;", "Lkotlinx/coroutines/flow/Z1;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelInternalState;", "_viewModelInternalState", "Lkotlinx/coroutines/flow/Z1;", "Lkotlinx/coroutines/flow/n2;", "viewModelInternalState", "Lkotlinx/coroutines/flow/n2;", "getViewModelInternalState", "()Lkotlinx/coroutines/flow/n2;", "_strings", "Lru/cyberity/cbr/core/data/source/dynamic/c$c;", "Lkotlinx/coroutines/N;", "prepareExceptionHandler", "Lkotlinx/coroutines/N;", "Lru/cyberity/cbr/core/data/model/e;", "<set-?>", Navigation.CONFIG, "Lru/cyberity/cbr/core/data/model/e;", "getConfig", "()Lru/cyberity/cbr/core/data/model/e;", "()Lru/cyberity/cbr/core/data/source/dynamic/c$c;", "strings", "Companion", "CBRViewModelEvent", "CBRViewModelInternalState", "CBRViewModelState", "ErrorEvent", "FinishEvent", "OpenAppSettings", "OpenLocationSourceSettings", "OpenUrlEvent", "PermissionRequest", "ShowDocumentEvent", "ShowPermissionDialog", "ShowProgressEvent", "ShowSupportEvent", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public abstract class CBRViewModel<T extends CBRViewModelState> extends M0 {

    @k
    private static final Companion Companion = new Companion(null);

    @k
    private final InterfaceC43123w<CBRViewModelEvent> _events;

    @l
    private c.C12476c _strings;

    @k
    private final Z1<CBRViewModelInternalState> _viewModelInternalState;

    @k
    private final Y1<T> _viewState;

    @k
    private final ru.cyberity.cbr.core.data.source.common.a commonRepository;

    @l
    private e config;

    @k
    private final c dataRepository;

    @k
    private final InterfaceC43160i<CBRViewModelEvent> events;

    @l
    private Boolean isAttachedToFragment;

    @k
    private final N prepareExceptionHandler;

    @k
    private final InterfaceC43123w<p<T, Continuation<? super T>, Object>> updateStateQueue;

    @k
    private final n2<CBRViewModelInternalState> viewModelInternalState;

    @k
    private final d2<T> viewState;

    /* compiled from: CBRViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "T", "Lru/cyberity/cbr/core/data/source/dynamic/c$a;", "data", "Lkotlin/G0;", "<anonymous>", "(Lru/cyberity/cbr/core/data/source/dynamic/c$a;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.base.CBRViewModel$1", f = "CBRViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.core.presentation.base.CBRViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<c.a, Continuation<? super G0>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CBRViewModel<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CBRViewModel<T> cBRViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cBRViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            ru.cyberity.cbr.core.data.source.dynamic.a<e> aVarI;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            c.a aVar = (c.a) this.L$0;
            ((CBRViewModel) this.this$0).config = (aVar == null || (aVarI = aVar.i()) == null) ? null : aVarI.d();
            return G0.f406611a;
        }

        @Override // Y41.p
        @l
        public final Object invoke(@l c.a aVar, @l Continuation<? super G0> continuation) {
            return ((AnonymousClass1) create(aVar, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: CBRViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.base.CBRViewModel$2", f = "CBRViewModel.kt", i = {1}, l = {130, 131, 135, 136}, m = "invokeSuspend", n = {"updater"}, s = {"L$1"})
    /* renamed from: ru.cyberity.cbr.core.presentation.base.CBRViewModel$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ CBRViewModel<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CBRViewModel<T> cBRViewModel, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = cBRViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0085 -> B:15:0x0052). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a4 -> B:15:0x0052). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00c3 -> B:15:0x0052). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                r2 = 0
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L45
                if (r1 == r6) goto L3d
                if (r1 == r5) goto L2e
                if (r1 == r4) goto L25
                if (r1 != r3) goto L1d
                java.lang.Object r1 = r10.L$0
                kotlinx.coroutines.channels.y r1 = (kotlinx.coroutines.channels.InterfaceC43125y) r1
                kotlin.C42729a0.b(r11)
                goto L52
            L1d:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L25:
                java.lang.Object r1 = r10.L$0
                kotlinx.coroutines.channels.y r1 = (kotlinx.coroutines.channels.InterfaceC43125y) r1
                kotlin.C42729a0.b(r11)
                goto Lb3
            L2e:
                java.lang.Object r1 = r10.L$1
                Y41.p r1 = (Y41.p) r1
                java.lang.Object r7 = r10.L$0
                kotlinx.coroutines.channels.y r7 = (kotlinx.coroutines.channels.InterfaceC43125y) r7
                kotlin.C42729a0.b(r11)
                r9 = r7
                r7 = r1
                r1 = r9
                goto L7f
            L3d:
                java.lang.Object r1 = r10.L$0
                kotlinx.coroutines.channels.y r1 = (kotlinx.coroutines.channels.InterfaceC43125y) r1
                kotlin.C42729a0.b(r11)
                goto L5f
            L45:
                kotlin.C42729a0.b(r11)
                ru.cyberity.cbr.core.presentation.base.CBRViewModel<T extends ru.cyberity.cbr.core.presentation.base.CBRViewModel$CBRViewModelState> r11 = r10.this$0
                kotlinx.coroutines.channels.w r11 = ru.cyberity.cbr.core.presentation.base.CBRViewModel.access$getUpdateStateQueue$p(r11)
                kotlinx.coroutines.channels.y r1 = r11.iterator()
            L52:
                r10.L$0 = r1
                r10.L$1 = r2
                r10.label = r6
                java.lang.Object r11 = r1.a(r10)
                if (r11 != r0) goto L5f
                return r0
            L5f:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto Lc6
                java.lang.Object r11 = r1.next()
                Y41.p r11 = (Y41.p) r11
                ru.cyberity.cbr.core.presentation.base.CBRViewModel<T extends ru.cyberity.cbr.core.presentation.base.CBRViewModel$CBRViewModelState> r7 = r10.this$0
                r10.L$0 = r1
                r10.L$1 = r11
                r10.label = r5
                java.lang.Object r7 = r7.awaitStringsReady(r10)
                if (r7 != r0) goto L7c
                return r0
            L7c:
                r9 = r7
                r7 = r11
                r11 = r9
            L7f:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto L52
                ru.cyberity.cbr.core.presentation.base.CBRViewModel<T extends ru.cyberity.cbr.core.presentation.base.CBRViewModel$CBRViewModelState> r11 = r10.this$0
                kotlinx.coroutines.flow.Y1 r11 = ru.cyberity.cbr.core.presentation.base.CBRViewModel.access$get_viewState$p(r11)
                java.util.List r11 = r11.E3()
                java.lang.Object r11 = kotlin.collections.C42745f0.G(r11)
                ru.cyberity.cbr.core.presentation.base.CBRViewModel$CBRViewModelState r11 = (ru.cyberity.cbr.core.presentation.base.CBRViewModel.CBRViewModelState) r11
                if (r11 != 0) goto L9f
                ru.cyberity.cbr.core.presentation.base.CBRViewModel<T extends ru.cyberity.cbr.core.presentation.base.CBRViewModel$CBRViewModelState> r11 = r10.this$0
                ru.cyberity.cbr.core.presentation.base.CBRViewModel$CBRViewModelState r11 = r11.getDefaultState()
            L9f:
                ru.cyberity.cbr.core.presentation.base.CBRViewModel<T extends ru.cyberity.cbr.core.presentation.base.CBRViewModel$CBRViewModelState> r8 = r10.this$0
                ru.cyberity.cbr.core.presentation.base.CBRViewModel.access$assertStateNotNull(r8, r11)
                if (r11 == 0) goto L52
                r10.L$0 = r1
                r10.L$1 = r2
                r10.label = r4
                java.lang.Object r11 = r7.invoke(r11, r10)
                if (r11 != r0) goto Lb3
                return r0
            Lb3:
                ru.cyberity.cbr.core.presentation.base.CBRViewModel$CBRViewModelState r11 = (ru.cyberity.cbr.core.presentation.base.CBRViewModel.CBRViewModelState) r11
                ru.cyberity.cbr.core.presentation.base.CBRViewModel<T extends ru.cyberity.cbr.core.presentation.base.CBRViewModel$CBRViewModelState> r7 = r10.this$0
                kotlinx.coroutines.flow.Y1 r7 = ru.cyberity.cbr.core.presentation.base.CBRViewModel.access$get_viewState$p(r7)
                r10.L$0 = r1
                r10.label = r3
                java.lang.Object r11 = r7.emit(r11, r10)
                if (r11 != r0) goto L52
                return r0
            Lc6:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.presentation.base.CBRViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // Y41.p
        @l
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((AnonymousClass2) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: CBRViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface CBRViewModelEvent {
    }

    /* compiled from: CBRViewModel.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJF\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0005\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelInternalState;", "", "", "hideLogo", "areStringsReady", "isViewModelPrepared", "", "poweredByText", "progressText", "<init>", "(ZZZLjava/lang/CharSequence;Ljava/lang/CharSequence;)V", "copy", "(ZZZLjava/lang/CharSequence;Ljava/lang/CharSequence;)Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelInternalState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Z", "getHideLogo", "()Z", "getAreStringsReady", "Ljava/lang/CharSequence;", "getPoweredByText", "()Ljava/lang/CharSequence;", "getProgressText", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class CBRViewModelInternalState {
        private final boolean areStringsReady;
        private final boolean hideLogo;
        private final boolean isViewModelPrepared;

        @l
        private final CharSequence poweredByText;

        @l
        private final CharSequence progressText;

        public CBRViewModelInternalState() {
            this(false, false, false, null, null, 31, null);
        }

        public static /* synthetic */ CBRViewModelInternalState copy$default(CBRViewModelInternalState cBRViewModelInternalState, boolean z12, boolean z13, boolean z14, CharSequence charSequence, CharSequence charSequence2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                z12 = cBRViewModelInternalState.hideLogo;
            }
            if ((i12 & 2) != 0) {
                z13 = cBRViewModelInternalState.areStringsReady;
            }
            boolean z15 = z13;
            if ((i12 & 4) != 0) {
                z14 = cBRViewModelInternalState.isViewModelPrepared;
            }
            boolean z16 = z14;
            if ((i12 & 8) != 0) {
                charSequence = cBRViewModelInternalState.poweredByText;
            }
            CharSequence charSequence3 = charSequence;
            if ((i12 & 16) != 0) {
                charSequence2 = cBRViewModelInternalState.progressText;
            }
            return cBRViewModelInternalState.copy(z12, z15, z16, charSequence3, charSequence2);
        }

        @k
        public final CBRViewModelInternalState copy(boolean hideLogo, boolean areStringsReady, boolean isViewModelPrepared, @l CharSequence poweredByText, @l CharSequence progressText) {
            return new CBRViewModelInternalState(hideLogo, areStringsReady, isViewModelPrepared, poweredByText, progressText);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CBRViewModelInternalState)) {
                return false;
            }
            CBRViewModelInternalState cBRViewModelInternalState = (CBRViewModelInternalState) other;
            return this.hideLogo == cBRViewModelInternalState.hideLogo && this.areStringsReady == cBRViewModelInternalState.areStringsReady && this.isViewModelPrepared == cBRViewModelInternalState.isViewModelPrepared && L.f(this.poweredByText, cBRViewModelInternalState.poweredByText) && L.f(this.progressText, cBRViewModelInternalState.progressText);
        }

        public final boolean getAreStringsReady() {
            return this.areStringsReady;
        }

        public final boolean getHideLogo() {
            return this.hideLogo;
        }

        @l
        public final CharSequence getPoweredByText() {
            return this.poweredByText;
        }

        @l
        public final CharSequence getProgressText() {
            return this.progressText;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
        public int hashCode() {
            boolean z12 = this.hideLogo;
            ?? r02 = z12;
            if (z12) {
                r02 = 1;
            }
            int i12 = r02 * 31;
            ?? r22 = this.areStringsReady;
            int i13 = r22;
            if (r22 != 0) {
                i13 = 1;
            }
            int i14 = (i12 + i13) * 31;
            boolean z13 = this.isViewModelPrepared;
            int i15 = (i14 + (z13 ? 1 : z13 ? 1 : 0)) * 31;
            CharSequence charSequence = this.poweredByText;
            int iHashCode = (i15 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
            CharSequence charSequence2 = this.progressText;
            return iHashCode + (charSequence2 != null ? charSequence2.hashCode() : 0);
        }

        /* renamed from: isViewModelPrepared, reason: from getter */
        public final boolean getIsViewModelPrepared() {
            return this.isViewModelPrepared;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CBRViewModelInternalState(hideLogo=");
            sb2.append(this.hideLogo);
            sb2.append(", areStringsReady=");
            sb2.append(this.areStringsReady);
            sb2.append(", isViewModelPrepared=");
            sb2.append(this.isViewModelPrepared);
            sb2.append(", poweredByText=");
            sb2.append((Object) this.poweredByText);
            sb2.append(", progressText=");
            return AK.c.r(sb2, this.progressText, ')');
        }

        public CBRViewModelInternalState(boolean z12, boolean z13, boolean z14, @l CharSequence charSequence, @l CharSequence charSequence2) {
            this.hideLogo = z12;
            this.areStringsReady = z13;
            this.isViewModelPrepared = z14;
            this.poweredByText = charSequence;
            this.progressText = charSequence2;
        }

        public /* synthetic */ CBRViewModelInternalState(boolean z12, boolean z13, boolean z14, CharSequence charSequence, CharSequence charSequence2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13, (i12 & 4) == 0 ? z14 : false, (i12 & 8) != 0 ? null : charSequence, (i12 & 16) != 0 ? null : charSequence2);
        }
    }

    /* compiled from: CBRViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface CBRViewModelState {
    }

    /* compiled from: CBRViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$Companion;", "", "()V", "DEFAULT_TIMEOUT", "", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: CBRViewModel.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$ErrorEvent;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "Lru/cyberity/cbr/core/data/model/p;", "error", "", "idDocSetType", "", "buttonText", "<init>", "(Lru/cyberity/cbr/core/data/model/p;Ljava/lang/String;Ljava/lang/CharSequence;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lru/cyberity/cbr/core/data/model/p;", "getError", "()Lru/cyberity/cbr/core/data/model/p;", "Ljava/lang/String;", "getIdDocSetType", "Ljava/lang/CharSequence;", "getButtonText", "()Ljava/lang/CharSequence;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class ErrorEvent implements CBRViewModelEvent {

        @l
        private final CharSequence buttonText;

        @l
        private final ru.cyberity.cbr.core.data.model.p error;

        @k
        private final String idDocSetType;

        public ErrorEvent(@l ru.cyberity.cbr.core.data.model.p pVar, @k String str, @l CharSequence charSequence) {
            this.error = pVar;
            this.idDocSetType = str;
            this.buttonText = charSequence;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorEvent)) {
                return false;
            }
            ErrorEvent errorEvent = (ErrorEvent) other;
            return L.f(this.error, errorEvent.error) && L.f(this.idDocSetType, errorEvent.idDocSetType) && L.f(this.buttonText, errorEvent.buttonText);
        }

        @l
        public final CharSequence getButtonText() {
            return this.buttonText;
        }

        @l
        public final ru.cyberity.cbr.core.data.model.p getError() {
            return this.error;
        }

        @k
        public final String getIdDocSetType() {
            return this.idDocSetType;
        }

        public int hashCode() {
            ru.cyberity.cbr.core.data.model.p pVar = this.error;
            int iD2 = H.d((pVar == null ? 0 : pVar.hashCode()) * 31, 31, this.idDocSetType);
            CharSequence charSequence = this.buttonText;
            return iD2 + (charSequence != null ? charSequence.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ErrorEvent(error=");
            sb2.append(this.error);
            sb2.append(", idDocSetType=");
            sb2.append(this.idDocSetType);
            sb2.append(", buttonText=");
            return AK.c.r(sb2, this.buttonText, ')');
        }
    }

    /* compiled from: CBRViewModel.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$FinishEvent;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "Lru/cyberity/cbr/core/common/a0;", "reason", "", "payload", "", "delay", "<init>", "(Lru/cyberity/cbr/core/common/a0;Ljava/lang/Object;Ljava/lang/Long;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lru/cyberity/cbr/core/common/a0;", "getReason", "()Lru/cyberity/cbr/core/common/a0;", "Ljava/lang/Object;", "getPayload", "()Ljava/lang/Object;", "Ljava/lang/Long;", "getDelay", "()Ljava/lang/Long;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class FinishEvent implements CBRViewModelEvent {

        @l
        private final Long delay;

        @l
        private final Object payload;

        @k
        private final a0 reason;

        public FinishEvent() {
            this(null, null, null, 7, null);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FinishEvent)) {
                return false;
            }
            FinishEvent finishEvent = (FinishEvent) other;
            return L.f(this.reason, finishEvent.reason) && L.f(this.payload, finishEvent.payload) && L.f(this.delay, finishEvent.delay);
        }

        @l
        public final Long getDelay() {
            return this.delay;
        }

        @l
        public final Object getPayload() {
            return this.payload;
        }

        @k
        public final a0 getReason() {
            return this.reason;
        }

        public int hashCode() {
            int iHashCode = this.reason.hashCode() * 31;
            Object obj = this.payload;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            Long l12 = this.delay;
            return iHashCode2 + (l12 != null ? l12.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("FinishEvent(reason=");
            sb2.append(this.reason);
            sb2.append(", payload=");
            sb2.append(this.payload);
            sb2.append(", delay=");
            return m.m(sb2, this.delay, ')');
        }

        public FinishEvent(@k a0 a0Var, @l Object obj, @l Long l12) {
            this.reason = a0Var;
            this.payload = obj;
            this.delay = l12;
        }

        public /* synthetic */ FinishEvent(a0 a0Var, Object obj, Long l12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? a0.c.f432638a : a0Var, (i12 & 2) != 0 ? null : obj, (i12 & 4) != 0 ? null : l12);
        }
    }

    /* compiled from: CBRViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$OpenAppSettings;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "()V", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class OpenAppSettings implements CBRViewModelEvent {

        @k
        public static final OpenAppSettings INSTANCE = new OpenAppSettings();

        private OpenAppSettings() {
        }
    }

    /* compiled from: CBRViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$OpenLocationSourceSettings;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "()V", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class OpenLocationSourceSettings implements CBRViewModelEvent {

        @k
        public static final OpenLocationSourceSettings INSTANCE = new OpenLocationSourceSettings();

        private OpenLocationSourceSettings() {
        }
    }

    /* compiled from: CBRViewModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$OpenUrlEvent;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUri", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class OpenUrlEvent implements CBRViewModelEvent {

        @k
        private final String uri;

        public OpenUrlEvent(@k String str) {
            this.uri = str;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OpenUrlEvent) && L.f(this.uri, ((OpenUrlEvent) other).uri);
        }

        @k
        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.uri.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("OpenUrlEvent(uri="), this.uri, ')');
        }
    }

    /* compiled from: CBRViewModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004¨\u0006\u0010"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$PermissionRequest;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "permission", "Ljava/lang/String;", "getPermission", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class PermissionRequest implements CBRViewModelEvent {

        @k
        private final String permission;

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PermissionRequest) && L.f(this.permission, ((PermissionRequest) other).permission);
        }

        public int hashCode() {
            return this.permission.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("PermissionRequest(permission="), this.permission, ')');
        }
    }

    /* compiled from: CBRViewModel.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$ShowDocumentEvent;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "Lru/cyberity/cbr/core/data/model/Document;", "document", "<init>", "(Lru/cyberity/cbr/core/data/model/Document;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lru/cyberity/cbr/core/data/model/Document;", "getDocument", "()Lru/cyberity/cbr/core/data/model/Document;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class ShowDocumentEvent implements CBRViewModelEvent {

        @k
        private final Document document;

        public ShowDocumentEvent(@k Document document) {
            this.document = document;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowDocumentEvent) && L.f(this.document, ((ShowDocumentEvent) other).document);
        }

        @k
        public final Document getDocument() {
            return this.document;
        }

        public int hashCode() {
            return this.document.hashCode();
        }

        @k
        public String toString() {
            return "ShowDocumentEvent(document=" + this.document + ')';
        }
    }

    /* compiled from: CBRViewModel.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$ShowProgressEvent;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "", "show", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Z", "getShow", "()Z", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class ShowProgressEvent implements CBRViewModelEvent {
        private final boolean show;

        public ShowProgressEvent(boolean z12) {
            this.show = z12;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowProgressEvent) && this.show == ((ShowProgressEvent) other).show;
        }

        public final boolean getShow() {
            return this.show;
        }

        public int hashCode() {
            boolean z12 = this.show;
            if (z12) {
                return 1;
            }
            return z12 ? 1 : 0;
        }

        @k
        public String toString() {
            return r.x(new StringBuilder("ShowProgressEvent(show="), this.show, ')');
        }
    }

    /* compiled from: CBRViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$ShowSupportEvent;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "()V", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ShowSupportEvent implements CBRViewModelEvent {

        @k
        public static final ShowSupportEvent INSTANCE = new ShowSupportEvent();

        private ShowSupportEvent() {
        }
    }

    /* compiled from: CBRViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.base.CBRViewModel", f = "CBRViewModel.kt", i = {}, l = {355}, m = "awaitStringsReady", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.core.presentation.base.CBRViewModel$awaitStringsReady$1, reason: invalid class name and case insensitive filesystem */
    public static final class C478491 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ CBRViewModel<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C478491(CBRViewModel<T> cBRViewModel, Continuation<? super C478491> continuation) {
            super(continuation);
            this.this$0 = cBRViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.result = obj;
            this.label |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.this$0.awaitStringsReady(this);
        }
    }

    /* compiled from: CBRViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "T", "Lkotlinx/coroutines/T;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelInternalState;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelInternalState;"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.base.CBRViewModel$awaitStringsReady$2", f = "CBRViewModel.kt", i = {}, l = {356}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.core.presentation.base.CBRViewModel$awaitStringsReady$2, reason: invalid class name and case insensitive filesystem */
    public static final class C478502 extends SuspendLambda implements p<T, Continuation<? super CBRViewModelInternalState>, Object> {
        int label;
        final /* synthetic */ CBRViewModel<T> this$0;

        /* compiled from: CBRViewModel.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "T", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelInternalState;", "it", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.base.CBRViewModel$awaitStringsReady$2$1", f = "CBRViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: ru.cyberity.cbr.core.presentation.base.CBRViewModel$awaitStringsReady$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements p<CBRViewModelInternalState, Continuation<? super Boolean>, Object> {
            /* synthetic */ Object L$0;
            int label;

            public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return Boxing.boxBoolean(((CBRViewModelInternalState) this.L$0).getAreStringsReady());
            }

            @Override // Y41.p
            @l
            public final Object invoke(@k CBRViewModelInternalState cBRViewModelInternalState, @l Continuation<? super Boolean> continuation) {
                return ((AnonymousClass1) create(cBRViewModelInternalState, continuation)).invokeSuspend(G0.f406611a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C478502(CBRViewModel<T> cBRViewModel, Continuation<? super C478502> continuation) {
            super(2, continuation);
            this.this$0 = cBRViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new C478502(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.label;
            if (i12 == 0) {
                C42729a0.b(obj);
                Z1 z12 = ((CBRViewModel) this.this$0)._viewModelInternalState;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                obj = C43175k.x(z12, anonymousClass1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }

        @Override // Y41.p
        @l
        public final Object invoke(@k T t12, @l Continuation<? super CBRViewModelInternalState> continuation) {
            return ((C478502) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: CBRViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.base.CBRViewModel$fireEvent$1", f = "CBRViewModel.kt", i = {}, l = {319}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.core.presentation.base.CBRViewModel$fireEvent$1, reason: invalid class name and case insensitive filesystem */
    public static final class C478511 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        final /* synthetic */ CBRViewModelEvent $event;
        int label;
        final /* synthetic */ CBRViewModel<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C478511(CBRViewModel<T> cBRViewModel, CBRViewModelEvent cBRViewModelEvent, Continuation<? super C478511> continuation) {
            super(2, continuation);
            this.this$0 = cBRViewModel;
            this.$event = cBRViewModelEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new C478511(this.this$0, this.$event, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.label;
            if (i12 == 0) {
                C42729a0.b(obj);
                Logger.v$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this.this$0), "fireEvent: " + this.$event, null, 4, null);
                InterfaceC43123w interfaceC43123w = ((CBRViewModel) this.this$0)._events;
                CBRViewModelEvent cBRViewModelEvent = this.$event;
                this.label = 1;
                if (interfaceC43123w.send(cBRViewModelEvent, this) == coroutine_suspended) {
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

        @Override // Y41.p
        @l
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((C478511) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: CBRViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.base.CBRViewModel", f = "CBRViewModel.kt", i = {0, 0}, l = {342}, m = "getString", n = {"this", "id"}, s = {"L$0", "L$1"})
    /* renamed from: ru.cyberity.cbr.core.presentation.base.CBRViewModel$getString$1, reason: invalid class name and case insensitive filesystem */
    public static final class C478521 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ CBRViewModel<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C478521(CBRViewModel<T> cBRViewModel, Continuation<? super C478521> continuation) {
            super(continuation);
            this.this$0 = cBRViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.result = obj;
            this.label |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.this$0.getString(null, this);
        }
    }

    /* compiled from: CBRViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.base.CBRViewModel", f = "CBRViewModel.kt", i = {0}, l = {350}, m = "getStrings", n = {"this"}, s = {"L$0"})
    /* renamed from: ru.cyberity.cbr.core.presentation.base.CBRViewModel$getStrings$1, reason: invalid class name and case insensitive filesystem */
    public static final class C478531 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ CBRViewModel<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C478531(CBRViewModel<T> cBRViewModel, Continuation<? super C478531> continuation) {
            super(continuation);
            this.this$0 = cBRViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.result = obj;
            this.label |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.this$0.getStrings(this);
        }
    }

    /* compiled from: CBRViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.base.CBRViewModel$prepare$1", f = "CBRViewModel.kt", i = {}, l = {161, 169, 182, 194, 201}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.core.presentation.base.CBRViewModel$prepare$1, reason: invalid class name and case insensitive filesystem */
    public static final class C478541 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        int label;
        final /* synthetic */ CBRViewModel<T> this$0;

        /* compiled from: CBRViewModel.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "T", "Lkotlinx/coroutines/T;", "Lru/cyberity/cbr/core/data/model/CBRSDKState;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lru/cyberity/cbr/core/data/model/CBRSDKState;"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.base.CBRViewModel$prepare$1$1", f = "CBRViewModel.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: ru.cyberity.cbr.core.presentation.base.CBRViewModel$prepare$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C124841 extends SuspendLambda implements p<T, Continuation<? super CBRSDKState>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CBRViewModel<T> this$0;

            /* compiled from: CBRViewModel.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "T", "Lru/cyberity/cbr/core/data/model/CBRSDKState;", "it", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.base.CBRViewModel$prepare$1$1$1", f = "CBRViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: ru.cyberity.cbr.core.presentation.base.CBRViewModel$prepare$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C124851 extends SuspendLambda implements p<CBRSDKState, Continuation<? super Boolean>, Object> {
                final /* synthetic */ T $$this$withTimeoutOrNull;
                /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C124851(T t12, Continuation<? super C124851> continuation) {
                    super(2, continuation);
                    this.$$this$withTimeoutOrNull = t12;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    C124851 c124851 = new C124851(this.$$this$withTimeoutOrNull, continuation);
                    c124851.L$0 = obj;
                    return c124851;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    CBRSDKState cBRSDKState = (CBRSDKState) this.L$0;
                    Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this.$$this$withTimeoutOrNull), "sdkState: -> " + cBRSDKState, null, 4, null);
                    return Boxing.boxBoolean(cBRSDKState != null);
                }

                @Override // Y41.p
                @l
                public final Object invoke(@l CBRSDKState cBRSDKState, @l Continuation<? super Boolean> continuation) {
                    return ((C124851) create(cBRSDKState, continuation)).invokeSuspend(G0.f406611a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C124841(CBRViewModel<T> cBRViewModel, Continuation<? super C124841> continuation) {
                super(2, continuation);
                this.this$0 = cBRViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                C124841 c124841 = new C124841(this.this$0, continuation);
                c124841.L$0 = obj;
                return c124841;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.label;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    T t12 = (T) this.L$0;
                    InterfaceC43160i<CBRSDKState> interfaceC43160iB = ((CBRViewModel) this.this$0).commonRepository.b();
                    C124851 c124851 = new C124851(t12, null);
                    this.label = 1;
                    obj = C43175k.x(interfaceC43160iB, c124851, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return obj;
            }

            @Override // Y41.p
            @l
            public final Object invoke(@k T t12, @l Continuation<? super CBRSDKState> continuation) {
                return ((C124841) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }
        }

        /* compiled from: CBRViewModel.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.base.CBRViewModel$prepare$1$2", f = "CBRViewModel.kt", i = {0, 1}, l = {171, 175, 176}, m = "invokeSuspend", n = {"$this$withContext", "configRequest"}, s = {"L$0", "L$0"})
        /* renamed from: ru.cyberity.cbr.core.presentation.base.CBRViewModel$prepare$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ CBRViewModel<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(CBRViewModel<T> cBRViewModel, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cBRViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x008a A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r7.label
                    r2 = 0
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L37
                    if (r1 == r5) goto L2f
                    if (r1 == r4) goto L23
                    if (r1 != r3) goto L1b
                    java.lang.Object r0 = r7.L$0
                    ru.cyberity.cbr.core.presentation.base.CBRViewModel r0 = (ru.cyberity.cbr.core.presentation.base.CBRViewModel) r0
                    kotlin.C42729a0.b(r8)
                    goto L8d
                L1b:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L23:
                    java.lang.Object r1 = r7.L$1
                    ru.cyberity.cbr.core.presentation.base.CBRViewModel r1 = (ru.cyberity.cbr.core.presentation.base.CBRViewModel) r1
                    java.lang.Object r4 = r7.L$0
                    kotlinx.coroutines.a0 r4 = (kotlinx.coroutines.InterfaceC43076a0) r4
                    kotlin.C42729a0.b(r8)
                    goto L77
                L2f:
                    java.lang.Object r1 = r7.L$0
                    kotlinx.coroutines.T r1 = (kotlinx.coroutines.T) r1
                    kotlin.C42729a0.b(r8)
                    goto L50
                L37:
                    kotlin.C42729a0.b(r8)
                    java.lang.Object r8 = r7.L$0
                    r1 = r8
                    kotlinx.coroutines.T r1 = (kotlinx.coroutines.T) r1
                    ru.cyberity.cbr.core.presentation.base.CBRViewModel<T extends ru.cyberity.cbr.core.presentation.base.CBRViewModel$CBRViewModelState> r8 = r7.this$0
                    ru.cyberity.cbr.core.data.source.dynamic.c r8 = ru.cyberity.cbr.core.presentation.base.CBRViewModel.access$getDataRepository$p(r8)
                    r7.L$0 = r1
                    r7.label = r5
                    java.lang.Object r8 = r8.c(r7)
                    if (r8 != r0) goto L50
                    return r0
                L50:
                    ru.cyberity.cbr.core.presentation.base.CBRViewModel$prepare$1$2$stringsRequest$1 r8 = new ru.cyberity.cbr.core.presentation.base.CBRViewModel$prepare$1$2$stringsRequest$1
                    ru.cyberity.cbr.core.presentation.base.CBRViewModel<T extends ru.cyberity.cbr.core.presentation.base.CBRViewModel$CBRViewModelState> r5 = r7.this$0
                    r8.<init>(r5, r2)
                    kotlinx.coroutines.a0 r8 = kotlinx.coroutines.C43259k.b(r1, r2, r8, r3)
                    ru.cyberity.cbr.core.presentation.base.CBRViewModel$prepare$1$2$configRequest$1 r5 = new ru.cyberity.cbr.core.presentation.base.CBRViewModel$prepare$1$2$configRequest$1
                    ru.cyberity.cbr.core.presentation.base.CBRViewModel<T extends ru.cyberity.cbr.core.presentation.base.CBRViewModel$CBRViewModelState> r6 = r7.this$0
                    r5.<init>(r6, r2)
                    kotlinx.coroutines.a0 r1 = kotlinx.coroutines.C43259k.b(r1, r2, r5, r3)
                    ru.cyberity.cbr.core.presentation.base.CBRViewModel<T extends ru.cyberity.cbr.core.presentation.base.CBRViewModel$CBRViewModelState> r5 = r7.this$0
                    r7.L$0 = r1
                    r7.L$1 = r5
                    r7.label = r4
                    java.lang.Object r8 = r8.F(r7)
                    if (r8 != r0) goto L75
                    return r0
                L75:
                    r4 = r1
                    r1 = r5
                L77:
                    ru.cyberity.cbr.core.data.source.dynamic.c$c r8 = (ru.cyberity.cbr.core.data.source.dynamic.c.C12476c) r8
                    ru.cyberity.cbr.core.presentation.base.CBRViewModel.access$set_strings$p(r1, r8)
                    ru.cyberity.cbr.core.presentation.base.CBRViewModel<T extends ru.cyberity.cbr.core.presentation.base.CBRViewModel$CBRViewModelState> r8 = r7.this$0
                    r7.L$0 = r8
                    r7.L$1 = r2
                    r7.label = r3
                    java.lang.Object r1 = r4.F(r7)
                    if (r1 != r0) goto L8b
                    return r0
                L8b:
                    r0 = r8
                    r8 = r1
                L8d:
                    ru.cyberity.cbr.core.data.model.e r8 = (ru.cyberity.cbr.core.data.model.e) r8
                    ru.cyberity.cbr.core.presentation.base.CBRViewModel.access$setConfig$p(r0, r8)
                    kotlin.G0 r8 = kotlin.G0.f406611a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.presentation.base.CBRViewModel.C478541.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // Y41.p
            @l
            public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
                return ((AnonymousClass2) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }
        }

        /* compiled from: CBRViewModel.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelInternalState;", "T", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "it", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: ru.cyberity.cbr.core.presentation.base.CBRViewModel$prepare$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends kotlin.jvm.internal.N implements Y41.l<CBRViewModelInternalState, CBRViewModelInternalState> {
            final /* synthetic */ CBRViewModel<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(CBRViewModel<T> cBRViewModel) {
                super(1);
                this.this$0 = cBRViewModel;
            }

            @Override // Y41.l
            @k
            public final CBRViewModelInternalState invoke(@k CBRViewModelInternalState cBRViewModelInternalState) {
                return CBRViewModelInternalState.copy$default(cBRViewModelInternalState, false, true, false, this.this$0.getStrings().a("sns_general_poweredBy"), this.this$0.getStrings().a("sns_general_progress_text"), 5, null);
            }
        }

        /* compiled from: CBRViewModel.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelInternalState;", "T", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "it", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: ru.cyberity.cbr.core.presentation.base.CBRViewModel$prepare$1$5, reason: invalid class name */
        public static final class AnonymousClass5 extends kotlin.jvm.internal.N implements Y41.l<CBRViewModelInternalState, CBRViewModelInternalState> {
            public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

            public AnonymousClass5() {
                super(1);
            }

            @Override // Y41.l
            @k
            public final CBRViewModelInternalState invoke(@k CBRViewModelInternalState cBRViewModelInternalState) {
                return CBRViewModelInternalState.copy$default(cBRViewModelInternalState, false, false, true, null, null, 27, null);
            }
        }

        /* compiled from: CBRViewModel.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelInternalState;", "T", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "it", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: ru.cyberity.cbr.core.presentation.base.CBRViewModel$prepare$1$6, reason: invalid class name */
        public static final class AnonymousClass6 extends kotlin.jvm.internal.N implements Y41.l<CBRViewModelInternalState, CBRViewModelInternalState> {
            final /* synthetic */ boolean $hideLogo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass6(boolean z12) {
                super(1);
                this.$hideLogo = z12;
            }

            @Override // Y41.l
            @k
            public final CBRViewModelInternalState invoke(@k CBRViewModelInternalState cBRViewModelInternalState) {
                return CBRViewModelInternalState.copy$default(cBRViewModelInternalState, this.$hideLogo, false, false, null, null, 30, null);
            }
        }

        /* compiled from: CBRViewModel.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelInternalState;", "T", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "it", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: ru.cyberity.cbr.core.presentation.base.CBRViewModel$prepare$1$7, reason: invalid class name */
        public static final class AnonymousClass7 extends kotlin.jvm.internal.N implements Y41.l<CBRViewModelInternalState, CBRViewModelInternalState> {
            public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

            public AnonymousClass7() {
                super(1);
            }

            @Override // Y41.l
            @k
            public final CBRViewModelInternalState invoke(@k CBRViewModelInternalState cBRViewModelInternalState) {
                return CBRViewModelInternalState.copy$default(cBRViewModelInternalState, false, false, false, null, null, 30, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C478541(CBRViewModel<T> cBRViewModel, Continuation<? super C478541> continuation) {
            super(2, continuation);
            this.this$0 = cBRViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new C478541(this.this$0, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00bd A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00d8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0102 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0107 A[Catch: Exception -> 0x01b3, TryCatch #0 {Exception -> 0x01b3, blocks: (B:9:0x001b, B:39:0x0103, B:41:0x0107, B:42:0x0128, B:44:0x012c, B:46:0x0140, B:49:0x0146, B:50:0x0153, B:52:0x0159, B:55:0x0168, B:65:0x017f, B:58:0x016d, B:63:0x0178, B:66:0x0183, B:73:0x01a0, B:67:0x018a, B:71:0x019c, B:74:0x01a4, B:36:0x00f4), top: B:81:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x017f A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0153 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r4v27, types: [T, java.util.Map] */
        /* JADX WARN: Type inference failed for: r4v38, types: [T, java.util.Map] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 457
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.presentation.base.CBRViewModel.C478541.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // Y41.p
        @l
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((C478541) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: CBRViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.base.CBRViewModel", f = "CBRViewModel.kt", i = {0, 0, 0}, l = {276}, m = "runWithProgressIndicator", n = {"this", "uiHandler", "showProgressAction"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: ru.cyberity.cbr.core.presentation.base.CBRViewModel$runWithProgressIndicator$1, reason: invalid class name and case insensitive filesystem */
    public static final class C478551<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ CBRViewModel<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C478551(CBRViewModel<T> cBRViewModel, Continuation<? super C478551> continuation) {
            super(continuation);
            this.this$0 = cBRViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.result = obj;
            this.label |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.this$0.runWithProgressIndicator(0L, null, this);
        }
    }

    /* compiled from: CBRViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.base.CBRViewModel$updateState$1", f = "CBRViewModel.kt", i = {}, l = {332}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.core.presentation.base.CBRViewModel$updateState$1, reason: invalid class name and case insensitive filesystem */
    public static final class C478561 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        final /* synthetic */ T $current;
        final /* synthetic */ p<T, Continuation<? super T>, Object> $update;
        Object L$0;
        int label;
        final /* synthetic */ CBRViewModel<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C478561(CBRViewModel<T> cBRViewModel, p<? super T, ? super Continuation<? super T>, ? extends Object> pVar, T t12, Continuation<? super C478561> continuation) {
            super(2, continuation);
            this.this$0 = cBRViewModel;
            this.$update = pVar;
            this.$current = t12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new C478561(this.this$0, this.$update, this.$current, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Y1 y12;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.label;
            if (i12 == 0) {
                C42729a0.b(obj);
                Y1 y13 = ((CBRViewModel) this.this$0)._viewState;
                p<T, Continuation<? super T>, Object> pVar = this.$update;
                T t12 = this.$current;
                this.L$0 = y13;
                this.label = 1;
                Object objInvoke = pVar.invoke(t12, this);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                y12 = y13;
                obj = objInvoke;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y12 = (Y1) this.L$0;
                C42729a0.b(obj);
            }
            y12.K5(obj);
            return G0.f406611a;
        }

        @Override // Y41.p
        @l
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((C478561) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    public CBRViewModel(@k ru.cyberity.cbr.core.data.source.common.a aVar, @k c cVar) {
        this.commonRepository = aVar;
        this.dataRepository = cVar;
        C43108m c43108mA = A.a(0, null, null, 7);
        this._events = c43108mA;
        InterfaceC43160i interfaceC43160iQ = C43175k.Q(c43108mA);
        kotlinx.coroutines.scheduling.c cVar2 = C43262l0.f411945a;
        InterfaceC43160i interfaceC43160iC = C43175k.c(C43175k.I(K.f411877a, interfaceC43160iQ), 0, 3);
        A1.a aVarA = N0.a(this);
        i2.a aVar2 = i2.f411430a;
        this.events = new X(C43175k.P(C43175k.S(interfaceC43160iC, aVarA, i2.a.b(aVar2, 0L, 3), 0), new CBRViewModel$events$1(this, null)), new CBRViewModel$events$2(this, null));
        this.updateStateQueue = A.a(Integer.MAX_VALUE, null, null, 6);
        e2 e2VarB = f2.b(1, 0, null, 6);
        this._viewState = e2VarB;
        this.viewState = C43175k.S(C43175k.r(e2VarB), N0.a(this), i2.a.b(aVar2, 0L, 3), 1);
        Z1<CBRViewModelInternalState> z1A = p2.a(new CBRViewModelInternalState(false, false, false, null, null, 31, null));
        this._viewModelInternalState = z1A;
        this.viewModelInternalState = C43175k.b(z1A);
        this.prepareExceptionHandler = new CBRViewModel$special$$inlined$CoroutineExceptionHandler$1(N.f410714t2, this);
        j0.b(cVar.b(), N0.a(this), new AnonymousClass1(this, null));
        C43259k.d(N0.a(this), null, null, new AnonymousClass2(this, null), 3);
        prepare();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void assertStateNotNull(T state) {
        if (state == null && n0.f432787a.isDebug()) {
            throw new IllegalStateException(("Before updating state provide default state for " + ru.cyberity.log.c.a(this) + " by overriding getDefaultState()").toString());
        }
    }

    public static /* synthetic */ void finish$default(CBRViewModel cBRViewModel, a0 a0Var, Object obj, Long l12, int i12, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: finish");
        }
        if ((i12 & 1) != 0) {
            a0Var = a0.c.f432638a;
        }
        if ((i12 & 2) != 0) {
            obj = null;
        }
        if ((i12 & 4) != 0) {
            l12 = null;
        }
        cBRViewModel.finish(a0Var, obj, l12);
    }

    private final void onCancel(CBRCompletionResult result) {
        Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "Completion the SDK with result - " + result, null, 4, null);
        finish$default(this, new a0.d(result), null, null, 6, null);
    }

    public static /* synthetic */ Object onPrepare$suspendImpl(CBRViewModel cBRViewModel, Continuation continuation) {
        return G0.f406611a;
    }

    private final kotlinx.coroutines.N0 prepare() {
        A1.a aVarA = N0.a(this);
        kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
        return C43259k.d(aVarA, K.f411877a.plus(this.prepareExceptionHandler), null, new C478541(this, null), 2);
    }

    public static /* synthetic */ Object runWithProgressIndicator$default(CBRViewModel cBRViewModel, long j12, Y41.l lVar, Continuation continuation, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: runWithProgressIndicator");
        }
        if ((i12 & 1) != 0) {
            j12 = 300;
        }
        return cBRViewModel.runWithProgressIndicator(j12, lVar, continuation);
    }

    public static /* synthetic */ void throwError$default(CBRViewModel cBRViewModel, Throwable th2, String str, Object obj, int i12, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: throwError");
        }
        if ((i12 & 4) != 0) {
            obj = null;
        }
        cBRViewModel.throwError(th2, str, obj);
    }

    public static /* synthetic */ void updateState$default(CBRViewModel cBRViewModel, boolean z12, p pVar, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateState");
        }
        if ((i12 & 1) != 0) {
            z12 = false;
        }
        cBRViewModel.updateState(z12, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitStringsReady(@Y61.k kotlin.coroutines.Continuation<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ru.cyberity.cbr.core.presentation.base.CBRViewModel.C478491
            if (r0 == 0) goto L13
            r0 = r7
            ru.cyberity.cbr.core.presentation.base.CBRViewModel$awaitStringsReady$1 r0 = (ru.cyberity.cbr.core.presentation.base.CBRViewModel.C478491) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.presentation.base.CBRViewModel$awaitStringsReady$1 r0 = new ru.cyberity.cbr.core.presentation.base.CBRViewModel$awaitStringsReady$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r7)
            goto L45
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            kotlin.C42729a0.b(r7)
            ru.cyberity.cbr.core.presentation.base.CBRViewModel$awaitStringsReady$2 r7 = new ru.cyberity.cbr.core.presentation.base.CBRViewModel$awaitStringsReady$2
            r2 = 0
            r7.<init>(r6, r2)
            r0.label = r3
            r4 = 25000(0x61a8, double:1.23516E-319)
            java.lang.Object r7 = kotlinx.coroutines.D1.c(r4, r7, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            if (r7 == 0) goto L48
            goto L49
        L48:
            r3 = 0
        L49:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.presentation.base.CBRViewModel.awaitStringsReady(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void checkThrowableIsCritical(@k Throwable t12) {
        Integer code;
        if ((t12 instanceof CBRException.Api) && (code = ((CBRException.Api) t12).getCode()) != null && code.intValue() == 401) {
            throwError$default(this, t12, getDocumentType(), null, 4, null);
        }
    }

    @k
    public final T currentState() {
        T t12 = (T) C42745f0.G(this._viewState.E3());
        return t12 == null ? (T) getDefaultState() : t12;
    }

    public final void finish(@k a0 reason, @l Object payload, @l Long delay) {
        fireEvent(new FinishEvent(reason, payload, delay));
    }

    @InterfaceC42153i
    public void fireEvent(@k CBRViewModelEvent event) {
        C43259k.d(N0.a(this), null, null, new C478511(this, event, null), 3);
    }

    @l
    public final e getConfig() {
        return this.config;
    }

    @l
    public T getDefaultState() {
        return null;
    }

    @k
    public String getDocumentType() {
        return "TYPE_UNKNOWN";
    }

    @k
    public final InterfaceC43160i<CBRViewModelEvent> getEvents() {
        return this.events;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getString(@Y61.l java.lang.String r5, @Y61.k kotlin.coroutines.Continuation<? super java.lang.String> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ru.cyberity.cbr.core.presentation.base.CBRViewModel.C478521
            if (r0 == 0) goto L13
            r0 = r6
            ru.cyberity.cbr.core.presentation.base.CBRViewModel$getString$1 r0 = (ru.cyberity.cbr.core.presentation.base.CBRViewModel.C478521) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.presentation.base.CBRViewModel$getString$1 r0 = new ru.cyberity.cbr.core.presentation.base.CBRViewModel$getString$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.L$0
            ru.cyberity.cbr.core.presentation.base.CBRViewModel r0 = (ru.cyberity.cbr.core.presentation.base.CBRViewModel) r0
            kotlin.C42729a0.b(r6)
            goto L4a
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.C42729a0.b(r6)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r4.awaitStringsReady(r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            r0 = r4
        L4a:
            if (r5 != 0) goto L4e
            r5 = 0
            goto L56
        L4e:
            ru.cyberity.cbr.core.data.source.dynamic.c$c r6 = r0.getStrings()
            java.lang.String r5 = r6.a(r5)
        L56:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.presentation.base.CBRViewModel.getString(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @k
    public final c.C12476c getStrings() {
        c.C12476c c12476c = this._strings;
        if (c12476c != null) {
            return c12476c;
        }
        Logger.e$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "Accessing strings before onPrepared()", null, 4, null);
        return new c.C12476c(null, null, 3, null);
    }

    @k
    public final n2<CBRViewModelInternalState> getViewModelInternalState() {
        return this.viewModelInternalState;
    }

    @k
    public d2<T> getViewState() {
        return this.viewState;
    }

    @Override // androidx.view.M0
    public void onCleared() {
        super.onCleared();
        Logger.v$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "onCleared", null, 4, null);
        this.updateStateQueue.c(null);
    }

    public void onHandleError(@k ru.cyberity.cbr.core.data.model.p error) {
        Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "Handle error: " + error, null, 4, null);
        if (error instanceof p.b) {
            onLoad();
        } else if (error instanceof p.a) {
            onCancel(new CBRCompletionResult.AbnormalTermination(error.getException()));
        }
    }

    public final void onLinkClicked(@k String url) {
        try {
            Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "An user has clicked on ".concat(url), null, 4, null);
            if (url.equals(AttachMenuItem.Support.KEY)) {
                fireEvent(ShowSupportEvent.INSTANCE);
            } else {
                fireEvent(new OpenUrlEvent(url));
            }
        } catch (Throwable th2) {
            ru.cyberity.log.a.f436064a.e(ru.cyberity.log.c.a(this), "onLinkClicked", th2);
        }
    }

    @l
    public Object onPrepare(@k Continuation<? super G0> continuation) {
        return onPrepare$suspendImpl(this, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    @j.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object runWithProgressIndicator(long r6, @Y61.k Y41.l<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r8, @Y61.k kotlin.coroutines.Continuation<? super T> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof ru.cyberity.cbr.core.presentation.base.CBRViewModel.C478551
            if (r0 == 0) goto L13
            r0 = r9
            ru.cyberity.cbr.core.presentation.base.CBRViewModel$runWithProgressIndicator$1 r0 = (ru.cyberity.cbr.core.presentation.base.CBRViewModel.C478551) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.presentation.base.CBRViewModel$runWithProgressIndicator$1 r0 = new ru.cyberity.cbr.core.presentation.base.CBRViewModel$runWithProgressIndicator$1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.L$2
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            java.lang.Object r7 = r0.L$1
            android.os.Handler r7 = (android.os.Handler) r7
            java.lang.Object r8 = r0.L$0
            ru.cyberity.cbr.core.presentation.base.CBRViewModel r8 = (ru.cyberity.cbr.core.presentation.base.CBRViewModel) r8
            kotlin.C42729a0.b(r9)
            goto L65
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            kotlin.C42729a0.b(r9)
            android.os.Handler r9 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r9.<init>(r2)
            ru.cyberity.cbr.core.presentation.base.a r2 = new ru.cyberity.cbr.core.presentation.base.a
            r4 = 0
            r2.<init>(r5)
            r9.postDelayed(r2, r6)
            r0.L$0 = r5
            r0.L$1 = r9
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r6 = r8.invoke(r0)
            if (r6 != r1) goto L61
            return r1
        L61:
            r8 = r5
            r7 = r9
            r9 = r6
            r6 = r2
        L65:
            r7.removeCallbacks(r6)
            ru.cyberity.cbr.core.presentation.base.a r6 = new ru.cyberity.cbr.core.presentation.base.a
            r0 = 1
            r6.<init>(r8)
            r7.post(r6)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.presentation.base.CBRViewModel.runWithProgressIndicator(long, Y41.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean shouldHideLogo() {
        return this.viewModelInternalState.getValue().getHideLogo();
    }

    public final void showProgress(boolean show) {
        fireEvent(new ShowProgressEvent(show));
    }

    public final void throwError(@l ru.cyberity.cbr.core.data.model.p error, @k String idDocSetType) {
        Throwable exception;
        if (L.f(this.isAttachedToFragment, Boolean.FALSE)) {
            return;
        }
        ru.cyberity.log.a.f436064a.e(ru.cyberity.log.c.a(this), "An error happened", error != null ? error.getException() : null);
        if ((error instanceof p.b ? true : error instanceof p.a) && (exception = error.getException()) != null) {
            C43259k.d(N0.a(this), C43135f1.f411090b, null, new CBRViewModel$throwError$1$1(exception, null), 2);
        }
        c.C12476c c12476c = this._strings;
        fireEvent(new ErrorEvent(error, idDocSetType, c12476c != null ? c12476c.a("sns_alert_action_ok") : null));
    }

    public final void updateState(boolean immediately, @k Y41.p<? super T, ? super Continuation<? super T>, ? extends Object> update) {
        if (!immediately) {
            this.updateStateQueue.w(update);
            return;
        }
        CBRViewModelState cBRViewModelStateCurrentState = currentState();
        assertStateNotNull(cBRViewModelStateCurrentState);
        C43259k.d(N0.a(this), null, null, new C478561(this, update, cBRViewModelStateCurrentState, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getStrings(@Y61.k kotlin.coroutines.Continuation<? super ru.cyberity.cbr.core.data.source.dynamic.c.C12476c> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ru.cyberity.cbr.core.presentation.base.CBRViewModel.C478531
            if (r0 == 0) goto L13
            r0 = r5
            ru.cyberity.cbr.core.presentation.base.CBRViewModel$getStrings$1 r0 = (ru.cyberity.cbr.core.presentation.base.CBRViewModel.C478531) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.presentation.base.CBRViewModel$getStrings$1 r0 = new ru.cyberity.cbr.core.presentation.base.CBRViewModel$getStrings$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            ru.cyberity.cbr.core.presentation.base.CBRViewModel r0 = (ru.cyberity.cbr.core.presentation.base.CBRViewModel) r0
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
            java.lang.Object r5 = r4.awaitStringsReady(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            ru.cyberity.cbr.core.data.source.dynamic.c$c r5 = r0.getStrings()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.presentation.base.CBRViewModel.getStrings(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: CBRViewModel.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$ShowPermissionDialog;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "", "dialogId", "", "message", "positiveButton", "negativeButton", "<init>", "(ILjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "I", "getDialogId", "Ljava/lang/CharSequence;", "getMessage", "()Ljava/lang/CharSequence;", "getPositiveButton", "getNegativeButton", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class ShowPermissionDialog implements CBRViewModelEvent {
        private final int dialogId;

        @l
        private final CharSequence message;

        @l
        private final CharSequence negativeButton;

        @l
        private final CharSequence positiveButton;

        public ShowPermissionDialog(int i12, @l CharSequence charSequence, @l CharSequence charSequence2, @l CharSequence charSequence3) {
            this.dialogId = i12;
            this.message = charSequence;
            this.positiveButton = charSequence2;
            this.negativeButton = charSequence3;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowPermissionDialog)) {
                return false;
            }
            ShowPermissionDialog showPermissionDialog = (ShowPermissionDialog) other;
            return this.dialogId == showPermissionDialog.dialogId && L.f(this.message, showPermissionDialog.message) && L.f(this.positiveButton, showPermissionDialog.positiveButton) && L.f(this.negativeButton, showPermissionDialog.negativeButton);
        }

        public final int getDialogId() {
            return this.dialogId;
        }

        @l
        public final CharSequence getMessage() {
            return this.message;
        }

        @l
        public final CharSequence getNegativeButton() {
            return this.negativeButton;
        }

        @l
        public final CharSequence getPositiveButton() {
            return this.positiveButton;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.dialogId) * 31;
            CharSequence charSequence = this.message;
            int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
            CharSequence charSequence2 = this.positiveButton;
            int iHashCode3 = (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.negativeButton;
            return iHashCode3 + (charSequence3 != null ? charSequence3.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ShowPermissionDialog(dialogId=");
            sb2.append(this.dialogId);
            sb2.append(", message=");
            sb2.append((Object) this.message);
            sb2.append(", positiveButton=");
            sb2.append((Object) this.positiveButton);
            sb2.append(", negativeButton=");
            return AK.c.r(sb2, this.negativeButton, ')');
        }

        public /* synthetic */ ShowPermissionDialog(int i12, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i13, C42822w c42822w) {
            this((i13 & 1) != 0 ? 0 : i12, charSequence, charSequence2, charSequence3);
        }
    }

    public final void throwError(@k Throwable e12, @k String idDocSetType, @l Object payload) {
        ru.cyberity.cbr.core.data.model.p pVarA = y.a(e12, payload);
        if (pVarA != null) {
            throwError(pVarA, idDocSetType);
        }
    }

    public void onLoad() {
    }

    public void onErrorCancelled(@k ru.cyberity.cbr.core.data.model.p error) {
    }
}
