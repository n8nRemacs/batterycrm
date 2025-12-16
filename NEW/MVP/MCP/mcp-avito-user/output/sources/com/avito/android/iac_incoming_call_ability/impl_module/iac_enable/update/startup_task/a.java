package com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.update.startup_task;

import kotlin.Metadata;
import l41.r;

/* compiled from: IacUpdateAvailabilityTask.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/permissions/PermissionState;", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class a<T> implements r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IacUpdateAvailabilityTask f168383b;

    public a(IacUpdateAvailabilityTask iacUpdateAvailabilityTask) {
        this.f168383b = iacUpdateAvailabilityTask;
    }

    @Override // l41.r
    public final boolean test(Object obj) {
        return this.f168383b.accountStateProvider.b();
    }
}
