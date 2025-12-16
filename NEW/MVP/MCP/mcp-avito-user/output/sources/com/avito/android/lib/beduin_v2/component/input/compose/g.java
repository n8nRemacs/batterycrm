package com.avito.android.lib.beduin_v2.component.input.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.beduin.v2.avito.component.input.state.AvitoInputState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InnerInput.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class g extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AvitoInputState f175686l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f175687m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AvitoInputState avitoInputState, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f175686l = avitoInputState;
        this.f175687m = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(9);
        androidx.compose.ui.v vVar = this.f175687m;
        q.a(this.f175686l, vVar, a12, iA2);
        return G0.f406611a;
    }
}
