package q80;

import Y61.k;
import Y61.l;
import android.net.Uri;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Folder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lq80/a;", "", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: q80.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47254a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f429049a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f429050b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Uri f429051c;

    public C47254a(@k String str, @k PrintableText printableText, @l Uri uri) {
        this.f429049a = str;
        this.f429050b = printableText;
        this.f429051c = uri;
    }

    public final boolean equals(@l Object obj) {
        if (!(obj instanceof C47254a)) {
            return false;
        }
        return L.f(this.f429050b, ((C47254a) obj).f429050b);
    }

    public final int hashCode() {
        return this.f429050b.hashCode();
    }

    public /* synthetic */ C47254a(String str, PrintableText printableText, Uri uri, int i12, C42822w c42822w) {
        this(str, printableText, (i12 & 4) != 0 ? null : uri);
    }
}
