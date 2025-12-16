package Pc0;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: ProfileVkLinkV2Response.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LPc0/d;", "", "a", "b", "c", "LPc0/d$a;", "LPc0/d$b;", "LPc0/d$c;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface d {

    /* compiled from: ProfileVkLinkV2Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LPc0/d$a;", "LPc0/d;", "", "repeatText", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements d {

        @com.google.gson.annotations.c("repeatText")
        @l
        private final String repeatText;

        @com.google.gson.annotations.c("text")
        @k
        private final String text;

        public a(@l String str, @k String str2) {
            this.repeatText = str;
            this.text = str2;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final String getRepeatText() {
            return this.repeatText;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getText() {
            return this.text;
        }
    }

    /* compiled from: ProfileVkLinkV2Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LPc0/d$b;", "LPc0/d;", "", "message", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements d {

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

    /* compiled from: ProfileVkLinkV2Response.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LPc0/d$c;", "LPc0/d;", "LPc0/e;", "group", "LPc0/g;", "popup", "<init>", "(LPc0/e;LPc0/g;)V", "LPc0/e;", "a", "()LPc0/e;", "LPc0/g;", "b", "()LPc0/g;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements d {

        @com.google.gson.annotations.c("group")
        @k
        private final e group;

        @com.google.gson.annotations.c("popup")
        @k
        private final g popup;

        public c(@k e eVar, @k g gVar) {
            this.group = eVar;
            this.popup = gVar;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final e getGroup() {
            return this.group;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final g getPopup() {
            return this.popup;
        }
    }
}
