package com.avito.android.blueprint.multiselect;

import Y41.l;
import com.avito.android.category_parameters.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PublishMultiselectPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.v f105587l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f105588m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, ParameterElement.v vVar) {
        super(1);
        this.f105587l = vVar;
        this.f105588m = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        ParameterElement.v vVar = this.f105587l;
        vVar.f117544e = str2;
        if (str2.length() == 0) {
            this.f105588m.f105594c.accept(vVar);
        }
        return G0.f406611a;
    }
}
