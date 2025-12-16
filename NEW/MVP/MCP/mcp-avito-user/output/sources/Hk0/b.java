package HK0;

import JK0.h;
import OK0.e;
import PK0.n;
import PK0.p;
import Y61.k;
import android.content.Context;
import android.text.Editable;
import com.avito.android.lib.design.text_view.d;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.LinkAttribute;
import com.avito.android.util.Z0;
import com.avito.android.util.text.span.UrlSpan;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LinkAttributeFormatterV1.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHK0/b;", "LHK0/a;", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final IK0.a f7039a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h f7040b;

    public b(@k IK0.a aVar, @k h hVar) {
        this.f7039a = aVar;
        this.f7040b = hVar;
    }

    @Override // CK0.a
    public final void a(Context context, n nVar, boolean z12, Editable editable, int i12, String str, Attribute attribute, AttributedText attributedText) {
        p pVar;
        LinkAttribute linkAttribute = (LinkAttribute) attribute;
        String strA = this.f7040b.a(linkAttribute.getTitle());
        editable.replace(i12, str.length() + i12, strA);
        int i13 = nVar != null ? nVar.f12990d : 0;
        if (context == null || i13 == 0) {
            pVar = null;
        } else {
            d.f180938a.getClass();
            pVar = new p(d.a(i13, context));
        }
        if (pVar != null) {
            Z0.a(editable, new e(i12, strA.length() + i12, pVar));
        }
        Z0.a(editable, new e(i12, strA.length() + i12, new UrlSpan(linkAttribute.getUrl(), attributedText.getOnUrlClickListener(), nVar == null || nVar.f12993g != null)));
        Iterator it = this.f7039a.a(linkAttribute, context, z12, strA, i12, strA.length() + i12).iterator();
        while (it.hasNext()) {
            Z0.a(editable, (e) it.next());
        }
    }

    @Override // CK0.a
    public final boolean b(@k Attribute attribute) {
        return attribute instanceof LinkAttribute;
    }
}
