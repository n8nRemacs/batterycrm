package com.avito.android.publish.items.video;

import com.avito.android.category_parameters.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VideoItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class g extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.I f237217l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f237218m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ParameterElement.I i12, d dVar) {
        super(1);
        this.f237217l = i12;
        this.f237218m = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        ParameterElement.I i12 = this.f237217l;
        i12.f117329j = str;
        this.f237218m.f237206b.accept(i12);
        return G0.f406611a;
    }
}
