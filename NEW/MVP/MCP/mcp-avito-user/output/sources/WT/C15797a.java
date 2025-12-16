package Wt;

import Vt.h;
import Xt.InterfaceC17045a;
import Y61.k;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CircularDataProvider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LWt/a;", "LWt/c;", "LVt/h;", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Wt.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C15797a implements c, h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public List<? extends InterfaceC17045a> f18079a;

    public C15797a() {
        throw null;
    }

    @Override // Wt.c
    @k
    public final InterfaceC17045a a(int i12) {
        return this.f18079a.get(c(i12));
    }

    @Override // Wt.c
    public final int b(int i12) {
        int size = 1000 % this.f18079a.size();
        return (size > 0 ? 1000 - size : 1000) + i12;
    }

    @Override // Wt.c
    public final int c(int i12) {
        return i12 % this.f18079a.size();
    }

    @Override // Wt.c
    public final int d() {
        return 2000;
    }
}
