package ru.cyberity.cbr.presentation.screen.preview.photo;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.P;
import androidx.fragment.app.C;
import androidx.view.C22981N;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import pY0.C47034b;
import ru.cyberity.cbr.camera.photo.presentation.document.b;
import ru.cyberity.cbr.camera.photo.presentation.selfie.a;
import ru.cyberity.cbr.core.analytics.Control;
import ru.cyberity.cbr.core.common.LifecycleAwareFindView;
import ru.cyberity.cbr.core.common.a0;
import ru.cyberity.cbr.core.common.g;
import ru.cyberity.cbr.core.common.i0;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.data.listener.CBRIconHandler;
import ru.cyberity.cbr.core.data.model.o;
import ru.cyberity.cbr.core.presentation.BaseFragment;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.widget.CBRImageView;
import ru.cyberity.cbr.core.widget.CBRRotationZoomableImageView;
import ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel;
import ru.cyberity.cbr.presentation.screen.preview.photo.a;
import ru.cyberity.internal.R;
import ru.cyberity.log.logger.Logger;
import ru.cyberity.ml.core.d;

/* compiled from: CBRPreviewPhotoDocumentFragment.kt */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\n\b&\u0018\u0000 /*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0015B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0019\u0010\u0006J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u0015\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0011H\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010\u0006J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010\u0015\u001a\u00020\u000e2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002¢\u0006\u0004\b\u0015\u0010+J\u0019\u0010\u0015\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b\u0015\u0010.J\u000f\u0010/\u001a\u00020\u000eH\u0002¢\u0006\u0004\b/\u0010\u0006J\u000f\u00100\u001a\u00020\u000eH\u0002¢\u0006\u0004\b0\u0010\u0006J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b\u0015\u00103R\u001d\u00108\u001a\u0004\u0018\u0001048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u00105\u001a\u0004\b6\u00107R\u001d\u0010=\u001a\u0004\u0018\u0001098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u0010<R\u001d\u0010A\u001a\u0004\u0018\u00010>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00105\u001a\u0004\b\u0015\u0010@R\u001d\u0010C\u001a\u0004\u0018\u00010>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u00105\u001a\u0004\bB\u0010@R\u001d\u0010G\u001a\u0004\u0018\u00010D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00105\u001a\u0004\bE\u0010FR\u001d\u0010K\u001a\u0004\u0018\u00010H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u00105\u001a\u0004\bI\u0010JR\u001d\u0010M\u001a\u0004\u0018\u00010H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00105\u001a\u0004\bL\u0010JR\u001d\u0010O\u001a\u0004\u0018\u00010H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u00105\u001a\u0004\bN\u0010JR\u001d\u0010S\u001a\u0004\u0018\u00010P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u00105\u001a\u0004\bQ\u0010RR\u001d\u0010V\u001a\u0004\u0018\u00010T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u00105\u001a\u0004\b?\u0010UR\u001d\u0010W\u001a\u0004\u0018\u00010T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u00105\u001a\u0004\b:\u0010UR\u001e\u0010Z\u001a\n\u0012\u0004\u0012\u00020P\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010YR\u0018\u0010]\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\\R\u0016\u0010_\u001a\u0004\u0018\u00010H8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b^\u0010JR \u0010e\u001a\u000e\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020b0`8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR \u0010g\u001a\u000e\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020b0`8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010dR \u0010i\u001a\u000e\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020b0`8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010dR \u0010k\u001a\u000e\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020b0`8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010d¨\u0006l"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/photo/a;", "Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel;", "VM", "Lru/cyberity/cbr/presentation/screen/preview/a;", "Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$a;", "<init>", "()V", "", "getLayoutId", "()I", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/G0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "success", "Landroid/os/Parcelable;", "payload", "a", "(ZLandroid/os/Parcelable;)V", "onViewModelPrepared", "(Landroid/os/Bundle;)V", "m", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "event", "handleEvent", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;)V", VoiceInfo.STATE, "(Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$a;Landroid/os/Bundle;)V", "hideLogo", "updatePoweredByVisibility", "(Z)V", "onDestroyView", "Lru/cyberity/cbr/core/common/a0;", "finishReason", "onFinishCalled", "(Lru/cyberity/cbr/core/common/a0;)Z", "Lru/cyberity/ml/core/d$a;", "Lru/cyberity/ml/badphotos/models/a;", "res", "(Lru/cyberity/ml/core/d$a;)V", "Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$Content$ButtonAction;", "action", "(Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$Content$ButtonAction;)V", "n", "l", "Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$h;", ConstraintKt.WARNING, "(Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel$h;)V", "Landroidx/constraintlayout/widget/Group;", "Lru/cyberity/cbr/core/common/LifecycleAwareFindView;", "e", "()Landroidx/constraintlayout/widget/Group;", "gContent", "Lru/cyberity/cbr/core/widget/CBRRotationZoomableImageView;", "b", "g", "()Lru/cyberity/cbr/core/widget/CBRRotationZoomableImageView;", "ivPhoto", "Landroid/widget/Button;", "c", "()Landroid/widget/Button;", "btnReadableDocument", "d", "btnTakeAnotherPhoto", "Lru/cyberity/cbr/core/widget/CBRImageView;", "f", "()Lru/cyberity/cbr/core/widget/CBRImageView;", "ivContentIcon", "Landroid/widget/TextView;", "j", "()Landroid/widget/TextView;", "tvTitle", "i", "tvSubtitle", "h", "tvIdDoc", "Landroid/view/ViewGroup;", "k", "()Landroid/view/ViewGroup;", "vgWarning", "Landroid/widget/ImageButton;", "()Landroid/widget/ImageButton;", "btnRotateCW", "btnRotateCCW", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bsbWarning", "Lkotlinx/coroutines/N0;", "Lkotlinx/coroutines/N0;", "bottomSheetJob", "getPoweredByText", "poweredByText", "", "", "", "getCancelPayload", "()Ljava/util/Map;", "cancelPayload", "getClosePayload", "closePayload", "getOpenPayload", "openPayload", "getAppearPayload", "appearPayload", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public abstract class a<VM extends CBRPreviewPhotoDocumentViewModel> extends ru.cyberity.cbr.presentation.screen.preview.a<CBRPreviewPhotoDocumentViewModel.a, VM> {

    /* renamed from: o, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f435233o;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView gContent = i0.a(this, R.id.cbr_content);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView ivPhoto = i0.a(this, R.id.cbr_photo);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView btnReadableDocument = i0.a(this, R.id.cbr_primary_button);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView btnTakeAnotherPhoto = i0.a(this, R.id.cbr_secondary_button);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView ivContentIcon = i0.a(this, R.id.cbr_content_icon);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvTitle = i0.a(this, R.id.cbr_title);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvSubtitle = i0.a(this, R.id.cbr_subtitle);

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvIdDoc = i0.a(this, R.id.cbr_iddoc);

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView vgWarning = i0.a(this, R.id.cbr_warning);

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView btnRotateCW = i0.a(this, R.id.cbr_rotate_cw);

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView btnRotateCCW = i0.a(this, R.id.cbr_rotate_ccw);

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @l
    private BottomSheetBehavior<ViewGroup> bsbWarning;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @l
    private N0 bottomSheetJob;

    /* compiled from: CBRPreviewPhotoDocumentFragment.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f435247a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f435248b;

        static {
            int[] iArr = new int[CBRPreviewPhotoDocumentViewModel.Content.Icon.values().length];
            iArr[CBRPreviewPhotoDocumentViewModel.Content.Icon.WARNING.ordinal()] = 1;
            f435247a = iArr;
            int[] iArr2 = new int[CBRPreviewPhotoDocumentViewModel.Content.ButtonAction.values().length];
            iArr2[CBRPreviewPhotoDocumentViewModel.Content.ButtonAction.CONTINUE.ordinal()] = 1;
            iArr2[CBRPreviewPhotoDocumentViewModel.Content.ButtonAction.TRY_AGAIN.ordinal()] = 2;
            f435248b = iArr2;
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel;", "VM", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentFragment$hideWarning$1", f = "CBRPreviewPhotoDocumentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f435249a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a<VM> f435250b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a<VM> aVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f435250b = aVar;
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new c(this.f435250b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f435249a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            BottomSheetBehavior bottomSheetBehavior = ((a) this.f435250b).bsbWarning;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.M(true);
            }
            BottomSheetBehavior bottomSheetBehavior2 = ((a) this.f435250b).bsbWarning;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.b(5);
            }
            TextView textViewH = this.f435250b.h();
            if (textViewH != null) {
                textViewH.setVisibility(8);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CBRPreviewPhotoDocumentFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/photo/CBRPreviewPhotoDocumentViewModel;", "VM", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentFragment$showWarning$1", f = "CBRPreviewPhotoDocumentFragment.kt", i = {}, l = {427}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f435252a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a<VM> f435253b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CBRPreviewPhotoDocumentViewModel.h f435254c;

        /* compiled from: View.kt */
        @s0
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "androidx/core/view/v0", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.presentation.screen.preview.photo.a$e$a, reason: collision with other inner class name */
        public static final class RunnableC12530a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f435255a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TextView f435256b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f435257c;

            public RunnableC12530a(View view, TextView textView, a aVar) {
                this.f435255a = view;
                this.f435256b = textView;
                this.f435257c = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TextView textView = this.f435256b;
                int height = textView != null ? textView.getHeight() : 0;
                BottomSheetBehavior bottomSheetBehavior = this.f435257c.bsbWarning;
                if (bottomSheetBehavior == null) {
                    return;
                }
                ViewGroup viewGroupK = this.f435257c.k();
                bottomSheetBehavior.N((viewGroupK != null ? viewGroupK.getHeight() : 0) - height, false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(a<VM> aVar, CBRPreviewPhotoDocumentViewModel.h hVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f435253b = aVar;
            this.f435254c = hVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(a aVar, CBRPreviewPhotoDocumentViewModel.h hVar, View view) {
            aVar.l();
            if (hVar.getIsFatal()) {
                return;
            }
            a.d(aVar).u();
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new e(this.f435253b, this.f435254c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            TextView textView;
            View viewFindViewById;
            Button button;
            Button button2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f435252a;
            if (i12 == 0) {
                C42729a0.b(obj);
                ViewGroup viewGroupK = this.f435253b.k();
                View viewFindViewById2 = viewGroupK != null ? viewGroupK.findViewById(R.id.cbr_warning_icon) : null;
                if (viewFindViewById2 != null) {
                    viewFindViewById2.setVisibility(this.f435254c.getShowIcon() ? 0 : 8);
                }
                ViewGroup viewGroupK2 = this.f435253b.k();
                TextView textView2 = viewGroupK2 != null ? (TextView) viewGroupK2.findViewById(R.id.cbr_warning_message) : null;
                if (textView2 != null) {
                    s.a(textView2, this.f435254c.getMessage());
                }
                ViewGroup viewGroupK3 = this.f435253b.k();
                if (viewGroupK3 != null && (button2 = (Button) viewGroupK3.findViewById(R.id.cbr_warning_primary_button)) != null) {
                    final CBRPreviewPhotoDocumentViewModel.h hVar = this.f435254c;
                    final a<VM> aVar = this.f435253b;
                    s.a(button2, hVar.getButtonPrimary());
                    final int i13 = 0;
                    button2.setOnClickListener(new View.OnClickListener() { // from class: ru.cyberity.cbr.presentation.screen.preview.photo.f
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    a.e.a(aVar, hVar, view);
                                    break;
                                default:
                                    a.e.b(aVar, hVar, view);
                                    break;
                            }
                        }
                    });
                }
                ViewGroup viewGroupK4 = this.f435253b.k();
                if (viewGroupK4 != null && (button = (Button) viewGroupK4.findViewById(R.id.cbr_warning_secondary_button)) != null) {
                    final CBRPreviewPhotoDocumentViewModel.h hVar2 = this.f435254c;
                    final a<VM> aVar2 = this.f435253b;
                    s.a(button, hVar2.getButtonSecondary());
                    final int i14 = 1;
                    button.setOnClickListener(new View.OnClickListener() { // from class: ru.cyberity.cbr.presentation.screen.preview.photo.f
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i14) {
                                case 0:
                                    a.e.a(aVar2, hVar2, view);
                                    break;
                                default:
                                    a.e.b(aVar2, hVar2, view);
                                    break;
                            }
                        }
                    });
                }
                ViewGroup viewGroupK5 = this.f435253b.k();
                if (viewGroupK5 != null && (viewFindViewById = viewGroupK5.findViewById(R.id.cbr_warning_progress_bar)) != null) {
                    viewFindViewById.setVisibility(this.f435254c.getLoading() ? 0 : 8);
                }
                ViewGroup viewGroupK6 = this.f435253b.k();
                if (viewGroupK6 != null && (textView = (TextView) viewGroupK6.findViewById(R.id.cbr_warning_title)) != null) {
                    s.a(textView, this.f435254c.getTitle());
                }
                ViewGroup viewGroupK7 = this.f435253b.k();
                if (viewGroupK7 != null) {
                    P.b(viewGroupK7, new RunnableC12530a(viewGroupK7, textView2, this.f435253b));
                }
                this.f435252a = 1;
                if (C43131e0.b(300L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            BottomSheetBehavior bottomSheetBehavior = ((a) this.f435253b).bsbWarning;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.b(3);
            }
            return G0.f406611a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(a aVar, CBRPreviewPhotoDocumentViewModel.h hVar, View view) {
            aVar.l();
            if (hVar.getIsFatal()) {
                a.d(aVar).u();
            } else {
                a.d(aVar).v();
            }
        }
    }

    static {
        h0 h0Var = new h0(a.class, "gContent", "getGContent()Landroidx/constraintlayout/widget/Group;", 0);
        n0 n0Var = m0.f406844a;
        f435233o = new n[]{n0Var.i(h0Var), C0.k(a.class, "ivPhoto", "getIvPhoto()Lru/cyberity/cbr/core/widget/CBRRotationZoomableImageView;", 0, n0Var), C0.k(a.class, "btnReadableDocument", "getBtnReadableDocument()Landroid/widget/Button;", 0, n0Var), C0.k(a.class, "btnTakeAnotherPhoto", "getBtnTakeAnotherPhoto()Landroid/widget/Button;", 0, n0Var), C0.k(a.class, "ivContentIcon", "getIvContentIcon()Lru/cyberity/cbr/core/widget/CBRImageView;", 0, n0Var), C0.k(a.class, "tvTitle", "getTvTitle()Landroid/widget/TextView;", 0, n0Var), C0.k(a.class, "tvSubtitle", "getTvSubtitle()Landroid/widget/TextView;", 0, n0Var), C0.k(a.class, "tvIdDoc", "getTvIdDoc()Landroid/widget/TextView;", 0, n0Var), C0.k(a.class, "vgWarning", "getVgWarning()Landroid/view/ViewGroup;", 0, n0Var), C0.k(a.class, "btnRotateCW", "getBtnRotateCW()Landroid/widget/ImageButton;", 0, n0Var), C0.k(a.class, "btnRotateCCW", "getBtnRotateCCW()Landroid/widget/ImageButton;", 0, n0Var)};
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ CBRPreviewPhotoDocumentViewModel d(a aVar) {
        return (CBRPreviewPhotoDocumentViewModel) aVar.getViewModel();
    }

    private final CBRImageView f() {
        return (CBRImageView) this.ivContentIcon.a(this, f435233o[4]);
    }

    private final CBRRotationZoomableImageView g() {
        return (CBRRotationZoomableImageView) this.ivPhoto.a(this, f435233o[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView h() {
        return (TextView) this.tvIdDoc.a(this, f435233o[7]);
    }

    private final TextView i() {
        return (TextView) this.tvSubtitle.a(this, f435233o[6]);
    }

    private final TextView j() {
        return (TextView) this.tvTitle.a(this, f435233o[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewGroup k() {
        return (ViewGroup) this.vgWarning.a(this, f435233o[8]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        N0 n02 = this.bottomSheetJob;
        if (n02 != null) {
            n02.c(null);
        }
        this.bottomSheetJob = C43259k.d(C22981N.a(getLifecycle()), null, null, new c(this, null), 3);
    }

    private final void n() {
        ViewGroup viewGroupK = k();
        if (viewGroupK == null) {
            return;
        }
        BottomSheetBehavior<ViewGroup> bottomSheetBehaviorB = BottomSheetBehavior.B(viewGroupK);
        bottomSheetBehaviorB.v(new d(this));
        this.bsbWarning = bottomSheetBehaviorB;
        l();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public Map<String, Object> getAppearPayload() {
        return getViewModel().n();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public Map<String, Object> getCancelPayload() {
        return getViewModel().n();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public Map<String, Object> getClosePayload() {
        return getViewModel().n();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public int getLayoutId() {
        return R.layout.cbr_fragment_preview_photo_document;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public Map<String, Object> getOpenPayload() {
        return getViewModel().n();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @l
    public TextView getPoweredByText() {
        ViewGroup viewGroupK = k();
        if (viewGroupK != null) {
            return (TextView) viewGroupK.findViewById(R.id.cbr_powered);
        }
        return null;
    }

    @Override // ru.cyberity.cbr.presentation.screen.preview.a, ru.cyberity.cbr.core.presentation.BaseFragment
    public void handleEvent(@k CBRViewModel.CBRViewModelEvent event) {
        super.handleEvent(event);
        if (event instanceof CBRPreviewPhotoDocumentViewModel.e) {
            if (isAdded()) {
                CBRPreviewPhotoDocumentViewModel.e eVar = (CBRPreviewPhotoDocumentViewModel.e) event;
                final int i12 = 0;
                final int i13 = 1;
                new C47034b(requireContext()).setMessage(eVar.getMessage()).setPositiveButton(eVar.getButtonPositive(), new DialogInterface.OnClickListener(this) { // from class: ru.cyberity.cbr.presentation.screen.preview.photo.d

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ a f435274c;

                    {
                        this.f435274c = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i14) {
                        switch (i12) {
                            case 0:
                                a.a(this.f435274c, dialogInterface, i14);
                                break;
                            default:
                                a.b(this.f435274c, dialogInterface, i14);
                                break;
                        }
                    }
                }).setNegativeButton(eVar.getButtonNegative(), new DialogInterface.OnClickListener(this) { // from class: ru.cyberity.cbr.presentation.screen.preview.photo.d

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ a f435274c;

                    {
                        this.f435274c = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i14) {
                        switch (i13) {
                            case 0:
                                a.a(this.f435274c, dialogInterface, i14);
                                break;
                            default:
                                a.b(this.f435274c, dialogInterface, i14);
                                break;
                        }
                    }
                }).show();
                return;
            }
            return;
        }
        if (event instanceof CBRPreviewPhotoDocumentViewModel.c.a) {
            b.Companion companion = ru.cyberity.cbr.camera.photo.presentation.document.b.INSTANCE;
            CBRPreviewPhotoDocumentViewModel.c.a aVar = (CBRPreviewPhotoDocumentViewModel.c.a) event;
            navigateTo(companion.a(aVar.getPickerRequest().getDocument().getType(), aVar.getPickerRequest().l(), aVar.getPickerRequest().getCom.avito.android.remote.model.AdvertDetailsBlockIdKt.GALLERY_BLOCK java.lang.String(), aVar.getPickerRequest().getIdentityType(), aVar.getPickerRequest().getPreferredMode()).forResult("request_photo_picker"), ru.cyberity.log.c.a(companion));
        } else if (event instanceof CBRPreviewPhotoDocumentViewModel.c.b) {
            a.Companion companion2 = ru.cyberity.cbr.camera.photo.presentation.selfie.a.INSTANCE;
            CBRPreviewPhotoDocumentViewModel.c.b bVar = (CBRPreviewPhotoDocumentViewModel.c.b) event;
            navigateTo(companion2.a(bVar.getPickerRequest().getDocument().getType(), bVar.getPickerRequest().getCom.avito.android.remote.model.AdvertDetailsBlockIdKt.GALLERY_BLOCK java.lang.String()).forResult("request_photo_picker"), ru.cyberity.log.c.a(companion2));
        } else if (event instanceof CBRPreviewPhotoDocumentViewModel.g) {
            a(((CBRPreviewPhotoDocumentViewModel.g) event).b());
        } else if (event instanceof CBRPreviewPhotoDocumentViewModel.f) {
            CBRPreviewPhotoDocumentViewModel.f fVar = (CBRPreviewPhotoDocumentViewModel.f) event;
            a(fVar.getIntroParams(), fVar.getPayload());
        }
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.bsbWarning = null;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public boolean onFinishCalled(@k a0 finishReason) {
        ru.cyberity.cbr.camera.photo.presentation.document.e.a(ru.cyberity.cbr.camera.photo.presentation.document.e.f432410a, "DocCapture", "finishing preview screen r=" + finishReason, null, 4, null);
        getViewModel().s();
        return super.onFinishCalled(finishReason);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@k View view, @l Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageButton imageButtonC = c();
        if (imageButtonC != null) {
            imageButtonC.setVisibility(4);
            final int i12 = 0;
            imageButtonC.setOnClickListener(new View.OnClickListener(this) { // from class: ru.cyberity.cbr.presentation.screen.preview.photo.c

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f435261c;

                {
                    this.f435261c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i12) {
                        case 0:
                            a.a(this.f435261c, view2);
                            break;
                        case 1:
                            a.b(this.f435261c, view2);
                            break;
                        default:
                            a.c(this.f435261c, view2);
                            break;
                    }
                }
            });
            imageButtonC.setImageDrawable(ThemeHelper.INSTANCE.resolveIcon(requireContext(), CBRIconHandler.CBRCommonIcons.ROTATE_CW.getImageName()));
        }
        ImageButton imageButtonB = b();
        if (imageButtonB != null) {
            imageButtonB.setVisibility(4);
            final int i13 = 1;
            imageButtonB.setOnClickListener(new View.OnClickListener(this) { // from class: ru.cyberity.cbr.presentation.screen.preview.photo.c

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f435261c;

                {
                    this.f435261c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i13) {
                        case 0:
                            a.a(this.f435261c, view2);
                            break;
                        case 1:
                            a.b(this.f435261c, view2);
                            break;
                        default:
                            a.c(this.f435261c, view2);
                            break;
                    }
                }
            });
            imageButtonB.setImageDrawable(ThemeHelper.INSTANCE.resolveIcon(requireContext(), CBRIconHandler.CBRCommonIcons.ROTATE_CCW.getImageName()));
        }
        TextView textViewH = h();
        if (textViewH != null) {
            textViewH.setVisibility(8);
        }
        CBRRotationZoomableImageView cBRRotationZoomableImageViewG = g();
        if (cBRRotationZoomableImageViewG != null) {
            final int i14 = 2;
            cBRRotationZoomableImageViewG.setOnClickListener(new View.OnClickListener(this) { // from class: ru.cyberity.cbr.presentation.screen.preview.photo.c

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f435261c;

                {
                    this.f435261c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i14) {
                        case 0:
                            a.a(this.f435261c, view2);
                            break;
                        case 1:
                            a.b(this.f435261c, view2);
                            break;
                        default:
                            a.c(this.f435261c, view2);
                            break;
                    }
                }
            });
        }
        n();
    }

    @Override // ru.cyberity.cbr.presentation.screen.a, ru.cyberity.cbr.core.presentation.BaseFragment
    public void onViewModelPrepared(@l Bundle savedInstanceState) {
        super.onViewModelPrepared(savedInstanceState);
        final int i12 = 0;
        requireActivity().getSupportFragmentManager().p0("request_image_rotation", this, new C(this) { // from class: ru.cyberity.cbr.presentation.screen.preview.photo.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f435259c;

            {
                this.f435259c = this;
            }

            @Override // androidx.fragment.app.C
            public final void k(Bundle bundle, String str) {
                switch (i12) {
                    case 0:
                        a.a(this.f435259c, str, bundle);
                        break;
                    default:
                        a.b(this.f435259c, str, bundle);
                        break;
                }
            }
        });
        final int i13 = 1;
        requireActivity().getSupportFragmentManager().p0("request_photo_picker", this, new C(this) { // from class: ru.cyberity.cbr.presentation.screen.preview.photo.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f435259c;

            {
                this.f435259c = this;
            }

            @Override // androidx.fragment.app.C
            public final void k(Bundle bundle, String str) {
                switch (i13) {
                    case 0:
                        a.a(this.f435259c, str, bundle);
                        break;
                    default:
                        a.b(this.f435259c, str, bundle);
                        break;
                }
            }
        });
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public void updatePoweredByVisibility(boolean hideLogo) {
        TextView poweredByText = getPoweredByText();
        if (poweredByText != null) {
            poweredByText.setVisibility(hideLogo ? 4 : 0);
        }
        View viewFindViewById = requireView().findViewById(R.id.cbr_powered);
        if (viewFindViewById != null) {
            s.a(viewFindViewById, hideLogo);
        }
    }

    private final Button a() {
        return (Button) this.btnReadableDocument.a(this, f435233o[2]);
    }

    private final ImageButton b() {
        return (ImageButton) this.btnRotateCCW.a(this, f435233o[10]);
    }

    private final ImageButton c() {
        return (ImageButton) this.btnRotateCW.a(this, f435233o[9]);
    }

    private final Button d() {
        return (Button) this.btnTakeAnotherPhoto.a(this, f435233o[3]);
    }

    private final Group e() {
        return (Group) this.gContent.a(this, f435233o[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(a aVar, View view) {
        aVar.getAnalyticsDelegate().b(aVar.getScreen(), aVar.getIdDocSetType(), Control.RotateButton, ((CBRPreviewPhotoDocumentViewModel) aVar.getViewModel()).n());
        CBRRotationZoomableImageView cBRRotationZoomableImageViewG = aVar.g();
        if (cBRRotationZoomableImageViewG != null) {
            cBRRotationZoomableImageViewG.rotateCW();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(a aVar, View view) {
        aVar.getAnalyticsDelegate().b(aVar.getScreen(), aVar.getIdDocSetType(), Control.RotateButton, ((CBRPreviewPhotoDocumentViewModel) aVar.getViewModel()).n());
        CBRRotationZoomableImageView cBRRotationZoomableImageViewG = aVar.g();
        if (cBRRotationZoomableImageViewG != null) {
            cBRRotationZoomableImageViewG.rotateCCW();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(a aVar, View view) {
        File bitmapFile;
        CBRPreviewPhotoDocumentViewModel.a aVar2 = (CBRPreviewPhotoDocumentViewModel.a) ((CBRPreviewPhotoDocumentViewModel) aVar.getViewModel()).currentState();
        g appListener = aVar.getAppListener();
        if (appListener == null || (bitmapFile = aVar2.getBitmapFile()) == null) {
            return;
        }
        CBRRotationZoomableImageView cBRRotationZoomableImageViewG = aVar.g();
        appListener.a(bitmapFile, cBRRotationZoomableImageViewG != null ? cBRRotationZoomableImageViewG.getRotation() : 0, aVar.getIdDocSetType(), "request_image_rotation");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(a aVar, String str, Bundle bundle) {
        ArrayList parcelableArrayList;
        o oVar = (o) bundle.getParcelable("DOCUMENT_RESULT");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableArrayList = bundle.getParcelableArrayList("DOCUMENT_RESULTS", o.class);
        } else {
            parcelableArrayList = bundle.getParcelableArrayList("DOCUMENT_RESULTS");
        }
        if (!BaseFragment.INSTANCE.isSuccessResult(bundle)) {
            aVar.m();
        } else if (parcelableArrayList != null) {
            ((CBRPreviewPhotoDocumentViewModel) aVar.getViewModel()).a(parcelableArrayList);
        } else {
            ((CBRPreviewPhotoDocumentViewModel) aVar.getViewModel()).a(oVar);
        }
    }

    @Override // ru.cyberity.cbr.presentation.screen.a
    public void a(boolean success, @l Parcelable payload) {
        Logger.v$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "On instructions showed, success=" + success + ", payload=" + payload, null, 4, null);
        if (success) {
            getViewModel().a(payload);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(a aVar, String str, Bundle bundle) {
        ((CBRPreviewPhotoDocumentViewModel) aVar.getViewModel()).d(bundle.getInt("rotation", 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(a aVar, DialogInterface dialogInterface, int i12) {
        ((CBRPreviewPhotoDocumentViewModel) aVar.getViewModel()).b(true);
    }

    private final void a(d.a<ru.cyberity.ml.badphotos.models.a> res) {
        String strE0;
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (res instanceof d.a.c) {
            StringBuilder sb2 = new StringBuilder("\n                        Result: Success in ");
            d.a.c cVar = (d.a.c) res;
            sb2.append(((ru.cyberity.ml.badphotos.models.a) cVar.c()).getExecutionTimeMs());
            sb2.append(" ms\n                        Raw model output: ");
            sb2.append(((ru.cyberity.ml.badphotos.models.a) cVar.c()).getScore());
            sb2.append("\n                    ");
            strE0 = C43066x.E0(sb2.toString());
        } else if (res instanceof d.a.C12570a) {
            strE0 = C43066x.E0("\n                        Result: Failure\n                        Error: " + ((d.a.C12570a) res).getThrowable().getMessage() + "                                        \n                    ");
        } else if (res instanceof d.a.b) {
            strE0 = "Timeout";
        } else if (res instanceof d.a.C12571d) {
            strE0 = "Skipped";
        } else {
            strE0 = "Unknown";
        }
        Toast.makeText(context, strE0, 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(a aVar, DialogInterface dialogInterface, int i12) {
        ((CBRPreviewPhotoDocumentViewModel) aVar.getViewModel()).b(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(a aVar, CBRPreviewPhotoDocumentViewModel.a aVar2, View view) {
        CBRPreviewPhotoDocumentViewModel.Content.a buttonNegative;
        CBRPreviewPhotoDocumentViewModel.Content content = aVar2.getContent();
        aVar.a((content == null || (buttonNegative = content.getButtonNegative()) == null) ? null : buttonNegative.getAction());
    }

    public void m() {
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f9  */
    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleState(@Y61.k final ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel.a r20, @Y61.l android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.photo.a.handleState(ru.cyberity.cbr.presentation.screen.preview.photo.CBRPreviewPhotoDocumentViewModel$a, android.os.Bundle):void");
    }

    /* compiled from: CBRPreviewPhotoDocumentFragment.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"ru/cyberity/cbr/presentation/screen/preview/photo/a$d", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;", "Landroid/view/View;", "bottomSheet", "", "newState", "Lkotlin/G0;", "onStateChanged", "(Landroid/view/View;I)V", "", "slideOffset", "onSlide", "(Landroid/view/View;F)V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class d extends BottomSheetBehavior.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a<VM> f435251a;

        public d(a<VM> aVar) {
            this.f435251a = aVar;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public void onStateChanged(@k View bottomSheet, int newState) {
            if (newState != 3) {
                if (newState != 4) {
                    return;
                }
                this.f435251a.getAnalyticsDelegate().a(this.f435251a.getScreen(), (Map<String, ? extends Object>) a.d(this.f435251a).n());
            } else {
                this.f435251a.getAnalyticsDelegate().b(this.f435251a.getScreen(), a.d(this.f435251a).n());
                BottomSheetBehavior bottomSheetBehavior = ((a) this.f435251a).bsbWarning;
                if (bottomSheetBehavior == null) {
                    return;
                }
                bottomSheetBehavior.M(false);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public void onSlide(@k View bottomSheet, float slideOffset) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, CBRPreviewPhotoDocumentViewModel.a aVar2, View view) {
        CBRPreviewPhotoDocumentViewModel.Content.a buttonPositive;
        CBRPreviewPhotoDocumentViewModel.Content content = aVar2.getContent();
        aVar.a((content == null || (buttonPositive = content.getButtonPositive()) == null) ? null : buttonPositive.getAction());
    }

    private final void a(CBRPreviewPhotoDocumentViewModel.Content.ButtonAction action) {
        int i12 = action == null ? -1 : b.f435248b[action.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                return;
            }
            getAnalyticsDelegate().b(getScreen(), getIdDocSetType(), Control.RetakeButton, getViewModel().n());
            getViewModel().i();
            return;
        }
        getAnalyticsDelegate().b(getScreen(), getIdDocSetType(), Control.AcceptButton, getViewModel().n());
        CBRRotationZoomableImageView cBRRotationZoomableImageViewG = g();
        if (cBRRotationZoomableImageViewG != null) {
            getViewModel().a(cBRRotationZoomableImageViewG.getRotation());
        }
    }

    private final void a(CBRPreviewPhotoDocumentViewModel.h warning) {
        N0 n02 = this.bottomSheetJob;
        if (n02 != null) {
            n02.c(null);
        }
        this.bottomSheetJob = C43259k.d(C22981N.a(getLifecycle()), null, null, new e(this, warning, null), 3);
    }
}
