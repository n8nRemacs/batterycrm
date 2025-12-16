package com.avito.android.ai_assistant.generated.api.list;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: ListResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/list/a;", "", "a", "b", "c", "Lcom/avito/android/ai_assistant/generated/api/list/a$a;", "Lcom/avito/android/ai_assistant/generated/api/list/a$b;", "Lcom/avito/android/ai_assistant/generated/api/list/a$c;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface a {

    /* compiled from: ListResponse.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0012\u0010\rR\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/list/a$a;", "Lcom/avito/android/ai_assistant/generated/api/list/a;", "", "id", "lastUpdated", "", "opened", "title", "unread", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Z)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "Z", "c", "()Z", "d", "e", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.ai_assistant.generated.api.list.a$a, reason: collision with other inner class name */
    public static final class C2634a implements a {

        @com.google.gson.annotations.c("id")
        @k
        private final String id;

        @com.google.gson.annotations.c("lastUpdated")
        @k
        private final String lastUpdated;

        @com.google.gson.annotations.c("opened")
        private final boolean opened;

        @com.google.gson.annotations.c("title")
        @k
        private final String title;

        @com.google.gson.annotations.c("unread")
        private final boolean unread;

        public C2634a(@k String str, @k String str2, boolean z12, @k String str3, boolean z13) {
            this.id = str;
            this.lastUpdated = str2;
            this.opened = z12;
            this.title = str3;
            this.unread = z13;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getLastUpdated() {
            return this.lastUpdated;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getOpened() {
            return this.opened;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getUnread() {
            return this.unread;
        }
    }

    /* compiled from: ListResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/list/a$b;", "Lcom/avito/android/ai_assistant/generated/api/list/a;", "", "datetime", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {

        @com.google.gson.annotations.c("datetime")
        @k
        private final String datetime;

        public b(@k String str) {
            this.datetime = str;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getDatetime() {
            return this.datetime;
        }
    }

    /* compiled from: ListResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/list/a$c;", "Lcom/avito/android/ai_assistant/generated/api/list/a;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f89045a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 511657588;
        }

        @k
        public final String toString() {
            return "Unknown";
        }
    }
}
