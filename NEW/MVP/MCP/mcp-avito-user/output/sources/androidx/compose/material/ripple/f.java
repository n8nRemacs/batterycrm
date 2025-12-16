package androidx.compose.material.ripple;

import androidx.collection.R0;
import androidx.compose.foundation.interaction.o;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.InterfaceC22242a0;
import androidx.compose.ui.node.C22440v;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: CommonRipple.kt */
@P
@s0
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/material/ripple/f;", "Landroidx/compose/material/ripple/x;", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "", "bounded", "Landroidx/compose/ui/unit/h;", "radius", "Landroidx/compose/ui/graphics/a0;", "color", "Lkotlin/Function0;", "Landroidx/compose/material/ripple/l;", "rippleAlpha", "<init>", "(Landroidx/compose/foundation/interaction/k;ZFLandroidx/compose/ui/graphics/a0;LY41/a;Lkotlin/jvm/internal/w;)V", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f extends x {

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final R0<o.b, p> f34082z;

    /* compiled from: CommonRipple.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.ripple.CommonRippleNode$addRipple$2", f = "CommonRipple.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f34083q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ p f34084r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ f f34085s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ o.b f34086t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, f fVar, o.b bVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f34084r = pVar;
            this.f34085s = fVar;
            this.f34086t = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f34084r, this.f34085s, this.f34086t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f34083q;
            o.b bVar = this.f34086t;
            f fVar = this.f34085s;
            try {
                if (i12 == 0) {
                    C42729a0.b(obj);
                    p pVar = this.f34084r;
                    this.f34083q = 1;
                    if (pVar.a(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                fVar.f34082z.k(bVar);
                C22440v.a(fVar);
                return G0.f406611a;
            } catch (Throwable th2) {
                fVar.f34082z.k(bVar);
                C22440v.a(fVar);
                throw th2;
            }
        }
    }

    public f() {
        throw null;
    }

    public f(androidx.compose.foundation.interaction.k kVar, boolean z12, float f12, InterfaceC22242a0 interfaceC22242a0, Y41.a aVar, C42822w c42822w) {
        super(kVar, z12, f12, interfaceC22242a0, aVar, null);
        this.f34082z = new R0<>(0, 1, null);
    }

    @Override // androidx.compose.ui.v.d
    public final void d2() {
        this.f34082z.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    @Override // androidx.compose.material.ripple.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k2(@Y61.k androidx.compose.foundation.interaction.o.b r19, long r20, float r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            androidx.collection.R0<androidx.compose.foundation.interaction.o$b, androidx.compose.material.ripple.p> r2 = r0.f34082z
            java.lang.Object[] r3 = r2.f25722b
            java.lang.Object[] r4 = r2.f25723c
            long[] r5 = r2.f25721a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L51
            r7 = 0
            r8 = r7
        L13:
            r9 = r5[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L4c
            int r11 = r8 - r6
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r7
        L2d:
            if (r13 >= r11) goto L4a
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L46
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r4[r14]
            androidx.compose.material.ripple.p r14 = (androidx.compose.material.ripple.p) r14
            androidx.compose.foundation.interaction.o$b r15 = (androidx.compose.foundation.interaction.o.b) r15
            r14.c()
        L46:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L2d
        L4a:
            if (r11 != r12) goto L51
        L4c:
            if (r8 == r6) goto L51
            int r8 = r8 + 1
            goto L13
        L51:
            r3 = 0
            boolean r4 = r0.f34148q
            if (r4 == 0) goto L5d
            long r5 = r1.f28149a
            l0.g r5 = l0.g.a(r5)
            goto L5e
        L5d:
            r5 = r3
        L5e:
            androidx.compose.material.ripple.p r6 = new androidx.compose.material.ripple.p
            r7 = r22
            r6.<init>(r5, r7, r4, r3)
            r2.m(r1, r6)
            kotlinx.coroutines.T r2 = r18.Y1()
            androidx.compose.material.ripple.f$a r4 = new androidx.compose.material.ripple.f$a
            r4.<init>(r6, r0, r1, r3)
            r1 = 3
            kotlinx.coroutines.C43259k.d(r2, r3, r3, r4, r1)
            androidx.compose.ui.node.C22440v.a(r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.f.k2(androidx.compose.foundation.interaction.o$b, long, float):void");
    }

    @Override // androidx.compose.material.ripple.x
    public final void l2(@Y61.k androidx.compose.ui.graphics.drawscope.d dVar) {
        float f12 = this.f34151t.invoke().f34100d;
        if (f12 == 0.0f) {
            return;
        }
        R0<o.b, p> r02 = this.f34082z;
        Object[] objArr = r02.f25722b;
        Object[] objArr2 = r02.f25723c;
        long[] jArr = r02.f25721a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            long j12 = jArr[i12];
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i12 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j12) < 128) {
                        int i15 = (i12 << 3) + i14;
                        ((p) objArr2[i15]).b(dVar, androidx.compose.ui.graphics.T.c(this.f34150s.a(), f12));
                    }
                    j12 >>= 8;
                }
                if (i13 != 8) {
                    return;
                }
            }
            if (i12 == length) {
                return;
            } else {
                i12++;
            }
        }
    }

    @Override // androidx.compose.material.ripple.x
    public final void n2(@Y61.k o.b bVar) {
        p pVarE = this.f34082z.e(bVar);
        if (pVarE != null) {
            pVarE.c();
        }
    }
}
