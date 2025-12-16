package ru.cyberity.cbr.core.presentation;

import Y41.p;
import Y61.k;
import Y61.l;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.j;
import androidx.core.view.F0;
import androidx.core.view.L0;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.Fragment;
import androidx.view.C22981N;
import com.avito.android.remote.model.category_parameters.HiddenParameter;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import e11.ViewOnClickListenerC39879j1;
import j.I;
import j.InterfaceC42153i;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.reflect.n;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43189o1;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.analytics.Screen;
import ru.cyberity.cbr.core.b;
import ru.cyberity.cbr.core.common.LifecycleAwareFindView;
import ru.cyberity.cbr.core.common.a0;
import ru.cyberity.cbr.core.common.g;
import ru.cyberity.cbr.core.common.h;
import ru.cyberity.cbr.core.common.i0;
import ru.cyberity.cbr.core.common.j0;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.data.listener.CBRIconHandler;
import ru.cyberity.cbr.core.data.model.CBRCompletionResult;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel.CBRViewModelState;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.presentation.support.CBRSupportFragment;
import ru.cyberity.cbr.core.presentation.util.FragmentUniqueIdHolder;
import ru.cyberity.cbr.core.theme.CBRColorElement;
import ru.cyberity.cbr.core.theme.CBRMetricElement;
import ru.cyberity.cbr.core.theme.d;
import ru.cyberity.cbr.core.widget.CBRToolbarView;
import ru.cyberity.log.a;
import ru.cyberity.log.c;
import ru.cyberity.log.logger.Logger;

