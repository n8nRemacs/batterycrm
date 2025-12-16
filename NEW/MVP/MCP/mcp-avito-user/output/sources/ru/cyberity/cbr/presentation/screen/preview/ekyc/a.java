package ru.cyberity.cbr.presentation.screen.preview.ekyc;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.os.C22776d;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import androidx.fragment.app.k0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import kotlin.reflect.n;
import ru.cyberity.cbr.core.analytics.Control;
import ru.cyberity.cbr.core.analytics.GlobalStatePayload;
import ru.cyberity.cbr.core.analytics.Screen;
import ru.cyberity.cbr.core.common.BottomSheetBehaviorExtensionsKt;
import ru.cyberity.cbr.core.common.LifecycleAwareFindView;
import ru.cyberity.cbr.core.common.a0;
import ru.cyberity.cbr.core.common.i0;
import ru.cyberity.cbr.core.data.listener.CBRIconHandler;
import ru.cyberity.cbr.core.data.model.Document;
import ru.cyberity.cbr.core.data.model.DocumentType;
import ru.cyberity.cbr.core.data.source.applicant.remote.p;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.core.presentation.form.FormFragment;
import ru.cyberity.cbr.core.presentation.form.FormViewModelProvider;
import ru.cyberity.cbr.core.presentation.form.HostViewModel;
import ru.cyberity.cbr.core.widget.CBRBottomSheetView;
import ru.cyberity.cbr.core.widget.CBRErrorBottomSheetView;
import ru.cyberity.cbr.core.widget.CBRStepState;
import ru.cyberity.cbr.core.widget.CBRStepStateKt;
import ru.cyberity.cbr.core.widget.CBRTextButton;
import ru.cyberity.cbr.core.widget.CBRToolbarView;
import ru.cyberity.cbr.core.widget.pincode.CBRPinView;
import ru.cyberity.cbr.presentation.screen.preview.ekyc.b;
import ru.cyberity.internal.R;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBREkycFragment.kt */
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u0085\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001dB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0006J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001fH\u0003¢\u0006\u0004\b!\u0010\"J!\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020#2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001d\u0010$J\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020%H\u0002¢\u0006\u0004\b\u001d\u0010&J\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\u001d\u0010\"J\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020'H\u0002¢\u0006\u0004\b\u001d\u0010(J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010*J\u000f\u0010+\u001a\u00020\u000eH\u0002¢\u0006\u0004\b+\u0010\u0006R\u001b\u0010/\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010,\u001a\u0004\b-\u0010.R\u001d\u00104\u001a\u0004\u0018\u0001008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u00101\u001a\u0004\b2\u00103R\u001d\u00106\u001a\u0004\u0018\u0001008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b5\u00103R\u001d\u0010;\u001a\u0004\u0018\u0001078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00101\u001a\u0004\b9\u0010:R\u001d\u0010>\u001a\u0004\u0018\u0001078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00101\u001a\u0004\b=\u0010:R\u001d\u0010B\u001a\u0004\u0018\u00010?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u00101\u001a\u0004\b@\u0010AR\u001d\u0010G\u001a\u0004\u0018\u00010C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u00101\u001a\u0004\bE\u0010FR\u001d\u0010J\u001a\u0004\u0018\u0001078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u00101\u001a\u0004\bI\u0010:R\u001d\u0010M\u001a\u0004\u0018\u00010K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u00101\u001a\u0004\b!\u0010LR\u001d\u0010P\u001a\u0004\u0018\u00010N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u00101\u001a\u0004\b<\u0010OR\u001d\u0010T\u001a\u0004\u0018\u00010Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00101\u001a\u0004\bR\u0010SR\u001d\u0010X\u001a\u0004\u0018\u00010U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u00101\u001a\u0004\b\u001d\u0010WR\u001e\u0010\\\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u001d\u0010_\u001a\u0004\u0018\u00010]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u00101\u001a\u0004\bH\u0010^R\u001d\u0010`\u001a\u0004\u0018\u0001078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u00101\u001a\u0004\bZ\u0010:R\u001d\u0010a\u001a\u0004\u0018\u0001078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u00101\u001a\u0004\bV\u0010:R\u0018\u0010d\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010cR\u0018\u0010g\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010fR\u0018\u0010i\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010fR\u0016\u0010m\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010p\u001a\u00020e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0014\u0010t\u001a\u00020q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR \u0010y\u001a\u000e\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020v0u8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bw\u0010xR \u0010{\u001a\u000e\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020v0u8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010xR \u0010}\u001a\u000e\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020v0u8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010xR \u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020v0u8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b~\u0010xR\u0019\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0080\u00018BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bD\u0010\u0081\u0001R!\u0010\u0083\u0001\u001a\u000e\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020v0u8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010xR\u0019\u0010m\u001a\u00020j*\u00020\u00028BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u001d\u0010\u0084\u0001¨\u0006\u0086\u0001"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/ekyc/a;", "Lru/cyberity/cbr/presentation/screen/preview/a;", "Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e;", "Lru/cyberity/cbr/presentation/screen/preview/ekyc/b;", "Lru/cyberity/cbr/core/presentation/form/FormViewModelProvider;", "<init>", "()V", "", "getLayoutId", "()I", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/G0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lru/cyberity/cbr/core/common/a0;", "finishReason", "", "onFinishCalled", "(Lru/cyberity/cbr/core/common/a0;)Z", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "event", "handleEvent", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;)V", VoiceInfo.STATE, "prevState", "a", "(Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e;Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e;Landroid/os/Bundle;)V", "Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e$d;", "viewState", "b", "(Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e$d;)V", "Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e$e;", "(Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e$e;Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e;)V", "Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e$a;", "(Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e$a;)V", "Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e$f;", "(Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e$f;)V", "nextViewState", "(Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e;)V", "r", "Lkotlin/C;", "p", "()Lru/cyberity/cbr/presentation/screen/preview/ekyc/b;", "viewModel", "Landroid/widget/Button;", "Lru/cyberity/cbr/core/common/LifecycleAwareFindView;", "k", "()Landroid/widget/Button;", "primaryButton", "c", "btnSkip", "Landroid/widget/TextView;", "d", "o", "()Landroid/widget/TextView;", "tvTitle", "e", "n", "tvSubtitle", "Landroid/view/ViewGroup;", "f", "()Landroid/view/ViewGroup;", "formContainer", "Lru/cyberity/cbr/core/widget/pincode/CBRPinView;", "g", "j", "()Lru/cyberity/cbr/core/widget/pincode/CBRPinView;", "pinField", "h", "i", "pinError", "Lru/cyberity/cbr/core/widget/CBRTextButton;", "()Lru/cyberity/cbr/core/widget/CBRTextButton;", "btnResendCode", "Lru/cyberity/cbr/core/widget/CBRErrorBottomSheetView;", "()Lru/cyberity/cbr/core/widget/CBRErrorBottomSheetView;", "errorBottomSheet", "Landroid/webkit/WebView;", "q", "()Landroid/webkit/WebView;", "webView", "Lru/cyberity/cbr/core/widget/CBRBottomSheetView;", "l", "()Lru/cyberity/cbr/core/widget/CBRBottomSheetView;", "bottomSheet", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "m", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomSheetBehavior", "Landroid/widget/ImageView;", "()Landroid/widget/ImageView;", "ivIcon", "tvStatusTitle", "tvStatusComment", "Lru/cyberity/cbr/domain/c;", "Lru/cyberity/cbr/domain/c;", "resources", "", "Ljava/lang/String;", "analyticsCountry", "s", "analyticsSourceId", "Lru/cyberity/cbr/core/analytics/Screen;", "t", "Lru/cyberity/cbr/core/analytics/Screen;", "analyticsScreen", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "Lru/cyberity/cbr/core/presentation/form/HostViewModel;", "getHostViewModel", "()Lru/cyberity/cbr/core/presentation/form/HostViewModel;", "hostViewModel", "", "", "getOpenPayload", "()Ljava/util/Map;", "openPayload", "getAppearPayload", "appearPayload", "getCancelPayload", "cancelPayload", "getClosePayload", "closePayload", "Lru/cyberity/cbr/core/presentation/form/FormFragment;", "()Lru/cyberity/cbr/core/presentation/form/FormFragment;", "formFragment", "commonPayload", "(Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e;)Lru/cyberity/cbr/core/analytics/Screen;", "u", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a extends ru.cyberity.cbr.presentation.screen.preview.a<b.e, ru.cyberity.cbr.presentation.screen.preview.ekyc.b> implements FormViewModelProvider {

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @k
    public static final Companion INSTANCE;

    /* renamed from: v, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f434843v;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @l
    private BottomSheetBehavior<CBRBottomSheetView> bottomSheetBehavior;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @l
    private ru.cyberity.cbr.domain.c resources;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @l
    private String analyticsCountry;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @l
    private String analyticsSourceId;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final InterfaceC42726C viewModel = k0.a(this, m0.f406844a.b(ru.cyberity.cbr.presentation.screen.preview.ekyc.b.class), new g(new f(this)), new h());

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView primaryButton = i0.a(this, R.id.cbr_primary_button);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView btnSkip = i0.a(this, R.id.cbr_secondary_button);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvTitle = i0.a(this, R.id.cbr_title);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvSubtitle = i0.a(this, R.id.cbr_subtitle);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView formContainer = i0.a(this, R.id.cbr_form_container);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView pinField = i0.a(this, R.id.cbr_pin_code);

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView pinError = i0.a(this, R.id.cbr_pin_error);

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView btnResendCode = i0.a(this, R.id.cbr_resend_verification_code);

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView errorBottomSheet = i0.a(this, R.id.cbr_error_bottom_sheet);

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView webView = i0.a(this, R.id.cbr_webview);

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView bottomSheet = i0.a(this, R.id.cbr_web_view_bottom_sheet);

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView ivIcon = i0.a(this, R.id.cbr_status_icon);

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvStatusTitle = i0.a(this, R.id.cbr_status_title);

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvStatusComment = i0.a(this, R.id.cbr_status_comment);

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @k
    private Screen analyticsScreen = Screen.Other;

    /* compiled from: CBREkycFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/ekyc/a$a;", "", "Lru/cyberity/cbr/core/data/model/Document;", "document", "Landroidx/fragment/app/Fragment;", "a", "", "ARGS_DOCUMENT", "Ljava/lang/String;", "TAG", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.presentation.screen.preview.ekyc.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final Fragment a(@k Document document) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARGS_DOCUMENT", document);
            aVar.setArguments(bundle);
            return aVar;
        }

        private Companion() {
        }
    }

    /* compiled from: CBREkycFragment.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"ru/cyberity/cbr/presentation/screen/preview/ekyc/a$c", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;", "Landroid/view/View;", "bottomSheet", "", "newState", "Lkotlin/G0;", "onStateChanged", "(Landroid/view/View;I)V", "", "slideOffset", "onSlide", "(Landroid/view/View;F)V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class c extends BottomSheetBehavior.c {
        public c() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public void onSlide(@k View bottomSheet, float slideOffset) {
            float f12 = slideOffset >= 0.7f ? s.f((1.0f - slideOffset) - 0.05f, 0.0f, 1.0f) : 1.0f;
            ActivityC22955m activity = a.this.l1();
            View viewFindViewById = activity != null ? activity.findViewById(R.id.cbr_toolbar) : null;
            if (viewFindViewById == null) {
                return;
            }
            viewFindViewById.setAlpha(f12);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public void onStateChanged(@k View bottomSheet, int newState) {
            View viewFindViewById;
            ru.cyberity.log.a aVar = ru.cyberity.log.a.f436064a;
            StringBuilder sb2 = new StringBuilder("webViewSheet hidden=");
            sb2.append(newState == 4);
            Logger.v$default(aVar, "EKyc", sb2.toString(), null, 4, null);
            ActivityC22955m activity = a.this.l1();
            if (activity == null || (viewFindViewById = activity.findViewById(R.id.cbr_toolbar)) == null) {
                return;
            }
            ru.cyberity.cbr.core.common.s.b(viewFindViewById, newState == 4);
        }
    }

    /* compiled from: CBREkycFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"ru/cyberity/cbr/presentation/screen/preview/ekyc/a$d", "Lru/cyberity/cbr/core/widget/pincode/CBRPinView$OnTextCompleteListener;", "", "enteredText", "", "onTextComplete", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class d implements CBRPinView.OnTextCompleteListener {
        @Override // ru.cyberity.cbr.core.widget.pincode.CBRPinView.OnTextCompleteListener
        public boolean onTextComplete(@k String enteredText) {
            return true;
        }
    }

    /* compiled from: CBREkycFragment.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\b"}, d2 = {"ru/cyberity/cbr/presentation/screen/preview/ekyc/a$e", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", "Landroid/webkit/WebResourceRequest;", "request", "", "shouldOverrideUrlLoading", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class e extends WebViewClient {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.e.d f434867b;

        public e(b.e.d dVar) {
            this.f434867b = dVar;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@l WebView view, @l WebResourceRequest request) {
            BottomSheetBehavior bottomSheetBehavior = a.this.bottomSheetBehavior;
            if (bottomSheetBehavior == null || bottomSheetBehavior.f355975L != 3) {
                return false;
            }
            Uri url = request != null ? request.getUrl() : null;
            if (url == null) {
                return false;
            }
            return a.this.getViewModel().a(url, this.f434867b.getCallbackUrl());
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "a", "()Landroidx/fragment/app/Fragment;", "androidx/fragment/app/a0"}, k = 3, mv = {1, 7, 1})
    public static final class f extends N implements Y41.a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f434868a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f434868a = fragment;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f434868a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "a", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/b0"}, k = 3, mv = {1, 7, 1})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y41.a f434869a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f434869a = aVar;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S0 invoke() {
            return ((T0) this.f434869a.invoke()).getF42820b();
        }
    }

    /* compiled from: CBREkycFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/P0$c;", "a", "()Landroidx/lifecycle/P0$c;"}, k = 3, mv = {1, 7, 1})
    public static final class h extends N implements Y41.a<P0.c> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P0.c invoke() {
            Bundle arguments = a.this.getArguments();
            Document document = arguments != null ? (Document) C22776d.a(arguments, "ARGS_DOCUMENT", Document.class) : null;
            a aVar = a.this;
            return new b.C12523b(document, aVar, aVar.getServiceLocator(), a.this.getArguments());
        }
    }

    static {
        h0 h0Var = new h0(a.class, "primaryButton", "getPrimaryButton()Landroid/widget/Button;", 0);
        n0 n0Var = m0.f406844a;
        f434843v = new n[]{n0Var.i(h0Var), C0.k(a.class, "btnSkip", "getBtnSkip()Landroid/widget/Button;", 0, n0Var), C0.k(a.class, "tvTitle", "getTvTitle()Landroid/widget/TextView;", 0, n0Var), C0.k(a.class, "tvSubtitle", "getTvSubtitle()Landroid/widget/TextView;", 0, n0Var), C0.k(a.class, "formContainer", "getFormContainer()Landroid/view/ViewGroup;", 0, n0Var), C0.k(a.class, "pinField", "getPinField()Lru/cyberity/cbr/core/widget/pincode/CBRPinView;", 0, n0Var), C0.k(a.class, "pinError", "getPinError()Landroid/widget/TextView;", 0, n0Var), C0.k(a.class, "btnResendCode", "getBtnResendCode()Lru/cyberity/cbr/core/widget/CBRTextButton;", 0, n0Var), C0.k(a.class, "errorBottomSheet", "getErrorBottomSheet()Lru/cyberity/cbr/core/widget/CBRErrorBottomSheetView;", 0, n0Var), C0.k(a.class, "webView", "getWebView()Landroid/webkit/WebView;", 0, n0Var), C0.k(a.class, "bottomSheet", "getBottomSheet()Lru/cyberity/cbr/core/widget/CBRBottomSheetView;", 0, n0Var), C0.k(a.class, "ivIcon", "getIvIcon()Landroid/widget/ImageView;", 0, n0Var), C0.k(a.class, "tvStatusTitle", "getTvStatusTitle()Landroid/widget/TextView;", 0, n0Var), C0.k(a.class, "tvStatusComment", "getTvStatusComment()Landroid/widget/TextView;", 0, n0Var)};
        INSTANCE = new Companion(null);
    }

    private final CBRErrorBottomSheetView e() {
        return (CBRErrorBottomSheetView) this.errorBottomSheet.a(this, f434843v[8]);
    }

    private final ViewGroup f() {
        return (ViewGroup) this.formContainer.a(this, f434843v[4]);
    }

    private final FormFragment g() {
        Fragment fragmentG = getChildFragmentManager().G(R.id.cbr_form_container);
        if (fragmentG instanceof FormFragment) {
            return (FormFragment) fragmentG;
        }
        return null;
    }

    private final ImageView h() {
        return (ImageView) this.ivIcon.a(this, f434843v[11]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView i() {
        return (TextView) this.pinError.a(this, f434843v[6]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CBRPinView j() {
        return (CBRPinView) this.pinField.a(this, f434843v[5]);
    }

    private final Button k() {
        return (Button) this.primaryButton.a(this, f434843v[0]);
    }

    private final TextView l() {
        return (TextView) this.tvStatusComment.a(this, f434843v[13]);
    }

    private final TextView m() {
        return (TextView) this.tvStatusTitle.a(this, f434843v[12]);
    }

    private final TextView n() {
        return (TextView) this.tvSubtitle.a(this, f434843v[3]);
    }

    private final TextView o() {
        return (TextView) this.tvTitle.a(this, f434843v[2]);
    }

    private final WebView q() {
        return (WebView) this.webView.a(this, f434843v[9]);
    }

    private final void r() {
        getViewModel().n();
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

    @Override // ru.cyberity.cbr.core.presentation.form.FormViewModelProvider
    @k
    public HostViewModel getHostViewModel() {
        return getViewModel();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public String getIdDocSetType() {
        DocumentType type;
        String strC;
        Bundle arguments = getArguments();
        Document document = arguments != null ? (Document) C22776d.a(arguments, "ARGS_DOCUMENT", Document.class) : null;
        return (document == null || (type = document.getType()) == null || (strC = type.getValue()) == null) ? "TYPE_UNKNOWN" : strC;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public int getLayoutId() {
        return R.layout.cbr_fragment_ekyc;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public Map<String, Object> getOpenPayload() {
        return d();
    }

    @Override // ru.cyberity.cbr.presentation.screen.preview.a, ru.cyberity.cbr.core.presentation.BaseFragment
    public void handleEvent(@k CBRViewModel.CBRViewModelEvent event) {
        if (!(event instanceof b.d)) {
            super.handleEvent(event);
            return;
        }
        CBRErrorBottomSheetView cBRErrorBottomSheetViewE = e();
        if (cBRErrorBottomSheetViewE != null) {
            b.d dVar = (b.d) event;
            CBRErrorBottomSheetView.show$default(cBRErrorBottomSheetViewE, dVar.getErrorText(), null, dVar.getButtonText(), null, null, 26, null);
        }
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        WebView webViewQ = q();
        if (webViewQ != null) {
            webViewQ.destroy();
        }
        super.onDestroyView();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public boolean onFinishCalled(@k a0 finishReason) {
        CBRPinView cBRPinViewJ = j();
        if (cBRPinViewJ != null) {
            ru.cyberity.cbr.core.common.s.b(cBRPinViewJ);
        }
        return getViewModel().j() && super.onFinishCalled(finishReason);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@k View view, @l Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        CBRBottomSheetView cBRBottomSheetViewA = a();
        if (cBRBottomSheetViewA != null) {
            BottomSheetBehavior<CBRBottomSheetView> bottomSheetBehaviorB = BottomSheetBehavior.B(cBRBottomSheetViewA);
            bottomSheetBehaviorB.b(4);
            bottomSheetBehaviorB.M(false);
            bottomSheetBehaviorB.f355974K = false;
            bottomSheetBehaviorB.N(0, false);
            bottomSheetBehaviorB.K(false);
            bottomSheetBehaviorB.J(0);
            bottomSheetBehaviorB.v(new c());
            bottomSheetBehaviorB.b(4);
            this.bottomSheetBehavior = bottomSheetBehaviorB;
        }
        CBRBottomSheetView cBRBottomSheetViewA2 = a();
        CBRToolbarView cBRToolbarView = cBRBottomSheetViewA2 != null ? (CBRToolbarView) cBRBottomSheetViewA2.findViewById(R.id.cbr_bottomsheet_toolbar) : null;
        if (cBRToolbarView != null) {
            cBRToolbarView.setCloseButtonDrawable(ru.cyberity.cbr.core.common.n0.f432787a.getIconHandler().onResolveIcon(requireContext(), CBRIconHandler.CBRCommonIcons.CLOSE.getImageName()));
        }
        if (cBRToolbarView != null) {
            cBRToolbarView.setOnCloseButtonClickListener(new ru.cyberity.cbr.presentation.screen.preview.ekyc.e(this, 0));
        }
        Button buttonC = c();
        if (buttonC != null) {
            buttonC.setOnClickListener(new ru.cyberity.cbr.presentation.screen.preview.ekyc.e(this, 1));
        }
        CBRPinView cBRPinViewJ = j();
        if (cBRPinViewJ != null) {
            cBRPinViewJ.addTextChangedListener(new b());
        }
        CBRPinView cBRPinViewJ2 = j();
        if (cBRPinViewJ2 == null) {
            return;
        }
        cBRPinViewJ2.setOnTextCompleteListener(new d());
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public ru.cyberity.cbr.presentation.screen.preview.ekyc.b getViewModel() {
        return (ru.cyberity.cbr.presentation.screen.preview.ekyc.b) this.viewModel.getValue();
    }

    private final CBRBottomSheetView a() {
        return (CBRBottomSheetView) this.bottomSheet.a(this, f434843v[10]);
    }

    private final CBRTextButton b() {
        return (CBRTextButton) this.btnResendCode.a(this, f434843v[7]);
    }

    private final Button c() {
        return (Button) this.btnSkip.a(this, f434843v[1]);
    }

    private final Map<String, Object> d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.analyticsCountry;
        if (str != null) {
            linkedHashMap.put(GlobalStatePayload.Country.getText(), str);
        }
        String str2 = this.analyticsSourceId;
        if (str2 != null) {
            linkedHashMap.put("sourceId", str2);
        }
        if (this.analyticsScreen == Screen.EkycFinishScreen) {
            linkedHashMap.put("result", "failure");
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(a aVar, View view) {
        aVar.getAnalyticsDelegate().b(aVar.analyticsScreen, aVar.getIdDocSetType(), Control.SkipButton, aVar.d());
        aVar.getViewModel().q();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private final void b(b.e.d viewState) {
        ru.cyberity.cbr.core.common.s.c(a());
        View view = getView();
        if (view != null) {
            ru.cyberity.cbr.core.common.s.b(view);
        }
        WebView webViewQ = q();
        if (webViewQ != null) {
            ru.cyberity.cbr.core.common.s.b((View) webViewQ, true);
        }
        WebView webViewQ2 = q();
        if (webViewQ2 != null) {
            webViewQ2.setWebViewClient(new e(viewState));
        }
        WebView webViewQ3 = q();
        WebSettings settings = webViewQ3 != null ? webViewQ3.getSettings() : null;
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        String strD = viewState.getCom.avito.android.remote.model.messenger.context_actions.ContextActionHandler.Link.URL java.lang.String();
        if (strD != null) {
            WebView webViewQ4 = q();
            if (webViewQ4 != null) {
                webViewQ4.loadUrl(strD);
            }
            WebView webViewQ5 = q();
            if (webViewQ5 != null) {
                webViewQ5.getUrl();
            }
        }
        BottomSheetBehavior<CBRBottomSheetView> bottomSheetBehavior = this.bottomSheetBehavior;
        if (bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.b(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(a aVar, View view) {
        aVar.getViewModel().o();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(@k b.e state, @l b.e prevState, @l Bundle savedInstanceState) {
        FormFragment formFragmentG;
        BottomSheetBehavior<CBRBottomSheetView> bottomSheetBehavior;
        BottomSheetBehavior<CBRBottomSheetView> bottomSheetBehavior2;
        b(state);
        boolean z12 = state instanceof b.e.d;
        if (!z12 && (bottomSheetBehavior = this.bottomSheetBehavior) != null && BottomSheetBehaviorExtensionsKt.isExpanded(bottomSheetBehavior) && (bottomSheetBehavior2 = this.bottomSheetBehavior) != null) {
            bottomSheetBehavior2.b(4);
        }
        boolean z13 = state instanceof b.e.a;
        if (!z13 && (formFragmentG = g()) != null) {
            H hE2 = getChildFragmentManager().e();
            hE2.m(formFragmentG);
            hE2.g();
        }
        if (state instanceof b.e.c) {
            ru.cyberity.cbr.core.common.s.a(k(), c(), o(), n(), i(), j(), b(), q(), h(), m(), l(), a());
            View view = getView();
            if (view != null) {
                ru.cyberity.cbr.core.common.s.b(view);
                return;
            }
            return;
        }
        if (z12) {
            a((b.e.d) state);
            return;
        }
        if (z13) {
            a((b.e.a) state);
        } else if (state instanceof b.e.C12525e) {
            a((b.e.C12525e) state, prevState);
        } else if (state instanceof b.e.f) {
            a((b.e.f) state);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(a aVar, View view) {
        aVar.getViewModel().m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(a aVar, View view) {
        aVar.getAnalyticsDelegate().b(aVar.analyticsScreen, aVar.getIdDocSetType(), Control.RetryButton, aVar.d());
        aVar.r();
    }

    private final void b(b.e nextViewState) {
        Screen screenA = a(nextViewState);
        if (screenA == Screen.Other) {
            return;
        }
        ru.cyberity.log.a aVar = ru.cyberity.log.a.f436064a;
        Logger.v$default(aVar, "EKyc", "handleAnalyticsScreenChange: nextScreen=" + screenA, null, 4, null);
        if (nextViewState instanceof b.e.a) {
            b.e.a aVar2 = (b.e.a) nextViewState;
            this.analyticsCountry = aVar2.getCurrentCountry();
            this.analyticsSourceId = aVar2.getCurrentSourceId();
            Logger.v$default(aVar, "EKyc", "handleAnalyticsScreenChange: country=" + this.analyticsCountry + ", sourceId=" + this.analyticsSourceId, null, 4, null);
        }
        if (screenA == this.analyticsScreen) {
            return;
        }
        getAnalyticsDelegate().c(this.analyticsScreen, getIdDocSetType(), d());
        this.analyticsScreen = screenA;
        getAnalyticsDelegate().d(this.analyticsScreen, getIdDocSetType(), d());
        getAnalyticsDelegate().a(this.analyticsScreen, getIdDocSetType(), d());
    }

    private final void a(b.e.C12525e state, b.e prevState) {
        p pVarO;
        Integer numB;
        int i12 = 4;
        ru.cyberity.cbr.core.common.s.a(k(), c(), o(), n(), q(), h(), m(), l(), a());
        ru.cyberity.cbr.core.common.s.c(i(), j());
        TextView textViewO = o();
        if (textViewO != null) {
            ru.cyberity.cbr.core.common.s.a(textViewO, state.getTitle());
        }
        TextView textViewN = n();
        if (textViewN != null) {
            ru.cyberity.cbr.core.common.s.a(textViewN, state.getSubtitle());
        }
        if (state.getSecondsRemaining() > 0) {
            CBRTextButton cBRTextButtonB = b();
            if (cBRTextButtonB != null) {
                cBRTextButtonB.setEnabled(false);
            }
            CBRTextButton cBRTextButtonB2 = b();
            if (cBRTextButtonB2 != null) {
                cBRTextButtonB2.setOnClickListener(null);
            }
        } else {
            CBRTextButton cBRTextButtonB3 = b();
            if (cBRTextButtonB3 != null) {
                cBRTextButtonB3.setEnabled(true);
            }
            CBRTextButton cBRTextButtonB4 = b();
            if (cBRTextButtonB4 != null) {
                cBRTextButtonB4.setOnClickListener(new ru.cyberity.cbr.presentation.screen.preview.ekyc.e(this, i12));
            }
        }
        CBRTextButton cBRTextButtonB5 = b();
        if (cBRTextButtonB5 != null) {
            ru.cyberity.cbr.core.common.s.a(cBRTextButtonB5, state.getButtonResendCode());
        }
        if (prevState instanceof b.e.C12525e) {
            return;
        }
        CBRPinView cBRPinViewJ = j();
        if (cBRPinViewJ != null) {
            cBRPinViewJ.setText((CharSequence) null);
        }
        TextView textViewI = i();
        if (textViewI != null) {
            textViewI.setText(state.getError());
        }
        ru.cyberity.cbr.core.data.source.applicant.remote.a0 a0VarJ = state.getSubmitResponse();
        if (a0VarJ != null && (pVarO = a0VarJ.getOtpConfirmation()) != null && (numB = pVarO.getCodeLength()) != null) {
            int iIntValue = numB.intValue();
            CBRPinView cBRPinViewJ2 = j();
            if (cBRPinViewJ2 != null) {
                cBRPinViewJ2.setItemCount(iIntValue);
            }
        }
        CBRPinView cBRPinViewJ3 = j();
        if (cBRPinViewJ3 != null) {
            ru.cyberity.cbr.core.common.s.c(cBRPinViewJ3);
        }
    }

    private final void a(b.e.a state) {
        int i12 = 2;
        this.resources = state.getResources();
        TextView textViewO = o();
        if (textViewO != null) {
            textViewO.setVisibility(8);
        }
        TextView textViewN = n();
        if (textViewN != null) {
            textViewN.setVisibility(8);
        }
        Button buttonK = k();
        if (buttonK != null) {
            ru.cyberity.cbr.core.common.s.a(buttonK, state.getButtonContinue());
        }
        Button buttonC = c();
        if (buttonC != null) {
            ru.cyberity.cbr.core.common.s.a(buttonC, state.getButtonSkip());
        }
        if (g() == null) {
            H hE2 = getChildFragmentManager().e();
            hE2.n(R.id.cbr_form_container, FormFragment.INSTANCE.newInstance("EKyc"), null);
            hE2.g();
        }
        ru.cyberity.cbr.core.common.s.c(f());
        ru.cyberity.cbr.core.common.s.a(i(), j(), b(), q(), h(), m(), l(), a());
        Button buttonK2 = k();
        if (buttonK2 != null) {
            buttonK2.setOnClickListener(new ru.cyberity.cbr.presentation.screen.preview.ekyc.e(this, i12));
        }
    }

    /* compiled from: TextView.kt */
    @s0
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0012¸\u0006\u0011"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lkotlin/G0;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "androidx/core/widget/u", "core-ktx_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@l CharSequence text, int start, int before, int count) {
            a.this.getViewModel().a(text);
            TextView textViewI = a.this.i();
            if (textViewI != null) {
                textViewI.setText((CharSequence) null);
            }
            CBRPinView cBRPinViewJ = a.this.j();
            if (cBRPinViewJ == null) {
                return;
            }
            cBRPinViewJ.setError(false);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@l Editable s5) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@l CharSequence text, int start, int count, int after) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, View view) {
        aVar.getAnalyticsDelegate().b(aVar.analyticsScreen, aVar.getIdDocSetType(), Control.ContinueButton, aVar.d());
        aVar.r();
    }

    private final void a(b.e.d state) {
        ru.cyberity.cbr.core.common.s.a(k(), c(), o(), n(), i(), j(), b(), h(), m(), l());
        View view = getView();
        if (view != null) {
            ru.cyberity.cbr.core.common.s.b(view);
        }
        b(state);
    }

    private final void a(b.e.f state) {
        int i12 = 3;
        ru.cyberity.cbr.core.common.s.a(k(), c(), o(), n(), i(), j(), b(), a());
        View view = getView();
        if (view != null) {
            ru.cyberity.cbr.core.common.s.b(view);
        }
        ImageView imageViewH = h();
        if (imageViewH != null) {
            ru.cyberity.cbr.core.common.s.b((View) imageViewH, true);
        }
        ImageView imageViewH2 = h();
        if (imageViewH2 != null) {
            CBRStepStateKt.setStepState(imageViewH2, state.getIsFailure() ? CBRStepState.REJECTED : CBRStepState.APPROVED);
        }
        ImageView imageViewH3 = h();
        if (imageViewH3 != null) {
            imageViewH3.setImageDrawable(ru.cyberity.cbr.core.common.n0.f432787a.getIconHandler().onResolveIcon(requireContext(), state.getIcon()));
        }
        TextView textViewM = m();
        if (textViewM != null) {
            ru.cyberity.cbr.core.common.s.a(textViewM, state.getTitle());
        }
        TextView textViewL = l();
        if (textViewL != null) {
            ru.cyberity.cbr.core.common.s.a(textViewL, state.getSubtitle());
        }
        Button buttonK = k();
        if (buttonK != null) {
            ru.cyberity.cbr.core.common.s.a(buttonK, state.getPrimaryButton());
        }
        Button buttonK2 = k();
        if (buttonK2 != null) {
            buttonK2.setEnabled(true);
        }
        Button buttonK3 = k();
        if (buttonK3 != null) {
            buttonK3.setOnClickListener(new ru.cyberity.cbr.presentation.screen.preview.ekyc.e(this, i12));
        }
    }

    private final Screen a(b.e eVar) {
        if (eVar instanceof b.e.C12524b ? true : eVar instanceof b.e.a) {
            return Screen.EkycFormScreen;
        }
        if (eVar instanceof b.e.C12525e) {
            return Screen.EkycOtpConfirmationScreen;
        }
        if (eVar instanceof b.e.d) {
            return Screen.EkycOauthConfirmationScreen;
        }
        if (eVar instanceof b.e.f) {
            Screen screen = ((b.e.f) eVar).getIsFailure() ? Screen.EkycFinishScreen : null;
            return screen == null ? Screen.Other : screen;
        }
        return Screen.Other;
    }
}
