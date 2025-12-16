package com.avito.android.advert.viewed.persistance;

import java.util.Set;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: ViewedAdvertsStorage.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "", "", "it", "", "invoke", "(Lkotlin/Q;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class o extends N implements Y41.l<Q<? extends String, ? extends Long>, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Set<String> f81068l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Set<String> set) {
        super(1);
        this.f81068l = set;
    }

    @Override // Y41.l
    public final Boolean invoke(Q<? extends String, ? extends Long> q12) {
        return Boolean.valueOf(!this.f81068l.contains(q12.f406619b));
    }
}
