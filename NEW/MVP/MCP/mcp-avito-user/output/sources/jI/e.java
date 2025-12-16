package Ji;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.J;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.beduin.v2.interaction.navigation.flow.u;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements InterfaceC43160i<Ki.b> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ki.c f9112b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9113c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f9114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ J f9115e;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f9116b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f9117c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ u f9118d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ J f9119e;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.beduin.v2.page.impl.navigation.di.BeduinV2ScreenNavigationModule$screenUpdatesFlow$$inlined$map$1$2", f = "BeduinV2ScreenNavigationModule.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: Ji.e$a$a, reason: collision with other inner class name */
        public static final class C0539a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f9120q;

            /* renamed from: r, reason: collision with root package name */
            public int f9121r;

            public C0539a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                this.f9120q = obj;
                this.f9121r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, String str, u uVar, J j12) {
            this.f9116b = interfaceC43172j;
            this.f9117c = str;
            this.f9118d = uVar;
            this.f9119e = j12;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r6, @Y61.k kotlin.coroutines.Continuation r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof Ji.e.a.C0539a
                if (r0 == 0) goto L13
                r0 = r7
                Ji.e$a$a r0 = (Ji.e.a.C0539a) r0
                int r1 = r0.f9121r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f9121r = r1
                goto L18
            L13:
                Ji.e$a$a r0 = new Ji.e$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f9120q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f9121r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r7)
                goto L54
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.C42729a0.b(r7)
                Ki.b r6 = (Ki.b) r6
                com.avito.android.analytics.screens.mvi.r r7 = new com.avito.android.analytics.screens.mvi.r
                java.lang.String r2 = r5.f9117c
                if (r2 == 0) goto L3d
                goto L41
            L3d:
                com.avito.beduin.v2.interaction.navigation.flow.u r2 = r5.f9118d
                java.lang.String r2 = r2.f337550a
            L41:
                com.avito.android.analytics.screens.J r4 = r5.f9119e
                r7.<init>(r2, r4)
                r6.setPerfTrackerParams(r7)
                r0.f9121r = r3
                kotlinx.coroutines.flow.j r7 = r5.f9116b
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L54
                return r1
            L54:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Ji.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public e(Ki.c cVar, String str, u uVar, J j12) {
        this.f9112b = cVar;
        this.f9113c = str;
        this.f9114d = uVar;
        this.f9115e = j12;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @l
    public final Object collect(@k InterfaceC43172j<? super Ki.b> interfaceC43172j, @k Continuation continuation) {
        Object objCollect = this.f9112b.collect(new a(interfaceC43172j, this.f9113c, this.f9114d, this.f9115e), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
