package com.avito.android.beduin.common.actionhandler;

import com.avito.android.beduin_models.BeduinAction;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BeduinDebounceActionHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/beduin_models/BeduinAction;", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class H extends kotlin.jvm.internal.N implements Y41.l<List<? extends BeduinAction>, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I f100078l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(I i12) {
        super(1);
        this.f100078l = i12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(List<? extends BeduinAction> list) {
        com.avito.android.beduin_shared.model.utils.a.a(this.f100078l.f100086a.get(), list);
        return kotlin.G0.f406611a;
    }
}
