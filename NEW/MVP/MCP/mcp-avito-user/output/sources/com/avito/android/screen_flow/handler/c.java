package com.avito.android.screen_flow.handler;

import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.screen_flow.link.ScreenFlowLinkDeclaration;
import ev.AbstractC40161a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ScreenFlowLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/screen_flow/handler/c;", "Lcom/avito/android/screen_flow/link/ScreenFlowLinkDeclaration;", "T", "Lev/a;", "a", "b", "_avito_screen-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class c<T extends ScreenFlowLinkDeclaration> extends AbstractC40161a<T> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f260197f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.screen_flow.handler.a f260198g;

    /* compiled from: ScreenFlowLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/screen_flow/handler/c$a;", "", "<init>", "()V", "", "ARG_SCREEN_FLOW_HANDLING", "Ljava/lang/String;", "_avito_screen-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ScreenFlowLinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/screen_flow/handler/c$b;", "LJu/c$a;", "<init>", "()V", "_avito_screen-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC14249c.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f260199b = new b();
    }

    static {
        new a(null);
    }

    public c(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k com.avito.android.screen_flow.handler.a aVar2) {
        this.f260197f = aVar;
        this.f260198g = aVar2;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ScreenFlowLinkDeclaration screenFlowLinkDeclaration = (ScreenFlowLinkDeclaration) deepLink;
        this.f260198g.f260192c.set(screenFlowLinkDeclaration.getF260207c());
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putBoolean("screen_flow_handling", true);
        this.f395445c.f134523a.set(new com.avito.android.deeplink_handler.handler.bundle.a(bundle2, screenFlowLinkDeclaration, str));
        i(b.f260199b, this.f260197f, screenFlowLinkDeclaration.getF260206b());
    }
}
