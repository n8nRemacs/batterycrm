package bC0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ConfigureAdvanceResult.kt */
@P
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"LbC0/d;", "", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "LbC0/a;", "advanceInfo", "LbC0/i;", "extraInfo", "LbC0/e;", "confirmInfo", "Lcom/avito/android/remote/model/ButtonAction;", "button", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;LbC0/a;LbC0/i;LbC0/e;Lcom/avito/android/remote/model/ButtonAction;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "LbC0/a;", "a", "()LbC0/a;", "LbC0/i;", "e", "()LbC0/i;", "LbC0/e;", "c", "()LbC0/e;", "Lcom/avito/android/remote/model/ButtonAction;", "b", "()Lcom/avito/android/remote/model/ButtonAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bC0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C25495d {

    @com.google.gson.annotations.c("advanceInfo")
    @k
    private final C25492a advanceInfo;

    @com.google.gson.annotations.c("button")
    @k
    private final ButtonAction button;

    @com.google.gson.annotations.c("confirmInfo")
    @k
    private final e confirmInfo;

    @com.google.gson.annotations.c("description")
    @l
    private final AttributedText description;

    @com.google.gson.annotations.c("extraInfo")
    @l
    private final i extraInfo;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C25495d(@k String str, @l AttributedText attributedText, @k C25492a c25492a, @l i iVar, @k e eVar, @k ButtonAction buttonAction) {
        this.title = str;
        this.description = attributedText;
        this.advanceInfo = c25492a;
        this.extraInfo = iVar;
        this.confirmInfo = eVar;
        this.button = buttonAction;
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

    @l
    /* renamed from: d, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final i getExtraInfo() {
        return this.extraInfo;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
