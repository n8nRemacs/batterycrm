package ru.tinkoff.core.tinkoffId;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.adjust.sdk.Constants;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AppLinkUtil.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/tinkoff/core/tinkoffId/a;", "", "a", "tinkoff-id_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f437023a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f437024b = new Uri.Builder().scheme(Constants.SCHEME).authority("www.tinkoff.ru").appendPath("partner_auth").build();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object f437025c = P0.g(new Q("success", TinkoffIdStatusCode.f437020b), new Q("cancelled_by_user", TinkoffIdStatusCode.f437021c));

    /* compiled from: AppLinkUtil.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Lru/tinkoff/core/tinkoffId/a$a;", "", "<init>", "()V", "", "AUTH_STATUS_CODE_CANCELLED_BY_USER", "Ljava/lang/String;", "AUTH_STATUS_CODE_SUCCESS", "PARTNER_HOST", "QUERY_PARAMETER_AUTH_STATUS_CODE", "QUERY_PARAMETER_CALLBACK_URL", "QUERY_PARAMETER_CLIENT_ID", "QUERY_PARAMETER_CODE", "QUERY_PARAMETER_CODE_CHALLENGE", "QUERY_PARAMETER_CODE_CHALLENGE_METHOD", "QUERY_PARAMETER_PACKAGE", "QUERY_PARAMETER_REDIRECT_URI", "QUERY_PARTNER_SDK_VERSION", "tinkoff-id_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: ru.tinkoff.core.tinkoffId.a$a, reason: collision with other inner class name */
    public static final class C12591a {
        public /* synthetic */ C12591a(C42822w c42822w) {
            this();
        }

        public C12591a() {
        }
    }

    static {
        new C12591a(null);
    }

    public a(@Y61.k Context context) {
        this.f437023a = context;
    }

    public static String a(Intent intent, String str) {
        String stringExtra = intent.getStringExtra(str);
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
