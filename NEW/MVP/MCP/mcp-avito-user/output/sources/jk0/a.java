package JK0;

import PK0.n;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.text.Editable;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FormatterRule.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LJK0/a;", "LJK0/d;", "LJK0/h;", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements d, h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Set<CK0.a<?>> f8874a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h f8875b;

    public a(@k Set<CK0.a<?>> set, @k h hVar) {
        this.f8874a = set;
        this.f8875b = hVar;
    }

    @Override // JK0.h
    @k
    public final String a(@k String str) {
        return this.f8875b.a(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    @Override // JK0.d
    public final void b(@l Context context, @l n nVar, boolean z12, @k Editable editable, int i12, @k String str, @k Attribute attribute, @k AttributedText attributedText) {
        CK0.a next;
        Iterator it = this.f8874a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = 0;
                break;
            } else {
                next = it.next();
                if (((CK0.a) next).b(attribute)) {
                    break;
                }
            }
        }
        CK0.a aVar = next instanceof CK0.a ? next : null;
        if (aVar != null) {
            aVar.a(context, nVar, z12, editable, i12, str, attribute, attributedText);
        }
    }

    @Override // JK0.h
    public final void c(@k Editable editable) {
        this.f8875b.c(editable);
    }
}
