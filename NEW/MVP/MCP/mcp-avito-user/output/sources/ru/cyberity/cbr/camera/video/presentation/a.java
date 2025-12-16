package ru.cyberity.cbr.camera.video.presentation;

import Fc1.D3;
import Y61.k;
import Y61.l;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.camera.core.C20144v;
import androidx.camera.view.PreviewView;
import androidx.core.content.res.i;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.result.h;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import e11.ViewOnClickListenerC39879j1;
import i.b;
import j.InterfaceC42156l;
import j.InterfaceC42165v;
import java.io.File;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.n;
import pY0.C47034b;
import ru.cyberity.cbr.camera.video.presentation.CBRVideoSelfieViewModel;
import ru.cyberity.cbr.core.analytics.Control;
import ru.cyberity.cbr.core.analytics.PermissionPayload;
import ru.cyberity.cbr.core.analytics.Screen;
import ru.cyberity.cbr.core.common.LifecycleAwareFindView;
import ru.cyberity.cbr.core.common.i0;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.common.t;
import ru.cyberity.cbr.core.domain.camera.CameraX;
import ru.cyberity.cbr.core.presentation.BaseFragment;
import ru.cyberity.cbr.core.presentation.CBRAnalyticsScreenMapper;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRColorElement;
import ru.cyberity.internal.R;

