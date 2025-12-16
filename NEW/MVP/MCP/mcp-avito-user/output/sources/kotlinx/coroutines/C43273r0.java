package kotlinx.coroutines;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlinx/coroutines/F0;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.r0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43273r0 implements F0 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f411961b;

    public C43273r0(boolean z12) {
        this.f411961b = z12;
    }

    @Override // kotlinx.coroutines.F0
    @Y61.l
    /* renamed from: c */
    public final C43132e1 getList() {
        return null;
    }

    @Override // kotlinx.coroutines.F0
    /* renamed from: isActive, reason: from getter */
    public final boolean getF411961b() {
        return this.f411961b;
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("Empty{"), this.f411961b ? "Active" : "New", '}');
    }
}
