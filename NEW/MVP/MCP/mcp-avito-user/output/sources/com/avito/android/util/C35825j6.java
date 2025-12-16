package com.avito.android.util;

import com.avito.android.InterfaceC32900o;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Arrays;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.text.C43059p;

/* compiled from: UserAgentProviderImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/j6;", "Lcom/avito/android/remote/t1;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.j6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35825j6 implements com.avito.android.remote.t1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f318908a;

    /* compiled from: UserAgentProviderImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.util.j6$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C f318909l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C35825j6 f318910m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC32900o f318911n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Locale f318912o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C c12, C35825j6 c35825j6, InterfaceC32900o interfaceC32900o, Locale locale) {
            super(0);
            this.f318909l = c12;
            this.f318910m = c35825j6;
            this.f318911n = interfaceC32900o;
            this.f318912o = locale;
        }

        @Override // Y41.a
        public final String invoke() {
            new C35782e3();
            C c12 = this.f318909l;
            String strA = C35782e3.a(c12.getF125483c());
            String strA2 = C35782e3.a(c12.getF125482b());
            this.f318910m.getClass();
            String value = this.f318911n.f().getValue();
            if (!new C43059p("\\d+\\.\\d+").e(value)) {
                throw new IllegalArgumentException("Version is parsed from User-Agent header (https://cf.avito.ru/x/V9joAQ).\nIt's crucial for DWH, Firewall, Mobile API services and others.");
            }
            kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
            return String.format("AVITO %s (%s %s; Android %s; %s)", Arrays.copyOf(new Object[]{value, strA, strA2, c12.getF125484d(), this.f318912o.toString()}, 5));
        }
    }

    @Inject
    public C35825j6(@Y61.k C c12, @Y61.k Locale locale, @Y61.k InterfaceC32900o interfaceC32900o) {
        this.f318908a = C42727D.c(new a(c12, this, interfaceC32900o, locale));
    }

    @Override // com.avito.android.remote.t1
    @Y61.k
    public final String a() {
        return (String) this.f318908a.getValue();
    }
}
