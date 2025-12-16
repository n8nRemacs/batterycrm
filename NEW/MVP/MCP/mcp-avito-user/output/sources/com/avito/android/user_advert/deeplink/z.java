package com.avito.android.user_advert.deeplink;

import com.avito.android.deep_linking.links.MyAdvertLink;
import kotlin.Metadata;

/* compiled from: MyAdvertRestorationV2DeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class z<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f310785b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MyAdvertLink.RestoreV2 f310786c;

    public z(A a12, MyAdvertLink.RestoreV2 restoreV2) {
        this.f310785b = a12;
        this.f310786c = restoreV2;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f310785b.j(new MyAdvertLink.RestoreV2.b.a(com.avito.android.error.z.n((Throwable) obj), this.f310786c.f133506c));
    }
}
