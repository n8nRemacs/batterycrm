package com.avito.android.recall_me.presentation;

import Ju.AbstractC14250d;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.RecallMeLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.recall_me.presentation.RecallMeActivity;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import rv.C47918a;
import sv.C48421d;

/* compiled from: RecallMeDeepLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/recall_me/presentation/d;", "Lev/a;", "Lcom/avito/android/deep_linking/links/RecallMeLink;", "a", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.recall_me.presentation.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C34234d extends AbstractC40161a<RecallMeLink> {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f251914m = 0;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Context f251915f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.b f251916g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f251917h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.i f251918i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recall_me.domain.c f251919j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recall_me.splitter.features.a f251920k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f251921l;

    /* compiled from: RecallMeDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/recall_me/presentation/d$a;", "", "<init>", "()V", "", "ACTIVITY_RESULT_MESSAGE", "Ljava/lang/String;", "ACTIVITY_RESULT_REQUEST_ID", "", "DEFAULT_REQUEST_ID", "J", "RESERVATION_KEY", "", "TOAST_DURATION", "I", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.recall_me.presentation.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RecallMeDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.recall_me.presentation.d$b */
    public static final class b<T> implements l41.r {
        public b() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(C34234d.this);
        }
    }

    /* compiled from: RecallMeDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "activityResult", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.recall_me.presentation.d$c */
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String str;
            String str2;
            C47918a c47918a = (C47918a) obj;
            int i12 = c47918a.f437156b;
            C34234d c34234d = C34234d.this;
            if (i12 != -1) {
                if (i12 == 0) {
                    int i13 = C34234d.f251914m;
                    RecallMeLink recallMeLinkC = c34234d.c();
                    if (L.f(recallMeLinkC != null ? recallMeLinkC.f133631d : null, "reservation,call")) {
                        c34234d.j(RecallMeLink.b.a.f133633b);
                        return;
                    }
                }
                c34234d.j(AbstractC14250d.b.f9170c);
                return;
            }
            int i14 = C34234d.f251914m;
            RecallMeLink recallMeLinkC2 = c34234d.c();
            Intent intent = c47918a.f437157c;
            if (recallMeLinkC2 != null && (stringExtra = recallMeLinkC2.f133632e) != null) {
                str = stringExtra;
            } else if (intent != null) {
                String stringExtra = intent.getStringExtra("recall_me_message");
                str = stringExtra;
            } else {
                str = null;
            }
            Long lValueOf = intent != null ? Long.valueOf(intent.getLongExtra("recall_me_request_id", -1L)) : null;
            RecallMeLink recallMeLinkC3 = c34234d.c();
            if (recallMeLinkC3 != null && (str2 = recallMeLinkC3.f133629b) != null) {
                c34234d.f251919j.a(lValueOf != null ? lValueOf.longValue() : -1L, str2);
            }
            if (str != null) {
                a.i.C4057a.e(c34234d.f251918i, str, null, 3750, null, 990);
            }
            c34234d.j(AbstractC14250d.c.f9171c);
        }
    }

    static {
        new a(null);
    }

    @Inject
    public C34234d(@Y61.k Context context, @Y61.k a.b bVar, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.i iVar, @Y61.k com.avito.android.recall_me.domain.c cVar, @Y61.k com.avito.android.recall_me.splitter.features.a aVar) {
        this.f251915f = context;
        this.f251916g = bVar;
        this.f251917h = interfaceC4053a;
        this.f251918i = iVar;
        this.f251919j = cVar;
        this.f251920k = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        RecallMeLink recallMeLink = (RecallMeLink) deepLink;
        RecallMeActivity.a aVar = RecallMeActivity.f251897n;
        RecallMeParams recallMeParams = new RecallMeParams(recallMeLink.f133629b, recallMeLink.f133630c, recallMeLink.f133631d);
        com.avito.android.recall_me.splitter.features.a aVar2 = this.f251920k;
        aVar2.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.recall_me.splitter.features.a.f252037c[0];
        boolean zBooleanValue = ((Boolean) aVar2.f252038b.a().invoke()).booleanValue();
        aVar.getClass();
        Intent intentPutExtra = new Intent(this.f251915f, (Class<?>) RecallMeActivity.class).putExtra("open_params", recallMeParams);
        intentPutExtra.putExtra("RecallMeMvi", zBooleanValue);
        this.f251917h.J(intentPutExtra, C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f251921l = (io.reactivex.rxjava3.internal.observers.y) this.f251916g.Q().N(new b()).t0(new c());
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f251921l;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f251921l = null;
    }
}
