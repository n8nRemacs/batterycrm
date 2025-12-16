package com.avito.android.mortgage.sending_confirm;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.mortgage.api.model.CheckboxMeta;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SendingConfirmContentScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class e extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Map<String, CheckboxMeta> f203533l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f203534m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f203535n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f203536o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Map map, Y41.l lVar, v vVar, int i12) {
        super(2);
        this.f203533l = map;
        this.f203534m = lVar;
        this.f203535n = vVar;
        this.f203536o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f203536o | 1);
        v vVar = this.f203535n;
        g.b(this.f203533l, this.f203534m, vVar, a12, iA2);
        return G0.f406611a;
    }
}
