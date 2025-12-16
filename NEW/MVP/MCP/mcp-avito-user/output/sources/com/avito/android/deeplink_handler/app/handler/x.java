package com.avito.android.deeplink_handler.app.handler;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DialogDeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.dialog.DialogWithDeeplinkActions;
import com.avito.android.remote.model.DeepLinksDialogInfo;
import com.avito.android.util.V2;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.observable.W;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import rv.C47919b;

/* compiled from: DialogLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/x;", "Lev/a;", "Lcom/avito/android/deep_linking/links/DialogDeepLink;", "a", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class x extends AbstractC40161a<DialogDeepLink> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f134465j = 0;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.d f134466f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.f f134467g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f134468h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f134469i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: DialogLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/x$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "THEME_RE23", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DialogLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f134470a;

        static {
            int[] iArr = new int[DialogDeepLink.ControlsDirection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DialogDeepLink.ControlsDirection controlsDirection = DialogDeepLink.ControlsDirection.f133264b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[DialogDeepLink.DialogButtonStyle.values().length];
            try {
                iArr2[DialogDeepLink.DialogButtonStyle.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DialogDeepLink.DialogButtonStyle.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DialogDeepLink.DialogButtonStyle.DANGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f134470a = iArr2;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public x(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k a.d dVar, @Y61.k a.f fVar) {
        this.f134466f = dVar;
        this.f134467g = fVar;
        this.f134468h = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        DeepLinksDialogInfo.ControlsDirection controlsDirection;
        DeepLinksDialogInfo.ActionType actionType;
        DialogDeepLink dialogDeepLink = (DialogDeepLink) deepLink;
        boolean z12 = (bundle != null && bundle.getBoolean("must_use_re23")) || kotlin.jvm.internal.L.f(dialogDeepLink.f133263k, "avitoRe23");
        List<DialogDeepLink.DialogButton> list = dialogDeepLink.f133258f;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (DialogDeepLink.DialogButton dialogButton : list) {
            String text = dialogButton.getText();
            DeepLink action = dialogButton.getAction();
            int i12 = b.f134470a[dialogButton.getStyle().ordinal()];
            if (i12 == 1) {
                actionType = DeepLinksDialogInfo.ActionType.POSITIVE;
            } else if (i12 == 2) {
                actionType = DeepLinksDialogInfo.ActionType.NEUTRAL;
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                actionType = DeepLinksDialogInfo.ActionType.NEGATIVE;
            }
            arrayList.add(new DeepLinksDialogInfo.Action(text, action, actionType));
        }
        int iOrdinal = dialogDeepLink.f133254b.ordinal();
        if (iOrdinal == 0) {
            controlsDirection = DeepLinksDialogInfo.ControlsDirection.HORIZONTAL;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            controlsDirection = DeepLinksDialogInfo.ControlsDirection.VERTICAL;
        }
        DeepLinksDialogInfo deepLinksDialogInfo = new DeepLinksDialogInfo(dialogDeepLink.f133259g, dialogDeepLink.f133257e, arrayList, controlsDirection, Boolean.valueOf(dialogDeepLink.f133255c), Boolean.valueOf(dialogDeepLink.f133256d), dialogDeepLink.f133260h, dialogDeepLink.f133261i, dialogDeepLink.f133262j);
        DialogWithDeeplinkActions dialogWithDeeplinkActions = new DialogWithDeeplinkActions();
        com.avito.android.dialog.z.a(dialogWithDeeplinkActions, deepLinksDialogInfo, z12);
        this.f134466f.w1(dialogWithDeeplinkActions, "DialogLinkHandler");
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        W wL1 = this.f134467g.l1("DialogLinkHandler");
        l41.g gVar = new l41.g() { // from class: com.avito.android.deeplink_handler.app.handler.x.c
            @Override // l41.g
            public final void accept(Object obj) {
                int i12 = x.f134465j;
                x xVar = x.this;
                Bundle bundle = ((C47919b) obj).f437159b;
                DeepLink deepLink = (DeepLink) bundle.getParcelable("key_deeplink");
                String string = bundle.getString("key_action_title");
                if (deepLink == null) {
                    xVar.j(DialogDeepLink.c.a.f133270b);
                } else {
                    xVar.i(new DialogDeepLink.c.b(xVar.c(), string), xVar.f134468h, deepLink);
                }
            }
        };
        final V2 v22 = V2.f318762a;
        this.f134469i.b(wL1.v0(gVar, new l41.g() { // from class: com.avito.android.deeplink_handler.app.handler.x.d
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f134469i.e();
    }
}
