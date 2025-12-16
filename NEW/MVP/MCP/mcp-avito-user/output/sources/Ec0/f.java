package eC0;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CpxConfigureAdvanceResult.kt */
@P
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b$\u0010#¨\u0006%"}, d2 = {"LeC0/f;", "", "LuZ/d;", "navBar", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "", "LeC0/d;", "advances", "LeC0/e;", "manualAdvance", "Lcom/avito/android/remote/model/ButtonAction;", "nextButton", "skipButton", "<init>", "(LuZ/d;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;LeC0/e;Lcom/avito/android/remote/model/ButtonAction;Lcom/avito/android/remote/model/ButtonAction;)V", "LuZ/d;", "d", "()LuZ/d;", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "a", "()Ljava/util/List;", "LeC0/e;", "c", "()LeC0/e;", "Lcom/avito/android/remote/model/ButtonAction;", "e", "()Lcom/avito/android/remote/model/ButtonAction;", "f", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f {

    @com.google.gson.annotations.c("advances")
    @Y61.k
    private final List<d> advances;

    @com.google.gson.annotations.c("description")
    @Y61.l
    private final AttributedText description;

    @com.google.gson.annotations.c("manualAdvance")
    @Y61.k
    private final e manualAdvance;

    @com.google.gson.annotations.c("navbar")
    @Y61.l
    private final uZ.d navBar;

    @com.google.gson.annotations.c("button")
    @Y61.k
    private final ButtonAction nextButton;

    @com.google.gson.annotations.c("skipButton")
    @Y61.l
    private final ButtonAction skipButton;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public f(@Y61.l uZ.d dVar, @Y61.k String str, @Y61.l AttributedText attributedText, @Y61.k List<d> list, @Y61.k e eVar, @Y61.k ButtonAction buttonAction, @Y61.l ButtonAction buttonAction2) {
        this.navBar = dVar;
        this.title = str;
        this.description = attributedText;
        this.advances = list;
        this.manualAdvance = eVar;
        this.nextButton = buttonAction;
        this.skipButton = buttonAction2;
    }

    @Y61.k
    public final List<d> a() {
        return this.advances;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final e getManualAdvance() {
        return this.manualAdvance;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final uZ.d getNavBar() {
        return this.navBar;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final ButtonAction getNextButton() {
        return this.nextButton;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final ButtonAction getSkipButton() {
        return this.skipButton;
    }

    @Y61.k
    /* renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
