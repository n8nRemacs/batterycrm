package androidx.credentials.playservices;

import OX0.t;
import Y41.a;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import androidx.credentials.AbstractC22849b;
import androidx.credentials.AbstractC22850c;
import androidx.credentials.AbstractC22874x;
import androidx.credentials.C22848a;
import androidx.credentials.C22853f;
import androidx.credentials.C22855h;
import androidx.credentials.InterfaceC22872v;
import androidx.credentials.K;
import androidx.credentials.L;
import androidx.credentials.U;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController;
import androidx.credentials.y;
import com.google.android.gms.common.C36687f;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.p000authapi.zbaq;
import com.google.android.gms.tasks.InterfaceC37023f;
import com.google.android.gms.tasks.InterfaceC37024g;
import com.google.android.gms.tasks.Task;
import j.X;
import j.k0;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kY0.C42647b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: CredentialProviderPlayServicesImpl.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJE\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015JE\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00162\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010!\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u001e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020 0\u000fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R(\u0010%\u001a\u00020$8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b%\u0010&\u0012\u0004\b+\u0010,\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006."}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;", "Landroidx/credentials/y;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "isGooglePlayServicesAvailable", "(Landroid/content/Context;)I", "Landroidx/credentials/K;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/credentials/v;", "Landroidx/credentials/L;", "Landroidx/credentials/exceptions/GetCredentialException;", "callback", "Lkotlin/G0;", "onGetCredential", "(Landroid/content/Context;Landroidx/credentials/K;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/v;)V", "Landroidx/credentials/b;", "Landroidx/credentials/c;", "Landroidx/credentials/exceptions/CreateCredentialException;", "onCreateCredential", "(Landroid/content/Context;Landroidx/credentials/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/v;)V", "", "isAvailableOnDevice", "()Z", "Landroidx/credentials/a;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "onClearCredential", "(Landroidx/credentials/a;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/v;)V", "Landroid/content/Context;", "Lcom/google/android/gms/common/f;", "googleApiAvailability", "Lcom/google/android/gms/common/f;", "getGoogleApiAvailability", "()Lcom/google/android/gms/common/f;", "setGoogleApiAvailability", "(Lcom/google/android/gms/common/f;)V", "getGoogleApiAvailability$annotations", "()V", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes.dex */
public final class CredentialProviderPlayServicesImpl implements y {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @RestrictTo
    public static final int MIN_GMS_APK_VERSION = 230815045;

    @k
    private static final String TAG = "PlayServicesImpl";

    @k
    private final Context context;

    @k
    private C36687f googleApiAvailability = C36687f.f349287e;

    /* compiled from: CredentialProviderPlayServicesImpl.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000f\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$Companion;", "", "<init>", "()V", "Landroid/os/CancellationSignal;", "cancellationSignal", "Lkotlin/Function0;", "Lkotlin/G0;", "callback", "cancellationReviewerWithCallback$credentials_play_services_auth_release", "(Landroid/os/CancellationSignal;LY41/a;)V", "cancellationReviewerWithCallback", "", "cancellationReviewer$credentials_play_services_auth_release", "(Landroid/os/CancellationSignal;)Z", "cancellationReviewer", "Landroidx/credentials/K;", "request", "isGetSignInIntentRequest$credentials_play_services_auth_release", "(Landroidx/credentials/K;)Z", "isGetSignInIntentRequest", "", "MIN_GMS_APK_VERSION", "I", "", "TAG", "Ljava/lang/String;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public final boolean cancellationReviewer$credentials_play_services_auth_release(@l CancellationSignal cancellationSignal) {
            return cancellationSignal != null && cancellationSignal.isCanceled();
        }

        public final void cancellationReviewerWithCallback$credentials_play_services_auth_release(@l CancellationSignal cancellationSignal, @k a<G0> callback) {
            if (cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            callback.invoke();
        }

        public final boolean isGetSignInIntentRequest$credentials_play_services_auth_release(@k K request) {
            Iterator<AbstractC22874x> it = request.f45176a.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof C42647b) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    /* compiled from: CredentialProviderPlayServicesImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Void;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Void;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$1, reason: invalid class name */
    public static final class AnonymousClass1 extends N implements Y41.l<Void, G0> {
        final /* synthetic */ InterfaceC22872v<Void, ClearCredentialException> $callback;
        final /* synthetic */ CancellationSignal $cancellationSignal;
        final /* synthetic */ Executor $executor;

        /* compiled from: CredentialProviderPlayServicesImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C17631 extends N implements a<G0> {
            final /* synthetic */ InterfaceC22872v<Void, ClearCredentialException> $callback;
            final /* synthetic */ Executor $executor;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C17631(Executor executor, InterfaceC22872v<Void, ClearCredentialException> interfaceC22872v) {
                super(0);
                this.$executor = executor;
                this.$callback = interfaceC22872v;
            }

            @Override // Y41.a
            public /* bridge */ /* synthetic */ G0 invoke() {
                invoke2();
                return G0.f406611a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Executor executor = this.$executor;
                final InterfaceC22872v<Void, ClearCredentialException> interfaceC22872v = this.$callback;
                executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$1$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC22872v.onResult(null);
                    }
                });
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CancellationSignal cancellationSignal, Executor executor, InterfaceC22872v<Void, ClearCredentialException> interfaceC22872v) {
            super(1);
            this.$cancellationSignal = cancellationSignal;
            this.$executor = executor;
            this.$callback = interfaceC22872v;
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ G0 invoke(Void r12) {
            invoke2(r12);
            return G0.f406611a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Void r52) {
            CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth_release(this.$cancellationSignal, new C17631(this.$executor, this.$callback));
        }
    }

    public CredentialProviderPlayServicesImpl(@k Context context) {
        this.context = context;
    }

    private final int isGooglePlayServicesAvailable(Context context) {
        return this.googleApiAvailability.c(MIN_GMS_APK_VERSION, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$2(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, InterfaceC22872v interfaceC22872v, Exception exc) {
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new CredentialProviderPlayServicesImpl$onClearCredential$2$1$1(exc, executor, interfaceC22872v));
    }

    @k
    public final C36687f getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    @Override // androidx.credentials.y
    public boolean isAvailableOnDevice() {
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context);
        boolean z12 = iIsGooglePlayServicesAvailable == 0;
        if (!z12) {
            new ConnectionResult(iIsGooglePlayServicesAvailable).toString();
        }
        return z12;
    }

    public void onClearCredential(@k C22848a request, @l final CancellationSignal cancellationSignal, @k final Executor executor, @k final InterfaceC22872v<Void, ClearCredentialException> callback) {
        if (INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        Context context = this.context;
        C36729v.j(context);
        Task<Void> taskSignOut = new zbaq(context, new t()).signOut();
        final AnonymousClass1 anonymousClass1 = new AnonymousClass1(cancellationSignal, executor, callback);
        taskSignOut.g(new InterfaceC37024g() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.InterfaceC37024g
            public final void onSuccess(Object obj) {
                anonymousClass1.invoke(obj);
            }
        }).e(new InterfaceC37023f() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.InterfaceC37023f
            public final void onFailure(Exception exc) {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$2(this.f$0, cancellationSignal, executor, callback, exc);
            }
        });
    }

    @Override // androidx.credentials.y
    public void onCreateCredential(@k Context context, @k AbstractC22849b request, @l CancellationSignal cancellationSignal, @k Executor executor, @k InterfaceC22872v<AbstractC22850c, CreateCredentialException> callback) {
        if (INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (request instanceof C22853f) {
            CredentialProviderCreatePasswordController.INSTANCE.getInstance(context).invokePlayServices((C22853f) request, callback, executor, cancellationSignal);
        } else {
            if (!(request instanceof C22855h)) {
                throw new UnsupportedOperationException("Create Credential request is unsupported, not password or publickeycredential");
            }
            CredentialProviderCreatePublicKeyCredentialController.INSTANCE.getInstance(context).invokePlayServices((C22855h) request, callback, executor, cancellationSignal);
        }
    }

    @X
    public /* bridge */ /* synthetic */ void onGetCredential(@k Context context, @k U.b bVar, @l CancellationSignal cancellationSignal, @k Executor executor, @k InterfaceC22872v interfaceC22872v) {
    }

    public final void setGoogleApiAvailability(@k C36687f c36687f) {
        this.googleApiAvailability = c36687f;
    }

    @Override // androidx.credentials.y
    public void onGetCredential(@k Context context, @k K request, @l CancellationSignal cancellationSignal, @k Executor executor, @k InterfaceC22872v<L, GetCredentialException> callback) {
        Companion companion = INSTANCE;
        if (companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (companion.isGetSignInIntentRequest$credentials_play_services_auth_release(request)) {
            new CredentialProviderGetSignInIntentController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        } else {
            new CredentialProviderBeginSignInController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        }
    }

    @k0
    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    @X
    public /* bridge */ /* synthetic */ void onPrepareCredential(@k K k12, @l CancellationSignal cancellationSignal, @k Executor executor, @k InterfaceC22872v interfaceC22872v) {
    }
}
