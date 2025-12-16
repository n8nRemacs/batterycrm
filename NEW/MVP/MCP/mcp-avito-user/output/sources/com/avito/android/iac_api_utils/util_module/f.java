package com.avito.android.iac_api_utils.util_module;

import kotlin.Metadata;

/* compiled from: IacApiTracker.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class f<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f164312b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f164313c;

    public f(b bVar, String str) {
        this.f164312b = bVar;
        this.f164313c = str;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f164312b.d(this.f164313c, (Throwable) obj);
    }
}
