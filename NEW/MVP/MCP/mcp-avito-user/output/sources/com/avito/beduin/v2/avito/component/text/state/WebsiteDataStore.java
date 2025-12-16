package com.avito.beduin.v2.avito.component.text.state;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvitoWebViewState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/avito/component/text/state/WebsiteDataStore;", "", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WebsiteDataStore {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f335327c;

    /* renamed from: d, reason: collision with root package name */
    public static final WebsiteDataStore f335328d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ WebsiteDataStore[] f335329e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f335330f;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f335331b;

    /* compiled from: AvitoWebViewState.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/avito/component/text/state/WebsiteDataStore$a;", "", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        WebsiteDataStore websiteDataStore = new WebsiteDataStore("Persistent", 0, "persistent");
        WebsiteDataStore websiteDataStore2 = new WebsiteDataStore("NonPersistent", 1, "nonPersistent");
        f335328d = websiteDataStore2;
        WebsiteDataStore[] websiteDataStoreArr = {websiteDataStore, websiteDataStore2};
        f335329e = websiteDataStoreArr;
        f335330f = kotlin.enums.c.a(websiteDataStoreArr);
        f335327c = new a(null);
    }

    public WebsiteDataStore(String str, int i12, String str2) {
        this.f335331b = str2;
    }

    public static WebsiteDataStore valueOf(String str) {
        return (WebsiteDataStore) Enum.valueOf(WebsiteDataStore.class, str);
    }

    public static WebsiteDataStore[] values() {
        return (WebsiteDataStore[]) f335329e.clone();
    }
}
