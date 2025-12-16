package com.avito.android.publish.items.video;

import com.avito.android.category_parameters.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: VideoItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isFocused", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f237213l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.I f237214m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ParameterElement.I i12, d dVar) {
        super(1);
        this.f237213l = dVar;
        this.f237214m = i12;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        this.f237213l.f237207c.accept(new Q<>(bool2, this.f237214m));
        return G0.f406611a;
    }
}
