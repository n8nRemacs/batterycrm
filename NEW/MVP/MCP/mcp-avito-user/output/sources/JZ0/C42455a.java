package jz0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api4StrSellerOrdersListPostResponse.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B[\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b \u0010\u0014¨\u0006!"}, d2 = {"Ljz0/a;", "", "", "Ljz0/b;", "filters", "", "header", "Ljz0/d;", "items", "Lcom/avito/android/deep_linking/links/DeepLink;", "onboardingDeepLink", "Ljz0/e;", "pagination", "title", "Ljz0/f;", "widgets", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Ljz0/e;Ljava/lang/String;Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Lcom/avito/android/deep_linking/links/DeepLink;", "d", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljz0/e;", "e", "()Ljz0/e;", "f", "g", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jz0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42455a {

    @com.google.gson.annotations.c("filters")
    @k
    private final List<InterfaceC42456b> filters;

    @com.google.gson.annotations.c("header")
    @l
    private final String header;

    @com.google.gson.annotations.c("items")
    @l
    private final List<InterfaceC42458d> items;

    @com.google.gson.annotations.c("onboardingDeepLink")
    @l
    private final DeepLink onboardingDeepLink;

    @com.google.gson.annotations.c("pagination")
    @k
    private final C42459e pagination;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    @com.google.gson.annotations.c("widgets")
    @l
    private final List<C42460f> widgets;

    /* JADX WARN: Multi-variable type inference failed */
    public C42455a(@k List<? extends InterfaceC42456b> list, @l String str, @l List<? extends InterfaceC42458d> list2, @l DeepLink deepLink, @k C42459e c42459e, @l String str2, @l List<C42460f> list3) {
        this.filters = list;
        this.header = str;
        this.items = list2;
        this.onboardingDeepLink = deepLink;
        this.pagination = c42459e;
        this.title = str2;
        this.widgets = list3;
    }

    @k
    public final List<InterfaceC42456b> a() {
        return this.filters;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    @l
    public final List<InterfaceC42458d> c() {
        return this.items;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final DeepLink getOnboardingDeepLink() {
        return this.onboardingDeepLink;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final C42459e getPagination() {
        return this.pagination;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    public final List<C42460f> g() {
        return this.widgets;
    }
}
