package com.vk.api.sdk.chain;

import android.os.Bundle;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.sdk.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InvalidCredentialsObserverChainCall.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/api/sdk/chain/g;", "T", "Lcom/vk/api/sdk/chain/d;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class g<T> extends d<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final d<T> f366556b;

    /* renamed from: c, reason: collision with root package name */
    public final int f366557c;

    public /* synthetic */ g(p pVar, d dVar, int i12, int i13, C42822w c42822w) {
        this(pVar, dVar, (i13 & 4) != 0 ? 0 : i12);
    }

    @Override // com.vk.api.sdk.chain.d
    @Y61.l
    public final T a(@Y61.k c cVar) {
        return b(cVar, 0);
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.C] */
    public final T b(c cVar, int i12) throws VKApiExecutionException {
        try {
            return this.f366556b.a(cVar);
        } catch (VKApiExecutionException e12) {
            int i13 = e12.f366584b;
            if (i13 == 4 || i13 == 5 || i13 == 3610) {
                p pVar = this.f366553a;
                int i14 = this.f366557c;
                if (i14 > 0 && i12 < i14) {
                    Bundle bundle = e12.f366586d;
                    String string = bundle != null ? bundle.getString("access_token", null) : null;
                    String str = ((com.vk.api.sdk.m) ((com.vk.api.sdk.okhttp.l) pVar.f366679d.getValue()).f366657c.getValue()).f366631a;
                    ((com.vk.api.sdk.okhttp.l) pVar.f366679d.getValue()).getClass();
                    boolean zF2 = L.f(string, str);
                    if (string != null && !zF2) {
                        return b(cVar, i12 + 1);
                    }
                }
                if (e12.f366584b == 3610) {
                    pVar.getClass();
                } else {
                    pVar.getClass();
                }
            }
            throw e12;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@Y61.k p pVar, @Y61.k d<? extends T> dVar, int i12) {
        super(pVar);
        this.f366556b = dVar;
        this.f366557c = i12;
    }
}
