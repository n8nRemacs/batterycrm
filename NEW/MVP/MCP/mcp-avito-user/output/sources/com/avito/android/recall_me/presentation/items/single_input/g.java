package com.avito.android.recall_me.presentation.items.single_input;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import zi0.InterfaceC50571a;

/* compiled from: SingleInputPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class g extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SingleInputItem f251965l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f251966m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SingleInputItem singleInputItem, h hVar) {
        super(1);
        this.f251965l = singleInputItem;
        this.f251966m = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        SingleInputItem singleInputItem = this.f251965l;
        singleInputItem.f251949h = str2;
        h hVar = this.f251966m;
        hVar.f251967b.accept(new InterfaceC50571a.c(singleInputItem.f251944c, str2));
        return G0.f406611a;
    }
}
