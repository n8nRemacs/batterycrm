package DK0;

import OK0.e;
import PK0.n;
import Y61.k;
import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.BulletAttribute;
import com.avito.android.util.Z0;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: BulletAttributeFormatterV1.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDK0/b;", "LDK0/a;", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final IK0.a f3157a;

    public b(@k IK0.a aVar) {
        this.f3157a = aVar;
    }

    @Override // CK0.a
    public final void a(Context context, n nVar, boolean z12, Editable editable, int i12, String str, Attribute attribute, AttributedText attributedText) {
        BulletAttribute bulletAttribute = (BulletAttribute) attribute;
        editable.replace(i12, str.length() + i12, "");
        ArrayList arrayListA = this.f3157a.a(bulletAttribute, context, z12, bulletAttribute.getBullet(), 0, bulletAttribute.getBullet().length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bulletAttribute.getBullet());
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            Z0.a(spannableStringBuilder, (e) it.next());
        }
        int I12 = C43066x.I(editable, "\n", i12, false, 4);
        Integer numValueOf = Integer.valueOf(I12);
        if (I12 < 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : editable.length() - 1;
        Integer offset = bulletAttribute.getOffset();
        int iF2 = y6.f(offset != null ? offset.intValue() : 24);
        Integer indentation = bulletAttribute.getIndentation();
        Z0.a(editable, new e(i12, iIntValue + 1, new OK0.c(iF2, spannableStringBuilder, indentation != null ? indentation.intValue() : 0)));
    }

    @Override // CK0.a
    public final boolean b(@k Attribute attribute) {
        return attribute instanceof BulletAttribute;
    }
}
