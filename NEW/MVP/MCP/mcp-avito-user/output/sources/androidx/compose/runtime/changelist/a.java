package androidx.compose.runtime.changelist;

import Y61.k;
import androidx.compose.foundation.H;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.O2;
import androidx.compose.runtime.internal.L;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChangeList.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/a;", "Landroidx/compose/runtime/changelist/h;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f38190a = new g();

    @Override // androidx.compose.runtime.changelist.h
    @k
    public final String a(@k String str) {
        StringBuilder sbR = H.r("ChangeList instance containing ");
        g gVar = this.f38190a;
        sbR.append(gVar.f38246b);
        sbR.append(" operations");
        if (sbR.length() > 0) {
            sbR.append(":\n");
            sbR.append(gVar.a(str));
        }
        return sbR.toString();
    }

    public final void b(@k InterfaceC22078i interfaceC22078i, @k O2 o22, @k L l12) {
        this.f38190a.c(interfaceC22078i, o22, l12);
    }
}
