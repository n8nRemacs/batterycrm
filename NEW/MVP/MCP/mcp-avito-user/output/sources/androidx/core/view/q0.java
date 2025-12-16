package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.sequences.C43033p;
import kotlin.sequences.C43034q;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: View.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q0 {

    /* compiled from: View.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.l<ViewParent, ViewParent> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f45091b = new a();

        public a() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        @Override // Y41.l
        public final ViewParent invoke(ViewParent viewParent) {
            return viewParent.getParent();
        }
    }

    @Y61.k
    public static final C43034q a(@Y61.k View view) {
        return new C43034q(new p0(view, null));
    }

    @Y61.k
    public static final InterfaceC43030m<ViewParent> b(@Y61.k View view) {
        return C43033p.u(a.f45091b, view.getParent());
    }
}