/* compiled from: BaseFragment.kt */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 ¢\u0001*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0005:\u0002¢\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0007J\u0019\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\rJ-\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0004¢\u0006\u0004\b\u001b\u0010\u0007J!\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010\u0007J\u000f\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010\u0007J\u000f\u0010!\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\u0007J#\u0010%\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\nH\u0004¢\u0006\u0004\b%\u0010&J#\u0010'\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\nH\u0004¢\u0006\u0004\b'\u0010&J1\u0010.\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,H\u0014¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\b2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\b2\u0006\u00104\u001a\u000200H\u0014¢\u0006\u0004\b5\u00103J\u0017\u00107\u001a\u00020\b2\u0006\u00106\u001a\u000200H\u0014¢\u0006\u0004\b7\u00103J\u0019\u00108\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0015¢\u0006\u0004\b8\u0010\rJ\u0017\u0010;\u001a\u00020\b2\u0006\u0010:\u001a\u000209H\u0015¢\u0006\u0004\b;\u0010<J!\u0010=\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00028\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b=\u0010>J+\u0010=\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00028\u00002\b\u0010?\u001a\u0004\u0018\u00018\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b=\u0010@J\u000f\u0010A\u001a\u000200H\u0004¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020CH\u0004¢\u0006\u0004\bD\u0010EJ#\u0010H\u001a\u00020\b2\u0006\u0010F\u001a\u00020\u00052\n\b\u0002\u0010G\u001a\u0004\u0018\u00010CH\u0004¢\u0006\u0004\bH\u0010IJ\u0015\u0010L\u001a\u00020\b2\u0006\u0010K\u001a\u00020J¢\u0006\u0004\bL\u0010MJ\u0015\u0010N\u001a\u00020\b2\u0006\u0010K\u001a\u00020J¢\u0006\u0004\bN\u0010MJ\u0017\u0010P\u001a\u0002002\u0006\u0010O\u001a\u00020(H\u0017¢\u0006\u0004\bP\u0010QJ\u000f\u0010S\u001a\u00020RH\u0016¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\bH\u0016¢\u0006\u0004\bU\u0010\u0007J#\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010V\u001a\u0004\u0018\u00010C¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\"H%¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\bH\u0002¢\u0006\u0004\b[\u0010\u0007J\u000f\u0010\\\u001a\u00020\bH\u0002¢\u0006\u0004\b\\\u0010\u0007J\u000f\u0010]\u001a\u00020\bH\u0002¢\u0006\u0004\b]\u0010\u0007J\u000f\u0010^\u001a\u00020\bH\u0002¢\u0006\u0004\b^\u0010\u0007R\u001a\u0010`\u001a\u00020_8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR&\u0010e\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020*0d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR&\u0010i\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020*0d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bi\u0010f\u001a\u0004\bj\u0010hR&\u0010k\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020*0d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bk\u0010f\u001a\u0004\bl\u0010hR&\u0010m\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020*0d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010f\u001a\u0004\bn\u0010hR\u001a\u0010o\u001a\u0002008\u0016X\u0096D¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bo\u0010BR\u001a\u0010q\u001a\u00020C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010ER\u0016\u0010t\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010v\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010uR\u0016\u0010w\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010uR\u0016\u0010x\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010uR\u0018\u0010y\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR$\u0010|\u001a\u0002002\u0006\u0010{\u001a\u0002008\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b|\u0010p\u001a\u0004\b|\u0010BR\u0016\u0010}\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010pR!\u0010\u0083\u0001\u001a\u0004\u0018\u00010~8DX\u0084\u0084\u0002¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0017\u0010\u0089\u0001\u001a\u00028\u00018$X¤\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0016\u0010\u008b\u0001\u001a\u00020C8$X¤\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010ER\u0019\u0010\u008d\u0001\u001a\u0004\u0018\u00010~8TX\u0094\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u0082\u0001R\u0015\u0010\u0091\u0001\u001a\u00030\u008e\u00018F¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R \u0010\u0095\u0001\u001a\u000b\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0092\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0096\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001a\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009a\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001a\u0010¡\u0001\u001a\u0005\u0018\u00010\u009e\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010 \u0001¨\u0006£\u0001"}, d2 = {"Lru/cyberity/cbr/core/presentation/BaseFragment;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "S", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel;", "VM", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lkotlin/G0;", "onResume", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelInternalState;", VoiceInfo.STATE, "updateCommonUiState", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelInternalState;)V", "initCommonUI", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onStop", "onDestroyView", "", "result", "data", "setResult", "(ILandroid/os/Bundle;)V", "finishWithResult", "Lru/cyberity/cbr/core/common/a0;", "reason", "", "payload", "", "delay", "finish", "(Lru/cyberity/cbr/core/common/a0;Ljava/lang/Object;Ljava/lang/Long;)V", "", HiddenParameter.TYPE, "onHiddenChanged", "(Z)V", "showProgress", "updateShowProgress", "hideLogo", "updatePoweredByVisibility", "onViewModelPrepared", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "event", "handleEvent", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;)V", "handleState", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;Landroid/os/Bundle;)V", "prevState", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;Landroid/os/Bundle;)V", "isForResult", "()Z", "", "getFragmentRequestKey", "()Ljava/lang/String;", "fragment", "tag", "navigateTo", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "Lru/cyberity/cbr/core/data/model/p;", "error", "onHandleError", "(Lru/cyberity/cbr/core/data/model/p;)V", "onErrorCancelled", "finishReason", "onFinishCalled", "(Lru/cyberity/cbr/core/common/a0;)Z", "Lru/cyberity/cbr/core/data/model/CBRCompletionResult;", "onCancelResult", "()Lru/cyberity/cbr/core/data/model/CBRCompletionResult;", "onCloseButtonClick", "requestKey", "forResult", "(Ljava/lang/String;)Lru/cyberity/cbr/core/presentation/BaseFragment;", "getLayoutId", "()I", "hideSystemUI", "showSystemUI", "setDefaultFragmentResult", "initToolbar", "Lru/cyberity/cbr/core/analytics/Screen;", "screen", "Lru/cyberity/cbr/core/analytics/Screen;", "getScreen", "()Lru/cyberity/cbr/core/analytics/Screen;", "", "openPayload", "Ljava/util/Map;", "getOpenPayload", "()Ljava/util/Map;", "appearPayload", "getAppearPayload", "cancelPayload", "getCancelPayload", "closePayload", "getClosePayload", "isTransparentStatusBar", "Z", "logTag", "Ljava/lang/String;", "getLogTag", "statusBarColor", "I", "navigationBarColor", "sysUiVisibility", "windowFlags", "lastViewState", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "<set-?>", "isPrepared", "isResultSet", "Landroid/widget/TextView;", "progressTextView$delegate", "Lru/cyberity/cbr/core/common/LifecycleAwareFindView;", "getProgressTextView", "()Landroid/widget/TextView;", "progressTextView", "Lru/cyberity/cbr/core/presentation/util/FragmentUniqueIdHolder;", "uniqueIdHolder", "Lru/cyberity/cbr/core/presentation/util/FragmentUniqueIdHolder;", "getViewModel", "()Lru/cyberity/cbr/core/presentation/base/CBRViewModel;", "viewModel", "getIdDocSetType", "idDocSetType", "getPoweredByText", "poweredByText", "Lru/cyberity/cbr/core/analytics/c;", "getAnalyticsDelegate", "()Lru/cyberity/cbr/core/analytics/c;", "analyticsDelegate", "Lru/cyberity/cbr/core/presentation/BaseActivity;", "getBaseActivity", "()Lru/cyberity/cbr/core/presentation/BaseActivity;", "baseActivity", "Lru/cyberity/cbr/core/b;", "getServiceLocator", "()Lru/cyberity/cbr/core/b;", "serviceLocator", "Lru/cyberity/cbr/core/common/g;", "getAppListener", "()Lru/cyberity/cbr/core/common/g;", "appListener", "Lru/cyberity/cbr/core/common/h;", "getNavigation", "()Lru/cyberity/cbr/core/common/h;", "navigation", "Companion", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public abstract class BaseFragment<S extends CBRViewModel.CBRViewModelState, VM extends CBRViewModel<S>> extends Fragment {
    static final /* synthetic */ n<Object>[] $$delegatedProperties = {m0.f406844a.i(new h0(BaseFragment.class, "progressTextView", "getProgressTextView()Landroid/widget/TextView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);
    private boolean isPrepared;
    private boolean isResultSet;
    private final boolean isTransparentStatusBar;

    @l
    private S lastViewState;
    private int navigationBarColor;
    private int statusBarColor;
    private int sysUiVisibility;
    private int windowFlags;

    @k
    private final Screen screen = CBRAnalyticsScreenMapper.INSTANCE.getScreenByFragment(this);

    @k
    private final Map<String, Object> openPayload = P0.c();

    @k
    private final Map<String, Object> appearPayload = P0.c();

    @k
    private final Map<String, Object> cancelPayload = P0.c();

    @k
    private final Map<String, Object> closePayload = P0.c();

    @k
    private final String logTag = c.a(this);

    /* renamed from: progressTextView$delegate, reason: from kotlin metadata */
    @k
    private final LifecycleAwareFindView progressTextView = i0.a(this, R.id.cbr_progress_text);

    @k
    private final FragmentUniqueIdHolder uniqueIdHolder = new FragmentUniqueIdHolder();

    /* compiled from: BaseFragment.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\n¨\u0006\u0010"}, d2 = {"Lru/cyberity/cbr/core/presentation/BaseFragment$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", "", "isSuccessResult", "(Landroid/os/Bundle;)Z", "", "ARG_NAV_BAR_COLOR", "Ljava/lang/String;", "ARG_STATUS_BAR_COLOR", "ARG_UI_VISIBILITY", "ARG_WINDOW_FLAGS", "FRAGMENT_REQUEST_KEY", "FRAGMENT_RESULT_KEY", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public final boolean isSuccessResult(@k Bundle bundle) {
            return bundle.getInt("fragment_result_key") == -1;
        }

        private Companion() {
        }
    }

    /* compiled from: BaseFragment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u00020\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "S", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel;", "VM", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.BaseFragment$navigateTo$1", f = "BaseFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.core.presentation.BaseFragment$navigateTo$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        final /* synthetic */ Fragment $fragment;
        final /* synthetic */ String $tag;
        int label;
        final /* synthetic */ BaseFragment<S, VM> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BaseFragment<S, VM> baseFragment, Fragment fragment, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = baseFragment;
            this.$fragment = fragment;
            this.$tag = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$fragment, this.$tag, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            if (!this.this$0.isAdded()) {
                return G0.f406611a;
            }
            h navigation2 = this.this$0.getNavigation();
            if (navigation2 != null) {
                navigation2.a(this.$fragment, this.$tag);
            }
            return G0.f406611a;
        }

        @Override // Y41.p
        @l
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((AnonymousClass1) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: BaseFragment.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: ru.cyberity.cbr.core.presentation.BaseFragment$onViewCreated$1, reason: invalid class name and case insensitive filesystem */
    public /* synthetic */ class C478471 extends C42801a implements p<CBRViewModel.CBRViewModelEvent, Continuation<? super G0>, Object>, SuspendFunction {
        public C478471(Object obj) {
            super(2, obj, BaseFragment.class, "handleEvent", "handleEvent(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;)V", 4);
        }

        @Override // Y41.p
        @l
        public final Object invoke(@k CBRViewModel.CBRViewModelEvent cBRViewModelEvent, @k Continuation<? super G0> continuation) {
            return BaseFragment.onViewCreated$handleEvent((BaseFragment) this.receiver, cBRViewModelEvent, continuation);
        }
    }

    /* compiled from: BaseFragment.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "S", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel;", "VM", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelInternalState;", "it", "Lkotlin/G0;", "<anonymous>", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelInternalState;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.BaseFragment$onViewCreated$2", f = "BaseFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.core.presentation.BaseFragment$onViewCreated$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements p<CBRViewModel.CBRViewModelInternalState, Continuation<? super G0>, Object> {
        final /* synthetic */ Bundle $savedInstanceState;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseFragment<S, VM> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BaseFragment<S, VM> baseFragment, Bundle bundle, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = baseFragment;
            this.$savedInstanceState = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$savedInstanceState, continuation);
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
            CBRViewModel.CBRViewModelInternalState cBRViewModelInternalState = (CBRViewModel.CBRViewModelInternalState) this.L$0;
            this.this$0.updateCommonUiState(cBRViewModelInternalState);
            if (this.this$0.getIsPrepared() != cBRViewModelInternalState.getIsViewModelPrepared()) {
                ((BaseFragment) this.this$0).isPrepared = cBRViewModelInternalState.getIsViewModelPrepared();
                this.this$0.onViewModelPrepared(this.$savedInstanceState);
            }
            return G0.f406611a;
        }

        @Override // Y41.p
        @l
        public final Object invoke(@k CBRViewModel.CBRViewModelInternalState cBRViewModelInternalState, @l Continuation<? super G0> continuation) {
            return ((AnonymousClass2) create(cBRViewModelInternalState, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: BaseFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "S", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel;", "VM", "it", "Lkotlin/G0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.BaseFragment$onViewModelPrepared$1", f = "BaseFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.core.presentation.BaseFragment$onViewModelPrepared$1, reason: invalid class name and case insensitive filesystem */
    public static final class C478481 extends SuspendLambda implements p<S, Continuation<? super G0>, Object> {
        final /* synthetic */ Bundle $savedInstanceState;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseFragment<S, VM> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C478481(BaseFragment<S, VM> baseFragment, Bundle bundle, Continuation<? super C478481> continuation) {
            super(2, continuation);
            this.this$0 = baseFragment;
            this.$savedInstanceState = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C478481 c478481 = new C478481(this.this$0, this.$savedInstanceState, continuation);
            c478481.L$0 = obj;
            return c478481;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            CBRViewModel.CBRViewModelState cBRViewModelState = (CBRViewModel.CBRViewModelState) this.L$0;
            Logger.i$default(a.f436064a, c.a(this.this$0), "Lifecycle New state: " + cBRViewModelState, null, 4, null);
            BaseFragment<S, VM> baseFragment = this.this$0;
            baseFragment.handleState(cBRViewModelState, ((BaseFragment) baseFragment).lastViewState, this.$savedInstanceState);
            ((BaseFragment) this.this$0).lastViewState = cBRViewModelState;
            return G0.f406611a;
        }

        @Override // Y41.p
        @l
        public final Object invoke(@k S s5, @l Continuation<? super G0> continuation) {
            return ((C478481) create(s5, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    public static /* synthetic */ void finish$default(BaseFragment baseFragment, a0 a0Var, Object obj, Long l12, int i12, Object obj2) {
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
        baseFragment.finish(a0Var, obj, l12);
    }

    public static /* synthetic */ void finishWithResult$default(BaseFragment baseFragment, int i12, Bundle bundle, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: finishWithResult");
        }
        if ((i13 & 1) != 0) {
            i12 = -1;
        }
        if ((i13 & 2) != 0) {
            bundle = new Bundle();
        }
        baseFragment.finishWithResult(i12, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h getNavigation() {
        j activity = l1();
        if (activity instanceof h) {
            return (h) activity;
        }
        return null;
    }

    private final void hideSystemUI() {
        Window window = requireActivity().getWindow();
        F0.a(window, false);
        L0 l02 = new L0(window, requireView());
        l02.a(7);
        l02.f();
    }

    private final void initToolbar() {
        View view = getView();
        CBRToolbarView cBRToolbarView = view != null ? (CBRToolbarView) view.findViewById(R.id.cbr_toolbar) : null;
        if (cBRToolbarView != null) {
            cBRToolbarView.setOnCloseButtonClickListener(new ViewOnClickListenerC39879j1(this, 22));
        }
        if (cBRToolbarView != null) {
            cBRToolbarView.setCloseButtonDrawable(n0.f432787a.getIconHandler().onResolveIcon(requireContext(), CBRIconHandler.CBRCommonIcons.CLOSE.getImageName()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initToolbar$lambda-11, reason: not valid java name */
    public static final void m276initToolbar$lambda11(BaseFragment baseFragment, View view) {
        Logger.v$default(a.f436064a, c.a(baseFragment), "close click", null, 4, null);
        baseFragment.onCloseButtonClick();
        baseFragment.getAnalyticsDelegate().a(false);
        ActivityC22955m activity = baseFragment.l1();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    public static /* synthetic */ void navigateTo$default(BaseFragment baseFragment, Fragment fragment, String str, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateTo");
        }
        if ((i12 & 2) != 0) {
            str = null;
        }
        baseFragment.navigateTo(fragment, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onViewCreated$handleEvent(BaseFragment baseFragment, CBRViewModel.CBRViewModelEvent cBRViewModelEvent, Continuation continuation) {
        baseFragment.handleEvent(cBRViewModelEvent);
        return G0.f406611a;
    }

    private final void setDefaultFragmentResult() {
        if (this.isResultSet || !isForResult()) {
            return;
        }
        String fragmentRequestKey = getFragmentRequestKey();
        Bundle bundleE = AK.c.e(0, "fragment_result_key");
        G0 g02 = G0.f406611a;
        C22960s.a(bundleE, this, fragmentRequestKey);
    }

    public static /* synthetic */ void setResult$default(BaseFragment baseFragment, int i12, Bundle bundle, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setResult");
        }
        if ((i13 & 1) != 0) {
            i12 = -1;
        }
        if ((i13 & 2) != 0) {
            bundle = new Bundle();
        }
        baseFragment.setResult(i12, bundle);
    }

    private final void showSystemUI() {
        Window window = requireActivity().getWindow();
        F0.a(window, true);
        new L0(window, requireView()).g(7);
    }

    public void finish(@k a0 reason, @l Object payload, @l Long delay) {
        if (onFinishCalled(reason)) {
            setDefaultFragmentResult();
            h navigation2 = getNavigation();
            if (navigation2 != null) {
                navigation2.a(reason, delay);
            }
        }
    }

    public final void finishWithResult(int result, @k Bundle data) {
        setResult(result, data);
        finish$default(this, null, null, null, 7, null);
    }

    @k
    public final BaseFragment<S, VM> forResult(@l String requestKey) {
        Bundle arguments;
        if (requestKey != null && (arguments = getArguments()) != null) {
            arguments.putString("fragment_request_key", requestKey);
        }
        return this;
    }

    @k
    public final ru.cyberity.cbr.core.analytics.c getAnalyticsDelegate() {
        return new ru.cyberity.cbr.core.analytics.c(getScreen(), getIdDocSetType(), getOpenPayload(), getAppearPayload(), getClosePayload(), getCancelPayload());
    }

    @l
    public final g getAppListener() {
        j activity = l1();
        if (activity instanceof g) {
            return (g) activity;
        }
        return null;
    }

    @k
    public Map<String, Object> getAppearPayload() {
        return this.appearPayload;
    }

    @k
    public final BaseActivity<?, ?> getBaseActivity() {
        return (BaseActivity) l1();
    }

    @k
    public Map<String, Object> getCancelPayload() {
        return this.cancelPayload;
    }

    @k
    public Map<String, Object> getClosePayload() {
        return this.closePayload;
    }

    @k
    public final String getFragmentRequestKey() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("fragment_request_key")) == null) ? "fragment_request_key" : string;
    }

    @k
    public abstract String getIdDocSetType();

    @I
    public abstract int getLayoutId();

    @k
    public String getLogTag() {
        return this.logTag;
    }

    @k
    public Map<String, Object> getOpenPayload() {
        return this.openPayload;
    }

    @l
    public TextView getPoweredByText() {
        View view = getView();
        if (view != null) {
            return (TextView) view.findViewById(R.id.cbr_powered);
        }
        return null;
    }

    @l
    public final TextView getProgressTextView() {
        return (TextView) this.progressTextView.a(this, $$delegatedProperties[0]);
    }

    @k
    public Screen getScreen() {
        return this.screen;
    }

    @k
    public final b getServiceLocator() {
        return getBaseActivity().getServiceLocator();
    }

    @k
    public abstract VM getViewModel();

    @InterfaceC42153i
    public void handleEvent(@k CBRViewModel.CBRViewModelEvent event) {
        if (event instanceof CBRViewModel.OpenAppSettings) {
            s.a((Activity) requireActivity());
            return;
        }
        if (event instanceof CBRViewModel.OpenLocationSourceSettings) {
            startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            return;
        }
        if (event instanceof CBRViewModel.ErrorEvent) {
            CBRViewModel.ErrorEvent errorEvent = (CBRViewModel.ErrorEvent) event;
            getBaseActivity().onError(errorEvent.getError(), errorEvent.getIdDocSetType(), errorEvent.getButtonText());
            return;
        }
        if (event instanceof CBRViewModel.OpenUrlEvent) {
            g appListener = getAppListener();
            if (appListener != null) {
                appListener.a(((CBRViewModel.OpenUrlEvent) event).getUri());
                return;
            }
            return;
        }
        if (event instanceof CBRViewModel.ShowSupportEvent) {
            h navigation2 = getNavigation();
            if (navigation2 != null) {
                navigation2.a(CBRSupportFragment.INSTANCE.newInstance(), "CBRSupportFragment");
                return;
            }
            return;
        }
        if (event instanceof CBRViewModel.ShowDocumentEvent) {
            g appListener2 = getAppListener();
            if (appListener2 != null) {
                appListener2.b(((CBRViewModel.ShowDocumentEvent) event).getDocument());
                return;
            }
            return;
        }
        if (event instanceof CBRViewModel.FinishEvent) {
            CBRViewModel.FinishEvent finishEvent = (CBRViewModel.FinishEvent) event;
            finish(finishEvent.getReason(), finishEvent.getPayload(), finishEvent.getDelay());
        } else if (event instanceof CBRViewModel.ShowProgressEvent) {
            updateShowProgress(((CBRViewModel.ShowProgressEvent) event).getShow());
        }
    }

    public void handleState(@k S state, @l Bundle savedInstanceState) {
    }

    public final void initCommonUI() {
        TextView textView;
        TextView textView2;
        View view = getView();
        if (view == null) {
            return;
        }
        initToolbar();
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        d customTheme = themeHelper.getCustomTheme();
        if (customTheme != null) {
            String metricStyle = themeHelper.getMetricStyle(customTheme, CBRMetricElement.SCREEN_HEADER_ALIGNMENT);
            if (metricStyle != null && (textView2 = (TextView) view.findViewById(R.id.cbr_title)) != null) {
                themeHelper.applyThemeGravity(textView2, metricStyle);
            }
            String metricStyle2 = themeHelper.getMetricStyle(customTheme, CBRMetricElement.SECTION_HEADER_ALIGNMENT);
            if (metricStyle2 != null && (textView = (TextView) view.findViewById(R.id.cbr_subtitle)) != null) {
                themeHelper.applyThemeGravity(textView, metricStyle2);
            }
            Float metricDimension = themeHelper.getMetricDimension(customTheme, CBRMetricElement.SCREEN_HORIZONTAL_MARGIN);
            if (metricDimension != null) {
                float fFloatValue = metricDimension.floatValue();
                ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.cbr_fragment_content);
                if (viewGroup != null) {
                    int i12 = (int) fFloatValue;
                    viewGroup.setPadding(i12, viewGroup.getPaddingTop(), i12, viewGroup.getPaddingBottom());
                }
                Guideline guideline = (Guideline) view.findViewById(R.id.cbr_guideline_start);
                if (guideline != null) {
                    guideline.setGuidelineBegin((int) fFloatValue);
                }
                Guideline guideline2 = (Guideline) view.findViewById(R.id.cbr_guideline_end);
                if (guideline2 != null) {
                    guideline2.setGuidelineEnd((int) fFloatValue);
                }
            }
            CBRColorElement cBRColorElement = CBRColorElement.CONTENT_WEAK;
            TextView poweredByText = getPoweredByText();
            Integer color = themeHelper.getColor(customTheme, cBRColorElement, poweredByText != null ? themeHelper.isDarkTheme(poweredByText) : false);
            if (color != null) {
                int iIntValue = color.intValue();
                TextView poweredByText2 = getPoweredByText();
                if (poweredByText2 != null) {
                    poweredByText2.setTextColor(iIntValue);
                }
            }
        }
    }

    public final boolean isForResult() {
        Bundle arguments = getArguments();
        return (arguments != null ? arguments.getString("fragment_request_key") : null) != null;
    }

    /* renamed from: isPrepared, reason: from getter */
    public final boolean getIsPrepared() {
        return this.isPrepared;
    }

    /* renamed from: isTransparentStatusBar, reason: from getter */
    public boolean getIsTransparentStatusBar() {
        return this.isTransparentStatusBar;
    }

    public final void navigateTo(@k Fragment fragment, @l String tag) {
        C22981N.a(getLifecycle()).e(new AnonymousClass1(this, fragment, tag, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public CBRCompletionResult onCancelResult() {
        return new CBRCompletionResult.SuccessTermination(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@l Bundle savedInstanceState) {
        Window window;
        this.uniqueIdHolder.onCreate(savedInstanceState);
        if (n0.f432787a.isDebug()) {
            Logger.v$default(a.f436064a, getLogTag(), "Lifecycle " + this + ".onCreate", null, 4, null);
        }
        if (savedInstanceState != null) {
            this.statusBarColor = savedInstanceState.getInt("status_bar_color");
            this.navigationBarColor = savedInstanceState.getInt("nav_bar_color");
            this.sysUiVisibility = savedInstanceState.getInt("system_ui_visibility");
            this.windowFlags = savedInstanceState.getInt("window_flags");
        } else {
            ActivityC22955m activity = l1();
            if (activity != null && (window = activity.getWindow()) != null) {
                this.statusBarColor = window.getStatusBarColor();
                this.navigationBarColor = window.getNavigationBarColor();
                this.sysUiVisibility = window.getDecorView().getSystemUiVisibility();
                this.windowFlags = window.getAttributes().flags;
            }
        }
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@k LayoutInflater inflater, @l ViewGroup container, @l Bundle savedInstanceState) {
        return inflater.inflate(getLayoutId(), container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        getAnalyticsDelegate().c();
        if (n0.f432787a.isDebug()) {
            Logger.v$default(a.f436064a, c.a(this), "Lifecycle " + this + ".onDestroyView", null, 4, null);
        }
        super.onDestroyView();
    }

    public final void onErrorCancelled(@k ru.cyberity.cbr.core.data.model.p error) {
        getViewModel().onErrorCancelled(error);
    }

    @InterfaceC42153i
    public boolean onFinishCalled(@k a0 finishReason) {
        setDefaultFragmentResult();
        return true;
    }

    public final void onHandleError(@k ru.cyberity.cbr.core.data.model.p error) {
        getViewModel().onHandleError(error);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (n0.f432787a.isDebug()) {
            Logger.v$default(a.f436064a, c.a(this), "Lifecycle " + this + ".onHiddenChanged, hidden=" + hidden, null, 4, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (n0.f432787a.isDebug()) {
            Logger.v$default(a.f436064a, getLogTag(), "Lifecycle " + this + ".onResume", null, 4, null);
        }
        getAnalyticsDelegate().b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@k Bundle outState) {
        super.onSaveInstanceState(outState);
        this.uniqueIdHolder.onSaveInstanceState(outState);
        outState.putInt("status_bar_color", this.statusBarColor);
        outState.putInt("nav_bar_color", this.navigationBarColor);
        outState.putInt("system_ui_visibility", this.sysUiVisibility);
        outState.putInt("window_flags", this.windowFlags);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (n0.f432787a.isDebug()) {
            Logger.v$default(a.f436064a, getLogTag(), "Lifecycle " + this + ".onStart", null, 4, null);
        }
        ActivityC22955m activity = l1();
        if (activity == null || activity.getWindow() == null || !getIsTransparentStatusBar()) {
            return;
        }
        hideSystemUI();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (n0.f432787a.isDebug()) {
            Logger.v$default(a.f436064a, getLogTag(), "Lifecycle " + this + ".onStop", null, 4, null);
        }
        ActivityC22955m activity = l1();
        if (activity == null || activity.getWindow() == null || !getIsTransparentStatusBar()) {
            return;
        }
        showSystemUI();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@k View view, @l Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (n0.f432787a.isDebug()) {
            Logger.v$default(a.f436064a, c.a(this), "Lifecycle " + this + ".onViewCreated", null, 4, null);
        }
        getAnalyticsDelegate().d();
        j0.a(getViewModel().getEvents(), getViewLifecycleOwner(), new C478471(this));
        j0.b(getViewModel().getViewModelInternalState(), getViewLifecycleOwner(), new AnonymousClass2(this, savedInstanceState, null));
        initCommonUI();
    }

    @InterfaceC42153i
    public void onViewModelPrepared(@l Bundle savedInstanceState) {
        Logger.v$default(a.f436064a, c.a(this), "Lifecycle " + this + " onViewModelPrepared", null, 4, null);
        j0.b(new C43189o1(getViewModel().getViewState()), this, new C478481(this, savedInstanceState, null));
    }

    public final void setResult(int result, @k Bundle data) {
        if (isForResult()) {
            this.isResultSet = true;
            String fragmentRequestKey = getFragmentRequestKey();
            data.putInt("fragment_result_key", result);
            G0 g02 = G0.f406611a;
            C22960s.a(data, this, fragmentRequestKey);
        }
    }

    public final void updateCommonUiState(@k CBRViewModel.CBRViewModelInternalState state) {
        updatePoweredByVisibility(state.getHideLogo());
        TextView poweredByText = getPoweredByText();
        if (poweredByText != null) {
            s.a(poweredByText, state.getPoweredByText());
        }
        TextView progressTextView = getProgressTextView();
        if (progressTextView != null) {
            s.a(progressTextView, state.getProgressText());
        }
    }

    public void updatePoweredByVisibility(boolean hideLogo) {
        TextView poweredByText = getPoweredByText();
        if (poweredByText == null) {
            return;
        }
        poweredByText.setVisibility(8);
    }

    public void updateShowProgress(boolean showProgress) {
        g appListener = getAppListener();
        if (appListener != null) {
            appListener.a(showProgress);
        }
    }

    public void handleState(@k S state, @l S prevState, @l Bundle savedInstanceState) {
        handleState(state, savedInstanceState);
    }

    public void onCloseButtonClick() {
    }
}
