package uF;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AddressCoordinatesByQueryResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LuF/c;", "", "<init>", "()V", "a", "b", "c", "LuF/c$a;", "LuF/c$b;", "LuF/c$c;", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class c {

    /* compiled from: AddressCoordinatesByQueryResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LuF/c$a;", "LuF/c;", "<init>", "()V", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends c {
        public a() {
            super(null);
        }
    }

    /* compiled from: AddressCoordinatesByQueryResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LuF/c$b;", "LuF/c;", "", "message", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends c {

        @com.google.gson.annotations.c("message")
        @k
        private final String message;

        public b(@k String str) {
            super(null);
            this.message = str;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getMessage() {
            return this.message;
        }
    }

    public /* synthetic */ c(C42822w c42822w) {
        this();
    }

    /* compiled from: AddressCoordinatesByQueryResult.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"LuF/c$c;", "LuF/c;", "", "formattedAddress", "Lcom/avito/android/remote/model/Coordinates;", "coords", "jsonWebToken", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Coordinates;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Coordinates;", "a", "()Lcom/avito/android/remote/model/Coordinates;", "c", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: uF.c$c, reason: collision with other inner class name */
    public static final class C12707c extends c {

        @com.google.gson.annotations.c(ServiceTransportationWidget.LocationField.COORDINATES)
        @k
        private final Coordinates coords;

        @com.google.gson.annotations.c("formattedAddress")
        @l
        private final String formattedAddress;

        @com.google.gson.annotations.c(AddressParameter.Value.JSON_WEB_TOKEN)
        @l
        private final String jsonWebToken;

        public /* synthetic */ C12707c(String str, Coordinates coordinates, String str2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? "" : str, coordinates, str2);
        }

        @k
        /* renamed from: a, reason: from getter */
        public final Coordinates getCoords() {
            return this.coords;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final String getFormattedAddress() {
            return this.formattedAddress;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final String getJsonWebToken() {
            return this.jsonWebToken;
        }

        public C12707c(@l String str, @k Coordinates coordinates, @l String str2) {
            super(null);
            this.formattedAddress = str;
            this.coords = coordinates;
            this.jsonWebToken = str2;
        }
    }

    private c() {
    }
}
