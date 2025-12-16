package ru.cyberity.cbr.presentation.screen.preview;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.view.C23060r0;
import androidx.view.N0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import ru.cyberity.cbr.core.data.model.Document;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.presentation.screen.preview.b.a;

/* compiled from: CBRBaseDocumentPreviewViewModel.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 F*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004\u00131 7B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0013\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0013\u0010\u0017J1\u0010\u0013\u001a\u00020\u00102\u001c\u0010\u001b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0018H\u0084@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u001cJ0\u0010\u0013\u001a\u00020\u00102\u001c\u0010\u001b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0018H\u0004ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b\u0013\u0010$J'\u0010\u0013\u001a\u00020\u00102\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010)J#\u0010\u0013\u001a\u00020\u00102\u0006\u0010+\u001a\u00020*2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001aH\u0004¢\u0006\u0004\b\u0013\u0010-R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0013\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\t\u001a\u00020\b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103R\u001a\u0010\u000b\u001a\u00020\n8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b \u00104\u001a\u0004\b5\u00106R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R/\u0010<\u001a\u0004\u0018\u00010\u001e2\b\u00109\u001a\u0004\u0018\u00010\u001e8D@DX\u0084\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010:\u001a\u0004\b7\u0010;\"\u0004\b\u0013\u0010!R6\u0010B\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0018\u00010=j\u0004\u0018\u0001`>8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b/\u0010?\u001a\u0004\b \u0010@\"\u0004\b\u0013\u0010AR6\u0010E\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0018\u00010=j\u0004\u0018\u0001`>8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bC\u0010?\u001a\u0004\bD\u0010@\"\u0004\b1\u0010AR+\u0010\u001f\u001a\u00020\u001e2\u0006\u00109\u001a\u00020\u001e8D@DX\u0084\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010:\u001a\u0004\bC\u0010;\"\u0004\b1\u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006G"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/b;", "Lru/cyberity/cbr/presentation/screen/preview/b$a;", "S", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel;", "Lru/cyberity/cbr/core/data/model/Document;", "document", "Landroidx/lifecycle/r0;", "savedStateHandle", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "Lru/cyberity/cbr/core/domain/b;", "countriesUseCase", "<init>", "(Lru/cyberity/cbr/core/data/model/Document;Landroidx/lifecycle/r0;Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/dynamic/c;Lru/cyberity/cbr/core/domain/b;)V", "Lkotlin/G0;", "onLoad", "()V", "a", "(Lru/cyberity/cbr/core/data/model/Document;)V", "", "show", "(Z)V", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "(LY41/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(LY41/l;)V", "", "idDocType", "c", "(Ljava/lang/String;)V", "Lru/cyberity/cbr/core/domain/c;", "countriesResultData", "(Lru/cyberity/cbr/core/domain/c;)V", "Lru/cyberity/cbr/core/data/model/g;", "applicant", "Lru/cyberity/cbr/core/data/model/e;", Navigation.CONFIG, "(Lru/cyberity/cbr/core/data/model/g;Lru/cyberity/cbr/core/data/model/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "exception", "payload", "(Ljava/lang/Throwable;Ljava/lang/Object;)V", "Lru/cyberity/cbr/core/data/model/Document;", "f", "()Lru/cyberity/cbr/core/data/model/Document;", "b", "Lru/cyberity/cbr/core/data/source/common/a;", "()Lru/cyberity/cbr/core/data/source/common/a;", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "e", "()Lru/cyberity/cbr/core/data/source/dynamic/c;", "d", "Lru/cyberity/cbr/core/domain/b;", "<set-?>", "Lru/cyberity/cbr/core/presentation/screen/base/a;", "()Ljava/lang/String;", "country", "", "Lru/cyberity/cbr/core/data/model/CountryCodeToNameMap;", "Ljava/util/Map;", "()Ljava/util/Map;", "(Ljava/util/Map;)V", "countries", "g", "h", "includedCountries", "i", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public abstract class b<S extends a> extends CBRViewModel<S> {

    /* renamed from: j, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f434821j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final Document document;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.data.source.common.a commonRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.data.source.dynamic.c dataRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.domain.b countriesUseCase;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.presentation.screen.base.a country;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private Map<String, String> countries;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    private Map<String, String> includedCountries;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.presentation.screen.base.a idDocType;

    /* compiled from: CBRBaseDocumentPreviewViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/b$a;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static class a implements CBRViewModel.CBRViewModelState {
    }

    /* compiled from: CBRBaseDocumentPreviewViewModel.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/b$c;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "Lru/cyberity/cbr/core/data/model/Document;", "document", "<init>", "(Lru/cyberity/cbr/core/data/model/Document;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Lru/cyberity/cbr/core/data/model/Document;", "b", "()Lru/cyberity/cbr/core/data/model/Document;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class c implements CBRViewModel.CBRViewModelEvent {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @k
        private final Document document;

        public c(@k Document document) {
            this.document = document;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final Document getDocument() {
            return this.document;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && L.f(this.document, ((c) other).document);
        }

        public int hashCode() {
            return this.document.hashCode();
        }

        @k
        public String toString() {
            return "DocumentUploaded(document=" + this.document + ')';
        }
    }

    /* compiled from: CBRBaseDocumentPreviewViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/b$d;", "", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static class d {
    }

    /* compiled from: CBRBaseDocumentPreviewViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/b$a;", "S", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.CBRBaseDocumentPreviewViewModel$launchIOWithProgress$1", f = "CBRBaseDocumentPreviewViewModel.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434831a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b<S> f434832b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Y41.l<Continuation<? super G0>, Object> f434833c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(b<S> bVar, Y41.l<? super Continuation<? super G0>, ? extends Object> lVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f434832b = bVar;
            this.f434833c = lVar;
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
            return new e(this.f434832b, this.f434833c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f434831a;
            if (i12 == 0) {
                C42729a0.b(obj);
                b<S> bVar = this.f434832b;
                Y41.l<Continuation<? super G0>, Object> lVar = this.f434833c;
                this.f434831a = 1;
                if (bVar.a(lVar, this) == coroutine_suspended) {
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

    /* compiled from: CBRBaseDocumentPreviewViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/b$a;", "S", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.CBRBaseDocumentPreviewViewModel$onLoad$1", f = "CBRBaseDocumentPreviewViewModel.kt", i = {0, 1, 1}, l = {41, 44, 52}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "applicant"}, s = {"L$0", "L$0", "L$1"})
    public static final class f extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f434834a;

        /* renamed from: b, reason: collision with root package name */
        int f434835b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f434836c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b<S> f434837d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(b<S> bVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f434837d = bVar;
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            f fVar = new f(this.f434837d, continuation);
            fVar.f434836c = obj;
            return fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00ac A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0013, B:14:0x002b, B:33:0x00a6, B:35:0x00ac, B:41:0x00b6, B:44:0x00d8, B:47:0x00ec, B:48:0x00f4, B:17:0x0038, B:24:0x0066, B:26:0x0084, B:29:0x008c, B:20:0x0043), top: B:52:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.b.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CBRBaseDocumentPreviewViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.CBRBaseDocumentPreviewViewModel", f = "CBRBaseDocumentPreviewViewModel.kt", i = {0}, l = {73}, m = "withProgress", n = {"this"}, s = {"L$0"})
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f434838a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f434839b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b<S> f434840c;

        /* renamed from: d, reason: collision with root package name */
        int f434841d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(b<S> bVar, Continuation<? super g> continuation) {
            super(continuation);
            this.f434840c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f434839b = obj;
            this.f434841d |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.f434840c.a((Y41.l<? super Continuation<? super G0>, ? extends Object>) null, this);
        }
    }

    static {
        Y y12 = new Y(b.class, "country", "getCountry()Ljava/lang/String;", 0);
        n0 n0Var = m0.f406844a;
        f434821j = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(b.class, "idDocType", "getIdDocType()Ljava/lang/String;", 0, n0Var)};
        INSTANCE = new Companion(null);
    }

    public b(@k Document document, @k C23060r0 c23060r0, @k ru.cyberity.cbr.core.data.source.common.a aVar, @k ru.cyberity.cbr.core.data.source.dynamic.c cVar, @k ru.cyberity.cbr.core.domain.b bVar) {
        super(aVar, cVar);
        this.document = document;
        this.commonRepository = aVar;
        this.dataRepository = cVar;
        this.countriesUseCase = bVar;
        this.country = new ru.cyberity.cbr.core.presentation.screen.base.a(c23060r0, "KEY_COUNTRY", null);
        this.idDocType = new ru.cyberity.cbr.core.presentation.screen.base.a(c23060r0, "KEY_ID_DOC_TYPE", "OTHER");
    }

    @l
    public Object a(@l ru.cyberity.cbr.core.data.model.g gVar, @l ru.cyberity.cbr.core.data.model.e eVar, @k Continuation<? super G0> continuation) {
        return a(this, gVar, eVar, continuation);
    }

    public abstract void a(boolean show);

    @l
    public final Map<String, String> c() {
        return this.countries;
    }

    @l
    public final String d() {
        return (String) this.country.a(this, f434821j[0]);
    }

    @k
    /* renamed from: e, reason: from getter */
    public final ru.cyberity.cbr.core.data.source.dynamic.c getDataRepository() {
        return this.dataRepository;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final Document getDocument() {
        return this.document;
    }

    @k
    public final String g() {
        return (String) this.idDocType.a(this, f434821j[1]);
    }

    @l
    public final Map<String, String> h() {
        return this.includedCountries;
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    public void onLoad() {
        C43259k.d(N0.a(this), null, null, new f(this, null), 3);
    }

    public void a() {
    }

    public final void b(@k String str) {
        this.idDocType.a(this, f434821j[1], str);
    }

    public void c(@k String idDocType) {
        b(idDocType);
    }

    public final void a(@l String str) {
        this.country.a(this, f434821j[0], str);
    }

    public final void a(@l Map<String, String> map) {
        this.countries = map;
    }

    public final void a(@k Document document) {
        fireEvent(new c(document));
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k Y41.l<? super kotlin.coroutines.Continuation<? super kotlin.G0>, ? extends java.lang.Object> r6, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ru.cyberity.cbr.presentation.screen.preview.b.g
            if (r0 == 0) goto L13
            r0 = r7
            ru.cyberity.cbr.presentation.screen.preview.b$g r0 = (ru.cyberity.cbr.presentation.screen.preview.b.g) r0
            int r1 = r0.f434841d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f434841d = r1
            goto L18
        L13:
            ru.cyberity.cbr.presentation.screen.preview.b$g r0 = new ru.cyberity.cbr.presentation.screen.preview.b$g
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f434839b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f434841d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r6 = r0.f434838a
            ru.cyberity.cbr.presentation.screen.preview.b r6 = (ru.cyberity.cbr.presentation.screen.preview.b) r6
            kotlin.C42729a0.b(r7)
            goto L4b
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.C42729a0.b(r7)
            r5.showProgress(r4)
            r5.a(r3)
            r0.f434838a = r5
            r0.f434841d = r4
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r6 = r5
        L4b:
            r6.showProgress(r3)
            r6.a(r4)
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.b.a(Y41.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void a(@k Y41.l<? super Continuation<? super G0>, ? extends Object> block) {
        C43259k.d(N0.a(this), C43262l0.f411947c, null, new e(this, block, null), 2);
    }

    public void a(@k ru.cyberity.cbr.core.domain.c countriesResultData) {
        a(countriesResultData.getCurrentCountryKey());
        this.countries = countriesResultData.l();
        this.includedCountries = countriesResultData.j();
    }

    public static /* synthetic */ Object a(b bVar, ru.cyberity.cbr.core.data.model.g gVar, ru.cyberity.cbr.core.data.model.e eVar, Continuation continuation) {
        return G0.f406611a;
    }

    public static /* synthetic */ void a(b bVar, Throwable th2, Object obj, int i12, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onDataError");
        }
        if ((i12 & 2) != 0) {
            obj = null;
        }
        bVar.a(th2, obj);
    }

    public final void a(@k Throwable exception, @l Object payload) {
        ru.cyberity.log.a.f436064a.e(ru.cyberity.log.c.a(this), "Exception while getting a data", exception);
        showProgress(false);
        throwError(exception, this.document.getType().getValue(), payload);
    }
}
