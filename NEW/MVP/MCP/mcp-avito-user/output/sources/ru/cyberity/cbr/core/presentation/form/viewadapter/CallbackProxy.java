package ru.cyberity.cbr.core.presentation.form.viewadapter;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.util.List;
import kotlin.Metadata;
import ru.cyberity.cbr.core.presentation.form.FormFieldCallback;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;

/* compiled from: FormItemAdapter.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u000eJ'\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00052\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/viewadapter/CallbackProxy;", "Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;", "callback", "<init>", "(Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;)V", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "item", "Lkotlin/G0;", "check", "(Lru/cyberity/cbr/core/presentation/form/model/FormItem;)V", "onPickFileClick", "", "fileId", "onDeleteFileClick", "(Lru/cyberity/cbr/core/presentation/form/model/FormItem;Ljava/lang/String;)V", ContextActionHandler.Link.URL, "onLinkClick", "field", "", "isValid", "isBlank", "onValidatePhone", "(Lru/cyberity/cbr/core/presentation/form/model/FormItem;ZZ)V", "value", "onValueChanged", "", "values", "onValuesChanged", "(Lru/cyberity/cbr/core/presentation/form/model/FormItem;Ljava/util/List;)V", "Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;", "getCallback", "()Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;", "disabledCallbacks", "Z", "getDisabledCallbacks", "()Z", "setDisabledCallbacks", "(Z)V", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
final class CallbackProxy implements FormFieldCallback {

    @k
    private final FormFieldCallback callback;
    private boolean disabledCallbacks;

    public CallbackProxy(@k FormFieldCallback formFieldCallback) {
        this.callback = formFieldCallback;
    }

    @Override // ru.cyberity.cbr.core.presentation.form.FormFieldCallback
    public void check(@k FormItem item) {
        if (this.disabledCallbacks) {
            return;
        }
        this.callback.check(item);
    }

    @k
    public final FormFieldCallback getCallback() {
        return this.callback;
    }

    @Override // ru.cyberity.cbr.core.presentation.form.FormFieldCallback
    public void onDeleteFileClick(@k FormItem item, @k String fileId) {
        if (this.disabledCallbacks) {
            return;
        }
        this.callback.onDeleteFileClick(item, fileId);
    }

    @Override // ru.cyberity.cbr.core.presentation.form.FormFieldCallback
    public void onLinkClick(@k FormItem item, @k String url) {
        if (this.disabledCallbacks) {
            return;
        }
        this.callback.onLinkClick(item, url);
    }

    @Override // ru.cyberity.cbr.core.presentation.form.FormFieldCallback
    public void onPickFileClick(@k FormItem item) {
        if (this.disabledCallbacks) {
            return;
        }
        this.callback.onPickFileClick(item);
    }

    @Override // ru.cyberity.cbr.core.presentation.form.FormFieldCallback
    public void onValidatePhone(@k FormItem field, boolean isValid, boolean isBlank) {
        if (this.disabledCallbacks) {
            return;
        }
        this.callback.onValidatePhone(field, isValid, isBlank);
    }

    @Override // ru.cyberity.cbr.core.presentation.form.FormFieldCallback
    public void onValueChanged(@k FormItem field, @l String value) {
        if (this.disabledCallbacks) {
            return;
        }
        this.callback.onValueChanged(field, value);
    }

    @Override // ru.cyberity.cbr.core.presentation.form.FormFieldCallback
    public void onValuesChanged(@k FormItem field, @l List<String> values) {
        if (this.disabledCallbacks) {
            return;
        }
        this.callback.onValuesChanged(field, values);
    }

    public final void setDisabledCallbacks(boolean z12) {
        this.disabledCallbacks = z12;
    }
}
