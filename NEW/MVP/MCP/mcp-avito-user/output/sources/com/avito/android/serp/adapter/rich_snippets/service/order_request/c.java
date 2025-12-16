package com.avito.android.serp.adapter.rich_snippets.service.order_request;

import Y41.l;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.model.component.serp.ServiceOrderButtonModel;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BxServiceItemOrderRequestInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "freeModel", "Lcom/avito/android/beduin_models/BeduinModel;", "invoke", "(Lcom/avito/android/beduin_models/BeduinModel;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class c extends N implements l<BeduinModel, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final c f271355l = new c();

    public c() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(BeduinModel beduinModel) {
        return Boolean.valueOf(beduinModel instanceof ServiceOrderButtonModel);
    }
}
