package Sx0;

import kotlin.Metadata;

/* compiled from: Api4StrOrderSellerByOrderIdGetResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LSx0/F;", "", "a", "b", "LSx0/F$a;", "LSx0/F$b;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface F {

    /* compiled from: Api4StrOrderSellerByOrderIdGetResponse.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"LSx0/F$a;", "LSx0/F;", "LSx0/a;", "action", "LSx0/r;", "clickstream", "", "preset", "title", "<init>", "(LSx0/a;LSx0/r;Ljava/lang/String;Ljava/lang/String;)V", "LSx0/a;", "a", "()LSx0/a;", "LSx0/r;", "b", "()LSx0/r;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements F {

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
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, d2 = {"LSx0/F$b;", "LSx0/F;", "LSx0/n;", "action", "LSx0/r;", "clickstream", "", "dataMarker", "icon", "preset", "title", "type", "<init>", "(LSx0/n;LSx0/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "LSx0/n;", "a", "()LSx0/n;", "LSx0/r;", "b", "()LSx0/r;", "Ljava/lang/String;", "getDataMarker", "()Ljava/lang/String;", "getIcon", "c", "d", "getType", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements F {

        @com.google.gson.annotations.c("action")
        @Y61.l
        private final C15265n action;

        @com.google.gson.annotations.c("clickstream")
        @Y61.l
        private final r clickstream;

        @com.google.gson.annotations.c("dataMarker")
        @Y61.l
        private final String dataMarker;

        @com.google.gson.annotations.c("icon")
        @Y61.l
        private final String icon;

        @com.google.gson.annotations.c("preset")
        @Y61.l
        private final String preset;

        @com.google.gson.annotations.c("title")
        @Y61.l
        private final String title;

        @com.google.gson.annotations.c("type")
        @Y61.l
        private final String type;

        public b(@Y61.l C15265n c15265n, @Y61.l r rVar, @Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5) {
            this.action = c15265n;
            this.clickstream = rVar;
            this.dataMarker = str;
            this.icon = str2;
            this.preset = str3;
            this.title = str4;
            this.type = str5;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final C15265n getAction() {
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
