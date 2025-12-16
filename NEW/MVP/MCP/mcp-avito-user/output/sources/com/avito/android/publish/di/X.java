package com.avito.android.publish.di;

import com.avito.android.util.InterfaceC35745a5;
import kotlin.Metadata;

/* compiled from: PublishTasksModule.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "draftId", "Lcom/avito/android/photo_cache/n;", "invoke", "(Ljava/lang/String;)Lcom/avito/android/photo_cache/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class X extends kotlin.jvm.internal.N implements Y41.l<String, com.avito.android.photo_cache.n> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.photo_cache.b f235162l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC35745a5 f235163m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(com.avito.android.photo_cache.b bVar, InterfaceC35745a5 interfaceC35745a5) {
        super(1);
        this.f235162l = bVar;
        this.f235163m = interfaceC35745a5;
    }

    @Override // Y41.l
    public final com.avito.android.photo_cache.n invoke(String str) {
        return new com.avito.android.photo_cache.n(str, this.f235162l, this.f235163m);
    }
}
