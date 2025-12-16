package Aw0;

import Y61.k;
import Y61.l;
import com.squareup.anvil.annotations.ContributesBinding;
import j.U;
import j.r;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.reflect.n;

/* compiled from: ShortcutBarInteractorImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAw0/b;", "LAw0/a;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements InterfaceC13094a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.shortcut_navigation_bar.splitter.features.a f704a;

    /* renamed from: b, reason: collision with root package name */
    public int f705b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Integer f706c;

    @Inject
    public b(@k com.avito.android.shortcut_navigation_bar.splitter.features.a aVar) {
        this.f704a = aVar;
    }

    @Override // Aw0.InterfaceC13094a
    @U
    public final int a(@r @l Integer num) {
        if (L.f(this.f706c, num)) {
            return this.f705b;
        }
        return 0;
    }

    @Override // Aw0.InterfaceC13094a
    public final boolean b() {
        com.avito.android.shortcut_navigation_bar.splitter.features.a aVar = this.f704a;
        aVar.getClass();
        n<Object> nVar = com.avito.android.shortcut_navigation_bar.splitter.features.a.f283557d[0];
        return ((Boolean) aVar.f283558b.a().invoke()).booleanValue();
    }

    @Override // Aw0.InterfaceC13094a
    public final void c(@U int i12, @r @l Integer num) {
        this.f705b = i12;
        this.f706c = num;
    }

    @Override // Aw0.InterfaceC13094a
    public final boolean d() {
        com.avito.android.shortcut_navigation_bar.splitter.features.a aVar = this.f704a;
        aVar.getClass();
        n<Object> nVar = com.avito.android.shortcut_navigation_bar.splitter.features.a.f283557d[1];
        return ((Boolean) aVar.f283559c.a().invoke()).booleanValue();
    }
}
