package N30;

import Y61.k;
import android.content.SharedPreferences;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: NotificationPermissionInfoScreenStatusStorage.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LN30/b;", "LN30/a;", "a", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements N30.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SharedPreferences f11181a;

    /* compiled from: NotificationPermissionInfoScreenStatusStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LN30/b$a;", "", "<init>", "()V", "", "STATUS_KEY", "Ljava/lang/String;", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public b(@k SharedPreferences sharedPreferences) {
        this.f11181a = sharedPreferences;
    }

    @Override // N30.a
    public final void a() {
        SharedPreferences.Editor editorEdit = this.f11181a.edit();
        editorEdit.putBoolean("is_notification_permission_info_shown", true);
        editorEdit.apply();
    }
}
