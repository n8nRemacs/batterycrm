package com.avito.android.messenger.service.user_last_activity;

import com.avito.android.util.V2;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: UserLastActivitySyncAgent.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "error", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f197326b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set<String> f197327c;

    public e(b bVar, Set<String> set) {
        this.f197326b = bVar;
        this.f197327c = set;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        V2.f318762a.a(this.f197326b.f207131E, "getUserIdsToPoll(requestedUserIds = " + this.f197327c + ") error!", (Throwable) obj);
        return C42784z0.f406748b;
    }
}
