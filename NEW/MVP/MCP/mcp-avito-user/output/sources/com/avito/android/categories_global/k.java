package com.avito.android.categories_global;

import Ln.d;
import android.app.Activity;
import android.net.Uri;
import androidx.view.C23315U;
import androidx.view.C23397v;
import com.akita.compose.component.toast_bar.J;
import com.akita.compose.component.toast_bar.ToastBarDuration;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CategoriesScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.categories_global.CategoriesScreenKt$CategoriesScreen$2", f = "CategoriesScreen.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class k extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f116387q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y f116388r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C23397v f116389s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Activity f116390t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f116391u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ J f116392v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f116393w;

    /* compiled from: CategoriesScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LLn/d;", "event", "Lkotlin/G0;", "emit", "(LLn/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C23397v f116394b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Activity f116395c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f116396d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ J f116397e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f116398f;

        public a(C23397v c23397v, Activity activity, com.akita.compose.component.toast_bar.u uVar, J j12, String str) {
            this.f116394b = c23397v;
            this.f116395c = activity;
            this.f116396d = uVar;
            this.f116397e = j12;
            this.f116398f = str;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            Activity activity;
            Ln.d dVar = (Ln.d) obj;
            boolean zF2 = L.f(dVar, d.a.f10114a);
            C23397v c23397v = this.f116394b;
            if (zF2) {
                if (!c23397v.o() && (activity = this.f116395c) != null) {
                    activity.finish();
                }
            } else if (dVar instanceof d.b) {
                Uri uri = ((d.b) dVar).f10115a;
                c23397v.getClass();
                c23397v.l(new C23315U(uri, null, null), null);
            } else if (dVar instanceof d.c) {
                ((d.c) dVar).getClass();
                Object objA = this.f116396d.a(this.f116397e, this.f116398f, G0.f406611a, (60 & 8) != 0 ? null : null, (60 & 32) != 0 ? ToastBarDuration.f63230b : null, (60 & 64) != 0 ? ToastBarPosition.f63235b : null, (60 & 128) != 0 ? false : false, continuation);
                return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(y yVar, C23397v c23397v, Activity activity, com.akita.compose.component.toast_bar.u uVar, J j12, String str, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f116388r = yVar;
        this.f116389s = c23397v;
        this.f116390t = activity;
        this.f116391u = uVar;
        this.f116392v = j12;
        this.f116393w = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new k(this.f116388r, this.f116389s, this.f116390t, this.f116391u, this.f116392v, this.f116393w, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((k) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f116387q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a(this.f116389s, this.f116390t, this.f116391u, this.f116392v, this.f116393w);
            this.f116387q = 1;
            if (this.f116388r.ke(aVar, this) == coroutine_suspended) {
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