/* compiled from: CBRVideoSelfieFragment.kt */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\f\u0018\u0000 n2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001aB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0006J!\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010\u0006J\u001f\u0010\u001a\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010$J\u0019\u0010\u001a\u001a\u00020\f2\b\b\u0001\u0010%\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010&J\u0019\u0010(\u001a\u00020\f2\b\b\u0001\u0010'\u001a\u00020\u0007H\u0002¢\u0006\u0004\b(\u0010&J#\u0010\u001a\u001a\u00020\f2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)H\u0002¢\u0006\u0004\b\u001a\u0010-J\u001d\u0010\u001a\u001a\u00020+2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020*0.H\u0002¢\u0006\u0004\b\u001a\u00100J\u000f\u00101\u001a\u00020\fH\u0002¢\u0006\u0004\b1\u0010\u0006J\u000f\u00102\u001a\u00020\fH\u0002¢\u0006\u0004\b2\u0010\u0006R\u001b\u00106\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u00103\u001a\u0004\b4\u00105R\u001a\u0010;\u001a\u0002078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u00108\u001a\u0004\b9\u0010:R\u001d\u0010@\u001a\u0004\u0018\u00010<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010?R\u001d\u0010D\u001a\u0004\u0018\u00010A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010=\u001a\u0004\b(\u0010CR\u001d\u0010H\u001a\u0004\u0018\u00010E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010=\u001a\u0004\bF\u0010GR\u001d\u0010K\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010=\u001a\u0004\bI\u0010JR\u001d\u0010L\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010=\u001a\u0004\b\r\u0010JR\u001d\u0010O\u001a\u0004\u0018\u00010E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010=\u001a\u0004\bN\u0010GR\u001d\u0010Q\u001a\u0004\u0018\u00010E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010=\u001a\u0004\bM\u0010GR\u001d\u0010R\u001a\u0004\u0018\u00010E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010=\u001a\u0004\bP\u0010GR\u0018\u0010U\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010TR\u0018\u0010X\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010WR\u0014\u0010[\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010ZR$\u0010_\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0.\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010b\u001a\u00020*8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR \u0010f\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020c0)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR \u0010h\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020c0)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010eR \u0010j\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020c0)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010eR \u0010l\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020c0)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010eR \u0010m\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020c0)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010e¨\u0006o"}, d2 = {"Lru/cyberity/cbr/camera/video/presentation/a;", "Lru/cyberity/cbr/core/presentation/BaseFragment;", "Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$d;", "Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel;", "Lru/cyberity/cbr/core/domain/camera/a;", "<init>", "()V", "", "getLayoutId", "()I", "Ljava/io/File;", "file", "Lkotlin/G0;", "c", "(Ljava/io/File;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onViewModelPrepared", "(Landroid/os/Bundle;)V", "onStart", "onDestroyView", VoiceInfo.STATE, "a", "(Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$d;Landroid/os/Bundle;)V", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "event", "handleEvent", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;)V", "onStop", "Landroid/content/Context;", "context", "colorAttr", "(Landroid/content/Context;I)I", "drawableRes", "(I)V", "color", "b", "", "", "", "grantResults", "(Ljava/util/Map;)V", "", "permissions", "([Ljava/lang/String;)Z", "m", "l", "Lkotlin/C;", "k", "()Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel;", "viewModel", "Lru/cyberity/cbr/core/analytics/Screen;", "Lru/cyberity/cbr/core/analytics/Screen;", "getScreen", "()Lru/cyberity/cbr/core/analytics/Screen;", "screen", "Landroidx/camera/view/PreviewView;", "Lru/cyberity/cbr/core/common/LifecycleAwareFindView;", "e", "()Landroidx/camera/view/PreviewView;", "previewView", "Landroid/widget/ProgressBar;", "d", "()Landroid/widget/ProgressBar;", "circleProgressView", "Landroid/widget/TextView;", "g", "()Landroid/widget/TextView;", "tvCounter", "f", "()Landroid/view/View;", "stopView", "doneView", "h", "j", "tvText", "i", "tvDescription1", "tvDescription2", "Landroidx/appcompat/app/l;", "Landroidx/appcompat/app/l;", "lackOfCameraDialog", "Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$State;", "Lru/cyberity/cbr/camera/video/presentation/CBRVideoSelfieViewModel$State;", "lastState", "Lru/cyberity/cbr/core/domain/camera/CameraX;", "Lru/cyberity/cbr/core/domain/camera/CameraX;", "cameraX", "Landroidx/activity/result/h;", "n", "Landroidx/activity/result/h;", "permissionLauncher", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "", "getOpenPayload", "()Ljava/util/Map;", "openPayload", "getCancelPayload", "cancelPayload", "getClosePayload", "closePayload", "getAppearPayload", "appearPayload", "permissionsPayload", "o", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a extends BaseFragment<CBRVideoSelfieViewModel.d, CBRVideoSelfieViewModel> implements ru.cyberity.cbr.core.domain.camera.a {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @k
    public static final Companion INSTANCE;

    /* renamed from: p, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f432493p;

    /* renamed from: s, reason: collision with root package name */
    @k
    private static final String[] f432494s;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @l
    private androidx.appcompat.app.l lackOfCameraDialog;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @l
    private CBRVideoSelfieViewModel.State lastState;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @l
    private h<String[]> permissionLauncher;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final InterfaceC42726C viewModel = k0.a(this, m0.f406844a.b(CBRVideoSelfieViewModel.class), new d(new c(this)), new e());

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final Screen screen = CBRAnalyticsScreenMapper.INSTANCE.getScreenByFragment(this);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView previewView = i0.a(this, R.id.cbr_camera);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView circleProgressView = i0.a(this, R.id.cbr_video_circle_progress);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvCounter = i0.a(this, R.id.cbr_counter);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView stopView = i0.a(this, R.id.cbr_stop);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView doneView = i0.a(this, R.id.cbr_done);

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvText = i0.a(this, R.id.cbr_text);

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvDescription1 = i0.a(this, R.id.cbr_description_1);

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvDescription2 = i0.a(this, R.id.cbr_description_2);

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @k
    private final CameraX cameraX = new CameraX(CameraX.Mode.VIDEO, null, C20144v.f24562b, this, 2, null);

    /* compiled from: CBRVideoSelfieFragment.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lru/cyberity/cbr/camera/video/presentation/a$a;", "", "", "idDocSetType", "type", "Lru/cyberity/cbr/camera/video/presentation/a;", "a", "EXTRA_FILE", "Ljava/lang/String;", "EXTRA_PHRASE", "", "REQUIRED_PERMISSIONS", "[Ljava/lang/String;", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.camera.video.presentation.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final a a(@k String idDocSetType, @k String type) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_ID_DOC_SET_TYPE", idDocSetType);
            bundle.putString("EXTRA_TYPE", type);
            aVar.setArguments(bundle);
            return aVar;
        }

        private Companion() {
        }
    }

    /* compiled from: CBRVideoSelfieFragment.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f432509a;

        static {
            int[] iArr = new int[CBRVideoSelfieViewModel.State.values().length];
            iArr[CBRVideoSelfieViewModel.State.Countdown.ordinal()] = 1;
            iArr[CBRVideoSelfieViewModel.State.Recording.ordinal()] = 2;
            iArr[CBRVideoSelfieViewModel.State.Done.ordinal()] = 3;
            f432509a = iArr;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "a", "()Landroidx/fragment/app/Fragment;", "androidx/fragment/app/a0"}, k = 3, mv = {1, 7, 1})
    public static final class c extends N implements Y41.a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f432510a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f432510a = fragment;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f432510a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "a", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/b0"}, k = 3, mv = {1, 7, 1})
    public static final class d extends N implements Y41.a<S0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y41.a f432511a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f432511a = aVar;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S0 invoke() {
            return ((T0) this.f432511a.invoke()).getF42820b();
        }
    }

    /* compiled from: CBRVideoSelfieFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/P0$c;", "a", "()Landroidx/lifecycle/P0$c;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends N implements Y41.a<P0.c> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P0.c invoke() {
            a aVar = a.this;
            return new ru.cyberity.cbr.camera.video.presentation.b(aVar, aVar.getServiceLocator(), a.this.getArguments());
        }
    }

    static {
        h0 h0Var = new h0(a.class, "previewView", "getPreviewView()Landroidx/camera/view/PreviewView;", 0);
        n0 n0Var = m0.f406844a;
        f432493p = new n[]{n0Var.i(h0Var), C0.k(a.class, "circleProgressView", "getCircleProgressView()Landroid/widget/ProgressBar;", 0, n0Var), C0.k(a.class, "tvCounter", "getTvCounter()Landroid/widget/TextView;", 0, n0Var), C0.k(a.class, "stopView", "getStopView()Landroid/view/View;", 0, n0Var), C0.k(a.class, "doneView", "getDoneView()Landroid/view/View;", 0, n0Var), C0.k(a.class, "tvText", "getTvText()Landroid/widget/TextView;", 0, n0Var), C0.k(a.class, "tvDescription1", "getTvDescription1()Landroid/widget/TextView;", 0, n0Var), C0.k(a.class, "tvDescription2", "getTvDescription2()Landroid/widget/TextView;", 0, n0Var)};
        INSTANCE = new Companion(null);
        f432494s = new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
    }

    private final ProgressBar b() {
        return (ProgressBar) this.circleProgressView.a(this, f432493p[1]);
    }

    private final View c() {
        return this.doneView.a(this, f432493p[4]);
    }

    private final Map<String, Object> d() {
        Context context = getContext();
        if (context == null) {
            return kotlin.collections.P0.c();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(PermissionPayload.MICROPHONE_PERMISSION.toString(), Boolean.valueOf(t.a(context, "android.permission.RECORD_AUDIO")));
        linkedHashMap.put(PermissionPayload.CAMERA_PERMISSION.toString(), Boolean.valueOf(t.a(context, "android.permission.CAMERA")));
        return linkedHashMap;
    }

    private final PreviewView e() {
        return (PreviewView) this.previewView.a(this, f432493p[0]);
    }

    private final View f() {
        return this.stopView.a(this, f432493p[3]);
    }

    private final TextView g() {
        return (TextView) this.tvCounter.a(this, f432493p[2]);
    }

    private final TextView h() {
        return (TextView) this.tvDescription1.a(this, f432493p[6]);
    }

    private final TextView i() {
        return (TextView) this.tvDescription2.a(this, f432493p[7]);
    }

    private final TextView j() {
        return (TextView) this.tvText.a(this, f432493p[5]);
    }

    private final void l() {
        this.cameraX.a(getViewLifecycleOwner(), e());
        this.cameraX.a(this.cameraX.f().getMax());
    }

    private final void m() {
        if (this.lackOfCameraDialog == null && getIsPrepared()) {
            CBRVideoSelfieViewModel.e eVarD = getViewModel().currentState().getViewText();
            final int i12 = 0;
            final int i13 = 1;
            androidx.appcompat.app.l lVarCreate = new C47034b(requireContext()).setMessage(eVarD.getLackOfCameraMessage()).setPositiveButton(eVarD.getLackOfCameraPositive(), new DialogInterface.OnClickListener(this) { // from class: ru.cyberity.cbr.camera.video.presentation.c

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f432516c;

                {
                    this.f432516c = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i14) {
                    switch (i12) {
                        case 0:
                            a.b(this.f432516c, dialogInterface, i14);
                            break;
                        default:
                            a.a(this.f432516c, dialogInterface, i14);
                            break;
                    }
                }
            }).setOnCancelListener((DialogInterface.OnCancelListener) new D3(this, 19)).setNeutralButton(eVarD.getLackOfCameraNeutral(), new DialogInterface.OnClickListener(this) { // from class: ru.cyberity.cbr.camera.video.presentation.c

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f432516c;

                {
                    this.f432516c = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i14) {
                    switch (i13) {
                        case 0:
                            a.b(this.f432516c, dialogInterface, i14);
                            break;
                        default:
                            a.a(this.f432516c, dialogInterface, i14);
                            break;
                    }
                }
            }).create();
            this.lackOfCameraDialog = lVarCreate;
            if (lVarCreate != null) {
                lVarCreate.show();
            }
        }
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public Map<String, Object> getAppearPayload() {
        return d();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public Map<String, Object> getCancelPayload() {
        return d();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public Map<String, Object> getClosePayload() {
        return d();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public String getIdDocSetType() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("EXTRA_ID_DOC_SET_TYPE") : null;
        return string == null ? "TYPE_UNKNOWN" : string;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public int getLayoutId() {
        return R.layout.cbr_fragment_video_selfie;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public Map<String, Object> getOpenPayload() {
        return d();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public Screen getScreen() {
        return this.screen;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public void handleEvent(@k CBRViewModel.CBRViewModelEvent event) {
        ProgressBar progressBarB;
        if (event instanceof CBRVideoSelfieViewModel.b.C12426b) {
            this.cameraX.a(((CBRVideoSelfieViewModel.b.C12426b) event).getFile());
            return;
        }
        if (event instanceof CBRVideoSelfieViewModel.b.c) {
            this.cameraX.h();
            return;
        }
        if (event instanceof CBRVideoSelfieViewModel.b.a) {
            Bundle bundle = new Bundle();
            CBRVideoSelfieViewModel.b.a aVar = (CBRVideoSelfieViewModel.b.a) event;
            bundle.putString("EXTRA_FILE", aVar.getResult().getFile().getAbsolutePath());
            bundle.putString("EXTRA_PHRASE", aVar.getResult().getPhrase());
            G0 g02 = G0.f406611a;
            BaseFragment.finishWithResult$default(this, 0, bundle, 1, null);
            return;
        }
        if (!(event instanceof CBRVideoSelfieViewModel.b.d.C12427b)) {
            if (!(event instanceof CBRVideoSelfieViewModel.b.d.a)) {
                super.handleEvent(event);
                return;
            }
            if (b.f432509a[((CBRVideoSelfieViewModel.b.d.a) event).getCom.avito.android.remote.model.messenger.voice.VoiceInfo.STATE java.lang.String().ordinal()] == 2) {
                getViewModel().e();
                ProgressBar progressBarB2 = b();
                if (progressBarB2 == null) {
                    return;
                }
                progressBarB2.setProgress(0);
                return;
            }
            return;
        }
        CBRVideoSelfieViewModel.b.d.C12427b c12427b = (CBRVideoSelfieViewModel.b.d.C12427b) event;
        int i12 = b.f432509a[c12427b.getCom.avito.android.remote.model.messenger.voice.VoiceInfo.STATE java.lang.String().ordinal()];
        if (i12 != 1) {
            if (i12 == 2 && (progressBarB = b()) != null) {
                progressBarB.setProgress((int) (((7600 - c12427b.getMs()) * 100) / 7600));
                return;
            }
            return;
        }
        long jB2 = ((3000 - c12427b.getMs()) * 100) / 3000;
        ProgressBar progressBarB3 = b();
        if (progressBarB3 != null) {
            progressBarB3.setProgress((int) jB2);
        }
        TextView textViewG = g();
        if (textViewG == null) {
            return;
        }
        u0 u0Var = u0.f406856a;
        textViewG.setText(String.format("%d", Arrays.copyOf(new Object[]{Long.valueOf((c12427b.getMs() / TimeUnit.SECONDS.toMillis(1L)) + 1)}, 1)));
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public CBRVideoSelfieViewModel getViewModel() {
        return (CBRVideoSelfieViewModel) this.viewModel.getValue();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.cameraX.g();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        String[] strArr = f432494s;
        if (a(strArr)) {
            getViewModel().g();
            return;
        }
        h<String[]> hVar = this.permissionLauncher;
        if (hVar != null) {
            hVar.b(strArr);
        }
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        androidx.appcompat.app.l lVar = this.lackOfCameraDialog;
        if (lVar != null) {
            lVar.dismiss();
        }
        this.lackOfCameraDialog = null;
        getViewModel().a();
        this.cameraX.h();
        super.onStop();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@k View view, @l Bundle savedInstanceState) {
        Drawable background;
        Integer color;
        super.onViewCreated(view, savedInstanceState);
        this.permissionLauncher = registerForActivityResult(new b.k(), new com.avito.android.str_seller_orders.orders_seller.a(this, 11));
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
        int iA2 = (customTheme == null || (color = themeHelper.getColor(customTheme, CBRColorElement.CONTENT_CRITICAL, themeHelper.isDarkTheme(view))) == null) ? a(requireContext(), R.attr.cbr_colorOnRejected) : color.intValue();
        View viewF = f();
        if (viewF == null || (background = viewF.getBackground()) == null) {
            return;
        }
        background.setTint(iA2);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public void onViewModelPrepared(@l Bundle savedInstanceState) {
        super.onViewModelPrepared(savedInstanceState);
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, Map map) {
        aVar.a((Map<String, Boolean>) map);
    }

    private final void b(@InterfaceC42156l int color) {
        ProgressBar progressBarB = b();
        Drawable indeterminateDrawable = progressBarB != null ? progressBarB.getIndeterminateDrawable() : null;
        if (indeterminateDrawable == null) {
            return;
        }
        indeterminateDrawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
    }

    @Override // ru.cyberity.cbr.core.domain.camera.a
    public void c(@k File file) {
        getViewModel().f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(a aVar, DialogInterface dialogInterface, int i12) {
        dialogInterface.dismiss();
        aVar.lackOfCameraDialog = null;
        BaseFragment.finish$default(aVar, null, null, null, 7, null);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(@k CBRVideoSelfieViewModel.d state, @l Bundle savedInstanceState) {
        Drawable progressDrawable;
        TextView textViewJ = j();
        if (textViewJ != null) {
            s.a(textViewJ, state.getViewText().getMessage());
        }
        TextView textViewH = h();
        if (textViewH != null) {
            s.a(textViewH, state.getViewText().getDescription1());
        }
        TextView textViewI = i();
        if (textViewI != null) {
            s.a(textViewI, state.getViewText().getDescription2());
        }
        if (this.lastState == state.getCom.avito.android.remote.model.messenger.voice.VoiceInfo.STATE java.lang.String()) {
            return;
        }
        this.lastState = state.getCom.avito.android.remote.model.messenger.voice.VoiceInfo.STATE java.lang.String();
        CBRVideoSelfieViewModel.State stateC = state.getCom.avito.android.remote.model.messenger.voice.VoiceInfo.STATE java.lang.String();
        int i12 = stateC == null ? -1 : b.f432509a[stateC.ordinal()];
        if (i12 == 1) {
            TextView textViewG = g();
            if (textViewG != null) {
                textViewG.setVisibility(0);
            }
            View viewF = f();
            if (viewF != null) {
                viewF.setVisibility(8);
            }
            View viewC = c();
            if (viewC != null) {
                viewC.setVisibility(8);
            }
            a(R.drawable.circular_progress_bar_countdown);
            ThemeHelper themeHelper = ThemeHelper.INSTANCE;
            ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
            if (customTheme != null) {
                CBRColorElement cBRColorElement = CBRColorElement.CONTENT_WEAK;
                View view = getView();
                Integer color = themeHelper.getColor(customTheme, cBRColorElement, view != null ? themeHelper.isDarkTheme(view) : false);
                if (color != null) {
                    int iIntValue = color.intValue();
                    ProgressBar progressBarB = b();
                    progressDrawable = progressBarB != null ? progressBarB.getProgressDrawable() : null;
                    if (progressDrawable != null) {
                        progressDrawable.setColorFilter(new PorterDuffColorFilter(iIntValue, PorterDuff.Mode.SRC_IN));
                    }
                }
            }
            b(a(requireContext(), R.attr.cbr_colorOnProcessing));
            return;
        }
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            ProgressBar progressBarB2 = b();
            if (progressBarB2 != null) {
                progressBarB2.setProgress(0);
            }
            TextView textViewG2 = g();
            if (textViewG2 != null) {
                textViewG2.setVisibility(8);
            }
            View viewF2 = f();
            if (viewF2 != null) {
                viewF2.setVisibility(8);
            }
            View viewC2 = c();
            if (viewC2 == null) {
                return;
            }
            viewC2.setVisibility(0);
            return;
        }
        TextView textViewG3 = g();
        if (textViewG3 != null) {
            textViewG3.setVisibility(8);
        }
        View viewF3 = f();
        if (viewF3 != null) {
            viewF3.setVisibility(0);
        }
        View viewC3 = c();
        if (viewC3 != null) {
            viewC3.setVisibility(8);
        }
        a(R.drawable.circular_progress_bar_recording);
        ThemeHelper themeHelper2 = ThemeHelper.INSTANCE;
        ru.cyberity.cbr.core.theme.d customTheme2 = themeHelper2.getCustomTheme();
        if (customTheme2 != null) {
            CBRColorElement cBRColorElement2 = CBRColorElement.CONTENT_CRITICAL;
            View view2 = getView();
            Integer color2 = themeHelper2.getColor(customTheme2, cBRColorElement2, view2 != null ? themeHelper2.isDarkTheme(view2) : false);
            if (color2 != null) {
                int iIntValue2 = color2.intValue();
                ProgressBar progressBarB3 = b();
                progressDrawable = progressBarB3 != null ? progressBarB3.getProgressDrawable() : null;
                if (progressDrawable != null) {
                    progressDrawable.setColorFilter(new PorterDuffColorFilter(iIntValue2, PorterDuff.Mode.SRC_IN));
                }
            }
        }
        b(a(requireContext(), R.attr.cbr_colorOnRejected));
        View viewF4 = f();
        if (viewF4 != null) {
            viewF4.setOnClickListener(new ViewOnClickListenerC39879j1(this, 21));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, View view) {
        ru.cyberity.cbr.core.analytics.c.b(aVar.getAnalyticsDelegate(), aVar.getScreen(), aVar.getIdDocSetType(), Control.DoneButton, null, 8, null);
        aVar.getViewModel().e();
        ProgressBar progressBarB = aVar.b();
        if (progressBarB == null) {
            return;
        }
        progressBarB.setProgress(0);
    }

    private final int a(Context context, int colorAttr) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{colorAttr});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    private final void a(@InterfaceC42165v int drawableRes) {
        ProgressBar progressBarB = b();
        if (progressBarB == null) {
            return;
        }
        Resources resources = getResources();
        ActivityC22955m activityC22955mL1 = l1();
        Resources.Theme theme = activityC22955mL1 != null ? activityC22955mL1.getTheme() : null;
        ThreadLocal<TypedValue> threadLocal = i.f44673a;
        progressBarB.setProgressDrawable(resources.getDrawable(drawableRes, theme));
    }

    private final void a(Map<String, Boolean> grantResults) {
        for (String str : f432494s) {
            if (!L.f(grantResults.get(str), Boolean.TRUE)) {
                m();
                return;
            }
        }
        getViewModel().g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        aVar.lackOfCameraDialog = null;
        BaseFragment.finish$default(aVar, null, null, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, DialogInterface dialogInterface, int i12) {
        dialogInterface.dismiss();
        aVar.lackOfCameraDialog = null;
        s.a((Activity) aVar.requireActivity());
    }

    private final boolean a(String[] permissions) {
        for (String str : permissions) {
            if (androidx.core.content.d.checkSelfPermission(requireContext(), str) != 0) {
                return false;
            }
        }
        return true;
    }
}
