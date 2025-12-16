package Tf0;

import Bk0.InterfaceC13158a;
import Qf0.C14891a;
import Y61.k;
import com.adjust.sdk.Constants;
import com.avito.android.remote.notification.InterfaceC34350q;
import com.avito.android.remote.notification.analytics.NotificationEvent;
import com.squareup.anvil.annotations.ContributesBinding;
import dg0.InterfaceC39724a;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: OnMessageReceivedPushServiceDelegateImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LTf0/a;", "Ldg0/a;", "a", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Tf0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C15359a implements InterfaceC39724a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SK.a f15811a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC34350q f15812b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC13158a f15813c;

    /* compiled from: OnMessageReceivedPushServiceDelegateImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LTf0/a$a;", "", "<init>", "()V", "", "ADJUST_SILENT_PUSH_KEY", "Ljava/lang/String;", "ADJUST_SILENT_PUSH_VALUE", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Tf0.a$a, reason: collision with other inner class name */
    public static final class C1079a {
        public /* synthetic */ C1079a(C42822w c42822w) {
            this();
        }

        public C1079a() {
        }
    }

    static {
        new C1079a(null);
    }

    @Inject
    public C15359a(@k SK.a aVar, @k InterfaceC34350q interfaceC34350q, @k InterfaceC13158a interfaceC13158a) {
        this.f15811a = aVar;
        this.f15812b = interfaceC34350q;
        this.f15813c = interfaceC13158a;
    }

    @Override // dg0.InterfaceC39724a
    public final void a(@k C14891a c14891a) {
        NotificationEvent notificationEvent = NotificationEvent.f254003c;
        InterfaceC13158a interfaceC13158a = this.f15813c;
        interfaceC13158a.d(notificationEvent);
        String str = c14891a.f13969g;
        interfaceC13158a.g(str);
        Map<String, String> map = c14891a.f13963a;
        if (L.f((map == null ? P0.c() : map).get(Constants.FCM_PAYLOAD_KEY), Constants.FCM_PAYLOAD_VALUE)) {
            interfaceC13158a.d(NotificationEvent.f254004d);
            return;
        }
        if (this.f15811a.a(c14891a.f13965c, c14891a.f13966d, str, map)) {
            interfaceC13158a.d(NotificationEvent.f254005e);
        } else {
            this.f15812b.b(c14891a);
        }
    }
}
