package com.avito.android.lib.beduin_v2.feature.tracker;

import kotlin.Metadata;
import kotlin.jvm.internal.N;
import okhttp3.HttpUrl;
import okhttp3.Request;

/* compiled from: NetworkRequestTracker.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lokhttp3/Request;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class f extends N implements Y41.a<Request> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SU0.e f176378l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f176379m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SU0.e eVar, g gVar) {
        super(0);
        this.f176378l = eVar;
        this.f176379m = gVar;
    }

    @Override // Y41.a
    public final Request invoke() {
        Request.Builder builder = new Request.Builder();
        HttpUrl.Companion companion = HttpUrl.INSTANCE;
        SU0.e eVar = this.f176378l;
        HttpUrl httpUrl = companion.parse(eVar.f15011a);
        if (httpUrl == null) {
            StringBuilder sb2 = new StringBuilder();
            g gVar = this.f176379m;
            sb2.append(gVar.f176380a);
            sb2.append(eVar.f15011a);
            httpUrl = companion.parse(sb2.toString());
            if (httpUrl == null) {
                httpUrl = companion.get(gVar.f176380a);
            }
        }
        builder.url(httpUrl);
        return builder.build();
    }
}
