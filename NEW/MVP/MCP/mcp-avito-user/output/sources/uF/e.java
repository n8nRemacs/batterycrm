package uF;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AddressValidationResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LuF/e;", "", "<init>", "()V", "a", "b", "c", "LuF/e$a;", "LuF/e$b;", "LuF/e$c;", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class e {

    /* compiled from: AddressValidationResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LuF/e$a;", "LuF/e;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends e {

        @com.google.gson.annotations.c("errorText")
        @k
        private final String errorMessage;

        public a(@k String str) {
            super(null);
            this.errorMessage = str;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }
    }

    /* compiled from: AddressValidationResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LuF/e$b;", "LuF/e;", "<init>", "()V", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f439869a = new b();

        public b() {
            super(null);
        }
    }

    /* compiled from: AddressValidationResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LuF/e$c;", "LuF/e;", "", "jsonWebToken", "errorMessage", "", "isValid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "a", "Z", "c", "()Z", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends e {

        @com.google.gson.annotations.c("errorText")
        @l
        private final String errorMessage;

        @com.google.gson.annotations.c("isValid")
        private final boolean isValid;

        @com.google.gson.annotations.c(AddressParameter.Value.JSON_WEB_TOKEN)
        @l
        private final String jsonWebToken;

        public /* synthetic */ c(String str, String str2, boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, z12);
        }

        @l
        /* renamed from: a, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final String getJsonWebToken() {
            return this.jsonWebToken;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getIsValid() {
            return this.isValid;
        }

        public c(@l String str, @l String str2, boolean z12) {
            super(null);
            this.jsonWebToken = str;
            this.errorMessage = str2;
            this.isValid = z12;
        }
    }

    public /* synthetic */ e(C42822w c42822w) {
        this();
    }

    private e() {
    }
}
