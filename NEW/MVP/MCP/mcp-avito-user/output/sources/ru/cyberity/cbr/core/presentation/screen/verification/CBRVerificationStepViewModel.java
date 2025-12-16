package ru.cyberity.cbr.core.presentation.screen.verification;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.view.AbstractC22993a;
import androidx.view.C23060r0;
import androidx.view.InterfaceC23487e;
import androidx.view.M0;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.ranges.s;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43315z0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.A1;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.n2;
import ru.cyberity.cbr.core.data.source.applicant.remote.x;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBRVerificationStepViewModel.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 Y2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0018),0Z2B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u001fJ\r\u0010 \u001a\u00020\u0013¢\u0006\u0004\b \u0010\u001fJ\u001d\u0010\u0018\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010!H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010#J\u001d\u0010\u0018\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010$H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010&J\u001d\u0010)\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010'H\u0082@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001b\u0010\u0018\u001a\u00020$2\u0006\u0010(\u001a\u00020'H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010*J\u0017\u0010)\u001a\u00020\u00132\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b)\u0010+J\u001b\u0010,\u001a\u00020\u00132\u0006\u0010(\u001a\u00020'H\u0082@ø\u0001\u0000¢\u0006\u0004\b,\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010-R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010.R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010/R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010;R+\u0010C\u001a\u00020=2\u0006\u0010>\u001a\u00020=8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\b4\u0010A\"\u0004\b\u0018\u0010BR/\u0010G\u001a\u0004\u0018\u00010!2\b\u0010>\u001a\u0004\u0018\u00010!8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010@\u001a\u0004\b0\u0010E\"\u0004\b\u0018\u0010FR/\u0010J\u001a\u0004\u0018\u00010$2\b\u0010>\u001a\u0004\u0018\u00010$8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010@\u001a\u0004\b,\u0010I\"\u0004\b\u0018\u0010+R/\u0010N\u001a\u0004\u0018\u00010'2\b\u0010>\u001a\u0004\u0018\u00010'8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bK\u0010@\u001a\u0004\b)\u0010L\"\u0004\b\u0018\u0010MR\u0016\u0010R\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR \u0010W\u001a\b\u0012\u0004\u0012\u00020\u00020S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\b7\u0010VR\u0014\u0010X\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006["}, d2 = {"Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel;", "Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$e;", "Lru/cyberity/cbr/core/presentation/screen/verification/ValidationIdentifierType;", "type", "Lru/cyberity/cbr/core/domain/b;", "countriesUseCase", "Lru/cyberity/cbr/core/domain/n;", "requestCodeUseCase", "Lru/cyberity/cbr/core/domain/i;", "checkCodeUseCase", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "Landroidx/lifecycle/r0;", "savedStateHandle", "<init>", "(Lru/cyberity/cbr/core/presentation/screen/verification/ValidationIdentifierType;Lru/cyberity/cbr/core/domain/b;Lru/cyberity/cbr/core/domain/n;Lru/cyberity/cbr/core/domain/i;Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/dynamic/c;Landroidx/lifecycle/r0;)V", "Lkotlin/G0;", "onPrepare", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "a", "(Ljava/lang/String;)V", "verificationId", "code", "(Ljava/lang/String;Ljava/lang/String;)V", "getDocumentType", "()Ljava/lang/String;", "()V", "h", "", "error", "(Ljava/lang/CharSequence;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$c;", "data", "(Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/applicant/remote/x;", "response", "b", "(Lru/cyberity/cbr/core/data/source/applicant/remote/x;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$c;)V", "c", "Lru/cyberity/cbr/core/presentation/screen/verification/ValidationIdentifierType;", "Lru/cyberity/cbr/core/domain/b;", "Lru/cyberity/cbr/core/domain/n;", "d", "Lru/cyberity/cbr/core/domain/i;", "e", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "f", "Landroidx/lifecycle/r0;", "Lkotlinx/coroutines/N0;", "g", "Lkotlinx/coroutines/N0;", "countDownTimerJob", "Lkotlinx/coroutines/T;", "Lkotlinx/coroutines/T;", "timerScope", "Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$Step;", "<set-?>", "i", "Lru/cyberity/cbr/core/presentation/screen/base/a;", "()Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$Step;", "(Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$Step;)V", "step", "j", "()Ljava/lang/CharSequence;", "(Ljava/lang/CharSequence;)V", "currentError", "k", "()Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$c;", "countdown", "l", "()Lru/cyberity/cbr/core/data/source/applicant/remote/x;", "(Lru/cyberity/cbr/core/data/source/applicant/remote/x;)V", "codeResponse", "", "m", "Z", "codeRequested", "Lkotlinx/coroutines/flow/n2;", "n", "Lkotlinx/coroutines/flow/n2;", "()Lkotlinx/coroutines/flow/n2;", "viewState", "idDocSetType", "o", "Step", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class CBRVerificationStepViewModel extends CBRViewModel<e> {

    /* renamed from: p, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f434045p;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ValidationIdentifierType type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.domain.b countriesUseCase;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.domain.n requestCodeUseCase;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.domain.i checkCodeUseCase;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.dynamic.c dataRepository;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final C23060r0 savedStateHandle;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private N0 countDownTimerJob;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final T timerScope;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.presentation.screen.base.a step;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.presentation.screen.base.a currentError;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.presentation.screen.base.a countdown;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.presentation.screen.base.a codeResponse;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean codeRequested;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final n2<e> viewState;

    /* compiled from: CBRVerificationStepViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$Step;", "", "(Ljava/lang/String;I)V", "INIT", "VERIFY_CODE", "STATUS", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Step {
        INIT,
        VERIFY_CODE,
        STATUS
    }

    /* compiled from: CBRVerificationStepViewModel.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$a;", "Landroidx/lifecycle/a;", "Landroidx/savedstate/e;", SearchParamsConverterKt.OWNER, "Lru/cyberity/cbr/core/presentation/screen/verification/ValidationIdentifierType;", "type", "Lru/cyberity/cbr/core/b;", "serviceLocator", "Landroid/os/Bundle;", "args", "<init>", "(Landroidx/savedstate/e;Lru/cyberity/cbr/core/presentation/screen/verification/ValidationIdentifierType;Lru/cyberity/cbr/core/b;Landroid/os/Bundle;)V", "Landroidx/lifecycle/M0;", "T", "", "key", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/r0;", "handle", "create", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/r0;)Landroidx/lifecycle/M0;", "a", "Lru/cyberity/cbr/core/presentation/screen/verification/ValidationIdentifierType;", "b", "Lru/cyberity/cbr/core/b;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends AbstractC22993a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final ValidationIdentifierType type;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final ru.cyberity.cbr.core.b serviceLocator;

        public /* synthetic */ a(InterfaceC23487e interfaceC23487e, ValidationIdentifierType validationIdentifierType, ru.cyberity.cbr.core.b bVar, Bundle bundle, int i12, C42822w c42822w) {
            this(interfaceC23487e, validationIdentifierType, bVar, (i12 & 8) != 0 ? null : bundle);
        }

        @Override // androidx.view.AbstractC22993a
        @Y61.k
        public <T extends M0> T create(@Y61.k String key, @Y61.k Class<T> modelClass, @Y61.k C23060r0 handle) {
            return new CBRVerificationStepViewModel(this.type, new ru.cyberity.cbr.core.domain.b(this.serviceLocator.k(), this.serviceLocator.m()), new ru.cyberity.cbr.core.domain.n(this.serviceLocator.z(), this.serviceLocator.e()), new ru.cyberity.cbr.core.domain.i(this.serviceLocator.z(), this.serviceLocator.e()), this.serviceLocator.k(), this.serviceLocator.m(), handle);
        }

        public a(@Y61.k InterfaceC23487e interfaceC23487e, @Y61.k ValidationIdentifierType validationIdentifierType, @Y61.k ru.cyberity.cbr.core.b bVar, @Y61.l Bundle bundle) {
            super(interfaceC23487e, bundle);
            this.type = validationIdentifierType;
            this.serviceLocator = bVar;
        }
    }

    /* compiled from: CBRVerificationStepViewModel.kt */
    @K51.d
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0083\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ^\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010\u0012R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00067"}, d2 = {"Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$c;", "Landroid/os/Parcelable;", "", "title", "subtitle", "", "verificationCodeLength", "", "identifier", "id", "", "endTime", "secondsRemaining", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;J)V", "a", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;J)Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/CharSequence;", "m", "()Ljava/lang/CharSequence;", "b", "l", "c", "Ljava/lang/Integer;", "n", "()Ljava/lang/Integer;", "d", "Ljava/lang/String;", "j", "e", "i", "f", "Ljava/lang/Long;", "h", "()Ljava/lang/Long;", "g", "J", "k", "()J", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class c implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence title;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence subtitle;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final Integer verificationCodeLength;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final String identifier;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final String id;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final Long endTime;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final long secondsRemaining;

        /* compiled from: CBRVerificationStepViewModel.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(@Y61.k Parcel parcel) {
                Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
                return new c((CharSequence) creator.createFromParcel(parcel), (CharSequence) creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i12) {
                return new c[i12];
            }
        }

        public c(@Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2, @Y61.l Integer num, @Y61.k String str, @Y61.k String str2, @Y61.l Long l12, long j12) {
            this.title = charSequence;
            this.subtitle = charSequence2;
            this.verificationCodeLength = num;
            this.identifier = str;
            this.id = str2;
            this.endTime = l12;
            this.secondsRemaining = j12;
        }

        @Y61.k
        public final c a(@Y61.l CharSequence title, @Y61.l CharSequence subtitle, @Y61.l Integer verificationCodeLength, @Y61.k String identifier, @Y61.k String id2, @Y61.l Long endTime, long secondsRemaining) {
            return new c(title, subtitle, verificationCodeLength, identifier, id2, endTime, secondsRemaining);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return L.f(this.title, cVar.title) && L.f(this.subtitle, cVar.subtitle) && L.f(this.verificationCodeLength, cVar.verificationCodeLength) && L.f(this.identifier, cVar.identifier) && L.f(this.id, cVar.id) && L.f(this.endTime, cVar.endTime) && this.secondsRemaining == cVar.secondsRemaining;
        }

        @Y61.l
        /* renamed from: h, reason: from getter */
        public final Long getEndTime() {
            return this.endTime;
        }

        public int hashCode() {
            CharSequence charSequence = this.title;
            int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.subtitle;
            int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            Integer num = this.verificationCodeLength;
            int iD2 = H.d(H.d((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.identifier), 31, this.id);
            Long l12 = this.endTime;
            return Long.hashCode(this.secondsRemaining) + ((iD2 + (l12 != null ? l12.hashCode() : 0)) * 31);
        }

        @Y61.k
        /* renamed from: i, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Y61.k
        /* renamed from: j, reason: from getter */
        public final String getIdentifier() {
            return this.identifier;
        }

        /* renamed from: k, reason: from getter */
        public final long getSecondsRemaining() {
            return this.secondsRemaining;
        }

        @Y61.l
        /* renamed from: l, reason: from getter */
        public final CharSequence getSubtitle() {
            return this.subtitle;
        }

        @Y61.l
        /* renamed from: m, reason: from getter */
        public final CharSequence getTitle() {
            return this.title;
        }

        @Y61.l
        /* renamed from: n, reason: from getter */
        public final Integer getVerificationCodeLength() {
            return this.verificationCodeLength;
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CountdownData(title=");
            sb2.append((Object) this.title);
            sb2.append(", subtitle=");
            sb2.append((Object) this.subtitle);
            sb2.append(", verificationCodeLength=");
            sb2.append(this.verificationCodeLength);
            sb2.append(", identifier=");
            sb2.append(this.identifier);
            sb2.append(", id=");
            sb2.append(this.id);
            sb2.append(", endTime=");
            sb2.append(this.endTime);
            sb2.append(", secondsRemaining=");
            return androidx.appcompat.app.r.u(sb2, this.secondsRemaining, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int flags) {
            TextUtils.writeToParcel(this.title, parcel, flags);
            TextUtils.writeToParcel(this.subtitle, parcel, flags);
            Integer num = this.verificationCodeLength;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            parcel.writeString(this.identifier);
            parcel.writeString(this.id);
            Long l12 = this.endTime;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            parcel.writeLong(this.secondsRemaining);
        }

        public static /* synthetic */ c a(c cVar, CharSequence charSequence, CharSequence charSequence2, Integer num, String str, String str2, Long l12, long j12, int i12, Object obj) {
            return cVar.a((i12 & 1) != 0 ? cVar.title : charSequence, (i12 & 2) != 0 ? cVar.subtitle : charSequence2, (i12 & 4) != 0 ? cVar.verificationCodeLength : num, (i12 & 8) != 0 ? cVar.identifier : str, (i12 & 16) != 0 ? cVar.id : str2, (i12 & 32) != 0 ? cVar.endTime : l12, (i12 & 64) != 0 ? cVar.secondsRemaining : j12);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ c(CharSequence charSequence, CharSequence charSequence2, Integer num, String str, String str2, Long l12, long j12, int i12, C42822w c42822w) {
            long jB2;
            if ((i12 & 64) != 0) {
                jB2 = s.b(TimeUnit.MILLISECONDS.toSeconds(l12 != null ? l12.longValue() - System.currentTimeMillis() : 0L), 0L);
            } else {
                jB2 = j12;
            }
            this(charSequence, charSequence2, num, str, str2, l12, jB2);
        }
    }

    /* compiled from: CBRVerificationStepViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$d;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "<init>", "()V", "a", "b", "Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$d$a;", "Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$d$b;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class d implements CBRViewModel.CBRViewModelEvent {

        /* compiled from: CBRVerificationStepViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$d$a;", "Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$d;", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
        public static final class a extends d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f434069a = new a();

            private a() {
                super(null);
            }
        }

        /* compiled from: CBRVerificationStepViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$d$b;", "Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$d;", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
        public static final class b extends d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f434070a = new b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        private d() {
        }
    }

    /* compiled from: CBRVerificationStepViewModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\b\f\n\r\u000eB-\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\b\u0010\u000b\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$e;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "", "title", "subtitle", "initialValue", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "a", "Ljava/lang/CharSequence;", "c", "()Ljava/lang/CharSequence;", "b", "d", "e", "Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$e$a;", "Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$e$b;", "Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$e$c;", "Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$e$d;", "Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$e$e;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class e implements CBRViewModel.CBRViewModelState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence title;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence subtitle;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence initialValue;

        /* compiled from: CBRVerificationStepViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$e$a;", "Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$e;", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
        public static final class a extends e {

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public static final a f434074d = new a();

            private a() {
                super(null, null, null, 7, null);
            }
        }

        /* compiled from: CBRVerificationStepViewModel.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\f\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$e$b;", "Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$e;", "", "title", "subtitle", "", "icon", "primaryButton", "", "isFailure", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/CharSequence;Z)V", "d", "Ljava/lang/CharSequence;", "c", "()Ljava/lang/CharSequence;", "e", "b", "f", "Ljava/lang/String;", "()Ljava/lang/String;", "g", "h", "Z", "()Z", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
        public static final class b extends e {

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence title;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence subtitle;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final String icon;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence primaryButton;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata */
            private final boolean isFailure;

            public b(@Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2, @Y61.k String str, @Y61.l CharSequence charSequence3, boolean z12) {
                super(charSequence, charSequence2, null, 4, null);
                this.title = charSequence;
                this.subtitle = charSequence2;
                this.icon = str;
                this.primaryButton = charSequence3;
                this.isFailure = z12;
            }

            @Y61.l
            /* renamed from: c, reason: from getter */
            public CharSequence getTitle() {
                return this.title;
            }

            @Y61.k
            /* renamed from: d, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            @Y61.l
            /* renamed from: e, reason: from getter */
            public final CharSequence getPrimaryButton() {
                return this.primaryButton;
            }

            /* renamed from: f, reason: from getter */
            public final boolean getIsFailure() {
                return this.isFailure;
            }
        }

        /* compiled from: CBRVerificationStepViewModel.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b'\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0010R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010\u0010¨\u0006-"}, d2 = {"Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$e$c;", "Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$e;", "", "title", "subtitle", "timer", "resendButton", "", "verificationCodeLength", "error", "", "identifier", "id", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/CharSequence;", "c", "()Ljava/lang/CharSequence;", "e", "b", "f", "p", "g", "o", "h", "Ljava/lang/Integer;", "q", "()Ljava/lang/Integer;", "i", "l", "j", "Ljava/lang/String;", "n", "k", "m", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
        public static final /* data */ class c extends e {

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence title;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence subtitle;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence timer;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence resendButton;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final Integer verificationCodeLength;

            /* renamed from: i, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence error;

            /* renamed from: j, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final String identifier;

            /* renamed from: k, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final String id;

            public c() {
                this(null, null, null, null, null, null, null, null, 255, null);
            }

            @Y61.l
            /* renamed from: b, reason: from getter */
            public CharSequence getSubtitle() {
                return this.subtitle;
            }

            @Y61.l
            /* renamed from: c, reason: from getter */
            public CharSequence getTitle() {
                return this.title;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof c)) {
                    return false;
                }
                c cVar = (c) other;
                return L.f(getTitle(), cVar.getTitle()) && L.f(getSubtitle(), cVar.getSubtitle()) && L.f(this.timer, cVar.timer) && L.f(this.resendButton, cVar.resendButton) && L.f(this.verificationCodeLength, cVar.verificationCodeLength) && L.f(this.error, cVar.error) && L.f(this.identifier, cVar.identifier) && L.f(this.id, cVar.id);
            }

            public int hashCode() {
                int iHashCode = (((getTitle() == null ? 0 : getTitle().hashCode()) * 31) + (getSubtitle() == null ? 0 : getSubtitle().hashCode())) * 31;
                CharSequence charSequence = this.timer;
                int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
                CharSequence charSequence2 = this.resendButton;
                int iHashCode3 = (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
                Integer num = this.verificationCodeLength;
                int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
                CharSequence charSequence3 = this.error;
                return this.id.hashCode() + H.d((iHashCode4 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31, 31, this.identifier);
            }

            @Y61.l
            /* renamed from: l, reason: from getter */
            public final CharSequence getError() {
                return this.error;
            }

            @Y61.k
            /* renamed from: m, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @Y61.k
            /* renamed from: n, reason: from getter */
            public final String getIdentifier() {
                return this.identifier;
            }

            @Y61.l
            /* renamed from: o, reason: from getter */
            public final CharSequence getResendButton() {
                return this.resendButton;
            }

            @Y61.l
            /* renamed from: p, reason: from getter */
            public final CharSequence getTimer() {
                return this.timer;
            }

            @Y61.l
            /* renamed from: q, reason: from getter */
            public final Integer getVerificationCodeLength() {
                return this.verificationCodeLength;
            }

            @Y61.k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("VerifyCode(title=");
                sb2.append((Object) getTitle());
                sb2.append(", subtitle=");
                sb2.append((Object) getSubtitle());
                sb2.append(", timer=");
                sb2.append((Object) this.timer);
                sb2.append(", resendButton=");
                sb2.append((Object) this.resendButton);
                sb2.append(", verificationCodeLength=");
                sb2.append(this.verificationCodeLength);
                sb2.append(", error=");
                sb2.append((Object) this.error);
                sb2.append(", identifier=");
                sb2.append(this.identifier);
                sb2.append(", id=");
                return C22026a.c(sb2, this.id, ')');
            }

            public /* synthetic */ c(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Integer num, CharSequence charSequence5, String str, String str2, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : charSequence, (i12 & 2) != 0 ? null : charSequence2, (i12 & 4) != 0 ? null : charSequence3, (i12 & 8) != 0 ? null : charSequence4, (i12 & 16) != 0 ? null : num, (i12 & 32) == 0 ? charSequence5 : null, (i12 & 64) != 0 ? "" : str, (i12 & 128) == 0 ? str2 : "");
            }

            public c(@Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2, @Y61.l CharSequence charSequence3, @Y61.l CharSequence charSequence4, @Y61.l Integer num, @Y61.l CharSequence charSequence5, @Y61.k String str, @Y61.k String str2) {
                super(charSequence, charSequence2, null, 4, null);
                this.title = charSequence;
                this.subtitle = charSequence2;
                this.timer = charSequence3;
                this.resendButton = charSequence4;
                this.verificationCodeLength = num;
                this.error = charSequence5;
                this.identifier = str;
                this.id = str2;
            }
        }

        /* compiled from: CBRVerificationStepViewModel.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019¨\u0006$"}, d2 = {"Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$e$d;", "Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$e;", "", "title", "subtitle", "initialValue", "hint", "error", "primaryButton", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/CharSequence;", "c", "()Ljava/lang/CharSequence;", "e", "b", "f", "a", "g", "k", "h", "j", "i", "l", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
        public static final /* data */ class d extends e {

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence title;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence subtitle;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence initialValue;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence hint;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence error;

            /* renamed from: i, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence primaryButton;

            public d(@Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2, @Y61.l CharSequence charSequence3, @Y61.l CharSequence charSequence4, @Y61.l CharSequence charSequence5, @Y61.l CharSequence charSequence6) {
                super(charSequence, charSequence2, charSequence3, null);
                this.title = charSequence;
                this.subtitle = charSequence2;
                this.initialValue = charSequence3;
                this.hint = charSequence4;
                this.error = charSequence5;
                this.primaryButton = charSequence6;
            }

            @Y61.l
            /* renamed from: a, reason: from getter */
            public CharSequence getInitialValue() {
                return this.initialValue;
            }

            @Y61.l
            /* renamed from: b, reason: from getter */
            public CharSequence getSubtitle() {
                return this.subtitle;
            }

            @Y61.l
            /* renamed from: c, reason: from getter */
            public CharSequence getTitle() {
                return this.title;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof d)) {
                    return false;
                }
                d dVar = (d) other;
                return L.f(getTitle(), dVar.getTitle()) && L.f(getSubtitle(), dVar.getSubtitle()) && L.f(getInitialValue(), dVar.getInitialValue()) && L.f(this.hint, dVar.hint) && L.f(this.error, dVar.error) && L.f(this.primaryButton, dVar.primaryButton);
            }

            public int hashCode() {
                int iHashCode = (((((getTitle() == null ? 0 : getTitle().hashCode()) * 31) + (getSubtitle() == null ? 0 : getSubtitle().hashCode())) * 31) + (getInitialValue() == null ? 0 : getInitialValue().hashCode())) * 31;
                CharSequence charSequence = this.hint;
                int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
                CharSequence charSequence2 = this.error;
                int iHashCode3 = (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
                CharSequence charSequence3 = this.primaryButton;
                return iHashCode3 + (charSequence3 != null ? charSequence3.hashCode() : 0);
            }

            @Y61.l
            /* renamed from: j, reason: from getter */
            public final CharSequence getError() {
                return this.error;
            }

            @Y61.l
            /* renamed from: k, reason: from getter */
            public final CharSequence getHint() {
                return this.hint;
            }

            @Y61.l
            /* renamed from: l, reason: from getter */
            public final CharSequence getPrimaryButton() {
                return this.primaryButton;
            }

            @Y61.k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("VerifyEmail(title=");
                sb2.append((Object) getTitle());
                sb2.append(", subtitle=");
                sb2.append((Object) getSubtitle());
                sb2.append(", initialValue=");
                sb2.append((Object) getInitialValue());
                sb2.append(", hint=");
                sb2.append((Object) this.hint);
                sb2.append(", error=");
                sb2.append((Object) this.error);
                sb2.append(", primaryButton=");
                return AK.c.r(sb2, this.primaryButton, ')');
            }
        }

        /* compiled from: CBRVerificationStepViewModel.kt */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010\u001a¨\u0006'"}, d2 = {"Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$e$e;", "Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$e;", "", "title", "subtitle", "initialValue", "Lru/cyberity/cbr/core/domain/c;", "countryResultData", "error", "primaryButton", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lru/cyberity/cbr/core/domain/c;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/CharSequence;", "c", "()Ljava/lang/CharSequence;", "e", "b", "f", "a", "g", "Lru/cyberity/cbr/core/domain/c;", "j", "()Lru/cyberity/cbr/core/domain/c;", "h", "k", "i", "l", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.core.presentation.screen.verification.CBRVerificationStepViewModel$e$e, reason: collision with other inner class name */
        public static final /* data */ class C12488e extends e {

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence title;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence subtitle;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence initialValue;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final ru.cyberity.cbr.core.domain.c countryResultData;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence error;

            /* renamed from: i, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence primaryButton;

            public C12488e(@Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2, @Y61.l CharSequence charSequence3, @Y61.k ru.cyberity.cbr.core.domain.c cVar, @Y61.l CharSequence charSequence4, @Y61.l CharSequence charSequence5) {
                super(charSequence, charSequence2, charSequence3, null);
                this.title = charSequence;
                this.subtitle = charSequence2;
                this.initialValue = charSequence3;
                this.countryResultData = cVar;
                this.error = charSequence4;
                this.primaryButton = charSequence5;
            }

            @Y61.l
            /* renamed from: a, reason: from getter */
            public CharSequence getInitialValue() {
                return this.initialValue;
            }

            @Y61.l
            /* renamed from: b, reason: from getter */
            public CharSequence getSubtitle() {
                return this.subtitle;
            }

            @Y61.l
            /* renamed from: c, reason: from getter */
            public CharSequence getTitle() {
                return this.title;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C12488e)) {
                    return false;
                }
                C12488e c12488e = (C12488e) other;
                return L.f(getTitle(), c12488e.getTitle()) && L.f(getSubtitle(), c12488e.getSubtitle()) && L.f(getInitialValue(), c12488e.getInitialValue()) && L.f(this.countryResultData, c12488e.countryResultData) && L.f(this.error, c12488e.error) && L.f(this.primaryButton, c12488e.primaryButton);
            }

            public int hashCode() {
                int iHashCode = (this.countryResultData.hashCode() + ((((((getTitle() == null ? 0 : getTitle().hashCode()) * 31) + (getSubtitle() == null ? 0 : getSubtitle().hashCode())) * 31) + (getInitialValue() == null ? 0 : getInitialValue().hashCode())) * 31)) * 31;
                CharSequence charSequence = this.error;
                int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
                CharSequence charSequence2 = this.primaryButton;
                return iHashCode2 + (charSequence2 != null ? charSequence2.hashCode() : 0);
            }

            @Y61.k
            /* renamed from: j, reason: from getter */
            public final ru.cyberity.cbr.core.domain.c getCountryResultData() {
                return this.countryResultData;
            }

            @Y61.l
            /* renamed from: k, reason: from getter */
            public final CharSequence getError() {
                return this.error;
            }

            @Y61.l
            /* renamed from: l, reason: from getter */
            public final CharSequence getPrimaryButton() {
                return this.primaryButton;
            }

            @Y61.k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("VerifyPhone(title=");
                sb2.append((Object) getTitle());
                sb2.append(", subtitle=");
                sb2.append((Object) getSubtitle());
                sb2.append(", initialValue=");
                sb2.append((Object) getInitialValue());
                sb2.append(", countryResultData=");
                sb2.append(this.countryResultData);
                sb2.append(", error=");
                sb2.append((Object) this.error);
                sb2.append(", primaryButton=");
                return AK.c.r(sb2, this.primaryButton, ')');
            }
        }

        public /* synthetic */ e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, C42822w c42822w) {
            this(charSequence, charSequence2, charSequence3);
        }

        private e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
            this.title = charSequence;
            this.subtitle = charSequence2;
            this.initialValue = charSequence3;
        }

        public /* synthetic */ e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : charSequence, (i12 & 2) != 0 ? null : charSequence2, (i12 & 4) != 0 ? null : charSequence3, null);
        }
    }

    /* compiled from: CBRVerificationStepViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f434100a;

        static {
            int[] iArr = new int[ValidationIdentifierType.values().length];
            iArr[ValidationIdentifierType.EMAIL.ordinal()] = 1;
            iArr[ValidationIdentifierType.PHONE.ordinal()] = 2;
            iArr[ValidationIdentifierType.UNKNOWN.ordinal()] = 3;
            f434100a = iArr;
        }
    }

    /* compiled from: CBRVerificationStepViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.screen.verification.CBRVerificationStepViewModel", f = "CBRVerificationStepViewModel.kt", i = {0, 0, 1, 1, 2, 2, 3, 3}, l = {248, 250, 254, 258}, m = "buildCountDownData", n = {"this", "response", "this", "response", "response", "title", "response", "title"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f434101a;

        /* renamed from: b, reason: collision with root package name */
        Object f434102b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f434103c;

        /* renamed from: e, reason: collision with root package name */
        int f434105e;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f434103c = obj;
            this.f434105e |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRVerificationStepViewModel.this.a((x) null, this);
        }
    }

    /* compiled from: CBRVerificationStepViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.screen.verification.CBRVerificationStepViewModel", f = "CBRVerificationStepViewModel.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8}, l = {94, 104, 105, 107, 109, 114, 117, 118, 121, 130, 134}, m = "buildInitState", n = {"this", "error", "this", "error", "applicant", "this", "error", "applicant", "this", "error", "this", "error", "applicant", "this", "error", "applicant", "result", "this", "error", "applicant", "result", "error", "result"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
    public static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f434106a;

        /* renamed from: b, reason: collision with root package name */
        Object f434107b;

        /* renamed from: c, reason: collision with root package name */
        Object f434108c;

        /* renamed from: d, reason: collision with root package name */
        Object f434109d;

        /* renamed from: e, reason: collision with root package name */
        Object f434110e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f434111f;

        /* renamed from: h, reason: collision with root package name */
        int f434113h;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f434111f = obj;
            this.f434113h |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRVerificationStepViewModel.this.a((CharSequence) null, this);
        }
    }

    /* compiled from: CBRVerificationStepViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.screen.verification.CBRVerificationStepViewModel", f = "CBRVerificationStepViewModel.kt", i = {2, 3}, l = {181, 183, 193, 195, 199}, m = "buildStatusState", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f434114a;

        /* renamed from: b, reason: collision with root package name */
        Object f434115b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f434116c;

        /* renamed from: e, reason: collision with root package name */
        int f434118e;

        public i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f434116c = obj;
            this.f434118e |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRVerificationStepViewModel.this.b((x) null, this);
        }
    }

    /* compiled from: CBRVerificationStepViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.screen.verification.CBRVerificationStepViewModel", f = "CBRVerificationStepViewModel.kt", i = {0, 0, 0, 0, 1, 1}, l = {155, 164}, m = "buildVerifyCodeState", n = {"this", "data", "seconds", "minutes", "this", "data"}, s = {"L$0", "L$1", "L$2", "J$0", "L$0", "L$1"})
    public static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f434119a;

        /* renamed from: b, reason: collision with root package name */
        Object f434120b;

        /* renamed from: c, reason: collision with root package name */
        Object f434121c;

        /* renamed from: d, reason: collision with root package name */
        Object f434122d;

        /* renamed from: e, reason: collision with root package name */
        Object f434123e;

        /* renamed from: f, reason: collision with root package name */
        long f434124f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f434125g;

        /* renamed from: i, reason: collision with root package name */
        int f434127i;

        public j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f434125g = obj;
            this.f434127i |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRVerificationStepViewModel.this.a((c) null, this);
        }
    }

    /* compiled from: CBRViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V", "ru/cyberity/cbr/core/presentation/base/CBRViewModel$launchOnViewModelScope$1"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.screen.verification.CBRVerificationStepViewModel$checkCode$$inlined$launchOnViewModelScope$1", f = "CBRVerificationStepViewModel.kt", i = {0, 1, 2}, l = {437, 439, 444}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$0", "L$0"})
    public static final class k extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434128a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f434129b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CBRViewModel f434130c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f434131d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ CBRVerificationStepViewModel f434132e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f434133f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f434134g;

        /* renamed from: h, reason: collision with root package name */
        Object f434135h;

        /* renamed from: i, reason: collision with root package name */
        Object f434136i;

        /* renamed from: j, reason: collision with root package name */
        Object f434137j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(CBRViewModel cBRViewModel, String str, Continuation continuation, CBRVerificationStepViewModel cBRVerificationStepViewModel, String str2, String str3) {
            super(2, continuation);
            this.f434130c = cBRViewModel;
            this.f434131d = str;
            this.f434132e = cBRVerificationStepViewModel;
            this.f434133f = str2;
            this.f434134g = str3;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((k) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            k kVar = new k(this.f434130c, this.f434131d, continuation, this.f434132e, this.f434133f, this.f434134g);
            kVar.f434129b = obj;
            return kVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x009c A[Catch: Exception -> 0x0023, CancellationException -> 0x0094, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x0094, blocks: (B:31:0x008e, B:33:0x0096, B:35:0x009c, B:26:0x0076, B:28:0x007c, B:23:0x0056), top: B:52:0x0056 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 227
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.presentation.screen.verification.CBRVerificationStepViewModel.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CBRVerificationStepViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.screen.verification.CBRVerificationStepViewModel$onPrepare$3$1", f = "CBRVerificationStepViewModel.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434138a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ x f434140c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(x xVar, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f434140c = xVar;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((l) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return CBRVerificationStepViewModel.this.new l(this.f434140c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f434138a;
            if (i12 == 0) {
                C42729a0.b(obj);
                CBRVerificationStepViewModel cBRVerificationStepViewModel = CBRVerificationStepViewModel.this;
                x xVar = this.f434140c;
                this.f434138a = 1;
                if (cBRVerificationStepViewModel.c(xVar, this) == coroutine_suspended) {
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
    }

    /* compiled from: CBRViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V", "ru/cyberity/cbr/core/presentation/base/CBRViewModel$launchOnViewModelScope$1"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.screen.verification.CBRVerificationStepViewModel$requestCode$$inlined$launchOnViewModelScope$1", f = "CBRVerificationStepViewModel.kt", i = {0, 1, 2, 3}, l = {441, 451, 453, 458}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$0", "L$0", "L$0"})
    public static final class m extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434141a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f434142b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CBRViewModel f434143c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f434144d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ CBRVerificationStepViewModel f434145e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f434146f;

        /* renamed from: g, reason: collision with root package name */
        Object f434147g;

        /* renamed from: h, reason: collision with root package name */
        Object f434148h;

        /* renamed from: i, reason: collision with root package name */
        Object f434149i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(CBRViewModel cBRViewModel, String str, Continuation continuation, CBRVerificationStepViewModel cBRVerificationStepViewModel, String str2) {
            super(2, continuation);
            this.f434143c = cBRViewModel;
            this.f434144d = str;
            this.f434145e = cBRVerificationStepViewModel;
            this.f434146f = str2;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((m) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            m mVar = new m(this.f434143c, this.f434144d, continuation, this.f434145e, this.f434146f);
            mVar.f434142b = obj;
            return mVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x00e6 A[Catch: Exception -> 0x0028, CancellationException -> 0x0141, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0141, blocks: (B:49:0x0108, B:51:0x010e, B:41:0x00e0, B:43:0x00e6), top: B:66:0x00e0 }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x010e A[Catch: Exception -> 0x0028, CancellationException -> 0x0141, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0141, blocks: (B:49:0x0108, B:51:0x010e, B:41:0x00e0, B:43:0x00e6), top: B:66:0x00e0 }] */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 352
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.presentation.screen.verification.CBRVerificationStepViewModel.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CBRVerificationStepViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.screen.verification.CBRVerificationStepViewModel$startCountdownTimer$1", f = "CBRVerificationStepViewModel.kt", i = {}, l = {286}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434150a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f434152c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(c cVar, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f434152c = cVar;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((n) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return CBRVerificationStepViewModel.this.new n(this.f434152c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            c cVarA;
            Long endTime;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f434150a;
            if (i12 == 0) {
                C42729a0.b(obj);
                CBRVerificationStepViewModel.this.a(this.f434152c);
                CBRVerificationStepViewModel.this.a(Step.VERIFY_CODE);
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            while (this.f434152c.getEndTime() != null && System.currentTimeMillis() < this.f434152c.getEndTime().longValue()) {
                CBRVerificationStepViewModel cBRVerificationStepViewModel = CBRVerificationStepViewModel.this;
                c cVarC = cBRVerificationStepViewModel.c();
                if (cVarC != null) {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    c cVarC2 = CBRVerificationStepViewModel.this.c();
                    cVarA = c.a(cVarC, null, null, null, null, null, null, s.b(timeUnit.toSeconds((cVarC2 == null || (endTime = cVarC2.getEndTime()) == null) ? 0L : endTime.longValue() - System.currentTimeMillis()), 0L), 63, null);
                } else {
                    cVarA = null;
                }
                cBRVerificationStepViewModel.a(cVarA);
                this.f434150a = 1;
                if (C43131e0.b(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            CBRVerificationStepViewModel.this.a(c.a(this.f434152c, null, null, null, null, null, null, 0L, 31, null));
            return G0.f406611a;
        }
    }

    /* compiled from: CBRVerificationStepViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.screen.verification.CBRVerificationStepViewModel", f = "CBRVerificationStepViewModel.kt", i = {0, 0, 1, 1, 2}, l = {332, 333, 335}, m = "verifyCheckCodeResponse", n = {"this", "response", "this", "response", "this"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
    public static final class o extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f434153a;

        /* renamed from: b, reason: collision with root package name */
        Object f434154b;

        /* renamed from: c, reason: collision with root package name */
        Object f434155c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f434156d;

        /* renamed from: f, reason: collision with root package name */
        int f434158f;

        public o(Continuation<? super o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f434156d = obj;
            this.f434158f |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRVerificationStepViewModel.this.c(null, this);
        }
    }

    /* compiled from: CBRVerificationStepViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.screen.verification.CBRVerificationStepViewModel$verifyCheckCodeResponse$2", f = "CBRVerificationStepViewModel.kt", i = {}, l = {317}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434159a;

        public p(Continuation<? super p> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((p) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return CBRVerificationStepViewModel.this.new p(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f434159a;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f434159a = 1;
                if (C43131e0.b(2000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            CBRVerificationStepViewModel.this.fireEvent(d.a.f434069a);
            return G0.f406611a;
        }
    }

    /* compiled from: CBRVerificationStepViewModel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u008a@"}, d2 = {"Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$Step;", "step", "", "error", "Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$c;", "countdown", "Lru/cyberity/cbr/core/data/source/applicant/remote/x;", "response", "Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$e;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.screen.verification.CBRVerificationStepViewModel$viewState$1", f = "CBRVerificationStepViewModel.kt", i = {}, l = {80, 81, 82}, m = "invokeSuspend", n = {}, s = {})
    public static final class q extends SuspendLambda implements Y41.s<Step, CharSequence, c, x, Continuation<? super e>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434161a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f434162b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f434163c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f434164d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f434165e;

        /* compiled from: CBRVerificationStepViewModel.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f434167a;

            static {
                int[] iArr = new int[Step.values().length];
                iArr[Step.INIT.ordinal()] = 1;
                iArr[Step.VERIFY_CODE.ordinal()] = 2;
                iArr[Step.STATUS.ordinal()] = 3;
                f434167a = iArr;
            }
        }

        public q(Continuation<? super q> continuation) {
            super(5, continuation);
        }

        @Override // Y41.s
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k Step step, @Y61.l CharSequence charSequence, @Y61.l c cVar, @Y61.l x xVar, @Y61.l Continuation<? super e> continuation) {
            q qVar = CBRVerificationStepViewModel.this.new q(continuation);
            qVar.f434162b = step;
            qVar.f434163c = charSequence;
            qVar.f434164d = cVar;
            qVar.f434165e = xVar;
            return qVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f434161a;
            if (i12 != 0) {
                if (i12 == 1) {
                    C42729a0.b(obj);
                    return (e) obj;
                }
                if (i12 == 2) {
                    C42729a0.b(obj);
                    return (e) obj;
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return (e) obj;
            }
            C42729a0.b(obj);
            Step step = (Step) this.f434162b;
            CharSequence charSequence = (CharSequence) this.f434163c;
            c cVar = (c) this.f434164d;
            x xVar = (x) this.f434165e;
            Logger.v$default(ru.cyberity.log.a.f436064a, "CBRVerificationStepViewModel", "prepareViewState: step=" + step, null, 4, null);
            int i13 = a.f434167a[step.ordinal()];
            if (i13 == 1) {
                CBRVerificationStepViewModel cBRVerificationStepViewModel = CBRVerificationStepViewModel.this;
                this.f434162b = null;
                this.f434163c = null;
                this.f434164d = null;
                this.f434161a = 1;
                obj = cBRVerificationStepViewModel.a(charSequence, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return (e) obj;
            }
            if (i13 == 2) {
                CBRVerificationStepViewModel cBRVerificationStepViewModel2 = CBRVerificationStepViewModel.this;
                this.f434162b = null;
                this.f434163c = null;
                this.f434164d = null;
                this.f434161a = 2;
                obj = cBRVerificationStepViewModel2.a(cVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return (e) obj;
            }
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            CBRVerificationStepViewModel cBRVerificationStepViewModel3 = CBRVerificationStepViewModel.this;
            this.f434162b = null;
            this.f434163c = null;
            this.f434164d = null;
            this.f434161a = 3;
            obj = cBRVerificationStepViewModel3.b(xVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (e) obj;
        }
    }

    /* compiled from: CBRVerificationStepViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$e;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.screen.verification.CBRVerificationStepViewModel$viewState$2", f = "CBRVerificationStepViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class r extends SuspendLambda implements Y41.q<InterfaceC43172j<? super e>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434168a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f434169b;

        public r(Continuation<? super r> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k InterfaceC43172j<? super e> interfaceC43172j, @Y61.k Throwable th2, @Y61.l Continuation<? super G0> continuation) {
            r rVar = CBRVerificationStepViewModel.this.new r(continuation);
            rVar.f434169b = th2;
            return rVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f434168a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            Throwable th2 = (Throwable) this.f434169b;
            ru.cyberity.log.a.f436064a.e(ru.cyberity.log.c.a(CBRVerificationStepViewModel.this), "Error building state: " + th2.getMessage(), th2);
            return G0.f406611a;
        }
    }

    static {
        Y y12 = new Y(CBRVerificationStepViewModel.class, "step", "getStep()Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$Step;", 0);
        n0 n0Var = m0.f406844a;
        f434045p = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(CBRVerificationStepViewModel.class, "currentError", "getCurrentError()Ljava/lang/CharSequence;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CBRVerificationStepViewModel.class, "countdown", "getCountdown()Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$CountdownData;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CBRVerificationStepViewModel.class, "codeResponse", "getCodeResponse()Lru/cyberity/cbr/core/data/source/applicant/remote/RequestCodeResponse;", 0, n0Var)};
        INSTANCE = new Companion(null);
    }

    public CBRVerificationStepViewModel(@Y61.k ValidationIdentifierType validationIdentifierType, @Y61.k ru.cyberity.cbr.core.domain.b bVar, @Y61.k ru.cyberity.cbr.core.domain.n nVar, @Y61.k ru.cyberity.cbr.core.domain.i iVar, @Y61.k ru.cyberity.cbr.core.data.source.common.a aVar, @Y61.k ru.cyberity.cbr.core.data.source.dynamic.c cVar, @Y61.k C23060r0 c23060r0) {
        super(aVar, cVar);
        this.type = validationIdentifierType;
        this.countriesUseCase = bVar;
        this.requestCodeUseCase = nVar;
        this.checkCodeUseCase = iVar;
        this.dataRepository = cVar;
        this.savedStateHandle = c23060r0;
        this.timerScope = U.a(new C43315z0(Executors.newSingleThreadExecutor()));
        Step step = Step.INIT;
        this.step = new ru.cyberity.cbr.core.presentation.screen.base.a(c23060r0, "sns_verification_step", step);
        this.currentError = new ru.cyberity.cbr.core.presentation.screen.base.a(c23060r0, "sns_verification_error", null);
        this.countdown = new ru.cyberity.cbr.core.presentation.screen.base.a(c23060r0, "sns_verification_countdown", null);
        this.codeResponse = new ru.cyberity.cbr.core.presentation.screen.base.a(c23060r0, "sns_verification_response", null);
        this.viewState = C43175k.U(new C43152f0(new A1(new InterfaceC43160i[]{c23060r0.c("sns_verification_step", step), c23060r0.c("sns_verification_error", null), c23060r0.c("sns_verification_countdown", null), c23060r0.c("sns_verification_response", null)}, new q(null)), new r(null)), androidx.view.N0.a(this), i2.a.b(i2.f411430a, 0L, 3), e.a.f434074d);
    }

    private final String e() {
        int i12 = f.f434100a[this.type.ordinal()];
        if (i12 == 1) {
            return "EMAIL_VERIFICATION";
        }
        if (i12 == 2) {
            return "PHONE_VERIFICATION";
        }
        if (i12 == 3) {
            return "TYPE_UNKNOWN";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @Y61.k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public n2<e> getViewState() {
        return this.viewState;
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @Y61.k
    public String getDocumentType() {
        Logger.v$default(ru.cyberity.log.a.f436064a, "CBRVerificationStepViewModel", "getDocumentType: step=" + this.type, null, 4, null);
        int i12 = f.f434100a[this.type.ordinal()];
        if (i12 == 1) {
            return "EMAIL_VERIFICATION";
        }
        if (i12 == 2) {
            return "PHONE_VERIFICATION";
        }
        if (i12 == 3) {
            return "TYPE_UNKNOWN";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void h() {
        a(Step.INIT);
        N0 n02 = this.countDownTimerJob;
        if (n02 != null) {
            n02.c(null);
        }
        this.countDownTimerJob = null;
        a((x) null);
        a((c) null);
        a((CharSequence) null);
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @Y61.l
    public Object onPrepare(@Y61.k Continuation<? super G0> continuation) {
        Logger.v$default(ru.cyberity.log.a.f436064a, "CBRVerificationStepViewModel", "onPrepare", null, 4, null);
        c cVarC = c();
        if (cVarC != null) {
            b(cVarC);
        }
        x xVarB = b();
        if (xVarB != null) {
            C43259k.d(androidx.view.N0.a(this), null, null, new l(xVarB, null), 3);
        }
        return G0.f406611a;
    }

    private final CharSequence d() {
        return (CharSequence) this.currentError.a(this, f434045p[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c c() {
        return (c) this.countdown.a(this, f434045p[2]);
    }

    private final x b() {
        return (x) this.codeResponse.a(this, f434045p[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(ru.cyberity.cbr.core.data.source.applicant.remote.x r21, kotlin.coroutines.Continuation<? super kotlin.G0> r22) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.presentation.screen.verification.CBRVerificationStepViewModel.c(ru.cyberity.cbr.core.data.source.applicant.remote.x, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ru.cyberity.cbr.core.data.source.applicant.remote.x r18, kotlin.coroutines.Continuation<? super ru.cyberity.cbr.core.presentation.screen.verification.CBRVerificationStepViewModel.e> r19) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.presentation.screen.verification.CBRVerificationStepViewModel.b(ru.cyberity.cbr.core.data.source.applicant.remote.x, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Step step) {
        this.step.a(this, f434045p[0], step);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(CharSequence charSequence) {
        this.currentError.a(this, f434045p[1], charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(c cVar) {
        this.countdown.a(this, f434045p[2], cVar);
    }

    private final void a(x xVar) {
        this.codeResponse.a(this, f434045p[3], xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0223 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0315 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0316  */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v46, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.CharSequence r23, kotlin.coroutines.Continuation<? super ru.cyberity.cbr.core.presentation.screen.verification.CBRVerificationStepViewModel.e> r24) {
        /*
            Method dump skipped, instructions count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.presentation.screen.verification.CBRVerificationStepViewModel.a(java.lang.CharSequence, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(c data) {
        N0 n02 = this.countDownTimerJob;
        if (n02 != null) {
            n02.c(null);
        }
        this.countDownTimerJob = C43259k.d(this.timerScope, null, null, new n(data, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ru.cyberity.cbr.core.presentation.screen.verification.CBRVerificationStepViewModel.c r18, kotlin.coroutines.Continuation<? super ru.cyberity.cbr.core.presentation.screen.verification.CBRVerificationStepViewModel.e> r19) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.presentation.screen.verification.CBRVerificationStepViewModel.a(ru.cyberity.cbr.core.presentation.screen.verification.CBRVerificationStepViewModel$c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void a(@Y61.k String id2) {
        C43259k.d(androidx.view.N0.a(this), null, null, new m(this, e(), null, this, id2), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ru.cyberity.cbr.core.data.source.applicant.remote.x r25, kotlin.coroutines.Continuation<? super ru.cyberity.cbr.core.presentation.screen.verification.CBRVerificationStepViewModel.c> r26) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.presentation.screen.verification.CBRVerificationStepViewModel.a(ru.cyberity.cbr.core.data.source.applicant.remote.x, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void a(@Y61.k String verificationId, @Y61.k String code) {
        C43259k.d(androidx.view.N0.a(this), null, null, new k(this, e(), null, this, verificationId, code), 3);
    }

    public final void a() {
        a((CharSequence) null);
    }
}
