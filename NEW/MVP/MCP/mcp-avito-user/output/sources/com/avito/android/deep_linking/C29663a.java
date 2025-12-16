package com.avito.android.deep_linking;

import android.R;
import android.net.Uri;
import android.view.View;
import arrow.core.AbstractC23662a;
import arrow.core.C23703n1;
import arrow.core.X0;
import arrow.core.Y0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.V2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AppLinkActivity.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\b\u0012\u00060\u0001j\u0002`\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Larrow/core/a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Landroid/net/Uri;", "result", "Lkotlin/G0;", "invoke", "(Larrow/core/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.deep_linking.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29663a extends kotlin.jvm.internal.N implements Y41.l<AbstractC23662a<? extends Exception, ? extends Uri>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AppLinkActivity f132880l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29663a(AppLinkActivity appLinkActivity) {
        super(1);
        this.f132880l = appLinkActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(AbstractC23662a<? extends Exception, ? extends Uri> abstractC23662a) {
        Y0 c23703n1;
        AbstractC23662a<? extends Exception, ? extends Uri> abstractC23662a2 = abstractC23662a;
        boolean z12 = abstractC23662a2 instanceof AbstractC23662a.b;
        if (z12) {
            V2.f318762a.e("FirebaseDynamicLink", (Throwable) ((AbstractC23662a.b) abstractC23662a2).f56268b);
        }
        if (abstractC23662a2 instanceof AbstractC23662a.c) {
            c23703n1 = new C23703n1(((AbstractC23662a.c) abstractC23662a2).f56269b);
        } else {
            if (!z12) {
                throw new NoWhenBranchMatchedException();
            }
            c23703n1 = X0.f56264b;
        }
        Uri data = (Uri) c23703n1.c();
        AppLinkActivity appLinkActivity = this.f132880l;
        if (data == null) {
            data = appLinkActivity.getIntent().getData();
        }
        Uri uri = (Uri) appLinkActivity.getIntent().getParcelableExtra("android.intent.extra.REFERRER");
        InterfaceC29673k interfaceC29673k = appLinkActivity.f132804p;
        if (interfaceC29673k == null) {
            interfaceC29673k = null;
        }
        interfaceC29673k.c(data, uri);
        View viewFindViewById = appLinkActivity.findViewById(R.id.content);
        InterfaceC29673k interfaceC29673k2 = appLinkActivity.f132804p;
        if (interfaceC29673k2 == null) {
            interfaceC29673k2 = null;
        }
        InterfaceC28373a interfaceC28373a = appLinkActivity.f132801m;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        interfaceC29673k2.b(new r(viewFindViewById, interfaceC28373a));
        InterfaceC29673k interfaceC29673k3 = appLinkActivity.f132804p;
        (interfaceC29673k3 != null ? interfaceC29673k3 : null).a(appLinkActivity);
        return G0.f406611a;
    }
}
