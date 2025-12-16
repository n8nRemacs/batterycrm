package lE;

import com.avito.android.C34161r;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: StrFeaturesModule_ProvideStrFeaturesFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LlE/d;", "Ldagger/internal/h;", "LlE/b;", "a", "_avito-discouraged_avito-feature_str"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<C43624b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f413654b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<C34161r> f413655a;

    /* compiled from: StrFeaturesModule_ProvideStrFeaturesFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LlE/d$a;", "", "<init>", "()V", "_avito-discouraged_avito-feature_str"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@Y61.k Provider<C34161r> provider) {
        this.f413655a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f413655a.get();
        f413654b.getClass();
        C43625c.f413653a.getClass();
        return (C43624b) c34161r.f246393a.b(C43624b.class);
    }
}
