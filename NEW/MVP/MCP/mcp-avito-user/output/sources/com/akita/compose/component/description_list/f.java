package com.akita.compose.component.description_list;

import Y41.l;
import androidx.compose.ui.text.C22602e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: DescriptionList.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class f extends N implements l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22602e f61478l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f61479m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C22602e c22602e, a aVar) {
        super(1);
        this.f61478l = c22602e;
        this.f61479m = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        a aVar;
        Y41.a<G0> aVar2;
        if (num.intValue() > C43066x.F(this.f61478l) && (aVar = this.f61479m) != null && (aVar2 = aVar.f61451c) != null) {
            aVar2.invoke();
        }
        return G0.f406611a;
    }
}
