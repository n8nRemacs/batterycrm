package tN0;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.f;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VideoSnippetsExposureInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LtN0/d;", "Ldagger/internal/h;", "LtN0/c;", "a", "_avito_video-snippets-utils_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements h<c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f439238b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f439239a;

    /* compiled from: VideoSnippetsExposureInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LtN0/d$a;", "", "<init>", "()V", "_avito_video-snippets-utils_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k f fVar) {
        this.f439239a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f439239a.get();
        f439238b.getClass();
        return new c(interfaceC28373a);
    }
}
