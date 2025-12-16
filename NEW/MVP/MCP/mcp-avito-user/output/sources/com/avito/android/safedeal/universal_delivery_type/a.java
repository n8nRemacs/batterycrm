package com.avito.android.safedeal.universal_delivery_type;

import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.universal_map.UniversalMapParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DeliveryTypePagerAdapter.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "topMapFormId", "", "topMapComponents", "", "Lcom/avito/android/beduin_models/BeduinModel;", "invoke", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class a extends N implements Y41.p<String, List<? extends BeduinModel>, Long> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f256434l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(2);
        this.f256434l = bVar;
    }

    @Override // Y41.p
    public final Long invoke(String str, List<? extends BeduinModel> list) {
        return Long.valueOf(this.f256434l.f256436l.a(new UniversalMapParams.BeduinForm(str, list)));
    }
}
