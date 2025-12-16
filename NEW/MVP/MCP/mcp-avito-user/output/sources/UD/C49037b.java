package ud;

import AK0.l;
import Y61.k;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AppRaterStorageImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lud/b;", "Lud/a;", "a", "_avito_app-rater_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ud.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49037b implements InterfaceC49036a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f440188a;

    /* compiled from: AppRaterStorageImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lud/b$a;", "", "<init>", "()V", "", "APP_RATER_LAST_CALL_TIMESTAMP", "Ljava/lang/String;", "GET_APPS_APP_RATER_LAST_CALL_TIMESTAMP", "_avito_app-rater_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ud.b$a */
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
    public C49037b(@k l lVar) {
        this.f440188a = lVar;
    }

    @k
    public final LocalDateTime a() {
        return LocalDateTime.ofEpochSecond(this.f440188a.getLong("APP_RATER_LAST_CALL_TIMESTAMP", -1L), 0, ZoneOffset.UTC);
    }

    public final void b(@k LocalDateTime localDateTime) {
        this.f440188a.putLong("APP_RATER_LAST_CALL_TIMESTAMP", localDateTime.toEpochSecond(ZoneOffset.UTC));
    }
}
