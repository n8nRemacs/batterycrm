package Xf0;

import AK0.l;
import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import jg0.InterfaceC42375a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SendPushTokenStorageImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LXf0/a;", "Ljg0/a;", "a", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xf0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C17001a implements InterfaceC42375a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final String f19001b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final String f19002c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final String f19003d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final String f19004e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final String f19005f;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f19006a;

    /* compiled from: SendPushTokenStorageImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXf0/a$a;", "", "<init>", "()V", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xf0.a$a, reason: collision with other inner class name */
    public static final class C1344a {
        public /* synthetic */ C1344a(C42822w c42822w) {
            this();
        }

        public C1344a() {
        }
    }

    static {
        new C1344a(null);
        f19001b = "gcm_token_last_sync";
        f19002c = "voip_gcm_token_last_sync";
        f19003d = "push_token_last_version";
        f19004e = "voip_push_token_last_version";
        f19005f = "first_app_start_detector_saved_state";
    }

    @Inject
    public C17001a(@k l lVar) {
        this.f19006a = lVar;
    }

    @Override // jg0.InterfaceC42375a
    public final void a() {
        this.f19006a.putBoolean(f19005f, false);
    }

    @Override // jg0.InterfaceC42375a
    @k
    public final String b() {
        String string = this.f19006a.getString(f19004e);
        return string == null ? "" : string;
    }

    @Override // jg0.InterfaceC42375a
    public final long c() {
        return this.f19006a.getLong(f19001b, 0L);
    }

    @Override // jg0.InterfaceC42375a
    public final void clear() {
        d(0L);
        j("");
        h(0L);
        f("");
    }

    @Override // jg0.InterfaceC42375a
    public final void d(long j12) {
        this.f19006a.putLong(f19001b, j12);
    }

    @Override // jg0.InterfaceC42375a
    @k
    public final String e() {
        String string = this.f19006a.getString(f19003d);
        return string == null ? "" : string;
    }

    @Override // jg0.InterfaceC42375a
    public final void f(@k String str) {
        this.f19006a.putString(f19004e, str);
    }

    @Override // jg0.InterfaceC42375a
    public final long g() {
        return this.f19006a.getLong(f19002c, 0L);
    }

    @Override // jg0.InterfaceC42375a
    public final void h(long j12) {
        this.f19006a.putLong(f19002c, j12);
    }

    @Override // jg0.InterfaceC42375a
    public final boolean i() {
        return this.f19006a.getBoolean(f19005f, true);
    }

    @Override // jg0.InterfaceC42375a
    public final void j(@k String str) {
        this.f19006a.putString(f19003d, str);
    }
}
