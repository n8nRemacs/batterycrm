package PL;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MiuiUtilsImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LPL/k;", "Ldagger/internal/h;", "LPL/j;", "a", "_avito_iac-miui-utils_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f13017b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30102l3 f13018a;

    /* compiled from: MiuiUtilsImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPL/k$a;", "", "<init>", "()V", "_avito_iac-miui-utils_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public k(@Y61.k C30102l3 c30102l3) {
        this.f13018a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f13018a.get();
        f13017b.getClass();
        return new j(context);
    }
}
