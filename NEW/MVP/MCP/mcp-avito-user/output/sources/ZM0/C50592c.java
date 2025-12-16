package zm0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ReplaceMainApi_Module_ProvideReplaceMainApiFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lzm0/c;", "Ldagger/internal/h;", "Lzm0/a;", "a", "_avito_replace-main_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zm0.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C50592c implements h<InterfaceC50590a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f444239b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f444240a;

    /* compiled from: ReplaceMainApi_Module_ProvideReplaceMainApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzm0/c$a;", "", "<init>", "()V", "_avito_replace-main_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zm0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C50592c(@k f fVar) {
        this.f444240a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f444240a.get();
        f444239b.getClass();
        C50591b.f444238a.getClass();
        InterfaceC50590a interfaceC50590a = (InterfaceC50590a) r02.create(InterfaceC50590a.class);
        t.b(interfaceC50590a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC50590a;
    }
}
