package com.esiasdk.android;

import Y41.p;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.view.C22981N;
import androidx.view.P0;
import com.avito.android.R;
import com.esiasdk.android.data.network.model.ClientSessionInfo;
import com.esiasdk.android.esiaLoginClient.TokenParameters;
import i.b;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EsiaAuthActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/esiasdk/android/EsiaAuthActivity;", "Landroidx/appcompat/app/m;", "<init>", "()V", "esiasdk-1.1.3(6)_nonPguRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EsiaAuthActivity extends androidx.appcompat.app.m {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f339658d = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f339659b = C42727D.c(new e());

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<Intent> f339660c = registerForActivityResult(new b.m(), new com.avito.android.str_seller_orders.orders_seller.a(this, 6));

    /* compiled from: EsiaAuthActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.esiasdk.android.EsiaAuthActivity$onCreate$1", f = "EsiaAuthActivity.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f339661q;

        /* compiled from: EsiaAuthActivity.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/esiasdk/android/esiaLoginClient/TokenParameters;", "it", "Lkotlin/G0;", "emit", "(Lcom/esiasdk/android/esiaLoginClient/TokenParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* renamed from: com.esiasdk.android.EsiaAuthActivity$a$a, reason: collision with other inner class name */
        public static final class C10522a<T> implements InterfaceC43172j, SuspendFunction {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsiaAuthActivity f339663b;

            public C10522a(EsiaAuthActivity esiaAuthActivity) {
                this.f339663b = esiaAuthActivity;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                Intent intent = new Intent();
                intent.putExtra("EXTRA_TOKEN_PARAMS", (TokenParameters) obj);
                G0 g02 = G0.f406611a;
                EsiaAuthActivity esiaAuthActivity = this.f339663b;
                esiaAuthActivity.setResult(-1, intent);
                esiaAuthActivity.finish();
                return G0.f406611a;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return EsiaAuthActivity.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f339661q;
            if (i12 == 0) {
                C42729a0.b(obj);
                int i13 = EsiaAuthActivity.f339658d;
                EsiaAuthActivity esiaAuthActivity = EsiaAuthActivity.this;
                InterfaceC43160i<TokenParameters> interfaceC43160i = esiaAuthActivity.H1().f339728O;
                C10522a c10522a = new C10522a(esiaAuthActivity);
                this.f339661q = 1;
                if (interfaceC43160i.collect(c10522a, this) == coroutine_suspended) {
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

    /* compiled from: EsiaAuthActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.esiasdk.android.EsiaAuthActivity$onCreate$2", f = "EsiaAuthActivity.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f339664q;

        /* compiled from: EsiaAuthActivity.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/esiasdk/android/EsiaErrorResponse;", "it", "Lkotlin/G0;", "emit", "(Lcom/esiasdk/android/EsiaErrorResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        public static final class a<T> implements InterfaceC43172j, SuspendFunction {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsiaAuthActivity f339666b;

            public a(EsiaAuthActivity esiaAuthActivity) {
                this.f339666b = esiaAuthActivity;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                int i12 = EsiaAuthActivity.f339658d;
                EsiaAuthActivity esiaAuthActivity = this.f339666b;
                Intent intent = new Intent();
                intent.putExtra("EXTRA_ERROR_CODE", (Parcelable) obj);
                G0 g02 = G0.f406611a;
                esiaAuthActivity.setResult(-1, intent);
                esiaAuthActivity.finish();
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return EsiaAuthActivity.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f339664q;
            if (i12 == 0) {
                C42729a0.b(obj);
                int i13 = EsiaAuthActivity.f339658d;
                EsiaAuthActivity esiaAuthActivity = EsiaAuthActivity.this;
                InterfaceC43160i<EsiaErrorResponse> interfaceC43160i = esiaAuthActivity.H1().f339730Q;
                a aVar = new a(esiaAuthActivity);
                this.f339664q = 1;
                if (interfaceC43160i.collect(aVar, this) == coroutine_suspended) {
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

    /* compiled from: EsiaAuthActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.esiasdk.android.EsiaAuthActivity$onCreate$3", f = "EsiaAuthActivity.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f339667q;

        /* compiled from: EsiaAuthActivity.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/esiasdk/android/EsiaErrorResponse;", "it", "Lkotlin/G0;", "emit", "(Lcom/esiasdk/android/EsiaErrorResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        public static final class a<T> implements InterfaceC43172j, SuspendFunction {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsiaAuthActivity f339669b;

            public a(EsiaAuthActivity esiaAuthActivity) {
                this.f339669b = esiaAuthActivity;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                int i12 = EsiaAuthActivity.f339658d;
                EsiaAuthActivity esiaAuthActivity = this.f339669b;
                esiaAuthActivity.getClass();
                Intent intent = new Intent();
                intent.putExtra("EXTRA_BACK_PRESSED", true);
                intent.putExtra("EXTRA_ERROR_CODE", (Parcelable) obj);
                G0 g02 = G0.f406611a;
                esiaAuthActivity.setResult(0, intent);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return EsiaAuthActivity.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f339667q;
            if (i12 == 0) {
                C42729a0.b(obj);
                int i13 = EsiaAuthActivity.f339658d;
                EsiaAuthActivity esiaAuthActivity = EsiaAuthActivity.this;
                InterfaceC43160i<EsiaErrorResponse> interfaceC43160i = esiaAuthActivity.H1().f339732S;
                a aVar = new a(esiaAuthActivity);
                this.f339667q = 1;
                if (interfaceC43160i.collect(aVar, this) == coroutine_suspended) {
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

    /* compiled from: EsiaAuthActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.esiasdk.android.EsiaAuthActivity$onCreate$4", f = "EsiaAuthActivity.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f339670q;

        /* compiled from: EsiaAuthActivity.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "emit", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        public static final class a<T> implements InterfaceC43172j, SuspendFunction {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsiaAuthActivity f339672b;

            public a(EsiaAuthActivity esiaAuthActivity) {
                this.f339672b = esiaAuthActivity;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                String str = (String) obj;
                int i12 = EsiaAuthActivity.f339658d;
                EsiaAuthActivity esiaAuthActivity = this.f339672b;
                try {
                    esiaAuthActivity.f339660c.b(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                } catch (ActivityNotFoundException e12) {
                    e12.getMessage();
                }
                return G0.f406611a;
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return EsiaAuthActivity.this.new d(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f339670q;
            if (i12 == 0) {
                C42729a0.b(obj);
                int i13 = EsiaAuthActivity.f339658d;
                EsiaAuthActivity esiaAuthActivity = EsiaAuthActivity.this;
                InterfaceC43160i<String> interfaceC43160i = esiaAuthActivity.H1().f339726M;
                a aVar = new a(esiaAuthActivity);
                this.f339670q = 1;
                if (interfaceC43160i.collect(aVar, this) == coroutine_suspended) {
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

    /* compiled from: EsiaAuthActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/esiasdk/android/n;", "invoke", "()Lcom/esiasdk/android/n;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class e extends N implements Y41.a<n> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final n invoke() {
            return (n) new P0(EsiaAuthActivity.this).a(n.class);
        }
    }

    public final n H1() {
        return (n) this.f339659b.getValue();
    }

    @Override // androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.act_esia_sign_in);
        C22981N.a(getLifecycle()).c(new a(null));
        C22981N.a(getLifecycle()).c(new b(null));
        C22981N.a(getLifecycle()).c(new c(null));
        C22981N.a(getLifecycle()).c(new d(null));
        if (bundle == null) {
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra("EXTRA_ESIA_API_URL");
            ClientSessionInfo clientSessionInfo = (ClientSessionInfo) intent.getParcelableExtra("EXTRA_CLIENT_SESSION");
            if (stringExtra == null || clientSessionInfo == null) {
                EsiaErrorResponse esiaErrorResponse = new EsiaErrorResponse(2, null, null, 6, null);
                Intent intent2 = new Intent();
                intent2.putExtra("EXTRA_ERROR_CODE", (Parcelable) esiaErrorResponse);
                G0 g02 = G0.f406611a;
                setResult(-1, intent2);
                finish();
                return;
            }
            String stringExtra2 = intent.getStringExtra("EXTRA_PERMISSIONS");
            if (stringExtra2 == null || stringExtra2.length() == 0) {
                n nVarH1 = H1();
                nVarH1.f339723J.setValue(Boolean.TRUE);
                nVarH1.f339724K.setValue(Boolean.FALSE);
                n.le(nVarH1, new com.esiasdk.android.b(nVarH1, stringExtra, clientSessionInfo, null), new com.esiasdk.android.c(nVarH1), new com.esiasdk.android.d(nVarH1));
                return;
            }
            n nVarH12 = H1();
            nVarH12.f339723J.setValue(Boolean.TRUE);
            nVarH12.f339724K.setValue(Boolean.FALSE);
            n.le(nVarH12, new com.esiasdk.android.e(nVarH12, stringExtra, clientSessionInfo, stringExtra2, null), new f(nVarH12), new g(nVarH12));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    @Override // androidx.view.n, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNewIntent(@Y61.l android.content.Intent r13) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esiasdk.android.EsiaAuthActivity.onNewIntent(android.content.Intent):void");
    }
}
