package androidx.credentials;

import android.content.Context;
import android.credentials.CreateCredentialRequest;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.CredentialManager;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.text.TextUtils;
import androidx.credentials.AbstractC22849b;
import androidx.credentials.AbstractC22850c;
import androidx.credentials.AbstractC22857j;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnsupportedException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.internal.FrameworkClassParsingException;
import com.avito.android.R;
import java.util.concurrent.Executor;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CredentialProviderFrameworkImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/B;", "Landroidx/credentials/y;", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@j.X
/* loaded from: classes.dex */
public final class B implements y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final CredentialManager f45167a;

    /* compiled from: CredentialProviderFrameworkImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/credentials/B$a;", "", "<init>", "()V", "", "CREATE_DOM_EXCEPTION_PREFIX", "Ljava/lang/String;", "GET_DOM_EXCEPTION_PREFIX", "TAG", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CredentialProviderFrameworkImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C22862o f45168l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C22862o c22862o) {
            super(0);
            this.f45168l = c22862o;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f45168l.a(new CreateCredentialUnsupportedException("Your device doesn't support credential manager"));
            return G0.f406611a;
        }
    }

    /* compiled from: CredentialProviderFrameworkImpl.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"androidx/credentials/B$c", "Landroid/os/OutcomeReceiver;", "Landroid/credentials/CreateCredentialResponse;", "Landroid/credentials/CreateCredentialException;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements OutcomeReceiver {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C22862o f45169b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C22853f f45170c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ B f45171d;

        public c(C22862o c22862o, C22853f c22853f, B b12) {
            this.f45169b = c22862o;
            this.f45170c = c22853f;
            this.f45171d = b12;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onError(java.lang.Throwable r6) throws androidx.credentials.internal.FrameworkClassParsingException {
            /*
                r5 = this;
                android.credentials.CreateCredentialException r6 = androidx.credentials.A.a(r6)
                androidx.credentials.o r0 = r5.f45169b
                androidx.credentials.B r1 = r5.f45171d
                r1.getClass()
                java.lang.String r1 = androidx.credentials.A.q(r6)
                int r2 = r1.hashCode()
                switch(r2) {
                    case -2055374133: goto L51;
                    case 1316905704: goto L3e;
                    case 2092588512: goto L2b;
                    case 2131915191: goto L17;
                    default: goto L16;
                }
            L16:
                goto L59
            L17:
                java.lang.String r2 = "android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L20
                goto L59
            L20:
                androidx.credentials.exceptions.CreateCredentialNoCreateOptionException r1 = new androidx.credentials.exceptions.CreateCredentialNoCreateOptionException
                java.lang.String r6 = androidx.credentials.A.B(r6)
                r1.<init>(r6)
                goto La7
            L2b:
                java.lang.String r2 = "android.credentials.CreateCredentialException.TYPE_INTERRUPTED"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L34
                goto L59
            L34:
                androidx.credentials.exceptions.CreateCredentialInterruptedException r1 = new androidx.credentials.exceptions.CreateCredentialInterruptedException
                java.lang.String r6 = androidx.credentials.A.B(r6)
                r1.<init>(r6)
                goto La7
            L3e:
                java.lang.String r2 = "android.credentials.CreateCredentialException.TYPE_UNKNOWN"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L47
                goto L59
            L47:
                androidx.credentials.exceptions.CreateCredentialUnknownException r1 = new androidx.credentials.exceptions.CreateCredentialUnknownException
                java.lang.String r6 = androidx.credentials.A.B(r6)
                r1.<init>(r6)
                goto La7
            L51:
                java.lang.String r2 = "android.credentials.CreateCredentialException.TYPE_USER_CANCELED"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L9e
            L59:
                java.lang.String r1 = androidx.credentials.A.q(r6)
                java.lang.String r2 = "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION"
                r3 = 0
                boolean r1 = kotlin.text.C43066x.h0(r1, r2, r3)
                if (r1 == 0) goto L90
                androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialException$a r1 = androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialException.f45209d
                java.lang.String r4 = androidx.credentials.A.q(r6)
                java.lang.String r6 = androidx.credentials.A.B(r6)
                r1.getClass()
                boolean r1 = kotlin.text.C43066x.q(r4, r2, r3)     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L8a
                if (r1 == 0) goto L84
                androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException$a r1 = androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException.f45208e     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L8a
                r1.getClass()     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L8a
                androidx.credentials.exceptions.CreateCredentialException r6 = androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException.a.a(r4, r6)     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L8a
                r1 = r6
                goto La7
            L84:
                androidx.credentials.internal.FrameworkClassParsingException r1 = new androidx.credentials.internal.FrameworkClassParsingException     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L8a
                r1.<init>()     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L8a
                throw r1     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L8a
            L8a:
                androidx.credentials.exceptions.CreateCredentialCustomException r1 = new androidx.credentials.exceptions.CreateCredentialCustomException
                r1.<init>(r4, r6)
                goto La7
            L90:
                androidx.credentials.exceptions.CreateCredentialCustomException r1 = new androidx.credentials.exceptions.CreateCredentialCustomException
                java.lang.String r2 = androidx.credentials.A.q(r6)
                java.lang.String r6 = androidx.credentials.A.B(r6)
                r1.<init>(r2, r6)
                goto La7
            L9e:
                androidx.credentials.exceptions.CreateCredentialCancellationException r1 = new androidx.credentials.exceptions.CreateCredentialCancellationException
                java.lang.String r6 = androidx.credentials.A.B(r6)
                r1.<init>(r6)
            La7:
                r0.a(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.B.c.onError(java.lang.Throwable):void");
        }

        public final void onResult(Object obj) throws FrameworkClassParsingException {
            AbstractC22850c c22852e;
            CreateCredentialResponse createCredentialResponseF = A.f(obj);
            C22862o c22862o = this.f45169b;
            AbstractC22850c.a aVar = AbstractC22850c.f45201a;
            String str = this.f45170c.f45193a;
            Bundle data = createCredentialResponseF.getData();
            aVar.getClass();
            try {
                if (str.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    C22854g.f45218b.getClass();
                    c22852e = new C22854g(data, null);
                } else {
                    if (!str.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        throw new FrameworkClassParsingException();
                    }
                    C22856i.f45221b.getClass();
                    try {
                        c22852e = new C22856i(data.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON"), data, null);
                    } catch (Exception unused) {
                        throw new FrameworkClassParsingException();
                    }
                }
            } catch (FrameworkClassParsingException unused2) {
                c22852e = new C22852e();
                if (str.length() <= 0) {
                    throw new IllegalArgumentException("type should not be empty");
                }
            }
            c22862o.onResult(c22852e);
        }
    }

    /* compiled from: CredentialProviderFrameworkImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C22868q f45172l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C22868q c22868q) {
            super(0);
            this.f45172l = c22868q;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f45172l.a(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
            return G0.f406611a;
        }
    }

    /* compiled from: CredentialProviderFrameworkImpl.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"androidx/credentials/B$e", "Landroid/os/OutcomeReceiver;", "Landroid/credentials/GetCredentialResponse;", "Landroid/credentials/GetCredentialException;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e implements OutcomeReceiver {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C22868q f45173b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ B f45174c;

        public e(C22868q c22868q, B b12) {
            this.f45173b = c22868q;
            this.f45174c = b12;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onError(java.lang.Throwable r6) throws androidx.credentials.internal.FrameworkClassParsingException {
            /*
                r5 = this;
                android.credentials.GetCredentialException r6 = androidx.credentials.A.l(r6)
                androidx.credentials.q r0 = r5.f45173b
                androidx.credentials.B r1 = r5.f45174c
                r1.getClass()
                java.lang.String r1 = androidx.compose.foundation.text.input.internal.Q.o(r6)
                int r2 = r1.hashCode()
                switch(r2) {
                    case -781118336: goto L51;
                    case -45448328: goto L3e;
                    case 580557411: goto L2b;
                    case 627896683: goto L17;
                    default: goto L16;
                }
            L16:
                goto L59
            L17:
                java.lang.String r2 = "android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L20
                goto L59
            L20:
                androidx.credentials.exceptions.NoCredentialException r1 = new androidx.credentials.exceptions.NoCredentialException
                java.lang.String r6 = androidx.credentials.A.s(r6)
                r1.<init>(r6)
                goto La7
            L2b:
                java.lang.String r2 = "android.credentials.GetCredentialException.TYPE_USER_CANCELED"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L34
                goto L59
            L34:
                androidx.credentials.exceptions.GetCredentialCancellationException r1 = new androidx.credentials.exceptions.GetCredentialCancellationException
                java.lang.String r6 = androidx.credentials.A.s(r6)
                r1.<init>(r6)
                goto La7
            L3e:
                java.lang.String r2 = "android.credentials.GetCredentialException.TYPE_INTERRUPTED"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L47
                goto L59
            L47:
                androidx.credentials.exceptions.GetCredentialInterruptedException r1 = new androidx.credentials.exceptions.GetCredentialInterruptedException
                java.lang.String r6 = androidx.credentials.A.s(r6)
                r1.<init>(r6)
                goto La7
            L51:
                java.lang.String r2 = "android.credentials.GetCredentialException.TYPE_UNKNOWN"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L9e
            L59:
                java.lang.String r1 = androidx.compose.foundation.text.input.internal.Q.o(r6)
                java.lang.String r2 = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION"
                r3 = 0
                boolean r1 = kotlin.text.C43066x.h0(r1, r2, r3)
                if (r1 == 0) goto L90
                androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialException$a r1 = androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialException.f45212d
                java.lang.String r4 = androidx.compose.foundation.text.input.internal.Q.o(r6)
                java.lang.String r6 = androidx.credentials.A.s(r6)
                r1.getClass()
                boolean r1 = kotlin.text.C43066x.h0(r4, r2, r3)     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L8a
                if (r1 == 0) goto L84
                androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException$a r1 = androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException.f45211e     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L8a
                r1.getClass()     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L8a
                androidx.credentials.exceptions.GetCredentialException r6 = androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException.a.a(r4, r6)     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L8a
                r1 = r6
                goto La7
            L84:
                androidx.credentials.internal.FrameworkClassParsingException r1 = new androidx.credentials.internal.FrameworkClassParsingException     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L8a
                r1.<init>()     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L8a
                throw r1     // Catch: androidx.credentials.internal.FrameworkClassParsingException -> L8a
            L8a:
                androidx.credentials.exceptions.GetCredentialCustomException r1 = new androidx.credentials.exceptions.GetCredentialCustomException
                r1.<init>(r4, r6)
                goto La7
            L90:
                androidx.credentials.exceptions.GetCredentialCustomException r1 = new androidx.credentials.exceptions.GetCredentialCustomException
                java.lang.String r2 = androidx.compose.foundation.text.input.internal.Q.o(r6)
                java.lang.String r6 = androidx.credentials.A.s(r6)
                r1.<init>(r2, r6)
                goto La7
            L9e:
                androidx.credentials.exceptions.GetCredentialUnknownException r1 = new androidx.credentials.exceptions.GetCredentialUnknownException
                java.lang.String r6 = androidx.credentials.A.s(r6)
                r1.<init>(r6)
            La7:
                r0.a(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.B.e.onError(java.lang.Throwable):void");
        }

        public final void onResult(Object obj) throws FrameworkClassParsingException {
            AbstractC22857j i12;
            GetCredentialResponse getCredentialResponseN = A.n(obj);
            C22868q c22868q = this.f45173b;
            this.f45174c.getClass();
            Credential credential = getCredentialResponseN.getCredential();
            AbstractC22857j.a aVar = AbstractC22857j.f45222a;
            String type = credential.getType();
            Bundle data = credential.getData();
            aVar.getClass();
            try {
                if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    P.f45186d.getClass();
                    try {
                        i12 = new P(data.getString("androidx.credentials.BUNDLE_KEY_ID"), data.getString("androidx.credentials.BUNDLE_KEY_PASSWORD"), data, null);
                    } catch (Exception unused) {
                        throw new FrameworkClassParsingException();
                    }
                } else {
                    if (!type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        throw new FrameworkClassParsingException();
                    }
                    W.f45192b.getClass();
                    try {
                        i12 = new W(data.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON"), data, null);
                    } catch (Exception unused2) {
                        throw new FrameworkClassParsingException();
                    }
                }
            } catch (FrameworkClassParsingException unused3) {
                i12 = new I(type);
            }
            c22868q.onResult(new L(i12));
        }
    }

    static {
        new a(null);
    }

    public B(@Y61.k Context context) {
        this.f45167a = A.h(context.getSystemService("credential"));
    }

    @Override // androidx.credentials.y
    public final boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.f45167a != null;
    }

    @Override // androidx.credentials.y
    public final void onCreateCredential(@Y61.k Context context, @Y61.k AbstractC22849b abstractC22849b, @Y61.l CancellationSignal cancellationSignal, @Y61.k Executor executor, @Y61.k InterfaceC22872v<AbstractC22850c, CreateCredentialException> interfaceC22872v) {
        C22862o c22862o = (C22862o) interfaceC22872v;
        b bVar = new b(c22862o);
        CredentialManager credentialManager = this.f45167a;
        if (credentialManager == null) {
            bVar.invoke();
            return;
        }
        c cVar = new c(c22862o, (C22853f) abstractC22849b, this);
        A.t();
        R0.a.f14049a.getClass();
        AbstractC22849b.C1761b c1761b = abstractC22849b.f45197e;
        c1761b.getClass();
        Bundle bundle = new Bundle();
        bundle.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", c1761b.f45199a);
        CharSequence charSequence = c1761b.f45200b;
        if (!TextUtils.isEmpty(charSequence)) {
            bundle.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", charSequence);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER", null);
        }
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, R.drawable.ic_password));
        Bundle bundle2 = abstractC22849b.f45194b;
        bundle2.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", bundle);
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = A.d(abstractC22849b.f45193a, bundle2, abstractC22849b.f45195c).setIsSystemProviderRequired(abstractC22849b.f45196d).setAlwaysSendAppInfoToProvider(true);
        String str = abstractC22849b.f45198f;
        if (str != null) {
            alwaysSendAppInfoToProvider.setOrigin(str);
        }
        credentialManager.createCredential(context, alwaysSendAppInfoToProvider.build(), cancellationSignal, (androidx.arch.core.executor.a) executor, cVar);
    }

    @Override // androidx.credentials.y
    public final void onGetCredential(@Y61.k Context context, @Y61.k K k12, @Y61.l CancellationSignal cancellationSignal, @Y61.k Executor executor, @Y61.k InterfaceC22872v<L, GetCredentialException> interfaceC22872v) {
        C22868q c22868q = (C22868q) interfaceC22872v;
        d dVar = new d(c22868q);
        CredentialManager credentialManager = this.f45167a;
        if (credentialManager == null) {
            dVar.invoke();
            return;
        }
        e eVar = new e(c22868q, this);
        androidx.compose.foundation.text.input.internal.Q.z();
        K.f45175f.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", k12.f45178c);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", k12.f45180e);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", k12.f45179d);
        GetCredentialRequest.Builder builderB = androidx.compose.foundation.text.input.internal.Q.b(bundle);
        for (AbstractC22874x abstractC22874x : k12.f45176a) {
            androidx.compose.foundation.text.input.internal.Q.B();
            builderB.addCredentialOption(androidx.compose.foundation.text.input.internal.Q.a(abstractC22874x.f45332a, abstractC22874x.f45333b, abstractC22874x.f45334c).setIsSystemProviderRequired(abstractC22874x.f45335d).setAllowedProviders(abstractC22874x.f45337f).build());
        }
        String str = k12.f45177b;
        if (str != null) {
            builderB.setOrigin(str);
        }
        credentialManager.getCredential(context, builderB.build(), cancellationSignal, (androidx.arch.core.executor.a) executor, (OutcomeReceiver<GetCredentialResponse, android.credentials.GetCredentialException>) eVar);
    }
}
