package com.avito.android.mortgage.sending_confirm;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.mortgage.api.model.CheckboxMeta;
import com.avito.android.remote.model.text.AttributedText;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SendingConfirmContentScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class f extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f203537l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Map<String, CheckboxMeta> f203538m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AttributedText f203539n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f203540o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v f203541p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, Map map, AttributedText attributedText, Y41.l lVar, v vVar, int i12) {
        super(2);
        this.f203537l = str;
        this.f203538m = map;
        this.f203539n = attributedText;
        this.f203540o = lVar;
        this.f203541p = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(577);
        Map<String, CheckboxMeta> map = this.f203538m;
        AttributedText attributedText = this.f203539n;
        g.c(this.f203537l, map, attributedText, this.f203540o, a12, iA2);
        return G0.f406611a;
    }
}
