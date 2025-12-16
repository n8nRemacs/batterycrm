package com.avito.android.deeplink_handler.view;

import Y41.l;
import Y41.p;
import Y61.k;
import android.content.Context;
import android.content.Intent;
import android.widget.FrameLayout;
import androidx.fragment.app.C;
import androidx.fragment.app.DialogFragment;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.toast_bar.i;
import com.avito.android.printable_text.PrintableText;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import io.reactivex.rxjava3.internal.operators.observable.W;
import j.f0;
import java.io.Serializable;
import java.util.List;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: DeeplinkView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\bf\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/deeplink_handler/view/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: DeeplinkView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/view/a$a;", "Lcom/avito/android/deeplink_handler/view/a;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.deeplink_handler.view.a$a, reason: collision with other inner class name */
    public interface InterfaceC4053a extends a {

        /* compiled from: DeeplinkView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deeplink_handler.view.a$a$a, reason: collision with other inner class name */
        public static final class C4054a {
        }

        void J(@k Intent intent, int i12, @k l<? super Exception, G0> lVar);

        void R(@k Intent intent, @k l<? super Exception, G0> lVar);

        void X(int i12, @k Intent intent);

        void g1(@k l<? super Context, G0> lVar);

        void s1();
    }

    /* compiled from: DeeplinkView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/view/a$b;", "Lcom/avito/android/deeplink_handler/view/a;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends a {
        @k
        C41981q0 Q();
    }

    /* compiled from: DeeplinkView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/view/a$c;", "Lcom/avito/android/deeplink_handler/view/a;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c extends a {

        /* compiled from: DeeplinkView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deeplink_handler.view.a$c$a, reason: collision with other inner class name */
        public static final class C4055a {
        }
    }

    /* compiled from: DeeplinkView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/view/a$d;", "Lcom/avito/android/deeplink_handler/view/a;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d extends a {

        /* compiled from: DeeplinkView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deeplink_handler.view.a$d$a, reason: collision with other inner class name */
        public static final class C4056a {
        }

        void D0(@k String str, @k Y41.a aVar);

        void k0(@k l<? super Context, ? extends com.avito.android.lib.design.bottom_sheet.d> lVar);

        @InterfaceC42830m
        void k1(@k l<? super com.avito.android.lib.deprecated_design.dialog.a, G0> lVar);

        void u1(@f0 int i12, @f0 int i13, @k p pVar);

        void w1(@k DialogFragment dialogFragment, @k String str);
    }

    /* compiled from: DeeplinkView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/view/a$e;", "Lcom/avito/android/deeplink_handler/view/a;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface e extends a {
        void A1(@k String str, @k C c12);
    }

    /* compiled from: DeeplinkView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/view/a$f;", "Lcom/avito/android/deeplink_handler/view/a;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface f extends a {
        @k
        W l1(@k String str);
    }

    /* compiled from: DeeplinkView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/view/a$g;", "Lcom/avito/android/deeplink_handler/view/a;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface g extends a {
        void g(@Y61.l com.avito.android.deeplink_handler.handler.bundle.a aVar, boolean z12);
    }

    /* compiled from: DeeplinkView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/view/a$h;", "Lcom/avito/android/deeplink_handler/view/a;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface h extends a {
        @k
        C41981q0 W1();

        void o0(@k String... strArr);
    }

    /* compiled from: DeeplinkView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/view/a$i;", "Lcom/avito/android/deeplink_handler/view/a;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface i extends a {

        /* compiled from: DeeplinkView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deeplink_handler.view.a$i$a, reason: collision with other inner class name */
        public static final class C4057a {
            @InterfaceC42830m
            public static void a(@k i iVar, int i12, @k f.c cVar, @k ToastBarPosition toastBarPosition) {
                d(iVar, com.avito.android.printable_text.b.c(i12, new Serializable[0]), null, null, cVar, 2750, toastBarPosition, null, null, 1024);
            }

            @InterfaceC42830m
            public static void b(@k i iVar, @k String str, @k com.avito.android.component.toast.f fVar, int i12, @k ToastBarPosition toastBarPosition) {
                d(iVar, com.avito.android.printable_text.b.f(str), null, null, fVar, i12, toastBarPosition, null, null, 1024);
            }

            public static /* synthetic */ void d(i iVar, PrintableText printableText, List list, List list2, com.avito.android.component.toast.f fVar, int i12, ToastBarPosition toastBarPosition, i.b bVar, String str, int i13) {
                ToastBarPosition toastBarPosition2;
                List list3 = (i13 & 2) != 0 ? null : list;
                List list4 = (i13 & 4) != 0 ? null : list2;
                com.avito.android.component.toast.f fVar2 = (i13 & 16) != 0 ? f.a.f125253a : fVar;
                int i14 = (i13 & 32) != 0 ? 2750 : i12;
                if ((i13 & 64) != 0) {
                    toastBarPosition2 = fVar2 instanceof f.c ? ToastBarPosition.f181046d : ToastBarPosition.f181047e;
                } else {
                    toastBarPosition2 = toastBarPosition;
                }
                iVar.V0(printableText, list3, list4, null, fVar2, i14, toastBarPosition2, true, false, (i13 & 512) != 0 ? null : bVar, (i13 & 1024) != 0 ? null : str);
            }

            public static /* synthetic */ void e(i iVar, String str, com.avito.android.component.toast.f fVar, int i12, ToastBarPosition toastBarPosition, int i13) {
                if ((i13 & 16) != 0) {
                    fVar = f.a.f125253a;
                }
                if ((i13 & 32) != 0) {
                    i12 = 2750;
                }
                if ((i13 & 64) != 0) {
                    toastBarPosition = fVar instanceof f.c ? ToastBarPosition.f181046d : ToastBarPosition.f181047e;
                }
                iVar.m0(str, fVar, i12, toastBarPosition);
            }
        }

        void V0(@k PrintableText printableText, @Y61.l List<? extends c.a> list, @Y61.l List<? extends c.a> list2, @Y61.l FrameLayout frameLayout, @k com.avito.android.component.toast.f fVar, int i12, @k ToastBarPosition toastBarPosition, boolean z12, boolean z13, @Y61.l i.b bVar, @Y61.l String str);

        void Y1(int i12);

        @InterfaceC42830m
        void b2(int i12, @k f.c cVar, @k ToastBarPosition toastBarPosition);

        @InterfaceC42830m
        void m0(@k String str, @k com.avito.android.component.toast.f fVar, int i12, @k ToastBarPosition toastBarPosition);

        void z1(@k String str);
    }
}
