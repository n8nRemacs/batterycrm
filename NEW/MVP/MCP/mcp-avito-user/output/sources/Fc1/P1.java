package Fc1;

import feedback.shared.sdk.api.network.entities.PostVisitsRequest;
import feedback.shared.sdk.api.network.entities.PostVisitsResponse;
import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.text.C43047d;

@InterfaceC42830m
/* loaded from: classes9.dex */
public final class P1<T> extends O1<T> {

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final PostVisitsRequest f5139t;

    public P1(@Y61.k D1 d12, @Y61.l PostVisitsRequest postVisitsRequest, @Y61.l C13598e1 c13598e1, @Y61.k C13598e1 c13598e12) {
        super(d12.a(), PostVisitsResponse.class, c13598e1, c13598e12);
        this.f5139t = postVisitsRequest;
    }

    @Override // com.android.volley.Request
    @Y61.k
    public final byte[] e() {
        String strL = this.f5121s.l(this.f5139t);
        if (strL == null) {
            kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
            strL = "";
        }
        return strL.getBytes(C43047d.f410589b);
    }

    @Override // Fc1.O1, com.android.volley.Request
    @Y61.k
    public final Map<String, String> i() {
        return super.i();
    }
}
