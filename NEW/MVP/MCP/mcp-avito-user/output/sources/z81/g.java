package z81;

import Y41.l;
import kotlin.jvm.internal.N;
import okhttp3.OkHttpClient;

/* loaded from: classes9.dex */
public final class g extends N implements l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f443868l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar) {
        super(1);
        this.f443868l = jVar;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        OkHttpClient.Builder builder = (OkHttpClient.Builder) obj;
        j jVar = this.f443868l;
        builder.addInterceptor(((C50400b) jVar.f443871a).f443864b);
        return j.a(jVar, builder);
    }
}
