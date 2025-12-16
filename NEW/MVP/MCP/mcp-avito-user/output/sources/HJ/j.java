package hJ;

import com.avito.android.html_formatter.HtmlCharSequence;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HtmlRenderer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LhJ/j;", "LhJ/i;", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f397163a;

    @Inject
    public j(@Y61.k g gVar) {
        this.f397163a = gVar;
    }

    @Override // hJ.i
    @Y61.k
    public final HtmlCharSequence a(@Y61.k String str, @Y61.k h hVar) {
        return this.f397163a.b(str).i(hVar);
    }
}
