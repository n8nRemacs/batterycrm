package cD0;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: TariffProlongation.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011¨\u0006\u0017"}, d2 = {"LcD0/o;", "", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "", "isSwitchOn", "isSwitchActive", "offDescription", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;ZZLcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Z", "e", "()Z", "d", "b", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cD0.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C27021o {

    @com.google.gson.annotations.c("description")
    @Y61.k
    private final AttributedText description;

    @com.google.gson.annotations.c("isSwitchActive")
    private final boolean isSwitchActive;

    @com.google.gson.annotations.c("isSwitchOn")
    private final boolean isSwitchOn;

    @com.google.gson.annotations.c("offDescription")
    @Y61.l
    private final AttributedText offDescription;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public C27021o(@Y61.k String str, @Y61.k AttributedText attributedText, boolean z12, boolean z13, @Y61.l AttributedText attributedText2) {
        this.title = str;
        this.description = attributedText;
        this.isSwitchOn = z12;
        this.isSwitchActive = z13;
        this.offDescription = attributedText2;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final AttributedText getOffDescription() {
        return this.offDescription;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsSwitchActive() {
        return this.isSwitchActive;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsSwitchOn() {
        return this.isSwitchOn;
    }
}
