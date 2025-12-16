package ru.cyberity.cbr.presentation.screen.verification;

import androidx.compose.runtime.C22026a;
import androidx.view.N0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43135f1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import ru.cyberity.cbr.core.common.a0;
import ru.cyberity.cbr.core.common.j0;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.data.listener.CBREvent;
import ru.cyberity.cbr.core.data.listener.CBREventHandler;
import ru.cyberity.cbr.core.data.model.ApplicantStatus;
import ru.cyberity.cbr.core.data.model.Document;
import ru.cyberity.cbr.core.data.model.DocumentType;
import ru.cyberity.cbr.core.data.model.ReviewStatusType;
import ru.cyberity.cbr.core.data.model.t;
import ru.cyberity.cbr.core.data.source.dynamic.c;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.core.presentation.helper.DocumentItemsParams;
import ru.cyberity.cbr.presentation.screen.verification.d;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBRApplicantStatusViewModel.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\u0018B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000fH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\r\u0010\u0014J\u0015\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\r\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\r\u001a\u00020\u000f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001eH\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010 J;\u0010\r\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001eH\u0002¢\u0006\u0004\b\r\u0010\"J\u0017\u0010\r\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b\r\u0010%J\u001b\u0010\u0018\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020!H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010'J!\u0010\r\u001a\u00020(2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u001eH\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010)J\u0013\u0010\r\u001a\u00020*H\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0011J\u0017\u0010\r\u001a\u00020+2\u0006\u0010&\u001a\u00020!H\u0002¢\u0006\u0004\b\r\u0010,J\u0017\u0010\u0018\u001a\u00020+2\u0006\u0010&\u001a\u00020!H\u0002¢\u0006\u0004\b\u0018\u0010,J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020!H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020!H\u0002¢\u0006\u0004\b/\u0010.J\u001b\u0010\r\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020!H\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010'J\u0013\u0010\u0018\u001a\u00020+H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0011J'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00120\u001e*\b\u0012\u0004\u0012\u00020\u00120\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\r\u00100R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00101R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00102R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00103R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00104R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006>"}, d2 = {"Lru/cyberity/cbr/presentation/screen/verification/b;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel;", "Lru/cyberity/cbr/presentation/screen/verification/d;", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/domain/o;", "sendAgreementUseCase", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "Lru/cyberity/cbr/core/data/source/extensions/a;", "extensionProvider", "<init>", "(Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/domain/o;Lru/cyberity/cbr/core/data/source/dynamic/c;Lru/cyberity/cbr/core/data/source/extensions/a;)V", "a", "()Lru/cyberity/cbr/presentation/screen/verification/d;", "Lkotlin/G0;", "onPrepare", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/model/Document;", "document", "(Lru/cyberity/cbr/core/data/model/Document;)V", "", "type", "(Ljava/lang/String;)V", "b", "()V", "Lru/cyberity/cbr/core/data/model/e;", Navigation.CONFIG, "Lru/cyberity/cbr/core/data/model/g;", "applicant", "", "documents", "(Lru/cyberity/cbr/core/data/model/e;Lru/cyberity/cbr/core/data/model/g;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/presentation/helper/DocumentItemsParams;", "(Lru/cyberity/cbr/core/data/model/e;Lru/cyberity/cbr/core/data/model/g;Ljava/util/List;)Lru/cyberity/cbr/core/presentation/helper/DocumentItemsParams;", "", "exception", "(Ljava/lang/Throwable;)V", "params", "(Lru/cyberity/cbr/core/presentation/helper/DocumentItemsParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentViewItem;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/presentation/screen/verification/d$e;", "", "(Lru/cyberity/cbr/core/presentation/helper/DocumentItemsParams;)Z", "c", "(Lru/cyberity/cbr/core/presentation/helper/DocumentItemsParams;)V", "d", "(Ljava/util/List;Lru/cyberity/cbr/core/data/model/g;)Ljava/util/List;", "Lru/cyberity/cbr/core/data/source/common/a;", "Lru/cyberity/cbr/core/domain/o;", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "Lru/cyberity/cbr/core/data/source/extensions/a;", "e", "Lru/cyberity/cbr/core/data/model/g;", "f", "Ljava/util/List;", "Lru/cyberity/cbr/core/data/model/ApplicantStatus;", "g", "Lru/cyberity/cbr/core/data/model/ApplicantStatus;", "applicantStatus", "h", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b extends CBRViewModel<ru.cyberity.cbr.presentation.screen.verification.d> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.common.a commonRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.domain.o sendAgreementUseCase;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.dynamic.c dataRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.extensions.a extensionProvider;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private ru.cyberity.cbr.core.data.model.g applicant;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private List<Document> documents;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private ApplicantStatus applicantStatus;

    /* compiled from: CBRApplicantStatusViewModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/cyberity/cbr/presentation/screen/verification/b$b;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "", "text", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.presentation.screen.verification.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12539b implements CBRViewModel.CBRViewModelEvent {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final String text;

        public C12539b(@Y61.k String str) {
            this.text = str;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof C12539b) && L.f(this.text, ((C12539b) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        @Y61.k
        public String toString() {
            return C22026a.c(new StringBuilder("ShowAgreementEvent(text="), this.text, ')');
        }
    }

    /* compiled from: CBRApplicantStatusViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f435520a;

        static {
            int[] iArr = new int[ReviewStatusType.values().length];
            iArr[ReviewStatusType.Completed.ordinal()] = 1;
            iArr[ReviewStatusType.Queued.ordinal()] = 2;
            iArr[ReviewStatusType.Pending.ordinal()] = 3;
            f435520a = iArr;
        }
    }

    /* compiled from: CBRApplicantStatusViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.verification.CBRApplicantStatusViewModel", f = "CBRApplicantStatusViewModel.kt", i = {0, 0, 1, 1, 2, 2, 3, 4}, l = {356, 357, 359, 369, 370, 371}, m = "buildVideoIdentState", n = {"this", "resources", "this", "resources", "this", "resources", "this", "this"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0"})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f435521a;

        /* renamed from: b, reason: collision with root package name */
        Object f435522b;

        /* renamed from: c, reason: collision with root package name */
        Object f435523c;

        /* renamed from: d, reason: collision with root package name */
        Object f435524d;

        /* renamed from: e, reason: collision with root package name */
        Object f435525e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f435526f;

        /* renamed from: h, reason: collision with root package name */
        int f435528h;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f435526f = obj;
            this.f435528h |= BeduinInputModel.MIN_TEXT_VERSION;
            return b.this.a(this);
        }
    }

    /* compiled from: CBRApplicantStatusViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.verification.CBRApplicantStatusViewModel", f = "CBRApplicantStatusViewModel.kt", i = {}, l = {108, 111}, m = "checkDocuments", n = {}, s = {})
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f435529a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f435530b;

        /* renamed from: d, reason: collision with root package name */
        int f435532d;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f435530b = obj;
            this.f435532d |= BeduinInputModel.MIN_TEXT_VERSION;
            return b.this.a(null, null, null, this);
        }
    }

    /* compiled from: CBRApplicantStatusViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.verification.CBRApplicantStatusViewModel", f = "CBRApplicantStatusViewModel.kt", i = {0, 0, 1}, l = {336, 337}, m = "createVideoIdentificationViewItem", n = {"this", "documents", "documents"}, s = {"L$0", "L$1", "L$0"})
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f435533a;

        /* renamed from: b, reason: collision with root package name */
        Object f435534b;

        /* renamed from: c, reason: collision with root package name */
        Object f435535c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f435536d;

        /* renamed from: f, reason: collision with root package name */
        int f435538f;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f435536d = obj;
            this.f435538f |= BeduinInputModel.MIN_TEXT_VERSION;
            return b.this.a((List<Document>) null, this);
        }
    }

    /* compiled from: CBRApplicantStatusViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.verification.CBRApplicantStatusViewModel$onContinueClicked$1", f = "CBRApplicantStatusViewModel.kt", i = {}, l = {520, 521, 522, 524}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f435539a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ru.cyberity.cbr.core.data.model.g f435541c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ru.cyberity.cbr.core.data.model.g gVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f435541c = gVar;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new g(this.f435541c, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f435539a
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L31
                if (r1 == r5) goto L2d
                if (r1 == r4) goto L29
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                kotlin.C42729a0.b(r7)
                goto L97
            L19:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L21:
                kotlin.C42729a0.b(r7)
                kotlin.Z r7 = (kotlin.Z) r7
                java.lang.Object r7 = r7.f406625b
                goto L7a
            L29:
                kotlin.C42729a0.b(r7)
                goto L52
            L2d:
                kotlin.C42729a0.b(r7)
                goto L3f
            L31:
                kotlin.C42729a0.b(r7)
                ru.cyberity.cbr.presentation.screen.verification.b r7 = ru.cyberity.cbr.presentation.screen.verification.b.this
                r6.f435539a = r5
                java.lang.Object r7 = ru.cyberity.cbr.presentation.screen.verification.b.c(r7, r6)
                if (r7 != r0) goto L3f
                return r0
            L3f:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 != 0) goto L97
                ru.cyberity.cbr.presentation.screen.verification.b r7 = ru.cyberity.cbr.presentation.screen.verification.b.this
                r6.f435539a = r4
                java.lang.Object r7 = ru.cyberity.cbr.presentation.screen.verification.b.b(r7, r6)
                if (r7 != r0) goto L52
                return r0
            L52:
                ru.cyberity.cbr.core.data.source.dynamic.c$c r7 = (ru.cyberity.cbr.core.data.source.dynamic.c.C12476c) r7
                java.util.List r7 = r7.c()
                if (r7 == 0) goto L94
                java.lang.Object r7 = kotlin.collections.C42745f0.G(r7)
                ru.cyberity.cbr.core.data.model.d r7 = (ru.cyberity.cbr.core.data.model.d) r7
                if (r7 == 0) goto L94
                ru.cyberity.cbr.core.data.model.b r7 = r7.getAgreement()
                if (r7 != 0) goto L69
                goto L94
            L69:
                ru.cyberity.cbr.presentation.screen.verification.b r1 = ru.cyberity.cbr.presentation.screen.verification.b.this
                ru.cyberity.cbr.core.domain.o r1 = ru.cyberity.cbr.presentation.screen.verification.b.b(r1)
                ru.cyberity.cbr.core.data.model.g r4 = r6.f435541c
                r6.f435539a = r3
                java.lang.Object r7 = r1.a(r4, r7, r6)
                if (r7 != r0) goto L7a
                return r0
            L7a:
                int r1 = kotlin.Z.f406624c
                boolean r1 = r7 instanceof kotlin.Z.b
                if (r1 == 0) goto L81
                r7 = 0
            L81:
                ru.cyberity.cbr.core.data.model.g r7 = (ru.cyberity.cbr.core.data.model.g) r7
                if (r7 == 0) goto L97
                ru.cyberity.cbr.presentation.screen.verification.b r1 = ru.cyberity.cbr.presentation.screen.verification.b.this
                ru.cyberity.cbr.core.data.source.dynamic.c r1 = ru.cyberity.cbr.presentation.screen.verification.b.a(r1)
                r6.f435539a = r2
                java.lang.Object r7 = r1.a(r7, r6)
                if (r7 != r0) goto L97
                return r0
            L94:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            L97:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.verification.b.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CBRApplicantStatusViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/Document;", "it", "", "a", "(Lru/cyberity/cbr/core/data/model/Document;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 1})
    public static final class h extends N implements Y41.l<Document, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final h f435542a = new h();

        public h() {
            super(1);
        }

        @Override // Y41.l
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@Y61.k Document document) {
            return document.getType().getValue();
        }
    }

    /* compiled from: CBRApplicantStatusViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.verification.CBRApplicantStatusViewModel$onPrepare$2", f = "CBRApplicantStatusViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f435543a;

        /* compiled from: CBRApplicantStatusViewModel.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/source/dynamic/c$a;", "data", "Lkotlin/G0;", "<anonymous>", "(Lru/cyberity/cbr/core/data/source/dynamic/c$a;)V"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.verification.CBRApplicantStatusViewModel$onPrepare$2$1", f = "CBRApplicantStatusViewModel.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<c.a, Continuation<? super G0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f435545a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f435546b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f435547c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f435547c = bVar;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.l c.a aVar, @Y61.l Continuation<? super G0> continuation) {
                return ((a) create(aVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f435547c, continuation);
                aVar.f435546b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                List<Document> listD;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f435545a;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    c.a aVar = (c.a) this.f435546b;
                    Logger.v$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this.f435547c), "Data repo updated", null, 4, null);
                    List<Document> listB0 = null;
                    Throwable thK = aVar != null ? aVar.k() : null;
                    if (thK != null) {
                        if (this.f435547c.currentState() instanceof d.b) {
                            this.f435547c.a(thK);
                        }
                        return G0.f406611a;
                    }
                    if (aVar == null) {
                        return G0.f406611a;
                    }
                    ru.cyberity.cbr.core.data.model.g gVarD = aVar.g().d();
                    b bVar = this.f435547c;
                    ru.cyberity.cbr.core.data.model.e eVarD = aVar.i().d();
                    t tVarD = aVar.j().d();
                    if (tVarD != null && (listD = tVarD.d()) != null && (gVarD == null || (listB0 = C42745f0.B0(listD, new ru.cyberity.cbr.core.data.model.n(gVarD))) == null)) {
                        listB0 = listD;
                    }
                    this.f435545a = 1;
                    if (bVar.a(eVarD, gVarD, listB0, this) == coroutine_suspended) {
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

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((i) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new i(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f435543a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            j0.b(b.this.dataRepository.b(), N0.a(b.this), new a(b.this, null));
            return G0.f406611a;
        }
    }

    /* compiled from: CBRApplicantStatusViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.verification.CBRApplicantStatusViewModel$onTermsLinksClicked$1", f = "CBRApplicantStatusViewModel.kt", i = {0, 1, 1, 2, 2, 3, 3}, l = {481, 482, 491, 492}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "html", "$this$launch", "agreement", "$this$launch", "html"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class j extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f435548a;

        /* renamed from: b, reason: collision with root package name */
        int f435549b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f435550c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f435551d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b f435552e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, b bVar, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f435551d = str;
            this.f435552e = bVar;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((j) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            j jVar = new j(this.f435551d, this.f435552e, continuation);
            jVar.f435550c = obj;
            return jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:110:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x009b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00aa A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:9:0x001e, B:86:0x012c, B:90:0x0134, B:92:0x013a, B:95:0x0142, B:97:0x0148, B:19:0x0043, B:45:0x009e, B:49:0x00a4, B:51:0x00aa, B:52:0x00b6, B:54:0x00bc, B:22:0x004b, B:38:0x0086, B:41:0x008b, B:25:0x0057, B:102:0x0165, B:32:0x006d, B:35:0x0077, B:55:0x00c3, B:58:0x00cd, B:60:0x00d9, B:62:0x00e1, B:65:0x00e9, B:67:0x00ef, B:99:0x0155, B:101:0x015d), top: B:107:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00b6 A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:9:0x001e, B:86:0x012c, B:90:0x0134, B:92:0x013a, B:95:0x0142, B:97:0x0148, B:19:0x0043, B:45:0x009e, B:49:0x00a4, B:51:0x00aa, B:52:0x00b6, B:54:0x00bc, B:22:0x004b, B:38:0x0086, B:41:0x008b, B:25:0x0057, B:102:0x0165, B:32:0x006d, B:35:0x0077, B:55:0x00c3, B:58:0x00cd, B:60:0x00d9, B:62:0x00e1, B:65:0x00e9, B:67:0x00ef, B:99:0x0155, B:101:0x015d), top: B:107:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x012a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x012b  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x013a A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:9:0x001e, B:86:0x012c, B:90:0x0134, B:92:0x013a, B:95:0x0142, B:97:0x0148, B:19:0x0043, B:45:0x009e, B:49:0x00a4, B:51:0x00aa, B:52:0x00b6, B:54:0x00bc, B:22:0x004b, B:38:0x0086, B:41:0x008b, B:25:0x0057, B:102:0x0165, B:32:0x006d, B:35:0x0077, B:55:0x00c3, B:58:0x00cd, B:60:0x00d9, B:62:0x00e1, B:65:0x00e9, B:67:0x00ef, B:99:0x0155, B:101:0x015d), top: B:107:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0142 A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:9:0x001e, B:86:0x012c, B:90:0x0134, B:92:0x013a, B:95:0x0142, B:97:0x0148, B:19:0x0043, B:45:0x009e, B:49:0x00a4, B:51:0x00aa, B:52:0x00b6, B:54:0x00bc, B:22:0x004b, B:38:0x0086, B:41:0x008b, B:25:0x0057, B:102:0x0165, B:32:0x006d, B:35:0x0077, B:55:0x00c3, B:58:0x00cd, B:60:0x00d9, B:62:0x00e1, B:65:0x00e9, B:67:0x00ef, B:99:0x0155, B:101:0x015d), top: B:107:0x000c }] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 396
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.verification.b.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CBRApplicantStatusViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/verification/d;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.verification.CBRApplicantStatusViewModel$showInitialStatus$2", f = "CBRApplicantStatusViewModel.kt", i = {}, l = {439, 442, 443, 444, 445, 447, 452}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Y41.p<ru.cyberity.cbr.presentation.screen.verification.d, Continuation<? super ru.cyberity.cbr.presentation.screen.verification.d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f435553a;

        /* renamed from: b, reason: collision with root package name */
        Object f435554b;

        /* renamed from: c, reason: collision with root package name */
        Object f435555c;

        /* renamed from: d, reason: collision with root package name */
        Object f435556d;

        /* renamed from: e, reason: collision with root package name */
        int f435557e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ DocumentItemsParams f435558f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ b f435559g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(DocumentItemsParams documentItemsParams, b bVar, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f435558f = documentItemsParams;
            this.f435559g = bVar;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k ru.cyberity.cbr.presentation.screen.verification.d dVar, @Y61.l Continuation<? super ru.cyberity.cbr.presentation.screen.verification.d> continuation) {
            return ((k) create(dVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new k(this.f435558f, this.f435559g, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00af A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00c1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x012a A[LOOP:0: B:41:0x0124->B:43:0x012a, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0164 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0165  */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.CharSequence] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 392
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.verification.b.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CBRApplicantStatusViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.verification.CBRApplicantStatusViewModel", f = "CBRApplicantStatusViewModel.kt", i = {0, 1, 2, 2, 3, 4, 4, 5, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 14, 15, 15, 15, 16, 16, 16}, l = {188, 192, 199, 203, 212, JfifUtil.MARKER_SOI, 220, 224, JfifUtil.MARKER_APP1, 226, 265, 290, 291, 292, 300, 301, 302}, m = "showReviewedStatus", n = {"this", "this", "this", "applicant", "this", "this", "applicant", "this", "this", "this", "params", "applicant", "this", "params", "applicant", "this", "params", "applicant", "this", "applicant", VoiceInfo.STATE, "docViewItems", "this", "params", "documents", "this", "params", "documents", "this", "params", "documents", "this", "params", "documents", "this", "params", "documents", "this", "params", "documents"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$0", "L$1", "L$0", "L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$3", "L$7", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    public static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f435560a;

        /* renamed from: b, reason: collision with root package name */
        Object f435561b;

        /* renamed from: c, reason: collision with root package name */
        Object f435562c;

        /* renamed from: d, reason: collision with root package name */
        Object f435563d;

        /* renamed from: e, reason: collision with root package name */
        Object f435564e;

        /* renamed from: f, reason: collision with root package name */
        Object f435565f;

        /* renamed from: g, reason: collision with root package name */
        Object f435566g;

        /* renamed from: h, reason: collision with root package name */
        Object f435567h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f435568i;

        /* renamed from: k, reason: collision with root package name */
        int f435570k;

        public l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f435568i = obj;
            this.f435570k |= BeduinInputModel.MIN_TEXT_VERSION;
            return b.this.b((DocumentItemsParams) null, this);
        }
    }

    /* compiled from: CBRApplicantStatusViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/verification/d;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.verification.CBRApplicantStatusViewModel$showReviewedStatus$2", f = "CBRApplicantStatusViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Y41.p<ru.cyberity.cbr.presentation.screen.verification.d, Continuation<? super ru.cyberity.cbr.presentation.screen.verification.d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f435571a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ru.cyberity.cbr.presentation.screen.verification.d f435572b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ru.cyberity.cbr.presentation.screen.verification.d dVar, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f435572b = dVar;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k ru.cyberity.cbr.presentation.screen.verification.d dVar, @Y61.l Continuation<? super ru.cyberity.cbr.presentation.screen.verification.d> continuation) {
            return ((m) create(dVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new m(this.f435572b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f435571a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return this.f435572b;
        }
    }

    /* compiled from: CBRApplicantStatusViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/verification/d;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.verification.CBRApplicantStatusViewModel$showReviewingStatus$1", f = "CBRApplicantStatusViewModel.kt", i = {}, l = {399, 402, 403, 404}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Y41.p<ru.cyberity.cbr.presentation.screen.verification.d, Continuation<? super ru.cyberity.cbr.presentation.screen.verification.d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f435573a;

        /* renamed from: b, reason: collision with root package name */
        Object f435574b;

        /* renamed from: c, reason: collision with root package name */
        int f435575c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ DocumentItemsParams f435577e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(DocumentItemsParams documentItemsParams, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f435577e = documentItemsParams;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k ru.cyberity.cbr.presentation.screen.verification.d dVar, @Y61.l Continuation<? super ru.cyberity.cbr.presentation.screen.verification.d> continuation) {
            return ((n) create(dVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new n(this.f435577e, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x007e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00c2 A[LOOP:0: B:31:0x00bc->B:33:0x00c2, LOOP_END] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 231
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.verification.b.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CBRApplicantStatusViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/verification/d;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.verification.CBRApplicantStatusViewModel$showSubmittingStatus$1", f = "CBRApplicantStatusViewModel.kt", i = {}, l = {419, 422, 423, 424, 428}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements Y41.p<ru.cyberity.cbr.presentation.screen.verification.d, Continuation<? super ru.cyberity.cbr.presentation.screen.verification.d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f435578a;

        /* renamed from: b, reason: collision with root package name */
        Object f435579b;

        /* renamed from: c, reason: collision with root package name */
        Object f435580c;

        /* renamed from: d, reason: collision with root package name */
        Object f435581d;

        /* renamed from: e, reason: collision with root package name */
        int f435582e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ DocumentItemsParams f435583f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ b f435584g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(DocumentItemsParams documentItemsParams, b bVar, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f435583f = documentItemsParams;
            this.f435584g = bVar;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k ru.cyberity.cbr.presentation.screen.verification.d dVar, @Y61.l Continuation<? super ru.cyberity.cbr.presentation.screen.verification.d> continuation) {
            return ((o) create(dVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new o(this.f435583f, this.f435584g, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:26:0x009a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e0 A[LOOP:0: B:32:0x00da->B:34:0x00e0, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x011d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x011e  */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 315
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.verification.b.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CBRApplicantStatusViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.verification.CBRApplicantStatusViewModel", f = "CBRApplicantStatusViewModel.kt", i = {0}, l = {460, 461}, m = "skipAgreementSigning", n = {"this"}, s = {"L$0"})
    public static final class p extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f435585a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f435586b;

        /* renamed from: d, reason: collision with root package name */
        int f435588d;

        public p(Continuation<? super p> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f435586b = obj;
            this.f435588d |= BeduinInputModel.MIN_TEXT_VERSION;
            return b.this.b(this);
        }
    }

    public b(@Y61.k ru.cyberity.cbr.core.data.source.common.a aVar, @Y61.k ru.cyberity.cbr.core.domain.o oVar, @Y61.k ru.cyberity.cbr.core.data.source.dynamic.c cVar, @Y61.k ru.cyberity.cbr.core.data.source.extensions.a aVar2) {
        super(aVar, cVar);
        this.commonRepository = aVar;
        this.sendAgreementUseCase = oVar;
        this.dataRepository = cVar;
        this.extensionProvider = aVar2;
    }

    private final void d(DocumentItemsParams params) {
        Logger.i$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "ShowSubmittingStatus " + params, null, 4, null);
        showProgress(false);
        CBRViewModel.updateState$default(this, false, new o(params, this, null), 1, null);
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @Y61.l
    public Object onPrepare(@Y61.k Continuation<? super G0> continuation) {
        C43259k.d(N0.a(this), null, null, new i(null), 3);
        return G0.f406611a;
    }

    private final void c(DocumentItemsParams params) {
        Logger.i$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "ShowReviewingStatus " + params, null, 4, null);
        showProgress(false);
        CBRViewModel.updateState$default(this, false, new n(params, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x04ef, code lost:
    
        if (r1 != null) goto L228;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x052b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0581 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x059b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0602 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x061f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0652 A[LOOP:0: B:283:0x064c->B:285:0x0652, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x023b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0298 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02e0 A[LOOP:2: B:96:0x02da->B:98:0x02e0, LOOP_END] */
    /* JADX WARN: Type inference failed for: r1v51, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v81, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ru.cyberity.cbr.core.presentation.helper.DocumentItemsParams r28, kotlin.coroutines.Continuation<? super kotlin.G0> r29) {
        /*
            Method dump skipped, instructions count: 1802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.verification.b.b(ru.cyberity.cbr.core.presentation.helper.DocumentItemsParams, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @Y61.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ru.cyberity.cbr.presentation.screen.verification.d getDefaultState() {
        return ru.cyberity.cbr.presentation.screen.verification.d.INSTANCE.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ru.cyberity.cbr.core.data.model.e r12, ru.cyberity.cbr.core.data.model.g r13, java.util.List<ru.cyberity.cbr.core.data.model.Document> r14, kotlin.coroutines.Continuation<? super kotlin.G0> r15) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.verification.b.a(ru.cyberity.cbr.core.data.model.e, ru.cyberity.cbr.core.data.model.g, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final ru.cyberity.cbr.core.presentation.helper.DocumentItemsParams a(ru.cyberity.cbr.core.data.model.e r11, ru.cyberity.cbr.core.data.model.g r12, java.util.List<ru.cyberity.cbr.core.data.model.Document> r13) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.verification.b.a(ru.cyberity.cbr.core.data.model.e, ru.cyberity.cbr.core.data.model.g, java.util.List):ru.cyberity.cbr.core.presentation.helper.DocumentItemsParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Throwable exception) {
        ru.cyberity.log.a.f436064a.e(ru.cyberity.log.c.a(this), "Error when getting data...", exception);
        CBRViewModel.throwError$default(this, exception, "TYPE_UNKNOWN", null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List<ru.cyberity.cbr.core.data.model.Document> r11, kotlin.coroutines.Continuation<? super ru.cyberity.cbr.core.presentation.base.adapter.CBRDocumentViewItem> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof ru.cyberity.cbr.presentation.screen.verification.b.f
            if (r0 == 0) goto L13
            r0 = r12
            ru.cyberity.cbr.presentation.screen.verification.b$f r0 = (ru.cyberity.cbr.presentation.screen.verification.b.f) r0
            int r1 = r0.f435538f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f435538f = r1
            goto L18
        L13:
            ru.cyberity.cbr.presentation.screen.verification.b$f r0 = new ru.cyberity.cbr.presentation.screen.verification.b$f
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f435536d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f435538f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L55
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r11 = r0.f435535c
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.Object r1 = r0.f435534b
            ru.cyberity.cbr.core.widget.CBRStepState r1 = (ru.cyberity.cbr.core.widget.CBRStepState) r1
            java.lang.Object r0 = r0.f435533a
            java.util.List r0 = (java.util.List) r0
            kotlin.C42729a0.b(r12)
            r5 = r11
            r4 = r1
            goto L8a
        L3a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L42:
            java.lang.Object r11 = r0.f435535c
            ru.cyberity.cbr.core.widget.CBRStepState r11 = (ru.cyberity.cbr.core.widget.CBRStepState) r11
            java.lang.Object r2 = r0.f435534b
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r0.f435533a
            ru.cyberity.cbr.presentation.screen.verification.b r4 = (ru.cyberity.cbr.presentation.screen.verification.b) r4
            kotlin.C42729a0.b(r12)
            r9 = r2
            r2 = r11
            r11 = r9
            goto L6f
        L55:
            kotlin.C42729a0.b(r12)
            ru.cyberity.cbr.core.widget.CBRStepState r12 = ru.cyberity.cbr.core.widget.CBRStepState.REJECTED
            r0.f435533a = r10
            r0.f435534b = r11
            r0.f435535c = r12
            r0.f435538f = r4
            java.lang.String r2 = "sns_step_VIDEO_IDENT_title"
            java.lang.Object r2 = r10.getString(r2, r0)
            if (r2 != r1) goto L6b
            return r1
        L6b:
            r4 = r10
            r9 = r2
            r2 = r12
            r12 = r9
        L6f:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L75
            java.lang.String r12 = ""
        L75:
            r0.f435533a = r11
            r0.f435534b = r2
            r0.f435535c = r12
            r0.f435538f = r3
            java.lang.String r3 = "sns_iddoc_status_notSubmitted"
            java.lang.Object r0 = r4.getString(r3, r0)
            if (r0 != r1) goto L86
            return r1
        L86:
            r5 = r12
            r12 = r0
            r4 = r2
            r0 = r11
        L8a:
            r6 = r12
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            ru.cyberity.cbr.core.presentation.base.adapter.CBRDocumentViewTypeInfo r8 = new ru.cyberity.cbr.core.presentation.base.adapter.CBRDocumentViewTypeInfo
            ru.cyberity.cbr.core.presentation.base.adapter.CBRDocumentViewTypeInfo$Type r11 = ru.cyberity.cbr.core.presentation.base.adapter.CBRDocumentViewTypeInfo.Type.VIDEO_IDENTIFICATION
            java.lang.Object r12 = kotlin.collections.C42745f0.E(r0)
            ru.cyberity.cbr.core.data.model.Document r12 = (ru.cyberity.cbr.core.data.model.Document) r12
            r8.<init>(r11, r12)
            ru.cyberity.cbr.core.presentation.base.adapter.CBRDocumentViewItem r11 = new ru.cyberity.cbr.core.presentation.base.adapter.CBRDocumentViewItem
            r7 = 1
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.verification.b.a(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0144 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation<? super ru.cyberity.cbr.presentation.screen.verification.d.e> r14) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.verification.b.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a(DocumentItemsParams params) {
        List<String> listJ;
        List<Document> documents = params.getDocuments();
        ArrayList arrayList = new ArrayList();
        for (Object obj : documents) {
            Document document = (Document) obj;
            if (params.getApplicant().getRequiredIdDocs().getVideoIdent() && ((listJ = params.getApplicant().getRequiredIdDocs().j()) == null || !listJ.contains(document.getType().getValue()))) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((Document) it.next()).isSubmitted()) {
                    return true;
                }
            }
        }
        return false;
    }

    private final Object a(DocumentItemsParams documentItemsParams, Continuation<? super G0> continuation) {
        Logger.i$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "ShowInitialStatus " + documentItemsParams, null, 4, null);
        showProgress(false);
        CBRViewModel.updateState$default(this, false, new k(documentItemsParams, this, null), 1, null);
        return G0.f406611a;
    }

    public final void a(@Y61.k Document document) {
        Logger.v$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "onDocumentClick: " + document, null, 4, null);
        fireEvent(new CBRViewModel.ShowDocumentEvent(document));
    }

    public final void a(@Y61.k String type) {
        C43259k.d(N0.a(this), null, null, new j(type, this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Document> a(List<Document> list, ru.cyberity.cbr.core.data.model.g gVar) {
        ArrayList arrayList = new ArrayList();
        Document document = null;
        for (Document document2 : list) {
            if (!gVar.a(document2.getType().getValue())) {
                arrayList.add(document2);
            } else if (document == null) {
                document = new Document(new DocumentType("VIDEO_IDENT"), document2.getResult());
            } else if (document2.isRejected() || ((document.isReviewing() && !document2.isReviewing()) || (document.isApproved() && !document2.isApproved()))) {
                document = Document.copy$default(document, null, document2.getResult(), 1, null);
            }
        }
        if (document != null) {
            arrayList.add(document);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b(DocumentItemsParams params) {
        if (params.getApplicant().getRequiredIdDocs().getVideoIdent()) {
            List<Document> documents = params.getDocuments();
            ArrayList arrayList = new ArrayList();
            for (Object obj : documents) {
                Document document = (Document) obj;
                List<String> listJ = params.getApplicant().getRequiredIdDocs().j();
                if (listJ != null && listJ.contains(document.getType().getValue())) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return true;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((Document) it.next()).isSubmitted()) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation<? super java.lang.Boolean> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof ru.cyberity.cbr.presentation.screen.verification.b.p
            if (r0 == 0) goto L13
            r0 = r11
            ru.cyberity.cbr.presentation.screen.verification.b$p r0 = (ru.cyberity.cbr.presentation.screen.verification.b.p) r0
            int r1 = r0.f435588d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f435588d = r1
            goto L18
        L13:
            ru.cyberity.cbr.presentation.screen.verification.b$p r0 = new ru.cyberity.cbr.presentation.screen.verification.b$p
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f435586b
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f435588d
            r8 = 2
            r9 = 1
            if (r1 == 0) goto L3c
            if (r1 == r9) goto L34
            if (r1 != r8) goto L2c
            kotlin.C42729a0.b(r11)
            goto L7c
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L34:
            java.lang.Object r1 = r0.f435585a
            ru.cyberity.cbr.presentation.screen.verification.b r1 = (ru.cyberity.cbr.presentation.screen.verification.b) r1
            kotlin.C42729a0.b(r11)
            goto L5e
        L3c:
            kotlin.C42729a0.b(r11)
            ru.cyberity.ff.a r11 = ru.cyberity.ff.a.f435638a
            ru.cyberity.ff.core.a r11 = r11.r()
            boolean r11 = r11.g()
            if (r11 != 0) goto L91
            ru.cyberity.cbr.core.data.source.dynamic.c r1 = r10.dataRepository
            r0.f435585a = r10
            r0.f435588d = r9
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = r0
            java.lang.Object r11 = ru.cyberity.cbr.core.data.source.dynamic.c.c(r1, r2, r3, r4, r5, r6)
            if (r11 != r7) goto L5d
            return r7
        L5d:
            r1 = r10
        L5e:
            ru.cyberity.cbr.core.data.source.dynamic.a r11 = (ru.cyberity.cbr.core.data.source.dynamic.a) r11
            java.lang.Object r11 = r11.d()
            ru.cyberity.cbr.core.data.model.g r11 = (ru.cyberity.cbr.core.data.model.g) r11
            r2 = 0
            if (r11 == 0) goto L6e
            ru.cyberity.cbr.core.data.model.b r11 = r11.getAgreement()
            goto L6f
        L6e:
            r11 = r2
        L6f:
            if (r11 != 0) goto L91
            r0.f435585a = r2
            r0.f435588d = r8
            java.lang.Object r11 = r1.getStrings(r0)
            if (r11 != r7) goto L7c
            return r7
        L7c:
            ru.cyberity.cbr.core.data.source.dynamic.c$c r11 = (ru.cyberity.cbr.core.data.source.dynamic.c.C12476c) r11
            java.util.List r11 = r11.c()
            r0 = 0
            if (r11 == 0) goto L8a
            int r11 = r11.size()
            goto L8b
        L8a:
            r11 = r0
        L8b:
            if (r11 > r9) goto L91
            if (r11 != 0) goto L90
            goto L91
        L90:
            r9 = r0
        L91:
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.verification.b.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b() {
        ApplicantStatus applicantStatus = this.applicantStatus;
        if (applicantStatus == null) {
            return;
        }
        if (applicantStatus == ApplicantStatus.Submitting) {
            CBRViewModel.finish$default(this, new a0.b(false, 1, null), null, null, 6, null);
            return;
        }
        CBREventHandler eventHandler = n0.f432787a.getEventHandler();
        if (eventHandler != null) {
            eventHandler.onEvent(CBREvent.UserStartedVerification.INSTANCE);
        }
        ru.cyberity.cbr.core.data.model.g gVar = this.applicant;
        if (gVar == null) {
            return;
        }
        CBRViewModel.finish$default(this, new a0.b(false, 1, null), null, null, 6, null);
        C43259k.d(N0.a(this), C43135f1.f411090b, null, new g(gVar, null), 2);
    }
}
