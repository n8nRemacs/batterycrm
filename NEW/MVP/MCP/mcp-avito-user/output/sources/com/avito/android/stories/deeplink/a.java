package com.avito.android.stories.deeplink;

import Y61.k;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.CalledFrom;
import com.avito.android.L;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.stories.InterfaceC35060i;
import com.avito.android.stories.StoriesLink;
import com.avito.android.util.H;
import com.avito.android.util.V2;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.observable.W;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: StoriesDeepLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/stories/deeplink/a;", "Lev/a;", "Lcom/avito/android/stories/StoriesLink;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends AbstractC40161a<StoriesLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.b f285082f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC35060i f285083g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final L f285084h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f285085i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f285086j = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: StoriesDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.stories.deeplink.a$a, reason: collision with other inner class name */
    public static final class C8529a<T> implements r {
        public C8529a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    @Inject
    public a(@k a.b bVar, @k InterfaceC35060i interfaceC35060i, @k L l12, @k a.InterfaceC4053a interfaceC4053a) {
        this.f285082f = bVar;
        this.f285083g = interfaceC35060i;
        this.f285084h = l12;
        this.f285085i = interfaceC4053a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        StoriesLink storiesLink = (StoriesLink) deepLink;
        Intent intentA = null;
        if (((bundle != null ? H.b(bundle) : null) instanceof CalledFrom.Push) && Boolean.valueOf(bundle.getBoolean("is_task_root")).equals(Boolean.TRUE)) {
            intentA = L.a.a(this.f285084h, null, 3);
        }
        this.f285085i.J(this.f285083g.a(storiesLink.f285018b, storiesLink.f285019c, intentA, storiesLink.f285021e, storiesLink.f285020d, storiesLink.f285022f), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        W wN2 = this.f285082f.Q().N(new C8529a());
        g gVar = new g() { // from class: com.avito.android.stories.deeplink.a.b
            @Override // l41.g
            public final void accept(Object obj) {
                a aVar = a.this;
                Intent intent = ((C47918a) obj).f437157c;
                String stringExtra = intent != null ? intent.getStringExtra("last_viewed_story_id") : null;
                if (stringExtra == null) {
                    stringExtra = "";
                }
                String[] stringArrayExtra = intent != null ? intent.getStringArrayExtra("viewed_stories_ids") : null;
                Boolean boolValueOf = intent != null ? Boolean.valueOf(intent.getBooleanExtra("need_ux_feedback", false)) : null;
                if (stringExtra.length() == 0) {
                    aVar.j(StoriesLink.b.a.f285023b);
                } else {
                    aVar.j(new StoriesLink.b.C8526b(boolValueOf, stringExtra, stringArrayExtra != null ? C42756l.g0(stringArrayExtra) : null));
                }
            }
        };
        final V2 v22 = V2.f318762a;
        this.f285086j.b(wN2.v0(gVar, new g() { // from class: com.avito.android.stories.deeplink.a.c
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f285086j.e();
    }
}
