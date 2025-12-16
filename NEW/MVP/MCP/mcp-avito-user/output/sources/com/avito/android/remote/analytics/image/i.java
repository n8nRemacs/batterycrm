package com.avito.android.remote.analytics.image;

import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: ImageCdnHeadersStorageImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Q;", "", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Q;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes17.dex */
final class i extends N implements Y41.l<Q<? extends String, ? extends String>, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final i f253133l = new i();

    public i() {
        super(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final Boolean invoke(Q<? extends String, ? extends String> q12) {
        return Boolean.valueOf(f.f253127c.contains((String) q12.f406619b));
    }
}
