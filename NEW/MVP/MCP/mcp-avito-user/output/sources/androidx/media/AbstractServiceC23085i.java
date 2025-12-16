package androidx.media;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.collection.C20199a;
import androidx.core.util.C22807v;
import androidx.media.C;
import j.N;
import j.P;
import j.X;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: MediaBrowserServiceCompat.java */
/* renamed from: androidx.media.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC23085i extends Service {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f47030i = 0;

    /* renamed from: b, reason: collision with root package name */
    public f f47031b;

    /* renamed from: f, reason: collision with root package name */
    public b f47035f;

    /* renamed from: h, reason: collision with root package name */
    public MediaSessionCompat.Token f47037h;

    /* renamed from: c, reason: collision with root package name */
    public final b f47032c = new b("android.media.session.MediaController", -1, -1, null);

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList<b> f47033d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    public final C20199a<IBinder, b> f47034e = new C20199a<>();

    /* renamed from: g, reason: collision with root package name */
    public final n f47036g = new n(this);

    /* compiled from: MediaBrowserServiceCompat.java */
    /* renamed from: androidx.media.i$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f47038a;

        /* renamed from: b, reason: collision with root package name */
        public final Bundle f47039b;

        public a(@P Bundle bundle, @N String str) {
            if (str == null) {
                throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
            }
            this.f47038a = str;
            this.f47039b = bundle;
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* renamed from: androidx.media.i$b */
    public class b implements IBinder.DeathRecipient {

        /* renamed from: a, reason: collision with root package name */
        public final String f47040a;

        /* renamed from: b, reason: collision with root package name */
        public final int f47041b;

        /* renamed from: c, reason: collision with root package name */
        public final int f47042c;

        /* renamed from: d, reason: collision with root package name */
        public final C.b f47043d;

        /* renamed from: e, reason: collision with root package name */
        public final m f47044e;

        /* renamed from: f, reason: collision with root package name */
        public final HashMap<String, List<C22807v<IBinder, Bundle>>> f47045f = new HashMap<>();

        /* renamed from: g, reason: collision with root package name */
        public a f47046g;

        /* compiled from: MediaBrowserServiceCompat.java */
        /* renamed from: androidx.media.i$b$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                AbstractServiceC23085i.this.f47034e.remove(bVar.f47044e.f47066a.getBinder());
            }
        }

        public b(String str, int i12, int i13, m mVar) {
            this.f47040a = str;
            this.f47041b = i12;
            this.f47042c = i13;
            this.f47043d = new C.b(str, i12, i13);
            this.f47044e = mVar;
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            AbstractServiceC23085i abstractServiceC23085i = AbstractServiceC23085i.this;
            abstractServiceC23085i.f47036g.post(new a());
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* renamed from: androidx.media.i$c */
    public interface c {
        C.b a();
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    @X
    /* renamed from: androidx.media.i$d */
    public class d implements c {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f47049a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public MediaBrowserService f47050b;

        /* renamed from: c, reason: collision with root package name */
        public Messenger f47051c;

        /* compiled from: MediaBrowserServiceCompat.java */
        @X
        /* renamed from: androidx.media.i$d$a */
        public class a extends MediaBrowserService {
            public a(Context context) {
                attachBaseContext(context);
            }

            @Override // android.service.media.MediaBrowserService
            @SuppressLint({"SyntheticAccessor"})
            public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i12, Bundle bundle) {
                Bundle bundleE;
                a aVar;
                MediaSessionCompat.ensureClassLoader(bundle);
                Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
                d dVar = d.this;
                AbstractServiceC23085i abstractServiceC23085i = AbstractServiceC23085i.this;
                int i13 = -1;
                if (bundle2 == null || bundle2.getInt("extra_client_version", 0) == 0) {
                    bundleE = null;
                } else {
                    bundle2.remove("extra_client_version");
                    dVar.f47051c = new Messenger(abstractServiceC23085i.f47036g);
                    bundleE = AK.c.e(2, "extra_service_version");
                    bundleE.putBinder("extra_messenger", dVar.f47051c.getBinder());
                    MediaSessionCompat.Token token = abstractServiceC23085i.f47037h;
                    if (token != null) {
                        IMediaSession extraBinder = token.getExtraBinder();
                        bundleE.putBinder("extra_session_binder", extraBinder == null ? null : extraBinder.asBinder());
                    } else {
                        dVar.f47049a.add(bundleE);
                    }
                    i13 = bundle2.getInt("extra_calling_pid", -1);
                    bundle2.remove("extra_calling_pid");
                }
                b bVar = AbstractServiceC23085i.this.new b(str, i13, i12, null);
                abstractServiceC23085i.f47035f = bVar;
                a aVarD = abstractServiceC23085i.d(str, i12, bundle2);
                abstractServiceC23085i.f47035f = null;
                if (aVarD == null) {
                    aVar = null;
                } else {
                    if (dVar.f47051c != null) {
                        abstractServiceC23085i.f47033d.add(bVar);
                    }
                    Bundle bundle3 = aVarD.f47039b;
                    if (bundleE == null) {
                        bundleE = bundle3;
                    } else if (bundle3 != null) {
                        bundleE.putAll(bundle3);
                    }
                    aVar = new a(bundleE, aVarD.f47038a);
                }
                if (aVar == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(aVar.f47038a, aVar.f47039b);
            }

            @Override // android.service.media.MediaBrowserService
            public final void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                j jVar = new j(result);
                d dVar = d.this;
                dVar.getClass();
                androidx.media.k kVar = new androidx.media.k(str, jVar);
                AbstractServiceC23085i abstractServiceC23085i = AbstractServiceC23085i.this;
                abstractServiceC23085i.f47035f = abstractServiceC23085i.f47032c;
                abstractServiceC23085i.f(str, kVar);
                abstractServiceC23085i.f47035f = null;
            }
        }

        public d() {
        }

        @Override // androidx.media.AbstractServiceC23085i.c
        public C.b a() {
            b bVar = AbstractServiceC23085i.this.f47035f;
            if (bVar != null) {
                return bVar.f47043d;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    @X
    /* renamed from: androidx.media.i$e */
    public class e extends d {

        /* compiled from: MediaBrowserServiceCompat.java */
        /* renamed from: androidx.media.i$e$a */
        public class a extends d.a {
            public a(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public final void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                j jVar = new j(result);
                e eVar = e.this;
                eVar.getClass();
                androidx.media.n nVar = new androidx.media.n(str, jVar);
                AbstractServiceC23085i abstractServiceC23085i = AbstractServiceC23085i.this;
                abstractServiceC23085i.f47035f = abstractServiceC23085i.f47032c;
                abstractServiceC23085i.g(str, nVar);
                abstractServiceC23085i.f47035f = null;
            }
        }

        public e() {
            super();
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    @X
    /* renamed from: androidx.media.i$f */
    public class f extends e {

        /* compiled from: MediaBrowserServiceCompat.java */
        /* renamed from: androidx.media.i$f$a */
        public class a extends e.a {
            public a(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public final void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.ensureClassLoader(bundle);
                f fVar = f.this;
                AbstractServiceC23085i abstractServiceC23085i = AbstractServiceC23085i.this;
                o oVar = new o(fVar, str, new j(result), bundle);
                abstractServiceC23085i.f47035f = abstractServiceC23085i.f47032c;
                abstractServiceC23085i.e(bundle, oVar, str);
                abstractServiceC23085i.f47035f = null;
                AbstractServiceC23085i.this.f47035f = null;
            }
        }

        public f() {
            super();
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    @X
    /* renamed from: androidx.media.i$g */
    public class g extends f {
        public g() {
            super();
        }

        @Override // androidx.media.AbstractServiceC23085i.d, androidx.media.AbstractServiceC23085i.c
        public final C.b a() {
            AbstractServiceC23085i abstractServiceC23085i = AbstractServiceC23085i.this;
            b bVar = abstractServiceC23085i.f47035f;
            if (bVar != null) {
                return bVar == abstractServiceC23085i.f47032c ? new C.b(this.f47050b.getCurrentBrowserInfo()) : bVar.f47043d;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* renamed from: androidx.media.i$h */
    public class h implements c {
        @Override // androidx.media.AbstractServiceC23085i.c
        public final C.b a() {
            throw null;
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    @X
    /* renamed from: androidx.media.i$j */
    public static class j<T> {

        /* renamed from: a, reason: collision with root package name */
        public final MediaBrowserService.Result f47064a;

        public j(MediaBrowserService.Result result) {
            this.f47064a = result;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(T t12) {
            boolean z12 = t12 instanceof List;
            ArrayList arrayList = null;
            MediaBrowserService.Result result = this.f47064a;
            if (!z12) {
                if (!(t12 instanceof Parcel)) {
                    result.sendResult(null);
                    return;
                }
                Parcel parcel = (Parcel) t12;
                parcel.setDataPosition(0);
                result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
                return;
            }
            List<Parcel> list = (List) t12;
            if (list != null) {
                arrayList = new ArrayList(list.size());
                for (Parcel parcel2 : list) {
                    parcel2.setDataPosition(0);
                    arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
                    parcel2.recycle();
                }
            }
            result.sendResult(arrayList);
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* renamed from: androidx.media.i$k */
    public class k {
        public k() {
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* renamed from: androidx.media.i$l */
    public interface l {
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* renamed from: androidx.media.i$m */
    public static class m implements l {

        /* renamed from: a, reason: collision with root package name */
        public final Messenger f47066a;

        public m(Messenger messenger) {
            this.f47066a = messenger;
        }

        public final void a(String str, Bundle bundle, List list) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putBundle("data_options", bundle);
            bundle2.putBundle("data_notify_children_changed_options", null);
            if (list != null) {
                bundle2.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            b(3, bundle2);
        }

        public final void b(int i12, Bundle bundle) {
            Message messageObtain = Message.obtain();
            messageObtain.what = i12;
            messageObtain.arg1 = 2;
            messageObtain.setData(bundle);
            this.f47066a.send(messageObtain);
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* renamed from: androidx.media.i$n */
    public final class n extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final k f47067a;

        public n(AbstractServiceC23085i abstractServiceC23085i) {
            this.f47067a = abstractServiceC23085i.new k();
        }

        public final void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Bundle data = message.getData();
            int i12 = message.what;
            k kVar = this.f47067a;
            switch (i12) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.ensureClassLoader(bundle);
                    String string = data.getString("data_package_name");
                    int i13 = data.getInt("data_calling_pid");
                    int i14 = data.getInt("data_calling_uid");
                    m mVar = new m(message.replyTo);
                    AbstractServiceC23085i abstractServiceC23085i = AbstractServiceC23085i.this;
                    if (string != null) {
                        for (String str : abstractServiceC23085i.getPackageManager().getPackagesForUid(i14)) {
                            if (str.equals(string)) {
                                abstractServiceC23085i.f47036g.a(new t(i13, i14, bundle, kVar, mVar, string));
                                return;
                            }
                        }
                    }
                    throw new IllegalArgumentException("Package/uid mismatch: uid=" + i14 + " package=" + string);
                case 2:
                    AbstractServiceC23085i.this.f47036g.a(new u(kVar, new m(message.replyTo)));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.ensureClassLoader(bundle2);
                    String string2 = data.getString("data_media_item_id");
                    IBinder binder = data.getBinder("data_callback_token");
                    AbstractServiceC23085i.this.f47036g.a(new v(kVar, new m(message.replyTo), string2, binder, bundle2));
                    return;
                case 4:
                    String string3 = data.getString("data_media_item_id");
                    IBinder binder2 = data.getBinder("data_callback_token");
                    AbstractServiceC23085i.this.f47036g.a(new w(kVar, new m(message.replyTo), string3, binder2));
                    return;
                case 5:
                    String string4 = data.getString("data_media_item_id");
                    ResultReceiver resultReceiver = (ResultReceiver) data.getParcelable("data_result_receiver");
                    m mVar2 = new m(message.replyTo);
                    kVar.getClass();
                    if (TextUtils.isEmpty(string4) || resultReceiver == null) {
                        return;
                    }
                    AbstractServiceC23085i.this.f47036g.a(new x(kVar, mVar2, string4, resultReceiver));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.ensureClassLoader(bundle3);
                    m mVar3 = new m(message.replyTo);
                    String string5 = data.getString("data_package_name");
                    int i15 = data.getInt("data_calling_pid");
                    AbstractServiceC23085i.this.f47036g.a(new y(data.getInt("data_calling_uid"), i15, bundle3, kVar, mVar3, string5));
                    return;
                case 7:
                    AbstractServiceC23085i.this.f47036g.a(new z(kVar, new m(message.replyTo)));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.ensureClassLoader(bundle4);
                    String string6 = data.getString("data_search_query");
                    ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    m mVar4 = new m(message.replyTo);
                    kVar.getClass();
                    if (TextUtils.isEmpty(string6) || resultReceiver2 == null) {
                        return;
                    }
                    AbstractServiceC23085i.this.f47036g.a(new A(kVar, mVar4, string6, bundle4, resultReceiver2));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.ensureClassLoader(bundle5);
                    String string7 = data.getString("data_custom_action");
                    ResultReceiver resultReceiver3 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    m mVar5 = new m(message.replyTo);
                    kVar.getClass();
                    if (TextUtils.isEmpty(string7) || resultReceiver3 == null) {
                        return;
                    }
                    AbstractServiceC23085i.this.f47036g.a(new B(kVar, mVar5, string7, bundle5, resultReceiver3));
                    return;
                default:
                    message.toString();
                    return;
            }
        }

        @Override // android.os.Handler
        public final boolean sendMessageAtTime(Message message, long j12) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j12);
        }
    }

    static {
        Log.isLoggable("MBServiceCompat", 3);
    }

    public static List a(List list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i12 = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i13 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
        if (i12 == -1 && i13 == -1) {
            return list;
        }
        int i14 = i13 * i12;
        int size = i14 + i13;
        if (i12 < 0 || i13 < 1 || i14 >= list.size()) {
            return Collections.emptyList();
        }
        if (size > list.size()) {
            size = list.size();
        }
        return list.subList(i14, size);
    }

    @N
    public final C.b b() {
        return this.f47031b.a();
    }

    public void c(Bundle bundle, @N C1812i c1812i, @N String str) {
        c1812i.e();
    }

    @P
    public abstract a d(@N String str, int i12, @P Bundle bundle);

    public void e(@N Bundle bundle, @N C1812i c1812i, @N String str) {
        c1812i.f47063e = 1;
        f(str, c1812i);
    }

    public abstract void f(@N String str, @N C1812i<List<MediaBrowserCompat.MediaItem>> c1812i);

    public void g(String str, @N C1812i<MediaBrowserCompat.MediaItem> c1812i) {
        c1812i.f47063e = 2;
        c1812i.f(null);
    }

    public void h(Bundle bundle, @N C1812i c1812i, @N String str) {
        c1812i.f47063e = 4;
        c1812i.f(null);
    }

    public final void k(MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.f47037h != null) {
            throw new IllegalStateException("The session token has already been set");
        }
        this.f47037h = token;
        f fVar = this.f47031b;
        AbstractServiceC23085i abstractServiceC23085i = AbstractServiceC23085i.this;
        abstractServiceC23085i.f47036g.a(new RunnableC23086j(fVar, token));
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f47031b.f47050b.onBind(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 28) {
            this.f47031b = new g();
        } else {
            this.f47031b = new f();
        }
        f fVar = this.f47031b;
        fVar.getClass();
        f.a aVar = fVar.new a(AbstractServiceC23085i.this);
        fVar.f47050b = aVar;
        aVar.onCreate();
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* renamed from: androidx.media.i$i, reason: collision with other inner class name */
    public static class C1812i<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f47059a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f47060b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f47061c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f47062d;

        /* renamed from: e, reason: collision with root package name */
        public int f47063e;

        public C1812i(Object obj) {
            this.f47059a = obj;
        }

        public void a() {
            boolean z12 = this.f47060b;
            Object obj = this.f47059a;
            if (z12) {
                throw new IllegalStateException(androidx.camera.view.k.a(obj, "detach() called when detach() had already been called for: "));
            }
            if (this.f47061c) {
                throw new IllegalStateException(androidx.camera.view.k.a(obj, "detach() called when sendResult() had already been called for: "));
            }
            if (this.f47062d) {
                throw new IllegalStateException(androidx.camera.view.k.a(obj, "detach() called when sendError() had already been called for: "));
            }
            this.f47060b = true;
        }

        public final boolean b() {
            return this.f47060b || this.f47061c || this.f47062d;
        }

        public void c() {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f47059a);
        }

        public final void e() {
            if (this.f47061c || this.f47062d) {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f47059a);
            }
            this.f47062d = true;
            c();
        }

        public final void f(@P T t12) {
            if (this.f47061c || this.f47062d) {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f47059a);
            }
            this.f47061c = true;
            d(t12);
        }

        public void d(@P T t12) {
        }
    }

    @RestrictTo
    public void j(String str) {
    }

    @RestrictTo
    public void i(Bundle bundle, String str) {
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
