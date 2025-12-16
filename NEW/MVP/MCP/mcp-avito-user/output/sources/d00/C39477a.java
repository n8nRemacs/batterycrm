package d00;

import Y61.k;
import android.webkit.MimeTypeMap;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: FileConstraints.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld00/a;", "", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: d00.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C39477a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C39477a f393602a = new C39477a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final String[] f393603b;

    static {
        List listU = C42745f0.U("pdf", "jpg", "png");
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        ArrayList arrayList = new ArrayList();
        Iterator it = listU.iterator();
        while (it.hasNext()) {
            String mimeTypeFromExtension = singleton.getMimeTypeFromExtension((String) it.next());
            if (mimeTypeFromExtension != null) {
                arrayList.add(mimeTypeFromExtension);
            }
        }
        f393603b = (String[]) arrayList.toArray(new String[0]);
    }
}
