package ru.cyberity.cbr.geo.presentation;

import Y41.p;
import Y61.k;
import Y61.l;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.os.C22776d;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import androidx.fragment.app.k0;
import androidx.view.C22981N;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import i.b;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import ru.cyberity.cbr.core.analytics.Control;
import ru.cyberity.cbr.core.analytics.Screen;
import ru.cyberity.cbr.core.common.LifecycleAwareFindView;
import ru.cyberity.cbr.core.common.a0;
import ru.cyberity.cbr.core.common.i0;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.data.model.Document;
import ru.cyberity.cbr.core.data.model.DocumentType;
import ru.cyberity.cbr.core.presentation.BaseFragment;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.core.presentation.form.FormFragment;
import ru.cyberity.cbr.core.presentation.form.FormViewModelProvider;
import ru.cyberity.cbr.core.presentation.form.HostViewModel;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.widget.CBRImageView;
import ru.cyberity.cbr.core.widget.CBRStepState;
import ru.cyberity.cbr.core.widget.CBRStepStateKt;
import ru.cyberity.cbr.geo.presentation.d;
import ru.cyberity.internal.R;

/* compiled from: CBRGeoFragment.kt */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0017B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0006J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0017\u001a\u00020\u000e2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019H\u0002¢\u0006\u0004\b\u0017\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010\u0006J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\u0017\u0010\"J\u000f\u0010#\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020$H\u0002¢\u0006\u0004\b\u0017\u0010%J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020&H\u0002¢\u0006\u0004\b\u0017\u0010'J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020(H\u0002¢\u0006\u0004\b\u0017\u0010)J\u000f\u0010*\u001a\u00020\u000eH\u0002¢\u0006\u0004\b*\u0010\u0006J\u000f\u0010+\u001a\u00020\u000eH\u0002¢\u0006\u0004\b+\u0010\u0006J\u000f\u0010,\u001a\u00020\u000eH\u0002¢\u0006\u0004\b,\u0010\u0006J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020-H\u0002¢\u0006\u0004\b\u0017\u0010.J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020/H\u0002¢\u0006\u0004\b\u0017\u00100J\u000f\u00101\u001a\u00020\u000eH\u0002¢\u0006\u0004\b1\u0010\u0006R\u001d\u00106\u001a\u0004\u0018\u0001028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u00103\u001a\u0004\b4\u00105R\u001d\u0010:\u001a\u0004\u0018\u0001078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u00103\u001a\u0004\b8\u00109R\u001d\u0010<\u001a\u0004\u0018\u0001078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00103\u001a\u0004\b;\u00109R\u001d\u0010@\u001a\u0004\u0018\u00010=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00103\u001a\u0004\b>\u0010?R\u001d\u0010C\u001a\u0004\u0018\u0001078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u00103\u001a\u0004\bB\u00109R\u001d\u0010H\u001a\u0004\u0018\u00010D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u00103\u001a\u0004\bF\u0010GR\u001d\u0010K\u001a\u0004\u0018\u00010D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u00103\u001a\u0004\bJ\u0010GR\u001d\u0010L\u001a\u0004\u0018\u0001028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u00103\u001a\u0004\bE\u00105R$\u0010P\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0N\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010OR\u0016\u0010R\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010QR\u0018\u0010U\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010TR\u0014\u0010X\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010WR\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010WR\u001b\u0010]\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b8\u0010Z\u001a\u0004\b[\u0010\\R\u0016\u0010`\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010_R\u0014\u0010c\u001a\u00020\u001a8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0014\u0010f\u001a\u00020^8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0014\u0010j\u001a\u00020g8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0016\u0010m\u001a\u0004\u0018\u00010k8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010lR\u0016\u0010p\u001a\u0004\u0018\u00010n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010o¨\u0006q"}, d2 = {"Lru/cyberity/cbr/geo/presentation/a;", "Lru/cyberity/cbr/core/presentation/BaseFragment;", "Lru/cyberity/cbr/geo/presentation/d;", "Lru/cyberity/cbr/geo/presentation/b;", "Lru/cyberity/cbr/core/presentation/form/FormViewModelProvider;", "<init>", "()V", "", "getLayoutId", "()I", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/G0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStop", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "event", "handleEvent", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;)V", VoiceInfo.STATE, "a", "(Lru/cyberity/cbr/geo/presentation/d;Landroid/os/Bundle;)V", "", "", "", "grantResults", "(Ljava/util/Map;)V", "q", "j", "Landroid/location/Location;", "location", "(Landroid/location/Location;)V", "b", "Lru/cyberity/cbr/geo/presentation/d$b;", "(Lru/cyberity/cbr/geo/presentation/d$b;)V", "Lru/cyberity/cbr/geo/presentation/d$f;", "(Lru/cyberity/cbr/geo/presentation/d$f;)V", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$ShowPermissionDialog;", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$ShowPermissionDialog;)V", "s", "p", "r", "Lru/cyberity/cbr/geo/presentation/d$d;", "(Lru/cyberity/cbr/geo/presentation/d$d;)V", "Lru/cyberity/cbr/geo/presentation/d$g;", "(Lru/cyberity/cbr/geo/presentation/d$g;)V", "c", "Landroid/view/ViewGroup;", "Lru/cyberity/cbr/core/common/LifecycleAwareFindView;", "d", "()Landroid/view/ViewGroup;", "content", "Landroid/widget/TextView;", "n", "()Landroid/widget/TextView;", "title", "m", "subtitle", "Landroid/widget/ImageView;", "i", "()Landroid/widget/ImageView;", "icon", "e", "h", "hint", "Landroid/widget/Button;", "f", "k", "()Landroid/widget/Button;", "primaryButton", "g", "l", "secondaryButton", "formContainer", "Landroidx/activity/result/h;", "", "Landroidx/activity/result/h;", "permissionLauncher", "Z", "locationSent", "Lkotlinx/coroutines/N0;", "Lkotlinx/coroutines/N0;", "locationTimeOut", "Landroid/location/LocationListener;", "Landroid/location/LocationListener;", "gpslocationListener", "networklocationListener", "Lkotlin/C;", "o", "()Lru/cyberity/cbr/geo/presentation/b;", "viewModel", "Lru/cyberity/cbr/core/analytics/Screen;", "Lru/cyberity/cbr/core/analytics/Screen;", "screenInternal", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "getScreen", "()Lru/cyberity/cbr/core/analytics/Screen;", "screen", "Lru/cyberity/cbr/core/presentation/form/HostViewModel;", "getHostViewModel", "()Lru/cyberity/cbr/core/presentation/form/HostViewModel;", "hostViewModel", "Lru/cyberity/cbr/core/data/model/Document;", "()Lru/cyberity/cbr/core/data/model/Document;", "document", "Lru/cyberity/cbr/core/presentation/form/FormFragment;", "()Lru/cyberity/cbr/core/presentation/form/FormFragment;", "formFragment", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a extends BaseFragment<ru.cyberity.cbr.geo.presentation.d, ru.cyberity.cbr.geo.presentation.b> implements FormViewModelProvider {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @k
    public static final Companion INSTANCE;

    /* renamed from: q, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f434436q;

    /* renamed from: v, reason: collision with root package name */
    private static final long f434437v;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @l
    private androidx.view.result.h<String[]> permissionLauncher;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean locationSent;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @l
    private N0 locationTimeOut;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @k
    private final LocationListener gpslocationListener;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @k
    private final LocationListener networklocationListener;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView content = i0.a(this, R.id.cbr_fragment_content);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView title = i0.a(this, R.id.cbr_title);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView subtitle = i0.a(this, R.id.cbr_subtitle);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView icon = i0.a(this, R.id.cbr_icon);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView hint = i0.a(this, R.id.cbr_hint);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView primaryButton = i0.a(this, R.id.cbr_primary_button);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView secondaryButton = i0.a(this, R.id.cbr_secondary_button);

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView formContainer = i0.a(this, R.id.cbr_form_placeholder);

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @k
    private final InterfaceC42726C viewModel = k0.a(this, m0.f406844a.b(ru.cyberity.cbr.geo.presentation.b.class), new f(new e(this)), new g());

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @k
    private Screen screenInternal = Screen.GeolocationDetectionScreen;

    /* compiled from: CBRGeoFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\b¨\u0006\u0011"}, d2 = {"Lru/cyberity/cbr/geo/presentation/a$a;", "", "Lru/cyberity/cbr/core/data/model/Document;", "document", "Landroidx/fragment/app/Fragment;", "a", "", "ARGS_DOCUMENT", "Ljava/lang/String;", "FALLBACK_DOCUMENT", "", "LAST_KNOWN_EXPIRATION_IN_NANOS", "J", "REQUEST_FALLBACK", "TAG", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.geo.presentation.a$a, reason: collision with other inner class name and from kotlin metadata */
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

    /* compiled from: CBRGeoFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.geo.presentation.CBRGeoFragment$enableLocationUpdates$1", f = "CBRGeoFragment.kt", i = {}, l = {209}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434453a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return a.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f434453a;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f434453a = 1;
                if (C43131e0.b(30000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            a.this.a();
            a.this.getViewModel().e();
            return G0.f406611a;
        }
    }

    /* compiled from: CBRGeoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "a", "()V"}, k = 3, mv = {1, 7, 1})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        public final void a() {
            BaseFragment.finish$default(a.this, null, null, null, 7, null);
        }

        @Override // Y41.a
        public /* bridge */ /* synthetic */ G0 invoke() {
            a();
            return G0.f406611a;
        }
    }

    /* compiled from: CBRGeoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "a", "()V"}, k = 3, mv = {1, 7, 1})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CBRViewModel.ShowPermissionDialog f434457b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CBRViewModel.ShowPermissionDialog showPermissionDialog) {
            super(0);
            this.f434457b = showPermissionDialog;
        }

        public final void a() {
            a.this.getViewModel().a(this.f434457b.getDialogId());
        }

        @Override // Y41.a
        public /* bridge */ /* synthetic */ G0 invoke() {
            a();
            return G0.f406611a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "a", "()Landroidx/fragment/app/Fragment;", "androidx/fragment/app/a0"}, k = 3, mv = {1, 7, 1})
    public static final class e extends N implements Y41.a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f434458a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f434458a = fragment;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f434458a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "a", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/b0"}, k = 3, mv = {1, 7, 1})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y41.a f434459a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f434459a = aVar;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S0 invoke() {
            return ((T0) this.f434459a.invoke()).getF42820b();
        }
    }

    /* compiled from: CBRGeoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/P0$c;", "a", "()Landroidx/lifecycle/P0$c;"}, k = 3, mv = {1, 7, 1})
    public static final class g extends N implements Y41.a<P0.c> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P0.c invoke() {
            a aVar = a.this;
            ru.cyberity.cbr.core.b serviceLocator = aVar.getServiceLocator();
            Bundle arguments = a.this.getArguments();
            Document documentE = a.this.e();
            if (documentE != null) {
                return new ru.cyberity.cbr.geo.presentation.c(aVar, serviceLocator, arguments, documentE);
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    static {
        h0 h0Var = new h0(a.class, "content", "getContent()Landroid/view/ViewGroup;", 0);
        n0 n0Var = m0.f406844a;
        f434436q = new n[]{n0Var.i(h0Var), C0.k(a.class, "title", "getTitle()Landroid/widget/TextView;", 0, n0Var), C0.k(a.class, "subtitle", "getSubtitle()Landroid/widget/TextView;", 0, n0Var), C0.k(a.class, "icon", "getIcon()Landroid/widget/ImageView;", 0, n0Var), C0.k(a.class, "hint", "getHint()Landroid/widget/TextView;", 0, n0Var), C0.k(a.class, "primaryButton", "getPrimaryButton()Landroid/widget/Button;", 0, n0Var), C0.k(a.class, "secondaryButton", "getSecondaryButton()Landroid/widget/Button;", 0, n0Var), C0.k(a.class, "formContainer", "getFormContainer()Landroid/view/ViewGroup;", 0, n0Var)};
        INSTANCE = new Companion(null);
        f434437v = TimeUnit.MINUTES.toNanos(10L);
    }

    public a() {
        final int i12 = 0;
        this.gpslocationListener = new LocationListener(this) { // from class: ru.cyberity.cbr.geo.presentation.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f434610b;

            {
                this.f434610b = this;
            }

            @Override // android.location.LocationListener
            public final void onLocationChanged(Location location) {
                switch (i12) {
                    case 0:
                        a.a(this.f434610b, location);
                        break;
                    default:
                        a.b(this.f434610b, location);
                        break;
                }
            }
        };
        final int i13 = 1;
        this.networklocationListener = new LocationListener(this) { // from class: ru.cyberity.cbr.geo.presentation.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f434610b;

            {
                this.f434610b = this;
            }

            @Override // android.location.LocationListener
            public final void onLocationChanged(Location location) {
                switch (i13) {
                    case 0:
                        a.a(this.f434610b, location);
                        break;
                    default:
                        a.b(this.f434610b, location);
                        break;
                }
            }
        };
    }

    private final ViewGroup d() {
        return (ViewGroup) this.content.a(this, f434436q[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Document e() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (Document) C22776d.a(arguments, "ARGS_DOCUMENT", Document.class);
        }
        return null;
    }

    private final ViewGroup f() {
        return (ViewGroup) this.formContainer.a(this, f434436q[7]);
    }

    private final FormFragment g() {
        Fragment fragmentG = getChildFragmentManager().G(R.id.cbr_form_placeholder);
        if (fragmentG instanceof FormFragment) {
            return (FormFragment) fragmentG;
        }
        return null;
    }

    private final TextView h() {
        return (TextView) this.hint.a(this, f434436q[4]);
    }

    private final ImageView i() {
        return (ImageView) this.icon.a(this, f434436q[3]);
    }

    private final void j() {
        this.screenInternal = Screen.GeolocationDetectionScreen;
        this.locationSent = false;
        s();
        Object systemService = requireActivity().getSystemService("location");
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        if (locationManager != null) {
            Location lastKnownLocation = locationManager.getLastKnownLocation("gps");
            if (lastKnownLocation == null) {
                lastKnownLocation = locationManager.getLastKnownLocation("network");
            }
            if (lastKnownLocation == null || SystemClock.elapsedRealtimeNanos() - lastKnownLocation.getElapsedRealtimeNanos() >= f434437v) {
                b();
                return;
            }
            ru.cyberity.cbr.geo.a.a(ru.cyberity.cbr.geo.a.f434398a, "CyberityGeo", "Using last known location: " + lastKnownLocation, null, 4, null);
            a(lastKnownLocation);
        }
    }

    private final Button k() {
        return (Button) this.primaryButton.a(this, f434436q[5]);
    }

    private final Button l() {
        return (Button) this.secondaryButton.a(this, f434436q[6]);
    }

    private final TextView m() {
        return (TextView) this.subtitle.a(this, f434436q[2]);
    }

    private final TextView n() {
        return (TextView) this.title.a(this, f434436q[1]);
    }

    private final void p() {
        getViewModel().showProgress(false);
    }

    private final void q() {
        ru.cyberity.cbr.geo.a.a(ru.cyberity.cbr.geo.a.f434398a, "CyberityGeo", "Requesting permissions", null, 4, null);
        androidx.view.result.h<String[]> hVar = this.permissionLauncher;
        if (hVar != null) {
            hVar.b(getViewModel().getPermissions());
        }
    }

    private final void r() {
        this.screenInternal = Screen.GeolocationFormScreen;
        ViewGroup viewGroupD = d();
        if (viewGroupD != null) {
            viewGroupD.setVisibility(4);
        }
        BaseFragment.finish$default(this, new a0.b(false, 1, null), null, null, 6, null);
    }

    private final void s() {
        TextView textViewN = n();
        if (textViewN != null) {
            textViewN.setVisibility(4);
        }
        TextView textViewM = m();
        if (textViewM != null) {
            textViewM.setVisibility(4);
        }
        ImageView imageViewI = i();
        if (imageViewI != null) {
            imageViewI.setVisibility(4);
        }
        TextView textViewH = h();
        if (textViewH != null) {
            textViewH.setVisibility(4);
        }
        Button buttonK = k();
        if (buttonK != null) {
            buttonK.setVisibility(8);
        }
        Button buttonL = l();
        if (buttonL != null) {
            buttonL.setVisibility(8);
        }
        ViewGroup viewGroupF = f();
        if (viewGroupF != null) {
            viewGroupF.setVisibility(4);
        }
        getViewModel().showProgress(true);
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
        Document documentE = e();
        return (documentE == null || (type = documentE.getType()) == null || (strC = type.getValue()) == null) ? "TYPE_UNKNOWN" : strC;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public int getLayoutId() {
        return R.layout.cbr_fragment_geo;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public Screen getScreen() {
        return this.screenInternal;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public void handleEvent(@k CBRViewModel.CBRViewModelEvent event) {
        super.handleEvent(event);
        if (event instanceof CBRViewModel.ShowPermissionDialog) {
            a((CBRViewModel.ShowPermissionDialog) event);
        }
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public ru.cyberity.cbr.geo.presentation.b getViewModel() {
        return (ru.cyberity.cbr.geo.presentation.b) this.viewModel.getValue();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        a();
        super.onStop();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@k View view, @l Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.permissionLauncher = registerForActivityResult(new b.k(), new com.avito.android.str_seller_orders.orders_seller.a(this, 13));
        ImageView imageViewI = i();
        if (imageViewI != null) {
            ThemeHelper.applyStepTintColor$default(ThemeHelper.INSTANCE, imageViewI, null, null, 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, Location location) {
        ru.cyberity.cbr.geo.a.a(ru.cyberity.cbr.geo.a.f434398a, "CyberityGeo", "onLocationChanged: location=" + location, null, 4, null);
        aVar.a(location);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(a aVar, Location location) {
        ru.cyberity.cbr.geo.a.a(ru.cyberity.cbr.geo.a.f434398a, "CyberityGeo", "onLocationChanged: location=" + location, null, 4, null);
        aVar.a(location);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(a aVar, View view) {
        aVar.getViewModel().f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(a aVar, View view) {
        aVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(a aVar, View view) {
        aVar.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(a aVar, View view) {
        aVar.c();
    }

    private final void c() {
        ru.cyberity.cbr.core.analytics.c.b(getAnalyticsDelegate(), getScreen(), getIdDocSetType(), Control.SkipButton, null, 8, null);
        Bundle bundle = new Bundle();
        bundle.putParcelable("geo_fallback_document", e());
        G0 g02 = G0.f406611a;
        C22960s.a(bundle, this, "geo_request_fallback");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(a aVar, View view) {
        ru.cyberity.cbr.core.analytics.c.b(aVar.getAnalyticsDelegate(), aVar.getScreen(), aVar.getIdDocSetType(), Control.ContinueButton, null, 8, null);
        aVar.getViewModel().g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, Map map) {
        aVar.a((Map<String, Boolean>) map);
    }

    private final void b() {
        ru.cyberity.cbr.geo.a.a(ru.cyberity.cbr.geo.a.f434398a, "CyberityGeo", "enableLocationUpdates", null, 4, null);
        Object systemService = requireActivity().getSystemService("location");
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        if (locationManager == null) {
            return;
        }
        this.locationSent = false;
        boolean zIsProviderEnabled = locationManager.isProviderEnabled("gps");
        if (zIsProviderEnabled) {
            locationManager.requestLocationUpdates("gps", TimeUnit.SECONDS.toMillis(5L), 0.0f, this.gpslocationListener);
        }
        boolean zIsProviderEnabled2 = locationManager.isProviderEnabled("network");
        if (zIsProviderEnabled2) {
            locationManager.requestLocationUpdates("network", TimeUnit.SECONDS.toMillis(5L), 0.0f, this.networklocationListener);
        }
        if (!zIsProviderEnabled && !zIsProviderEnabled2) {
            getViewModel().e();
        } else {
            this.locationTimeOut = C43259k.d(C22981N.a(getLifecycle()), null, null, new b(null), 3);
        }
    }

    private final void a(Map<String, Boolean> grantResults) {
        getViewModel().a(grantResults);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(@k ru.cyberity.cbr.geo.presentation.d state, @l Bundle savedInstanceState) {
        ru.cyberity.cbr.geo.a.a(ru.cyberity.cbr.geo.a.f434398a, "CyberityGeo", "handleViewStateChange: " + state, null, 4, null);
        p();
        if (state instanceof d.c) {
            s();
            return;
        }
        if (state instanceof d.b) {
            a((d.b) state);
            return;
        }
        if (state instanceof d.f) {
            a((d.f) state);
            return;
        }
        if (state instanceof d.C12500d) {
            a((d.C12500d) state);
            return;
        }
        if (state instanceof d.e) {
            j();
        } else if (state instanceof d.a) {
            r();
        } else if (state instanceof d.g) {
            a((d.g) state);
        }
    }

    private final void a(Location location) {
        ru.cyberity.cbr.geo.a.a(ru.cyberity.cbr.geo.a.f434398a, "CyberityGeo", "Send location: " + location, null, 4, null);
        if (this.locationSent) {
            return;
        }
        if (e() != null) {
            getViewModel().a(location);
        }
        this.locationSent = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(a aVar, View view) {
        aVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        ru.cyberity.cbr.geo.a.a(ru.cyberity.cbr.geo.a.f434398a, "CyberityGeo", "disableLocationUpdates", null, 4, null);
        N0 n02 = this.locationTimeOut;
        if (n02 != null) {
            n02.c(null);
        }
        this.locationTimeOut = null;
        Object systemService = requireActivity().getSystemService("location");
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        if (locationManager == null) {
            return;
        }
        locationManager.removeUpdates(this.gpslocationListener);
        locationManager.removeUpdates(this.networklocationListener);
    }

    private final void a(d.b state) {
        this.screenInternal = Screen.GeolocationDetectionScreen;
        getAnalyticsDelegate().b();
        TextView textViewN = n();
        if (textViewN != null) {
            textViewN.setText(state.getTitle());
        }
        TextView textViewN2 = n();
        if (textViewN2 != null) {
            textViewN2.setVisibility(0);
        }
        TextView textViewM = m();
        if (textViewM != null) {
            textViewM.setText(state.getSubtitle());
        }
        TextView textViewM2 = m();
        if (textViewM2 != null) {
            textViewM2.setVisibility(0);
        }
        ViewGroup viewGroupF = f();
        if (viewGroupF != null) {
            viewGroupF.setVisibility(8);
        }
        ImageView imageViewI = i();
        if (imageViewI != null) {
            imageViewI.setVisibility(0);
        }
        ImageView imageViewI2 = i();
        CBRImageView cBRImageView = imageViewI2 instanceof CBRImageView ? (CBRImageView) imageViewI2 : null;
        if (cBRImageView != null) {
            CBRStepStateKt.setStepState(cBRImageView, CBRStepState.INIT);
        }
        ImageView imageViewI3 = i();
        if (imageViewI3 != null) {
            imageViewI3.setImageDrawable(ru.cyberity.cbr.core.common.n0.f432787a.getIconHandler().onResolveIcon(requireContext(), state.getIcon()));
        }
        TextView textViewH = h();
        if (textViewH != null) {
            textViewH.setText(state.getHint());
        }
        TextView textViewH2 = h();
        if (textViewH2 != null) {
            textViewH2.setVisibility(0);
        }
        Button buttonK = k();
        if (buttonK != null) {
            buttonK.setText(state.getPrimaryButton());
        }
        Button buttonK2 = k();
        if (buttonK2 != null) {
            buttonK2.setVisibility(0);
        }
        Button buttonK3 = k();
        if (buttonK3 != null) {
            buttonK3.setOnClickListener(new ru.cyberity.cbr.geo.presentation.g(this, 2));
        }
        Button buttonL = l();
        if (buttonL != null) {
            buttonL.setText(state.getSecondaryButton());
        }
        Button buttonL2 = l();
        if (buttonL2 != null) {
            buttonL2.setVisibility(0);
        }
        Button buttonL3 = l();
        if (buttonL3 != null) {
            buttonL3.setOnClickListener(new ru.cyberity.cbr.geo.presentation.g(this, 3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, View view) {
        LocationManager locationManager = (LocationManager) androidx.core.content.d.getSystemService(aVar.requireContext(), LocationManager.class);
        boolean zA2 = locationManager != null ? androidx.core.location.g.a(locationManager) : true;
        aVar.getAnalyticsDelegate().b(aVar.getScreen(), aVar.getIdDocSetType(), Control.StartButton, Collections.singletonMap("IS_LOCATION_ENABLED", String.valueOf(zA2)));
        if (zA2) {
            aVar.q();
        } else {
            ru.cyberity.cbr.geo.a.a(ru.cyberity.cbr.geo.a.f434398a, "CyberityGeo", "Asking the user to enable location in settings", null, 4, null);
            aVar.getViewModel().d();
        }
    }

    private final void a(d.f state) {
        this.screenInternal = Screen.GeolocationDetectionScreen;
        TextView textViewN = n();
        if (textViewN != null) {
            textViewN.setText(state.getTitle());
        }
        TextView textViewN2 = n();
        if (textViewN2 != null) {
            textViewN2.setVisibility(0);
        }
        TextView textViewM = m();
        if (textViewM != null) {
            textViewM.setText(state.getSubtitle());
        }
        TextView textViewM2 = m();
        if (textViewM2 != null) {
            textViewM2.setVisibility(0);
        }
        ViewGroup viewGroupF = f();
        if (viewGroupF != null) {
            viewGroupF.setVisibility(8);
        }
        ImageView imageViewI = i();
        if (imageViewI != null) {
            imageViewI.setVisibility(0);
        }
        ImageView imageViewI2 = i();
        CBRImageView cBRImageView = imageViewI2 instanceof CBRImageView ? (CBRImageView) imageViewI2 : null;
        if (cBRImageView != null) {
            CBRStepStateKt.setStepState(cBRImageView, CBRStepState.INIT);
        }
        ImageView imageViewI3 = i();
        if (imageViewI3 != null) {
            imageViewI3.setImageDrawable(ru.cyberity.cbr.core.common.n0.f432787a.getIconHandler().onResolveIcon(requireContext(), state.getIcon()));
        }
        TextView textViewH = h();
        if (textViewH != null) {
            textViewH.setText(state.getHint());
        }
        TextView textViewH2 = h();
        if (textViewH2 != null) {
            textViewH2.setVisibility(0);
        }
        Button buttonK = k();
        if (buttonK != null) {
            buttonK.setText(state.getPrimaryButton());
        }
        Button buttonK2 = k();
        if (buttonK2 != null) {
            buttonK2.setVisibility(0);
        }
        Button buttonK3 = k();
        if (buttonK3 != null) {
            buttonK3.setOnClickListener(new ru.cyberity.cbr.geo.presentation.g(this, 5));
        }
        Button buttonL = l();
        if (buttonL != null) {
            buttonL.setText(state.getSecondaryButton());
        }
        Button buttonL2 = l();
        if (buttonL2 != null) {
            buttonL2.setVisibility(0);
        }
        Button buttonL3 = l();
        if (buttonL3 != null) {
            buttonL3.setOnClickListener(new ru.cyberity.cbr.geo.presentation.g(this, 6));
        }
    }

    private final void a(CBRViewModel.ShowPermissionDialog event) {
        ru.cyberity.cbr.core.android.a.f432580a.a(requireActivity(), event.getMessage(), event.getPositiveButton(), event.getNegativeButton(), new c(), new d(event)).show();
    }

    private final void a(d.C12500d state) {
        this.screenInternal = Screen.GeolocationFormScreen;
        getAnalyticsDelegate().d();
        TextView textViewN = n();
        if (textViewN != null) {
            textViewN.setVisibility(8);
        }
        TextView textViewM = m();
        if (textViewM != null) {
            textViewM.setVisibility(8);
        }
        ImageView imageViewI = i();
        if (imageViewI != null) {
            imageViewI.setVisibility(8);
        }
        TextView textViewH = h();
        if (textViewH != null) {
            textViewH.setVisibility(8);
        }
        Button buttonL = l();
        if (buttonL != null) {
            buttonL.setVisibility(8);
        }
        ViewGroup viewGroupF = f();
        if (viewGroupF != null) {
            viewGroupF.setVisibility(0);
        }
        if (g() == null) {
            H hE2 = getChildFragmentManager().e();
            hE2.n(R.id.cbr_form_placeholder, FormFragment.INSTANCE.newInstance("CyberityGeo"), null);
            hE2.g();
        }
        View currentFocus = requireActivity().getCurrentFocus();
        if (currentFocus != null) {
            s.c(currentFocus);
        }
        Button buttonK = k();
        if (buttonK != null) {
            buttonK.setText(state.getPrimaryButton());
        }
        Button buttonK2 = k();
        if (buttonK2 != null) {
            buttonK2.setVisibility(0);
        }
        Button buttonK3 = k();
        if (buttonK3 != null) {
            buttonK3.setOnClickListener(new ru.cyberity.cbr.geo.presentation.g(this, 4));
        }
    }

    private final void a(d.g state) {
        this.screenInternal = Screen.GeolocationUnknownScreen;
        getAnalyticsDelegate().b();
        TextView textViewN = n();
        if (textViewN != null) {
            textViewN.setText(state.getTitle());
        }
        TextView textViewN2 = n();
        if (textViewN2 != null) {
            textViewN2.setVisibility(0);
        }
        TextView textViewM = m();
        if (textViewM != null) {
            textViewM.setText(state.getSubtitle());
        }
        TextView textViewM2 = m();
        if (textViewM2 != null) {
            textViewM2.setVisibility(0);
        }
        ViewGroup viewGroupF = f();
        if (viewGroupF != null) {
            viewGroupF.setVisibility(8);
        }
        ImageView imageViewI = i();
        if (imageViewI != null) {
            imageViewI.setVisibility(0);
        }
        ImageView imageViewI2 = i();
        CBRImageView cBRImageView = imageViewI2 instanceof CBRImageView ? (CBRImageView) imageViewI2 : null;
        if (cBRImageView != null) {
            CBRStepStateKt.setStepState(cBRImageView, CBRStepState.INIT);
        }
        ImageView imageViewI3 = i();
        if (imageViewI3 != null) {
            imageViewI3.setImageDrawable(ru.cyberity.cbr.core.common.n0.f432787a.getIconHandler().onResolveIcon(requireContext(), state.getIcon()));
        }
        TextView textViewH = h();
        if (textViewH != null) {
            textViewH.setVisibility(8);
        }
        Button buttonK = k();
        if (buttonK != null) {
            buttonK.setText(state.getPrimaryButton());
        }
        Button buttonK2 = k();
        if (buttonK2 != null) {
            buttonK2.setVisibility(0);
        }
        Button buttonK3 = k();
        if (buttonK3 != null) {
            buttonK3.setOnClickListener(new ru.cyberity.cbr.geo.presentation.g(this, 0));
        }
        Button buttonL = l();
        if (buttonL != null) {
            buttonL.setText(state.getSecondaryButton());
        }
        Button buttonL2 = l();
        if (buttonL2 != null) {
            buttonL2.setVisibility(0);
        }
        Button buttonL3 = l();
        if (buttonL3 != null) {
            buttonL3.setOnClickListener(new ru.cyberity.cbr.geo.presentation.g(this, 1));
        }
    }
}
