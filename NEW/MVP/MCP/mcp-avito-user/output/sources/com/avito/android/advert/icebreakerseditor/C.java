package com.avito.android.advert.icebreakerseditor;

import b4.InterfaceC25405a;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IcebreakersEditorScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class C extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC25405a, G0> f71185l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C(Y41.l<? super InterfaceC25405a, G0> lVar) {
        super(0);
        this.f71185l = lVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f71185l.invoke(new InterfaceC25405a.b(R.string.icebreakers_editor_bottomsheet_add_template, null, null, false));
        return G0.f406611a;
    }
}
