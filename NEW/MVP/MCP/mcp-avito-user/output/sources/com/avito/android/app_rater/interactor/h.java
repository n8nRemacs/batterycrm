package com.avito.android.app_rater.interactor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import androidx.fragment.app.ActivityC22955m;
import java.io.Serializable;
import java.util.Date;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.I0;

/* compiled from: InAppReviewInteractorGalaxyStore.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.app_rater.interactor.InAppReviewInteractorGalaxyStore$start$1", f = "InAppReviewInteractorGalaxyStore.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class h extends SuspendLambda implements Y41.p<I0<? super G0>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f91807q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f91808r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f91809s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ActivityC22955m f91810t;

    /* compiled from: InAppReviewInteractorGalaxyStore.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ActivityC22955m f91811l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b f91812m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ActivityC22955m activityC22955m, b bVar) {
            super(0);
            this.f91811l = activityC22955m;
            this.f91812m = bVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f91811l.unregisterReceiver(this.f91812m);
            return G0.f406611a;
        }
    }

    /* compiled from: InAppReviewInteractorGalaxyStore.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/app_rater/interactor/h$b", "Landroid/content/BroadcastReceiver;", "_avito_app-rater_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f91813a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ I0<G0> f91814b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ActivityC22955m f91815c;

        public b(i iVar, I0 i02, ActivityC22955m activityC22955m) {
            this.f91813a = iVar;
            this.f91814b = i02;
            this.f91815c = activityC22955m;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(@Y61.k Context context, @Y61.k Intent intent) {
            Date date;
            boolean booleanExtra = intent.getBooleanExtra("hasAuthority", false);
            I0<G0> i02 = this.f91814b;
            i iVar = this.f91813a;
            if (!booleanExtra) {
                iVar.getClass();
                i.d(i02, "You don't have authority to write review");
            }
            int intExtra = intent.getIntExtra("errorCode", 0);
            if (intExtra > 0) {
                String str = intExtra != 1000 ? intExtra != 2000 ? intExtra != 4002 ? intExtra != 5000 ? intExtra != 100015 ? "Galaxy Store Unknown error" : "Repeated request for authorization happens within 10 seconds" : "The user is not logged in to a Samsung Account on the device" : "Content is not available in Galaxy Store for the user" : "Server error" : "A mandatory parameter to check user status is not available";
                iVar.getClass();
                i.d(i02, str);
                return;
            }
            boolean booleanExtra2 = intent.getBooleanExtra("isRegistered", false);
            int intExtra2 = intent.getIntExtra("currentScore", 0);
            String stringExtra = intent.getStringExtra("deeplinkUri");
            if (Build.VERSION.SDK_INT >= 33) {
                date = (Date) intent.getSerializableExtra("lastRegisteredDate", Date.class);
            } else {
                Serializable serializableExtra = intent.getSerializableExtra("lastRegisteredDate");
                date = serializableExtra instanceof Date ? (Date) serializableExtra : null;
            }
            if (booleanExtra2) {
                iVar.getClass();
                i.d(i02, "The review is already exist. Current score - " + intExtra2 + ". Last review date - " + date);
                return;
            }
            if (stringExtra == null || stringExtra.length() == 0) {
                iVar.getClass();
                i.d(i02, "Invalid deeplink URI provided");
                return;
            }
            try {
                Intent intent2 = new Intent();
                intent2.setData(Uri.parse(stringExtra));
                intent2.setFlags(intent2.getFlags() + 67108896);
                this.f91815c.startActivity(intent2);
            } catch (Exception e12) {
                String message = e12.getMessage();
                iVar.getClass();
                i.d(i02, message);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, ActivityC22955m activityC22955m, Continuation continuation) {
        super(2, continuation);
        this.f91809s = iVar;
        this.f91810t = activityC22955m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f91809s, this.f91810t, continuation);
        hVar.f91808r = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super G0> i02, Continuation<? super G0> continuation) {
        return ((h) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        ActivityC22955m activityC22955m = this.f91810t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f91807q;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i02 = (I0) this.f91808r;
            i iVar = this.f91809s;
            iVar.getClass();
            try {
                if (activityC22955m.getPackageManager().getApplicationInfo("com.sec.android.app.samsungapps", 128).metaData.getInt("com.sec.android.app.samsungapps.review.inappReview", 0) <= 0) {
                    i.d(i02, "Galaxy Store don't supports in-app review function");
                }
            } catch (PackageManager.NameNotFoundException unused) {
                i.d(i02, "GalaxyStore is not installed in your device");
            }
            Intent intent = new Intent("com.sec.android.app.samsungapps.REQUEST_INAPP_REVIEW_AUTHORITY");
            intent.setPackage("com.sec.android.app.samsungapps");
            intent.putExtra("callerPackage", activityC22955m.getApplicationContext().getPackageName());
            activityC22955m.sendBroadcast(intent);
            b bVar = new b(iVar, i02, activityC22955m);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.sec.android.app.samsungapps.RESPONSE_INAPP_REVIEW_AUTHORITY");
            androidx.core.content.d.registerReceiver(activityC22955m, bVar, intentFilter, 2);
            a aVar = new a(activityC22955m, bVar);
            this.f91807q = 1;
            if (F0.a(i02, aVar, this) == coroutine_suspended) {
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
