package okhttp3;

import AK.c;
import X41.i;
import Y61.k;
import Y61.l;
import androidx.camera.camera2.internal.G;
import androidx.compose.foundation.H;
import androidx.media3.exoplayer.analytics.m;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.facebook.imageutils.JfifUtil;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.internal.n;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.j;
import kotlin.ranges.s;
import kotlin.text.C43059p;
import kotlin.text.C43066x;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okio.C44802l;

/* compiled from: HttpUrl.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 J2\u00020\u0001:\u0002IJBa\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b!J\r\u0010\u0011\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\"J\r\u0010\u0012\u001a\u00020\u0003H\u0007¢\u0006\u0002\b#J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\b$J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b%J\r\u0010\u0016\u001a\u00020\u0003H\u0007¢\u0006\u0002\b&J\u0013\u0010'\u001a\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u000f\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b)J\b\u0010*\u001a\u00020\bH\u0016J\r\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0002\b+J\u0006\u0010,\u001a\u00020-J\u0010\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020\u0003J\r\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\b/J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\b0J\r\u0010\u001a\u001a\u00020\bH\u0007¢\u0006\u0002\b1J\r\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\b2J\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b3J\u0010\u00104\u001a\u0004\u0018\u00010\u00032\u0006\u00105\u001a\u00020\u0003J\u000e\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\bJ\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001eH\u0007¢\u0006\u0002\b8J\u0010\u00109\u001a\u0004\u0018\u00010\u00032\u0006\u00107\u001a\u00020\bJ\u0016\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\u0006\u00105\u001a\u00020\u0003J\r\u0010 \u001a\u00020\bH\u0007¢\u0006\u0002\b;J\u0006\u0010<\u001a\u00020\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u00002\u0006\u0010.\u001a\u00020\u0003J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b>J\b\u0010?\u001a\u00020\u0003H\u0016J\r\u0010@\u001a\u00020AH\u0007¢\u0006\u0002\bBJ\r\u0010C\u001a\u00020DH\u0007¢\u0006\u0002\b\rJ\b\u0010E\u001a\u0004\u0018\u00010\u0003J\r\u0010B\u001a\u00020AH\u0007¢\u0006\u0002\bFJ\r\u0010\r\u001a\u00020DH\u0007¢\u0006\u0002\bGJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\bHR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\n8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0016\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0015\u0010\f\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0010R\u0013\u0010\u0006\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0019R\u0013\u0010\u0005\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014R\u0011\u0010\u001a\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0007\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0018\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001fR\u0011\u0010 \u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b \u0010\u001bR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010¨\u0006K"}, d2 = {"Lokhttp3/HttpUrl;", "", "scheme", "", "username", "password", "host", "port", "", "pathSegments", "", "queryNamesAndValues", "fragment", ContextActionHandler.Link.URL, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "encodedFragment", "()Ljava/lang/String;", "encodedPassword", "encodedPath", "encodedPathSegments", "()Ljava/util/List;", "encodedQuery", "encodedUsername", "isHttps", "", "()Z", "pathSize", "()I", "query", "queryParameterNames", "", "()Ljava/util/Set;", "querySize", "-deprecated_encodedFragment", "-deprecated_encodedPassword", "-deprecated_encodedPath", "-deprecated_encodedPathSegments", "-deprecated_encodedQuery", "-deprecated_encodedUsername", "equals", PluralsKeys.OTHER, "-deprecated_fragment", "hashCode", "-deprecated_host", "newBuilder", "Lokhttp3/HttpUrl$Builder;", "link", "-deprecated_password", "-deprecated_pathSegments", "-deprecated_pathSize", "-deprecated_port", "-deprecated_query", "queryParameter", "name", "queryParameterName", "index", "-deprecated_queryParameterNames", "queryParameterValue", "queryParameterValues", "-deprecated_querySize", "redact", "resolve", "-deprecated_scheme", "toString", "toUri", "Ljava/net/URI;", TooltipAttribute.PARAM_DEEP_LINK, "toUrl", "Ljava/net/URL;", "topPrivateDomain", "-deprecated_uri", "-deprecated_url", "-deprecated_username", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HttpUrl {

    @k
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";

    @k
    public static final String FRAGMENT_ENCODE_SET = "";

    @k
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";

    @k
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    @k
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";

    @k
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";

    @k
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";

    @k
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";

    @k
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";

    @k
    public static final String QUERY_ENCODE_SET = " \"'<>#";

    @k
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    @l
    private final String fragment;

    @k
    private final String host;
    private final boolean isHttps;

    @k
    private final String password;

    @k
    private final List<String> pathSegments;
    private final int port;

    @l
    private final List<String> queryNamesAndValues;

    @k
    private final String scheme;

    @k
    private final String url;

    @k
    private final String username;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* compiled from: HttpUrl.kt */
    @s0
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010!\n\u0002\b\u000b\u0018\u0000 e2\u00020\u0001:\u0001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006J\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0006J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0006J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0006J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0006J\u001d\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u000eJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0006J\u0017\u0010\u001d\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u0006J\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\u0006J\u001f\u0010!\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b%\u0010\"J\u001f\u0010&\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b&\u0010\"J\u001f\u0010'\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b'\u0010\"J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b(\u0010\u0006J\u0015\u0010)\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b)\u0010\u0006J\u0017\u0010*\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b*\u0010\u0006J\u0017\u0010+\u001a\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b+\u0010\u0006J\u000f\u0010.\u001a\u00020\u0000H\u0000¢\u0006\u0004\b,\u0010-J\r\u00100\u001a\u00020/¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u00103J!\u00108\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u00010/2\u0006\u00105\u001a\u00020\u0004H\u0000¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u00020\fH\u0002¢\u0006\u0004\b9\u0010:J\u001f\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b\u0012\u0010=J\u0017\u0010@\u001a\u00020?2\u0006\u0010>\u001a\u00020\u0004H\u0002¢\u0006\u0004\b@\u0010AJ'\u0010D\u001a\u00020?2\u0006\u00105\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\f2\u0006\u0010C\u001a\u00020\fH\u0002¢\u0006\u0004\bD\u0010EJ7\u0010H\u001a\u00020?2\u0006\u00105\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\f2\u0006\u0010C\u001a\u00020\f2\u0006\u0010G\u001a\u00020;2\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020;2\u0006\u00105\u001a\u00020\u0004H\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020;2\u0006\u00105\u001a\u00020\u0004H\u0002¢\u0006\u0004\bL\u0010KJ\u000f\u0010M\u001a\u00020?H\u0002¢\u0006\u0004\bM\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010N\u001a\u0004\bO\u00103\"\u0004\bP\u0010AR\"\u0010\b\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010N\u001a\u0004\bQ\u00103\"\u0004\bR\u0010AR\"\u0010\n\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010N\u001a\u0004\bS\u00103\"\u0004\bT\u0010AR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010N\u001a\u0004\bU\u00103\"\u0004\bV\u0010AR\"\u0010\r\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010W\u001a\u0004\bX\u0010:\"\u0004\bY\u0010ZR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040[8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\\\u001a\u0004\b]\u0010^R,\u0010_\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010[8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b_\u0010\\\u001a\u0004\b`\u0010^\"\u0004\ba\u0010bR$\u0010+\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010N\u001a\u0004\bc\u00103\"\u0004\bd\u0010A¨\u0006f"}, d2 = {"Lokhttp3/HttpUrl$Builder;", "", "<init>", "()V", "", "scheme", "(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "username", "encodedUsername", "password", "encodedPassword", "host", "", "port", "(I)Lokhttp3/HttpUrl$Builder;", "pathSegment", "addPathSegment", "pathSegments", "addPathSegments", "encodedPathSegment", "addEncodedPathSegment", "encodedPathSegments", "addEncodedPathSegments", "index", "setPathSegment", "(ILjava/lang/String;)Lokhttp3/HttpUrl$Builder;", "setEncodedPathSegment", "removePathSegment", "encodedPath", "query", "encodedQuery", "name", "value", "addQueryParameter", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "encodedName", "encodedValue", "addEncodedQueryParameter", "setQueryParameter", "setEncodedQueryParameter", "removeAllQueryParameters", "removeAllEncodedQueryParameters", "fragment", "encodedFragment", "reencodeForUri$okhttp", "()Lokhttp3/HttpUrl$Builder;", "reencodeForUri", "Lokhttp3/HttpUrl;", "build", "()Lokhttp3/HttpUrl;", "toString", "()Ljava/lang/String;", "base", "input", "parse$okhttp", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "parse", "effectivePort", "()I", "", "alreadyEncoded", "(Ljava/lang/String;Z)Lokhttp3/HttpUrl$Builder;", "canonicalName", "Lkotlin/G0;", "removeAllCanonicalQueryParameters", "(Ljava/lang/String;)V", "startPos", "limit", "resolvePath", "(Ljava/lang/String;II)V", "pos", "addTrailingSlash", "push", "(Ljava/lang/String;IIZZ)V", "isDot", "(Ljava/lang/String;)Z", "isDotDot", "pop", "Ljava/lang/String;", "getScheme$okhttp", "setScheme$okhttp", "getEncodedUsername$okhttp", "setEncodedUsername$okhttp", "getEncodedPassword$okhttp", "setEncodedPassword$okhttp", "getHost$okhttp", "setHost$okhttp", "I", "getPort$okhttp", "setPort$okhttp", "(I)V", "", "Ljava/util/List;", "getEncodedPathSegments$okhttp", "()Ljava/util/List;", "encodedQueryNamesAndValues", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "getEncodedFragment$okhttp", "setEncodedFragment$okhttp", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        @k
        public static final String INVALID_HOST = "Invalid URL host";

        @l
        private String encodedFragment;

        @k
        private final List<String> encodedPathSegments;

        @l
        private List<String> encodedQueryNamesAndValues;

        @l
        private String host;

        @l
        private String scheme;

        @k
        private String encodedUsername = "";

        @k
        private String encodedPassword = "";
        private int port = -1;

        /* compiled from: HttpUrl.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J \u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u001c\u0010\f\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/HttpUrl$Builder$Companion;", "", "()V", "INVALID_HOST", "", "parsePort", "", "input", "pos", "limit", "portColonOffset", "schemeDelimiterOffset", "slashCount", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int parsePort(String input, int pos, int limit) throws NumberFormatException {
                try {
                    int i12 = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, input, pos, limit, "", false, false, false, false, null, 248, null));
                    if (1 > i12 || i12 >= 65536) {
                        return -1;
                    }
                    return i12;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int portColonOffset(String input, int pos, int limit) {
                while (pos < limit) {
                    char cCharAt = input.charAt(pos);
                    if (cCharAt == '[') {
                        do {
                            pos++;
                            if (pos < limit) {
                            }
                        } while (input.charAt(pos) != ']');
                    } else if (cCharAt == ':') {
                        return pos;
                    }
                    pos++;
                }
                return limit;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int schemeDelimiterOffset(String input, int pos, int limit) {
                if (limit - pos < 2) {
                    return -1;
                }
                char cCharAt = input.charAt(pos);
                if ((L.g(cCharAt, 97) < 0 || L.g(cCharAt, 122) > 0) && (L.g(cCharAt, 65) < 0 || L.g(cCharAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    pos++;
                    if (pos >= limit) {
                        return -1;
                    }
                    char cCharAt2 = input.charAt(pos);
                    if ('a' > cCharAt2 || cCharAt2 >= '{') {
                        if ('A' > cCharAt2 || cCharAt2 >= '[') {
                            if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return pos;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int slashCount(String str, int i12, int i13) {
                int i14 = 0;
                while (i12 < i13) {
                    char cCharAt = str.charAt(i12);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i14++;
                    i12++;
                }
                return i14;
            }

            private Companion() {
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private final int effectivePort() {
            int i12 = this.port;
            return i12 != -1 ? i12 : HttpUrl.INSTANCE.defaultPort(this.scheme);
        }

        private final boolean isDot(String input) {
            return L.f(input, ".") || C43066x.C(input, "%2e", true);
        }

        private final boolean isDotDot(String input) {
            return L.f(input, "..") || C43066x.C(input, "%2e.", true) || C43066x.C(input, ".%2e", true) || C43066x.C(input, "%2e%2e", true);
        }

        private final void pop() {
            if (this.encodedPathSegments.remove(r0.size() - 1).length() != 0 || this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            } else {
                this.encodedPathSegments.set(r0.size() - 1, "");
            }
        }

        private final void push(String input, int pos, int limit, boolean addTrailingSlash, boolean alreadyEncoded) {
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, input, pos, limit, HttpUrl.PATH_SEGMENT_ENCODE_SET, alreadyEncoded, false, false, false, null, 240, null);
            if (isDot(strCanonicalize$okhttp$default)) {
                return;
            }
            if (isDotDot(strCanonicalize$okhttp$default)) {
                pop();
                return;
            }
            if (((CharSequence) m.h(1, this.encodedPathSegments)).length() == 0) {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, strCanonicalize$okhttp$default);
            } else {
                this.encodedPathSegments.add(strCanonicalize$okhttp$default);
            }
            if (addTrailingSlash) {
                this.encodedPathSegments.add("");
            }
        }

        private final void removeAllCanonicalQueryParameters(String canonicalName) {
            int size = this.encodedQueryNamesAndValues.size() - 2;
            int iA2 = n.a(size, 0, -2);
            if (iA2 > size) {
                return;
            }
            while (true) {
                if (L.f(canonicalName, this.encodedQueryNamesAndValues.get(size))) {
                    this.encodedQueryNamesAndValues.remove(size + 1);
                    this.encodedQueryNamesAndValues.remove(size);
                    if (this.encodedQueryNamesAndValues.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size == iA2) {
                    return;
                } else {
                    size -= 2;
                }
            }
        }

        private final void resolvePath(String input, int startPos, int limit) {
            if (startPos == limit) {
                return;
            }
            char cCharAt = input.charAt(startPos);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                startPos++;
            } else {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i12 = startPos;
                while (i12 < limit) {
                    startPos = Util.delimiterOffset(input, "/\\", i12, limit);
                    boolean z12 = startPos < limit;
                    push(input, i12, startPos, z12, true);
                    if (z12) {
                        i12 = startPos + 1;
                    }
                }
                return;
            }
        }

        @k
        public final Builder addEncodedPathSegment(@k String encodedPathSegment) {
            push(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        @k
        public final Builder addEncodedPathSegments(@k String encodedPathSegments) {
            return addPathSegments(encodedPathSegments, true);
        }

        @k
        public final Builder addEncodedQueryParameter(@k String encodedName, @l String encodedValue) {
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            Companion companion = HttpUrl.INSTANCE;
            list.add(Companion.canonicalize$okhttp$default(companion, encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            this.encodedQueryNamesAndValues.add(encodedValue != null ? Companion.canonicalize$okhttp$default(companion, encodedValue, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null) : null);
            return this;
        }

        @k
        public final Builder addPathSegment(@k String pathSegment) {
            push(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        @k
        public final Builder addPathSegments(@k String pathSegments) {
            return addPathSegments(pathSegments, false);
        }

        @k
        public final Builder addQueryParameter(@k String name, @l String value) {
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            Companion companion = HttpUrl.INSTANCE;
            list.add(Companion.canonicalize$okhttp$default(companion, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            this.encodedQueryNamesAndValues.add(value != null ? Companion.canonicalize$okhttp$default(companion, value, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null) : null);
            return this;
        }

        @k
        public final HttpUrl build() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            Companion companion = HttpUrl.INSTANCE;
            String strPercentDecode$okhttp$default = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, null);
            String strPercentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iEffectivePort = effectivePort();
            List<String> list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                List<String> list3 = list2;
                arrayList = new ArrayList(C42745f0.q(list3, 10));
                for (String str3 : list3) {
                    arrayList.add(str3 != null ? Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, str3, 0, 0, true, 3, null) : null);
                }
            } else {
                arrayList = null;
            }
            String str4 = this.encodedFragment;
            return new HttpUrl(str, strPercentDecode$okhttp$default, strPercentDecode$okhttp$default2, str2, iEffectivePort, arrayList2, arrayList, str4 != null ? Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, str4, 0, 0, false, 7, null) : null, toString());
        }

        @k
        public final Builder encodedFragment(@l String encodedFragment) {
            this.encodedFragment = encodedFragment != null ? Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedFragment, 0, 0, "", true, false, false, true, null, 179, null) : null;
            return this;
        }

        @k
        public final Builder encodedPassword(@k String encodedPassword) {
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedPassword, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        @k
        public final Builder encodedPath(@k String encodedPath) {
            if (!C43066x.h0(encodedPath, "/", false)) {
                throw new IllegalArgumentException("unexpected encodedPath: ".concat(encodedPath).toString());
            }
            resolvePath(encodedPath, 0, encodedPath.length());
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
        @Y61.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okhttp3.HttpUrl.Builder encodedQuery(@Y61.l java.lang.String r14) {
            /*
                r13 = this;
                if (r14 == 0) goto L1d
                okhttp3.HttpUrl$Companion r12 = okhttp3.HttpUrl.INSTANCE
                r10 = 211(0xd3, float:2.96E-43)
                r11 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = " \"'<>#"
                r5 = 1
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 0
                r0 = r12
                r1 = r14
                java.lang.String r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r14 == 0) goto L1d
                java.util.List r14 = r12.toQueryNamesAndValues$okhttp(r14)
                goto L1e
            L1d:
                r14 = 0
            L1e:
                r13.encodedQueryNamesAndValues = r14
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.encodedQuery(java.lang.String):okhttp3.HttpUrl$Builder");
        }

        @k
        public final Builder encodedUsername(@k String encodedUsername) {
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedUsername, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        @k
        public final Builder fragment(@l String fragment) {
            this.encodedFragment = fragment != null ? Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, fragment, 0, 0, "", false, false, false, true, null, 187, null) : null;
            return this;
        }

        @l
        /* renamed from: getEncodedFragment$okhttp, reason: from getter */
        public final String getEncodedFragment() {
            return this.encodedFragment;
        }

        @k
        /* renamed from: getEncodedPassword$okhttp, reason: from getter */
        public final String getEncodedPassword() {
            return this.encodedPassword;
        }

        @k
        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        @l
        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        @k
        /* renamed from: getEncodedUsername$okhttp, reason: from getter */
        public final String getEncodedUsername() {
            return this.encodedUsername;
        }

        @l
        /* renamed from: getHost$okhttp, reason: from getter */
        public final String getHost() {
            return this.host;
        }

        /* renamed from: getPort$okhttp, reason: from getter */
        public final int getPort() {
            return this.port;
        }

        @l
        /* renamed from: getScheme$okhttp, reason: from getter */
        public final String getScheme() {
            return this.scheme;
        }

        @k
        public final Builder host(@k String host) {
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, host, 0, 0, false, 7, null));
            if (canonicalHost == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(host));
            }
            this.host = canonicalHost;
            return this;
        }

        @k
        public final Builder parse$okhttp(@l HttpUrl base, @k String input) throws NumberFormatException {
            int iDelimiterOffset;
            int i12;
            int i13;
            int i14;
            String strConcat = input;
            int iIndexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(strConcat, 0, 0, 3, null);
            int iIndexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(strConcat, iIndexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = INSTANCE;
            int iSchemeDelimiterOffset = companion.schemeDelimiterOffset(strConcat, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            char c12 = 65535;
            if (iSchemeDelimiterOffset != -1) {
                if (C43066x.g0(iIndexOfFirstNonAsciiWhitespace$default, strConcat, "https:", true)) {
                    this.scheme = Constants.SCHEME;
                    iIndexOfFirstNonAsciiWhitespace$default += 6;
                } else {
                    if (!C43066x.g0(iIndexOfFirstNonAsciiWhitespace$default, strConcat, "http:", true)) {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + strConcat.substring(0, iSchemeDelimiterOffset) + '\'');
                    }
                    this.scheme = "http";
                    iIndexOfFirstNonAsciiWhitespace$default += 5;
                }
            } else {
                if (base == null) {
                    if (input.length() > 6) {
                        strConcat = C43066x.t0(6, strConcat).concat("...");
                    }
                    throw new IllegalArgumentException(G.f("Expected URL scheme 'http' or 'https' but no scheme was found for ", strConcat));
                }
                this.scheme = base.scheme();
            }
            int iSlashCount = companion.slashCount(strConcat, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            char c13 = '?';
            char c14 = '#';
            if (iSlashCount >= 2 || base == null || !L.f(base.scheme(), this.scheme)) {
                boolean z12 = false;
                boolean z13 = false;
                int i15 = iIndexOfFirstNonAsciiWhitespace$default + iSlashCount;
                while (true) {
                    iDelimiterOffset = Util.delimiterOffset(strConcat, "@/\\?#", i15, iIndexOfLastNonAsciiWhitespace$default);
                    char cCharAt = iDelimiterOffset != iIndexOfLastNonAsciiWhitespace$default ? strConcat.charAt(iDelimiterOffset) : c12;
                    if (cCharAt == c12 || cCharAt == c14 || cCharAt == '/' || cCharAt == '\\' || cCharAt == c13) {
                        break;
                    }
                    if (cCharAt == '@') {
                        if (z12) {
                            i13 = iIndexOfLastNonAsciiWhitespace$default;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.encodedPassword);
                            sb2.append("%40");
                            i14 = iDelimiterOffset;
                            sb2.append(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, input, i15, iDelimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.encodedPassword = sb2.toString();
                        } else {
                            int iDelimiterOffset2 = Util.delimiterOffset(strConcat, ':', i15, iDelimiterOffset);
                            Companion companion2 = HttpUrl.INSTANCE;
                            i13 = iIndexOfLastNonAsciiWhitespace$default;
                            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion2, input, i15, iDelimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z13) {
                                strCanonicalize$okhttp$default = G.g(new StringBuilder(), this.encodedUsername, "%40", strCanonicalize$okhttp$default);
                            }
                            this.encodedUsername = strCanonicalize$okhttp$default;
                            i14 = iDelimiterOffset;
                            if (iDelimiterOffset2 != i14) {
                                this.encodedPassword = Companion.canonicalize$okhttp$default(companion2, input, iDelimiterOffset2 + 1, i14, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z12 = true;
                            }
                            z13 = true;
                        }
                        i15 = i14 + 1;
                        iIndexOfLastNonAsciiWhitespace$default = i13;
                        c14 = '#';
                        c13 = '?';
                        c12 = 65535;
                    }
                }
                i12 = iIndexOfLastNonAsciiWhitespace$default;
                Companion companion3 = INSTANCE;
                int iPortColonOffset = companion3.portColonOffset(strConcat, i15, iDelimiterOffset);
                int i16 = iPortColonOffset + 1;
                if (i16 < iDelimiterOffset) {
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, input, i15, iPortColonOffset, false, 4, null));
                    int port = companion3.parsePort(strConcat, i16, iDelimiterOffset);
                    this.port = port;
                    if (port == -1) {
                        throw new IllegalArgumentException(("Invalid URL port: \"" + strConcat.substring(i16, iDelimiterOffset) + '\"').toString());
                    }
                } else {
                    Companion companion4 = HttpUrl.INSTANCE;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, input, i15, iPortColonOffset, false, 4, null));
                    this.port = companion4.defaultPort(this.scheme);
                }
                if (this.host == null) {
                    throw new IllegalArgumentException(("Invalid URL host: \"" + strConcat.substring(i15, iPortColonOffset) + '\"').toString());
                }
                iIndexOfFirstNonAsciiWhitespace$default = iDelimiterOffset;
            } else {
                this.encodedUsername = base.encodedUsername();
                this.encodedPassword = base.encodedPassword();
                this.host = base.host();
                this.port = base.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(base.encodedPathSegments());
                if (iIndexOfFirstNonAsciiWhitespace$default == iIndexOfLastNonAsciiWhitespace$default || strConcat.charAt(iIndexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(base.encodedQuery());
                }
                i12 = iIndexOfLastNonAsciiWhitespace$default;
            }
            int i17 = i12;
            int iDelimiterOffset3 = Util.delimiterOffset(strConcat, "?#", iIndexOfFirstNonAsciiWhitespace$default, i17);
            resolvePath(strConcat, iIndexOfFirstNonAsciiWhitespace$default, iDelimiterOffset3);
            if (iDelimiterOffset3 < i17 && strConcat.charAt(iDelimiterOffset3) == '?') {
                int iDelimiterOffset4 = Util.delimiterOffset(strConcat, '#', iDelimiterOffset3, i17);
                Companion companion5 = HttpUrl.INSTANCE;
                this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, input, iDelimiterOffset3 + 1, iDelimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, JfifUtil.MARKER_RST0, null));
                iDelimiterOffset3 = iDelimiterOffset4;
            }
            if (iDelimiterOffset3 < i17 && strConcat.charAt(iDelimiterOffset3) == '#') {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, input, 1 + iDelimiterOffset3, i17, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        @k
        public final Builder password(@k String password) {
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        @k
        public final Builder port(int port) {
            if (1 > port || port >= 65536) {
                throw new IllegalArgumentException(c.g(port, "unexpected port: ").toString());
            }
            this.port = port;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
        @Y61.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okhttp3.HttpUrl.Builder query(@Y61.l java.lang.String r14) {
            /*
                r13 = this;
                if (r14 == 0) goto L1d
                okhttp3.HttpUrl$Companion r12 = okhttp3.HttpUrl.INSTANCE
                r10 = 219(0xdb, float:3.07E-43)
                r11 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = " \"'<>#"
                r5 = 0
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 0
                r0 = r12
                r1 = r14
                java.lang.String r14 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r14 == 0) goto L1d
                java.util.List r14 = r12.toQueryNamesAndValues$okhttp(r14)
                goto L1e
            L1d:
                r14 = 0
            L1e:
                r13.encodedQueryNamesAndValues = r14
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.query(java.lang.String):okhttp3.HttpUrl$Builder");
        }

        @k
        public final Builder reencodeForUri$okhttp() {
            String str = this.host;
            this.host = str != null ? H.k("[\"<>^`{|}]", str, "") : null;
            int size = this.encodedPathSegments.size();
            for (int i12 = 0; i12 < size; i12++) {
                List<String> list = this.encodedPathSegments;
                list.set(i12, Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, list.get(i12), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    String str2 = list2.get(i13);
                    list2.set(i13, str2 != null ? Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.encodedFragment;
            this.encodedFragment = str3 != null ? Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, str3, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, 163, null) : null;
            return this;
        }

        @k
        public final Builder removeAllEncodedQueryParameters(@k String encodedName) {
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            return this;
        }

        @k
        public final Builder removeAllQueryParameters(@k String name) {
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            return this;
        }

        @k
        public final Builder removePathSegment(int index) {
            this.encodedPathSegments.remove(index);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        @k
        public final Builder scheme(@k String scheme) {
            if (scheme.equalsIgnoreCase("http")) {
                this.scheme = "http";
            } else {
                if (!scheme.equalsIgnoreCase(Constants.SCHEME)) {
                    throw new IllegalArgumentException("unexpected scheme: ".concat(scheme));
                }
                this.scheme = Constants.SCHEME;
            }
            return this;
        }

        public final void setEncodedFragment$okhttp(@l String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(@k String str) {
            this.encodedPassword = str;
        }

        @k
        public final Builder setEncodedPathSegment(int index, @k String encodedPathSegment) {
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedPathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, 243, null);
            this.encodedPathSegments.set(index, strCanonicalize$okhttp$default);
            if (isDot(strCanonicalize$okhttp$default) || isDotDot(strCanonicalize$okhttp$default)) {
                throw new IllegalArgumentException("unexpected path segment: ".concat(encodedPathSegment).toString());
            }
            return this;
        }

        public final void setEncodedQueryNamesAndValues$okhttp(@l List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        @k
        public final Builder setEncodedQueryParameter(@k String encodedName, @l String encodedValue) {
            removeAllEncodedQueryParameters(encodedName);
            addEncodedQueryParameter(encodedName, encodedValue);
            return this;
        }

        public final void setEncodedUsername$okhttp(@k String str) {
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(@l String str) {
            this.host = str;
        }

        @k
        public final Builder setPathSegment(int index, @k String pathSegment) {
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, pathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, null, 251, null);
            if (isDot(strCanonicalize$okhttp$default) || isDotDot(strCanonicalize$okhttp$default)) {
                throw new IllegalArgumentException("unexpected path segment: ".concat(pathSegment).toString());
            }
            this.encodedPathSegments.set(index, strCanonicalize$okhttp$default);
            return this;
        }

        public final void setPort$okhttp(int i12) {
            this.port = i12;
        }

        @k
        public final Builder setQueryParameter(@k String name, @l String value) {
            removeAllQueryParameters(name);
            addQueryParameter(name, value);
            return this;
        }

        public final void setScheme$okhttp(@l String str) {
            this.scheme = str;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.scheme;
            if (str != null) {
                sb2.append(str);
                sb2.append("://");
            } else {
                sb2.append("//");
            }
            if (this.encodedUsername.length() > 0 || this.encodedPassword.length() > 0) {
                sb2.append(this.encodedUsername);
                if (this.encodedPassword.length() > 0) {
                    sb2.append(':');
                    sb2.append(this.encodedPassword);
                }
                sb2.append('@');
            }
            String str2 = this.host;
            if (str2 != null) {
                if (C43066x.r(str2, ':')) {
                    sb2.append('[');
                    sb2.append(this.host);
                    sb2.append(']');
                } else {
                    sb2.append(this.host);
                }
            }
            if (this.port != -1 || this.scheme != null) {
                int iEffectivePort = effectivePort();
                String str3 = this.scheme;
                if (str3 == null || iEffectivePort != HttpUrl.INSTANCE.defaultPort(str3)) {
                    sb2.append(':');
                    sb2.append(iEffectivePort);
                }
            }
            Companion companion = HttpUrl.INSTANCE;
            companion.toPathString$okhttp(this.encodedPathSegments, sb2);
            if (this.encodedQueryNamesAndValues != null) {
                sb2.append('?');
                companion.toQueryString$okhttp(this.encodedQueryNamesAndValues, sb2);
            }
            if (this.encodedFragment != null) {
                sb2.append('#');
                sb2.append(this.encodedFragment);
            }
            return sb2.toString();
        }

        @k
        public final Builder username(@k String username) {
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        private final Builder addPathSegments(String pathSegments, boolean alreadyEncoded) {
            int i12 = 0;
            do {
                int iDelimiterOffset = Util.delimiterOffset(pathSegments, "/\\", i12, pathSegments.length());
                push(pathSegments, i12, iDelimiterOffset, iDelimiterOffset < pathSegments.length(), alreadyEncoded);
                i12 = iDelimiterOffset + 1;
            } while (i12 <= pathSegments.length());
            return this;
        }
    }

    /* compiled from: HttpUrl.kt */
    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0019\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\n*\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J]\u0010\u0018\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010#\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00050\u001d2\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0000¢\u0006\u0004\b!\u0010\"J'\u0010%\u001a\u00020\f*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001d2\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0000¢\u0006\u0004\b$\u0010\"J\u001b\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050&*\u00020\u0005H\u0000¢\u0006\u0004\b'\u0010(J\u0013\u0010-\u001a\u00020**\u00020\u0005H\u0007¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u0004\u0018\u00010**\u00020\u0005H\u0007¢\u0006\u0004\b.\u0010,J\u0015\u0010/\u001a\u0004\u0018\u00010**\u000200H\u0007¢\u0006\u0004\b+\u00101J\u0015\u0010/\u001a\u0004\u0018\u00010**\u000202H\u0007¢\u0006\u0004\b+\u00103J\u0017\u0010+\u001a\u00020*2\u0006\u00104\u001a\u00020\u0005H\u0007¢\u0006\u0004\b5\u0010,J\u0019\u0010.\u001a\u0004\u0018\u00010*2\u0006\u00104\u001a\u00020\u0005H\u0007¢\u0006\u0004\b6\u0010,J\u0019\u0010+\u001a\u0004\u0018\u00010*2\u0006\u00104\u001a\u000200H\u0007¢\u0006\u0004\b5\u00101J\u0019\u0010+\u001a\u0004\u0018\u00010*2\u0006\u00107\u001a\u000202H\u0007¢\u0006\u0004\b5\u00103J1\u0010:\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b8\u00109Jc\u0010=\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b@\u0010?R\u0014\u0010A\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bA\u0010?R\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bE\u0010?R\u0014\u0010F\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bF\u0010?R\u0014\u0010G\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bG\u0010?R\u0014\u0010H\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bH\u0010?R\u0014\u0010I\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bI\u0010?R\u0014\u0010J\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bJ\u0010?R\u0014\u0010K\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bK\u0010?R\u0014\u0010L\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bL\u0010?¨\u0006M"}, d2 = {"Lokhttp3/HttpUrl$Companion;", "", "<init>", "()V", "Lokio/l;", "", "encoded", "", "pos", "limit", "", "plusIsSpace", "Lkotlin/G0;", "writePercentDecoded", "(Lokio/l;Ljava/lang/String;IIZ)V", "isPercentEncoded", "(Ljava/lang/String;II)Z", "input", "encodeSet", "alreadyEncoded", "strict", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", "writeCanonicalized", "(Lokio/l;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)V", "scheme", "defaultPort", "(Ljava/lang/String;)I", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "toPathString$okhttp", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "toPathString", "toQueryString$okhttp", "toQueryString", "", "toQueryNamesAndValues$okhttp", "(Ljava/lang/String;)Ljava/util/List;", "toQueryNamesAndValues", "Lokhttp3/HttpUrl;", "get", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "toHttpUrl", "parse", "toHttpUrlOrNull", "Ljava/net/URL;", "(Ljava/net/URL;)Lokhttp3/HttpUrl;", "Ljava/net/URI;", "(Ljava/net/URI;)Lokhttp3/HttpUrl;", ContextActionHandler.Link.URL, "-deprecated_get", "-deprecated_parse", TooltipAttribute.PARAM_DEEP_LINK, "percentDecode$okhttp", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "percentDecode", "canonicalize$okhttp", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "canonicalize", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "", "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i12, int i13, String str2, boolean z12, boolean z13, boolean z14, boolean z15, Charset charset, int i14, Object obj) {
            return companion.canonicalize$okhttp(str, (i14 & 1) != 0 ? 0 : i12, (i14 & 2) != 0 ? str.length() : i13, str2, (i14 & 8) != 0 ? false : z12, (i14 & 16) != 0 ? false : z13, (i14 & 32) != 0 ? false : z14, (i14 & 64) != 0 ? false : z15, (i14 & 128) != 0 ? null : charset);
        }

        private final boolean isPercentEncoded(String str, int i12, int i13) {
            int i14 = i12 + 2;
            return i14 < i13 && str.charAt(i12) == '%' && Util.parseHexDigit(str.charAt(i12 + 1)) != -1 && Util.parseHexDigit(str.charAt(i14)) != -1;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i12, int i13, boolean z12, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i12 = 0;
            }
            if ((i14 & 2) != 0) {
                i13 = str.length();
            }
            if ((i14 & 4) != 0) {
                z12 = false;
            }
            return companion.percentDecode$okhttp(str, i12, i13, z12);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0098 A[LOOP:1: B:50:0x0092->B:52:0x0098, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void writeCanonicalized(okio.C44802l r14, java.lang.String r15, int r16, int r17, java.lang.String r18, boolean r19, boolean r20, boolean r21, boolean r22, java.nio.charset.Charset r23) {
            /*
                r13 = this;
                r0 = r14
                r1 = r15
                r2 = r17
                r3 = r23
                r4 = 0
                r5 = r4
                r4 = r16
            La:
                if (r4 >= r2) goto Lc1
                int r6 = r15.codePointAt(r4)
                if (r19 == 0) goto L27
                r7 = 9
                if (r6 == r7) goto L22
                r7 = 10
                if (r6 == r7) goto L22
                r7 = 12
                if (r6 == r7) goto L22
                r7 = 13
                if (r6 != r7) goto L27
            L22:
                r7 = r13
                r9 = r18
                goto Lba
            L27:
                r7 = 43
                if (r6 != r7) goto L40
                if (r21 == 0) goto L40
                if (r19 == 0) goto L32
                java.lang.String r7 = "+"
                goto L34
            L32:
                java.lang.String r7 = "%2B"
            L34:
                r14.getClass()
                int r8 = r7.length()
                r9 = 0
                r14.N(r9, r8, r7)
                goto L22
            L40:
                r7 = 32
                r8 = 37
                if (r6 < r7) goto L51
                r7 = 127(0x7f, float:1.78E-43)
                if (r6 == r7) goto L51
                r7 = 128(0x80, float:1.8E-43)
                if (r6 < r7) goto L55
                if (r22 == 0) goto L51
                goto L55
            L51:
                r7 = r13
                r9 = r18
                goto L74
            L55:
                char r7 = (char) r6
                r9 = r18
                boolean r7 = kotlin.text.C43066x.r(r9, r7)
                if (r7 != 0) goto L6e
                if (r6 != r8) goto L6c
                if (r19 == 0) goto L6e
                if (r20 == 0) goto L6c
                r7 = r13
                boolean r10 = r13.isPercentEncoded(r15, r4, r2)
                if (r10 != 0) goto L70
                goto L74
            L6c:
                r7 = r13
                goto L70
            L6e:
                r7 = r13
                goto L74
            L70:
                r14.P(r6)
                goto Lba
            L74:
                if (r5 != 0) goto L7b
                okio.l r5 = new okio.l
                r5.<init>()
            L7b:
                if (r3 == 0) goto L8f
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = r3.equals(r10)
                if (r10 == 0) goto L86
                goto L8f
            L86:
                int r10 = java.lang.Character.charCount(r6)
                int r10 = r10 + r4
                r5.M(r15, r4, r10, r3)
                goto L92
            L8f:
                r5.P(r6)
            L92:
                boolean r10 = r5.W2()
                if (r10 != 0) goto Lba
                byte r10 = r5.readByte()
                r11 = r10 & 255(0xff, float:3.57E-43)
                r14.D(r8)
                char[] r12 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                int r11 = r11 >> 4
                r11 = r11 & 15
                char r11 = r12[r11]
                r14.D(r11)
                char[] r11 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                r10 = r10 & 15
                char r10 = r11[r10]
                r14.D(r10)
                goto L92
            Lba:
                int r6 = java.lang.Character.charCount(r6)
                int r4 = r4 + r6
                goto La
            Lc1:
                r7 = r13
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.writeCanonicalized(okio.l, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void writePercentDecoded(C44802l c44802l, String str, int i12, int i13, boolean z12) {
            int i14;
            while (i12 < i13) {
                int iCodePointAt = str.codePointAt(i12);
                if (iCodePointAt == 37 && (i14 = i12 + 2) < i13) {
                    int hexDigit = Util.parseHexDigit(str.charAt(i12 + 1));
                    int hexDigit2 = Util.parseHexDigit(str.charAt(i14));
                    if (hexDigit == -1 || hexDigit2 == -1) {
                        c44802l.P(iCodePointAt);
                        i12 += Character.charCount(iCodePointAt);
                    } else {
                        c44802l.D((hexDigit << 4) + hexDigit2);
                        i12 = Character.charCount(iCodePointAt) + i14;
                    }
                } else if (iCodePointAt == 43 && z12) {
                    c44802l.D(32);
                    i12++;
                } else {
                    c44802l.P(iCodePointAt);
                    i12 += Character.charCount(iCodePointAt);
                }
            }
        }

        @i
        @k
        @InterfaceC42830m
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m199deprecated_get(@k String url) {
            return get(url);
        }

        @l
        @i
        @InterfaceC42830m
        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final HttpUrl m202deprecated_parse(@k String url) {
            return parse(url);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
        @Y61.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String canonicalize$okhttp(@Y61.k java.lang.String r14, int r15, int r16, @Y61.k java.lang.String r17, boolean r18, boolean r19, boolean r20, boolean r21, @Y61.l java.nio.charset.Charset r22) {
            /*
                r13 = this;
                r2 = r14
                r4 = r16
                r3 = r15
            L4:
                if (r3 >= r4) goto L69
                int r0 = r14.codePointAt(r3)
                r1 = 32
                if (r0 < r1) goto L19
                r1 = 127(0x7f, float:1.78E-43)
                if (r0 == r1) goto L19
                r1 = 128(0x80, float:1.8E-43)
                if (r0 < r1) goto L1d
                if (r21 == 0) goto L19
                goto L1d
            L19:
                r11 = r13
                r5 = r17
                goto L47
            L1d:
                char r1 = (char) r0
                r5 = r17
                boolean r1 = kotlin.text.C43066x.r(r5, r1)
                if (r1 != 0) goto L38
                r1 = 37
                if (r0 != r1) goto L36
                if (r18 == 0) goto L38
                if (r19 == 0) goto L36
                r11 = r13
                boolean r1 = r13.isPercentEncoded(r14, r3, r4)
                if (r1 == 0) goto L47
                goto L3a
            L36:
                r11 = r13
                goto L3a
            L38:
                r11 = r13
                goto L47
            L3a:
                r1 = 43
                if (r0 != r1) goto L41
                if (r20 == 0) goto L41
                goto L47
            L41:
                int r0 = java.lang.Character.charCount(r0)
                int r3 = r3 + r0
                goto L4
            L47:
                okio.l r12 = new okio.l
                r12.<init>()
                r0 = r15
                r12.N(r15, r3, r14)
                r0 = r13
                r1 = r12
                r2 = r14
                r4 = r16
                r5 = r17
                r6 = r18
                r7 = r19
                r8 = r20
                r9 = r21
                r10 = r22
                r0.writeCanonicalized(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                java.lang.String r0 = r12.u()
                return r0
            L69:
                r11 = r13
                r0 = r15
                java.lang.String r0 = r14.substring(r15, r16)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.canonicalize$okhttp(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):java.lang.String");
        }

        @X41.n
        public final int defaultPort(@k String scheme) {
            if (scheme.equals("http")) {
                return 80;
            }
            return scheme.equals(Constants.SCHEME) ? 443 : -1;
        }

        @X41.n
        @i
        @k
        public final HttpUrl get(@k String str) {
            return new Builder().parse$okhttp(null, str).build();
        }

        @X41.n
        @l
        @i
        public final HttpUrl parse(@k String str) {
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @k
        public final String percentDecode$okhttp(@k String str, int i12, int i13, boolean z12) {
            for (int i14 = i12; i14 < i13; i14++) {
                char cCharAt = str.charAt(i14);
                if (cCharAt == '%' || (cCharAt == '+' && z12)) {
                    C44802l c44802l = new C44802l();
                    c44802l.N(i12, i14, str);
                    writePercentDecoded(c44802l, str, i14, i13, z12);
                    return c44802l.u();
                }
            }
            return str.substring(i12, i13);
        }

        public final void toPathString$okhttp(@k List<String> list, @k StringBuilder sb2) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                sb2.append('/');
                sb2.append(list.get(i12));
            }
        }

        @k
        public final List<String> toQueryNamesAndValues$okhttp(@k String str) {
            ArrayList arrayList = new ArrayList();
            int i12 = 0;
            while (i12 <= str.length()) {
                int iH2 = C43066x.H('&', i12, 4, str);
                if (iH2 == -1) {
                    iH2 = str.length();
                }
                int iH3 = C43066x.H('=', i12, 4, str);
                if (iH3 == -1 || iH3 > iH2) {
                    arrayList.add(str.substring(i12, iH2));
                    arrayList.add(null);
                } else {
                    arrayList.add(str.substring(i12, iH3));
                    arrayList.add(str.substring(iH3 + 1, iH2));
                }
                i12 = iH2 + 1;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(@k List<String> list, @k StringBuilder sb2) {
            j jVarP = s.p(s.r(0, list.size()), 2);
            int i12 = jVarP.f406905b;
            int i13 = jVarP.f406906c;
            int i14 = jVarP.f406907d;
            if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
                return;
            }
            while (true) {
                String str = list.get(i12);
                String str2 = list.get(i12 + 1);
                if (i12 > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (i12 == i13) {
                    return;
                } else {
                    i12 += i14;
                }
            }
        }

        private Companion() {
        }

        @l
        @i
        @InterfaceC42830m
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m201deprecated_get(@k URL url) {
            return get(url);
        }

        @X41.n
        @l
        @i
        public final HttpUrl get(@k URL url) {
            return parse(url.toString());
        }

        @l
        @i
        @InterfaceC42830m
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m200deprecated_get(@k URI uri) {
            return get(uri);
        }

        @X41.n
        @l
        @i
        public final HttpUrl get(@k URI uri) {
            return parse(uri.toString());
        }
    }

    public HttpUrl(@k String str, @k String str2, @k String str3, @k String str4, int i12, @k List<String> list, @l List<String> list2, @l String str5, @k String str6) {
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i12;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
        this.isHttps = L.f(str, Constants.SCHEME);
    }

    @X41.n
    public static final int defaultPort(@k String str) {
        return INSTANCE.defaultPort(str);
    }

    @X41.n
    @i
    @k
    public static final HttpUrl get(@k String str) {
        return INSTANCE.get(str);
    }

    @X41.n
    @l
    @i
    public static final HttpUrl parse(@k String str) {
        return INSTANCE.parse(str);
    }

    @l
    @i
    @InterfaceC42830m
    /* renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final String m180deprecated_encodedFragment() {
        return encodedFragment();
    }

    @i
    @k
    @InterfaceC42830m
    /* renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final String m181deprecated_encodedPassword() {
        return encodedPassword();
    }

    @i
    @k
    @InterfaceC42830m
    /* renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final String m182deprecated_encodedPath() {
        return encodedPath();
    }

    @i
    @k
    @InterfaceC42830m
    /* renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final List<String> m183deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    @l
    @i
    @InterfaceC42830m
    /* renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final String m184deprecated_encodedQuery() {
        return encodedQuery();
    }

    @i
    @k
    @InterfaceC42830m
    /* renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final String m185deprecated_encodedUsername() {
        return encodedUsername();
    }

    @l
    @i
    @InterfaceC42830m
    /* renamed from: -deprecated_fragment, reason: not valid java name and from getter */
    public final String getFragment() {
        return this.fragment;
    }

    @i
    @k
    @InterfaceC42830m
    /* renamed from: -deprecated_host, reason: not valid java name and from getter */
    public final String getHost() {
        return this.host;
    }

    @i
    @k
    @InterfaceC42830m
    /* renamed from: -deprecated_password, reason: not valid java name and from getter */
    public final String getPassword() {
        return this.password;
    }

    @i
    @k
    @InterfaceC42830m
    /* renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final List<String> m189deprecated_pathSegments() {
        return this.pathSegments;
    }

    @i
    @InterfaceC42830m
    /* renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m190deprecated_pathSize() {
        return pathSize();
    }

    @i
    @InterfaceC42830m
    /* renamed from: -deprecated_port, reason: not valid java name and from getter */
    public final int getPort() {
        return this.port;
    }

    @l
    @i
    @InterfaceC42830m
    /* renamed from: -deprecated_query, reason: not valid java name */
    public final String m192deprecated_query() {
        return query();
    }

    @i
    @k
    @InterfaceC42830m
    /* renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final Set<String> m193deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    @i
    @InterfaceC42830m
    /* renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m194deprecated_querySize() {
        return querySize();
    }

    @i
    @k
    @InterfaceC42830m
    /* renamed from: -deprecated_scheme, reason: not valid java name and from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @i
    @k
    @InterfaceC42830m
    /* renamed from: -deprecated_uri, reason: not valid java name */
    public final URI m196deprecated_uri() {
        return uri();
    }

    @i
    @k
    @InterfaceC42830m
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final URL m197deprecated_url() {
        return url();
    }

    @i
    @k
    @InterfaceC42830m
    /* renamed from: -deprecated_username, reason: not valid java name and from getter */
    public final String getUsername() {
        return this.username;
    }

    @l
    @i
    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        return this.url.substring(C43066x.H('#', 0, 6, this.url) + 1);
    }

    @i
    @k
    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        return this.url.substring(C43066x.H(':', this.scheme.length() + 3, 4, this.url) + 1, C43066x.H('@', 0, 6, this.url));
    }

    @i
    @k
    public final String encodedPath() {
        int iH2 = C43066x.H('/', this.scheme.length() + 3, 4, this.url);
        String str = this.url;
        return this.url.substring(iH2, Util.delimiterOffset(str, "?#", iH2, str.length()));
    }

    @i
    @k
    public final List<String> encodedPathSegments() {
        int iH2 = C43066x.H('/', this.scheme.length() + 3, 4, this.url);
        String str = this.url;
        int iDelimiterOffset = Util.delimiterOffset(str, "?#", iH2, str.length());
        ArrayList arrayList = new ArrayList();
        while (iH2 < iDelimiterOffset) {
            int i12 = iH2 + 1;
            int iDelimiterOffset2 = Util.delimiterOffset(this.url, '/', i12, iDelimiterOffset);
            arrayList.add(this.url.substring(i12, iDelimiterOffset2));
            iH2 = iDelimiterOffset2;
        }
        return arrayList;
    }

    @l
    @i
    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int iH2 = C43066x.H('?', 0, 6, this.url) + 1;
        String str = this.url;
        return this.url.substring(iH2, Util.delimiterOffset(str, '#', iH2, str.length()));
    }

    @i
    @k
    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        return this.url.substring(length, Util.delimiterOffset(str, ":@", length, str.length()));
    }

    public boolean equals(@l Object other) {
        return (other instanceof HttpUrl) && L.f(((HttpUrl) other).url, this.url);
    }

    @l
    @i
    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    @i
    @k
    public final String host() {
        return this.host;
    }

    /* renamed from: isHttps, reason: from getter */
    public final boolean getIsHttps() {
        return this.isHttps;
    }

    @k
    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != INSTANCE.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    @i
    @k
    public final String password() {
        return this.password;
    }

    @i
    @k
    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    @i
    public final int pathSize() {
        return this.pathSegments.size();
    }

    @i
    public final int port() {
        return this.port;
    }

    @l
    @i
    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        INSTANCE.toQueryString$okhttp(this.queryNamesAndValues, sb2);
        return sb2.toString();
    }

    @l
    public final String queryParameter(@k String name) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        j jVarP = s.p(s.r(0, list.size()), 2);
        int i12 = jVarP.f406905b;
        int i13 = jVarP.f406906c;
        int i14 = jVarP.f406907d;
        if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
            while (!name.equals(this.queryNamesAndValues.get(i12))) {
                if (i12 != i13) {
                    i12 += i14;
                }
            }
            return this.queryNamesAndValues.get(i12 + 1);
        }
        return null;
    }

    @k
    public final String queryParameterName(int index) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get(index * 2);
        }
        throw new IndexOutOfBoundsException();
    }

    @i
    @k
    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return B0.f406639b;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        j jVarP = s.p(s.r(0, this.queryNamesAndValues.size()), 2);
        int i12 = jVarP.f406905b;
        int i13 = jVarP.f406906c;
        int i14 = jVarP.f406907d;
        if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
            while (true) {
                linkedHashSet.add(this.queryNamesAndValues.get(i12));
                if (i12 == i13) {
                    break;
                }
                i12 += i14;
            }
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    @l
    public final String queryParameterValue(int index) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((index * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    @k
    public final List<String> queryParameterValues(@k String name) {
        if (this.queryNamesAndValues == null) {
            return C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        j jVarP = s.p(s.r(0, this.queryNamesAndValues.size()), 2);
        int i12 = jVarP.f406905b;
        int i13 = jVarP.f406906c;
        int i14 = jVarP.f406907d;
        if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
            while (true) {
                if (name.equals(this.queryNamesAndValues.get(i12))) {
                    arrayList.add(this.queryNamesAndValues.get(i12 + 1));
                }
                if (i12 == i13) {
                    break;
                }
                i12 += i14;
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    @i
    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    @k
    public final String redact() {
        return newBuilder("/...").username("").password("").build().getUrl();
    }

    @l
    public final HttpUrl resolve(@k String link) {
        Builder builderNewBuilder = newBuilder(link);
        if (builderNewBuilder != null) {
            return builderNewBuilder.build();
        }
        return null;
    }

    @i
    @k
    public final String scheme() {
        return this.scheme;
    }

    @k
    /* renamed from: toString, reason: from getter */
    public String getUrl() {
        return this.url;
    }

    @l
    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(this.host);
    }

    @i
    @k
    public final URI uri() {
        String string = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e12) {
            try {
                return URI.create(new C43059p("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").f(string, ""));
            } catch (Exception unused) {
                throw new RuntimeException(e12);
            }
        }
    }

    @i
    @k
    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e12) {
            throw new RuntimeException(e12);
        }
    }

    @i
    @k
    public final String username() {
        return this.username;
    }

    @X41.n
    @l
    @i
    public static final HttpUrl get(@k URI uri) {
        return INSTANCE.get(uri);
    }

    @X41.n
    @l
    @i
    public static final HttpUrl get(@k URL url) {
        return INSTANCE.get(url);
    }

    @l
    public final Builder newBuilder(@k String link) {
        try {
            return new Builder().parse$okhttp(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
