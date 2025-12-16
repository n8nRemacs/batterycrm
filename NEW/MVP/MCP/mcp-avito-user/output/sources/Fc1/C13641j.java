package Fc1;

import Fc1.F7;
import android.content.Context;
import android.util.Log;
import androidx.compose.ui.platform.C22491k0;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import kotlinx.coroutines.C43259k;
import xyz.n.a.ke;

/* renamed from: Fc1.j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13641j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Q f5584a;

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public final C13611f5 f5585b;

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public final C13729s7 f5586c;

    /* renamed from: d, reason: collision with root package name */
    @Inject
    public final J2 f5587d;

    /* renamed from: e, reason: collision with root package name */
    @Inject
    public final U1 f5588e;

    /* renamed from: f, reason: collision with root package name */
    @Inject
    public final C13683n5 f5589f;

    /* renamed from: g, reason: collision with root package name */
    @Inject
    public final Map<String, kotlinx.coroutines.N0> f5590g;

    /* renamed from: h, reason: collision with root package name */
    @Inject
    public final InterfaceC13669m0 f5591h;

    /* renamed from: i, reason: collision with root package name */
    @Inject
    public final J f5592i;

    /* renamed from: Fc1.j$a */
    public static final class a {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13641j(Context context, String str, C13757w c13757w, Q q12, C13729s7 c13729s7, K7 k72, H3 h32) {
        this.f5584a = q12;
        if (F7.a.f4960a == null) {
            D6 d62 = new D6(new N5(), context, str, c13757w, c13729s7, k72, h32);
            F7.a.f4960a = d62;
            C13611f5 c13611f5 = (C13611f5) d62.f4869h.get();
            c13611f5.c(xyz.n.a.j2.INIT_SDK, "UxFeedbackSDK", "4.0.0");
            xyz.n.a.j2 j2Var = xyz.n.a.j2.USE_SERVER;
            D1 d1A = ((T1) d62.f4882u.f393949a).a(ke.EMPTY);
            String strA = W1.a(d1A.f4845b.d());
            c13611f5.c(j2Var, strA.length() == 0 ? d1A.f4846c : strA);
            xyz.n.a.j2 j2Var2 = xyz.n.a.j2.USE_CREDENTIALS;
            StringBuilder sbB = C22491k0.b(str, '/');
            sbB.append(C13688o1.a(context));
            c13611f5.c(j2Var2, sbB.toString());
            c13611f5.c(xyz.n.a.j2.USE_LANGUAGE, Locale.getDefault().toLanguageTag());
            if (c13757w.f5865a.f2301a) {
                com.android.volley.z.a("Changing log tag to %s", "FeedbackNetwork");
                com.android.volley.z.f67166a = Log.isLoggable("FeedbackNetwork", 2);
                com.android.volley.z.f67166a = true;
            }
            T5 t52 = (T5) d62.f4858F.get();
            C43259k.d(t52.f5196d, null, null, new B5(t52, null), 3);
        }
        D6 d63 = F7.a.f4960a;
        D6 d64 = d63 != null ? d63 : null;
        this.f5585b = (C13611f5) d64.f4869h.get();
        this.f5586c = d64.f4862a;
        this.f5587d = (J2) d64.f4870i.get();
        this.f5588e = (U1) d64.f4876o.get();
        this.f5589f = (C13683n5) d64.f4878q.get();
        this.f5590g = (Map) d64.f4874m.get();
        this.f5591h = (InterfaceC13669m0) d64.f4879r.f393949a;
        this.f5592i = (J) d64.f4884w.f393949a;
    }
}
