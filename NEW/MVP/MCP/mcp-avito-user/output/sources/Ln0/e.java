package lN0;

import Y61.k;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import mN0.InterfaceC43984a;

/* compiled from: VideoRequirementsModule_ProvideVideoRequirementsInteractor$_avito_video_requirements_implFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LlN0/e;", "Ldagger/internal/h;", "Lcom/avito/android/video_requirements/domain/a;", "a", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements h<com.avito.android.video_requirements.domain.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f413730b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<InterfaceC43984a> f413731a;

    /* compiled from: VideoRequirementsModule_ProvideVideoRequirementsInteractor$_avito_video_requirements_implFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/avito/android/video_requirements/di/VideoRequirementsModule_ProvideVideoRequirementsInteractor$_avito_video_requirements_implFactory.Companion", "", "<init>", "()V", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k d dVar, @k Provider<InterfaceC43984a> provider) {
        this.f413731a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC43984a interfaceC43984a = this.f413731a.get();
        f413730b.getClass();
        return new com.avito.android.video_requirements.domain.b(interfaceC43984a);
    }
}
