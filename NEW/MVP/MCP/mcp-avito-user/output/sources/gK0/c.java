package GK0;

import JK0.h;
import OK0.e;
import PK0.n;
import Y61.k;
import android.content.Context;
import android.text.Editable;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.OnClickListener;
import com.avito.android.util.Z0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FontAttributeFormatterV1.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGK0/c;", "LGK0/a;", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final IK0.a f6449a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h f6450b;

    public c(@k IK0.a aVar, @k h hVar) {
        this.f6449a = aVar;
        this.f6450b = hVar;
    }

    @Override // CK0.a
    public final void a(Context context, n nVar, boolean z12, Editable editable, int i12, String str, Attribute attribute, AttributedText attributedText) {
        FontAttribute fontAttribute = (FontAttribute) attribute;
        String strA = this.f6450b.a(fontAttribute.getTitle());
        editable.replace(i12, str.length() + i12, strA);
        Iterator it = this.f6449a.a(fontAttribute, context, z12, strA, i12, strA.length() + i12).iterator();
        while (it.hasNext()) {
            Z0.a(editable, (e) it.next());
        }
        OnClickListener onClickListener = attributedText.getClickListeners().get(fontAttribute.getName());
        if (onClickListener != null) {
            Z0.a(editable, new e(i12, strA.length() + i12, new b(onClickListener)));
        }
    }

    @Override // CK0.a
    public final boolean b(@k Attribute attribute) {
        return attribute instanceof FontAttribute;
    }
}
