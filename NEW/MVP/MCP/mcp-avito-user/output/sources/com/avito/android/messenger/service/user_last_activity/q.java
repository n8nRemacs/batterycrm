package com.avito.android.messenger.service.user_last_activity;

import com.avito.android.messenger.channels.mvi.data.f0;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UserLastActivitySyncAgent.kt */
@s0
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* synthetic */ class q implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f197339b;

    public q(f0 f0Var) {
        this.f197339b = f0Var;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return this.f197339b.f((Collection) obj);
    }
}
