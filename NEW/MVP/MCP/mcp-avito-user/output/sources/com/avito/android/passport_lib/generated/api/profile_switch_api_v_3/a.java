package com.avito.android.passport_lib.generated.api.profile_switch_api_v_3;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import java.util.List;
import kotlin.Metadata;
import o60.C44593a;

/* compiled from: ProfileSwitchApiV3Response.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/passport_lib/generated/api/profile_switch_api_v_3/a;", "", "a", "b", "c", "d", "e", "Lcom/avito/android/passport_lib/generated/api/profile_switch_api_v_3/a$a;", "Lcom/avito/android/passport_lib/generated/api/profile_switch_api_v_3/a$b;", "Lcom/avito/android/passport_lib/generated/api/profile_switch_api_v_3/a$c;", "Lcom/avito/android/passport_lib/generated/api/profile_switch_api_v_3/a$d;", "Lcom/avito/android/passport_lib/generated/api/profile_switch_api_v_3/a$e;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: ProfileSwitchApiV3Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/passport_lib/generated/api/profile_switch_api_v_3/a$a;", "Lcom/avito/android/passport_lib/generated/api/profile_switch_api_v_3/a;", "Lcom/avito/android/deep_linking/links/DeepLink;", "redirectLink", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.passport_lib.generated.api.profile_switch_api_v_3.a$a, reason: collision with other inner class name */
    public static final class C6415a implements a {

        @com.google.gson.annotations.c("redirectLink")
        @k
        private final DeepLink redirectLink;

        public C6415a(@k DeepLink deepLink) {
            this.redirectLink = deepLink;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final DeepLink getRedirectLink() {
            return this.redirectLink;
        }
    }

    /* compiled from: ProfileSwitchApiV3Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/passport_lib/generated/api/profile_switch_api_v_3/a$b;", "Lcom/avito/android/passport_lib/generated/api/profile_switch_api_v_3/a;", "", "isNoOp", "<init>", "(Z)V", "Z", "a", "()Z", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        @com.google.gson.annotations.c("isNoOp")
        private final boolean isNoOp;

        public b(boolean z12) {
            this.isNoOp = z12;
        }

        /* renamed from: a, reason: from getter */
        public final boolean getIsNoOp() {
            return this.isNoOp;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.isNoOp == ((b) obj).isNoOp;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isNoOp);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("IsNoOp(isNoOp="), this.isNoOp, ')');
        }
    }

    /* compiled from: ProfileSwitchApiV3Response.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/passport_lib/generated/api/profile_switch_api_v_3/a$c;", "Lcom/avito/android/passport_lib/generated/api/profile_switch_api_v_3/a;", "Lo60/b;", RequestReviewResultKt.INFO_TYPE, "Lo60/c;", "session", "<init>", "(Lo60/b;Lo60/c;)V", "Lo60/b;", "a", "()Lo60/b;", "Lo60/c;", "b", "()Lo60/c;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements a {

        @com.google.gson.annotations.c(RequestReviewResultKt.INFO_TYPE)
        @k
        private final o60.b info;

        @com.google.gson.annotations.c("session")
        @k
        private final o60.c session;

        public c(@k o60.b bVar, @k o60.c cVar) {
            this.info = bVar;
            this.session = cVar;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final o60.b getInfo() {
            return this.info;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final o60.c getSession() {
            return this.session;
        }
    }

    /* compiled from: ProfileSwitchApiV3Response.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B5\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/avito/android/passport_lib/generated/api/profile_switch_api_v_3/a$d;", "Lcom/avito/android/passport_lib/generated/api/profile_switch_api_v_3/a;", "", "Lo60/a;", "actions", "", "cancelable", "", "message", "title", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements a {

        @com.google.gson.annotations.c("actions")
        @l
        private final List<C44593a> actions;

        @com.google.gson.annotations.c("cancelable")
        @l
        private final Boolean cancelable;

        @com.google.gson.annotations.c("message")
        @l
        private final String message;

        @com.google.gson.annotations.c("title")
        @l
        private final String title;

        public d(@l List<C44593a> list, @l Boolean bool, @l String str, @l String str2) {
            this.actions = list;
            this.cancelable = bool;
            this.message = str;
            this.title = str2;
        }

        @l
        public final List<C44593a> a() {
            return this.actions;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final Boolean getCancelable() {
            return this.cancelable;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: ProfileSwitchApiV3Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/passport_lib/generated/api/profile_switch_api_v_3/a$e;", "Lcom/avito/android/passport_lib/generated/api/profile_switch_api_v_3/a;", "", "message", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements a {

        @com.google.gson.annotations.c("message")
        @k
        private final String message;

        public e(@k String str) {
            this.message = str;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getMessage() {
            return this.message;
        }
    }
}
