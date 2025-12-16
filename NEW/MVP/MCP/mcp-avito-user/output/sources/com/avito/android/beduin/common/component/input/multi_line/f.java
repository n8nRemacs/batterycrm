package com.avito.android.beduin.common.component.input.multi_line;

import Y41.l;
import com.avito.android.lib.design.input.Input;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MultiLineInputComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/input/Input;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/input/Input;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class f extends N implements l<Input, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.beduin.common.component.input.g f101567l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List<Object> f101568m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g f101569n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.avito.android.beduin.common.component.input.g gVar, List<? extends Object> list, g gVar2) {
        super(1);
        this.f101567l = gVar;
        this.f101568m = list;
        this.f101569n = gVar2;
    }

    @Override // Y41.l
    public final G0 invoke(Input input) {
        com.avito.android.beduin.common.component.input.a aVar = com.avito.android.beduin.common.component.input.a.f101543a;
        g gVar = this.f101569n;
        MultiLineInputModel multiLineInputModel = gVar.f101572g;
        List<Object> list = this.f101568m;
        aVar.getClass();
        com.avito.android.beduin.common.component.input.a.a(this.f101567l, list, multiLineInputModel, gVar.f101571f);
        return G0.f406611a;
    }
}
