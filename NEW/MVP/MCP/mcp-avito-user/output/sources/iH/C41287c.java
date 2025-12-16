package iH;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UploadDocApi_Module_ProvideUploadDocApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LiH/c;", "Ldagger/internal/h;", "LiH/a;", "a", "_avito_gig_upload-doc_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iH.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C41287c implements h<InterfaceC41285a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f398460b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f398461a;

    /* compiled from: UploadDocApi_Module_ProvideUploadDocApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LiH/c$a;", "", "<init>", "()V", "_avito_gig_upload-doc_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iH.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C41287c(@k f fVar) {
        this.f398461a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f398461a.get();
        f398460b.getClass();
        C41286b.f398459a.getClass();
        InterfaceC41285a interfaceC41285a = (InterfaceC41285a) r02.create(InterfaceC41285a.class);
        t.b(interfaceC41285a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC41285a;
    }
}
