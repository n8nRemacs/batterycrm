package com.avito.android.code_check;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import androidx.view.C19918B;
import androidx.view.C22981N;
import androidx.view.x;
import com.avito.android.K;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.code_check.q;
import com.avito.android.code_check_public.CodeCheckLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.util.K2;
import cv.InterfaceC39417a;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43189o1;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;

/* compiled from: CodeCheckActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/code_check/CodeCheckActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/code_check/o;", "Lcom/avito/android/analytics/screens/j$a;", "Lcom/avito/android/K;", "Lcom/avito/android/code_check/c;", "<init>", "()V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes12.dex */
public final class CodeCheckActivity extends com.avito.android.ui.activity.a implements o, InterfaceC28477j.a, K<com.avito.android.code_check.c> {

    /* renamed from: m, reason: collision with root package name */
    public com.avito.android.code_check.c f118600m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public com.avito.android.code_check_public.d f118601n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public CodeCheckLink.Flow f118602o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public InterfaceC30274a f118603p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f118604q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public d f118605r;

    /* compiled from: CodeCheckActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/x;", "Lkotlin/G0;", "invoke", "(Landroidx/activity/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<x, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(x xVar) {
            CodeCheckActivity codeCheckActivity = CodeCheckActivity.this;
            FragmentManager supportFragmentManager = codeCheckActivity.getSupportFragmentManager();
            if (supportFragmentManager.L() > 1) {
                supportFragmentManager.Y();
            } else {
                K2.c(codeCheckActivity);
                codeCheckActivity.finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CodeCheckActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.code_check.CodeCheckActivity$setupArguments$1$1", f = "CodeCheckActivity.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f118607q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ CodeCheckLink.Arguments f118609s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CodeCheckLink.Arguments arguments, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f118609s = arguments;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return CodeCheckActivity.this.new b(this.f118609s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f118607q;
            if (i12 == 0) {
                C42729a0.b(obj);
                d dVar = CodeCheckActivity.this.f118605r;
                if (dVar == null) {
                    dVar = null;
                }
                CodeCheckLink.Arguments arguments = this.f118609s;
                List<String> list = arguments.f119246e;
                String str = arguments.f119243b;
                CodeCheckData codeCheckData = new CodeCheckData(arguments.f119245d, arguments.f119244c, str, list);
                this.f118607q = 1;
                if (dVar.f7(codeCheckData, this) == coroutine_suspended) {
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

    /* compiled from: CodeCheckActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/code_check_public/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/code_check_public/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.code_check.CodeCheckActivity$showDialog$1", f = "CodeCheckActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<com.avito.android.code_check_public.a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f118610q;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = CodeCheckActivity.this.new c(continuation);
            cVar.f118610q = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(com.avito.android.code_check_public.a aVar, Continuation<? super G0> continuation) {
            return ((c) create(aVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            p.b(CodeCheckActivity.this, (com.avito.android.code_check_public.a) this.f118610q);
            return G0.f406611a;
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        new q.c();
        j jVar = (j) C29972i.a(C29972i.b(this), j.class);
        InterfaceC39417a interfaceC39417aA = cv.c.a(this);
        Intent intent = getIntent();
        this.f118600m = new q.b(new l(), new s(), jVar, interfaceC39417aA, this, (CodeCheckLink.Flow) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("codeFlow", CodeCheckLink.Flow.class) : intent.getParcelableExtra("codeFlow")), null);
    }

    public final void a2() {
        Intent intent = getIntent();
        CodeCheckLink.Arguments arguments = (CodeCheckLink.Arguments) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("codeDeeplinkArgs", CodeCheckLink.Arguments.class) : intent.getParcelableExtra("codeDeeplinkArgs"));
        if (arguments != null) {
            C43259k.d(C22981N.a(getLifecycle()), null, null, new b(arguments, null), 3);
        }
        com.avito.android.code_check_public.d dVar = this.f118601n;
        p.b(this, (dVar != null ? dVar : null).f119285a);
    }

    @Override // com.avito.android.code_check.o
    public final void b1(@Y61.k com.avito.android.code_check_public.i iVar) {
        InterfaceC30274a interfaceC30274a = this.f118603p;
        if (interfaceC30274a == null) {
            interfaceC30274a = null;
        }
        C43175k.K(new C43197r1(new c(null), new C43189o1(iVar.f119293b.invoke(y.a(interfaceC30274a.f(iVar.f119292a.k0(this)).q())))), C22981N.a(getLifecycle()));
    }

    @Override // com.avito.android.code_check.o
    public final void g(@Y61.k DeepLink deepLink) {
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f118604q;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, deepLink, null, null, 6);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        com.avito.android.code_check.c cVar = this.f118600m;
        if (cVar == null) {
            cVar = null;
        }
        q.b bVar = (q.b) cVar;
        this.f118601n = bVar.f119234k.get();
        this.f118602o = bVar.f119227d;
        this.f118603p = bVar.f119237n.get();
        com.avito.android.deeplink_handler.handler.composite.a aVarU4 = bVar.f119226c.u4();
        dagger.internal.t.c(aVarU4);
        this.f118604q = aVarU4;
        this.f118605r = bVar.f119232i.get();
        C19918B.a(getF21241d(), this, new a(), 2);
        if (bundle == null) {
            a2();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@Y61.k Intent intent) {
        super.onNewIntent(intent);
        a2();
    }

    @Override // com.avito.android.K
    public final InterfaceC29971h r0() {
        com.avito.android.code_check.c cVar = this.f118600m;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }
}
