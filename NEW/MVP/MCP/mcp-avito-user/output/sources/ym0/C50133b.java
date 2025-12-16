package yM0;

import androidx.view.M0;
import androidx.view.P0;
import kotlin.Metadata;

/* compiled from: ComponentViewModelFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LyM0/b;", "Component", "Landroidx/lifecycle/P0$c;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yM0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50133b<Component> implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.a<Component> f443049a;

    /* JADX WARN: Multi-variable type inference failed */
    public C50133b(@Y61.k Y41.a<? extends Component> aVar) {
        this.f443049a = aVar;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        return new C50132a(this.f443049a.invoke());
    }
}
