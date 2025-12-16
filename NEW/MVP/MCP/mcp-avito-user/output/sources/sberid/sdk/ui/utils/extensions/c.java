package sberid.sdk.ui.utils.extensions;

import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.OkHttpClient;

@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class c extends N implements Y41.a<OkHttpClient.Builder> {

    /* renamed from: l, reason: collision with root package name */
    public static final c f437901l = new c();

    public c() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, okhttp3.OkHttpClient$Builder] */
    @Override // Y41.a
    @Y61.k
    public final OkHttpClient.Builder invoke() {
        if (sc1.o.a()) {
            throw new IllegalStateException("Используйте SID.Initializer.initialize(application: Application, clientId: String) для инициализации библиотеки, прежде чем использовать методы.");
        }
        return org.koin.java.c.a(OkHttpClient.Builder.class);
    }
}
