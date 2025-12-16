package com.avito.android.passport.deep_linking;

import Ju.AbstractC14250d;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.N1;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.passport.deeplinks.PhoneManagementLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import rv.C47918a;
import sv.C48421d;

/* compiled from: PhoneManagementAsyncLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/deep_linking/y;", "Lev/a;", "Lcom/avito/android/passport/deeplinks/PhoneManagementLink;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class y extends AbstractC40161a<PhoneManagementLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.b f211108f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f211109g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final N1 f211110h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f211111i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: PhoneManagementAsyncLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f211112a;

        static {
            int[] iArr = new int[PhoneManagementLink.ActionType.values().length];
            try {
                iArr[PhoneManagementLink.ActionType.REPLACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PhoneManagementLink.ActionType.REPLACE_AND_DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PhoneManagementLink.ActionType.DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PhoneManagementLink.ActionType.SET_TO_ALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f211112a = iArr;
        }
    }

    /* compiled from: PhoneManagementAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.r {
        public b() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(y.this);
        }
    }

    /* compiled from: PhoneManagementAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            int i12 = AbstractC14250d.f9169b;
            y.this.j(((C47918a) obj).f437156b == -1 ? AbstractC14250d.c.f9171c : AbstractC14250d.b.f9170c);
        }
    }

    @Inject
    public y(@Y61.k N1 n12, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.b bVar) {
        this.f211108f = bVar;
        this.f211109g = interfaceC4053a;
        this.f211110h = n12;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        Intent intentA;
        PhoneManagementLink phoneManagementLink = (PhoneManagementLink) deepLink;
        int i12 = a.f211112a[phoneManagementLink.f211129b.ordinal()];
        N1 n12 = this.f211110h;
        if (i12 == 1) {
            intentA = n12.a(phoneManagementLink.f211131d, phoneManagementLink.f211130c, phoneManagementLink.f211132e);
        } else if (i12 == 2 || i12 == 3) {
            intentA = n12.e(phoneManagementLink.f211131d, phoneManagementLink.f211130c, phoneManagementLink.f211132e);
        } else {
            if (i12 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            intentA = n12.d(phoneManagementLink.f211130c);
        }
        this.f211109g.J(intentA, C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f211111i.b(this.f211108f.Q().N(new b()).t0(new c()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f211111i.e();
    }
}
