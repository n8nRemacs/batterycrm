package Bx0;

import AK0.l;
import Y61.k;
import com.avito.android.di.module.C30214v6;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CvUploadPreferencesImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LBx0/e;", "Ldagger/internal/h;", "LBx0/b;", "a", "_avito_job_cv-upload_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Bx0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13204e implements h<C13201b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f1819b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C30214v6 f1820a;

    /* compiled from: CvUploadPreferencesImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBx0/e$a;", "", "<init>", "()V", "_avito_job_cv-upload_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bx0.e$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C13204e(@k C30214v6 c30214v6) {
        this.f1820a = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l lVar = (l) this.f1820a.get();
        f1819b.getClass();
        return new C13201b(lVar);
    }
}
