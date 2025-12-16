package com.avito.android.cart_snippet_actions.feature;

import com.avito.android.cart_snippet_actions.feature.entity.TrueCartSnippetActionsInternalAction;
import io.reactivex.rxjava3.core.z;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.C43175k;
import yn.C50271a;

/* compiled from: CartSnippetActionsActor.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "Lyn/a;", "changedItems", "Lkotlin/Function0;", "Lkotlin/G0;", "onError", "onSuccess", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction;", "invoke", "(Ljava/util/List;LY41/a;LY41/a;)Lio/reactivex/rxjava3/core/z;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class f extends N implements Y41.q<List<? extends C50271a>, Y41.a<? extends G0>, Y41.a<? extends G0>, z<TrueCartSnippetActionsInternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f116204l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<tn.d> f116205m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f116206n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, Y41.a aVar, LinkedHashMap linkedHashMap) {
        super(3);
        this.f116204l = kVar;
        this.f116205m = aVar;
        this.f116206n = linkedHashMap;
    }

    @Override // Y41.q
    public final z<TrueCartSnippetActionsInternalAction> invoke(List<? extends C50271a> list, Y41.a<? extends G0> aVar, Y41.a<? extends G0> aVar2) {
        Y41.a<tn.d> aVar3 = this.f116205m;
        LinkedHashMap linkedHashMap = this.f116206n;
        return kotlinx.coroutines.rx3.y.b(C43175k.I(this.f116204l.f116225c.a(), C43175k.G(new e(this.f116204l, list, aVar3, aVar, linkedHashMap, aVar2, null))));
    }
}
