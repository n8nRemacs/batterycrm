package com.avito.android.stories;

import android.webkit.CookieManager;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: WebViewParamsLoader.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/stories/G;", "", "a", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final StoriesArguments f284980a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CookieManager f284981b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cookie_provider.e f284982c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.interceptor.I f284983d;

    /* compiled from: WebViewParamsLoader.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/stories/G$a;", "", "<init>", "()V", "", "SELECTED_ID", "Ljava/lang/String;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public G(@Y61.k StoriesArguments storiesArguments, @Y61.k CookieManager cookieManager, @Y61.k com.avito.android.cookie_provider.e eVar, @Y61.k com.avito.android.remote.interceptor.I i12) {
        this.f284980a = storiesArguments;
        this.f284981b = cookieManager;
        this.f284982c = eVar;
        this.f284983d = i12;
    }
}
