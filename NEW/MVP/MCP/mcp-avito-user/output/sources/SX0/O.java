package Sx0;

import kotlin.Metadata;

/* compiled from: Api4StrOrderSellerByOrderIdGetResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LSx0/O;", "", "a", "b", "LSx0/O$a;", "LSx0/O$b;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface O {

    /* compiled from: Api4StrOrderSellerByOrderIdGetResponse.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"LSx0/O$a;", "LSx0/O;", "LSx0/a;", "action", "LSx0/r;", "clickstream", "", "preset", "title", "<init>", "(LSx0/a;LSx0/r;Ljava/lang/String;Ljava/lang/String;)V", "LSx0/a;", "a", "()LSx0/a;", "LSx0/r;", "b", "()LSx0/r;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements O {

        @com.google.gson.annotations.c("action")
        @Y61.l
        private final C15252a action;

        @com.google.gson.annotations.c("clickstream")
        @Y61.l
        private final r clickstream;

        @com.google.gson.annotations.c("preset")
        @Y61.l
        private final String preset;

        @com.google.gson.annotations.c("title")
        @Y61.l
        private final String title;

        public a(@Y61.l C15252a c15252a, @Y61.l r rVar, @Y61.l String str, @Y61.l String str2) {
            this.action = c15252a;
            this.clickstream = rVar;
            this.preset = str;
            this.title = str2;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final C15252a getAction() {
            return this.action;
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final r getClickstream() {
            return this.clickstream;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final String getPreset() {
            return this.preset;
        }

        @Y61.l
        /* renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: Api4StrOrderSellerByOrderIdGetResponse.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"LSx0/O$b;", "LSx0/O;", "LSx0/E;", "action", "LSx0/r;", "clickstream", "", "preset", "title", "<init>", "(LSx0/E;LSx0/r;Ljava/lang/String;Ljava/lang/String;)V", "LSx0/E;", "a", "()LSx0/E;", "LSx0/r;", "b", "()LSx0/r;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements O {

        @com.google.gson.annotations.c("action")
        @Y61.l
        private final E action;

        @com.google.gson.annotations.c("clickstream")
        @Y61.l
        private final r clickstream;

        @com.google.gson.annotations.c("preset")
        @Y61.l
        private final String preset;

        @com.google.gson.annotations.c("title")
        @Y61.l
        private final String title;

        public b(@Y61.l E e12, @Y61.l r rVar, @Y61.l String str, @Y61.l String str2) {
            this.action = e12;
            this.clickstream = rVar;
            this.preset = str;
            this.title = str2;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final E getAction() {
            return this.action;
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final r getClickstream() {
            return this.clickstream;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final String getPreset() {
            return this.preset;
        }

        @Y61.l
        /* renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }
}
