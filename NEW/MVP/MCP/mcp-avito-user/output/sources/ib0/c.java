package iB0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CprConfigureAdvanceResult.kt */
@P
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001a\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016¨\u0006 "}, d2 = {"LiB0/c;", "", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/remote/model/ButtonAction;", "aboutButton", "", "LiB0/h;", "reviews", "LiB0/e;", "hints", "button", "rules", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/ButtonAction;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/ButtonAction;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/ButtonAction;", "a", "()Lcom/avito/android/remote/model/ButtonAction;", "Ljava/util/List;", "e", "()Ljava/util/List;", "d", "b", "f", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    @com.google.gson.annotations.c("aboutButton")
    @l
    private final ButtonAction aboutButton;

    @com.google.gson.annotations.c("button")
    @k
    private final ButtonAction button;

    @com.google.gson.annotations.c("description")
    @l
    private final AttributedText description;

    @com.google.gson.annotations.c("hints")
    @l
    private final List<e> hints;

    @com.google.gson.annotations.c("reviews")
    @k
    private final List<h> reviews;

    @com.google.gson.annotations.c("rules")
    @l
    private final AttributedText rules;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k String str, @l AttributedText attributedText, @l ButtonAction buttonAction, @k List<? extends h> list, @l List<e> list2, @k ButtonAction buttonAction2, @l AttributedText attributedText2) {
        this.title = str;
        this.description = attributedText;
        this.aboutButton = buttonAction;
        this.reviews = list;
        this.hints = list2;
        this.button = buttonAction2;
        this.rules = attributedText2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final ButtonAction getAboutButton() {
        return this.aboutButton;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final ButtonAction getButton() {
        return this.button;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    public final List<e> d() {
        return this.hints;
    }

    @k
    public final List<h> e() {
        return this.reviews;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final AttributedText getRules() {
        return this.rules;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
