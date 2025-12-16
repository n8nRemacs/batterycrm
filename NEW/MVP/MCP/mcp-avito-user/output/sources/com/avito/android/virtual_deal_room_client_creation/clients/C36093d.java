package com.avito.android.virtual_deal_room_client_creation.clients;

import androidx.compose.ui.platform.ComposeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ClientsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36093d extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ClientsFragment f326522l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ComposeView f326523m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36093d(ClientsFragment clientsFragment, ComposeView composeView) {
        super(2);
        this.f326522l = clientsFragment;
        this.f326523m = composeView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    @Override // Y41.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(androidx.compose.runtime.A r14, java.lang.Integer r15) {
        /*
            r13 = this;
            r5 = r14
            androidx.compose.runtime.A r5 = (androidx.compose.runtime.A) r5
            java.lang.Number r15 = (java.lang.Number) r15
            int r14 = r15.intValue()
            r14 = r14 & 11
            r15 = 2
            if (r14 != r15) goto L1a
            boolean r14 = r5.c()
            if (r14 != 0) goto L15
            goto L1a
        L15:
            r5.f()
            goto Lc9
        L1a:
            com.avito.android.virtual_deal_room_client_creation.clients.ClientsFragment r14 = r13.f326522l
            androidx.lifecycle.O0 r15 = r14.f326486o0
            java.lang.Object r0 = r15.getValue()
            com.avito.android.virtual_deal_room_client_creation.clients.J r0 = (com.avito.android.virtual_deal_room_client_creation.clients.J) r0
            kotlinx.coroutines.flow.n2 r0 = r0.getState()
            androidx.compose.runtime.y1 r0 = androidx.compose.runtime.C22126m3.b(r0, r5)
            java.lang.Object r0 = r0.getF42167b()
            NN0.c r0 = (NN0.c) r0
            java.lang.Object r1 = r15.getValue()
            r8 = r1
            com.avito.android.virtual_deal_room_client_creation.clients.J r8 = (com.avito.android.virtual_deal_room_client_creation.clients.J) r8
            r1 = 832932372(0x31a58a14, float:4.8178297E-9)
            r5.C(r1)
            boolean r1 = r5.B(r8)
            java.lang.Object r2 = r5.t()
            androidx.compose.runtime.A$a r3 = androidx.compose.runtime.A.f37866a
            if (r1 != 0) goto L52
            r3.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r2 != r1) goto L63
        L52:
            com.avito.android.virtual_deal_room_client_creation.clients.a r2 = new com.avito.android.virtual_deal_room_client_creation.clients.a
            java.lang.String r11 = "accept(Ljava/lang/Object;)V"
            r12 = 0
            r7 = 1
            java.lang.Class<com.avito.android.virtual_deal_room_client_creation.clients.J> r9 = com.avito.android.virtual_deal_room_client_creation.clients.J.class
            java.lang.String r10 = "accept"
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r5.H(r2)
        L63:
            kotlin.reflect.i r2 = (kotlin.reflect.i) r2
            r5.h()
            r1 = r2
            Y41.l r1 = (Y41.l) r1
            r2 = 832934339(0x31a591c3, float:4.818703E-9)
            r5.C(r2)
            androidx.compose.ui.platform.ComposeView r2 = r13.f326523m
            boolean r4 = r5.B(r2)
            java.lang.Object r6 = r5.t()
            if (r4 != 0) goto L84
            r3.getClass()
            androidx.compose.runtime.A$a$a r4 = androidx.compose.runtime.A.a.f37868b
            if (r6 != r4) goto L8c
        L84:
            com.avito.android.virtual_deal_room_client_creation.clients.b r6 = new com.avito.android.virtual_deal_room_client_creation.clients.b
            r6.<init>(r14)
            r5.H(r6)
        L8c:
            r4 = r6
            Y41.l r4 = (Y41.l) r4
            r5.h()
            r6 = 832936713(0x31a59b09, float:4.8197575E-9)
            r5.C(r6)
            boolean r2 = r5.B(r2)
            java.lang.Object r6 = r5.t()
            if (r2 != 0) goto La9
            r3.getClass()
            androidx.compose.runtime.A$a$a r2 = androidx.compose.runtime.A.a.f37868b
            if (r6 != r2) goto Lb1
        La9:
            com.avito.android.virtual_deal_room_client_creation.clients.c r6 = new com.avito.android.virtual_deal_room_client_creation.clients.c
            r6.<init>(r14)
            r5.H(r6)
        Lb1:
            r3 = r6
            Y41.a r3 = (Y41.a) r3
            r5.h()
            java.lang.Object r14 = r15.getValue()
            com.avito.android.virtual_deal_room_client_creation.clients.J r14 = (com.avito.android.virtual_deal_room_client_creation.clients.J) r14
            kotlinx.coroutines.flow.i r14 = r14.getEvents()
            r6 = 32768(0x8000, float:4.5918E-41)
            r2 = r4
            r4 = r14
            com.avito.android.virtual_deal_room_client_creation.clients.C36101l.a(r0, r1, r2, r3, r4, r5, r6)
        Lc9:
            kotlin.G0 r14 = kotlin.G0.f406611a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.virtual_deal_room_client_creation.clients.C36093d.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
