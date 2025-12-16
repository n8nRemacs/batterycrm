package com.avito.android.vas_planning.domain;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: VasPlanningInteractor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "formattedItems", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/util/P2;", "Lcom/avito/android/deep_linking/links/DeepLink;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class o<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f322345b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f322346c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f322347d;

    public o(l lVar, ArrayList arrayList, String str) {
        this.f322345b = lVar;
        this.f322346c = arrayList;
        this.f322347d = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        l lVar = this.f322345b;
        return lVar.f322337d.a(this.f322346c, false).p(new n(lVar, this.f322347d, (List) obj));
    }
}
