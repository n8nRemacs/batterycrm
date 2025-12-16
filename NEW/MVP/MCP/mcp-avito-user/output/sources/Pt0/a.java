package PT0;

import Y61.k;
import android.view.View;
import dU0.InterfaceC39628a;
import kotlin.Metadata;

/* compiled from: ComponentInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"LPT0/a;", "Landroid/view/View;", "V", "LdU0/a;", "I", "LPT0/c;", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class a<V extends View, I extends InterfaceC39628a> implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Class<? extends InterfaceC39628a> f13073a;

    public a(@k Class<? extends InterfaceC39628a> cls) {
        this.f13073a = cls;
    }

    @Override // PT0.c
    public final void a(@k InterfaceC39628a interfaceC39628a, @k View view) {
        c(interfaceC39628a, view);
    }

    @Override // PT0.c
    @k
    public final Class<? extends InterfaceC39628a> b() {
        return this.f13073a;
    }

    public abstract void c(@k I i12, @k V v12);
}
