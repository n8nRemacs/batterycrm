package xb0;

import Y61.k;
import com.avito.android.util.C5;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.N3;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.text.C43059p;

/* compiled from: PhoneNumbersComparator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxb0/b;", "Lxb0/a;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xb0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C49920b implements InterfaceC49919a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC35945t1<String> f442570a;

    @Inject
    public C49920b(@N3.a @k InterfaceC35945t1<String> interfaceC35945t1) {
        this.f442570a = interfaceC35945t1;
    }

    @Override // xb0.InterfaceC49919a
    public final boolean a(@k String str, @k String str2) {
        InterfaceC35945t1<String> interfaceC35945t1 = this.f442570a;
        String strA = interfaceC35945t1.a(str);
        C43059p c43059p = C5.f318570d;
        return L.f(c43059p.f(strA, "").toString(), c43059p.f(interfaceC35945t1.a(str2), "").toString());
    }
}
