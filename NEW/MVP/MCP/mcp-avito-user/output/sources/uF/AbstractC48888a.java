package uF;

import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AddressByCoordinatesResult.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LuF/a;", "", "<init>", "()V", "a", "b", "c", "d", "LuF/a$a;", "LuF/a$b;", "LuF/a$c;", "LuF/a$d;", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uF.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC48888a {

    /* compiled from: AddressByCoordinatesResult.kt */
    @InterfaceC19823a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LuF/a$a;", "LuF/a;", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: uF.a$a, reason: collision with other inner class name */
    public static final class C12706a extends AbstractC48888a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f439865a;

        public C12706a(@k String str) {
            super(null);
            this.f439865a = str;
        }
    }

    /* compiled from: AddressByCoordinatesResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LuF/a$b;", "LuF/a;", "<init>", "()V", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: uF.a$b */
    public static final class b extends AbstractC48888a {
        public b() {
            super(null);
        }
    }

    /* compiled from: AddressByCoordinatesResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LuF/a$c;", "LuF/a;", "", "message", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: uF.a$c */
    public static final class c extends AbstractC48888a {

        @com.google.gson.annotations.c("message")
        @k
        private final String message;

        public c(@k String str) {
            super(null);
            this.message = str;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getMessage() {
            return this.message;
        }
    }

    /* compiled from: AddressByCoordinatesResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LuF/a$d;", "LuF/a;", "", "formattedAddress", "jsonWebToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: uF.a$d */
    public static final class d extends AbstractC48888a {

        @com.google.gson.annotations.c("formattedAddress")
        @k
        private final String formattedAddress;

        @com.google.gson.annotations.c(AddressParameter.Value.JSON_WEB_TOKEN)
        @l
        private final String jsonWebToken;

        public /* synthetic */ d(String str, String str2, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2);
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getFormattedAddress() {
            return this.formattedAddress;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final String getJsonWebToken() {
            return this.jsonWebToken;
        }

        public d(@k String str, @l String str2) {
            super(null);
            this.formattedAddress = str;
            this.jsonWebToken = str2;
        }
    }

    public /* synthetic */ AbstractC48888a(C42822w c42822w) {
        this();
    }

    private AbstractC48888a() {
    }
}
