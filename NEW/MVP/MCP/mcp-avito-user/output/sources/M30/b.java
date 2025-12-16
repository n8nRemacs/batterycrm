package M30;

import Y61.k;
import com.avito.android.P;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.notifications_permission.ab_test.config.NotificationPermissionInfoTestGroup;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import u3.f;

/* compiled from: NotificationPermissionDialogAbTestProvider.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LM30/b;", "LM30/a;", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final P f10365a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC27642e f10366b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c0 f10367c;

    @Inject
    public b(@k P p12, @k InterfaceC27642e interfaceC27642e, @k c0 c0Var) {
        this.f10365a = p12;
        this.f10366b = interfaceC27642e;
        this.f10367c = c0Var;
    }

    @Override // M30.a
    @k
    public final f<NotificationPermissionInfoTestGroup> a() {
        return new f<>(this.f10366b.c(new e(this.f10365a)), this.f10367c);
    }
}
