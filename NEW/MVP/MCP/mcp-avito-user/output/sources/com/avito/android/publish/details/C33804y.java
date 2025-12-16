package com.avito.android.publish.details;

import android.content.DialogInterface;
import kotlin.Metadata;

/* compiled from: ItemDetailsView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.details.y, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33804y extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f235088l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f235089m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33804y(Y41.a aVar, DialogInterface dialogInterface) {
        super(0);
        this.f235088l = dialogInterface;
        this.f235089m = aVar;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        this.f235088l.dismiss();
        this.f235089m.invoke();
        return kotlin.G0.f406611a;
    }
}
