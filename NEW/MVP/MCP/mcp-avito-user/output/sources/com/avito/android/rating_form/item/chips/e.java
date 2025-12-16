package com.avito.android.rating_form.item.chips;

import Y41.l;
import com.avito.android.remote.model.ParcelableEntity;
import ih0.InterfaceC41402a;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ChipsItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "items", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements l<List<? extends ParcelableEntity<String>>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f248359l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f248360m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, a aVar) {
        super(1);
        this.f248359l = fVar;
        this.f248360m = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(List<? extends ParcelableEntity<String>> list) {
        l<InterfaceC41402a, G0> lVar = this.f248359l.f248361b;
        a aVar = this.f248360m;
        lVar.invoke(new InterfaceC41402a.x(aVar.f248346c.f247886c, list, aVar.f248347d));
        return G0.f406611a;
    }
}
