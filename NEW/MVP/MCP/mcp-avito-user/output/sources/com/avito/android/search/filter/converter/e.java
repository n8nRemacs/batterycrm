package com.avito.android.search.filter.converter;

import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryParameterStringValueConverter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$Value;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class e extends N implements Y41.l<SectionedMultiselectParameter.Value, String> {

    /* renamed from: l, reason: collision with root package name */
    public static final e f262974l = new e();

    public e() {
        super(1);
    }

    @Override // Y41.l
    public final String invoke(SectionedMultiselectParameter.Value value) {
        String title = value.getTitle();
        if (title == null) {
            return null;
        }
        if (title.length() == 0) {
            title = null;
        }
        return title;
    }
}
