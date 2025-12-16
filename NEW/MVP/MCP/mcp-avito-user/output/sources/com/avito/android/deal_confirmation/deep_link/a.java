package com.avito.android.deal_confirmation.deep_link;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DealConfirmationFeedbackLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DealConfirmationLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deal_confirmation/deep_link/a;", "Lev/a;", "Lcom/avito/android/deep_linking/links/DealConfirmationFeedbackLink;", "a", "_avito_deal-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends AbstractC40161a<DealConfirmationFeedbackLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.deal_confirmation.a f132740f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f132741g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Context f132742h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f132743i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: DealConfirmationLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/deal_confirmation/deep_link/a$a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/deal_confirmation/deep_link/a$a$a;", "Lcom/avito/android/deal_confirmation/deep_link/a$a$b;", "_avito_deal-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.deal_confirmation.deep_link.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC3975a {

        /* compiled from: DealConfirmationLinkHandler.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deal_confirmation/deep_link/a$a$a;", "Lcom/avito/android/deal_confirmation/deep_link/a$a;", "LJu/c$b;", "_avito_deal-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deal_confirmation.deep_link.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C3976a extends AbstractC3975a implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f132744b;

            public C3976a(@l String str) {
                super(null);
                this.f132744b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3976a) && L.f(this.f132744b, ((C3976a) obj).f132744b);
            }

            public final int hashCode() {
                String str = this.f132744b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Error(message="), this.f132744b, ')');
            }
        }

        /* compiled from: DealConfirmationLinkHandler.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deal_confirmation/deep_link/a$a$b;", "Lcom/avito/android/deal_confirmation/deep_link/a$a;", "LJu/c$b;", "_avito_deal-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deal_confirmation.deep_link.a$a$b */
        public static final /* data */ class b extends AbstractC3975a implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f132745b;

            public b(@k String str) {
                super(null);
                this.f132745b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f132745b, ((b) obj).f132745b);
            }

            public final int hashCode() {
                return this.f132745b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Success(message="), this.f132745b, ')');
            }
        }

        public /* synthetic */ AbstractC3975a(C42822w c42822w) {
            this();
        }

        public AbstractC3975a() {
        }
    }

    @Inject
    public a(@k com.avito.android.deal_confirmation.a aVar, @k InterfaceC35745a5 interfaceC35745a5, @k Context context) {
        this.f132740f = aVar;
        this.f132741g = interfaceC35745a5;
        this.f132742h = context;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        DealConfirmationFeedbackLink dealConfirmationFeedbackLink = (DealConfirmationFeedbackLink) deepLink;
        this.f132743i.b(g1.a(this.f132740f.a(dealConfirmationFeedbackLink.f133168b, dealConfirmationFeedbackLink.f133169c, dealConfirmationFeedbackLink.f133170d)).s(this.f132741g.e()).x(new b(this), new c(this)));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f132743i.e();
    }
}
