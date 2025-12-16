package coil.util;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import coil.decode.DataSource;
import coil.request.C;
import coil.view.AbstractC27249c;
import coil.view.Scale;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.io.Closeable;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import okhttp3.Headers;

/* compiled from: Utils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Bitmap.Config[] f58781a = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Bitmap.Config f58782b = Bitmap.Config.HARDWARE;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final Headers f58783c = new Headers.Builder().build();

    /* compiled from: Utils.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f58784a;

        static {
            int[] iArr = new int[DataSource.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DataSource dataSource = DataSource.f58268b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                DataSource dataSource2 = DataSource.f58268b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                DataSource dataSource3 = DataSource.f58268b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            try {
                iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f58784a = iArr2;
            int[] iArr3 = new int[Scale.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                Scale scale = Scale.f58755b;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static final void a(@Y61.k Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (RuntimeException e12) {
            throw e12;
        } catch (Exception unused) {
        }
    }

    @Y61.l
    public static final String b(@Y61.k MimeTypeMap mimeTypeMap, @Y61.l String str) {
        if (str == null || C43066x.K(str)) {
            return null;
        }
        String strR0 = C43066x.r0(C43066x.r0(str, '#'), '?');
        return mimeTypeMap.getMimeTypeFromExtension(C43066x.n0('.', C43066x.n0('/', strR0, strR0), ""));
    }

    @Y61.k
    public static final C c(@Y61.k View view) {
        Object tag = view.getTag(R.id.coil_request_manager);
        C c12 = tag instanceof C ? (C) tag : null;
        if (c12 == null) {
            synchronized (view) {
                try {
                    Object tag2 = view.getTag(R.id.coil_request_manager);
                    C c13 = tag2 instanceof C ? (C) tag2 : null;
                    if (c13 != null) {
                        c12 = c13;
                    } else {
                        c12 = new C(view);
                        view.addOnAttachStateChangeListener(c12);
                        view.setTag(R.id.coil_request_manager, c12);
                    }
                } finally {
                }
            }
        }
        return c12;
    }

    public static final boolean d(@Y61.k Uri uri) {
        return L.f(uri.getScheme(), "file") && L.f((String) C42745f0.G(uri.getPathSegments()), "android_asset");
    }

    public static final int e(@Y61.k AbstractC27249c abstractC27249c, @Y61.k Scale scale) {
        if (abstractC27249c instanceof AbstractC27249c.a) {
            return ((AbstractC27249c.a) abstractC27249c).f58759a;
        }
        int iOrdinal = scale.ordinal();
        if (iOrdinal == 0) {
            return BeduinInputModel.MIN_TEXT_VERSION;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
