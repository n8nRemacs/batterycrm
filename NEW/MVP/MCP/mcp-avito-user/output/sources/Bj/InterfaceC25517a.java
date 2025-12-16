package bJ;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2HotelByItemIdGetOfferGetResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LbJ/a;", "", "a", "b", "LbJ/a$a;", "LbJ/a$b;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bJ.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC25517a {

    /* compiled from: Api2HotelByItemIdGetOfferGetResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LbJ/a$a;", "LbJ/a;", "", "LbJ/h;", "actionButtons", "LbJ/f;", RequestReviewResultKt.INFO_TYPE, "LbJ/g;", "offer", "<init>", "(Ljava/util/List;LbJ/f;LbJ/g;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "LbJ/f;", "b", "()LbJ/f;", "LbJ/g;", "c", "()LbJ/g;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bJ.a$a, reason: collision with other inner class name */
    public static final class C1997a implements InterfaceC25517a {

        @com.google.gson.annotations.c("actionButtons")
        @l
        private final List<h> actionButtons;

        @com.google.gson.annotations.c(RequestReviewResultKt.INFO_TYPE)
        @l
        private final f info;

        @com.google.gson.annotations.c("offer")
        @l
        private final g offer;

        public C1997a(@l List<h> list, @l f fVar, @l g gVar) {
            this.actionButtons = list;
            this.info = fVar;
            this.offer = gVar;
        }

        @l
        public final List<h> a() {
            return this.actionButtons;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final f getInfo() {
            return this.info;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final g getOffer() {
            return this.offer;
        }
    }

    /* compiled from: Api2HotelByItemIdGetOfferGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LbJ/a$b;", "LbJ/a;", "", "text", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bJ.a$b */
    public static final class b implements InterfaceC25517a {

        @com.google.gson.annotations.c("text")
        @k
        private final String text;

        public b(@k String str) {
            this.text = str;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getText() {
            return this.text;
        }
    }
}
