package androidx.compose.material3;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import kotlin.Metadata;

/* compiled from: SheetDefaults.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21783p1 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f37008l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f37009m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21783p1(float f12, float f13) {
        super(2);
        this.f37008l = f12;
        this.f37009m = f13;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 3) == 2 && a13.c()) {
            a13.f();
        } else {
            C20632w.a(C20588k2.q(androidx.compose.ui.v.f42878y1, this.f37008l, this.f37009m), a13, 0);
        }
        return kotlin.G0.f406611a;
    }
}
