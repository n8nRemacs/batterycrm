package com.avito.android.image.enhancement;

import com.avito.android.image.enhancement.C30979j;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ImageEnhanceViewModel.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class N extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C30979j f169346l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f169347m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(C30979j c30979j, String str) {
        super(0);
        this.f169346l = c30979j;
        this.f169347m = str;
    }

    @Override // Y41.a
    public final G0 invoke() {
        C30979j c30979j = this.f169346l;
        c30979j.f169390m.onNext(C30979j.b.a.f169398a);
        c30979j.f169380c.a(this.f169347m);
        return G0.f406611a;
    }
}
