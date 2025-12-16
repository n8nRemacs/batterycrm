package androidx.compose.ui.window;

import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AndroidDialog.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.window.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22723j extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f43089l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, G0> f43090m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f43091n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22723j(androidx.compose.ui.v vVar, Y41.p pVar, int i12) {
        super(2);
        this.f43089l = vVar;
        this.f43090m = pVar;
        this.f43091n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f43091n | 1);
        C22724k.b(this.f43089l, this.f43090m, a12, iA2);
        return G0.f406611a;
    }
}
