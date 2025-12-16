package pW;

import android.app.Activity;
import com.avito.android.util.L6;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import qW.C47352a;

/* compiled from: FindDetectLocationModule_ProvideDetectLocationHelperFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LpW/d;", "Ldagger/internal/h;", "LqW/a;", "a", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pW.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47013d implements dagger.internal.h<C47352a> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f428558d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f428559a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f428560b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final u f428561c;

    /* compiled from: FindDetectLocationModule_ProvideDetectLocationHelperFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpW/d$a;", "", "<init>", "()V", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pW.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C47013d(@Y61.k dagger.internal.l lVar, @Y61.k dagger.internal.l lVar2, @Y61.k u uVar) {
        this.f428559a = lVar;
        this.f428560b = lVar2;
        this.f428561c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Activity activity = (Activity) this.f428559a.f393949a;
        com.avito.android.ui.a aVar = (com.avito.android.ui.a) this.f428560b.f393949a;
        L6 l62 = (L6) this.f428561c.get();
        f428558d.getClass();
        int i12 = C47010a.f428553a;
        return new C47352a(activity, aVar, l62);
    }
}
