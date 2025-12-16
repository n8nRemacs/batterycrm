package com.avito.android.recall_me.presentation.items.single_input;

import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.input.FormatterType;
import javax.inject.Inject;
import kotlin.Metadata;
import zi0.InterfaceC50571a;

/* compiled from: SingleInputPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/recall_me/presentation/items/single_input/h;", "LTV0/d;", "Lcom/avito/android/recall_me/presentation/items/single_input/j;", "Lcom/avito/android/recall_me/presentation/items/single_input/SingleInputItem;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements TV0.d<j, SingleInputItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<InterfaceC50571a> f251967b;

    @Inject
    public h(@Y61.k com.jakewharton.rxrelay3.c<InterfaceC50571a> cVar) {
        this.f251967b = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        SingleInputItem singleInputItem = (SingleInputItem) aVar;
        jVar.tn(new f(singleInputItem, this));
        jVar.q9(singleInputItem.f251945d);
        g gVar = new g(singleInputItem, this);
        FormatterType formatterType = singleInputItem.f251946e;
        String str = singleInputItem.f251947f;
        jVar.WR(formatterType, str, gVar);
        jVar.Kb(singleInputItem.f251949h, str == null);
        jVar.U3(singleInputItem.f251950i);
        jVar.setHint(singleInputItem.f251948g);
    }
}
