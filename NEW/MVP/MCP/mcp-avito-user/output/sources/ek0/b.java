package EK0;

import OK0.e;
import PK0.n;
import Y61.k;
import android.content.Context;
import android.text.Editable;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DateAttribute;
import com.avito.android.util.Z0;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DateAttributeFormatterV1.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEK0/b;", "LEK0/a;", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final IK0.a f3932a;

    public b(@k IK0.a aVar) {
        this.f3932a = aVar;
    }

    @Override // CK0.a
    public final void a(Context context, n nVar, boolean z12, Editable editable, int i12, String str, Attribute attribute, AttributedText attributedText) {
        DateAttribute dateAttribute = (DateAttribute) attribute;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateAttribute.getFormat(), Locale.getDefault());
        Long timestamp = dateAttribute.getTimestamp();
        String str2 = simpleDateFormat.format(new Date((timestamp != null ? timestamp.longValue() : 0L) * 1000));
        editable.replace(i12, str.length() + i12, str2);
        Iterator it = this.f3932a.a(dateAttribute, context, z12, dateAttribute.getTitle(), i12, str2.length() + i12).iterator();
        while (it.hasNext()) {
            Z0.a(editable, (e) it.next());
        }
    }

    @Override // CK0.a
    public final boolean b(@k Attribute attribute) {
        return attribute instanceof DateAttribute;
    }
}
