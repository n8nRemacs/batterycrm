package androidx.media3.session;

import android.support.v4.media.MediaDescriptionCompat;
import android.text.TextUtils;
import androidx.media3.common.BinderC23095i;
import androidx.media3.common.InterfaceC23096j;
import androidx.media3.session.A1;
import androidx.media3.session.AbstractServiceC23270w0;
import androidx.media3.session.C23206a1;
import androidx.media3.session.C23229i0;
import androidx.media3.session.H0;
import androidx.media3.session.O0;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.O4;
import com.google.common.util.concurrent.C37568u0;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.session.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C23214d0 implements C23229i0.d, H0.b.a, C23206a1.g, A1.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52435b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52436c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f52437d;

    public /* synthetic */ C23214d0(int i12, Object obj, Object obj2) {
        this.f52436c = obj;
        this.f52435b = i12;
        this.f52437d = obj2;
    }

    @Override // androidx.media3.session.C23206a1.g
    public void b(O0.g gVar) {
        int i12 = C23206a1.f52355o;
        C23206a1 c23206a1 = (C23206a1) this.f52436c;
        c23206a1.getClass();
        MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat) this.f52437d;
        if (TextUtils.isEmpty(mediaDescriptionCompat.getMediaId())) {
            androidx.media3.common.util.s.g();
        } else {
            C37568u0.a(c23206a1.f52357b.f52290d.b(AbstractC37401r1.E(C1.l(mediaDescriptionCompat, false, true))), new C23209b1(c23206a1, gVar, this.f52435b), com.google.common.util.concurrent.Q0.a());
        }
    }

    @Override // androidx.media3.session.A1.e
    public Object d(T0 t02, O0.g gVar, int i12) {
        int i13 = A1.f51915u;
        return ((G0) t02).o((String) this.f52436c, this.f52435b, (AbstractServiceC23270w0.b) this.f52437d);
    }

    @Override // androidx.media3.session.C23229i0.d
    public void e(InterfaceC23246o interfaceC23246o, int i12) {
        C23229i0 c23229i0 = (C23229i0) this.f52436c;
        c23229i0.getClass();
        O4<Object> o42 = AbstractC37401r1.f359977c;
        AbstractC37401r1.a aVar = new AbstractC37401r1.a();
        int i13 = 0;
        while (true) {
            List list = (List) this.f52437d;
            if (i13 >= list.size()) {
                interfaceC23246o.z1(c23229i0.f52494c, i12, this.f52435b, new BinderC23095i(aVar.i()));
                return;
            } else {
                aVar.g(((androidx.media3.common.z) ((InterfaceC23096j) list.get(i13))).a(true));
                i13++;
            }
        }
    }

    public /* synthetic */ C23214d0(C23206a1 c23206a1, MediaDescriptionCompat mediaDescriptionCompat, int i12) {
        this.f52436c = c23206a1;
        this.f52437d = mediaDescriptionCompat;
        this.f52435b = i12;
    }

    public /* synthetic */ C23214d0(String str, int i12, int i13, AbstractServiceC23270w0.b bVar) {
        this.f52436c = str;
        this.f52435b = i13;
        this.f52437d = bVar;
    }
}
