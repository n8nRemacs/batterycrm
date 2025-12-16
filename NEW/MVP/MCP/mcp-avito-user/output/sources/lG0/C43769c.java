package lg0;

import AK0.l;
import Y61.k;
import com.avito.android.push.PushService;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PushTokenStorage.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Llg0/c;", "Llg0/b;", "Llg0/a;", "a", "_avito_push-rustore_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
@ContributesBinding.b
/* renamed from: lg0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C43769c implements InterfaceC43768b, InterfaceC43767a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f414143a;

    /* compiled from: PushTokenStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Llg0/c$a;", "", "<init>", "()V", "", "PUSH_TOKEN", "Ljava/lang/String;", "PUSH_TOKEN_LAST_SYNC", "PUSH_TOKEN_LAST_VERSION", "_avito_push-rustore_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lg0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public C43769c(@k l lVar) {
        this.f414143a = lVar;
    }

    @Override // lg0.InterfaceC43767a
    public final void a() {
        for (PushService pushService : PushService.values()) {
            e(pushService, false);
            e(pushService, true);
        }
    }

    @Override // lg0.InterfaceC43768b
    public final long b(boolean z12) {
        PushService pushService = PushService.f245929d;
        StringBuilder sb2 = new StringBuilder();
        Qf0.b.f13970a.getClass();
        sb2.append(Qf0.b.a(pushService));
        sb2.append('_');
        sb2.append(z12);
        sb2.append("_push_token_last_sync");
        return this.f414143a.getLong(sb2.toString(), 0L);
    }

    @Override // lg0.InterfaceC43768b
    @k
    public final String c(boolean z12) {
        PushService pushService = PushService.f245929d;
        StringBuilder sb2 = new StringBuilder();
        Qf0.b.f13970a.getClass();
        sb2.append(Qf0.b.a(pushService));
        sb2.append('_');
        sb2.append(z12);
        sb2.append("_push_token_last_version");
        String string = this.f414143a.getString(sb2.toString());
        return string == null ? "" : string;
    }

    @Override // lg0.InterfaceC43767a
    public final void d(@k String str, boolean z12, long j12) {
        PushService pushService = PushService.f245929d;
        StringBuilder sb2 = new StringBuilder();
        Qf0.b.f13970a.getClass();
        sb2.append(Qf0.b.a(pushService));
        sb2.append('_');
        sb2.append(z12);
        sb2.append("_push_token_last_sync");
        String string = sb2.toString();
        l lVar = this.f414143a;
        lVar.putLong(string, j12);
        lVar.putString(Qf0.b.a(pushService) + '_' + z12 + "_push_token_last_version", str);
    }

    public final void e(@k PushService pushService, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        Qf0.b.f13970a.getClass();
        sb2.append(Qf0.b.a(pushService));
        sb2.append('_');
        sb2.append(z12);
        sb2.append("_push_token");
        String string = sb2.toString();
        l lVar = this.f414143a;
        lVar.putString(string, "");
        lVar.putLong(Qf0.b.a(pushService) + '_' + z12 + "_push_token_last_sync", 0L);
        lVar.putString(Qf0.b.a(pushService) + '_' + z12 + "_push_token_last_version", "");
    }
}
