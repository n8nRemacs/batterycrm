package hm0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.AdvertImage;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: UserAdvertsActionResultBlock.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u0012B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lhm0/b;", "", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "", "Lhm0/b$a;", "adverts", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito-discouraged_avito-network_user-adverts-actions"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hm0.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C40962b {

    @c("adverts")
    @l
    private final List<a> adverts;

    @c("description")
    @l
    private final AttributedText description;

    @c("title")
    @k
    private final String title;

    /* compiled from: UserAdvertsActionResultBlock.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lhm0/b$a;", "", "", "id", "", "shortcut", "title", "price", "Lcom/avito/android/remote/model/text/AttributedText;", "failureReason", "Lcom/avito/android/remote/model/AdvertImage;", "images", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/AdvertImage;)V", "J", "b", "()J", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "f", "d", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/AdvertImage;", "c", "()Lcom/avito/android/remote/model/AdvertImage;", "_avito-discouraged_avito-network_user-adverts-actions"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hm0.b$a */
    public static final class a {

        @c("failureReason")
        @k
        private final AttributedText failureReason;

        @c("id")
        private final long id;

        @c("images")
        @l
        private final AdvertImage images;

        @c("price")
        @l
        private final String price;

        @c("shortcut")
        @l
        private final String shortcut;

        @c("title")
        @k
        private final String title;

        public a(long j12, @l String str, @k String str2, @l String str3, @k AttributedText attributedText, @l AdvertImage advertImage) {
            this.id = j12;
            this.shortcut = str;
            this.title = str2;
            this.price = str3;
            this.failureReason = attributedText;
            this.images = advertImage;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final AttributedText getFailureReason() {
            return this.failureReason;
        }

        /* renamed from: b, reason: from getter */
        public final long getId() {
            return this.id;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final AdvertImage getImages() {
            return this.images;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final String getShortcut() {
            return this.shortcut;
        }

        @k
        /* renamed from: f, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    public C40962b(@k String str, @l AttributedText attributedText, @l List<a> list) {
        this.title = str;
        this.description = attributedText;
        this.adverts = list;
    }

    @l
    public final List<a> a() {
        return this.adverts;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
