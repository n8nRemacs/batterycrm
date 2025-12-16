package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ContextMenuArea.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.contextmenu.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20416a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f27001l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f27002m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f27003n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ N f27004o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f27005p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20416a(s sVar, Y41.a aVar, androidx.compose.ui.v vVar, Y41.l lVar, int i12) {
        super(2);
        this.f27001l = sVar;
        this.f27002m = aVar;
        this.f27003n = vVar;
        this.f27004o = (N) lVar;
        this.f27005p = i12;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) throws Throwable {
        num.intValue();
        int iA2 = C22066f2.a(this.f27005p | 1);
        ?? r32 = this.f27004o;
        f.a(this.f27001l, this.f27002m, this.f27003n, r32, a12, iA2);
        return G0.f406611a;
    }
}
