package com.avito.android.notifications_permission_messenger;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.notifications_permission_messenger.deeplink.NotificationPermissionMessengerDialogDeeplink;
import com.avito.android.ui.fragments.BaseDialogFragment;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: NotificationPermissionMessengerDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/notifications_permission_messenger/NotificationPermissionMessengerDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_notifications-permission-messenger-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NotificationPermissionMessengerDialogFragment extends BaseDialogFragment implements InterfaceC28477j.a {

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public static final a f207893j0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.modal.a f207894h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f207895i0;

    /* compiled from: NotificationPermissionMessengerDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/notifications_permission_messenger/NotificationPermissionMessengerDialogFragment$a;", "", "<init>", "()V", "", "ARG_LINK", "Ljava/lang/String;", "ARG_REQUEST_KEY", "_avito_notifications-permission-messenger-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: NotificationPermissionMessengerDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/notifications_permission_messenger/i;", "invoke", "()Lcom/avito/android/notifications_permission_messenger/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<i> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final i invoke() {
            return new i(NotificationPermissionMessengerDialogFragment.this.requireContext());
        }
    }

    public NotificationPermissionMessengerDialogFragment() {
        super(0, 1, null);
        this.f207895i0 = C42727D.c(new b());
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        NotificationPermissionMessengerDialogDeeplink notificationPermissionMessengerDialogDeeplink;
        Bundle arguments = getArguments();
        if (arguments != null) {
            notificationPermissionMessengerDialogDeeplink = (NotificationPermissionMessengerDialogDeeplink) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("call_methods_link", NotificationPermissionMessengerDialogDeeplink.class) : arguments.getParcelable("call_methods_link"));
        } else {
            notificationPermissionMessengerDialogDeeplink = null;
        }
        if (notificationPermissionMessengerDialogDeeplink == null) {
            throw new IllegalArgumentException("DeepLink is not provided");
        }
        String string = requireArguments().getString("request_key");
        if (string == null) {
            throw new IllegalArgumentException("Request key is not provided");
        }
        com.avito.android.lib.design.modal.a aVarB = ((n) this.f207895i0.getValue()).b(requireContext(), new l(this, string, notificationPermissionMessengerDialogDeeplink), new m(this, string, notificationPermissionMessengerDialogDeeplink));
        this.f207894h0 = aVarB;
        return aVarB;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.avito.android.lib.design.modal.a aVar = this.f207894h0;
        if (aVar != null) {
            aVar.dismiss();
        }
        this.f207894h0 = null;
    }
}
