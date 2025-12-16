package com.avito.android.cv_actualization.view.phone_select.ui.state;

import Y61.k;
import com.avito.android.cv_actualization.view.phone_select.ui.items.add_phone.JsxCvActualizationPhoneSelectAddPhoneItem;
import com.avito.android.cv_actualization.view.phone_select.ui.items.error.JsxCvActualizationPhoneSelectErrorItem;
import com.avito.android.cv_actualization.view.phone_select.ui.items.header.JsxCvActualizationPhoneSelectHeaderItem;
import com.avito.android.cv_actualization.view.phone_select.ui.items.loading.JsxCvActualizationPhoneSelectLoadingItem;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: JsxCvActualizationPhoneSelectUiStateMapper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_select/ui/state/b;", "", "<init>", "()V", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<JsxCvActualizationPhoneSelectErrorItem> f131453a = Collections.singletonList(new JsxCvActualizationPhoneSelectErrorItem(0, null, null, 7, null));

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<JsxCvActualizationPhoneSelectLoadingItem> f131454b = Collections.singletonList(new JsxCvActualizationPhoneSelectLoadingItem(null, 1, 0 == true ? 1 : 0));

    /* renamed from: c, reason: collision with root package name */
    @k
    public final JsxCvActualizationPhoneSelectHeaderItem f131455c = new JsxCvActualizationPhoneSelectHeaderItem(null, null, null, 7, null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public final JsxCvActualizationPhoneSelectAddPhoneItem f131456d = new JsxCvActualizationPhoneSelectAddPhoneItem(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public b() {
    }
}
