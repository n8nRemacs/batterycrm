package com.avito.android.publish.deeplink;

import Ju.InterfaceC14249c;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.publish.PublishIntentFactory;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import rv.C47918a;
import sv.C48421d;

/* compiled from: AdvertEditDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/deeplink/a;", "Lev/a;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$Edit;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.deeplink.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33546a extends AbstractC40161a<MyAdvertLink.Edit> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.b f232540f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final PublishIntentFactory f232541g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f232542h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f232543i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: AdvertEditDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.deeplink.a$a, reason: collision with other inner class name */
    public static final class C7070a<T> implements l41.r {
        public C7070a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(C33546a.this);
        }
    }

    /* compiled from: AdvertEditDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "screenResult", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.deeplink.a$b */
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC14249c.b success;
            C47918a c47918a = (C47918a) obj;
            if (c47918a.f437156b == 0) {
                success = MyAdvertLink.Edit.Result.a.f133498b;
            } else {
                Intent intent = c47918a.f437157c;
                success = new MyAdvertLink.Edit.Result.Success(intent != null ? intent.getStringExtra("edited_advert_id") : null, intent != null ? (DeepLink) intent.getParcelableExtra("edited_advert_post_action") : null, intent != null ? intent.getStringExtra("status_message") : null);
            }
            C33546a.this.j(success);
        }
    }

    @Inject
    public C33546a(@Y61.k a.b bVar, @Y61.k PublishIntentFactory publishIntentFactory, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f232540f = bVar;
        this.f232541g = publishIntentFactory;
        this.f232542h = interfaceC4053a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        MyAdvertLink.Edit edit = (MyAdvertLink.Edit) deepLink;
        Intent intent = (bundle == null || !bundle.containsKey("up_intent")) ? null : (Intent) bundle.getParcelable("up_intent");
        this.f232542h.J(this.f232541g.a(edit.f133490d, edit.f133489c, edit.f133491e, edit.f133493g, edit.f133494h, edit.f133492f).putExtra("up_intent", intent), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f232543i.b(this.f232540f.Q().N(new C7070a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f232543i.e();
    }
}
