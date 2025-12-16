package com.avito.android.bbl.screens.configure.deeplink;

import Y41.l;
import Y41.p;
import Y61.k;
import android.os.Bundle;
import com.avito.android.bbl.screens.configure.deeplink.BblConfigureSaveLink;
import com.avito.android.bbl.screens.configure.mvi.domain.e;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.H;
import kotlinx.coroutines.T;

/* compiled from: BblConfigureSaveDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bbl.screens.configure.deeplink.BblConfigureSaveDeeplinkHandler$doHandle$1", f = "BblConfigureSaveDeeplinkHandler.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f99132q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Bundle f99133r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f99134s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ BblConfigureSaveLink f99135t;

    /* compiled from: BblConfigureSaveDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements l<e.a, G0> {
        @Override // Y41.l
        public final G0 invoke(e.a aVar) {
            f fVar = (f) this.receiver;
            fVar.f99137g.g(fVar.d(), false);
            fVar.i(BblConfigureSaveLink.c.b.f99129b, fVar.f99136f, aVar.f99205a);
            return G0.f406611a;
        }
    }

    /* compiled from: BblConfigureSaveDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<String, G0> {
        @Override // Y41.l
        public final G0 invoke(String str) {
            f fVar = (f) this.receiver;
            fVar.f99137g.g(fVar.d(), false);
            PrintableText printableTextF = com.avito.android.printable_text.b.f(str);
            ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
            f.c.f125255c.getClass();
            a.i.C4057a.d(fVar.f99138h, printableTextF, null, null, f.c.a.b(), 0, toastBarPosition, null, null, 1966);
            fVar.j(BblConfigureSaveLink.c.a.f99128b);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Bundle bundle, f fVar, BblConfigureSaveLink bblConfigureSaveLink, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f99133r = bundle;
        this.f99134s = fVar;
        this.f99135t = bblConfigureSaveLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new e(this.f99133r, this.f99134s, this.f99135t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f99132q;
        f fVar = this.f99134s;
        if (i12 == 0) {
            C42729a0.b(obj);
            Bundle bundle = this.f99133r;
            Long lBoxLong = bundle != null ? Boxing.boxLong(bundle.getLong("key_bbl_configure_config_id", -1L)) : null;
            if (lBoxLong == null || lBoxLong.longValue() == -1) {
                fVar.j(BblConfigureSaveLink.c.a.f99128b);
                return G0.f406611a;
            }
            fVar.f99137g.g(fVar.d(), true);
            String str = this.f99135t.f99127b;
            long jLongValue = lBoxLong.longValue();
            this.f99132q = 1;
            obj = fVar.f99139i.a(jLongValue, str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        z.o((TypedResult) obj, new a(1, fVar, f.class, "onSuccess", "onSuccess(Lcom/avito/android/bbl/screens/configure/mvi/domain/PostBblConfigureSaveUseCaseImpl$Result;)V", 0), new b(1, fVar, f.class, "onError", "onError(Ljava/lang/String;)V", 0), null, 60);
        return G0.f406611a;
    }
}
