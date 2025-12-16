package ru.cyberity.cbr.presentation.screen.error;

import Y61.k;
import Y61.l;
import androidx.view.N0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.n2;
import ru.cyberity.cbr.core.data.model.p;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;

/* compiled from: CBRErrorViewModel.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0010\u0012B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017¨\u0006\u001a"}, d2 = {"Lru/cyberity/cbr/presentation/screen/error/c;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel;", "Lru/cyberity/cbr/presentation/screen/error/c$b;", "Lru/cyberity/cbr/core/data/model/p;", "error", "Lru/cyberity/cbr/core/data/source/extensions/a;", "extensionProvider", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "<init>", "(Lru/cyberity/cbr/core/data/model/p;Lru/cyberity/cbr/core/data/source/extensions/a;Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/dynamic/c;)V", "Lkotlin/G0;", "onHandleError", "(Lru/cyberity/cbr/core/data/model/p;)V", "a", "Lru/cyberity/cbr/core/data/model/p;", "b", "Lru/cyberity/cbr/core/data/source/extensions/a;", "Lkotlinx/coroutines/flow/n2;", "c", "Lkotlinx/coroutines/flow/n2;", "()Lkotlinx/coroutines/flow/n2;", "viewState", "d", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class c extends CBRViewModel<b> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final p error;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.data.source.extensions.a extensionProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final n2<b> viewState;

    /* compiled from: CBRErrorViewModel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/cyberity/cbr/presentation/screen/error/c$b;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "<init>", "()V", "a", "b", "c", "Lru/cyberity/cbr/presentation/screen/error/c$b$a;", "Lru/cyberity/cbr/presentation/screen/error/c$b$b;", "Lru/cyberity/cbr/presentation/screen/error/c$b$c;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class b implements CBRViewModel.CBRViewModelState {

        /* compiled from: CBRErrorViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/presentation/screen/error/c$b$a;", "Lru/cyberity/cbr/presentation/screen/error/c$b;", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final a f434700a = new a();

            private a() {
                super(null);
            }
        }

        /* compiled from: CBRErrorViewModel.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/presentation/screen/error/c$b$b;", "Lru/cyberity/cbr/presentation/screen/error/c$b;", "", "title", "subtitle", "button", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/CharSequence;", "f", "()Ljava/lang/CharSequence;", "b", "e", "c", "d", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.presentation.screen.error.c$b$b, reason: collision with other inner class name */
        public static final /* data */ class C12511b extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @l
            private final CharSequence title;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @l
            private final CharSequence subtitle;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @l
            private final CharSequence button;

            public C12511b() {
                this(null, null, null, 7, null);
            }

            @l
            /* renamed from: d, reason: from getter */
            public final CharSequence getButton() {
                return this.button;
            }

            @l
            /* renamed from: e, reason: from getter */
            public final CharSequence getSubtitle() {
                return this.subtitle;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C12511b)) {
                    return false;
                }
                C12511b c12511b = (C12511b) other;
                return L.f(this.title, c12511b.title) && L.f(this.subtitle, c12511b.subtitle) && L.f(this.button, c12511b.button);
            }

            @l
            /* renamed from: f, reason: from getter */
            public final CharSequence getTitle() {
                return this.title;
            }

            public int hashCode() {
                CharSequence charSequence = this.title;
                int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
                CharSequence charSequence2 = this.subtitle;
                int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
                CharSequence charSequence3 = this.button;
                return iHashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Normal(title=");
                sb2.append((Object) this.title);
                sb2.append(", subtitle=");
                sb2.append((Object) this.subtitle);
                sb2.append(", button=");
                return AK.c.r(sb2, this.button, ')');
            }

            public /* synthetic */ C12511b(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : charSequence, (i12 & 2) != 0 ? null : charSequence2, (i12 & 4) != 0 ? null : charSequence3);
            }

            public C12511b(@l CharSequence charSequence, @l CharSequence charSequence2, @l CharSequence charSequence3) {
                super(null);
                this.title = charSequence;
                this.subtitle = charSequence2;
                this.button = charSequence3;
            }
        }

        /* compiled from: CBRErrorViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/presentation/screen/error/c$b$c;", "Lru/cyberity/cbr/presentation/screen/error/c$b;", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.presentation.screen.error.c$b$c, reason: collision with other inner class name */
        public static final class C12512c extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C12512c f434704a = new C12512c();

            private C12512c() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        private b() {
        }
    }

    /* compiled from: CBRErrorViewModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lru/cyberity/cbr/presentation/screen/error/c$b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.error.CBRErrorViewModel$viewState$1", f = "CBRErrorViewModel.kt", i = {0, 1, 1, 2, 2, 2, 3, 4, 4, 5, 5, 5}, l = {33, 34, 35, 38, 39, 40, 46, 48}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "title", "$this$flow", "title", "subtitle", "$this$flow", "$this$flow", "title", "$this$flow", "title", "subtitle"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$0", "L$1", "L$0", "L$1", "L$2"})
    /* renamed from: ru.cyberity.cbr.presentation.screen.error.c$c, reason: collision with other inner class name */
    public static final class C12513c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super b>, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f434705a;

        /* renamed from: b, reason: collision with root package name */
        Object f434706b;

        /* renamed from: c, reason: collision with root package name */
        int f434707c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f434708d;

        public C12513c(Continuation<? super C12513c> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k InterfaceC43172j<? super b> interfaceC43172j, @l Continuation<? super G0> continuation) {
            return ((C12513c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C12513c c12513c = c.this.new C12513c(continuation);
            c12513c.f434708d = obj;
            return c12513c;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x009b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00b6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00f0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00f9  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0119 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0123 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x014e A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                Method dump skipped, instructions count: 360
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.error.c.C12513c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public c(@k p pVar, @k ru.cyberity.cbr.core.data.source.extensions.a aVar, @k ru.cyberity.cbr.core.data.source.common.a aVar2, @k ru.cyberity.cbr.core.data.source.dynamic.c cVar) {
        super(aVar2, cVar);
        this.error = pVar;
        this.extensionProvider = aVar;
        this.viewState = C43175k.U(C43175k.G(new C12513c(null)), N0.a(this), i2.a.b(i2.f411430a, 0L, 3), b.a.f434700a);
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public n2<b> getViewState() {
        return this.viewState;
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    public void onHandleError(@k p error) {
    }
}
