package ru.cyberity.cbr.core.presentation.form;

import Y61.k;
import Y61.l;
import java.util.List;
import kotlin.Metadata;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;

/* compiled from: FormItemViewUtils.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/FormItemValueProvider;", "", "getValue", "", "field", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "getValues", "", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface FormItemValueProvider {
    @l
    String getValue(@k FormItem field);

    @l
    List<String> getValues(@k FormItem field);
}
