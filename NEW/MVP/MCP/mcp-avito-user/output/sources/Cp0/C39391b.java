package cp0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ApiCreateDispatchVasV1Response.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcp0/b;", "", "Lcp0/g;", "actions", "Lcp0/c;", "bbl", "Lcp0/h;", "dispatch", "", "emptyActionTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "terms", "<init>", "(Lcp0/g;Lcp0/c;Lcp0/h;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcp0/g;", "a", "()Lcp0/g;", "Lcp0/c;", "b", "()Lcp0/c;", "Lcp0/h;", "c", "()Lcp0/h;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cp0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39391b {

    @com.google.gson.annotations.c("actions")
    @Y61.k
    private final g actions;

    @com.google.gson.annotations.c("bbl")
    @l
    private final C39392c bbl;

    @com.google.gson.annotations.c("dispatch")
    @Y61.k
    private final h dispatch;

    @com.google.gson.annotations.c("emptyActionTitle")
    @l
    private final String emptyActionTitle;

    @com.google.gson.annotations.c("terms")
    @l
    private final AttributedText terms;

    public C39391b(@Y61.k g gVar, @l C39392c c39392c, @Y61.k h hVar, @l String str, @l AttributedText attributedText) {
        this.actions = gVar;
        this.bbl = c39392c;
        this.dispatch = hVar;
        this.emptyActionTitle = str;
        this.terms = attributedText;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final g getActions() {
        return this.actions;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C39392c getBbl() {
        return this.bbl;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final h getDispatch() {
        return this.dispatch;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getEmptyActionTitle() {
        return this.emptyActionTitle;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final AttributedText getTerms() {
        return this.terms;
    }
}
