package com.avito.avcalls.android.network_test;

import com.avito.avcalls.android.network_test.api.PrepareNetworkTest;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: NetworkTestConfigLoader.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/avcalls/android/call/models/MessagePayload;", "responseStr", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class b extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r f331795l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(kotlinx.coroutines.r rVar) {
        super(1);
        this.f331795l = rVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        kotlinx.coroutines.r rVar = this.f331795l;
        try {
            PrepareNetworkTest.Response response = (PrepareNetworkTest.Response) com.avito.avcalls.android.utils.i.a().d(str2, PrepareNetworkTest.Response.INSTANCE.serializer());
            a aVar = new a((String) C43066x.f0(response.f331790a, new String[]{":"}, 0, 6).get(0), Integer.parseInt((String) C43066x.f0(response.f331790a, new String[]{":"}, 0, 6).get(1)), response.f331791b, response.f331792c, response.f331793d);
            int i12 = Z.f406624c;
            rVar.resumeWith(aVar);
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            rVar.resumeWith(new Z.b(th2));
        }
        return G0.f406611a;
    }
}
