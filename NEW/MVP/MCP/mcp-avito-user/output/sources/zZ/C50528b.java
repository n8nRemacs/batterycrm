package zZ;

import Y61.k;
import Y61.l;
import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.InputStream;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.http.CallServerInterceptor;
import okio.InterfaceC44803m;
import zZ.InterfaceC50529c;

/* compiled from: FileUploadRequestBody.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LzZ/b;", "Lokhttp3/RequestBody;", "_common_okhttp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zZ.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C50528b extends RequestBody {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Uri f444066c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ContentResolver f444067d;

    /* renamed from: e, reason: collision with root package name */
    public final int f444068e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f444069f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Y41.l<InterfaceC50529c, G0> f444070g;

    public C50528b() {
        throw null;
    }

    public C50528b(Uri uri, ContentResolver contentResolver, int i12, String str, Y41.l lVar, int i13, C42822w c42822w) {
        i12 = (i13 & 4) != 0 ? 1024 : i12;
        str = (i13 & 8) != 0 ? null : str;
        lVar = (i13 & 16) != 0 ? null : lVar;
        this.f444066c = uri;
        this.f444067d = contentResolver;
        this.f444068e = i12;
        this.f444069f = str;
        this.f444070g = lVar;
    }

    @Override // okhttp3.RequestBody
    @l
    /* renamed from: contentType */
    public final MediaType get$contentType() {
        String str = this.f444069f;
        if (str != null) {
            return MediaType.INSTANCE.parse(str);
        }
        String type = this.f444067d.getType(this.f444066c);
        if (type != null) {
            return MediaType.INSTANCE.parse(type);
        }
        return null;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(@k InterfaceC44803m interfaceC44803m) throws FileNotFoundException {
        boolean z12 = true;
        Y41.l<InterfaceC50529c, G0> lVar = this.f444070g;
        InputStream inputStreamOpenInputStream = this.f444067d.openInputStream(this.f444066c);
        if (inputStreamOpenInputStream != null) {
            try {
                byte[] bArr = new byte[this.f444068e];
                int iAvailable = inputStreamOpenInputStream.available();
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                int length = stackTrace.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        z12 = false;
                        break;
                    } else if (L.f(stackTrace[i12].getClassName(), CallServerInterceptor.class.getCanonicalName())) {
                        break;
                    } else {
                        i12++;
                    }
                }
                long j12 = 0;
                while (true) {
                    try {
                        int i13 = inputStreamOpenInputStream.read(bArr);
                        if (i13 == -1) {
                            break;
                        }
                        j12 += i13;
                        interfaceC44803m.k6(0, i13, bArr);
                        if (z12 && lVar != null) {
                            lVar.invoke(new InterfaceC50529c.C12957c(j12, iAvailable, j12 / iAvailable));
                        }
                    } catch (Exception e12) {
                        if (lVar != null) {
                            lVar.invoke(new InterfaceC50529c.a(e12));
                            G0 g02 = G0.f406611a;
                        }
                    }
                }
                if (lVar != null) {
                    lVar.invoke(InterfaceC50529c.b.f444072a);
                    G0 g03 = G0.f406611a;
                }
                kotlin.io.c.a(inputStreamOpenInputStream, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(inputStreamOpenInputStream, th2);
                    throw th3;
                }
            }
        }
    }
}
