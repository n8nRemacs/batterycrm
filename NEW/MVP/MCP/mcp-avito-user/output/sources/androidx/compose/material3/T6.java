package androidx.compose.material3;

import androidx.compose.animation.core.C20273d1;
import androidx.compose.animation.core.InterfaceC20307p;
import androidx.compose.runtime.C22040c3;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: NavigationDrawer.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/material3/n;", "Landroidx/compose/material3/N6;", "Landroidx/compose/material3/DrawerValue;", AdvertDetailsBlockIdKt.BLOCK_ID_ITEM_ANCHOR_TRUST_FACTORS, "latestTarget", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/material3/n;Landroidx/compose/material3/N6;Landroidx/compose/material3/DrawerValue;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.DrawerState$animateTo$3", f = "NavigationDrawer.kt", i = {}, l = {246}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class T6 extends SuspendLambda implements Y41.r<InterfaceC21735n, N6<DrawerValue>, DrawerValue, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f35474q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC21735n f35475r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ N6 f35476s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ DrawerValue f35477t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Q6 f35478u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f35479v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20307p<Float> f35480w;

    /* compiled from: NavigationDrawer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "value", "velocity", "Lkotlin/G0;", "invoke", "(FF)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<Float, Float, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC21735n f35481l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l0.e f35482m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC21735n interfaceC21735n, l0.e eVar) {
            super(2);
            this.f35481l = interfaceC21735n;
            this.f35482m = eVar;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(Float f12, Float f13) {
            float fFloatValue = f12.floatValue();
            this.f35481l.a(fFloatValue, f13.floatValue());
            this.f35482m.f406839b = fFloatValue;
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T6(Q6 q62, float f12, InterfaceC20307p<Float> interfaceC20307p, Continuation<? super T6> continuation) {
        super(4, continuation);
        this.f35478u = q62;
        this.f35479v = f12;
        this.f35480w = interfaceC20307p;
    }

    @Override // Y41.r
    public final Object invoke(InterfaceC21735n interfaceC21735n, N6<DrawerValue> n62, DrawerValue drawerValue, Continuation<? super kotlin.G0> continuation) {
        T6 t62 = new T6(this.f35478u, this.f35479v, this.f35480w, continuation);
        t62.f35475r = interfaceC21735n;
        t62.f35476s = n62;
        t62.f35477t = drawerValue;
        return t62.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f35474q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC21735n interfaceC21735n = this.f35475r;
            float fC2 = this.f35476s.c(this.f35477t);
            if (!Float.isNaN(fC2)) {
                l0.e eVar = new l0.e();
                Q6 q62 = this.f35478u;
                float f12 = Float.isNaN(((C22040c3) q62.f35344a.f37498j).f()) ? 0.0f : ((C22040c3) q62.f35344a.f37498j).f();
                eVar.f406839b = f12;
                a aVar = new a(interfaceC21735n, eVar);
                this.f35475r = null;
                this.f35476s = null;
                this.f35474q = 1;
                if (C20273d1.a(f12, fC2, this.f35479v, this.f35480w, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
