package vK0;

import X41.n;
import Y61.k;
import android.app.Application;
import android.content.ClipboardManager;
import dagger.internal.h;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ClipboardModule_ProvideClipboardManager$_common_discouraged_utils_androidFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LvK0/b;", "Ldagger/internal/h;", "Landroid/content/ClipboardManager;", "a", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vK0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49228b implements h<ClipboardManager> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f440688b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f440689a;

    /* compiled from: ClipboardModule_ProvideClipboardManager$_common_discouraged_utils_androidFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/avito/android/util/di/ClipboardModule_ProvideClipboardManager$_common_discouraged_utils_androidFactory.Companion", "", "<init>", "()V", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vK0.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @n
        @k
        public static ClipboardManager a(@k Application application) {
            int i12 = C49227a.f440687a;
            return (ClipboardManager) application.getSystemService("clipboard");
        }

        public a() {
        }
    }

    public C49228b(@k u uVar) {
        this.f440689a = uVar;
    }

    @n
    @k
    public static final C49228b a(@k u uVar) {
        f440688b.getClass();
        return new C49228b(uVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f440689a.get();
        f440688b.getClass();
        return a.a(application);
    }
}
