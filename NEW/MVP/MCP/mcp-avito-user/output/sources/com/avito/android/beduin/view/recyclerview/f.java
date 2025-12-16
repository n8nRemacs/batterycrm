package com.avito.android.beduin.view.recyclerview;

import Y61.k;
import Y61.l;
import androidx.fragment.app.ActivityC22955m;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.beduin.common.component.adapter.a;
import ej.InterfaceC40116e;
import ej.InterfaceC40117f;
import gj.InterfaceC40691b;
import gj.i;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ScrollHandler.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/view/recyclerview/f;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ActivityC22955m f105206a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final i f105207b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final gj.l f105208c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public InterfaceC40691b f105209d;

    public f(@k ActivityC22955m activityC22955m, @k i iVar, @l gj.l lVar) {
        this.f105206a = activityC22955m;
        this.f105207b = iVar;
        this.f105208c = lVar;
    }

    public static final void a(f fVar, RecyclerView recyclerView, int i12, boolean z12) {
        if (z12) {
            RecyclerView.C cP2 = recyclerView.P(i12);
            a.C3019a c3019a = cP2 instanceof a.C3019a ? (a.C3019a) cP2 : null;
            InterfaceC40116e interfaceC40116e = c3019a != null ? c3019a.f100615b : null;
            if (interfaceC40116e instanceof InterfaceC40117f) {
                ((InterfaceC40117f) interfaceC40116e).e();
            }
        }
    }
}
