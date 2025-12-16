package androidx.media3.common.text;

import android.os.Bundle;
import androidx.media3.common.InterfaceC23096j;
import androidx.media3.common.S;
import androidx.media3.common.util.C23114e;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.O4;
import java.util.List;

/* compiled from: CueGroup.java */
/* loaded from: classes.dex */
public final class b implements InterfaceC23096j {

    /* renamed from: d, reason: collision with root package name */
    @J
    public static final b f47856d = new b(AbstractC37401r1.C(), 0);

    /* renamed from: e, reason: collision with root package name */
    public static final String f47857e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f47858f;

    /* renamed from: g, reason: collision with root package name */
    @J
    public static final S f47859g;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC37401r1<a> f47860b;

    /* renamed from: c, reason: collision with root package name */
    @J
    public final long f47861c;

    static {
        int i12 = M.f47887a;
        f47857e = Integer.toString(0, 36);
        f47858f = Integer.toString(1, 36);
        f47859g = new S(5);
    }

    @J
    public b(List<a> list, long j12) {
        this.f47860b = AbstractC37401r1.v(list);
        this.f47861c = j12;
    }

    @Override // androidx.media3.common.InterfaceC23096j
    @J
    public final Bundle k() {
        Bundle bundle = new Bundle();
        O4<Object> o42 = AbstractC37401r1.f359977c;
        AbstractC37401r1.a aVar = new AbstractC37401r1.a();
        int i12 = 0;
        while (true) {
            AbstractC37401r1<a> abstractC37401r1 = this.f47860b;
            if (i12 >= abstractC37401r1.size()) {
                bundle.putParcelableArrayList(f47857e, C23114e.b(aVar.i()));
                bundle.putLong(f47858f, this.f47861c);
                return bundle;
            }
            if (abstractC37401r1.get(i12).f47825e == null) {
                aVar.g(abstractC37401r1.get(i12));
            }
            i12++;
        }
    }
}
