package com.avito.android.deeplink_handler.view.impl;

import Y41.p;
import android.content.Context;
import android.content.Intent;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.C;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22983P;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.toast_bar.i;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.C35966w1;
import j.f0;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FragmentDeeplinkView.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/deeplink_handler/view/impl/d;", "Lcom/avito/android/deeplink_handler/view/a;", "a", "b", "c", "d", "e", "f", "Lcom/avito/android/deeplink_handler/view/impl/d$a;", "Lcom/avito/android/deeplink_handler/view/impl/d$b;", "Lcom/avito/android/deeplink_handler/view/impl/d$c;", "Lcom/avito/android/deeplink_handler/view/impl/d$d;", "Lcom/avito/android/deeplink_handler/view/impl/d$e;", "Lcom/avito/android/deeplink_handler/view/impl/d$f;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface d extends com.avito.android.deeplink_handler.view.a {

    /* compiled from: FragmentDeeplinkView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deeplink_handler/view/impl/d$a;", "Lcom/avito/android/deeplink_handler/view/impl/d;", "Lcom/avito/android/deeplink_handler/view/a$a;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements d, a.InterfaceC4053a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Fragment f134602b;

        public a(@Y61.k Fragment fragment) {
            this.f134602b = fragment;
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void J(@Y61.k Intent intent, int i12, @Y61.k Y41.l<? super Exception, G0> lVar) {
            C35966w1.e(this.f134602b, intent, i12, lVar);
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void R(@Y61.k Intent intent, @Y61.k Y41.l<? super Exception, G0> lVar) {
            C35966w1.g(this.f134602b, intent, lVar);
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void X(int i12, @Y61.k Intent intent) {
            ActivityC22955m activityC22955mRequireActivity = this.f134602b.requireActivity();
            activityC22955mRequireActivity.setResult(i12, intent);
            activityC22955mRequireActivity.finish();
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void g1(@Y61.k Y41.l<? super Context, G0> lVar) {
            lVar.invoke(this.f134602b.requireActivity());
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void s1() {
            this.f134602b.requireActivity().finish();
        }
    }

    /* compiled from: FragmentDeeplinkView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deeplink_handler/view/impl/d$b;", "Lcom/avito/android/deeplink_handler/view/impl/d;", "Lcom/avito/android/deeplink_handler/view/a$c;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements d, a.c {
    }

    /* compiled from: FragmentDeeplinkView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deeplink_handler/view/impl/d$c;", "Lcom/avito/android/deeplink_handler/view/impl/d;", "Lcom/avito/android/deeplink_handler/view/a$d;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements d, a.d {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Fragment f134603b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final InterfaceC42726C f134604c = C42727D.c(new a());

        /* compiled from: FragmentDeeplinkView.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/dialog/b;", "invoke", "()Lcom/avito/android/lib/deprecated_design/dialog/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends N implements Y41.a<com.avito.android.lib.deprecated_design.dialog.b> {
            public a() {
                super(0);
            }

            @Override // Y41.a
            public final com.avito.android.lib.deprecated_design.dialog.b invoke() {
                return new com.avito.android.lib.deprecated_design.dialog.b(c.this.f134603b.requireActivity());
            }
        }

        public c(@Y61.k Fragment fragment) {
            this.f134603b = fragment;
        }

        @Override // com.avito.android.deeplink_handler.view.a.d
        public final void D0(@Y61.k String str, @Y61.k Y41.a aVar) {
            Fragment fragment = this.f134603b;
            Fragment fragmentH = fragment.getChildFragmentManager().H(str);
            DialogFragment dialogFragment = fragmentH instanceof DialogFragment ? (DialogFragment) fragmentH : null;
            if (dialogFragment == null) {
                dialogFragment = (DialogFragment) aVar.invoke();
            }
            if (dialogFragment.isAdded()) {
                return;
            }
            dialogFragment.show(fragment.getChildFragmentManager(), str);
        }

        @Override // com.avito.android.deeplink_handler.view.a.d
        public final void k0(@Y61.k Y41.l<? super Context, ? extends com.avito.android.lib.design.bottom_sheet.d> lVar) {
            Context context = this.f134603b.getContext();
            if (context != null) {
                com.avito.android.lib.util.g.a(lVar.invoke(context));
            }
        }

        @Override // com.avito.android.deeplink_handler.view.a.d
        @InterfaceC42830m
        public final void k1(@Y61.k Y41.l<? super com.avito.android.lib.deprecated_design.dialog.a, G0> lVar) {
            lVar.invoke((com.avito.android.lib.deprecated_design.dialog.a) this.f134604c.getValue());
        }

        @Override // com.avito.android.deeplink_handler.view.a.d
        public final void u1(@f0 int i12, @f0 int i13, @Y61.k p pVar) {
            Fragment fragment = this.f134603b;
            Context contextL1 = fragment.l1();
            if (contextL1 == null) {
                throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.m("You must call showConfigurableDialog only when ", fragment, " is attached to an activity").toString());
            }
            if (i12 != 0) {
                contextL1 = new androidx.appcompat.view.d(contextL1, i12);
            }
            com.avito.android.lib.design.modal.a.f179704d.getClass();
            com.avito.android.lib.util.g.a(a.C5284a.a(contextL1, 0, i13, pVar));
        }

        @Override // com.avito.android.deeplink_handler.view.a.d
        public final void w1(@Y61.k DialogFragment dialogFragment, @Y61.k String str) {
            dialogFragment.show(this.f134603b.getChildFragmentManager(), str);
        }
    }

    /* compiled from: FragmentDeeplinkView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deeplink_handler/view/impl/d$d;", "Lcom/avito/android/deeplink_handler/view/impl/d;", "Lcom/avito/android/deeplink_handler/view/a$e;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.deeplink_handler.view.impl.d$d, reason: collision with other inner class name */
    public static final class C4060d implements d, a.e {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Fragment f134606b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final InterfaceC22983P f134607c;

        public C4060d(@Y61.k Fragment fragment, @Y61.k InterfaceC22983P interfaceC22983P) {
            this.f134606b = fragment;
            this.f134607c = interfaceC22983P;
        }

        @Override // com.avito.android.deeplink_handler.view.a.e
        public final void A1(@Y61.k String str, @Y61.k C c12) {
            this.f134606b.getChildFragmentManager().p0(str, this.f134607c, c12);
        }
    }

    /* compiled from: FragmentDeeplinkView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deeplink_handler/view/impl/d$e;", "Lcom/avito/android/deeplink_handler/view/impl/d;", "Lcom/avito/android/deeplink_handler/view/a$g;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements d, a.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.g f134608b;

        public e(@Y61.k a.g gVar) {
            this.f134608b = gVar;
        }

        @Override // com.avito.android.deeplink_handler.view.a.g
        public final void g(@Y61.l com.avito.android.deeplink_handler.handler.bundle.a aVar, boolean z12) {
            this.f134608b.g(aVar, z12);
        }
    }

    /* compiled from: FragmentDeeplinkView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deeplink_handler/view/impl/d$f;", "Lcom/avito/android/deeplink_handler/view/impl/d;", "Lcom/avito/android/deeplink_handler/view/a$i;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements d, a.i {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.i f134609b;

        public f(@Y61.k a.i iVar) {
            this.f134609b = iVar;
        }

        @Override // com.avito.android.deeplink_handler.view.a.i
        public final void V0(@Y61.k PrintableText printableText, @Y61.l List<? extends c.a> list, @Y61.l List<? extends c.a> list2, @Y61.l FrameLayout frameLayout, @Y61.k com.avito.android.component.toast.f fVar, int i12, @Y61.k ToastBarPosition toastBarPosition, boolean z12, boolean z13, @Y61.l i.b bVar, @Y61.l String str) {
            this.f134609b.V0(printableText, list, list2, frameLayout, fVar, i12, toastBarPosition, z12, z13, bVar, str);
        }

        @Override // com.avito.android.deeplink_handler.view.a.i
        public final void Y1(int i12) {
            this.f134609b.Y1(i12);
        }

        @Override // com.avito.android.deeplink_handler.view.a.i
        @InterfaceC42830m
        public final void b2(int i12, @Y61.k f.c cVar, @Y61.k ToastBarPosition toastBarPosition) {
            this.f134609b.b2(i12, cVar, toastBarPosition);
        }

        @Override // com.avito.android.deeplink_handler.view.a.i
        @InterfaceC42830m
        public final void m0(@Y61.k String str, @Y61.k com.avito.android.component.toast.f fVar, int i12, @Y61.k ToastBarPosition toastBarPosition) {
            this.f134609b.m0(str, fVar, i12, toastBarPosition);
        }

        @Override // com.avito.android.deeplink_handler.view.a.i
        public final void z1(@Y61.k String str) {
            this.f134609b.z1(str);
        }
    }
}
