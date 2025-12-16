package ru.cyberity.cbr.core.presentation.form;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.util.List;
import kotlin.Metadata;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;

/* compiled from: FormItemViewUtils.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\nJ'\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0017\u0010\u0006J\u001f\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0007H&¢\u0006\u0004\b\u0019\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;", "", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "item", "Lkotlin/G0;", "check", "(Lru/cyberity/cbr/core/presentation/form/model/FormItem;)V", "", ContextActionHandler.Link.URL, "onLinkClick", "(Lru/cyberity/cbr/core/presentation/form/model/FormItem;Ljava/lang/String;)V", "field", "", "isValid", "isBlank", "onValidatePhone", "(Lru/cyberity/cbr/core/presentation/form/model/FormItem;ZZ)V", "value", "onValueChanged", "", "values", "onValuesChanged", "(Lru/cyberity/cbr/core/presentation/form/model/FormItem;Ljava/util/List;)V", "onPickFileClick", "fileId", "onDeleteFileClick", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface FormFieldCallback {
    void check(@k FormItem item);

    void onDeleteFileClick(@k FormItem item, @k String fileId);

    void onPickFileClick(@k FormItem item);

    default void onLinkClick(@k FormItem item, @k String url) {
    }

    default void onValueChanged(@k FormItem field, @l String value) {
    }

    default void onValuesChanged(@k FormItem field, @l List<String> values) {
    }

    default void onValidatePhone(@k FormItem field, boolean isValid, boolean isBlank) {
    }
}
