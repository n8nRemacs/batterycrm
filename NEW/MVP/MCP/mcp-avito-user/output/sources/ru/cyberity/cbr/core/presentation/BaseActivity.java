package ru.cyberity.cbr.core.presentation;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;
import androidx.appcompat.app.m;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import j.InterfaceC42153i;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43189o1;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.b;
import ru.cyberity.cbr.core.common.CBRSession;
import ru.cyberity.cbr.core.common.j0;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel.CBRViewModelState;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRColorElement;
import ru.cyberity.cbr.core.theme.d;
import ru.cyberity.log.a;
import ru.cyberity.log.c;
import ru.cyberity.log.logger.Logger;

/* compiled from: BaseActivity.kt */
@Metadata(d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u00014\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0015¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\u0007J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0015\u001a\u00020\nH$¢\u0006\u0004\b\u0015\u0010\u0007J\u000f\u0010\u0016\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0016\u0010\u0007J\u000f\u0010\u0017\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0017\u0010\u0007J\u000f\u0010\u0019\u001a\u00020\u0018H$¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b \u0010!J+\u0010(\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020*8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R$\u00101\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000f8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103R \u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00109\u001a\u00028\u00018$X¤\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0016\u0010A\u001a\u0004\u0018\u00010>8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lru/cyberity/cbr/core/presentation/BaseActivity;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "S", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel;", "VM", "Landroidx/appcompat/app/m;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/G0;", "onCreate", "(Landroid/os/Bundle;)V", "onViewReady", "onDestroy", "", "hideLogo", "updatePoweredByVisibility", "(Z)V", "outState", "onSaveInstanceState", "onCancelByHost", "onResume", "onPause", "", "getLayoutId", "()I", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "event", "handleEvent", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;)V", VoiceInfo.STATE, "handleState", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;)V", "Lru/cyberity/cbr/core/data/model/p;", "error", "", "idDocSetType", "", "buttonText", "onError", "(Lru/cyberity/cbr/core/data/model/p;Ljava/lang/String;Ljava/lang/CharSequence;)V", "Lru/cyberity/cbr/core/b;", "serviceLocator$delegate", "Lkotlin/C;", "getServiceLocator", "()Lru/cyberity/cbr/core/b;", "serviceLocator", "<set-?>", "isPrepared", "Z", "()Z", "ru/cyberity/cbr/core/presentation/BaseActivity$broadcastReceiver$1", "broadcastReceiver", "Lru/cyberity/cbr/core/presentation/BaseActivity$broadcastReceiver$1;", "getViewModel", "()Lru/cyberity/cbr/core/presentation/base/CBRViewModel;", "viewModel", "Lru/cyberity/cbr/core/common/CBRSession;", "getSession", "()Lru/cyberity/cbr/core/common/CBRSession;", "session", "Landroid/widget/TextView;", "getPoweredByText", "()Landroid/widget/TextView;", "poweredByText", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public abstract class BaseActivity<S extends CBRViewModel.CBRViewModelState, VM extends CBRViewModel<S>> extends m {
    private boolean isPrepared;

    /* renamed from: serviceLocator$delegate, reason: from kotlin metadata */
    @k
    private final InterfaceC42726C serviceLocator = C42727D.c(new BaseActivity$serviceLocator$2(this));

    @k
    private final BaseActivity$broadcastReceiver$1 broadcastReceiver = new BroadcastReceiver(this) { // from class: ru.cyberity.cbr.core.presentation.BaseActivity$broadcastReceiver$1
        final /* synthetic */ BaseActivity<S, VM> this$0;

        {
            this.this$0 = this;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@l Context context, @l Intent intent) {
            if (L.f(intent != null ? intent.getAction() : null, "ru.cyberity.cbr.intent.ACTION_CLOSE")) {
                Logger.d$default(a.f436064a, c.a(this), "ACTION_CLOSE received. Finishing...", null, 4, null);
                this.this$0.onCancelByHost();
            }
        }
    };

    /* compiled from: BaseActivity.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: ru.cyberity.cbr.core.presentation.BaseActivity$onCreate$3, reason: invalid class name */
    public /* synthetic */ class AnonymousClass3 extends C42801a implements p<CBRViewModel.CBRViewModelEvent, Continuation<? super G0>, Object>, SuspendFunction {
        public AnonymousClass3(Object obj) {
            super(2, obj, BaseActivity.class, "handleEvent", "handleEvent(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;)V", 4);
        }

        @Override // Y41.p
        @l
        public final Object invoke(@k CBRViewModel.CBRViewModelEvent cBRViewModelEvent, @k Continuation<? super G0> continuation) {
            return BaseActivity.onCreate$handleEvent((BaseActivity) this.receiver, cBRViewModelEvent, continuation);
        }
    }

    /* compiled from: BaseActivity.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "S", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel;", "VM", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelInternalState;", "it", "Lkotlin/G0;", "<anonymous>", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelInternalState;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.BaseActivity$onCreate$4", f = "BaseActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.core.presentation.BaseActivity$onCreate$4, reason: invalid class name */
    public static final class AnonymousClass4 extends SuspendLambda implements p<CBRViewModel.CBRViewModelInternalState, Continuation<? super G0>, Object> {
        final /* synthetic */ TextView $progressTextView;
        final /* synthetic */ Bundle $savedInstanceState;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseActivity<S, VM> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(BaseActivity<S, VM> baseActivity, TextView textView, Bundle bundle, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = baseActivity;
            this.$progressTextView = textView;
            this.$savedInstanceState = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$progressTextView, this.$savedInstanceState, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            CBRViewModel.CBRViewModelInternalState cBRViewModelInternalState = (CBRViewModel.CBRViewModelInternalState) this.L$0;
            this.this$0.updatePoweredByVisibility(cBRViewModelInternalState.getHideLogo());
            TextView poweredByText = this.this$0.getPoweredByText();
            if (poweredByText != null) {
                s.a(poweredByText, cBRViewModelInternalState.getPoweredByText());
            }
            TextView textView = this.$progressTextView;
            if (textView != null) {
                s.a(textView, cBRViewModelInternalState.getProgressText());
            }
            if (this.this$0.getIsPrepared() != cBRViewModelInternalState.getIsViewModelPrepared()) {
                ((BaseActivity) this.this$0).isPrepared = cBRViewModelInternalState.getIsViewModelPrepared();
                this.this$0.onViewReady(this.$savedInstanceState);
            }
            return G0.f406611a;
        }

        @Override // Y41.p
        @l
        public final Object invoke(@k CBRViewModel.CBRViewModelInternalState cBRViewModelInternalState, @l Continuation<? super G0> continuation) {
            return ((AnonymousClass4) create(cBRViewModelInternalState, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: BaseActivity.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: ru.cyberity.cbr.core.presentation.BaseActivity$onCreate$5, reason: invalid class name */
    public /* synthetic */ class AnonymousClass5 extends C42801a implements p<S, Continuation<? super G0>, Object>, SuspendFunction {
        public AnonymousClass5(Object obj) {
            super(2, obj, BaseActivity.class, "handleState", "handleState(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;)V", 4);
        }

        @Override // Y41.p
        @l
        public final Object invoke(@k S s5, @k Continuation<? super G0> continuation) {
            return BaseActivity.onCreate$handleState((BaseActivity) this.receiver, s5, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onCreate$handleEvent(BaseActivity baseActivity, CBRViewModel.CBRViewModelEvent cBRViewModelEvent, Continuation continuation) {
        baseActivity.handleEvent(cBRViewModelEvent);
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onCreate$handleState(BaseActivity baseActivity, CBRViewModel.CBRViewModelState cBRViewModelState, Continuation continuation) {
        baseActivity.handleState(cBRViewModelState);
        return G0.f406611a;
    }

    public abstract int getLayoutId();

    @l
    public TextView getPoweredByText() {
        return (TextView) findViewById(R.id.cbr_powered);
    }

    @k
    public final b getServiceLocator() {
        return (b) this.serviceLocator.getValue();
    }

    @k
    public final CBRSession getSession() {
        return (CBRSession) getIntent().getParcelableExtra("sns_extra_session");
    }

    @k
    public abstract VM getViewModel();

    @InterfaceC42153i
    public void handleEvent(@k CBRViewModel.CBRViewModelEvent event) {
        if (event instanceof CBRViewModel.ErrorEvent) {
            CBRViewModel.ErrorEvent errorEvent = (CBRViewModel.ErrorEvent) event;
            onError(errorEvent.getError(), errorEvent.getIdDocSetType(), errorEvent.getButtonText());
        }
    }

    /* renamed from: isPrepared, reason: from getter */
    public final boolean getIsPrepared() {
        return this.isPrepared;
    }

    public abstract void onCancelByHost();

    @Override // androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public void onCreate(@l Bundle savedInstanceState) {
        if (n0.f432787a.isDebug()) {
            Logger.v$default(a.f436064a, c.a(this), getClass().getSimpleName().concat(".onCreate"), null, 4, null);
        }
        if (savedInstanceState != null && savedInstanceState.containsKey("sns_extra_session")) {
            Parcelable parcelable = savedInstanceState.getParcelable("sns_extra_session");
            CBRSession cBRSession = parcelable instanceof CBRSession ? (CBRSession) parcelable : null;
            if (cBRSession != null) {
                getIntent().putExtra("sns_extra_session", cBRSession);
            }
        }
        getServiceLocator().z().a(getSession().getSessionId());
        Integer theme = getServiceLocator().getSession().getTheme();
        setTheme(theme != null ? theme.intValue() : R.style.Theme_CBRCore);
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        d customTheme = themeHelper.getCustomTheme();
        if (customTheme != null) {
            Integer color = themeHelper.getColor(customTheme, CBRColorElement.STATUS_BAR_COLOR, s.a(getResources().getConfiguration()));
            if (color != null) {
                int iIntValue = color.intValue();
                getWindow().addFlags(BeduinInputModel.MIN_TEXT_VERSION);
                getWindow().setStatusBarColor(iIntValue);
            }
        }
        TextView textView = (TextView) findViewById(R.id.cbr_progress_text);
        j0.a(getViewModel().getEvents(), this, new AnonymousClass3(this));
        j0.b(getViewModel().getViewModelInternalState(), this, new AnonymousClass4(this, textView, savedInstanceState, null));
        j0.b(new C43189o1(getViewModel().getViewState()), this, new AnonymousClass5(this));
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public void onDestroy() {
        if (n0.f432787a.isDebug()) {
            Logger.v$default(a.f436064a, c.a(this), getClass().getSimpleName().concat(".onDestroy"), null, 4, null);
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC22955m, android.app.Activity
    public void onPause() {
        try {
            unregisterReceiver(this.broadcastReceiver);
        } catch (Throwable th2) {
            a.f436064a.e(c.a(this), "Receiver unregistering error", th2);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC22955m, android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            androidx.core.content.d.registerReceiver(this, this.broadcastReceiver, new IntentFilter("ru.cyberity.cbr.intent.ACTION_CLOSE"), 4);
        } catch (Throwable th2) {
            a.f436064a.e(c.a(this), "Receiver registering error", th2);
        }
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public void onSaveInstanceState(@k Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable("sns_extra_session", getServiceLocator().getSession());
    }

    public void updatePoweredByVisibility(boolean hideLogo) {
        TextView textView = (TextView) findViewById(R.id.cbr_powered);
        if (textView != null) {
            s.a(textView, hideLogo);
        }
    }

    public void handleState(@k S state) {
    }

    @InterfaceC42153i
    public void onViewReady(@l Bundle savedInstanceState) {
    }

    public void onError(@l ru.cyberity.cbr.core.data.model.p error, @k String idDocSetType, @l CharSequence buttonText) {
    }
}
