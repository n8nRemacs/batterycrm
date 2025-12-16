package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ContextMenuUi.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class w extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f27064l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f27065m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f27066n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ N f27067o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f27068p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(String str, g gVar, androidx.compose.ui.v vVar, Y41.a aVar, int i12) {
        super(2);
        this.f27064l = str;
        this.f27065m = gVar;
        this.f27066n = vVar;
        this.f27067o = (N) aVar;
        this.f27068p = i12;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f27068p | 1);
        ?? r32 = this.f27067o;
        g gVar = this.f27065m;
        androidx.compose.ui.v vVar = this.f27066n;
        B.b(this.f27064l, gVar, vVar, r32, a12, iA2);
        return G0.f406611a;
    }
}
