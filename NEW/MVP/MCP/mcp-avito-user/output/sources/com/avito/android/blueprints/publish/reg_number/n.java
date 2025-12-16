package com.avito.android.blueprints.publish.reg_number;

import com.avito.android.remote.model.category_parameters.MaskInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: VehicleRegNumberInputItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class n extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f106416l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f106417m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(p pVar, Y41.l<? super String, G0> lVar) {
        super(1);
        this.f106416l = pVar;
        this.f106417m = (N) lVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final G0 invoke(String str) {
        p pVar = this.f106416l;
        pVar.getClass();
        String strA0 = C43066x.a0(str, " ", "", false);
        pVar.f106425g = strA0;
        MaskInfo maskInfo = pVar.f106427i;
        ?? r22 = this.f106417m;
        if (maskInfo != null) {
            r22.invoke(pVar.f106425g + pVar.f106426h);
        } else {
            r22.invoke(strA0);
        }
        return G0.f406611a;
    }
}
