package com.avito.android.profile.pro.impl.screen.item.avito_finance.stub;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import i31.InterfaceC41220a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import qg.C47395a;

/* compiled from: ProfileProAvitoFinanceStubItemView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/avito_finance/stub/g;", "Lcom/avito/android/profile/pro/impl/screen/item/avito_finance/stub/a;", "Lcom/avito/konveyor/adapter/b;", "a", "b", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements com.avito.android.profile.pro.impl.screen.item.avito_finance.stub.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final x f223045b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f223046c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f223047d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f223048e;

    /* renamed from: f, reason: collision with root package name */
    public final View f223049f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f223050g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f223051h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final DeepLink f223052i;

    /* compiled from: ProfileProAvitoFinanceStubItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/avito_finance/stub/g$a;", "", "<init>", "()V", "", "API_WALLET_PROFILE", "Ljava/lang/String;", "BASE_SCHEME", "PAGE_FROM", "PRESENTATION_STYLE", "SCREEN_NAME", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ProfileProAvitoFinanceStubItemView.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/avito_finance/stub/g$b;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        @k
        g a(@k View view);
    }

    static {
        new a(null);
    }

    @i31.c
    public g(@InterfaceC41220a @k View view, @k x xVar, @k C47395a c47395a, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        super(view);
        this.f223045b = xVar;
        this.f223046c = aVar;
        this.f223047d = this.itemView.getContext();
        this.f223048e = (TextView) view.findViewById(R.id.avito_finance_stub_title);
        this.f223049f = view.findViewById(R.id.avito_finance_stub_header_button);
        this.f223050g = (LinearLayout) view.findViewById(R.id.avito_finance_stub_item);
        this.f223051h = (TextView) view.findViewById(R.id.avito_finance_stub_text);
        this.f223052i = xVar.b("ru.avito://1/beduin/universalPage?presentationStyle=push&requestUrl=/api/1/wallet/profile?pageFrom=profile_finance_widget&sessionId=" + c47395a.f429345a + "&screenName=walletEntryPoint");
    }
}
