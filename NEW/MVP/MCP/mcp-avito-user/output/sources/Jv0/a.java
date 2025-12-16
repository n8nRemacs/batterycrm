package JV0;

import Y61.k;
import android.app.Application;
import android.net.Uri;
import com.avito.beduin.v2.utils.io.FileReadException;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import kotlin.Metadata;

/* compiled from: BaseFileReader.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJV0/a;", "LJV0/c;", "io_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f9011a;

    public a(@k Application application) {
        this.f9011a = application;
    }

    @k
    public final InputStream a(@k String str) throws FileReadException, FileNotFoundException {
        try {
            InputStream inputStreamOpenInputStream = this.f9011a.getContentResolver().openInputStream(Uri.parse(str));
            if (inputStreamOpenInputStream != null) {
                return inputStreamOpenInputStream;
            }
            throw new IllegalArgumentException("Input stream returns null");
        } catch (Exception e12) {
            throw new FileReadException(null, e12, 1, null);
        }
    }

    @k
    public final byte[] b(@k String str) throws FileReadException, FileNotFoundException {
        InputStream inputStreamA = a(str);
        try {
            byte[] bArrC = kotlin.io.b.c(new BufferedInputStream(inputStreamA));
            kotlin.io.c.a(inputStreamA, null);
            return bArrC;
        } finally {
        }
    }
}
