package com.avito.android.category.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.category.mvi.entity.CategoryInternalAction;
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
/* loaded from: classes12.dex */
public final class b implements InterfaceC43160i<CategoryInternalAction> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f116653b;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f116654b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.category.mvi.CategoryActor$handleMainLoading$$inlined$map$1$2", f = "CategoryActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.category.mvi.b$a$a, reason: collision with other inner class name */
        public static final class C3402a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f116655q;

            /* renamed from: r, reason: collision with root package name */
            public int f116656r;

            public C3402a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f116655q = obj;
                this.f116656r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f116654b = interfaceC43172j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.avito.android.category.mvi.b.a.C3402a
                if (r0 == 0) goto L13
                r0 = r6
                com.avito.android.category.mvi.b$a$a r0 = (com.avito.android.category.mvi.b.a.C3402a) r0
                int r1 = r0.f116656r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f116656r = r1
                goto L18
            L13:
                com.avito.android.category.mvi.b$a$a r0 = new com.avito.android.category.mvi.b$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f116655q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f116656r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r6)
                goto L6a
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.C42729a0.b(r6)
                kotlin.Q r5 = (kotlin.Q) r5
                A r6 = r5.f406619b
                com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
                B r5 = r5.f406620c
                com.avito.android.remote.model.Location r5 = (com.avito.android.remote.model.Location) r5
                boolean r2 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r2 == 0) goto L50
                com.avito.android.category.mvi.entity.CategoryInternalAction$LoadingMainCompleted r2 = new com.avito.android.category.mvi.entity.CategoryInternalAction$LoadingMainCompleted
                com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
                java.lang.Object r6 = r6.getResult()
                com.avito.android.remote.model.MainSearchResult r6 = (com.avito.android.remote.model.MainSearchResult) r6
                r2.<init>(r6, r5)
                goto L5f
            L50:
                boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r5 == 0) goto L6d
                com.avito.android.category.mvi.entity.CategoryInternalAction$LoadingMainFailed r2 = new com.avito.android.category.mvi.entity.CategoryInternalAction$LoadingMainFailed
                com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
                com.avito.android.remote.error.ApiError r5 = r6.getError()
                r2.<init>(r5)
            L5f:
                r0.f116656r = r3
                kotlinx.coroutines.flow.j r5 = r4.f116654b
                java.lang.Object r5 = r5.emit(r2, r0)
                if (r5 != r1) goto L6a
                return r1
            L6a:
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            L6d:
                kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                r5.<init>()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.category.mvi.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public b(InterfaceC43160i interfaceC43160i) {
        this.f116653b = interfaceC43160i;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super CategoryInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f116653b.collect(new a(interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
