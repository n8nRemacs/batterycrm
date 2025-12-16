package okhttp3.internal.http2;

import X41.f;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import okio.C44805o;

/* compiled from: Header.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/http2/Header;", "", "Lokio/o;", "name", "value", "<init>", "(Lokio/o;Lokio/o;)V", "", "(Ljava/lang/String;Ljava/lang/String;)V", "(Lokio/o;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "component1", "()Lokio/o;", "component2", "copy", "(Lokio/o;Lokio/o;)Lokhttp3/internal/http2/Header;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lokio/o;", "hpackSize", "I", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Header {

    @f
    @k
    public static final C44805o PSEUDO_PREFIX;

    @f
    @k
    public static final C44805o RESPONSE_STATUS;

    @k
    public static final String RESPONSE_STATUS_UTF8 = ":status";

    @f
    @k
    public static final C44805o TARGET_AUTHORITY;

    @k
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";

    @f
    @k
    public static final C44805o TARGET_METHOD;

    @k
    public static final String TARGET_METHOD_UTF8 = ":method";

    @f
    @k
    public static final C44805o TARGET_PATH;

    @k
    public static final String TARGET_PATH_UTF8 = ":path";

    @f
    @k
    public static final C44805o TARGET_SCHEME;

    @k
    public static final String TARGET_SCHEME_UTF8 = ":scheme";

    @f
    public final int hpackSize;

    @f
    @k
    public final C44805o name;

    @f
    @k
    public final C44805o value;

    static {
        C44805o.f420139e.getClass();
        PSEUDO_PREFIX = C44805o.a.c(":");
        RESPONSE_STATUS = C44805o.a.c(RESPONSE_STATUS_UTF8);
        TARGET_METHOD = C44805o.a.c(TARGET_METHOD_UTF8);
        TARGET_PATH = C44805o.a.c(TARGET_PATH_UTF8);
        TARGET_SCHEME = C44805o.a.c(TARGET_SCHEME_UTF8);
        TARGET_AUTHORITY = C44805o.a.c(TARGET_AUTHORITY_UTF8);
    }

    public Header(@k C44805o c44805o, @k C44805o c44805o2) {
        this.name = c44805o;
        this.value = c44805o2;
        this.hpackSize = c44805o2.d() + c44805o.d() + 32;
    }

    public static /* synthetic */ Header copy$default(Header header, C44805o c44805o, C44805o c44805o2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            c44805o = header.name;
        }
        if ((i12 & 2) != 0) {
            c44805o2 = header.value;
        }
        return header.copy(c44805o, c44805o2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final C44805o getName() {
        return this.name;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final C44805o getValue() {
        return this.value;
    }

    @k
    public final Header copy(@k C44805o name, @k C44805o value) {
        return new Header(name, value);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Header)) {
            return false;
        }
        Header header = (Header) other;
        return L.f(this.name, header.name) && L.f(this.value, header.value);
    }

    public int hashCode() {
        return this.value.hashCode() + (this.name.hashCode() * 31);
    }

    @k
    public String toString() {
        return this.name.t() + ": " + this.value.t();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(@k String str, @k String str2) {
        this(C44805o.a.c(str), C44805o.a.c(str2));
        C44805o.f420139e.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(@k C44805o c44805o, @k String str) {
        this(c44805o, C44805o.a.c(str));
        C44805o.f420139e.getClass();
    }
}
