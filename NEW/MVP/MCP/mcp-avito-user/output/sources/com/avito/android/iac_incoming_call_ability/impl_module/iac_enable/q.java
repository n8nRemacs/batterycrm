package com.avito.android.iac_incoming_call_ability.impl_module.iac_enable;

import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.completable.v;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacTimeIntervalInteractorImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/impl_module/iac_enable/q;", "LNL/f;", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class q implements NL.f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_incoming_call_ability.impl_module.api.a f168324a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final OL.a f168325b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f168326c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f168327d = C42727D.c(a.f168329l);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f168328e = C42727D.c(b.f168330l);

    /* compiled from: IacTimeIntervalInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/text/SimpleDateFormat;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<SimpleDateFormat> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f168329l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZZZ", Locale.US);
        }
    }

    /* compiled from: IacTimeIntervalInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/text/SimpleDateFormat;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<SimpleDateFormat> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f168330l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("HH:mm", Locale.US);
        }
    }

    @Inject
    public q(@Y61.k com.avito.android.iac_incoming_call_ability.impl_module.api.a aVar, @Y61.k OL.a aVar2, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f168324a = aVar;
        this.f168325b = aVar2;
        this.f168326c = interfaceC35745a5;
    }

    public static I f(q qVar, org.threeten.bp.g gVar, org.threeten.bp.g gVar2, String str, int i12) {
        if ((i12 & 1) != 0) {
            gVar = null;
        }
        if ((i12 & 2) != 0) {
            gVar2 = null;
        }
        if ((i12 & 4) != 0) {
            str = null;
        }
        return qVar.f168324a.a(gVar != null ? u.b(gVar, qVar.g(), qVar.h()) : null, gVar2 != null ? u.b(gVar2, qVar.g(), qVar.h()) : null, str);
    }

    @Override // NL.f
    @Y61.k
    public final v a(@Y61.k String str) {
        return new v(g1.a(f(this, null, null, str, 3).z(this.f168326c.a())));
    }

    @Override // NL.f
    @Y61.k
    public final v b(@Y61.k org.threeten.bp.g gVar, @Y61.k org.threeten.bp.g gVar2) {
        return new v(g1.a(f(this, gVar, gVar2, null, 4).z(this.f168326c.a())).k(new r(this, gVar, gVar2)));
    }

    @Override // NL.f
    @Y61.l
    public final org.threeten.bp.g c() {
        String strR = this.f168325b.r();
        if (strR != null) {
            return u.a(strR, g(), h());
        }
        return null;
    }

    @Override // NL.f
    public final void d(@Y61.l org.threeten.bp.g gVar, @Y61.l org.threeten.bp.g gVar2) {
        String strB = gVar != null ? u.b(gVar, g(), h()) : null;
        OL.a aVar = this.f168325b;
        aVar.s(strB);
        aVar.t(gVar2 != null ? u.b(gVar2, g(), h()) : null);
    }

    @Override // NL.f
    @Y61.l
    public final org.threeten.bp.g e() {
        String strP = this.f168325b.p();
        if (strP != null) {
            return u.a(strP, g(), h());
        }
        return null;
    }

    public final SimpleDateFormat g() {
        return (SimpleDateFormat) this.f168327d.getValue();
    }

    public final SimpleDateFormat h() {
        return (SimpleDateFormat) this.f168328e.getValue();
    }
}
