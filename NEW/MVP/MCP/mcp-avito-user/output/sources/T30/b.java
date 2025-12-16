package T30;

import Y61.k;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.notifications_permission_messenger.ab_test.config.NotificationPermissionMessengerTestGroup;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import u3.l;

/* compiled from: NotificationPermissionMessengerDialogAbTestProvider.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT30/b;", "LT30/a;", "_avito_notifications-permission-messenger-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final U30.a f15337a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC27642e f15338b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c0 f15339c;

    @Inject
    public b(@k U30.a aVar, @k InterfaceC27642e interfaceC27642e, @k c0 c0Var) {
        this.f15337a = aVar;
        this.f15338b = interfaceC27642e;
        this.f15339c = c0Var;
    }

    @Override // T30.a
    @k
    public final l<NotificationPermissionMessengerTestGroup> a() {
        return new l<>(this.f15338b.c(new e(this.f15337a)), this.f15339c);
    }
}
