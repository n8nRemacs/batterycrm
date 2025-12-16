package Lj0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CaptchaApi_Module_ProvideCaptchaApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LLj0/d;", "Ldagger/internal/h;", "LLj0/a;", "a", "_avito-discouraged_avito-network_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class d implements h<InterfaceC14403a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f10094b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f10095a;

    /* compiled from: CaptchaApi_Module_ProvideCaptchaApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLj0/d$a;", "", "<init>", "()V", "_avito-discouraged_avito-network_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k f fVar) {
        this.f10095a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f10095a.get();
        f10094b.getClass();
        c.f10093a.getClass();
        InterfaceC14403a interfaceC14403a = (InterfaceC14403a) r02.create(InterfaceC14403a.class);
        t.b(interfaceC14403a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC14403a;
    }
}
