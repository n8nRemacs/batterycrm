package com.avito.android.change_specific.deep_linking;

import Ju.InterfaceC14249c;
import Y61.k;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.change_specific.ExtendedProfileChangeSpecificArguments;
import com.avito.android.change_specific.ExtendedProfileChangeSpecificResult;
import com.avito.android.change_specific.deep_linking.d;
import com.avito.android.change_specific.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: ProfileChangeSpecificAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/change_specific/deep_linking/b;", "Lev/a;", "Lcom/avito/android/change_specific/deep_linking/ProfileChangeSpecificLink;", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b extends AbstractC40161a<ProfileChangeSpecificLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final f f117923f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f117924g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f117925h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f117926i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: ProfileChangeSpecificAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(b.this);
        }
    }

    /* compiled from: ProfileChangeSpecificAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.change_specific.deep_linking.b$b, reason: collision with other inner class name */
    public static final class C3430b<T> implements g {
        public C3430b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC14249c.b cVar;
            ExtendedProfileChangeSpecificResult extendedProfileChangeSpecificResult;
            C47918a c47918a = (C47918a) obj;
            if (c47918a.f437156b == -1) {
                Intent intent = c47918a.f437157c;
                if (intent != null) {
                    extendedProfileChangeSpecificResult = (ExtendedProfileChangeSpecificResult) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("change_specific_activity.result", ExtendedProfileChangeSpecificResult.class) : intent.getParcelableExtra("change_specific_activity.result"));
                } else {
                    extendedProfileChangeSpecificResult = null;
                }
                if (extendedProfileChangeSpecificResult instanceof ExtendedProfileChangeSpecificResult.OnlySelect) {
                    ExtendedProfileChangeSpecificResult.OnlySelect onlySelect = (ExtendedProfileChangeSpecificResult.OnlySelect) extendedProfileChangeSpecificResult;
                    cVar = new d.c(onlySelect.f117891b, onlySelect.f117892c);
                } else {
                    cVar = d.b.f117933b;
                }
            } else {
                cVar = d.a.f117932b;
            }
            b.this.j(cVar);
        }
    }

    @Inject
    public b(@k f fVar, @k a.InterfaceC4053a interfaceC4053a, @k a.b bVar) {
        this.f117923f = fVar;
        this.f117924g = interfaceC4053a;
        this.f117925h = bVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f117924g.J(this.f117923f.a(new ExtendedProfileChangeSpecificArguments(((ProfileChangeSpecificLink) deepLink).f117922b, bundle != null ? Integer.valueOf(bundle.getInt("SelectedVerticalArgTag")) : null, bundle != null ? Integer.valueOf(bundle.getInt("SelectedSpecificArgTag")) : null)), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f117926i.b(this.f117925h.Q().N(new a()).t0(new C3430b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f117926i.e();
    }
}
