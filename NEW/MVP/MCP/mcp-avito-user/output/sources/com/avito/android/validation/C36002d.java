package com.avito.android.validation;

import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: CategoryParameterStringValueConverter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$Value;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.validation.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36002d extends kotlin.jvm.internal.N implements Y41.l<SectionedMultiselectParameter.Value, List<? extends SectionedMultiselectParameter.Value>> {

    /* renamed from: l, reason: collision with root package name */
    public static final C36002d f319356l = new C36002d();

    public C36002d() {
        super(1);
    }

    @Override // Y41.l
    public final List<? extends SectionedMultiselectParameter.Value> invoke(SectionedMultiselectParameter.Value value) {
        List<SectionedMultiselectParameter.Value> options = value.getOptions();
        return options == null ? C42784z0.f406748b : options;
    }
}
