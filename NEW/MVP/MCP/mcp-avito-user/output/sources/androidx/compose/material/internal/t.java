package androidx.compose.material.internal;

import androidx.compose.runtime.C22082i3;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExposedDropdownMenuPopup.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class t extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f33702l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(s sVar) {
        super(0);
        this.f33702l = sVar;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        s sVar = this.f33702l;
        return Boolean.valueOf((((androidx.compose.ui.unit.s) ((C22082i3) sVar.f33694o).getF42167b()) == null || ((androidx.compose.ui.unit.u) ((C22082i3) sVar.f33695p).getF42167b()) == null) ? false : true);
    }
}
