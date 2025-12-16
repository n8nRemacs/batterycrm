package sberid.sdk.init;

import D31.g;
import G41.i;
import Y61.k;
import Y61.l;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.R;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import d.C39443b;
import d.n;
import d31.AbstractC39500f;
import d31.C39499e;
import e.InterfaceC39835a;
import e.f;
import e.h;
import java.net.SocketException;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import o71.e;
import q71.C47248a;
import sberid.sdk.app_token.domain.models.models.TypeAuth;
import sberid.sdk.global.models.StandName;
import sc1.o;
import u2.AbstractC48768c;

@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lsberid/sdk/init/a;", "", "<init>", "()V", "a", "b", "c", "d", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class a {

    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsberid/sdk/init/a$a;", "", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sberid.sdk.init.a$a, reason: collision with other inner class name */
    public static final class C12622a {
        static {
            new C12622a();
        }
    }

    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsberid/sdk/init/a$b;", "", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        static {
            new b();
        }
    }

    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsberid/sdk/init/a$c;", "", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0})
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        @l
        public static e f437771b;

        /* renamed from: c, reason: collision with root package name */
        public static boolean f437772c;

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f437770a = new c();

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final Object f437773d = C42727D.b(LazyThreadSafetyMode.f406614b, C12623a.f437774l);

        @s0
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: sberid.sdk.init.a$c$a, reason: collision with other inner class name */
        public static final class C12623a extends N implements Y41.a<InterfaceC39835a> {

            /* renamed from: l, reason: collision with root package name */
            public static final C12623a f437774l = new C12623a();

            public C12623a() {
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

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.C] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.C] */
        /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.C] */
        public static void a(c cVar, Application application, String str) {
            cVar.getClass();
            if (f437771b == null) {
                f437771b = C47248a.a(new sberid.sdk.init.c(application));
            }
            if (str == null) {
                str = "";
            }
            ?? r52 = f437773d;
            h hVar = (h) ((InterfaceC39835a) r52.getValue());
            hVar.getClass();
            hVar.f394231d = str;
            C43259k.d((T) ((g) hVar.f394228a).f2880a.getValue(), null, null, new f(hVar, str, null), 3);
            ?? r02 = AbstractC48768c.f439727a;
            G41.a aVar = ((Cc1.c) r02.getValue()).f2359d.f393145a;
            N41.g gVar = (N41.g) ((i) aVar).f6332c.getValue();
            gVar.getClass();
            if (gVar.f11194a == null && gVar.f11195b == null && gVar.f11196c == null) {
                ((i) aVar).a(new N41.g(null, null, false, null));
            } else {
                ((i) aVar).a(N41.g.a(gVar, null, null, null, 30));
            }
            if (f437772c) {
                return;
            }
            f437772c = true;
            InterfaceC39835a interfaceC39835a = (InterfaceC39835a) r52.getValue();
            String str2 = application.getResources().getBoolean(R.bool.isTablet) ? "androidTablet" : "androidMobile";
            h hVar2 = (h) interfaceC39835a;
            hVar2.getClass();
            hVar2.f394234g = str2;
            d.o oVar = ((Cc1.c) r02.getValue()).f2363h;
            C43259k.d((T) ((g) oVar.f393150c).f2880a.getValue(), null, null, new n(oVar, null), 3);
            T51.c cVar2 = (T51.c) Fb1.b.f4799a.getValue();
            C81.c cVar3 = cVar2.f15379c;
            C43259k.d((T) ((g) cVar3.f1996a).f2881b.getValue(), null, null, new C81.b(cVar3, new T51.b(cVar2), null), 3);
        }
    }

    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsberid/sdk/init/a$d;", "", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0})
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f437775a = new d();

        /* renamed from: b, reason: collision with root package name */
        @l
        public static Ob1.a f437776b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final Object f437777c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final Object f437778d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public static final Object f437779e;

        @s0
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: sberid.sdk.init.a$d$a, reason: collision with other inner class name */
        public static final class C12624a extends N implements Y41.a<T51.c> {

            /* renamed from: l, reason: collision with root package name */
            public static final C12624a f437780l = new C12624a();

            public C12624a() {
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
        public static final class b extends N implements Y41.a<InterfaceC39835a> {

            /* renamed from: l, reason: collision with root package name */
            public static final b f437781l = new b();

            public b() {
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
        public static final class c extends N implements Y41.a<Context> {

            /* renamed from: l, reason: collision with root package name */
            public static final c f437782l = new c();

            public c() {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.content.Context, java.lang.Object] */
            @Override // Y41.a
            @k
            public final Context invoke() {
                if (o.a()) {
                    throw new IllegalStateException("Используйте SID.Initializer.initialize(application: Application, clientId: String) для инициализации библиотеки, прежде чем использовать методы.");
                }
                return org.koin.java.c.a(Context.class);
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406614b;
            f437777c = C42727D.b(lazyThreadSafetyMode, C12624a.f437780l);
            f437778d = C42727D.b(lazyThreadSafetyMode, b.f437781l);
            f437779e = C42727D.b(lazyThreadSafetyMode, c.f437782l);
        }

        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.C] */
        /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, kotlin.C] */
        /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.C] */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, kotlin.C] */
        public static void a(@k ActivityC22955m activityC22955m, @k Uri uri) throws SocketException {
            N41.f fVar;
            Ob1.a aVar = f437776b;
            if (aVar == null) {
                Ob1.a aVar2 = new Ob1.a(StandName.f437764e);
                InterfaceC39835a interfaceC39835a = (InterfaceC39835a) f437778d.getValue();
                int i12 = d31.h.f393656a[4];
                if (i12 == 1) {
                    fVar = N41.c.f11190b;
                } else if (i12 == 2) {
                    fVar = N41.e.f11192b;
                } else if (i12 == 3) {
                    fVar = N41.c.f11190b;
                } else if (i12 == 4) {
                    fVar = N41.e.f11192b;
                } else {
                    if (i12 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fVar = N41.d.f11191b;
                }
                h hVar = (h) interfaceC39835a;
                hVar.getClass();
                C43259k.d((T) ((g) hVar.f394228a).f2880a.getValue(), null, null, new e.e(hVar, fVar, null), 3);
                f437776b = aVar2;
                aVar = aVar2;
            }
            aVar.f12418a = uri.getQueryParameter(VoiceInfo.STATE);
            aVar.f12419b = uri.getQueryParameter("nonce");
            if (AbstractC39500f.a(activityC22955m)) {
                aVar.f12420c = TypeAuth.f437744d;
                aVar.b(activityC22955m, aVar.a(uri));
            } else {
                aVar.f12420c = TypeAuth.f437743c;
                activityC22955m.startActivity(new Intent("android.intent.action.VIEW", uri.buildUpon().appendQueryParameter("auth_type", "app2app").build()));
            }
            f437775a.getClass();
            Eb1.d dVar = (Eb1.d) Bc1.e.f1565a.getValue();
            int i13 = 0;
            if (!dVar.a()) {
                B81.k kVar = (B81.k) dVar.f4104c.f443385a;
                ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) kVar.f912e.getValue();
                ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i14 = 0; i14 < readHoldCount; i14++) {
                    lock.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    SharedPreferences sharedPreferences = kVar.f911d;
                    if (sharedPreferences != null) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.remove("sber_id_app_token").apply();
                        editorEdit.apply();
                        G0 g02 = G0.f406611a;
                    }
                    for (int i15 = 0; i15 < readHoldCount; i15++) {
                        lock.lock();
                    }
                    writeLock.unlock();
                } catch (Throwable th2) {
                    while (i13 < readHoldCount) {
                        lock.lock();
                        i13++;
                    }
                    writeLock.unlock();
                    throw th2;
                }
            }
            C39443b c39443b = ((Cc1.c) AbstractC48768c.f439727a.getValue()).f2358c;
            vc1.c cVar = (vc1.c) c39443b.f393106a;
            ReentrantReadWriteLock reentrantReadWriteLock2 = (ReentrantReadWriteLock) cVar.f440911d.getValue();
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock2.readLock();
            int readHoldCount2 = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
            for (int i16 = 0; i16 < readHoldCount2; i16++) {
                lock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock2.writeLock();
            writeLock2.lock();
            try {
                SharedPreferences sharedPreferences2 = cVar.f440910c;
                if (sharedPreferences2 != null) {
                    SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                    editorEdit2.remove("sber_id_user_id").apply();
                    editorEdit2.apply();
                    G0 g03 = G0.f406611a;
                }
                while (i13 < readHoldCount2) {
                    lock2.lock();
                    i13++;
                }
                writeLock2.unlock();
                h hVar2 = (h) c39443b.f393107b;
                C43259k.d((T) ((g) hVar2.f394228a).f2880a.getValue(), null, null, new e.b(hVar2, null), 3);
                ((C39499e) aVar.f12423f.getValue()).c(aVar.f12420c);
            } catch (Throwable th3) {
                while (i13 < readHoldCount2) {
                    lock2.lock();
                    i13++;
                }
                writeLock2.unlock();
                throw th3;
            }
        }
    }

    static {
        new a();
    }
}
