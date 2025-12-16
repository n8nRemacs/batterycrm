package com.avito.android.code_confirmation.phone_management;

import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: PhoneManagementPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class q extends N implements Y41.l<Map<String, ? extends String>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w f119699l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(w wVar) {
        super(1);
        this.f119699l = wVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(Map<String, ? extends String> map) {
        E e12;
        Map<String, ? extends String> map2 = map;
        w wVar = this.f119699l;
        wVar.f119718m = map2;
        if (!map2.isEmpty() && (e12 = wVar.f119713h) != null) {
            e12.c((String) C42745f0.D(map2.values()));
        }
        return G0.f406611a;
    }
}
