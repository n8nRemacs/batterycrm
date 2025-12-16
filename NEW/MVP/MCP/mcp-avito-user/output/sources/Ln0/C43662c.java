package lN0;

import Y61.k;
import com.avito.android.video_requirements.deeplink.VideoRequirementsLink;
import dagger.internal.h;
import kN0.C42607b;
import kN0.C42608c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: VideoRequirementsDeeplinkModule_ProvideVideoRequirementsLinkMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LlN0/c;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lN0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43662c implements h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f413728b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C42607b f413729a;

    /* compiled from: VideoRequirementsDeeplinkModule_ProvideVideoRequirementsLinkMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LlN0/c$a;", "", "<init>", "()V", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lN0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C43662c(@k C43661b c43661b, @k C42607b c42607b) {
        this.f413729a = c42607b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C42607b c42607b = this.f413729a;
        f413728b.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(VideoRequirementsLink.class, new C42608c(), new C43834a.b.C11809b(c42607b));
    }
}
