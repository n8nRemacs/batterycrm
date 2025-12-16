package com.avito.android.notifications_permission_messenger;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.avito.android.notifications_permission_messenger.NotificationPermissionMessengerDialogFragment;
import com.avito.android.notifications_permission_messenger.NotificationPermissionMessengerDialogResult;
import com.avito.android.notifications_permission_messenger.deeplink.NotificationPermissionMessengerDialogDeeplink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NotificationPermissionMessengerDialogFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class l extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ NotificationPermissionMessengerDialogFragment f207995l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f207996m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ NotificationPermissionMessengerDialogDeeplink f207997n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(NotificationPermissionMessengerDialogFragment notificationPermissionMessengerDialogFragment, String str, NotificationPermissionMessengerDialogDeeplink notificationPermissionMessengerDialogDeeplink) {
        super(0);
        this.f207995l = notificationPermissionMessengerDialogFragment;
        this.f207996m = str;
        this.f207997n = notificationPermissionMessengerDialogDeeplink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        NotificationPermissionMessengerDialogResult.OnEnableClicked onEnableClicked = new NotificationPermissionMessengerDialogResult.OnEnableClicked(this.f207997n);
        NotificationPermissionMessengerDialogFragment notificationPermissionMessengerDialogFragment = this.f207995l;
        String str = this.f207996m;
        NotificationPermissionMessengerDialogFragment.a aVar = NotificationPermissionMessengerDialogFragment.f207893j0;
        FragmentManager parentFragmentManager = notificationPermissionMessengerDialogFragment.getParentFragmentManager();
        Bundle bundle = new Bundle();
        bundle.putParcelable("notifications_permission_messenger.NotificationPermissionMessengerDialogResult", onEnableClicked);
        parentFragmentManager.o0(bundle, str);
        return G0.f406611a;
    }
}
