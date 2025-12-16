package androidx.view;

import Y61.k;
import Y61.l;
import androidx.view.C23303N0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: NavGraphBuilder.kt */
@InterfaceC23320Z
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/navigation/c0;", "Landroidx/navigation/Y;", "Landroidx/navigation/b0;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C23326c0 extends C23319Y<C23324b0> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C23303N0 f52912g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f52913h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final ArrayList f52914i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23326c0(@k C23303N0 c23303n0, @k String str, @l String str2) {
        super(c23303n0.b(C23303N0.a.a(C23366f0.class)), str2);
        c23303n0.getClass();
        C23303N0.f52846b.getClass();
        this.f52914i = new ArrayList();
        this.f52912g = c23303n0;
        this.f52913h = str;
    }

    @k
    public C23324b0 a() {
        C23317W c23317wA = this.f52897a.a();
        c23317wA.f52882e = null;
        for (Map.Entry entry : this.f52900d.entrySet()) {
            c23317wA.f52885h.put((String) entry.getKey(), (C23389r) entry.getValue());
        }
        Iterator it = this.f52901e.iterator();
        while (it.hasNext()) {
            c23317wA.a((C23302N) it.next());
        }
        for (Map.Entry entry2 : this.f52902f.entrySet()) {
            c23317wA.r(((Number) entry2.getKey()).intValue(), (C23379m) entry2.getValue());
        }
        String str = this.f52899c;
        if (str != null) {
            c23317wA.t(str);
        }
        int i12 = this.f52898b;
        if (i12 != -1) {
            c23317wA.s(i12);
        }
        C23324b0 c23324b0 = (C23324b0) c23317wA;
        Iterator it2 = this.f52914i.iterator();
        while (it2.hasNext()) {
            C23317W c23317w = (C23317W) it2.next();
            if (c23317w != null) {
                c23324b0.w(c23317w);
            }
        }
        String str2 = this.f52913h;
        if (str2 != null) {
            c23324b0.I(str2);
            return c23324b0;
        }
        if (str != null) {
            throw new IllegalStateException("You must set a start destination route");
        }
        throw new IllegalStateException("You must set a start destination id");
    }
}
