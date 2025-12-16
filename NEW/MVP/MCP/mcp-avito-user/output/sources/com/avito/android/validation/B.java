package com.avito.android.validation;

import com.avito.android.remote.model.category_parameters.ParametersTree;
import kotlin.Metadata;
import nf.InterfaceC44415a;

/* compiled from: ParametersListModule.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/ParametersTree;", "it", "Lnf/a;", "invoke", "(Lcom/avito/android/remote/model/category_parameters/ParametersTree;)Lnf/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class B extends kotlin.jvm.internal.N implements Y41.l<ParametersTree, InterfaceC44415a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC35998b f319244l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.util.C f319245m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(InterfaceC35998b interfaceC35998b, com.avito.android.util.C c12) {
        super(1);
        this.f319244l = interfaceC35998b;
        this.f319245m = c12;
    }

    @Override // Y41.l
    public final InterfaceC44415a invoke(ParametersTree parametersTree) {
        return new nf.c(this.f319244l, this.f319245m, parametersTree);
    }
}
