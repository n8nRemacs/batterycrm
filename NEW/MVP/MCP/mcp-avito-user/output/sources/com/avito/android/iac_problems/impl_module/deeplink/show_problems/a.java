package com.avito.android.iac_problems.impl_module.deeplink.show_problems;

import Ju.AbstractC14250d;
import Y61.k;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_onboarding.IacMicOnboardingLink;
import com.avito.android.iac_problems.impl_module.problems_bottom_sheet.IacProblemBottomSheetDialogResult;
import com.avito.android.iac_problems.public_module.deeplink.IacShowProblemBottomSheetLink;
import com.avito.android.util.V2;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.observable.W;
import jM.InterfaceC42283a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import l41.g;
import nJ.C44262A;
import oM.C44664a;
import pM.InterfaceC46977a;
import rv.C47919b;

/* compiled from: IacShowProblemBottomSheetLinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_problems/impl_module/deeplink/show_problems/a;", "Lev/a;", "Lcom/avito/android/iac_problems/public_module/deeplink/IacShowProblemBottomSheetLink;", "a", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC40161a<IacShowProblemBottomSheetLink> {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f168753p = 0;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final E f168754f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.f f168755g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.d f168756h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC28373a f168757i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final InterfaceC46977a f168758j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final InterfaceC42283a f168759k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final com.avito.android.iac_problems.impl_module.problems_bottom_sheet.a f168760l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f168761m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final String f168762n = C22026a.c(new StringBuilder("(handleId="), this.f395444b, ')');

    /* renamed from: o, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f168763o = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: IacShowProblemBottomSheetLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_problems/impl_module/deeplink/show_problems/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_problems.impl_module.deeplink.show_problems.a$a, reason: collision with other inner class name */
    public static final class C4996a {
        public /* synthetic */ C4996a(C42822w c42822w) {
            this();
        }

        public C4996a() {
        }
    }

    /* compiled from: IacShowProblemBottomSheetLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[IacProblemBottomSheetDialogResult.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Parcelable.Creator<IacProblemBottomSheetDialogResult> creator = IacProblemBottomSheetDialogResult.CREATOR;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        new C4996a(null);
    }

    @Inject
    public a(@k E e12, @k a.f fVar, @k a.d dVar, @k InterfaceC28373a interfaceC28373a, @k InterfaceC46977a interfaceC46977a, @k InterfaceC42283a interfaceC42283a, @k com.avito.android.iac_problems.impl_module.problems_bottom_sheet.a aVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f168754f = e12;
        this.f168755g = fVar;
        this.f168756h = dVar;
        this.f168757i = interfaceC28373a;
        this.f168758j = interfaceC46977a;
        this.f168759k = interfaceC42283a;
        this.f168760l = aVar;
        this.f168761m = aVar2;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        IacShowProblemBottomSheetLink iacShowProblemBottomSheetLink = (IacShowProblemBottomSheetLink) deepLink;
        V2 v22 = V2.f318762a;
        StringBuilder sb2 = new StringBuilder();
        String str2 = this.f168762n;
        sb2.append(str2);
        sb2.append(" New deeplink in handler: ");
        sb2.append(iacShowProblemBottomSheetLink);
        v22.c("IacShowProblemBottomSheetLinkHandler", sb2.toString(), null);
        if (!this.f168754f.b()) {
            j(AbstractC14250d.b.f9170c);
            v22.c("IacShowProblemBottomSheetLinkHandler", str2 + " handling of " + iacShowProblemBottomSheetLink + " is failure cause user is not authorized", null);
            return;
        }
        String str3 = iacShowProblemBottomSheetLink.f169087b;
        this.f168759k.b(str3);
        this.f168757i.c(new C44262A(C44664a.a(this.f168758j.c()), str3));
        this.f168756h.w1(this.f168760l.a(this.f395444b, str3), this.f395444b);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        W wL1 = this.f168755g.l1(this.f395444b);
        g gVar = new g() { // from class: com.avito.android.iac_problems.impl_module.deeplink.show_problems.a.c
            @Override // l41.g
            public final void accept(Object obj) {
                C47919b c47919b = (C47919b) obj;
                int i12 = a.f168753p;
                a aVar = a.this;
                V2 v22 = V2.f318762a;
                StringBuilder sb2 = new StringBuilder();
                String str = aVar.f168762n;
                sb2.append(str);
                sb2.append(" New fragmentResult in handler: ");
                sb2.append(c47919b);
                v22.c("IacShowProblemBottomSheetLinkHandler", sb2.toString(), null);
                int i13 = Build.VERSION.SDK_INT;
                Bundle bundle = c47919b.f437159b;
                IacProblemBottomSheetDialogResult iacProblemBottomSheetDialogResult = (IacProblemBottomSheetDialogResult) (i13 >= 34 ? (Parcelable) bundle.getParcelable("key_iac_problems_dialog_action", IacProblemBottomSheetDialogResult.class) : bundle.getParcelable("key_iac_problems_dialog_action"));
                if (iacProblemBottomSheetDialogResult != null) {
                    int iOrdinal = iacProblemBottomSheetDialogResult.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            return;
                        }
                        b.a.a(aVar.f168761m, new IacMicOnboardingLink(), null, null, 6);
                        return;
                    }
                    IacShowProblemBottomSheetLink.b bVar = new IacShowProblemBottomSheetLink.b(aVar.f168758j.c().isEmpty());
                    v22.c("IacShowProblemBottomSheetLinkHandler", str + " result: " + bVar, null);
                    aVar.j(bVar);
                }
            }
        };
        final V2 v22 = V2.f318762a;
        this.f168763o.b(wL1.v0(gVar, new g() { // from class: com.avito.android.iac_problems.impl_module.deeplink.show_problems.a.d
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f168763o.e();
    }
}
