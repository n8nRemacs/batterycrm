package androidx.compose.material.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExposedDropdownMenuPopup.android.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll0/g;", "offset", "Landroidx/compose/ui/unit/s;", "bounds", "", "invoke-KMgbckE", "(Ll0/g;Landroidx/compose/ui/unit/s;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class u extends N implements Y41.p<l0.g, androidx.compose.ui.unit.s, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final u f33703l = new u();

    public u() {
        super(2);
    }

    @Override // Y41.p
    public final Boolean invoke(l0.g gVar, androidx.compose.ui.unit.s sVar) {
        l0.g gVar2 = gVar;
        androidx.compose.ui.unit.s sVar2 = sVar;
        boolean z12 = false;
        if (gVar2 != null) {
            long j12 = gVar2.f413387a;
            if (l0.g.g(j12) < sVar2.f42867a || l0.g.g(j12) > sVar2.f42869c || l0.g.h(j12) < sVar2.f42868b || l0.g.h(j12) > sVar2.f42870d) {
                z12 = true;
            }
        }
        return Boolean.valueOf(z12);
    }
}
