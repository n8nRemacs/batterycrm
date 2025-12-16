package In;

import Y61.k;
import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CategoriesGlobalDeepLinkHandler_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LIn/c;", "Ldagger/internal/h;", "LIn/b;", "a", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements h<C14135b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f8540c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C30102l3 f8541a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final dv.b f8542b;

    /* compiled from: CategoriesGlobalDeepLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIn/c$a;", "", "<init>", "()V", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k C30102l3 c30102l3, @k dv.b bVar) {
        this.f8541a = c30102l3;
        this.f8542b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f8541a.get();
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f8542b.get();
        f8540c.getClass();
        return new C14135b(context, interfaceC4053a);
    }
}
