package lh;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43059p;
import kotlin.text.C43066x;
import kotlin.text.InterfaceC43057n;
import mh.C44081a;
import wZ.C49582f;

/* compiled from: BblNextStepClickAnalyticHelper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llh/b;", "Llh/a;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lh.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C43771b implements InterfaceC43770a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f414145a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public Integer f414146b;

    /* renamed from: c, reason: collision with root package name */
    public int f414147c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayList f414148d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ArrayList f414149e = new ArrayList();

    @Inject
    public C43771b(@k InterfaceC28373a interfaceC28373a) {
        this.f414145a = interfaceC28373a;
    }

    @Override // lh.InterfaceC43770a
    public final void a() {
        Integer num = this.f414146b;
        if (num != null) {
            this.f414145a.c(new C44081a(num.intValue(), this.f414147c, C42745f0.M0(this.f414148d), C42745f0.M0(this.f414149e)));
        }
    }

    @Override // lh.InterfaceC43770a
    public final void b(@l AttributedText attributedText, @k C49582f c49582f) {
        Object next;
        String title;
        InterfaceC43057n interfaceC43057nB;
        Integer numY0;
        if (attributedText == null) {
            return;
        }
        Iterator<T> it = attributedText.getAttributes().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (L.f(((Attribute) next).getName(), "days")) {
                    break;
                }
            }
        }
        Attribute attribute = (Attribute) next;
        if (attribute == null || (title = attribute.getTitle()) == null || (interfaceC43057nB = C43059p.b(new C43059p("\\d*"), title)) == null || (numY0 = C43066x.y0(interfaceC43057nB.getValue())) == null) {
            return;
        }
        int i12 = c49582f.f441558d != null ? -1 : c49582f.f441555a;
        this.f414146b = numY0;
        this.f414147c = i12;
        this.f414148d.add(numY0);
        this.f414149e.add(Integer.valueOf(i12));
    }

    @Override // lh.InterfaceC43770a
    public final void clear() {
        this.f414146b = null;
        this.f414147c = 0;
        this.f414148d.clear();
        this.f414149e.clear();
    }
}
