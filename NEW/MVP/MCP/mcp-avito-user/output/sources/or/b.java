package OR;

import Y61.k;
import com.avito.android.C29270c0;
import com.avito.android.C30276e0;
import com.avito.android.lib.beduin_v2.component.chips.a;
import com.avito.beduin.v2.render.android_view.n;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ChipsComponentModule_ProvideComponentFactoryFactory.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0011\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0002¢\u0006\u0002\b\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"LOR/b;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/render/android_view/n;", "LX41/o;", "a", "_design-modules_beduin-v2_renderer_component_chips"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements h<n<?>> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f12276b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C30276e0 f12277a;

    /* compiled from: ChipsComponentModule_ProvideComponentFactoryFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOR/b$a;", "", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_chips"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@k C30276e0 c30276e0) {
        this.f12277a = c30276e0;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C29270c0 c29270c0 = (C29270c0) this.f12277a.get();
        f12276b.getClass();
        OR.a.f12275a.getClass();
        return new a.C5182a(c29270c0);
    }
}
