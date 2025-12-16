package com.avito.android.remote.notification;

import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: NotificationCounterStorage.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/notification/n;", "Lcom/avito/android/remote/notification/m;", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.notification.n, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34347n implements InterfaceC34346m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f254065a;

    /* renamed from: b, reason: collision with root package name */
    public int f254066b;

    @Inject
    public C34347n(@Y61.k AK0.l lVar) {
        this.f254065a = lVar;
        this.f254066b = lVar.getInt("key_notification_counter", 0);
    }

    @Override // com.avito.android.remote.notification.InterfaceC34346m
    public final int a() {
        int i12 = this.f254066b + 1;
        this.f254066b = i12;
        if (i12 == 100000) {
            this.f254066b = 0;
        }
        this.f254065a.a(this.f254066b, "key_notification_counter");
        return this.f254066b;
    }
}
