package Zc;

import Y61.k;
import ad.C19868b;
import ad.C19869c;
import cd.C27177a;
import cd.C27178b;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.C;
import dagger.internal.f;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeviceInfoExtractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LZc/e;", "Ldagger/internal/h;", "LZc/c;", "a", "_common_antifraud_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zc.e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C19537e implements h<C19535c> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f20285e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<C> f20286a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C27178b f20287b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C19869c f20288c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final f f20289d;

    /* compiled from: DeviceInfoExtractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZc/e$a;", "", "<init>", "()V", "_common_antifraud_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zc.e$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C19537e(@k Provider provider, @k C27178b c27178b, @k C19869c c19869c, @k f fVar) {
        this.f20286a = provider;
        this.f20287b = c27178b;
        this.f20288c = c19869c;
        this.f20289d = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = this.f20286a.get();
        C27177a c27177a = (C27177a) this.f20287b.get();
        this.f20288c.getClass();
        C19868b c19868b = new C19868b();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f20289d.get();
        f20285e.getClass();
        return new C19535c(c12, c27177a, c19868b, interfaceC28373a);
    }
}
