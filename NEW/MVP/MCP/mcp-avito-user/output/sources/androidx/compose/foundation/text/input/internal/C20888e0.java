package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.v0;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: ImeEditCommand.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/i;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/text/input/i;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.text.input.internal.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20888e0 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.foundation.text.input.i, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f31064l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f31065m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f31066n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20888e0(int i12, String str, ArrayList arrayList) {
        super(1);
        this.f31064l = str;
        this.f31065m = arrayList;
        this.f31066n = i12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.foundation.text.input.i iVar) {
        androidx.compose.foundation.text.input.i iVar2 = iVar;
        androidx.compose.ui.text.v0 v0Var = iVar2.f30760g;
        ArrayList arrayList = this.f31065m;
        String str = this.f31064l;
        if (v0Var != null) {
            long j12 = v0Var.f42736a;
            int i12 = (int) (j12 >> 32);
            C20892g0.b(iVar2, i12, (int) (4294967295L & j12), str);
            if (str.length() > 0) {
                iVar2.e(arrayList, i12, str.length() + i12);
            }
        } else {
            long j13 = iVar2.f30759f;
            v0.a aVar = androidx.compose.ui.text.v0.f42734b;
            int i13 = (int) (j13 >> 32);
            C20892g0.b(iVar2, i13, (int) (4294967295L & j13), str);
            if (str.length() > 0) {
                iVar2.e(arrayList, i13, str.length() + i13);
            }
        }
        long j14 = iVar2.f30759f;
        v0.a aVar2 = androidx.compose.ui.text.v0.f42734b;
        int i14 = (int) (j14 >> 32);
        int i15 = this.f31066n;
        int iG2 = kotlin.ranges.s.g(i15 > 0 ? (i14 + i15) - 1 : (i14 + i15) - str.length(), 0, iVar2.f30757d.length());
        iVar2.g(androidx.compose.ui.text.w0.a(iG2, iG2));
        return kotlin.G0.f406611a;
    }
}
