package com.avito.android.verification.generated.api.verification_view_disclaimer_api_v_4;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: VerificationViewDisclaimerApiV4Response.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/verification/generated/api/verification_view_disclaimer_api_v_4/a;", "", "a", "b", "c", "d", "e", "Lcom/avito/android/verification/generated/api/verification_view_disclaimer_api_v_4/a$a;", "Lcom/avito/android/verification/generated/api/verification_view_disclaimer_api_v_4/a$b;", "Lcom/avito/android/verification/generated/api/verification_view_disclaimer_api_v_4/a$c;", "Lcom/avito/android/verification/generated/api/verification_view_disclaimer_api_v_4/a$d;", "Lcom/avito/android/verification/generated/api/verification_view_disclaimer_api_v_4/a$e;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: VerificationViewDisclaimerApiV4Response.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/verification/generated/api/verification_view_disclaimer_api_v_4/a$a;", "Lcom/avito/android/verification/generated/api/verification_view_disclaimer_api_v_4/a;", "", "body", "", "title", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Ljava/util/List;", "getBody", "()Ljava/util/List;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.verification.generated.api.verification_view_disclaimer_api_v_4.a$a, reason: collision with other inner class name */
    public static final class C10029a implements a {

        @com.google.gson.annotations.c("body")
        @l
        private final List<a> body;

        @com.google.gson.annotations.c("title")
        @k
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public C10029a(@l List<? extends a> list, @k String str) {
            this.body = list;
            this.title = str;
        }
    }

    /* compiled from: VerificationViewDisclaimerApiV4Response.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/verification/generated/api/verification_view_disclaimer_api_v_4/a$b;", "Lcom/avito/android/verification/generated/api/verification_view_disclaimer_api_v_4/a;", "Lcom/avito/android/remote/model/text/AttributedText;", "body", "", "icon", "title", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {

        @com.google.gson.annotations.c("body")
        @l
        private final AttributedText body;

        @com.google.gson.annotations.c("icon")
        @l
        private final String icon;

        @com.google.gson.annotations.c("title")
        @l
        private final String title;

        public b(@l AttributedText attributedText, @l String str, @l String str2) {
            this.body = attributedText;
            this.icon = str;
            this.title = str2;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final AttributedText getBody() {
            return this.body;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: VerificationViewDisclaimerApiV4Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/verification/generated/api/verification_view_disclaimer_api_v_4/a$c;", "Lcom/avito/android/verification/generated/api/verification_view_disclaimer_api_v_4/a;", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements a {

        @com.google.gson.annotations.c("text")
        @l
        private final AttributedText text;

        public c(@l AttributedText attributedText) {
            this.text = attributedText;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final AttributedText getText() {
            return this.text;
        }
    }

    /* compiled from: VerificationViewDisclaimerApiV4Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/verification/generated/api/verification_view_disclaimer_api_v_4/a$d;", "Lcom/avito/android/verification/generated/api/verification_view_disclaimer_api_v_4/a;", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements a {

        @com.google.gson.annotations.c("text")
        @l
        private final AttributedText text;

        public d(@l AttributedText attributedText) {
            this.text = attributedText;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final AttributedText getText() {
            return this.text;
        }
    }

    /* compiled from: VerificationViewDisclaimerApiV4Response.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/generated/api/verification_view_disclaimer_api_v_4/a$e;", "Lcom/avito/android/verification/generated/api/verification_view_disclaimer_api_v_4/a;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f323871a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -486576410;
        }

        @k
        public final String toString() {
            return "Unknown";
        }
    }
}
