package jw0;

import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1StrBookingFormGetResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Ljw0/a;", "", "a", "b", "Ljw0/a$a;", "Ljw0/a$b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jw0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC42434a {

    /* compiled from: Api1StrBookingFormGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljw0/a$a;", "Ljw0/a;", "", "message", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jw0.a$a, reason: collision with other inner class name */
    public static final class C11590a implements InterfaceC42434a {

        @com.google.gson.annotations.c("message")
        @Y61.k
        private final String message;

        public C11590a(@Y61.k String str) {
            this.message = str;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getMessage() {
            return this.message;
        }
    }

    /* compiled from: Api1StrBookingFormGetResponse.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljw0/a$b;", "Ljw0/a;", "", "idempotencyKey", "", "Ljw0/h;", "pages", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/util/List;", "b", "()Ljava/util/List;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jw0.a$b */
    public static final class b implements InterfaceC42434a {

        @com.google.gson.annotations.c("idempotencyKey")
        @Y61.l
        private final String idempotencyKey;

        @com.google.gson.annotations.c("pages")
        @Y61.k
        private final List<h> pages;

        public b(@Y61.l String str, @Y61.k List<h> list) {
            this.idempotencyKey = str;
            this.pages = list;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final String getIdempotencyKey() {
            return this.idempotencyKey;
        }

        @Y61.k
        public final List<h> b() {
            return this.pages;
        }
    }
}
