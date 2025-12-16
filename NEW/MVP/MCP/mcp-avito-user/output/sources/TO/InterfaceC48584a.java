package tO;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiMapGeozonesResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LtO/a;", "", "a", "b", "LtO/a$a;", "LtO/a$b;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tO.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC48584a {

    /* compiled from: ApiMapGeozonesResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LtO/a$a;", "LtO/a;", "Lcom/avito/android/remote/model/text/AttributedText;", "departureTo", "LtO/b;", "mapArea", "", "LtO/d;", "points", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;LtO/b;Ljava/util/List;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "LtO/b;", "getMapArea", "()LtO/b;", "Ljava/util/List;", "b", "()Ljava/util/List;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tO.a$a, reason: collision with other inner class name */
    public static final class C12670a implements InterfaceC48584a {

        @com.google.gson.annotations.c("departureTo")
        @k
        private final AttributedText departureTo;

        @com.google.gson.annotations.c("mapArea")
        @l
        private final C48585b mapArea;

        @com.google.gson.annotations.c("points")
        @k
        private final List<C48587d> points;

        public C12670a(@k AttributedText attributedText, @l C48585b c48585b, @k List<C48587d> list) {
            this.departureTo = attributedText;
            this.mapArea = c48585b;
            this.points = list;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final AttributedText getDepartureTo() {
            return this.departureTo;
        }

        @k
        public final List<C48587d> b() {
            return this.points;
        }
    }

    /* compiled from: ApiMapGeozonesResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R&\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LtO/a$b;", "LtO/a;", "Lcom/avito/android/remote/model/text/AttributedText;", "departureTo", "LtO/b;", "mapArea", "", "LtO/d;", "points", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;LtO/b;Ljava/util/List;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "LtO/b;", "getMapArea", "()LtO/b;", "Ljava/util/List;", "b", "()Ljava/util/List;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tO.a$b */
    public static final class b implements InterfaceC48584a {

        @com.google.gson.annotations.c("departureTo")
        @k
        private final AttributedText departureTo;

        @com.google.gson.annotations.c("mapArea")
        @l
        private final C48585b mapArea;

        @com.google.gson.annotations.c("points")
        @k
        private final List<List<C48587d>> points;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@k AttributedText attributedText, @l C48585b c48585b, @k List<? extends List<C48587d>> list) {
            this.departureTo = attributedText;
            this.mapArea = c48585b;
            this.points = list;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final AttributedText getDepartureTo() {
            return this.departureTo;
        }

        @k
        public final List<List<C48587d>> b() {
            return this.points;
        }
    }
}
