package com.avito.android.favorite_apprater;

import kotlin.Metadata;

/* compiled from: FavoriteAppRaterInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Long;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class c<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f155264b;

    public c(d dVar) {
        this.f155264b = dVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Long l12 = (Long) obj;
        if (l12.longValue() >= 3) {
            return Boolean.TRUE;
        }
        this.f155264b.f155265a.a(l12.longValue() + 1);
        return Boolean.FALSE;
    }
}
