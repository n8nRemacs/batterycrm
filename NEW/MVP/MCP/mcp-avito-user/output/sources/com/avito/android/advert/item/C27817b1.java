package com.avito.android.advert.item;

import android.content.DialogInterface;
import kotlin.Metadata;

/* compiled from: AdvertDetailsRouter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert.item.b1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27817b1 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f73180l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f73181m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C27817b1(Y41.a<kotlin.G0> aVar, DialogInterface dialogInterface) {
        super(0);
        this.f73180l = (kotlin.jvm.internal.N) aVar;
        this.f73181m = dialogInterface;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.a
    public final kotlin.G0 invoke() {
        this.f73180l.invoke();
        this.f73181m.dismiss();
        return kotlin.G0.f406611a;
    }
}
