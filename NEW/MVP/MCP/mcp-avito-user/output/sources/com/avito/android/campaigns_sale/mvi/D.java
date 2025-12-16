package com.avito.android.campaigns_sale.mvi;

import android.content.res.Resources;
import androidx.compose.foundation.text.selection.W0;
import com.avito.android.R;
import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction;
import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleState;
import com.avito.android.remote.model.Image;
import com.avito.android.util.O2;
import gm.C40704a;
import gm.C40705b;
import gm.C40707d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CampaignsSaleBlocksResolver.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/D;", "Lcom/avito/android/campaigns_sale/mvi/z;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class D implements z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.campaigns_sale.network.a f114069a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Resources f114070b;

    /* compiled from: CampaignsSaleBlocksResolver.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale.mvi.CampaignsSaleBlocksResolverImpl$resolveBlocks$1", f = "CampaignsSaleBlocksResolver.kt", i = {0, 1}, l = {59, 60, 61}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114071q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f114072r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ List<C40705b> f114073s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ D f114074t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<C40705b> list, D d12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f114073s = list;
            this.f114074t = d12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f114073s, this.f114074t, continuation);
            aVar.f114072r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x006e A[RETURN] */
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
                int r1 = r6.f114071q
                java.util.List<gm.b> r2 = r6.f114073s
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2f
                if (r1 == r5) goto L27
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                kotlin.C42729a0.b(r7)
                goto L6f
            L17:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1f:
                java.lang.Object r1 = r6.f114072r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L57
            L27:
                java.lang.Object r1 = r6.f114072r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L47
            L2f:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f114072r
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
                com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$BlocksResolved r1 = new com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$BlocksResolved
                r1.<init>(r2)
                r6.f114072r = r7
                r6.f114071q = r5
                java.lang.Object r1 = r7.emit(r1, r6)
                if (r1 != r0) goto L46
                return r0
            L46:
                r1 = r7
            L47:
                com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$SetChangesMade r7 = new com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$SetChangesMade
                r7.<init>(r5)
                r6.f114072r = r1
                r6.f114071q = r4
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L57
                return r0
            L57:
                com.avito.android.campaigns_sale.mvi.D r7 = r6.f114074t
                com.avito.android.campaigns_sale.network.a r7 = r7.f114069a
                java.util.ArrayList r2 = gm.C40706c.a(r2)
                kotlinx.coroutines.flow.i r7 = r7.d(r2)
                r2 = 0
                r6.f114072r = r2
                r6.f114071q = r3
                java.lang.Object r7 = kotlinx.coroutines.flow.C43175k.u(r6, r7, r1)
                if (r7 != r0) goto L6f
                return r0
            L6f:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.campaigns_sale.mvi.D.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CampaignsSaleBlocksResolver.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale.mvi.CampaignsSaleBlocksResolverImpl$resolveBlocks$2", f = "CampaignsSaleBlocksResolver.kt", i = {0, 1, 2, 3}, l = {77, 78, 80, 82, 83}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0"})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114075q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f114076r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ List<C40705b> f114077s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ D f114078t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<C40705b> list, D d12, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f114077s = list;
            this.f114078t = d12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f114077s, this.f114078t, continuation);
            bVar.f114076r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b0 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.f114075q
                java.util.List<gm.b> r2 = r9.f114077s
                com.avito.android.campaigns_sale.mvi.D r3 = r9.f114078t
                r4 = 5
                r5 = 4
                r6 = 3
                r7 = 2
                r8 = 1
                if (r1 == 0) goto L48
                if (r1 == r8) goto L40
                if (r1 == r7) goto L38
                if (r1 == r6) goto L30
                if (r1 == r5) goto L28
                if (r1 != r4) goto L20
                kotlin.C42729a0.b(r10)
                goto Lb1
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                java.lang.Object r1 = r9.f114076r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L9b
            L30:
                java.lang.Object r1 = r9.f114076r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L90
            L38:
                java.lang.Object r1 = r9.f114076r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L70
            L40:
                java.lang.Object r1 = r9.f114076r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L60
            L48:
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f114076r
                r1 = r10
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$BlocksResolved r10 = new com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$BlocksResolved
                r10.<init>(r2)
                r9.f114076r = r1
                r9.f114075q = r8
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L60
                return r0
            L60:
                com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$SetChangesMade r10 = new com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$SetChangesMade
                r10.<init>(r8)
                r9.f114076r = r1
                r9.f114075q = r7
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L70
                return r0
            L70:
                int r10 = r2.size()
                if (r10 <= r8) goto L90
                com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$ShowToast r10 = new com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$ShowToast
                r7 = 0
                java.io.Serializable[] r7 = new java.io.Serializable[r7]
                r8 = 2131952628(0x7f1303f4, float:1.9541704E38)
                com.avito.android.printable_text.PrintableText r7 = com.avito.android.printable_text.b.c(r8, r7)
                r10.<init>(r7)
                r9.f114076r = r1
                r9.f114075q = r6
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L90
                return r0
            L90:
                r9.f114076r = r1
                r9.f114075q = r5
                java.lang.Object r10 = com.avito.android.campaigns_sale.mvi.D.c(r3, r1, r2, r9)
                if (r10 != r0) goto L9b
                return r0
            L9b:
                com.avito.android.campaigns_sale.network.a r10 = r3.f114069a
                java.util.ArrayList r2 = gm.C40706c.a(r2)
                kotlinx.coroutines.flow.i r10 = r10.d(r2)
                r2 = 0
                r9.f114076r = r2
                r9.f114075q = r4
                java.lang.Object r10 = kotlinx.coroutines.flow.C43175k.u(r9, r10, r1)
                if (r10 != r0) goto Lb1
                return r0
            Lb1:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.campaigns_sale.mvi.D.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CampaignsSaleBlocksResolver.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale.mvi.CampaignsSaleBlocksResolverImpl$resolveBlocks$3", f = "CampaignsSaleBlocksResolver.kt", i = {0, 1, 2, 3}, l = {105, 106, 108, 110, 111}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0"})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114079q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f114080r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ ArrayList f114081s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ List<C40705b> f114082t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ D f114083u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(D d12, ArrayList arrayList, List list, Continuation continuation) {
            super(2, continuation);
            this.f114081s = arrayList;
            this.f114082t = list;
            this.f114083u = d12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f114083u, this.f114081s, this.f114082t, continuation);
            cVar.f114080r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b6 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f114079q
                java.util.ArrayList r2 = r10.f114081s
                com.avito.android.campaigns_sale.mvi.D r3 = r10.f114083u
                java.util.List<gm.b> r4 = r10.f114082t
                r5 = 5
                r6 = 4
                r7 = 3
                r8 = 2
                r9 = 1
                if (r1 == 0) goto L4a
                if (r1 == r9) goto L42
                if (r1 == r8) goto L3a
                if (r1 == r7) goto L32
                if (r1 == r6) goto L2a
                if (r1 != r5) goto L22
                kotlin.C42729a0.b(r11)
                goto Lb7
            L22:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L2a:
                java.lang.Object r1 = r10.f114080r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto La1
            L32:
                java.lang.Object r1 = r10.f114080r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L96
            L3a:
                java.lang.Object r1 = r10.f114080r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L72
            L42:
                java.lang.Object r1 = r10.f114080r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L62
            L4a:
                kotlin.C42729a0.b(r11)
                java.lang.Object r11 = r10.f114080r
                r1 = r11
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$BlocksResolved r11 = new com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$BlocksResolved
                r11.<init>(r2)
                r10.f114080r = r1
                r10.f114079q = r9
                java.lang.Object r11 = r1.emit(r11, r10)
                if (r11 != r0) goto L62
                return r0
            L62:
                com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$SetChangesMade r11 = new com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$SetChangesMade
                r11.<init>(r9)
                r10.f114080r = r1
                r10.f114079q = r8
                java.lang.Object r11 = r1.emit(r11, r10)
                if (r11 != r0) goto L72
                return r0
            L72:
                int r11 = r4.size()
                int r8 = r2.size()
                if (r11 == r8) goto L96
                com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$ShowToast r11 = new com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$ShowToast
                r8 = 0
                java.io.Serializable[] r8 = new java.io.Serializable[r8]
                r9 = 2131952653(0x7f13040d, float:1.9541755E38)
                com.avito.android.printable_text.PrintableText r8 = com.avito.android.printable_text.b.c(r9, r8)
                r11.<init>(r8)
                r10.f114080r = r1
                r10.f114079q = r7
                java.lang.Object r11 = r1.emit(r11, r10)
                if (r11 != r0) goto L96
                return r0
            L96:
                r10.f114080r = r1
                r10.f114079q = r6
                java.lang.Object r11 = com.avito.android.campaigns_sale.mvi.D.c(r3, r1, r2, r10)
                if (r11 != r0) goto La1
                return r0
            La1:
                com.avito.android.campaigns_sale.network.a r11 = r3.f114069a
                java.util.ArrayList r2 = gm.C40706c.a(r4)
                kotlinx.coroutines.flow.i r11 = r11.d(r2)
                r2 = 0
                r10.f114080r = r2
                r10.f114079q = r5
                java.lang.Object r11 = kotlinx.coroutines.flow.C43175k.u(r10, r11, r1)
                if (r11 != r0) goto Lb7
                return r0
            Lb7:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.campaigns_sale.mvi.D.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public D(@Y61.k com.avito.android.campaigns_sale.network.a aVar, @Y61.k Resources resources) {
        this.f114069a = aVar;
        this.f114070b = resources;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.campaigns_sale.mvi.D r7, kotlinx.coroutines.flow.InterfaceC43172j r8, java.util.List r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof com.avito.android.campaigns_sale.mvi.B
            if (r0 == 0) goto L16
            r0 = r10
            com.avito.android.campaigns_sale.mvi.B r0 = (com.avito.android.campaigns_sale.mvi.B) r0
            int r1 = r0.f114062u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f114062u = r1
            goto L1b
        L16:
            com.avito.android.campaigns_sale.mvi.B r0 = new com.avito.android.campaigns_sale.mvi.B
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.f114060s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f114062u
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L49
            if (r2 == r5) goto L41
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            kotlin.C42729a0.b(r10)
            goto L83
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            kotlinx.coroutines.flow.j r7 = r0.f114058q
            kotlin.C42729a0.b(r10)
            goto L72
        L41:
            java.util.ArrayList r7 = r0.f114059r
            kotlinx.coroutines.flow.j r8 = r0.f114058q
            kotlin.C42729a0.b(r10)
            goto L64
        L49:
            kotlin.C42729a0.b(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            com.avito.android.campaigns_sale.mvi.C r2 = new com.avito.android.campaigns_sale.mvi.C
            r2.<init>(r7, r10, r9, r6)
            r0.f114058q = r8
            r0.f114059r = r10
            r0.f114062u = r5
            java.lang.Object r7 = kotlinx.coroutines.U.c(r2, r0)
            if (r7 != r1) goto L63
            goto L85
        L63:
            r7 = r10
        L64:
            r0.f114058q = r8
            r0.f114059r = r6
            r0.f114062u = r4
            java.lang.Object r10 = kotlinx.coroutines.C43225h.a(r7, r0)
            if (r10 != r1) goto L71
            goto L85
        L71:
            r7 = r8
        L72:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            kotlinx.coroutines.flow.internal.m r8 = kotlinx.coroutines.flow.C43175k.M(r10)
            r0.f114058q = r6
            r0.f114062u = r3
            java.lang.Object r7 = kotlinx.coroutines.flow.C43175k.u(r0, r8, r7)
            if (r7 != r1) goto L83
            goto L85
        L83:
            kotlin.G0 r1 = kotlin.G0.f406611a
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.campaigns_sale.mvi.D.c(com.avito.android.campaigns_sale.mvi.D, kotlinx.coroutines.flow.j, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static C40705b d(D d12, C40705b c40705b, CampaignsSaleState.c cVar, List list, List list2, List list3, String str, List list4, boolean z12, int i12) throws Resources.NotFoundException {
        Integer numValueOf = null;
        List list5 = (i12 & 4) != 0 ? null : list2;
        List list6 = (i12 & 8) != 0 ? null : list3;
        String str2 = (i12 & 16) != 0 ? null : str;
        List list7 = (i12 & 32) != 0 ? null : list4;
        boolean z13 = (i12 & 64) != 0 ? true : z12;
        d12.getClass();
        List list8 = list6;
        List list9 = (list8 == null || list8.isEmpty()) ? list : list6;
        int i13 = cVar.f114220c;
        Iterator it = list9.iterator();
        if (it.hasNext()) {
            Long lValueOf = Long.valueOf(((Number) it.next()).longValue());
            Map<Long, Integer> map = cVar.f114218a;
            Integer num = map.get(lValueOf);
            numValueOf = Integer.valueOf(num != null ? num.intValue() : 0);
            while (it.hasNext()) {
                Integer num2 = map.get(Long.valueOf(((Number) it.next()).longValue()));
                Integer numValueOf2 = Integer.valueOf(num2 != null ? num2.intValue() : 0);
                if (numValueOf.compareTo(numValueOf2) > 0) {
                    numValueOf = numValueOf2;
                }
            }
        }
        int iMax = Integer.max(i13, numValueOf != null ? numValueOf.intValue() : 0);
        List<Integer> list10 = cVar.f114219b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list10) {
            if (((Number) obj).intValue() >= iMax) {
                arrayList.add(obj);
            }
        }
        List listE0 = C42745f0.E0(arrayList, 5);
        Object[] objArr = {Integer.valueOf(iMax)};
        Resources resources = d12.f114070b;
        String string = resources.getString(R.string.campaigns_sale_min_discount_text, objArr);
        int i14 = cVar.f114221d;
        return C40705b.a(c40705b, listE0, new C40707d(iMax, i14, string, resources.getString(R.string.campaigns_sale_max_discount_text, Integer.valueOf(i14))), str2, list6, list7, null, list5, false, false, z13, 1857);
    }

    @Override // com.avito.android.campaigns_sale.mvi.z
    @Y61.k
    public final C40705b a(@Y61.k CampaignsSaleState.c cVar, @Y61.k C40704a c40704a, @Y61.k String str, @Y61.l List<Long> list, @Y61.l List<Image> list2, @Y61.l Integer num, @Y61.l List<Long> list3, boolean z12, boolean z13) throws Resources.NotFoundException {
        Integer num2;
        List<Long> list4 = list;
        List<Long> list5 = (list4 == null || list4.isEmpty()) ? list3 : list;
        if (list5 == null) {
            list5 = C42784z0.f406748b;
        }
        Iterator<T> it = list5.iterator();
        if (it.hasNext()) {
            Long lValueOf = Long.valueOf(((Number) it.next()).longValue());
            Map<Long, Integer> map = cVar.f114218a;
            Integer num3 = map.get(lValueOf);
            Integer numValueOf = Integer.valueOf(num3 != null ? num3.intValue() : 0);
            while (it.hasNext()) {
                Integer num4 = map.get(Long.valueOf(((Number) it.next()).longValue()));
                Integer numValueOf2 = Integer.valueOf(num4 != null ? num4.intValue() : 0);
                if (numValueOf.compareTo(numValueOf2) > 0) {
                    numValueOf = numValueOf2;
                }
            }
            num2 = numValueOf;
        } else {
            num2 = null;
        }
        int iMax = Integer.max(cVar.f114220c, num2 != null ? num2.intValue() : 0);
        List<Integer> list6 = cVar.f114219b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list6) {
            if (((Number) obj).intValue() >= iMax) {
                arrayList.add(obj);
            }
        }
        List listE0 = C42745f0.E0(arrayList, 5);
        Object[] objArr = {Integer.valueOf(iMax)};
        Resources resources = this.f114070b;
        String string = resources.getString(R.string.campaigns_sale_min_discount_text, objArr);
        int i12 = cVar.f114221d;
        return new C40705b(str, listE0, new C40707d(iMax, i12, string, resources.getString(R.string.campaigns_sale_max_discount_text, Integer.valueOf(i12))), null, list, list2, num, list3, c40704a, z12, false, z13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    @Override // com.avito.android.campaigns_sale.mvi.z
    @Y61.k
    public final InterfaceC43160i<CampaignsSaleInternalAction> b(@Y61.k CampaignsSaleState.c cVar, @Y61.k List<C40705b> list) {
        ArrayList arrayList;
        boolean z12;
        ?? arrayList2;
        List listSingletonList;
        ArrayList arrayList3;
        ArrayList arrayList4;
        C40704a c40704a;
        ArrayList arrayList5;
        Iterator it;
        ArrayList arrayList6;
        List listSingletonList2;
        if (list.isEmpty()) {
            return C43175k.G(new a(list, this, null));
        }
        Map<Long, Integer> map = cVar.f114218a;
        List<Long> listA = T.a(list, map.keySet());
        if (list.size() == 1 && ((C40705b) C42745f0.E(list)).f396779h == null && O2.a(((C40705b) C42745f0.E(list)).f396777f)) {
            C40705b c40705b = (C40705b) C42745f0.E(list);
            List<Long> list2 = c40705b.f396777f;
            if (list2 == null) {
                listSingletonList2 = Collections.singletonList(c40705b);
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : list2) {
                    Integer num = map.get(Long.valueOf(((Number) obj).longValue()));
                    Object arrayList7 = linkedHashMap.get(num);
                    if (arrayList7 == null) {
                        arrayList7 = new ArrayList();
                        linkedHashMap.put(num, arrayList7);
                    }
                    ((List) arrayList7).add(obj);
                }
                TreeMap treeMap = new TreeMap(new W0(3, A.f114057l));
                treeMap.putAll(linkedHashMap);
                ArrayList arrayList8 = new ArrayList(treeMap.size());
                Iterator it2 = treeMap.entrySet().iterator();
                while (it2.hasNext()) {
                    arrayList8.add(a(cVar, c40705b.f396781j, UUID.randomUUID().toString(), (384 & 8) != 0 ? null : (List) ((Map.Entry) it2.next()).getValue(), (384 & 16) != 0 ? null : null, (384 & 32) != 0 ? null : null, listA, (384 & 128) == 0, (384 & 256) != 0));
                }
                listSingletonList2 = arrayList8;
            }
            return C43175k.G(new b(listSingletonList2, this, null));
        }
        ArrayList arrayList9 = new ArrayList();
        for (C40705b c40705b2 : list) {
            List<Long> list3 = c40705b2.f396777f;
            C40704a c40704a2 = c40705b2.f396781j;
            Integer num2 = c40705b2.f396779h;
            if (list3 == null || list3.isEmpty()) {
                arrayList = arrayList9;
                z12 = true;
                boolean z13 = list.size() == 1;
                if (num2 != null) {
                    arrayList2 = new ArrayList();
                    for (Object obj2 : listA) {
                        if (num2.intValue() >= map.getOrDefault(Long.valueOf(((Number) obj2).longValue()), 0).intValue()) {
                            arrayList2.add(obj2);
                        }
                    }
                } else {
                    arrayList2 = listA;
                }
                listSingletonList = Collections.singletonList(d(this, c40705b2, cVar, listA, arrayList2, null, null, null, (z13 && !c40704a2.f396770c && num2 == null) ? false : true, 56));
            } else {
                List<Long> list4 = c40705b2.f396777f;
                if (list4 == null) {
                    listSingletonList = Collections.singletonList(c40705b2);
                    arrayList = arrayList9;
                } else {
                    ArrayList arrayList10 = new ArrayList();
                    ArrayList arrayList11 = new ArrayList();
                    ArrayList arrayList12 = new ArrayList();
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        long jLongValue = ((Number) next).longValue();
                        if (num2 != null) {
                            int iIntValue = num2.intValue();
                            it = it3;
                            Long lValueOf = Long.valueOf(jLongValue);
                            arrayList6 = arrayList10;
                            if (iIntValue < map.getOrDefault(lValueOf, 0).intValue()) {
                                arrayList12.add(next);
                            }
                            arrayList10 = arrayList6;
                            it3 = it;
                        } else {
                            it = it3;
                            arrayList6 = arrayList10;
                        }
                        arrayList11.add(next);
                        arrayList10 = arrayList6;
                        it3 = it;
                    }
                    ArrayList arrayList13 = arrayList10;
                    if (arrayList11.isEmpty()) {
                        arrayList3 = arrayList12;
                        arrayList = arrayList9;
                        arrayList4 = arrayList13;
                        c40704a = c40704a2;
                    } else {
                        arrayList3 = arrayList12;
                        c40704a = c40704a2;
                        arrayList = arrayList9;
                        arrayList4 = arrayList13;
                        arrayList4.add(d(this, c40705b2, cVar, listA, null, arrayList11, !arrayList12.isEmpty() ? this.f114070b.getQuantityString(R.plurals.warning_text, arrayList12.size(), Integer.valueOf(arrayList12.size())) : null, arrayList12.isEmpty() ? c40705b2.f396778g : null, false, 68));
                    }
                    if (arrayList3.isEmpty()) {
                        arrayList5 = arrayList4;
                    } else {
                        arrayList5 = arrayList4;
                        arrayList5.add(a(cVar, c40704a, UUID.randomUUID().toString(), (384 & 8) != 0 ? null : arrayList3, (384 & 16) != 0 ? null : null, (384 & 32) != 0 ? null : null, listA, (384 & 128) == 0, (384 & 256) != 0));
                    }
                    listSingletonList = arrayList5;
                }
                z12 = true;
            }
            ArrayList arrayList14 = arrayList;
            C42745f0.h(listSingletonList, arrayList14);
            arrayList9 = arrayList14;
        }
        return C43175k.G(new c(this, arrayList9, list, null));
    }
}
