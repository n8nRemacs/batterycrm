package u40;

import Y61.k;
import android.app.Application;
import com.avito.android.util.C35836l1;
import dagger.internal.h;
import dagger.internal.l;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import r40.C47487a;
import r40.f;

/* compiled from: OfflineModule_ConfigFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lu40/d;", "Ldagger/internal/h;", "Lr40/a;", "a", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: u40.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C48795d implements h<C47487a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f439777b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f439778a;

    /* compiled from: OfflineModule_ConfigFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu40/d$a;", "", "<init>", "()V", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: u40.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C48795d(@k l lVar) {
        this.f439778a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f439778a.f393949a;
        f439777b.getClass();
        C48792a.f439771a.getClass();
        File filesDir = application.getFilesDir();
        r40.f.f429585a.getClass();
        File file = new File(filesDir, f.a.f429587b);
        C35836l1.a(file);
        return new C47487a(file);
    }
}
