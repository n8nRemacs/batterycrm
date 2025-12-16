package com.avito.android.cart_sheet_after_adding.ui;

import an.C19912a;
import android.app.Dialog;
import android.os.Bundle;
import androidx.core.os.C22777e;
import com.avito.android.cart_sheet_after_adding.ui.CartSheetAfterAddingDialogFragment;
import com.avito.android.deep_linking.links.AdvertDetailsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.Image;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35936s;
import gn.InterfaceC40710b;
import gn.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import okhttp3.internal.ws.WebSocketProtocol;
import tn.InterfaceC48692a;
import tn.InterfaceC48694c;

/* compiled from: CartSheetAfterAddingDialogFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cart_sheet_after_adding.ui.CartSheetAfterAddingDialogFragment$onCreateDialog$2$1$1$1$1$1$1", f = "CartSheetAfterAddingDialogFragment.kt", i = {}, l = {223}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.cart_sheet_after_adding.ui.f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29340f extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f115603q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ CartSheetAfterAddingDialogFragment f115604r;

    /* compiled from: CartSheetAfterAddingDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "event", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.cart_sheet_after_adding.ui.f$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CartSheetAfterAddingDialogFragment f115605b;

        public a(CartSheetAfterAddingDialogFragment cartSheetAfterAddingDialogFragment) {
            this.f115605b = cartSheetAfterAddingDialogFragment;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        public final Object emit(@Y61.k Object obj, @Y61.k Continuation<? super G0> continuation) {
            Bundle bundle;
            CartSheetAfterAddingDialogFragment.a aVar = CartSheetAfterAddingDialogFragment.f115461o0;
            CartSheetAfterAddingDialogFragment cartSheetAfterAddingDialogFragment = this.f115605b;
            Bundle bundleB = null;
            if (obj instanceof gn.d) {
                gn.d dVar = (gn.d) obj;
                if (dVar instanceof d.g) {
                    com.avito.android.lib.design.bottom_sheet.j.c((com.avito.android.lib.design.bottom_sheet.d) cartSheetAfterAddingDialogFragment.requireDialog(), ((d.g) obj).f396816a.k0(cartSheetAfterAddingDialogFragment.requireContext()), false, 0, 0, 0, WebSocketProtocol.PAYLOAD_SHORT);
                } else if (dVar instanceof d.c) {
                    d.c cVar = (d.c) obj;
                    C19912a c19912a = cVar.f396808c;
                    if (c19912a != null) {
                        bundle = new Bundle();
                        bundle.putString("title", c19912a.f21154a);
                        bundle.putLong("click_time", c19912a.f21156c);
                        bundle.putParcelable("screen_source", c19912a.f21155b);
                        String str = c19912a.f21158e;
                        if (str != null) {
                            bundle.putString("price", str);
                        }
                        Image image = c19912a.f21157d;
                        if (image != null) {
                            bundle.putParcelable("image", new DimmedImage(image, null, 2, null));
                        }
                    } else {
                        bundle = null;
                    }
                    com.avito.android.deeplink_handler.handler.composite.a aVar2 = cartSheetAfterAddingDialogFragment.f115465k0;
                    if (aVar2 == null) {
                        aVar2 = null;
                    }
                    b.a.a(aVar2, new AdvertDetailsLink(cVar.f396806a, cVar.f396807b, null, null, null, null, null, null, null, null, null, 2044, null), null, bundle, 2);
                } else if (dVar instanceof d.C11228d) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar3 = cartSheetAfterAddingDialogFragment.f115465k0;
                    if (aVar3 == null) {
                        aVar3 = null;
                    }
                    d.C11228d c11228d = (d.C11228d) obj;
                    DeepLink deepLink = c11228d.f396809a;
                    Map<String, Object> map = c11228d.f396811c;
                    if (map != null) {
                        Set<Map.Entry<String, Object>> setEntrySet = map.entrySet();
                        ArrayList arrayList = new ArrayList(C42745f0.q(setEntrySet, 10));
                        Iterator<T> it = setEntrySet.iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            arrayList.add(new kotlin.Q(entry.getKey(), entry.getValue()));
                        }
                        kotlin.Q[] qArr = (kotlin.Q[]) arrayList.toArray(new kotlin.Q[0]);
                        bundleB = C22777e.b((kotlin.Q[]) Arrays.copyOf(qArr, qArr.length));
                    }
                    aVar3.r6(bundleB, deepLink, c11228d.f396810b);
                } else if (dVar instanceof d.a) {
                    Dialog dialog = cartSheetAfterAddingDialogFragment.getDialog();
                    if (dialog != null) {
                        com.avito.android.lib.design.bottom_sheet.d dVar2 = (com.avito.android.lib.design.bottom_sheet.d) (dialog instanceof com.avito.android.lib.design.bottom_sheet.d ? dialog : null);
                        if (dVar2 != null) {
                            dVar2.r();
                        }
                    }
                } else if (dVar instanceof d.b) {
                    cartSheetAfterAddingDialogFragment.f5().invoke(new InterfaceC48692a.c(((d.b) obj).f396805a));
                } else if (dVar instanceof d.e) {
                    cartSheetAfterAddingDialogFragment.f5().invoke(new InterfaceC48692a.e(((d.e) obj).f396812a));
                } else if (dVar instanceof d.f) {
                    d.f fVar = (d.f) obj;
                    PrintableText printableText = fVar.f396814b;
                    ToastBarPosition toastBarPosition = ToastBarPosition.f181044b;
                    cartSheetAfterAddingDialogFragment.g5(printableText, fVar.f396813a, fVar.f396815c);
                }
            } else if (obj instanceof InterfaceC48694c) {
                InterfaceC48694c interfaceC48694c = (InterfaceC48694c) obj;
                if (interfaceC48694c instanceof InterfaceC48694c.a) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar4 = cartSheetAfterAddingDialogFragment.f115465k0;
                    InterfaceC48694c.a aVar5 = (InterfaceC48694c.a) obj;
                    (aVar4 != null ? aVar4 : null).r6(aVar5.f439424c, aVar5.f439422a, aVar5.f439423b);
                } else if (interfaceC48694c instanceof InterfaceC48694c.b) {
                    InterfaceC48694c.b bVar = (InterfaceC48694c.b) obj;
                    PrintableText printableText2 = bVar.f439426b;
                    ApiException apiExceptionA = C35936s.a(bVar.f439425a, null);
                    if (bVar.f439427c != null) {
                        cartSheetAfterAddingDialogFragment.requireContext();
                        throw null;
                    }
                    ToastBarPosition toastBarPosition2 = ToastBarPosition.f181044b;
                    cartSheetAfterAddingDialogFragment.g5(printableText2, apiExceptionA, bVar.f439428d);
                } else if (interfaceC48694c instanceof InterfaceC48694c.C12679c) {
                    cartSheetAfterAddingDialogFragment.f5().invoke(new InterfaceC40710b.d(((InterfaceC48694c.C12679c) obj).f439429a));
                }
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29340f(CartSheetAfterAddingDialogFragment cartSheetAfterAddingDialogFragment, Continuation<? super C29340f> continuation) {
        super(2, continuation);
        this.f115604r = cartSheetAfterAddingDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C29340f(this.f115604r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C29340f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f115603q;
        if (i12 == 0) {
            C42729a0.b(obj);
            CartSheetAfterAddingDialogFragment cartSheetAfterAddingDialogFragment = this.f115604r;
            InterfaceC43160i<Object> events = ((com.avito.android.cart_sheet_after_adding.mvi.p) cartSheetAfterAddingDialogFragment.f115463i0.getValue()).getEvents();
            a aVar = new a(cartSheetAfterAddingDialogFragment);
            this.f115603q = 1;
            if (events.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
