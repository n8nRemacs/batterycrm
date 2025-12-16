package com.avito.android.rating_form.item.multiLineInput;

import Y41.l;
import ih0.InterfaceC41402a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MultiLineInputItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f248474l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f248475m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, f fVar) {
        super(1);
        this.f248474l = aVar;
        this.f248475m = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        a aVar = this.f248474l;
        aVar.f248465l = str2;
        this.f248475m.f248476b.invoke(new InterfaceC41402a.c(aVar.f248458e, str2));
        return G0.f406611a;
    }
}
