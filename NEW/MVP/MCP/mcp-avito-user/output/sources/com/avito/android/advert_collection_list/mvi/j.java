package com.avito.android.advert_collection_list.mvi;

import com.avito.android.advert_collection_list.mvi.entity.AdvertCollectionListInternalAction;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/q1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j implements InterfaceC43160i<AdvertCollectionListInternalAction.CollectionCreated> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f82234b;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/q1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f82235b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.advert_collection_list.mvi.AdvertCollectionListBootstrap$observeResult$$inlined$mapNotNull$1$2", f = "AdvertCollectionListBootstrap.kt", i = {}, l = {232}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.advert_collection_list.mvi.j$a$a, reason: collision with other inner class name */
        public static final class C2439a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f82236q;

            /* renamed from: r, reason: collision with root package name */
            public int f82237r;

            public C2439a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f82236q = obj;
                this.f82237r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f82235b = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r11, @Y61.k kotlin.coroutines.Continuation r12) {
            /*
                r10 = this;
                boolean r0 = r12 instanceof com.avito.android.advert_collection_list.mvi.j.a.C2439a
                if (r0 == 0) goto L13
                r0 = r12
                com.avito.android.advert_collection_list.mvi.j$a$a r0 = (com.avito.android.advert_collection_list.mvi.j.a.C2439a) r0
                int r1 = r0.f82237r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f82237r = r1
                goto L18
            L13:
                com.avito.android.advert_collection_list.mvi.j$a$a r0 = new com.avito.android.advert_collection_list.mvi.j$a$a
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.f82236q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f82237r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r12)
                goto L5c
            L29:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L31:
                kotlin.C42729a0.b(r12)
                kv.a r11 = (kv.C43501a) r11
                Ju.c r11 = r11.f413261b
                boolean r12 = r11 instanceof com.avito.android.deep_linking.links.AddToCollectionLink.b.c
                if (r12 == 0) goto L4e
                com.avito.android.advert_collection_list.mvi.entity.AdvertCollectionListInternalAction$CollectionCreated r12 = new com.avito.android.advert_collection_list.mvi.entity.AdvertCollectionListInternalAction$CollectionCreated
                com.avito.android.deep_linking.links.AddToCollectionLink$b$c r11 = (com.avito.android.deep_linking.links.AddToCollectionLink.b.c) r11
                java.lang.String r7 = r11.f132943c
                java.lang.String r9 = ""
                r6 = 0
                java.lang.String r8 = r11.f132944d
                com.avito.android.deep_linking.links.DeepLink r5 = r11.f132942b
                r4 = r12
                r4.<init>(r5, r6, r7, r8, r9)
                goto L4f
            L4e:
                r12 = 0
            L4f:
                if (r12 == 0) goto L5c
                r0.f82237r = r3
                kotlinx.coroutines.flow.j r11 = r10.f82235b
                java.lang.Object r11 = r11.emit(r12, r0)
                if (r11 != r1) goto L5c
                return r1
            L5c:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_collection_list.mvi.j.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public j(InterfaceC43160i interfaceC43160i) {
        this.f82234b = interfaceC43160i;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super AdvertCollectionListInternalAction.CollectionCreated> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = ((AbstractC43168f) this.f82234b).collect(new a(interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
