package okhttp3;

import X41.i;
import Y61.k;
import Y61.l;
import Z41.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.internal.n;
import kotlin.jvm.internal.C42809i;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.u0;
import kotlin.text.C43066x;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: Headers.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0006\u0018\u0000 32\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u000243B\u0017\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\b\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0016J\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\"\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020!H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'H\u0096\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0011H\u0016¢\u0006\u0004\b,\u0010\u0013J\u000f\u0010-\u001a\u00020\u0003H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001b0/¢\u0006\u0004\b0\u00101R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0011\u0010\u0014\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013¨\u00065"}, d2 = {"Lokhttp3/Headers;", "", "Lkotlin/Q;", "", "", "namesAndValues", "<init>", "([Ljava/lang/String;)V", "name", "get", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/Date;", "getDate", "(Ljava/lang/String;)Ljava/util/Date;", "Ljava/time/Instant;", "getInstant", "(Ljava/lang/String;)Ljava/time/Instant;", "", "-deprecated_size", "()I", "size", "index", "(I)Ljava/lang/String;", "value", "", "names", "()Ljava/util/Set;", "", "values", "(Ljava/lang/String;)Ljava/util/List;", "", "byteCount", "()J", "", "iterator", "()Ljava/util/Iterator;", "Lokhttp3/Headers$Builder;", "newBuilder", "()Lokhttp3/Headers$Builder;", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "", "toMultimap", "()Ljava/util/Map;", "[Ljava/lang/String;", "Companion", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Headers implements Iterable<Q<? extends String, ? extends String>>, a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private final String[] namesAndValues;

    /* compiled from: Headers.kt */
    @s0
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\rJ\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0012J\u001d\u0010\u0011\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0012J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\u0014\u001a\u00020\u0010J\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0086\u0002J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0087\u0002J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\rH\u0086\u0002J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0086\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lokhttp3/Headers$Builder;", "", "()V", "namesAndValues", "", "", "getNamesAndValues$okhttp", "()Ljava/util/List;", "add", "line", "name", "value", "Ljava/time/Instant;", "Ljava/util/Date;", "addAll", "headers", "Lokhttp3/Headers;", "addLenient", "addLenient$okhttp", "addUnsafeNonAscii", "build", "get", "removeAll", "set", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        @k
        private final List<String> namesAndValues = new ArrayList(20);

        @k
        public final Builder add(@k String line) {
            int iH2 = C43066x.H(':', 0, 6, line);
            if (iH2 == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(line).toString());
            }
            add(C43066x.A0(line.substring(0, iH2)).toString(), line.substring(iH2 + 1));
            return this;
        }

        @k
        public final Builder addAll(@k Headers headers) {
            int size = headers.size();
            for (int i12 = 0; i12 < size; i12++) {
                addLenient$okhttp(headers.name(i12), headers.value(i12));
            }
            return this;
        }

        @k
        public final Builder addLenient$okhttp(@k String line) {
            int iH2 = C43066x.H(':', 1, 4, line);
            if (iH2 != -1) {
                addLenient$okhttp(line.substring(0, iH2), line.substring(iH2 + 1));
            } else if (line.charAt(0) == ':') {
                addLenient$okhttp("", line.substring(1));
            } else {
                addLenient$okhttp("", line);
            }
            return this;
        }

        @k
        public final Builder addUnsafeNonAscii(@k String name, @k String value) {
            Headers.INSTANCE.checkName(name);
            addLenient$okhttp(name, value);
            return this;
        }

        @k
        public final Headers build() {
            return new Headers((String[]) this.namesAndValues.toArray(new String[0]), null);
        }

        @l
        public final String get(@k String name) {
            int size = this.namesAndValues.size() - 2;
            int iA2 = n.a(size, 0, -2);
            if (iA2 > size) {
                return null;
            }
            while (!name.equalsIgnoreCase(this.namesAndValues.get(size))) {
                if (size == iA2) {
                    return null;
                }
                size -= 2;
            }
            return this.namesAndValues.get(size + 1);
        }

        @k
        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        @k
        public final Builder removeAll(@k String name) {
            int i12 = 0;
            while (i12 < this.namesAndValues.size()) {
                if (name.equalsIgnoreCase(this.namesAndValues.get(i12))) {
                    this.namesAndValues.remove(i12);
                    this.namesAndValues.remove(i12);
                    i12 -= 2;
                }
                i12 += 2;
            }
            return this;
        }

        @k
        public final Builder set(@k String name, @k Date value) {
            set(name, DatesKt.toHttpDateString(value));
            return this;
        }

        @k
        @IgnoreJRERequirement
        public final Builder set(@k String name, @k Instant value) {
            return set(name, new Date(value.toEpochMilli()));
        }

        @k
        public final Builder set(@k String name, @k String value) {
            Companion companion = Headers.INSTANCE;
            companion.checkName(name);
            companion.checkValue(value, name);
            removeAll(name);
            addLenient$okhttp(name, value);
            return this;
        }

        @k
        public final Builder add(@k String name, @k String value) {
            Companion companion = Headers.INSTANCE;
            companion.checkName(name);
            companion.checkValue(value, name);
            addLenient$okhttp(name, value);
            return this;
        }

        @k
        public final Builder addLenient$okhttp(@k String name, @k String value) {
            this.namesAndValues.add(name);
            this.namesAndValues.add(C43066x.A0(value).toString());
            return this;
        }

        @k
        public final Builder add(@k String name, @k Date value) {
            add(name, DatesKt.toHttpDateString(value));
            return this;
        }

        @k
        @IgnoreJRERequirement
        public final Builder add(@k String name, @k Instant value) {
            add(name, new Date(value.toEpochMilli()));
            return this;
        }
    }

    /* compiled from: Headers.kt */
    @s0
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\u00102\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0007¢\u0006\u0004\b\u0014\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0015H\u0007¢\u0006\u0004\b\u0011\u0010\u0016J#\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0015H\u0007¢\u0006\u0004\b\u0014\u0010\u0016¨\u0006\u0019"}, d2 = {"Lokhttp3/Headers$Companion;", "", "<init>", "()V", "", "", "namesAndValues", "name", "get", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/G0;", "checkName", "(Ljava/lang/String;)V", "value", "checkValue", "(Ljava/lang/String;Ljava/lang/String;)V", "Lokhttp3/Headers;", "of", "([Ljava/lang/String;)Lokhttp3/Headers;", "headersOf", "-deprecated_of", "", "(Ljava/util/Map;)Lokhttp3/Headers;", "toHeaders", "headers", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(String name) {
            if (name.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = name.length();
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt = name.charAt(i12);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i12), name).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkValue(String value, String name) {
            int length = value.length();
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt = value.charAt(i12);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(Util.format("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i12), name));
                    sb2.append(Util.isSensitiveHeader(name) ? "" : ": ".concat(value));
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String get(String[] namesAndValues, String name) {
            int length = namesAndValues.length - 2;
            int iA2 = n.a(length, 0, -2);
            if (iA2 > length) {
                return null;
            }
            while (!C43066x.C(name, namesAndValues[length], true)) {
                if (length == iA2) {
                    return null;
                }
                length -= 2;
            }
            return namesAndValues[length + 1];
        }

        @i
        @k
        @InterfaceC42830m
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m179deprecated_of(@k String... namesAndValues) {
            return of((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        @X41.n
        @i
        @k
        public final Headers of(@k String... namesAndValues) {
            if (namesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i12 = 0;
            for (int i13 = 0; i13 < length; i13++) {
                String str = strArr[i13];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr[i13] = C43066x.A0(str).toString();
            }
            int iA2 = n.a(0, strArr.length - 1, 2);
            if (iA2 >= 0) {
                while (true) {
                    String str2 = strArr[i12];
                    String str3 = strArr[i12 + 1];
                    checkName(str2);
                    checkValue(str3, str2);
                    if (i12 == iA2) {
                        break;
                    }
                    i12 += 2;
                }
            }
            return new Headers(strArr, null);
        }

        private Companion() {
        }

        @i
        @k
        @InterfaceC42830m
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m178deprecated_of(@k Map<String, String> headers) {
            return of(headers);
        }

        @X41.n
        @i
        @k
        public final Headers of(@k Map<String, String> map) {
            String[] strArr = new String[map.size() * 2];
            int i12 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String string = C43066x.A0(key).toString();
                String string2 = C43066x.A0(value).toString();
                checkName(string);
                checkValue(string2, string);
                strArr[i12] = string;
                strArr[i12 + 1] = string2;
                i12 += 2;
            }
            return new Headers(strArr, null);
        }
    }

    public /* synthetic */ Headers(String[] strArr, C42822w c42822w) {
        this(strArr);
    }

    @X41.n
    @i
    @k
    public static final Headers of(@k Map<String, String> map) {
        return INSTANCE.of(map);
    }

    @i
    @InterfaceC42830m
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m177deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        for (int i12 = 0; i12 < strArr.length; i12++) {
            length += this.namesAndValues[i12].length();
        }
        return length;
    }

    public boolean equals(@l Object other) {
        return (other instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) other).namesAndValues);
    }

    @l
    public final String get(@k String name) {
        return INSTANCE.get(this.namesAndValues, name);
    }

    @l
    public final Date getDate(@k String name) {
        String str = get(name);
        if (str != null) {
            return DatesKt.toHttpDateOrNull(str);
        }
        return null;
    }

    @l
    @IgnoreJRERequirement
    public final Instant getInstant(@k String name) {
        Date date = getDate(name);
        if (date != null) {
            return date.toInstant();
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable
    @k
    public Iterator<Q<? extends String, ? extends String>> iterator() {
        int size = size();
        Q[] qArr = new Q[size];
        for (int i12 = 0; i12 < size; i12++) {
            qArr[i12] = new Q(name(i12), value(i12));
        }
        return C42809i.a(qArr);
    }

    @k
    public final String name(int index) {
        return this.namesAndValues[index * 2];
    }

    @k
    public final Set<String> names() {
        u0 u0Var = u0.f406856a;
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            treeSet.add(name(i12));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    @k
    public final Builder newBuilder() {
        Builder builder = new Builder();
        C42745f0.i(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    @i
    public final int size() {
        return this.namesAndValues.length / 2;
    }

    @k
    public final Map<String, List<String>> toMultimap() {
        u0 u0Var = u0.f406856a;
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            String lowerCase = name(i12).toLowerCase(Locale.US);
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(value(i12));
        }
        return treeMap;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            String strName = name(i12);
            String strValue = value(i12);
            sb2.append(strName);
            sb2.append(": ");
            if (Util.isSensitiveHeader(strName)) {
                strValue = "██";
            }
            sb2.append(strValue);
            sb2.append("\n");
        }
        return sb2.toString();
    }

    @k
    public final String value(int index) {
        return this.namesAndValues[(index * 2) + 1];
    }

    @k
    public final List<String> values(@k String name) {
        int size = size();
        ArrayList arrayList = null;
        for (int i12 = 0; i12 < size; i12++) {
            if (name.equalsIgnoreCase(name(i12))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i12));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : C42784z0.f406748b;
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    @X41.n
    @i
    @k
    public static final Headers of(@k String... strArr) {
        return INSTANCE.of(strArr);
    }
}
