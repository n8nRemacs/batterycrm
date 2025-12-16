package JL;

import AK0.l;
import Y61.k;
import com.avito.android.util.V2;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CallStorageImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LJL/a;", "LOL/a;", "a", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements OL.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f8882a;

    /* compiled from: CallStorageImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"LJL/a$a;", "", "<init>", "()V", "", "CALLS_AVAILABLE_TIME_END", "Ljava/lang/String;", "CALLS_AVAILABLE_TIME_START", "CALLS_ENABLED", "CONTACT_METHOD_INFO_BLOCK_SHOW_TIMES", "FIRST_TOUCH_IAC_ENABLE_TOGGLE", "", "FIRST_TOUCH_IAC_ENABLE_TOGGLE_DEFAULT", "Z", "HAS_USER_FORCE_DISABLE_CALLS", "HAS_USER_FORCE_DISABLE_CALLS_DEFAULT", "IAC_CHOSEN_PRO_DEFAULT_STATE", "KEY_MIC_PERMISSION_IN_PUBLISH_SHOW_TIME", "KEY_SHOW_VIDEO_REQUEST_BADGE", "NEED_SHOW_DEVICES_SLOT_ON_BOARDING", "NEED_SHOW_DEVICES_SLOT_ON_BOARDING_DEFAULT", "SYSTEM_MIC_SHOWED_IN_PUBLISH", "SYSTEM_MIC_SHOWED_IN_PUBLISH_DEFAULT", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: JL.a$a, reason: collision with other inner class name */
    public static final class C0522a {
        public /* synthetic */ C0522a(C42822w c42822w) {
            this();
        }

        public C0522a() {
        }
    }

    static {
        new C0522a(null);
    }

    @Inject
    public a(@k l lVar) {
        this.f8882a = lVar;
    }

    @Override // OL.a
    public final void a() {
        V2.f318762a.c("CallStorage", "Clear flags on logout", null);
        c(0);
        d(false);
        s(null);
        t(null);
        b(false);
    }

    @Override // OL.a
    public final void b(boolean z12) {
        this.f8882a.putBoolean("system_mic_showed_in_publish", z12);
    }

    @Override // OL.a
    public final void c(int i12) {
        this.f8882a.a(i12, "CONTACT_METHOD_INFO_BLOCK_SHOW_TIMES");
    }

    @Override // OL.a
    public final void d(boolean z12) {
        this.f8882a.putBoolean("calls_enabled", z12);
    }

    @Override // OL.a
    public final void e() {
        this.f8882a.putBoolean("KEY_SHOW_VIDEO_REQUEST_BADGE", false);
    }

    @Override // OL.a
    public final boolean f() {
        l lVar = this.f8882a;
        if (lVar.contains("KEY_SHOW_VIDEO_REQUEST_BADGE")) {
            return lVar.c("KEY_SHOW_VIDEO_REQUEST_BADGE");
        }
        return true;
    }

    @Override // OL.a
    public final void g() {
        this.f8882a.putBoolean("need_show_devices_slot_on_boarding", false);
    }

    @Override // OL.a
    public final boolean h() {
        return this.f8882a.getBoolean("need_show_devices_slot_on_boarding", true);
    }

    @Override // OL.a
    public final boolean i() {
        return this.f8882a.getBoolean("system_mic_showed_in_publish", false);
    }

    @Override // OL.a
    public final boolean j() {
        return this.f8882a.getBoolean("calls_enabled", false);
    }

    @Override // OL.a
    public final void k(long j12) {
        this.f8882a.putLong("KEY_MIC_PERMISSION_ON_PUBLISH_SHOW_TIME", j12);
    }

    @Override // OL.a
    public final boolean l() {
        return this.f8882a.getBoolean("first_touch_iac_enable_toggle", true);
    }

    @Override // OL.a
    public final int m() {
        return this.f8882a.getInt("CONTACT_METHOD_INFO_BLOCK_SHOW_TIMES", 0);
    }

    @Override // OL.a
    public final void n() {
        this.f8882a.putBoolean("first_touch_iac_enable_toggle", false);
    }

    @Override // OL.a
    public final void o(boolean z12) {
        this.f8882a.putBoolean("has_user_force_disable_calls", z12);
    }

    @Override // OL.a
    @Y61.l
    public final String p() {
        return this.f8882a.getString("calls_available_time_end", null);
    }

    @Override // OL.a
    public final long q() {
        return this.f8882a.getLong("KEY_MIC_PERMISSION_ON_PUBLISH_SHOW_TIME", 0L);
    }

    @Override // OL.a
    @Y61.l
    public final String r() {
        return this.f8882a.getString("calls_available_time_start", null);
    }

    @Override // OL.a
    public final void s(@Y61.l String str) {
        this.f8882a.putString("calls_available_time_start", str);
    }

    @Override // OL.a
    public final void t(@Y61.l String str) {
        this.f8882a.putString("calls_available_time_end", str);
    }
}
