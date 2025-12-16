package ca1;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* renamed from: ca1.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C27136b extends N implements Y41.p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.passport.ui.address.f f57936l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27136b(ru.mts.biometry.sdk.feature.passport.ui.address.f fVar) {
        super(2);
        this.f57936l = fVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        RecyclerView recyclerView;
        ((Number) obj).intValue();
        int iIntValue = ((Number) obj2).intValue();
        B91.n nVar = this.f57936l.f436484g0;
        if (nVar != null && (recyclerView = nVar.f1150d) != null) {
            H91.g.a(0, iIntValue, 7, recyclerView);
        }
        return G0.f406611a;
    }
}
