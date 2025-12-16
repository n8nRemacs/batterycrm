package bC0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import kotlin.Metadata;

/* compiled from: ConfirmInfo.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"LbC0/e;", "", "", "title", "description", "Lcom/avito/android/remote/model/ButtonAction;", "confirmButton", "cancelButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/ButtonAction;Lcom/avito/android/remote/model/ButtonAction;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "Lcom/avito/android/remote/model/ButtonAction;", "b", "()Lcom/avito/android/remote/model/ButtonAction;", "a", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e {

    @com.google.gson.annotations.c("cancelButton")
    @l
    private final ButtonAction cancelButton;

    @com.google.gson.annotations.c("confirmButton")
    @k
    private final ButtonAction confirmButton;

    @com.google.gson.annotations.c("description")
    @l
    private final String description;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public e(@k String str, @l String str2, @k ButtonAction buttonAction, @l ButtonAction buttonAction2) {
        this.title = str;
        this.description = str2;
        this.confirmButton = buttonAction;
        this.cancelButton = buttonAction2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final ButtonAction getCancelButton() {
        return this.cancelButton;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final ButtonAction getConfirmButton() {
        return this.confirmButton;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
