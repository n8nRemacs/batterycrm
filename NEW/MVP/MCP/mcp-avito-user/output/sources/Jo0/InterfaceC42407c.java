package jo0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SafetySettingsV1Response.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Ljo0/c;", "", "a", "b", "c", "Ljo0/c$a;", "Ljo0/c$b;", "Ljo0/c$c;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jo0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC42407c {

    /* compiled from: SafetySettingsV1Response.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Ljo0/c$a;", "Ljo0/c;", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "description", "title", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jo0.c$a */
    public static final class a implements InterfaceC42407c {

        @com.google.gson.annotations.c(Constants.DEEPLINK)
        @l
        private final DeepLink deeplink;

        @com.google.gson.annotations.c("description")
        @k
        private final String description;

        @com.google.gson.annotations.c("title")
        @k
        private final String title;

        public a(@l DeepLink deepLink, @k String str, @k String str2) {
            this.deeplink = deepLink;
            this.description = str;
            this.title = str2;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: SafetySettingsV1Response.kt */
    @P
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Ljo0/c$b;", "Ljo0/c;", "", "cursor", "Lcom/avito/android/remote/model/text/AttributedText;", RequestReviewResultKt.INFO_TYPE, "", "Ljo0/b;", "list", "", "title", "<init>", "(Ljava/lang/Long;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Ljava/lang/String;)V", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jo0.c$b */
    public static final class b implements InterfaceC42407c {

        @com.google.gson.annotations.c("cursor")
        @l
        private final Long cursor;

        @com.google.gson.annotations.c(RequestReviewResultKt.INFO_TYPE)
        @l
        private final AttributedText info;

        @com.google.gson.annotations.c("list")
        @l
        private final List<C42406b> list;

        @com.google.gson.annotations.c("title")
        @l
        private final String title;

        public b(@l Long l12, @l AttributedText attributedText, @l List<C42406b> list, @l String str) {
            this.cursor = l12;
            this.info = attributedText;
            this.list = list;
            this.title = str;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final Long getCursor() {
            return this.cursor;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final AttributedText getInfo() {
            return this.info;
        }

        @l
        public final List<C42406b> c() {
            return this.list;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: SafetySettingsV1Response.kt */
    @P
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ljo0/c$c;", "Ljo0/c;", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "", "hasPhone", "isAvailable", "isEnabled", "", "title", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;ZZZLjava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Z", "b", "()Z", "d", "e", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jo0.c$c, reason: collision with other inner class name */
    public static final class C11580c implements InterfaceC42407c {

        @com.google.gson.annotations.c("description")
        @k
        private final AttributedText description;

        @com.google.gson.annotations.c("hasPhone")
        private final boolean hasPhone;

        @com.google.gson.annotations.c("isAvailable")
        private final boolean isAvailable;

        @com.google.gson.annotations.c("isEnabled")
        private final boolean isEnabled;

        @com.google.gson.annotations.c("title")
        @k
        private final String title;

        public C11580c(@k AttributedText attributedText, boolean z12, boolean z13, boolean z14, @k String str) {
            this.description = attributedText;
            this.hasPhone = z12;
            this.isAvailable = z13;
            this.isEnabled = z14;
            this.title = str;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final AttributedText getDescription() {
            return this.description;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getHasPhone() {
            return this.hasPhone;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getIsAvailable() {
            return this.isAvailable;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }
    }
}
