package com.avito.android.offlinization.beduin;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinCacheStarter.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class b extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f208529l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(0);
        this.f208529l = cVar;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        return Boolean.valueOf(!this.f208529l.f208535f.a());
    }
}
