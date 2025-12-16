package androidx.compose.foundation.text;

import androidx.compose.runtime.C22066f2;
import kotlin.Metadata;

/* compiled from: AndroidCursorHandle.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20847b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f30647l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f30648m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f30649n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20847b(androidx.compose.ui.v vVar, int i12, int i13) {
        super(2);
        this.f30647l = vVar;
        this.f30648m = i12;
        this.f30649n = i13;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f30648m | 1);
        int i12 = this.f30649n;
        C20843a.b(this.f30647l, a12, iA2, i12);
        return kotlin.G0.f406611a;
    }
}
