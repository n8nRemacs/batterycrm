package androidx.compose.material3;

import androidx.compose.runtime.C22066f2;
import kotlin.Metadata;

/* compiled from: TextFieldDefaults.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.wi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21957wi extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Li f37690l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f37691m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f37692n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.k f37693o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C21935vi f37694p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.h1 f37695q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f37696r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21957wi(Li li2, boolean z12, boolean z13, androidx.compose.foundation.interaction.k kVar, C21935vi c21935vi, androidx.compose.ui.graphics.h1 h1Var, int i12) {
        super(2);
        this.f37690l = li2;
        this.f37691m = z12;
        this.f37692n = z13;
        this.f37693o = kVar;
        this.f37694p = c21935vi;
        this.f37695q = h1Var;
        this.f37696r = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f37696r | 1);
        boolean z12 = this.f37692n;
        androidx.compose.foundation.interaction.k kVar = this.f37693o;
        this.f37690l.a(this.f37691m, z12, kVar, this.f37694p, this.f37695q, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
