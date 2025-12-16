package com.avito.android.remote_device_id.domain;

import Y41.l;
import com.avito.android.util.V2;
import com.avito.android.util.rx3.C35907l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Retries.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "Lcom/avito/android/util/rx3/l;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/rx3/l;)V", "com/avito/android/util/G4", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class d extends N implements l<C35907l, G0> {

    /* renamed from: l, reason: collision with root package name */
    public static final d f254420l = new d();

    public d() {
        super(1);
    }

    @Override // Y41.l
    public final G0 invoke(C35907l c35907l) {
        V2.f318762a.c("NetworkRetry", AK.c.j(c35907l.f319037b, " ms", new StringBuilder("Waiting ")), null);
        return G0.f406611a;
    }
}
