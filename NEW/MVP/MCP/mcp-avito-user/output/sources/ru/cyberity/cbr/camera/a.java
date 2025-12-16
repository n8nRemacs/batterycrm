package ru.cyberity.cbr.camera;

import Y61.l;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.core.C20144v;
import androidx.camera.core.InterfaceC20120j0;
import androidx.camera.view.PreviewView;
import androidx.core.view.P;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import i.b;
import j.InterfaceC42153i;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ru.cyberity.cbr.camera.d;
import ru.cyberity.cbr.core.analytics.PermissionPayload;
import ru.cyberity.cbr.core.analytics.Screen;
import ru.cyberity.cbr.core.common.a0;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.common.p;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.common.t;
import ru.cyberity.cbr.core.common.v;
import ru.cyberity.cbr.core.data.listener.CBREvent;
import ru.cyberity.cbr.core.data.listener.CBREventHandler;
import ru.cyberity.cbr.core.data.listener.CBRIconHandler;
import ru.cyberity.cbr.core.data.listener.CBRInstructionsViewHandler;
import ru.cyberity.cbr.core.data.model.o;
import ru.cyberity.cbr.core.domain.camera.CameraX;
import ru.cyberity.cbr.core.presentation.BaseFragment;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.presentation.helper.camera.CBRHelperViewState;
import ru.cyberity.cbr.core.presentation.intro.CBRStepInfo;
import ru.cyberity.cbr.core.presentation.intro.InstructionsRender;
import ru.cyberity.cbr.core.theme.CBRColorElement;
import ru.cyberity.cbr.core.widget.CBRToolbarView;
import ru.cyberity.internal.R;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBRCameraFragment.kt */
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u008e\u0001*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0005:\u0001\u0013B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u0011\u0010\fJ!\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0004H$¢\u0006\u0004\b\u0013\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0004¢\u0006\u0004\b\u001a\u0010\u0007J\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u0013\u0010\u001eJ\u000f\u0010 \u001a\u00020\nH\u0014¢\u0006\u0004\b \u0010\u0007J#\u0010\u0013\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010%J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b\u0013\u0010(J\u0017\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020)2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\nH\u0016¢\u0006\u0004\b1\u0010\u0007J\u000f\u00102\u001a\u00020\nH\u0016¢\u0006\u0004\b2\u0010\u0007J\u000f\u00103\u001a\u00020\nH\u0016¢\u0006\u0004\b3\u0010\u0007J#\u00106\u001a\u0004\u0018\u00010)2\u0006\u00104\u001a\u00020&2\b\u0010\u0017\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b6\u00107J3\u0010\u0013\u001a\u00020\n2\u0006\u00108\u001a\u00020)2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010:\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u000109H\u0004¢\u0006\u0004\b\u0013\u0010;J\u001d\u0010\u0013\u001a\u00020\n2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\n09H\u0004¢\u0006\u0004\b\u0013\u0010=J\u000f\u0010>\u001a\u00020\nH\u0002¢\u0006\u0004\b>\u0010\u0007J!\u0010\u0013\u001a\u00020)2\u0006\u0010@\u001a\u00020?2\b\u0010B\u001a\u0004\u0018\u00010AH\u0002¢\u0006\u0004\b\u0013\u0010CJ5\u0010\u0013\u001a\u00020\n2\u0006\u0010@\u001a\u00020?2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020E0D2\b\u0010B\u001a\u0004\u0018\u00010AH\u0002¢\u0006\u0004\b\u0013\u0010GJ9\u0010\u0013\u001a\u00020\n2\u0006\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020H2\u0006\u0010K\u001a\u00020H2\u0006\u0010@\u001a\u00020?2\b\u0010B\u001a\u0004\u0018\u00010AH\u0002¢\u0006\u0004\b\u0013\u0010LJ\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0007J\u000f\u0010M\u001a\u00020\nH\u0002¢\u0006\u0004\bM\u0010\u0007J#\u0010\u0013\u001a\u00020\n2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020)0DH\u0002¢\u0006\u0004\b\u0013\u0010OJ\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020PH\u0002¢\u0006\u0004\b\u0013\u0010QR*\u0010W\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010R8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010S\u001a\u0004\bT\u0010U\"\u0004\b\u0013\u0010VR\u0018\u0010Z\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010YR\u0016\u0010\\\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010[R\u0018\u0010`\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010d\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR$\u0010i\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0f\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u001a\u0010n\u001a\u00020j8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\b\u001f\u0010mR\u0014\u0010o\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0014\u0010r\u001a\u00020)8&X¦\u0004¢\u0006\u0006\u001a\u0004\bq\u0010pR\u0014\u0010t\u001a\u00020)8&X¦\u0004¢\u0006\u0006\u001a\u0004\bs\u0010pR\u0014\u0010v\u001a\u00020&8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b^\u0010uR \u0010y\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020E0D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bw\u0010xR \u0010{\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020E0D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010xR \u0010}\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020E0D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010xR \u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020E0D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b~\u0010xR\"\u0010\u0081\u0001\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020E0D8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010xR\u0019\u0010\u0084\u0001\u001a\u0004\u0018\u00010\r8$X¤\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0019\u0010\u0086\u0001\u001a\u0004\u0018\u00010\r8$X¤\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0083\u0001R\u001a\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0087\u00018$X¤\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0019\u0010\u008c\u0001\u001a\u0004\u0018\u00010\r8$X¤\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u0083\u0001R\u001a\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008d\u00018$X¤\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0019\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008d\u00018$X¤\u0004¢\u0006\u0007\u001a\u0005\bb\u0010\u008f\u0001R\u0019\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008d\u00018$X¤\u0004¢\u0006\u0007\u001a\u0005\bg\u0010\u008f\u0001R\u0018\u0010\u0093\u0001\u001a\u0004\u0018\u00010\r8$X¤\u0004¢\u0006\u0007\u001a\u0005\b\u001d\u0010\u0083\u0001R\u001a\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0094\u00018$X¤\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0019\u0010\u0099\u0001\u001a\u0004\u0018\u00010\r8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0083\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u009a\u0001"}, d2 = {"Lru/cyberity/cbr/camera/a;", "Lru/cyberity/cbr/camera/d;", "VM", "Lru/cyberity/cbr/core/presentation/BaseFragment;", "Lru/cyberity/cbr/camera/d$b;", "Lru/cyberity/cbr/core/common/p;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/G0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onViewModelPrepared", VoiceInfo.STATE, "a", "(Lru/cyberity/cbr/camera/d$b;Landroid/os/Bundle;)V", "(Lru/cyberity/cbr/camera/d$b;)V", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "event", "handleEvent", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;)V", "w", "Ljava/io/File;", "file", "c", "(Ljava/io/File;)V", "b", "u", "Landroidx/camera/core/j0;", "image", "Lru/cyberity/cbr/core/domain/camera/b;", "exposure", "(Landroidx/camera/core/j0;Lru/cyberity/cbr/core/domain/camera/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "peekHeight", "(I)V", "", "showProgress", "updateShowProgress", "(Z)V", "Lru/cyberity/cbr/core/common/a0;", "finishReason", "onFinishCalled", "(Lru/cyberity/cbr/core/common/a0;)Z", "onStart", "onStop", "onDestroyView", "keyCode", "Landroid/view/KeyEvent;", "onKeyDown", "(ILandroid/view/KeyEvent;)Ljava/lang/Boolean;", "appear", "Lkotlin/Function0;", "onEnd", "(ZLandroid/view/View;LY41/a;)V", "finishCallback", "(LY41/a;)V", "s", "Lru/cyberity/cbr/core/presentation/intro/CBRStepInfo;", "stepInfo", "", "countryCode", "(Lru/cyberity/cbr/core/presentation/intro/CBRStepInfo;Ljava/lang/String;)Z", "", "", "instructionsData", "(Lru/cyberity/cbr/core/presentation/intro/CBRStepInfo;Ljava/util/Map;Ljava/lang/String;)V", "", "title", "brief", "details", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lru/cyberity/cbr/core/presentation/intro/CBRStepInfo;Ljava/lang/String;)V", "v", "grantResults", "(Ljava/util/Map;)V", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$ShowPermissionDialog;", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$ShowPermissionDialog;)V", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "j", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V", "helperViewBehavior", "Landroidx/appcompat/app/l;", "Landroidx/appcompat/app/l;", "lackOfPermissionDialog", "Z", "waitingForReturnFromSettings", "Lru/cyberity/cbr/core/domain/camera/CameraX;", "d", "Lru/cyberity/cbr/core/domain/camera/CameraX;", "cameraX", "Lru/cyberity/cbr/core/presentation/helper/camera/CBRHelperViewState;", "e", "Lru/cyberity/cbr/core/presentation/helper/camera/CBRHelperViewState;", "helperState", "Landroidx/activity/result/h;", "", "f", "Landroidx/activity/result/h;", "permissionLauncher", "Lru/cyberity/cbr/core/domain/camera/CameraX$Mode;", "g", "Lru/cyberity/cbr/core/domain/camera/CameraX$Mode;", "()Lru/cyberity/cbr/core/domain/camera/CameraX$Mode;", "cameraMode", "isTransparentStatusBar", "()Z", "p", "shouldShowFlash", "t", "isFrontFacingCamera", "()I", "fadeAnimationDuration", "getOpenPayload", "()Ljava/util/Map;", "openPayload", "getCancelPayload", "cancelPayload", "getClosePayload", "closePayload", "getAppearPayload", "appearPayload", "k", "permissionsPayload", "q", "()Landroid/view/View;", "takePictureView", "n", "progressBar", "Lru/cyberity/cbr/core/widget/CBRToolbarView;", "r", "()Lru/cyberity/cbr/core/widget/CBRToolbarView;", "toolbar", "i", "helperView", "Landroid/widget/TextView;", "h", "()Landroid/widget/TextView;", "helperTitle", "helperBrief", "helperDetails", "darkOverlay", "Landroidx/camera/view/PreviewView;", "m", "()Landroidx/camera/view/PreviewView;", "previewView", "l", "photoMadeIndicator", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public abstract class a<VM extends ru.cyberity.cbr.camera.d> extends BaseFragment<d.b, VM> implements p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private BottomSheetBehavior<View> helperViewBehavior;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private androidx.appcompat.app.l lackOfPermissionDialog;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean waitingForReturnFromSettings;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private CameraX cameraX;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private CBRHelperViewState helperState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private androidx.view.result.h<String[]> permissionLauncher;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final CameraX.Mode cameraMode = CameraX.Mode.PHOTO;

    /* compiled from: View.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "androidx/core/view/v0", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f431978a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f431979b;

        public b(View view, a aVar) {
            this.f431978a = view;
            this.f431979b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() throws Resources.NotFoundException {
            int dimensionPixelSize;
            ViewGroup.LayoutParams layoutParams;
            View viewI = this.f431979b.i();
            if (viewI != null) {
                dimensionPixelSize = viewI.getHeight();
                int dimensionPixelSize2 = this.f431979b.getResources().getDimensionPixelSize(R.dimen.cbr_collapsed_intro_height);
                if (dimensionPixelSize > dimensionPixelSize2) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
            } else {
                dimensionPixelSize = this.f431979b.getResources().getDimensionPixelSize(R.dimen.cbr_collapsed_intro_height);
            }
            View view = this.f431979b.getView();
            int height = view != null ? view.getHeight() : 0;
            View viewQ = this.f431979b.q();
            int bottom = height - (viewQ != null ? viewQ.getBottom() : 0);
            Integer numValueOf = Integer.valueOf(bottom);
            ViewGroup.LayoutParams layoutParams2 = null;
            if (bottom <= 0) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : Integer.MAX_VALUE;
            int iMin = Math.min(dimensionPixelSize, iIntValue);
            BottomSheetBehavior<View> bottomSheetBehaviorJ = this.f431979b.j();
            int iE2 = bottomSheetBehaviorJ != null ? bottomSheetBehaviorJ.E() : 0;
            BottomSheetBehavior<View> bottomSheetBehaviorJ2 = this.f431979b.j();
            if (bottomSheetBehaviorJ2 != null) {
                bottomSheetBehaviorJ2.N(iMin, true);
            }
            ru.cyberity.cbr.camera.photo.presentation.document.e eVar = ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a;
            StringBuilder sb2 = new StringBuilder("adjustPickHeight: view?.height=");
            View view2 = this.f431979b.getView();
            sb2.append(view2 != null ? Integer.valueOf(view2.getHeight()) : null);
            sb2.append(" takePictureView?.bottom=");
            View viewQ2 = this.f431979b.q();
            sb2.append(viewQ2 != null ? Integer.valueOf(viewQ2.getBottom()) : null);
            sb2.append(" helperViewBehavior?.peekHeight=");
            BottomSheetBehavior<View> bottomSheetBehaviorJ3 = this.f431979b.j();
            sb2.append(bottomSheetBehaviorJ3 != null ? Integer.valueOf(bottomSheetBehaviorJ3.E()) : null);
            sb2.append(" viewHeight=");
            sb2.append(iMin);
            sb2.append(" spaceUnderTakePictureButton=");
            sb2.append(iIntValue);
            ru.cyberity.cbr.camera.photo.presentation.document.e.a(eVar, "DocCapture", sb2.toString(), null, 4, null);
            if (iE2 != iMin) {
                this.f431979b.a(iMin);
            }
            View viewQ3 = this.f431979b.q();
            if (viewQ3 == null) {
                return;
            }
            View viewQ4 = this.f431979b.q();
            if (viewQ4 != null && (layoutParams = viewQ4.getLayoutParams()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    BottomSheetBehavior<View> bottomSheetBehaviorJ4 = this.f431979b.j();
                    int dimensionPixelSize3 = this.f431979b.getResources().getDimensionPixelSize(R.dimen.cbr_margin_medium) + (bottomSheetBehaviorJ4 != null ? bottomSheetBehaviorJ4.E() : 0);
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = dimensionPixelSize3;
                    ru.cyberity.cbr.camera.photo.presentation.document.e.a(eVar, "DocCapture", AK.c.g(dimensionPixelSize3, "setting takePictureView bottom margin to "), null, 4, null);
                }
                layoutParams2 = layoutParams;
            }
            viewQ3.setLayoutParams(layoutParams2);
        }
    }

    /* compiled from: CBRCameraFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/camera/d;", "VM", "Lkotlin/G0;", "a", "()V"}, k = 3, mv = {1, 7, 1})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a<VM> f431981a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a<VM> aVar) {
            super(0);
            this.f431981a = aVar;
        }

        public final void a() {
            View viewQ = this.f431981a.q();
            if (viewQ == null) {
                return;
            }
            viewQ.setVisibility(0);
        }

        @Override // Y41.a
        public /* bridge */ /* synthetic */ G0 invoke() {
            a();
            return G0.f406611a;
        }
    }

    /* compiled from: CBRCameraFragment.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"ru/cyberity/cbr/camera/a$e", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;", "Landroid/view/View;", "bottomSheet", "", "slideOffset", "Lkotlin/G0;", "onSlide", "(Landroid/view/View;F)V", "", "newState", "onStateChanged", "(Landroid/view/View;I)V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class e extends BottomSheetBehavior.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a<VM> f431982a;

        public e(a<VM> aVar) {
            this.f431982a = aVar;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public void onSlide(@Y61.k View bottomSheet, float slideOffset) {
            View viewC = this.f431982a.c();
            if (viewC == null) {
                return;
            }
            viewC.setAlpha(slideOffset * 0.7f);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public void onStateChanged(@Y61.k View bottomSheet, int newState) {
            if (newState == 4) {
                View viewC = this.f431982a.c();
                if (viewC == null) {
                    return;
                }
                viewC.setVisibility(8);
                return;
            }
            View viewC2 = this.f431982a.c();
            if (viewC2 == null) {
                return;
            }
            viewC2.setVisibility(0);
        }
    }

    /* compiled from: CBRCameraFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/camera/d;", "VM", "Lkotlin/G0;", "a", "()V"}, k = 3, mv = {1, 7, 1})
    public static final class g extends N implements Y41.a<G0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a<VM> f431984a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(a<VM> aVar) {
            super(0);
            this.f431984a = aVar;
        }

        public final void a() {
            a.b(this.f431984a).h();
        }

        @Override // Y41.a
        public /* bridge */ /* synthetic */ G0 invoke() {
            a();
            return G0.f406611a;
        }
    }

    /* compiled from: CBRCameraFragment.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0003\u0010\bJ#\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"ru/cyberity/cbr/camera/a$h", "Lru/cyberity/cbr/core/domain/camera/a;", "Lkotlin/G0;", "a", "()V", "Ljava/io/File;", "file", "c", "(Ljava/io/File;)V", "b", "Landroidx/camera/core/j0;", "image", "Lru/cyberity/cbr/core/domain/camera/b;", "exposure", "(Landroidx/camera/core/j0;Lru/cyberity/cbr/core/domain/camera/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class h implements ru.cyberity.cbr.core.domain.camera.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a<VM> f431985a;

        /* compiled from: CBRCameraFragment.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        @DebugMetadata(c = "ru.cyberity.cbr.camera.CBRCameraFragment$onViewModelPrepared$1", f = "CBRCameraFragment.kt", i = {0}, l = {178}, m = "processFrame", n = {"image"}, s = {"L$0"})
        /* renamed from: ru.cyberity.cbr.camera.a$h$a, reason: collision with other inner class name */
        public static final class C12414a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            Object f431986a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f431987b;

            /* renamed from: d, reason: collision with root package name */
            int f431989d;

            public C12414a(Continuation<? super C12414a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f431987b = obj;
                this.f431989d |= BeduinInputModel.MIN_TEXT_VERSION;
                return h.this.a(null, null, this);
            }
        }

        public h(a<VM> aVar) {
            this.f431985a = aVar;
        }

        @Override // ru.cyberity.cbr.core.domain.camera.a
        public void a() {
            this.f431985a.u();
        }

        @Override // ru.cyberity.cbr.core.domain.camera.a
        public void b(@Y61.k File file) {
            this.f431985a.a(file);
        }

        @Override // ru.cyberity.cbr.core.domain.camera.a
        public void c(@Y61.k File file) {
            this.f431985a.b(file);
        }

        @Override // ru.cyberity.cbr.core.domain.camera.a
        public void a(@Y61.k File file) {
            a.b(this.f431985a).a(file);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // ru.cyberity.cbr.core.domain.camera.a
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@Y61.k androidx.camera.core.InterfaceC20120j0 r5, @Y61.k ru.cyberity.cbr.core.domain.camera.b r6, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r7) throws java.lang.Exception {
            /*
                r4 = this;
                boolean r0 = r7 instanceof ru.cyberity.cbr.camera.a.h.C12414a
                if (r0 == 0) goto L13
                r0 = r7
                ru.cyberity.cbr.camera.a$h$a r0 = (ru.cyberity.cbr.camera.a.h.C12414a) r0
                int r1 = r0.f431989d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f431989d = r1
                goto L18
            L13:
                ru.cyberity.cbr.camera.a$h$a r0 = new ru.cyberity.cbr.camera.a$h$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f431987b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f431989d
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r5 = r0.f431986a
                androidx.camera.core.j0 r5 = (androidx.camera.core.InterfaceC20120j0) r5
                kotlin.C42729a0.b(r7)
                goto L45
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L35:
                kotlin.C42729a0.b(r7)
                ru.cyberity.cbr.camera.a<VM extends ru.cyberity.cbr.camera.d> r7 = r4.f431985a
                r0.f431986a = r5
                r0.f431989d = r3
                java.lang.Object r6 = r7.a(r5, r6, r0)
                if (r6 != r1) goto L45
                return r1
            L45:
                r5.close()
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.camera.a.h.a(androidx.camera.core.j0, ru.cyberity.cbr.core.domain.camera.b, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* compiled from: CBRCameraFragment.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class i extends C42801a implements Y41.a<G0> {
        public i(Object obj) {
            super(0, obj, a.class, "finish", "finish(Lru/cyberity/cbr/core/common/FinishReason;Ljava/lang/Object;Ljava/lang/Long;)V", 0);
        }

        @Override // Y41.a
        public /* bridge */ /* synthetic */ G0 invoke() {
            a();
            return G0.f406611a;
        }

        public final void a() {
            BaseFragment.finish$default((a) this.receiver, null, null, null, 7, null);
        }
    }

    /* compiled from: CBRCameraFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/camera/d;", "VM", "Lkotlin/G0;", "a", "()V"}, k = 3, mv = {1, 7, 1})
    public static final class j extends N implements Y41.a<G0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a<VM> f431990a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(a<VM> aVar) {
            super(0);
            this.f431990a = aVar;
        }

        public final void a() {
            ((a) this.f431990a).waitingForReturnFromSettings = true;
            ActivityC22955m activity = this.f431990a.l1();
            if (activity != null) {
                s.a((Activity) activity);
            }
        }

        @Override // Y41.a
        public /* bridge */ /* synthetic */ G0 invoke() {
            a();
            return G0.f406611a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(a aVar, View view) {
        ((ru.cyberity.cbr.camera.d) aVar.getViewModel()).i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View l() {
        View view = getView();
        if (view != null) {
            return view.findViewById(R.id.photo_made_indicator);
        }
        return null;
    }

    private final void s() {
        BottomSheetBehavior<View> bottomSheetBehaviorB;
        View viewI = i();
        if (viewI != null) {
            bottomSheetBehaviorB = BottomSheetBehavior.B(viewI);
            bottomSheetBehaviorB.M(false);
            bottomSheetBehaviorB.N(viewI.getResources().getDimensionPixelSize(R.dimen.cbr_collapsed_intro_height), false);
        } else {
            bottomSheetBehaviorB = null;
        }
        this.helperViewBehavior = bottomSheetBehaviorB;
        View viewC = c();
        if (viewC != null) {
            viewC.setOnClickListener(new ru.cyberity.cbr.camera.f(this, 2));
            viewC.setAlpha(0.0f);
        }
        BottomSheetBehavior<View> bottomSheetBehavior = this.helperViewBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.v(new e(this));
        }
    }

    private final void v() {
        androidx.view.result.h<String[]> hVar;
        this.waitingForReturnFromSettings = false;
        if (androidx.core.content.d.checkSelfPermission(requireContext(), "android.permission.CAMERA") != -1 || (hVar = this.permissionLauncher) == null) {
            return;
        }
        hVar.b(new String[]{"android.permission.CAMERA"});
    }

    @l
    public Object a(@Y61.k InterfaceC20120j0 interfaceC20120j0, @Y61.k ru.cyberity.cbr.core.domain.camera.b bVar, @Y61.k Continuation<? super G0> continuation) {
        return a(this, interfaceC20120j0, bVar, continuation);
    }

    public abstract void a(@Y61.k d.b state);

    public void b(@Y61.k File file) {
    }

    @l
    public abstract View c();

    public final int d() {
        Resources resources;
        Context context = getContext();
        if (context == null || (resources = context.getResources()) == null) {
            return 0;
        }
        return resources.getInteger(android.R.integer.config_mediumAnimTime);
    }

    @l
    public abstract TextView e();

    @l
    public abstract TextView f();

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @Y61.k
    public Map<String, Object> getAppearPayload() {
        return k();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @Y61.k
    public Map<String, Object> getCancelPayload() {
        return k();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @Y61.k
    public Map<String, Object> getClosePayload() {
        return k();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @Y61.k
    public Map<String, Object> getOpenPayload() {
        return k();
    }

    @l
    public abstract TextView h();

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @InterfaceC42153i
    public void handleEvent(@Y61.k CBRViewModel.CBRViewModelEvent event) {
        if (event instanceof CBRViewModel.ShowPermissionDialog) {
            a((CBRViewModel.ShowPermissionDialog) event);
            return;
        }
        if (event instanceof d.a.C12417a) {
            CameraX cameraX = this.cameraX;
            if (cameraX != null) {
                cameraX.a(((d.a.C12417a) event).getFilePrefix());
                return;
            }
            return;
        }
        if (!(event instanceof CBRViewModel.FinishEvent)) {
            super.handleEvent(event);
            return;
        }
        CBRViewModel.FinishEvent finishEvent = (CBRViewModel.FinishEvent) event;
        Object payload = finishEvent.getPayload();
        o oVar = payload instanceof o ? (o) payload : null;
        Object payload2 = finishEvent.getPayload();
        List list = payload2 instanceof List ? (List) payload2 : null;
        if (oVar != null && !oVar.o()) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DOCUMENT_RESULT", oVar);
            G0 g02 = G0.f406611a;
            BaseFragment.finishWithResult$default(this, 0, bundle, 1, null);
            return;
        }
        if (list == null) {
            BaseFragment.finish$default(this, null, null, null, 7, null);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelableArrayList("DOCUMENT_RESULTS", new ArrayList<>(list));
        G0 g03 = G0.f406611a;
        BaseFragment.finishWithResult$default(this, 0, bundle2, 1, null);
    }

    @l
    public abstract View i();

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    /* renamed from: isTransparentStatusBar */
    public boolean getIsTransparentStatusBar() {
        return ru.cyberity.ff.a.f435638a.i().g();
    }

    @l
    public final BottomSheetBehavior<View> j() {
        return this.helperViewBehavior;
    }

    @Y61.k
    public Map<String, Object> k() {
        Context context = getContext();
        if (context == null) {
            return P0.c();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(PermissionPayload.CAMERA_PERMISSION.toString(), Boolean.valueOf(t.a(context, "android.permission.CAMERA")));
        return linkedHashMap;
    }

    @l
    public abstract PreviewView m();

    @l
    public abstract View n();

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@l Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.permissionLauncher = registerForActivityResult(new b.k(), new ru.cyberity.cbr.camera.e(this, 0));
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.helperViewBehavior = null;
        CameraX cameraX = this.cameraX;
        if (cameraX != null) {
            cameraX.g();
        }
        this.cameraX = null;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public boolean onFinishCalled(@Y61.k a0 finishReason) {
        BottomSheetBehavior<View> bottomSheetBehavior = this.helperViewBehavior;
        if (bottomSheetBehavior == null || bottomSheetBehavior.f355975L != 3) {
            return super.onFinishCalled(finishReason);
        }
        bottomSheetBehavior.b(4);
        return false;
    }

    @Override // ru.cyberity.cbr.core.common.p
    @l
    public Boolean onKeyDown(int keyCode, @l KeyEvent event) {
        if (keyCode != 24 && keyCode != 25) {
            return null;
        }
        getViewModel().h();
        return Boolean.TRUE;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.waitingForReturnFromSettings) {
            v();
        }
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        androidx.appcompat.app.l lVar = this.lackOfPermissionDialog;
        if (lVar != null) {
            lVar.dismiss();
        }
        this.lackOfPermissionDialog = null;
        super.onStop();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@Y61.k View view, @l Bundle savedInstanceState) {
        G0 g02;
        Integer color;
        super.onViewCreated(view, savedInstanceState);
        CBRToolbarView cBRToolbarViewR = r();
        if (cBRToolbarViewR != null) {
            cBRToolbarViewR.setOnCloseButtonClickListener(new ru.cyberity.cbr.camera.f(this, 0));
            cBRToolbarViewR.setOnOptionButtonClickListener(new ru.cyberity.cbr.camera.f(this, 1));
            cBRToolbarViewR.setOptionButtonDrawable(n0.f432787a.getIconHandler().onResolveIcon(requireContext(), CBRIconHandler.CBRCommonIcons.TORCH_OFF.getImageName()));
            ThemeHelper themeHelper = ThemeHelper.INSTANCE;
            CBRColorElement cBRColorElement = CBRColorElement.CAMERA_CONTENT;
            ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
            if (customTheme == null || (color = themeHelper.getColor(customTheme, cBRColorElement, themeHelper.isDarkTheme(cBRToolbarViewR))) == null) {
                g02 = null;
            } else {
                cBRToolbarViewR.setIconTintList(ColorStateList.valueOf(color.intValue()));
                g02 = G0.f406611a;
            }
            if (g02 == null) {
                cBRToolbarViewR.setIconTintList(ColorStateList.valueOf(androidx.core.content.d.getColor(cBRToolbarViewR.getContext(), R.color.cbr_camera_content)));
            }
        }
        View viewQ = q();
        if (viewQ != null) {
            v.a(viewQ, new g(this));
            ImageView imageView = viewQ instanceof ImageView ? (ImageView) viewQ : null;
            if (imageView != null) {
                imageView.setImageDrawable(n0.f432787a.getIconHandler().onResolveIcon(requireContext(), CBRIconHandler.CBRCommonIcons.TAKE_PHOTO.getImageName()));
            }
        }
        s();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public void onViewModelPrepared(@l Bundle savedInstanceState) {
        super.onViewModelPrepared(savedInstanceState);
        Logger.v$default(ru.cyberity.log.a.f436064a, getLogTag(), "cameraX mode " + getCameraMode(), null, 4, null);
        CameraX cameraX = new CameraX(getCameraMode(), getViewModel().getImageAnalysisFrameSize(), getIsFrontFacingCamera() ? C20144v.f24562b : C20144v.f24563c, new h(this));
        this.cameraX = cameraX;
        cameraX.a(getViewLifecycleOwner(), m());
        CBRToolbarView cBRToolbarViewR = r();
        if (cBRToolbarViewR != null) {
            cBRToolbarViewR.setOptionButtonVisible(getShouldShowFlash());
        }
        v();
    }

    /* renamed from: p */
    public abstract boolean getShouldShowFlash();

    @l
    public abstract View q();

    @l
    public abstract CBRToolbarView r();

    /* renamed from: t */
    public abstract boolean getIsFrontFacingCamera();

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public void updateShowProgress(boolean showProgress) {
        View viewN = n();
        if (viewN == null) {
            return;
        }
        viewN.setVisibility(!showProgress ? 4 : 0);
    }

    public final void w() {
        CameraX cameraX = this.cameraX;
        if (cameraX != null) {
            cameraX.h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ ru.cyberity.cbr.camera.d b(a aVar) {
        return (ru.cyberity.cbr.camera.d) aVar.getViewModel();
    }

    public void a(int peekHeight) {
    }

    public final void c(@Y61.k File file) {
        CameraX cameraX = this.cameraX;
        if (cameraX != null) {
            cameraX.a(file);
        }
    }

    public void a(@Y61.k File file) {
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public CameraX.Mode getCameraMode() {
        return this.cameraMode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(a aVar, View view) {
        BaseFragment.finish$default(aVar, null, null, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, Map map) {
        aVar.a((Map<String, Boolean>) map);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(@Y61.k d.b state, @l Bundle savedInstanceState) throws Resources.NotFoundException {
        String imageName;
        ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "handleState: " + state, null, 4, null);
        boolean zG2 = state.getFlash();
        PreviewView previewViewM = m();
        if (previewViewM != null) {
            previewViewM.setVisibility(state.getShowCamera() ? 0 : 8);
        }
        CameraX cameraX = this.cameraX;
        if (cameraX != null) {
            cameraX.a(state.getFlash());
        }
        CBRIconHandler iconHandler = n0.f432787a.getIconHandler();
        Context contextRequireContext = requireContext();
        if (!zG2) {
            imageName = CBRIconHandler.CBRCommonIcons.TORCH_OFF.getImageName();
        } else {
            imageName = CBRIconHandler.CBRCommonIcons.TORCH_ON.getImageName();
        }
        Drawable drawableOnResolveIcon = iconHandler.onResolveIcon(contextRequireContext, imageName);
        CBRToolbarView cBRToolbarViewR = r();
        if (cBRToolbarViewR != null) {
            cBRToolbarViewR.setOptionButtonDrawable(drawableOnResolveIcon);
        }
        View viewQ = q();
        if (viewQ != null) {
            viewQ.setEnabled(state.getEnableTakePicture());
        }
        View viewQ2 = q();
        if ((viewQ2 == null || viewQ2.getVisibility() != 0) && state.getShowTakePicture()) {
            a(true, q(), (Y41.a<G0>) new d(this));
        } else {
            View viewQ3 = q();
            if (viewQ3 != null) {
                viewQ3.setVisibility(state.getShowTakePicture() ? 0 : 8);
            }
        }
        if (!L.f(this.helperState, state.getHelperState())) {
            CBRHelperViewState cBRHelperViewStateH = state.getHelperState();
            if (cBRHelperViewStateH instanceof CBRHelperViewState.Intro) {
                a(((CBRHelperViewState.Intro) state.getHelperState()).getStepInfo(), (Map<String, ? extends Object>) ((CBRHelperViewState.Intro) state.getHelperState()).getInstuctionsData(), ((CBRHelperViewState.Intro) state.getHelperState()).getCountryCode());
            } else if (cBRHelperViewStateH instanceof CBRHelperViewState.BriefDetails) {
                a(((CBRHelperViewState.BriefDetails) state.getHelperState()).getTitle(), ((CBRHelperViewState.BriefDetails) state.getHelperState()).getBrief(), ((CBRHelperViewState.BriefDetails) state.getHelperState()).getDetails(), ((CBRHelperViewState.BriefDetails) state.getHelperState()).getStepInfo(), ((CBRHelperViewState.BriefDetails) state.getHelperState()).getCountryCode());
            } else {
                boolean z12 = cBRHelperViewStateH instanceof CBRHelperViewState.InvalidValue;
            }
            this.helperState = state.getHelperState();
        }
        a(state);
    }

    public void u() {
    }

    /* compiled from: CBRCameraFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"ru/cyberity/cbr/camera/a$c", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "p0", "Lkotlin/G0;", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "onAnimationEnd", "onAnimationRepeat", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class c implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y41.a<G0> f431980a;

        public c(Y41.a<G0> aVar) {
            this.f431980a = aVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@l Animation p02) {
            Y41.a<G0> aVar = this.f431980a;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@l Animation p02) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@l Animation p02) {
        }
    }

    /* compiled from: CBRCameraFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"ru/cyberity/cbr/camera/a$k", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "Lkotlin/G0;", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "onAnimationEnd", "onAnimationRepeat", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class k implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a<VM> f431991a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y41.a<G0> f431992b;

        public k(a<VM> aVar, Y41.a<G0> aVar2) {
            this.f431991a = aVar;
            this.f431992b = aVar2;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@l Animation animation) {
            View viewL = this.f431991a.l();
            if (viewL != null) {
                viewL.setVisibility(8);
            }
            this.f431992b.invoke();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@l Animation animation) {
            View viewL = this.f431991a.l();
            if (viewL == null) {
                return;
            }
            viewL.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@l Animation animation) {
        }
    }

    public static /* synthetic */ Object a(a aVar, InterfaceC20120j0 interfaceC20120j0, ru.cyberity.cbr.core.domain.camera.b bVar, Continuation continuation) {
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, View view) {
        BottomSheetBehavior<View> bottomSheetBehavior = aVar.helperViewBehavior;
        if (bottomSheetBehavior == null || bottomSheetBehavior.f355975L != 3) {
            return;
        }
        bottomSheetBehavior.b(4);
    }

    private final boolean a(CBRStepInfo stepInfo, String countryCode) throws Resources.NotFoundException {
        CBRInstructionsViewHandler instructionsViewHandler = n0.f432787a.getInstructionsViewHandler();
        View viewOnVerificationStep = instructionsViewHandler != null ? instructionsViewHandler.onVerificationStep(requireContext(), stepInfo.getStep(), stepInfo.getDocumentType(), stepInfo.getScene(), CBRInstructionsViewHandler.Position.BOTTOMSHEET.getValue(), countryCode) : null;
        if (viewOnVerificationStep == null) {
            return false;
        }
        View view = getView();
        View viewFindViewById = view != null ? view.findViewById(R.id.cbr_brief_details) : null;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        View view2 = getView();
        ViewGroup viewGroup = view2 != null ? (ViewGroup) view2.findViewById(R.id.cbr_intro_content) : null;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        if (viewGroup == null) {
            return true;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.cbr_margin_medium);
        marginLayoutParams.setMarginStart(dimensionPixelSize);
        marginLayoutParams.setMarginEnd(dimensionPixelSize);
        marginLayoutParams.bottomMargin = dimensionPixelSize;
        G0 g02 = G0.f406611a;
        viewGroup.addView(viewOnVerificationStep, marginLayoutParams);
        return true;
    }

    /* compiled from: CBRCameraFragment.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"ru/cyberity/cbr/camera/a$f", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;", "Landroid/view/View;", "bottomSheet", "", "slideOffset", "Lkotlin/G0;", "onSlide", "(Landroid/view/View;F)V", "", "newState", "onStateChanged", "(Landroid/view/View;I)V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class f extends BottomSheetBehavior.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a<VM> f431983a;

        public f(a<VM> aVar) {
            this.f431983a = aVar;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public void onStateChanged(@Y61.k View bottomSheet, int newState) {
            TextView textViewF = this.f431983a.f();
            CharSequence text = textViewF != null ? textViewF.getText() : null;
            if (text == null || text.length() == 0) {
                return;
            }
            if (newState != 3) {
                if (newState != 4) {
                    return;
                }
                ru.cyberity.cbr.core.analytics.c.a(this.f431983a.getAnalyticsDelegate(), Screen.CameraScreen, null, 2, null);
                TextView textViewE = this.f431983a.e();
                if (textViewE != null) {
                    textViewE.setVisibility(0);
                }
                TextView textViewF2 = this.f431983a.f();
                if (textViewF2 == null) {
                    return;
                }
                textViewF2.setVisibility(4);
                return;
            }
            ru.cyberity.cbr.core.analytics.c.b(this.f431983a.getAnalyticsDelegate(), Screen.CameraScreen, null, 2, null);
            TextView textViewE2 = this.f431983a.e();
            if (textViewE2 != null) {
                textViewE2.setVisibility(4);
            }
            TextView textViewF3 = this.f431983a.f();
            if (textViewF3 != null) {
                textViewF3.setVisibility(0);
            }
            CBREventHandler eventHandler = n0.f432787a.getEventHandler();
            if (eventHandler != null) {
                eventHandler.onEvent(CBREvent.ShowMoreGuidance.INSTANCE);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public void onSlide(@Y61.k View bottomSheet, float slideOffset) {
        }
    }

    private final void a(CBRStepInfo stepInfo, Map<String, ? extends Object> instructionsData, String countryCode) {
        View view = getView();
        View viewFindViewById = view != null ? view.findViewById(R.id.cbr_brief_details) : null;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "initIntroHelper: stepInfo=" + stepInfo, null, 4, null);
        View view2 = getView();
        if (view2 == null) {
            return;
        }
        if (!a(stepInfo, countryCode)) {
            ViewGroup viewGroup = (ViewGroup) view2.findViewById(R.id.cbr_intro_content);
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            new InstructionsRender(getServiceLocator().getExtensionProvider(), false).renderInstructions(view2, instructionsData, R.id.cbr_intro_content, -1);
        }
        a();
    }

    private final void a(CharSequence title, CharSequence brief, CharSequence details, CBRStepInfo stepInfo, String countryCode) throws Resources.NotFoundException {
        ru.cyberity.cbr.camera.photo.presentation.document.e eVar = ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a;
        StringBuilder sb2 = new StringBuilder("initBriefDetailsHelper: hasHelperView=");
        sb2.append(i() != null);
        ru.cyberity.cbr.camera.photo.presentation.document.e.a(eVar, "DocCapture", sb2.toString(), null, 4, null);
        if (i() == null) {
            return;
        }
        boolean zA2 = a(stepInfo, countryCode);
        ru.cyberity.cbr.camera.photo.presentation.document.e.a(eVar, "DocCapture", com.avito.android.bxcontent.mvi.entity.f.l("initBriefDetailsHelper: customViewApplied=", zA2), null, 4, null);
        if (!zA2) {
            View view = getView();
            View viewFindViewById = view != null ? view.findViewById(R.id.cbr_brief_details) : null;
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
            View view2 = getView();
            View viewFindViewById2 = view2 != null ? view2.findViewById(R.id.cbr_intro_content) : null;
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(8);
            }
            TextView textViewH = h();
            if (textViewH != null) {
                textViewH.setText(title);
            }
            TextView textViewE = e();
            if (textViewE != null) {
                textViewE.setText(brief);
            }
            TextView textViewF = f();
            if (textViewF != null) {
                textViewF.setText(details);
            }
            BottomSheetBehavior<View> bottomSheetBehavior = this.helperViewBehavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.M(false);
                bottomSheetBehavior.v(new f(this));
            }
        }
        a();
    }

    private final void a() {
        View viewI = i();
        if (viewI != null) {
            P.b(viewI, new b(viewI, this));
        }
    }

    private final void a(Map<String, Boolean> grantResults) {
        Logger.v$default(ru.cyberity.log.a.f436064a, "CameraFragment", "handlePermissionResults: " + grantResults, null, 4, null);
        if (L.f(grantResults.get("android.permission.CAMERA"), Boolean.TRUE)) {
            return;
        }
        getViewModel().g();
    }

    private final void a(CBRViewModel.ShowPermissionDialog event) {
        Logger.v$default(ru.cyberity.log.a.f436064a, "CameraFragment", "showLackOfCameraPermissionsDialog:", null, 4, null);
        androidx.appcompat.app.l lVarA = ru.cyberity.cbr.core.android.a.f432580a.a(requireActivity(), event.getMessage(), event.getPositiveButton(), event.getNegativeButton(), new i(this), new j(this));
        this.lackOfPermissionDialog = lVarA;
        if (lVarA != null) {
            lVarA.show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(a aVar, boolean z12, View view, Y41.a aVar2, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateAlpha");
        }
        if ((i12 & 4) != 0) {
            aVar2 = null;
        }
        aVar.a(z12, view, (Y41.a<G0>) aVar2);
    }

    public final void a(boolean appear, @l View view, @l Y41.a<G0> onEnd) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        if (!appear) {
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        }
        alphaAnimation.setDuration(d());
        alphaAnimation.setAnimationListener(new c(onEnd));
        if (view != null) {
            view.startAnimation(alphaAnimation);
        }
    }

    public final void a(@Y61.k Y41.a<G0> finishCallback) {
        Logger.v$default(ru.cyberity.log.a.f436064a, "DocCapture", "showPhotoMadeAnimation", null, 4, null);
        View viewL = l();
        if (viewL != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(d());
            alphaAnimation.setAnimationListener(new k(this, finishCallback));
            viewL.startAnimation(alphaAnimation);
        }
    }
}
