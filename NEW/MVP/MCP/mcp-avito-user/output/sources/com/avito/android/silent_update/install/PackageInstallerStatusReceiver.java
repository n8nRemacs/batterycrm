package com.avito.android.silent_update.install;

import Dw0.C13448a;
import Dw0.C13449b;
import Dw0.C13452e;
import Dw0.C13455h;
import Dw0.InterfaceC13450c;
import Y41.p;
import Y61.k;
import Y61.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.view.C22984Q;
import androidx.view.C23050m0;
import androidx.view.Lifecycle;
import com.avito.android.di.C29972i;
import com.avito.android.silent_update.DownloadUpdateConfig;
import com.avito.android.silent_update.download.e;
import java.io.File;
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

/* compiled from: PackageInstallerStatusReceiver.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/silent_update/install/PackageInstallerStatusReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PackageInstallerStatusReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    @Inject
    public e f283665a;

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public com.avito.android.silent_update.a f283666b;

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public C13452e f283667c;

    /* compiled from: PackageInstallerStatusReceiver.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.silent_update.install.PackageInstallerStatusReceiver$deleteDownloadedFile$1", f = "PackageInstallerStatusReceiver.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f283668q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ long f283670s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f283671t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j12, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f283670s = j12;
            this.f283671t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return PackageInstallerStatusReceiver.this.new a(this.f283670s, this.f283671t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            String path;
            String str = this.f283671t;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f283668q;
            long j12 = this.f283670s;
            PackageInstallerStatusReceiver packageInstallerStatusReceiver = PackageInstallerStatusReceiver.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                e eVar = packageInstallerStatusReceiver.f283665a;
                if (eVar == null) {
                    eVar = null;
                }
                this.f283668q = 1;
                obj = eVar.b(j12, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            Uri uri = (Uri) obj;
            if (uri == null || (path = uri.getPath()) == null) {
                return G0.f406611a;
            }
            File file = new File(path);
            try {
                if (file.exists()) {
                    boolean zDelete = file.delete();
                    C13452e c13452e = packageInstallerStatusReceiver.f283667c;
                    if (c13452e == null) {
                        c13452e = null;
                    }
                    c13452e.getClass();
                    c13452e.f3560a.c(new C13455h(String.valueOf(zDelete), str));
                }
            } catch (Exception unused) {
                C13452e c13452e2 = packageInstallerStatusReceiver.f283667c;
                if (c13452e2 == null) {
                    c13452e2 = null;
                }
                c13452e2.getClass();
                c13452e2.f3560a.c(new C13455h(String.valueOf(false), str));
            }
            e eVar2 = packageInstallerStatusReceiver.f283665a;
            if (eVar2 == null) {
                eVar2 = null;
            }
            eVar2.g();
            e eVar3 = packageInstallerStatusReceiver.f283665a;
            if (eVar3 == null) {
                eVar3 = null;
            }
            eVar3.k(j12);
            e eVar4 = packageInstallerStatusReceiver.f283665a;
            (eVar4 != null ? eVar4 : null).f(j12);
            return G0.f406611a;
        }
    }

    /* compiled from: PackageInstallerStatusReceiver.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Intent f283672l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Context f283673m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ PackageInstallerStatusReceiver f283674n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f283675o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Intent intent, Context context, PackageInstallerStatusReceiver packageInstallerStatusReceiver, String str) {
            super(0);
            this.f283672l = intent;
            this.f283673m = context;
            this.f283674n = packageInstallerStatusReceiver;
            this.f283675o = str;
        }

        @Override // Y41.a
        public final G0 invoke() {
            Intent intent = (Intent) this.f283672l.getParcelableExtra("android.intent.extra.INTENT");
            if (intent != null) {
                this.f283673m.startActivity(intent.addFlags(268435456));
                C13452e c13452e = this.f283674n.f283667c;
                if (c13452e == null) {
                    c13452e = null;
                }
                c13452e.getClass();
                c13452e.f3560a.c(new C13449b(this.f283675o));
            }
            return G0.f406611a;
        }
    }

    public final void a(long j12) {
        e eVar = this.f283665a;
        if (eVar == null) {
            eVar = null;
        }
        String strC = eVar.c(j12);
        if (strC == null) {
            return;
        }
        com.avito.android.silent_update.a aVar = this.f283666b;
        if (aVar == null) {
            aVar = null;
        }
        DownloadUpdateConfig downloadUpdateConfigB = aVar.b(strC);
        if (downloadUpdateConfigB != null && (downloadUpdateConfigB instanceof DownloadUpdateConfig.OneTimeDownloadRequest)) {
            com.avito.android.silent_update.a aVar2 = this.f283666b;
            (aVar2 != null ? aVar2 : null).a(strC);
        }
    }

    public final void b(long j12, String str) {
        C23050m0.f46822j.getClass();
        C43259k.d(C22984Q.a(C23050m0.f46823k), null, null, new a(j12, str, null), 3);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@k Context context, @l Intent intent) {
        C13452e c13452e;
        if (intent == null) {
            return;
        }
        com.avito.android.silent_update.di.a.a().a((Bw0.c) C29972i.a(C29972i.b(context.getApplicationContext()), Bw0.c.class)).a(this);
        e eVar = this.f283665a;
        if (eVar == null) {
            eVar = null;
        }
        long jM2 = eVar.m();
        e eVar2 = this.f283665a;
        if (eVar2 == null) {
            eVar2 = null;
        }
        String strL = eVar2.l(jM2);
        int intExtra = intent.getIntExtra("android.content.pm.extra.STATUS", -1);
        if (intExtra == -1) {
            C23050m0.f46822j.getClass();
            com.avito.android.util.architecture_components.l.a(C23050m0.f46823k.f46829g, Lifecycle.State.f46683f, new b(intent, context, this, strL));
            return;
        }
        if (intExtra == 0) {
            C13452e c13452e2 = this.f283667c;
            (c13452e2 != null ? c13452e2 : null).a(InterfaceC13450c.b.f3558a, strL);
            b(jM2, strL);
            a(jM2);
            return;
        }
        if (intExtra == 3) {
            C13452e c13452e3 = this.f283667c;
            c13452e = c13452e3 != null ? c13452e3 : null;
            c13452e.getClass();
            c13452e.f3560a.c(new C13448a(String.valueOf(false), strL));
            b(jM2, strL);
            a(jM2);
            return;
        }
        String stringExtra = intent.getStringExtra("android.content.pm.extra.STATUS_MESSAGE");
        C13452e c13452e4 = this.f283667c;
        c13452e = c13452e4 != null ? c13452e4 : null;
        if (stringExtra == null) {
            stringExtra = "";
        }
        c13452e.a(new InterfaceC13450c.a(stringExtra), strL);
        b(jM2, strL);
        a(jM2);
    }
}
