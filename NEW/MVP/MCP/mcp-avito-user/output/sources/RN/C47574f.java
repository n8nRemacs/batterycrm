package rN;

import Y61.k;
import com.avito.android.serp.adapter.InterfaceC34901y;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImvSimilarAdvertListItemPresenter_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LrN/f;", "Ldagger/internal/h;", "LrN/e;", "a", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rN.f, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47574f implements h<C47573e> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f429774b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<InterfaceC34901y> f429775a;

    /* compiled from: ImvSimilarAdvertListItemPresenter_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrN/f$a;", "", "<init>", "()V", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rN.f$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C47574f(@k Provider<InterfaceC34901y> provider) {
        this.f429775a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC34901y interfaceC34901y = this.f429775a.get();
        f429774b.getClass();
        return new C47573e(interfaceC34901y);
    }
}
