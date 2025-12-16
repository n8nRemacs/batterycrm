package com.avito.android.messenger.service.user_last_activity;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43544b;

/* compiled from: UserLastActivitySyncAgent.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lru/avito/messenger/api/entity/UserLastActivity;", "usersList", "", "newUsers", "Lkotlin/G0;", "accept", "(Ljava/util/List;Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class f<T1, T2> implements InterfaceC43544b {

    /* renamed from: b, reason: collision with root package name */
    public static final f<T1, T2> f197328b = new f<>();

    @Override // l41.InterfaceC43544b
    public final void accept(Object obj, Object obj2) {
        C42745f0.h((List) obj2, (List) obj);
    }
}
