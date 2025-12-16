package ru.cyberity.cbr.core.presentation.screen.imageviewer;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.view.N0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.io.File;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43135f1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.n2;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.log.LoggerType;

/* compiled from: CBRImageViewerViewModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\u000eB!\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000b\u0010\u0010¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/core/presentation/screen/imageviewer/b;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel;", "Lru/cyberity/cbr/core/presentation/screen/imageviewer/b$b;", "Landroid/os/Bundle;", "args", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "<init>", "(Landroid/os/Bundle;Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/dynamic/c;)V", "a", "Landroid/os/Bundle;", "Lkotlinx/coroutines/flow/n2;", "b", "Lkotlinx/coroutines/flow/n2;", "()Lkotlinx/coroutines/flow/n2;", "getViewState$annotations", "()V", "viewState", "c", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b extends CBRViewModel<C12487b> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final Bundle args;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final n2<C12487b> viewState;

    /* compiled from: CBRImageViewerViewModel.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006\u001f"}, d2 = {"Lru/cyberity/cbr/core/presentation/screen/imageviewer/b$b;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "Landroid/graphics/Bitmap;", "bitmap", "Ljava/io/File;", "bitmapFile", "", "rotation", "<init>", "(Landroid/graphics/Bitmap;Ljava/io/File;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Bitmap;", "d", "()Landroid/graphics/Bitmap;", "b", "Ljava/io/File;", "e", "()Ljava/io/File;", "c", "I", "f", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.presentation.screen.imageviewer.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12487b implements CBRViewModel.CBRViewModelState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final Bitmap bitmap;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final File bitmapFile;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int rotation;

        public C12487b() {
            this(null, null, 0, 7, null);
        }

        @l
        /* renamed from: d, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C12487b)) {
                return false;
            }
            C12487b c12487b = (C12487b) other;
            return L.f(this.bitmap, c12487b.bitmap) && L.f(this.bitmapFile, c12487b.bitmapFile) && this.rotation == c12487b.rotation;
        }

        /* renamed from: f, reason: from getter */
        public final int getRotation() {
            return this.rotation;
        }

        public int hashCode() {
            Bitmap bitmap = this.bitmap;
            int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
            File file = this.bitmapFile;
            return Integer.hashCode(this.rotation) + ((iHashCode + (file != null ? file.hashCode() : 0)) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ViewState(bitmap=");
            sb2.append(this.bitmap);
            sb2.append(", bitmapFile=");
            sb2.append(this.bitmapFile);
            sb2.append(", rotation=");
            return r.t(sb2, this.rotation, ')');
        }

        public C12487b(@l Bitmap bitmap, @l File file, int i12) {
            this.bitmap = bitmap;
            this.bitmapFile = file;
            this.rotation = i12;
        }

        public /* synthetic */ C12487b(Bitmap bitmap, File file, int i12, int i13, C42822w c42822w) {
            this((i13 & 1) != 0 ? null : bitmap, (i13 & 2) != 0 ? null : file, (i13 & 4) != 0 ? 0 : i12);
        }
    }

    /* compiled from: CBRImageViewerViewModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lru/cyberity/cbr/core/presentation/screen/imageviewer/b$b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.screen.imageviewer.CBRImageViewerViewModel$viewState$1", f = "CBRImageViewerViewModel.kt", i = {0, 0, 0, 1, 1, 1}, l = {47, 53, 59}, m = "invokeSuspend", n = {"$this$flow", "file", "rotation", "$this$flow", "file", "rotation"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0"})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super C12487b>, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f434027a;

        /* renamed from: b, reason: collision with root package name */
        int f434028b;

        /* renamed from: c, reason: collision with root package name */
        int f434029c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f434030d;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k InterfaceC43172j<? super C12487b> interfaceC43172j, @l Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            c cVar = b.this.new c(continuation);
            cVar.f434030d = obj;
            return cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x00d1 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 213
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.presentation.screen.imageviewer.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CBRImageViewerViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lru/cyberity/cbr/core/presentation/screen/imageviewer/b$b;", "", "e", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.screen.imageviewer.CBRImageViewerViewModel$viewState$2", f = "CBRImageViewerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements q<InterfaceC43172j<? super C12487b>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434032a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f434033b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f434034c;

        /* compiled from: CBRImageViewerViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.screen.imageviewer.CBRImageViewerViewModel$viewState$2$1", f = "CBRImageViewerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f434036a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f434037b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Throwable f434038c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable th2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f434038c = th2;
            }

            @Override // Y41.p
            @l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f434038c, continuation);
                aVar.f434037b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f434036a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                ru.cyberity.log.a.f436064a.a(LoggerType.KIBANA).e(ru.cyberity.log.c.a((T) this.f434037b), "Can't decode file", this.f434038c);
                return G0.f406611a;
            }
        }

        public d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k InterfaceC43172j<? super C12487b> interfaceC43172j, @k Throwable th2, @l Continuation<? super G0> continuation) {
            d dVar = b.this.new d(continuation);
            dVar.f434033b = interfaceC43172j;
            dVar.f434034c = th2;
            return dVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            String string;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f434032a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f434033b;
            Throwable th2 = (Throwable) this.f434034c;
            Bundle bundle = b.this.args;
            if (bundle == null || (string = bundle.getString("arg_iddocsettype")) == null) {
                string = "TYPE_UNKNOWN";
            }
            CBRViewModel.throwError$default(b.this, th2, string, null, 4, null);
            ru.cyberity.log.a aVar = ru.cyberity.log.a.f436064a;
            String strA = ru.cyberity.log.c.a(interfaceC43172j);
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            aVar.e(strA, message, th2);
            C43259k.d(N0.a(b.this), C43135f1.f411090b, null, new a(th2, null), 2);
            return G0.f406611a;
        }
    }

    public b(@l Bundle bundle, @k ru.cyberity.cbr.core.data.source.common.a aVar, @k ru.cyberity.cbr.core.data.source.dynamic.c cVar) {
        super(aVar, cVar);
        this.args = bundle;
        this.viewState = C43175k.U(new C43152f0(C43175k.G(new c(null)), new d(null)), N0.a(this), i2.a.b(i2.f411430a, 0L, 3), new C12487b(null, null, 0, 7, null));
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public n2<C12487b> getViewState() {
        return this.viewState;
    }
}
