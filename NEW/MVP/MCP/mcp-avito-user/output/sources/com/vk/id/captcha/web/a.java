package com.vk.id.captcha.web;

import Y61.k;
import android.net.Uri;
import android.webkit.URLUtil;
import java.util.Locale;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43059p;

/* compiled from: LinkScheme.kt */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    private final InterfaceC42726C f366852a = C42727D.c(AnonymousClass1.f366853a);

    /* compiled from: LinkScheme.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/text/p;", "a", "()Lkotlin/text/p;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.vk.id.captcha.web.a$1, reason: invalid class name */
    public static final class AnonymousClass1 extends N implements Y41.a<C43059p> {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f366853a = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C43059p invoke() {
            return new C43059p("(^|[a-z0-9.\\-]*\\.)(vk|vkontakte)\\.(com|ru|me)");
        }
    }

    public final boolean a(@k String str) {
        Uri uri;
        String host;
        if (!URLUtil.isHttpsUrl(str) || (host = (uri = Uri.parse(str)).getHost()) == null || host.length() == 0) {
            return false;
        }
        return ((C43059p) this.f366852a.getValue()).e(String.valueOf(uri.getHost()).toLowerCase(Locale.getDefault()));
    }
}
