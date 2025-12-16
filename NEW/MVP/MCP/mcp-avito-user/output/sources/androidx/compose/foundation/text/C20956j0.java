package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C21011f1;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: ContextMenu.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20956j0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C21011f1 f31537l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f31538m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f31539n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20956j0(C21011f1 c21011f1, C22096n c22096n, int i12) {
        super(2);
        this.f31537l = c21011f1;
        this.f31538m = c22096n;
        this.f31539n = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f31539n | 1);
        C21064w0.a(this.f31537l, this.f31538m, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
