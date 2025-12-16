package com.avito.android.gig.tutorials.generated.api.customer_rules_v_1;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: CustomerRulesV1Response.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/avito/android/gig/tutorials/generated/api/customer_rules_v_1/Material;", "", "Lcom/avito/android/gig/tutorials/generated/api/customer_rules_v_1/Material$Icon;", "icon", "", "title", ContextActionHandler.Link.URL, "<init>", "(Lcom/avito/android/gig/tutorials/generated/api/customer_rules_v_1/Material$Icon;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/gig/tutorials/generated/api/customer_rules_v_1/Material$Icon;", "a", "()Lcom/avito/android/gig/tutorials/generated/api/customer_rules_v_1/Material$Icon;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Icon", "_avito_gig_tutorials_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Material {

    @c("icon")
    @k
    private final Icon icon;

    @c("title")
    @k
    private final String title;

    @c(ContextActionHandler.Link.URL)
    @k
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CustomerRulesV1Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/gig/tutorials/generated/api/customer_rules_v_1/Material$Icon;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "ExternalFile", "WebView", "_avito_gig_tutorials_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Icon {

        @c("externalFile")
        public static final Icon ExternalFile;

        @c("webView")
        public static final Icon WebView;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Icon[] f159511b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f159512c;

        static {
            Icon icon = new Icon("ExternalFile", 0, "externalFile");
            ExternalFile = icon;
            Icon icon2 = new Icon("WebView", 1, "webView");
            WebView = icon2;
            Icon[] iconArr = {icon, icon2};
            f159511b = iconArr;
            f159512c = kotlin.enums.c.a(iconArr);
        }

        private Icon(String str, int i12, String str2) {
        }

        public static Icon valueOf(String str) {
            return (Icon) Enum.valueOf(Icon.class, str);
        }

        public static Icon[] values() {
            return (Icon[]) f159511b.clone();
        }
    }

    public Material(@k Icon icon, @k String str, @k String str2) {
        this.icon = icon;
        this.title = str;
        this.url = str2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getUrl() {
        return this.url;
    }
}
