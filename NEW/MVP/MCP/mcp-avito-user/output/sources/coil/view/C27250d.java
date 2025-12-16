package coil.view;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.DisplayMetrics;
import coil.view.AbstractC27249c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.L;

/* compiled from: DisplaySizeResolver.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/size/d;", "Lcoil/size/h;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: coil.size.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27250d implements InterfaceC27254h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f58761b;

    public C27250d(@k Context context) {
        this.f58761b = context;
    }

    @Override // coil.view.InterfaceC27254h
    @l
    public final Object a(@k Continuation<? super C27253g> continuation) {
        DisplayMetrics displayMetrics = this.f58761b.getResources().getDisplayMetrics();
        AbstractC27249c.a aVar = new AbstractC27249c.a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new C27253g(aVar, aVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C27250d) {
            if (L.f(this.f58761b, ((C27250d) obj).f58761b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f58761b.hashCode();
    }
}
