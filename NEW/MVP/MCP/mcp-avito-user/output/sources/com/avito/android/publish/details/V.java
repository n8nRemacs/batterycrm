package com.avito.android.publish.details;

import com.avito.android.publish.details.D;
import kotlin.Metadata;

/* compiled from: ItemPresentersDelegate.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class V extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E f233171l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f233172m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(E e12, String str) {
        super(0);
        this.f233171l = e12;
        this.f233172m = str;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        D.a aVar = this.f233171l.f232652s;
        if (aVar != null) {
            aVar.W4(this.f233172m);
        }
        return kotlin.G0.f406611a;
    }
}
