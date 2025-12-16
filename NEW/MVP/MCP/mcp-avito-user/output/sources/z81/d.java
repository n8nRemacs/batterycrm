package z81;

import okhttp3.OkHttpClient;

/* loaded from: classes9.dex */
public final class d implements InterfaceC50401c {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f443865a;

    /* renamed from: b, reason: collision with root package name */
    public final OkHttpClient f443866b;

    public d(f fVar) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        j jVar = (j) fVar;
        jVar.f443873c.invoke(builder);
        this.f443865a = builder.build();
        OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
        jVar.f443875e.invoke(builder2);
        this.f443866b = builder2.build();
    }
}
