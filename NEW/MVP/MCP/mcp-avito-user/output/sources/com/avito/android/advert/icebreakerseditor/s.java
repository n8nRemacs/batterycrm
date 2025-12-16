package com.avito.android.advert.icebreakerseditor;

import b4.C25408d;
import b4.InterfaceC25405a;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IcebreakersEditorScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class s extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC25405a, G0> f71296l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C25408d.c f71297m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(Y41.l<? super InterfaceC25405a, G0> lVar, C25408d.c cVar) {
        super(0);
        this.f71296l = lVar;
        this.f71297m = cVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        C25408d.c cVar = this.f71297m;
        this.f71296l.invoke(new InterfaceC25405a.b(R.string.icebreakers_editor_bottomsheet_edit_template, Long.valueOf(cVar.f56901a), cVar.f56902b, true));
        return G0.f406611a;
    }
}
