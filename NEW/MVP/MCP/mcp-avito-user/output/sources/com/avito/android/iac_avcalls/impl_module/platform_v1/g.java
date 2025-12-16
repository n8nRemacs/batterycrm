package com.avito.android.iac_avcalls.impl_module.platform_v1;

import kotlin.Metadata;

/* compiled from: AvCallsPlatformImplV1.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f164605b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f164606c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GJ.a f164607d;

    public g(d dVar, String str, GJ.a aVar) {
        this.f164605b = dVar;
        this.f164606c = str;
        this.f164607d = aVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        int i12 = d.f164594e;
        GJ.a aVar = this.f164607d;
        d dVar = this.f164605b;
        String str = this.f164606c;
        dVar.q(aVar, str);
        dVar.p(str, (Throwable) obj);
    }
}
