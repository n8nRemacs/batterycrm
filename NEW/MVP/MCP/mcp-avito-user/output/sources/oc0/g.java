package Oc0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import com.my.tracker.ads.AdFormat;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ProfileVkGroupsApiResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"LOc0/g;", "", "LOc0/h;", AdFormat.BANNER, "Lcom/avito/android/remote/model/text/AttributedText;", "bottomText", "", "LOc0/i;", "buttons", "", "navigation", "text", "title", "<init>", "(LOc0/h;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "LOc0/h;", "a", "()LOc0/h;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "e", "f", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g {

    @com.google.gson.annotations.c(AdFormat.BANNER)
    @l
    private final h banner;

    @com.google.gson.annotations.c("bottomText")
    @l
    private final AttributedText bottomText;

    @com.google.gson.annotations.c("buttons")
    @k
    private final List<i> buttons;

    @com.google.gson.annotations.c("navigation")
    @l
    private final String navigation;

    @com.google.gson.annotations.c("text")
    @l
    private final AttributedText text;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public g(@l h hVar, @l AttributedText attributedText, @k List<i> list, @l String str, @l AttributedText attributedText2, @k String str2) {
        this.banner = hVar;
        this.bottomText = attributedText;
        this.buttons = list;
        this.navigation = str;
        this.text = attributedText2;
        this.title = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final h getBanner() {
        return this.banner;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final AttributedText getBottomText() {
        return this.bottomText;
    }

    @k
    public final List<i> c() {
        return this.buttons;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getNavigation() {
        return this.navigation;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
