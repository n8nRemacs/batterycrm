package com.avito.android.validation;

import com.avito.android.util.NotFoundException;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ParametersListPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/avito/conveyor_item/a;", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.validation.w0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36040w0 extends kotlin.jvm.internal.N implements Y41.l<List<? extends com.avito.conveyor_item.a>, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Map<String, String> f319433l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y0 f319434m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36040w0(Map<String, String> map, Y0 y02) {
        super(1);
        this.f319433l = map;
        this.f319434m = y02;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(List<? extends com.avito.conveyor_item.a> list) throws NotFoundException, CloneNotSupportedException {
        for (Map.Entry<String, String> entry : this.f319433l.entrySet()) {
            String key = entry.getKey();
            Y0 y02 = this.f319434m;
            int iL2 = y02.l(key);
            com.avito.conveyor_item.a aVarK = Y0.k((com.avito.conveyor_item.a) y02.f319328g.get(iL2));
            ((com.avito.android.items.a) aVarK).m(entry.getValue());
            y02.f319328g.set(iL2, (com.avito.android.items.a) aVarK);
        }
        return kotlin.G0.f406611a;
    }
}
