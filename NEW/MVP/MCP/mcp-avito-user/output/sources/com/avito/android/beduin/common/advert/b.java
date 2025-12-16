package com.avito.android.beduin.common.advert;

import cj.InterfaceC27203a;
import com.avito.android.beduin.common.form.transforms.IsFavoriteTransform;
import com.avito.android.beduin.common.form.transforms.IsViewedTransform;
import com.avito.android.beduin_models.BeduinModel;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinAdvertSaturatorImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin_models/BeduinModel;", "model", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class b extends N implements Y41.l<BeduinModel, List<? extends BeduinModel>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f100535l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(1);
        this.f100535l = cVar;
    }

    @Override // Y41.l
    public final List<? extends BeduinModel> invoke(BeduinModel beduinModel) {
        BeduinModel beduinModelApply = beduinModel;
        if (beduinModelApply instanceof InterfaceC27203a) {
            c cVar = this.f100535l;
            cVar.getClass();
            InterfaceC27203a interfaceC27203a = (InterfaceC27203a) beduinModelApply;
            String advertId = interfaceC27203a.getAdvertId();
            if (advertId != null) {
                beduinModelApply = beduinModelApply.apply(new IsFavoriteTransform(cVar.f100536a.b(advertId, interfaceC27203a.getIsFavorite()))).apply(new IsViewedTransform(cVar.f100537b.a(advertId)));
            }
        }
        return Collections.singletonList(beduinModelApply);
    }
}
