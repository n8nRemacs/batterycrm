package androidx.compose.runtime.changelist;

import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FixupList.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/c;", "Landroidx/compose/runtime/changelist/h;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f38203a = new g();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g f38204b = new g();

    @Override // androidx.compose.runtime.changelist.h
    @k
    public final String a(@k String str) {
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder("FixupList instance containing ");
        g gVar = this.f38203a;
        sb3.append(gVar.f38246b);
        sb3.append(" operations");
        sb2.append(sb3.toString());
        if (sb2.length() > 0) {
            sb2.append(":\n" + gVar.a(str));
        }
        return sb2.toString();
    }
}
