package com.avito.android.notifications_permission_messenger;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.appcompat.widget.AppCompatImageView;
import com.avito.android.R;
import com.avito.android.component.toast.c;
import com.avito.android.lib.design.modal.a;
import com.avito.android.notifications_permission_messenger.deeplink.NotificationPermissionMessengerDialogDeeplink;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: NotificationPermissionMessengerDialogViewFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notifications_permission_messenger/i;", "Lcom/avito/android/notifications_permission_messenger/n;", "_avito_notifications-permission-messenger-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f207992a;

    @Inject
    public i(@Y61.k Context context) {
        this.f207992a = context;
    }

    @Override // com.avito.android.notifications_permission_messenger.n
    @Y61.k
    public final c.a.b a() {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.f207992a, R.style.Theme_DesignSystem_Re23);
        AppCompatImageView appCompatImageView = new AppCompatImageView(contextThemeWrapper);
        appCompatImageView.setImageResource(C35835l0.j(R.attr.ic_checkThin20, contextThemeWrapper));
        appCompatImageView.setImageTintList(ColorStateList.valueOf(C35835l0.d(R.attr.white, contextThemeWrapper)));
        appCompatImageView.setPadding(0, 0, y6.b(8), y6.b(18));
        return new c.a.b(appCompatImageView);
    }

    @Override // com.avito.android.notifications_permission_messenger.n
    @Y61.k
    public final com.avito.android.lib.design.modal.a b(@Y61.k Context context, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.Theme_DesignSystem_Re23);
        a.C5284a c5284a = com.avito.android.lib.design.modal.a.f179704d;
        h hVar = new h(aVar, aVar2);
        c5284a.getClass();
        return a.C5284a.a(contextThemeWrapper, 0, R.style.Re23_Modal_Default, hVar);
    }

    @Override // com.avito.android.notifications_permission_messenger.n
    @Y61.k
    public final NotificationPermissionMessengerDialogFragment c(@Y61.k NotificationPermissionMessengerDialogDeeplink notificationPermissionMessengerDialogDeeplink, @Y61.k String str) {
        NotificationPermissionMessengerDialogFragment.f207893j0.getClass();
        NotificationPermissionMessengerDialogFragment notificationPermissionMessengerDialogFragment = new NotificationPermissionMessengerDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("call_methods_link", notificationPermissionMessengerDialogDeeplink);
        bundle.putString("request_key", str);
        notificationPermissionMessengerDialogFragment.setArguments(bundle);
        return notificationPermissionMessengerDialogFragment;
    }
}
