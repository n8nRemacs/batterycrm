package okhttp3.internal;

import X41.f;
import X41.i;
import Y61.k;
import Y61.l;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.compose.ui.platform.C22491k0;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.my.target.ads.a;
import com.yandex.mobile.ads.impl.T1;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.C42833p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.io.c;
import kotlin.jvm.internal.C42809i;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v0;
import kotlin.ranges.s;
import kotlin.text.C43047d;
import kotlin.text.C43059p;
import kotlin.text.C43066x;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;
import okhttp3.internal.io.FileSystem;
import okio.C44802l;
import okio.C44805o;
import okio.InterfaceC44803m;
import okio.InterfaceC44804n;
import okio.P;
import okio.c0;
import okio.e0;

/* compiled from: Util.kt */
@s0
@Metadata(d1 = {"\u0000Æ\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a%\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e*\b\u0012\u0004\u0012\u00020\u00070\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a7\u0010\u0014\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0018\u001a\u00020\u0007*\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019\u001a-\u0010\u001c\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u001a\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u001c\u0010\u001d\u001a%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a%\u0010\"\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010#\u001a%\u0010$\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b$\u0010#\u001a%\u0010%\u001a\u00020\u0007*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b%\u0010&\u001a-\u0010(\u001a\u00020\u001b*\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b(\u0010)\u001a-\u0010(\u001a\u00020\u001b*\u00020\u00072\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b(\u0010,\u001a\u0011\u0010-\u001a\u00020\u001b*\u00020\u0007¢\u0006\u0004\b-\u0010.\u001a\u0011\u0010/\u001a\u00020\t*\u00020\u0007¢\u0006\u0004\b/\u00100\u001a\u0015\u00101\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b1\u00100\u001a)\u00102\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00072\u0012\u00104\u001a\n\u0012\u0006\b\u0001\u0012\u0002030\u000e\"\u000203¢\u0006\u0004\b2\u00105\u001a\u0019\u00109\u001a\u000207*\u0002062\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:\u001a'\u0010>\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u00002\b\u0010=\u001a\u0004\u0018\u00010<¢\u0006\u0004\b>\u0010?\u001a\u0011\u0010@\u001a\u00020\u001b*\u00020*¢\u0006\u0004\b@\u0010A\u001a\u0017\u0010E\u001a\u00020D*\b\u0012\u0004\u0012\u00020C0B¢\u0006\u0004\bE\u0010F\u001a\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020C0B*\u00020D¢\u0006\u0004\bG\u0010H\u001a\u0019\u0010I\u001a\u00020\t*\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0016¢\u0006\u0004\bI\u0010J\u001a\u0011\u0010M\u001a\u00020L*\u00020K¢\u0006\u0004\bM\u0010N\u001a\u001c\u0010Q\u001a\u00020\u001b*\u00020O2\u0006\u0010P\u001a\u00020\u001bH\u0086\u0004¢\u0006\u0004\bQ\u0010R\u001a\u001c\u0010Q\u001a\u00020\u001b*\u00020S2\u0006\u0010P\u001a\u00020\u001bH\u0086\u0004¢\u0006\u0004\bQ\u0010T\u001a\u001c\u0010Q\u001a\u00020\u0000*\u00020\u001b2\u0006\u0010P\u001a\u00020\u0000H\u0086\u0004¢\u0006\u0004\bQ\u0010U\u001a\u0019\u0010X\u001a\u00020\u0004*\u00020V2\u0006\u0010W\u001a\u00020\u001b¢\u0006\u0004\bX\u0010Y\u001a\u0011\u0010Z\u001a\u00020\u001b*\u000206¢\u0006\u0004\bZ\u0010[\u001a!\u0010^\u001a\u00020\t*\u00020\\2\u0006\u0010;\u001a\u00020\u001b2\u0006\u0010]\u001a\u00020<¢\u0006\u0004\b^\u0010_\u001a!\u0010a\u001a\u00020\t*\u00020\\2\u0006\u0010`\u001a\u00020\u001b2\u0006\u0010]\u001a\u00020<¢\u0006\u0004\ba\u0010_\u001a\u0011\u0010c\u001a\u00020\u0007*\u00020b¢\u0006\u0004\bc\u0010d\u001a\u0019\u0010f\u001a\u00020\t*\u00020b2\u0006\u0010e\u001a\u000206¢\u0006\u0004\bf\u0010g\u001a!\u0010j\u001a\u00020\u00042\f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00040hH\u0086\bø\u0001\u0000¢\u0006\u0004\bj\u0010k\u001a)\u0010l\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00040hH\u0086\bø\u0001\u0000¢\u0006\u0004\bl\u0010m\u001a\u0019\u0010^\u001a\u00020\u001b*\u00020n2\u0006\u0010o\u001a\u00020O¢\u0006\u0004\b^\u0010p\u001a\u001b\u0010q\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b¢\u0006\u0004\bq\u0010r\u001a\u0011\u0010t\u001a\u00020\u0000*\u00020s¢\u0006\u0004\bt\u0010u\u001a\u0019\u0010w\u001a\u00020\u0000*\u00020\u00072\u0006\u0010v\u001a\u00020\u0000¢\u0006\u0004\bw\u0010x\u001a\u001b\u0010y\u001a\u00020\u001b*\u0004\u0018\u00010\u00072\u0006\u0010v\u001a\u00020\u001b¢\u0006\u0004\by\u0010r\u001a#\u0010{\u001a\b\u0012\u0004\u0012\u00028\u00000B\"\u0004\b\u0000\u0010z*\b\u0012\u0004\u0012\u00028\u00000B¢\u0006\u0004\b{\u0010|\u001a/\u0010~\u001a\b\u0012\u0004\u0012\u00028\u00000B\"\u0004\b\u0000\u0010z2\u0012\u0010}\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000e\"\u00028\u0000H\u0007¢\u0006\u0004\b~\u0010\u007f\u001a<\u0010\u0083\u0001\u001a\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0082\u0001\"\u0005\b\u0000\u0010\u0080\u0001\"\u0005\b\u0001\u0010\u0081\u0001*\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0082\u0001¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0015\u0010\u0086\u0001\u001a\u00020\u0004*\u00030\u0085\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0014\u0010\u0086\u0001\u001a\u00020\u0004*\u00020b¢\u0006\u0006\b\u0086\u0001\u0010\u0088\u0001\u001a\u0015\u0010\u0086\u0001\u001a\u00020\u0004*\u00030\u0089\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u008a\u0001\u001a\u001f\u0010\u008e\u0001\u001a\u00020\t*\u00030\u008b\u00012\b\u0010\u008d\u0001\u001a\u00030\u008c\u0001¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0014\u0010\u0090\u0001\u001a\u00020\u0007*\u00020\u0000¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0014\u0010\u0090\u0001\u001a\u00020\u0007*\u00020\u001b¢\u0006\u0006\b\u0090\u0001\u0010\u0092\u0001\u001a\u0017\u0010\u0093\u0001\u001a\u00020\u0004*\u000203H\u0086\b¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0017\u0010\u0095\u0001\u001a\u00020\u0004*\u000203H\u0086\b¢\u0006\u0006\b\u0095\u0001\u0010\u0094\u0001\u001a\u0017\u0010\u0096\u0001\u001a\u00020\u0004*\u000203H\u0086\b¢\u0006\u0006\b\u0096\u0001\u0010\u0094\u0001\u001a:\u0010\u009b\u0001\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010z2\u0007\u0010\u0097\u0001\u001a\u0002032\u000e\u0010\u0099\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0098\u00012\u0007\u0010\u009a\u0001\u001a\u00020\u0007¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a-\u0010 \u0001\u001a\u00020\u0004\"\u0005\b\u0000\u0010\u009d\u0001*\t\u0012\u0004\u0012\u00028\u00000\u009e\u00012\u0007\u0010\u009f\u0001\u001a\u00028\u0000H\u0000¢\u0006\u0006\b \u0001\u0010¡\u0001\u001a\u0017\u0010¢\u0001\u001a\u00020\u0004*\u000203H\u0080\b¢\u0006\u0006\b¢\u0001\u0010\u0094\u0001\u001a\u0017\u0010£\u0001\u001a\u00020\u0004*\u000203H\u0080\b¢\u0006\u0006\b£\u0001\u0010\u0094\u0001\u001a0\u0010¨\u0001\u001a\u00030§\u0001*\b0¤\u0001j\u0003`¥\u00012\u0013\u0010¦\u0001\u001a\u000e\u0012\n\u0012\b0¤\u0001j\u0003`¥\u00010B¢\u0006\u0006\b¨\u0001\u0010©\u0001\u001aI\u0010®\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000B\"\u0004\b\u0000\u0010z*\t\u0012\u0004\u0012\u00028\u00000ª\u00012\u001a\u0010\u00ad\u0001\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0«\u0001¢\u0006\u0003\b¬\u0001H\u0086\bø\u0001\u0000¢\u0006\u0006\b®\u0001\u0010¯\u0001\"\u0018\u0010±\u0001\u001a\u00030°\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001\"\u0017\u0010³\u0001\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001\"\u0018\u0010¶\u0001\u001a\u00030µ\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001\"\u0018\u0010¹\u0001\u001a\u00030¸\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001\"\u0018\u0010¼\u0001\u001a\u00030»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001\"\u0018\u0010¿\u0001\u001a\u00030¾\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001\"\u0018\u0010Â\u0001\u001a\u00030Á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001\"\u0017\u0010Ä\u0001\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001\"\u0017\u0010Æ\u0001\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001\"\u0017\u0010È\u0001\u001a\u00020\u00078\u0006X\u0086T¢\u0006\b\n\u0006\bÈ\u0001\u0010Ç\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006É\u0001"}, d2 = {"", "arrayLength", "offset", "count", "Lkotlin/G0;", "checkOffsetAndCount", "(JJJ)V", "", "name", "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;", "", PluralsKeys.OTHER, "Ljava/util/Comparator;", "comparator", "intersect", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "hasIntersection", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "Lokhttp3/HttpUrl;", "includeDefaultPort", "toHostHeader", "(Lokhttp3/HttpUrl;Z)Ljava/lang/String;", "value", "", "indexOf", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "concat", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "indexOfFirstNonAsciiWhitespace", "(Ljava/lang/String;II)I", "indexOfLastNonAsciiWhitespace", "trimSubstring", "(Ljava/lang/String;II)Ljava/lang/String;", "delimiters", "delimiterOffset", "(Ljava/lang/String;Ljava/lang/String;II)I", "", "delimiter", "(Ljava/lang/String;CII)I", "indexOfControlOrNonAscii", "(Ljava/lang/String;)I", "canParseAsIpAddress", "(Ljava/lang/String;)Z", "isSensitiveHeader", "format", "", "args", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lokio/n;", "Ljava/nio/charset/Charset;", "default", "readBomAsCharset", "(Lokio/n;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "checkDuration", "(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I", "parseHexDigit", "(C)I", "", "Lokhttp3/internal/http2/Header;", "Lokhttp3/Headers;", "toHeaders", "(Ljava/util/List;)Lokhttp3/Headers;", "toHeaderList", "(Lokhttp3/Headers;)Ljava/util/List;", "canReuseConnectionFor", "(Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;)Z", "Lokhttp3/EventListener;", "Lokhttp3/EventListener$Factory;", "asFactory", "(Lokhttp3/EventListener;)Lokhttp3/EventListener$Factory;", "", "mask", "and", "(BI)I", "", "(SI)I", "(IJ)J", "Lokio/m;", "medium", "writeMedium", "(Lokio/m;I)V", "readMedium", "(Lokio/n;)I", "Lokio/e0;", "timeUnit", "skipAll", "(Lokio/e0;ILjava/util/concurrent/TimeUnit;)Z", "timeout", "discard", "Ljava/net/Socket;", "peerName", "(Ljava/net/Socket;)Ljava/lang/String;", SearchParamsConverterKt.SOURCE, "isHealthy", "(Ljava/net/Socket;Lokio/n;)Z", "Lkotlin/Function0;", "block", "ignoreIoExceptions", "(LY41/a;)V", "threadName", "(Ljava/lang/String;LY41/a;)V", "Lokio/l;", "b", "(Lokio/l;B)I", "indexOfNonWhitespace", "(Ljava/lang/String;I)I", "Lokhttp3/Response;", "headersContentLength", "(Lokhttp3/Response;)J", "defaultValue", "toLongOrDefault", "(Ljava/lang/String;J)J", "toNonNegativeInt", "T", "toImmutableList", "(Ljava/util/List;)Ljava/util/List;", "elements", "immutableListOf", "([Ljava/lang/Object;)Ljava/util/List;", "K", "V", "", "toImmutableMap", "(Ljava/util/Map;)Ljava/util/Map;", "Ljava/io/Closeable;", "closeQuietly", "(Ljava/io/Closeable;)V", "(Ljava/net/Socket;)V", "Ljava/net/ServerSocket;", "(Ljava/net/ServerSocket;)V", "Lokhttp3/internal/io/FileSystem;", "Ljava/io/File;", "file", "isCivilized", "(Lokhttp3/internal/io/FileSystem;Ljava/io/File;)Z", "toHexString", "(J)Ljava/lang/String;", "(I)Ljava/lang/String;", "wait", "(Ljava/lang/Object;)V", "notify", "notifyAll", "instance", "Ljava/lang/Class;", "fieldType", "fieldName", "readFieldOrNull", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "E", "", "element", "addIfAbsent", "(Ljava/util/List;Ljava/lang/Object;)V", "assertThreadHoldsLock", "assertThreadDoesntHoldLock", "Ljava/lang/Exception;", "Lkotlin/Exception;", "suppressed", "", "withSuppressed", "(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;", "", "Lkotlin/Function1;", "Lkotlin/w;", "predicate", "filterList", "(Ljava/lang/Iterable;LY41/l;)Ljava/util/List;", "", "EMPTY_BYTE_ARRAY", "[B", "EMPTY_HEADERS", "Lokhttp3/Headers;", "Lokhttp3/ResponseBody;", "EMPTY_RESPONSE", "Lokhttp3/ResponseBody;", "Lokhttp3/RequestBody;", "EMPTY_REQUEST", "Lokhttp3/RequestBody;", "Lokio/P;", "UNICODE_BOMS", "Lokio/P;", "Ljava/util/TimeZone;", "UTC", "Ljava/util/TimeZone;", "Lkotlin/text/p;", "VERIFY_AS_IP_ADDRESS", "Lkotlin/text/p;", "assertionsEnabled", "Z", "okHttpName", "Ljava/lang/String;", "userAgent", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
@i
/* loaded from: classes7.dex */
public final class Util {

    @f
    @k
    public static final byte[] EMPTY_BYTE_ARRAY;

    @f
    @k
    public static final Headers EMPTY_HEADERS = Headers.INSTANCE.of(new String[0]);

    @f
    @k
    public static final RequestBody EMPTY_REQUEST;

    @f
    @k
    public static final ResponseBody EMPTY_RESPONSE;

    @k
    private static final P UNICODE_BOMS;

    @f
    @k
    public static final TimeZone UTC;

    @k
    private static final C43059p VERIFY_AS_IP_ADDRESS;

    @f
    public static final boolean assertionsEnabled;

    @f
    @k
    public static final String okHttpName;

    @k
    public static final String userAgent = "okhttp/4.12.0";

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.INSTANCE, bArr, (MediaType) null, 1, (Object) null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.INSTANCE, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        P.a aVar = P.f420028e;
        C44805o.f420139e.getClass();
        C44805o[] c44805oArr = {C44805o.a.b("efbbbf"), C44805o.a.b("feff"), C44805o.a.b("fffe"), C44805o.a.b("0000ffff"), C44805o.a.b("ffff0000")};
        aVar.getClass();
        UNICODE_BOMS = P.a.b(c44805oArr);
        UTC = TimeZone.getTimeZone("GMT");
        VERIFY_AS_IP_ADDRESS = new C43059p("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        assertionsEnabled = false;
        okHttpName = C43066x.X("Client", C43066x.U("okhttp3.", OkHttpClient.class.getName()));
    }

    public static final <E> void addIfAbsent(@k List<E> list, E e12) {
        if (list.contains(e12)) {
            return;
        }
        list.add(e12);
    }

    public static final int and(byte b12, int i12) {
        return b12 & i12;
    }

    @k
    public static final EventListener.Factory asFactory(@k EventListener eventListener) {
        return new a(eventListener, 18);
    }

    public static final void assertThreadDoesntHoldLock(@k Object obj) {
        if (assertionsEnabled && Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + obj);
        }
    }

    public static final void assertThreadHoldsLock(@k Object obj) {
        if (!assertionsEnabled || Thread.holdsLock(obj)) {
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + obj);
    }

    public static final boolean canParseAsIpAddress(@k String str) {
        return VERIFY_AS_IP_ADDRESS.e(str);
    }

    public static final boolean canReuseConnectionFor(@k HttpUrl httpUrl, @k HttpUrl httpUrl2) {
        return L.f(httpUrl.host(), httpUrl2.host()) && httpUrl.port() == httpUrl2.port() && L.f(httpUrl.scheme(), httpUrl2.scheme());
    }

    public static final int checkDuration(@k String str, long j12, @l TimeUnit timeUnit) {
        if (j12 < 0) {
            throw new IllegalStateException(str.concat(" < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j12);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(str.concat(" too large.").toString());
        }
        if (millis != 0 || j12 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(str.concat(" too small.").toString());
    }

    public static final void checkOffsetAndCount(long j12, long j13, long j14) {
        if ((j13 | j14) < 0 || j13 > j12 || j12 - j13 < j14) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(@k Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (RuntimeException e12) {
            throw e12;
        } catch (Exception unused) {
        }
    }

    @k
    public static final String[] concat(@k String[] strArr, @k String str) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
        strArr2[strArr2.length - 1] = str;
        return strArr2;
    }

    public static final int delimiterOffset(@k String str, @k String str2, int i12, int i13) {
        while (i12 < i13) {
            if (C43066x.r(str2, str.charAt(i12))) {
                return i12;
            }
            i12++;
        }
        return i13;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i12 = 0;
        }
        if ((i14 & 4) != 0) {
            i13 = str.length();
        }
        return delimiterOffset(str, str2, i12, i13);
    }

    public static final boolean discard(@k e0 e0Var, int i12, @k TimeUnit timeUnit) {
        try {
            return skipAll(e0Var, i12, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    @k
    public static final <T> List<T> filterList(@k Iterable<? extends T> iterable, @k Y41.l<? super T, Boolean> lVar) {
        List arrayList = C42784z0.f406748b;
        for (T t12 : iterable) {
            if (lVar.invoke(t12).booleanValue()) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                v0.b(arrayList).add(t12);
            }
        }
        return arrayList;
    }

    @k
    public static final String format(@k String str, @k Object... objArr) {
        u0 u0Var = u0.f406856a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean hasIntersection(@k String[] strArr, @l String[] strArr2, @k Comparator<? super String> comparator) {
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator itA = C42809i.a(strArr2);
                while (itA.hasNext()) {
                    if (comparator.compare(str, (String) itA.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(@k Response response) {
        String str = response.headers().get("Content-Length");
        if (str != null) {
            return toLongOrDefault(str, -1L);
        }
        return -1L;
    }

    public static final void ignoreIoExceptions(@k Y41.a<G0> aVar) {
        try {
            aVar.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    @k
    public static final <T> List<T> immutableListOf(@k T... tArr) {
        Object[] objArr = (Object[]) tArr.clone();
        return Collections.unmodifiableList(C42745f0.U(Arrays.copyOf(objArr, objArr.length)));
    }

    public static final int indexOf(@k String[] strArr, @k String str, @k Comparator<String> comparator) {
        int length = strArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (comparator.compare(strArr[i12], str) == 0) {
                return i12;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(@k String str) {
        int length = str.length();
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str.charAt(i12);
            if (L.g(cCharAt, 31) <= 0 || L.g(cCharAt, 127) >= 0) {
                return i12;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(@k String str, int i12, int i13) {
        while (i12 < i13) {
            char cCharAt = str.charAt(i12);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i12;
            }
            i12++;
        }
        return i13;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i12 = 0;
        }
        if ((i14 & 2) != 0) {
            i13 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i12, i13);
    }

    public static final int indexOfLastNonAsciiWhitespace(@k String str, int i12, int i13) {
        int i14 = i13 - 1;
        if (i12 <= i14) {
            while (true) {
                char cCharAt = str.charAt(i14);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i14 + 1;
                }
                if (i14 == i12) {
                    break;
                }
                i14--;
            }
        }
        return i12;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i12 = 0;
        }
        if ((i14 & 2) != 0) {
            i13 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i12, i13);
    }

    public static final int indexOfNonWhitespace(@k String str, int i12) {
        int length = str.length();
        while (i12 < length) {
            char cCharAt = str.charAt(i12);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i12;
            }
            i12++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i12 = 0;
        }
        return indexOfNonWhitespace(str, i12);
    }

    @k
    public static final String[] intersect(@k String[] strArr, @k String[] strArr2, @k Comparator<? super String> comparator) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i12]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i12++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean isCivilized(@k FileSystem fileSystem, @k File file) {
        c0 c0VarSink = fileSystem.sink(file);
        try {
            try {
                fileSystem.delete(file);
                c.a(c0VarSink, null);
                return true;
            } catch (IOException unused) {
                G0 g02 = G0.f406611a;
                c.a(c0VarSink, null);
                fileSystem.delete(file);
                return false;
            }
        } finally {
        }
    }

    public static final boolean isHealthy(@k Socket socket, @k InterfaceC44804n interfaceC44804n) throws SocketException {
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z12 = !interfaceC44804n.W2();
                socket.setSoTimeout(soTimeout);
                return z12;
            } catch (Throwable th2) {
                socket.setSoTimeout(soTimeout);
                throw th2;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean isSensitiveHeader(@k String str) {
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final void notify(@k Object obj) {
        obj.notify();
    }

    public static final void notifyAll(@k Object obj) {
        obj.notifyAll();
    }

    public static final int parseHexDigit(char c12) {
        if ('0' <= c12 && c12 < ':') {
            return c12 - '0';
        }
        if ('a' <= c12 && c12 < 'g') {
            return c12 - 'W';
        }
        if ('A' > c12 || c12 >= 'G') {
            return -1;
        }
        return c12 - '7';
    }

    @k
    public static final String peerName(@k Socket socket) {
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        return remoteSocketAddress instanceof InetSocketAddress ? ((InetSocketAddress) remoteSocketAddress).getHostName() : remoteSocketAddress.toString();
    }

    @k
    public static final Charset readBomAsCharset(@k InterfaceC44804n interfaceC44804n, @k Charset charset) {
        Charset charsetForName;
        int iT6 = interfaceC44804n.t6(UNICODE_BOMS);
        if (iT6 == -1) {
            return charset;
        }
        if (iT6 == 0) {
            return StandardCharsets.UTF_8;
        }
        if (iT6 == 1) {
            return StandardCharsets.UTF_16BE;
        }
        if (iT6 == 2) {
            return StandardCharsets.UTF_16LE;
        }
        if (iT6 == 3) {
            C43047d.f410588a.getClass();
            charsetForName = C43047d.f410594g;
            if (charsetForName == null) {
                charsetForName = Charset.forName("UTF-32BE");
                C43047d.f410594g = charsetForName;
            }
        } else {
            if (iT6 != 4) {
                throw new AssertionError();
            }
            C43047d.f410588a.getClass();
            charsetForName = C43047d.f410593f;
            if (charsetForName == null) {
                charsetForName = Charset.forName("UTF-32LE");
                C43047d.f410593f = charsetForName;
            }
        }
        return charsetForName;
    }

    @l
    public static final <T> T readFieldOrNull(@k Object obj, @k Class<T> cls, @k String str) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        T tCast;
        Object fieldOrNull;
        Class<?> superclass = obj.getClass();
        while (true) {
            tCast = null;
            if (superclass.equals(Object.class)) {
                if (str.equals("delegate") || (fieldOrNull = readFieldOrNull(obj, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) readFieldOrNull(fieldOrNull, cls, str);
            }
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (!cls.isInstance(obj2)) {
                    break;
                }
                tCast = cls.cast(obj2);
                break;
            } catch (NoSuchFieldException unused) {
                superclass = superclass.getSuperclass();
            }
        }
        return tCast;
    }

    public static final int readMedium(@k InterfaceC44804n interfaceC44804n) {
        return and(interfaceC44804n.readByte(), 255) | (and(interfaceC44804n.readByte(), 255) << 16) | (and(interfaceC44804n.readByte(), 255) << 8);
    }

    public static final boolean skipAll(@k e0 e0Var, int i12, @k TimeUnit timeUnit) {
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = e0Var.getF420025c().getHasDeadline() ? e0Var.getF420025c().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        e0Var.getF420025c().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i12)) + jNanoTime);
        try {
            C44802l c44802l = new C44802l();
            while (e0Var.read(c44802l, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                c44802l.a();
            }
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                e0Var.getF420025c().clearDeadline();
            } else {
                e0Var.getF420025c().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                e0Var.getF420025c().clearDeadline();
            } else {
                e0Var.getF420025c().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            return false;
        } catch (Throwable th2) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                e0Var.getF420025c().clearDeadline();
            } else {
                e0Var.getF420025c().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th2;
        }
    }

    @k
    public static final ThreadFactory threadFactory(@k String str, boolean z12) {
        return new T1(str, z12, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread threadFactory$lambda$1(String str, boolean z12, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z12);
        return thread;
    }

    public static final void threadName(@k String str, @k Y41.a<G0> aVar) {
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(str);
        try {
            aVar.invoke();
        } finally {
            threadCurrentThread.setName(name);
        }
    }

    @k
    public static final List<Header> toHeaderList(@k Headers headers) {
        kotlin.ranges.l lVarR = s.r(0, headers.size());
        ArrayList arrayList = new ArrayList(C42745f0.q(lVarR, 10));
        kotlin.ranges.k kVarB = lVarR.iterator();
        while (kVarB.f406910d) {
            int iA2 = kVarB.a();
            arrayList.add(new Header(headers.name(iA2), headers.value(iA2)));
        }
        return arrayList;
    }

    @k
    public static final Headers toHeaders(@k List<Header> list) {
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            builder.addLenient$okhttp(header.getName().t(), header.getValue().t());
        }
        return builder.build();
    }

    @k
    public static final String toHexString(long j12) {
        return Long.toHexString(j12);
    }

    @k
    public static final String toHostHeader(@k HttpUrl httpUrl, boolean z12) {
        String strHost;
        if (C43066x.q(httpUrl.host(), ":", false)) {
            strHost = "[" + httpUrl.host() + ']';
        } else {
            strHost = httpUrl.host();
        }
        if (!z12 && httpUrl.port() == HttpUrl.INSTANCE.defaultPort(httpUrl.scheme())) {
            return strHost;
        }
        StringBuilder sbB = C22491k0.b(strHost, ':');
        sbB.append(httpUrl.port());
        return sbB.toString();
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z12 = false;
        }
        return toHostHeader(httpUrl, z12);
    }

    @k
    public static final <T> List<T> toImmutableList(@k List<? extends T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    @k
    public static final <K, V> Map<K, V> toImmutableMap(@k Map<K, ? extends V> map) {
        return map.isEmpty() ? P0.c() : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static final long toLongOrDefault(@k String str, long j12) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j12;
        }
    }

    public static final int toNonNegativeInt(@l String str, int i12) throws NumberFormatException {
        if (str != null) {
            try {
                long j12 = Long.parseLong(str);
                if (j12 > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j12 < 0) {
                    return 0;
                }
                return (int) j12;
            } catch (NumberFormatException unused) {
            }
        }
        return i12;
    }

    @k
    public static final String trimSubstring(@k String str, int i12, int i13) {
        int iIndexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i12, i13);
        return str.substring(iIndexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, iIndexOfFirstNonAsciiWhitespace, i13));
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i12 = 0;
        }
        if ((i14 & 2) != 0) {
            i13 = str.length();
        }
        return trimSubstring(str, i12, i13);
    }

    public static final void wait(@k Object obj) throws InterruptedException {
        obj.wait();
    }

    @k
    public static final Throwable withSuppressed(@k Exception exc, @k List<? extends Exception> list) {
        Iterator<? extends Exception> it = list.iterator();
        while (it.hasNext()) {
            C42833p.a(exc, it.next());
        }
        return exc;
    }

    public static final void writeMedium(@k InterfaceC44803m interfaceC44803m, int i12) {
        interfaceC44803m.writeByte((i12 >>> 16) & 255);
        interfaceC44803m.writeByte((i12 >>> 8) & 255);
        interfaceC44803m.writeByte(i12 & 255);
    }

    public static final int and(short s5, int i12) {
        return s5 & i12;
    }

    public static final int delimiterOffset(@k String str, char c12, int i12, int i13) {
        while (i12 < i13) {
            if (str.charAt(i12) == c12) {
                return i12;
            }
            i12++;
        }
        return i13;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c12, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i12 = 0;
        }
        if ((i14 & 4) != 0) {
            i13 = str.length();
        }
        return delimiterOffset(str, c12, i12, i13);
    }

    @k
    public static final String toHexString(int i12) {
        return Integer.toHexString(i12);
    }

    public static final long and(int i12, long j12) {
        return i12 & j12;
    }

    public static final void closeQuietly(@k Socket socket) throws IOException {
        try {
            socket.close();
        } catch (AssertionError e12) {
            throw e12;
        } catch (RuntimeException e13) {
            if (!L.f(e13.getMessage(), "bio == null")) {
                throw e13;
            }
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(@k ServerSocket serverSocket) throws IOException {
        try {
            serverSocket.close();
        } catch (RuntimeException e12) {
            throw e12;
        } catch (Exception unused) {
        }
    }

    public static final int skipAll(@k C44802l c44802l, byte b12) {
        int i12 = 0;
        while (!c44802l.W2() && c44802l.m(0L) == b12) {
            i12++;
            c44802l.readByte();
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventListener asFactory$lambda$8(EventListener eventListener, Call call) {
        return eventListener;
    }
}
