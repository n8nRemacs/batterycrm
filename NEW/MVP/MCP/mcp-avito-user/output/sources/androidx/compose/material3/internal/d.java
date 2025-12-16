package androidx.compose.material3.internal;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExposedDropdownMenuPopup.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f36571l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ LayoutDirection f36572m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p pVar, LayoutDirection layoutDirection) {
        super(0);
        this.f36571l = pVar;
        this.f36572m = layoutDirection;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f36571l.j(this.f36572m);
        return G0.f406611a;
    }
}
