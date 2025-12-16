package uF0;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: Api1TravelSearchFavoritesItemsPostResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LuF0/i;", "", "a", "b", "LuF0/i$a;", "LuF0/i$b;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface i {

    /* compiled from: Api1TravelSearchFavoritesItemsPostResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LuF0/i$a;", "LuF0/i;", "", "type", "LuF0/b;", "value", "<init>", "(Ljava/lang/String;LuF0/b;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "LuF0/b;", "a", "()LuF0/b;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements i {

        @com.google.gson.annotations.c("type")
        @l
        private final String type;

        @com.google.gson.annotations.c("value")
        @l
        private final C48891b value;

        public a(@l String str, @l C48891b c48891b) {
            this.type = str;
            this.value = c48891b;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final C48891b getValue() {
            return this.value;
        }
    }

    /* compiled from: Api1TravelSearchFavoritesItemsPostResponse.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u0003\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LuF0/i$b;", "LuF0/i;", "", "isConstructor", "", "type", "LuF0/f;", "value", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;LuF0/f;)V", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "LuF0/f;", "a", "()LuF0/f;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements i {

        @com.google.gson.annotations.c("isConstructor")
        @l
        private final Boolean isConstructor;

        @com.google.gson.annotations.c("type")
        @k
        private final String type;

        @com.google.gson.annotations.c("value")
        @k
        private final f value;

        public b(@l Boolean bool, @k String str, @k f fVar) {
            this.isConstructor = bool;
            this.type = str;
            this.value = fVar;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final f getValue() {
            return this.value;
        }
    }
}
