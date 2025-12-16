package mm;

import Y61.k;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api4CampaignsSalesByIdItemsGetResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lmm/a;", "", "a", "b", "Lmm/a$a;", "Lmm/a$b;", "_avito-discouraged_avito-network_campaigns-sale"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mm.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC44097a {

    /* compiled from: Api4CampaignsSalesByIdItemsGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lmm/a$a;", "Lmm/a;", "Lmm/c;", "image", "", "text", "title", "<init>", "(Lmm/c;Ljava/lang/String;Ljava/lang/String;)V", "Lmm/c;", "a", "()Lmm/c;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "_avito-discouraged_avito-network_campaigns-sale"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mm.a$a, reason: collision with other inner class name */
    public static final class C11838a implements InterfaceC44097a {

        @com.google.gson.annotations.c("image")
        @k
        private final C44099c image;

        @com.google.gson.annotations.c("text")
        @k
        private final String text;

        @com.google.gson.annotations.c("title")
        @k
        private final String title;

        public C11838a(@k C44099c c44099c, @k String str, @k String str2) {
            this.image = c44099c;
            this.text = str;
            this.title = str2;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final C44099c getImage() {
            return this.image;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: Api4CampaignsSalesByIdItemsGetResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\b\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lmm/a$b;", "Lmm/a;", "", "", "bannedItemIds", "Lmm/b;", "discounts", "", "isBigSeller", "loading", "<init>", "(Ljava/util/List;Ljava/util/List;ZZ)V", "Ljava/util/List;", "getBannedItemIds", "()Ljava/util/List;", "a", "Z", "()Z", "b", "_avito-discouraged_avito-network_campaigns-sale"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mm.a$b */
    public static final class b implements InterfaceC44097a {

        @com.google.gson.annotations.c("bannedItemIds")
        @k
        private final List<Long> bannedItemIds;

        @com.google.gson.annotations.c("discounts")
        @k
        private final List<C44098b> discounts;

        @com.google.gson.annotations.c("isBigSeller")
        private final boolean isBigSeller;

        @com.google.gson.annotations.c("loading")
        private final boolean loading;

        public b(@k List<Long> list, @k List<C44098b> list2, boolean z12, boolean z13) {
            this.bannedItemIds = list;
            this.discounts = list2;
            this.isBigSeller = z12;
            this.loading = z13;
        }

        @k
        public final List<C44098b> a() {
            return this.discounts;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getLoading() {
            return this.loading;
        }
    }
}
