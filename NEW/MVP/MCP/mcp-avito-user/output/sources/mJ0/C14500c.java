package Mj0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CaptchaApi_Module_ProvideCaptchaApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LMj0/c;", "Ldagger/internal/h;", "LMj0/a;", "a", "_avito-discouraged_avito-network_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Mj0.c, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C14500c implements h<InterfaceC14498a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f11007b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f11008a;

    /* compiled from: CaptchaApi_Module_ProvideCaptchaApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMj0/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-network_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mj0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C14500c(@k f fVar) {
        this.f11008a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f11008a.get();
        f11007b.getClass();
        C14499b.f11006a.getClass();
        InterfaceC14498a interfaceC14498a = (InterfaceC14498a) r02.create(InterfaceC14498a.class);
        t.b(interfaceC14498a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC14498a;
    }
}
