package com.avito.android.user_advert.advert;

import kotlin.Metadata;

/* compiled from: MyDraftAdvertDetailsInteractor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails;", "apply", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class K1<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L1 f308253b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f308254c;

    public K1(L1 l12, String str) {
        this.f308253b = l12;
        this.f308254c = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        L1 l12 = this.f308253b;
        return com.avito.android.util.rx3.g1.a(l12.f308256a.get().j(this.f308254c).z(l12.f308257b.a()));
    }
}
