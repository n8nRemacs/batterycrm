package bC0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import kotlin.Metadata;

/* compiled from: PublicationAdvanceResult.kt */
@P
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b \u0010\u0012¨\u0006!"}, d2 = {"LbC0/j;", "", "", "title", "description", "LbC0/i;", "extraInfo", "Lcom/avito/android/remote/model/ButtonAction;", "button", "LbC0/a;", "advanceInfo", "LbC0/e;", "confirmInfo", "context", "<init>", "(Ljava/lang/String;Ljava/lang/String;LbC0/i;Lcom/avito/android/remote/model/ButtonAction;LbC0/a;LbC0/e;Ljava/lang/String;)V", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "e", "LbC0/i;", "f", "()LbC0/i;", "Lcom/avito/android/remote/model/ButtonAction;", "b", "()Lcom/avito/android/remote/model/ButtonAction;", "LbC0/a;", "a", "()LbC0/a;", "LbC0/e;", "c", "()LbC0/e;", "d", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j {

    @com.google.gson.annotations.c("advanceInfo")
    @k
    private final C25492a advanceInfo;

    @com.google.gson.annotations.c("button")
    @k
    private final ButtonAction button;

    @com.google.gson.annotations.c("confirmInfo")
    @k
    private final e confirmInfo;

    @com.google.gson.annotations.c("context")
    @k
    private final String context;

    @com.google.gson.annotations.c("description")
    @k
    private final String description;

    @com.google.gson.annotations.c("extraInfo")
    @l
    private final i extraInfo;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public j(@k String str, @k String str2, @l i iVar, @k ButtonAction buttonAction, @k C25492a c25492a, @k e eVar, @k String str3) {
        this.title = str;
        this.description = str2;
        this.extraInfo = iVar;
        this.button = buttonAction;
        this.advanceInfo = c25492a;
        this.confirmInfo = eVar;
        this.context = str3;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final C25492a getAdvanceInfo() {
        return this.advanceInfo;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final ButtonAction getButton() {
        return this.button;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final e getConfirmInfo() {
        return this.confirmInfo;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final i getExtraInfo() {
        return this.extraInfo;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
