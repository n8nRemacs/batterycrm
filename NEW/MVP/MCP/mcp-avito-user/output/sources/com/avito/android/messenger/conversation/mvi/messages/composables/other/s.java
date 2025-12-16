package com.avito.android.messenger.conversation.mvi.messages.composables.other;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.graphics.InterfaceC22276o0;
import androidx.compose.ui.unit.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TypingIndicatorContent.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class s {

    /* compiled from: TypingIndicatorContent.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/unit/q;", "invoke-Bjo55l4", "(Landroidx/compose/ui/unit/d;)J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<Float> f192832l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<Float> aVar) {
            super(1);
            this.f192832l = aVar;
        }

        @Override // Y41.l
        public final androidx.compose.ui.unit.q invoke(androidx.compose.ui.unit.d dVar) {
            float fFloatValue = this.f192832l.invoke().floatValue();
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            return androidx.compose.ui.unit.q.a((0 << 32) | (dVar.y0(fFloatValue) & 4294967295L));
        }
    }

    /* compiled from: TypingIndicatorContent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/o0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/o0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<InterfaceC22276o0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<Float> f192833l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a<Float> aVar) {
            super(1);
            this.f192833l = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC22276o0 interfaceC22276o0) {
            interfaceC22276o0.setAlpha(this.f192833l.invoke().floatValue());
            return G0.f406611a;
        }
    }

    /* compiled from: TypingIndicatorContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<Float> f192834l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<Float> f192835m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i12, Y41.a aVar, Y41.a aVar2) {
            super(2);
            this.f192834l = aVar;
            this.f192835m = aVar2;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            s.a(this.f192834l, this.f192835m, a12, iA2);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k Y41.a<java.lang.Float> r8, @Y61.k Y41.a<java.lang.Float> r9, @Y61.l androidx.compose.runtime.A r10, int r11) {
        /*
            r0 = -837962379(0xffffffffce0db575, float:-5.9436986E8)
            androidx.compose.runtime.B r10 = r10.E(r0)
            boolean r0 = r10.u(r8)
            r1 = 4
            if (r0 == 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = 2
        L11:
            r0 = r0 | r11
            boolean r2 = r10.u(r9)
            r3 = 32
            if (r2 == 0) goto L1c
            r2 = r3
            goto L1e
        L1c:
            r2 = 16
        L1e:
            r0 = r0 | r2
            r2 = r0 & 91
            r4 = 18
            if (r2 != r4) goto L31
            boolean r2 = r10.c()
            if (r2 != 0) goto L2c
            goto L31
        L2c:
            r10.f()
            goto Laa
        L31:
            androidx.compose.ui.v$a r2 = androidx.compose.ui.v.f42878y1
            r4 = 6
            float r4 = (float) r4
            androidx.compose.ui.unit.h$a r5 = androidx.compose.ui.unit.h.f42849c
            androidx.compose.ui.v r2 = androidx.compose.foundation.layout.C20588k2.o(r2, r4)
            r4 = -1605388831(0xffffffffa04fb5e1, float:-1.7593761E-19)
            r10.C(r4)
            r4 = r0 & 14
            r5 = 0
            r6 = 1
            if (r4 != r1) goto L49
            r1 = r6
            goto L4a
        L49:
            r1 = r5
        L4a:
            java.lang.Object r4 = r10.t()
            androidx.compose.runtime.A$a r7 = androidx.compose.runtime.A.f37866a
            if (r1 != 0) goto L59
            r7.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r4 != r1) goto L61
        L59:
            com.avito.android.messenger.conversation.mvi.messages.composables.other.s$a r4 = new com.avito.android.messenger.conversation.mvi.messages.composables.other.s$a
            r4.<init>(r8)
            r10.H(r4)
        L61:
            Y41.l r4 = (Y41.l) r4
            r10.X(r5)
            androidx.compose.ui.v r1 = androidx.compose.foundation.layout.M1.a(r2, r4)
            r2 = -1605385496(0xffffffffa04fc2e8, float:-1.7598071E-19)
            r10.C(r2)
            r0 = r0 & 112(0x70, float:1.57E-43)
            if (r0 != r3) goto L75
            goto L76
        L75:
            r6 = r5
        L76:
            java.lang.Object r0 = r10.t()
            if (r6 != 0) goto L83
            r7.getClass()
            androidx.compose.runtime.A$a$a r2 = androidx.compose.runtime.A.a.f37868b
            if (r0 != r2) goto L8b
        L83:
            com.avito.android.messenger.conversation.mvi.messages.composables.other.s$b r0 = new com.avito.android.messenger.conversation.mvi.messages.composables.other.s$b
            r0.<init>(r9)
            r10.H(r0)
        L8b:
            Y41.l r0 = (Y41.l) r0
            r10.X(r5)
            androidx.compose.ui.v r0 = androidx.compose.ui.graphics.C22274n0.a(r1, r0)
            com.akita.compose.theme.re23.b r1 = com.akita.compose.theme.re23.b.f63983a
            r1.getClass()
            com.akita.compose.theme.re23.a r1 = com.akita.compose.theme.re23.b.f63984b
            com.akita.compose.foundation.p r1 = r1.f63830A1
            long r1 = r1.c(r10)
            androidx.compose.foundation.shape.n r3 = androidx.compose.foundation.shape.o.f30153a
            androidx.compose.ui.v r0 = androidx.compose.foundation.A.b(r0, r1, r3)
            androidx.compose.foundation.layout.C20632w.a(r0, r10, r5)
        Laa:
            androidx.compose.runtime.c2 r10 = r10.Z()
            if (r10 == 0) goto Lb7
            com.avito.android.messenger.conversation.mvi.messages.composables.other.s$c r0 = new com.avito.android.messenger.conversation.mvi.messages.composables.other.s$c
            r0.<init>(r11, r8, r9)
            r10.f38184d = r0
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.messages.composables.other.s.a(Y41.a, Y41.a, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e9  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.l androidx.compose.ui.v r10, @Y61.l androidx.compose.runtime.A r11, int r12) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.messages.composables.other.s.b(androidx.compose.ui.v, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    @androidx.compose.runtime.InterfaceC22132o
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.animation.core.C20281g0.a c(@Y61.k androidx.compose.animation.core.C20281g0 r10, int r11, float r12, float r13, @Y61.l androidx.compose.runtime.A r14) {
        /*
            r0 = 893861301(0x35473db5, float:7.422307E-7)
            r14.C(r0)
            r0 = -1199067841(0xffffffffb887ad3f, float:-6.469571E-5)
            r14.C(r0)
            boolean r0 = r14.m(r11)
            java.lang.Object r1 = r14.t()
            if (r0 != 0) goto L1f
            androidx.compose.runtime.A$a r0 = androidx.compose.runtime.A.f37866a
            r0.getClass()
            androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
            if (r1 != r0) goto L27
        L1f:
            com.avito.android.messenger.conversation.mvi.messages.composables.other.x r1 = new com.avito.android.messenger.conversation.mvi.messages.composables.other.x
            r1.<init>(r12, r13, r11)
            r14.H(r1)
        L27:
            Y41.l r1 = (Y41.l) r1
            r14.h()
            androidx.compose.animation.core.n0 r11 = androidx.compose.animation.core.C20310q.b(r1)
            r12 = 0
            r0 = 0
            r13 = 6
            androidx.compose.animation.core.f0 r5 = androidx.compose.animation.core.C20310q.a(r11, r12, r0, r13)
            r4 = 0
            r6 = 0
            r3 = 0
            r8 = 4536(0x11b8, float:6.356E-42)
            r9 = 8
            r2 = r10
            r7 = r14
            androidx.compose.animation.core.g0$a r10 = androidx.compose.animation.core.C20293k0.a(r2, r3, r4, r5, r6, r7, r8, r9)
            r14.h()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.messages.composables.other.s.c(androidx.compose.animation.core.g0, int, float, float, androidx.compose.runtime.A):androidx.compose.animation.core.g0$a");
    }
}
