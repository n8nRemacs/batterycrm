package com.avito.android.error;

import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ErrorsHandlings.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Result", "", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.error.k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30352k extends kotlin.jvm.internal.N implements Y41.l<Map<String, ? extends String>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f147752l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30352k(Y41.l<? super String, G0> lVar) {
        super(1);
        this.f147752l = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, java.lang.Object] */
    @Override // Y41.l
    public final G0 invoke(Map<String, ? extends String> map) {
        String str = (String) C42745f0.F(map.values());
        if (str == null) {
            str = "";
        }
        this.f147752l.invoke(str);
        return G0.f406611a;
    }
}
