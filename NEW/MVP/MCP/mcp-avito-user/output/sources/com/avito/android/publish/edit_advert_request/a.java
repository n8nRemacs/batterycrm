package com.avito.android.publish.edit_advert_request;

import Pd.InterfaceC14769a;
import android.os.Bundle;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.AuctionOfferLink;
import com.avito.android.remote.model.CategoryIds;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.publish.EditAdvertResult;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.I;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.rx3.O;
import kotlinx.coroutines.rx3.Q;
import lD.C43617a;
import sj0.InterfaceC48373a;

/* compiled from: AuctionOfferChecker.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/edit_advert_request/a;", "", "a", "b", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f235450e = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14769a f235451a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48373a f235452b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C43617a f235453c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f235454d;

    /* compiled from: AuctionOfferChecker.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/edit_advert_request/a$a;", "", "a", "b", "Lcom/avito/android/publish/edit_advert_request/a$a$a;", "Lcom/avito/android/publish/edit_advert_request/a$a$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.edit_advert_request.a$a, reason: collision with other inner class name */
    public interface InterfaceC7097a {

        /* compiled from: AuctionOfferChecker.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/edit_advert_request/a$a$a;", "Lcom/avito/android/publish/edit_advert_request/a$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.edit_advert_request.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C7098a implements InterfaceC7097a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final AuctionOfferLink f235455a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Bundle f235456b;

            public C7098a(@Y61.k AuctionOfferLink auctionOfferLink, @Y61.k Bundle bundle) {
                this.f235455a = auctionOfferLink;
                this.f235456b = bundle;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C7098a)) {
                    return false;
                }
                C7098a c7098a = (C7098a) obj;
                return this.f235455a.equals(c7098a.f235455a) && this.f235456b.equals(c7098a.f235456b);
            }

            public final int hashCode() {
                return this.f235456b.hashCode() + (this.f235455a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowAuctionOffer(uri=");
                sb2.append(this.f235455a);
                sb2.append(", bundle=");
                return H.m(sb2, this.f235456b, ')');
            }
        }

        /* compiled from: AuctionOfferChecker.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/edit_advert_request/a$a$b;", "Lcom/avito/android/publish/edit_advert_request/a$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.edit_advert_request.a$a$b */
        public static final /* data */ class b implements InterfaceC7097a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final TypedResult<EditAdvertResult> f235457a;

            public b(@Y61.k TypedResult<EditAdvertResult> typedResult) {
                this.f235457a = typedResult;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f235457a, ((b) obj).f235457a);
            }

            public final int hashCode() {
                return this.f235457a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "SkipAuctionOffer(result=" + this.f235457a + ')';
            }
        }
    }

    /* compiled from: AuctionOfferChecker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/publish/edit_advert_request/a$b;", "", "<init>", "()V", "", "EDIT_SOURCE", "Ljava/lang/String;", "UTM_SOURCE", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
    }

    @Inject
    public a(@Y61.k InterfaceC14769a interfaceC14769a, @Y61.k InterfaceC48373a interfaceC48373a, @Y61.k C43617a c43617a, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f235451a = interfaceC14769a;
        this.f235452b = interfaceC48373a;
        this.f235453c = c43617a;
        this.f235454d = interfaceC35745a5;
    }

    @Y61.k
    public final I<InterfaceC7097a> a(@Y61.k TypedResult<EditAdvertResult> typedResult, @Y61.l String str, @Y61.k String str2) {
        if (!L.f(str, CategoryIds.AUTO.CARS.getId())) {
            return I.q(new InterfaceC7097a.b(typedResult));
        }
        C43617a c43617a = this.f235453c;
        c43617a.getClass();
        kotlin.reflect.n<Object>[] nVarArr = C43617a.f413588V;
        kotlin.reflect.n<Object> nVar = nVarArr[37];
        if (!((Boolean) c43617a.f413601M.a().invoke()).booleanValue()) {
            return I.q(new InterfaceC7097a.b(typedResult));
        }
        if (!(typedResult instanceof TypedResult.Success)) {
            return I.q(new InterfaceC7097a.b(typedResult));
        }
        Object result = ((TypedResult.Success) typedResult).getResult();
        EditAdvertResult.Ok ok2 = result instanceof EditAdvertResult.Ok ? (EditAdvertResult.Ok) result : null;
        if (ok2 == null) {
            return I.q(new InterfaceC7097a.b(typedResult));
        }
        if (ok2.getDeepLink() instanceof AuctionOfferLink) {
            return I.q(new InterfaceC7097a.b(typedResult));
        }
        kotlin.reflect.n<Object> nVar2 = nVarArr[41];
        boolean zBooleanValue = ((Boolean) c43617a.f413605Q.a().invoke()).booleanValue();
        InterfaceC35745a5 interfaceC35745a5 = this.f235454d;
        return zBooleanValue ? Q.a(O.c(interfaceC35745a5.a()), new c(this, str2, ok2, null)) : this.f235451a.c(str2).r(new com.avito.android.publish.edit_advert_request.b(ok2, str2)).u(new androidx.room.rxjava3.b(ok2, 16)).z(interfaceC35745a5.a());
    }
}
