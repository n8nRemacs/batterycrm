package com.avito.android.messenger.conversation.mvi.messages.utils;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.h0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Preview.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j {

    /* compiled from: Preview.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<h0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f193588l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(h0 h0Var) {
            return G0.f406611a;
        }
    }

    /* compiled from: Preview.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ v f193589l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T1 f193590m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<h0, G0> f193591n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ float f193592o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v vVar, T1 t12, Y41.l lVar, float f12) {
            super(2);
            this.f193589l = vVar;
            this.f193590m = t12;
            this.f193591n = lVar;
            this.f193592o = f12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                v vVarD0 = this.f193589l.d0(C20588k2.d(v.f42878y1, 1.0f));
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.foundation.ui.n.a(vVarD0, null, 0.0f, com.akita.compose.theme.re23.b.f63984b.f63851H1, null, androidx.compose.runtime.internal.r.c(-1229318013, new k(this.f193590m, this.f193591n, this.f193592o), a13), a13, 1572864, 54);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: Preview.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ T1 f193593l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ v f193594m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f193595n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ float f193596o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.l<h0, G0> f193597p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f193598q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f193599r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(T1 t12, v vVar, boolean z12, float f12, Y41.l<? super h0, G0> lVar, int i12, int i13) {
            super(2);
            this.f193593l = t12;
            this.f193594m = vVar;
            this.f193595n = z12;
            this.f193596o = f12;
            this.f193597p = lVar;
            this.f193598q = i12;
            this.f193599r = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f193598q | 1);
            Y41.l<h0, G0> lVar = this.f193597p;
            boolean z12 = this.f193595n;
            j.a(this.f193593l, this.f193594m, z12, this.f193596o, lVar, a12, iA2, this.f193599r);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.avito.android.messenger.conversation.T1 r11, @Y61.l androidx.compose.ui.v r12, boolean r13, float r14, @Y61.l Y41.l<? super com.avito.android.messenger.conversation.mvi.messages.h0, kotlin.G0> r15, @Y61.l androidx.compose.runtime.A r16, int r17, int r18) {
        /*
            r1 = r11
            r0 = 48
            r2 = 1
            r3 = -1193657670(0xffffffffb8da3aba, float:-1.0405989E-4)
            r4 = r16
            androidx.compose.runtime.B r3 = r4.E(r3)
            r4 = r17 & 14
            if (r4 != 0) goto L1d
            boolean r4 = r3.B(r11)
            if (r4 == 0) goto L19
            r4 = 4
            goto L1a
        L19:
            r4 = 2
        L1a:
            r4 = r17 | r4
            goto L1f
        L1d:
            r4 = r17
        L1f:
            r5 = r18 & 1
            if (r5 == 0) goto L26
            r4 = r4 | r0
        L24:
            r6 = r12
            goto L37
        L26:
            r6 = r17 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L24
            r6 = r12
            boolean r7 = r3.B(r12)
            if (r7 == 0) goto L34
            r7 = 32
            goto L36
        L34:
            r7 = 16
        L36:
            r4 = r4 | r7
        L37:
            r4 = r4 | 28032(0x6d80, float:3.9281E-41)
            r7 = 46811(0xb6db, float:6.5596E-41)
            r4 = r4 & r7
            r7 = 9362(0x2492, float:1.3119E-41)
            if (r4 != r7) goto L50
            boolean r4 = r3.c()
            if (r4 != 0) goto L48
            goto L50
        L48:
            r3.f()
            r4 = r13
            r5 = r14
            r2 = r6
            r6 = r15
            goto L70
        L50:
            if (r5 == 0) goto L55
            androidx.compose.ui.v$a r4 = androidx.compose.ui.v.f42878y1
            goto L56
        L55:
            r4 = r6
        L56:
            r5 = 12
            float r5 = (float) r5
            androidx.compose.ui.unit.h$a r6 = androidx.compose.ui.unit.h.f42849c
            com.avito.android.messenger.conversation.mvi.messages.utils.j$a r6 = com.avito.android.messenger.conversation.mvi.messages.utils.j.a.f193588l
            com.avito.android.messenger.conversation.mvi.messages.utils.j$b r7 = new com.avito.android.messenger.conversation.mvi.messages.utils.j$b
            r7.<init>(r4, r11, r6, r5)
            r8 = 417846079(0x18e7d33f, float:5.9925405E-24)
            androidx.compose.runtime.internal.n r7 = androidx.compose.runtime.internal.r.c(r8, r7, r3)
            r8 = 0
            com.akita.compose.theme.re23.c.a(r8, r7, r3, r0, r2)
            r10 = r4
            r4 = r2
            r2 = r10
        L70:
            androidx.compose.runtime.c2 r8 = r3.Z()
            if (r8 == 0) goto L86
            com.avito.android.messenger.conversation.mvi.messages.utils.j$c r9 = new com.avito.android.messenger.conversation.mvi.messages.utils.j$c
            r0 = r9
            r1 = r11
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f38184d = r9
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.messages.utils.j.a(com.avito.android.messenger.conversation.T1, androidx.compose.ui.v, boolean, float, Y41.l, androidx.compose.runtime.A, int, int):void");
    }
}
