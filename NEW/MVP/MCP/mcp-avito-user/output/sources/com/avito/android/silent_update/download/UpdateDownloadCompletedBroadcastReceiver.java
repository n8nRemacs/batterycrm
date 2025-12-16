package com.avito.android.silent_update.download;

import Y41.p;
import Y61.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.view.C22984Q;
import androidx.view.C23050m0;
import com.avito.android.di.C29972i;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: UpdateDownloadCompletedBroadcastReceiver.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/silent_update/download/UpdateDownloadCompletedBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UpdateDownloadCompletedBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    @Inject
    public e f283629a;

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public Cw0.e f283630b;

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public com.avito.android.silent_update.a f283631c;

    /* renamed from: d, reason: collision with root package name */
    @Inject
    public Bw0.i f283632d;

    /* renamed from: e, reason: collision with root package name */
    @Inject
    public com.avito.android.silent_update.install.c f283633e;

    /* compiled from: UpdateDownloadCompletedBroadcastReceiver.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.silent_update.download.UpdateDownloadCompletedBroadcastReceiver$onReceive$1", f = "UpdateDownloadCompletedBroadcastReceiver.kt", i = {0, 0, 1}, l = {58, 59, 67, 69}, m = "invokeSuspend", n = {"sourceScreen", "configId", "sourceScreen"}, s = {"L$0", "L$1", "L$0"})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public String f283634q;

        /* renamed from: r, reason: collision with root package name */
        public String f283635r;

        /* renamed from: s, reason: collision with root package name */
        public int f283636s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f283638u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ long f283639v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Context f283640w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j12, long j13, Context context, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f283638u = j12;
            this.f283639v = j13;
            this.f283640w = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            return UpdateDownloadCompletedBroadcastReceiver.this.new a(this.f283638u, this.f283639v, this.f283640w, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:114:0x01ce  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x01d1  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x01f4  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x01f7  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x016c  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x016e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r30) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 698
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.silent_update.download.UpdateDownloadCompletedBroadcastReceiver.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@Y61.k Context context, @l Intent intent) {
        if (intent == null) {
            return;
        }
        com.avito.android.silent_update.di.a.a().a((Bw0.c) C29972i.a(C29972i.b(context.getApplicationContext()), Bw0.c.class)).b(this);
        if (L.f(intent.getAction(), "android.intent.action.DOWNLOAD_COMPLETE")) {
            long longExtra = intent.getLongExtra("extra_download_id", -1L);
            e eVar = this.f283629a;
            if (eVar == null) {
                eVar = null;
            }
            long jM2 = eVar.m();
            if (longExtra == -1 || jM2 != longExtra) {
                return;
            }
            C23050m0.f46822j.getClass();
            C43259k.d(C22984Q.a(C23050m0.f46823k), null, null, new a(longExtra, jM2, context, null), 3);
        }
    }
}
