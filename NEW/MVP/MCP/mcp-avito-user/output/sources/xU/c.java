package Xu;

import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ResourcesModule_ProvideResourcesFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LXu/c;", "Ldagger/internal/h;", "Landroid/content/res/Resources;", "a", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements h<Resources> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f19125b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C30102l3 f19126a;

    /* compiled from: ResourcesModule_ProvideResourcesFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXu/c$a;", "", "<init>", "()V", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k C30102l3 c30102l3) {
        this.f19126a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f19126a.get();
        f19125b.getClass();
        C17048b.f19124a.getClass();
        return context.getResources();
    }
}
