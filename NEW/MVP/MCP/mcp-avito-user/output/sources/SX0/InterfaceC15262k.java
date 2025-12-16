package Sx0;

import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api4StrOrderSellerByOrderIdGetResponse.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"LSx0/k;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "LSx0/k$a;", "LSx0/k$b;", "LSx0/k$c;", "LSx0/k$d;", "LSx0/k$e;", "LSx0/k$f;", "LSx0/k$g;", "LSx0/k$h;", "LSx0/k$i;", "LSx0/k$j;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Sx0.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC15262k {

    /* compiled from: Api4StrOrderSellerByOrderIdGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LSx0/k$a;", "LSx0/k;", "LSx0/p;", "polling", "", "updatedTime", "<init>", "(LSx0/p;Ljava/lang/String;)V", "LSx0/p;", "a", "()LSx0/p;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sx0.k$a */
    public static final class a implements InterfaceC15262k {

        @com.google.gson.annotations.c("polling")
        @Y61.k
        private final C15267p polling;

        @com.google.gson.annotations.c("updatedTime")
        @Y61.k
        private final String updatedTime;

        public a(@Y61.k C15267p c15267p, @Y61.k String str) {
            this.polling = c15267p;
            this.updatedTime = str;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final C15267p getPolling() {
            return this.polling;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getUpdatedTime() {
            return this.updatedTime;
        }
    }

    /* compiled from: Api4StrOrderSellerByOrderIdGetResponse.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B5\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LSx0/k$b;", "LSx0/k;", "", "LSx0/F;", "buttons", "LSx0/h;", "color", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "", "header", "<init>", "(Ljava/util/List;LSx0/h;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "LSx0/h;", "b", "()LSx0/h;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sx0.k$b */
    public static final class b implements InterfaceC15262k {

        @com.google.gson.annotations.c("buttons")
        @Y61.l
        private final List<F> buttons;

        @com.google.gson.annotations.c("color")
        @Y61.l
        private final C15259h color;

        @com.google.gson.annotations.c("description")
        @Y61.l
        private final AttributedText description;

        @com.google.gson.annotations.c("header")
        @Y61.l
        private final String header;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Y61.l List<? extends F> list, @Y61.l C15259h c15259h, @Y61.l AttributedText attributedText, @Y61.l String str) {
            this.buttons = list;
            this.color = c15259h;
            this.description = attributedText;
            this.header = str;
        }

        @Y61.l
        public final List<F> a() {
            return this.buttons;
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final C15259h getColor() {
            return this.color;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final AttributedText getDescription() {
            return this.description;
        }

        @Y61.l
        /* renamed from: d, reason: from getter */
        public final String getHeader() {
            return this.header;
        }
    }

    /* compiled from: Api4StrOrderSellerByOrderIdGetResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LSx0/k$c;", "LSx0/k;", "LSx0/G;", "additionalInfo", "", "header", "", "LSx0/q;", "items", "<init>", "(LSx0/G;Ljava/lang/String;Ljava/util/List;)V", "LSx0/G;", "a", "()LSx0/G;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sx0.k$c */
    public static final class c implements InterfaceC15262k {

        @com.google.gson.annotations.c("additionalInfo")
        @Y61.l
        private final G additionalInfo;

        @com.google.gson.annotations.c("header")
        @Y61.l
        private final String header;

        @com.google.gson.annotations.c("items")
        @Y61.l
        private final List<C15268q> items;

        public c(@Y61.l G g12, @Y61.l String str, @Y61.l List<C15268q> list) {
            this.additionalInfo = g12;
            this.header = str;
            this.items = list;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final G getAdditionalInfo() {
            return this.additionalInfo;
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final String getHeader() {
            return this.header;
        }

        @Y61.l
        public final List<C15268q> c() {
            return this.items;
        }
    }

    /* compiled from: Api4StrOrderSellerByOrderIdGetResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LSx0/k$d;", "LSx0/k;", "", "header", "", "LSx0/I;", "items", "LSx0/J;", "terms", "<init>", "(Ljava/lang/String;Ljava/util/List;LSx0/J;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/util/List;", "b", "()Ljava/util/List;", "LSx0/J;", "c", "()LSx0/J;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sx0.k$d */
    public static final class d implements InterfaceC15262k {

        @com.google.gson.annotations.c("header")
        @Y61.l
        private final String header;

        @com.google.gson.annotations.c("items")
        @Y61.l
        private final List<I> items;

        @com.google.gson.annotations.c("terms")
        @Y61.l
        private final J terms;

        public d(@Y61.l String str, @Y61.l List<I> list, @Y61.l J j12) {
            this.header = str;
            this.items = list;
            this.terms = j12;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final String getHeader() {
            return this.header;
        }

        @Y61.l
        public final List<I> b() {
            return this.items;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final J getTerms() {
            return this.terms;
        }
    }

    /* compiled from: Api4StrOrderSellerByOrderIdGetResponse.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LSx0/k$e;", "LSx0/k;", "", "header", "", "LSx0/M;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/util/List;", "b", "()Ljava/util/List;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sx0.k$e */
    public static final class e implements InterfaceC15262k {

        @com.google.gson.annotations.c("header")
        @Y61.l
        private final String header;

        @com.google.gson.annotations.c("items")
        @Y61.l
        private final List<M> items;

        public e(@Y61.l String str, @Y61.l List<M> list) {
            this.header = str;
            this.items = list;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final String getHeader() {
            return this.header;
        }

        @Y61.l
        public final List<M> b() {
            return this.items;
        }
    }

    /* compiled from: Api4StrOrderSellerByOrderIdGetResponse.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LSx0/k$f;", "LSx0/k;", "", "LSx0/N;", "buttons", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sx0.k$f */
    public static final class f implements InterfaceC15262k {

        @com.google.gson.annotations.c("buttons")
        @Y61.l
        private final List<N> buttons;

        @com.google.gson.annotations.c("description")
        @Y61.l
        private final AttributedText description;

        /* JADX WARN: Multi-variable type inference failed */
        public f(@Y61.l List<? extends N> list, @Y61.l AttributedText attributedText) {
            this.buttons = list;
            this.description = attributedText;
        }

        @Y61.l
        public final List<N> a() {
            return this.buttons;
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final AttributedText getDescription() {
            return this.description;
        }
    }

    /* compiled from: Api4StrOrderSellerByOrderIdGetResponse.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B[\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013R\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016¨\u0006 "}, d2 = {"LSx0/k$g;", "LSx0/k;", "", "LSx0/O;", "buttons", "", "collapsed", "Lcom/avito/android/remote/model/text/AttributedText;", "description", ServiceTransportationWidget.DisclaimerField.TYPE, "", "header", "LSx0/x;", "infoPlaques", "isCollapsible", "<init>", "(Ljava/util/List;ZLcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Z)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Z", "b", "()Z", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "d", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "f", "g", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sx0.k$g */
    public static final class g implements InterfaceC15262k {

        @com.google.gson.annotations.c("buttons")
        @Y61.l
        private final List<O> buttons;

        @com.google.gson.annotations.c("collapsed")
        private final boolean collapsed;

        @com.google.gson.annotations.c("description")
        @Y61.l
        private final AttributedText description;

        @com.google.gson.annotations.c(ServiceTransportationWidget.DisclaimerField.TYPE)
        @Y61.l
        private final List<AttributedText> disclaimer;

        @com.google.gson.annotations.c("header")
        @Y61.l
        private final String header;

        @com.google.gson.annotations.c("infoPlaques")
        @Y61.l
        private final List<x> infoPlaques;

        @com.google.gson.annotations.c("isCollapsible")
        private final boolean isCollapsible;

        /* JADX WARN: Multi-variable type inference failed */
        public g(@Y61.l List<? extends O> list, boolean z12, @Y61.l AttributedText attributedText, @Y61.l List<AttributedText> list2, @Y61.l String str, @Y61.l List<x> list3, boolean z13) {
            this.buttons = list;
            this.collapsed = z12;
            this.description = attributedText;
            this.disclaimer = list2;
            this.header = str;
            this.infoPlaques = list3;
            this.isCollapsible = z13;
        }

        @Y61.l
        public final List<O> a() {
            return this.buttons;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getCollapsed() {
            return this.collapsed;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final AttributedText getDescription() {
            return this.description;
        }

        @Y61.l
        public final List<AttributedText> d() {
            return this.disclaimer;
        }

        @Y61.l
        /* renamed from: e, reason: from getter */
        public final String getHeader() {
            return this.header;
        }

        @Y61.l
        public final List<x> f() {
            return this.infoPlaques;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getIsCollapsible() {
            return this.isCollapsible;
        }
    }

    /* compiled from: Api4StrOrderSellerByOrderIdGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"LSx0/k$h;", "LSx0/k;", "", AddressParameter.TYPE, "href", "image", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "c", "d", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sx0.k$h */
    public static final class h implements InterfaceC15262k {

        @com.google.gson.annotations.c(AddressParameter.TYPE)
        @Y61.l
        private final String address;

        @com.google.gson.annotations.c("href")
        @Y61.l
        private final String href;

        @com.google.gson.annotations.c("image")
        @Y61.l
        private final String image;

        @com.google.gson.annotations.c("title")
        @Y61.l
        private final String title;

        public h(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
            this.address = str;
            this.href = str2;
            this.image = str3;
            this.title = str4;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final String getAddress() {
            return this.address;
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final String getHref() {
            return this.href;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @Y61.l
        /* renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: Api4StrOrderSellerByOrderIdGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LSx0/k$i;", "LSx0/k;", "", "text", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sx0.k$i */
    public static final class i implements InterfaceC15262k {

        @com.google.gson.annotations.c("text")
        @Y61.l
        private final String text;

        public i(@Y61.l String str) {
            this.text = str;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final String getText() {
            return this.text;
        }
    }

    /* compiled from: Api4StrOrderSellerByOrderIdGetResponse.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001BC\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"LSx0/k$j;", "LSx0/k;", "", "Lcom/avito/android/str_booking/network/generated/api/api_4_str_order_seller_by_order_id_get/a;", "buttons", "", "image", "", "isActive", "name", "LSx0/P;", "rating", "LSx0/y;", "themedImage", "<init>", "(Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;LSx0/P;LSx0/y;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Z", "f", "()Z", "c", "LSx0/P;", "d", "()LSx0/P;", "LSx0/y;", "e", "()LSx0/y;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sx0.k$j */
    public static final class j implements InterfaceC15262k {

        @com.google.gson.annotations.c("buttons")
        @Y61.k
        private final List<com.avito.android.str_booking.network.generated.api.api_4_str_order_seller_by_order_id_get.a> buttons;

        @com.google.gson.annotations.c("image")
        @Y61.l
        private final String image;

        @com.google.gson.annotations.c("isActive")
        private final boolean isActive;

        @com.google.gson.annotations.c("name")
        @Y61.k
        private final String name;

        @com.google.gson.annotations.c("rating")
        @Y61.l
        private final P rating;

        @com.google.gson.annotations.c("themedImage")
        @Y61.l
        private final y themedImage;

        /* JADX WARN: Multi-variable type inference failed */
        public j(@Y61.k List<? extends com.avito.android.str_booking.network.generated.api.api_4_str_order_seller_by_order_id_get.a> list, @Y61.l String str, boolean z12, @Y61.k String str2, @Y61.l P p12, @Y61.l y yVar) {
            this.buttons = list;
            this.image = str;
            this.isActive = z12;
            this.name = str2;
            this.rating = p12;
            this.themedImage = yVar;
        }

        @Y61.k
        public final List<com.avito.android.str_booking.network.generated.api.api_4_str_order_seller_by_order_id_get.a> a() {
            return this.buttons;
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @Y61.l
        /* renamed from: d, reason: from getter */
        public final P getRating() {
            return this.rating;
        }

        @Y61.l
        /* renamed from: e, reason: from getter */
        public final y getThemedImage() {
            return this.themedImage;
        }

        /* renamed from: f, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }
    }
}
