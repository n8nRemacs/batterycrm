package io.ktor.client.engine.android;

import Y41.p;
import java.net.HttpURLConnection;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AndroidClientEngine.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "key", "value", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes8.dex */
final class d extends N implements p<String, String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ HttpURLConnection f398868l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(HttpURLConnection httpURLConnection) {
        super(2);
        this.f398868l = httpURLConnection;
    }

    @Override // Y41.p
    public final G0 invoke(String str, String str2) {
        this.f398868l.addRequestProperty(str, str2);
        return G0.f406611a;
    }
}
