package com.avito.android.offlinization.cache.lru;

import com.jakewharton.disklrucache.a;
import java.io.IOException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: OfflineInnerCacheLruImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f208577l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0.h<a.c> f208578m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, l0.h<a.c> hVar) {
        super(0);
        this.f208577l = aVar;
        this.f208578m = hVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        e eVar = new e(this.f208578m);
        int i12 = a.f208564e;
        this.f208577l.getClass();
        try {
            eVar.invoke();
        } catch (IOException unused) {
        }
        return G0.f406611a;
    }
}
