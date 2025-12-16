package ru.cyberity.cbr.presentation.screen;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.KeyEvent;
import androidx.camera.camera2.internal.G;
import androidx.fragment.app.C;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.H;
import androidx.view.C22977J;
import androidx.view.C22981N;
import androidx.view.InterfaceC23487e;
import androidx.view.O0;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.io.File;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.internal.K;
import ru.cyberity.cbr.R;
import ru.cyberity.cbr.core.CBRMobileSDK;
import ru.cyberity.cbr.core.common.NetworkManager;
import ru.cyberity.cbr.core.common.a0;
import ru.cyberity.cbr.core.common.g;
import ru.cyberity.cbr.core.common.h;
import ru.cyberity.cbr.core.data.listener.CBRUrlHandler;
import ru.cyberity.cbr.core.data.model.CBRCompletionResult;
import ru.cyberity.cbr.core.data.model.Document;
import ru.cyberity.cbr.core.data.model.p;
import ru.cyberity.cbr.core.presentation.BaseActivity;
import ru.cyberity.cbr.core.presentation.BaseFragment;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.core.presentation.intro.CBRStepInfo;
import ru.cyberity.cbr.core.presentation.screen.imageviewer.b;
import ru.cyberity.cbr.core.presentation.screen.verification.ValidationIdentifierType;
import ru.cyberity.cbr.core.widget.CBRProgressView;
import ru.cyberity.cbr.presentation.screen.CBRAppViewModel;
import ru.cyberity.cbr.presentation.screen.questionnary.CBRQuestionnaireFragment;
import ru.cyberity.cbr.prooface.presentation.CBRLiveness3dFaceFragment;
import ru.cyberity.log.c;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBRAppActivity.kt */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 u2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001uB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001d\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u0007J\u000f\u0010 \u001a\u00020\bH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\"H\u0014¢\u0006\u0004\b#\u0010$J\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b\u001f\u0010'J\u000f\u0010(\u001a\u00020\u0011H\u0014¢\u0006\u0004\b(\u0010\u0007J\u000f\u0010)\u001a\u00020\u0011H\u0014¢\u0006\u0004\b)\u0010\u0007J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b*\u0010'J\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010+J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010-J\u000f\u0010.\u001a\u00020\u0011H\u0014¢\u0006\u0004\b.\u0010\u0007J!\u0010\u001f\u001a\u00020\u00112\u0006\u00100\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b\u001f\u00103J\u000f\u00104\u001a\u00020\u0011H\u0016¢\u0006\u0004\b4\u0010\u0007J\u001f\u0010\u001f\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u00192\u0006\u00106\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u00107J\u0019\u0010:\u001a\u00020\u00112\b\u00109\u001a\u0004\u0018\u000108H\u0014¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0011H\u0016¢\u0006\u0004\b<\u0010\u0007J!\u0010\u001f\u001a\u00020\u00112\u0006\u0010>\u001a\u00020=2\b\u0010?\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001f\u0010@J1\u0010\u001f\u001a\u00020\u00112\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\b\u00105\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001f\u0010DJ!\u0010\u001f\u001a\u00020\u00112\u0006\u0010F\u001a\u00020E2\b\u0010H\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\b\u001f\u0010IJ\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010J\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010KJ\u000f\u0010*\u001a\u00020\u0011H\u0016¢\u0006\u0004\b*\u0010\u0007J)\u0010P\u001a\u00020\u00112\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020\f2\b\u0010O\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\bR\u0010+J\u0017\u0010T\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020SH\u0002¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u0011H\u0002¢\u0006\u0004\bV\u0010\u0007J\u000f\u0010W\u001a\u00020\u0011H\u0002¢\u0006\u0004\bW\u0010\u0007J7\u0010Z\u001a\u00020\u00112\u0006\u0010>\u001a\u00020=2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010X\u001a\u00020\f2\b\b\u0002\u0010Y\u001a\u00020\fH\u0002¢\u0006\u0004\bZ\u0010[J\u001f\u0010\\\u001a\u00020\u00112\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\\\u0010@J\u000f\u0010]\u001a\u00020\u0011H\u0002¢\u0006\u0004\b]\u0010\u0007J\u0017\u0010_\u001a\u00020\u00112\u0006\u0010^\u001a\u00020\fH\u0002¢\u0006\u0004\b_\u0010-J\u000f\u0010`\u001a\u00020\u0011H\u0002¢\u0006\u0004\b`\u0010\u0007J\u000f\u0010a\u001a\u00020\u0011H\u0002¢\u0006\u0004\ba\u0010\u0007R\u001b\u0010f\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u0018\u0010h\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010k\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u001e\u0010p\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010m8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0014\u0010t\u001a\u00020q8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\br\u0010s¨\u0006v"}, d2 = {"Lru/cyberity/cbr/presentation/screen/CBRAppActivity;", "Lru/cyberity/cbr/core/presentation/BaseActivity;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$ViewState;", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel;", "Lru/cyberity/cbr/core/common/g;", "Lru/cyberity/cbr/core/common/h;", "<init>", "()V", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/G0;", "onCreate", "(Landroid/os/Bundle;)V", VoiceInfo.STATE, "handleState", "(Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$ViewState;)V", "Lru/cyberity/cbr/core/data/model/p;", "error", "", "idDocSetType", "", "buttonText", "onError", "(Lru/cyberity/cbr/core/data/model/p;Ljava/lang/String;Ljava/lang/CharSequence;)V", "a", "getLayoutId", "()I", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "handleEvent", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;)V", "Lru/cyberity/cbr/core/data/model/Document;", "document", "(Lru/cyberity/cbr/core/data/model/Document;)V", "onResume", "onPause", "b", "(Lru/cyberity/cbr/core/data/model/p;)V", "show", "(Z)V", "onCancelByHost", "Lru/cyberity/cbr/core/common/a0;", "reason", "", "delay", "(Lru/cyberity/cbr/core/common/a0;Ljava/lang/Long;)V", "onBackPressed", "requestKey", "documentType", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "c", "Landroidx/fragment/app/Fragment;", "fragment", "tag", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "Ljava/io/File;", "file", "rotation", "(Ljava/io/File;ILjava/lang/String;Ljava/lang/String;)V", "Lru/cyberity/cbr/core/domain/model/c;", "introParams", "Landroid/os/Parcelable;", "payload", "(Lru/cyberity/cbr/core/domain/model/c;Landroid/os/Parcelable;)V", ContextActionHandler.Link.URL, "(Ljava/lang/String;)V", "Lru/cyberity/cbr/core/presentation/intro/CBRStepInfo;", "stepInfo", "cancelOnBackPressed", "countryCode", "showInstructions", "(Lru/cyberity/cbr/core/presentation/intro/CBRStepInfo;ZLjava/lang/String;)V", "handleError", "Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate;", "navigateTo", "(Lru/cyberity/cbr/presentation/screen/CBRAppViewModel$Event$Navigate;)V", "startNetworkManager", "stopNetworkManager", "allowStateLoss", "addToBackStack", "replaceFragment", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;ZZ)V", "showFragment", "moveToNextDocument", "isCancelled", "moveToApplicantStatusScreen", "checkStepCancelled", "clearBackStack", "viewModel$delegate", "Lkotlin/C;", "getViewModel", "()Lru/cyberity/cbr/presentation/screen/CBRAppViewModel;", "viewModel", "Lru/cyberity/cbr/core/widget/CBRProgressView;", "vgProgress", "Lru/cyberity/cbr/core/widget/CBRProgressView;", "Lru/cyberity/cbr/core/common/NetworkManager;", "networkManager", "Lru/cyberity/cbr/core/common/NetworkManager;", "Lru/cyberity/cbr/core/presentation/BaseFragment;", "getCurrentFragment", "()Lru/cyberity/cbr/core/presentation/BaseFragment;", "currentFragment", "Lru/cyberity/cbr/core/data/model/CBRCompletionResult;", "getCurrentFragmentCompletionResult", "()Lru/cyberity/cbr/core/data/model/CBRCompletionResult;", "currentFragmentCompletionResult", "Companion", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class CBRAppActivity extends BaseActivity<CBRAppViewModel.ViewState, CBRAppViewModel> implements g, h {

    @l
    private CBRProgressView vgProgress;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @k
    private final InterfaceC42726C viewModel = new O0(m0.f406844a.b(CBRAppViewModel.class), new CBRAppActivity$special$$inlined$viewModels$2(this), new CBRAppActivity$viewModel$2(this), null, 8, null);

    @k
    private final NetworkManager networkManager = new NetworkManager();

    /* compiled from: CBRAppActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.CBRAppActivity$showFragment$1", f = "CBRAppActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.presentation.screen.CBRAppActivity$showFragment$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        final /* synthetic */ Fragment $fragment;
        final /* synthetic */ String $tag;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Fragment fragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$tag = str;
            this.$fragment = fragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return CBRAppActivity.this.new AnonymousClass1(this.$tag, this.$fragment, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            CBRAppActivity.this.getSupportFragmentManager().E();
            Fragment fragmentH = CBRAppActivity.this.getSupportFragmentManager().H(this.$tag);
            if (fragmentH != null && fragmentH.isAdded()) {
                Logger.i$default(ru.cyberity.log.a.f436064a, c.a(CBRAppActivity.this), AK.c.s(new StringBuilder("Fragment with tag = "), this.$tag, " is already added"), null, 4, null);
                return G0.f406611a;
            }
            FragmentManager supportFragmentManager = CBRAppActivity.this.getSupportFragmentManager();
            Fragment fragment = this.$fragment;
            String str = this.$tag;
            H hE2 = supportFragmentManager.e();
            hE2.j(R.id.cbr_container, fragment, str, 1);
            hE2.c(str);
            hE2.e();
            return G0.f406611a;
        }

        @Override // Y41.p
        @l
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((AnonymousClass1) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: CBRAppActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/common/NetworkManager$NetworkType;", "it", "Lkotlin/G0;", "invoke", "(Lru/cyberity/cbr/core/common/NetworkManager$NetworkType;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.presentation.screen.CBRAppActivity$startNetworkManager$1, reason: invalid class name and case insensitive filesystem */
    public static final class C478611 extends N implements Y41.l<NetworkManager.NetworkType, G0> {
        public C478611() {
            super(1);
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ G0 invoke(NetworkManager.NetworkType networkType) {
            invoke2(networkType);
            return G0.f406611a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@k NetworkManager.NetworkType networkType) {
            CBRAppActivity.this.getViewModel().setNetworkState(networkType.getType());
        }
    }

    private final void checkStepCancelled() {
        if (getSupportFragmentManager().L() == 1) {
            getViewModel().onMoveToApplicantStatusScreen(true, false);
        }
    }

    private final void clearBackStack() {
        getSupportFragmentManager().a0(1, null);
    }

    private final BaseFragment<?, ?> getCurrentFragment() {
        Fragment fragmentG = getSupportFragmentManager().G(R.id.cbr_container);
        if (fragmentG instanceof BaseFragment) {
            return (BaseFragment) fragmentG;
        }
        return null;
    }

    private final CBRCompletionResult getCurrentFragmentCompletionResult() {
        CBRCompletionResult cBRCompletionResultOnCancelResult;
        BaseFragment<?, ?> currentFragment = getCurrentFragment();
        return (currentFragment == null || (cBRCompletionResultOnCancelResult = currentFragment.onCancelResult()) == null) ? new CBRCompletionResult.SuccessTermination(null, 1, null) : cBRCompletionResultOnCancelResult;
    }

    private final void handleError(ru.cyberity.cbr.core.data.model.p error) {
        for (Fragment fragment : getSupportFragmentManager().P()) {
            BaseFragment baseFragment = fragment instanceof BaseFragment ? (BaseFragment) fragment : null;
            if (baseFragment != null) {
                baseFragment.onHandleError(error);
            }
        }
    }

    private final void moveToApplicantStatusScreen(boolean isCancelled) {
        getViewModel().clearShownInstructions();
        clearBackStack();
        CBRAppViewModel.onMoveToApplicantStatusScreen$default(getViewModel(), isCancelled, false, 2, null);
    }

    private final void moveToNextDocument() {
        clearBackStack();
        CBRAppViewModel.moveToNextDocument$default(getViewModel(), false, 1, null);
    }

    private final void navigateTo(CBRAppViewModel.Event.Navigate event) {
        Logger.i$default(ru.cyberity.log.a.f436064a, c.a(this), "Navigate to: " + event, null, 4, null);
        if (event instanceof CBRAppViewModel.Event.Navigate.VideoIdent) {
            throw new UnsupportedOperationException("VideoIdent unavailable");
        }
        if (event instanceof CBRAppViewModel.Event.Navigate.PreviewIdentity) {
            replaceFragment$default(this, ru.cyberity.cbr.presentation.screen.preview.photo.identity.a.INSTANCE.a(((CBRAppViewModel.Event.Navigate.PreviewIdentity) event).getDoc()), "CBRPreviewIdentityDocumentFragment", false, false, 12, null);
            return;
        }
        if (event instanceof CBRAppViewModel.Event.Navigate.PreviewVideoSelfie) {
            replaceFragment$default(this, ru.cyberity.cbr.presentation.screen.preview.selfie.a.INSTANCE.a(((CBRAppViewModel.Event.Navigate.PreviewVideoSelfie) event).getDoc()), "PreviewSelfieFragment", false, false, 12, null);
            return;
        }
        if (event instanceof CBRAppViewModel.Event.Navigate.ApplicantData) {
            replaceFragment$default(this, ru.cyberity.cbr.presentation.screen.preview.applicantdata.b.INSTANCE.a(((CBRAppViewModel.Event.Navigate.ApplicantData) event).getDoc()), "CBRApplicantDataDocumentFragment", false, false, 12, null);
            return;
        }
        if (event instanceof CBRAppViewModel.Event.Navigate.PreviewSelfieWithDocument) {
            replaceFragment$default(this, ru.cyberity.cbr.presentation.screen.preview.photo.common.a.INSTANCE.a(((CBRAppViewModel.Event.Navigate.PreviewSelfieWithDocument) event).getDoc()), "CBRPreviewCommonDocumentFragment", false, false, 12, null);
            return;
        }
        if (event instanceof CBRAppViewModel.Event.Navigate.PreviewPhotoSelfie) {
            replaceFragment$default(this, ru.cyberity.cbr.presentation.screen.preview.photo.common.a.INSTANCE.a(((CBRAppViewModel.Event.Navigate.PreviewPhotoSelfie) event).getDoc()), "CBRPreviewCommonDocumentFragment", false, false, 12, null);
            return;
        }
        if (event instanceof CBRAppViewModel.Event.Navigate.ProofOfAddress) {
            replaceFragment$default(this, ru.cyberity.cbr.presentation.screen.preview.photo.common.a.INSTANCE.a(((CBRAppViewModel.Event.Navigate.ProofOfAddress) event).getDoc()), "CBRPreviewCommonDocumentFragment", false, false, 12, null);
            return;
        }
        if (event instanceof CBRAppViewModel.Event.Navigate.Geolocation) {
            replaceFragment$default(this, ru.cyberity.cbr.geo.presentation.a.INSTANCE.a(((CBRAppViewModel.Event.Navigate.Geolocation) event).getDoc()), "CBRGeoFragment", false, false, 12, null);
            return;
        }
        if (event instanceof CBRAppViewModel.Event.Navigate.ConfirmEmail) {
            replaceFragment$default(this, ru.cyberity.cbr.core.presentation.screen.verification.a.INSTANCE.a(ValidationIdentifierType.EMAIL), "CBRVerificationStepFragment", true, false, 8, null);
            return;
        }
        if (event instanceof CBRAppViewModel.Event.Navigate.ConfirmPhone) {
            replaceFragment$default(this, ru.cyberity.cbr.core.presentation.screen.verification.a.INSTANCE.a(ValidationIdentifierType.PHONE), "CBRVerificationStepFragment", true, false, 8, null);
            return;
        }
        if (event instanceof CBRAppViewModel.Event.Navigate.Questionnaire) {
            replaceFragment$default(this, CBRQuestionnaireFragment.Companion.newInstance$default(CBRQuestionnaireFragment.INSTANCE, ((CBRAppViewModel.Event.Navigate.Questionnaire) event).getDoc().getType().getValue(), null, null, null, 14, null), "CBRQuestionnaireFragment", true, false, 8, null);
            return;
        }
        if (event instanceof CBRAppViewModel.Event.Navigate.ApplicantStatus) {
            if (getSupportFragmentManager().H("CBRApplicantStatusFragment") != null) {
                clearBackStack();
                return;
            } else {
                replaceFragment$default(this, ru.cyberity.cbr.presentation.screen.verification.a.INSTANCE.a(), "CBRApplicantStatusFragment", false, false, 4, null);
                return;
            }
        }
        if (event instanceof CBRAppViewModel.Event.Navigate.Liveness) {
            CBRAppViewModel.Event.Navigate.Liveness liveness = (CBRAppViewModel.Event.Navigate.Liveness) event;
            replaceFragment$default(this, CBRLiveness3dFaceFragment.Companion.newInstance$default(CBRLiveness3dFaceFragment.INSTANCE, liveness.getDoc().getType().getValue(), liveness.getDoc(), null, null, 12, null), null, false, false, 14, null);
        } else if (event instanceof CBRAppViewModel.Event.Navigate.Action) {
            CBRAppViewModel.Event.Navigate.Action action = (CBRAppViewModel.Event.Navigate.Action) event;
            replaceFragment$default(this, CBRLiveness3dFaceFragment.Companion.newInstance$default(CBRLiveness3dFaceFragment.INSTANCE, action.getIdDocSetType(), null, action.getActionId(), action.getActionType(), 2, null), null, false, false, 14, null);
        } else if (event instanceof CBRAppViewModel.Event.Navigate.Ekyc) {
            replaceFragment$default(this, ru.cyberity.cbr.presentation.screen.preview.ekyc.a.INSTANCE.a(((CBRAppViewModel.Event.Navigate.Ekyc) event).getDoc()), "CBREkycFragment", false, false, 12, null);
        } else if (event instanceof CBRAppViewModel.Event.Navigate.AgreementSelector) {
            replaceFragment$default(this, ru.cyberity.cbr.presentation.consent.a.INSTANCE.a(), "CBRConsentFragment", false, false, 12, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-1, reason: not valid java name */
    public static final void m318onCreate$lambda1(CBRAppActivity cBRAppActivity, String str, Bundle bundle) {
        G0 g02;
        Document document = (Document) bundle.getParcelable("geo_fallback_document");
        if (document != null) {
            replaceFragment$default(cBRAppActivity, ru.cyberity.cbr.presentation.screen.preview.photo.common.a.INSTANCE.a(document), "CBRPreviewCommonDocumentFragment", false, false, 12, null);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            cBRAppActivity.moveToApplicantStatusScreen(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-2, reason: not valid java name */
    public static final void m319onCreate$lambda2(CBRAppActivity cBRAppActivity, String str, Bundle bundle) {
        if (!BaseFragment.INSTANCE.isSuccessResult(bundle)) {
            cBRAppActivity.getViewModel().executeAfterInstructionsAction(false);
            return;
        }
        if (cBRAppActivity.getCurrentFragment() instanceof ru.cyberity.cbr.presentation.screen.intro.a) {
            cBRAppActivity.getSupportFragmentManager().Y();
        }
        cBRAppActivity.getViewModel().executeAfterInstructionsAction(true);
    }

    private final void replaceFragment(Fragment fragment, String tag, boolean allowStateLoss, boolean addToBackStack) {
        Logger.i$default(ru.cyberity.log.a.f436064a, c.a(this), G.f("ReplaceFragment, tag = ", tag), null, 4, null);
        H hE2 = getSupportFragmentManager().e();
        hE2.n(R.id.cbr_container, fragment, tag);
        if (addToBackStack) {
            hE2.c(tag);
        }
        if (allowStateLoss) {
            hE2.f();
        } else {
            hE2.e();
        }
    }

    public static /* synthetic */ void replaceFragment$default(CBRAppActivity cBRAppActivity, Fragment fragment, String str, boolean z12, boolean z13, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str = null;
        }
        if ((i12 & 4) != 0) {
            z12 = false;
        }
        if ((i12 & 8) != 0) {
            z13 = true;
        }
        cBRAppActivity.replaceFragment(fragment, str, z12, z13);
    }

    private final void showFragment(Fragment fragment, String tag) {
        Logger.i$default(ru.cyberity.log.a.f436064a, c.a(this), G.f("ShowFragment, tag = ", tag), null, 4, null);
        a(false);
        C22977J c22977jA = C22981N.a(getLifecycle());
        kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
        C43259k.d(c22977jA, K.f411877a.y(), null, new AnonymousClass1(tag, fragment, null), 2);
    }

    private final void showInstructions(CBRStepInfo stepInfo, boolean cancelOnBackPressed, String countryCode) {
        Logger.v$default(ru.cyberity.log.a.f436064a, c.a(this), "showInstructions: " + stepInfo, null, 4, null);
        replaceFragment$default(this, ru.cyberity.cbr.presentation.screen.intro.a.INSTANCE.a(stepInfo.getStep(), stepInfo.getScene(), stepInfo.getDocumentType(), cancelOnBackPressed, countryCode).forResult("instructions_request_key_internal"), "CBRIntroScreenFragment", false, false, 12, null);
    }

    private final void startNetworkManager() {
        this.networkManager.a(getApplicationContext(), new C478611());
    }

    private final void stopNetworkManager() {
        this.networkManager.c();
    }

    @Override // ru.cyberity.cbr.core.common.g
    public void a() {
        getViewModel().moveToNextDocument(true);
    }

    @Override // ru.cyberity.cbr.core.common.g
    public void b(@k Document document) {
        getViewModel().onDocumentClicked(document);
    }

    public void c() {
        Logger.d$default(ru.cyberity.log.a.f436064a, c.a(this), "Stop listening NFC", null, 4, null);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseActivity
    public int getLayoutId() {
        return R.layout.cbr_activity_app;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseActivity
    public void handleEvent(@k CBRViewModel.CBRViewModelEvent event) {
        super.handleEvent(event);
        if (event instanceof CBRAppViewModel.Event.Navigate) {
            navigateTo((CBRAppViewModel.Event.Navigate) event);
            return;
        }
        if (event instanceof CBRAppViewModel.Event.HandleError) {
            handleError(((CBRAppViewModel.Event.HandleError) event).getError());
            return;
        }
        if (event instanceof CBRAppViewModel.Event.Cancel) {
            getServiceLocator().b();
            finish();
            return;
        }
        if (event instanceof CBRAppViewModel.Event.ShowInstructions) {
            CBRAppViewModel.Event.ShowInstructions showInstructions = (CBRAppViewModel.Event.ShowInstructions) event;
            showInstructions(showInstructions.getStepInfo(), showInstructions.getCancelOnBackPressed(), showInstructions.getCountryCode());
            return;
        }
        if (event instanceof CBRViewModel.FinishEvent) {
            h.a(this, ((CBRViewModel.FinishEvent) event).getReason(), null, 2, null);
            return;
        }
        if (event instanceof CBRAppViewModel.Event.AfterInstructionsEvent) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Bundle bundle = new Bundle();
            CBRAppViewModel.Event.AfterInstructionsEvent afterInstructionsEvent = (CBRAppViewModel.Event.AfterInstructionsEvent) event;
            bundle.putInt("fragment_result_key", afterInstructionsEvent.getSuccess() ? -1 : 0);
            bundle.putParcelable("payload", afterInstructionsEvent.getPayload());
            G0 g02 = G0.f406611a;
            supportFragmentManager.o0(bundle, "instructions_request_key");
        }
    }

    @Override // androidx.view.n, android.app.Activity
    public void onBackPressed() {
        Logger.v$default(ru.cyberity.log.a.f436064a, c.a(this), "onBackPressed()", null, 4, null);
        BaseFragment<?, ?> currentFragment = getCurrentFragment();
        if (currentFragment == null) {
            getViewModel().onCancel(getCurrentFragmentCompletionResult(), false);
        } else if (currentFragment.onFinishCalled(a0.c.f432638a)) {
            checkStepCancelled();
            a(false);
            super.onBackPressed();
        }
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseActivity
    public void onCancelByHost() {
        getViewModel().onCancel(getCurrentFragmentCompletionResult(), true);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseActivity, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public void onCreate(@l Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.i$default(ru.cyberity.log.a.f436064a, c.a(this), CBRMobileSDK.INSTANCE.toString(), null, 4, null);
        this.vgProgress = (CBRProgressView) findViewById(R.id.cbr_progress);
        final int i12 = 0;
        getSupportFragmentManager().p0("geo_request_fallback", this, new C(this) { // from class: ru.cyberity.cbr.presentation.screen.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CBRAppActivity f434675c;

            {
                this.f434675c = this;
            }

            @Override // androidx.fragment.app.C
            public final void k(Bundle bundle, String str) {
                switch (i12) {
                    case 0:
                        CBRAppActivity.m318onCreate$lambda1(this.f434675c, str, bundle);
                        break;
                    default:
                        CBRAppActivity.m319onCreate$lambda2(this.f434675c, str, bundle);
                        break;
                }
            }
        });
        final int i13 = 1;
        getSupportFragmentManager().p0("instructions_request_key_internal", this, new C(this) { // from class: ru.cyberity.cbr.presentation.screen.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CBRAppActivity f434675c;

            {
                this.f434675c = this;
            }

            @Override // androidx.fragment.app.C
            public final void k(Bundle bundle, String str) {
                switch (i13) {
                    case 0:
                        CBRAppActivity.m318onCreate$lambda1(this.f434675c, str, bundle);
                        break;
                    default:
                        CBRAppActivity.m319onCreate$lambda2(this.f434675c, str, bundle);
                        break;
                }
            }
        });
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseActivity
    public void onError(@l ru.cyberity.cbr.core.data.model.p error, @k String idDocSetType, @l CharSequence buttonText) {
        c();
        if (error != null) {
            if (error instanceof p.c) {
                ru.cyberity.cbr.presentation.screen.error.a.INSTANCE.a(((p.c) error).getDescription(), buttonText).show(getSupportFragmentManager(), "CBRErrorDialog");
            } else {
                showFragment(ru.cyberity.cbr.presentation.screen.error.b.INSTANCE.a(error, idDocSetType), "ErrorFragment");
            }
        }
    }

    @Override // androidx.appcompat.app.m, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, @l KeyEvent event) {
        Boolean boolOnKeyDown;
        InterfaceC23487e currentFragment = getCurrentFragment();
        ru.cyberity.cbr.core.common.p pVar = currentFragment instanceof ru.cyberity.cbr.core.common.p ? (ru.cyberity.cbr.core.common.p) currentFragment : null;
        return (pVar == null || (boolOnKeyDown = pVar.onKeyDown(keyCode, event)) == null) ? super.onKeyDown(keyCode, event) : boolOnKeyDown.booleanValue();
    }

    @Override // androidx.view.n, android.app.Activity
    public void onNewIntent(@l Intent intent) {
        Logger.d$default(ru.cyberity.log.a.f436064a, c.a(this), "onNewIntent = " + intent, null, 4, null);
        super.onNewIntent(intent);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseActivity, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public void onPause() {
        super.onPause();
        stopNetworkManager();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseActivity, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public void onResume() {
        super.onResume();
        startNetworkManager();
    }

    @Override // ru.cyberity.cbr.core.common.g
    public void a(@k Document document) {
        getViewModel().onDocumentUploaded(document);
        moveToNextDocument();
    }

    @Override // ru.cyberity.cbr.core.common.g
    public void b(@k ru.cyberity.cbr.core.data.model.p error) {
        for (Fragment fragment : getSupportFragmentManager().P()) {
            BaseFragment baseFragment = fragment instanceof BaseFragment ? (BaseFragment) fragment : null;
            if (baseFragment != null) {
                baseFragment.onErrorCancelled(error);
            }
        }
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseActivity
    @k
    public CBRAppViewModel getViewModel() {
        return (CBRAppViewModel) this.viewModel.getValue();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseActivity
    public void handleState(@k CBRAppViewModel.ViewState state) {
        CBRProgressView cBRProgressView;
        if (state.getIsSdkPrepared() && (cBRProgressView = this.vgProgress) != null) {
            cBRProgressView.setText(state.getPreparedText());
        }
        if (state.getLoadingIsTooLong()) {
            CBRProgressView cBRProgressView2 = this.vgProgress;
            if (cBRProgressView2 == null) {
                return;
            }
            cBRProgressView2.setText(state.getLoadingTooLongText());
            return;
        }
        if (state.getIsLoading() != null) {
            if (state.getIsLoading().booleanValue()) {
                CBRProgressView cBRProgressView3 = this.vgProgress;
                if (cBRProgressView3 == null) {
                    return;
                }
                cBRProgressView3.setVisibility(0);
                return;
            }
            CBRProgressView cBRProgressView4 = this.vgProgress;
            if (cBRProgressView4 != null) {
                cBRProgressView4.setText(state.getPreparedText());
            }
            CBRProgressView cBRProgressView5 = this.vgProgress;
            if (cBRProgressView5 == null) {
                return;
            }
            cBRProgressView5.setVisibility(8);
        }
    }

    @Override // ru.cyberity.cbr.core.common.g
    public void a(@k ru.cyberity.cbr.core.data.model.p error) {
        getViewModel().onHandleError(error);
    }

    @Override // ru.cyberity.cbr.core.common.g
    public void a(boolean show) {
        getViewModel().onProgress(show);
    }

    @Override // ru.cyberity.cbr.core.common.g
    public void b() {
        getViewModel().onCancel(new CBRCompletionResult.SuccessTermination(null, 1, null), false);
    }

    @Override // ru.cyberity.cbr.core.common.h
    public void a(@k a0 reason, @l Long delay) {
        if (delay != null) {
            getViewModel().delayedFinish(reason, delay.longValue());
            return;
        }
        if (reason instanceof a0.c) {
            if (getSupportFragmentManager().L() > 0) {
                checkStepCancelled();
                a(false);
                getSupportFragmentManager().Y();
                return;
            }
            getViewModel().onCancel(getCurrentFragmentCompletionResult(), false);
            return;
        }
        if (reason instanceof a0.a) {
            moveToApplicantStatusScreen(true);
            return;
        }
        if (reason instanceof a0.b) {
            if (((a0.b) reason).getGoToNextDocument()) {
                moveToNextDocument();
                return;
            } else {
                moveToApplicantStatusScreen(false);
                return;
            }
        }
        if (reason instanceof a0.d) {
            CBRAppViewModel viewModel = getViewModel();
            CBRCompletionResult result = ((a0.d) reason).getResult();
            if (result == null) {
                result = getCurrentFragmentCompletionResult();
            }
            viewModel.onCancel(result, false);
        }
    }

    @Override // ru.cyberity.cbr.core.common.g
    public void a(@k String requestKey, @k String documentType) {
        replaceFragment$default(this, ru.cyberity.cbr.camera.photo.presentation.a.INSTANCE.a(documentType).forResult(requestKey), "CBRDocumentSelectorFragment", false, false, 12, null);
    }

    @Override // ru.cyberity.cbr.core.common.h
    public void a(@k Fragment fragment, @l String tag) {
        replaceFragment$default(this, fragment, tag, false, false, 12, null);
    }

    @Override // ru.cyberity.cbr.core.common.g
    public void a(@k File file, int rotation, @k String idDocSetType, @l String requestKey) {
        BaseFragment<b.C12487b, ru.cyberity.cbr.core.presentation.screen.imageviewer.b> baseFragmentForResult = ru.cyberity.cbr.core.presentation.screen.imageviewer.a.INSTANCE.a(file, rotation, idDocSetType).forResult(requestKey);
        H hE2 = getSupportFragmentManager().e();
        hE2.n(R.id.cbr_container, baseFragmentForResult, "CBRImageViewerFragment");
        hE2.c("CBRImageViewerFragment");
        hE2.e();
    }

    @Override // ru.cyberity.cbr.core.common.g
    public void a(@k ru.cyberity.cbr.core.domain.model.c introParams, @l Parcelable payload) {
        getSupportFragmentManager().f46373k.remove("instructions_request_key");
        Log.isLoggable("FragmentManager", 2);
        getViewModel().resolveInstructions(introParams, payload);
    }

    @Override // ru.cyberity.cbr.core.common.g
    public void a(@k String url) {
        try {
            CBRUrlHandler urlHandler = CBRMobileSDK.INSTANCE.getUrlHandler();
            if (urlHandler != null && urlHandler.onUrl(this, url)) {
                Logger.i$default(ru.cyberity.log.a.f436064a, c.a(this), "handled by host application", null, 4, null);
            } else {
                Logger.i$default(ru.cyberity.log.a.f436064a, c.a(this), "handle url using system default behaviour", null, 4, null);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        } catch (Exception e12) {
            ru.cyberity.log.a.f436064a.e(c.a(this), "Can't open deep link ".concat(url), e12);
        }
    }
}
