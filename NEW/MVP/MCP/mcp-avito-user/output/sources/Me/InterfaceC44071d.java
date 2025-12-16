package me;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: SocialCodeConfirmV2Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lme/d;", "", "a", "b", "Lme/d$a;", "Lme/d$b;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: me.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC44071d {

    /* compiled from: SocialCodeConfirmV2Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lme/d$a;", "Lme/d;", "Lme/c;", "messages", "<init>", "(Lme/c;)V", "Lme/c;", "a", "()Lme/c;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: me.d$a */
    public static final class a implements InterfaceC44071d {

        @com.google.gson.annotations.c("messages")
        @k
        private final C44070c messages;

        public a(@k C44070c c44070c) {
            this.messages = c44070c;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final C44070c getMessages() {
            return this.messages;
        }
    }

    /* compiled from: SocialCodeConfirmV2Response.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lme/d$b;", "Lme/d;", "", "hash", "Lme/a;", "profile", "Lcom/avito/android/remote/model/text/AttributedText;", ConstraintKt.WARNING, "<init>", "(Ljava/lang/String;Lme/a;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lme/a;", "b", "()Lme/a;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: me.d$b */
    public static final class b implements InterfaceC44071d {

        @com.google.gson.annotations.c("hash")
        @k
        private final String hash;

        @com.google.gson.annotations.c("profile")
        @l
        private final C44068a profile;

        @com.google.gson.annotations.c(ConstraintKt.WARNING)
        @l
        private final AttributedText warning;

        public b(@k String str, @l C44068a c44068a, @l AttributedText attributedText) {
            this.hash = str;
            this.profile = c44068a;
            this.warning = attributedText;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getHash() {
            return this.hash;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final C44068a getProfile() {
            return this.profile;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final AttributedText getWarning() {
            return this.warning;
        }
    }
}
