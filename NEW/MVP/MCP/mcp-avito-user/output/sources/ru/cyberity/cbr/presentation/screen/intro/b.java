package ru.cyberity.cbr.presentation.screen.intro;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.data.model.e;
import ru.cyberity.cbr.core.data.source.dynamic.c;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.core.presentation.intro.CBRInstructionResources;
import ru.cyberity.cbr.core.presentation.intro.CBRStepInfo;

/* compiled from: CBRIntroViewModel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0014B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\rH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lru/cyberity/cbr/presentation/screen/intro/b;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "", "step", "documentType", "scene", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/dynamic/c;)V", "Lkotlin/G0;", "onPrepare", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/presentation/screen/intro/b$a;", "a", "()Lru/cyberity/cbr/presentation/screen/intro/b$a;", "Ljava/lang/String;", "b", "c", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b extends CBRViewModel<CBRViewModel.CBRViewModelState> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final String step;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final String documentType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final String scene;

    /* compiled from: CBRIntroViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/presentation/screen/intro/b$a;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements CBRViewModel.CBRViewModelState {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f434722a = new a();

        private a() {
        }
    }

    /* compiled from: CBRIntroViewModel.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/presentation/screen/intro/b$b;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "Lru/cyberity/cbr/core/presentation/intro/CBRStepInfo;", "stepInfo", "", "", "", "data", "<init>", "(Lru/cyberity/cbr/core/presentation/intro/CBRStepInfo;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Lru/cyberity/cbr/core/presentation/intro/CBRStepInfo;", "d", "()Lru/cyberity/cbr/core/presentation/intro/CBRStepInfo;", "b", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.presentation.screen.intro.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12515b implements CBRViewModel.CBRViewModelState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @k
        private final CBRStepInfo stepInfo;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @k
        private final Map<String, Object> data;

        public C12515b(@k CBRStepInfo cBRStepInfo, @k Map<String, ? extends Object> map) {
            this.stepInfo = cBRStepInfo;
            this.data = map;
        }

        @k
        public final Map<String, Object> c() {
            return this.data;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final CBRStepInfo getStepInfo() {
            return this.stepInfo;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C12515b)) {
                return false;
            }
            C12515b c12515b = (C12515b) other;
            return L.f(this.stepInfo, c12515b.stepInfo) && L.f(this.data, c12515b.data);
        }

        public int hashCode() {
            return this.data.hashCode() + (this.stepInfo.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("IntroViewState(stepInfo=");
            sb2.append(this.stepInfo);
            sb2.append(", data=");
            return r.w(sb2, this.data, ')');
        }
    }

    /* compiled from: CBRIntroViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.intro.CBRIntroViewModel$onPrepare$2", f = "CBRIntroViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<CBRViewModel.CBRViewModelState, Continuation<? super CBRViewModel.CBRViewModelState>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434725a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k CBRViewModel.CBRViewModelState cBRViewModelState, @l Continuation<? super CBRViewModel.CBRViewModelState> continuation) {
            return ((c) create(cBRViewModelState, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f434725a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            CBRStepInfo cBRStepInfo = new CBRStepInfo(b.this.step, b.this.scene, b.this.documentType);
            c.C12476c strings = b.this.getStrings();
            e config = b.this.getConfig();
            return new C12515b(cBRStepInfo, new CBRInstructionResources(strings, config != null ? config.C() : null, b.this.step, b.this.documentType, b.this.scene, false, 32, null).getInstructions());
        }
    }

    public b(@k String str, @l String str2, @k String str3, @k ru.cyberity.cbr.core.data.source.common.a aVar, @k ru.cyberity.cbr.core.data.source.dynamic.c cVar) {
        super(aVar, cVar);
        this.step = str;
        this.documentType = str2;
        this.scene = str3;
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @l
    public Object onPrepare(@k Continuation<? super G0> continuation) {
        CBRViewModel.updateState$default(this, false, new c(null), 1, null);
        return G0.f406611a;
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a getDefaultState() {
        return a.f434722a;
    }
}
