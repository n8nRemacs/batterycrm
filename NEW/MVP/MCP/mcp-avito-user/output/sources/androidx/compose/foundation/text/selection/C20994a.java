package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import kotlin.Metadata;

/* compiled from: AndroidSelectionHandles.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.selection.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20994a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC21039u f31906l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22215f f31907m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f31908n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f31909o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20994a(InterfaceC21039u interfaceC21039u, InterfaceC22215f interfaceC22215f, C22096n c22096n, int i12) {
        super(2);
        this.f31906l = interfaceC21039u;
        this.f31907m = interfaceC22215f;
        this.f31908n = c22096n;
        this.f31909o = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) throws Throwable {
        num.intValue();
        int iA2 = C22066f2.a(this.f31909o | 1);
        C22096n c22096n = this.f31908n;
        C21006e.a(this.f31906l, this.f31907m, c22096n, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
