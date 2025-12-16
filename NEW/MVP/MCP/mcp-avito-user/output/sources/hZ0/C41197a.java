package hz0;

import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2StrSellerOrdersListPostResponse.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, d2 = {"Lhz0/a;", "", "", "header", "Lhz0/c;", "importantToNote", "Lcom/avito/android/deep_linking/links/DeepLink;", "onboardingDeeplink", "", "Lhz0/e;", "sections", "title", "Lhz0/g;", "widgets", "<init>", "(Ljava/lang/String;Lhz0/c;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lhz0/c;", "b", "()Lhz0/c;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/util/List;", "d", "()Ljava/util/List;", "e", "f", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hz0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41197a {

    @com.google.gson.annotations.c("header")
    @Y61.l
    private final String header;

    @com.google.gson.annotations.c("importantToNote")
    @Y61.l
    private final C41199c importantToNote;

    @com.google.gson.annotations.c("onboardingDeeplink")
    @Y61.l
    private final DeepLink onboardingDeeplink;

    @com.google.gson.annotations.c("sections")
    @Y61.l
    private final List<e> sections;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    @com.google.gson.annotations.c("widgets")
    @Y61.k
    private final List<g> widgets;

    public C41197a(@Y61.l String str, @Y61.l C41199c c41199c, @Y61.l DeepLink deepLink, @Y61.l List<e> list, @Y61.l String str2, @Y61.k List<g> list2) {
        this.header = str;
        this.importantToNote = c41199c;
        this.onboardingDeeplink = deepLink;
        this.sections = list;
        this.title = str2;
        this.widgets = list2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final C41199c getImportantToNote() {
        return this.importantToNote;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final DeepLink getOnboardingDeeplink() {
        return this.onboardingDeeplink;
    }

    @Y61.l
    public final List<e> d() {
        return this.sections;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.k
    public final List<g> f() {
        return this.widgets;
    }
}
