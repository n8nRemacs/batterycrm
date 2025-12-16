package hm0;

import Y61.k;
import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: UserAdvertsActionResult.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lhm0/a;", "", "a", "b", "c", "d", "Lhm0/a$a;", "Lhm0/a$b;", "Lhm0/a$c;", "Lhm0/a$d;", "_avito-discouraged_avito-network_user-adverts-actions"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hm0.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC40961a {

    /* compiled from: UserAdvertsActionResult.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhm0/a$a;", "Lhm0/a;", "", "message", "", "", "failureAdvertIds", "<init>", "(Ljava/lang/String;Ljava/util/Set;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/Set;", "a", "()Ljava/util/Set;", "_avito-discouraged_avito-network_user-adverts-actions"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hm0.a$a, reason: collision with other inner class name */
    public static final class C11277a implements InterfaceC40961a {

        @com.google.gson.annotations.c("failureAdvertIds")
        @l
        private final Set<Long> failureAdvertIds;

        @com.google.gson.annotations.c("message")
        @k
        private final String message;

        public C11277a(@k String str, @l Set<Long> set) {
            this.message = str;
            this.failureAdvertIds = set;
        }

        @l
        public final Set<Long> a() {
            return this.failureAdvertIds;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getMessage() {
            return this.message;
        }
    }

    /* compiled from: UserAdvertsActionResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lhm0/a$b;", "Lhm0/a;", "", "message", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito-discouraged_avito-network_user-adverts-actions"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hm0.a$b */
    public static final class b implements InterfaceC40961a {

        @com.google.gson.annotations.c("message")
        @k
        private final String message;

        public b(@k String str) {
            this.message = str;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getMessage() {
            return this.message;
        }
    }

    /* compiled from: UserAdvertsActionResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lhm0/a$c;", "Lhm0/a;", "Lhm0/b;", "successBlock", "failureBlock", "<init>", "(Lhm0/b;Lhm0/b;)V", "Lhm0/b;", "b", "()Lhm0/b;", "a", "_avito-discouraged_avito-network_user-adverts-actions"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hm0.a$c */
    public static final class c implements InterfaceC40961a {

        @com.google.gson.annotations.c("failureBlock")
        @l
        private final C40962b failureBlock;

        @com.google.gson.annotations.c("successBlock")
        @l
        private final C40962b successBlock;

        public c(@l C40962b c40962b, @l C40962b c40962b2) {
            this.successBlock = c40962b;
            this.failureBlock = c40962b2;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final C40962b getFailureBlock() {
            return this.failureBlock;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final C40962b getSuccessBlock() {
            return this.successBlock;
        }
    }

    /* compiled from: UserAdvertsActionResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lhm0/a$d;", "Lhm0/a;", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-network_user-adverts-actions"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hm0.a$d */
    public static final class d implements InterfaceC40961a {

        @com.google.gson.annotations.c(Constants.DEEPLINK)
        @k
        private final DeepLink uri;

        public d(@k DeepLink deepLink) {
            this.uri = deepLink;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final DeepLink getUri() {
            return this.uri;
        }
    }
}
