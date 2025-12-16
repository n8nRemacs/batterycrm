package com.avito.android.beduin.common.form;

import com.avito.android.beduin_models.BeduinModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ComponentsFormImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin_models/BeduinModel;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class a extends N implements Y41.l<BeduinModel, List<? extends BeduinModel>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f103320l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AddType f103321m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List<BeduinModel> f103322n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(String str, AddType addType, List<? extends BeduinModel> list) {
        super(1);
        this.f103320l = str;
        this.f103321m = addType;
        this.f103322n = list;
    }

    @Override // Y41.l
    public final List<? extends BeduinModel> invoke(BeduinModel beduinModel) {
        BeduinModel beduinModel2 = beduinModel;
        if (!L.f(this.f103320l, beduinModel2.getId())) {
            return Collections.singletonList(beduinModel2);
        }
        ArrayList arrayListE0 = C42745f0.e0(beduinModel2);
        arrayListE0.addAll(this.f103321m != AddType.f103316b ? 1 : 0, this.f103322n);
        return arrayListE0;
    }
}
