package com.avito.avcalls.android;

import com.avito.avcalls.android.rtc.w;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvCallsBuilderImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/avcalls/android/rtc/w;", "invoke", "()Lcom/avito/avcalls/android/rtc/w;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class d extends N implements Y41.a<w> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f331690l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ wQ0.d f331691m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, wQ0.d dVar) {
        super(0);
        this.f331690l = eVar;
        this.f331691m = dVar;
    }

    @Override // Y41.a
    public final w invoke() {
        return new w(this.f331690l.f331701j, this.f331691m);
    }
}
