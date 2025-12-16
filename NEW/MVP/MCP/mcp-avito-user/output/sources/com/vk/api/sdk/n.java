package com.vk.api.sdk;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VKApiCredentials.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/vk/api/sdk/m;", "<anonymous>", "()Lcom/vk/api/sdk/m;"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class n extends N implements Y41.a<m> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G11.a> f366635l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Y41.a<G11.a> aVar) {
        super(0);
        this.f366635l = aVar;
    }

    @Override // Y41.a
    public final m invoke() {
        String str;
        G11.a aVarInvoke = this.f366635l.invoke();
        String str2 = "";
        if (aVarInvoke != null && (str = aVarInvoke.f6198b) != null) {
            str2 = str;
        }
        return new m(str2, aVarInvoke == null ? null : aVarInvoke.f6199c);
    }
}
