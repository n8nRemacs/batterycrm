package Ob1;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import com.adjust.sdk.Constants;
import com.avito.android.R;
import com.avito.android.remote.model.text.TooltipAttribute;
import d31.AbstractC39497c;
import d31.AbstractC39501g;
import d31.C39499e;
import d31.i;
import e.InterfaceC39835a;
import f61.C40239a;
import java.util.Objects;
import kotlin.C42727D;
import kotlin.InterfaceC42830m;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import sberid.sdk.app_token.domain.models.models.TypeAuth;
import sberid.sdk.auth.view.activity.WebViewActivity;
import sberid.sdk.global.models.StandName;
import sc1.o;
import z.EnumC50330a;

@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LOb1/a;", "", "a", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0})
@InterfaceC42830m
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final C0794a f12414h = new C0794a(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final Object f12415i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final Object f12416j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final Object f12417k;

    /* renamed from: a, reason: collision with root package name */
    @l
    public String f12418a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public String f12419b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public TypeAuth f12420c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Object f12421d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Object f12422e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Object f12423f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Object f12424g;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0087\u0003\u0018\u00002\u00020\u0001:\u0001 B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006¨\u0006!"}, d2 = {"LOb1/a$a;", "", "<init>", "()V", "", "APP_TOKEN_CODE", "Ljava/lang/String;", "AUTH_APP_KEY", "AUTH_CODE", "AUTH_TYPE", "BASE_ERROR", "CHANNEL", "CLIENT_ID", "CODE_CHALLENGE", "CODE_CHALLENGE_METHOD", "CUSTOM_TABS_REDIRECT_URI_KEY", "ERROR_CODE", "ERROR_DESCRIPTION", "HOST_MP", "LOGIN_HINT", "LOG_UID", "NONCE", "PERSONALIZATION", "REDIRECT_URI", "RESPONSE_TYPE", "RESPONSE_TYPE_VALUE", "SBER_ID_SSO_REDIRECT_KEY", "SCHEME_MP", "SCOPE", "STATE", "STATE_ERROR", "TAG", "a", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0})
    @InterfaceC42830m
    /* renamed from: Ob1.a$a, reason: collision with other inner class name */
    public static final class C0794a {

        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOb1/a$a$a;", "", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ob1.a$a$a, reason: collision with other inner class name */
        public static final class C0795a {

            /* renamed from: a, reason: collision with root package name */
            public String f12425a;

            /* renamed from: b, reason: collision with root package name */
            public String f12426b;

            /* renamed from: c, reason: collision with root package name */
            public String f12427c;

            /* renamed from: d, reason: collision with root package name */
            public String f12428d;
        }

        public C0794a() {
        }

        public /* synthetic */ C0794a(C42822w c42822w) {
            this();
        }
    }

    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<Eb1.d> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f12429l = new b();

        public b() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [Eb1.d, java.lang.Object] */
        @Override // Y41.a
        @k
        public final Eb1.d invoke() {
            if (o.a()) {
                throw new IllegalStateException("Используйте SID.Initializer.initialize(application: Application, clientId: String) для инициализации библиотеки, прежде чем использовать методы.");
            }
            return org.koin.java.c.a(Eb1.d.class);
        }
    }

    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<T51.c> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f12430l = new c();

        public c() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T51.c, java.lang.Object] */
        @Override // Y41.a
        @k
        public final T51.c invoke() {
            if (o.a()) {
                throw new IllegalStateException("Используйте SID.Initializer.initialize(application: Application, clientId: String) для инициализации библиотеки, прежде чем использовать методы.");
            }
            return org.koin.java.c.a(T51.c.class);
        }
    }

    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<C39499e> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f12431l = new d();

        public d() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [d31.e, java.lang.Object] */
        @Override // Y41.a
        @k
        public final C39499e invoke() {
            if (o.a()) {
                throw new IllegalStateException("Используйте SID.Initializer.initialize(application: Application, clientId: String) для инициализации библиотеки, прежде чем использовать методы.");
            }
            return org.koin.java.c.a(C39499e.class);
        }
    }

    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<InterfaceC39835a> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f12432l = new e();

        public e() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [e.a, java.lang.Object] */
        @Override // Y41.a
        @k
        public final InterfaceC39835a invoke() {
            if (o.a()) {
                throw new IllegalStateException("Используйте SID.Initializer.initialize(application: Application, clientId: String) для инициализации библиотеки, прежде чем использовать методы.");
            }
            return org.koin.java.c.a(InterfaceC39835a.class);
        }
    }

    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<InterfaceC39835a> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f12433l = new f();

        public f() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [e.a, java.lang.Object] */
        @Override // Y41.a
        @k
        public final InterfaceC39835a invoke() {
            if (o.a()) {
                throw new IllegalStateException("Используйте SID.Initializer.initialize(application: Application, clientId: String) для инициализации библиотеки, прежде чем использовать методы.");
            }
            return org.koin.java.c.a(InterfaceC39835a.class);
        }
    }

    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T51.c> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f12434l = new g();

        public g() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T51.c, java.lang.Object] */
        @Override // Y41.a
        @k
        public final T51.c invoke() {
            if (o.a()) {
                throw new IllegalStateException("Используйте SID.Initializer.initialize(application: Application, clientId: String) для инициализации библиотеки, прежде чем использовать методы.");
            }
            return org.koin.java.c.a(T51.c.class);
        }
    }

    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<C40239a> {

        /* renamed from: l, reason: collision with root package name */
        public static final h f12435l = new h();

        public h() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [f61.a, java.lang.Object] */
        @Override // Y41.a
        @k
        public final C40239a invoke() {
            if (o.a()) {
                throw new IllegalStateException("Используйте SID.Initializer.initialize(application: Application, clientId: String) для инициализации библиотеки, прежде чем использовать методы.");
            }
            return org.koin.java.c.a(C40239a.class);
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406614b;
        f12415i = C42727D.b(lazyThreadSafetyMode, f.f12433l);
        f12416j = C42727D.b(lazyThreadSafetyMode, g.f12434l);
        f12417k = C42727D.b(lazyThreadSafetyMode, h.f12435l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.C] */
    public final Uri a(Uri uri) {
        f12414h.getClass();
        Uri uriBuild = Uri.parse(((O51.d) ((T51.c) f12416j.getValue()).f15377a).a().f18605c).buildUpon().build();
        Uri.Builder builderAppendQueryParameter = uri.buildUpon().scheme(uriBuild.getScheme()).encodedAuthority(uriBuild.getAuthority()).encodedPath(uriBuild.getPath()).appendQueryParameter("response_type", "code");
        TypeAuth typeAuth = TypeAuth.f437743c;
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("auth_type", "app2web");
        EnumC50330a[] enumC50330aArr = EnumC50330a.f443670b;
        Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("authApp", "none");
        ?? r02 = this.f12424g;
        return builderAppendQueryParameter3.appendQueryParameter("channel", ((e.h) ((InterfaceC39835a) r02.getValue())).f394234g).appendQueryParameter("personalization", String.valueOf(((e.h) ((InterfaceC39835a) r02.getValue())).f394235h)).build();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final void b(ActivityC22955m activityC22955m, Uri uri) {
        Objects.toString(uri);
        if (((O51.d) ((T51.c) this.f12422e.getValue()).f15377a).a().f18606d.f18632a && i.a(uri)) {
            int i12 = WebViewActivity.f437756g;
            Intent intent = new Intent(activityC22955m, (Class<?>) WebViewActivity.class);
            intent.putExtra(TooltipAttribute.PARAM_DEEP_LINK, uri.toString());
            activityC22955m.startActivity(intent);
            return;
        }
        if (AbstractC39501g.c(activityC22955m, uri, null)) {
            AbstractC39497c.a();
            return;
        }
        if (i.a(uri)) {
            int i13 = WebViewActivity.f437756g;
            Intent intent2 = new Intent(activityC22955m, (Class<?>) WebViewActivity.class);
            intent2.putExtra(TooltipAttribute.PARAM_DEEP_LINK, uri.toString());
            activityC22955m.startActivity(intent2);
            return;
        }
        if (activityC22955m.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts(Constants.SCHEME, "", null)), 131072).isEmpty()) {
            Toast.makeText(activityC22955m, activityC22955m.getText(R.string.browser_not_found_toast), 0).show();
            return;
        }
        Intent intent3 = new Intent("android.intent.action.VIEW");
        intent3.setData(uri);
        activityC22955m.startActivity(intent3);
    }

    public a(@k StandName standName) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406614b;
        this.f12421d = C42727D.b(lazyThreadSafetyMode, b.f12429l);
        this.f12422e = C42727D.b(lazyThreadSafetyMode, c.f12430l);
        this.f12423f = C42727D.b(lazyThreadSafetyMode, d.f12431l);
        this.f12424g = C42727D.b(lazyThreadSafetyMode, e.f12432l);
    }

    public /* synthetic */ a(StandName standName, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? StandName.f437764e : standName);
    }
}
