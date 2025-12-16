package com.avito.android.beduin.common.component.input.single_line;

import Y41.l;
import com.avito.android.lib.design.input.Input;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SingleLineInputComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/input/Input;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/input/Input;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g extends N implements l<Input, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.beduin.common.component.input.g f101588l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List<Object> f101589m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f101590n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.avito.android.beduin.common.component.input.g gVar, List<? extends Object> list, h hVar) {
        super(1);
        this.f101588l = gVar;
        this.f101589m = list;
        this.f101590n = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(Input input) {
        com.avito.android.beduin.common.component.input.a aVar = com.avito.android.beduin.common.component.input.a.f101543a;
        h hVar = this.f101590n;
        SingleLineInputModel singleLineInputModel = hVar.f101593g;
        List<Object> list = this.f101589m;
        aVar.getClass();
        com.avito.android.beduin.common.component.input.a.a(this.f101588l, list, singleLineInputModel, hVar.f101592f);
        return G0.f406611a;
    }
}
