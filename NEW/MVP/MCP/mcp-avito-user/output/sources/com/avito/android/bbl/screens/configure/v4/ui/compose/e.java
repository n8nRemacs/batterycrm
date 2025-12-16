package com.avito.android.bbl.screens.configure.v4.ui.compose;

import Bh.InterfaceC13147b;
import android.os.Bundle;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BblConfigureV4Screen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bbl.screens.configure.v4.ui.compose.BblConfigureV4ScreenKt$BblConfigureV4Screen$1", f = "BblConfigureV4Screen.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class e extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f99538q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<InterfaceC13147b> f99539r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.m f99540s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f99541t;

    /* compiled from: BblConfigureV4Screen.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LBh/b;", "event", "Lkotlin/G0;", "emit", "(LBh/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.app.m f99542b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f99543c;

        public a(androidx.appcompat.app.m mVar, InterfaceC22204y1 interfaceC22204y1) {
            this.f99542b = mVar;
            this.f99543c = interfaceC22204y1;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            androidx.appcompat.app.m mVar;
            InterfaceC13147b interfaceC13147b = (InterfaceC13147b) obj;
            if (interfaceC13147b instanceof InterfaceC13147b.C0067b) {
                InterfaceC13147b.C0067b c0067b = (InterfaceC13147b.C0067b) interfaceC13147b;
                Long l12 = c0067b.f1597b;
                Bundle bundle = null;
                Object obj2 = l12 != null ? "key_bbl_configure_config_id" : null;
                if (l12 != null) {
                    long jLongValue = l12.longValue();
                    bundle = new Bundle();
                    bundle.putLong("key_bbl_configure_config_id", jLongValue);
                }
                ((Y41.q) this.f99543c.getF42167b()).invoke(c0067b.f1596a, obj2, bundle);
            } else if ((interfaceC13147b instanceof InterfaceC13147b.a) && (mVar = this.f99542b) != null) {
                mVar.onBackPressed();
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InterfaceC43160i interfaceC43160i, androidx.appcompat.app.m mVar, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
        super(2, continuation);
        this.f99539r = interfaceC43160i;
        this.f99540s = mVar;
        this.f99541t = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new e(this.f99539r, this.f99540s, this.f99541t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f99538q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a(this.f99540s, this.f99541t);
            this.f99538q = 1;
            if (this.f99539r.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
