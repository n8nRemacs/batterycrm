package be0;

import AK0.l;
import Y61.k;
import arrow.core.C23703n1;
import arrow.core.X0;
import arrow.core.Y0;
import com.avito.android.publish.drafts.C33842h;
import com.avito.android.publish.drafts.di.g;
import com.avito.android.util.V2;
import com.google.gson.Gson;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PublishDraftsDao.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbe0/c;", "Lbe0/b;", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: be0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C25640c implements InterfaceC25639b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f57314a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Gson f57315b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<Y0<String>> f57316c = new com.jakewharton.rxrelay3.c<>();

    public C25640c(@k l lVar, @g @k Gson gson) {
        this.f57314a = lVar;
        this.f57315b = gson;
    }

    @Y61.l
    public final synchronized C33842h a() {
        C33842h c33842h;
        C33842h c33842h2;
        String str;
        try {
            Map.Entry entry = (Map.Entry) C42745f0.F(this.f57314a.getAll().entrySet());
            c33842h = null;
            Object value = entry != null ? entry.getValue() : null;
            String str2 = value instanceof String ? (String) value : null;
            if (str2 != null) {
                try {
                    c33842h2 = (C33842h) this.f57315b.d(C33842h.class, str2);
                } catch (Throwable th2) {
                    V2.f318762a.a("DEFAULT_TAG", "PublishDraftsDao.load", th2);
                }
            } else {
                c33842h2 = null;
            }
            if (c33842h2 != null && (!c33842h2.f235383i.isEmpty() || !c33842h2.f235382h.isEmpty() || ((str = c33842h2.f235381g) != null && str.length() != 0))) {
                c33842h = c33842h2;
            }
            b(c33842h);
        } catch (Throwable th3) {
            throw th3;
        }
        return c33842h;
    }

    public final void b(C33842h c33842h) {
        G0 g02;
        com.jakewharton.rxrelay3.c<Y0<String>> cVar = this.f57316c;
        if (c33842h != null) {
            Y0.f56266a.getClass();
            cVar.accept(new C23703n1(c33842h.f235376b));
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            Y0.f56266a.getClass();
            cVar.accept(X0.f56264b);
        }
    }
}
