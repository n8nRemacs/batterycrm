package u40;

import Y61.k;
import android.app.Application;
import com.avito.android.offlinization.beduin.p;
import com.avito.android.util.C35836l1;
import dagger.internal.h;
import dagger.internal.l;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: OfflineModule_PatternConfigFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lu40/g;", "Ldagger/internal/h;", "Lcom/avito/android/offlinization/beduin/p;", "a", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements h<p> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f439785b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f439786a;

    /* compiled from: OfflineModule_PatternConfigFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu40/g$a;", "", "<init>", "()V", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@k l lVar) {
        this.f439786a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f439786a.f393949a;
        f439785b.getClass();
        C48792a.f439771a.getClass();
        File file = new File(application.getFilesDir(), "pattern_cache");
        C35836l1.a(file);
        return new p(file);
    }
}
